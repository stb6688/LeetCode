package com.leetcode.oj;

import java.util.LinkedList;
import java.util.List;

import com.leetcode.util.ArrayUtil;
import com.leetcode.util.annotations.Leetcode;
import com.leetcode.util.annotations.Leetcode.Tags;

@Leetcode(date="2016-06-05", tags={Tags.TABLE, Tags.BFS}, url="https://leetcode.com/problems/smallest-rectangle-enclosing-black-pixels/")
public abstract class SmallestRectangleEnclosingBlackPixels {
	public abstract int minArea(char[][] image, int x, int y);
	public static void main(String[] args) {
		SmallestRectangleEnclosingBlackPixels instance = new SolutionI();
		char[][] image; int x, y;
		int result;
		
		image = ArrayUtil.str2int2DCharArray(new String[]{"0010","0110", "0100"});
		x = 0; y = 2;
		result = instance.minArea(image, x, y);
		System.out.println("result=" + result);
	}
	
	
	// Solution II: Accepted
	// bfs with iteration
	static class SolutionII extends SmallestRectangleEnclosingBlackPixels {
		private static final int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		public int minArea(char[][] image, int x, int y) {
	        if (image == null || image.length == 0 || image[0].length == 0)
	            return 0;
	        int rows = image.length, cols = image[0].length;
	        int minX = x, maxX = x, minY = y, maxY = y;
	        
	        // bfs, iterative
	        List<Integer> ps = new LinkedList<>();
	        ps.add(cols*x + y);
	        image[x][y] = 2;
	        while (!ps.isEmpty()) {
	            List<Integer> nextPs = new LinkedList<>();
	            for (int p : ps) {
	                int x0 = p/cols, y0 = p%cols;
	                minX = Math.min(minX, x0);
	                maxX = Math.max(maxX, x0);
	                minY = Math.min(minY, y0);
	                maxY = Math.max(maxY, y0);
	                for (int[] move: moves) {
	                    int x1 = x0 + move[0];
	                    int y1 = y0 + move[1];
	                    if (x1 >= 0 && x1 < rows && y1 >= 0 && y1 < cols && image[x1][y1] == '1') {
	                        image[x1][y1] = ' ';
	                        nextPs.add(cols*x1 + y1);
	                    }
	                }
	            }
	            ps = nextPs;
	        }
	        // we can optionally restore the table by replacing all ' ' by '1'
	        return (maxX - minX + 1)*(maxY - minY + 1);
	    }
	}
	
	
	// Solution I: Accepted
	// bfs using recursion
	static class SolutionI extends SmallestRectangleEnclosingBlackPixels {
		public int minArea(char[][] image, int x, int y) {
	        int[] range1 = {x, x};
	        int[] range2 = {y, y};
	        int rows = image.length, cols = image[0].length;
	        bfs(x, y, image,  rows, cols, range1, range2);
	        return (range1[1] - range1[0] + 1)*(range2[1] - range2[0] + 1);
	    }
	    
	    private void bfs(int x, int y, char[][] image, int rows, int cols, int[] range1, int[] range2) {
	        if (x >= 0 && x < rows && y >= 0 && y < cols && image[x][y] == '1') {
	            image[x][y] = ' ';
	            range1[0] = Math.min(range1[0], x);
	            range1[1] = Math.max(range1[1], x);
	            range2[0] = Math.min(range2[0], y);
	            range2[1] = Math.max(range2[1], y);
	            bfs(x-1, y, image, rows, cols, range1, range2);
	            bfs(x+1, y, image, rows, cols, range1, range2);
	            bfs(x, y-1, image, rows, cols, range1, range2);
	            bfs(x, y+1, image, rows, cols, range1, range2);
	        }
	    }
	}
}

package com.multichoice.astar;

import com.multichoice.node.coordinate.ICoordinate;
import com.multichoice.node.coordinate.impl.XYCoordinate;

/**
 * @author Jebil Kuruvila
 *
 *
 *         Implementation of AStarHeuristic interface using Manhattan distance
 *         formula |x1 - x2| + |y1 - y2|
 */
public class DistanceHeuristic implements AStarHeuristic {

	int startX, startY, goalX, goalY;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.multichoice.astar.AStarHeuristic#getEstimatedDistanceToGoal(com.
	 * multichoice.node.coordinate.ICoordinate,
	 * com.multichoice.node.coordinate.ICoordinate)
	 */
	public float getEstimatedDistanceToGoal(ICoordinate start, ICoordinate goal) {
		startX = ((XYCoordinate) start).getX();
		startY = ((XYCoordinate) start).getY();
		goalX = ((XYCoordinate) goal).getX();
		goalY = ((XYCoordinate) goal).getY();
		return (Math.abs(startX - goalX) + Math.abs(startY - goalY));
	}

}

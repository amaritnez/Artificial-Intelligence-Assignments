package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MainClass {
  
  public static ArrayList<Node> allNodes = new ArrayList<Node>();  
  
  public static boolean checkIntersect(Vector2 p1, Vector2 p2, Vector2 q1, Vector2 q2) {
    int k1 = p1.x - p2.x;
    int k2 = q2.y - q1.y;
    int k3 = p1.y - p2.y;
    int k4 = q2.x - q1.x;
    int k5 = p1.x - q1.x;
    int k6 = p1.y - q1.y;
    float d  = (k1 * k2) - (k3 * k4);
    float a  = ((k2 * k5) - (k4 * k6)) / d;
    float b  = ((k1 * k6) - (k3 * k5)) / d;
    //Line segments p and q intersect if a and b are both between 0 and 1.
    //That is, iff:
    if ((0 < a && a < 1) && (0 < b && b < 1)) {
      return true;
    } else {
      return false;
    }    
  }

  public static void main(String[] args) {
    
    //First step; setup preset nodes //
    
    Node test1 = new Node(115, 655);
    Node test2 = new Node(380, 560);
    MainClass.allNodes.add(test1);
    MainClass.allNodes.add(test2);
    
    // Polygon 1
    Node nodeP1N1 = new Node(220, 616, 1);
    Node nodeP1N2 = new Node(220, 666, 1);
    Node nodeP1N3 = new Node(251, 670, 1);
    Node nodeP1N4 = new Node(272, 647, 1);
    nodeP1N1.connectNode(nodeP1N2);
    nodeP1N1.connectNode(nodeP1N4);
    nodeP1N2.connectNode(nodeP1N1);
    nodeP1N2.connectNode(nodeP1N3);
    nodeP1N3.connectNode(nodeP1N2);
    nodeP1N3.connectNode(nodeP1N4);
    nodeP1N4.connectNode(nodeP1N3);
    nodeP1N4.connectNode(nodeP1N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP1N1);
    MainClass.allNodes.add(nodeP1N2);
    MainClass.allNodes.add(nodeP1N3);
    MainClass.allNodes.add(nodeP1N4);
    // Polygon 2
    Node nodeP2N1 = new Node(341, 655, 2);
    Node nodeP2N2 = new Node(359, 667, 2);
    Node nodeP2N3 = new Node(374, 651, 2);
    Node nodeP2N4 = new Node(366, 577, 2);
    nodeP2N1.connectNode(nodeP2N2);
    nodeP2N1.connectNode(nodeP2N4);
    nodeP2N2.connectNode(nodeP2N1);
    nodeP2N2.connectNode(nodeP2N3);
    nodeP2N3.connectNode(nodeP2N2);
    nodeP2N3.connectNode(nodeP2N4);
    nodeP2N4.connectNode(nodeP2N3);
    nodeP2N4.connectNode(nodeP2N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP2N1);
    MainClass.allNodes.add(nodeP2N2);
    MainClass.allNodes.add(nodeP2N3);
    MainClass.allNodes.add(nodeP2N4);
    // Polygon 3
    Node nodeP3N1 = new Node(311, 530, 3);
    Node nodeP3N2 = new Node(311, 559, 3);
    Node nodeP3N3 = new Node(339, 578, 3);
    Node nodeP3N4 = new Node(361, 560, 3);
    Node nodeP3N5 = new Node(361, 528, 3);
    Node nodeP3N6 = new Node(336, 516, 3);
    nodeP3N1.connectNode(nodeP3N2);
    nodeP3N1.connectNode(nodeP3N6);
    nodeP3N2.connectNode(nodeP3N1);
    nodeP3N2.connectNode(nodeP3N3);
    nodeP3N3.connectNode(nodeP3N2);
    nodeP3N3.connectNode(nodeP3N4);
    nodeP3N4.connectNode(nodeP3N3);
    nodeP3N4.connectNode(nodeP3N5);
    nodeP3N5.connectNode(nodeP3N4);
    nodeP3N5.connectNode(nodeP3N6);
    nodeP3N6.connectNode(nodeP3N5);
    nodeP3N6.connectNode(nodeP3N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP3N1);
    MainClass.allNodes.add(nodeP3N2);
    MainClass.allNodes.add(nodeP3N3);
    MainClass.allNodes.add(nodeP3N4);
    MainClass.allNodes.add(nodeP3N5);
    MainClass.allNodes.add(nodeP3N6);
    // Polygon 4
    Node nodeP4N1 = new Node(105, 628, 4);
    Node nodeP4N2 = new Node(151, 670, 4);
    Node nodeP4N3 = new Node(180, 629, 4);
    Node nodeP4N4 = new Node(156, 577, 4);
    Node nodeP4N5 = new Node(113, 587, 4);
    nodeP4N1.connectNode(nodeP4N2);
    nodeP4N1.connectNode(nodeP4N5);
    nodeP4N2.connectNode(nodeP4N1);
    nodeP4N2.connectNode(nodeP4N3);
    nodeP4N3.connectNode(nodeP4N2);
    nodeP4N3.connectNode(nodeP4N4);
    nodeP4N4.connectNode(nodeP4N3);
    nodeP4N4.connectNode(nodeP4N5);
    nodeP4N5.connectNode(nodeP4N4);
    nodeP4N5.connectNode(nodeP4N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP4N1);
    MainClass.allNodes.add(nodeP4N2);
    MainClass.allNodes.add(nodeP4N3);
    MainClass.allNodes.add(nodeP4N4);
    MainClass.allNodes.add(nodeP4N5);
    // Polygon 5
    Node nodeP5N1 = new Node(118, 517, 5);
    Node nodeP5N2 = new Node(245, 517, 5);
    Node nodeP5N3 = new Node(245, 577,5);
    Node nodeP5N4 = new Node(118, 577, 5);
    nodeP5N1.connectNode(nodeP5N2);
    nodeP5N1.connectNode(nodeP5N4);
    nodeP5N2.connectNode(nodeP5N1);
    nodeP5N2.connectNode(nodeP5N3);
    nodeP5N3.connectNode(nodeP5N2);
    nodeP5N3.connectNode(nodeP5N4);
    nodeP5N4.connectNode(nodeP5N3);
    nodeP5N4.connectNode(nodeP5N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP5N1);
    MainClass.allNodes.add(nodeP5N2);
    MainClass.allNodes.add(nodeP5N3);
    MainClass.allNodes.add(nodeP5N4);
    // Polygon 6
    Node nodeP6N1 = new Node(280, 583, 6);
    Node nodeP6N2 = new Node(333, 583, 6);
    Node nodeP6N3 = new Node(333, 665, 6);
    Node nodeP6N4 = new Node(280, 665, 6);
    nodeP6N1.connectNode(nodeP6N2);
    nodeP6N1.connectNode(nodeP6N4);
    nodeP6N2.connectNode(nodeP6N1);
    nodeP6N2.connectNode(nodeP6N3);
    nodeP6N3.connectNode(nodeP6N2);
    nodeP6N3.connectNode(nodeP6N4);
    nodeP6N4.connectNode(nodeP6N3);
    nodeP6N4.connectNode(nodeP6N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP6N1);
    MainClass.allNodes.add(nodeP6N2);
    MainClass.allNodes.add(nodeP6N3);
    MainClass.allNodes.add(nodeP6N4);
    // Polygon 7
    Node nodeP7N1 = new Node(252, 594, 7);
    Node nodeP7N2 = new Node(290, 562, 7);
    Node nodeP7N3 = new Node(264, 538, 7);
    nodeP7N1.connectNode(nodeP7N2);
    nodeP7N1.connectNode(nodeP7N3);
    nodeP7N2.connectNode(nodeP7N1);
    nodeP7N2.connectNode(nodeP7N3);
    nodeP7N3.connectNode(nodeP7N2);
    nodeP7N3.connectNode(nodeP7N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP7N1);
    MainClass.allNodes.add(nodeP7N2);
    MainClass.allNodes.add(nodeP7N3);
    // Polygon 8
    Node nodeP8N1 = new Node(198, 635, 8);
    Node nodeP8N2 = new Node(217, 574, 8);
    Node nodeP8N3 = new Node(182, 574, 8);
    nodeP8N1.connectNode(nodeP8N2);
    nodeP8N1.connectNode(nodeP8N3);
    nodeP8N2.connectNode(nodeP8N1);
    nodeP8N2.connectNode(nodeP8N3);
    nodeP8N3.connectNode(nodeP8N2);
    nodeP8N3.connectNode(nodeP8N1);
    // Once setup, add these nodes to the global list
    MainClass.allNodes.add(nodeP8N1);
    MainClass.allNodes.add(nodeP8N2);
    MainClass.allNodes.add(nodeP8N3);
    
//    Node test1 = new Node(110, 675);
//    Node test2 = new Node(134, 600);
    
   
//    
//    // Check all nodes and their connections, see which ones intersect
//    for (Node g: MainClass.allNodes) {
//      for (Node n : g.getConnectedNodesList()) {
//        System.out.printf("Testing cords: (%d,%d) - (%d,%d)\n", g.cords.x, g.cords.y, n.cords.x, n.cords.y);
//        if(checkIntersect(test1.cords, test2.cords, g.cords, n.cords))
//          System.out.println("Yes");
//        else
//            System.out.println("No");
//      }
//    }
//    System.out.println("Valid move:" + canGoTo(nodeP1N1, nodeP1N3));
    
    Node res = aStar(test1, test2);    
    
    Node n = test2;
    if(n==null)
        return;

    ArrayList<Integer> ids = new ArrayList<>();

    while(n.parent != null){
        ids.add(n.nodeID);
        n = n.parent;
    }
    ids.add(n.nodeID);
    Collections.reverse(ids);

    for(int id : ids){
        System.out.print(id + " ");
    }
    System.out.println("");
    //printPath(res);
    
    //public AStarSearch(WeightedGraph<Location> graph, Location start, Location goal)
    

    // Open node list
//    PriorityQueue<Node> openList = new PriorityQueue<Node>();
//    openList.add(test1);
//    // Closed node list
//    PriorityQueue<Node> closedList = new PriorityQueue<Node>();
//    
//    HashMap<Node, Double> costSoFar = new HashMap<Node, Double>();
//
//    while (openList.isEmpty() == false) {
//
//      // Get the current node from the open list
//      // Since it's a priority queue, this will always be the node with
//      Node currentNode = openList.remove();
//
//      // Iterate through ALL nodes, because we need to check which ones are "neighbors" and which are not
//      for (Node neighborNode : MainClass.allNodes) {
//        // First check if we can even path to this; "neighbor" nodes are any node we can go to without intersection
//        if (canGoTo(currentNode, neighborNode)) {
//          // Valid neighbor, proceed with A* algorithm stuff
//          double tentativeScore = 0;
//          //validNodes.add(g)
//        } else {
//
//        }
//      }
//          
        

//        cameFrom[start] = start;
//        costSoFar[start] = 0;

//        while (frontier.Count > 0)
//        {
//            var current = frontier.Dequeue();
//
//            if (current.Equals(goal))
//            {
//                break;
//            }
//
//            foreach (var next in graph.Neighbors(current))
//            {
//                double newCost = costSoFar[current]
//                    + graph.Cost(current, next);
//                if (!costSoFar.ContainsKey(next)
//                    || newCost < costSoFar[next])
//                {
//                    costSoFar[next] = newCost;
//                    double priority = newCost + Heuristic(next, goal);
//                    frontier.Enqueue(next, priority);
//                    cameFrom[next] = current;
//                }
//            }
//        }
//    }
    
    
  }
  
  // Checks if the start node can reach the end node with no intersection
  // Return true if it can (no intersections detected, false otherwise
  public static boolean canGoTo(Node start, Node end) {
    // Before we loop, do an obvious check; if the two points are in the
    // Same polygon and not connected, they obviously cannot move to one-another
    if (start.getPolygonID() == end.getPolygonID() && start.getConnectedNodesList().contains(end) == false) {
      return false;
    }
    // Check all nodes and their connections, see which ones intersect
    for (Node currentCheckedNode: MainClass.allNodes) {
      // Check all the line segments created by this node (all connected nodes)
      for (Node currentConnectedNode : currentCheckedNode.getConnectedNodesList()) {
        //System.out.printf("Testing cords: (%d,%d) - (%d,%d)\n", 
        //    currentCheckedNode.cords.x, currentCheckedNode.cords.y, currentConnectedNode.cords.x, currentConnectedNode.cords.y);
        // Check the intersection for the current pairs: the line segment from the 2 passed into the function
        // and the current 2 nodes we got from our iteration
        if(checkIntersect(start.cords, end.cords, currentCheckedNode.cords, currentConnectedNode.cords))
          // There is an intersection, immediately end the function
          return false;
      }
    }
    // If we make it to here, there is no intersections detected, so this is valid
    return true;
  }
//  
  public static Node aStar(Node start, Node target) {
    // Setup open + closed lists
    PriorityQueue<Node> closedList = new PriorityQueue<>();
    PriorityQueue<Node> openList = new PriorityQueue<>();
    // Calculate fVal for the starting node first
    start.fVal = start.gVal + start.calcDistance(target);
    // and add it to the open list
    openList.add(start);
    
    // Proceed while the open list is not empty
    while (!openList.isEmpty()) {
      Node currentNode = openList.peek();
      if (currentNode == target) {
        return currentNode;
      }

      // Iterate through ALL nodes, because we need to check which ones are "neighbors" and which are not
      for (Node neighborNode : MainClass.allNodes) {
        // If we can't move to this node or the iterator picked itself, continue and dont do the A* logic
        if ((neighborNode.nodeID == currentNode.nodeID ) || (!canGoTo(currentNode, neighborNode))) {
          continue;
        }
        // first calculate the g weight of this node going to the selected neighbor 
        // Take the current distance from start and add the distance to the neighbor to get neighbor gVal
        double totalWeight = currentNode.gVal + currentNode.calcDistance(neighborNode);
        // If this node isn't in any lists
        if (!openList.contains(neighborNode) && !closedList.contains(neighborNode)) {
          // Set parent here; this node will path to the neighbor node if this is the desired path
          neighborNode.parent = currentNode;
          // Update the gVal with the calculation above
          neighborNode.gVal = totalWeight;
          // Calculate the fVal here; use the above gVal and add the distance remaining to target
          neighborNode.fVal = neighborNode.gVal + neighborNode.calcDistance(target);
          openList.add(neighborNode);
        } else {
          // If this node has a small gVal than the neighbor node
          if (totalWeight < neighborNode.gVal) {
            // Set parent here; this node will path to the neighbor node if this is the desired path
            neighborNode.parent = currentNode;
            // Update the gVal with the calculation above
            neighborNode.gVal = totalWeight;
            // Calculate the fVal here; use the above gVal and add the distance remaining to target
            neighborNode.fVal = neighborNode.gVal + neighborNode.calcDistance(target);
            // If the closed list doesn't have the neighbor node
            if (closedList.contains(neighborNode)) {
              closedList.remove(neighborNode);
              openList.add(neighborNode);
            }
          }
        }
      }
      // Remove the current checked node from the lists
      openList.remove(currentNode);
      closedList.add(currentNode);
    }
    // If we make it here, something went wrong; we couldn't find a path :(
    return null;
  }

}

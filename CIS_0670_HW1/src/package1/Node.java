package package1;

import java.util.ArrayList;

public class Node implements Comparable<Node> {
  
  // List of all nodes this one is connected to
  public ArrayList<Node> connectedNodesList = new ArrayList<Node>();
  // Cord of this node
  public Vector2 cords = new Vector2();
  // ID of the polygonID this node is in; -1 means no polygonID
  public int polygonID = -1;
  // Counter for node ID
  private static int idCounter = 0;
  //Node ID
  public int nodeID;

  
  // Value from the start to this node (distance)
  public double gVal = 0; //Double.MAX_VALUE;
  // Combined value of gVal and hVal
  public double fVal = 0; //Double.MAX_VALUE;
  
  // Parent node in the final path (if applicable)
  public Node parent = null;
  
  
  @Override
  public int compareTo(Node compare) {
        return Double.compare(this.fVal, compare.fVal);
  }
  
  public Node(int x, int y, int id) {
    this.nodeID = Node.idCounter++;
    this.cords.x = x;
    this.cords.y = y;
    this.polygonID = id;
    System.out.println("Node id: " + this.nodeID + " Cords: (" + this.cords.x + ", " + this.cords.y + ") Polygon ID: " + this.polygonID);
  }
  
  public Node(int x, int y) {
    this.nodeID = Node.idCounter++;
    this.cords.x = x;
    this.cords.y = y;
    System.out.println("Node id: " + this.nodeID + " Cords: (" + this.cords.x + ", " + this.cords.y + ") Polygon ID: " + this.polygonID);
  }

  public Vector2 getCords() {
    return cords;
  }

  public void setCords(Vector2 cords) {
    this.cords = cords;
  }
  
  public void connectNode(Node newNode) {
    // Check for node first before adding it; avoid duplicates
    if (this.connectedNodesList.contains(newNode) == false) {
      this.connectedNodesList.add(newNode);
    } else {
      System.out.println("DUPLCIATE WEEOOEEOO!!");
    }
  }

  public ArrayList<Node> getConnectedNodesList() {
    return connectedNodesList;
  }

  public void setConnectedNodesList(ArrayList<Node> connectedNodesList) {
    this.connectedNodesList = connectedNodesList;
  }

  public int getPolygonID() {
    return polygonID;
  }

  public void setPolygonID(int polygonID) {
    this.polygonID = polygonID;
  }
  
  // Calculates distance from this node to the provided node
  public double calcDistance(Node targetNode) {
    double a = Math.pow((targetNode.cords.x - this.cords.x), 2);
    double b = Math.pow((targetNode.cords.y - this.cords.y), 2);
    return Math.sqrt((a + b));
  }

}

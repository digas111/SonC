package sonc.quad;

class NodeTrie<T extends HasPoint> extends Trie<T>{
	
	java.util.Map<Trie.Quadrant,Trie<T>> tries;

//	NodeTrie(double topLeftX, double topLeftY, double bottomRightX, double bottomRightY) {
//		this.topLeftX = topLeftX;
//		this.topLeftY = topLeftY;
//		this.bottomRightX = bottomRightX;
//		this.bottomRightY = bottomRightY;
//	}
	
//	Trie.Quadrant quadrantOf(T point) {
//		
//	}
	
	T find(T point) {
		
		if(isInside(point.getX(), point.getY()) ) {
			return point;
		}
		
		return null;	
	}
	
	Trie <T> insert(T point) {
		
	}
	
	
	
	
}

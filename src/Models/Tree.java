package Models;

public class Tree {
	
	private Tree _leftChild;
	private Tree _rightChild;
	private Tree _centerChild;
	private Tree _father;
	private int _depth;
	private String _value;
	private boolean _isRoot;
	private boolean _isLeaf;
	private int _nodesNumber;
	private int _position; //-1 root, 0 left, 1 center, 2 right
	private int _symbolPos;
	
	public Tree(Tree father, int depth, boolean isRoot, boolean isLeaf, int position) {
		_father = father;
		_depth = depth;
		_isRoot = isRoot;
		_isLeaf = isLeaf;
		_position = position;
	}

	public Tree get_leftChild() {
		return _leftChild;
	}

	public void set_leftChild(Tree _leftChild) {
		this._leftChild = _leftChild;
	}

	public Tree get_rightChild() {
		return _rightChild;
	}

	public void set_rightChild(Tree _rightChild) {
		this._rightChild = _rightChild;
	}
	
	public Tree get_centerChild() {
		return _centerChild;
	}

	public void set_centerChild(Tree _centerChild) {
		this._centerChild = _centerChild;
	}

	public Tree get_father() {
		return _father;
	}

	public void set_father(Tree _father) {
		this._father = _father;
	}

	public int get_depth() {
		return _depth;
	}

	public void set_depth(int _depth) {
		this._depth = _depth;
	}

	public String get_value() {
		return _value;
	}

	public void set_value(String _value) {
		this._value = _value;
	}

	public boolean is_isRoot() {
		return _isRoot;
	}

	public void set_isRoot(boolean _isRoot) {
		this._isRoot = _isRoot;
	}

	public boolean is_isLeaf() {
		return _isLeaf;
	}

	public void set_isLeaf(boolean _isLeaf) {
		this._isLeaf = _isLeaf;
	}

	public int get_nodesNumber() {
		return _nodesNumber;
	}

	public void set_nodesNumber(int _nodesNumber) {
		this._nodesNumber = _nodesNumber;
	}

	public int get_position() {
		return _position;
	}

	public void set_position(int _position) {
		this._position = _position;
	}

	public int get_symbolPos() {
		return _symbolPos;
	}

	public void set_symbolPos(int _symbolPos) {
		this._symbolPos = _symbolPos;
	}
}

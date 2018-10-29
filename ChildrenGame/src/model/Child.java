package model;

/** Child Class */

public class Child {
	
	/* the child's id */
	public int id = 1;
	
	public int position = 1;
	

    public Child(int id)
    {
    	this.id = id;
    }

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", position=" + position + "]";
	}
	
	

	
}


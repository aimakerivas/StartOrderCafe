/**
 * 
 */
package dao;

import java.util.List;

import model.Porder;

/**
 * 
 */

public interface PorderDao {
	// Create
	/** add a porder record */
	void add(Porder porder);
	
	// Read 
	
	/** select * from porder */
	List<Porder> selectAll();
	// selectById before Update
	List<Porder> selectById(int id);


	
	/** Update */
	void update(Porder porder);
	
	/** Delete */
	void delete(Integer id);
}

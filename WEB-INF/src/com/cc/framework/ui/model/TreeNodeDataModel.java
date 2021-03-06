/*
 * $Header: d:/repository/cvs/cc-framework/source/com/cc/framework/ui/model/TreeNodeDataModel.java,v 1.5 2005/02/16 18:13:32 P001001 Exp $
 * $Revision: 1.5 $
 * $Date: 2005/02/16 18:13:32 $
 *
 * ====================================================================
 *
 * Copyright (c) 2000 - 2005 SCC Informationssysteme GmbH. All rights
 * reserved.
 * Vendor URL : http://www.scc-gmbh.com
 * Product URL: http://www.common-controls.com
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL SCC INFORMATIONSSYSTEME GMBH OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 */
package com.cc.framework.ui.model;

/**
 * Interface for nodes of a tree.
 *
 * @author    <a href="mailto:hschulz@scc-gmbh.com">Harald Schulz</a>
 * @version   $Revision: 1.5 $
 * @since     1.0
 */
public interface TreeNodeDataModel extends DataModel {

	/**
	 * Returns a referenz to the parent element
	 * 
	 * @return	TreeGroupDataModel
	 */
	public TreeGroupDataModel getParent();

	/**
	 * Sets the referenz to the parent element
	 * 
	 * @param	parent	TreeGroupDataModel
	 */
	public void setParent(TreeGroupDataModel parent);

	/**
	 * Returns the key for the parent element.
	 * 
	 * @return	String	
	 */
	public String getParentKey();

	/**
	 * Returns a unique id for the node in the tree.
	 * The id is used within a hyperlink to identify the node 
	 *
	 * @return String	The unique key
	 */
	public String getUniqueKey();
}

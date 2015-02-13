/*
 * $Header: d:/repository/cvs/cc-framework/source/com/cc/framework/ui/model/imp/ColumnCheckDesignModelImp.java,v 1.10 2005/07/08 14:19:43 P001002 Exp $
 * $Revision: 1.10 $
 * $Date: 2005/07/08 14:19:43 $
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

package com.cc.framework.ui.model.imp;

import com.cc.framework.ui.AlignmentType;
import com.cc.framework.ui.model.ColumnCheckDesignModel;

/**
 * Designmodel for CheckColumns
 *
 * @author		<a href="mailto:hschulz@scc-gmbh.com">Harald Schulz</a>
 * @version		$Revision: 1.10 $
 * @since       1.0
 */
public class ColumnCheckDesignModelImp extends ColumnDesignModelImp implements ColumnCheckDesignModel {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 8524083229313070849L;

	/**
	 * Indicates if the multiple check option of the column is
	 * enabled
	 */
	private boolean checkAll = false;

	/**
	 * Constructor
	 */
	public ColumnCheckDesignModelImp() {

		super();

		setWidth("40");
		setAlignment(AlignmentType.CENTER);
	}

	/**
	 * @see com.cc.framework.ui.model.ColumnCheckDesignModel#checkAll()
	 */
	public boolean checkAll() {
		return checkAll;
	}

	/**
	 * @see com.cc.framework.ui.model.ColumnCheckDesignModel#setCheckAll(boolean)
	 */
	public void setCheckAll(boolean enable) {
		this.checkAll = enable;
	}
}
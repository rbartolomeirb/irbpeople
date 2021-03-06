/*
 * $Header: d:/repository/cvs/cc-framework/source/com/cc/framework/ui/model/ButtonType.java,v 1.5 2005/07/08 14:19:30 P001002 Exp $
 * $Revision: 1.5 $
 * $Date: 2005/07/08 14:19:30 $
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

import java.io.Serializable;

import com.cc.framework.common.InvalidEnumType;
import com.cc.framework.common.SimpleEnumType;

/**
 * Enumeration Button-Types
 *
 * @author    <a href="mailto:hschulz@scc-gmbh.com">Harald Schulz</a>
 * @version   $Revision: 1.5 $
 */
public final class ButtonType implements SimpleEnumType, Serializable {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 96408749439694180L;

	/** ButtonType: button */
	public static final ButtonType BUTTON	= new ButtonType("button");

	/** ButtonType: cancel */
	public static final ButtonType CANCEL	= new ButtonType("cancel");

	/** ButtonType: reset */
	public static final ButtonType RESET	= new ButtonType("reset");


	/**
	 * Internal Type
	 */
	private String type;

	/**
	 * Collection with all Elemenets
	 */
	private static final ButtonType[] ALL	= {BUTTON, CANCEL, RESET};

	/**
	 * Constructor
	 * @param	type	Type
	 */
	private ButtonType(String type) {
		this.type	= type;
	}

	/**
	 * Returns the Type
	 * @return String
	 */
	public String toString() {
		return type;
	}

	/**
	 * Compares this type to the specified object.
	 *
	 * @param	obj The object to compare this <code>ButtonType</code>
	 * 			object against.
	 * @return  <code>true</code> if the internal types are equal;
	 *          <code>false</code> otherwise.
	 */
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		} else if (obj instanceof String) {
			return type.equals(obj);
		} else if (obj instanceof ButtonType) {
			return type.equals(((ButtonType) obj).type);
		}

		return false;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return type.hashCode();
	}

	/**
	 * Creates for the argument an Object of Type ButtonType
	 * @param	code	String to parse
	 * @return	ButtonType
	 */
	public static ButtonType parse(String code) {
		for (int index = 0; index < ALL.length; index++) {
			if (ALL[index].equals(code)) {
				return ALL[index];
			}
		}

		throw new InvalidEnumType("Invalid ButtonType: " + code);
	}
}
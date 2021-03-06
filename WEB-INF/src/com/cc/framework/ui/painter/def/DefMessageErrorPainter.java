/*
 * $Header: d:/repository/cvs/cc-framework/source/com/cc/framework/ui/painter/def/DefMessageErrorPainter.java,v 1.25 2005/05/01 08:57:08 P001002 Exp $
 * $Revision: 1.25 $
 * $Date: 2005/05/01 08:57:08 $
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

package com.cc.framework.ui.painter.def;

import org.apache.ecs.html.IMG;

import com.cc.framework.message.Message;
import com.cc.framework.ui.control.MessageControl;
import com.cc.framework.ui.painter.PainterContext;

/**
 * Painter for the error control.
 * This painter is responsible for writting message of type error.
 *
 * @author      <a href="mailto:hschulz@scc-gmbh.com">Gernot Schulz</a>
 * @version     $Revision: 1.25 $
 * @since       1.0
 */
public class DefMessageErrorPainter extends DefMessagePainter {

	/**
	 * Constructor
	 *
	 * @param	painterContext	The PainterContext
	 * @param	ctrl			The Control to render
	 */
	public DefMessageErrorPainter(PainterContext painterContext, MessageControl ctrl) {
		super(painterContext, ctrl);
	}

	/**
	 * @see com.cc.framework.ui.painter.ControlPainter#getElementClass(int)
	 */
	public String getElementClass(int type) {
		if (type == DefClassType.CLASS_CONTROL) {
			return DefHtmlClass.ERROR_FORM;
		} else {
			return super.getElementClass(type);
		}
	}

	/**
	 * @see com.cc.framework.ui.painter.def.DefMessagePainter#createSeverityImg(com.cc.framework.message.Message)
	 */
	protected IMG createSeverityImg(Message message) {
		return createImage(DefResources.IMAGE_DOT_COLOR, getColor(DefColorPalette.ERROR_COLOR_TEXT));
	}
}
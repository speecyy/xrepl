/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
package org.xrepl;

import com.google.inject.ImplementedBy;


@ImplementedBy(CommandLineOutput.class)
public interface OutputView {
	
	void showInput(String input);

	void showResult(Object result);

	void showError(Throwable e);

	void flush();

	void clear();

	void dispose();

}

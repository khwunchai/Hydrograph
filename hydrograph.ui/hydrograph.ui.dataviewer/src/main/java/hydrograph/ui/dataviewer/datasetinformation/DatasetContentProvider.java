/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
 
package hydrograph.ui.dataviewer.datasetinformation;

import java.util.List;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * The Class DatasetContentProvider.
 * This class provides the content for Dataset information View.
 * 
 * @author Bitwise
 */
public class DatasetContentProvider implements IStructuredContentProvider {
	
	@Override
	public void dispose() {
		// Do nothing
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Do nothing
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return ((List) inputElement).toArray();
	}
}

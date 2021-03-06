/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.partitioning.tests;

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.partitioning.DevComponentFile;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dev Component File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevComponentFileTest extends ComponentFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevComponentFileTest.class);
	}

	/**
	 * Constructs a new Dev Component File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevComponentFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dev Component File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DevComponentFile getFixture() {
		return (DevComponentFile) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartitioningFactory.eINSTANCE.createDevComponentFile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DevComponentFileTest

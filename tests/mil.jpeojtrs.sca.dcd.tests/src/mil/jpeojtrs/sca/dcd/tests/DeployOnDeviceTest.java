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
package mil.jpeojtrs.sca.dcd.tests;

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DeployOnDevice;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Deploy On Device</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent() <em>Component</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DeployOnDeviceTest extends TestCase {

	/**
	 * The fixture for this Deploy On Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployOnDevice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeployOnDeviceTest.class);
	}

	/**
	 * Constructs a new Deploy On Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployOnDeviceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Deploy On Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeployOnDevice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Deploy On Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployOnDevice getFixture() {
		return fixture;
	}

	private DeviceConfiguration conf;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.conf = DcdTests.getDeviceConfiguration();
		this.setFixture(this.conf.getPartitioning().getComponentPlacement().get(3).getDeployDevice());
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

	public void testParse() throws Exception {
		Assert.assertNotNull(this.getFixture());
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90eeea", this.getFixture().getRefID());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent()
	 * <em>Component</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.dcd.DeployOnDevice#getComponent()
	 * @generated NOT
	 */
	public void testGetComponent() {
		// END GENERATED CODE

		Assert.assertNotNull(this.getFixture());
		Assert.assertNotNull(this.getFixture().getComponent());
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90eeea", this.getFixture().getComponent().getId());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DeployOnDevice#setComponent(mil.jpeojtrs.sca.dcd.ComponentInstantiation) <em>Component</em>}' feature setter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.DeployOnDevice#setComponent(mil.jpeojtrs.sca.dcd.ComponentInstantiation)
	 * @generated NOT
	 */
	public void testSetComponent() {
		// END GENERATED CODE

		final DcdComponentInstantiation tempComp = this.getFixture().getComponent();
		Assert.assertNotNull(tempComp);

		tempComp.setId("DCE:3b5527f5-8488-4b09-bfff-2ec49a90bbbb");
		getFixture().setComponent(tempComp);

		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90bbbb", this.getFixture().getComponent().getId());

		// END GENERATED CODE
	}

} //DeployOnDeviceTest

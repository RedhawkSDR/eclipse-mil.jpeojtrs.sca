package FRONTEND;


/**
* FRONTEND/GPSPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/GPS.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/


/************************/
public class GPSPOATie extends GPSPOA
{

  // Constructors

  public GPSPOATie ( FRONTEND.GPSOperations delegate ) {
      this._impl = delegate;
  }
  public GPSPOATie ( FRONTEND.GPSOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public FRONTEND.GPSOperations _delegate() {
      return this._impl;
  }
  public void _delegate (FRONTEND.GPSOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }

  /** Updates as necessary */
  public FRONTEND.GPSInfo gps_info ()
  {
    return _impl.gps_info();
  } // gps_info

  /** Updates as necessary */
  public void gps_info (FRONTEND.GPSInfo newGps_info)
  {
    _impl.gps_info(newGps_info);
  } // gps_info


  /** Main timing structure. If pososition is not known, set position valid to false */
  public FRONTEND.GpsTimePos gps_time_pos ()
  {
    return _impl.gps_time_pos();
  } // gps_time_pos

  /** Main timing structure. If pososition is not known, set position valid to false */
  public void gps_time_pos (FRONTEND.GpsTimePos newGps_time_pos)
  {
    _impl.gps_time_pos(newGps_time_pos);
  } // gps_time_pos

  private FRONTEND.GPSOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class GPSPOATie
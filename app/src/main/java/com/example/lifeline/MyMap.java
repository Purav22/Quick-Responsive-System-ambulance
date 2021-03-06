package com.example.lifeline;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MyMap extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng Gandhinagar = new LatLng(23.216578, 72.640772);
        //  mMap.addMarker(new MarkerOptions().position(Gandhinagar).);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gandhinagar));
        googleMap.addMarker(new MarkerOptions()
                .position(Gandhinagar)
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.signal2)));
        LatLng g1 = new LatLng(23.216217, 72.640727);
        //  mMap.addMarker(new MarkerOptions().position(g1));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(g1));
        googleMap.addMarker(new MarkerOptions()
                .position(g1)
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.signal2)));
        LatLng g2 = new LatLng(23.216554, 72.641219);
        //  mMap.addMarker(new MarkerOptions().position(g2));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(g2));
        googleMap.addMarker(new MarkerOptions()
                .position(g2)
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.signal2)));
        LatLng g3 = new LatLng(23.216151, 72.641130);
        //  mMap.addMarker(new MarkerOptions().position(g3));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(g3));
        googleMap.addMarker(new MarkerOptions()
                .position(g3)
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.signal2)));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Gandhinagar,14.0f));
    }
}

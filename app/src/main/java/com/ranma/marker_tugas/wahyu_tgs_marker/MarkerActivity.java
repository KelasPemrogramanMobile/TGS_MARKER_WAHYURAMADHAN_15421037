package com.ranma.marker_tugas.wahyu_tgs_marker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MarkerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marker);

        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        GeoPoint ubl = new GeoPoint(-5.379521, 105.251684);
        GeoPoint rumah = new GeoPoint(-5.451183, 105.263059);
        GeoPoint ubls2 = new GeoPoint(-5.375369, 105.246312);
        GeoPoint museum = new GeoPoint(-5.372215, 105.240891);
        GeoPoint MBK = new GeoPoint(-5.381785, 105.259602);

        IMapController mapController = map.getController();
        mapController.setZoom(13);
        mapController.setCenter(ubl);

        Marker rumahMarker = new Marker(map);
        rumahMarker.setPosition(rumah);
        rumahMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(rumahMarker);
        map.invalidate();
        rumahMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        rumahMarker.setTitle("Rumah Wahyu");

        Marker ublMarker = new Marker(map);
        ublMarker.setPosition(ubl);
        ublMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(ublMarker);
        map.invalidate();
        ublMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        ublMarker.setTitle("UBL");

        Marker ubls2Marker = new Marker(map);
        ubls2Marker.setPosition(ubls2);
        ubls2Marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(ubls2Marker);
        map.invalidate();
        ubls2Marker.setIcon(getResources().getDrawable(R.drawable.icon));
        ubls2Marker.setTitle("UBL S2");

        Marker museumMarker = new Marker(map);
        museumMarker.setPosition(museum);
        museumMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(museumMarker);
        map.invalidate();
        museumMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        museumMarker.setTitle("Museum Lampung");

        Marker MBKMarker = new Marker(map);
        MBKMarker.setPosition(MBK);
        MBKMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(MBKMarker);
        map.invalidate();
        MBKMarker.setIcon(getResources().getDrawable(R.drawable.icon));
        MBKMarker.setTitle("Mall Boemi Kedaton");
    }
}

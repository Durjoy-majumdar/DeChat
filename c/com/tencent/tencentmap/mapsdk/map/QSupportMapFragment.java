package com.tencent.tencentmap.mapsdk.map;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mapsdk.rastercore.LogHelper;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;

public class QSupportMapFragment extends HellAndroidXFragment {
    private MapView mapView;

    public static QSupportMapFragment newInstance() {
        return new QSupportMapFragment();
    }

    public MapView getMapView() {
        return this.mapView;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            bundle = getArguments();
        }
        if (this.mapView == null) {
            MapView mapView2 = new MapView(layoutInflater.getContext());
            this.mapView = mapView2;
            mapView2.onCreate(bundle);
        }
        LogHelper.m160680v("js", "QSupportMapFragment onCreateView ");
        return this.mapView;
    }

    public void onDestroy() {
        this.mapView.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.mapView.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
    }

    public void onPause() {
        super.onPause();
        this.mapView.onPause();
    }

    public void onResume() {
        super.onResume();
        this.mapView.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mapView.onSaveInstanceState(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}

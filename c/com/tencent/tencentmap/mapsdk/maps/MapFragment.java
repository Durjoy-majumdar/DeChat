package com.tencent.tencentmap.mapsdk.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapFragment extends Fragment {
    private boolean isOnTop = true;
    private TencentMap mTencentMap;
    public MapView mapV = null;

    public static MapFragment newInstance(Context context) {
        MapFragment mapFragment = new MapFragment();
        mapFragment.initMap(context);
        return mapFragment;
    }

    public TencentMap getMap() {
        if (this.mTencentMap == null) {
            this.mTencentMap = this.mapV.getMap();
        }
        return this.mTencentMap;
    }

    public void initMap(Context context) {
        if (this.mapV == null) {
            this.mapV = onCreateMapView(context.getApplicationContext(), (TencentMapOptions) null);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public MapView onCreateMapView(Context context, TencentMapOptions tencentMapOptions) {
        return new MapView(context, tencentMapOptions);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mapV == null) {
            this.mapV = onCreateMapView(getActivity().getBaseContext(), (TencentMapOptions) null);
        }
        this.mapV.setOnTop(this.isOnTop);
        return this.mapV;
    }

    public void onDestroy() {
        this.mapV.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.mapV.onDestroy();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
    }

    public void onLowMemory() {
        super.onLowMemory();
    }

    public void onPause() {
        this.mapV.onPause();
        super.onPause();
    }

    public void onResume() {
        this.mapV.onResume();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.mapV.onStart();
        super.onStart();
    }

    public void onStop() {
        this.mapV.onStop();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    public void setOnTop(boolean z) {
        this.isOnTop = z;
    }
}

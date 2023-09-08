package com.tencent.tencentmap.mapsdk.maps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class SupportMapFragment extends Fragment {
    private boolean isOnTop = false;
    private TencentMap mTencentMap;
    public MapView mapV = null;

    public static SupportMapFragment newInstance(Context context) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        supportMapFragment.initMap(context);
        return supportMapFragment;
    }

    public TencentMap getMap() {
        if (this.mTencentMap == null) {
            this.mTencentMap = this.mapV.getMap();
        }
        return this.mTencentMap;
    }

    public void initMap(Context context) {
        this.mapV = onCreateMapView(context, (TencentMapOptions) null);
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
        this.mapV = null;
    }

    public void onDestroyView() {
        this.mapV.onDestroy();
        super.onDestroyView();
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

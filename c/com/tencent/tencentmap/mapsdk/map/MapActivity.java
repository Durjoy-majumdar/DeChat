package com.tencent.tencentmap.mapsdk.map;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

public abstract class MapActivity extends FragmentActivity {
    private List<MapView> mapViewList = new ArrayList();
    private Bundle mysavedInstanceState;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mysavedInstanceState = bundle;
    }

    public void onDestroy() {
        super.onDestroy();
        for (MapView next : this.mapViewList) {
            if (next != null) {
                next.onDestroy();
            }
        }
        this.mapViewList.clear();
    }

    public void onPause() {
        super.onPause();
        for (MapView next : this.mapViewList) {
            if (next != null) {
                next.onPause();
            }
        }
    }

    public void onRestart() {
        super.onRestart();
        for (MapView next : this.mapViewList) {
            if (next != null) {
                next.onRestart();
            }
        }
    }

    public void onResume() {
        super.onResume();
        for (MapView next : this.mapViewList) {
            if (next != null) {
                next.onResume();
            }
        }
    }

    public void onStart() {
        super.onStart();
        for (MapView next : this.mapViewList) {
            if (next != null) {
                next.onStart();
            }
        }
    }

    public void onStop() {
        super.onStop();
        for (MapView next : this.mapViewList) {
            if (next != null) {
                next.onStop();
            }
        }
    }

    public void setMapView(MapView mapView) {
        if (mapView != null) {
            this.mapViewList.add(mapView);
        }
    }
}

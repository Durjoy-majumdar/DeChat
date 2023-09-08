package com.tencent.mapsdk.rastercore;

import a70.C112760b;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tencentmap.mapsdk.map.IMapView;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import yw3.C119001a;
import yw3.C119004d;
import yw3.C119019j;

public class MapProvider {
    private TencentMapOptions mTencentMapOptions;

    public static String getMapSdkPath() {
        String str;
        StringBuilder sb = new StringBuilder();
        synchronized (C112760b.class) {
            str = C112760b.m154228e0() + "/MicroMsg/";
        }
        sb.append(str);
        sb.append("mapsdk");
        String sb4 = sb.toString();
        if (!C86013q1.m106450k(sb4)) {
            C86013q1.m106461v(sb4);
        }
        Log.m105919d("MapProvider", "path:%s", sb4);
        return sb4;
    }

    public IMapView getMapView(Context context, TencentMapOptions tencentMapOptions) {
        this.mTencentMapOptions = tencentMapOptions;
        int mapType = tencentMapOptions != null ? tencentMapOptions.getMapType() : 0;
        if (mapType == 0) {
            LogHelper.m160676e("maptype", "glmapview");
            return new C119004d(context, this.mTencentMapOptions);
        } else if (mapType == 1) {
            C119019j jVar = new C119019j(context, this.mTencentMapOptions);
            LogHelper.m160676e("maptype", "maprenderlayer");
            return jVar;
        } else if (mapType != 2) {
            return new C119004d(context, this.mTencentMapOptions);
        } else {
            C119001a aVar = new C119001a(context, this.mTencentMapOptions);
            LogHelper.m160676e("maptype", "texturemapview");
            return aVar;
        }
    }
}

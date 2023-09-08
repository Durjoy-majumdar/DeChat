package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import y22.C118910b;
import y22.C118912d;

@C86522b
/* renamed from: com.tencent.mm.plugin.location.ui.impl.l */
public class C115562l extends C86301e implements C118912d {
    public static SoSoMapView vx0(Context context) {
        SoSoMapView soSoMapView;
        boolean equalsIgnoreCase = "CN".equalsIgnoreCase((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null));
        Log.m105925i("MicroMsg.MapFactoryImp", "chinaReg:%b", Boolean.valueOf(equalsIgnoreCase));
        boolean z = !equalsIgnoreCase;
        Log.m105925i("MicroMsg.MapFactoryImp", "isOverseasUser:%b", Boolean.valueOf(z));
        TencentMapInitializer.setAgreePrivacy(true);
        if (z) {
            TencentMapOptions tencentMapOptions = new TencentMapOptions();
            tencentMapOptions.setServiceProtocol(1, Integer.valueOf(C0966R.raw.sdk_protocol));
            soSoMapView = new SoSoMapView(context, tencentMapOptions);
        } else {
            soSoMapView = new SoSoMapView(context);
        }
        soSoMapView.setId(C0966R.C0970id.ehg);
        return soSoMapView;
    }

    public C118910b F90(Activity activity, int i) {
        if (i == 2) {
            Log.m105924i("MicroMsg.MapFactoryImp", "poi map");
            return new C115538c0(activity);
        } else if (i == 4) {
            Log.m105924i("MicroMsg.MapFactoryImp", "track map");
            return new C94167s0(activity);
        } else if (i != 5) {
            return null;
        } else {
            Log.m105924i("MicroMsg.MapFactoryImp", "share map");
            return new RealTimeLocationUI(activity);
        }
    }
}

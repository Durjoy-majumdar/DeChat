package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.h */
public class C29425h extends C86301e implements C29444w {

    /* renamed from: d */
    public C29421f f80245d;

    /* renamed from: NV */
    public long mo56667NV(String str, int i) {
        if (vx0() == null) {
            return 0;
        }
        AppBrandBackgroundFetchDataParcel QV = vx0().mo56696QV(str, i);
        long j = QV != null ? QV.f80222j : 0;
        if (j > 0) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getUpdateTime success(time:%s), app(%s_%d)", Long.valueOf(j), str, Integer.valueOf(i));
        } else {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getUpdateTime fail, app(%s_%d)", str, Integer.valueOf(i));
        }
        return j;
    }

    /* renamed from: OF */
    public boolean mo56668OF(String str, int i, String str2, String str3, String str4, int i2, long j) {
        if (vx0() == null) {
            return false;
        }
        boolean OF = vx0().mo56695OF(str, i, str2, str3, str4, i2, j);
        if (OF) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy set success(time:%s), app(%s_%d)", Long.valueOf(j), str, Integer.valueOf(i));
        } else {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy set fail, app(%s_%d)", str, Integer.valueOf(i));
        }
        return OF;
    }

    /* renamed from: QV */
    public AppBrandBackgroundFetchDataParcel mo56669QV(String str, int i) {
        if (vx0() == null) {
            return null;
        }
        AppBrandBackgroundFetchDataParcel QV = vx0().mo56696QV(str, i);
        if (QV == null) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy get fail, app(%s_%d)", str, Integer.valueOf(i));
            return null;
        }
        Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy get success, app(%s_%d)", str, Integer.valueOf(i));
        return QV;
    }

    /* renamed from: W0 */
    public boolean mo56670W0(String str, int i) {
        if (vx0() == null) {
            return false;
        }
        boolean W0 = vx0().mo56697W0(str, i);
        if (W0) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy delete success, app(%s_%d)", str, Integer.valueOf(i));
        } else {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy delete fail, app(%s_%d)", str, Integer.valueOf(i));
        }
        return W0;
    }

    public void onAccountInitialized(Context context) {
        C81161g2.requireAccountInitializedOnDemand();
        this.f80245d = (C29421f) C81161g2.Bx0(C29421f.class);
    }

    public void onAccountReleased(Context context) {
        this.f80245d = null;
    }

    public AppBrandBackgroundFetchDataParcel ro0(String str, int i) {
        AppBrandBackgroundFetchDataParcel appBrandBackgroundFetchDataParcel = null;
        if (vx0() == null) {
            return null;
        }
        C29421f vx02 = vx0();
        vx02.getClass();
        if (!Util.isNullOrNil(str)) {
            appBrandBackgroundFetchDataParcel = vx02.mo56696QV(C81661j.m100181f(str), i);
        }
        if (appBrandBackgroundFetchDataParcel == null) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getByAppId fail, app(%s_%d)", str, Integer.valueOf(i));
        } else {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageProxy", "AppBrandBackgroundFetchDataStorageProxy getByAppId success, app(%s_%d)", str, Integer.valueOf(i));
        }
        return appBrandBackgroundFetchDataParcel;
    }

    public final C29421f vx0() {
        if (C86709a0.m107522a()) {
            requireAccountInitialized();
        }
        return this.f80245d;
    }
}

package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.m */
public class C29434m extends C86301e implements C29445x {

    /* renamed from: d */
    public C29430k f80258d;

    /* renamed from: B9 */
    public boolean mo56688B9(String str, String str2) {
        if (vx0() == null) {
            return false;
        }
        boolean B9 = vx0().mo56701B9(str, str2);
        if (B9) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageProxy", "set success, app(%s)", str);
        } else {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageProxy", "set fail, app(%s)", str);
        }
        return B9;
    }

    /* renamed from: c */
    public boolean mo56689c(String str) {
        if (vx0() == null) {
            return false;
        }
        boolean c = vx0().mo56702c(str);
        if (c) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageProxy", "delete success, app(%s)", str);
        } else {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageProxy", "delete fail, app(%s)", str);
        }
        return c;
    }

    public AppBrandBackgroundFetchDataTokenParcel get(String str) {
        if (vx0() == null) {
            return null;
        }
        AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = vx0().get(str);
        if (appBrandBackgroundFetchDataTokenParcel == null) {
            Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageProxy", "get fail, app(%s)", str);
            return null;
        }
        Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageProxy", "get success, app(%s)", str);
        return appBrandBackgroundFetchDataTokenParcel;
    }

    public void onAccountInitialized(Context context) {
        C81161g2.requireAccountInitializedOnDemand();
        this.f80258d = (C29430k) C81161g2.Bx0(C29430k.class);
    }

    public void onAccountReleased(Context context) {
        this.f80258d = null;
    }

    public final C29430k vx0() {
        if (C86709a0.m107522a()) {
            requireAccountInitialized();
        }
        return this.f80258d;
    }
}

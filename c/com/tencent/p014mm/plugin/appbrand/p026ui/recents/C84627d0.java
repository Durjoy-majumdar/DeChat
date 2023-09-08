package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.d0 */
public final class C84627d0 extends C84637i0<Object> {
    public C84627d0(ArrayList<?> arrayList, ArrayList<?> arrayList2) {
        super(arrayList, arrayList2);
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        if (!(this.f246940a.get(i) instanceof AppBrandRecentTaskInfo)) {
            return true;
        }
        AppBrandRecentTaskInfo appBrandRecentTaskInfo = (AppBrandRecentTaskInfo) this.f246940a.get(i);
        AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = (AppBrandRecentTaskInfo) this.f246941b.get(i2);
        long j = appBrandRecentTaskInfo.f239048o;
        long j2 = appBrandRecentTaskInfo2.f239048o;
        return appBrandRecentTaskInfo.f239036y == appBrandRecentTaskInfo2.f239036y && Util.nullAsNil(appBrandRecentTaskInfo.f239033v).equals(appBrandRecentTaskInfo2.f239033v) && Util.nullAsNil(appBrandRecentTaskInfo.f239032u).equals(appBrandRecentTaskInfo2.f239032u);
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        if (!this.f246940a.get(i).getClass().equals(this.f246941b.get(i2).getClass()) || !(this.f246940a.get(i) instanceof AppBrandRecentTaskInfo)) {
            return false;
        }
        AppBrandRecentTaskInfo appBrandRecentTaskInfo = (AppBrandRecentTaskInfo) this.f246940a.get(i);
        AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = (AppBrandRecentTaskInfo) this.f246941b.get(i2);
        return appBrandRecentTaskInfo.f239035x == appBrandRecentTaskInfo2.f239035x && appBrandRecentTaskInfo.f239031t.equals(appBrandRecentTaskInfo2.f239031t);
    }

    /* renamed from: c */
    public Object mo11467c(int i, int i2) {
        if (i >= this.f246940a.size()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (this.f246940a.get(i) instanceof AppBrandRecentTaskInfo) {
            AppBrandRecentTaskInfo appBrandRecentTaskInfo = (AppBrandRecentTaskInfo) this.f246940a.get(i);
            AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = (AppBrandRecentTaskInfo) this.f246941b.get(i2);
            boolean z = appBrandRecentTaskInfo.f239036y;
            boolean z2 = appBrandRecentTaskInfo2.f239036y;
            if (z != z2) {
                bundle.putBoolean("star", z2);
            }
            if (!Util.nullAsNil(appBrandRecentTaskInfo.f239033v).equals(Util.nullAsNil(appBrandRecentTaskInfo2.f239033v))) {
                bundle.putString("icon", appBrandRecentTaskInfo2.f239033v);
            }
            if (!Util.nullAsNil(appBrandRecentTaskInfo.f239032u).equals(Util.nullAsNil(appBrandRecentTaskInfo2.f239032u))) {
                bundle.putString("nick_name", appBrandRecentTaskInfo2.f239032u);
            }
            if (!Util.nullAsNil(appBrandRecentTaskInfo.f239051r).equals(Util.nullAsNil(appBrandRecentTaskInfo2.f239051r))) {
                bundle.putString("third_party_app_using_desc", appBrandRecentTaskInfo2.f239051r);
            }
        }
        if (bundle.size() <= 0) {
            return null;
        }
        return bundle;
    }
}

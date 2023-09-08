package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.j */
public enum C81583j {
    ;
    

    /* renamed from: d */
    public int f239252d;

    /* renamed from: e */
    public int f239253e;

    /* access modifiers changed from: public */
    C81583j(int i, int i2) {
        this.f239252d = i;
        this.f239253e = i2;
    }

    /* renamed from: a */
    public static String m100069a(List<AppBrandBackgroundRunningApp> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return String.format("%s %s", new Object[]{String.format(MMApplicationContext.getContext().getString(C0966R.string.f7630ly), new Object[]{list.get(0).f239211h}), MMApplicationContext.getContext().getString(C0966R.string.f7627lv)});
        }
        return String.format("%s %s", new Object[]{String.format(MMApplicationContext.getContext().getString(C0966R.string.f7629lx), new Object[]{Integer.valueOf(list.size())}), MMApplicationContext.getContext().getString(C0966R.string.f7627lv)});
    }

    /* renamed from: b */
    public static boolean m100070b(int i, int i2) {
        return (i & i2) > 0;
    }
}

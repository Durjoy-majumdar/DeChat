package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import kw0.C46746a;
import p248ug.C14184u0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.p */
public class C18466p {

    /* renamed from: a */
    public static final int f51246a = (C14184u0.m13519a() ? 20 : 12);

    /* renamed from: b */
    public static float f51247b = 4.5f;

    /* renamed from: c */
    public static int f51248c = 4;

    static {
        C43520v.C43521b bVar = C43520v.f117665a;
    }

    /* renamed from: a */
    public static int m19102a(Context context) {
        if (context == null) {
            return 0;
        }
        return (int) (((double) ((C46746a.f125826a.mo71973f(context) - C76577a.m92151b(context, 4)) * 2)) / ((Math.floor((double) f51247b) * 2.0d) + 1.0d));
    }

    /* renamed from: b */
    public static int m19103b(Context context, float f) {
        if (context == null) {
            return 0;
        }
        int c = m19104c(context);
        int f2 = C46746a.f125826a.mo71973f(context);
        int floor = (int) (((double) ((((float) f2) - (((float) c) * f)) * 2.0f)) / ((Math.floor((double) f) * 2.0d) + 1.0d));
        if (floor < 0) {
            floor = 0;
        }
        Log.m105925i("MicroMsg.BizTimeLineHotViewConfig", "alvinluo getItemPadding itemWidth: %d, itemPadding: %d, viewWidth: %d", Integer.valueOf(c), Integer.valueOf(floor), Integer.valueOf(f2));
        return floor;
    }

    /* renamed from: c */
    public static int m19104c(Context context) {
        if (context == null) {
            return 0;
        }
        int f = (int) (((float) C76577a.m92155f(context, C0966R.dimen.f4163up)) * m19105d(context));
        Log.m105919d("MicroMsg.BizTimeLineHotViewConfig", "alvinluo itemWidth: %d", Integer.valueOf(f));
        return f;
    }

    /* renamed from: d */
    public static float m19105d(Context context) {
        float p = C76577a.m92165p(context);
        return (p == C76577a.m92168s(context) || p == C76577a.m92169t(context) || p == C76577a.m92170u(context)) ? C76577a.m92167r(context) : p;
    }

    /* renamed from: e */
    public static void m19106e(Context context) {
        int f = C46746a.f125826a.mo71973f(context);
        int i = C74783i3.m89537a(context).f24705b;
        int i2 = 0;
        if (f > i) {
            int i3 = (int) ((((float) (f - i)) * 4.5f) / ((float) i));
            Log.m105925i("MicroMsg.BizTimeLineHotViewConfig", "init extraCount= %d", Integer.valueOf(i3));
            i2 = i3;
        }
        float f2 = (float) i2;
        float f3 = 4.5f + f2;
        if (m19103b(context, f3) <= C76577a.m92151b(context, 8)) {
            f51247b = f2 + 3.5f;
            f51248c = i2 + 3;
            return;
        }
        f51247b = f3;
        f51248c = i2 + 4;
    }
}

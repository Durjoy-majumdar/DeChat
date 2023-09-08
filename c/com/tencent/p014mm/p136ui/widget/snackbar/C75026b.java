package com.tencent.p014mm.p136ui.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;

/* renamed from: com.tencent.mm.ui.widget.snackbar.b */
public final class C75026b {

    /* renamed from: a */
    public static boolean f220750a;

    /* renamed from: a */
    public static void m89951a(Activity activity, String str) {
        C75018a.C75023c cVar = new C75018a.C75023c(activity);
        cVar.f220747c = str;
        cVar.f220749e = 1500;
        m89956f(cVar, (C75018a.C75024d) null, (C75018a.C75025e) null);
    }

    /* renamed from: b */
    public static void m89952b(Context context, View view, String str, C75018a.C75025e eVar) {
        C75018a.C75023c cVar = new C75018a.C75023c(context, view);
        cVar.f220747c = str;
        cVar.f220749e = 1500;
        if (eVar != null) {
            cVar.f220745a.f220738d = eVar;
        }
        cVar.mo104599a();
    }

    /* renamed from: c */
    public static void m89953c(Activity activity, String str, String str2, C75018a.C75024d dVar) {
        C75018a.C75023c cVar = new C75018a.C75023c(activity);
        cVar.f220747c = str;
        cVar.f220748d = str2;
        cVar.f220749e = 2500;
        m89956f(cVar, dVar, (C75018a.C75025e) null);
    }

    /* renamed from: d */
    public static void m89954d(Activity activity, String str, String str2, C75018a.C75024d dVar, C75018a.C75025e eVar) {
        C75018a.C75023c cVar = new C75018a.C75023c(activity);
        cVar.f220747c = str;
        cVar.f220748d = str2;
        cVar.f220749e = 2500;
        m89956f(cVar, dVar, eVar);
    }

    /* renamed from: e */
    public static void m89955e(Context context, View view, String str, String str2, C75018a.C75024d dVar, C75018a.C75025e eVar) {
        C75018a.C75023c cVar = new C75018a.C75023c(context, view);
        cVar.f220747c = str;
        cVar.f220748d = str2;
        cVar.f220749e = 2500;
        m89956f(cVar, dVar, eVar);
    }

    /* renamed from: f */
    public static void m89956f(C75018a.C75023c cVar, C75018a.C75024d dVar, C75018a.C75025e eVar) {
        if (dVar != null) {
            cVar.f220745a.f220737c = dVar;
        }
        if (eVar != null) {
            cVar.f220745a.f220738d = eVar;
        }
        cVar.mo104599a();
    }
}

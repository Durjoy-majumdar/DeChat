package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.content.Intent;
import gy3.C87412m;
import p33.C110152e;

/* renamed from: com.tencent.mm.plugin.voip.model.j0 */
public class C106352j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f317368d;

    /* renamed from: e */
    public final /* synthetic */ Intent f317369e;

    /* renamed from: f */
    public final /* synthetic */ long f317370f;

    /* renamed from: g */
    public final /* synthetic */ int f317371g;

    /* renamed from: h */
    public final /* synthetic */ boolean f317372h;

    /* renamed from: i */
    public final /* synthetic */ String f317373i;

    /* renamed from: j */
    public final /* synthetic */ C106350h0 f317374j;

    public C106352j0(C106350h0 h0Var, Context context, Intent intent, long j, int i, boolean z, String str) {
        this.f317374j = h0Var;
        this.f317368d = context;
        this.f317369e = intent;
        this.f317370f = j;
        this.f317371g = i;
        this.f317372h = z;
        this.f317373i = str;
    }

    public void run() {
        C110152e eVar = this.f317374j.f317355x;
        Context context = this.f317368d;
        Intent intent = this.f317369e;
        long j = this.f317370f;
        int i = this.f317371g;
        boolean z = this.f317372h;
        String str = this.f317373i;
        eVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "toUser");
        C110152e.m149748u(eVar, context, intent, j, i, z, str, false, 0, 192, (Object) null);
    }
}

package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zo0.C39418g;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.l */
public final class C29481l implements DebuggerShell.C81694b {

    /* renamed from: a */
    public final C13601g f80339a = C36568h.m40985a(C29482a.f80340d);

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.l$a */
    public static final class C29482a extends C87413o implements C32224a<C39418g> {

        /* renamed from: d */
        public static final C29482a f80340d = new C29482a();

        public C29482a() {
            super(0);
        }

        public Object invoke() {
            return new C39418g();
        }
    }

    /* renamed from: a */
    public void mo56728a(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("url")) != null) {
            ((C39418g) ((C36570n) this.f80339a).getValue()).mo125657b(MMApplicationContext.getContext(), stringExtra, 1011, new Bundle(), (Bundle) null);
        }
    }

    public String name() {
        return "MockScanCodeUrl";
    }
}

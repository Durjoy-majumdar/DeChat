package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import com.tencent.p014mm.p136ui.C7038w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import kr0.C88267e;
import p225rc.g$$f;
import rx3.C13603j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.z */
public final class C1836z implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C1791a0 f11641a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference<C88267e> f11642b;

    /* renamed from: c */
    public final /* synthetic */ int f11643c;

    public C1836z(C1791a0 a0Var, WeakReference<C88267e> weakReference, int i) {
        this.f11641a = a0Var;
        this.f11642b = weakReference;
        this.f11643c = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Object obj;
        String str;
        String str2;
        boolean z = false;
        if (this.f11641a.f11586g != i) {
            return false;
        }
        C88267e eVar = this.f11642b.get();
        if (eVar == null) {
            return true;
        }
        if (intent == null || (obj = intent.getSerializableExtra("key_result_pay_result")) == null) {
            obj = C7038w.FAIL;
        }
        C7038w wVar = (C7038w) obj;
        if (intent == null || (str = intent.getStringExtra("key_result_error_msg")) == null) {
            str = "";
        }
        Log.m105924i("JsApiRequestFaceToFacePayment", "[onResult] result=" + wVar + ", errorMsg" + str);
        int i3 = this.f11643c;
        C1791a0 a0Var = this.f11641a;
        int ordinal = wVar.ordinal();
        if (ordinal == 0) {
            str2 = "ok";
        } else if (ordinal == 1) {
            if (str.length() == 0) {
                z = true;
            }
            if (z) {
                str2 = "fail";
            } else {
                str2 = "fail:" + str;
            }
        } else if (ordinal == 2) {
            str2 = "cancel";
        } else {
            throw new C13603j();
        }
        eVar.mo109647a(i3, a0Var.mo115109j(str2));
        return true;
    }
}

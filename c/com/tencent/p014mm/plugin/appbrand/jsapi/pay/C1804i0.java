package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Intent;
import com.tencent.p014mm.p136ui.C7063x;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import kr0.C88267e;
import p225rc.g$$f;
import rx3.C13603j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.i0 */
public final class C1804i0 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C1807j0 f11600a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference<C88267e> f11601b;

    /* renamed from: c */
    public final /* synthetic */ int f11602c;

    public C1804i0(C1807j0 j0Var, WeakReference<C88267e> weakReference, int i) {
        this.f11600a = j0Var;
        this.f11601b = weakReference;
        this.f11602c = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        Object obj;
        String str;
        String str2;
        boolean z = false;
        if (this.f11600a.f11607g != i) {
            return false;
        }
        C88267e eVar = this.f11601b.get();
        if (eVar == null) {
            return true;
        }
        if (intent == null || (obj = intent.getSerializableExtra("key_result_pay_result")) == null) {
            obj = C7063x.FAIL;
        }
        C7063x xVar = (C7063x) obj;
        if (intent == null || (str = intent.getStringExtra("key_result_error_msg")) == null) {
            str = "";
        }
        Log.m105924i("JsApiRequestPersonalPay", "[onResult] result=" + xVar + ", errorMsg" + str);
        int i3 = this.f11602c;
        C1807j0 j0Var = this.f11600a;
        int ordinal = xVar.ordinal();
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
        eVar.mo109647a(i3, j0Var.mo115109j(str2));
        return true;
    }
}

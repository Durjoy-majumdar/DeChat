package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82976l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C7250m;
import eb0.C45628s0;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import java.util.List;
import p225rc.g$$f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.m0 */
public final class C82978m0 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C32226l<C82975k0, C13598b0> f242630a;

    /* renamed from: b */
    public final /* synthetic */ C82976l0.C29538a f242631b;

    /* renamed from: c */
    public final /* synthetic */ Activity f242632c;

    /* renamed from: d */
    public final /* synthetic */ String f242633d;

    /* renamed from: e */
    public final /* synthetic */ String f242634e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.m0$a */
    public static final class C82979a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C82975k0, C13598b0> f242635d;

        public C82979a(C32226l<? super C82975k0, C13598b0> lVar) {
            this.f242635d = lVar;
        }

        public final void run() {
            this.f242635d.invoke(C82975k0.SUCCESS);
        }
    }

    public C82978m0(C32226l<? super C82975k0, C13598b0> lVar, C82976l0.C29538a aVar, Activity activity, String str, String str2) {
        this.f242630a = lVar;
        this.f242631b = aVar;
        this.f242632c = activity;
        this.f242633d = str;
        this.f242634e = str2;
    }

    /* renamed from: b */
    public final boolean mo1596b(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        C82975k0 k0Var = C82975k0.FAIL;
        StringBuilder sb = new StringBuilder();
        sb.append("doShare, requestCode: ");
        sb.append(i3);
        sb.append(", resultCode: ");
        sb.append(i4);
        sb.append(", data exists: ");
        boolean z = false;
        sb.append(intent2 != null);
        Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", sb.toString());
        if (C82976l0.f242616a != i3) {
            return false;
        }
        if (i4 != -1) {
            if (intent2 != null && true == intent2.getBooleanExtra("finish_by_forward_to_wework", false)) {
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, share to wework");
                this.f242630a.invoke(C82975k0.SUCCESS);
                return true;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, cancel");
            this.f242630a.invoke(C82975k0.CANCEL);
            return true;
        } else if (intent2 == null) {
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since data is null");
            this.f242630a.invoke(k0Var);
            return true;
        } else {
            String stringExtra = intent2.getStringExtra("Select_Conv_User");
            Log.m105918d("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, selectedUsersStr: " + stringExtra);
            if (stringExtra == null || stringExtra.length() == 0) {
                Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since selectedUsers is empty 1");
                this.f242630a.invoke(k0Var);
                return true;
            }
            List<String> stringToList = Util.stringToList(stringExtra, ",");
            if (stringToList == null || stringToList.isEmpty()) {
                Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since selectedUsers is empty 2");
                this.f242630a.invoke(k0Var);
                return true;
            }
            String stringExtra2 = intent2.getStringExtra("custom_send_text");
            Log.m105918d("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, customSendText: " + stringExtra2);
            C82976l0.C29538a aVar = this.f242631b;
            C87412m.m108591d(aVar);
            int i5 = aVar.f80433a;
            int i6 = C82976l0.f242616a;
            Activity activity = this.f242632c;
            String str = this.f242633d;
            String str2 = this.f242634e;
            C87412m.m108593f(stringToList, "selectedUsers");
            C82979a aVar2 = new C82979a(this.f242630a);
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = stringToList.size();
            boolean z2 = true ^ (stringExtra2 == null || stringExtra2.length() == 0);
            for (String next : stringToList) {
                String str3 = next;
                C8478d0 d0Var2 = d0Var;
                C82979a aVar3 = aVar2;
                String str4 = str2;
                C7250m.m7431a().ze0(activity, next, str, str2, 1, i5, false, false, "", "", new C82984o0(next, d0Var, aVar2));
                if (z2) {
                    C7250m.m7431a().mo136257Tm(str3, stringExtra2, C45628s0.m50810y(str3), 0);
                }
                d0Var = d0Var2;
                aVar2 = aVar3;
                str2 = str4;
            }
            return true;
        }
    }
}

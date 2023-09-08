package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cc0.C92411b;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.LuggageStubUI;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import ke3.C88144b;
import org.json.JSONObject;
import p385u2.C111105a;
import p447aw.C103918d;
import p702ts.C78085c;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.a0 */
public class C115851a0 extends C5954n2<C43658n> {

    /* renamed from: q */
    public static final HashSet<String> f347580q;

    /* renamed from: e */
    public Context f347581e;

    /* renamed from: f */
    public C43620m2.C5947b f347582f;

    /* renamed from: g */
    public String f347583g;

    /* renamed from: h */
    public boolean f347584h = false;

    /* renamed from: i */
    public C92411b f347585i = null;

    /* renamed from: j */
    public C92411b.C0447b f347586j = null;

    /* renamed from: n */
    public MMHandler f347587n;

    /* renamed from: o */
    public boolean f347588o = false;

    /* renamed from: p */
    public BroadcastReceiver f347589p = new C115852a();

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.a0$a */
    public class C115852a extends BroadcastReceiver {
        public C115852a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "com.tencent.mm.ACTION_LOCATION_FROM_JSAPI".equals(intent.getAction()) && intent.getIntExtra("key_permission_request_code", 0) == 75) {
                int intExtra = intent.getIntExtra("key_result_code", 0);
                Log.m105919d("MicroMsg.JsApiGeoLocation", "locationReceiver, resultCode:%d", Integer.valueOf(intExtra));
                if (intExtra == -1) {
                    C115851a0 a0Var = C115851a0.this;
                    a0Var.mo176386f(a0Var.f347582f);
                    return;
                }
                C115851a0 a0Var2 = C115851a0.this;
                a0Var2.mo176387g(a0Var2.f347582f, "fail");
            }
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f347580q = hashSet;
        hashSet.add("gcj02");
        hashSet.add("wgs84");
    }

    /* renamed from: b */
    public String mo5382b() {
        return "geoLocation";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        this.f347581e = context;
        this.f347582f = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.ACTION_LOCATION_FROM_JSAPI");
        context.registerReceiver(this.f347589p, intentFilter, WeChatPermissions.PERMISSION_MM_MESSAGE(), (Handler) null);
        JSONObject e = C6013c.m5893e(str);
        if (e != null) {
            this.f347583g = e.optString("type");
        }
        boolean Lb0 = ((C103918d) C86312j.m106911c(C103918d.class)).Lb0(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean z = true;
        Log.m105925i("MicroMsg.JsApiGeoLocation", "location perm: %s", Boolean.valueOf(Lb0));
        if (!Lb0) {
            String[] strArr = {"android.permission.ACCESS_FINE_LOCATION"};
            int i = LuggageStubUI.f22080d;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 1; i2++) {
                String str2 = strArr[i2];
                if (C111105a.m151499a(context, str2) != 0) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() == 0) {
                z = false;
            } else {
                Intent intent = new Intent();
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra("key_action_code", 1);
                intent.putExtra("key_permission_types", (String[]) arrayList.toArray(new String[arrayList.size()]));
                intent.putExtra("key_permission_request_code", 75);
                C88144b.m109791i(context, "webview", ".luggage.LuggageStubUI", intent, (Bundle) null);
            }
            if (!z) {
                mo176387g(bVar, "fail");
                return;
            }
            return;
        }
        mo176386f(bVar);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }

    /* renamed from: f */
    public final void mo176386f(C43620m2.C5947b bVar) {
        Log.m105927v("MicroMsg.JsApiGeoLocation", "doGeoLocation, geoType = %s", this.f347583g);
        if (Util.isNullOrNil(this.f347583g) || f347580q.contains(this.f347583g)) {
            this.f347585i = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
            String str = this.f347583g;
            if (!this.f347588o) {
                Log.m105924i("MicroMsg.JsApiGeoLocation", "startGeoLocation");
                if (this.f347586j == null) {
                    this.f347586j = new C115853y(this, bVar, str);
                }
                if (this.f347587n == null) {
                    this.f347587n = new MMHandler(Looper.getMainLooper());
                }
                this.f347587n.postDelayed(new C115854z(this, bVar), 20000);
                if (Util.isNullOrNil(str) || str.equalsIgnoreCase("gcj02")) {
                    this.f347588o = true;
                    this.f347585i.mo126412f(this.f347586j, false);
                    C5139t.m5183e(22, 10);
                } else if (str.equalsIgnoreCase("wgs84")) {
                    this.f347588o = true;
                    this.f347585i.mo126407a(this.f347586j, false);
                    C5139t.m5183e(22, 10);
                } else {
                    Log.m105920e("MicroMsg.JsApiGeoLocation", "startGeoLocation, should not reach here !!!!!");
                    mo176387g(bVar, "fail_unsupported_type_startgeo");
                }
            }
        } else {
            Log.m105921e("MicroMsg.JsApiGeoLocation", "doGeoLocation fail, unsupported type = %s", this.f347583g);
            mo176387g(bVar, "unsupported_type");
        }
    }

    /* renamed from: g */
    public final synchronized void mo176387g(C43620m2.C5947b bVar, String str) {
        C92411b.C0447b bVar2;
        this.f347581e.unregisterReceiver(this.f347589p);
        C92411b bVar3 = this.f347585i;
        if (!(bVar3 == null || (bVar2 = this.f347586j) == null)) {
            bVar3.mo126408b(bVar2);
        }
        MMHandler mMHandler = this.f347587n;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        this.f347586j = null;
        if (!this.f347584h) {
            this.f347584h = true;
            bVar.mo6945a(str, (JSONObject) null);
        }
    }
}

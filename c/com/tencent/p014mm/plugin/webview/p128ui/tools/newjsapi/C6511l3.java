package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.l3 */
public final class C6511l3 extends C15053a {

    /* renamed from: d */
    public static final C6511l3 f23639d = new C6511l3();

    /* renamed from: e */
    public static final String f23640e = "MicroMsg.JsApiShowPickerView";

    /* renamed from: f */
    public static final int f23641f = 447;

    /* renamed from: g */
    public static final String f23642g = "showPickerView";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.l3$a */
    public static final class C6512a<T> implements C7045j.C7056k {

        /* renamed from: a */
        public final /* synthetic */ C7045j f23643a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23644b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f23645c;

        public C6512a(C7045j jVar, C13855j jVar2, C13851h1 h1Var) {
            this.f23643a = jVar;
            this.f23644b = jVar2;
            this.f23645c = h1Var;
        }

        public final void onResult(boolean z, Object obj, Object obj2) {
            this.f23643a.mo8101d();
            String str = C6511l3.f23640e;
            Log.m105924i(str, "picker set hasSetResult=" + z + ", result=" + obj);
            if (!z) {
                Log.m105924i(str, "picker set cancel");
                C13849g gVar = this.f23644b.f39001d;
                String str2 = this.f23645c.f38990c;
                gVar.mo10774a(str2, this.f23645c.f38996i + ":cancel", (Map<String, Object>) null);
                return;
            }
            HashMap hashMap = new HashMap();
            C87412m.m108593f(obj, "result");
            hashMap.put("value", obj);
            hashMap.put(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(this.f23643a.mo8099b()));
            C13849g gVar2 = this.f23644b.f39001d;
            String str3 = this.f23645c.f38990c;
            gVar2.mo10774a(str3, this.f23645c.f38996i + ":ok", hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("array");
        if (str == null || C112551y.m153811k(str)) {
            Log.m105924i(f23640e, "showPickerView array is null");
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + ":fail", (Map<String, Object>) null);
            return false;
        }
        Context context = jVar.f38998a;
        if (context == null || !(context instanceof Activity)) {
            Log.m105920e(f23640e, "context error!");
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar2.mo10774a(str3, h1Var.f38996i + ":fail, context error", (Map<String, Object>) null);
            return false;
        }
        try {
            int i = Util.getInt((String) h1Var.f38983a.get("current"), 0);
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                Log.m105924i(f23640e, "showPickerView as selector, empty range");
                C13849g gVar3 = jVar.f39001d;
                String str4 = h1Var.f38990c;
                gVar3.mo10774a(str4, h1Var.f38996i + "fail", (Map<String, Object>) null);
                return true;
            }
            String[] strArr = new String[jSONArray.length()];
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = jSONArray.getString(i2);
            }
            C7045j jVar2 = new C7045j(context, strArr);
            try {
                jVar2.mo8106i(i);
                jVar2.f24869t = new C6512a(jVar2, jVar, h1Var);
                Object obj = h1Var.f38983a.get("headerText");
                String str5 = obj instanceof String ? (String) obj : null;
                View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cpp, (ViewGroup) null);
                C87412m.m108593f(inflate, "from(context).inflate(R.…cker_header_layout, null)");
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.meo);
                if (!Util.isNullOrNil(str5)) {
                    textView.setVisibility(0);
                    textView.setText(str5);
                    jVar2.mo8104g(inflate);
                } else {
                    textView.setVisibility(8);
                }
                jVar2.mo8109l();
                return true;
            } catch (Exception e) {
                Log.m105920e(f23640e, e.getMessage());
                C13849g gVar4 = jVar.f39001d;
                String str6 = h1Var.f38990c;
                gVar4.mo10774a(str6, h1Var.f38996i + ":fail, index error", (Map<String, Object>) null);
                return false;
            }
        } catch (Exception e2) {
            Log.m105921e(f23640e, "showPickerView exp = %s", Util.stackTraceToString(e2));
            C13849g gVar5 = jVar.f39001d;
            String str7 = h1Var.f38990c;
            gVar5.mo10774a(str7, h1Var.f38996i + "fail", (Map<String, Object>) null);
            return false;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23641f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23642g;
    }
}

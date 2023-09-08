package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.p136ui.widget.picker.CustomOptionPickNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.FileUtils;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import sx3.C110823p;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f3 */
public final class C6432f3 extends C15053a {

    /* renamed from: d */
    public static final C6432f3 f23447d = new C6432f3();

    /* renamed from: e */
    public static final String f23448e = "MicroMsg.JsApiShowMultiPickerView";

    /* renamed from: f */
    public static final int f23449f = FileUtils.S_IRWXU;

    /* renamed from: g */
    public static final String f23450g = "showMultiPickerView";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f3$a */
    public static final class C6433a implements C7045j.C7054i {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23451a;

        public C6433a(C13855j jVar) {
            this.f23451a = jVar;
        }

        /* renamed from: a */
        public final void mo7435a(int i) {
            HashMap hashMap = new HashMap();
            hashMap.put("column", 0);
            hashMap.put("current", Integer.valueOf(i));
            C13849g gVar = this.f23451a.f39001d;
            C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((C48590l) gVar).mo8701f("onMultiPickerViewChange", hashMap);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f3$b */
    public static final class C6434b implements C7045j.C7057l {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23452a;

        public C6434b(C13855j jVar) {
            this.f23452a = jVar;
        }

        /* renamed from: a */
        public final void mo7436a(int i) {
            HashMap hashMap = new HashMap();
            hashMap.put("column", 1);
            hashMap.put("current", Integer.valueOf(i));
            C13849g gVar = this.f23452a.f39001d;
            C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((C48590l) gVar).mo8701f("onMultiPickerViewChange", hashMap);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f3$c */
    public static final class C6435c<T> implements C7045j.C7055j {

        /* renamed from: a */
        public final /* synthetic */ C7045j f23453a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23454b;

        /* renamed from: c */
        public final /* synthetic */ C13851h1 f23455c;

        public C6435c(C7045j jVar, C13855j jVar2, C13851h1 h1Var) {
            this.f23453a = jVar;
            this.f23454b = jVar2;
            this.f23455c = h1Var;
        }

        /* renamed from: a */
        public final void mo494a(boolean z, Object obj, Object obj2, Object obj3) {
            this.f23453a.mo8101d();
            if (!z) {
                C13849g gVar = this.f23454b.f39001d;
                String str = this.f23455c.f38990c;
                gVar.mo10774a(str, this.f23455c.f38996i + ":fail, cancel", (Map<String, Object>) null);
                return;
            }
            boolean z2 = obj instanceof String;
            if ((z2 || (obj2 instanceof String) || this.f23453a.mo8103f()) && (z2 || (obj2 instanceof String) || (obj3 instanceof String) || !this.f23453a.mo8103f())) {
                JSONArray jSONArray = new JSONArray();
                C7045j jVar = this.f23453a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONArray.put((String) obj);
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                jSONArray.put((String) obj2);
                if (jVar.mo8103f()) {
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
                    jSONArray.put((String) obj3);
                }
                JSONArray jSONArray2 = new JSONArray();
                C7045j jVar2 = this.f23453a;
                jSONArray2.put(jVar2.mo8099b());
                CustomOptionPickNew customOptionPickNew = jVar2.f24867r;
                int i = 0;
                jSONArray2.put(customOptionPickNew != null ? customOptionPickNew.getValue() : 0);
                if (jVar2.mo8103f()) {
                    CustomOptionPickNew customOptionPickNew2 = jVar2.f24868s;
                    if (customOptionPickNew2 != null) {
                        i = customOptionPickNew2.getValue();
                    }
                    jSONArray2.put(i);
                }
                HashMap hashMap = new HashMap(2);
                hashMap.put("current", jSONArray);
                hashMap.put("currentIndex", jSONArray2);
                C13849g gVar2 = this.f23454b.f39001d;
                String str2 = this.f23455c.f38990c;
                gVar2.mo10774a(str2, this.f23455c.f38996i + ":ok", hashMap);
                return;
            }
            C13849g gVar3 = this.f23454b.f39001d;
            String str3 = this.f23455c.f38990c;
            gVar3.mo10774a(str3, this.f23455c.f38996i + ":fail, result unknown error", (Map<String, Object>) null);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        ArrayList arrayList;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        Context context = jVar2.f38998a;
        if (!(context instanceof Activity) || !(jVar2.f39001d instanceof C48590l)) {
            Log.m105920e(f23448e, "context error!");
            jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail, context error", (Map<String, Object>) null);
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Object obj = ((HashMap) h1Var2.f38983a).get("array");
        Object obj2 = ((HashMap) h1Var2.f38983a).get("current");
        Object obj3 = ((HashMap) h1Var2.f38983a).get("headerText");
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (obj2 != null) {
            try {
                JSONArray jSONArray = new JSONArray(obj2.toString());
                int length = jSONArray.length();
                Integer[] numArr = new Integer[length];
                int i = 0;
                while (i < length) {
                    Object obj4 = jSONArray.get(i);
                    if (obj4 != null) {
                        numArr[i] = (Integer) obj4;
                        i++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                }
                arrayList3 = (ArrayList) C110823p.m151001a0(numArr);
            } catch (Exception e) {
                Log.m105920e(f23448e, e.getMessage());
                jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail, json parse error", (Map<String, Object>) null);
                return false;
            }
        }
        ArrayList arrayList4 = arrayList3;
        if (obj != null) {
            arrayList2 = new ArrayList();
            JSONArray jSONArray2 = new JSONArray(obj.toString());
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONArray optJSONArray = jSONArray2.optJSONArray(i2);
                C87412m.m108593f(optJSONArray, "jsonArray.optJSONArray(i)");
                int length3 = optJSONArray.length();
                String[] strArr = new String[length3];
                int i3 = 0;
                while (i3 < length3) {
                    Object obj5 = optJSONArray.get(i3);
                    if (obj5 != null) {
                        strArr[i3] = (String) obj5;
                        i3++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                arrayList2.add((ArrayList) C110823p.m151003c0(strArr));
            }
        }
        if (arrayList2.size() < 2 || arrayList2.size() > 3) {
            jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail, array size error!", (Map<String, Object>) null);
            return false;
        }
        Object obj6 = arrayList2.get(0);
        C87412m.m108593f(obj6, "optionList[0]");
        ArrayList arrayList5 = (ArrayList) obj6;
        ArrayList arrayList6 = new ArrayList();
        int size = ((ArrayList) arrayList2.get(0)).size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList6.add(arrayList2.get(1));
        }
        if (arrayList2.size() == 3) {
            ArrayList arrayList7 = new ArrayList();
            int size2 = ((ArrayList) arrayList2.get(0)).size() * ((ArrayList) arrayList2.get(1)).size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList7.add(arrayList2.get(2));
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        C7045j jVar3 = new C7045j(context, arrayList5, arrayList6, arrayList, true);
        C13849g gVar = jVar2.f39001d;
        C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((C48590l) gVar).f130020y.f39009a = jVar3;
        jVar3.f24854B = new C6433a(jVar2);
        jVar3.f24855C = new C6434b(jVar2);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cpp, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…cker_header_layout, null)");
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.meo);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.men);
        if (!Util.isNullOrNil(str)) {
            textView.setVisibility(0);
            textView.setText(str);
            if (!Util.isNullOrNil((String) null)) {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            } else {
                textView2.setVisibility(8);
            }
            jVar3.mo8104g(inflate);
        } else {
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        try {
            if (jVar3.mo8103f()) {
                Object obj7 = arrayList4.get(0);
                C87412m.m108593f(obj7, "currentList[0]");
                int intValue = ((Number) obj7).intValue();
                Object obj8 = arrayList4.get(1);
                C87412m.m108593f(obj8, "currentList[1]");
                int intValue2 = ((Number) obj8).intValue();
                Object obj9 = arrayList4.get(2);
                C87412m.m108593f(obj9, "currentList[2]");
                jVar3.mo8108k(intValue, intValue2, ((Number) obj9).intValue());
            } else {
                Object obj10 = arrayList4.get(0);
                C87412m.m108593f(obj10, "currentList[0]");
                int intValue3 = ((Number) obj10).intValue();
                Object obj11 = arrayList4.get(1);
                C87412m.m108593f(obj11, "currentList[1]");
                jVar3.mo8107j(intValue3, ((Number) obj11).intValue());
            }
            jVar3.f24870u = new C6435c(jVar3, jVar2, h1Var2);
            jVar3.mo8109l();
            return true;
        } catch (Exception e2) {
            Log.m105920e(f23448e, e2.getMessage());
            jVar2.f39001d.mo10774a(h1Var2.f38990c, h1Var2.f38996i + ":fail, index error", (Map<String, Object>) null);
            return false;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23449f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23450g;
    }
}

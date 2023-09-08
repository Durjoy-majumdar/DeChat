package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.p136ui.widget.picker.CustomOptionPickNew;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.m3 */
public final class C6519m3 extends C15053a {

    /* renamed from: d */
    public static final C6519m3 f23662d = new C6519m3();

    /* renamed from: e */
    public static final String f23663e = "MicroMsg.JsApiUpdateMultiPickerView";

    /* renamed from: f */
    public static final int f23664f = 449;

    /* renamed from: g */
    public static final String f23665g = "updateMultiPickerView";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String[] strArr;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (jVar.f38998a instanceof Activity) {
            C13849g gVar = jVar.f39001d;
            if (gVar instanceof C48590l) {
                C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                C7045j jVar2 = ((C48590l) gVar).f130020y.f39009a;
                if (jVar2 == null) {
                    Log.m105920e(f23663e, "picker is null");
                    jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail, picker view is null, please showMultiPicker firstly!", (Map<String, Object>) null);
                    return false;
                } else if (!jVar2.f24853A) {
                    Log.m105920e(f23663e, "picker.isDisableLink = false");
                    jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail, update mod is not support for link", (Map<String, Object>) null);
                    return false;
                } else {
                    int safeParseInt = Util.safeParseInt(String.valueOf(((HashMap) h1Var.f38983a).get("column")));
                    Object obj = ((HashMap) h1Var.f38983a).get("array");
                    int safeParseInt2 = Util.safeParseInt(String.valueOf(((HashMap) h1Var.f38983a).get("current")));
                    if (obj != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(obj.toString());
                            int length = jSONArray.length();
                            strArr = new String[length];
                            int i = 0;
                            while (i < length) {
                                Object obj2 = jSONArray.get(i);
                                if (obj2 != null) {
                                    strArr[i] = (String) obj2;
                                    i++;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        } catch (Exception e) {
                            Log.m105920e(f23663e, e.getMessage());
                            jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail, json parse error", (Map<String, Object>) null);
                            return false;
                        }
                    } else {
                        strArr = null;
                    }
                    if (safeParseInt == 0) {
                        CustomOptionPickNew customOptionPickNew = jVar2.f24866q;
                        if (customOptionPickNew != null) {
                            customOptionPickNew.setOptionsArray(strArr);
                        }
                        CustomOptionPickNew customOptionPickNew2 = jVar2.f24866q;
                        if (customOptionPickNew2 != null) {
                            customOptionPickNew2.setValue(safeParseInt2);
                            jVar2.f24866q.mo26473c(safeParseInt2);
                        }
                    } else if (safeParseInt == 1) {
                        CustomOptionPickNew customOptionPickNew3 = jVar2.f24867r;
                        if (customOptionPickNew3 != null) {
                            customOptionPickNew3.setOptionsArray(strArr);
                        }
                        CustomOptionPickNew customOptionPickNew4 = jVar2.f24867r;
                        if (customOptionPickNew4 != null) {
                            customOptionPickNew4.setValue(safeParseInt2);
                            jVar2.f24867r.mo26473c(safeParseInt2);
                        }
                    } else if (safeParseInt != 2) {
                        jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail, index error", (Map<String, Object>) null);
                    } else if (!jVar2.mo8103f()) {
                        jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail, index error", (Map<String, Object>) null);
                        return false;
                    } else {
                        CustomOptionPickNew customOptionPickNew5 = jVar2.f24868s;
                        if (customOptionPickNew5 != null) {
                            customOptionPickNew5.setOptionsArray(strArr);
                        }
                        CustomOptionPickNew customOptionPickNew6 = jVar2.f24868s;
                        if (customOptionPickNew6 != null) {
                            customOptionPickNew6.setValue(safeParseInt2);
                            jVar2.f24868s.mo26473c(safeParseInt2);
                        }
                    }
                    return true;
                }
            }
        }
        Log.m105920e(f23663e, "context error!");
        jVar.f39001d.mo10774a(h1Var.f38990c, h1Var.f38996i + ":fail, context error", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23664f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23665g;
    }
}

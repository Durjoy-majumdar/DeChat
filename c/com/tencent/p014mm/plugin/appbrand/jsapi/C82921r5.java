package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import java.util.HashMap;
import org.json.JSONObject;
import p823sg.C77710q;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r5 */
public class C82921r5 extends C82268c<C83928t1> {
    public static final int CTRL_INDEX = 66;
    public static final String NAME = "reportSubmitForm";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C83928t1 t1Var = (C83928t1) fVar;
        ReportSubmitFormTask reportSubmitFormTask = new ReportSubmitFormTask(t1Var.getRuntime().mo113213o1());
        reportSubmitFormTask.f108733f = 1;
        reportSubmitFormTask.f108735h = MD5Util.getMD5String(C90599h.m113514g(new String[]{t1Var.getAppId(), C77710q.m93738a(t1Var.getRuntime().mo113210l1().f234818T), "" + System.currentTimeMillis()}, '#'));
        reportSubmitFormTask.f108736i = t1Var.mo116163R0();
        reportSubmitFormTask.mo114395c();
        HashMap hashMap = new HashMap();
        hashMap.put("formId", reportSubmitFormTask.f108735h);
        C84072q1 a = C84072q1.m103586a(t1Var.getAppId());
        if (a != null) {
            a.f245457a = reportSubmitFormTask.f108735h;
        }
        t1Var.mo109647a(i, mo115112m("ok", hashMap));
    }
}

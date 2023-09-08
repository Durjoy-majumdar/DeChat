package com.tencent.p014mm.plugin.profile.p088ui.tab;

import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import p185kq.C10383h;
import q31.C118148a;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.i */
public class C42717i implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ ContactWidgetTabBizHeaderController f115685a;

    public C42717i(ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController) {
        this.f115685a = contactWidgetTabBizHeaderController;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        HashMap hashMap = new HashMap();
        hashMap.put("wx_username", this.f115685a.f115563q);
        hashMap.put("live_enter_status", 1);
        hashMap.put("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        hashMap.put("share_username", "");
        hashMap.put("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        hashMap.put("session_buffer", "");
        hashMap.put("finder_feed_export_id", ((C45696d) C86709a0.m107533q(C45696d.class)).mo71011q4(this.f115685a.f115563q));
        return hashMap;
    }
}

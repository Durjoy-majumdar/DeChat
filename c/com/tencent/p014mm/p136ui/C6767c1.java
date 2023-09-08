package com.tencent.p014mm.p136ui;

import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import p185kq.C10383h;
import q31.C118148a;

/* renamed from: com.tencent.mm.ui.c1 */
public class C6767c1 implements C118148a {
    public C6767c1(LiveBizSessionTipsBar liveBizSessionTipsBar) {
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        HashMap hashMap = new HashMap();
        hashMap.put("live_enter_status", 1);
        hashMap.put("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        hashMap.put("share_username", "");
        hashMap.put("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        hashMap.put("session_buffer", "");
        return hashMap;
    }
}

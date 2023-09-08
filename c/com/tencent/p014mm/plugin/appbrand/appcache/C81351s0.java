package com.tencent.p014mm.plugin.appbrand.appcache;

import ei0.C86518b;
import java.util.Collection;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.s0 */
public class C81351s0 implements m3$$b {

    /* renamed from: a */
    public final boolean f238825a;

    /* renamed from: b */
    public final /* synthetic */ Collection f238826b;

    /* renamed from: c */
    public final /* synthetic */ C81300o2 f238827c;

    public C81351s0(Collection collection, C81300o2 o2Var) {
        this.f238826b = collection;
        this.f238827c = o2Var;
        this.f238825a = collection != null && collection.contains(o2Var.f238726s);
    }

    /* renamed from: a */
    public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
        m3$$c m3__c = (m3$$c) obj;
        Collection collection = this.f238826b;
        if (collection != null && !collection.isEmpty()) {
            for (m3$$b a : this.f238826b) {
                a.mo113493a(str, aVar, m3__c);
            }
        }
        if (!this.f238825a) {
            this.f238827c.f238726s.mo113493a(str, aVar, m3__c);
        }
    }

    /* renamed from: b */
    public void mo113494b(Object obj) {
        WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
        Collection collection = this.f238826b;
        if (collection != null && !collection.isEmpty()) {
            for (m3$$b b : this.f238826b) {
                b.mo113494b(wxaPkgLoadProgress);
            }
        }
        if (!this.f238825a) {
            this.f238827c.f238726s.mo113494b(wxaPkgLoadProgress);
        }
    }
}

package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.l */
public interface C84153l extends C84148k {

    /* renamed from: a */
    public static final C84153l f245688a = new C84154a();

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.l$a */
    public class C84154a implements C84153l {
        /* renamed from: b */
        public void mo115885b(C90630c cVar) {
        }

        /* renamed from: h */
        public void mo115891h(C90630c cVar) {
        }

        /* renamed from: i */
        public boolean mo116806i(String str) {
            return false;
        }

        /* renamed from: m */
        public void mo115895m(C90630c cVar, C90630c cVar2, C83817h4 h4Var) {
        }

        /* renamed from: o */
        public C84155b mo116807o(C90630c cVar) {
            return null;
        }

        public C84155b peek() {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.l$b */
    public static class C84155b {

        /* renamed from: a */
        public int f245689a;

        /* renamed from: b */
        public String f245690b;

        /* renamed from: c */
        public C84157d f245691c;

        /* renamed from: d */
        public C84156c f245692d;

        public C84155b(C90630c cVar) {
            this.f245689a = cVar.hashCode();
            this.f245690b = cVar.mo116163R0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.l$c */
    public static class C84156c {

        /* renamed from: a */
        public String f245693a;

        public C84156c(String str) {
            this.f245693a = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.model.l$d */
    public static class C84157d {

        /* renamed from: a */
        public int f245694a;

        /* renamed from: b */
        public String f245695b;

        public C84157d(int i, String str) {
            this.f245694a = i;
            this.f245695b = str;
        }
    }

    /* renamed from: i */
    boolean mo116806i(String str);

    /* renamed from: o */
    C84155b mo116807o(C90630c cVar);

    C84155b peek();
}

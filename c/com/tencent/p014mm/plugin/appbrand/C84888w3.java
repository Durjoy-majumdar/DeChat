package com.tencent.p014mm.plugin.appbrand;

import fy3.C32226l;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.w3 */
public final class C84888w3 implements C85038x3 {

    /* renamed from: a */
    public final ConcurrentSkipListSet<C85038x3> f247412a = new ConcurrentSkipListSet<>(new C84889a(this));

    /* renamed from: b */
    public final AtomicBoolean f247413b = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.appbrand.w3$a */
    public class C84889a implements Comparator<C85038x3> {
        public C84889a(C84888w3 w3Var) {
        }

        public int compare(Object obj, Object obj2) {
            C85038x3 x3Var = (C85038x3) obj;
            C85038x3 x3Var2 = (C85038x3) obj2;
            if (x3Var == x3Var2) {
                return 0;
            }
            return x3Var.hashCode() - x3Var2.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.w3$b */
    public class C84890b implements C32226l<C85038x3, Void> {
        public C84890b(C84888w3 w3Var) {
        }

        public Object invoke(Object obj) {
            ((C85038x3) obj).mo117039b();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.w3$c */
    public class C84891c implements C32226l<C85038x3, Void> {
        public C84891c(C84888w3 w3Var) {
        }

        public Object invoke(Object obj) {
            ((C85038x3) obj).mo117041d();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.w3$d */
    public class C84892d implements C32226l<C85038x3, Void> {

        /* renamed from: d */
        public final /* synthetic */ String f247414d;

        public C84892d(C84888w3 w3Var, String str) {
            this.f247414d = str;
        }

        public Object invoke(Object obj) {
            ((C85038x3) obj).mo117038a(this.f247414d);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.w3$e */
    public class C84893e implements C32226l<C85038x3, Void> {
        public C84893e(C84888w3 w3Var) {
        }

        public Object invoke(Object obj) {
            ((C85038x3) obj).mo117040c();
            return null;
        }
    }

    /* renamed from: a */
    public void mo117038a(String str) {
        mo117637e(new C84892d(this, str));
    }

    /* renamed from: b */
    public void mo117039b() {
        mo117637e(new C84890b(this));
    }

    /* renamed from: c */
    public void mo117040c() {
        mo117637e(new C84893e(this));
    }

    /* renamed from: d */
    public void mo117041d() {
        mo117637e(new C84891c(this));
        this.f247413b.set(true);
        this.f247412a.clear();
    }

    /* renamed from: e */
    public final void mo117637e(C32226l<C85038x3, Void> lVar) {
        Iterator it = new LinkedList(this.f247412a).iterator();
        while (it.hasNext()) {
            lVar.invoke((C85038x3) it.next());
        }
    }
}

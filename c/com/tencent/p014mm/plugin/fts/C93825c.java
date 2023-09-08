package com.tencent.p014mm.plugin.fts;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kv1.C61173o;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;

/* renamed from: com.tencent.mm.plugin.fts.c */
public class C93825c extends C99664b implements Runnable {

    /* renamed from: j */
    public int f270787j;

    /* renamed from: n */
    public C76728k f270788n;

    /* renamed from: o */
    public WeakReference<C61173o> f270789o;

    /* renamed from: com.tencent.mm.plugin.fts.c$a */
    public class C93826a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10656l f270790d;

        public C93826a(C10656l lVar) {
            this.f270790d = lVar;
        }

        public void run() {
            C61173o oVar = C93825c.this.f270789o.get();
            if (oVar != null) {
                oVar.mo293H0(this.f270790d);
            }
        }
    }

    public C93825c(int i, C76728k kVar) {
        this.f270787j = i;
        this.f270788n = kVar;
        this.f270789o = new WeakReference<>(kVar.f224478m);
        this.f270788n.f224478m = null;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        int i = this.f270787j;
        if (i != -2 && i != -3) {
            return true;
        }
        C10656l lVar = new C10656l(this.f270788n);
        lVar.f32073b = this;
        lVar.f32074c = this.f270787j;
        lVar.f32076e = new LinkedList();
        lVar.f32075d = C99672i.m130094a(this.f270788n.f224468c, false);
        MMHandler mMHandler = this.f270788n.f224479n;
        if (mMHandler == null) {
            C61173o oVar = this.f270789o.get();
            if (oVar == null) {
                return true;
            }
            oVar.mo293H0(lVar);
            return true;
        }
        mMHandler.post(new C93826a(lVar));
        return true;
    }

    /* renamed from: d */
    public int mo128767d() {
        return 0;
    }

    /* renamed from: e */
    public int mo128768e() {
        return -1;
    }

    /* renamed from: g */
    public boolean mo128769g() {
        return false;
    }

    public void run() {
        try {
            mo57099b();
        } catch (Exception unused) {
        }
    }
}

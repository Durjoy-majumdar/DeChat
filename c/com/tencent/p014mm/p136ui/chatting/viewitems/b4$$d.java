package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.storage.C72963f4;
import java.lang.ref.WeakReference;
import s90.C77630j;
import wd3.C22906q;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4$$d */
public class b4$$d implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f56201a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference f56202b;

    /* renamed from: c */
    public final /* synthetic */ C77630j f56203c;

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f56204d;

    /* renamed from: e */
    public final /* synthetic */ int f56205e;

    /* renamed from: f */
    public final /* synthetic */ C19762b4 f56206f;

    public b4$$d(C19762b4 b4Var, WeakReference weakReference, WeakReference weakReference2, C77630j jVar, C72963f4 f4Var, int i) {
        this.f56206f = b4Var;
        this.f56201a = weakReference;
        this.f56202b = weakReference2;
        this.f56203c = jVar;
        this.f56204d = f4Var;
        this.f56205e = i;
    }

    public void onFinish() {
        if (this.f56201a.get() != null && this.f56202b.get() != null) {
            this.f56206f.mo26248x0((C19783t3) this.f56201a.get(), (C19781r3) this.f56202b.get(), this.f56203c, this.f56204d, this.f56205e, true);
        }
    }

    public void onStart() {
    }
}

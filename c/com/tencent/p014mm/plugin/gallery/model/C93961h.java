package com.tencent.p014mm.plugin.gallery.model;

import com.tencent.p014mm.plugin.gallery.model.C93947c;
import com.tencent.p014mm.plugin.gallery.model.C93974o;

/* renamed from: com.tencent.mm.plugin.gallery.model.h */
public class C93961h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C93947c.C93949b f271172d;

    /* renamed from: e */
    public final /* synthetic */ C93963i f271173e;

    /* renamed from: com.tencent.mm.plugin.gallery.model.h$a */
    public class C93962a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f271174d;

        public C93962a(boolean z) {
            this.f271174d = z;
        }

        public void run() {
            C93947c.C93949b bVar = C93961h.this.f271172d;
            boolean z = this.f271174d;
            C93947c.this.f271119g.remove(bVar);
            C93947c cVar = C93947c.this;
            cVar.f271117e++;
            cVar.mo128880h();
            if (z) {
                C93947c.this.f271113a.mo128886d(bVar.f271120d, bVar.f271126j, bVar.f271124h, (C93974o.C93980f) null, true, -1, bVar.f271127n);
            }
        }
    }

    public C93961h(C93963i iVar, C93947c.C93949b bVar) {
        this.f271173e = iVar;
        this.f271172d = bVar;
    }

    public void run() {
        this.f271173e.mo128893a().post(new C93962a(this.f271172d.doInBackground()));
    }
}

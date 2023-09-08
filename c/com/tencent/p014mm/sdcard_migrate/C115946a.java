package com.tencent.p014mm.sdcard_migrate;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.sdcard_migrate.a */
public final class C115946a {

    /* renamed from: a */
    public final List<C115948b> f347876a;

    /* renamed from: b */
    public int f347877b = 0;

    /* renamed from: c */
    public final C115947a f347878c = new C115947a();

    /* renamed from: com.tencent.mm.sdcard_migrate.a$a */
    public final class C115947a {
        public C115947a() {
        }

        /* renamed from: a */
        public void mo176539a() {
            synchronized (C115946a.this.f347876a) {
                C115946a aVar = C115946a.this;
                ArrayList arrayList = (ArrayList) aVar.f347876a;
                C115946a.this.f347877b++;
                ((C115948b) arrayList.get(aVar.f347877b)).mo176540a(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.a$b */
    public static abstract class C115948b {
        /* renamed from: a */
        public abstract void mo176540a(C115947a aVar);
    }

    public C115946a(C115948b bVar) {
        ArrayList arrayList = new ArrayList();
        this.f347876a = arrayList;
        arrayList.add(bVar);
    }
}

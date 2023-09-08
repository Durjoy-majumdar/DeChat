package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.bf */
public final class C113537bf {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C113709et> f339742a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final CopyOnWriteArrayList<C113709et> f339743b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final CopyOnWriteArrayList<C113709et> f339744c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private final C113536be f339745d;

    public C113537bf(C113536be beVar) {
        this.f339745d = beVar;
    }

    /* renamed from: a */
    private void m155966a(C113709et etVar) {
        synchronized (this.f339742a) {
            if (!this.f339742a.contains(etVar)) {
                this.f339742a.add(etVar);
            }
        }
    }

    /* renamed from: b */
    private void m155967b(C113709et etVar) {
        if (etVar != null) {
            synchronized (this.f339742a) {
                this.f339742a.remove(etVar);
                this.f339743b.add(etVar);
            }
        }
    }

    /* renamed from: a */
    private void m155965a() {
        int f;
        synchronized (this.f339742a) {
            ArrayList arrayList = new ArrayList();
            int size = this.f339743b.size();
            for (int i = 0; i < size; i++) {
                C113709et etVar = this.f339743b.get(i);
                if ((etVar instanceof C114108qh) && (f = ((C114108qh) etVar).mo172014f()) >= 0) {
                    arrayList.add(Integer.valueOf(f));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            this.f339745d.mo171638f().mo172922a(iArr, size2);
            this.f339743b.clear();
        }
    }

    /* renamed from: a */
    public final boolean mo171648a(float f, float f2) {
        synchronized (this.f339742a) {
            for (int size = this.f339742a.size() - 1; size >= 0; size--) {
                C113709et etVar = this.f339742a.get(size);
                if (etVar != null && etVar.onTap(f, f2)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo171649a(GL10 gl10) {
        int f;
        synchronized (this.f339742a) {
            ArrayList arrayList = new ArrayList();
            int size = this.f339743b.size();
            for (int i = 0; i < size; i++) {
                C113709et etVar = this.f339743b.get(i);
                if ((etVar instanceof C114108qh) && (f = ((C114108qh) etVar).mo172014f()) >= 0) {
                    arrayList.add(Integer.valueOf(f));
                }
            }
            int size2 = arrayList.size();
            int[] iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            this.f339745d.mo171638f().mo172922a(iArr, size2);
            this.f339743b.clear();
        }
        this.f339744c.clear();
        synchronized (this.f339742a) {
            this.f339744c.addAll(this.f339742a);
        }
        Iterator<C113709et> it = this.f339744c.iterator();
        while (it.hasNext()) {
            it.next().mo171427a(gl10);
        }
        return true;
    }
}

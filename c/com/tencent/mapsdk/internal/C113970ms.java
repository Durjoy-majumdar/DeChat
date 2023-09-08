package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113973mu;

/* renamed from: com.tencent.mapsdk.internal.ms */
public abstract class C113970ms<T extends C113973mu> {

    /* renamed from: a */
    public int f340953a;

    /* renamed from: b */
    public long f340954b;

    /* renamed from: c */
    public C113971mt<T> f340955c;

    /* renamed from: d */
    public T f340956d;

    public C113970ms(C113971mt<T> mtVar, T t) {
        this.f340955c = mtVar;
        this.f340956d = t;
    }

    /* renamed from: c */
    private T mo172532c() {
        return this.f340956d;
    }

    /* renamed from: a */
    public final void mo172478a(T t) {
        C113971mt<T> mtVar = this.f340955c;
        if (mtVar != null && t != null) {
            this.f340956d = t;
            mtVar.mo172487a((C113970ms<T>) this);
        }
    }

    /* renamed from: b */
    public final int mo172479b() {
        return this.f340953a;
    }

    /* renamed from: e_ */
    public final long mo172480e_() {
        return this.f340954b;
    }

    public String getId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f340953a);
        return sb.toString();
    }

    public void remove() {
        C113971mt<T> mtVar = this.f340955c;
        if (mtVar != null) {
            mtVar.mo172490b((C113970ms<T>) this);
        }
    }

    /* renamed from: a */
    public void mo172477a(long j) {
        this.f340954b = j;
    }
}

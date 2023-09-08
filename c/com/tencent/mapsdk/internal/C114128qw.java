package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.qw */
public final class C114128qw implements Comparable<C114128qw> {

    /* renamed from: a */
    public final int f341611a;

    /* renamed from: b */
    public final int f341612b;

    /* renamed from: c */
    public final int f341613c;

    public C114128qw(int i, int i2, int i3) {
        this.f341611a = i;
        this.f341612b = i2;
        this.f341613c = i3;
    }

    /* renamed from: a */
    private int m159255a(C114128qw qwVar) {
        return this.f341611a - qwVar.f341611a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f341611a - ((C114128qw) obj).f341611a;
    }
}

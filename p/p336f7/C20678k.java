package p336f7;

import p333e8.C20528a;

/* renamed from: f7.k */
public final class C20678k {

    /* renamed from: a */
    public final int f58421a;

    /* renamed from: b */
    public final long[] f58422b;

    /* renamed from: c */
    public final int[] f58423c;

    /* renamed from: d */
    public final int f58424d;

    /* renamed from: e */
    public final long[] f58425e;

    /* renamed from: f */
    public final int[] f58426f;

    public C20678k(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        C20528a.m22237a(iArr.length == jArr2.length);
        C20528a.m22237a(jArr.length == jArr2.length);
        C20528a.m22237a(iArr2.length != jArr2.length ? false : z);
        this.f58422b = jArr;
        this.f58423c = iArr;
        this.f58424d = i;
        this.f58425e = jArr2;
        this.f58426f = iArr2;
        this.f58421a = jArr.length;
    }
}

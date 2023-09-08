package cm1;

import gy3.C87412m;
import jq3.C9493c;
import te3.C50581nr0;
import tf1.C13914m;

/* renamed from: cm1.y */
public final class C0793y implements C9493c, C13914m {

    /* renamed from: d */
    public C50581nr0 f1851d;

    /* renamed from: e */
    public boolean f1852e;

    /* renamed from: f */
    public boolean f1853f;

    public C0793y(C50581nr0 nr02) {
        C87412m.m108594g(nr02, "likeObj");
        this.f1851d = nr02;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        long j = this.f1851d.f138726f;
        return (long) ((int) (j ^ (j >>> 32)));
    }
}

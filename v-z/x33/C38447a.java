package x33;

import gy3.C87412m;

/* renamed from: x33.a */
public final class C38447a {

    /* renamed from: a */
    public boolean f101406a;

    /* renamed from: b */
    public boolean f101407b;

    /* renamed from: c */
    public boolean f101408c;

    /* renamed from: d */
    public boolean f101409d;

    /* renamed from: e */
    public boolean f101410e;

    /* renamed from: f */
    public boolean f101411f;

    /* renamed from: g */
    public boolean f101412g;

    public C38447a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f101406a = z;
        this.f101407b = z2;
        this.f101408c = z3;
        this.f101409d = z4;
        this.f101410e = z5;
        this.f101411f = z6;
        this.f101412g = z7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f101407b ? 1 : 2);
        sb.append('#');
        sb.append(this.f101408c ? 3 : 4);
        sb.append('#');
        if (this.f101406a) {
            sb.append(this.f101409d ? 5 : 6);
            sb.append('#');
            sb.append(this.f101410e ? 7 : 8);
            sb.append('#');
            sb.append(this.f101411f ? 9 : 10);
            sb.append('#');
        }
        sb.append(this.f101412g ? 14 : 13);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}

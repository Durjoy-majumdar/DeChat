package jh1;

import cm1.C0740i2;
import gy3.C87412m;
import te3.C52172yv;
import tf1.C13914m;

/* renamed from: jh1.z */
public final class C9433z implements C0740i2 {

    /* renamed from: d */
    public final C52172yv f29454d;

    /* renamed from: e */
    public boolean f29455e;

    /* renamed from: f */
    public boolean f29456f;

    /* renamed from: g */
    public long f29457g;

    /* renamed from: h */
    public final String f29458h;

    public C9433z(C52172yv yvVar) {
        C87412m.m108594g(yvVar, "choice");
        this.f29454d = yvVar;
        this.f29455e = yvVar.f145529f > 0;
        StringBuilder sb = new StringBuilder();
        String str = yvVar.f145531h;
        String str2 = "";
        sb.append(str == null ? str2 : str);
        sb.append(". ");
        String str3 = yvVar.f145528e;
        sb.append(str3 != null ? str3 : str2);
        this.f29458h = sb.toString();
    }

    /* renamed from: c */
    public int mo75c() {
        return C9433z.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return -1;
    }

    public long getItemId() {
        return (long) this.f29454d.f145527d;
    }
}

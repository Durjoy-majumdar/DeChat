package j24;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import com.tencent.xweb.file.XVFSFile;
import e24.C20509c;
import o24.C21769k;

/* renamed from: j24.c */
public final class C21157c {

    /* renamed from: d */
    public static final C21769k f59810d;

    /* renamed from: e */
    public static final C21769k f59811e;

    /* renamed from: f */
    public static final C21769k f59812f;

    /* renamed from: g */
    public static final C21769k f59813g;

    /* renamed from: h */
    public static final C21769k f59814h;

    /* renamed from: i */
    public static final C21769k f59815i;

    /* renamed from: a */
    public final C21769k f59816a;

    /* renamed from: b */
    public final C21769k f59817b;

    /* renamed from: c */
    public final int f59818c;

    static {
        C21769k.C21770a aVar = C21769k.f61697h;
        f59810d = aVar.mo34164a(XVFSFile.PATH_SEPARATOR);
        f59811e = aVar.mo34164a(":status");
        f59812f = aVar.mo34164a(":method");
        f59813g = aVar.mo34164a(":path");
        f59814h = aVar.mo34164a(":scheme");
        f59815i = aVar.mo34164a(":authority");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21157c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            o24.k$a r0 = o24.C21769k.f61697h
            o24.k r2 = r0.mo34164a(r2)
            o24.k r3 = r0.mo34164a(r3)
            r1.<init>((o24.C21769k) r2, (o24.C21769k) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j24.C21157c.<init>(java.lang.String, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C21157c)) {
            return false;
        }
        C21157c cVar = (C21157c) obj;
        return this.f59816a.equals(cVar.f59816a) && this.f59817b.equals(cVar.f59817b);
    }

    public int hashCode() {
        return ((C1883v2.CTRL_INDEX + this.f59816a.hashCode()) * 31) + this.f59817b.hashCode();
    }

    public String toString() {
        return C20509c.m22204j("%s: %s", this.f59816a.mo34163n(), this.f59817b.mo34163n());
    }

    public C21157c(C21769k kVar, String str) {
        this(kVar, C21769k.f61697h.mo34164a(str));
    }

    public C21157c(C21769k kVar, C21769k kVar2) {
        this.f59816a = kVar;
        this.f59817b = kVar2;
        this.f59818c = kVar.mo34085f() + 32 + kVar2.mo34085f();
    }
}

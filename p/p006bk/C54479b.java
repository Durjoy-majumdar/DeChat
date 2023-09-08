package p006bk;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001ak.C54053a;
import p001ak.C54055c;
import p464ck.C54866a;
import p464ck.C54868e;
import p848dk.C58299d;

/* renamed from: bk.b */
public class C54479b {

    /* renamed from: i */
    public static C54486i f152738i;

    /* renamed from: j */
    public static C54055c f152739j;

    /* renamed from: a */
    public final C58299d<Drawable> f152740a;

    /* renamed from: b */
    public final SparseArray<C54484g> f152741b = new SparseArray<>();

    /* renamed from: c */
    public C54483e f152742c;

    /* renamed from: d */
    public C54482d f152743d;

    /* renamed from: e */
    public C54481c f152744e;

    /* renamed from: f */
    public List<C54866a> f152745f;

    /* renamed from: g */
    public C54868e f152746g = new C54868e();

    /* renamed from: h */
    public int f152747h;

    /* renamed from: bk.b$a */
    public static final class C54480a {

        /* renamed from: a */
        public C54483e f152748a;

        /* renamed from: b */
        public C54482d f152749b;

        /* renamed from: c */
        public List<C54866a> f152750c = new ArrayList();

        /* renamed from: d */
        public C54481c f152751d;

        /* renamed from: e */
        public int f152752e = 1;

        public C54480a(C54478a aVar) {
        }
    }

    public C54479b(C54480a aVar, C54478a aVar2) {
        aVar.getClass();
        this.f152742c = aVar.f152748a;
        this.f152743d = aVar.f152749b;
        this.f152744e = aVar.f152751d;
        this.f152747h = aVar.f152752e;
        this.f152740a = new C58299d<>();
        ArrayList arrayList = new ArrayList();
        this.f152745f = arrayList;
        arrayList.addAll(aVar.f152750c);
        if (this.f152742c == null) {
            throw new IllegalArgumentException("Danmaku module need an IDanmakuPlayTimeSupplier or is live setter for computing timeline");
        }
    }

    /* renamed from: c */
    public static C54486i m61196c() {
        if (f152738i == null) {
            synchronized (C54479b.class) {
                C54486i iVar = f152738i;
            }
        }
        if (f152738i == null) {
            f152738i = new C54486i();
        }
        return f152738i;
    }

    /* renamed from: a */
    public C54866a mo75305a(C54053a aVar) {
        C54866a aVar2;
        Iterator it = ((ArrayList) this.f152745f).iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (C54866a) it.next();
            if (aVar2.mo75810a(aVar)) {
                break;
            }
        }
        return aVar2 == null ? this.f152746g : aVar2;
    }

    /* renamed from: b */
    public C54484g mo75306b(int i) {
        Class<C54479b> cls = C54479b.class;
        C54484g gVar = this.f152741b.get(i);
        if (gVar == null) {
            synchronized (cls) {
                gVar = this.f152741b.get(i);
            }
        }
        if (gVar != null) {
            return gVar;
        }
        if (f152739j == null) {
            synchronized (cls) {
                if (f152739j == null) {
                    f152739j = new C54055c();
                }
            }
        }
        return f152739j;
    }
}

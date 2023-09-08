package b71;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jp3.C9486a;
import jp3.C9487b;
import nr3.C89059e;
import o40.C61926c;
import pe3.C89349b;
import rh3.C101380d;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C101814mn2;
import te3.C51193s22;
import te3.C64529ln2;
import te3.C64613on2;
import th3.C101893b;
import vh3.C102191c;
import vh3.C102193e;
import vh3.C102196g;
import vh3.C102198h;
import vh3.C102200j;
import vh3.C102201k;
import vh3.C52915b;

/* renamed from: b71.j */
public final class C92200j {

    /* renamed from: p */
    public static final C92201a f263887p = new C92201a((C8480h) null);

    /* renamed from: q */
    public static final C101814mn2 f263888q = new C101814mn2();

    /* renamed from: r */
    public static final C101814mn2 f263889r = new C101814mn2();

    /* renamed from: s */
    public static final C101814mn2 f263890s = new C101814mn2();

    /* renamed from: t */
    public static final C101814mn2 f263891t = new C101814mn2();

    /* renamed from: u */
    public static final C101814mn2 f263892u = new C101814mn2();

    /* renamed from: v */
    public static final C101814mn2 f263893v = new C101814mn2();

    /* renamed from: a */
    public final C9487b<C9486a> f263894a;

    /* renamed from: b */
    public final C92192d f263895b;

    /* renamed from: c */
    public final int f263896c = 2;

    /* renamed from: d */
    public byte[] f263897d;

    /* renamed from: e */
    public boolean f263898e = true;

    /* renamed from: f */
    public boolean f263899f;

    /* renamed from: g */
    public boolean f263900g = true;

    /* renamed from: h */
    public boolean f263901h;

    /* renamed from: i */
    public boolean f263902i;

    /* renamed from: j */
    public byte[] f263903j;

    /* renamed from: k */
    public int f263904k = 1;

    /* renamed from: l */
    public final LinkedList<C101814mn2> f263905l = new LinkedList<>();

    /* renamed from: m */
    public final LinkedList<C101814mn2> f263906m = new LinkedList<>();

    /* renamed from: n */
    public final LinkedList<C101814mn2> f263907n = new LinkedList<>();

    /* renamed from: o */
    public final LinkedList<C101814mn2> f263908o = new LinkedList<>();

    /* renamed from: b71.j$a */
    public static final class C92201a {
        public C92201a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo126169a(C101814mn2 mn22) {
            C87412m.m108594g(mn22, "lensInfo");
            if (!Util.isNullOrNil(mn22.f298862d)) {
                C64529ln2 ln22 = mn22.f298863e;
                String str = null;
                if (!Util.isNullOrNil(ln22 != null ? ln22.f184127d : null)) {
                    C64613on2 on22 = mn22.f298866h;
                    if (on22 != null) {
                        str = on22.f184679d;
                    }
                    if (!Util.isNullOrNil(str)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: b71.j$b */
    public static final class C92202b implements C102191c {

        /* renamed from: a */
        public final /* synthetic */ C92200j f263909a;

        public C92202b(C92200j jVar) {
            this.f263909a = jVar;
        }

        /* renamed from: a */
        public void mo125818a(int i, C101814mn2 mn22) {
            Log.m105924i("MicroMsg.StickerPanelData", "getLensInfo onResult: " + mn22);
            if (mn22 != null) {
                this.f263909a.f263906m.add(mn22);
                this.f263909a.mo126167d();
            }
        }
    }

    /* renamed from: b71.j$c */
    public static final class C92203c implements C102198h {

        /* renamed from: a */
        public final /* synthetic */ C92200j f263910a;

        public C92203c(C92200j jVar) {
            this.f263910a = jVar;
        }

        /* renamed from: a */
        public void mo126170a(int i, int i2, C51193s22 s222) {
            C92200j jVar = this.f263910a;
            boolean z = false;
            jVar.f263899f = false;
            byte[] bArr = null;
            if (i == 4 && i2 == jVar.f263896c && s222 != null) {
                C89349b bVar = s222.f141281d;
                if (bVar != null) {
                    bArr = bVar.f257327a;
                }
                jVar.f263897d = bArr;
                if (bArr != null) {
                    if (!(bArr.length == 0)) {
                        z = true;
                    }
                }
                jVar.f263898e = z;
                LinkedList<C101814mn2> linkedList = s222.f141282e;
                C87412m.m108593f(linkedList, "response.LensList");
                C61926c.m72668M(new C92206l(jVar, linkedList));
            } else if (i == 0 && i2 == 0 && s222 != null) {
                jVar.f263898e = false;
                C89349b bVar2 = s222.f141281d;
                if (bVar2 != null) {
                    bArr = bVar2.f257327a;
                }
                jVar.f263897d = bArr;
                LinkedList<C101814mn2> linkedList2 = s222.f141282e;
                C87412m.m108593f(linkedList2, "response.LensList");
                C61926c.m72668M(new C92206l(jVar, linkedList2));
            } else {
                C61926c.m72668M(new C92206l(jVar, C64186f0.f181907d));
            }
            Log.m105924i("MicroMsg.StickerPanelData", "getLensList onResult: " + this.f263910a.f263899f + ", " + this.f263910a.f263898e);
        }
    }

    /* renamed from: b71.j$d */
    public static final class C92204d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92200j f263911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92204d(C92200j jVar) {
            super(0);
            this.f263911d = jVar;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.StickerPanelData", "processRecommend: " + this.f263911d.f263905l.size() + ", " + this.f263911d.f263901h);
            LinkedList linkedList = new LinkedList();
            int i = 0;
            if (this.f263911d.f263905l.size() > 0) {
                linkedList.add(C92200j.f263888q);
                linkedList.addAll(this.f263911d.f263905l);
                C92200j jVar = this.f263911d;
                for (C101814mn2 mn22 : jVar.f263906m) {
                    Iterator<C101814mn2> it = jVar.f263905l.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (C87412m.m108589b(it.next().f298862d, mn22.f298862d)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 < 0) {
                        Log.m105924i("MicroMsg.StickerPanelData", "processRecommend: append");
                        linkedList.add(mn22);
                    }
                }
                C92200j jVar2 = this.f263911d;
                if (jVar2.f263901h || jVar2.f263898e) {
                    linkedList.add(C92200j.f263889r);
                } else {
                    linkedList.add(C92200j.f263890s);
                }
            }
            C92192d dVar = this.f263911d.f263895b;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (Object next : linkedList) {
                int i3 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C101380d((C101814mn2) next, i, 1));
                    i = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            dVar.mo126162a(arrayList);
            return C13598b0.f38549a;
        }
    }

    public C92200j(C9487b<C9486a> bVar, C92192d dVar) {
        C87412m.m108594g(bVar, "lifeCycleKeeper");
        C87412m.m108594g(dVar, "callback");
        this.f263894a = bVar;
        this.f263895b = dVar;
    }

    /* renamed from: a */
    public final void mo126164a(C101814mn2 mn22) {
        T t;
        T t2;
        C87412m.m108594g(mn22, "info");
        Iterator<T> it = this.f263905l.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (C87412m.m108589b(((C101814mn2) t2).f298862d, mn22.f298862d)) {
                break;
            }
        }
        C101814mn2 mn23 = (C101814mn2) t2;
        Iterator<T> it4 = this.f263906m.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (C87412m.m108589b(((C101814mn2) next).f298862d, mn22.f298862d)) {
                t = next;
                break;
            }
        }
        C101814mn2 mn24 = (C101814mn2) t;
        if (mn23 != null) {
            if (mn24 == null) {
                this.f263906m.add(mn23);
            }
        } else if (mn24 == null) {
            String str = mn22.f298862d;
            if (str == null || f263887p.mo126169a(mn22)) {
                this.f263906m.add(mn22);
            } else {
                C9487b<C9486a> bVar = this.f263894a;
                C92202b bVar2 = new C92202b(this);
                if (MMApplicationContext.isMainProcess()) {
                    new C102193e(bVar, str, bVar2);
                } else {
                    new C102196g(bVar, str, bVar2);
                }
            }
        }
        mo126167d();
    }

    /* renamed from: b */
    public final void mo126165b() {
        Log.m105924i("MicroMsg.StickerPanelData", "loadMore: " + this.f263899f + ", " + this.f263898e);
        if (this.f263898e && !this.f263899f) {
            this.f263899f = true;
            int i = this.f263904k;
            byte[] bArr = this.f263897d;
            byte[] bArr2 = this.f263903j;
            C9487b<C9486a> bVar = this.f263894a;
            C92203c cVar = new C92203c(this);
            if (MMApplicationContext.isMainProcess()) {
                C89059e i2 = new C52915b(i, bArr, bArr2).mo9225i();
                i2.mo123419C(new C102200j(cVar));
                if (bVar != null) {
                    i2.mo11397F(bVar);
                    return;
                }
                return;
            }
            new C102201k(i, bArr, bArr2, bVar, cVar);
        }
    }

    /* renamed from: c */
    public final void mo126166c() {
        Log.m105924i("MicroMsg.StickerPanelData", "processMore: " + this.f263907n.size() + ", " + this.f263908o.size());
        LinkedList linkedList = new LinkedList();
        int i = 0;
        if (this.f263907n.size() > 0) {
            linkedList.add(new C101380d(f263891t, 0, 0, 6, (C8480h) null));
            LinkedList<C101814mn2> linkedList2 = this.f263907n;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
            int i2 = 0;
            for (T next : linkedList2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList.add(new C101380d((C101814mn2) next, i3, 2));
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            linkedList.addAll(arrayList);
            linkedList.add(new C101380d(f263892u, 0, 0, 6, (C8480h) null));
        }
        if (this.f263908o.size() > 0) {
            linkedList.add(new C101380d(f263893v, 0, 0, 6, (C8480h) null));
            LinkedList<C101814mn2> linkedList3 = this.f263908o;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList3, 10));
            for (T next2 : linkedList3) {
                int i4 = i + 1;
                if (i >= 0) {
                    arrayList2.add(new C101380d((C101814mn2) next2, i4, 3));
                    i = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            linkedList.addAll(arrayList2);
        }
        this.f263895b.mo126163b(linkedList);
    }

    /* renamed from: d */
    public final void mo126167d() {
        C61926c.m72668M(new C92204d(this));
    }

    /* renamed from: e */
    public final void mo126168e() {
        this.f263907n.clear();
        LinkedList<C101814mn2> linkedList = this.f263907n;
        C101893b bVar = C101893b.f300042a;
        LinkedList<C101814mn2> linkedList2 = C101893b.f300047f.f138692d;
        C87412m.m108593f(linkedList2, "historyList.lensInfoList");
        linkedList.addAll(linkedList2);
        Log.m105924i("MicroMsg.StickerPanelData", "updateHistory: " + this.f263907n.size());
        mo126166c();
    }
}

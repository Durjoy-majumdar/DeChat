package com.tencent.p014mm.plugin.fts.p059ui;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C21461d;
import lv1.C99664b;
import lv1.C99681n;
import ov1.C21890b;
import ov1.C21891f;
import pv1.C22019b;
import xv1.C23128k;
import xv1.C23134n;

/* renamed from: com.tencent.mm.plugin.fts.ui.a */
public abstract class C18842a extends C21890b implements C61173o {

    /* renamed from: g */
    public long f52837g;

    /* renamed from: h */
    public String f52838h;

    /* renamed from: i */
    public C99664b f52839i;

    /* renamed from: j */
    public List<C21891f.C21892a> f52840j = Collections.synchronizedList(new LinkedList());

    /* renamed from: n */
    public HashSet<String> f52841n = new HashSet<>();

    public C18842a(Context context, C21891f.C21893b bVar, int i) {
        super(context, bVar, i);
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        int i = lVar.f32074c;
        if (i == -3 || i == -2 || i == -1) {
            Log.m105925i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", Integer.valueOf(getType()), Integer.valueOf(lVar.f32074c), lVar.f32072a.f224468c);
            if (!lVar.f32072a.f224468c.equals(this.f52838h)) {
                Log.m105924i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
            } else {
                this.f61901d.mo23811a(this, lVar.f32072a.f224468c, false);
            }
        } else if (i == 0) {
            Log.m105925i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", Integer.valueOf(getType()), Integer.valueOf(lVar.f32076e.size()));
            String str = this.f52838h;
            if (str == null || !str.equals(lVar.f32072a.f224468c)) {
                Log.m105925i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", lVar.f32072a.f224468c, this.f52838h);
                return;
            }
            this.f52837g = System.currentTimeMillis();
            HashSet<String> hashSet = lVar.f32072a.f224475j;
            this.f52841n = hashSet;
            mo17713s(lVar, hashSet);
            this.f61901d.mo23811a(this, lVar.f32072a.f224468c, true);
        }
    }

    /* renamed from: a */
    public long mo17719a() {
        return this.f52837g;
    }

    /* renamed from: c */
    public LinkedList<Integer> mo17720c() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int size = this.f52840j.size();
        for (int i = 0; i < size; i++) {
            C21891f.C21892a aVar = this.f52840j.get(i);
            int i2 = aVar.f61904a;
            if (i2 != Integer.MAX_VALUE && aVar.f61905b) {
                linkedList.add(Integer.valueOf(i2));
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public int mo17721d(int i) {
        int size = this.f52840j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C21891f.C21892a aVar = this.f52840j.get(i2);
            aVar.f61904a = i;
            if (aVar.f61905b) {
                i++;
            }
            i += aVar.f61909f.size() + aVar.f61913j;
            aVar.f61906c = i;
            if (aVar.f61907d) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public void mo17722e() {
        if (this.f52839i != null) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f52839i);
            this.f52839i = null;
        }
    }

    /* renamed from: f */
    public C22019b mo17723f(int i) {
        int size = this.f52840j.size();
        int i2 = 0;
        while (true) {
            C22019b bVar = null;
            if (i2 >= size) {
                return null;
            }
            C21891f.C21892a aVar = this.f52840j.get(i2);
            if (aVar.f61904a != i || !aVar.f61905b) {
                int i3 = aVar.f61906c;
                if (i3 == i && aVar.f61907d) {
                    bVar = mo17729n(i, aVar);
                } else if (i <= i3) {
                    bVar = mo17711o(i, aVar);
                }
            } else {
                bVar = mo17716m(i, aVar);
            }
            if (bVar != null) {
                if (bVar.f62324b == aVar.f61906c) {
                    bVar.f62326d = false;
                }
                bVar.f62330h = this.f61903f;
                bVar.f62327e = aVar.f61910g;
                bVar.f62329g = aVar.f61908e;
                return bVar;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public int mo17724g() {
        return mo23810r();
    }

    /* renamed from: h */
    public void mo17725h(String str, MMHandler mMHandler, HashSet<String> hashSet, long j) {
        mo17722e();
        mo17727l();
        this.f52838h = str;
        this.f52839i = mo17712q(mMHandler, hashSet);
    }

    /* renamed from: i */
    public List<C21461d> mo17726i(long j) {
        ArrayList arrayList = new ArrayList();
        if (this.f52837g > 0) {
            for (int i = 0; i < this.f52840j.size(); i++) {
                C21891f.C21892a aVar = this.f52840j.get(i);
                int size = aVar.f61909f.size() + aVar.f61913j;
                for (int i2 = 0; i2 < size; i2++) {
                    C21461d k = mo17714k(i2, j, aVar);
                    if (k != null) {
                        k.f60764f = this.f52837g - j;
                        if (aVar.f61905b) {
                            k.f60760b = aVar.f61904a + i2 + 1;
                        } else {
                            k.f60760b = aVar.f61904a + i2;
                        }
                        k.f60762d = 1;
                        k.f60759a = i2;
                        k.f60770l = C18843b0.m19714a(aVar.f61909f.get(i2).f292148b, aVar.f61909f.get(i2).f292149c, aVar.f61909f.get(i2).f292165s);
                        arrayList.add(k);
                    }
                }
                if (aVar.f61907d) {
                    C21461d dVar = new C21461d();
                    dVar.f60765g = String.valueOf(aVar.hashCode());
                    dVar.f60762d = 2;
                    dVar.f60759a = size;
                    int i3 = aVar.f61908e;
                    if (i3 == -3) {
                        dVar.f60761c = 4;
                    } else if (i3 == -4) {
                        dVar.f60761c = 3;
                    } else if (i3 == -1) {
                        dVar.f60761c = 12;
                    } else if (i3 == -2) {
                        dVar.f60761c = 11;
                    } else if (i3 == -6) {
                        dVar.f60761c = 10;
                    } else if (i3 == -13) {
                        dVar.f60761c = 19;
                    } else if (i3 == -7) {
                        dVar.f60761c = 5;
                    } else if (i3 == -23) {
                        dVar.f60761c = 31;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.f60764f = this.f52837g - j;
                        dVar.f60760b = aVar.f61906c;
                        arrayList.add(dVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public C21461d mo17714k(int i, long j, C21891f.C21892a aVar) {
        return null;
    }

    /* renamed from: l */
    public void mo17727l() {
        this.f52838h = null;
        this.f52841n.clear();
        this.f52840j.clear();
    }

    /* renamed from: m */
    public C23128k mo17716m(int i, C21891f.C21892a aVar) {
        return new C23128k(i);
    }

    /* renamed from: n */
    public C23134n mo17729n(int i, C21891f.C21892a aVar) {
        C23134n nVar = new C23134n(i);
        nVar.f62332j = aVar.f61906c - aVar.f61904a;
        nVar.f62337o = true;
        return nVar;
    }

    /* renamed from: o */
    public abstract C22019b mo17711o(int i, C21891f.C21892a aVar);

    /* renamed from: p */
    public C22019b mo17715p(int i, int i2, C99681n nVar, C21891f.C21892a aVar) {
        return null;
    }

    /* renamed from: q */
    public abstract C99664b mo17712q(MMHandler mMHandler, HashSet<String> hashSet);

    /* renamed from: r */
    public int mo23810r() {
        int size = this.f52840j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            for (C99681n nVar : this.f52840j.get(i2).f61909f) {
                String nullAs = Util.nullAs(nVar.f292151e, "");
                nullAs.getClass();
                char c = 65535;
                switch (nullAs.hashCode()) {
                    case -19329355:
                        if (nullAs.equals("create_chatroom​")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 255180560:
                        if (nullAs.equals("no_result​")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 541269703:
                        if (nullAs.equals("create_talker_message​")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    default:
                        i++;
                        break;
                }
            }
        }
        return i;
    }

    /* renamed from: s */
    public abstract void mo17713s(C10656l lVar, HashSet<String> hashSet);
}

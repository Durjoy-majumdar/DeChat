package p631o1;

import java.util.LinkedHashMap;
import p410k0.C108793e;
import p631o1.C109888w0;
import p658q1.C110301j;
import p658q1.C110310r;

/* renamed from: o1.v */
public final class C109885v implements C109888w0.C109889a {

    /* renamed from: a */
    public final /* synthetic */ C109874t f328831a;

    /* renamed from: b */
    public final /* synthetic */ Object f328832b;

    public C109885v(C109874t tVar, Object obj) {
        this.f328831a = tVar;
        this.f328832b = obj;
    }

    /* renamed from: a */
    public void mo161193a(int i, long j) {
        C110301j jVar = (C110301j) ((LinkedHashMap) this.f328831a.f328804h).get(this.f328832b);
        if (jVar != null && jVar.mo161701A()) {
            int i2 = jVar.mo161726u().f325786f;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + i2 + ')');
            } else if (!jVar.f329887A) {
                C110301j jVar2 = this.f328831a.f328797a;
                jVar2.f329922q = true;
                C110310r.m150081a(jVar).mo144686p((C110301j) jVar.mo161726u().f325784d[i], j);
                jVar2.f329922q = false;
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    /* renamed from: b */
    public int mo161194b() {
        C108793e<C110301j> u;
        C110301j jVar = (C110301j) ((LinkedHashMap) this.f328831a.f328804h).get(this.f328832b);
        if (jVar == null || (u = jVar.mo161726u()) == null) {
            return 0;
        }
        return u.f325786f;
    }

    public void dispose() {
        this.f328831a.mo161189b();
        C110301j remove = this.f328831a.f328804h.remove(this.f328832b);
        if (remove != null) {
            C109874t tVar = this.f328831a;
            if (tVar.f328807k > 0) {
                int indexOf = ((C108793e.C108794a) tVar.f328797a.mo161722r()).indexOf(remove);
                int i = ((C108793e.C108794a) this.f328831a.f328797a.mo161722r()).f325787d.f325786f;
                C109874t tVar2 = this.f328831a;
                int i2 = tVar2.f328807k;
                if (indexOf >= i - i2) {
                    tVar2.f328806j++;
                    tVar2.f328807k = i2 - 1;
                    int i3 = ((C108793e.C108794a) tVar2.f328797a.mo161722r()).f325787d.f325786f;
                    C109874t tVar3 = this.f328831a;
                    int i4 = (i3 - tVar3.f328807k) - tVar3.f328806j;
                    C110301j jVar = tVar3.f328797a;
                    jVar.f329922q = true;
                    jVar.mo161705E(indexOf, i4, 1);
                    jVar.f329922q = false;
                    this.f328831a.mo161188a(i4);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}

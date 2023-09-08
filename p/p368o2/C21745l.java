package p368o2;

import com.tencent.xweb.file.XVFSFile;
import p363n2.C21589e;
import p363n2.C21593h;
import p368o2.C21735e;

/* renamed from: o2.l */
public class C21745l extends C21747n {

    /* renamed from: c */
    public C21735e f61650c;

    /* renamed from: d */
    public C21745l f61651d;

    /* renamed from: e */
    public float f61652e;

    /* renamed from: f */
    public C21745l f61653f;

    /* renamed from: g */
    public float f61654g;

    /* renamed from: h */
    public int f61655h = 0;

    /* renamed from: i */
    public C21745l f61656i;

    /* renamed from: j */
    public C21746m f61657j = null;

    /* renamed from: k */
    public int f61658k = 1;

    /* renamed from: l */
    public C21746m f61659l = null;

    public C21745l(C21735e eVar) {
        this.f61650c = eVar;
    }

    /* renamed from: e */
    public void mo34067e() {
        int i;
        C21745l lVar;
        C21745l lVar2;
        C21745l lVar3;
        C21745l lVar4;
        C21745l lVar5;
        C21745l lVar6;
        float f;
        float f2;
        C21745l lVar7;
        boolean z = true;
        if (this.f61662b != 1 && (i = this.f61655h) != 4) {
            C21746m mVar = this.f61657j;
            if (mVar != null) {
                if (mVar.f61662b == 1) {
                    this.f61652e = ((float) this.f61658k) * mVar.f61660c;
                } else {
                    return;
                }
            }
            C21746m mVar2 = this.f61659l;
            if (mVar2 != null) {
                if (mVar2.f61662b == 1) {
                    float f3 = mVar2.f61660c;
                } else {
                    return;
                }
            }
            if (i == 1 && ((lVar7 = this.f61651d) == null || lVar7.f61662b == 1)) {
                if (lVar7 == null) {
                    this.f61653f = this;
                    this.f61654g = this.f61652e;
                } else {
                    this.f61653f = lVar7.f61653f;
                    this.f61654g = lVar7.f61654g + this.f61652e;
                }
                mo34079b();
            } else if (i == 2 && (lVar4 = this.f61651d) != null && lVar4.f61662b == 1 && (lVar5 = this.f61656i) != null && (lVar6 = lVar5.f61651d) != null && lVar6.f61662b == 1) {
                this.f61653f = lVar4.f61653f;
                lVar5.f61653f = lVar6.f61653f;
                C21735e eVar = this.f61650c;
                C21735e.C21737b bVar = eVar.f61532c;
                C21735e.C21737b bVar2 = C21735e.C21737b.RIGHT;
                int i2 = 0;
                if (!(bVar == bVar2 || bVar == C21735e.C21737b.BOTTOM)) {
                    z = false;
                }
                float f4 = z ? lVar4.f61654g - lVar6.f61654g : lVar6.f61654g - lVar4.f61654g;
                if (bVar == C21735e.C21737b.LEFT || bVar == bVar2) {
                    f = f4 - ((float) eVar.f61531b.mo34049q());
                    f2 = this.f61650c.f61531b.f61572V;
                } else {
                    f = f4 - ((float) eVar.f61531b.mo34043k());
                    f2 = this.f61650c.f61531b.f61573W;
                }
                int b = this.f61650c.mo34025b();
                int b2 = this.f61656i.f61650c.mo34025b();
                C21735e eVar2 = this.f61650c.f61533d;
                C21745l lVar8 = this.f61656i;
                if (eVar2 == lVar8.f61650c.f61533d) {
                    f2 = 0.5f;
                    b2 = 0;
                } else {
                    i2 = b;
                }
                float f5 = (float) i2;
                float f6 = (float) b2;
                float f7 = (f - f5) - f6;
                if (z) {
                    lVar8.f61654g = lVar8.f61651d.f61654g + f6 + (f7 * f2);
                    this.f61654g = (this.f61651d.f61654g - f5) - (f7 * (1.0f - f2));
                } else {
                    this.f61654g = this.f61651d.f61654g + f5 + (f7 * f2);
                    lVar8.f61654g = (lVar8.f61651d.f61654g - f6) - (f7 * (1.0f - f2));
                }
                mo34079b();
                this.f61656i.mo34079b();
            } else if (i == 3 && (lVar = this.f61651d) != null && lVar.f61662b == 1 && (lVar2 = this.f61656i) != null && (lVar3 = lVar2.f61651d) != null && lVar3.f61662b == 1) {
                this.f61653f = lVar.f61653f;
                lVar2.f61653f = lVar3.f61653f;
                this.f61654g = lVar.f61654g + this.f61652e;
                lVar2.f61654g = lVar3.f61654g + lVar2.f61652e;
                mo34079b();
                this.f61656i.mo34079b();
            } else if (i == 5) {
                this.f61650c.f61531b.mo34023x();
            }
        }
    }

    /* renamed from: f */
    public void mo34068f(C21589e eVar) {
        C21593h hVar = this.f61650c.f61538i;
        C21745l lVar = this.f61653f;
        if (lVar == null) {
            eVar.mo33838e(hVar, (int) (this.f61654g + 0.5f));
        } else {
            eVar.mo33837d(hVar, eVar.mo33843j(lVar.f61650c), (int) (this.f61654g + 0.5f), 6);
        }
    }

    /* renamed from: g */
    public void mo34069g(int i, C21745l lVar, int i2) {
        this.f61655h = i;
        this.f61651d = lVar;
        this.f61652e = (float) i2;
        lVar.mo34078a(this);
    }

    /* renamed from: h */
    public void mo34070h(C21745l lVar, int i) {
        this.f61651d = lVar;
        this.f61652e = (float) i;
        lVar.mo34078a(this);
    }

    /* renamed from: i */
    public void mo34071i(C21745l lVar, int i, C21746m mVar) {
        this.f61651d = lVar;
        lVar.mo34078a(this);
        this.f61657j = mVar;
        this.f61658k = i;
        mVar.mo34078a(this);
    }

    /* renamed from: j */
    public void mo34072j() {
        this.f61662b = 0;
        this.f61661a.clear();
        this.f61651d = null;
        this.f61652e = 0.0f;
        this.f61657j = null;
        this.f61658k = 1;
        this.f61659l = null;
        this.f61653f = null;
        this.f61654g = 0.0f;
        this.f61656i = null;
        this.f61655h = 0;
    }

    /* renamed from: k */
    public void mo34073k(C21745l lVar, float f) {
        int i = this.f61662b;
        if (i == 0 || !(this.f61653f == lVar || this.f61654g == f)) {
            this.f61653f = lVar;
            this.f61654g = f;
            if (i == 1) {
                mo34080c();
            }
            mo34079b();
        }
    }

    /* renamed from: l */
    public String mo34074l(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public String toString() {
        if (this.f61662b != 1) {
            return "{ " + this.f61650c + " UNRESOLVED} type: " + mo34074l(this.f61655h);
        } else if (this.f61653f == this) {
            return "[" + this.f61650c + ", RESOLVED: " + this.f61654g + "]  type: " + mo34074l(this.f61655h);
        } else {
            return "[" + this.f61650c + ", RESOLVED: " + this.f61653f + XVFSFile.PATH_SEPARATOR + this.f61654g + "] type: " + mo34074l(this.f61655h);
        }
    }
}

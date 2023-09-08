package r14;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import l14.C24951b;
import l14.C24954f;
import n14.C25205c;
import n14.C25207d;
import n14.C25217e;
import n14.C25223i;
import o14.C25345b;
import o14.C25348d;
import p14.C25421b;
import q14.C25537a;
import q14.C25540f;
import q14.C25541i;
import s14.C26160b;

/* renamed from: r14.l */
public final class C26105l extends C25345b implements C25540f {

    /* renamed from: a */
    public final C26160b f72975a;

    /* renamed from: b */
    public final C26096c f72976b;

    /* renamed from: c */
    public boolean f72977c;

    /* renamed from: d */
    public boolean f72978d;

    /* renamed from: e */
    public final C26106a f72979e;

    /* renamed from: f */
    public final C25537a f72980f;

    /* renamed from: g */
    public final C26107n f72981g;

    /* renamed from: h */
    public final C25540f[] f72982h;

    /* renamed from: r14.l$a */
    public static final class C26106a {

        /* renamed from: a */
        public int f72983a;

        /* renamed from: b */
        public boolean f72984b = true;

        /* renamed from: c */
        public final StringBuilder f72985c;

        /* renamed from: d */
        public final C25537a f72986d;

        public C26106a(StringBuilder sb, C25537a aVar) {
            C87412m.m108594g(sb, "sb");
            C87412m.m108594g(aVar, "json");
            this.f72985c = sb;
            this.f72986d = aVar;
        }

        /* renamed from: a */
        public final void mo52969a() {
            this.f72984b = false;
            if (this.f72986d.f72231a.f72941e) {
                this.f72985c.append("\n");
                int i = this.f72983a;
                for (int i2 = 0; i2 < i; i2++) {
                    String str = this.f72986d.f72231a.f72942f;
                    C87412m.m108594g(str, "v");
                    this.f72985c.append(str);
                }
            }
        }

        /* renamed from: b */
        public final StringBuilder mo52970b(char c) {
            StringBuilder sb = this.f72985c;
            sb.append(c);
            return sb;
        }

        /* renamed from: c */
        public final void mo52971c() {
            if (this.f72986d.f72231a.f72941e) {
                mo52970b(' ');
            }
        }
    }

    public C26105l(C26106a aVar, C25537a aVar2, C26107n nVar, C25540f[] fVarArr) {
        C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMPOSER);
        C87412m.m108594g(aVar2, "json");
        C87412m.m108594g(nVar, "mode");
        C87412m.m108594g(fVarArr, "modeReuseCache");
        this.f72979e = aVar;
        this.f72980f = aVar2;
        this.f72981g = nVar;
        this.f72982h = fVarArr;
        C26096c cVar = aVar2.f72231a;
        this.f72975a = cVar.f72947k;
        this.f72976b = cVar;
        int ordinal = nVar.ordinal();
        C25540f fVar = fVarArr[ordinal];
        if (fVar != null || fVar != this) {
            fVarArr[ordinal] = this;
        }
    }

    /* renamed from: a */
    public void mo52513a(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        if (this.f72981g.f72995g != 0) {
            C26106a aVar = this.f72979e;
            aVar.f72983a--;
            aVar.mo52969a();
            this.f72979e.mo52970b(this.f72981g.f72995g);
        }
    }

    /* renamed from: b */
    public C25348d mo52523b(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        C26107n a = C26108o.m33516a(this.f72980f, eVar);
        char c = a.f72994f;
        if (c != 0) {
            this.f72979e.mo52970b(c);
            C26106a aVar = this.f72979e;
            aVar.f72984b = true;
            aVar.f72983a++;
        }
        if (this.f72978d) {
            this.f72978d = false;
            this.f72979e.mo52969a();
            encodeString(this.f72976b.f72945i);
            this.f72979e.mo52970b(XVFSFile.PATH_SEPARATOR_CHAR);
            this.f72979e.mo52971c();
            encodeString(eVar.mo52328j());
        }
        if (this.f72981g == a) {
            return this;
        }
        C25540f fVar = this.f72982h[a.ordinal()];
        return fVar != null ? fVar : new C26105l(this.f72979e, this.f72980f, a, this.f72982h);
    }

    /* renamed from: c */
    public C26160b mo52524c() {
        return this.f72975a;
    }

    /* renamed from: d */
    public boolean mo52514d(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        return this.f72976b.f72937a;
    }

    /* renamed from: e */
    public void mo52525e(short s) {
        if (this.f72977c) {
            encodeString(String.valueOf(s));
        } else {
            this.f72979e.f72985c.append(Short.valueOf(s));
        }
    }

    public void encodeString(String str) {
        C87412m.m108594g(str, "value");
        C26106a aVar = this.f72979e;
        aVar.getClass();
        C89864m.m112379a(aVar.f72985c, str);
    }

    /* renamed from: f */
    public void mo52526f(boolean z) {
        if (this.f72977c) {
            encodeString(String.valueOf(z));
        } else {
            this.f72979e.f72985c.append(z);
        }
    }

    /* renamed from: g */
    public void mo52501g(int i) {
        if (this.f72977c) {
            encodeString(String.valueOf(i));
        } else {
            this.f72979e.f72985c.append(i);
        }
    }

    /* renamed from: i */
    public void mo52527i(long j) {
        if (this.f72977c) {
            encodeString(String.valueOf(j));
        } else {
            this.f72979e.f72985c.append(j);
        }
    }

    /* renamed from: j */
    public void mo52528j(char c) {
        encodeString(String.valueOf(c));
    }

    /* renamed from: l */
    public void mo52529l(byte b) {
        if (this.f72977c) {
            encodeString(String.valueOf(b));
        } else {
            this.f72979e.f72985c.append(Byte.valueOf(b));
        }
    }

    /* renamed from: m */
    public C25348d mo52530m(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        return mo52968v(eVar, i, new C24951b[0]);
    }

    /* renamed from: n */
    public void mo52531n(float f) {
        if (this.f72977c) {
            encodeString(String.valueOf(f));
        } else {
            this.f72979e.f72985c.append(f);
        }
        if (!this.f72976b.f72946j) {
            if (!(!Float.isInfinite(f) && !Float.isNaN(f))) {
                Float valueOf = Float.valueOf(f);
                String sb = this.f72979e.f72985c.toString();
                C87412m.m108593f(sb, "composer.sb.toString()");
                throw C25541i.m33033a(valueOf, "float", sb);
            }
        }
    }

    /* renamed from: p */
    public void mo52532p(double d) {
        if (this.f72977c) {
            encodeString(String.valueOf(d));
        } else {
            this.f72979e.f72985c.append(d);
        }
        if (!this.f72976b.f72946j) {
            if (!(!Double.isInfinite(d) && !Double.isNaN(d))) {
                Double valueOf = Double.valueOf(d);
                String sb = this.f72979e.f72985c.toString();
                C87412m.m108593f(sb, "composer.sb.toString()");
                throw C25541i.m33033a(valueOf, "double", sb);
            }
        }
    }

    /* renamed from: r */
    public void mo52533r() {
        C26106a aVar = this.f72979e;
        aVar.getClass();
        aVar.f72985c.append("null");
    }

    /* renamed from: s */
    public void mo52534s() {
    }

    /* renamed from: t */
    public <T> void mo52506t(C24954f<? super T> fVar, T t) {
        C87412m.m108594g(fVar, "serializer");
        if (!(fVar instanceof C25421b) || this.f72980f.f72231a.f72944h) {
            fVar.mo51999b(this, t);
            return;
        }
        C25421b bVar = (C25421b) fVar;
        if (t != null) {
            C24954f g = bVar.mo52660g(this, t);
            String str = this.f72980f.f72231a.f72945i;
            C25223i f = g.mo51996a().mo52323f();
            C87412m.m108594g(f, "kind");
            if (f instanceof C25223i.C25225b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            } else if (f instanceof C25207d) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
            } else if (!(f instanceof C25205c)) {
                this.f72978d = true;
                g.mo51999b(this, t);
            } else {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
    }

    /* renamed from: u */
    public boolean mo52507u(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        int ordinal = this.f72981g.ordinal();
        if (ordinal != 1) {
            boolean z = false;
            if (ordinal == 2) {
                C26106a aVar = this.f72979e;
                if (!aVar.f72984b) {
                    if (i % 2 == 0) {
                        aVar.mo52970b(',');
                        this.f72979e.mo52969a();
                        z = true;
                    } else {
                        aVar.mo52970b(XVFSFile.PATH_SEPARATOR_CHAR);
                        this.f72979e.mo52971c();
                    }
                    this.f72977c = z;
                } else {
                    this.f72977c = true;
                    aVar.mo52969a();
                }
            } else if (ordinal != 3) {
                C26106a aVar2 = this.f72979e;
                if (!aVar2.f72984b) {
                    aVar2.mo52970b(',');
                }
                this.f72979e.mo52969a();
                encodeString(eVar.mo52327i(i));
                this.f72979e.mo52970b(XVFSFile.PATH_SEPARATOR_CHAR);
                this.f72979e.mo52971c();
            } else {
                if (i == 0) {
                    this.f72977c = true;
                }
                if (i == 1) {
                    this.f72979e.mo52970b(',');
                    this.f72979e.mo52971c();
                    this.f72977c = false;
                }
            }
        } else {
            C26106a aVar3 = this.f72979e;
            if (!aVar3.f72984b) {
                aVar3.mo52970b(',');
            }
            this.f72979e.mo52969a();
        }
        return true;
    }

    /* renamed from: v */
    public C25348d mo52968v(C25217e eVar, int i, C24951b<?>... bVarArr) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(bVarArr, "typeSerializers");
        return mo52523b(eVar);
    }
}

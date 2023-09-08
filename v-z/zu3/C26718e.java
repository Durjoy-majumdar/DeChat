package zu3;

import pu3.C25470e;
import pu3.C25488j;
import pu3.C25491m;
import pu3.C25492n;
import pu3.C25494p;
import ru3.C26117b;

/* renamed from: zu3.e */
public abstract class C26718e {

    /* renamed from: zu3.e$a */
    public final class C26719a {

        /* renamed from: a */
        public final C26117b f74270a;

        public C26719a(C26117b bVar) {
            this.f74270a = bVar;
        }

        /* renamed from: a */
        public void mo53713a(C25492n nVar) {
            int b = nVar.mo52751b();
            int i = 0;
            if (b == 0) {
                C26117b bVar = this.f74270a;
                nVar.mo52750a(0);
                nVar.f72141b = -1;
                C25491m.m32907d(bVar, 0, (long) ((byte) C25491m.m32904a(nVar.f72140a, nVar.f72143d)));
            } else if (b == 6) {
                C25491m.m32907d(this.f74270a, 6, nVar.mo52754e());
            } else if (b == 2) {
                C26117b bVar2 = this.f74270a;
                nVar.mo52750a(2);
                nVar.f72141b = -1;
                C25491m.m32907d(bVar2, 2, (long) ((short) C25491m.m32904a(nVar.f72140a, nVar.f72143d)));
            } else if (b == 3) {
                C26117b bVar3 = this.f74270a;
                nVar.mo52750a(3);
                nVar.f72141b = -1;
                C25491m.m32908e(bVar3, 3, (long) ((char) C25491m.m32905b(nVar.f72140a, nVar.f72143d, false)));
            } else if (b == 4) {
                C26117b bVar4 = this.f74270a;
                nVar.mo52750a(4);
                nVar.f72141b = -1;
                C25491m.m32907d(bVar4, 4, (long) C25491m.m32904a(nVar.f72140a, nVar.f72143d));
            } else if (b == 16) {
                nVar.mo52750a(16);
                nVar.f72141b = -1;
                C25491m.m32906c(this.f74270a, 16, ((long) Float.floatToIntBits(Float.intBitsToFloat(C25491m.m32905b(nVar.f72140a, nVar.f72143d, true)))) << 32);
            } else if (b != 17) {
                switch (b) {
                    case 23:
                        C26117b bVar5 = this.f74270a;
                        C26718e eVar = C26718e.this;
                        nVar.mo52750a(23);
                        nVar.f72141b = -1;
                        C25491m.m32908e(bVar5, 23, (long) eVar.mo53711e(C25491m.m32905b(nVar.f72140a, nVar.f72143d, false)));
                        return;
                    case 24:
                        C26117b bVar6 = this.f74270a;
                        C26718e eVar2 = C26718e.this;
                        nVar.mo52750a(24);
                        nVar.f72141b = -1;
                        C25491m.m32908e(bVar6, 24, (long) eVar2.mo53712f(C25491m.m32905b(nVar.f72140a, nVar.f72143d, false)));
                        return;
                    case 25:
                        C26117b bVar7 = this.f74270a;
                        C26718e eVar3 = C26718e.this;
                        nVar.mo52750a(25);
                        nVar.f72141b = -1;
                        C25491m.m32908e(bVar7, 25, (long) eVar3.mo53708b(C25491m.m32905b(nVar.f72140a, nVar.f72143d, false)));
                        return;
                    case 26:
                        C26117b bVar8 = this.f74270a;
                        C26718e eVar4 = C26718e.this;
                        nVar.mo52750a(26);
                        nVar.f72141b = -1;
                        C25491m.m32908e(bVar8, 26, (long) eVar4.mo53709c(C25491m.m32905b(nVar.f72140a, nVar.f72143d, false)));
                        return;
                    case 27:
                        C26117b bVar9 = this.f74270a;
                        C26718e eVar5 = C26718e.this;
                        nVar.mo52750a(27);
                        nVar.f72141b = -1;
                        C25491m.m32908e(bVar9, 27, (long) eVar5.mo53708b(C25491m.m32905b(nVar.f72140a, nVar.f72143d, false)));
                        return;
                    case 28:
                        this.f74270a.mo52789o(28);
                        int c = nVar.mo52752c();
                        C25494p.m32919d(this.f74270a, c);
                        while (i < c) {
                            mo53713a(nVar);
                            i++;
                        }
                        return;
                    case 29:
                        this.f74270a.mo52789o(29);
                        mo53714b(nVar);
                        return;
                    case 30:
                        nVar.mo52750a(30);
                        nVar.f72141b = -1;
                        this.f74270a.mo52789o(30);
                        return;
                    case 31:
                        nVar.mo52750a(31);
                        nVar.f72141b = -1;
                        if (nVar.f72143d != 0) {
                            i = 1;
                        }
                        this.f74270a.mo52789o(31 | (i << 5));
                        return;
                    default:
                        throw new C25488j("Unexpected type: " + Integer.toHexString(nVar.mo52751b()));
                }
            } else {
                C25491m.m32906c(this.f74270a, 17, Double.doubleToLongBits(nVar.mo52753d()));
            }
        }

        /* renamed from: b */
        public final void mo53714b(C25492n nVar) {
            nVar.mo52750a(29);
            nVar.f72141b = -1;
            nVar.f72142c = C25494p.m32917b(nVar.f72140a);
            int b = C25494p.m32917b(nVar.f72140a);
            C25494p.m32919d(this.f74270a, C26718e.this.mo53712f(nVar.f72142c));
            C25494p.m32919d(this.f74270a, b);
            for (int i = 0; i < b; i++) {
                C25494p.m32919d(this.f74270a, C26718e.this.mo53711e(C25494p.m32917b(nVar.f72140a)));
                mo53713a(nVar);
            }
        }
    }

    /* renamed from: a */
    public abstract int mo53707a(int i);

    /* renamed from: b */
    public abstract int mo53708b(int i);

    /* renamed from: c */
    public abstract int mo53709c(int i);

    /* renamed from: d */
    public final C25470e.C25472b[] mo53710d(C25470e.C25472b[] bVarArr) {
        C25470e.C25472b[] bVarArr2 = new C25470e.C25472b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            C25470e.C25472b bVar = bVarArr[i];
            int c = mo53709c(bVar.f72096d);
            int i2 = bVar.f72098f;
            C26722g gVar = (C26722g) this;
            int d = gVar.f74289n.mo162978d(i2);
            if (d >= 0) {
                i2 = gVar.f74289n.f333062e[d];
            } else if (i2 >= 0 && gVar.f74275B.mo183354a(i2)) {
                i2 = -1;
            }
            bVarArr2[i] = new C25470e.C25472b(c, bVar.f72097e, i2);
        }
        return bVarArr2;
    }

    /* renamed from: e */
    public abstract int mo53711e(int i);

    /* renamed from: f */
    public abstract int mo53712f(int i);
}

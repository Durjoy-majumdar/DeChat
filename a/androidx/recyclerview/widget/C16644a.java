package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C16678v;
import java.util.ArrayList;
import java.util.List;
import p329d3.C106985e;
import p329d3.C86167d;

/* renamed from: androidx.recyclerview.widget.a */
public class C16644a implements C16678v.C16679a {

    /* renamed from: a */
    public C86167d<C16646b> f44942a = new C106985e(30);

    /* renamed from: b */
    public final ArrayList<C16646b> f44943b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C16646b> f44944c = new ArrayList<>();

    /* renamed from: d */
    public final C16645a f44945d;

    /* renamed from: e */
    public final C16678v f44946e;

    /* renamed from: f */
    public int f44947f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface C16645a {
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    public static class C16646b {

        /* renamed from: a */
        public int f44948a;

        /* renamed from: b */
        public int f44949b;

        /* renamed from: c */
        public Object f44950c;

        /* renamed from: d */
        public int f44951d;

        public C16646b(int i, int i2, int i3, Object obj) {
            this.f44948a = i;
            this.f44949b = i2;
            this.f44951d = i3;
            this.f44950c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16646b.class != obj.getClass()) {
                return false;
            }
            C16646b bVar = (C16646b) obj;
            int i = this.f44948a;
            if (i != bVar.f44948a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f44951d - this.f44949b) == 1 && this.f44951d == bVar.f44949b && this.f44949b == bVar.f44951d) {
                return true;
            }
            if (this.f44951d != bVar.f44951d || this.f44949b != bVar.f44949b) {
                return false;
            }
            Object obj2 = this.f44950c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f44950c)) {
                    return false;
                }
            } else if (bVar.f44950c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f44948a * 31) + this.f44949b) * 31) + this.f44951d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f44948a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f44949b);
            sb.append("c:");
            sb.append(this.f44951d);
            sb.append(",p:");
            sb.append(this.f44950c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C16644a(C16645a aVar) {
        this.f44945d = aVar;
        this.f44946e = new C16678v(this);
    }

    /* renamed from: a */
    public final boolean mo17464a(int i) {
        int size = this.f44944c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16646b bVar = this.f44944c.get(i2);
            int i3 = bVar.f44948a;
            if (i3 == 8) {
                if (mo17469f(bVar.f44951d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f44949b;
                int i5 = bVar.f44951d + i4;
                while (i4 < i5) {
                    if (mo17469f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo17465b() {
        int size = this.f44944c.size();
        for (int i = 0; i < size; i++) {
            ((C16648b0) this.f44945d).mo17482a(this.f44944c.get(i));
        }
        mo17475l(this.f44944c);
        this.f44947f = 0;
    }

    /* renamed from: c */
    public void mo17466c() {
        mo17465b();
        int size = this.f44943b.size();
        for (int i = 0; i < size; i++) {
            C16646b bVar = this.f44943b.get(i);
            int i2 = bVar.f44948a;
            if (i2 == 1) {
                ((C16648b0) this.f44945d).mo17482a(bVar);
                ((C16648b0) this.f44945d).mo17484c(bVar.f44949b, bVar.f44951d);
            } else if (i2 == 2) {
                ((C16648b0) this.f44945d).mo17482a(bVar);
                C16645a aVar = this.f44945d;
                int i3 = bVar.f44949b;
                int i4 = bVar.f44951d;
                C16648b0 b0Var = (C16648b0) aVar;
                b0Var.f44953a.mo17039Z0(i3, i4, true);
                RecyclerView recyclerView = b0Var.f44953a;
                recyclerView.f44756d1 = true;
                recyclerView.f44752a1.f44834c += i4;
            } else if (i2 == 4) {
                ((C16648b0) this.f44945d).mo17482a(bVar);
                ((C16648b0) this.f44945d).mo17483b(bVar.f44949b, bVar.f44951d, bVar.f44950c);
            } else if (i2 == 8) {
                ((C16648b0) this.f44945d).mo17482a(bVar);
                ((C16648b0) this.f44945d).mo17485d(bVar.f44949b, bVar.f44951d);
            }
        }
        mo17475l(this.f44943b);
        this.f44947f = 0;
    }

    /* renamed from: d */
    public final void mo17467d(C16646b bVar) {
        int i;
        int i2 = bVar.f44948a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = mo17476m(bVar.f44949b, i2);
        int i3 = bVar.f44949b;
        int i4 = bVar.f44948a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f44951d; i6++) {
            int m2 = mo17476m(bVar.f44949b + (i * i6), bVar.f44948a);
            int i7 = bVar.f44948a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                C16646b h = mo17471h(i7, m, i5, bVar.f44950c);
                mo17468e(h, i3);
                mo17474k(h);
                if (bVar.f44948a == 4) {
                    i3 += i5;
                }
                m = m2;
                i5 = 1;
            }
        }
        Object obj = bVar.f44950c;
        mo17474k(bVar);
        if (i5 > 0) {
            C16646b h2 = mo17471h(bVar.f44948a, m, i5, obj);
            mo17468e(h2, i3);
            mo17474k(h2);
        }
    }

    /* renamed from: e */
    public void mo17468e(C16646b bVar, int i) {
        ((C16648b0) this.f44945d).mo17482a(bVar);
        int i2 = bVar.f44948a;
        if (i2 == 2) {
            C16645a aVar = this.f44945d;
            int i3 = bVar.f44951d;
            C16648b0 b0Var = (C16648b0) aVar;
            b0Var.f44953a.mo17039Z0(i, i3, true);
            RecyclerView recyclerView = b0Var.f44953a;
            recyclerView.f44756d1 = true;
            recyclerView.f44752a1.f44834c += i3;
        } else if (i2 == 4) {
            ((C16648b0) this.f44945d).mo17483b(i, bVar.f44951d, bVar.f44950c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: f */
    public int mo17469f(int i, int i2) {
        int size = this.f44944c.size();
        while (i2 < size) {
            C16646b bVar = this.f44944c.get(i2);
            int i3 = bVar.f44948a;
            if (i3 == 8) {
                int i4 = bVar.f44949b;
                if (i4 == i) {
                    i = bVar.f44951d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f44951d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f44949b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f44951d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f44951d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public boolean mo17470g() {
        return this.f44943b.size() > 0;
    }

    /* renamed from: h */
    public C16646b mo17471h(int i, int i2, int i3, Object obj) {
        C16646b bVar = (C16646b) ((C106985e) this.f44942a).mo157419a();
        if (bVar == null) {
            return new C16646b(i, i2, i3, obj);
        }
        bVar.f44948a = i;
        bVar.f44949b = i2;
        bVar.f44951d = i3;
        bVar.f44950c = obj;
        return bVar;
    }

    /* renamed from: i */
    public final void mo17472i(C16646b bVar) {
        this.f44944c.add(bVar);
        int i = bVar.f44948a;
        if (i == 1) {
            ((C16648b0) this.f44945d).mo17484c(bVar.f44949b, bVar.f44951d);
        } else if (i == 2) {
            C16645a aVar = this.f44945d;
            C16648b0 b0Var = (C16648b0) aVar;
            b0Var.f44953a.mo17039Z0(bVar.f44949b, bVar.f44951d, false);
            b0Var.f44953a.f44756d1 = true;
        } else if (i == 4) {
            ((C16648b0) this.f44945d).mo17483b(bVar.f44949b, bVar.f44951d, bVar.f44950c);
        } else if (i == 8) {
            ((C16648b0) this.f44945d).mo17485d(bVar.f44949b, bVar.f44951d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:180:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17473j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.v r1 = r0.f44946e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f44943b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.C16644a.C16646b) r9
            int r9 = r9.f44948a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01c7
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.C16644a.C16646b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.C16644a.C16646b) r12
            int r13 = r12.f44948a
            if (r13 == r4) goto L_0x019d
            if (r13 == r9) goto L_0x00a8
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f44951d
            int r8 = r12.f44949b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f44949b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f44951d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f44951d = r9
            androidx.recyclerview.widget.v$a r5 = r1.f45080a
            int r8 = r11.f44949b
            java.lang.Object r9 = r12.f44950c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C16644a) r5
            androidx.recyclerview.widget.a$b r4 = r5.mo17471h(r6, r8, r4, r9)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f44949b
            int r8 = r12.f44949b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f44949b = r8
            goto L_0x0087
        L_0x0070:
            int r9 = r12.f44951d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0087
            int r8 = r8 - r5
            androidx.recyclerview.widget.v$a r9 = r1.f45080a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.f44950c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.C16644a) r9
            androidx.recyclerview.widget.a$b r10 = r9.mo17471h(r6, r5, r8, r10)
            int r5 = r12.f44951d
            int r5 = r5 - r8
            r12.f44951d = r5
        L_0x0087:
            r2.set(r7, r11)
            int r5 = r12.f44951d
            if (r5 <= 0) goto L_0x0092
            r2.set(r3, r12)
            goto L_0x009c
        L_0x0092:
            r2.remove(r3)
            androidx.recyclerview.widget.v$a r5 = r1.f45080a
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.C16644a) r5
            r5.mo17474k(r12)
        L_0x009c:
            if (r4 == 0) goto L_0x00a1
            r2.add(r3, r4)
        L_0x00a1:
            if (r10 == 0) goto L_0x0009
            r2.add(r3, r10)
            goto L_0x0009
        L_0x00a8:
            int r6 = r11.f44949b
            int r8 = r11.f44951d
            if (r6 >= r8) goto L_0x00bd
            int r13 = r12.f44949b
            if (r13 != r6) goto L_0x00ba
            int r13 = r12.f44951d
            int r6 = r8 - r6
            if (r13 != r6) goto L_0x00ba
            r5 = 0
            goto L_0x00c9
        L_0x00ba:
            r5 = 0
            r6 = 0
            goto L_0x00ce
        L_0x00bd:
            int r13 = r12.f44949b
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00cc
            int r13 = r12.f44951d
            int r6 = r6 - r8
            if (r13 != r6) goto L_0x00cc
            r5 = 1
        L_0x00c9:
            r6 = r5
            r5 = 1
            goto L_0x00ce
        L_0x00cc:
            r5 = 0
            r6 = 1
        L_0x00ce:
            int r13 = r12.f44949b
            if (r8 >= r13) goto L_0x00d7
            int r13 = r13 + -1
            r12.f44949b = r13
            goto L_0x00f4
        L_0x00d7:
            int r14 = r12.f44951d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x00f4
            int r14 = r14 + -1
            r12.f44951d = r14
            r11.f44948a = r9
            r11.f44951d = r4
            int r3 = r12.f44951d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.v$a r3 = r1.f45080a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C16644a) r3
            r3.mo17474k(r12)
            goto L_0x0009
        L_0x00f4:
            int r4 = r11.f44949b
            int r8 = r12.f44949b
            if (r4 > r8) goto L_0x00ff
            int r8 = r8 + 1
            r12.f44949b = r8
            goto L_0x0116
        L_0x00ff:
            int r13 = r12.f44951d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0116
            int r8 = r8 - r4
            androidx.recyclerview.widget.v$a r13 = r1.f45080a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.C16644a) r13
            androidx.recyclerview.widget.a$b r10 = r13.mo17471h(r9, r4, r8, r10)
            int r4 = r11.f44949b
            int r8 = r12.f44949b
            int r4 = r4 - r8
            r12.f44951d = r4
        L_0x0116:
            if (r5 == 0) goto L_0x0127
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.v$a r3 = r1.f45080a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.C16644a) r3
            r3.mo17474k(r11)
            goto L_0x0009
        L_0x0127:
            if (r6 == 0) goto L_0x0158
            if (r10 == 0) goto L_0x0141
            int r4 = r11.f44949b
            int r5 = r10.f44949b
            if (r4 <= r5) goto L_0x0136
            int r5 = r10.f44951d
            int r4 = r4 - r5
            r11.f44949b = r4
        L_0x0136:
            int r4 = r11.f44951d
            int r5 = r10.f44949b
            if (r4 <= r5) goto L_0x0141
            int r5 = r10.f44951d
            int r4 = r4 - r5
            r11.f44951d = r4
        L_0x0141:
            int r4 = r11.f44949b
            int r5 = r12.f44949b
            if (r4 <= r5) goto L_0x014c
            int r5 = r12.f44951d
            int r4 = r4 - r5
            r11.f44949b = r4
        L_0x014c:
            int r4 = r11.f44951d
            int r5 = r12.f44949b
            if (r4 <= r5) goto L_0x0186
            int r5 = r12.f44951d
            int r4 = r4 - r5
            r11.f44951d = r4
            goto L_0x0186
        L_0x0158:
            if (r10 == 0) goto L_0x0170
            int r4 = r11.f44949b
            int r5 = r10.f44949b
            if (r4 < r5) goto L_0x0165
            int r5 = r10.f44951d
            int r4 = r4 - r5
            r11.f44949b = r4
        L_0x0165:
            int r4 = r11.f44951d
            int r5 = r10.f44949b
            if (r4 < r5) goto L_0x0170
            int r5 = r10.f44951d
            int r4 = r4 - r5
            r11.f44951d = r4
        L_0x0170:
            int r4 = r11.f44949b
            int r5 = r12.f44949b
            if (r4 < r5) goto L_0x017b
            int r5 = r12.f44951d
            int r4 = r4 - r5
            r11.f44949b = r4
        L_0x017b:
            int r4 = r11.f44951d
            int r5 = r12.f44949b
            if (r4 < r5) goto L_0x0186
            int r5 = r12.f44951d
            int r4 = r4 - r5
            r11.f44951d = r4
        L_0x0186:
            r2.set(r3, r12)
            int r4 = r11.f44949b
            int r5 = r11.f44951d
            if (r4 == r5) goto L_0x0193
            r2.set(r7, r11)
            goto L_0x0196
        L_0x0193:
            r2.remove(r7)
        L_0x0196:
            if (r10 == 0) goto L_0x0009
            r2.add(r3, r10)
            goto L_0x0009
        L_0x019d:
            int r4 = r11.f44951d
            int r6 = r12.f44949b
            if (r4 >= r6) goto L_0x01a5
            r5 = -1
            goto L_0x01a6
        L_0x01a5:
            r5 = 0
        L_0x01a6:
            int r8 = r11.f44949b
            if (r8 >= r6) goto L_0x01ac
            int r5 = r5 + 1
        L_0x01ac:
            if (r6 > r8) goto L_0x01b3
            int r6 = r12.f44951d
            int r8 = r8 + r6
            r11.f44949b = r8
        L_0x01b3:
            int r6 = r12.f44949b
            if (r6 > r4) goto L_0x01bc
            int r8 = r12.f44951d
            int r4 = r4 + r8
            r11.f44951d = r4
        L_0x01bc:
            int r6 = r6 + r5
            r12.f44949b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01c7:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f44943b
            int r1 = r1.size()
            r2 = 0
        L_0x01ce:
            if (r2 >= r1) goto L_0x02c7
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f44943b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.C16644a.C16646b) r3
            int r11 = r3.f44948a
            if (r11 == r4) goto L_0x02bd
            if (r11 == r9) goto L_0x0254
            if (r11 == r6) goto L_0x01e9
            if (r11 == r7) goto L_0x01e4
            goto L_0x02c0
        L_0x01e4:
            r0.mo17472i(r3)
            goto L_0x02c0
        L_0x01e9:
            int r11 = r3.f44949b
            int r12 = r3.f44951d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x01f1:
            if (r11 >= r12) goto L_0x023b
            androidx.recyclerview.widget.a$a r5 = r0.f44945d
            androidx.recyclerview.widget.b0 r5 = (androidx.recyclerview.widget.C16648b0) r5
            androidx.recyclerview.widget.RecyclerView r7 = r5.f44953a
            androidx.recyclerview.widget.RecyclerView$z r7 = r7.mo17024J0(r11, r4)
            if (r7 != 0) goto L_0x0201
        L_0x01ff:
            r7 = r10
            goto L_0x020e
        L_0x0201:
            androidx.recyclerview.widget.RecyclerView r5 = r5.f44953a
            androidx.recyclerview.widget.e r5 = r5.f44763h
            android.view.View r8 = r7.f44854d
            boolean r5 = r5.mo17496k(r8)
            if (r5 == 0) goto L_0x020e
            goto L_0x01ff
        L_0x020e:
            if (r7 != 0) goto L_0x0226
            boolean r5 = r0.mo17464a(r11)
            if (r5 == 0) goto L_0x0217
            goto L_0x0226
        L_0x0217:
            if (r15 != r4) goto L_0x0224
            java.lang.Object r5 = r3.f44950c
            androidx.recyclerview.widget.a$b r5 = r0.mo17471h(r6, r13, r14, r5)
            r0.mo17472i(r5)
            r13 = r11
            r14 = 0
        L_0x0224:
            r15 = 0
            goto L_0x0234
        L_0x0226:
            if (r15 != 0) goto L_0x0233
            java.lang.Object r5 = r3.f44950c
            androidx.recyclerview.widget.a$b r5 = r0.mo17471h(r6, r13, r14, r5)
            r0.mo17467d(r5)
            r13 = r11
            r14 = 0
        L_0x0233:
            r15 = 1
        L_0x0234:
            int r14 = r14 + r4
            int r11 = r11 + 1
            r7 = 8
            r8 = -1
            goto L_0x01f1
        L_0x023b:
            int r5 = r3.f44951d
            if (r14 == r5) goto L_0x0248
            java.lang.Object r5 = r3.f44950c
            r0.mo17474k(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo17471h(r6, r13, r14, r5)
        L_0x0248:
            if (r15 != 0) goto L_0x024f
            r0.mo17467d(r3)
            goto L_0x02c0
        L_0x024f:
            r0.mo17472i(r3)
            goto L_0x02c0
        L_0x0254:
            int r5 = r3.f44949b
            int r7 = r3.f44951d
            int r7 = r7 + r5
            r8 = r5
            r11 = 0
            r12 = -1
        L_0x025c:
            if (r8 >= r7) goto L_0x02a8
            androidx.recyclerview.widget.a$a r13 = r0.f44945d
            androidx.recyclerview.widget.b0 r13 = (androidx.recyclerview.widget.C16648b0) r13
            androidx.recyclerview.widget.RecyclerView r14 = r13.f44953a
            androidx.recyclerview.widget.RecyclerView$z r14 = r14.mo17024J0(r8, r4)
            if (r14 != 0) goto L_0x026c
        L_0x026a:
            r14 = r10
            goto L_0x0279
        L_0x026c:
            androidx.recyclerview.widget.RecyclerView r13 = r13.f44953a
            androidx.recyclerview.widget.e r13 = r13.f44763h
            android.view.View r15 = r14.f44854d
            boolean r13 = r13.mo17496k(r15)
            if (r13 == 0) goto L_0x0279
            goto L_0x026a
        L_0x0279:
            if (r14 != 0) goto L_0x0290
            boolean r13 = r0.mo17464a(r8)
            if (r13 == 0) goto L_0x0282
            goto L_0x0290
        L_0x0282:
            if (r12 != r4) goto L_0x028d
            androidx.recyclerview.widget.a$b r12 = r0.mo17471h(r9, r5, r11, r10)
            r0.mo17472i(r12)
            r12 = 1
            goto L_0x028e
        L_0x028d:
            r12 = 0
        L_0x028e:
            r13 = 0
            goto L_0x029d
        L_0x0290:
            if (r12 != 0) goto L_0x029b
            androidx.recyclerview.widget.a$b r12 = r0.mo17471h(r9, r5, r11, r10)
            r0.mo17467d(r12)
            r12 = 1
            goto L_0x029c
        L_0x029b:
            r12 = 0
        L_0x029c:
            r13 = 1
        L_0x029d:
            if (r12 == 0) goto L_0x02a3
            int r8 = r8 - r11
            int r7 = r7 - r11
            r11 = 1
            goto L_0x02a5
        L_0x02a3:
            int r11 = r11 + 1
        L_0x02a5:
            int r8 = r8 + r4
            r12 = r13
            goto L_0x025c
        L_0x02a8:
            int r7 = r3.f44951d
            if (r11 == r7) goto L_0x02b3
            r0.mo17474k(r3)
            androidx.recyclerview.widget.a$b r3 = r0.mo17471h(r9, r5, r11, r10)
        L_0x02b3:
            if (r12 != 0) goto L_0x02b9
            r0.mo17467d(r3)
            goto L_0x02c0
        L_0x02b9:
            r0.mo17472i(r3)
            goto L_0x02c0
        L_0x02bd:
            r0.mo17472i(r3)
        L_0x02c0:
            int r2 = r2 + 1
            r7 = 8
            r8 = -1
            goto L_0x01ce
        L_0x02c7:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f44943b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C16644a.mo17473j():void");
    }

    /* renamed from: k */
    public void mo17474k(C16646b bVar) {
        bVar.f44950c = null;
        ((C106985e) this.f44942a).mo157420b(bVar);
    }

    /* renamed from: l */
    public void mo17475l(List<C16646b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo17474k(list.get(i));
        }
        list.clear();
    }

    /* renamed from: m */
    public final int mo17476m(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f44944c.size() - 1; size >= 0; size--) {
            C16646b bVar = this.f44944c.get(size);
            int i5 = bVar.f44948a;
            if (i5 == 8) {
                int i6 = bVar.f44949b;
                int i7 = bVar.f44951d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f44949b = i6 + 1;
                            bVar.f44951d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f44949b = i6 - 1;
                            bVar.f44951d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f44951d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f44951d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f44949b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f44949b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f44949b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f44951d;
                    } else if (i5 == 2) {
                        i += bVar.f44951d;
                    }
                } else if (i2 == 1) {
                    bVar.f44949b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f44949b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f44944c.size() - 1; size2 >= 0; size2--) {
            C16646b bVar2 = this.f44944c.get(size2);
            if (bVar2.f44948a == 8) {
                int i9 = bVar2.f44951d;
                if (i9 == bVar2.f44949b || i9 < 0) {
                    this.f44944c.remove(size2);
                    mo17474k(bVar2);
                }
            } else if (bVar2.f44951d <= 0) {
                this.f44944c.remove(size2);
                mo17474k(bVar2);
            }
        }
        return i;
    }
}

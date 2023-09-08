package i91;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import j91.C21199a;
import op3.C117877b;
import op3.C117882j;
import te3.C118463s1;
import te3.C118467t1;
import te3.C118471u1;
import te3.fh4;
import te3.mf4;

/* renamed from: i91.c */
public final class C21062c {

    /* renamed from: b */
    public static volatile C21062c f59585b;

    /* renamed from: a */
    public C21063d f59586a = new C21063d();

    public C21062c() {
        if (C116711b.m164589n()) {
            this.f59586a.f59587a.getClass();
            Log.m105924i("HABBYGE-MALI.ActivityStackDao", "ActivityStackDao reset");
            C116850b.m164834d("hell_astackd_mmkv_key", new byte[0]);
        }
    }

    /* renamed from: d */
    public static C21062c m23249d() {
        if (f59585b == null) {
            synchronized (C21062c.class) {
                if (f59585b == null) {
                    f59585b = new C21062c();
                }
            }
        }
        return f59585b;
    }

    /* renamed from: a */
    public void mo32771a(String str, int i) {
        mf4 last;
        C118467t1 last2;
        this.f59586a.f59587a.getClass();
        if (!TextUtils.isEmpty(str)) {
            C118471u1 a = C21061b.m23247a();
            boolean z = false;
            if (!a.f354473d.isEmpty() && !TextUtils.isEmpty(str) && (last = a.f354473d.getLast()) != null && !last.f354135e.isEmpty() && (last2 = last.f354135e.getLast()) != null && !last2.f354392d.f354001d.equals(str)) {
                C117877b<Integer, Integer> j = C21065f.m23263j(a, str, i);
                int intValue = ((Integer) j.mo182596a(0)).intValue();
                int intValue2 = ((Integer) j.mo182596a(1)).intValue();
                if (intValue >= 0) {
                    mf4 remove = a.f354473d.remove(intValue);
                    int size = remove.f354135e.size() - 1;
                    if (intValue2 < size) {
                        while (size > intValue2) {
                            remove.f354135e.remove(size);
                            size--;
                        }
                    }
                    a.f354473d.addLast(remove);
                    z = true;
                }
            }
            if (z) {
                C21061b.m23248b(a);
            }
        }
    }

    /* renamed from: b */
    public C118467t1 mo32772b(String str) {
        this.f59586a.f59587a.getClass();
        C118471u1 a = C21061b.m23247a();
        C117877b<Integer, Integer> j = C21065f.m23263j(a, str, 0);
        int intValue = ((Integer) j.mo182596a(0)).intValue();
        int intValue2 = ((Integer) j.mo182596a(1)).intValue();
        if (intValue < 0 || intValue2 < 0) {
            return null;
        }
        return a.f354473d.get(intValue).f354135e.get(intValue2);
    }

    /* renamed from: c */
    public C117877b<String, Integer> mo32773c() {
        C118463s1 s1Var = C21061b.m23247a().f354474e;
        if (s1Var == null) {
            return C117882j.m166284c(null, null);
        }
        C118467t1 t1Var = s1Var.f354323d;
        if (t1Var == null) {
            return C117882j.m166284c(null, null);
        }
        fh4 fh4 = t1Var.f354392d;
        return C117882j.m166284c(fh4.f354001d, Integer.valueOf(fh4.f354002e));
    }

    /* renamed from: e */
    public C117877b<String, Integer> mo32774e() {
        C118463s1 s1Var = C21061b.m23247a().f354474e;
        if (s1Var == null) {
            return C117882j.m166284c(null, null);
        }
        C118467t1 t1Var = s1Var.f354325f;
        if (t1Var == null) {
            return C117882j.m166284c(null, null);
        }
        fh4 fh4 = t1Var.f354392d;
        return C117882j.m166284c(fh4.f354001d, Integer.valueOf(fh4.f354002e));
    }

    /* renamed from: f */
    public C117877b<String, Integer> mo32775f() {
        C118463s1 s1Var = C21061b.m23247a().f354474e;
        if (s1Var == null) {
            return C117882j.m166284c(null, null);
        }
        C118467t1 t1Var = s1Var.f354324e;
        if (t1Var == null) {
            return C117882j.m166284c(null, null);
        }
        fh4 fh4 = t1Var.f354392d;
        return C117882j.m166284c(fh4.f354001d, Integer.valueOf(fh4.f354002e));
    }

    /* renamed from: g */
    public C118467t1 mo32776g() {
        return (C118467t1) this.f59586a.f59587a.mo32780b().mo182596a(1);
    }

    /* renamed from: h */
    public void mo32777h(String str, int i, C21060a aVar) {
        C118471u1 a = C21061b.m23247a();
        if (a.f354474e == null) {
            a.f354474e = new C118463s1();
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            C118463s1 s1Var = a.f354474e;
            if (s1Var.f354323d == null) {
                s1Var.f354323d = new C118467t1();
            }
            C118467t1 t1Var = a.f354474e.f354323d;
            if (t1Var.f354392d == null) {
                t1Var.f354392d = new fh4();
            }
            C118467t1 t1Var2 = a.f354474e.f354323d;
            fh4 fh4 = t1Var2.f354392d;
            fh4.f354001d = str;
            fh4.f354002e = i;
            t1Var2.f354394f = 0;
        } else if (ordinal == 1) {
            C118463s1 s1Var2 = a.f354474e;
            if (s1Var2.f354324e == null) {
                s1Var2.f354324e = new C118467t1();
            }
            C118467t1 t1Var3 = a.f354474e.f354324e;
            if (t1Var3.f354392d == null) {
                t1Var3.f354392d = new fh4();
            }
            C118467t1 t1Var4 = a.f354474e.f354324e;
            fh4 fh42 = t1Var4.f354392d;
            fh42.f354001d = str;
            fh42.f354002e = i;
            t1Var4.f354394f = 1;
        } else if (ordinal == 2) {
            C118463s1 s1Var3 = a.f354474e;
            if (s1Var3.f354325f == null) {
                s1Var3.f354325f = new C118467t1();
            }
            C118467t1 t1Var5 = a.f354474e.f354325f;
            if (t1Var5.f354392d == null) {
                t1Var5.f354392d = new fh4();
            }
            C118467t1 t1Var6 = a.f354474e.f354325f;
            fh4 fh43 = t1Var6.f354392d;
            fh43.f354001d = str;
            fh43.f354002e = i;
            t1Var6.f354394f = 2;
        } else if (ordinal == 3) {
            C118463s1 s1Var4 = a.f354474e;
            if (s1Var4.f354326g == null) {
                s1Var4.f354326g = new C118467t1();
            }
            C118467t1 t1Var7 = a.f354474e.f354326g;
            if (t1Var7.f354392d == null) {
                t1Var7.f354392d = new fh4();
            }
            C118467t1 t1Var8 = a.f354474e.f354326g;
            fh4 fh44 = t1Var8.f354392d;
            fh44.f354001d = str;
            fh44.f354002e = i;
            t1Var8.f354394f = 3;
        }
        C21061b.m23248b(a);
    }

    /* renamed from: i */
    public void mo32778i(String str, String str2, int i) {
        C118467t1 t1Var;
        if (str != null && str2 != null && C21199a.m23656a() != 8) {
            this.f59586a.f59587a.getClass();
            C118471u1 a = C21061b.m23247a();
            C118463s1 s1Var = a.f354474e;
            if (!(s1Var == null || (t1Var = s1Var.f354325f) == null || !str.equals(t1Var.f354392d.f354001d))) {
                C118467t1 t1Var2 = a.f354474e.f354325f;
                t1Var2.f354395g = str2;
                t1Var2.f354399n = i;
            }
            C117877b<Integer, Integer> j = C21065f.m23263j(a, str, 0);
            int intValue = ((Integer) j.mo182596a(0)).intValue();
            int intValue2 = ((Integer) j.mo182596a(1)).intValue();
            if (intValue >= 0 && intValue2 >= 0) {
                a.f354473d.get(intValue).f354135e.get(intValue2).f354396h = str2;
                C21061b.m23248b(a);
            }
        }
    }

    /* renamed from: j */
    public void mo32779j(String str, String str2, int i) {
        C118467t1 t1Var;
        if (str != null && str2 != null) {
            this.f59586a.f59587a.getClass();
            C118471u1 a = C21061b.m23247a();
            C118463s1 s1Var = a.f354474e;
            if (!(s1Var == null || (t1Var = s1Var.f354324e) == null || !str.equals(t1Var.f354392d.f354001d))) {
                C118467t1 t1Var2 = a.f354474e.f354324e;
                t1Var2.f354395g = str2;
                t1Var2.f354399n = i;
            }
            C117877b<Integer, Integer> j = C21065f.m23263j(a, str, 0);
            int intValue = ((Integer) j.mo182596a(0)).intValue();
            int intValue2 = ((Integer) j.mo182596a(1)).intValue();
            if (intValue >= 0 && intValue2 >= 0) {
                C118467t1 t1Var3 = a.f354473d.get(intValue).f354135e.get(intValue2);
                t1Var3.f354395g = str2;
                t1Var3.f354399n = i;
                C21061b.m23248b(a);
            }
        }
    }
}

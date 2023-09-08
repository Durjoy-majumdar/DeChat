package q30;

import bv1.C28426b;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import jr2.C99019x;
import k30.C99096a;
import os2.C11766m0;

/* renamed from: q30.r */
public class C101015r extends C99096a {

    /* renamed from: e */
    public static C101015r f295805e = new C101015r();

    /* renamed from: q30.r$a */
    public class C101016a implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ String f295806a;

        public C101016a(C101015r rVar, String str) {
            this.f295806a = str;
        }

        public Object getData() {
            return Integer.valueOf(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Vx0(this.f295806a));
        }
    }

    /* renamed from: q30.r$b */
    public class C101017b implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ String f295807a;

        public C101017b(C101015r rVar, String str) {
            this.f295807a = str;
        }

        public Object getData() {
            return Integer.valueOf(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Xx0(this.f295807a));
        }
    }

    /* renamed from: q30.r$c */
    public class C101018c implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ String f295808a;

        public C101018c(C101015r rVar, String str) {
            this.f295808a = str;
        }

        public Object getData() {
            return Boolean.valueOf(((C28426b) C86312j.m106911c(C28426b.class)).mo55965ia(this.f295808a));
        }
    }

    /* renamed from: q30.r$d */
    public class C101019d implements C99096a.C99098b {

        /* renamed from: a */
        public final /* synthetic */ String f295809a;

        public C101019d(C101015r rVar, String str) {
            this.f295809a = str;
        }

        public Object getData() {
            return Boolean.valueOf(((C11766m0) C99019x.m128974f()).mo11654bD(this.f295809a, 5));
        }
    }

    /* renamed from: b */
    public boolean mo140502b(String str) {
        return ((Boolean) mo138469a("isChatAlbert" + str, new C101018c(this, str))).booleanValue();
    }

    /* renamed from: c */
    public boolean mo140503c(C72996z1 z1Var) {
        return ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(z1Var.getUsername());
    }

    /* renamed from: d */
    public boolean mo140504d(String str) {
        return ((Boolean) mo138469a("seeHisSns" + str, new C101019d(this, str))).booleanValue();
    }

    /* renamed from: e */
    public int mo140505e(String str) {
        return ((Integer) mo138469a("withSomeoneMessageAll" + str, new C101016a(this, str))).intValue();
    }

    /* renamed from: f */
    public int mo140506f(String str) {
        return ((Integer) mo138469a("withSomeoneMessageTo" + str, new C101017b(this, str))).intValue();
    }
}

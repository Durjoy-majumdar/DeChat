package com.tencent.p014mm.xeffect;

/* renamed from: com.tencent.mm.xeffect.XEffectLog */
public class XEffectLog {

    /* renamed from: a */
    public static C106869c f319986a = new C106868b((C106867a) null);

    /* renamed from: com.tencent.mm.xeffect.XEffectLog$b */
    public static class C106868b implements C106869c {
        public C106868b(C106867a aVar) {
        }

        /* renamed from: d */
        public void mo143270d(String str, String str2, Object... objArr) {
            String.format(str2, objArr);
        }

        /* renamed from: e */
        public void mo143271e(String str, String str2, Object... objArr) {
            String.format(str2, objArr);
        }

        /* renamed from: i */
        public void mo143272i(String str, String str2, Object... objArr) {
            String.format(str2, objArr);
        }

        /* renamed from: w */
        public void mo143273w(String str, String str2, Object... objArr) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: com.tencent.mm.xeffect.XEffectLog$c */
    public interface C106869c {
        /* renamed from: d */
        void mo143270d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo143271e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo143272i(String str, String str2, Object... objArr);

        /* renamed from: w */
        void mo143273w(String str, String str2, Object... objArr);
    }

    /* renamed from: a */
    public static long m144537a() {
        try {
            return nGetXLogImpl();
        } catch (Throwable th) {
            f319986a.mo143271e("XEffectLog", "get native log error %s", th.getMessage());
            return 0;
        }
    }

    /* renamed from: b */
    public static void m144538b(String str, String str2, Object... objArr) {
        f319986a.mo143273w(str, str2, objArr);
    }

    private static native long nGetXLogImpl();
}

package p966fj;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fj.a */
public enum C86869a {
    INSTANCE;
    

    /* renamed from: e */
    public static volatile C86871b f252160e;

    /* renamed from: fj.a$a */
    public class C86870a implements C86871b {
        /* renamed from: a */
        public void mo121332a(int i, Object... objArr) {
            Log.m105928w("MicroMsg.ReportDelegate", "hy: dummy reportKV, do nothing");
        }

        /* renamed from: b */
        public void mo121333b(long j, long j2, long j3, boolean z) {
            Log.m105928w("MicroMsg.ReportDelegate", "hy: dummy reportIDKey, do nothing");
        }
    }

    /* renamed from: fj.a$b */
    public interface C86871b {
        /* renamed from: a */
        void mo121332a(int i, Object... objArr);

        /* renamed from: b */
        void mo121333b(long j, long j2, long j3, boolean z);
    }

    /* access modifiers changed from: public */
    static {
        f252160e = new C86870a();
    }

    /* renamed from: a */
    public void mo121329a(long j, long j2) {
        f252160e.mo121333b(j, j2, 1, false);
    }

    /* renamed from: b */
    public void mo121330b(long j, long j2, long j3) {
        f252160e.mo121333b(j, j2, j3, false);
    }

    /* renamed from: c */
    public void mo121331c(int i, Object... objArr) {
        f252160e.mo121332a(i, objArr);
    }
}

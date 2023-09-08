package gr1;

/* renamed from: gr1.n2 */
public interface C59667n2 {

    /* renamed from: gr1.n2$a */
    public static final class C8415a {
        /* renamed from: a */
        public static /* synthetic */ void m8377a(C59667n2 n2Var, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                if ((i & 2) != 0) {
                    z = true;
                }
                n2Var.mo4242e(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterSeekMode");
        }
    }

    /* renamed from: gr1.n2$b */
    public interface C8416b {
        /* renamed from: a */
        void mo9353a();

        /* renamed from: c */
        void mo9354c(float f);
    }

    /* renamed from: b */
    void mo4239b(float f);

    /* renamed from: d */
    boolean mo4240d();

    /* renamed from: e */
    void mo4242e(String str, boolean z);

    /* renamed from: g */
    void mo4243g(float f, long j, long j2);

    int getCurrentProgress();

    int getMaxProgress();

    /* renamed from: h */
    void mo4258h(int i, int i2);

    /* renamed from: i */
    void mo4259i(String str);

    /* renamed from: j */
    boolean mo4260j();

    /* renamed from: k */
    boolean mo4261k();

    /* renamed from: l */
    void mo4262l(boolean z);

    /* renamed from: m */
    void mo4263m(float f, int i, int i2);

    /* renamed from: n */
    boolean mo4264n();

    /* renamed from: o */
    void mo4265o();

    void onVideoEnded();

    void setProgress(int i);

    void setSeekBarCallback(C8416b bVar);

    void setVisibility(int i);
}

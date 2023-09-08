package ei0;

/* renamed from: ei0.b */
public interface C86518b<_Response, _Progress> {

    /* renamed from: ei0.b$a */
    public enum C86519a {
        OK(0),
        FAILED(101),
        LOCAL_FILE_NOT_FOUND(102),
        PKG_INVALID(105),
        SEVER_FILE_NOT_FOUND(106),
        DISK_FULL(110),
        ENV_ERR(120);
        

        /* renamed from: d */
        public final int f251370d;

        /* access modifiers changed from: public */
        C86519a(int i) {
            this.f251370d = i;
        }
    }

    /* renamed from: a */
    void mo113493a(String str, C86519a aVar, _Response _response);

    /* renamed from: b */
    void mo113494b(_Progress _progress);
}

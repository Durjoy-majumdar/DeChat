package di0;

/* renamed from: di0.n */
public interface C86297n {

    /* renamed from: di0.n$a */
    public static final class C86298a {
        /* renamed from: a */
        public static /* synthetic */ void m106900a(C86297n nVar, int i, String str, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str = null;
                }
                nVar.mo1541a(i, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
    }

    /* renamed from: a */
    void mo1541a(int i, String str);

    void onSuccess();
}

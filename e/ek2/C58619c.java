package ek2;

import android.os.Bundle;

/* renamed from: ek2.c */
public interface C58619c {

    /* renamed from: ek2.c$a */
    public enum C58620a {
        PLAY,
        SWITCH,
        SWITCH_DEFAULT
    }

    /* renamed from: ek2.c$b */
    public static final class C58621b {
        /* renamed from: a */
        public static /* synthetic */ void m68074a(C58619c cVar, C58620a aVar, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                cVar.mo83500a(aVar, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
    }

    /* renamed from: a */
    void mo83500a(C58620a aVar, Bundle bundle);
}

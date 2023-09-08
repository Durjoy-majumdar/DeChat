package o34;

import java.io.Serializable;
import l34.C88379f;

/* renamed from: o34.d */
public final class C117655d<T> {

    /* renamed from: a */
    public static final C117655d f351922a = new C117655d();

    /* renamed from: b */
    public static final Object f351923b = new C117656a();

    /* renamed from: c */
    public static final Object f351924c = new C117657b();

    /* renamed from: o34.d$a */
    public static class C117656a implements Serializable {
        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* renamed from: o34.d$b */
    public static class C117657b implements Serializable {
        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* renamed from: o34.d$c */
    public static final class C117658c implements Serializable {

        /* renamed from: d */
        public final Throwable f351925d;

        public C117658c(Throwable th) {
            this.f351925d = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f351925d;
        }
    }

    /* renamed from: a */
    public boolean mo182372a(C88379f<? super T> fVar, Object obj) {
        if (obj == f351923b) {
            fVar.mo122780a();
            return true;
        } else if (obj == f351924c) {
            fVar.mo122781b(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == C117658c.class) {
            fVar.onError(((C117658c) obj).f351925d);
            return true;
        } else {
            fVar.mo122781b(obj);
            return false;
        }
    }
}

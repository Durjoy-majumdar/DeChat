package p259w6;

import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: w6.c */
public final class C15048c {

    /* renamed from: a */
    public static final C13601g f41187a = C36568h.m40986b(C13602i.NONE, C15049a.f41188d);

    /* renamed from: w6.c$a */
    public static final class C15049a extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public static final C15049a f41188d = new C15049a();

        public C15049a() {
            super(0);
        }

        public Object invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}

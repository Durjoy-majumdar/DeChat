package er1;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import o40.C11348f;

/* renamed from: er1.y */
public final class C58791y {

    /* renamed from: a */
    public static final C58791y f168321a = new C58791y();

    /* renamed from: b */
    public static WeakReference<Activity> f168322b;

    /* renamed from: c */
    public static WeakReference<Activity> f168323c;

    /* renamed from: er1.y$a */
    public static final class C58792a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ String f168324d;

        /* renamed from: e */
        public final /* synthetic */ String f168325e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58792a(String str, String str2) {
            super(0);
            this.f168324d = str;
            this.f168325e = str2;
        }

        public Object invoke() {
            return "type = " + this.f168324d + " contextName = " + this.f168325e;
        }
    }

    /* renamed from: a */
    public final void mo83986a(String str, String str2) {
        C87412m.m108594g(str, "type");
        C87412m.m108594g(str2, "contextName");
        Log.m105924i("Finder.FinderContextManager", "report type = " + str + ", contextName = " + str2);
        C11348f.C11349a.m11178b(C59319a.f169618b, str, false, (C11348f.C11352b) null, false, false, new C58792a(str, str2), 28, (Object) null);
    }
}

package q41;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87413o;
import kj2.C117407d;
import qh3.C89661b;
import qh3.C89664c;
import qh3.C89667e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: q41.c */
public final class C101031c {

    /* renamed from: a */
    public static final String[] f295819a = {StateEvent.Name.MESSAGE, "ImgInfo2", "videoinfo2", "rconversation", "appattach"};

    /* renamed from: b */
    public static final C13601g f295820b = C36568h.m40985a(C89461b.f257508d);

    /* renamed from: c */
    public static final C13601g f295821c = C36568h.m40985a(C101032a.f295822d);

    /* renamed from: q41.c$b */
    public static final class C89461b extends C87413o implements C32224a<C89661b.C89663b<Boolean>> {

        /* renamed from: d */
        public static final C89461b f257508d = new C89461b();

        public C89461b() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.DBLeafBackup", "Register status listener");
            C89661b r = C86709a0.m107534r();
            Class cls = Boolean.TYPE;
            C89664c cVar = new C89664c(r.mo123993a(0, cls), new C89667e(C86709a0.m107534r().mo123993a(1, cls)));
            cVar.mo123986c(C101033d.f295823d);
            return cVar;
        }
    }

    /* renamed from: q41.c$a */
    public static final class C101032a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C101032a f295822d = new C101032a();

        public C101032a() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.DBLeafBackup", "Register conversation listener");
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().add(C101030b.f295818d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static void m132400a(int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 1;
        }
        C117407d.INSTANCE.idkeyStat(181, (long) i, j, true);
    }
}

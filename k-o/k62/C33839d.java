package k62;

import com.tencent.p014mm.sdk.p134kt.DataPair3;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import ob0.C117747y;
import ob0.C35142u;
import pc0.C77065r;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: k62.d */
public final class C33839d implements C35142u {

    /* renamed from: d */
    public static final C13601g<HashMap<Long, DataPair3<Integer, Integer, String>>> f91468d = C36568h.m40985a(C33840a.f91469d);

    /* renamed from: k62.d$a */
    public static final class C33840a extends C87413o implements C32224a<HashMap<Long, DataPair3<Integer, Integer, String>>> {

        /* renamed from: d */
        public static final C33840a f91469d = new C33840a();

        public C33840a() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: k62.d$b */
    public static final class C33841b {
        public C33841b(C8480h hVar) {
        }
    }

    static {
        new C33841b((C8480h) null);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i2 != 0 && (yVar instanceof C77065r)) {
            long j = ((C77065r) yVar).f225109f;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(i2);
            if (str == null) {
                str = "";
            }
            C61926c.m72661F("AndroidSendMsgFailReport", new C33838c(j, new DataPair3(valueOf, valueOf2, str)));
        }
    }
}

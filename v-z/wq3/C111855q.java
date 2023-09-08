package wq3;

import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fg3.C107540b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Stack;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: wq3.q */
public final class C111855q {

    /* renamed from: a */
    public static final C111858c f334885a = new C111858c();

    /* renamed from: b */
    public static final Object f334886b = new Object();

    /* renamed from: c */
    public static C111850k f334887c;

    /* renamed from: d */
    public static AttributeSet f334888d;

    /* renamed from: e */
    public static final C111843d f334889e = new C111843d();

    /* renamed from: f */
    public static volatile boolean f334890f;

    /* renamed from: g */
    public static volatile C111857b f334891g = new C111857b();

    /* renamed from: h */
    public static final HashMap<String, C38263m> f334892h = new HashMap<>();

    /* renamed from: i */
    public static final Stack<Integer> f334893i = new Stack<>();

    /* renamed from: wq3.q$a */
    public static final class C111856a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C111856a f334894d = new C111856a();

        public C111856a() {
            super(0);
        }

        public Object invoke() {
            C111848i d;
            int next;
            if (C111855q.f334887c == null) {
                synchronized (C111855q.f334886b) {
                    if (C111855q.f334887c == null) {
                        String str = MMApplicationContext.getSourcePackageName() + ".autogen.layout.BootX2CFactory";
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            Object newInstance = Class.forName(str).newInstance();
                            C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.view.x2c.IViewCreatorFactory");
                            C111855q.f334887c = (C111850k) newInstance;
                            Log.m105924i("MicroMsg.X2C", "init x2c factory success, cost:" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
                        } catch (Exception unused) {
                            Log.m105920e("MicroMsg.X2C", "create X2C Factory Fail className:" + str);
                        }
                    }
                    if (C111855q.f334888d == null) {
                        XmlResourceParser layout = MMApplicationContext.getContext().getResources().getLayout(C0966R.C0971layout.cl9);
                        C87412m.m108593f(layout, "getContext().resources.g…ayout(R.layout.empty_x2c)");
                        do {
                            next = layout.next();
                            if (next == 2 || next == 1) {
                                C111858c cVar = C111855q.f334885a;
                                C111855q.f334888d = Xml.asAttributeSet(layout);
                            }
                            next = layout.next();
                            break;
                        } while (next == 1);
                        C111858c cVar2 = C111855q.f334885a;
                        C111855q.f334888d = Xml.asAttributeSet(layout);
                    }
                    C79758p.f233760a.mo109886i(new C111853o());
                    C111850k kVar = C111855q.f334887c;
                    if (!(kVar == null || (d = kVar.mo163576d()) == null)) {
                        d.mo61583a();
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
            }
            C79758p.f233760a.mo109886i(new C111854p());
            C111858c.m152581a(C111855q.f334885a);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wq3.q$b */
    public static final class C111857b extends ThreadLocal<Boolean> {
        public Object initialValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: wq3.q$c */
    public static final class C111858c {
        /* renamed from: a */
        public static final void m152581a(C111858c cVar) {
            cVar.getClass();
            int f = C79758p.f233760a.mo109883f(new C107540b());
            Log.m105924i("MicroMsg.X2C", "updateX2COpenFlag exptFlag:" + true + " repairerFlag:" + f);
            if (f == 0) {
                Log.m105924i("MicroMsg.X2C", "openX2C");
                C111855q.f334890f = true;
            } else if (f == 1) {
                Log.m105924i("MicroMsg.X2C", "openX2C");
                C111855q.f334890f = true;
            } else if (f == 2) {
                Log.m105924i("MicroMsg.X2C", "closeX2C");
                C111855q.f334890f = false;
            }
        }

        /* renamed from: b */
        public final C111850k mo163608b() {
            C111850k kVar = C111855q.f334887c;
            return kVar == null ? C111855q.f334889e : kVar;
        }
    }

    static {
        C61926c.m72660E("MicroMsg.X2C", false, C111856a.f334894d);
    }
}

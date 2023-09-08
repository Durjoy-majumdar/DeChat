package qx0;

import android.content.Context;
import android.view.View;
import by0.C16825a;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19641z0;
import di3.C86312j;
import f40.C86709a0;
import fx0.C20733t;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kg3.C76577a;
import o40.C61926c;
import ob0.C89137b0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import zt3.C119157j;

/* renamed from: qx0.b */
public final class C22140b {

    /* renamed from: m */
    public static final C13601g<Boolean> f62638m = C36568h.m40985a(C22145a.f62656d);

    /* renamed from: a */
    public final Context f62639a;

    /* renamed from: b */
    public final C18412m3 f62640b;

    /* renamed from: c */
    public final HashMap<String, Boolean> f62641c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, Boolean> f62642d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, Boolean> f62643e = new HashMap<>();

    /* renamed from: f */
    public HashMap<String, C18412m3.C18414b> f62644f = new HashMap<>();

    /* renamed from: g */
    public int f62645g;

    /* renamed from: h */
    public boolean f62646h;

    /* renamed from: i */
    public boolean f62647i;

    /* renamed from: j */
    public final C13601g f62648j;

    /* renamed from: k */
    public final C13601g f62649k;

    /* renamed from: l */
    public boolean f62650l;

    /* renamed from: n */
    public boolean f62651n;

    /* renamed from: qx0.b$c */
    public static final class C22141c extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C22141c f62652d = new C22141c();

        public C22141c() {
            super(0);
        }

        public Object invoke() {
            int decodeInt = C19641z0.f55645a.mo25861d().decodeInt("ReSortBizMsgValidExposureAreaRatio");
            if (decodeInt < 10) {
                decodeInt = 10;
            }
            if (decodeInt > 50) {
                decodeInt = 50;
            }
            return Float.valueOf(((float) decodeInt) / 100.0f);
        }
    }

    /* renamed from: qx0.b$d */
    public static final class C22142d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C22142d f62653d = new C22142d();

        public C22142d() {
            super(0);
        }

        public Object invoke() {
            int decodeInt = C19641z0.f55645a.mo25861d().decodeInt("ReSortBizMsgValidExposurePeriod");
            if (decodeInt < 100) {
                decodeInt = 100;
            }
            if (decodeInt > 1000) {
                decodeInt = 1000;
            }
            return Long.valueOf((long) decodeInt);
        }
    }

    /* renamed from: qx0.b$e */
    public static final class C22143e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C22140b f62654d;

        /* renamed from: qx0.b$e$a */
        public static final class C22144a extends C87413o implements C32226l<Map.Entry<String, C18412m3.C18414b>, Boolean> {

            /* renamed from: B */
            public static final C22144a f62655B = new C22144a();

            public C22144a() {
                super(1);
            }

            public Object invoke(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                C87412m.m108594g(entry, "item");
                boolean z = true;
                if (((C18412m3.C18414b) entry.getValue()).f63851X0 != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C22143e(C22140b bVar) {
            this.f62654d = bVar;
        }

        public final void run() {
            C22140b bVar = this.f62654d;
            boolean z = false;
            bVar.f62646h = false;
            synchronized (C22140b.class) {
                HashMap<String, C18412m3.C18414b> hashMap = bVar.f62644f;
                if (hashMap == null || hashMap.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    LinkedList linkedList = new LinkedList();
                    for (Map.Entry<String, C18412m3.C18414b> value : bVar.f62644f.entrySet()) {
                        C18412m3.C18414b bVar2 = (C18412m3.C18414b) value.getValue();
                        if (bVar2.f63851X0 != 0 || !bVar.f62651n) {
                            if (!Util.isNullOrNil(bVar2.f51091f1)) {
                                C16825a aVar = C16825a.f45444a;
                                String str = bVar2.f51091f1;
                                C87412m.m108593f(str, "item.autoPlayVideoId");
                                bVar2.f63880x0 = aVar.mo17867e(str);
                                String str2 = bVar2.f51091f1;
                                C87412m.m108593f(str2, "item.autoPlayVideoId");
                                bVar2.f63882y0 = (int) aVar.mo17866d(str2);
                            }
                            linkedList.add(bVar2);
                        }
                    }
                    if (bVar.f62651n) {
                        Set<Map.Entry<String, C18412m3.C18414b>> entrySet = bVar.f62644f.entrySet();
                        C87412m.m108593f(entrySet, "sessionItemCache.entries");
                        C61926c.m72674S(entrySet, C22144a.f62655B);
                    } else {
                        bVar.f62644f.clear();
                    }
                    Log.m105924i("MicroMsg.BizTimeLineExposeHelper", "reportExpose size = " + linkedList.size());
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    C18412m3 m3Var = bVar.f62640b;
                    b0Var.mo123460f(new C20733t(linkedList, m3Var.f51067a, m3Var.f51068b, m3Var.f51069c, m3Var.f51070d, 1, 0, m3Var.f51071e));
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
        }
    }

    /* renamed from: qx0.b$a */
    public static final class C22145a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C22145a f62656d = new C22145a();

        public C22145a() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_tl_first_screen_card_info_report, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: qx0.b$b */
    public static final class C22146b {
        public C22146b(C8480h hVar) {
        }
    }

    static {
        new C22146b((C8480h) null);
    }

    public C22140b(Context context, C18412m3 m3Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(m3Var, "report");
        this.f62639a = context;
        this.f62640b = m3Var;
        this.f62645g = (C76577a.m92159j(context) - C75044y4.m89989a(context)) - C75044y4.m89994f(context);
        this.f62648j = C36568h.m40985a(C22141c.f62652d);
        this.f62649k = C36568h.m40985a(C22142d.f62653d);
        this.f62650l = true;
        this.f62651n = true;
        m3Var.f51079m = this;
    }

    /* renamed from: a */
    public final void mo35254a(boolean z) {
        this.f62651n = z;
        if (!this.f62646h) {
            this.f62646h = true;
            ((C119157j) C119157j.f356862d).mo183879j(new C22143e(this), 1000, "BizTimeLineExpose");
        }
    }

    /* renamed from: b */
    public final void mo35255b(View view) {
        if (view != null && view.getBottom() > 0 && view.getBottom() <= C76577a.m92159j(this.f62639a)) {
            this.f62645g = view.getBottom();
            Log.m105918d("MicroMsg.BizTimeLineExposeHelper", "updateContentBottom contentBottom=" + this.f62645g);
        }
    }
}

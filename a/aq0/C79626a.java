package aq0;

import a14.C53872d1;
import a14.C53895h;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k40.C88076b;
import kotlin.Result;
import kotlin.ResultKt;
import lp3.C46888b;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import p1058wb.C90904a;
import p156gj.C87203t;
import p224ra.C12964b;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C101820nt3;
import te3.C49335eu3;
import te3.C90417ia;
import wm0.C91035a;
import wx3.C15601d;
import xx3.C66447b;
import zp0.C16377l;
import zp0.C91829i;

/* renamed from: aq0.a */
public final class C79626a implements C16377l, C88076b {

    /* renamed from: j */
    public static final Map<String, Integer> f233494j = C90364q0.m113147f(new C13604l("/cgi-bin/mmbiz-bin/js-authorize", 1157), new C13604l("/cgi-bin/mmbiz-bin/js-authorize-confirm", Integer.valueOf(C91035a.CTRL_INDEX)), new C13604l("/cgi-bin/mmbiz-bin/js-operatewxdata", 1133));

    /* renamed from: d */
    public final C81879g f233495d;

    /* renamed from: e */
    public final C16377l f233496e;

    /* renamed from: f */
    public final C13601g f233497f = C36568h.m40985a(new C79627b(this));

    /* renamed from: g */
    public final AtomicInteger f233498g = new AtomicInteger(1);

    /* renamed from: h */
    public final ConcurrentHashMap<Integer, C54287a> f233499h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public final C79628d f233500i = new C79628d(this, Looper.getMainLooper());

    /* renamed from: aq0.a$a */
    public static final class C54287a {

        /* renamed from: a */
        public final C53916l<C49335eu3> f152374a;

        /* renamed from: b */
        public final Class<? super C49335eu3> f152375b;

        public C54287a(C53916l<? super C49335eu3> lVar, Class<? super C49335eu3> cls) {
            C87412m.m108594g(lVar, "continuation");
            C87412m.m108594g(cls, "respClazz");
            this.f152374a = lVar;
            this.f152375b = cls;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54287a)) {
                return false;
            }
            C54287a aVar = (C54287a) obj;
            return C87412m.m108589b(this.f152374a, aVar.f152374a) && C87412m.m108589b(this.f152375b, aVar.f152375b);
        }

        public int hashCode() {
            return (this.f152374a.hashCode() * 31) + this.f152375b.hashCode();
        }

        public String toString() {
            return "RequestContext(continuation=" + this.f152374a + ", respClazz=" + this.f152375b + ')';
        }
    }

    /* renamed from: aq0.a$c */
    public static final class C54288c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C79626a f152376a;

        /* renamed from: b */
        public final /* synthetic */ String f152377b;

        /* renamed from: c */
        public final /* synthetic */ C47465a f152378c;

        /* renamed from: d */
        public final /* synthetic */ Class<Resp> f152379d;

        /* renamed from: e */
        public final /* synthetic */ String f152380e;

        public C54288c(C79626a aVar, String str, C47465a aVar2, Class<Resp> cls, String str2) {
            this.f152376a = aVar;
            this.f152377b = str;
            this.f152378c = aVar2;
            this.f152379d = cls;
            this.f152380e = str2;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C46888b c = C88643g.m110545c();
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C54289b(this.f152376a, this.f152377b, this.f152378c, this.f152379d, c, this.f152380e, (C15601d<? super C54289b>) null), 2, (Object) null);
            return null;
        }
    }

    /* renamed from: aq0.a$b */
    public static final class C79627b extends C87413o implements C32224a<C90417ia> {

        /* renamed from: d */
        public final /* synthetic */ C79626a f233501d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79627b(C79626a aVar) {
            super(0);
            this.f233501d = aVar;
        }

        public Object invoke() {
            C90417ia iaVar = new C90417ia();
            C81879g gVar = this.f233501d.f233495d;
            C87412m.m108594g(gVar, "<this>");
            AppBrandInitConfig W = gVar.getRuntime().mo113036W();
            C87412m.m108593f(W, "this.runtime.initConfig");
            AppBrandInitConfigLU appBrandInitConfigLU = W instanceof AppBrandInitConfigLU ? (AppBrandInitConfigLU) W : null;
            iaVar.f259571e = appBrandInitConfigLU != null ? appBrandInitConfigLU.f234818T : 0;
            iaVar.f259573g = BuildInfo.CLIENT_VERSION_INT;
            String i = C87203t.m108273i();
            C87412m.m108593f(i, "getMMDeviceId()");
            Charset charset = StandardCharsets.UTF_8;
            C87412m.m108593f(charset, "UTF_8");
            byte[] bytes = i.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            C89349b a = C89349b.m111674a(bytes);
            a.mo123701d(Math.min(a.f257327a.length, 16));
            iaVar.f259572f = a;
            Charset charset2 = StandardCharsets.UTF_8;
            C87412m.m108593f(charset2, "UTF_8");
            byte[] bytes2 = ("android-" + Build.VERSION.SDK_INT).getBytes(charset2);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            C89349b a2 = C89349b.m111674a(bytes2);
            a2.mo123701d(Math.min(a2.f257327a.length, 132));
            iaVar.f259574h = a2;
            iaVar.f259570d = C89349b.m111674a(new byte[0]);
            iaVar.f259575i = 0;
            return iaVar;
        }
    }

    /* renamed from: aq0.a$d */
    public static final class C79628d extends MMHandler {

        /* renamed from: a */
        public final long f233502a = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;

        /* renamed from: b */
        public final int f233503b = 1;

        /* renamed from: c */
        public final /* synthetic */ C79626a f233504c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79628d(C79626a aVar, Looper looper) {
            super(looper);
            this.f233504c = aVar;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if ((message != null ? message.what : 0) == this.f233503b) {
                C87412m.m108591d(message);
                Object obj = message.obj;
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                if (num != null) {
                    int intValue = num.intValue();
                    Log.m105924i("Luggage.CgiServiceImplByLibServer", "timeout for requestId:" + intValue);
                    this.f233504c.mo109768d(intValue);
                }
            }
        }
    }

    public C79626a(C81879g gVar) {
        C87412m.m108594g(gVar, "appBrandComponent");
        this.f233495d = gVar;
        C12964b l = gVar.mo109668l(C16377l.class);
        C87412m.m108591d(l);
        this.f233496e = (C16377l) l;
    }

    /* renamed from: c */
    public static final Object m96703c(C79626a aVar, String str, C47465a aVar2, Class cls, C15601d dVar) {
        int andIncrement = aVar.f233498g.getAndIncrement();
        if (aVar2 instanceof C101820nt3) {
            C101820nt3 nt32 = (C101820nt3) aVar2;
            if (nt32.BaseRequest == null) {
                nt32.setBaseRequest((C90417ia) ((C36570n) aVar.f233497f).getValue());
            }
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        aVar.f233499h.put(new Integer(andIncrement), new C54287a(mVar, cls));
        try {
            C90904a.C90905a aVar3 = C90904a.f260895i;
            C81879g gVar = aVar.f233495d;
            Integer num = f233494j.get(str);
            C87412m.m108591d(num);
            aVar3.mo124993a(gVar, andIncrement, num.intValue(), aVar2);
        } catch (C91829i e) {
            Result.Companion companion = Result.Companion;
            mVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(e)));
        }
        C79628d dVar2 = aVar.f233500i;
        int i = dVar2.f233503b;
        C87412m.m108592e(Integer.valueOf(andIncrement), "null cannot be cast to non-null type kotlin.Any");
        dVar2.sendMessageDelayed(dVar2.obtainMessage(i, Integer.valueOf(andIncrement)), dVar2.f233502a);
        return mVar.mo74608o();
    }

    /* renamed from: YQ */
    public <Resp extends C49335eu3> C88629c<Resp> mo14840YQ(String str, String str2, C47465a aVar, Class<Resp> cls) {
        if (!f233494j.keySet().contains(str == null ? "" : str) || aVar == null || cls == null) {
            C88633e eVar = new C88633e();
            eVar.mo123076s((C88629c.C88630a) null);
            return eVar;
        }
        C88629c<Resp> d = ((C88633e) C88643g.m110546d()).mo123061d(new C54288c(this, str, aVar, cls, str2));
        C87412m.m108593f(d, "override fun <Resp : Res…next null\n        }\n    }");
        return d;
    }

    /* renamed from: a */
    public void mo109766a() {
        this.f233500i.removeCallbacksAndMessages((Object) null);
        Collection<C54287a> values = this.f233499h.values();
        C87412m.m108593f(values, "pendingRequests.values");
        for (C54287a aVar : values) {
            if (aVar.f152374a.mo74597a()) {
                C53916l.C53917a.m60514a(aVar.f152374a, (Throwable) null, 1, (Object) null);
            }
        }
        this.f233499h.clear();
    }

    /* renamed from: b */
    public void mo109767b() {
    }

    /* renamed from: d */
    public final void mo109768d(int i) {
        C53916l<C49335eu3> lVar;
        C54287a remove = this.f233499h.remove(Integer.valueOf(i));
        if (remove == null || (lVar = remove.f152374a) == null) {
            Log.m105920e("Luggage.CgiServiceImplByLibServer", "callbackUnsupported missing continuation for requestId:" + i);
            return;
        }
        Log.m105924i("Luggage.CgiServiceImplByLibServer", "callback 'Unsupported cgi' for requestId:" + i);
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C91829i(C91829i.C91830a.TRANSFER, -1, "Unsupported cgi"))));
    }
}

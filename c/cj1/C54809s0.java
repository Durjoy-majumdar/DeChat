package cj1;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58291w0;
import er1.C58730g5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import m53.C10756c;
import pe3.C89349b;
import qj1.C12360e8;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13621b;
import s43.C13622c;
import s43.C13624e;
import te3.C51354t71;

/* renamed from: cj1.s0 */
public final class C54809s0 implements C58291w0.C58292a {

    /* renamed from: a */
    public final /* synthetic */ int f153644a;

    /* renamed from: b */
    public final /* synthetic */ C12360e8.C12371d f153645b;

    /* renamed from: c */
    public final /* synthetic */ String f153646c;

    /* renamed from: d */
    public final /* synthetic */ Context f153647d;

    /* renamed from: e */
    public final /* synthetic */ int f153648e;

    /* renamed from: f */
    public final /* synthetic */ String f153649f;

    /* renamed from: g */
    public final /* synthetic */ int f153650g;

    /* renamed from: h */
    public final /* synthetic */ String f153651h;

    /* renamed from: cj1.s0$a */
    public static final class C54810a extends C87413o implements C32226l<C13621b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12360e8.C12371d f153652d;

        /* renamed from: e */
        public final /* synthetic */ String f153653e;

        /* renamed from: f */
        public final /* synthetic */ int f153654f;

        /* renamed from: g */
        public final /* synthetic */ String f153655g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54810a(C12360e8.C12371d dVar, String str, int i, String str2) {
            super(1);
            this.f153652d = dVar;
            this.f153653e = str;
            this.f153654f = i;
            this.f153655g = str2;
        }

        public Object invoke(Object obj) {
            C13621b bVar = (C13621b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            Log.m105924i("FinderLiveAssistant2", "[WeCoin] consumeImpl onSuccess");
            C12360e8.C12371d dVar = this.f153652d;
            if (dVar != null) {
                C12360e8.C12371d.C12372a.m11940a(dVar, true, 0, C12360e8.C12371d.C12373b.OK, this.f153653e, Long.valueOf(bVar.f38589a), this.f153654f, this.f153655g, (String) null, (C58291w0) null, 384, (Object) null);
            }
            C58730g5 g5Var = C58730g5.f168158a;
            C115669n.INSTANCE.mo175912v(C58730g5.f168165h, 79);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.s0$b */
    public static final class C54811b extends C87413o implements C32226l<C13620a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12360e8.C12371d f153656d;

        /* renamed from: e */
        public final /* synthetic */ String f153657e;

        /* renamed from: f */
        public final /* synthetic */ int f153658f;

        /* renamed from: g */
        public final /* synthetic */ String f153659g;

        /* renamed from: cj1.s0$b$a */
        public /* synthetic */ class C0594a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1405a;

            static {
                int[] iArr = new int[C13622c.values().length];
                iArr[1] = 1;
                f1405a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54811b(C12360e8.C12371d dVar, String str, int i, String str2) {
            super(1);
            this.f153656d = dVar;
            this.f153657e = str;
            this.f153658f = i;
            this.f153659g = str2;
        }

        public Object invoke(Object obj) {
            C13620a aVar = (C13620a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            Log.m105924i("FinderLiveAssistant2", "[WeCoin] consumeImpl onFailed errorType:" + aVar.f38588a);
            int i = C0594a.f1405a[aVar.f38588a.ordinal()] == 1 ? 10003 : 10008;
            C12360e8.C12371d dVar = this.f153656d;
            if (dVar != null) {
                C12360e8.C12371d.C12372a.m11940a(dVar, false, i, C12360e8.C12371d.C12373b.WECOIN, this.f153657e, (Long) null, this.f153658f, this.f153659g, (String) null, (C58291w0) null, 400, (Object) null);
            }
            C58730g5 g5Var = C58730g5.f168158a;
            C115669n.INSTANCE.mo175912v(C58730g5.f168165h, 81);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.s0$c */
    public static final class C54812c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12360e8.C12371d f153660d;

        /* renamed from: e */
        public final /* synthetic */ String f153661e;

        /* renamed from: f */
        public final /* synthetic */ int f153662f;

        /* renamed from: g */
        public final /* synthetic */ String f153663g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54812c(C12360e8.C12371d dVar, String str, int i, String str2) {
            super(0);
            this.f153660d = dVar;
            this.f153661e = str;
            this.f153662f = i;
            this.f153663g = str2;
        }

        public Object invoke() {
            Log.m105924i("FinderLiveAssistant2", "[WeCoin] doPostGift consumeGift onCancel errorType");
            C12360e8.C12371d dVar = this.f153660d;
            if (dVar != null) {
                C12360e8.C12371d.C12372a.m11940a(dVar, false, -3, C12360e8.C12371d.C12373b.WECOIN, this.f153661e, (Long) null, this.f153662f, this.f153663g, (String) null, (C58291w0) null, 400, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C54809s0(int i, C12360e8.C12371d dVar, String str, Context context, int i2, String str2, int i3, String str3) {
        this.f153644a = i;
        this.f153645b = dVar;
        this.f153646c = str;
        this.f153647d = context;
        this.f153648e = i2;
        this.f153649f = str2;
        this.f153650g = i3;
        this.f153651h = str3;
    }

    /* renamed from: a */
    public void mo75770a(int i, int i2, String str, C51354t71 t712) {
        int i3 = i2;
        String str2 = str;
        C51354t71 t713 = t712;
        C87412m.m108594g(t713, "resp");
        Log.m105924i("FinderLiveAssistant2", "doPostGift errType:" + i + ", errCode:" + i3 + ", errMsg:" + str2 + ", bill_no:" + t713.f142015d);
        C58730g5.f168158a.mo83650d(this.f153644a);
        if (i3 == 0 || i3 == -200042) {
            Context context = this.f153647d;
            int i4 = this.f153648e;
            String str3 = this.f153646c;
            C89349b bVar = t713.f142016e;
            byte[] f = bVar != null ? bVar.mo123703f() : null;
            C54810a aVar = new C54810a(this.f153645b, this.f153649f, this.f153650g, this.f153651h);
            C54811b bVar2 = new C54811b(this.f153645b, this.f153649f, this.f153650g, this.f153651h);
            C54812c cVar = new C54812c(this.f153645b, this.f153649f, this.f153650g, this.f153651h);
            Log.m105924i("FinderLiveAssistant2", "[WeCoin] sessionID:" + str3 + " consumeGift:" + f + " businessId:" + i4);
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C13624e eVar = new C13624e(1, (FragmentActivity) context, aVar, bVar2, cVar);
            if (f == null) {
                f = new byte[0];
            }
            eVar.f38603g = f;
            ((C10756c) C86709a0.m107533q(C10756c.class)).mo10992Gy(eVar);
            return;
        }
        C12360e8.C12371d dVar = this.f153645b;
        if (dVar != null) {
            C12360e8.C12371d.C12372a.m11940a(dVar, false, i2, C12360e8.C12371d.C12373b.NETWORK, (String) null, (Long) null, 0, (String) null, str, (C58291w0) null, 272, (Object) null);
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(22129, 1, this.f153646c, "", 1, 3, Integer.valueOf(i2), str2);
        nVar.mo175912v(C58730g5.f168165h, 80);
    }
}

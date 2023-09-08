package p53;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.api.IAPMidasPayCallBack;
import com.tencent.midas.api.request.APMidasGameRequest;
import com.tencent.midas.api.request.APMidasGoodsRequest;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import hp3.C87581a;
import java.util.UUID;
import jp3.C9487b;
import l31.C61212e;
import m53.C10761g;
import m53.C10762h;
import m53.C10765k;
import n53.C11118a;
import n53.C11123f;
import n53.C11130m;
import nr3.C89059e;
import ob0.C89132b;
import qo3.C89779i0;
import r53.C12953c;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C48777ax2;
import te3.C49335eu3;
import te3.C49424fh3;
import te3.C49562gh3;
import te3.C49851ii2;
import te3.C51779w32;
import te3.e35;
import zt3.C119157j;

/* renamed from: p53.y */
public final class C11862y {

    /* renamed from: e */
    public static final C11862y f34681e = C11864b.f34689a;

    /* renamed from: a */
    public C48777ax2 f34682a;

    /* renamed from: b */
    public boolean f34683b;

    /* renamed from: c */
    public C89779i0 f34684c;

    /* renamed from: d */
    public C11130m f34685d;

    /* renamed from: p53.y$a */
    public static final class C11863a implements IAPMidasPayCallBack {

        /* renamed from: a */
        public final String f34686a;

        /* renamed from: b */
        public final C10761g f34687b;

        /* renamed from: c */
        public final String f34688c;

        public C11863a(String str, C10761g gVar, String str2) {
            C87412m.m108594g(gVar, "info");
            C87412m.m108594g(str2, "uniqueID");
            this.f34686a = str;
            this.f34687b = gVar;
            this.f34688c = str2;
        }

        public void MidasPayCallBack(APMidasResponse aPMidasResponse) {
            if (aPMidasResponse != null) {
                Log.m105924i("MicroMsg.WeCoinMidasInitializer", "MidasPayCallBack: resultCode: " + aPMidasResponse.resultCode + ", resultMsg: " + aPMidasResponse.resultMsg + ", realSaveNum: " + aPMidasResponse.realSaveNum + ", payChannel: " + aPMidasResponse.payChannel + ", payState: " + aPMidasResponse.payState + ",provideState: " + aPMidasResponse.provideState);
                int i = aPMidasResponse.resultCode;
                if (i == 0) {
                    mo11744a(4, 3, i, aPMidasResponse.resultMsg);
                    C115669n.INSTANCE.mo175911u(1581, 24);
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("pay_coin_success", (Object) null, C90364q0.m113147f(new C13604l("coin_report_session_id", C10765k.f32240b), new C13604l("coin_business_id", Integer.valueOf(C10765k.f32239a))), 25955);
                    C10762h<Void> hVar = this.f34687b.f32225d;
                    if (hVar != null) {
                        hVar.onSuccess(null);
                    }
                } else if (i != 2) {
                    C10762h<Void> hVar2 = this.f34687b.f32225d;
                    if (hVar2 != null) {
                        hVar2.mo605a(3, i, aPMidasResponse.resultMsg);
                    }
                    mo11744a(4, 3, aPMidasResponse.resultCode, aPMidasResponse.resultMsg);
                    C115669n.INSTANCE.mo175911u(1581, 25);
                } else {
                    mo11744a(4, 3, i, aPMidasResponse.resultMsg);
                    C115669n.INSTANCE.mo175911u(1581, 26);
                    String str = this.f34686a;
                    if (!(str == null || str.length() == 0)) {
                        mo11744a(5, 1, 0, "");
                        new C11118a(str).mo9225i().mo123064p(new C11861x(this));
                    }
                    C10762h<Void> hVar3 = this.f34687b.f32225d;
                    if (hVar3 != null) {
                        hVar3.mo605a(3, -3, aPMidasResponse.resultMsg);
                    }
                }
            }
        }

        public void MidasPayNeedLogin() {
            Log.m105924i("MicroMsg.WeCoinMidasInitializer", "Midas pay need login:");
        }

        /* renamed from: a */
        public final void mo11744a(int i, int i2, int i3, String str) {
            C115669n.INSTANCE.mo160131h(22129, Integer.valueOf(C12953c.m12394c(this.f34687b.f32222a)), this.f34687b.f32224c, this.f34688c, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        }
    }

    /* renamed from: p53.y$b */
    public static final class C11864b {

        /* renamed from: a */
        public static final C11862y f34689a = new C11862y((C8480h) null);
    }

    /* renamed from: p53.y$c */
    public static final class C11865c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10762h<Boolean> f34690d;

        public C11865c(C10762h<Boolean> hVar) {
            this.f34690d = hVar;
        }

        public final void run() {
            C10762h<Boolean> hVar = this.f34690d;
            if (hVar != null) {
                hVar.onSuccess(Boolean.TRUE);
            }
        }
    }

    /* renamed from: p53.y$d */
    public static final class C11866d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C10762h<Boolean> f34691a;

        /* renamed from: b */
        public final /* synthetic */ C11862y f34692b;

        /* renamed from: c */
        public final /* synthetic */ Context f34693c;

        public C11866d(C10762h<Boolean> hVar, C11862y yVar, Context context) {
            this.f34691a = hVar;
            this.f34692b = yVar;
            this.f34693c = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105924i("MicroMsg.WeCoinMidasInitializer", "CgiGetMidasSdkInfoRequest errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
            if (C12953c.m12398g(cVar)) {
                C10762h<Boolean> hVar = this.f34691a;
                if (hVar != null) {
                    hVar.mo605a(cVar.f256793a, cVar.f256794b, cVar.f256795c);
                }
            } else {
                T t = cVar.f256796d;
                if (t == null) {
                    C10762h<Boolean> hVar2 = this.f34691a;
                    if (hVar2 != null) {
                        hVar2.mo605a(3, -2, "");
                    }
                } else {
                    C48777ax2 ax22 = ((C51779w32) t).f143844d;
                    if (ax22 != null) {
                        C11862y yVar = this.f34692b;
                        Context context = this.f34693c;
                        C10762h<Boolean> hVar3 = this.f34691a;
                        C12953c.m12402k("MicroMsg.WeCoinMidasInitializer", t);
                        yVar.f34682a = ax22;
                        yVar.mo11736b(context, ax22);
                        if (hVar3 != null) {
                            hVar3.onSuccess(Boolean.TRUE);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p53.y$e */
    public static final class C11867e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C11862y f34694a;

        /* renamed from: b */
        public final /* synthetic */ Activity f34695b;

        /* renamed from: c */
        public final /* synthetic */ C10761g f34696c;

        /* renamed from: d */
        public final /* synthetic */ int f34697d;

        /* renamed from: e */
        public final /* synthetic */ String f34698e;

        /* renamed from: f */
        public final /* synthetic */ String f34699f;

        /* renamed from: g */
        public final /* synthetic */ C49424fh3 f34700g;

        public C11867e(C11862y yVar, Activity activity, C10761g gVar, int i, String str, String str2, C49424fh3 fh32) {
            this.f34694a = yVar;
            this.f34695b = activity;
            this.f34696c = gVar;
            this.f34697d = i;
            this.f34698e = str;
            this.f34699f = str2;
            this.f34700g = fh32;
        }

        public Object call(Object obj) {
            C49851ii2 ii22;
            C11862y yVar;
            String str;
            int i;
            String str2;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105924i("MicroMsg.WeCoinMidasInitializer", "prepareWecoinRecharge errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
            C11862y yVar2 = this.f34694a;
            yVar2.f34685d = null;
            yVar2.mo11741g(this.f34695b, false);
            if (C12953c.m12398g(cVar)) {
                T t = cVar.f256796d;
                C49562gh3 gh32 = (C49562gh3) t;
                if (gh32 == null || (ii22 = gh32.f134056h) == null) {
                    C11862y.m11534a(this.f34694a, this.f34695b, new C11828a(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C49335eu3) null, 8, (C8480h) null), this.f34696c.f32225d);
                    this.f34694a.mo11740f(this.f34697d, this.f34698e, this.f34699f, 3, 3, cVar.f256794b, cVar.f256795c);
                    C115669n.INSTANCE.mo175911u(1581, 22);
                } else {
                    C49424fh3 fh32 = this.f34700g;
                    C11862y yVar3 = this.f34694a;
                    Activity activity = this.f34695b;
                    C10761g gVar = this.f34696c;
                    String str3 = this.f34699f;
                    int i2 = this.f34697d;
                    String str4 = this.f34698e;
                    C87412m.m108593f(t, "cgiBack.resp");
                    C12953c.m12402k("MicroMsg.WeCoinMidasInitializer", t);
                    e35 e35 = new e35();
                    e35.f132669d = fh32.f133500d;
                    C49562gh3 gh33 = (C49562gh3) cVar.f256796d;
                    C11834d dVar = new C11834d(gh33, e35);
                    C10762h<Void> hVar = gVar.f32225d;
                    yVar3.getClass();
                    Log.m105918d("MicroMsg.WeCoinMidasInitializer", "handleInterceptWinInfo: " + dVar);
                    if (gh33 != null) {
                        C49562gh3 gh34 = gh33;
                        String str5 = e35.f132669d;
                        str2 = str4;
                        i = i2;
                        str = str3;
                        yVar = yVar3;
                        C12953c.m12396e(activity, gh34.f134056h, new C11869z(str5, yVar3, activity, gh34, gVar, str, hVar));
                    } else {
                        str2 = str4;
                        i = i2;
                        str = str3;
                        yVar = yVar3;
                    }
                    yVar.mo11740f(i, str2, str, 3, 3, cVar.f256794b, ii22.f135362d);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175911u(1581, 27);
                    nVar.mo175911u(1581, 22);
                }
            } else {
                T t2 = cVar.f256796d;
                if (t2 == null) {
                    Log.m105920e("MicroMsg.WeCoinMidasInitializer", "cgiBack.resp is null");
                    C11862y.m11534a(this.f34694a, this.f34695b, new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null), this.f34696c.f32225d);
                    this.f34694a.mo11740f(this.f34697d, this.f34698e, this.f34699f, 3, 3, 3, "callback resp is null");
                    C115669n.INSTANCE.mo175911u(1581, 22);
                } else {
                    C49562gh3 gh35 = (C49562gh3) t2;
                    C10761g gVar2 = this.f34696c;
                    C11862y yVar4 = this.f34694a;
                    int i3 = this.f34697d;
                    String str6 = this.f34698e;
                    String str7 = this.f34699f;
                    Activity activity2 = this.f34695b;
                    Log.m105924i("MicroMsg.WeCoinMidasInitializer", "prepareWecoinRecharge, product_id: " + gVar2.f32227f);
                    C12953c.m12402k("MicroMsg.WeCoinMidasInitializer", gh35);
                    yVar4.mo11740f(i3, str6, str7, 3, 3, 0, "");
                    C115669n.INSTANCE.mo175911u(1581, 21);
                    yVar4.mo11739e(activity2, gh35, "release", gVar2, str7);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: p53.y$f */
    public static final class C11868f implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f34701d;

        /* renamed from: e */
        public final /* synthetic */ C11862y f34702e;

        public C11868f(Activity activity, C11862y yVar) {
            this.f34701d = activity;
            this.f34702e = yVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            if (!this.f34701d.isFinishing() && !this.f34701d.isDestroyed()) {
                C11862y yVar = this.f34702e;
                yVar.getClass();
                Log.m105924i("MicroMsg.WeCoinMidasInitializer", "cancelPrepareRecharge, mPrepareCgi: " + yVar.f34685d);
                C11130m mVar = yVar.f34685d;
                if (mVar != null) {
                    mVar.mo85581g();
                }
                this.f34701d.finish();
            }
            C11862y yVar2 = this.f34702e;
            C89779i0 i0Var = yVar2.f34684c;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
                yVar2.f34684c = null;
            }
        }
    }

    public C11862y(C8480h hVar) {
        APMidasPayAPI.setLogCallback(MidasPayLogCallbackImpl.class);
    }

    /* renamed from: a */
    public static final void m11534a(C11862y yVar, Activity activity, C11828a aVar, C10762h hVar) {
        yVar.getClass();
        Log.m105918d("MicroMsg.WeCoinMidasInitializer", "showErrorMsg: " + aVar);
        C12953c.m12395d(activity, aVar, new C11829a0(aVar, hVar));
    }

    /* renamed from: b */
    public final void mo11736b(Context context, C48777ax2 ax22) {
        Log.m105924i("MicroMsg.WeCoinMidasInitializer", "is midas sdk already initialized: " + this.f34683b);
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wecoin_init_midas_sdk_once, 1);
        Log.m105925i("MicroMsg.WeCoinUtils", "isMidasInitOnceABTest, %s", Integer.valueOf(Qe));
        if (!(Qe != 0) || !this.f34683b) {
            APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
            aPMidasGameRequest.offerId = ax22.f130830d;
            aPMidasGameRequest.openId = ax22.f130831e;
            aPMidasGameRequest.openKey = ax22.f130832f;
            aPMidasGameRequest.sessionId = ax22.f130833g;
            aPMidasGameRequest.sessionType = ax22.f130834h;
            aPMidasGameRequest.f343435pf = ax22.f130835i;
            aPMidasGameRequest.pfKey = ax22.f130836j;
            aPMidasGameRequest.reserv = "enableX5=0";
            APMidasPayAPI.setEnv("release");
            APMidasPayAPI.setLogEnable(false);
            APMidasPayAPI.setLogCallback(MidasPayLogCallbackImpl.class);
            APMidasPayAPI.init(context, aPMidasGameRequest);
            this.f34683b = true;
        }
    }

    /* renamed from: c */
    public final void mo11737c(Context context, C10762h<Boolean> hVar) {
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MicroMsg.WeCoinMidasInitializer", "initSDK.");
        C48777ax2 ax22 = this.f34682a;
        if (ax22 != null) {
            Log.m105924i("MicroMsg.WeCoinMidasInitializer", "initSDK already initialized.");
            mo11736b(context, ax22);
            ((C119157j) C119157j.f356862d).mo183895z(new C11865c(hVar));
            return;
        }
        C89059e B = new C11123f().mo9225i().mo123062e(new C11866d(hVar, this, context));
        if (context instanceof MMActivity) {
            B.mo11397F((C9487b) context);
        }
    }

    /* renamed from: d */
    public final void mo11738d(Activity activity, C10761g gVar) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(gVar, "info");
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "uuid.toString()");
        String str = gVar.f32224c;
        String str2 = str == null ? uuid : str;
        mo11741g(activity, true);
        int c = C12953c.m12394c(gVar.f32222a);
        mo11740f(c, str2, uuid, 3, 1, 0, "");
        C115669n.INSTANCE.mo175911u(1581, 20);
        C49424fh3 fh32 = new C49424fh3();
        fh32.f133504h = gVar.f32223b;
        fh32.f133500d = uuid;
        fh32.f133501e = gVar.f32227f;
        fh32.f133502f = gVar.f32226e;
        fh32.f133507n = gVar.f32222a;
        fh32.f133508o = str2;
        fh32.f133503g = gVar.f32229h;
        fh32.f133505i = gVar.f32232k;
        fh32.f133506j = gVar.f32233l;
        C11130m mVar = new C11130m(fh32);
        this.f34685d = mVar;
        C89059e i = mVar.mo9225i();
        if (i != null) {
            i.mo123062e(new C11867e(this, activity, gVar, c, str2, uuid, fh32));
        }
    }

    /* renamed from: e */
    public final void mo11739e(Activity activity, C49562gh3 gh32, String str, C10761g gVar, String str2) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(gh32, "response");
        C87412m.m108594g(str, "env");
        C87412m.m108594g(gVar, "info");
        C87412m.m108594g(str2, "uniqueId");
        if (gh32.f134052d != null) {
            String str3 = gh32.f134054f;
            if (!(str3 == null || str3.length() == 0)) {
                APMidasGoodsRequest aPMidasGoodsRequest = new APMidasGoodsRequest();
                C48777ax2 ax22 = gh32.f134052d;
                aPMidasGoodsRequest.offerId = ax22.f130830d;
                aPMidasGoodsRequest.openId = ax22.f130831e;
                aPMidasGoodsRequest.openKey = ax22.f130832f;
                aPMidasGoodsRequest.sessionId = ax22.f130833g;
                aPMidasGoodsRequest.sessionType = ax22.f130834h;
                aPMidasGoodsRequest.f343435pf = ax22.f130835i;
                aPMidasGoodsRequest.pfKey = ax22.f130836j;
                aPMidasGoodsRequest.zoneId = "1";
                aPMidasGoodsRequest.goodsTokenUrl = gh32.f134054f;
                aPMidasGoodsRequest.mpInfo.payChannel = "wechat";
                APMidasPayAPI.setLogEnable(false);
                APMidasPayAPI.setEnv(str);
                aPMidasGoodsRequest.tokenType = 1;
                aPMidasGoodsRequest.prodcutId = gVar.f32227f;
                aPMidasGoodsRequest.saveValue = gh32.f134055g;
                int c = C12953c.m12394c(gVar.f32222a);
                String str4 = gVar.f32224c;
                C87412m.m108593f(str4, "info.sceneSessionID");
                mo11740f(c, str4, str2, 4, 1, 0, "");
                C115669n.INSTANCE.mo175911u(1581, 23);
                APMidasPayAPI.launchPay(activity, aPMidasGoodsRequest, new C11863a(gh32.f134053e, gVar, str2));
                return;
            }
        }
        Log.m105920e("MicroMsg.WeCoinMidasInitializer", "rechargeByMidasSDK param error.");
    }

    /* renamed from: f */
    public final void mo11740f(int i, String str, String str2, int i2, int i3, int i4, String str3) {
        C115669n.INSTANCE.mo160131h(22129, Integer.valueOf(i), str, str2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3);
    }

    /* renamed from: g */
    public final void mo11741g(Activity activity, boolean z) {
        C89779i0 i0Var;
        Log.m105918d("MicroMsg.WeCoinMidasInitializer", "showProgressDialog: " + z);
        if (z) {
            i0Var = C89779i0.m112248e(activity, activity.getString(C0966R.string.gas), true, 3, new C11868f(activity, this));
        } else {
            C89779i0 i0Var2 = this.f34684c;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            i0Var = null;
        }
        this.f34684c = i0Var;
    }
}

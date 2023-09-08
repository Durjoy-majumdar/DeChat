package vp2;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.openim.model.OpenImKefuStartChattingResultReceiver;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import he0.C46025n;
import he0.C59837i;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import lp2.C61333b;
import nj3.C76879j;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C101820nt3;
import te3.C49810i73;
import te3.C50766p10;
import te3.C50899q10;
import te3.C51195s3;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: vp2.h */
public final class C65842h {

    /* renamed from: a */
    public static final C65842h f189343a = new C65842h();

    /* renamed from: b */
    public static C0000n0 f189344b;

    /* renamed from: vp2.h$a */
    public static final class C65843a implements OpenImKefuStartChattingResultReceiver.C40388a {

        /* renamed from: a */
        public final /* synthetic */ boolean f189345a;

        public C65843a(boolean z) {
            this.f189345a = z;
        }

        /* renamed from: a */
        public void mo63102a(Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpToWxKefuPage$1");
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("result_key_action")) : null;
            int i = 3;
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                C115669n nVar = C115669n.INSTANCE;
                if (!this.f189345a) {
                    i = 8;
                }
                nVar.mo175911u(1903, i);
            } else {
                C115669n.INSTANCE.mo175911u(1903, this.f189345a ? 4 : 9);
            }
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            Log.m105925i("AdJumpWxKefuClick", "ad startConversation result action: %s", valueOf);
            SnsMethodCalculate.markEndTimeMs("onReceiveResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpToWxKefuPage$1");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1", mo125469f = "AdJumpWxKefuClick.kt", mo125470l = {150}, mo125471m = "invokeSuspend")
    /* renamed from: vp2.h$b */
    public static final class C65844b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f189346d;

        /* renamed from: e */
        public int f189347e;

        /* renamed from: f */
        public final /* synthetic */ Context f189348f;

        /* renamed from: g */
        public final /* synthetic */ String f189349g;

        /* renamed from: h */
        public final /* synthetic */ String f189350h;

        /* renamed from: vp2.h$b$a */
        public static final class C65845a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public static final C65845a f189351d = new C65845a();

            public final void onCancel(DialogInterface dialogInterface) {
                SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$1");
                SnsMethodCalculate.markStartTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                C0000n0 n0Var = C65842h.f189344b;
                SnsMethodCalculate.markEndTimeMs("getScope", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                if (n0Var != null) {
                    C53930o0.m60556c(n0Var, (CancellationException) null);
                }
                SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$1");
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgiAsync$2", mo125469f = "CgiRequestHelper.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
        /* renamed from: vp2.h$b$b */
        public static final class C65846b extends C91594j implements C32227p<C0000n0, C15601d<? super C61333b.C61334a<C50899q10>>, Object> {

            /* renamed from: d */
            public Object f189352d;

            /* renamed from: e */
            public Object f189353e;

            /* renamed from: f */
            public int f189354f;

            /* renamed from: g */
            public final /* synthetic */ C101820nt3 f189355g;

            /* renamed from: h */
            public final /* synthetic */ int f189356h;

            /* renamed from: i */
            public final /* synthetic */ String f189357i;

            /* renamed from: vp2.h$b$b$a */
            public static final class C65847a extends C87413o implements C32226l<C61333b.C61334a<C50899q10>, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C53916l f189358d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65847a(C53916l lVar) {
                    super(1);
                    this.f189358d = lVar;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
                    C61333b.C61334a aVar = (C61333b.C61334a) obj;
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
                    C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
                    this.f189358d.resumeWith(Result.m168114constructorimpl(aVar));
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
                    return b0Var;
                }
            }

            /* renamed from: vp2.h$b$b$b */
            public static final class C65848b extends C87413o implements C32226l<Throwable, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C32226l f189359d;

                /* renamed from: e */
                public final /* synthetic */ int f189360e;

                /* renamed from: f */
                public final /* synthetic */ C101820nt3 f189361f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C65848b(C32226l lVar, int i, C101820nt3 nt32) {
                    super(1);
                    this.f189359d = lVar;
                    this.f189360e = i;
                    this.f189361f = nt32;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
                    Throwable th = (Throwable) obj;
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
                    try {
                        this.f189359d.hashCode();
                    } catch (Throwable unused) {
                    }
                    Log.m105924i("CgiRequestHelper", "requestCgiAsync canceled " + this.f189360e + ' ' + this.f189361f);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$2");
                    return b0Var;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65846b(C101820nt3 nt32, int i, String str, C15601d dVar) {
                super(2, dVar);
                this.f189355g = nt32;
                this.f189356h = i;
                this.f189357i = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                C65846b bVar = new C65846b(this.f189355g, this.f189356h, this.f189357i, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                Object invokeSuspend = ((C65846b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                int i = this.f189354f;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C101820nt3 nt32 = this.f189355g;
                    int i2 = this.f189356h;
                    String str = this.f189357i;
                    this.f189352d = nt32;
                    this.f189353e = str;
                    this.f189354f = 1;
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    C65847a aVar2 = new C65847a(mVar);
                    try {
                        C61333b.m71949a(nt32, i2, str, aVar2, C50899q10.class.newInstance(), true);
                    } catch (Throwable th) {
                        Log.m105920e("CgiRequestHelper", "requestCgiAsync error: request = " + nt32 + ", funcId = " + i2 + "  " + th);
                    }
                    mVar.mo74599v(new C65848b(aVar2, i2, nt32));
                    obj = mVar.mo74608o();
                    if (obj == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                    throw illegalStateException;
                }
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65844b(Context context, String str, String str2, C15601d<? super C65844b> dVar) {
            super(2, dVar);
            this.f189348f = context;
            this.f189349g = str;
            this.f189350h = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            C65844b bVar = new C65844b(this.f189348f, this.f189349g, this.f189350h, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            Object invokeSuspend = ((C65844b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C89779i0 i0Var;
            C50899q10 q102;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f189347e;
            String str = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f189348f;
                C89779i0 Q = context instanceof Activity ? C76879j.m92723Q(context, "", ((Activity) context).getString(C0966R.string.f360085a04), false, true, C65845a.f189351d) : null;
                C50766p10 p102 = new C50766p10();
                String str2 = this.f189350h;
                String str3 = this.f189349g;
                p102.f139496e = str2;
                p102.f139495d = str3;
                p102.f139497f = 3;
                SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                Log.m105924i("AdJumpWxKefuClick", "CustomerServiceSignReq start url=" + str3 + " uxInfo=" + str2 + " type=" + p102.f139497f);
                C65846b bVar = new C65846b(p102, 2634, "/cgi-bin/mmoc-bin/adplayinfo/customer_service_sign", (C15601d) null);
                this.f189346d = Q;
                this.f189347e = 1;
                obj2 = C53860b3.m60375c(10000, bVar, this);
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
                    return aVar;
                }
                i0Var = Q;
            } else if (i == 1) {
                i0Var = (C89779i0) this.f189346d;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
                throw illegalStateException;
            }
            C61333b.C61334a aVar2 = (C61333b.C61334a) obj2;
            if (!(aVar2 == null || (q102 = (C50899q10) aVar2.mo86291c()) == null)) {
                str = q102.f140087d;
            }
            if (str == null) {
                str = "";
            }
            C65842h hVar = C65842h.f189343a;
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            Log.m105924i("AdJumpWxKefuClick", "CustomerServiceSignResp end url=" + str);
            String str4 = this.f189349g;
            if (C112551y.m153811k(str)) {
                C115669n.INSTANCE.mo175911u(1903, 7);
                str = str4;
            } else {
                C115669n.INSTANCE.mo175911u(1903, 6);
            }
            if (i0Var != null) {
                i0Var.dismiss();
            }
            hVar.mo89887a(this.f189348f, str, this.f189350h, false);
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1");
            return b0Var;
        }
    }

    /* renamed from: a */
    public final void mo89887a(Context context, String str, String str2, boolean z) {
        String str3;
        SnsMethodCalculate.markStartTimeMs("jumpToWxKefuPage", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        C87412m.m108594g(context, "adContext");
        C87412m.m108594g(str, "jumpKefuUrl");
        C87412m.m108594g(str2, "uxInfo");
        Log.m105924i("AdJumpWxKefuClick", "jumpToWxKefuPage() called with: jumpKefuUrl = " + str + ", isFromLandingPage = " + z);
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
        openIMKefuStartConversationRequest.f108515d = context;
        openIMKefuStartConversationRequest.f108517f = 10;
        C51195s3 s3Var = new C51195s3();
        s3Var.f141285d = str;
        s3Var.f141286e = str;
        C49810i73 i732 = new C49810i73();
        i732.f135156f = str;
        i732.f135154d = openIMKefuStartConversationRequest.f108517f;
        i732.f135155e = str2;
        s3Var.f141288g = i732;
        openIMKefuStartConversationRequest.f108520i = s3Var;
        openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
        openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(openIMKefuStartConversationRequest.f108517f);
        openIMKefuStartConversationRequest.f108522n = true;
        Resources resources = context.getResources();
        if (resources == null || (str3 = resources.getString(C0966R.string.hfd)) == null) {
            str3 = "";
        }
        openIMKefuStartConversationRequest.f108523o = str3;
        Intent intent = new Intent();
        openIMKefuStartConversationRequest.f108528t = intent;
        Handler createFreeHandler = MMHandler.createFreeHandler(Looper.getMainLooper());
        C87412m.m108593f(createFreeHandler, "createFreeHandler(Looper.getMainLooper())");
        intent.putExtra("key_result_receiver", new OpenImKefuStartChattingResultReceiver(createFreeHandler, new C65843a(z)));
        C59837i iVar = (C59837i) C86312j.m106911c(C59837i.class);
        if (iVar != null) {
            iVar.mo71855jT(openIMKefuStartConversationRequest);
        }
        SnsMethodCalculate.markEndTimeMs("jumpToWxKefuPage", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }

    /* renamed from: b */
    public final void mo89888b(AdClickActionInfo adClickActionInfo, SnsInfo snsInfo, Context context, SnsAdClick snsAdClick) {
        SnsMethodCalculate.markStartTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        C115669n.INSTANCE.mo175911u(1903, 5);
        String str = adClickActionInfo != null ? adClickActionInfo.f273658j0 : null;
        String uxinfo = snsInfo != null ? snsInfo.getUxinfo() : null;
        if (str == null || uxinfo == null || context == null) {
            Log.m105924i("AdJumpWxKefuClick", "jumpkefu param is null!");
            SnsMethodCalculate.markEndTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            return;
        }
        if (snsAdClick != null) {
            snsAdClick.f267473h = 52;
        }
        C0000n0 n0Var = f189344b;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        C0000n0 b = C53930o0.m60555b();
        f189344b = b;
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(b, C58901s.f168555a, (C53934p0) null, new C65844b(context, str, uxinfo, (C15601d<? super C65844b>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("jumpWxKefu", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
    }
}

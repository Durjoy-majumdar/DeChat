package rq2;

import a14.C0000n0;
import a14.C53860b3;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53901i0;
import a14.C53916l;
import a14.C53921m;
import a14.C53934p0;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsBrowseInfoHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jp2.C98963o;
import jp3.C9487b;
import k20.C9556a;
import kotlin.Result;
import kotlin.ResultKt;
import l31.C99333f;
import nj3.C76879j;
import p749xh.C102646h;
import ps2.C100894u;
import ps2.C12004a;
import ps2.C35631d0;
import qo3.C89779i0;
import rq2.C101433t;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C90107a;
import sx3.C110818d0;
import te3.C101804kv2;
import up2.C102064e;
import vr2.C102236a0;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: rq2.o */
public final class C101429o {

    /* renamed from: a */
    public static final C101429o f297079a = new C101429o();

    /* renamed from: b */
    public static final C53901i0 f297080b = new C63504f(C53901i0.C39480a.f106019d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1", mo125469f = "OpenAdCanvasHelper.kt", mo125470l = {107}, mo125471m = "invokeSuspend")
    /* renamed from: rq2.o$a */
    public static final class C36459a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f96986d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f96987e;

        /* renamed from: f */
        public final /* synthetic */ MMActivity f96988f;

        /* renamed from: g */
        public final /* synthetic */ long f96989g;

        /* renamed from: h */
        public final /* synthetic */ int f96990h;

        /* renamed from: i */
        public final /* synthetic */ String f96991i;

        /* renamed from: j */
        public final /* synthetic */ String f96992j;

        /* renamed from: n */
        public final /* synthetic */ C12004a f96993n;

        /* renamed from: o */
        public final /* synthetic */ String f96994o;

        /* renamed from: p */
        public final /* synthetic */ C32226l<String, C13598b0> f96995p;

        /* renamed from: q */
        public final /* synthetic */ C32226l<String, C13598b0> f96996q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36459a(C8479f0<C89779i0> f0Var, MMActivity mMActivity, long j, int i, String str, String str2, C12004a aVar, String str3, C32226l<? super String, C13598b0> lVar, C32226l<? super String, C13598b0> lVar2, C15601d<? super C36459a> dVar) {
            super(2, dVar);
            this.f96987e = f0Var;
            this.f96988f = mMActivity;
            this.f96989g = j;
            this.f96990h = i;
            this.f96991i = str;
            this.f96992j = str2;
            this.f96993n = aVar;
            this.f96994o = str3;
            this.f96995p = lVar;
            this.f96996q = lVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            C36459a aVar = new C36459a(this.f96987e, this.f96988f, this.f96989g, this.f96990h, this.f96991i, this.f96992j, this.f96993n, this.f96994o, this.f96995p, this.f96996q, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            Object invokeSuspend = ((C36459a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f96986d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8479f0<C89779i0> f0Var = this.f96987e;
                MMActivity mMActivity = this.f96988f;
                f0Var.f27484d = C76879j.m92723Q(mMActivity, "", mMActivity.getString(C0966R.string.f360085a04), false, false, (DialogInterface.OnCancelListener) null);
                C89779i0 i0Var = (C89779i0) this.f96987e.f27484d;
                if (i0Var != null) {
                    i0Var.show();
                }
                C101429o oVar = C101429o.f297079a;
                long j = this.f96989g;
                int i2 = this.f96990h;
                String str = this.f96991i;
                String str2 = this.f96992j;
                C12004a aVar2 = this.f96993n;
                MMActivity mMActivity2 = this.f96988f;
                this.f96986d = 1;
                obj2 = oVar.mo140932i(j, 0, 0, i2, str, str2, aVar2, mMActivity2, this);
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
                throw illegalStateException;
            }
            C13604l lVar = (C13604l) obj2;
            String str3 = "";
            if (lVar == null) {
                lVar = new C13604l(Boolean.FALSE, str3);
            }
            boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
            String str4 = (String) lVar.f38556e;
            StringBuilder sb = new StringBuilder();
            sb.append("requestAdCanvasXml() end ");
            sb.append(booleanValue);
            sb.append(' ');
            sb.append(str4 != null ? new Integer(str4.length()) : null);
            sb.append(' ');
            Log.m105924i("OpenAdCanvasHelper", sb.toString());
            C89779i0 i0Var2 = (C89779i0) this.f96987e.f27484d;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            String g = C101429o.f297079a.mo140931g(str4, this.f96994o);
            if (g == null) {
                g = this.f96994o;
            }
            if (C100894u.m132239s(g)) {
                C32226l<String, C13598b0> lVar2 = this.f96995p;
                if (g != null) {
                    str3 = g;
                }
                lVar2.invoke(str3);
                C115669n.INSTANCE.mo175911u(1967, 1);
            } else {
                C32226l<String, C13598b0> lVar3 = this.f96996q;
                String str5 = this.f96994o;
                if (str5 != null) {
                    str3 = str5;
                }
                lVar3.invoke(str3);
                C115669n.INSTANCE.mo175911u(1967, 2);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$1");
            return b0Var;
        }
    }

    /* renamed from: rq2.o$b */
    public static final class C36460b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f96997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36460b(C8479f0<C89779i0> f0Var) {
            super(1);
            this.f96997d = f0Var;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$2");
            Log.m105924i("OpenAdCanvasHelper", "job end with: " + ((Throwable) obj));
            C89779i0 i0Var = (C89779i0) this.f96997d.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$commonFetchDynamicAdCanvas$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1", mo125469f = "OpenAdCanvasHelper.kt", mo125470l = {243}, mo125471m = "invokeSuspend")
    /* renamed from: rq2.o$c */
    public static final class C36461c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f96998d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f96999e;

        /* renamed from: f */
        public final /* synthetic */ MMActivity f97000f;

        /* renamed from: g */
        public final /* synthetic */ long f97001g;

        /* renamed from: h */
        public final /* synthetic */ int f97002h;

        /* renamed from: i */
        public final /* synthetic */ String f97003i;

        /* renamed from: j */
        public final /* synthetic */ String f97004j;

        /* renamed from: n */
        public final /* synthetic */ C12004a f97005n;

        /* renamed from: o */
        public final /* synthetic */ SnsInfo f97006o;

        /* renamed from: p */
        public final /* synthetic */ C98963o f97007p;

        /* renamed from: q */
        public final /* synthetic */ int f97008q;

        /* renamed from: r */
        public final /* synthetic */ View f97009r;

        /* renamed from: s */
        public final /* synthetic */ C94851d1 f97010s;

        /* renamed from: t */
        public final /* synthetic */ int f97011t;

        /* renamed from: u */
        public final /* synthetic */ int f97012u;

        /* renamed from: v */
        public final /* synthetic */ SnsAdClick f97013v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36461c(C8479f0<C89779i0> f0Var, MMActivity mMActivity, long j, int i, String str, String str2, C12004a aVar, SnsInfo snsInfo, C98963o oVar, int i2, View view, C94851d1 d1Var, int i3, int i4, SnsAdClick snsAdClick, C15601d<? super C36461c> dVar) {
            super(2, dVar);
            this.f96999e = f0Var;
            this.f97000f = mMActivity;
            this.f97001g = j;
            this.f97002h = i;
            this.f97003i = str;
            this.f97004j = str2;
            this.f97005n = aVar;
            this.f97006o = snsInfo;
            this.f97007p = oVar;
            this.f97008q = i2;
            this.f97009r = view;
            this.f97010s = d1Var;
            this.f97011t = i3;
            this.f97012u = i4;
            this.f97013v = snsAdClick;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            C36461c cVar = new C36461c(this.f96999e, this.f97000f, this.f97001g, this.f97002h, this.f97003i, this.f97004j, this.f97005n, this.f97006o, this.f97007p, this.f97008q, this.f97009r, this.f97010s, this.f97011t, this.f97012u, this.f97013v, dVar);
            String str = "create";
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            Object invokeSuspend = ((C36461c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f96998d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8479f0<C89779i0> f0Var = this.f96999e;
                MMActivity mMActivity = this.f97000f;
                f0Var.f27484d = C76879j.m92723Q(mMActivity, "", mMActivity.getString(C0966R.string.f360085a04), false, false, (DialogInterface.OnCancelListener) null);
                C89779i0 i0Var = (C89779i0) this.f96999e.f27484d;
                if (i0Var != null) {
                    i0Var.show();
                }
                C101429o oVar = C101429o.f297079a;
                long j = this.f97001g;
                int i2 = this.f97002h;
                SnsMethodCalculate.markStartTimeMs("access$toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                SnsMethodCalculate.markStartTimeMs("toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                int i3 = i2 != 1 ? i2 != 2 ? 1 : 16 : 2;
                SnsMethodCalculate.markEndTimeMs("toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                SnsMethodCalculate.markEndTimeMs("access$toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                String str = this.f97003i;
                String str2 = this.f97004j;
                C12004a aVar2 = this.f97005n;
                MMActivity mMActivity2 = this.f97000f;
                this.f96998d = 1;
                obj2 = oVar.mo140932i(j, 0, 0, i3, str, str2, aVar2, mMActivity2, this);
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
                throw illegalStateException;
            }
            C13604l lVar = (C13604l) obj2;
            if (lVar == null) {
                lVar = new C13604l(Boolean.FALSE, "");
            }
            boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
            String str3 = (String) lVar.f38556e;
            StringBuilder sb = new StringBuilder();
            sb.append("requestAdCanvasXml() end ");
            sb.append(booleanValue);
            sb.append(' ');
            sb.append(str3 != null ? new Integer(str3.length()) : null);
            sb.append(' ');
            Log.m105924i("OpenAdCanvasHelper", sb.toString());
            C89779i0 i0Var2 = (C89779i0) this.f96999e.f27484d;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            C101429o oVar2 = C101429o.f297079a;
            String str4 = str3 == null ? "" : str3;
            int i4 = this.f97002h;
            SnsInfo snsInfo = this.f97006o;
            C98963o oVar3 = this.f97007p;
            int i5 = this.f97008q;
            MMActivity mMActivity3 = this.f97000f;
            View view = this.f97009r;
            C94851d1 d1Var = this.f97010s;
            int i6 = this.f97011t;
            int i7 = this.f97012u;
            SnsAdClick snsAdClick = this.f97013v;
            SnsMethodCalculate.markStartTimeMs("access$jumpNativeAdLandingPage", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            oVar2.mo140930e(str4, i4, snsInfo, oVar3, i5, mMActivity3, view, d1Var, i6, i7, snsAdClick);
            SnsMethodCalculate.markEndTimeMs("access$jumpNativeAdLandingPage", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            if (booleanValue) {
                C115669n.INSTANCE.mo175911u(1967, 4);
            } else {
                C115669n.INSTANCE.mo175911u(1967, 5);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$1");
            return b0Var;
        }
    }

    /* renamed from: rq2.o$d */
    public static final class C36462d extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C89779i0> f97014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36462d(C8479f0<C89779i0> f0Var) {
            super(1);
            this.f97014d = f0Var;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$2");
            Log.m105924i("OpenAdCanvasHelper", "job end with: " + ((Throwable) obj));
            C89779i0 i0Var = (C89779i0) this.f97014d.f27484d;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXml$2");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2", mo125469f = "OpenAdCanvasHelper.kt", mo125470l = {461}, mo125471m = "invokeSuspend")
    /* renamed from: rq2.o$e */
    public static final class C36463e extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: d */
        public Object f97015d;

        /* renamed from: e */
        public Object f97016e;

        /* renamed from: f */
        public Object f97017f;

        /* renamed from: g */
        public Object f97018g;

        /* renamed from: h */
        public int f97019h;

        /* renamed from: i */
        public final /* synthetic */ long f97020i;

        /* renamed from: j */
        public final /* synthetic */ int f97021j;

        /* renamed from: n */
        public final /* synthetic */ int f97022n;

        /* renamed from: o */
        public final /* synthetic */ int f97023o;

        /* renamed from: p */
        public final /* synthetic */ String f97024p;

        /* renamed from: q */
        public final /* synthetic */ String f97025q;

        /* renamed from: r */
        public final /* synthetic */ C12004a f97026r;

        /* renamed from: s */
        public final /* synthetic */ C9487b<?> f97027s;

        /* renamed from: rq2.o$e$a */
        public static final class C36464a implements C35631d0.C35635d {

            /* renamed from: a */
            public final /* synthetic */ C53916l<C13604l<Boolean, String>> f97028a;

            public C36464a(C53916l<? super C13604l<Boolean, String>> lVar) {
                this.f97028a = lVar;
            }

            /* renamed from: a */
            public final int mo60346a(boolean z, String str) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2$1$1");
                StringBuilder sb = new StringBuilder();
                sb.append("callback with: isSucc = ");
                sb.append(z);
                sb.append(", canvasXml.len = ");
                sb.append(str != null ? Integer.valueOf(str.length()) : null);
                Log.m105924i("OpenAdCanvasHelper", sb.toString());
                C53916l<C13604l<Boolean, String>> lVar = this.f97028a;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.valueOf(z), str)));
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2$1$1");
                return 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36463e(long j, int i, int i2, int i3, String str, String str2, C12004a aVar, C9487b<?> bVar, C15601d<? super C36463e> dVar) {
            super(2, dVar);
            this.f97020i = j;
            this.f97021j = i;
            this.f97022n = i2;
            this.f97023o = i3;
            this.f97024p = str;
            this.f97025q = str2;
            this.f97026r = aVar;
            this.f97027s = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            C36463e eVar = new C36463e(this.f97020i, this.f97021j, this.f97022n, this.f97023o, this.f97024p, this.f97025q, this.f97026r, this.f97027s, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            Object invokeSuspend = ((C36463e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f97019h;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f97020i;
                int i2 = this.f97021j;
                int i3 = this.f97022n;
                int i4 = this.f97023o;
                String str = this.f97024p;
                String str2 = this.f97025q;
                C12004a aVar2 = this.f97026r;
                C9487b<?> bVar = this.f97027s;
                this.f97015d = str;
                this.f97016e = str2;
                this.f97017f = aVar2;
                this.f97018g = bVar;
                this.f97019h = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                C35631d0.m40783e(j, i2, i3, i4, str, str2, aVar2, new C36464a(mVar), bVar);
                obj2 = mVar.mo74608o();
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
                    return aVar;
                }
            } else if (i == 1) {
                C12004a aVar3 = (C12004a) this.f97017f;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
                throw illegalStateException;
            }
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2");
            return obj2;
        }
    }

    /* renamed from: rq2.o$f */
    public static final class C63504f extends C66206a implements C53901i0 {
        public C63504f(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$special$$inlined$CoroutineExceptionHandler$1");
            Log.m105920e("OpenAdCanvasHelper", "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            } else {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$special$$inlined$CoroutineExceptionHandler$1");
            }
        }
    }

    static {
        int i = C53901i0.f151153a0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m133108a(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "checkShouldUseDynamicXml"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r5 != 0) goto L_0x000e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0014:
            boolean r3 = m133111d()
            if (r3 == 0) goto L_0x0048
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = ".adxml.canvasShareInfo.canvasId"
            java.lang.String r5 = m133110c(r5, r6, r3)
            r6 = 1
            if (r5 == 0) goto L_0x0041
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 != r6) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x0048
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C101429o.m133108a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static final void m133109b(long j, int i, String str, String str2, MMActivity mMActivity, String str3, C32226l<? super String, C13598b0> lVar, C32226l<? super String, C13598b0> lVar2) {
        MMActivity mMActivity2 = mMActivity;
        C32226l<? super String, C13598b0> lVar3 = lVar;
        SnsMethodCalculate.markStartTimeMs("commonFetchDynamicAdCanvas", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar3, "onFetchValid");
        C87412m.m108594g(lVar2, "onInValid");
        Log.m105924i("OpenAdCanvasHelper", "commonJumpDynamicAdCanvas() called with: pageId = " + j + ", fromSource = " + i + ", uxInfo = " + str + ", canvasDynamicInfo = " + str2 + ", activity = " + mMActivity2);
        C12004a aVar = new C12004a();
        aVar.f35001d = false;
        String c = C35631d0.m40782b().mo60342c(j, 0, 0, 0, i, str, str2, aVar);
        if ((c == null || C112551y.m153811k(c)) || !C100894u.m132239s(c)) {
            String str4 = str3;
        } else {
            Log.m105924i("OpenAdCanvasHelper", "commonJumpDynamicAdCanvas() , use cache xml!");
            String str5 = str3;
            String g = f297079a.mo140931g(c, str5);
            if (g == null) {
                g = str5;
            }
            if (C100894u.m132239s(g)) {
                if (g == null) {
                    g = "";
                }
                lVar3.invoke(g);
                C115669n.INSTANCE.mo175911u(1967, 0);
                SnsMethodCalculate.markEndTimeMs("commonFetchDynamicAdCanvas", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                return;
            }
        }
        C8479f0 f0Var = new C8479f0();
        C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) mMActivity);
        C53896h0 h0Var = C53872d1.f151117a;
        ((C53884f2) C53895h.m60466d(lifecycleScope, C58901s.f168555a.plus(f297080b), (C53934p0) null, new C36459a(f0Var, mMActivity, j, i, str, str2, aVar, str3, lVar, lVar2, (C15601d<? super C36459a>) null), 2, (Object) null)).mo74515E(new C36460b(f0Var));
        SnsMethodCalculate.markEndTimeMs("commonFetchDynamicAdCanvas", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
    }

    /* renamed from: c */
    public static final String m133110c(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return "";
        }
        try {
            String str4 = XmlParser.parseXml(str, str2, (String) null).get(str3);
            SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str4;
        } catch (Exception e) {
            Log.m105920e("SnsAdNativeLandingPagesPreviewUI", "getXmlValueByTag exp=" + e);
            SnsMethodCalculate.markEndTimeMs("getXmlValueByTag", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m133111d() {
        /*
            java.lang.String r0 = "OpenAdCanvasHelper"
            java.lang.String r1 = "isEnableDynamicXmlInShare"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)     // Catch:{ all -> 0x0031 }
            h81.h r4 = (h81.C32735h) r4     // Catch:{ all -> 0x0031 }
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_ad_enable_share_use_dynamic_xml_cfg_android     // Catch:{ all -> 0x0031 }
            int r4 = r4.mo58779Qe(r5, r3)     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002f }
            r5.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r6 = "isEnableDynamicXmlInShare called "
            r5.append(r6)     // Catch:{ all -> 0x002f }
            r5.append(r4)     // Catch:{ all -> 0x002f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x002f }
            goto L_0x0048
        L_0x002f:
            r5 = move-exception
            goto L_0x0033
        L_0x0031:
            r5 = move-exception
            r4 = 0
        L_0x0033:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "isEnableDynamicXmlInShare, exp="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x0048:
            if (r4 <= 0) goto L_0x004b
            r3 = 1
        L_0x004b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C101429o.m133111d():boolean");
    }

    /* renamed from: f */
    public static final String m133112f(String str, String str2) {
        C101433t.C101434a.C101435a f;
        C101433t.C101434a.C101435a f2;
        List<C101433t.C101434a> c;
        SnsMethodCalculate.markStartTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        if (str == null || (f = C101433t.m133136f(str)) == null) {
            SnsMethodCalculate.markEndTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        } else if (str2 == null || (f2 = C101433t.m133136f(str2)) == null) {
            SnsMethodCalculate.markEndTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return str2;
        } else {
            C101433t.C101434a.C101435a b = C101433t.m133134b(f2);
            if (b == null) {
                SnsMethodCalculate.markEndTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                return str2;
            }
            C101433t.C101434a.C101435a c2 = C101433t.m133135c(b, ".adxml.adCanvasInfo");
            if (c2 == null) {
                SnsMethodCalculate.markEndTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                return str2;
            }
            C101433t.C101434a.C101435a c3 = C101433t.m133135c(f, ".adxml.adCanvasInfo");
            if (c3 == null || (c = c3.mo140938c()) == null) {
                SnsMethodCalculate.markEndTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
                return str2;
            }
            c2.mo140939d(C110818d0.m150900B0(c));
            String h = C101433t.m133138h(f2);
            SnsMethodCalculate.markEndTimeMs("replaceAdCanvasInfo", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return h == null ? str2 : h;
        }
    }

    /* renamed from: h */
    public static final void m133113h(long j, int i, String str, String str2, MMActivity mMActivity, SnsInfo snsInfo, C98963o oVar, int i2, View view, C94851d1 d1Var, int i3, int i4, SnsAdClick snsAdClick) {
        int i5 = i;
        MMActivity mMActivity2 = mMActivity;
        SnsMethodCalculate.markStartTimeMs("requestAdCanvasXml", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C12004a aVar = new C12004a();
        boolean z = false;
        aVar.f35001d = false;
        Log.m105924i("OpenAdCanvasHelper", "requestAdCanvasXml() called with: pageId = " + j + ", source = " + i5 + ", uxInfo = " + str + ", canvasDynamicInfo = " + str2 + ", adCanvasParams = " + aVar + ", activity = " + mMActivity2);
        C35631d0 b = C35631d0.m40782b();
        C101429o oVar2 = f297079a;
        SnsMethodCalculate.markStartTimeMs("toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        int i6 = i5 != 1 ? i5 != 2 ? 1 : 16 : 2;
        SnsMethodCalculate.markEndTimeMs("toFromSource", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        String c = b.mo60342c(j, 0, 0, 0, i6, str, str2, aVar);
        if (c == null || C112551y.m153811k(c)) {
            z = true;
        }
        if (z || !C100894u.m132239s(c)) {
            Log.m105924i("OpenAdCanvasHelper", "requestAdCanvasXml() , request xml!");
            C8479f0 f0Var = r13;
            C8479f0 f0Var2 = new C8479f0();
            C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) mMActivity);
            C53896h0 h0Var = C53872d1.f151117a;
            ((C53884f2) C53895h.m60466d(lifecycleScope, C58901s.f168555a.plus(f297080b), (C53934p0) null, new C36461c(f0Var, mMActivity, j, i, str, str2, aVar, snsInfo, oVar, i2, view, d1Var, i3, i4, snsAdClick, (C15601d<? super C36461c>) null), 2, (Object) null)).mo74515E(new C36462d(f0Var2));
            SnsMethodCalculate.markEndTimeMs("requestAdCanvasXml", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return;
        }
        Log.m105924i("OpenAdCanvasHelper", "requestAdCanvasXml() , use cache xml!");
        oVar2.mo140930e(c, i, snsInfo, oVar, i2, mMActivity, view, d1Var, i3, i4, snsAdClick);
        C115669n.INSTANCE.mo175911u(1967, 3);
        SnsMethodCalculate.markEndTimeMs("requestAdCanvasXml", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
    }

    /* renamed from: e */
    public final void mo140930e(String str, int i, SnsInfo snsInfo, C98963o oVar, int i2, MMActivity mMActivity, View view, C94851d1 d1Var, int i3, int i4, SnsAdClick snsAdClick) {
        SnsBrowseInfoHelper a;
        int i5 = i;
        SnsInfo snsInfo2 = snsInfo;
        C98963o oVar2 = oVar;
        MMActivity mMActivity2 = mMActivity;
        View view2 = view;
        int i6 = i3;
        SnsMethodCalculate.markStartTimeMs("jumpNativeAdLandingPage", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        if (view2 == null || snsInfo2 == null || oVar2 == null) {
            Log.m105920e("OpenAdCanvasHelper", "jumpNativeAdLandingPage() called with " + view2 + " , " + snsInfo2 + " , " + oVar2);
            SnsMethodCalculate.markEndTimeMs("jumpNativeAdLandingPage", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            return;
        }
        if (C100894u.m132239s(str)) {
            int i7 = 2;
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            Intent intent = new Intent();
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", width);
            intent.putExtra("img_gallery_height", height);
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().f283893Id);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            intent.putExtra("sns_landing_pages_aid", snsInfo.getAid());
            intent.putExtra("sns_landing_pages_traceid", snsInfo.getTraceid());
            TimeLineObject timeLine = snsInfo.getTimeLine();
            C87412m.m108593f(timeLine, "info.getTimeLine()");
            LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
            C87412m.m108593f(linkedList, "tlObj.ContentObj.MediaObjList");
            if (linkedList.size() > 0) {
                intent.putExtra("sns_landing_pages_share_thumb_url", linkedList.get(0).f298694i);
                Object tag = view.getTag();
                boolean z = tag instanceof C96235u4;
                C96235u4 u4Var = z ? (C96235u4) tag : null;
                intent.putExtra("sns_landing_pages_from_outer_index", u4Var != null ? u4Var.f281207b : i2);
                if (!z) {
                    Log.m105920e("OpenAdCanvasHelper", "jumpNativeAdLandingPage() tag error!  getTag = " + tag + " subClickPos = " + i2);
                }
            }
            intent.setClass(mMActivity2, SnsAdNativeLandingPagesUI.class);
            if (i5 != 1) {
                i7 = i5 != 2 ? 1 : 16;
            }
            intent.putExtra("sns_landig_pages_from_source", i7);
            intent.putExtra("sns_landing_pages_xml", str);
            intent.putExtra("sns_landing_pages_rec_src", snsInfo.getAdRecSrc());
            intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
            intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
            intent.putExtra("sns_landing_is_native_sight_ad", i4 == 1);
            if (!snsInfo.getAdXml().forbiddenCustomAnimation && i6 != 10) {
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                intent.putExtra("sns_landing_pages_is_normal_ad_animation", true);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMActivity mMActivity3 = mMActivity;
            C117292a.m165358d(mMActivity3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/utils/OpenAdCanvasHelper", "jumpNativeAdLandingPage", "(Ljava/lang/String;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;ILcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/plugin/sns/model/SnsContext;IILcom/tencent/mm/modelsns/SnsAdClick;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity3, "com/tencent/mm/plugin/sns/ad/utils/OpenAdCanvasHelper", "jumpNativeAdLandingPage", "(Ljava/lang/String;ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;ILcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/plugin/sns/model/SnsContext;IILcom/tencent/mm/modelsns/SnsAdClick;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (!snsInfo.getAdXml().forbiddenCustomAnimation && i6 != 10) {
                mMActivity2.overridePendingTransition(0, 0);
            }
            Class cls = C99333f.class;
            SnsMethodCalculate.markStartTimeMs("handleReport", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
            if (!(d1Var == null || (a = d1Var.mo130970a()) == null)) {
                a.mo131335v(snsInfo2);
            }
            String q0 = C102236a0.m134765q0(snsInfo2.field_snsId);
            C87412m.m108593f(q0, "longToString(info.field_snsId)");
            ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "ClickAdFeed", q0);
            if (snsInfo.isAd()) {
                if (snsInfo.getAdXml() == null || !snsInfo.getAdXml().isLandingPagesAd()) {
                    int i8 = snsInfo2.field_type;
                    if (i8 == 1) {
                        ((C99333f) C86312j.m106911c(cls)).um0(12076, "BrowseAdFullScreenTime");
                    } else if (i8 == 15) {
                        ((C99333f) C86312j.m106911c(cls)).um0(12076, "BrowseAdShortVideoTime");
                    }
                } else {
                    ((C99333f) C86312j.m106911c(cls)).um0(12076, "BrowseAdCanvasPageTime");
                }
            }
            SnsMethodCalculate.markEndTimeMs("handleReport", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        } else {
            Log.m105920e("OpenAdCanvasHelper", "jumpNativeAdLandingPage() canvasValid Error!");
            C102064e.m134454m(snsInfo2, snsAdClick, i5, mMActivity2);
        }
        SnsMethodCalculate.markEndTimeMs("jumpNativeAdLandingPage", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        if (gy3.C87412m.m108589b(r10.mo140937b(), "giveHBCardInfo") == false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0062 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140931g(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "replaceShareInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r14 == 0) goto L_0x0119
            rq2.t$a$a r14 = rq2.C101433t.m133136f(r14)
            if (r14 != 0) goto L_0x0012
            goto L_0x0119
        L_0x0012:
            if (r15 == 0) goto L_0x0115
            rq2.t$a$a r2 = rq2.C101433t.m133136f(r15)
            if (r2 != 0) goto L_0x001c
            goto L_0x0115
        L_0x001c:
            rq2.t$a$a r3 = rq2.C101433t.m133134b(r2)
            if (r3 != 0) goto L_0x0026
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        L_0x0026:
            java.lang.String r4 = ".adxml.adCanvasInfo"
            rq2.t$a$a r3 = rq2.C101433t.m133135c(r3, r4)
            if (r3 != 0) goto L_0x0032
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        L_0x0032:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = ".adCanvasInfo.isInteractiveCanvas"
            rq2.t$a$a r6 = rq2.C101433t.m133135c(r3, r6)
            if (r6 == 0) goto L_0x0042
            r5.add(r6)
        L_0x0042:
            java.lang.String r6 = ".adCanvasInfo.giveHBCardInfo"
            rq2.t$a$a r6 = rq2.C101433t.m133135c(r3, r6)
            if (r6 == 0) goto L_0x004d
            r5.add(r6)
        L_0x004d:
            rq2.t$a$a r4 = rq2.C101433t.m133135c(r14, r4)
            if (r4 == 0) goto L_0x0111
            java.util.List r4 = r4.mo140938c()
            if (r4 == 0) goto L_0x0111
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0062:
            boolean r7 = r4.hasNext()
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r4.next()
            r10 = r7
            rq2.t$a r10 = (rq2.C101433t.C101434a) r10
            boolean r11 = r10 instanceof rq2.C101433t.C101434a.C101435a
            if (r11 == 0) goto L_0x0090
            rq2.t$a$a r10 = (rq2.C101433t.C101434a.C101435a) r10
            java.lang.String r11 = r10.mo140937b()
            java.lang.String r12 = "isInteractiveCanvas"
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 != 0) goto L_0x0091
            java.lang.String r10 = r10.mo140937b()
            java.lang.String r11 = "giveHBCardInfo"
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 != 0) goto L_0x0091
        L_0x0090:
            r8 = 1
        L_0x0091:
            if (r8 == 0) goto L_0x0062
            r6.add(r7)
            goto L_0x0062
        L_0x0097:
            java.util.List r4 = sx3.C110818d0.m150900B0(r6)
            r3.mo140939d(r4)
            java.lang.String r4 = "addTags"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            java.util.List<rq2.t$a> r3 = r3.f297087c
            r3.addAll(r8, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            java.lang.String r3 = ".adxml.adScanInfo"
            rq2.t$a$a r14 = rq2.C101433t.m133135c(r14, r3)
            if (r14 == 0) goto L_0x00f5
            java.util.List r3 = r2.mo140938c()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00c2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r3.next()
            r6 = r5
            rq2.t$a r6 = (rq2.C101433t.C101434a) r6
            boolean r7 = r6 instanceof rq2.C101433t.C101434a.C101435a
            if (r7 == 0) goto L_0x00e4
            rq2.t$a$a r6 = (rq2.C101433t.C101434a.C101435a) r6
            java.lang.String r6 = r6.mo140937b()
            java.lang.String r7 = "adScanInfo"
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r6 = 0
            goto L_0x00e5
        L_0x00e4:
            r6 = 1
        L_0x00e5:
            if (r6 == 0) goto L_0x00c2
            r4.add(r5)
            goto L_0x00c2
        L_0x00eb:
            java.util.List r3 = sx3.C110818d0.m150900B0(r4)
            r2.mo140939d(r3)
            r2.mo140936a(r14)
        L_0x00f5:
            java.lang.String r14 = rq2.C101433t.m133138h(r2)
            if (r14 == 0) goto L_0x0107
            int r2 = r14.length()
            if (r2 <= 0) goto L_0x0103
            r2 = 1
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            if (r2 != r9) goto L_0x0107
            r8 = 1
        L_0x0107:
            if (r8 == 0) goto L_0x010d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r14
        L_0x010d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        L_0x0111:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        L_0x0115:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        L_0x0119:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.C101429o.mo140931g(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: i */
    public final Object mo140932i(long j, int i, int i2, int i3, String str, String str2, C12004a aVar, C9487b<?> bVar, C15601d<? super C13604l<Boolean, String>> dVar) {
        SnsMethodCalculate.markStartTimeMs("requestAdCanvasXmlByNet", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        StringBuilder sb = new StringBuilder();
        sb.append("requestAdCanvasXml() called with: pageId = ");
        long j2 = j;
        sb.append(j2);
        sb.append(", preload = ");
        sb.append(i);
        sb.append(", preloadInnerRes = ");
        int i4 = i2;
        sb.append(i4);
        sb.append(", source = ");
        int i5 = i3;
        sb.append(i5);
        sb.append(", uxInfo = ");
        String str3 = str;
        sb.append(str3);
        sb.append(", canvasDynamicInfo = ");
        String str4 = str2;
        sb.append(str4);
        sb.append(", adCanvasParams = ");
        C12004a aVar2 = aVar;
        sb.append(aVar2);
        sb.append(", keeper = ");
        C9487b<?> bVar2 = bVar;
        sb.append(bVar2);
        Log.m105924i("OpenAdCanvasHelper", sb.toString());
        Object c = C53860b3.m60375c(10000, new C36463e(j2, i, i4, i5, str3, str4, aVar2, bVar2, (C15601d<? super C36463e>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("requestAdCanvasXmlByNet", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper");
        return c;
    }
}

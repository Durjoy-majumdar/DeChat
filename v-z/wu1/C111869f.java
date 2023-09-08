package wu1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import b43.C104031a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FlutterVoIPP2PStruct;
import com.tencent.p014mm.p136ui.C85811a5;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.plugin.flutter.p884ui.CachedFlutterActivity;
import com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr;
import com.tencent.p014mm.plugin.ringtone.widget.RingtoneHalfBottomDialog;
import com.tencent.p014mm.plugin.voip.model.NewVoipMgr$$b;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e43.C107225c;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h43.C108077f0;
import h81.C32735h;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import l33.C109246a;
import l33.C109247e;
import nj2.C109749c;
import nj2.C11173h;
import nj2.C61764l;
import nj2.C61767o;
import p156gj.C107835h0;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.view.TextureRegistry;
import p220pr.C62491f;
import p331dj.C107043a;
import p447aw.C103918d;
import p447aw.C54369c;
import p492dn.C107054l;
import pu0.C110248b;
import q00.C110264g;
import qo3.C101218e0;
import rx3.C13598b0;
import vc3.C78382a;
import vu1.C111617a;
import vu1.C111619c;
import w33.C111730z;
import w80.C111742d;
import w80.C111744e;
import wj2.C53183e;
import wj2.C66132f;
import wu1.C111864b;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xu1.C112174a;
import xx3.C15911a;
import xx3.C66447b;
import yu1.C112489b;
import yx3.C91590f;
import yx3.C91594j;
import z33.C112592e;
import z33.C112595h;
import z33.C112604l;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: wu1.f */
public final class C111869f implements FlutterPlugin, MethodChannel.MethodCallHandler, VoIPFlutterPluginApi.VoIPPluginApi, ActivityAware, C0125s {

    /* renamed from: d */
    public C112174a f334929d;

    /* renamed from: e */
    public MethodChannel f334930e;

    /* renamed from: f */
    public Activity f334931f;

    /* renamed from: g */
    public final C103766u f334932g = new C103766u(this);

    /* renamed from: h */
    public boolean f334933h = true;

    /* renamed from: i */
    public C0000n0 f334934i;

    /* renamed from: j */
    public FlutterVoipMgr f334935j;

    /* renamed from: n */
    public String f334936n;

    /* renamed from: o */
    public final boolean f334937o;

    /* renamed from: p */
    public C101218e0 f334938p;

    /* renamed from: q */
    public final boolean f334939q;

    /* renamed from: wu1.f$a */
    public static final class C66192a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111869f f190216d;

        /* renamed from: e */
        public final /* synthetic */ String f190217e;

        public C66192a(C111869f fVar, String str) {
            this.f190216d = fVar;
            this.f190217e = str;
        }

        public final void run() {
            Log.m105924i("MicroMsg.FlutterVoipPlugin", "executing clear engine: activity=" + this.f190216d.f334931f);
            if (this.f190216d.f334931f == null) {
                ((C62491f) C86312j.m106911c(C62491f.class)).mo87522V3(this.f190217e);
            }
        }
    }

    /* renamed from: wu1.f$d */
    public static final class C66193d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> f190218d;

        /* renamed from: e */
        public final /* synthetic */ C111869f f190219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66193d(VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result, C111869f fVar) {
            super(1);
            this.f190218d = result;
            this.f190219e = fVar;
        }

        public Object invoke(Object obj) {
            this.f190218d.success(this.f190219e.mo163616c(Boolean.valueOf(((Boolean) obj).booleanValue())));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$requestRingtoneInfo$1", mo125469f = "FlutterVoipPlugin.kt", mo125470l = {503}, mo125471m = "invokeSuspend")
    /* renamed from: wu1.f$g */
    public static final class C66194g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f190220d;

        /* renamed from: e */
        public final /* synthetic */ VoIPFlutterPluginApi.FLStringType f190221e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66194g(VoIPFlutterPluginApi.FLStringType fLStringType, C15601d<? super C66194g> dVar) {
            super(2, dVar);
            this.f190221e = fLStringType;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66194g(this.f190221e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66194g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f190220d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String value = this.f190221e.getValue();
                C87412m.m108593f(value, "arg.value");
                this.f190220d = 1;
                C61767o oVar = C61767o.f175575a;
                obj = C53895h.m60469g(C53872d1.f151119c, new C61764l(value, true, (C15601d<? super C61764l>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception unused) {
                    C112489b.f336867d.mo164238f0((C66132f) null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C66132f fVar = (C66132f) obj;
            if (fVar.f190090m != C53183e.DEFAULT) {
                C112489b.f336867d.mo164238f0(fVar);
            } else {
                C112489b.f336867d.mo164238f0((C66132f) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$setRingtoneSelf$1", mo125469f = "FlutterVoipPlugin.kt", mo125470l = {578}, mo125471m = "invokeSuspend")
    /* renamed from: wu1.f$h */
    public static final class C66195h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f190222d;

        /* renamed from: e */
        public /* synthetic */ Object f190223e;

        /* renamed from: f */
        public final /* synthetic */ VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> f190224f;

        /* renamed from: g */
        public final /* synthetic */ C111869f f190225g;

        /* renamed from: h */
        public final /* synthetic */ VoIPFlutterPluginApi.FLStringType f190226h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66195h(VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result, C111869f fVar, VoIPFlutterPluginApi.FLStringType fLStringType, C15601d<? super C66195h> dVar) {
            super(2, dVar);
            this.f190224f = result;
            this.f190225g = fVar;
            this.f190226h = fLStringType;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66195h hVar = new C66195h(this.f190224f, this.f190225g, this.f190226h, dVar);
            hVar.f190223e = obj;
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66195h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f190222d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f190223e;
                this.f190222d = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C11173h(hVar, (C15601d<? super C11173h>) null), 3, (Object) null);
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    Log.m105924i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf error: " + this.f190226h.getValue() + ' ' + e.getMessage());
                    this.f190224f.success(this.f190225g.mo163616c(Boolean.FALSE));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result = this.f190224f;
            C111869f fVar = this.f190225g;
            if (!booleanValue) {
                z = false;
            }
            result.success(fVar.mo163616c(Boolean.valueOf(z)));
            Log.m105924i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf rsp: " + this.f190226h.getValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wu1.f$j */
    public static final class C66196j extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType>> f190227d;

        /* renamed from: e */
        public final /* synthetic */ C111869f f190228e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66196j(C8479f0<VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType>> f0Var, C111869f fVar) {
            super(1);
            this.f190227d = f0Var;
            this.f190228e = fVar;
        }

        public Object invoke(Object obj) {
            C119179t tVar = C119157j.f356862d;
            C119157j jVar = (C119157j) tVar;
            jVar.mo183895z(new C66199i(this.f190227d, this.f190228e, (Boolean) obj));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wu1.f$k */
    public static final class C66197k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType>> f190229d;

        /* renamed from: e */
        public final /* synthetic */ C111869f f190230e;

        public C66197k(C8479f0<VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType>> f0Var, C111869f fVar) {
            this.f190229d = f0Var;
            this.f190230e = fVar;
        }

        public final void run() {
            VoIPFlutterPluginApi.Result result = (VoIPFlutterPluginApi.Result) this.f190229d.f27484d;
            if (result != null) {
                result.success(this.f190230e.mo163616c(Boolean.TRUE));
            }
            this.f190229d.f27484d = null;
        }
    }

    /* renamed from: wu1.f$b */
    public static final class C111870b implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public final /* synthetic */ C111869f f334940a;

        /* renamed from: b */
        public final /* synthetic */ boolean f334941b;

        /* renamed from: c */
        public final /* synthetic */ boolean f334942c;

        /* renamed from: d */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f334943d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$doMinimize$1$onResultAllow$1", mo125469f = "FlutterVoipPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: wu1.f$b$a */
        public static final class C111871a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C111869f f334944d;

            /* renamed from: e */
            public final /* synthetic */ boolean f334945e;

            /* renamed from: f */
            public final /* synthetic */ boolean f334946f;

            /* renamed from: g */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f334947g;

            /* renamed from: wu1.f$b$a$a */
            public static final class C111872a extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C111869f f334948d;

                /* renamed from: e */
                public final /* synthetic */ boolean f334949e;

                /* renamed from: f */
                public final /* synthetic */ C32226l<Boolean, C13598b0> f334950f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C111872a(C111869f fVar, boolean z, C32226l<? super Boolean, C13598b0> lVar) {
                    super(1);
                    this.f334948d = fVar;
                    this.f334949e = z;
                    this.f334950f = lVar;
                }

                public Object invoke(Object obj) {
                    Activity activity;
                    C112174a aVar;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    C111869f fVar = this.f334948d;
                    if (!fVar.f334937o && (aVar = fVar.f334929d) != null) {
                        aVar.mo163978d();
                    }
                    if (this.f334949e && (activity = this.f334948d.f334931f) != null) {
                        activity.finish();
                    }
                    this.f334950f.invoke(Boolean.valueOf(booleanValue));
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C111871a(C111869f fVar, boolean z, boolean z2, C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C111871a> dVar) {
                super(2, dVar);
                this.f334944d = fVar;
                this.f334945e = z;
                this.f334946f = z2;
                this.f334947g = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C111871a(this.f334944d, this.f334945e, this.f334946f, this.f334947g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C111871a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C111869f fVar = this.f334944d;
                FlutterVoipMgr flutterVoipMgr = fVar.f334935j;
                if (flutterVoipMgr != null) {
                    flutterVoipMgr.mo149996g1(this.f334945e, new C111872a(fVar, this.f334946f, this.f334947g));
                }
                return C13598b0.f38549a;
            }
        }

        public C111870b(C111869f fVar, boolean z, boolean z2, C32226l<? super Boolean, C13598b0> lVar) {
            this.f334940a = fVar;
            this.f334941b = z;
            this.f334942c = z2;
            this.f334943d = lVar;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105920e("MicroMsg.FlutterVoipPlugin", "minimize, onResultAllow");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            C111869f fVar = this.f334940a;
            C53895h.m60466d(fVar.f334934i, (C66212f) null, (C53934p0) null, new C111871a(fVar, this.f334941b, this.f334942c, this.f334943d, (C15601d<? super C111871a>) null), 3, (Object) null);
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105920e("MicroMsg.FlutterVoipPlugin", "minimize, onResultCancel");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            this.f334943d.invoke(Boolean.FALSE);
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            Log.m105920e("MicroMsg.FlutterVoipPlugin", "minimize, onResultRefuse");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            this.f334943d.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: wu1.f$c */
    public static final class C111873c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111869f f334951d;

        /* renamed from: e */
        public final /* synthetic */ boolean f334952e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f334953f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111873c(C111869f fVar, boolean z, C32226l<? super Boolean, C13598b0> lVar) {
            super(1);
            this.f334951d = fVar;
            this.f334952e = z;
            this.f334953f = lVar;
        }

        public Object invoke(Object obj) {
            Activity activity;
            C112174a aVar;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C111869f fVar = this.f334951d;
            if (!fVar.f334937o && (aVar = fVar.f334929d) != null) {
                aVar.mo163978d();
            }
            if (this.f334952e && (activity = this.f334951d.f334931f) != null) {
                activity.finish();
            }
            this.f334953f.invoke(Boolean.valueOf(booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wu1.f$e */
    public static final class C111874e extends CachedFlutterActivity.C105360c {

        /* renamed from: a */
        public final /* synthetic */ C111869f f334954a;

        public C111874e(C111869f fVar) {
            this.f334954a = fVar;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C87412m.m108594g(keyEvent, "event");
            FlutterVoipMgr flutterVoipMgr = this.f334954a.f334935j;
            if (flutterVoipMgr != null) {
                Class cls = C109749c.class;
                Class cls2 = C107054l.class;
                if (i == 25) {
                    if (!C109247e.xx0().mo152623v() && flutterVoipMgr.f317101r) {
                        if (C112595h.m153918b()) {
                            ((C107054l) C86312j.m106911c(cls2)).mo157470ju();
                            return true;
                        }
                        C110248b.C110249a aVar = C110248b.f329777h;
                        C107043a.m144903a(aVar.mo161657b().f329358h, aVar.mo161657b().mo157510m() ? aVar.mo161658c() : ((C109749c) C86312j.m106911c(cls)).mo86664Px(), -1, 5);
                        return true;
                    }
                } else if (i == 24 && flutterVoipMgr.f317101r && !C109247e.xx0().mo152623v()) {
                    if (C112595h.m153918b()) {
                        ((C107054l) C86312j.m106911c(cls2)).nt0();
                        return true;
                    }
                    C110248b.C110249a aVar2 = C110248b.f329777h;
                    C107043a.m144903a(aVar2.mo161657b().f329358h, aVar2.mo161657b().mo157510m() ? aVar2.mo161658c() : ((C109749c) C86312j.m106911c(cls)).mo86664Px(), 1, 5);
                    return true;
                }
                if (C107835h0.f322845b.f322807f == 1 && i == 700) {
                    if (flutterVoipMgr.f317101r) {
                        return true;
                    }
                    if (flutterVoipMgr.f317102s) {
                        flutterVoipMgr.mo152421C();
                    } else {
                        flutterVoipMgr.mo152425F();
                    }
                    if (!C109247e.xx0().f317334c || !flutterVoipMgr.f317102s) {
                        return true;
                    }
                    flutterVoipMgr.mo152436N(1);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: wu1.f$f */
    public static final class C111875f extends C87413o implements C32226l<C101218e0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66132f f334955d;

        /* renamed from: e */
        public final /* synthetic */ C111869f f334956e;

        /* renamed from: f */
        public final /* synthetic */ AppCompatActivity f334957f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111875f(C66132f fVar, C111869f fVar2, AppCompatActivity appCompatActivity) {
            super(1);
            this.f334955d = fVar;
            this.f334956e = fVar2;
            this.f334957f = appCompatActivity;
        }

        public Object invoke(Object obj) {
            C101218e0 e0Var = (C101218e0) obj;
            C87412m.m108594g(e0Var, "dialog");
            C109246a aVar = C109247e.xx0().f317333b;
            String S = aVar != null ? aVar.mo152445S() : null;
            if (S != null && this.f334955d.mo90179j()) {
                C111869f fVar = this.f334956e;
                fVar.mo163615b(false, false, false, new C66198h(this.f334957f, S, this.f334955d, e0Var, fVar));
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$setSpeakerEnabled$1", mo125469f = "FlutterVoipPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wu1.f$i */
    public static final class C111876i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C111869f f334958d;

        /* renamed from: e */
        public final /* synthetic */ VoIPFlutterPluginApi.FLBoolType f334959e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111876i(C111869f fVar, VoIPFlutterPluginApi.FLBoolType fLBoolType, C15601d<? super C111876i> dVar) {
            super(2, dVar);
            this.f334958d = fVar;
            this.f334959e = fLBoolType;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111876i(this.f334958d, this.f334959e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111876i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FlutterVoipMgr flutterVoipMgr = this.f334958d.f334935j;
            if (flutterVoipMgr != null) {
                Boolean value = this.f334959e.getValue();
                C87412m.m108593f(value, "arg.value");
                flutterVoipMgr.mo152472i(value.booleanValue(), true);
            }
            return C13598b0.f38549a;
        }
    }

    public C111869f(C112174a aVar) {
        this.f334929d = aVar;
        C0000n0 b = C53930o0.m60555b();
        C53930o0.m60556c(b, (CancellationException) null);
        this.f334934i = b;
        C112595h hVar = C112595h.f337166a;
        this.f334937o = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_xsetting_allow_reuse_surface, true);
        this.f334939q = C112595h.f337171f;
    }

    /* renamed from: a */
    public final void mo163614a(String str) {
        C119179t tVar = C119157j.f356862d;
        C66192a aVar = new C66192a(this, str);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 100, false);
    }

    public VoIPFlutterPluginApi.FLBoolType accept(VoIPFlutterPluginApi.AcceptParams acceptParams) {
        C87412m.m108594g(acceptParams, "arg");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "accept(" + acceptParams.getNeedSwitchToVoice().booleanValue() + ')');
        Boolean needSwitchToVoice = acceptParams.getNeedSwitchToVoice();
        C87412m.m108593f(needSwitchToVoice, "arg.needSwitchToVoice");
        Boolean bool = null;
        if (needSwitchToVoice.booleanValue()) {
            FlutterVoipMgr flutterVoipMgr = this.f334935j;
            if (flutterVoipMgr != null) {
                bool = Boolean.valueOf(flutterVoipMgr.mo152478m());
            }
            return mo163616c(bool);
        }
        FlutterVoipMgr flutterVoipMgr2 = this.f334935j;
        if (flutterVoipMgr2 != null) {
            bool = Boolean.valueOf(flutterVoipMgr2.f317102s ? flutterVoipMgr2.mo152421C() : flutterVoipMgr2.mo152425F());
        }
        return mo163616c(bool);
    }

    /* renamed from: b */
    public final void mo163615b(boolean z, boolean z2, boolean z3, C32226l<? super Boolean, C13598b0> lVar) {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "minimize: activity=" + this.f334931f + ", needPop=" + z + ", showAlertIfNoPermission:" + z2);
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        boolean z4 = true;
        if (flutterVoipMgr == null || !flutterVoipMgr.mo152452V0()) {
            z4 = false;
        }
        if (z4) {
            Log.m105928w("MicroMsg.FlutterVoipPlugin", "voip is already minimized, ignore!");
            lVar.invoke(Boolean.TRUE);
        } else if (((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), 9)) {
            FlutterVoipMgr flutterVoipMgr2 = this.f334935j;
            if (flutterVoipMgr2 != null) {
                flutterVoipMgr2.mo149996g1(z3, new C111873c(this, z, lVar));
            }
        } else if (!z2) {
            lVar.invoke(Boolean.FALSE);
        } else {
            Log.m105920e("MicroMsg.FlutterVoipPlugin", "minimize, permission denied");
            Context context = MMApplicationContext.getContext();
            ((C54369c) C86312j.m106911c(C54369c.class)).xh0(context, 9, context.getString(C0966R.string.kgq), new C111870b(this, z3, z, lVar), C78382a.m94650b());
        }
    }

    /* renamed from: c */
    public final VoIPFlutterPluginApi.FLBoolType mo163616c(Boolean bool) {
        VoIPFlutterPluginApi.FLBoolType build = new VoIPFlutterPluginApi.FLBoolType.Builder().setValue(Boolean.valueOf(bool != null ? bool.booleanValue() : false)).build();
        C87412m.m108593f(build, "Builder().setValue((this ?: false)).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLBoolType cancel() {
        Boolean bool;
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "cancel()");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            bool = Boolean.valueOf(flutterVoipMgr.f317102s ? flutterVoipMgr.mo152430J() : flutterVoipMgr.mo152482o());
        } else {
            bool = null;
        }
        return mo163616c(bool);
    }

    public Boolean checkWeVisonSupport() {
        return Boolean.valueOf(C111742d.f334647a.mo163461d("GL_OES_EGL_image_external_essl3"));
    }

    public void clearVirtualBackground(Boolean bool) {
        FlutterVoipMgr flutterVoipMgr;
        if (!bool.booleanValue() && (flutterVoipMgr = this.f334935j) != null) {
            flutterVoipMgr.mo152437N0(8);
        }
        C107225c.m145287a(C107225c.f320827a, 2, (String) null, 2, (Object) null);
        C107225c.f320828b = null;
    }

    public VoIPFlutterPluginApi.FLIntType getAudioOutputDevice() {
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        int i = 2;
        if (flutterVoipMgr != null) {
            C112592e eVar = flutterVoipMgr.f317089d;
            boolean z = false;
            if (eVar != null && eVar.mo164362s()) {
                z = true;
            }
            if (z) {
                i = 1;
            } else {
                C112592e eVar2 = flutterVoipMgr.f317089d;
                if (eVar2 != null) {
                    i = eVar2.mo164343i();
                }
            }
        }
        VoIPFlutterPluginApi.FLIntType build = new VoIPFlutterPluginApi.FLIntType.Builder().setValue(Long.valueOf((long) i)).build();
        C87412m.m108593f(build, "Builder()\n            .s…(device.toLong()).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLIntType getConnectedTime() {
        VoIPFlutterPluginApi.FLIntType.Builder builder = new VoIPFlutterPluginApi.FLIntType.Builder();
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        VoIPFlutterPluginApi.FLIntType build = builder.setValue(Long.valueOf(flutterVoipMgr != null ? flutterVoipMgr.f317057G : Util.nowMilliSecond())).build();
        C87412m.m108593f(build, "Builder()\n            .s…nowMilliSecond()).build()");
        return build;
    }

    public C39623j getLifecycle() {
        return this.f334932g;
    }

    public VoIPFlutterPluginApi.FLIntType getRingStreamType() {
        int Px = ((C109749c) C86312j.m106911c(C109749c.class)).mo86664Px();
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "getRingStreamType: " + Px);
        Integer valueOf = Integer.valueOf(Px);
        VoIPFlutterPluginApi.FLIntType build = new VoIPFlutterPluginApi.FLIntType.Builder().setValue(Long.valueOf((long) (valueOf != null ? valueOf.intValue() : 0))).build();
        C87412m.m108593f(build, "Builder().setValue((this ?: 0).toLong()).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLDoubleType getSmallStreamAspectRatio(VoIPFlutterPluginApi.FLBoolType fLBoolType) {
        float f;
        C87412m.m108594g(fLBoolType, "arg");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        float f2 = 0.0f;
        if (flutterVoipMgr != null) {
            Boolean value = fLBoolType.getValue();
            C87412m.m108593f(value, "arg.value");
            boolean booleanValue = value.booleanValue();
            Log.m105924i("MicroMsg.FlutterVoipMgr", "getSmallStreamSizeRatio, roomId:" + flutterVoipMgr.f313162g1 + ", isLocal:" + booleanValue);
            f = C109247e.xx0().mo152618q(booleanValue);
        } else {
            f = 0.0f;
        }
        Float valueOf = Float.valueOf(f);
        VoIPFlutterPluginApi.FLDoubleType.Builder builder = new VoIPFlutterPluginApi.FLDoubleType.Builder();
        if (valueOf != null) {
            f2 = valueOf.floatValue();
        }
        VoIPFlutterPluginApi.FLDoubleType build = builder.setValue(Double.valueOf((double) f2)).build();
        C87412m.m108593f(build, "Builder().setValue((this…0.0f).toDouble()).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLIntType getStatus() {
        int ordinal;
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        Integer num = null;
        if ((flutterVoipMgr != null ? Integer.valueOf(flutterVoipMgr.mo152441Q()) : null) == null) {
            ordinal = 0;
        } else {
            C111619c.C111620a aVar = C111619c.f334120d;
            FlutterVoipMgr flutterVoipMgr2 = this.f334935j;
            if (flutterVoipMgr2 != null) {
                num = Integer.valueOf(flutterVoipMgr2.mo152441Q());
            }
            C87412m.m108591d(num);
            ordinal = aVar.mo163290a(num.intValue()).ordinal();
        }
        VoIPFlutterPluginApi.FLIntType build = new VoIPFlutterPluginApi.FLIntType.Builder().setValue(Long.valueOf((long) ordinal)).build();
        C87412m.m108593f(build, "Builder()\n            .setValue(state).build()");
        return build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.pigeon.VoIPFlutterPluginApi.FLIntType getTextureId(com.tencent.pigeon.VoIPFlutterPluginApi.FLIntType r7) {
        /*
            r6 = this;
            java.lang.String r0 = "arg"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.Long r7 = r7.getValue()
            long r0 = r7.longValue()
            int r7 = (int) r0
            xu1.a r0 = r6.f334929d
            r1 = 0
            if (r0 == 0) goto L_0x004c
            u.f<xu1.a$c> r3 = r0.f335878c
            int r3 = r3.mo162757f()
            r4 = 1
            if (r3 <= r4) goto L_0x0026
            u.f<xu1.a$c> r0 = r0.f335878c
            java.lang.Object r0 = r0.mo162758g(r7)
            xu1.a$c r0 = (xu1.C112174a.C112177c) r0
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getCameraTextureId, textureId:"
            r3.append(r4)
            long r4 = r0.f335884a
            r3.append(r4)
            java.lang.String r4 = ", renderType:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r3 = "MicroMsg.FlutterVoipPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            long r3 = r0.f335884a
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType$Builder r0 = new com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType$Builder
            r0.<init>()
            if (r7 == 0) goto L_0x005c
            long r1 = r7.longValue()
        L_0x005c:
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType$Builder r7 = r0.setValue(r7)
            com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType r7 = r7.build()
            java.lang.String r0 = "Builder().setValue((this ?: 0).toLong()).build()"
            gy3.C87412m.m108593f(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wu1.C111869f.getTextureId(com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType):com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.pigeon.VoIPFlutterPluginApi.UserInfoParams getUserInfo(com.tencent.pigeon.VoIPFlutterPluginApi.FLStringType r10) {
        /*
            r9 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r1 = "arg"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r10 = r10.getValue()
            java.lang.String r1 = "arg.value"
            gy3.C87412m.m108593f(r10, r1)
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.z1 r1 = r1.get(r10)
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r0.get(r10)
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r2 = new com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder
            r2.<init>()
            yu1.b r3 = yu1.C112489b.f336867d
            java.lang.Class<ln.g> r3 = p196ln.C76706g.class
            di3.d r4 = di3.C86312j.m106911c(r3)
            ln.g r4 = (p196ln.C76706g) r4
            ln.k r4 = r4.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r4 = (com.tencent.p014mm.modelavatar.AvatarStorage) r4
            r5 = 1
            java.lang.String r4 = r4.mo93559h(r10, r5)
            r6 = 0
            if (r4 == 0) goto L_0x0052
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r7 = 0
            goto L_0x0053
        L_0x0052:
            r7 = 1
        L_0x0053:
            java.lang.String r8 = "MicroMsg.FlutterVoipService"
            if (r7 != 0) goto L_0x005d
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r7 != 0) goto L_0x0089
        L_0x005d:
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.g r3 = (p196ln.C76706g) r3
            ln.k r3 = r3.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r3 = (com.tencent.p014mm.modelavatar.AvatarStorage) r3
            java.lang.String r4 = r3.mo93559h(r10, r6)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r3 != 0) goto L_0x0089
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "getAvatarPath returns null. path: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            r3 = 0
            goto L_0x00a9
        L_0x0089:
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getAvatarPath -> path: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = ", realPath: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
        L_0x00a9:
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x00ae
            r3 = r4
        L_0x00ae:
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r2 = r2.setAvatarPath(r3)
            java.lang.Class<d62.i> r3 = d62.C75339i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            d62.i r3 = (d62.C75339i) r3
            java.lang.String r3 = r3.getDisplayName(r10)
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r2 = r2.setDisplayName(r3)
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r2 = r2.setUsername(r10)
            int r1 = r1.f149500H
            if (r1 == r5) goto L_0x00d3
            r3 = 2
            if (r1 == r3) goto L_0x00d0
            java.lang.String r1 = "unknown"
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r1 = "female"
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r1 = "male"
        L_0x00d5:
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r1 = r2.setGender(r1)
            java.lang.String r0 = qe0.C47806g.m53116a(r0)
            if (r0 != 0) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r4 = r0
        L_0x00e1:
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r0 = r1.setSubName(r4)
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85843n5(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams$Builder r10 = r0.setIsOpenIM(r10)
            com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams r10 = r10.build()
            java.lang.String r0 = "Builder()\n            .s…OpenIM(username)).build()"
            gy3.C87412m.m108593f(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wu1.C111869f.getUserInfo(com.tencent.pigeon.VoIPFlutterPluginApi$FLStringType):com.tencent.pigeon.VoIPFlutterPluginApi$UserInfoParams");
    }

    public void hangUp() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "hangUp()");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            flutterVoipMgr.mo152484p();
        }
    }

    public void hideRingtoneHalfDialog() {
        C101218e0 e0Var = this.f334938p;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        this.f334938p = null;
    }

    public VoIPFlutterPluginApi.FLBoolType isCaller() {
        VoIPFlutterPluginApi.FLBoolType.Builder builder = new VoIPFlutterPluginApi.FLBoolType.Builder();
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        VoIPFlutterPluginApi.FLBoolType build = builder.setValue(Boolean.valueOf(flutterVoipMgr != null ? flutterVoipMgr.f317101r : false)).build();
        C87412m.m108593f(build, "Builder()\n            .s…tCall() ?: false).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLBoolType isCameraFloatable() {
        VoIPFlutterPluginApi.FLBoolType.Builder builder = new VoIPFlutterPluginApi.FLBoolType.Builder();
        boolean z = true;
        if (C107835h0.f322845b.f322806e != 1) {
            z = false;
        }
        VoIPFlutterPluginApi.FLBoolType build = builder.setValue(Boolean.valueOf(z)).build();
        C87412m.m108593f(build, "Builder()\n            .s…eviceInfo.ENABLE).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLBoolType isCameraOn() {
        return mo163616c(Boolean.valueOf(!C109247e.vx0().f333451k));
    }

    public VoIPFlutterPluginApi.FLBoolType isFrontCamera() {
        C108077f0 f0Var;
        C104031a aVar;
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        boolean z = false;
        if (!(flutterVoipMgr == null || (f0Var = flutterVoipMgr.f317092g) == null || (aVar = f0Var.f323642b) == null)) {
            z = aVar.mo145631c();
        }
        return mo163616c(Boolean.valueOf(z));
    }

    public VoIPFlutterPluginApi.FLBoolType isMuted() {
        VoIPFlutterPluginApi.FLBoolType.Builder builder = new VoIPFlutterPluginApi.FLBoolType.Builder();
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        VoIPFlutterPluginApi.FLBoolType build = builder.setValue(Boolean.valueOf(flutterVoipMgr != null ? flutterVoipMgr.f317089d.mo164337b() : false)).build();
        C87412m.m108593f(build, "Builder()\n            .s…Muted() ?: false).build()");
        return build;
    }

    public VoIPFlutterPluginApi.FLBoolType isScreenInteractive() {
        Context context = MMApplicationContext.getContext();
        Object systemService = context.getSystemService("keyguard");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        Object systemService2 = context.getSystemService("power");
        C87412m.m108592e(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService2;
        boolean isKeyguardLocked = ((KeyguardManager) systemService).isKeyguardLocked();
        Activity activity = this.f334931f;
        boolean z = true;
        boolean hasWindowFocus = activity != null ? activity.hasWindowFocus() : true;
        boolean isInteractive = powerManager.isInteractive();
        if ((!hasWindowFocus && isKeyguardLocked) || !isInteractive) {
            z = false;
        }
        return mo163616c(Boolean.valueOf(z));
    }

    public VoIPFlutterPluginApi.FLBoolType isScreenSplited() {
        Activity activity = this.f334931f;
        if (activity == null) {
            return mo163616c(Boolean.FALSE);
        }
        C85811a5.m106025b(activity);
        return (C85875k4.m106208w() || C85985z2.m106332d(activity.getTaskId())) ? (C85875k4.m106209x(activity.getTaskId()) || C85861e4.m106115b(activity)) ? mo163616c(Boolean.TRUE) : mo163616c(Boolean.FALSE) : mo163616c(Boolean.FALSE);
    }

    public VoIPFlutterPluginApi.FLBoolType isSplitScreenSupported() {
        Activity activity = this.f334931f;
        if (activity == null) {
            return mo163616c(Boolean.FALSE);
        }
        C85811a5.m106025b(activity);
        return mo163616c(Boolean.valueOf(C85875k4.m106208w() || C85985z2.m106332d(activity.getTaskId())));
    }

    public VoIPFlutterPluginApi.FLBoolType isVideoMode() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "isVideoMode()");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        return mo163616c(flutterVoipMgr != null ? Boolean.valueOf(flutterVoipMgr.f317102s) : null);
    }

    public void minimize(VoIPFlutterPluginApi.MinimizeParams minimizeParams, VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result) {
        C87412m.m108594g(minimizeParams, "params");
        C87412m.m108594g(result, "result");
        Boolean needPop = minimizeParams.getNeedPop();
        if (needPop == null) {
            needPop = Boolean.TRUE;
        }
        boolean booleanValue = needPop.booleanValue();
        Boolean showAlertIfNoPermission = minimizeParams.getShowAlertIfNoPermission();
        if (showAlertIfNoPermission == null) {
            showAlertIfNoPermission = Boolean.FALSE;
        }
        boolean booleanValue2 = showAlertIfNoPermission.booleanValue();
        Boolean needAnimation = minimizeParams.getNeedAnimation();
        if (needAnimation == null) {
            needAnimation = Boolean.FALSE;
        }
        mo163615b(booleanValue, booleanValue2, needAnimation.booleanValue(), new C66193d(result, this));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.lifecycle.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.tencent.mm.plugin.voip.ui.VideoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: su1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.lifecycle.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: androidx.lifecycle.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: su1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: su1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: com.tencent.mm.plugin.voip.ui.VideoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: androidx.lifecycle.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: androidx.lifecycle.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: com.tencent.mm.plugin.voip.ui.VideoActivity} */
    /* JADX WARNING: type inference failed for: r16v3, types: [n33.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = r3.getIntent();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0268  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToActivity(p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Class<pn.e> r2 = p646pn.C110234e.class
            java.lang.String r3 = "binding"
            gy3.C87412m.m108594g(r0, r3)
            android.app.Activity r3 = r23.getActivity()
            r1.f334931f = r3
            r4 = 0
            if (r3 == 0) goto L_0x0021
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L_0x0021
            yu1.b r5 = yu1.C112489b.f336867d
            java.lang.String r3 = r5.mo161938rz(r3)
            goto L_0x0022
        L_0x0021:
            r3 = r4
        L_0x0022:
            r1.f334936n = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onAttachedToActivity: "
            r3.append(r5)
            android.app.Activity r5 = r1.f334931f
            r3.append(r5)
            java.lang.String r5 = ", isFreshLaunch="
            r3.append(r5)
            boolean r5 = r1.f334933h
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.FlutterVoipPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            android.app.Activity r3 = r23.getActivity()
            android.view.Window r3 = r3.getWindow()
            r6 = 6815872(0x680080, float:9.551071E-39)
            r3.addFlags(r6)
            android.app.Activity r3 = r23.getActivity()
            r6 = 7
            r3.setRequestedOrientation(r6)
            android.app.Activity r3 = r23.getActivity()
            android.view.Window r3 = r3.getWindow()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            r8 = 0
            if (r6 < r7) goto L_0x006f
            wu1.C15595j.m14615a(r3, r8)
            goto L_0x007c
        L_0x006f:
            android.view.View r3 = r3.getDecorView()
            int r6 = r3.getSystemUiVisibility()
            r6 = r6 | 1792(0x700, float:2.511E-42)
            r3.setSystemUiVisibility(r6)
        L_0x007c:
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            l33.a r3 = r3.f317333b
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr
            if (r6 == 0) goto L_0x0089
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r3 = (com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr) r3
            goto L_0x008a
        L_0x0089:
            r3 = r4
        L_0x008a:
            boolean r6 = r1.f334933h
            if (r6 == 0) goto L_0x00be
            java.lang.String r6 = "init flutter voip mgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r3 != 0) goto L_0x00bc
            yu1.b r3 = yu1.C112489b.f336867d
            android.app.Activity r6 = r23.getActivity()
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "binding.activity.intent"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r6 = r3.mo161938rz(r6)
            gy3.C87412m.m108591d(r6)
            r3.E90(r6)
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            l33.a r3 = r3.f317333b
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr
            if (r6 == 0) goto L_0x00bb
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r3 = (com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr) r3
            goto L_0x00bc
        L_0x00bb:
            r3 = r4
        L_0x00bc:
            r1.f334935j = r3
        L_0x00be:
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r6 = r1.f334935j
            java.lang.String r7 = "MicroMsg.FlutterVoipMgr"
            java.lang.String r14 = "binding.activity"
            if (r6 == 0) goto L_0x00e3
            android.app.Activity r9 = r23.getActivity()
            gy3.C87412m.m108593f(r9, r14)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "onActivityAttached, "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            r6.f313170o1 = r9
        L_0x00e3:
            if (r3 != 0) goto L_0x00eb
            java.lang.String r0 = "manager is null, skip onAttachedToActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x00eb:
            android.app.Activity r10 = r1.f334931f
            gy3.C87412m.m108591d(r10)
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            com.tencent.mm.plugin.voip.model.r r5 = r5.f317396a
            r5.f317501y = r6
            r5.f317502z = r3
            java.lang.String r5 = "MicroMsg.Voip.VoipServiceEx"
            java.lang.String r6 = "attach ui........"
            z33.C112597j.m153936a(r5, r6)
            boolean r5 = r3.f313164i1
            r6 = 1
            if (r5 == 0) goto L_0x0124
            java.lang.String r5 = "voipMgr is inited"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            java.lang.String r5 = r3.f317098p
            r3.f317098p = r5
            boolean r5 = r3.f317101r
            r3.f317101r = r5
            boolean r5 = r3.f317102s
            r3.f317102s = r5
            r3.mo152441Q()
            r7 = r14
            goto L_0x0208
        L_0x0124:
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            java.lang.String r5 = r5.f317413r
            r3.f317098p = r5
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            boolean r5 = r5.f317415t
            r3.f317101r = r5
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            boolean r5 = r5.f317414s
            r3.f317102s = r5
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            int r5 = r5.mo152659e()
            r3.f313162g1 = r5
            java.lang.String r5 = r3.f317098p
            if (r5 != 0) goto L_0x0159
            java.lang.String r5 = "username is null, can't start voip"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
            goto L_0x01e7
        L_0x0159:
            boolean r5 = r3.f317101r
            if (r5 == 0) goto L_0x0189
            boolean r5 = r3.mo149998h1()     // Catch:{ Exception -> 0x0184 }
            if (r5 == 0) goto L_0x0189
            yu1.b r5 = yu1.C112489b.f336867d     // Catch:{ Exception -> 0x0184 }
            vu1.e r9 = vu1.C111622e.PhoneInUse     // Catch:{ Exception -> 0x0184 }
            r5.mo164232B(r9, r4)     // Catch:{ Exception -> 0x0184 }
            r5 = 2131838631(0x7f1146a7, float:1.931049E38)
            android.widget.Toast r5 = p910lj.C76701a.makeText((android.content.Context) r10, (int) r5, (int) r8)     // Catch:{ Exception -> 0x0184 }
            r5.show()     // Catch:{ Exception -> 0x0184 }
            java.lang.String r5 = "this phone is on a call"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)     // Catch:{ Exception -> 0x0184 }
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()     // Catch:{ Exception -> 0x0184 }
            r5.mo152600N()     // Catch:{ Exception -> 0x0184 }
            r3.mo152440P0(r8)     // Catch:{ Exception -> 0x0184 }
            goto L_0x01e7
        L_0x0184:
            java.lang.String r5 = "not ready now!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
        L_0x0189:
            java.lang.String r5 = r3.f317062L
            if (r5 == 0) goto L_0x0194
            yu1.b r9 = yu1.C112489b.f336867d
            vu1.e r11 = vu1.C111622e.RiskTip
            r9.mo164232B(r11, r5)
        L_0x0194:
            boolean r5 = r3.f317101r
            if (r5 != 0) goto L_0x01ee
            com.tencent.mm.plugin.voip.model.h0 r5 = l33.C109247e.xx0()
            com.tencent.mm.plugin.voip.model.m0 r5 = r5.f317332a
            boolean r5 = r5.mo152664i()
            if (r5 != 0) goto L_0x01ee
            java.lang.String r5 = "is out call, but kenerl is not working"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
            eb0.u0 r5 = eb0.C75594u0.f222079a
            monitor-enter(r5)
            java.lang.String r7 = eb0.C75594u0.f222080b     // Catch:{ all -> 0x01ea }
            monitor-exit(r5)
            java.lang.String r5 = r3.f317098p
            boolean r5 = gy3.C87412m.m108589b(r7, r5)
            if (r5 == 0) goto L_0x01bb
            r5 = 6
            r18 = 6
            goto L_0x01be
        L_0x01bb:
            r5 = 4
            r18 = 4
        L_0x01be:
            java.lang.String r15 = r3.f317098p
            boolean r5 = r3.f317102s
            if (r5 == 0) goto L_0x01ca
            int r5 = com.tencent.p014mm.storage.C72963f4.f212661I1
            java.lang.String r5 = "voip_content_video"
            goto L_0x01cf
        L_0x01ca:
            int r5 = com.tencent.p014mm.storage.C72963f4.f212661I1
            java.lang.String r5 = "voip_content_voice"
        L_0x01cf:
            r16 = r5
            boolean r5 = r3.f317101r
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131838547(0x7f114653, float:1.931032E38)
            java.lang.String r19 = r7.getString(r9)
            r20 = 0
            r21 = 0
            r17 = r5
            com.tencent.p014mm.plugin.voip.model.C106348g0.m143244e(r15, r16, r17, r18, r19, r20, r21)
        L_0x01e7:
            r7 = r14
            r4 = 0
            goto L_0x0209
        L_0x01ea:
            r0 = move-exception
            r2 = r0
            monitor-exit(r5)
            throw r2
        L_0x01ee:
            boolean r5 = r3.f317058H
            if (r5 != 0) goto L_0x0205
            java.lang.String r11 = r3.f317098p
            gy3.C87412m.m108591d(r11)
            boolean r12 = r3.f317101r
            boolean r13 = r3.f317102s
            int r5 = r3.f313162g1
            long r4 = (long) r5
            r9 = r3
            r7 = r14
            r14 = r4
            r9.mo152470g0(r10, r11, r12, r13, r14)
            goto L_0x0206
        L_0x0205:
            r7 = r14
        L_0x0206:
            r3.f313164i1 = r6
        L_0x0208:
            r4 = 1
        L_0x0209:
            if (r4 == 0) goto L_0x024c
            di3.d r4 = di3.C86312j.m106911c(r2)
            pn.e r4 = (p646pn.C110234e) r4
            xv0.e r4 = r4.mo161399pY()
            r4.mo149113c(r8)
            o33.a r4 = o33.C109935a.C109937b.f328933a
            com.tencent.mm.plugin.ball.model.BallInfo r5 = r4.f311726d
            com.tencent.mm.plugin.ball.model.BallReportInfo r5 = r5.f311683H
            r9 = 3
            r5.f311721j = r9
            di3.d r2 = di3.C86312j.m106911c(r2)
            pn.e r2 = (p646pn.C110234e) r2
            xv0.e r2 = r2.mo161399pY()
            com.tencent.mm.plugin.ball.model.BallInfo r4 = r4.f311726d
            r2.mo149142r(r4)
            com.tencent.mm.plugin.voip.ui.f r2 = r3.f317093h
            if (r2 == 0) goto L_0x0239
            com.tencent.mm.plugin.voip.ui.f r2 = r3.f317093h
            r2.mo152929k3(r8)
        L_0x0239:
            zu1.b r2 = new zu1.b
            r2.<init>(r3)
            r3.f317093h = r2
            com.tencent.mm.plugin.voip.ui.f r2 = r3.f317093h
            r3.mo152494v(r2, r6)
            com.tencent.mm.sdk.event.IListener<?> r2 = r3.f313173r1
            r2.alive()
            r2 = 1
            goto L_0x0258
        L_0x024c:
            com.tencent.mm.plugin.voip.model.h0 r2 = l33.C109247e.xx0()
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.mo152607f(r4, r3)
            r2 = 0
        L_0x0258:
            if (r2 != 0) goto L_0x0268
            r3.mo149987O0()
            android.app.Activity r0 = r23.getActivity()
            r0.finish()
            r0 = 0
            r1.f334935j = r0
            return
        L_0x0268:
            boolean r4 = r1.f334933h
            if (r4 == 0) goto L_0x027d
            boolean r4 = r1.f334939q
            if (r4 != 0) goto L_0x027b
            boolean r4 = r3.f317102s
            if (r4 == 0) goto L_0x027b
            xu1.a r4 = r1.f334929d
            if (r4 == 0) goto L_0x027b
            r4.mo163979e(r3)
        L_0x027b:
            r2 = 0
            goto L_0x02a4
        L_0x027d:
            wu1.b r3 = wu1.C111864b.f334908a
            java.lang.String r3 = "MicroMsg.FlutterVoIPReportAgent"
            java.lang.String r4 = "onRestoreFromPIP"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            wu1.b$a r3 = wu1.C111864b.f334912e
            long r4 = java.lang.System.currentTimeMillis()
            r3.f334913a = r4
            wu1.b$a r3 = wu1.C111864b.f334912e
            r3.f334915c = r6
            a14.n0 r9 = wu1.C111864b.f334910c
            wu1.e r12 = new wu1.e
            r2 = 0
            r12.<init>(r2)
            r11 = 0
            r13 = 3
            r14 = 0
            r10 = 0
            a14.z1 r3 = a14.C53895h.m60466d(r9, r10, r11, r12, r13, r14)
            wu1.C111864b.f334911d = r3
        L_0x02a4:
            r1.f334933h = r8
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 == 0) goto L_0x02b3
            com.tencent.mm.plugin.voip.model.h0 r3 = l33.C109247e.xx0()
            r3.mo152593G(r8, r8)
        L_0x02b3:
            android.app.Activity r3 = r23.getActivity()
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.voip.p475ui.VideoActivity
            if (r4 == 0) goto L_0x02c0
            r16 = r3
            com.tencent.mm.plugin.voip.ui.VideoActivity r16 = (com.tencent.p014mm.plugin.voip.p475ui.VideoActivity) r16
            goto L_0x02c2
        L_0x02c0:
            r16 = r2
        L_0x02c2:
            if (r16 == 0) goto L_0x02cb
            n33.a r16 = r16.mo152910H7()
            r3 = r16
            goto L_0x02cc
        L_0x02cb:
            r3 = r2
        L_0x02cc:
            boolean r4 = r3 instanceof su1.C110813a
            if (r4 == 0) goto L_0x02d7
            r16 = r3
            su1.a r16 = (su1.C110813a) r16
            r3 = r16
            goto L_0x02d8
        L_0x02d7:
            r3 = r2
        L_0x02d8:
            if (r3 == 0) goto L_0x02e1
            wu1.f$e r4 = new wu1.f$e
            r4.<init>(r1)
            r3.f331535e = r4
        L_0x02e1:
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r3 = r1.f334935j
            if (r3 != 0) goto L_0x02e6
            goto L_0x0337
        L_0x02e6:
            android.app.Activity r4 = r23.getActivity()
            gy3.C87412m.m108593f(r4, r7)
            boolean r5 = r4 instanceof androidx.lifecycle.C0125s
            if (r5 == 0) goto L_0x02f4
            r2 = r4
            androidx.lifecycle.s r2 = (androidx.lifecycle.C0125s) r2
        L_0x02f4:
            if (r2 == 0) goto L_0x0304
            androidx.lifecycle.j r2 = r2.getLifecycle()
            if (r2 == 0) goto L_0x0304
            com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$observePermission$1 r5 = new com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$observePermission$1
            r5.<init>(r1)
            r2.addObserver(r5)
        L_0x0304:
            java.lang.Class<aw.d> r2 = p447aw.C103918d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r8 = r2
            aw.d r8 = (p447aw.C103918d) r8
            int r2 = r3.mo152441Q()
            boolean r2 = z33.C112604l.m153983f(r2)
            java.lang.String r3 = "android.permission.RECORD_AUDIO"
            if (r2 == 0) goto L_0x0320
            java.lang.String r2 = "android.permission.CAMERA"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            goto L_0x0324
        L_0x0320:
            java.lang.String[] r2 = new java.lang.String[]{r3}
        L_0x0324:
            r10 = r2
            r11 = 19
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            r9 = r4
            r8.Uu0(r9, r10, r11, r12, r13)
            wu1.g r2 = new wu1.g
            r2.<init>(r4, r1)
            r0.addRequestPermissionsResultListener(r2)
        L_0x0337:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wu1.C111869f.onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding):void");
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "flutterPluginBinding");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "onAttachToEngine");
        int i = 1;
        this.f334933h = true;
        C111864b bVar = C111864b.f334908a;
        Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onLaunch");
        C111864b.f334912e = new C111864b.C111865a(0, 0, false, 0, 0, 0, 0, false, 255, (C8480h) null);
        FlutterVoIPP2PStruct flutterVoIPP2PStruct = new FlutterVoIPP2PStruct();
        C111864b.f334909b = flutterVoIPP2PStruct;
        flutterVoIPP2PStruct.f310177e = C109247e.xx0().f317332a.f317415t ? 1 : 2;
        FlutterVoIPP2PStruct flutterVoIPP2PStruct2 = C111864b.f334909b;
        if (!C109247e.xx0().f317332a.f317414s) {
            i = 2;
        }
        flutterVoIPP2PStruct2.f310176d = i;
        C111864b.f334912e.f334913a = System.currentTimeMillis();
        C53895h.m60466d(C111864b.f334910c, (C66212f) null, (C53934p0) null, new C111867d((C15601d<? super C111867d>) null), 3, (Object) null);
        C111864b.f334911d = C53895h.m60466d(C111864b.f334910c, (C66212f) null, (C53934p0) null, new C111868e((C15601d<? super C111868e>) null), 3, (Object) null);
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35845X(flutterPluginBinding.getBinaryMessenger(), this);
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_voip");
        methodChannel.setMethodCallHandler(this);
        this.f334930e = methodChannel;
        this.f334932g.mo145135c(C39623j.C39625b.ON_START);
        C112174a aVar = this.f334929d;
        if (aVar == null) {
            TextureRegistry textureRegistry = flutterPluginBinding.getTextureRegistry();
            C87412m.m108593f(textureRegistry, "flutterPluginBinding.textureRegistry");
            aVar = new C112174a(textureRegistry);
        }
        this.f334929d = aVar;
        this.f334934i = C53930o0.m60555b();
    }

    public void onBooted() {
        C111864b bVar = C111864b.f334908a;
        Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onBooted");
        FlutterVoIPP2PStruct flutterVoIPP2PStruct = C111864b.f334909b;
        if (flutterVoIPP2PStruct.f310185m == 0) {
            flutterVoIPP2PStruct.f310185m = System.currentTimeMillis() - C111864b.f334912e.f334913a;
        }
    }

    public void onClickRingtoneButton() {
        C111730z zVar = C111730z.f334576a;
        C111730z.f334596u = true;
        C61767o oVar = C61767o.f175575a;
        C66132f value = C61767o.f175578d.getValue();
        if (value != null) {
            Activity activity = this.f334931f;
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity != null) {
                C39623j lifecycle = appCompatActivity.getLifecycle();
                C87412m.m108593f(lifecycle, "context.lifecycle");
                this.f334938p = RingtoneHalfBottomDialog.m66041b(appCompatActivity, lifecycle, "", value, 1, 9, 0, "", false, false, new C111875f(value, this, appCompatActivity), (C32227p) null, 2112, (Object) null);
            }
        }
    }

    public void onDetachedFromActivity() {
        Log.m105928w("MicroMsg.FlutterVoipPlugin", "onDetachedFromActivity: activity=" + this.f334931f + ", voipMgr=" + this.f334935j);
        Activity activity = this.f334931f;
        if (activity != null) {
            if (!activity.isFinishing()) {
                Log.m105928w("MicroMsg.FlutterVoipPlugin", "activity detached but not in finishing state");
                activity.finish();
            }
            this.f334931f = null;
        }
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            int Q = flutterVoipMgr.mo152441Q();
            Log.m105928w("MicroMsg.FlutterVoipPlugin", "state=" + Q + ", engineId=" + flutterVoipMgr.f313161f1);
            Map<Integer, String> map = C112604l.f337212a;
            if ((Q == 262 || Q == 8) || Q == -1) {
                Log.m105928w("MicroMsg.FlutterVoipPlugin", "VoIP has been finished, clear the engine");
                mo163614a(flutterVoipMgr.f313161f1);
            }
            Log.m105924i("MicroMsg.FlutterVoipMgr", "onActivityDetached, " + flutterVoipMgr);
            flutterVoipMgr.f313170o1 = null;
            return;
        }
        String str = this.f334936n;
        if (str != null) {
            mo163614a(str);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f334931f = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "onDetachedFromEngine");
        hideRingtoneHalfDialog();
        MethodChannel methodChannel = this.f334930e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        this.f334930e = null;
        this.f334932g.mo145135c(C39623j.C39625b.ON_STOP);
        C53930o0.m60558e(this.f334934i, (CancellationException) null, 1, (Object) null);
        this.f334935j = null;
        C112174a aVar = this.f334929d;
        if (aVar != null) {
            aVar.mo163978d();
        }
        C112174a aVar2 = this.f334929d;
        if (aVar2 != null) {
            String str = aVar2.f335877b;
            Log.m105924i(str, aVar2.hashCode() + " clearTextureTrash");
            Iterator it = ((ArrayList) aVar2.f335879d).iterator();
            while (it.hasNext()) {
                ((TextureRegistry.SurfaceTextureEntry) it.next()).release();
            }
            ((ArrayList) aVar2.f335879d).clear();
        }
        String str2 = this.f334936n;
        if (str2 != null) {
            mo163614a(str2);
        }
        this.f334929d = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(methodCall, "call");
        C87412m.m108594g(result, "result");
        if (C87412m.m108589b(methodCall.method, "getPlatformVersion")) {
            result.success("Android " + Build.VERSION.RELEASE);
            return;
        }
        result.notImplemented();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f334931f = activityPluginBinding.getActivity();
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "onReattachedToActivityForConfigChanges:" + this.f334931f);
    }

    public void onRendered() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "onRendered()");
        C111864b bVar = C111864b.f334908a;
        Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onRendered");
        C111864b.C111865a aVar = C111864b.f334912e;
        if (aVar.f334915c) {
            long j = aVar.f334918f;
            long currentTimeMillis = System.currentTimeMillis();
            C111864b.C111865a aVar2 = C111864b.f334912e;
            aVar.f334918f = j + (currentTimeMillis - aVar2.f334913a);
            aVar2.f334919g++;
            return;
        }
        C111864b.f334909b.f310179g = System.currentTimeMillis() - C111864b.f334912e.f334913a;
    }

    public void pauseRing() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "pauseRing");
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86667W();
    }

    public void prepareTextures() {
        FlutterVoipMgr flutterVoipMgr;
        C112174a aVar;
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "prepareTextures");
        if (!this.f334939q && (flutterVoipMgr = this.f334935j) != null && (aVar = this.f334929d) != null) {
            aVar.mo163979e(flutterVoipMgr);
        }
    }

    public List<VoIPFlutterPluginApi.AudioRouteInfo> queryAudioRouteInfos() {
        C112592e eVar;
        List<C107054l.C107055a> queryAudioRouteInfos;
        ArrayList arrayList = new ArrayList();
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (!(flutterVoipMgr == null || (eVar = flutterVoipMgr.f317089d) == null || (queryAudioRouteInfos = eVar.queryAudioRouteInfos()) == null)) {
            for (C107054l.C107055a aVar : queryAudioRouteInfos) {
                VoIPFlutterPluginApi.AudioRouteInfo.Builder builder = new VoIPFlutterPluginApi.AudioRouteInfo.Builder();
                String str = aVar.f320469b;
                if (str == null) {
                    str = "";
                }
                VoIPFlutterPluginApi.AudioRouteInfo.Builder deviceName = builder.setDeviceName(str);
                int i = aVar.f320468a;
                VoIPFlutterPluginApi.AudioRouteInfo build = deviceName.setDeviceType(i != 1 ? i != 2 ? i != 3 ? i != 4 ? VoIPFlutterPluginApi.AudioDevice.speaker : VoIPFlutterPluginApi.AudioDevice.bluetooth : VoIPFlutterPluginApi.AudioDevice.headset : VoIPFlutterPluginApi.AudioDevice.earpiece : VoIPFlutterPluginApi.AudioDevice.speaker).build();
                C87412m.m108593f(build, "Builder().setDeviceName(…e(it.deviceType)).build()");
                arrayList.add(build);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f317089d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.pigeon.VoIPFlutterPluginApi.AudioRouteInfo queryCurrentAudioRouteInfo() {
        /*
            r3 = this;
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr r0 = r3.f334935j
            if (r0 == 0) goto L_0x000d
            z33.e r0 = r0.f317089d
            if (r0 == 0) goto L_0x000d
            dn.l$a r0 = r0.mo164346o()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioRouteInfo$Builder r1 = new com.tencent.pigeon.VoIPFlutterPluginApi$AudioRouteInfo$Builder
            r1.<init>()
            if (r0 == 0) goto L_0x0019
            java.lang.String r2 = r0.f320469b
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r2 = ""
        L_0x001b:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioRouteInfo$Builder r1 = r1.setDeviceName(r2)
            if (r0 == 0) goto L_0x0024
            int r0 = r0.f320468a
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            r2 = 1
            if (r0 == r2) goto L_0x003d
            r2 = 2
            if (r0 == r2) goto L_0x003a
            r2 = 3
            if (r0 == r2) goto L_0x0037
            r2 = 4
            if (r0 == r2) goto L_0x0034
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioDevice r0 = com.tencent.pigeon.VoIPFlutterPluginApi.AudioDevice.speaker
            goto L_0x003f
        L_0x0034:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioDevice r0 = com.tencent.pigeon.VoIPFlutterPluginApi.AudioDevice.bluetooth
            goto L_0x003f
        L_0x0037:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioDevice r0 = com.tencent.pigeon.VoIPFlutterPluginApi.AudioDevice.headset
            goto L_0x003f
        L_0x003a:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioDevice r0 = com.tencent.pigeon.VoIPFlutterPluginApi.AudioDevice.earpiece
            goto L_0x003f
        L_0x003d:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioDevice r0 = com.tencent.pigeon.VoIPFlutterPluginApi.AudioDevice.speaker
        L_0x003f:
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioRouteInfo$Builder r0 = r1.setDeviceType(r0)
            com.tencent.pigeon.VoIPFlutterPluginApi$AudioRouteInfo r0 = r0.build()
            java.lang.String r1 = "Builder().setDeviceName(….deviceType?:-1)).build()"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wu1.C111869f.queryCurrentAudioRouteInfo():com.tencent.pigeon.VoIPFlutterPluginApi$AudioRouteInfo");
    }

    public Long queryGPURating() {
        return Long.valueOf((long) C111744e.f334654d.mo163483f());
    }

    public VoIPFlutterPluginApi.FLBoolType reject() {
        Boolean bool;
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            bool = Boolean.valueOf(flutterVoipMgr.f317102s ? flutterVoipMgr.mo152432K() : flutterVoipMgr.mo152486q());
        } else {
            bool = null;
        }
        return mo163616c(bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        r3 = r1.f332575f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseTexture(com.tencent.pigeon.VoIPFlutterPluginApi.FLIntType r7) {
        /*
            r6 = this;
            java.lang.String r0 = "arg"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "releaseTexture, textureId:"
            r0.append(r1)
            java.lang.Long r1 = r7.getValue()
            long r1 = r1.longValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FlutterVoipPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            xu1.a r0 = r6.f334929d
            if (r0 == 0) goto L_0x008e
            java.lang.Long r7 = r7.getValue()
            if (r7 != 0) goto L_0x002e
            goto L_0x008e
        L_0x002e:
            boolean r1 = z33.C112595h.f337171f
            if (r1 == 0) goto L_0x0036
            r0.mo163978d()
            goto L_0x008e
        L_0x0036:
            u.f<xu1.a$c> r1 = r0.f335878c
            long r2 = r7.longValue()
            r4 = 0
            java.lang.Object r1 = r1.mo162755d(r2, r4)
            xu1.a$c r1 = (xu1.C112174a.C112177c) r1
            if (r1 == 0) goto L_0x005b
            zu1.a r2 = r1.f335886c
            r2.f337405f = r4
            java.util.List<io.flutter.view.TextureRegistry$SurfaceTextureEntry> r2 = r0.f335879d
            io.flutter.view.TextureRegistry$SurfaceTextureEntry r3 = r1.f335885b
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r3)
            zu1.a r1 = r1.f335886c
            zu1.a$b r1 = r1.f337404e
            if (r1 == 0) goto L_0x005b
            r1.mo150005b()
        L_0x005b:
            u.f<xu1.a$c> r1 = r0.f335878c
            long r2 = r7.longValue()
            long[] r4 = r1.f332574e
            int r5 = r1.f332576g
            int r2 = p1042u.C111056e.m151430b(r4, r5, r2)
            if (r2 < 0) goto L_0x0078
            java.lang.Object[] r3 = r1.f332575f
            r4 = r3[r2]
            java.lang.Object r5 = p1042u.C111057f.f332572h
            if (r4 == r5) goto L_0x0078
            r3[r2] = r5
            r2 = 1
            r1.f332573d = r2
        L_0x0078:
            java.lang.String r0 = r0.f335877b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "release flutter texture "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wu1.C111869f.releaseTexture(com.tencent.pigeon.VoIPFlutterPluginApi$FLIntType):void");
    }

    public void reportFps(VoIPFlutterPluginApi.FpsParams fpsParams) {
        C87412m.m108594g(fpsParams, "params");
        C111864b bVar = C111864b.f334908a;
        Double slowFrameRate = fpsParams.getSlowFrameRate();
        C87412m.m108593f(slowFrameRate, "params.slowFrameRate");
        double doubleValue = slowFrameRate.doubleValue();
        Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "reportFps: slowFrameRate=" + doubleValue);
        C111864b.f334909b.f310186n = C60641c.m70922c(doubleValue * ((double) 100));
    }

    public void requestRingtoneInfo(VoIPFlutterPluginApi.FLStringType fLStringType) {
        C87412m.m108594g(fLStringType, "arg");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "requestRingtoneInfo: " + fLStringType.getValue());
        C53895h.m60466d(this.f334934i, (C66212f) null, (C53934p0) null, new C66194g(fLStringType, (C15601d<? super C66194g>) null), 3, (Object) null);
    }

    public void requestRingtoneMute(VoIPFlutterPluginApi.FLBoolType fLBoolType) {
        C87412m.m108594g(fLBoolType, "mute");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "requestRingtoneMute: " + fLBoolType + ".value");
        Boolean value = fLBoolType.getValue();
        C87412m.m108593f(value, "mute.value");
        ((C109749c) C86312j.m106911c(C109749c.class)).setMute(value.booleanValue());
    }

    public void restartRing() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "restartRing");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            flutterVoipMgr.mo152496x();
        }
    }

    public void resumeRing() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "resumeRing");
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86669Z();
    }

    public Boolean routeToDevice(VoIPFlutterPluginApi.AudioRouteInfo audioRouteInfo) {
        boolean z;
        C112592e eVar;
        C87412m.m108594g(audioRouteInfo, TPReportKeys.Common.COMMON_DEVICE_NAME);
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            VoIPFlutterPluginApi.AudioDevice deviceType = audioRouteInfo.getDeviceType();
            C87412m.m108593f(deviceType, "device.deviceType");
            int i = C111617a.f334111a[deviceType.ordinal()];
            C107054l.C107055a aVar = new C107054l.C107055a(i != 1 ? i != 2 ? i != 3 ? 1 : 2 : 3 : 4, (String) null, 0, 6, (C8480h) null);
            flutterVoipMgr.mo152461a1(aVar);
            flutterVoipMgr.mo152458Z0(aVar.mo157500a(), 19);
        }
        FlutterVoipMgr flutterVoipMgr2 = this.f334935j;
        if (flutterVoipMgr2 == null || (eVar = flutterVoipMgr2.f317089d) == null) {
            z = false;
        } else {
            VoIPFlutterPluginApi.AudioDevice deviceType2 = audioRouteInfo.getDeviceType();
            C87412m.m108593f(deviceType2, "device.deviceType");
            int i2 = C111617a.f334111a[deviceType2.ordinal()];
            z = eVar.mo164342h(new C107054l.C107055a(i2 != 1 ? i2 != 2 ? i2 != 3 ? 1 : 2 : 3 : 4, audioRouteInfo.getDeviceName(), 0, 4, (C8480h) null));
        }
        return Boolean.valueOf(z);
    }

    public void setMuted(VoIPFlutterPluginApi.FLBoolType fLBoolType) {
        C87412m.m108594g(fLBoolType, "arg");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "setMuted(" + fLBoolType.getValue().booleanValue());
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            Boolean value = fLBoolType.getValue();
            C87412m.m108593f(value, "arg.value");
            flutterVoipMgr.mo152476l(value.booleanValue());
        }
    }

    public void setRingtoneSelf(VoIPFlutterPluginApi.FLStringType fLStringType, VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result) {
        C87412m.m108594g(fLStringType, "arg");
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf: " + fLStringType.getValue());
        C53895h.m60466d(this.f334934i, (C66212f) null, (C53934p0) null, new C66195h(result, this, fLStringType, (C15601d<? super C66195h>) null), 3, (Object) null);
    }

    public void setSegmentVirtualBackground(Long l) {
        long longValue = l.longValue();
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        if (flutterVoipMgr != null) {
            flutterVoipMgr.mo152437N0(7);
        }
        C107225c.f320827a.mo157685b(C110264g.C110266c.values()[(int) longValue]);
    }

    public void setSpeakerEnabled(VoIPFlutterPluginApi.FLBoolType fLBoolType) {
        C87412m.m108594g(fLBoolType, "arg");
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "setSpeakerEnabled: " + fLBoolType.getValue().booleanValue());
        C53895h.m60466d(this.f334934i, C53872d1.f151119c, (C53934p0) null, new C111876i(this, fLBoolType, (C15601d<? super C111876i>) null), 2, (Object) null);
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "setSpeakerEnabled ended");
    }

    public void switchCamera(VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result) {
        StringBuilder sb = new StringBuilder();
        sb.append("switchCamera, this.roomId:");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        sb.append(flutterVoipMgr != null ? Integer.valueOf(flutterVoipMgr.f313162g1) : null);
        Log.m105924i("MicroMsg.FlutterVoipPlugin", sb.toString());
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = result;
        FlutterVoipMgr flutterVoipMgr2 = this.f334935j;
        if (flutterVoipMgr2 != null) {
            flutterVoipMgr2.mo152424E(new C66196j(f0Var, this));
        }
    }

    public void switchCameraOpenStatus(VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType> result) {
        C108077f0 f0Var;
        StringBuilder sb = new StringBuilder();
        sb.append("switchCameraOpenStatus, this.roomId:");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        sb.append(flutterVoipMgr != null ? Integer.valueOf(flutterVoipMgr.f313162g1) : null);
        Log.m105924i("MicroMsg.FlutterVoipPlugin", sb.toString());
        C8479f0 f0Var2 = new C8479f0();
        f0Var2.f27484d = result;
        FlutterVoipMgr flutterVoipMgr2 = this.f334935j;
        if (!(flutterVoipMgr2 == null || (f0Var = flutterVoipMgr2.f317092g) == null)) {
            NewVoipMgr$$b newVoipMgr$$b = new NewVoipMgr$$b(flutterVoipMgr2);
            Log.m105924i("MicroMsg.VoIPRenderMgr", "onSwitchCameraOpenStatus");
            C104031a aVar = f0Var.f323642b;
            if (aVar != null) {
                if (aVar.mo145635g()) {
                    C109247e.vx0().f333451k = true;
                    aVar.mo145641m();
                    newVoipMgr$$b.invoke(Boolean.TRUE);
                } else {
                    C109247e.vx0().f333451k = false;
                    aVar.mo145639k();
                    newVoipMgr$$b.invoke(Boolean.FALSE);
                }
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C66197k(f0Var2, this));
    }

    public VoIPFlutterPluginApi.FLBoolType switchToVoiceMode() {
        Log.m105924i("MicroMsg.FlutterVoipPlugin", "switchToVoiceMode()");
        FlutterVoipMgr flutterVoipMgr = this.f334935j;
        return mo163616c(flutterVoipMgr != null ? Boolean.valueOf(flutterVoipMgr.mo152466e()) : null);
    }

    public void toggleSplitScreen() {
        Activity activity = this.f334931f;
        if (activity != null) {
            Boolean value = isScreenSplited().getValue();
            C87412m.m108593f(value, "isScreenSplited.value");
            if (value.booleanValue()) {
                Log.m105924i("MicroMsg.FlutterVoipPlugin", "merge screen");
                C85878m2.m106217f(activity.getTaskId(), 0);
                C85861e4.m106114a(activity, true, true);
                return;
            }
            Log.m105924i("MicroMsg.FlutterVoipPlugin", "split screen");
            C85878m2.m106217f(activity.getTaskId(), 2);
            C85861e4.m106121h(activity, true, true);
        }
    }

    public void updateTextureSize(VoIPFlutterPluginApi.UpdateTextureSizeParams updateTextureSizeParams) {
        C87412m.m108594g(updateTextureSizeParams, "sizeParam");
    }
}

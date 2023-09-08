package p165hr;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C0073g0;
import ak1.C54108o;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.C0125s;
import b50.C54405b;
import b50.C54412f;
import b50.C54421g;
import b50.C54422h;
import bl3.C39818r;
import bp1.C54524f;
import c02.C92331c;
import c30.C104289g;
import cj1.C0557k1;
import cj1.C28569f5;
import cj1.C28580o1;
import cj1.C28582q1;
import cj1.C28586r5;
import cj1.C28598z5;
import cj1.C54730a;
import cj1.C54751e5;
import cj1.C54763g6;
import cj1.C54795n5;
import cj1.C54801p1;
import cj1.C54806r1;
import cj1.C54808r4;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0797z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderH5JumpEmptyUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderHalfJumpEmptyUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveConcertUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostPendingUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLivePostSelectContactUI;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.trtc.TRTCCloudDef;
import di3.C7335d;
import di3.C86312j;
import dj1.C45366h0;
import dj1.C45372k;
import dj1.C45374m;
import dj1.C58284o;
import eb0.C31543z5;
import eg1.C31595x;
import ei3.C86522b;
import er1.C58739j4;
import er1.C58765p3;
import er1.C58777u0;
import er1.C7849o3;
import f14.C58901s;
import f40.C86709a0;
import f50.C58924d;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32229r;
import gf1.C32434d;
import gg1.C32444a;
import gh1.C59447j;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hg1.C32889a;
import hg1.C32890c;
import hg1.C32891d;
import hg1.C32892f;
import hg1.C32893g;
import hg1.C32894h;
import hg1.C32895i;
import hg1.C8527b;
import hg1.C8528e;
import hh1.C59906n;
import hh1.C59907o;
import hh1.C59908p;
import hp3.C87581a;
import ht1.C46108j1;
import ht1.C60152b4;
import ht1.C60172g4;
import ht1.C60184m;
import ht1.C60200t1;
import ht1.C60204t3;
import ht1.C60216z4;
import ht1.C76242a3;
import ht1.C8777j5;
import ht1.C8808v4;
import ig1.C33316a;
import ik1.C33339a;
import ik1.C33340c;
import ik1.C33341d;
import ik1.C33342f;
import ik1.C33343g;
import ik1.C33344j;
import ik1.C33354n;
import ik1.C60333i;
import ik1.C8923b;
import ik1.C8925e;
import is3.C60622a;
import it1.C9252f;
import j20.C117292a;
import j50.C60735a;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46505a1;
import je1.C60803l;
import jh3.C60869d;
import jp3.C9486a;
import jp3.C9487b;
import k20.C9556a;
import k50.C60971a;
import ke3.C88144b;
import kf1.C10064z3;
import kf1.C9622a4;
import kg3.C76577a;
import kotlin.Result;
import kotlin.ResultKt;
import ks3.C10407d;
import ks3.C61159e;
import ks3.C61161k;
import ks3.C61165t;
import ky2.C10432i;
import l60.C99344b;
import lp3.C88629c;
import ls3.C61397g;
import mk1.C10906h;
import nj3.C76912y0;
import nk1.C47272h;
import np1.C61866i0;
import nr3.C89059e;
import ns3.C11269h;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONObject;
import p182kk.C61104a;
import p185kq.C10383h;
import p204mr.C61568m;
import p248ug.C37461n0;
import p50.C62197e;
import p565ir.C60606n;
import p676rl.C36332a;
import p749xh.C66274t3;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C47883u;
import qo3.C77426q;
import r60.C101350i;
import rn1.C13091a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13603j;
import rx3.C13604l;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import s50.C36624a;
import sg1.C63889i;
import sk1.C63947a;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C90363p0;
import t60.C64207e;
import t91.C64208c;
import te3.C48770aw0;
import te3.C48924by0;
import te3.C49098d51;
import te3.C49352ez;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C49842ig0;
import te3.C50008jm0;
import te3.C50073k31;
import te3.C50075k34;
import te3.C50397mg0;
import te3.C50429mo2;
import te3.C50508n81;
import te3.C50516na1;
import te3.C50602nw0;
import te3.C50851pn0;
import te3.C51203s61;
import te3.C51533ue1;
import te3.C51713vn0;
import te3.C51965xf0;
import te3.C51978xi1;
import te3.C52005xq0;
import te3.C52153yq0;
import te3.C64254b81;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64321dp2;
import te3.C64337e61;
import te3.C64351ey0;
import te3.C64390ga1;
import te3.C64414h71;
import te3.C64510l21;
import te3.C64586nn1;
import te3.C64623p81;
import te3.C64650q60;
import te3.C64700s53;
import te3.C64800wf1;
import te3.C64811wq0;
import te3.C64848y91;
import te3.C64855yf1;
import te3.C77949j3;
import tf0.C13883o1;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C27696y;
import up1.C37521f;
import up1.C65426w0;
import w50.C65933h;
import wc1.C15064b;
import wk1.C15440n;
import wk1.C15483x;
import wk1.C15484y;
import wx3.C15601d;
import wx3.C66212f;
import x60.C102564a;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import zc1.C66785b;
import zh3.C91753f;
import zj1.C16217b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hr.t */
public final class C60106t extends C60869d implements C60606n {

    /* renamed from: A */
    public final LruCache<Long, String> f171509A = new LruCache<>(500);

    /* renamed from: g */
    public final ConcurrentHashMap<Long, C13605o<Integer, Long, C51713vn0>> f171510g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public final ConcurrentHashMap<Long, List<C50516na1>> f171511h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public MMHandler f171512i = new MMHandler("FinderLiveInfoHandler");

    /* renamed from: j */
    public String f171513j;

    /* renamed from: n */
    public C33007b f171514n;

    /* renamed from: o */
    public final C13601g f171515o = C36568h.m40985a(new C33011i0(this));

    /* renamed from: p */
    public final C13601g f171516p = C36568h.m40985a(new C33014k0(this));

    /* renamed from: q */
    public final C13601g f171517q = C36568h.m40985a(new C33012j0(this));

    /* renamed from: r */
    public final C13601g f171518r = C36568h.m40985a(new C33009h0(this));

    /* renamed from: s */
    public final C13601g f171519s = C36568h.m40985a(new C33016l0(this));

    /* renamed from: t */
    public final C13601g f171520t = C36568h.m40985a(new C33008g0(this));

    /* renamed from: u */
    public final C13601g f171521u = C36568h.m40985a(new C33025x(this));

    /* renamed from: v */
    public final C13601g f171522v = C36568h.m40985a(new C33027z(this));

    /* renamed from: w */
    public final C13601g f171523w = C36568h.m40985a(new C33024w(this));

    /* renamed from: x */
    public final C13601g f171524x = C36568h.m40985a(new C33026y(this));

    /* renamed from: y */
    public final LinkedHashMap<Long, Integer> f171525y = new LinkedHashMap<>();

    /* renamed from: z */
    public final Map<Integer, Set<C0000n0>> f171526z = new LinkedHashMap();

    /* renamed from: hr.t$a */
    public static final class C8714a {

        /* renamed from: a */
        public final int f27946a;

        /* renamed from: b */
        public final int f27947b;

        public C8714a(int i, int i2) {
            this.f27946a = i;
            this.f27947b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8714a)) {
                return false;
            }
            C8714a aVar = (C8714a) obj;
            return this.f27946a == aVar.f27946a && this.f27947b == aVar.f27947b;
        }

        public int hashCode() {
            return (this.f27946a * 31) + this.f27947b;
        }

        public String toString() {
            return "RequestAndRefreshActivityIconResult(interval=" + this.f27946a + ", actType=" + this.f27947b + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveFeatureService$goToAnchorLiveDirect$1", mo125469f = "FinderLiveFeatureService.kt", mo125470l = {2278}, mo125471m = "invokeSuspend")
    /* renamed from: hr.t$d0 */
    public static final class C8715d0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f27948d;

        /* renamed from: e */
        public final /* synthetic */ C10906h f27949e;

        /* renamed from: f */
        public final /* synthetic */ Activity f27950f;

        /* renamed from: g */
        public final /* synthetic */ boolean f27951g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f27952h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8715d0(C10906h hVar, Activity activity, boolean z, C32224a<C13598b0> aVar, C15601d<? super C8715d0> dVar) {
            super(2, dVar);
            this.f27949e = hVar;
            this.f27950f = activity;
            this.f27951g = z;
            this.f27952h = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8715d0(this.f27949e, this.f27950f, this.f27951g, this.f27952h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8715d0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f27948d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C10906h hVar = this.f27949e;
                this.f27948d = 1;
                obj = hVar.mo11118g((C10906h.C10907a) null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10906h.C10912c cVar = (C10906h.C10912c) obj;
            if (cVar instanceof C10906h.C10912c.C10913a) {
                Log.m105924i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect failed, errCode:" + ((C10906h.C10912c.C10913a) cVar).f32546a);
            } else if (cVar instanceof C10906h.C10912c.C10915c) {
                Log.m105924i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect continueLive");
                this.f27949e.mo11113b(((C10906h.C10912c.C10915c) cVar).f32548a);
            } else if (cVar instanceof C10906h.C10912c.C10914b) {
                Log.m105924i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect success");
                Intent intent = new Intent();
                intent.putExtra("FunctionGuideAction", ((MMFragmentActivity) this.f27950f).getIntent().getIntExtra("FunctionGuideAction", 0));
                this.f27949e.mo11114c(intent, ((C10906h.C10912c.C10914b) cVar).f32547a, this.f27951g);
            }
            this.f27952h.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$g */
    public static final class C8716g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f27953d;

        /* renamed from: e */
        public final /* synthetic */ int f27954e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8716g(C60106t tVar, int i) {
            super(0);
            this.f27953d = tVar;
            this.f27954e = i;
        }

        public Object invoke() {
            Set<C0000n0> set = (Set) ((LinkedHashMap) this.f27953d.f171526z).get(Integer.valueOf(this.f27954e));
            StringBuilder sb = new StringBuilder();
            sb.append("#cancelCirculationFillingActivityIconOfSourceType source=");
            sb.append(this.f27954e);
            sb.append(" set.size=");
            sb.append(set != null ? Integer.valueOf(set.size()) : null);
            Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
            if (set != null) {
                for (C0000n0 n0Var : set) {
                    if (!C53930o0.m60560g(n0Var)) {
                        n0Var = null;
                    }
                    if (n0Var != null) {
                        C53930o0.m60556c(n0Var, (CancellationException) null);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$j */
    public static final class C8717j implements C91753f.C66827b {

        /* renamed from: a */
        public static final C8717j f27955a = new C8717j();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C8528e.f27579d;
            return C8528e.f27579d;
        }
    }

    /* renamed from: hr.t$m0 */
    public static final class C8718m0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f27956a;

        /* renamed from: b */
        public final /* synthetic */ String f27957b;

        /* renamed from: c */
        public final /* synthetic */ C32229r<Integer, Integer, String, C50397mg0, C13598b0> f27958c;

        public C8718m0(String str, String str2, C32229r<? super Integer, ? super Integer, ? super String, ? super C50397mg0, C13598b0> rVar) {
            this.f27956a = str;
            this.f27957b = str2;
            this.f27958c = rVar;
        }

        public Object call(Object obj) {
            C50397mg0 mg02;
            LinkedList<C51533ue1> linkedList;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("loadMicInfos errType:");
            C50397mg0 mg03 = null;
            sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb.append(" errCode:");
            sb.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
            sb.append(" encryptedId:");
            sb.append(this.f27956a);
            sb.append(" nonceId:");
            sb.append(this.f27957b);
            sb.append(" result:");
            sb.append((cVar == null || (mg02 = (C50397mg0) cVar.f256796d) == null || (linkedList = mg02.f138011d) == null) ? null : Integer.valueOf(linkedList.size()));
            Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
            C32229r<Integer, Integer, String, C50397mg0, C13598b0> rVar = this.f27958c;
            int i = 0;
            Integer valueOf = Integer.valueOf(cVar != null ? cVar.f256793a : 0);
            if (cVar != null) {
                i = cVar.f256794b;
            }
            Integer valueOf2 = Integer.valueOf(i);
            String str = cVar != null ? cVar.f256795c : null;
            if (str == null) {
                str = "";
            }
            if (cVar != null) {
                mg03 = (C50397mg0) cVar.f256796d;
            }
            rVar.mo162I(valueOf, valueOf2, str, mg03);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$n0 */
    public static final class C8719n0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C8719n0 f27959d = new C8719n0();

        public C8719n0() {
            super(0);
        }

        public Object invoke() {
            try {
                String str = C86709a0.m107535s().f251807e + "oly/";
                if (C86013q1.m106450k(str)) {
                    C86013q1.m106445f(str);
                    Log.m105924i("Finder.OlympicsLiveRoomUtil", "clearOlympicFiles succ");
                }
            } catch (Throwable unused) {
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$q */
    public static final class C8720q implements C91753f.C66827b {

        /* renamed from: a */
        public static final C8720q f27960a = new C8720q();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C8527b.f27578d;
            return C8527b.f27578d;
        }
    }

    /* renamed from: hr.t$r0 */
    public static final class C8721r0<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C60216z4.C8821a<Integer> f27961a;

        public C8721r0(C60216z4.C8821a<Integer> aVar) {
            this.f27961a = aVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            this.f27961a.mo6382a((Integer) obj);
            C60216z4.C8821a<Integer> aVar = C10064z3.f30828a;
            C9622a4 a4Var = C10064z3.f30830c;
            if (a4Var != null) {
                a4Var.onFinish();
            }
            C10064z3.f30830c = null;
        }
    }

    /* renamed from: hr.t$s0 */
    public static final class C8722s0<T> implements C60216z4.C8821a {

        /* renamed from: a */
        public final /* synthetic */ C60216z4.C8821a<Integer> f27962a;

        public C8722s0(C60216z4.C8821a<Integer> aVar) {
            this.f27962a = aVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            this.f27962a.mo6382a((Integer) obj);
            C60216z4.C8821a<Integer> aVar = C10064z3.f30828a;
            C9622a4 a4Var = C10064z3.f30830c;
            if (a4Var != null) {
                a4Var.onFinish();
            }
            C10064z3.f30830c = null;
        }
    }

    /* renamed from: hr.t$t0 */
    public static final class C8723t0 implements C46505a1.C46506a {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f27963a;

        /* renamed from: b */
        public final /* synthetic */ Context f27964b;

        /* renamed from: c */
        public final /* synthetic */ boolean f27965c;

        /* renamed from: hr.t$t0$a */
        public static final class C8724a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f27966d;

            /* renamed from: e */
            public final /* synthetic */ int f27967e;

            /* renamed from: f */
            public final /* synthetic */ C32227p<Boolean, String, C13598b0> f27968f;

            /* renamed from: g */
            public final /* synthetic */ C51203s61 f27969g;

            /* renamed from: h */
            public final /* synthetic */ Context f27970h;

            /* renamed from: i */
            public final /* synthetic */ boolean f27971i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8724a(int i, int i2, C32227p<? super Boolean, ? super String, C13598b0> pVar, C51203s61 s612, Context context, boolean z) {
                super(0);
                this.f27966d = i;
                this.f27967e = i2;
                this.f27968f = pVar;
                this.f27969g = s612;
                this.f27970h = context;
                this.f27971i = z;
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r7 = this;
                    int r0 = r7.f27966d
                    java.lang.String r1 = ""
                    if (r0 != 0) goto L_0x0014
                    int r0 = r7.f27967e
                    if (r0 != 0) goto L_0x0014
                    fy3.p<java.lang.Boolean, java.lang.String, rx3.b0> r0 = r7.f27968f
                    if (r0 == 0) goto L_0x0077
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                    r0.invoke(r2, r1)
                    goto L_0x0077
                L_0x0014:
                    te3.s61 r0 = r7.f27969g
                    te3.ja r0 = r0.getBaseResponse()
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0033
                    te3.rv3 r0 = r0.f135956e
                    if (r0 == 0) goto L_0x0033
                    java.lang.String r0 = r0.f141175d
                    if (r0 == 0) goto L_0x0033
                    int r0 = r0.length()
                    if (r0 <= 0) goto L_0x002e
                    r0 = 1
                    goto L_0x002f
                L_0x002e:
                    r0 = 0
                L_0x002f:
                    if (r0 != r3) goto L_0x0033
                    r0 = 1
                    goto L_0x0034
                L_0x0033:
                    r0 = 0
                L_0x0034:
                    if (r0 == 0) goto L_0x0045
                    te3.s61 r0 = r7.f27969g
                    te3.ja r0 = r0.getBaseResponse()
                    te3.rv3 r0 = r0.f135956e
                    if (r0 == 0) goto L_0x0043
                    java.lang.String r0 = r0.f141175d
                    goto L_0x0061
                L_0x0043:
                    r0 = 0
                    goto L_0x0061
                L_0x0045:
                    android.content.Context r0 = r7.f27970h
                    r4 = 2131828797(0x7f11203d, float:1.9290545E38)
                    r5 = 2
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    int r6 = r7.f27966d
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r5[r2] = r6
                    int r2 = r7.f27967e
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r5[r3] = r2
                    java.lang.String r0 = r0.getString(r4, r5)
                L_0x0061:
                    boolean r2 = r7.f27971i
                    if (r2 == 0) goto L_0x006a
                    android.content.Context r2 = r7.f27970h
                    nj3.C76912y0.m92767f(r2, r0)
                L_0x006a:
                    fy3.p<java.lang.Boolean, java.lang.String, rx3.b0> r2 = r7.f27968f
                    if (r2 == 0) goto L_0x0077
                    java.lang.Boolean r3 = java.lang.Boolean.FALSE
                    if (r0 != 0) goto L_0x0073
                    goto L_0x0074
                L_0x0073:
                    r1 = r0
                L_0x0074:
                    r2.invoke(r3, r1)
                L_0x0077:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C8723t0.C8724a.invoke():java.lang.Object");
            }
        }

        public C8723t0(C32227p<? super Boolean, ? super String, C13598b0> pVar, Context context, boolean z) {
            this.f27963a = pVar;
            this.f27964b = context;
            this.f27965c = z;
        }

        /* renamed from: a */
        public void mo607a(int i, int i2, String str, C51203s61 s612) {
            C87412m.m108594g(s612, "resp");
            C61926c.m72668M(new C8724a(i, i2, this.f27963a, s612, this.f27964b, this.f27965c));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveFeatureService$executeCirculationFillingActivityIcon$2", mo125469f = "FinderLiveFeatureService.kt", mo125470l = {867}, mo125471m = "invokeSuspend")
    /* renamed from: hr.t$u */
    public static final class C8725u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f27972d;

        /* renamed from: e */
        public int f27973e;

        /* renamed from: f */
        public /* synthetic */ Object f27974f;

        /* renamed from: g */
        public final /* synthetic */ C60106t f27975g;

        /* renamed from: h */
        public final /* synthetic */ int f27976h;

        /* renamed from: i */
        public final /* synthetic */ Context f27977i;

        /* renamed from: j */
        public final /* synthetic */ long f27978j;

        /* renamed from: n */
        public final /* synthetic */ String f27979n;

        /* renamed from: o */
        public final /* synthetic */ ImageView f27980o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8725u(C60106t tVar, int i, Context context, long j, String str, ImageView imageView, C15601d<? super C8725u> dVar) {
            super(2, dVar);
            this.f27975g = tVar;
            this.f27976h = i;
            this.f27977i = context;
            this.f27978j = j;
            this.f27979n = str;
            this.f27980o = imageView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C8725u uVar = new C8725u(this.f27975g, this.f27976h, this.f27977i, this.f27978j, this.f27979n, this.f27980o, dVar);
            uVar.f27974f = obj;
            return uVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8725u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r1.f27973e
                java.lang.String r3 = " remove done. setCount="
                r4 = 1
                java.lang.String r5 = "#executeCirculationFillingActivityIcon source="
                java.lang.String r6 = "MicroMsg.FinderLiveFeatureService"
                if (r2 == 0) goto L_0x002b
                if (r2 != r4) goto L_0x0023
                java.lang.Object r0 = r1.f27972d
                r2 = r0
                java.util.Set r2 = (java.util.Set) r2
                java.lang.Object r0 = r1.f27974f
                r4 = r0
                a14.n0 r4 = (a14.C0000n0) r4
                kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x0020 }
                goto L_0x00aa
            L_0x0020:
                r0 = move-exception
                goto L_0x00d1
            L_0x0023:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x002b:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r2 = r1.f27974f
                a14.n0 r2 = (a14.C0000n0) r2
                hr.t r7 = r1.f27975g
                java.util.Map<java.lang.Integer, java.util.Set<a14.n0>> r7 = r7.f171526z
                int r8 = r1.f27976h
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r8)
                java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
                java.lang.Object r7 = r7.get(r9)
                java.util.Set r7 = (java.util.Set) r7
                if (r7 != 0) goto L_0x005a
                java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
                r7.<init>()
                hr.t r8 = r1.f27975g
                java.util.Map<java.lang.Integer, java.util.Set<a14.n0>> r8 = r8.f171526z
                int r9 = r1.f27976h
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r9)
                r8.put(r10, r7)
            L_0x005a:
                r7.add(r2)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r5)
                int r9 = r1.f27976h
                r8.append(r9)
                java.lang.String r9 = " add done. setCount="
                r8.append(r9)
                int r9 = r7.size()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                hr.t r12 = r1.f27975g     // Catch:{ all -> 0x00ce }
                android.content.Context r13 = r1.f27977i     // Catch:{ all -> 0x00ce }
                long r10 = r1.f27978j     // Catch:{ all -> 0x00ce }
                java.lang.String r14 = r1.f27979n     // Catch:{ all -> 0x00ce }
                android.widget.ImageView r15 = r1.f27980o     // Catch:{ all -> 0x00ce }
                r1.f27974f = r2     // Catch:{ all -> 0x00ce }
                r1.f27972d = r7     // Catch:{ all -> 0x00ce }
                r1.f27973e = r4     // Catch:{ all -> 0x00ce }
                r12.getClass()     // Catch:{ all -> 0x00ce }
                a14.h0 r4 = a14.C53872d1.f151117a     // Catch:{ all -> 0x00ce }
                a14.k2 r4 = f14.C58901s.f168555a     // Catch:{ all -> 0x00ce }
                hr.x r8 = new hr.x     // Catch:{ all -> 0x00ce }
                r16 = 0
                r9 = r8
                r9.<init>(r10, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ce }
                java.lang.Object r4 = a14.C53895h.m60469g(r4, r8, r1)     // Catch:{ all -> 0x00ce }
                if (r4 != r0) goto L_0x00a3
                goto L_0x00a5
            L_0x00a3:
                rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ce }
            L_0x00a5:
                if (r4 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                r4 = r2
                r2 = r7
            L_0x00aa:
                r2.remove(r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                int r4 = r1.f27976h
                r0.append(r4)
                r0.append(r3)
                int r2 = r2.size()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x00ce:
                r0 = move-exception
                r4 = r2
                r2 = r7
            L_0x00d1:
                r2.remove(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r5)
                int r5 = r1.f27976h
                r4.append(r5)
                r4.append(r3)
                int r2 = r2.size()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C8725u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hr.t$v */
    public static final class C8726v<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ImageView f27981a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f27982b;

        public C8726v(ImageView imageView, C32226l<? super Bitmap, C13598b0> lVar) {
            this.f27981a = imageView;
            this.f27982b = lVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C13598b0 b0Var;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C8728z(this.f27981a, bitmap, this.f27982b));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C61926c.m72668M(new C8710a0(this.f27982b, this.f27981a));
            }
        }
    }

    /* renamed from: hr.t$a0 */
    public static final class C33006a0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32228q<String, String, Integer, C13598b0> f89666a;

        public C33006a0(C32228q<? super String, ? super String, ? super Integer, C13598b0> qVar) {
            this.f89666a = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
            r1 = r1.liveInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r5) {
            /*
                r4 = this;
                ob0.b$c r5 = (ob0.C89132b.C89134c) r5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "getFinderLivePreviewUrl errCode:"
                r0.append(r1)
                int r1 = r5.f256794b
                r0.append(r1)
                java.lang.String r1 = " errType:"
                r0.append(r1)
                int r1 = r5.f256793a
                r0.append(r1)
                java.lang.String r1 = " url:"
                r0.append(r1)
                T r1 = r5.f256796d
                te3.jm0 r1 = (te3.C50008jm0) r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f136184e
                r2 = 0
                if (r1 == 0) goto L_0x0030
                te3.c21 r1 = r1.liveInfo
                if (r1 == 0) goto L_0x0030
                java.lang.String r1 = r1.f182395g
                goto L_0x0031
            L_0x0030:
                r1 = r2
            L_0x0031:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.FinderLiveFeatureService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                int r0 = r5.f256793a
                if (r0 != 0) goto L_0x005f
                int r0 = r5.f256794b
                if (r0 != 0) goto L_0x005f
                fy3.q<java.lang.String, java.lang.String, java.lang.Integer, rx3.b0> r1 = r4.f89666a
                T r3 = r5.f256796d
                te3.jm0 r3 = (te3.C50008jm0) r3
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f136184e
                if (r3 == 0) goto L_0x0055
                te3.c21 r3 = r3.liveInfo
                if (r3 == 0) goto L_0x0055
                java.lang.String r2 = r3.f182395g
            L_0x0055:
                java.lang.String r5 = r5.f256795c
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.invoke(r2, r5, r0)
                goto L_0x006d
            L_0x005f:
                fy3.q<java.lang.String, java.lang.String, java.lang.Integer, rx3.b0> r0 = r4.f89666a
                java.lang.String r5 = r5.f256795c
                r1 = -1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = ""
                r0.invoke(r2, r5, r1)
            L_0x006d:
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C33006a0.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hr.t$b */
    public static final class C33007b extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183876g(new C28598z5(intent), "Finder.LiveExceptionMonitor");
        }
    }

    /* renamed from: hr.t$g0 */
    public static final class C33008g0 extends C87413o implements C32224a<C33339a> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33008g0(C60106t tVar) {
            super(0);
            this.f89667d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33339a(C60106t.wx0(this.f89667d));
        }
    }

    /* renamed from: hr.t$h0 */
    public static final class C33009h0 extends C87413o implements C32224a<C33340c> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33009h0(C60106t tVar) {
            super(0);
            this.f89668d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33340c(C60106t.wx0(this.f89668d));
        }
    }

    /* renamed from: hr.t$i */
    public static final class C33010i implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33010i f89669a = new C33010i();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32890c.f89424d;
            return C32890c.f89424d;
        }
    }

    /* renamed from: hr.t$i0 */
    public static final class C33011i0 extends C87413o implements C32224a<C8925e> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33011i0(C60106t tVar) {
            super(0);
            this.f89670d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C8925e(C60106t.wx0(this.f89670d));
        }
    }

    /* renamed from: hr.t$j0 */
    public static final class C33012j0 extends C87413o implements C32224a<C33342f> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33012j0(C60106t tVar) {
            super(0);
            this.f89671d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33342f(C60106t.wx0(this.f89671d));
        }
    }

    /* renamed from: hr.t$k */
    public static final class C33013k implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33013k f89672a = new C33013k();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32893g.f89427d;
            return C32893g.f89427d;
        }
    }

    /* renamed from: hr.t$k0 */
    public static final class C33014k0 extends C87413o implements C32224a<C33343g> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89673d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33014k0(C60106t tVar) {
            super(0);
            this.f89673d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33343g(C60106t.wx0(this.f89673d));
        }
    }

    /* renamed from: hr.t$l */
    public static final class C33015l implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33015l f89674a = new C33015l();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32894h.f89428d;
            return C32894h.f89428d;
        }
    }

    /* renamed from: hr.t$l0 */
    public static final class C33016l0 extends C87413o implements C32224a<C33344j> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33016l0(C60106t tVar) {
            super(0);
            this.f89675d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33344j(C60106t.wx0(this.f89675d));
        }
    }

    /* renamed from: hr.t$m */
    public static final class C33017m implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33017m f89676a = new C33017m();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32889a.f89423d;
            return C32889a.f89423d;
        }
    }

    /* renamed from: hr.t$n */
    public static final class C33018n implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33018n f89677a = new C33018n();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32892f.f89426d;
            return C32892f.f89426d;
        }
    }

    /* renamed from: hr.t$o */
    public static final class C33019o implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33019o f89678a = new C33019o();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32891d.f89425d;
            return C32891d.f89425d;
        }
    }

    /* renamed from: hr.t$p */
    public static final class C33020p implements C91753f.C66827b {

        /* renamed from: a */
        public static final C33020p f89679a = new C33020p();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C32895i.f89429d;
            return C32895i.f89429d;
        }
    }

    /* renamed from: hr.t$p0 */
    public static final class C33021p0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f89680d;

        /* renamed from: e */
        public final /* synthetic */ C60106t f89681e;

        public C33021p0(long j, C60106t tVar) {
            this.f89680d = j;
            this.f89681e = tVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "removeCacheLiveInfo liveID:" + this.f89680d + ",thread:" + Thread.currentThread());
            this.f89681e.f171510g.remove(Long.valueOf(this.f89680d));
        }
    }

    /* renamed from: hr.t$q0 */
    public static final class C33022q0 implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ long f89682a;

        /* renamed from: b */
        public final /* synthetic */ C60106t f89683b;

        /* renamed from: c */
        public final /* synthetic */ C53916l<C50602nw0> f89684c;

        public C33022q0(long j, C60106t tVar, C53916l<? super C50602nw0> lVar) {
            this.f89682a = j;
            this.f89683b = tVar;
            this.f89684c = lVar;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            C13598b0 b0Var;
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "requestLiveInfo, liveId:" + C61926c.m72691p(this.f89682a) + ",liveStatus:" + i + ",resp:" + obj);
            C51713vn0 vn02 = obj instanceof C51713vn0 ? (C51713vn0) obj : null;
            if (vn02 != null) {
                C60106t tVar = this.f89683b;
                long j2 = this.f89682a;
                C53916l<C50602nw0> lVar = this.f89684c;
                long currentTimeMillis = System.currentTimeMillis();
                ConcurrentHashMap<Long, C13605o<Integer, Long, C51713vn0>> concurrentHashMap = tVar.f171510g;
                Long valueOf = Long.valueOf(j2);
                C64273c21 c212 = vn02.f143572d;
                concurrentHashMap.put(valueOf, new C13605o(Integer.valueOf(c212 != null ? c212.f182394f : 1), Long.valueOf(currentTimeMillis), vn02));
                C50602nw0 nw02 = new C50602nw0();
                nw02.f138804d = currentTimeMillis;
                nw02.f138805e = vn02;
                lVar.resumeWith(Result.m168114constructorimpl(nw02));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f89684c.resumeWith(Result.m168114constructorimpl((Object) null));
            }
        }
    }

    /* renamed from: hr.t$w */
    public static final class C33024w extends C87413o implements C32224a<C8923b> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33024w(C60106t tVar) {
            super(0);
            this.f89686d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C8923b(C60106t.wx0(this.f89686d));
        }
    }

    /* renamed from: hr.t$x */
    public static final class C33025x extends C87413o implements C32224a<C33341d> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33025x(C60106t tVar) {
            super(0);
            this.f89687d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33341d(C60106t.wx0(this.f89687d));
        }
    }

    /* renamed from: hr.t$y */
    public static final class C33026y extends C87413o implements C32224a<C60333i> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33026y(C60106t tVar) {
            super(0);
            this.f89688d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            this.f89688d.getClass();
            return new C60333i(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76895xS());
        }
    }

    /* renamed from: hr.t$z */
    public static final class C33027z extends C87413o implements C32224a<C33354n> {

        /* renamed from: d */
        public final /* synthetic */ C60106t f89689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33027z(C60106t tVar) {
            super(0);
            this.f89689d = tVar;
        }

        public Object invoke() {
            C86709a0.m107523b().mo121108c();
            return new C33354n(C60106t.wx0(this.f89689d));
        }
    }

    /* renamed from: hr.t$b0 */
    public static final class C60107b0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60106t f171527d;

        /* renamed from: e */
        public final /* synthetic */ long f171528e;

        /* renamed from: f */
        public final /* synthetic */ boolean f171529f;

        /* renamed from: g */
        public final /* synthetic */ int f171530g;

        /* renamed from: h */
        public final /* synthetic */ String f171531h;

        /* renamed from: i */
        public final /* synthetic */ C50429mo2 f171532i;

        /* renamed from: j */
        public final /* synthetic */ C9487b<C9486a> f171533j;

        /* renamed from: n */
        public final /* synthetic */ C60606n.C60609c f171534n;

        /* renamed from: hr.t$b0$a */
        public static final class C60108a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60606n.C60609c f171535d;

            /* renamed from: e */
            public final /* synthetic */ long f171536e;

            /* renamed from: f */
            public final /* synthetic */ C13605o<Integer, Long, C51713vn0> f171537f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60108a(C60606n.C60609c cVar, long j, C13605o<Integer, Long, ? extends C51713vn0> oVar) {
                super(0);
                this.f171535d = cVar;
                this.f171536e = j;
                this.f171537f = oVar;
            }

            public Object invoke() {
                C60606n.C60609c cVar = this.f171535d;
                if (cVar != null) {
                    cVar.onLiveStatusCallback(this.f171536e, ((Number) this.f171537f.f38557d).intValue(), this.f171537f.f38559f);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: hr.t$b0$b */
        public static final class C60109b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60606n.C60609c f171538d;

            /* renamed from: e */
            public final /* synthetic */ long f171539e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60109b(C60606n.C60609c cVar, long j) {
                super(0);
                this.f171538d = cVar;
                this.f171539e = j;
            }

            public Object invoke() {
                C60606n.C60609c cVar = this.f171538d;
                if (cVar != null) {
                    cVar.onLiveStatusCallback(this.f171539e, 1, new C51713vn0());
                }
                return C13598b0.f38549a;
            }
        }

        public C60107b0(C60106t tVar, long j, boolean z, int i, String str, C50429mo2 mo22, C9487b<C9486a> bVar, C60606n.C60609c cVar) {
            this.f171527d = tVar;
            this.f171528e = j;
            this.f171529f = z;
            this.f171530g = i;
            this.f171531h = str;
            this.f171532i = mo22;
            this.f171533j = bVar;
            this.f171534n = cVar;
        }

        public final void run() {
            C13605o oVar = this.f171527d.f171510g.get(Long.valueOf(this.f171528e));
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "getLiveInfo cache: liveID:" + this.f171528e + ",forceRefresh:" + this.f171529f + ",status:" + this.f171527d.Dx0(oVar));
            if (this.f171529f) {
                this.f171527d.f171510g.remove(Long.valueOf(this.f171528e));
            }
            if (!this.f171529f && oVar != null) {
                C60106t tVar = this.f171527d;
                tVar.getClass();
                int i = C60184m.f171717b;
                if (i <= 0) {
                    i = C32444a.f86123a1;
                }
                if (tVar.Ex0(oVar, (long) (i * 1000))) {
                    C61926c.m72668M(new C60108a(this.f171534n, this.f171528e, oVar));
                    return;
                }
            }
            if (C86709a0.m107524d().f256809d != null) {
                C60106t tVar2 = this.f171527d;
                long j = this.f171528e;
                int i2 = this.f171530g;
                String str = this.f171531h;
                C50429mo2 mo22 = this.f171532i;
                C9487b<C9486a> bVar = this.f171533j;
                C60606n.C60609c cVar = this.f171534n;
                tVar2.getClass();
                C89059e i3 = new C45374m(j, i2, str, mo22, (C45374m.C7344a) null).mo9225i();
                i3.mo123420E(new C60132w(tVar2, j, cVar));
                if (bVar != null) {
                    i3.mo11397F(bVar);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "getLiveInfo dispatcher is null!");
            C61926c.m72668M(new C60109b(this.f171534n, this.f171528e));
        }
    }

    /* renamed from: hr.t$c */
    public static final class C60110c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C60106t f171540a;

        /* renamed from: b */
        public final /* synthetic */ Context f171541b;

        /* renamed from: c */
        public final /* synthetic */ String f171542c;

        /* renamed from: d */
        public final /* synthetic */ int f171543d;

        /* renamed from: e */
        public final /* synthetic */ C60216z4.C8821a<Object> f171544e;

        /* renamed from: f */
        public final /* synthetic */ C60216z4.C8821a<Integer> f171545f;

        public C60110c(C60106t tVar, Context context, String str, int i, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2) {
            this.f171540a = tVar;
            this.f171541b = context;
            this.f171542c = str;
            this.f171543d = i;
            this.f171544e = aVar;
            this.f171545f = aVar2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C60106t tVar = this.f171540a;
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            Context context = this.f171541b;
            String str = this.f171542c;
            C87412m.m108593f(str, TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
            C60106t.vx0(tVar, finderObject, context, str, this.f171543d, cVar.f256793a, cVar.f256794b, cVar.f256795c, this.f171544e, this.f171545f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$c0 */
    public static final class C60111c0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60606n.C60609c f171546d;

        /* renamed from: e */
        public final /* synthetic */ long f171547e;

        /* renamed from: f */
        public final /* synthetic */ C13605o<Integer, Long, C51713vn0> f171548f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60111c0(C60606n.C60609c cVar, long j, C13605o<Integer, Long, ? extends C51713vn0> oVar) {
            super(0);
            this.f171546d = cVar;
            this.f171547e = j;
            this.f171548f = oVar;
        }

        public Object invoke() {
            C60606n.C60609c cVar = this.f171546d;
            if (cVar != null) {
                cVar.onLiveStatusCallback(this.f171547e, ((Number) this.f171548f.f38557d).intValue(), this.f171548f.f38559f);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$d */
    public static final class C60112d implements C46108j1 {

        /* renamed from: a */
        public final /* synthetic */ C60106t f171549a;

        /* renamed from: b */
        public final /* synthetic */ Context f171550b;

        /* renamed from: c */
        public final /* synthetic */ String f171551c;

        /* renamed from: d */
        public final /* synthetic */ int f171552d;

        /* renamed from: e */
        public final /* synthetic */ C60216z4.C8821a<Object> f171553e;

        /* renamed from: f */
        public final /* synthetic */ C60216z4.C8821a<Integer> f171554f;

        public C60112d(C60106t tVar, Context context, String str, int i, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2) {
            this.f171549a = tVar;
            this.f171550b = context;
            this.f171551c = str;
            this.f171552d = i;
            this.f171553e = aVar;
            this.f171554f = aVar2;
        }

        /* renamed from: a */
        public void mo71551a(int i, int i2, String str, C50851pn0 pn02) {
            C87412m.m108594g(pn02, "resp");
            C60106t tVar = this.f171549a;
            FinderObject finderObject = pn02.f139838d;
            Context context = this.f171550b;
            String str2 = this.f171551c;
            C87412m.m108593f(str2, TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
            C60106t.vx0(tVar, finderObject, context, str2, this.f171552d, i, i2, str, this.f171553e, this.f171554f);
        }
    }

    /* renamed from: hr.t$e */
    public static final class C60113e implements C46108j1 {

        /* renamed from: a */
        public final /* synthetic */ String f171555a;

        /* renamed from: b */
        public final /* synthetic */ String f171556b;

        /* renamed from: c */
        public final /* synthetic */ C60106t f171557c;

        /* renamed from: d */
        public final /* synthetic */ Context f171558d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f171559e;

        /* renamed from: f */
        public final /* synthetic */ String f171560f;

        /* renamed from: g */
        public final /* synthetic */ C60216z4.C8821a<Object> f171561g;

        /* renamed from: hr.t$e$a */
        public static final class C60114a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f171562d;

            /* renamed from: e */
            public final /* synthetic */ String f171563e;

            /* renamed from: f */
            public final /* synthetic */ C60106t f171564f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<FinderObject> f171565g;

            /* renamed from: h */
            public final /* synthetic */ Context f171566h;

            /* renamed from: i */
            public final /* synthetic */ JSONObject f171567i;

            /* renamed from: j */
            public final /* synthetic */ String f171568j;

            /* renamed from: n */
            public final /* synthetic */ C60216z4.C8821a<Object> f171569n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60114a(String str, String str2, C60106t tVar, C8479f0<FinderObject> f0Var, Context context, JSONObject jSONObject, String str3, C60216z4.C8821a<Object> aVar) {
                super(0);
                this.f171562d = str;
                this.f171563e = str2;
                this.f171564f = tVar;
                this.f171565g = f0Var;
                this.f171566h = context;
                this.f171567i = jSONObject;
                this.f171568j = str3;
                this.f171569n = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:125:0x0387, code lost:
                if (r0 == null) goto L_0x03a6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
                if (r0 == null) goto L_0x00d8;
             */
            /* JADX WARNING: Removed duplicated region for block: B:100:0x02cf  */
            /* JADX WARNING: Removed duplicated region for block: B:101:0x02d2  */
            /* JADX WARNING: Removed duplicated region for block: B:104:0x02e4  */
            /* JADX WARNING: Removed duplicated region for block: B:105:0x02e7  */
            /* JADX WARNING: Removed duplicated region for block: B:108:0x02ee  */
            /* JADX WARNING: Removed duplicated region for block: B:109:0x02f1  */
            /* JADX WARNING: Removed duplicated region for block: B:133:0x03af  */
            /* JADX WARNING: Removed duplicated region for block: B:134:0x03b1  */
            /* JADX WARNING: Removed duplicated region for block: B:136:0x03b5  */
            /* JADX WARNING: Removed duplicated region for block: B:217:0x05bc  */
            /* JADX WARNING: Removed duplicated region for block: B:218:0x05be  */
            /* JADX WARNING: Removed duplicated region for block: B:225:0x05d2  */
            /* JADX WARNING: Removed duplicated region for block: B:226:0x05d4  */
            /* JADX WARNING: Removed duplicated region for block: B:229:0x05ee  */
            /* JADX WARNING: Removed duplicated region for block: B:234:0x060a  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00e7  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0114  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x0279  */
            /* JADX WARNING: Removed duplicated region for block: B:81:0x0284  */
            /* JADX WARNING: Removed duplicated region for block: B:90:0x029f  */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x02a2  */
            /* JADX WARNING: Removed duplicated region for block: B:96:0x02ba  */
            /* JADX WARNING: Removed duplicated region for block: B:97:0x02c1  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r92 = this;
                    r1 = r92
                    ak1.f0$q r12 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
                    java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
                    java.lang.Class<kq.h> r3 = p185kq.C10383h.class
                    java.lang.Class<tf0.o1> r18 = tf0.C13883o1.class
                    java.lang.Class<ak1.o> r19 = ak1.C54108o.class
                    java.lang.String r0 = r1.f171562d
                    if (r0 == 0) goto L_0x0019
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x0017
                    goto L_0x0019
                L_0x0017:
                    r0 = 0
                    goto L_0x001a
                L_0x0019:
                    r0 = 1
                L_0x001a:
                    java.lang.String r4 = "key_chnl_extra"
                    java.lang.String r5 = "-"
                    java.lang.String r6 = "randomUUID().toString()"
                    java.lang.String r7 = "key_extra_info"
                    java.lang.String r8 = "by_pass_info"
                    java.lang.String r9 = "by_pass_type"
                    java.lang.String r10 = "byPass"
                    java.lang.String r11 = "chnlExtra"
                    java.lang.String r13 = "reportExtraInfo"
                    java.lang.String r15 = "commentScene"
                    java.lang.String r14 = "finderUserName"
                    r20 = r12
                    java.lang.String r12 = "MicroMsg.FinderLiveFeatureService"
                    r21 = r4
                    java.lang.String r4 = ""
                    r22 = 0
                    r24 = 0
                    r25 = r3
                    java.lang.String r3 = "getService(IActivityRouter::class.java)"
                    r26 = r3
                    java.lang.String r3 = "extraInfo"
                    r27 = r3
                    java.lang.String r3 = "finder_username"
                    r29 = r5
                    java.lang.String r5 = "getService(HellLiveReport::class.java)"
                    r30 = r5
                    java.lang.String r5 = "key_enter_live_param_source_web_url"
                    r31 = r5
                    java.lang.String r5 = "key_enter_live_param_by_pass_info"
                    r32 = r5
                    java.lang.String r5 = "key_enter_live_param_by_pass_type"
                    r33 = r5
                    java.lang.String r5 = "autoOpenFinderLive chnlExtra:"
                    r34 = r5
                    r35 = 4
                    r36 = 15
                    r37 = -1
                    if (r0 != 0) goto L_0x0328
                    java.lang.String r0 = r1.f171563e
                    if (r0 == 0) goto L_0x0073
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x0071
                    goto L_0x0073
                L_0x0071:
                    r0 = 0
                    goto L_0x0074
                L_0x0073:
                    r0 = 1
                L_0x0074:
                    if (r0 != 0) goto L_0x0328
                    hr.t r0 = r1.f171564f
                    gy3.f0<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r1.f171565g
                    T r5 = r5.f27484d
                    com.tencent.mm.protocal.protobuf.FinderObject r5 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r5
                    r39 = r6
                    android.content.Context r6 = r1.f171566h
                    r40 = r6
                    org.json.JSONObject r6 = r1.f171567i
                    r41 = r2
                    java.lang.String r2 = r1.f171568j
                    if (r2 != 0) goto L_0x008d
                    r2 = r4
                L_0x008d:
                    r0.getClass()
                    java.lang.String r0 = r6.optString(r14)
                    if (r0 != 0) goto L_0x0098
                    r14 = r4
                    goto L_0x0099
                L_0x0098:
                    r14 = r0
                L_0x0099:
                    int r15 = r6.optInt(r15)
                    java.lang.String r13 = r6.optString(r13, r4)
                    java.lang.String r11 = r6.optString(r11, r4)
                    java.lang.String r0 = r6.optString(r10, r4)
                    if (r0 != 0) goto L_0x00ac
                    r0 = r4
                L_0x00ac:
                    c30.g r6 = new c30.g     // Catch:{ Exception -> 0x00be }
                    r6.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00be }
                    int r9 = r6.optInt(r9)     // Catch:{ Exception -> 0x00be }
                    java.lang.String r0 = r6.optString(r8)     // Catch:{ Exception -> 0x00bc }
                    if (r0 != 0) goto L_0x00d9
                    goto L_0x00d8
                L_0x00bc:
                    r0 = move-exception
                    goto L_0x00c0
                L_0x00be:
                    r0 = move-exception
                    r9 = 0
                L_0x00c0:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r8 = "autoOpenFinderLiveWithFeedId ex:"
                    r6.append(r8)
                    java.lang.String r0 = r0.getMessage()
                    r6.append(r0)
                    java.lang.String r0 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                L_0x00d8:
                    r0 = r4
                L_0x00d9:
                    er1.j4 r10 = er1.C58739j4.f168176a
                    boolean r6 = r10.mo83685N(r13)
                    if (r6 == 0) goto L_0x00e3
                    r6 = 4
                    goto L_0x00e5
                L_0x00e3:
                    r6 = 15
                L_0x00e5:
                    if (r5 != 0) goto L_0x0114
                    java.lang.String r0 = "true, false"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                    android.content.Intent r0 = new android.content.Intent
                    r0.<init>()
                    r0.putExtra(r3, r14)
                    r0.putExtra(r7, r13)
                    if (r15 <= 0) goto L_0x0105
                    di3.d r2 = di3.C86312j.m106911c(r41)
                    ht1.t1 r2 = (ht1.C60200t1) r2
                    r3 = 32
                    r2.mo76842e7(r15, r6, r3, r0)
                L_0x0105:
                    di3.d r2 = di3.C86312j.m106911c(r18)
                    tf0.o1 r2 = (tf0.C13883o1) r2
                    r8 = r40
                    r2.mo13272V1(r8, r0)
                L_0x0110:
                    r30 = 0
                    goto L_0x0606
                L_0x0114:
                    r8 = r40
                    java.util.UUID r3 = java.util.UUID.randomUUID()
                    java.lang.String r3 = r3.toString()
                    r8 = r39
                    gy3.C87412m.m108593f(r3, r8)
                    r17 = r14
                    r8 = r29
                    r14 = 0
                    java.lang.String r3 = z04.C112551y.m153814n(r3, r8, r4, r14)
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r15)
                    r14 = 45
                    r8.append(r14)
                    r8.append(r6)
                    r8.append(r14)
                    r6 = 65
                    r8.append(r6)
                    r8.append(r14)
                    r8.append(r3)
                    java.lang.String r14 = r8.toString()
                    di3.d r3 = di3.C86312j.m106911c(r25)
                    kq.h r3 = (p185kq.C10383h) r3
                    r3.mo10697OK(r14)
                    android.content.Intent r8 = new android.content.Intent
                    r8.<init>()
                    r8.putExtra(r7, r13)
                    r6 = r21
                    r8.putExtra(r6, r11)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    r6 = r34
                    r3.append(r6)
                    r3.append(r11)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
                    r3 = r33
                    r8.putExtra(r3, r9)
                    r3 = r32
                    r8.putExtra(r3, r0)
                    r3 = r31
                    r8.putExtra(r3, r2)
                    di3.d r0 = di3.C86312j.m106911c(r19)
                    r2 = r30
                    gy3.C87412m.m108593f(r0, r2)
                    r2 = r0
                    ht1.j5 r2 = (ht1.C8777j5) r2
                    long r6 = r5.f164794id
                    te3.c21 r0 = r5.liveInfo
                    if (r0 == 0) goto L_0x019c
                    long r11 = r0.f182392d
                    goto L_0x019e
                L_0x019c:
                    r11 = r37
                L_0x019e:
                    java.lang.String r9 = r5.username
                    r29 = -1
                    if (r0 == 0) goto L_0x01ac
                    int r0 = r0.f182393e
                    r21 = r4
                    long r3 = (long) r0
                    r37 = r3
                    goto L_0x01ae
                L_0x01ac:
                    r21 = r4
                L_0x01ae:
                    java.lang.String r0 = java.lang.String.valueOf(r15)
                    r25 = 0
                    r31 = 0
                    r32 = 384(0x180, float:5.38E-43)
                    r33 = 0
                    r56 = r21
                    r57 = r26
                    r58 = r27
                    r3 = r6
                    r7 = r5
                    r21 = r40
                    r5 = r11
                    r12 = r7
                    r7 = r9
                    r11 = r8
                    r8 = r29
                    r59 = r10
                    r60 = r11
                    r10 = r37
                    r61 = r12
                    r12 = r20
                    r62 = r13
                    r13 = r0
                    r0 = r14
                    r63 = r17
                    r14 = r25
                    r64 = r15
                    r15 = r31
                    r16 = r32
                    r17 = r33
                    ht1.C8777j5.C8778a.m8603d(r2, r3, r5, r7, r8, r10, r12, r13, r14, r15, r16, r17)
                    di3.d r2 = di3.C86312j.m106911c(r19)
                    ak1.o r2 = (ak1.C54108o) r2
                    r5 = r58
                    r3 = r62
                    gy3.C87412m.m108593f(r3, r5)
                    r2.cy0(r3)
                    zc1.b r2 = zc1.C66785b.f191882e
                    java.lang.String r2 = r2.mo90662O5()
                    r4 = r63
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r2)
                    if (r2 == 0) goto L_0x024b
                    di3.d r2 = di3.C86312j.m106911c(r18)
                    r4 = r57
                    gy3.C87412m.m108593f(r2, r4)
                    r39 = r2
                    tf0.o1 r39 = (tf0.C13883o1) r39
                    r5 = r61
                    long r2 = r5.f164794id
                    java.lang.String r4 = r5.objectNonceId
                    if (r4 != 0) goto L_0x021d
                    r43 = r56
                    goto L_0x021f
                L_0x021d:
                    r43 = r4
                L_0x021f:
                    te3.c21 r4 = r5.liveInfo
                    if (r4 != 0) goto L_0x0228
                    te3.c21 r4 = new te3.c21
                    r4.<init>()
                L_0x0228:
                    r44 = r4
                    r45 = 0
                    r46 = 0
                    r47 = 0
                    r48 = 0
                    r49 = 0
                    java.lang.String r4 = r5.sessionBuffer
                    r51 = r4
                    r52 = 0
                    r53 = 0
                    r54 = 6640(0x19f0, float:9.305E-42)
                    r55 = 0
                    r40 = r21
                    r41 = r2
                    r50 = r0
                    tf0.C13883o1.C13884a.m13249a(r39, r40, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
                    goto L_0x0110
                L_0x024b:
                    r4 = r57
                    r5 = r61
                    cj1.b1 r2 = new cj1.b1
                    r2.<init>()
                    r3 = 0
                    r2.f153420i = r3
                    r6 = r64
                    r2.f153422k = r6
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    te3.c21 r7 = r5.liveInfo
                    if (r7 == 0) goto L_0x026b
                    int r8 = r7.f182394f
                    r9 = 1
                    if (r8 != r9) goto L_0x026c
                    r15 = 1
                    goto L_0x026d
                L_0x026b:
                    r9 = 1
                L_0x026c:
                    r15 = 0
                L_0x026d:
                    if (r15 == 0) goto L_0x0275
                    if (r7 == 0) goto L_0x0275
                    java.lang.String r8 = r7.f182395g
                    if (r8 != 0) goto L_0x0277
                L_0x0275:
                    r8 = r56
                L_0x0277:
                    if (r15 == 0) goto L_0x0284
                    if (r7 == 0) goto L_0x0282
                    te3.b81 r10 = r7.f182401p
                    if (r10 == 0) goto L_0x0282
                    int r10 = r10.f182228d
                    goto L_0x0285
                L_0x0282:
                    r10 = 1
                    goto L_0x0285
                L_0x0284:
                    r10 = 0
                L_0x0285:
                    if (r15 == 0) goto L_0x0292
                    if (r7 == 0) goto L_0x0292
                    te3.bq2 r7 = r7.f182358D
                    if (r7 == 0) goto L_0x0292
                    byte[] r7 = r7.toByteArray()
                    goto L_0x0294
                L_0x0292:
                    r7 = r24
                L_0x0294:
                    com.tencent.mm.live.api.LiveConfig$b r11 = new com.tencent.mm.live.api.LiveConfig$b
                    r11.<init>()
                    r11.f157091a = r9
                    te3.c21 r12 = r5.liveInfo
                    if (r12 == 0) goto L_0x02a2
                    long r12 = r12.f182392d
                    goto L_0x02a4
                L_0x02a2:
                    r12 = r22
                L_0x02a4:
                    r11.f157093c = r12
                    java.lang.String r12 = r5.objectNonceId
                    r11.f157106p = r12
                    long r12 = r5.f164794id
                    r11.f157101k = r12
                    java.lang.String r12 = r5.username
                    r11.f157096f = r12
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r12 = r5.objectDesc
                    if (r12 == 0) goto L_0x02c1
                    java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r12 = r12.media
                    if (r12 == 0) goto L_0x02c1
                    java.lang.Object r12 = sx3.C110818d0.m150916N(r12)
                    com.tencent.mm.protocal.protobuf.FinderMedia r12 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r12
                    goto L_0x02c3
                L_0x02c1:
                    r12 = r24
                L_0x02c3:
                    r13 = r59
                    java.lang.String r12 = r13.mo83719o(r12)
                    r11.f157095e = r12
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r12 = r5.objectDesc
                    if (r12 == 0) goto L_0x02d2
                    java.lang.String r12 = r12.description
                    goto L_0x02d4
                L_0x02d2:
                    r12 = r24
                L_0x02d4:
                    r11.f157102l = r12
                    java.lang.String r12 = r5.sessionBuffer
                    r11.f157112v = r12
                    r11.f157099i = r8
                    r11.f157100j = r10
                    r11.f157084B = r7
                    te3.c21 r5 = r5.liveInfo
                    if (r5 == 0) goto L_0x02e7
                    int r14 = r5.f182384X
                    goto L_0x02e8
                L_0x02e7:
                    r14 = 0
                L_0x02e8:
                    r11.f157085C = r14
                    er1.p r7 = er1.C58763p.f168245a
                    if (r5 == 0) goto L_0x02f1
                    te3.by0 r5 = r5.f182402p0
                    goto L_0x02f3
                L_0x02f1:
                    r5 = r24
                L_0x02f3:
                    java.lang.String r8 = "autoOpenFinderLiveWithFeedId"
                    r7.mo83799a(r11, r8, r5)
                    com.tencent.mm.live.api.LiveConfig r5 = r11.mo76374a()
                    r6.add(r5)
                    r2.f153423l = r6
                    r2.f153425n = r9
                    r5 = r60
                    r2.mo75633b(r5)
                    di3.d r6 = di3.C86312j.m106911c(r18)
                    gy3.C87412m.m108593f(r6, r4)
                    r39 = r6
                    tf0.o1 r39 = (tf0.C13883o1) r39
                    r45 = 0
                    r46 = 32
                    r47 = 0
                    r40 = r21
                    r41 = r2
                    r42 = r0
                    r43 = r0
                    r44 = r5
                    tf0.C13883o1.C13884a.m13251c(r39, r40, r41, r42, r43, r44, r45, r46, r47)
                    goto L_0x0110
                L_0x0328:
                    r41 = r2
                    r16 = r3
                    r56 = r4
                    r0 = r8
                    r57 = r26
                    r58 = r27
                    r4 = r29
                    r2 = r33
                    r5 = r34
                    r8 = r6
                    r6 = r21
                    hr.t r3 = r1.f171564f
                    r33 = r2
                    gy3.f0<com.tencent.mm.protocal.protobuf.FinderObject> r2 = r1.f171565g
                    T r2 = r2.f27484d
                    com.tencent.mm.protocal.protobuf.FinderObject r2 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r2
                    r34 = r5
                    android.content.Context r5 = r1.f171566h
                    r17 = r5
                    org.json.JSONObject r5 = r1.f171567i
                    r21 = r6
                    java.lang.String r6 = r1.f171568j
                    if (r6 != 0) goto L_0x0356
                    r6 = r56
                L_0x0356:
                    r3.getClass()
                    java.lang.String r3 = r5.optString(r14)
                    if (r3 != 0) goto L_0x0362
                    r14 = r56
                    goto L_0x0363
                L_0x0362:
                    r14 = r3
                L_0x0363:
                    int r3 = r5.optInt(r15)
                    r15 = r56
                    java.lang.String r13 = r5.optString(r13, r15)
                    r26 = r14
                    java.lang.String r14 = r5.optString(r11, r15)
                    java.lang.String r5 = r5.optString(r10, r15)
                    if (r5 != 0) goto L_0x037a
                    r5 = r15
                L_0x037a:
                    c30.g r10 = new c30.g     // Catch:{ Exception -> 0x038c }
                    r10.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x038c }
                    int r5 = r10.optInt(r9)     // Catch:{ Exception -> 0x038c }
                    java.lang.String r0 = r10.optString(r0)     // Catch:{ Exception -> 0x038a }
                    if (r0 != 0) goto L_0x03a7
                    goto L_0x03a6
                L_0x038a:
                    r0 = move-exception
                    goto L_0x038e
                L_0x038c:
                    r0 = move-exception
                    r5 = 0
                L_0x038e:
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r10 = "autoOpenFinderLiveWithoutFeedId ex:"
                    r9.append(r10)
                    java.lang.String r0 = r0.getMessage()
                    r9.append(r0)
                    java.lang.String r0 = r9.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                L_0x03a6:
                    r0 = r15
                L_0x03a7:
                    er1.j4 r9 = er1.C58739j4.f168176a
                    boolean r9 = r9.mo83685N(r13)
                    if (r9 == 0) goto L_0x03b1
                    r9 = 4
                    goto L_0x03b3
                L_0x03b1:
                    r9 = 15
                L_0x03b3:
                    if (r2 == 0) goto L_0x05ac
                    te3.c21 r10 = r2.liveInfo
                    if (r10 == 0) goto L_0x03c0
                    int r10 = r10.f182394f
                    r1 = 2
                    if (r10 != r1) goto L_0x03c0
                    r1 = 1
                    goto L_0x03c1
                L_0x03c0:
                    r1 = 0
                L_0x03c1:
                    if (r1 == 0) goto L_0x03c5
                    goto L_0x05ac
                L_0x03c5:
                    java.util.UUID r1 = java.util.UUID.randomUUID()
                    java.lang.String r1 = r1.toString()
                    gy3.C87412m.m108593f(r1, r8)
                    r8 = 0
                    java.lang.String r1 = z04.C112551y.m153814n(r1, r4, r15, r8)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r3)
                    r10 = 45
                    r4.append(r10)
                    r4.append(r9)
                    r4.append(r10)
                    r9 = 65
                    r4.append(r9)
                    r4.append(r10)
                    r4.append(r1)
                    java.lang.String r1 = r4.toString()
                    di3.d r4 = di3.C86312j.m106911c(r25)
                    kq.h r4 = (p185kq.C10383h) r4
                    r4.mo10697OK(r1)
                    android.content.Intent r10 = new android.content.Intent
                    r10.<init>()
                    r10.putExtra(r7, r13)
                    r4 = r21
                    r10.putExtra(r4, r14)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r7 = r34
                    r4.append(r7)
                    r4.append(r14)
                    java.lang.String r4 = r4.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                    r4 = r33
                    r10.putExtra(r4, r5)
                    r4 = r32
                    r10.putExtra(r4, r0)
                    r4 = r31
                    r10.putExtra(r4, r6)
                    java.lang.String r0 = "key_enter_live_param_pull_more_type"
                    r12 = 1
                    r10.putExtra(r0, r12)
                    te3.c21 r0 = r2.liveInfo
                    if (r0 == 0) goto L_0x043d
                    int r0 = r0.f182384X
                    goto L_0x043e
                L_0x043d:
                    r0 = 0
                L_0x043e:
                    java.lang.String r4 = "KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE"
                    r10.putExtra(r4, r0)
                    te3.c21 r0 = r2.liveInfo
                    if (r0 == 0) goto L_0x0454
                    te3.by0 r0 = r0.f182402p0
                    if (r0 == 0) goto L_0x0454
                    byte[] r0 = r0.toByteArray()
                    java.lang.String r4 = "KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO"
                    r10.putExtra(r4, r0)
                L_0x0454:
                    di3.d r0 = di3.C86312j.m106911c(r19)
                    r4 = r30
                    gy3.C87412m.m108593f(r0, r4)
                    ht1.j5 r0 = (ht1.C8777j5) r0
                    long r4 = r2.f164794id
                    te3.c21 r6 = r2.liveInfo
                    if (r6 == 0) goto L_0x0468
                    long r8 = r6.f182392d
                    goto L_0x046a
                L_0x0468:
                    r8 = r37
                L_0x046a:
                    java.lang.String r7 = r2.username
                    r27 = -1
                    if (r6 == 0) goto L_0x0478
                    int r6 = r6.f182393e
                    r21 = r13
                    long r12 = (long) r6
                    r37 = r12
                    goto L_0x047a
                L_0x0478:
                    r21 = r13
                L_0x047a:
                    java.lang.String r13 = java.lang.String.valueOf(r3)
                    gy3.C87412m.m108593f(r14, r11)
                    r16 = 0
                    r25 = 256(0x100, float:3.59E-43)
                    r29 = 0
                    r12 = r2
                    r2 = r0
                    r11 = r57
                    r30 = 0
                    r3 = r4
                    r31 = r17
                    r87 = r58
                    r5 = r8
                    r8 = r27
                    r0 = r10
                    r88 = r11
                    r10 = r37
                    r89 = r12
                    r12 = r20
                    r90 = r21
                    r91 = r26
                    r20 = r15
                    r15 = r16
                    r16 = r25
                    r17 = r29
                    ht1.C8777j5.C8778a.m8603d(r2, r3, r5, r7, r8, r10, r12, r13, r14, r15, r16, r17)
                    di3.d r2 = di3.C86312j.m106911c(r19)
                    ak1.o r2 = (ak1.C54108o) r2
                    r3 = r87
                    r4 = r90
                    gy3.C87412m.m108593f(r4, r3)
                    r2.cy0(r4)
                    zc1.b r2 = zc1.C66785b.f191882e
                    java.lang.String r2 = r2.mo90662O5()
                    r5 = r91
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r2)
                    if (r2 == 0) goto L_0x0511
                    di3.d r0 = di3.C86312j.m106911c(r18)
                    r2 = r88
                    gy3.C87412m.m108593f(r0, r2)
                    r65 = r0
                    tf0.o1 r65 = (tf0.C13883o1) r65
                    r6 = r89
                    long r2 = r6.f164794id
                    java.lang.String r4 = r6.objectNonceId
                    if (r4 != 0) goto L_0x04e3
                    r69 = r20
                    goto L_0x04e5
                L_0x04e3:
                    r69 = r4
                L_0x04e5:
                    te3.c21 r0 = r6.liveInfo
                    if (r0 != 0) goto L_0x04ee
                    te3.c21 r0 = new te3.c21
                    r0.<init>()
                L_0x04ee:
                    r70 = r0
                    r71 = 0
                    r72 = 0
                    r73 = 0
                    r74 = 0
                    r75 = 0
                    java.lang.String r0 = r6.sessionBuffer
                    r77 = r0
                    r78 = 0
                    r79 = 0
                    r80 = 6640(0x19f0, float:9.305E-42)
                    r81 = 0
                    r66 = r31
                    r67 = r2
                    r76 = r1
                    tf0.C13883o1.C13884a.m13249a(r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81)
                    goto L_0x0604
                L_0x0511:
                    r2 = r88
                    r6 = r89
                    te3.c21 r3 = r6.liveInfo
                    if (r3 == 0) goto L_0x0520
                    int r3 = r3.f182394f
                    r8 = 1
                    if (r3 != r8) goto L_0x0520
                    r15 = 1
                    goto L_0x0521
                L_0x0520:
                    r15 = 0
                L_0x0521:
                    di3.d r3 = di3.C86312j.m106911c(r18)
                    gy3.C87412m.m108593f(r3, r2)
                    r65 = r3
                    tf0.o1 r65 = (tf0.C13883o1) r65
                    long r2 = r6.f164794id
                    te3.c21 r4 = r6.liveInfo
                    if (r4 == 0) goto L_0x0537
                    long r7 = r4.f182392d
                    r70 = r7
                    goto L_0x0539
                L_0x0537:
                    r70 = r22
                L_0x0539:
                    java.lang.String r5 = r6.username
                    if (r5 != 0) goto L_0x0540
                    r72 = r20
                    goto L_0x0542
                L_0x0540:
                    r72 = r5
                L_0x0542:
                    java.lang.String r5 = r6.objectNonceId
                    if (r5 != 0) goto L_0x0549
                    r73 = r20
                    goto L_0x054b
                L_0x0549:
                    r73 = r5
                L_0x054b:
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r6.objectDesc
                    if (r5 == 0) goto L_0x0557
                    java.lang.String r5 = r5.description
                    if (r5 != 0) goto L_0x0554
                    goto L_0x0557
                L_0x0554:
                    r74 = r5
                    goto L_0x0559
                L_0x0557:
                    r74 = r20
                L_0x0559:
                    if (r4 == 0) goto L_0x0560
                    int r14 = r4.f182406t
                    r76 = r14
                    goto L_0x0562
                L_0x0560:
                    r76 = 0
                L_0x0562:
                    java.lang.String r5 = r6.sessionBuffer
                    r78 = 0
                    if (r15 == 0) goto L_0x0572
                    if (r4 == 0) goto L_0x0572
                    java.lang.String r7 = r4.f182395g
                    if (r7 != 0) goto L_0x056f
                    goto L_0x0572
                L_0x056f:
                    r79 = r7
                    goto L_0x0574
                L_0x0572:
                    r79 = r20
                L_0x0574:
                    if (r4 == 0) goto L_0x0583
                    te3.b81 r4 = r4.f182401p
                    if (r4 == 0) goto L_0x0583
                    int r4 = r4.f182228d
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r80 = r4
                    goto L_0x0585
                L_0x0583:
                    r80 = r24
                L_0x0585:
                    r81 = 0
                    te3.c21 r4 = r6.liveInfo
                    if (r4 == 0) goto L_0x0593
                    te3.bq2 r4 = r4.f182358D
                    if (r4 == 0) goto L_0x0593
                    byte[] r24 = r4.toByteArray()
                L_0x0593:
                    r82 = r24
                    r83 = 0
                    r84 = 0
                    r85 = 107520(0x1a400, float:1.50668E-40)
                    r86 = 0
                    r66 = r0
                    r67 = r31
                    r68 = r2
                    r75 = r1
                    r77 = r5
                    tf0.C13883o1.C13884a.m13252d(r65, r66, r67, r68, r70, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86)
                    goto L_0x0604
                L_0x05ac:
                    r6 = r2
                    r4 = r13
                    r31 = r17
                    r5 = r26
                    r8 = 1
                    r30 = 0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    if (r6 != 0) goto L_0x05be
                    r15 = 1
                    goto L_0x05bf
                L_0x05be:
                    r15 = 0
                L_0x05bf:
                    r0.append(r15)
                    java.lang.String r1 = ", "
                    r0.append(r1)
                    if (r6 == 0) goto L_0x05d4
                    te3.c21 r1 = r6.liveInfo
                    if (r1 == 0) goto L_0x05d4
                    int r1 = r1.f182394f
                    r2 = 2
                    if (r1 != r2) goto L_0x05d4
                    r15 = 1
                    goto L_0x05d5
                L_0x05d4:
                    r15 = 0
                L_0x05d5:
                    r0.append(r15)
                    java.lang.String r0 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                    android.content.Intent r0 = new android.content.Intent
                    r0.<init>()
                    r1 = r16
                    r0.putExtra(r1, r5)
                    r0.putExtra(r7, r4)
                    if (r3 <= 0) goto L_0x05f9
                    di3.d r1 = di3.C86312j.m106911c(r41)
                    ht1.t1 r1 = (ht1.C60200t1) r1
                    r2 = 32
                    r1.mo76842e7(r3, r9, r2, r0)
                L_0x05f9:
                    di3.d r1 = di3.C86312j.m106911c(r18)
                    tf0.o1 r1 = (tf0.C13883o1) r1
                    r2 = r31
                    r1.mo13272V1(r2, r0)
                L_0x0604:
                    r1 = r92
                L_0x0606:
                    ht1.z4$a<java.lang.Object> r0 = r1.f171569n
                    if (r0 == 0) goto L_0x0611
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
                    r0.mo6382a(r2)
                L_0x0611:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C60113e.C60114a.invoke():java.lang.Object");
            }
        }

        public C60113e(String str, String str2, C60106t tVar, Context context, JSONObject jSONObject, String str3, C60216z4.C8821a<Object> aVar) {
            this.f171555a = str;
            this.f171556b = str2;
            this.f171557c = tVar;
            this.f171558d = context;
            this.f171559e = jSONObject;
            this.f171560f = str3;
            this.f171561g = aVar;
        }

        /* renamed from: a */
        public void mo71551a(int i, int i2, String str, C50851pn0 pn02) {
            C87412m.m108594g(pn02, "resp");
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = pn02.f139838d;
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99470o.mo60266n().intValue();
            C64273c21 c212 = null;
            if (intValue == 1) {
                f0Var.f27484d = null;
                Log.m105924i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive mock 1");
            } else if (intValue == 2) {
                FinderObject finderObject = (FinderObject) f0Var.f27484d;
                if (finderObject != null) {
                    c212 = finderObject.liveInfo;
                }
                if (c212 != null) {
                    c212.f182394f = 2;
                }
                Log.m105924i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive mock 2");
            }
            C61926c.m72668M(new C60114a(this.f171555a, this.f171556b, this.f171557c, f0Var, this.f171558d, this.f171559e, this.f171560f, this.f171561g));
        }
    }

    /* renamed from: hr.t$e0 */
    public static final class C60115e0 implements C46108j1 {

        /* renamed from: a */
        public final /* synthetic */ String f171570a;

        /* renamed from: b */
        public final /* synthetic */ Context f171571b;

        /* renamed from: c */
        public final /* synthetic */ C64855yf1 f171572c;

        /* renamed from: hr.t$e0$a */
        public static final class C60116a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f171573d;

            /* renamed from: e */
            public final /* synthetic */ Context f171574e;

            /* renamed from: f */
            public final /* synthetic */ FinderObject f171575f;

            /* renamed from: g */
            public final /* synthetic */ C64855yf1 f171576g;

            /* renamed from: h */
            public final /* synthetic */ int f171577h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60116a(String str, Context context, FinderObject finderObject, C64855yf1 yf12, int i) {
                super(0);
                this.f171573d = str;
                this.f171574e = context;
                this.f171575f = finderObject;
                this.f171576g = yf12;
                this.f171577h = i;
            }

            /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x00f4  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
            /* JADX WARNING: Removed duplicated region for block: B:62:0x0121  */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x012e  */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x0131  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x013e  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x0141  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x014e  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x0162  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x017f  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x0182  */
            /* JADX WARNING: Removed duplicated region for block: B:83:0x0189  */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x018c  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x0192  */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x0195  */
            /* JADX WARNING: Removed duplicated region for block: B:93:0x01a0  */
            /* JADX WARNING: Removed duplicated region for block: B:94:0x01a3  */
            /* JADX WARNING: Removed duplicated region for block: B:96:0x01a7  */
            /* JADX WARNING: Removed duplicated region for block: B:97:0x01ac  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r31 = this;
                    r0 = r31
                    java.lang.Class<tf0.o1> r1 = tf0.C13883o1.class
                    java.lang.String r2 = r0.f171573d
                    zc1.b r3 = zc1.C66785b.f191882e
                    java.lang.String r3 = r3.mo90662O5()
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)
                    java.lang.String r3 = "getService(IActivityRouter::class.java)"
                    java.lang.String r4 = ""
                    if (r2 == 0) goto L_0x0051
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    gy3.C87412m.m108593f(r1, r3)
                    r5 = r1
                    tf0.o1 r5 = (tf0.C13883o1) r5
                    android.content.Context r6 = r0.f171574e
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171575f
                    long r7 = r1.f164794id
                    java.lang.String r2 = r1.objectNonceId
                    if (r2 != 0) goto L_0x002c
                    r9 = r4
                    goto L_0x002d
                L_0x002c:
                    r9 = r2
                L_0x002d:
                    te3.c21 r1 = r1.liveInfo
                    if (r1 != 0) goto L_0x0036
                    te3.c21 r1 = new te3.c21
                    r1.<init>()
                L_0x0036:
                    r10 = r1
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171575f
                    java.lang.String r1 = r1.sessionBuffer
                    r17 = r1
                    r18 = 0
                    r19 = 0
                    r20 = 7152(0x1bf0, float:1.0022E-41)
                    r21 = 0
                    tf0.C13883o1.C13884a.m13249a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    goto L_0x01c6
                L_0x0051:
                    com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f171575f
                    com.tencent.mm.protocal.protobuf.FinderContact r5 = r2.contact
                    r6 = 1
                    r7 = 0
                    if (r5 == 0) goto L_0x005f
                    int r5 = r5.liveStatus
                    if (r5 != r6) goto L_0x005f
                    r5 = 1
                    goto L_0x0060
                L_0x005f:
                    r5 = 0
                L_0x0060:
                    if (r5 == 0) goto L_0x006e
                    te3.c21 r8 = r2.liveInfo
                    if (r8 == 0) goto L_0x006e
                    java.lang.String r8 = r8.f182395g
                    if (r8 != 0) goto L_0x006b
                    goto L_0x006e
                L_0x006b:
                    r23 = r8
                    goto L_0x0070
                L_0x006e:
                    r23 = r4
                L_0x0070:
                    r8 = 0
                    if (r5 == 0) goto L_0x0085
                    te3.c21 r2 = r2.liveInfo
                    if (r2 == 0) goto L_0x0082
                    te3.b81 r2 = r2.f182401p
                    if (r2 == 0) goto L_0x0082
                    int r2 = r2.f182228d
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    goto L_0x0089
                L_0x0082:
                    r24 = r8
                    goto L_0x008b
                L_0x0085:
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                L_0x0089:
                    r24 = r2
                L_0x008b:
                    if (r5 == 0) goto L_0x009e
                    com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f171575f
                    te3.c21 r2 = r2.liveInfo
                    if (r2 == 0) goto L_0x009e
                    te3.bq2 r2 = r2.f182358D
                    if (r2 == 0) goto L_0x009e
                    byte[] r2 = r2.toByteArray()
                    r26 = r2
                    goto L_0x00a0
                L_0x009e:
                    r26 = r8
                L_0x00a0:
                    if (r5 != 0) goto L_0x00de
                    int r2 = com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget.f17843F
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "LiveLogoAssistant liveId:"
                    r2.append(r5)
                    com.tencent.mm.protocal.protobuf.FinderObject r5 = r0.f171575f
                    te3.c21 r5 = r5.liveInfo
                    if (r5 == 0) goto L_0x00bb
                    long r9 = r5.f182392d
                    java.lang.Long r5 = java.lang.Long.valueOf(r9)
                    goto L_0x00bc
                L_0x00bb:
                    r5 = r8
                L_0x00bc:
                    r2.append(r5)
                    java.lang.String r5 = ",liveStatus:"
                    r2.append(r5)
                    com.tencent.mm.protocal.protobuf.FinderObject r5 = r0.f171575f
                    com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
                    if (r5 == 0) goto L_0x00d1
                    int r5 = r5.liveStatus
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    goto L_0x00d2
                L_0x00d1:
                    r5 = r8
                L_0x00d2:
                    r2.append(r5)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r5 = "Finder.LiveOnliveWidget"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                L_0x00de:
                    android.content.Intent r10 = new android.content.Intent
                    r10.<init>()
                    r2 = 5
                    java.lang.String r5 = "key_enter_live_param_visitor_enter_scene"
                    r10.putExtra(r5, r2)
                    java.lang.String r2 = "key_enter_live_param_pull_more_type"
                    r10.putExtra(r2, r6)
                    com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f171575f
                    te3.c21 r2 = r2.liveInfo
                    if (r2 == 0) goto L_0x00f7
                    int r2 = r2.f182384X
                    goto L_0x00f8
                L_0x00f7:
                    r2 = 0
                L_0x00f8:
                    java.lang.String r5 = "KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE"
                    r10.putExtra(r5, r2)
                    com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f171575f
                    te3.c21 r2 = r2.liveInfo
                    if (r2 == 0) goto L_0x0110
                    te3.by0 r2 = r2.f182402p0
                    if (r2 == 0) goto L_0x0110
                    byte[] r2 = r2.toByteArray()
                    java.lang.String r5 = "KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO"
                    r10.putExtra(r5, r2)
                L_0x0110:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "fireAuthorInfo Before gotoLive AuthorId: "
                    r2.append(r5)
                    te3.yf1 r5 = r0.f171576g
                    if (r5 == 0) goto L_0x0121
                    java.lang.String r5 = r5.f186511f
                    goto L_0x0122
                L_0x0121:
                    r5 = r8
                L_0x0122:
                    r2.append(r5)
                    java.lang.String r5 = ", AuthorIndex: "
                    r2.append(r5)
                    te3.yf1 r5 = r0.f171576g
                    if (r5 == 0) goto L_0x0131
                    java.lang.String r5 = r5.f186510e
                    goto L_0x0132
                L_0x0131:
                    r5 = r8
                L_0x0132:
                    r2.append(r5)
                    java.lang.String r5 = ", byPassInfo: "
                    r2.append(r5)
                    te3.yf1 r5 = r0.f171576g
                    if (r5 == 0) goto L_0x0141
                    java.lang.String r5 = r5.f186509d
                    goto L_0x0142
                L_0x0141:
                    r5 = r8
                L_0x0142:
                    r2.append(r5)
                    java.lang.String r5 = ", Info: "
                    r2.append(r5)
                    te3.yf1 r5 = r0.f171576g
                    if (r5 == 0) goto L_0x0152
                    byte[] r8 = r5.toByteArray()
                L_0x0152:
                    r2.append(r8)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r5 = "MicroMsg.FinderLiveFeatureService"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                    te3.yf1 r2 = r0.f171576g
                    if (r2 == 0) goto L_0x016b
                    byte[] r2 = r2.toByteArray()
                    java.lang.String r5 = "KEY_ENTER_LIVE_PARAM_OLYMPIC_FIRE_AUTHOR_INFO"
                    r10.putExtra(r5, r2)
                L_0x016b:
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    gy3.C87412m.m108593f(r1, r3)
                    r9 = r1
                    tf0.o1 r9 = (tf0.C13883o1) r9
                    android.content.Context r11 = r0.f171574e
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171575f
                    long r12 = r1.f164794id
                    te3.c21 r2 = r1.liveInfo
                    if (r2 == 0) goto L_0x0182
                    long r5 = r2.f182392d
                    goto L_0x0184
                L_0x0182:
                    r5 = 0
                L_0x0184:
                    r14 = r5
                    java.lang.String r3 = r1.username
                    if (r3 != 0) goto L_0x018c
                    r16 = r4
                    goto L_0x018e
                L_0x018c:
                    r16 = r3
                L_0x018e:
                    java.lang.String r3 = r1.objectNonceId
                    if (r3 != 0) goto L_0x0195
                    r17 = r4
                    goto L_0x0197
                L_0x0195:
                    r17 = r3
                L_0x0197:
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r1.objectDesc
                    if (r3 == 0) goto L_0x01a3
                    java.lang.String r3 = r3.description
                    if (r3 != 0) goto L_0x01a0
                    goto L_0x01a3
                L_0x01a0:
                    r18 = r3
                    goto L_0x01a5
                L_0x01a3:
                    r18 = r4
                L_0x01a5:
                    if (r2 == 0) goto L_0x01ac
                    int r7 = r2.f182406t
                    r20 = r7
                    goto L_0x01ae
                L_0x01ac:
                    r20 = 0
                L_0x01ae:
                    java.lang.String r1 = r1.sessionBuffer
                    r21 = r1
                    r22 = 0
                    int r1 = r0.f171577h
                    r25 = r1
                    r27 = 0
                    r28 = 0
                    r29 = 33792(0x8400, float:4.7353E-41)
                    r30 = 0
                    java.lang.String r19 = ""
                    tf0.C13883o1.C13884a.m13252d(r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                L_0x01c6:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C60115e0.C60116a.invoke():java.lang.Object");
            }
        }

        public C60115e0(String str, Context context, C64855yf1 yf12) {
            this.f171570a = str;
            this.f171571b = context;
            this.f171572c = yf12;
        }

        /* renamed from: a */
        public void mo71551a(int i, int i2, String str, C50851pn0 pn02) {
            FinderContact finderContact;
            C87412m.m108594g(pn02, "resp");
            FinderObject finderObject = pn02.f139838d;
            String str2 = null;
            if (finderObject != null) {
                FinderContact finderContact2 = finderObject.contact;
                if (C87412m.m108589b(finderContact2 != null ? finderContact2.username : null, this.f171570a)) {
                    int t3 = ((C60172g4) C39818r.f106831a.mo62443b(this.f171571b).mo62447c(C60172g4.class)).mo12864t3();
                    ((C64916p1) C86312j.m106911c(C64916p1.class)).j80(finderObject, t3);
                    C61926c.m72668M(new C60116a(this.f171570a, this.f171571b, finderObject, this.f171572c, t3));
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[LiveLogoAssistant]CgiFinderLiveGetLastObject invalid resp local username:");
            sb.append(this.f171570a);
            sb.append(",remote username:");
            if (!(finderObject == null || (finderContact = finderObject.contact) == null)) {
                str2 = finderContact.username;
            }
            sb.append(str2);
            Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
        }
    }

    /* renamed from: hr.t$f */
    public static final class C60117f extends C87413o implements C32226l<C89132b.C89134c<C50397mg0>, C89132b.C89134c<C50397mg0>> {

        /* renamed from: d */
        public final /* synthetic */ C60606n.C60608b f171578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60117f(C60606n.C60608b bVar) {
            super(1);
            this.f171578d = bVar;
        }

        public Object invoke(Object obj) {
            Map map;
            LinkedList<C51533ue1> linkedList;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar == null) {
                return null;
            }
            C60606n.C60608b bVar = this.f171578d;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C50397mg0 mg02 = (C50397mg0) cVar.f256796d;
                if (mg02 == null || (linkedList = mg02.f138011d) == null) {
                    map = new HashMap();
                } else {
                    int a = C90363p0.m113142a(C36907w.m41090l(linkedList, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    map = new LinkedHashMap(a);
                    for (C51533ue1 ue12 : linkedList) {
                        Long valueOf = Long.valueOf(ue12.f142797d);
                        C64273c21 c212 = ue12.f142798e;
                        map.put(valueOf, Integer.valueOf(c212 != null ? c212.f182394f : 1));
                    }
                }
                bVar.mo83467a(map, ((C50397mg0) cVar.f256796d).f138013f);
                return cVar;
            }
            bVar.mo83467a(new HashMap(), 0);
            return cVar;
        }
    }

    /* renamed from: hr.t$f0 */
    public static final class C60118f0<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C89132b.C89134c<C52005xq0>, C13598b0> f171579a;

        public C60118f0(C32226l<? super C89132b.C89134c<C52005xq0>, C13598b0> lVar) {
            this.f171579a = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C32226l<C89132b.C89134c<C52005xq0>, C13598b0> lVar = this.f171579a;
            if (lVar == null) {
                return null;
            }
            C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
            lVar.invoke(cVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.t$h */
    public static final class C60119h implements C46108j1 {

        /* renamed from: a */
        public final /* synthetic */ long f171580a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f171581b;

        /* renamed from: c */
        public final /* synthetic */ C8477a0 f171582c;

        /* renamed from: d */
        public final /* synthetic */ Context f171583d;

        /* renamed from: e */
        public final /* synthetic */ C60106t f171584e;

        /* renamed from: hr.t$h$a */
        public static final class C60120a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ FinderObject f171585a;

            /* renamed from: b */
            public final /* synthetic */ C60106t f171586b;

            /* renamed from: c */
            public final /* synthetic */ Context f171587c;

            /* renamed from: d */
            public final /* synthetic */ C64273c21 f171588d;

            /* renamed from: e */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f171589e;

            public C60120a(FinderObject finderObject, C60106t tVar, Context context, C64273c21 c212, C32226l<? super Boolean, C13598b0> lVar) {
                this.f171585a = finderObject;
                this.f171586b = tVar;
                this.f171587c = context;
                this.f171588d = c212;
                this.f171589e = lVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
                r12 = (r12 = r12.liveInfo).f182360F;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo353a(boolean r12, java.lang.String r13) {
                /*
                    r11 = this;
                    com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f171585a
                    if (r12 == 0) goto L_0x001c
                    te3.c21 r12 = r12.liveInfo
                    if (r12 == 0) goto L_0x001c
                    te3.l21 r12 = r12.f182360F
                    if (r12 == 0) goto L_0x001c
                    android.content.Intent r13 = new android.content.Intent
                    r13.<init>()
                    byte[] r12 = r12.toByteArray()
                    java.lang.String r0 = "KEY_PARAMS_LAYER_SHOW_INFO"
                    android.content.Intent r12 = r13.putExtra(r0, r12)
                    goto L_0x001d
                L_0x001c:
                    r12 = 0
                L_0x001d:
                    r1 = r12
                    com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f171585a
                    te3.c21 r12 = r12.liveInfo
                    if (r12 == 0) goto L_0x002d
                    int r12 = r12.f182405s
                    if (r1 == 0) goto L_0x002d
                    java.lang.String r13 = "KEY_PARAMS_SOURCE_TYPE"
                    r1.putExtra(r13, r12)
                L_0x002d:
                    com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f171585a
                    te3.c21 r12 = r12.liveInfo
                    if (r12 == 0) goto L_0x003e
                    java.lang.String r12 = r12.f182357C
                    if (r12 == 0) goto L_0x003e
                    if (r1 == 0) goto L_0x003e
                    java.lang.String r13 = "KEY_PARAMS_GAME_APP_ID"
                    r1.putExtra(r13, r12)
                L_0x003e:
                    hr.t r0 = r11.f171586b
                    android.content.Context r12 = r11.f171587c
                    if (r12 != 0) goto L_0x0048
                    android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                L_0x0048:
                    r2 = r12
                    com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f171585a
                    long r3 = r12.f164794id
                    te3.c21 r12 = r11.f171588d
                    long r12 = r12.f182392d
                    java.lang.Long r5 = java.lang.Long.valueOf(r12)
                    com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f171585a
                    java.lang.String r13 = r12.objectNonceId
                    java.lang.String r6 = ""
                    if (r13 != 0) goto L_0x005e
                    r13 = r6
                L_0x005e:
                    hp1.w0 r7 = hp1.C8703w0.f27927a
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc r12 = r12.objectDesc
                    if (r12 == 0) goto L_0x006a
                    java.lang.String r12 = r12.description
                    if (r12 != 0) goto L_0x0069
                    goto L_0x006a
                L_0x0069:
                    r6 = r12
                L_0x006a:
                    java.lang.String r7 = r7.mo9553e(r6)
                    com.tencent.mm.protocal.protobuf.FinderObject r12 = r11.f171585a
                    java.lang.String r9 = r12.sessionBuffer
                    java.lang.String r8 = ""
                    java.lang.String r10 = ""
                    r6 = r13
                    r0.o90(r1, r2, r3, r5, r6, r7, r8, r9, r10)
                    fy3.l<java.lang.Boolean, rx3.b0> r12 = r11.f171589e
                    if (r12 == 0) goto L_0x0083
                    java.lang.Boolean r13 = java.lang.Boolean.TRUE
                    r12.invoke(r13)
                L_0x0083:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C60119h.C60120a.mo353a(boolean, java.lang.String):void");
            }
        }

        /* renamed from: hr.t$h$b */
        public static final class C60121b implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f171590a;

            public C60121b(C32226l<? super Boolean, C13598b0> lVar) {
                this.f171590a = lVar;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C32226l<Boolean, C13598b0> lVar = this.f171590a;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
            }
        }

        public C60119h(long j, C32226l<? super Boolean, C13598b0> lVar, C8477a0 a0Var, Context context, C60106t tVar) {
            this.f171580a = j;
            this.f171581b = lVar;
            this.f171582c = a0Var;
            this.f171583d = context;
            this.f171584e = tVar;
        }

        /* renamed from: a */
        public void mo71551a(int i, int i2, String str, C50851pn0 pn02) {
            C64273c21 c212;
            C64273c21 c213;
            C64510l21 l212;
            C64273c21 c214;
            FinderContact finderContact;
            C64273c21 c215;
            C87412m.m108594g(pn02, "resp");
            long currentTimeMillis = System.currentTimeMillis() - this.f171580a;
            FinderObject finderObject = pn02.f139838d;
            StringBuilder sb = new StringBuilder();
            sb.append("checkUnfinishLive duration:");
            sb.append(currentTimeMillis);
            sb.append(" finderObject:[objectId:");
            C13598b0 b0Var = null;
            sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
            sb.append(" liveId:");
            sb.append((finderObject == null || (c215 = finderObject.liveInfo) == null) ? null : Long.valueOf(c215.f182392d));
            sb.append(" anchorUsername:");
            sb.append((finderObject == null || (finderContact = finderObject.contact) == null) ? null : finderContact.username);
            sb.append(" liveStatus:");
            sb.append((finderObject == null || (c214 = finderObject.liveInfo) == null) ? null : Integer.valueOf(c214.f182394f));
            sb.append(" layerInfoType:");
            sb.append((finderObject == null || (c213 = finderObject.liveInfo) == null || (l212 = c213.f182360F) == null) ? null : Integer.valueOf(l212.f184023d));
            sb.append(']');
            Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
            if (!(finderObject == null || (c212 = finderObject.liveInfo) == null)) {
                C8477a0 a0Var = this.f171582c;
                Context context = this.f171583d;
                C32226l<Boolean, C13598b0> lVar = this.f171581b;
                C60106t tVar = this.f171584e;
                if (currentTimeMillis < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    boolean z = true;
                    if (c212.f182394f != 1) {
                        z = false;
                    }
                    a0Var.f27482d = z;
                    Log.m105924i("MicroMsg.FinderLiveFeatureService", "checkUnfinishLive remoteUnfinishLive:" + a0Var.f27482d);
                    if (a0Var.f27482d) {
                        C77426q qVar = new C77426q(context);
                        qVar.mo107595g(MMApplicationContext.getContext().getResources().getString(C0966R.string.dpb));
                        qVar.mo107602n(MMApplicationContext.getContext().getResources().getString(C0966R.string.dpa));
                        qVar.mo107600l(new C60120a(finderObject, tVar, context, c212, lVar));
                        qVar.mo107598j(MMApplicationContext.getContext().getResources().getString(C0966R.string.f7926wf));
                        qVar.mo107597i(new C60121b(lVar));
                        qVar.mo107603o();
                        b0Var = C13598b0.f38549a;
                    } else if (lVar != null) {
                        lVar.invoke(Boolean.FALSE);
                        b0Var = C13598b0.f38549a;
                    }
                } else {
                    if (lVar != null) {
                        lVar.invoke(Boolean.FALSE);
                    }
                    Log.m105924i("MicroMsg.FinderLiveFeatureService", "checkUnfinishLive timeout: duration:" + currentTimeMillis);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var != null) {
                    return;
                }
            }
            C32226l<Boolean, C13598b0> lVar2 = this.f171581b;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: hr.t$o0 */
    public static final class C60122o0 implements C60216z4.C8821a<Void> {

        /* renamed from: a */
        public final /* synthetic */ C60216z4.C8821a<Object> f171591a;

        public C60122o0(C60216z4.C8821a<Object> aVar) {
            this.f171591a = aVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Void voidR = (Void) obj;
            C60216z4.C8821a<Object> aVar = this.f171591a;
            if (aVar != null) {
                aVar.mo6382a(0);
            }
        }
    }

    /* renamed from: hr.t$r */
    public static final class C60123r implements C91753f.C66827b {

        /* renamed from: a */
        public static final C60123r f171592a = new C60123r();

        /* renamed from: a */
        public final String[] mo6410a() {
            String[] strArr = C60333i.f171980e;
            return C60333i.f171980e;
        }
    }

    /* renamed from: hr.t$s */
    public static final class C60124s<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C9252f f171593a;

        /* renamed from: b */
        public final /* synthetic */ Integer f171594b;

        /* renamed from: c */
        public final /* synthetic */ C60106t f171595c;

        /* renamed from: d */
        public final /* synthetic */ Context f171596d;

        /* renamed from: e */
        public final /* synthetic */ List<String> f171597e;

        /* renamed from: f */
        public final /* synthetic */ String f171598f;

        /* renamed from: g */
        public final /* synthetic */ String f171599g;

        public C60124s(C9252f fVar, Integer num, C60106t tVar, Context context, List<String> list, String str, String str2) {
            this.f171593a = fVar;
            this.f171594b = num;
            this.f171595c = tVar;
            this.f171596d = context;
            this.f171597e = list;
            this.f171598f = str;
            this.f171599g = str2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v2 */
        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r35) {
            /*
                r34 = this;
                r1 = r34
                r0 = r35
                ob0.b$c r0 = (ob0.C89132b.C89134c) r0
                java.lang.Class<ls3.g> r2 = ls3.C61397g.class
                java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
                it1.f r4 = r1.f171593a
                r4.mo10029a()
                T r4 = r0.f256796d
                te3.jm0 r4 = (te3.C50008jm0) r4
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f136184e
                int r5 = r0.f256793a
                r6 = 1
                r7 = 0
                java.lang.String r8 = "MicroMsg.FinderLiveFeatureService"
                if (r5 != 0) goto L_0x0307
                int r5 = r0.f256794b
                if (r5 != 0) goto L_0x0307
                if (r4 == 0) goto L_0x0307
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "enterFinderLiveUIByBiz liveId: "
                r0.append(r5)
                te3.c21 r5 = r4.liveInfo
                if (r5 == 0) goto L_0x0034
                long r11 = r5.f182392d
                goto L_0x0036
            L_0x0034:
                r11 = 0
            L_0x0036:
                r0.append(r11)
                java.lang.String r5 = ", username:"
                r0.append(r5)
                java.lang.String r5 = r4.username
                java.lang.String r11 = ""
                if (r5 != 0) goto L_0x0045
                r5 = r11
            L_0x0045:
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                vp1.e r0 = vp1.C65834e.f189316a
                com.tencent.mm.plugin.finder.storage.FinderItem$a r5 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo79056a(r4, r7)
                vp1.e$b r12 = vp1.C65834e.C65836b.f189330j
                r0.mo89878l(r5, r12)
                te3.c21 r14 = r4.liveInfo
                java.lang.Integer r0 = r1.f171594b
                r5 = 65
                r12 = 12
                r13 = 4
                r15 = 14
                r9 = 13
                r10 = 2
                if (r0 != 0) goto L_0x006d
                goto L_0x0073
            L_0x006d:
                int r0 = r0.intValue()
                if (r0 == r13) goto L_0x00a2
            L_0x0073:
                java.lang.Integer r0 = r1.f171594b
                if (r0 != 0) goto L_0x0078
                goto L_0x007e
            L_0x0078:
                int r0 = r0.intValue()
                if (r0 == r12) goto L_0x00a2
            L_0x007e:
                java.lang.Integer r0 = r1.f171594b
                if (r0 != 0) goto L_0x0083
                goto L_0x0089
            L_0x0083:
                int r0 = r0.intValue()
                if (r0 == r9) goto L_0x00a2
            L_0x0089:
                java.lang.Integer r0 = r1.f171594b
                if (r0 != 0) goto L_0x008e
                goto L_0x0095
            L_0x008e:
                int r0 = r0.intValue()
                if (r0 != r15) goto L_0x0095
                goto L_0x00a2
            L_0x0095:
                di3.d r0 = di3.C86312j.m106911c(r3)
                ht1.t1 r0 = (ht1.C60200t1) r0
                r7 = 26
                java.lang.String r0 = r0.mo76802R1(r7, r10, r5)
                goto L_0x00ae
            L_0x00a2:
                di3.d r0 = di3.C86312j.m106911c(r3)
                ht1.t1 r0 = (ht1.C60200t1) r0
                r7 = 27
                java.lang.String r0 = r0.mo76802R1(r7, r10, r5)
            L_0x00ae:
                r5 = r0
                di3.d r0 = di3.C86312j.m106911c(r2)
                ls3.g r0 = (ls3.C61397g) r0
                java.lang.String r7 = r4.username
                boolean r0 = r0.ah0(r7, r14)
                if (r0 != 0) goto L_0x0266
                if (r14 == 0) goto L_0x00c5
                int r0 = r14.f182394f
                if (r0 != r10) goto L_0x00c5
                r0 = 1
                goto L_0x00c6
            L_0x00c5:
                r0 = 0
            L_0x00c6:
                if (r0 == 0) goto L_0x00d7
                di3.d r0 = di3.C86312j.m106911c(r2)
                ls3.g r0 = (ls3.C61397g) r0
                r7 = 6
                boolean r0 = r0.mo83479QW(r7, r14)
                if (r0 == 0) goto L_0x00d7
                goto L_0x0266
            L_0x00d7:
                java.lang.Integer r0 = r1.f171594b
                java.util.List<java.lang.String> r2 = r1.f171597e
                java.lang.String r3 = r1.f171598f
                java.lang.String r7 = r1.f171599g
                hr.t r14 = r1.f171595c
                r15 = 3
                if (r0 != 0) goto L_0x00e5
                goto L_0x00ef
            L_0x00e5:
                int r9 = r0.intValue()
                if (r9 != r6) goto L_0x00ef
                java.lang.String r0 = "mmbiz_oftenread_bar"
                goto L_0x0168
            L_0x00ef:
                if (r0 != 0) goto L_0x00f2
                goto L_0x00fc
            L_0x00f2:
                int r9 = r0.intValue()
                if (r9 != r10) goto L_0x00fc
                java.lang.String r0 = "mmbiz_live_bar"
                goto L_0x0168
            L_0x00fc:
                if (r0 != 0) goto L_0x00ff
                goto L_0x0109
            L_0x00ff:
                int r9 = r0.intValue()
                if (r9 != r15) goto L_0x0109
                java.lang.String r0 = "mmbiz_tl"
                goto L_0x0168
            L_0x0109:
                if (r0 != 0) goto L_0x010c
                goto L_0x0115
            L_0x010c:
                int r9 = r0.intValue()
                if (r9 != r13) goto L_0x0115
                java.lang.String r0 = "mmbiz_message"
                goto L_0x0168
            L_0x0115:
                r9 = 8
                if (r0 != 0) goto L_0x011a
                goto L_0x0123
            L_0x011a:
                int r10 = r0.intValue()
                if (r10 != r9) goto L_0x0123
                java.lang.String r0 = "mmbiz_profile"
                goto L_0x0168
            L_0x0123:
                r9 = 9
                if (r0 != 0) goto L_0x0128
                goto L_0x0131
            L_0x0128:
                int r10 = r0.intValue()
                if (r10 != r9) goto L_0x0131
                java.lang.String r0 = "mmbiz_article"
                goto L_0x0168
            L_0x0131:
                r9 = 11
                if (r0 != 0) goto L_0x0136
                goto L_0x013f
            L_0x0136:
                int r10 = r0.intValue()
                if (r10 != r9) goto L_0x013f
                java.lang.String r0 = "mmbiz_big_card"
                goto L_0x0168
            L_0x013f:
                if (r0 != 0) goto L_0x0142
                goto L_0x014b
            L_0x0142:
                int r9 = r0.intValue()
                if (r9 != r12) goto L_0x014b
                java.lang.String r0 = "mmbiz_first_card"
                goto L_0x0168
            L_0x014b:
                if (r0 != 0) goto L_0x014e
                goto L_0x0159
            L_0x014e:
                int r9 = r0.intValue()
                r10 = 13
                if (r9 != r10) goto L_0x0159
                java.lang.String r0 = "mmbiz_second_card"
                goto L_0x0168
            L_0x0159:
                if (r0 != 0) goto L_0x015c
                goto L_0x0167
            L_0x015c:
                int r0 = r0.intValue()
                r9 = 14
                if (r0 != r9) goto L_0x0167
                java.lang.String r0 = "mmbiz_his_card"
                goto L_0x0168
            L_0x0167:
                r0 = r11
            L_0x0168:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                if (r2 == 0) goto L_0x0191
                java.util.Iterator r2 = r2.iterator()
            L_0x0178:
                boolean r12 = r2.hasNext()
                if (r12 == 0) goto L_0x0191
                java.lang.Object r12 = r2.next()
                java.lang.String r12 = (java.lang.String) r12
                r9.append(r12)
                java.lang.String r15 = ","
                r9.append(r15)
                r10.add(r12)
                r15 = 3
                goto L_0x0178
            L_0x0191:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                if (r3 != 0) goto L_0x0199
                r3 = r11
            L_0x0199:
                java.lang.String r12 = "key_enter_live_export_id"
                r2.putExtra(r12, r3)
                java.lang.String r3 = "key_enter_live_param_visitor_enter_scene"
                r2.putExtra(r3, r13)
                java.lang.String r3 = "key_enter_live_param_pull_more_type"
                r2.putExtra(r3, r6)
                java.lang.String r3 = "key_enter_live_export_id_list"
                r2.putStringArrayListExtra(r3, r10)
                int r3 = r9.length()
                if (r3 != 0) goto L_0x01b5
                r3 = 1
                goto L_0x01b6
            L_0x01b5:
                r3 = 0
            L_0x01b6:
                if (r3 != 0) goto L_0x01c7
                java.lang.String r3 = "key_enter_live_param_by_pass_type"
                r10 = 3
                r2.putExtra(r3, r10)
                java.lang.String r3 = r9.toString()
                java.lang.String r9 = "key_enter_live_param_by_pass_info"
                r2.putExtra(r9, r3)
            L_0x01c7:
                java.lang.Class<kq.g> r3 = p185kq.C61130g.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                kq.g r3 = (p185kq.C61130g) r3
                java.lang.String r9 = "temp_12"
                r3.mo33246ry(r9)
                c30.g r3 = new c30.g
                r3.<init>()
                java.lang.String r9 = "bizusername"
                r3.mo145967r(r9, r7)     // Catch:{ Exception -> 0x01f2 }
                java.lang.String r9 = "exposeType"
                r3.mo145967r(r9, r0)     // Catch:{ Exception -> 0x01f2 }
                java.lang.String r0 = "finder_username"
                java.lang.String r9 = r4.username     // Catch:{ Exception -> 0x01f2 }
                r3.mo145967r(r0, r9)     // Catch:{ Exception -> 0x01f2 }
                java.lang.String r0 = "wx_username"
                r3.mo145967r(r0, r7)     // Catch:{ Exception -> 0x01f2 }
                goto L_0x020b
            L_0x01f2:
                r0 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "err:"
                r7.append(r9)
                java.lang.String r0 = r0.getMessage()
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            L_0x020b:
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "key_chnl_extra"
                r2.putExtra(r3, r0)
                android.content.Context r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                long r7 = r4.f164794id
                te3.c21 r0 = r4.liveInfo
                if (r0 == 0) goto L_0x0221
                long r9 = r0.f182392d
                goto L_0x0223
            L_0x0221:
                r9 = 0
            L_0x0223:
                java.lang.Long r23 = java.lang.Long.valueOf(r9)
                java.lang.String r0 = r4.objectNonceId
                if (r0 != 0) goto L_0x022e
                r25 = r11
                goto L_0x0230
            L_0x022e:
                r25 = r0
            L_0x0230:
                java.lang.String r0 = r4.sessionBuffer
                r30 = 0
                te3.c21 r3 = r4.liveInfo
                if (r3 == 0) goto L_0x0240
                java.lang.String r4 = r3.f182395g
                if (r4 != 0) goto L_0x023d
                goto L_0x0240
            L_0x023d:
                r31 = r4
                goto L_0x0242
            L_0x0240:
                r31 = r11
            L_0x0242:
                if (r3 == 0) goto L_0x024d
                te3.b81 r3 = r3.f182401p
                if (r3 == 0) goto L_0x024d
                int r6 = r3.f182228d
                r32 = r6
                goto L_0x024f
            L_0x024d:
                r32 = 1
            L_0x024f:
                r33 = 1
                java.lang.String r24 = ""
                java.lang.String r26 = ""
                java.lang.String r29 = ""
                r18 = r14
                r19 = r2
                r21 = r7
                r27 = r5
                r28 = r0
                r18.mo85047ZH(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                goto L_0x036b
            L_0x0266:
                java.lang.Class<kq.h> r0 = p185kq.C10383h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                kq.h r0 = (p185kq.C10383h) r0
                r0.mo10697OK(r5)
                long r7 = r4.f164794id
                java.lang.Integer r0 = r1.f171594b
                java.lang.String r0 = java.lang.String.valueOf(r0)
                hr.t r5 = r1.f171595c
                boolean r5 = r5.Sj0(r14)
                if (r5 == 0) goto L_0x0282
                goto L_0x0283
            L_0x0282:
                r6 = 2
            L_0x0283:
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r7 = o40.C61926c.m72691p(r7)
                java.lang.String r8 = "object_id"
                r5.put(r8, r7)
                java.lang.String r7 = "page_type"
                r5.put(r7, r0)
                java.lang.String r0 = "object_type"
                r5.put(r0, r6)
                java.lang.String r0 = "page_sub_type"
                r6 = 0
                r5.put(r0, r6)
                java.lang.Class<ht1.j5> r0 = ht1.C8777j5.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.j5 r0 = (ht1.C8777j5) r0
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "this.toString()"
                gy3.C87412m.m108593f(r5, r6)
                java.lang.String r6 = "watch_live_record"
                r0.hg0(r6, r5)
                di3.d r0 = di3.C86312j.m106911c(r3)
                ht1.t1 r0 = (ht1.C60200t1) r0
                ht1.z4 r0 = r0.mo76861l7()
                r3 = 0
                java.lang.String r5 = "public_msg"
                r6 = 0
                android.content.Intent r15 = r0.mo83773T5(r3, r5, r6)
                di3.d r0 = di3.C86312j.m106911c(r2)
                r13 = r0
                ls3.g r13 = (ls3.C61397g) r13
                android.content.Context r0 = r1.f171596d
                long r2 = r4.f164794id
                if (r14 == 0) goto L_0x02dd
                long r9 = r14.f182392d
                r19 = r9
                goto L_0x02df
            L_0x02dd:
                r19 = 0
            L_0x02df:
                java.lang.String r5 = r4.username
                if (r5 != 0) goto L_0x02e6
                r21 = r11
                goto L_0x02e8
            L_0x02e6:
                r21 = r5
            L_0x02e8:
                java.lang.String r5 = r4.objectNonceId
                if (r5 != 0) goto L_0x02ef
                r22 = r11
                goto L_0x02f1
            L_0x02ef:
                r22 = r5
            L_0x02f1:
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x02fd
                java.lang.String r4 = r4.description
                if (r4 != 0) goto L_0x02fa
                goto L_0x02fd
            L_0x02fa:
                r23 = r4
                goto L_0x02ff
            L_0x02fd:
                r23 = r11
            L_0x02ff:
                r16 = r0
                r17 = r2
                r13.mo83484bR(r14, r15, r16, r17, r19, r21, r22, r23)
                goto L_0x036b
            L_0x0307:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "enterFinderLiveUIByBiz failed. "
                r2.append(r3)
                int r3 = r0.f256793a
                r2.append(r3)
                java.lang.String r3 = ", "
                r2.append(r3)
                int r5 = r0.f256794b
                r2.append(r5)
                r2.append(r3)
                if (r4 != 0) goto L_0x0326
                goto L_0x0327
            L_0x0326:
                r6 = 0
            L_0x0327:
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r2)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131828451(0x7f111ee3, float:1.9289843E38)
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getContext().resources.g…er_live_permission_title)"
                gy3.C87412m.m108593f(r2, r3)
                int r0 = r0.f256794b
                r3 = -4036(0xfffffffffffff03c, float:NaN)
                if (r0 != r3) goto L_0x035f
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131829578(0x7f11234a, float:1.929213E38)
                java.lang.String r2 = r0.getString(r2)
                java.lang.String r0 = "getContext().resources.g…te_feed_can_not_see_live)"
                gy3.C87412m.m108593f(r2, r0)
            L_0x035f:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r3 = 0
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r3)
                r0.show()
            L_0x036b:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C60124s.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: hr.t$t */
    public static final class C60125t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f171600d;

        /* renamed from: e */
        public final /* synthetic */ long f171601e;

        /* renamed from: f */
        public final /* synthetic */ String f171602f;

        /* renamed from: g */
        public final /* synthetic */ Context f171603g;

        /* renamed from: h */
        public final /* synthetic */ Intent f171604h;

        /* renamed from: i */
        public final /* synthetic */ C60106t f171605i;

        /* renamed from: j */
        public final /* synthetic */ Long f171606j;

        /* renamed from: n */
        public final /* synthetic */ String f171607n;

        /* renamed from: o */
        public final /* synthetic */ String f171608o;

        /* renamed from: p */
        public final /* synthetic */ String f171609p;

        /* renamed from: hr.t$t$a */
        public static final class C33023a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Context f89685d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C33023a(Context context) {
                super(0);
                this.f89685d = context;
            }

            public Object invoke() {
                C76912y0.makeText(this.f89685d, (int) C0966R.string.jde, 0).show();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: hr.t$t$b */
        public static final class C60126b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Intent f171610d;

            /* renamed from: e */
            public final /* synthetic */ FinderObject f171611e;

            /* renamed from: f */
            public final /* synthetic */ C60106t f171612f;

            /* renamed from: g */
            public final /* synthetic */ Context f171613g;

            /* renamed from: h */
            public final /* synthetic */ long f171614h;

            /* renamed from: i */
            public final /* synthetic */ Long f171615i;

            /* renamed from: j */
            public final /* synthetic */ String f171616j;

            /* renamed from: n */
            public final /* synthetic */ String f171617n;

            /* renamed from: o */
            public final /* synthetic */ String f171618o;

            /* renamed from: p */
            public final /* synthetic */ String f171619p;

            /* renamed from: q */
            public final /* synthetic */ String f171620q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60126b(Intent intent, FinderObject finderObject, C60106t tVar, Context context, long j, Long l, String str, String str2, String str3, String str4, String str5) {
                super(0);
                this.f171610d = intent;
                this.f171611e = finderObject;
                this.f171612f = tVar;
                this.f171613g = context;
                this.f171614h = j;
                this.f171615i = l;
                this.f171616j = str;
                this.f171617n = str2;
                this.f171618o = str3;
                this.f171619p = str4;
                this.f171620q = str5;
            }

            /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
            /* JADX WARNING: Removed duplicated region for block: B:60:0x010c  */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x0118  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r25 = this;
                    r0 = r25
                    android.content.Intent r1 = r0.f171610d
                    if (r1 != 0) goto L_0x000b
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                L_0x000b:
                    r3 = r1
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171611e
                    java.lang.String r1 = r1.username
                    zc1.b r2 = zc1.C66785b.f191882e
                    java.lang.String r2 = r2.mo90662O5()
                    boolean r1 = gy3.C87412m.m108589b(r1, r2)
                    if (r1 == 0) goto L_0x0040
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171611e
                    te3.c21 r1 = r1.liveInfo
                    if (r1 == 0) goto L_0x0029
                    int r1 = r1.f182405s
                    java.lang.String r2 = "KEY_PARAMS_SOURCE_TYPE"
                    r3.putExtra(r2, r1)
                L_0x0029:
                    hr.t r2 = r0.f171612f
                    android.content.Context r4 = r0.f171613g
                    long r5 = r0.f171614h
                    java.lang.Long r7 = r0.f171615i
                    java.lang.String r8 = r0.f171616j
                    java.lang.String r9 = r0.f171617n
                    java.lang.String r10 = r0.f171618o
                    java.lang.String r11 = r0.f171619p
                    java.lang.String r12 = r0.f171620q
                    r2.o90(r3, r4, r5, r7, r8, r9, r10, r11, r12)
                    goto L_0x0136
                L_0x0040:
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171611e
                    te3.c21 r1 = r1.liveInfo
                    r2 = 0
                    if (r1 == 0) goto L_0x004a
                    int r1 = r1.f182384X
                    goto L_0x004b
                L_0x004a:
                    r1 = 0
                L_0x004b:
                    java.lang.String r4 = "KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE"
                    r3.putExtra(r4, r1)
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171611e
                    te3.c21 r1 = r1.liveInfo
                    if (r1 == 0) goto L_0x0063
                    te3.by0 r1 = r1.f182402p0
                    if (r1 == 0) goto L_0x0063
                    byte[] r1 = r1.toByteArray()
                    java.lang.String r4 = "KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO"
                    r3.putExtra(r4, r1)
                L_0x0063:
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171611e
                    te3.c21 r1 = r1.liveInfo
                    r4 = 1
                    if (r1 == 0) goto L_0x006f
                    int r5 = r1.f182394f
                    if (r5 != r4) goto L_0x006f
                    goto L_0x0070
                L_0x006f:
                    r4 = 0
                L_0x0070:
                    java.lang.String r5 = ""
                    if (r4 == 0) goto L_0x007e
                    if (r1 == 0) goto L_0x007e
                    java.lang.String r6 = r1.f182395g
                    if (r6 != 0) goto L_0x007b
                    goto L_0x007e
                L_0x007b:
                    r16 = r6
                    goto L_0x0080
                L_0x007e:
                    r16 = r5
                L_0x0080:
                    r6 = 0
                    if (r4 == 0) goto L_0x0093
                    if (r1 == 0) goto L_0x0090
                    te3.b81 r1 = r1.f182401p
                    if (r1 == 0) goto L_0x0090
                    int r1 = r1.f182228d
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    goto L_0x0097
                L_0x0090:
                    r17 = r6
                    goto L_0x0099
                L_0x0093:
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                L_0x0097:
                    r17 = r1
                L_0x0099:
                    if (r4 == 0) goto L_0x00ac
                    com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f171611e
                    te3.c21 r1 = r1.liveInfo
                    if (r1 == 0) goto L_0x00ac
                    te3.bq2 r1 = r1.f182358D
                    if (r1 == 0) goto L_0x00ac
                    byte[] r1 = r1.toByteArray()
                    r19 = r1
                    goto L_0x00ae
                L_0x00ac:
                    r19 = r6
                L_0x00ae:
                    if (r4 != 0) goto L_0x00e8
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r4 = "enterFinderLiveVisitorUI liveId:"
                    r1.append(r4)
                    com.tencent.mm.protocal.protobuf.FinderObject r4 = r0.f171611e
                    te3.c21 r4 = r4.liveInfo
                    if (r4 == 0) goto L_0x00c7
                    long r7 = r4.f182392d
                    java.lang.Long r4 = java.lang.Long.valueOf(r7)
                    goto L_0x00c8
                L_0x00c7:
                    r4 = r6
                L_0x00c8:
                    r1.append(r4)
                    java.lang.String r4 = ",liveStatus:"
                    r1.append(r4)
                    com.tencent.mm.protocal.protobuf.FinderObject r4 = r0.f171611e
                    com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.contact
                    if (r4 == 0) goto L_0x00dc
                    int r4 = r4.liveStatus
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
                L_0x00dc:
                    r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r4 = "MicroMsg.FinderLiveFeatureService"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                L_0x00e8:
                    java.lang.Class<tf0.o1> r1 = tf0.C13883o1.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    java.lang.String r4 = "getService(IActivityRouter::class.java)"
                    gy3.C87412m.m108593f(r1, r4)
                    tf0.o1 r1 = (tf0.C13883o1) r1
                    android.content.Context r4 = r0.f171613g
                    long r6 = r0.f171614h
                    java.lang.Long r8 = r0.f171615i
                    long r8 = r8.longValue()
                    com.tencent.mm.protocal.protobuf.FinderObject r10 = r0.f171611e
                    java.lang.String r11 = r10.username
                    if (r11 != 0) goto L_0x0106
                    r11 = r5
                L_0x0106:
                    java.lang.String r12 = r0.f171616j
                    java.lang.String r13 = r0.f171617n
                    if (r13 != 0) goto L_0x010d
                    r13 = r5
                L_0x010d:
                    java.lang.String r5 = r0.f171618o
                    te3.c21 r10 = r10.liveInfo
                    if (r10 == 0) goto L_0x0118
                    int r2 = r10.f182406t
                    r24 = r2
                    goto L_0x011a
                L_0x0118:
                    r24 = 0
                L_0x011a:
                    java.lang.String r14 = r0.f171619p
                    java.lang.String r15 = r0.f171620q
                    r18 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 98304(0x18000, float:1.37753E-40)
                    r23 = 0
                    r2 = r1
                    r1 = r5
                    r5 = r6
                    r7 = r8
                    r9 = r11
                    r10 = r12
                    r11 = r13
                    r12 = r1
                    r13 = r24
                    tf0.C13883o1.C13884a.m13252d(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                L_0x0136:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C60125t.C60126b.invoke():java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60125t(String str, long j, String str2, Context context, Intent intent, C60106t tVar, Long l, String str3, String str4, String str5) {
            super(0);
            this.f171600d = str;
            this.f171601e = j;
            this.f171602f = str2;
            this.f171603g = context;
            this.f171604h = intent;
            this.f171605i = tVar;
            this.f171606j = l;
            this.f171607n = str3;
            this.f171608o = str4;
            this.f171609p = str5;
        }

        /* renamed from: a */
        public static final void m70026a(String str, Context context, Intent intent, C60106t tVar, long j, Long l, String str2, String str3, String str4, String str5, FinderObject finderObject, boolean z) {
            if (finderObject == null) {
                Log.m105920e("MicroMsg.FinderLiveFeatureService", "enterFinderProfileUI requestFinderObject null");
                if (z) {
                    Context context2 = context;
                    C61926c.m72668M(new C33023a(context));
                    return;
                }
                return;
            }
            ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(str);
            C61926c.m72668M(new C60126b(intent, finderObject, tVar, context, j, l, str2, str3, str, str4, str5));
        }

        public Object invoke() {
            if ((this.f171600d.length() > 0) && !C87412m.m108589b(String.valueOf(this.f171601e), this.f171600d)) {
                long j = this.f171601e;
                String str = this.f171600d;
                FinderObject Li = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76777Li(j, str, 0, false, true, "", new C60133y(this.f171602f, this.f171603g, this.f171604h, this.f171605i, j, this.f171606j, str, this.f171607n, this.f171608o, this.f171609p));
                String str2 = this.f171602f;
                Context context = this.f171603g;
                Intent intent = this.f171604h;
                C60106t tVar = this.f171605i;
                long j2 = this.f171601e;
                Long l = this.f171606j;
                String str3 = this.f171600d;
                String str4 = this.f171607n;
                String str5 = this.f171608o;
                String str6 = this.f171609p;
                if (Li == null) {
                    Li = null;
                }
                m70026a(str2, context, intent, tVar, j2, l, str3, str4, str5, str6, Li, false);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.finder.live.FinderLiveFeatureService$shareProduct$1", mo125469f = "FinderLiveFeatureService.kt", mo125470l = {2649}, mo125471m = "invokeSuspend")
    /* renamed from: hr.t$u0 */
    public static final class C60127u0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f171621d;

        /* renamed from: e */
        public int f171622e;

        /* renamed from: f */
        public final /* synthetic */ String f171623f;

        /* renamed from: g */
        public final /* synthetic */ String f171624g;

        /* renamed from: h */
        public final /* synthetic */ String f171625h;

        /* renamed from: i */
        public final /* synthetic */ String f171626i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60127u0(String str, String str2, String str3, String str4, C15601d<? super C60127u0> dVar) {
            super(2, dVar);
            this.f171623f = str;
            this.f171624g = str2;
            this.f171625h = str3;
            this.f171626i = str4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60127u0(this.f171623f, this.f171624g, this.f171625h, this.f171626i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60127u0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:69:0x011d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f171622e
                r2 = 1
                java.lang.String r3 = ""
                if (r1 == 0) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                java.lang.Object r0 = r13.f171621d
                te3.ci1 r0 = (te3.C64287ci1) r0
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00d5
            L_0x0014:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001c:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = "shareProduct token:"
                r14.append(r1)
                java.lang.String r1 = r13.f171623f
                r14.append(r1)
                java.lang.String r1 = ", finderUsername:"
                r14.append(r1)
                java.lang.String r1 = r13.f171624g
                r14.append(r1)
                java.lang.String r1 = ", productId:"
                r14.append(r1)
                java.lang.String r1 = r13.f171625h
                r14.append(r1)
                java.lang.String r1 = ", ecSource:"
                r14.append(r1)
                java.lang.String r1 = r13.f171626i
                r14.append(r1)
                java.lang.String r14 = r14.toString()
                java.lang.String r1 = "MicroMsg.FinderLiveFeatureService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
                java.lang.String r14 = r13.f171623f
                if (r14 == 0) goto L_0x0063
                int r14 = r14.length()
                if (r14 != 0) goto L_0x0061
                goto L_0x0063
            L_0x0061:
                r14 = 0
                goto L_0x0064
            L_0x0063:
                r14 = 1
            L_0x0064:
                r4 = 0
                if (r14 != 0) goto L_0x00a4
                er1.f2 r14 = er1.C58719f2.f168110a
                java.lang.String r5 = r13.f171623f
                te3.ci1 r14 = r14.mo83633f(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "shareProduct productId cmp: "
                r5.append(r6)
                if (r14 == 0) goto L_0x007f
                java.lang.String r6 = r14.f182502n
                goto L_0x0080
            L_0x007f:
                r6 = r4
            L_0x0080:
                r5.append(r6)
                java.lang.String r6 = ", "
                r5.append(r6)
                java.lang.String r6 = r13.f171625h
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
                if (r14 == 0) goto L_0x0099
                java.lang.String r1 = r14.f182502n
                goto L_0x009a
            L_0x0099:
                r1 = r4
            L_0x009a:
                java.lang.String r5 = r13.f171625h
                boolean r1 = gy3.C87412m.m108589b(r1, r5)
                if (r1 == 0) goto L_0x00a5
                r4 = r14
                goto L_0x00a5
            L_0x00a4:
                r14 = r4
            L_0x00a5:
                if (r4 != 0) goto L_0x0118
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                er1.f2 r5 = er1.C58719f2.f168110a
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r6, r1)
                java.lang.String r1 = r13.f171624g
                if (r1 != 0) goto L_0x00b8
                r7 = r3
                goto L_0x00b9
            L_0x00b8:
                r7 = r1
            L_0x00b9:
                java.lang.String r1 = r13.f171625h
                long r8 = o40.C61926c.m72671P(r1)
                java.lang.String r1 = r13.f171626i
                if (r1 != 0) goto L_0x00c5
                r10 = r3
                goto L_0x00c6
            L_0x00c5:
                r10 = r1
            L_0x00c6:
                r13.f171621d = r14
                r13.f171622e = r2
                r11 = 1
                r12 = r13
                java.lang.Object r1 = r5.mo83637j(r6, r7, r8, r10, r11, r12)
                if (r1 != r0) goto L_0x00d3
                return r0
            L_0x00d3:
                r0 = r14
                r14 = r1
            L_0x00d5:
                te3.pp0 r14 = (te3.C50858pp0) r14
                if (r14 != 0) goto L_0x00dc
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x00dc:
                te3.fp1 r9 = r14.f139889d
                if (r9 != 0) goto L_0x00e3
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x00e3:
                java.lang.String r14 = r14.f139893h
                er1.f2 r4 = er1.C58719f2.f168110a
                java.lang.String r1 = r13.f171624g
                if (r1 != 0) goto L_0x00ed
                r5 = r3
                goto L_0x00ee
            L_0x00ed:
                r5 = r1
            L_0x00ee:
                r6 = 0
                te3.l40 r11 = r9.f183185p
                java.lang.String r8 = ""
                java.lang.String r10 = ""
                te3.ci1 r4 = r4.mo83632e(r5, r6, r8, r9, r10, r11)
                if (r0 == 0) goto L_0x0100
                java.lang.String r1 = r0.f182497f
                if (r1 != 0) goto L_0x0102
            L_0x0100:
                java.lang.String r1 = "0L"
            L_0x0102:
                r4.f182497f = r1
                if (r0 == 0) goto L_0x010a
                java.lang.String r1 = r0.f182498g
                if (r1 != 0) goto L_0x010b
            L_0x010a:
                r1 = r3
            L_0x010b:
                r4.f182498g = r1
                if (r0 == 0) goto L_0x0113
                java.lang.String r0 = r0.f182495d
                if (r0 != 0) goto L_0x0114
            L_0x0113:
                r0 = r3
            L_0x0114:
                r4.f182495d = r0
                r4.f182514z = r14
            L_0x0118:
                java.lang.String r14 = r13.f171626i
                if (r14 != 0) goto L_0x011d
                goto L_0x011e
            L_0x011d:
                r3 = r14
            L_0x011e:
                r4.f182512x = r3
                java.lang.Class<ht1.t1> r14 = ht1.C60200t1.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                java.lang.String r0 = "getService(IFinderCommon…atureService::class.java)"
                gy3.C87412m.m108593f(r14, r0)
                r5 = r14
                ht1.t1 r5 = (ht1.C60200t1) r5
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r14 = "getContext()"
                gy3.C87412m.m108593f(r6, r14)
                r8 = 0
                r9 = 4
                r10 = 0
                r7 = r4
                ht1.C60200t1.C60201a.m70372j(r5, r6, r7, r8, r9, r10)
                er1.f2 r14 = er1.C58719f2.f168110a
                r7 = 0
                r9 = 0
                r10 = 14
                r11 = 0
                r5 = r14
                r6 = r4
                java.lang.String r0 = er1.C58719f2.m68198d(r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r1 = "share_commodity"
                r14.mo83636i(r4, r1, r0)
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.C60127u0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C60106t() {
        super("PluginFinderLive");
    }

    public static final void vx0(C60106t tVar, FinderObject finderObject, Context context, String str, int i, int i2, int i3, String str2, C60216z4.C8821a aVar, C60216z4.C8821a aVar2) {
        C64273c21 c212;
        FinderObject finderObject2 = finderObject;
        int i4 = i2;
        int i5 = i3;
        C60216z4.C8821a aVar3 = aVar;
        C60216z4.C8821a aVar4 = aVar2;
        tVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("getOpenFinderLiveReplay errCode:");
        sb.append(i3);
        sb.append(" errType:");
        sb.append(i2);
        sb.append(" errMsg:");
        String str3 = str2;
        sb.append(str2);
        Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
        if (i4 == 0 && i5 == 0) {
            String str4 = null;
            boolean ah02 = ((C61397g) C86312j.m106911c(C61397g.class)).ah0(finderObject2 != null ? finderObject2.username : null, finderObject2 != null ? finderObject2.liveInfo : null);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("autoOpenFinderLiveReplay isReplayLive:");
            sb4.append(ah02);
            sb4.append(',');
            if (!(finderObject2 == null || (c212 = finderObject2.liveInfo) == null)) {
                str4 = C63947a.f181274a.mo88736v(c212);
            }
            sb4.append(str4);
            Log.m105924i("MicroMsg.FinderLiveFeatureService", sb4.toString());
            if (ah02) {
                C61926c.m72668M(new C60128u(tVar, finderObject, i, str, context));
                if (aVar3 != null) {
                    aVar3.mo6382a(0);
                }
            } else if (aVar4 != null) {
                aVar4.mo6382a(-1001);
            }
        } else if (aVar4 != null) {
            aVar4.mo6382a(-1002);
        }
    }

    public static final C91753f wx0(C60106t tVar) {
        tVar.getClass();
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76790Np();
    }

    public static final void xx0(TextView textView, float f, boolean z) {
        if (textView != null) {
            textView.setPaddingRelative(0, 0, z ? C76577a.m92150a(textView.getContext(), f) : 0, 0);
        }
    }

    /* renamed from: Aw */
    public void mo84986Aw(ImageView imageView, String str, float f, C32226l<? super Bitmap, C13598b0> lVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (imageView != null) {
            if (str == null || str.length() == 0) {
                if (lVar != null) {
                    lVar.invoke(null);
                }
                imageView.setVisibility(8);
                return;
            }
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            C8726v vVar = new C8726v(imageView, lVar);
            b.getClass();
            b.f291320d = vVar;
            b.mo85951a();
        } else if (lVar != null) {
            lVar.invoke(null);
        }
    }

    public final C33343g Ax0() {
        return (C33343g) ((C36570n) this.f171516p).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010e  */
    /* renamed from: BG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo84988BG(java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            er1.w0 r0 = er1.C58782w0.f168290a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dealShare, businessType:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", appid:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r3 = ", extInfo:"
            r1.append(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "Finder.FinderGameLiveUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.lang.String r1 = "appid or extInfo empty"
            r5 = -1
            if (r11 == 0) goto L_0x01b0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r6 != 0) goto L_0x01b0
            if (r9 == 0) goto L_0x01b0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r6 != 0) goto L_0x01b0
            if (r10 == 0) goto L_0x01b0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r6 == 0) goto L_0x0045
            goto L_0x01b0
        L_0x0045:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "checkAccount, isSameAccount:"
            r6.append(r7)
            r6.append(r12)
            java.lang.String r7 = ", businessType:"
            r6.append(r7)
            r6.append(r9)
            r6.append(r2)
            r6.append(r10)
            r6.append(r3)
            r6.append(r11)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.lang.String r2 = "liveEntryScene"
            r3 = 1
            r6 = 0
            if (r12 == 0) goto L_0x0074
            goto L_0x00da
        L_0x0074:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r7 != 0) goto L_0x00d7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r7 != 0) goto L_0x00d7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r7 == 0) goto L_0x0087
            goto L_0x00d7
        L_0x0087:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x00d5 }
            r1.<init>(r11)     // Catch:{ all -> 0x00d5 }
            int r1 = r1.getInt(r2)     // Catch:{ all -> 0x00d5 }
            java.util.List<java.lang.Integer> r5 = er1.C58782w0.f168291b     // Catch:{ all -> 0x00d5 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00d5 }
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00da
            if (r12 != 0) goto L_0x00da
            java.lang.String r12 = "checkAccount false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)     // Catch:{ all -> 0x00d5 }
            qo3.q r12 = new qo3.q     // Catch:{ all -> 0x00d5 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00d5 }
            r12.<init>(r1)     // Catch:{ all -> 0x00d5 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00d5 }
            r4 = 2131827481(0x7f111b19, float:1.9287876E38)
            java.lang.String r1 = r1.getString(r4)     // Catch:{ all -> 0x00d5 }
            r12.mo107595g(r1)     // Catch:{ all -> 0x00d5 }
            r12.mo107589a(r3)     // Catch:{ all -> 0x00d5 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00d5 }
            r4 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r1 = r1.getString(r4)     // Catch:{ all -> 0x00d5 }
            r12.mo107602n(r1)     // Catch:{ all -> 0x00d5 }
            er1.v0 r1 = er1.C58779v0.f168287a     // Catch:{ all -> 0x00d5 }
            r12.mo107600l(r1)     // Catch:{ all -> 0x00d5 }
            r12.mo107603o()     // Catch:{ all -> 0x00d5 }
            r12 = 0
            goto L_0x00db
        L_0x00d5:
            goto L_0x00da
        L_0x00d7:
            r0.mo83845d(r5, r1, r9, r10)
        L_0x00da:
            r12 = 1
        L_0x00db:
            if (r12 != 0) goto L_0x00df
            goto L_0x01b3
        L_0x00df:
            r12 = 2
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0103 }
            r1.<init>(r11)     // Catch:{ all -> 0x0103 }
            int r1 = r1.getInt(r2)     // Catch:{ all -> 0x0103 }
            zc1.b r4 = zc1.C66785b.f191882e     // Catch:{ all -> 0x0103 }
            r5 = 0
            bd1.b r4 = zc1.C66783a.C66784a.m78800c(r4, r6, r3, r5)     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x00fa
            boolean r4 = r4.mo75252n2()     // Catch:{ all -> 0x0103 }
            if (r4 != r3) goto L_0x00fa
            r4 = 1
            goto L_0x00fb
        L_0x00fa:
            r4 = 0
        L_0x00fb:
            if (r4 == 0) goto L_0x0104
            if (r1 == r3) goto L_0x0101
            if (r1 != r12) goto L_0x0104
        L_0x0101:
            r1 = 0
            goto L_0x0105
        L_0x0103:
        L_0x0104:
            r1 = 1
        L_0x0105:
            if (r1 != 0) goto L_0x010e
            er1.j4 r9 = er1.C58739j4.f168176a
            r9.mo83706e0()
            goto L_0x01b3
        L_0x010e:
            r4 = 19
            er1.C58777u0.f168284b = r4
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            te3.m44 r4 = new te3.m44
            r4.<init>()
            te3.pv3 r5 = new te3.pv3
            r5.<init>()
            r5.f184892d = r9
            r5.f184893e = r10
            r5.f184894f = r11
            r4.f184201e = r5
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x01b3 }
            r9.<init>(r11)     // Catch:{ all -> 0x01b3 }
            int r11 = r9.getInt(r2)     // Catch:{ all -> 0x01b3 }
            java.lang.String r2 = "liveObjectExportId"
            java.lang.String r5 = "KEY_PARAMS_DO_ACTION"
            switch(r11) {
                case 1: goto L_0x01ac;
                case 2: goto L_0x01a8;
                case 3: goto L_0x01a4;
                case 4: goto L_0x01a0;
                case 5: goto L_0x019c;
                case 6: goto L_0x0198;
                case 7: goto L_0x017c;
                case 8: goto L_0x0174;
                case 9: goto L_0x0158;
                case 10: goto L_0x013b;
                default: goto L_0x0139;
            }
        L_0x0139:
            goto L_0x01b3
        L_0x013b:
            java.lang.String r11 = r9.getString(r2)     // Catch:{ all -> 0x01b3 }
            if (r11 == 0) goto L_0x0149
            int r11 = r11.length()     // Catch:{ all -> 0x01b3 }
            if (r11 != 0) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r3 = 0
        L_0x0149:
            r11 = 6
            if (r3 != 0) goto L_0x0151
            r0.mo83851j(r11, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x0151:
            r1.putExtra(r5, r11)     // Catch:{ all -> 0x01b3 }
            r0.mo83852k(r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x0158:
            java.lang.String r11 = r9.getString(r2)     // Catch:{ all -> 0x01b3 }
            if (r11 == 0) goto L_0x0166
            int r11 = r11.length()     // Catch:{ all -> 0x01b3 }
            if (r11 != 0) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            r3 = 0
        L_0x0166:
            r11 = 5
            if (r3 != 0) goto L_0x016d
            r0.mo83851j(r11, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x016d:
            r1.putExtra(r5, r11)     // Catch:{ all -> 0x01b3 }
            r0.mo83852k(r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x0174:
            r11 = 4
            r1.putExtra(r5, r11)     // Catch:{ all -> 0x01b3 }
            r0.mo83852k(r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x017c:
            java.lang.String r11 = r9.getString(r2)     // Catch:{ all -> 0x01b3 }
            if (r11 == 0) goto L_0x018a
            int r11 = r11.length()     // Catch:{ all -> 0x01b3 }
            if (r11 != 0) goto L_0x0189
            goto L_0x018a
        L_0x0189:
            r3 = 0
        L_0x018a:
            r11 = 3
            if (r3 != 0) goto L_0x0191
            r0.mo83851j(r11, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x0191:
            r1.putExtra(r5, r11)     // Catch:{ all -> 0x01b3 }
            r0.mo83852k(r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x0198:
            r0.mo83851j(r6, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x019c:
            r0.mo83851j(r12, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x01a0:
            r0.mo83851j(r6, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x01a4:
            r0.mo83851j(r3, r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x01a8:
            r0.mo83850i(r9, r1, r4, r10)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x01ac:
            r0.mo83852k(r9, r10, r1)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b3
        L_0x01b0:
            r0.mo83845d(r5, r1, r9, r10)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo84988BG(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: BR */
    public void mo84989BR(String str) {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            aVar.mo85679W().callExperimentalAPI(str);
        }
    }

    public void Bs0(int i, int i2, boolean z) {
        FinderLiveService.f159376d.getClass();
        C60971a aVar = C60971a.C60973b.f173670a;
        aVar.mo85947d().f174728x = i;
        aVar.mo85947d().f174729y = i2;
        aVar.mo85947d().f174721q = z;
        C60735a aVar2 = FinderLiveService.f159378f;
        if (aVar2 != null) {
            aVar2.mo85673A0();
        }
    }

    public final C33344j Bx0() {
        return (C33344j) ((C36570n) this.f171519s).getValue();
    }

    /* renamed from: Cx */
    public void mo84992Cx() {
        FinderLiveService.m63768J(FinderLiveService.f159376d, false, (C32224a) null, 3, (Object) null);
    }

    public final C32895i Cx0() {
        return (C33354n) this.f171522v.getValue();
    }

    public void Dc0(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "jo");
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.GameLive_PLAY_GAME_SETTING, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public void Di0(int i) {
        C61926c.m72668M(new C8716g(this, i));
    }

    /* renamed from: Dk */
    public String mo84996Dk(long j) {
        String str = this.f171509A.get(Long.valueOf(j));
        return str == null ? "" : str;
    }

    /* renamed from: Dr */
    public void mo84997Dr(boolean z) {
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null) {
            oVar.f154350p0 = z;
        }
    }

    public final String Dx0(C13605o<Integer, Long, ? extends C51713vn0> oVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        C64337e61 e612 = null;
        sb.append(oVar != null ? (Integer) oVar.f38557d : null);
        sb.append(' ');
        sb.append(oVar != null ? (Long) oVar.f38558e : null);
        sb.append(' ');
        C63947a aVar = C63947a.f181274a;
        C51713vn0 vn02 = oVar != null ? (C51713vn0) oVar.f38559f : null;
        if (vn02 == null) {
            str = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("liveId:");
            C64273c21 c212 = vn02.f143572d;
            sb4.append(C61926c.m72691p(c212 != null ? c212.f182392d : 0));
            sb4.append(" refreshInterval:");
            sb4.append(vn02.f143574f);
            sb4.append(" replay_status:");
            C64273c21 c213 = vn02.f143572d;
            sb4.append(c213 != null ? Integer.valueOf(c213.f182366L) : null);
            sb4.append(' ');
            C64273c21 c214 = vn02.f143572d;
            if (c214 != null) {
                e612 = c214.f182363I;
            }
            sb4.append(aVar.mo88725k(e612));
            str = sb4.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ES */
    public void mo84999ES(C60216z4.C8821a<List<C50073k31>> aVar) {
        C13598b0 b0Var;
        C87412m.m108594g(aVar, "callback");
        FinderLiveService.f159376d.getClass();
        C54806r1 r1Var = FinderLiveService.f159382j;
        C54795n5 n5Var = FinderLiveService.f159396y;
        C45795b bVar = FinderLiveService.f159348A;
        r1Var.getClass();
        if (n5Var == null || bVar == null) {
            b0Var = null;
        } else {
            n5Var.mo75756x(1, new C0557k1(aVar, bVar));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            aVar.mo6382a(C64186f0.f181907d);
        }
    }

    public void Ej0(View view, boolean z, int i) {
        String string = z ? i == 3 ? MMApplicationContext.getContext().getResources().getString(C0966R.string.fow) : MMApplicationContext.getContext().getResources().getString(C0966R.string.dkt) : i != 2 ? (i == 4 || i == 6) ? MMApplicationContext.getContext().getResources().getString(C0966R.string.dj6) : MMApplicationContext.getContext().getResources().getString(C0966R.string.dj8) : MMApplicationContext.getContext().getResources().getString(C0966R.string.f360544dj1);
        C87412m.m108593f(string, "if (end) {\n            w…}\n            }\n        }");
        if (view instanceof FinderLiveOnliveWidget) {
            ((FinderLiveOnliveWidget) view).setText(string);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(string);
        }
    }

    public final boolean Ex0(C13605o<Integer, Long, ? extends C51713vn0> oVar, long j) {
        boolean z = System.currentTimeMillis() - (oVar != null ? ((Number) oVar.f38558e).longValue() : 0) < j;
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "isLiveInfoOnTime:" + z + " status:" + Dx0(oVar) + ",refreshDuration:" + j + ",thread:" + Thread.currentThread());
        return z;
    }

    /* renamed from: F */
    public boolean mo85002F() {
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        return bVar != null && ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d != 0 && !((C54991o) bVar.mo71262a(C54991o.class)).mo75997d4() && FinderLiveService.f159380h;
    }

    public void F40(String str) {
        C32444a aVar = C32444a.f86121a;
        if (C32444a.f86108V1.mo60266n().intValue() == 1) {
            this.f171513j = str;
        } else {
            this.f171513j = null;
        }
    }

    /* renamed from: Ft */
    public void mo85004Ft() {
        C62042e.f176370a.getClass();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_LIVE_NEW_REDDOT_FLAG_INT_SYNC;
        boolean z = false;
        if (i.mo119689j(aVar, 0) == 1) {
            z = true;
        }
        if (!z && C32444a.f86121a.mo58620a()) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0();
            C51978xi1 xi12 = new C51978xi1();
            xi12.f144673h = String.valueOf(C31543z5.m39453c());
            xi12.f144669d = 50000;
            xi12.f144670e = 1010;
            C64586nn1 nn12 = new C64586nn1();
            nn12.f184502d = 1;
            nn12.f184506h = 1;
            nn12.f184507i = "FinderEntrance";
            xi12.f144672g.add(nn12);
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184502d = 1;
            nn13.f184506h = 1;
            nn13.f184507i = "TLPersonalCenter";
            xi12.f144672g.add(nn13);
            C64586nn1 nn14 = new C64586nn1();
            nn14.f184502d = 1;
            nn14.f184506h = 1;
            nn14.f184507i = "FinderSelfLiveEntrance";
            xi12.f144672g.add(nn14);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            ((C64916p1) c).Ck0(xi12, "checkInsertLiveNewReddot", new HashSet(), true, (C13604l<C55718s0, ? extends C64586nn1>) null, (C32226l<? super C55718s0, C13598b0>) null);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
        }
    }

    /* renamed from: G0 */
    public boolean mo85005G0(C64623p81 p812) {
        C87412m.m108594g(p812, "shareObject");
        return ((C61397g) C86312j.m106911c(C61397g.class)).mo83476G0(p812);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r3 = r13.f182388Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0131, code lost:
        if (r7.f184908j == 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f6, code lost:
        if (r4 == false) goto L_0x01f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00a9 A[EDGE_INSN: B:94:0x00a9->B:36:0x00a9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Gi0(te3.C64273c21 r13, te3.C64733to r14) {
        /*
            r12 = this;
            java.lang.String r0 = "transitionInfo"
            gy3.C87412m.m108594g(r14, r0)
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            bl3.r$a r0 = r0.mo62446e(r1)
            java.lang.Class<bp1.f> r1 = bp1.C54524f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            bp1.f r0 = (bp1.C54524f) r0
            r0.getClass()
            vo1.i0 r1 = vo1.C65799i0.f189246a
            r2 = 0
            if (r13 == 0) goto L_0x0025
            te3.e71 r3 = r13.f182388Z
            if (r3 == 0) goto L_0x0025
            te3.f71 r3 = r3.f182933i
            goto L_0x0026
        L_0x0025:
            r3 = r2
        L_0x0026:
            java.lang.String r1 = r1.mo89849d(r3, r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startPreloadTask cur task:"
            r3.append(r4)
            java.lang.String r4 = r0.mo75387e3()
            r3.append(r4)
            java.lang.String r4 = ",replayTransitionId:"
            r3.append(r4)
            r3.append(r1)
            r4 = 44
            r3.append(r4)
            sk1.a r5 = sk1.C63947a.f181274a
            if (r13 == 0) goto L_0x0050
            te3.e71 r6 = r13.f182388Z
            goto L_0x0051
        L_0x0050:
            r6 = r2
        L_0x0051:
            java.lang.String r5 = r5.mo88726l(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "LiveReplayTransitionPreloadSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            r3 = 0
            r6 = 1
            if (r13 == 0) goto L_0x00ac
            te3.e71 r13 = r13.f182388Z
            if (r13 == 0) goto L_0x00ac
            te3.g71 r13 = r13.f182934j
            if (r13 == 0) goto L_0x00ac
            java.util.LinkedList<te3.pw0> r13 = r13.f183281d
            if (r13 == 0) goto L_0x00ac
            java.util.Iterator r13 = r13.iterator()
        L_0x0075:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r13.next()
            r8 = r7
            te3.pw0 r8 = (te3.C64639pw0) r8
            int r9 = r8.f184902d
            int r10 = r14.f185627j
            if (r9 != r10) goto L_0x00a4
            java.lang.String r9 = r8.f184910o
            if (r9 == 0) goto L_0x0095
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r9 = 0
            goto L_0x0096
        L_0x0095:
            r9 = 1
        L_0x0096:
            if (r9 != 0) goto L_0x00a4
            java.lang.String r8 = r8.f184910o
            java.lang.String r9 = r14.f185624g
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x00a4
            r8 = 1
            goto L_0x00a5
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            if (r8 == 0) goto L_0x0075
            goto L_0x00a9
        L_0x00a8:
            r7 = r2
        L_0x00a9:
            te3.pw0 r7 = (te3.C64639pw0) r7
            goto L_0x00ad
        L_0x00ac:
            r7 = r2
        L_0x00ad:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r8 = "preload params is:"
            r13.append(r8)
            if (r7 == 0) goto L_0x00c0
            float r8 = r7.f184903e
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto L_0x00c1
        L_0x00c0:
            r8 = r2
        L_0x00c1:
            r13.append(r8)
            r13.append(r4)
            if (r7 == 0) goto L_0x00d0
            int r8 = r7.f184904f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00d1
        L_0x00d0:
            r8 = r2
        L_0x00d1:
            r13.append(r8)
            r13.append(r4)
            if (r7 == 0) goto L_0x00e0
            float r8 = r7.f184906h
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto L_0x00e1
        L_0x00e0:
            r8 = r2
        L_0x00e1:
            r13.append(r8)
            r13.append(r4)
            if (r7 == 0) goto L_0x00f0
            int r8 = r7.f184907i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00f1
        L_0x00f0:
            r8 = r2
        L_0x00f1:
            r13.append(r8)
            r13.append(r4)
            if (r7 == 0) goto L_0x00ff
            int r2 = r7.f184908j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00ff:
            r13.append(r2)
            r2 = 33
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            if (r7 == 0) goto L_0x0135
            float r13 = r7.f184903e
            r4 = 0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x0119
            r13 = 1
            goto L_0x011a
        L_0x0119:
            r13 = 0
        L_0x011a:
            if (r13 == 0) goto L_0x0133
            int r13 = r7.f184904f
            if (r13 != 0) goto L_0x0133
            float r13 = r7.f184906h
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x0128
            r13 = 1
            goto L_0x0129
        L_0x0128:
            r13 = 0
        L_0x0129:
            if (r13 == 0) goto L_0x0133
            int r13 = r7.f184907i
            if (r13 != 0) goto L_0x0133
            int r13 = r7.f184908j
            if (r13 == 0) goto L_0x0135
        L_0x0133:
            r13 = 1
            goto L_0x0136
        L_0x0135:
            r13 = 0
        L_0x0136:
            if (r13 != 0) goto L_0x0140
            java.lang.String r13 = "startPreloadTask but preloadInfo invalid!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r13)
            goto L_0x0202
        L_0x0140:
            java.lang.String r13 = r0.f152874d
            boolean r13 = gy3.C87412m.m108589b(r1, r13)
            if (r13 != 0) goto L_0x0154
            r13 = 2
            r0.mo75385c3(r13)
            gy3.C87412m.m108591d(r7)
            r0.mo75386d3(r1, r14, r7)
            goto L_0x0202
        L_0x0154:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "startPreloadTask but task:"
            r13.append(r4)
            java.lang.String r4 = r0.f152874d
            r13.append(r4)
            java.lang.String r4 = " have preload!"
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            gy3.C87412m.m108591d(r7)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "needToUpdatePreloadTask mediaId:"
            r13.append(r4)
            r13.append(r1)
            java.lang.String r4 = ", preloadId:"
            r13.append(r4)
            int r4 = r0.f152875e
            r13.append(r4)
            java.lang.String r4 = ", lastWorkExcuteTime:"
            r13.append(r4)
            long r8 = r0.f152877g
            r13.append(r8)
            java.lang.String r4 = ",cur:"
            r13.append(r4)
            long r8 = r7.f184909n
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            int r13 = r0.f152875e
            if (r13 != 0) goto L_0x01b7
            long r8 = r0.f152877g
            r13 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r13
            long r8 = r8 - r10
            long r10 = r7.f184909n
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x01b7
            r13 = 1
            goto L_0x01b8
        L_0x01b7:
            r13 = 0
        L_0x01b8:
            if (r13 == 0) goto L_0x01bb
            goto L_0x01f8
        L_0x01bb:
            er1.j5 r13 = er1.C58741j5.f168184a
            java.lang.String r13 = "id"
            gy3.C87412m.m108594g(r1, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = er1.C58741j5.f168187d
            r13.append(r4)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "needToUpdatePreloadTask filePath:"
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = " exist:"
            r8.append(r13)
            r8.append(r4)
            r8.append(r2)
            java.lang.String r13 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            if (r4 != 0) goto L_0x01f9
        L_0x01f8:
            r3 = 1
        L_0x01f9:
            if (r3 == 0) goto L_0x0202
            r13 = 3
            r0.mo75385c3(r13)
            r0.mo75386d3(r1, r14, r7)
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.Gi0(te3.c21, te3.to):void");
    }

    /* renamed from: Gk */
    public void mo85007Gk(long j, byte[] bArr, long j2, int i, String str, String str2, String str3, int i2, C49712hj1 hj12, int i3, C52153yq0 yq02, String str4, String str5, int i4, String str6, C64414h71 h712, long j3, int i5, String str7, C89349b bVar, int i6, String str8, C32226l<? super C89132b.C89134c<C52005xq0>, C13598b0> lVar) {
        C58284o oVar;
        C87412m.m108594g(str3, "shareUserName");
        C87412m.m108594g(str7, "sourceUrl");
        C87412m.m108594g(str8, "legacyCommentScene");
        C58284o oVar2 = r1;
        C58284o oVar3 = new C58284o(j, bArr, C66785b.f191882e.mo90662O5(), j2, i, str, str2, str3, i2, hj12, i3, yq02, str4, str5, i4, str6, h712, j3, i5, str7, bVar);
        C49842ig0 ig02 = oVar2.f166895v.f186166d;
        if (ig02 != null) {
            ig02.f135313e = i6;
        }
        if (str8.length() > 0) {
            C64811wq0 wq02 = oVar2.f166895v;
            if (wq02.f186184y == null) {
                wq02.f186184y = new C64414h71();
            }
            C64414h71 h713 = oVar2.f166895v.f186184y;
            if (h713 != null) {
                oVar = oVar2;
                h713.f183443z = str8;
                oVar.mo9225i().mo123420E(new C60118f0(lVar));
            }
        }
        oVar = oVar2;
        oVar.mo9225i().mo123420E(new C60118f0(lVar));
    }

    /* renamed from: I1 */
    public boolean mo85008I1(C64273c21 c212) {
        return (c212 != null && c212.f182394f == 1) && Sj0(c212);
    }

    /* renamed from: IS */
    public boolean mo85009IS() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86191r1.mo60266n().intValue() == 1;
    }

    /* renamed from: J */
    public int mo85010J() {
        return C58739j4.f168176a.mo83673A();
    }

    public boolean J10() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86199t1.mo60266n().intValue() == 1;
    }

    /* renamed from: JC */
    public void mo85012JC(String str, String str2, int i, C32228q<? super String, ? super String, ? super Integer, C13598b0> qVar) {
        C32228q<? super String, ? super String, ? super Integer, C13598b0> qVar2 = qVar;
        C87412m.m108594g(qVar2, "callback");
        C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
        String str3 = str == null ? "" : str;
        C87412m.m108593f(p1Var, "getService(IFinderCommon…atureService::class.java)");
        C64916p1.C64917a.m76435b(p1Var, 0, str2, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str3, (C49712hj1) null, 0, 20416, (Object) null).mo9225i().mo123420E(new C33006a0(qVar2));
    }

    public void Ja0(Context context, String str, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "jsonStr");
        C87412m.m108594g(aVar, "didOpenCallback");
        C87412m.m108594g(aVar2, "failCallback");
        Intent intent = new Intent();
        C60216z4.C8821a<Integer> aVar3 = C10064z3.f30828a;
        C10064z3.f30828a = new C8721r0(aVar);
        C10064z3.f30829b = new C8722s0(aVar2);
        intent.addFlags(268435456);
        intent.putExtra("finder_jump_data", str);
        intent.putExtra("finder_jump_type", 1);
        intent.putExtra("is_from_app_brand", z);
        intent.setClass(context, FinderH5JumpEmptyUI.class);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(intent);
        C117292a.m165358d(context, aVar4.mo10232b(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "reserveChannelsConcert", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar4.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "reserveChannelsConcert", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        cy3.C58003b.m67160a(r5, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01cc  */
    /* renamed from: KM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85014KM(java.util.LinkedList<te3.C64257bc1> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "list"
            gy3.C87412m.m108594g(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x000e:
            boolean r1 = r13.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r13.next()
            r3 = r1
            te3.bc1 r3 = (te3.C64257bc1) r3
            te3.ne1 r3 = r3.f182272s
            r4 = 1
            if (r3 == 0) goto L_0x0026
            int r3 = r3.f184474o
            if (r3 != r4) goto L_0x0026
            r2 = 1
        L_0x0026:
            if (r2 == 0) goto L_0x000e
            r0.add(r1)
            goto L_0x000e
        L_0x002c:
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>(r0)
            rx3.g r0 = r12.f171524x
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            ik1.i r0 = (ik1.C60333i) r0
            r0.getClass()
            java.util.Iterator r1 = r13.iterator()
            r3 = 0
        L_0x0043:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01e5
            java.lang.Object r4 = r1.next()
            te3.bc1 r4 = (te3.C64257bc1) r4
            long r5 = r4.f182266j
            java.lang.String r7 = r0.f171981d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getMention by id "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = p749xh.C66274t3.f190671z1
            java.lang.String r8 = "SELECT rowid, * FROM FinderLiveMentionMsg"
            r7.append(r8)
            java.lang.String r8 = " WHERE id = "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = r0.f171981d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "get mention sql "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            java.lang.String[] r6 = new java.lang.String[r2]
            android.database.Cursor r5 = r0.rawQuery(r5, r6)
            r6 = 0
            if (r5 == 0) goto L_0x00bd
            boolean r7 = r5.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r7 == 0) goto L_0x00b0
            xh.va r7 = new xh.va     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            r7.convertFrom(r5)     // Catch:{ all -> 0x00b6 }
            cy3.C58003b.m67160a(r5, r6)
            goto L_0x00be
        L_0x00b0:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b6 }
            cy3.C58003b.m67160a(r5, r6)
            goto L_0x00bd
        L_0x00b6:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            cy3.C58003b.m67160a(r5, r13)
            throw r0
        L_0x00bd:
            r7 = r6
        L_0x00be:
            if (r7 == 0) goto L_0x00c5
            long r8 = r7.systemRowid
            r0.delete(r8)
        L_0x00c5:
            xh.va r5 = new xh.va
            r5.<init>()
            java.lang.String r8 = r4.f182260d
            r5.field_headUrl = r8
            int r8 = r4.f182247D
            if (r8 == 0) goto L_0x00e2
            te3.dc1 r8 = new te3.dc1
            r8.<init>()
            int r9 = r4.f182247D
            r8.f182697e = r9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> r9 = r4.f182246C
            r8.f182696d = r9
            r5.field_aggregatedContacts = r8
            goto L_0x00e9
        L_0x00e2:
            te3.dc1 r8 = new te3.dc1
            r8.<init>()
            r5.field_aggregatedContacts = r8
        L_0x00e9:
            zc1.b r8 = zc1.C66785b.f191882e
            java.lang.String r8 = r8.mo90662O5()
            r5.field_finderUserName = r8
            java.lang.String r8 = r4.f182261e
            r5.field_nickname = r8
            int r8 = r4.f182262f
            r5.field_type = r8
            java.lang.String r8 = r4.f182263g
            r5.field_content = r8
            int r8 = r4.f182264h
            r5.field_createTime = r8
            java.lang.String r8 = r4.f182265i
            r5.field_thumbUrl = r8
            long r8 = r4.f182266j
            r5.field_id = r8
            long r8 = r4.f182267n
            r5.field_objectId = r8
            java.lang.String r8 = r4.f182277x
            r5.field_objectNonceId = r8
            long r8 = r4.f182268o
            r5.field_commentId = r8
            int r8 = r4.f182269p
            r5.field_flag = r8
            java.lang.String r8 = r4.f182271r
            r5.field_refContent = r8
            int r8 = r4.f182270q
            r5.field_extFlag = r8
            te3.ne1 r8 = r4.f182272s
            r5.field_notify = r8
            int r8 = r4.f182273t
            r5.field_mediaType = r8
            java.lang.String r8 = r4.f182274u
            r5.field_description = r8
            java.lang.String r8 = r4.f182276w
            r5.field_replayUsername = r8
            java.lang.String r8 = r4.f182275v
            r5.field_replayNickname = r8
            java.lang.String r8 = r4.f182278y
            r5.field_username = r8
            te3.ec1 r8 = r4.f182279z
            if (r8 == 0) goto L_0x0140
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f132859d
            goto L_0x0141
        L_0x0140:
            r8 = r6
        L_0x0141:
            r5.field_contact = r8
            te3.ec1 r8 = r4.f182244A
            if (r8 == 0) goto L_0x0149
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r8.f132859d
        L_0x0149:
            r5.field_replyContact = r6
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_USER_AUTO_INCREMENT_ID_INT_SYNC
            int r6 = r6.mo119689j(r8, r2)
            r5.field_userVersion = r6
            int r6 = r4.f182248E
            long r8 = (long) r6
            r5.field_followExpireTime = r8
            java.lang.String r6 = r4.f182249F
            r5.field_clientMsgId = r6
            long r8 = r4.f182250G
            r5.field_followId = r8
            int r6 = r4.f182251H
            long r8 = (long) r6
            r5.field_objectType = r8
            long r8 = r4.f182252I
            r5.field_refVideoObjectId = r8
            java.lang.String r6 = r4.f182253J
            r5.field_refVideoObjectNonceId = r6
            te3.qn2 r6 = r4.f182254K
            r8 = 0
            if (r6 == 0) goto L_0x017e
            long r10 = r6.f140412e
            goto L_0x017f
        L_0x017e:
            r10 = r8
        L_0x017f:
            r5.field_likeId = r10
            te3.ec1 r10 = r4.f182279z
            if (r10 == 0) goto L_0x0187
            long r8 = r10.f132861f
        L_0x0187:
            r5.field_fansId = r8
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r4.f182255L
            r5.field_authorContact = r8
            if (r6 == 0) goto L_0x0192
            int r6 = r6.f140411d
            goto L_0x0193
        L_0x0192:
            r6 = 0
        L_0x0193:
            r5.field_likeType = r6
            te3.xh0 r6 = r4.f182256M
            r5.field_commentMentionedUser = r6
            if (r10 == 0) goto L_0x019e
            int r6 = r10.f132862g
            goto L_0x019f
        L_0x019e:
            r6 = 0
        L_0x019f:
            r5.field_relationType = r6
            te3.gc1 r6 = r4.f182257N
            r5.field_extInfo = r6
            long r8 = r4.f182258P
            r5.field_svrMentionId = r8
            int r6 = r4.f182259Q
            r5.field_followFlag = r6
            boolean r5 = r0.insert(r5)
            java.lang.String r6 = r0.f171981d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "replace mention success "
            r8.append(r9)
            long r9 = r4.f182266j
            r8.append(r9)
            java.lang.String r4 = ", "
            r8.append(r4)
            if (r7 != 0) goto L_0x01cc
            java.lang.String r7 = "null"
            goto L_0x01d2
        L_0x01cc:
            long r9 = r7.systemRowid
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
        L_0x01d2:
            r8.append(r7)
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            int r3 = r3 + r5
            goto L_0x0043
        L_0x01e5:
            java.lang.String r0 = r0.f171981d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[insertMentionList] inputListSize = "
            r1.append(r2)
            int r13 = r13.size()
            r1.append(r13)
            java.lang.String r13 = ", succCnt = "
            r1.append(r13)
            r1.append(r3)
            java.lang.String r13 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo85014KM(java.util.LinkedList):void");
    }

    public void Kb0(JSONObject jSONObject, C60606n.C46282d dVar) {
        C64273c21 c212;
        C87412m.m108594g(jSONObject, "jo");
        C87412m.m108594g(dVar, "ck");
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        Class cls = C55001u.class;
        Log.m105924i("Finder.FinderLiveService", "startPayGameAnchorSetting");
        C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
        long j = uVar != null ? uVar.f154416j : 0;
        C55001u uVar2 = (C55001u) finderLiveService.mo77630e(cls);
        long j2 = (uVar2 == null || (c212 = uVar2.f154420q) == null) ? 0 : c212.f182392d;
        C55001u uVar3 = (C55001u) finderLiveService.mo77630e(cls);
        new C45372k(j, j2, C89349b.m111674a(uVar3 != null ? uVar3.f154417n : null), jSONObject, (C49712hj1) null, dVar).mo9225i();
    }

    public void Kc0(long j, boolean z, C9487b<C9486a> bVar, C60606n.C60609c cVar, int i, String str, C50429mo2 mo22) {
        String str2 = str;
        C87412m.m108594g(str2, "exportId");
        this.f171512i.post(new C60107b0(this, j, z, i, str2, mo22, bVar, cVar));
    }

    /* renamed from: L5 */
    public boolean mo85017L5() {
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        return bVar != null && ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d != 0 && !((C54991o) bVar.mo71262a(C54991o.class)).mo75997d4() && !FinderLiveService.f159380h;
    }

    public void Lm0(String str, String str2, Context context, C32229r<? super Integer, ? super Integer, ? super String, ? super C50397mg0, C13598b0> rVar) {
        String str3 = str;
        String str4 = str2;
        Context context2 = context;
        C32229r<? super Integer, ? super Integer, ? super String, ? super C50397mg0, C13598b0> rVar2 = rVar;
        C87412m.m108594g(str3, "encryptedId");
        C87412m.m108594g(str4, "nonceId");
        C87412m.m108594g(rVar2, "callback");
        ArrayList<C13604l> arrayList = new ArrayList<>();
        arrayList.add(new C13604l(str3, str4));
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C13604l lVar : arrayList) {
            C64800wf1 wf12 = new C64800wf1();
            wf12.f186085h = (String) lVar.f38555d;
            wf12.f186082e = (String) lVar.f38556e;
            arrayList2.add(wf12);
        }
        C89059e i = new C60803l(arrayList2, 3, 0, 0, (String) null, (String) null, (C64650q60) null, 0, 240, (C8480h) null).mo9225i();
        i.mo123420E(new C8718m0(str3, str4, rVar2));
        if (context2 != null && (context2 instanceof MMActivity)) {
            i.mo11397F((C9487b) context2);
        }
    }

    /* renamed from: Lu */
    public void mo85019Lu(int i) {
        FinderLiveService.f159376d.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (liveRoomControllerStore != null) {
            C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59906n(liveRoomControllerStore, i));
        }
    }

    /* renamed from: MO */
    public void mo85020MO(Context context, String str, C64855yf1 yf12, C64700s53 s532) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(s532, "reportData");
        if (!(str == null || str.length() == 0)) {
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "gotoLive anchorUsername:" + str);
            ((C13887q1) C86312j.m106911c(C13887q1.class)).k60(str == null ? "" : str, new C60115e0(str, context, yf12)).mo9225i();
            return;
        }
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "[LiveLogoAssistant]click live icon but username is empty!");
    }

    /* renamed from: OV */
    public void mo85021OV(int i) {
        ((C54524f) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C54524f.class)).mo75385c3(1);
    }

    /* renamed from: Oh */
    public List<C50516na1> mo85022Oh(long j) {
        return this.f171511h.get(Long.valueOf(j));
    }

    /* renamed from: Pn */
    public void mo85023Pn(JSONObject jSONObject, String str, Context context, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Integer> aVar2) {
        JSONObject jSONObject2 = jSONObject;
        C60216z4.C8821a<Integer> aVar3 = aVar2;
        C87412m.m108594g(jSONObject2, "extInfo");
        C87412m.m108594g(context, "context");
        String optString = jSONObject2.optString("finderUserName");
        String str2 = optString == null ? "" : optString;
        int optInt = jSONObject2.optInt("commentScene");
        String optString2 = jSONObject2.optString("reportExtraInfo", "");
        String optString3 = jSONObject2.optString("feedID", "");
        String optString4 = jSONObject2.optString("exportId", "");
        String optString5 = jSONObject2.optString("nonceID", "");
        boolean z = false;
        boolean optBoolean = jSONObject2.optBoolean("enableReplay", false);
        C87412m.m108593f(optString2, TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
        ((C61568m) C86312j.m106911c(C61568m.class)).mo74891sS(optString2);
        C64208c.f181951a.mo89032g(optString2, str2);
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive anchorUsername:" + str2 + ",feedID:" + optString3 + ",commentScene:" + optInt + ",enableReplay:" + optBoolean + ",exportId:" + optString4);
        if (optBoolean) {
            if (!(optString4 == null || optString4.length() == 0)) {
                C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(p1Var, "getService(IFinderCommon…atureService::class.java)");
                C87412m.m108593f(optString4, "exportId");
                C64916p1.C64917a.m76435b(p1Var, 0, optString5, 65, 2, str2, true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, optString4, (C49712hj1) null, 0, 20416, (Object) null).mo9225i().mo123420E(new C60110c(this, context, optString2, optInt, aVar, aVar2));
                return;
            }
            String str3 = optString2;
            int i = optInt;
            if (str2.length() == 0) {
                z = true;
            }
            if (!z) {
                new C45366h0(str2, new C60112d(this, context, str3, i, aVar, aVar2)).mo9225i();
            } else if (aVar3 != null) {
                aVar3.mo6382a(-1000);
            }
        } else if (!Util.isNullOrNil(str2)) {
            new C45366h0(str2, new C60113e(optString3, optString5, this, context, jSONObject, str, aVar)).mo9225i();
        } else {
            Log.m105928w("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive anchorUsername empty");
            if (aVar3 != null) {
                aVar3.mo6382a(-1000);
            }
        }
    }

    public boolean Q30() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86187q1.mo60266n().intValue() == 1;
    }

    /* renamed from: Qf */
    public boolean mo85025Qf(String str) {
        C47272h hVar = C47272h.f126894a;
        return hVar.mo72302g(str) || hVar.mo72303h(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r2 = r2.f154420q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Qk0() {
        /*
            r4 = this;
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r0.f9173d
            if (r1 != 0) goto L_0x000a
            goto L_0x0028
        L_0x000a:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo77630e(r3)
            cl1.u r2 = (cl1.C55001u) r2
            if (r2 == 0) goto L_0x0021
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0021
            long r2 = r2.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            long r2 = r2.longValue()
            r1.f9174a = r2
        L_0x0028:
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r0.f9173d
            if (r1 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            r2 = 14
            r1.f9175b = r2
        L_0x0031:
            r0.publish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.Qk0():void");
    }

    /* renamed from: Qo */
    public void mo85027Qo(Activity activity, C32224a<C13598b0> aVar, boolean z) {
        Activity activity2 = activity;
        C87412m.m108594g(activity2, "context");
        C32224a<C13598b0> aVar2 = aVar;
        C87412m.m108594g(aVar2, "finishCallback");
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "#goToAnchorLiveDirect");
        C53895h.m60466d(new C55908a((C0125s) activity2, "goToAnchorLiveDirect"), (C66212f) null, (C53934p0) null, new C8715d0(new C10906h((MMFragmentActivity) activity2, 0, 0, 6, (C8480h) null), activity2, z, aVar2, (C15601d<? super C8715d0>) null), 3, (Object) null);
    }

    public void Qv0(Context context, String str, int i, boolean z, String str2, String str3, int i2, long j) {
        WindowManager windowManager;
        Display defaultDisplay;
        C87412m.m108594g(str2, "developerCustomParam");
        C87412m.m108594g(str3, "reportInfo");
        if (context != null && str != null) {
            C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
            Intent intent = new Intent();
            intent.putExtra("APPID", str);
            intent.putExtra("VERSION_TYPE", i);
            intent.putExtra("IGNORE_CONTINUE_LIVE", z);
            intent.putExtra("WXA_DEVELOPER_CUSTOM_PARAM", str2);
            intent.putExtra("REPORT_INFO", str3);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i2);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", j);
            Integer num = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (!(activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                num = Integer.valueOf(defaultDisplay.getRotation());
            }
            if (num != null && num.intValue() == 1) {
                intent.putExtra("LANDSCAPE_TYPE", 1);
            } else if (num != null && num.intValue() == 3) {
                intent.putExtra("LANDSCAPE_TYPE", 2);
            } else {
                intent.putExtra("LANDSCAPE_TYPE", 0);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            o1Var.Jl0(context, intent);
        }
    }

    public void R70(Context context, String str, String str2, Integer num, List<String> list, List<String> list2) {
        ArrayList arrayList;
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        if (list != null) {
            arrayList = new ArrayList();
            for (T next : list) {
                String str3 = (String) next;
                if (!(str3 == null || str3.length() == 0)) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        C9252f fVar = new C9252f();
        fVar.f28999a = new WeakReference<>(context2);
        if (context2 instanceof Activity) {
            fVar.mo10030b();
        }
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1.C64917a.m76435b((C64916p1) c, 0, "", 65, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str == null ? "" : str, (C49712hj1) null, 0, 20416, (Object) null).mo9225i().mo123420E(new C60124s(fVar, num, this, context, arrayList2, str, str2));
    }

    /* renamed from: SV */
    public void mo85030SV(Context context, C49765hx0 hx02, boolean z, String str, C60216z4.C8821a<Object> aVar, C60216z4.C8821a<Object> aVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hx02, "liveContact");
        C87412m.m108594g(str, "fromUsername");
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        Activity activity = g != null ? g.get() : null;
        if (activity != null) {
            Intent intent = new Intent();
            intent.setClass(activity, FinderHalfJumpEmptyUI.class);
            intent.putExtra("isDarkMode", z);
            intent.putExtra("liveContact", hx02.toByteArray());
            intent.putExtra("fromUsername", str);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar3.mo10232b(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "openFinderLiveMemberProfileWidget", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;ZLjava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "openFinderLiveMemberProfileWidget", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/FinderLiveContact;ZLjava/lang/String;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;Lcom/tencent/mm/plugin/findersdk/api/IFinderUtilApi$Callback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: Sb */
    public void mo85031Sb(C60622a aVar) {
        if (aVar != null) {
            FinderLiveService.f159376d.getClass();
            C54806r1 r1Var = FinderLiveService.f159382j;
            r1Var.getClass();
            C61926c.m72668M(new C28582q1(r1Var, aVar));
        }
    }

    /* renamed from: Sc */
    public void mo85032Sc() {
        C54421g gVar;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null && (gVar = eVar.f176822Y0) != null) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "resumePlay");
            C58924d dVar = gVar.f152627a;
            if (dVar != null) {
                dVar.resume();
            }
        }
    }

    /* renamed from: Sh */
    public String mo85033Sh() {
        return this.f171513j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r3.f182363I;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Sj0(te3.C64273c21 r3) {
        /*
            r2 = this;
            int r0 = ks3.C61160f.f174109a
            r0 = 0
            if (r3 == 0) goto L_0x000c
            te3.e61 r3 = r3.f182363I
            if (r3 == 0) goto L_0x000c
            int r3 = r3.f182920d
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            r1 = 2
            if (r3 == r1) goto L_0x0018
            r1 = 8
            if (r3 == r1) goto L_0x0018
            r1 = 16
            if (r3 != r1) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.Sj0(te3.c21):boolean");
    }

    /* renamed from: Sm */
    public boolean mo85035Sm() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86195s1.mo60266n().intValue() == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r5 = (te3.C51713vn0) r0.f38559f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.C64273c21 T70(long r4) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, rx3.o<java.lang.Integer, java.lang.Long, te3.vn0>> r0 = r3.f171510g
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Object r0 = r0.get(r1)
            rx3.o r0 = (rx3.C13605o) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getCacheLiveInfo liveId:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ",liveInfo:"
            r1.append(r4)
            r4 = 0
            if (r0 == 0) goto L_0x002a
            C r5 = r0.f38559f
            te3.vn0 r5 = (te3.C51713vn0) r5
            if (r5 == 0) goto L_0x002a
            te3.c21 r5 = r5.f143572d
            goto L_0x002b
        L_0x002a:
            r5 = r4
        L_0x002b:
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "MicroMsg.FinderLiveFeatureService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            if (r0 == 0) goto L_0x0041
            C r5 = r0.f38559f
            te3.vn0 r5 = (te3.C51713vn0) r5
            if (r5 == 0) goto L_0x0041
            te3.c21 r4 = r5.f143572d
        L_0x0041:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.T70(long):te3.c21");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* renamed from: Tb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85037Tb(android.widget.TextView r8, android.widget.ImageView r9, ht1.C60151b r10, float r11) {
        /*
            r7 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            if (r9 == 0) goto L_0x00b2
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x001f
            te3.p81 r4 = r10.f171698b
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = r4.f184795x
            if (r4 == 0) goto L_0x001f
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != r2) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r4 == 0) goto L_0x005f
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62446e(r1)
            bl3.c r4 = r4.mo62447c(r0)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11872i2()
            pl1.n0 r5 = new pl1.n0
            te3.p81 r10 = r10.f171698b
            java.lang.String r10 = r10.f184795x
            up1.y r6 = up1.C27696y.THUMB_IMAGE
            r5.<init>(r10, r6)
            pl1.e0$a r10 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r1 = r6.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r10 = r0.mo11867O2(r10)
            l60.b r10 = r4.mo85956b(r5, r10)
            l60.a r10 = (l60.C99342a) r10
            r10.mo85954d(r9)
            r9.setVisibility(r3)
            xx0(r8, r11, r2)
            goto L_0x00b2
        L_0x005f:
            if (r10 == 0) goto L_0x006c
            te3.p81 r10 = r10.f171698b
            if (r10 == 0) goto L_0x006c
            int r10 = r10.f184796y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            if (r10 != 0) goto L_0x0070
            goto L_0x008b
        L_0x0070:
            int r0 = r10.intValue()
            if (r0 != r2) goto L_0x008b
            android.content.Context r10 = r9.getContext()
            r0 = 2131756166(0x7f100486, float:1.9143232E38)
            android.graphics.drawable.Drawable r10 = kg3.C76577a.m92158i(r10, r0)
            r9.setImageDrawable(r10)
            r9.setVisibility(r3)
            xx0(r8, r11, r2)
            goto L_0x00b2
        L_0x008b:
            r0 = 2
            if (r10 != 0) goto L_0x008f
            goto L_0x00aa
        L_0x008f:
            int r10 = r10.intValue()
            if (r10 != r0) goto L_0x00aa
            android.content.Context r10 = r9.getContext()
            r0 = 2131756165(0x7f100485, float:1.914323E38)
            android.graphics.drawable.Drawable r10 = kg3.C76577a.m92158i(r10, r0)
            r9.setImageDrawable(r10)
            r9.setVisibility(r3)
            xx0(r8, r11, r2)
            goto L_0x00b2
        L_0x00aa:
            r10 = 8
            r9.setVisibility(r10)
            xx0(r8, r11, r3)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo85037Tb(android.widget.TextView, android.widget.ImageView, ht1.b, float):void");
    }

    /* renamed from: Ti */
    public Object mo85038Ti(long j, int i, C15601d<? super C50602nw0> dVar) {
        C51713vn0 vn02;
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "requestLiveInfo liveId " + C61926c.m72691p(j) + ",scene:" + i);
        C64273c21 c212 = null;
        if (j == 0) {
            return null;
        }
        C13605o oVar = this.f171510g.get(new Long(j));
        if (!(oVar == null || (vn02 = (C51713vn0) oVar.f38559f) == null)) {
            c212 = vn02.f143572d;
        }
        if (c212 != null) {
            C50602nw0 nw02 = new C50602nw0();
            nw02.f138804d = ((Number) oVar.f38558e).longValue();
            nw02.f138805e = (C51713vn0) oVar.f38559f;
            return nw02;
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        C60606n.C60607a.m70857a((C60606n) c, j, true, (C9487b) null, new C33022q0(j, this, mVar), i, (String) null, (C50429mo2) null, 96, (Object) null);
        return mVar.mo74608o();
    }

    public List<ImageSpan> Tv0(View view, List<? extends C48770aw0> list, int[] iArr, int i, int i2) {
        C15484y yVar;
        C15483x xVar;
        List<? extends C48770aw0> list2 = list;
        C87412m.m108594g(list, "info");
        C87412m.m108594g(iArr, "spanFilter");
        C15440n nVar = C15440n.f41895a;
        C15483x[] xVarArr = C15483x.f41999e;
        C15483x[] xVarArr2 = C15483x.f41999e;
        int length = xVarArr2.length;
        int i3 = 0;
        while (true) {
            yVar = null;
            if (i3 >= length) {
                xVar = null;
                break;
            }
            xVar = xVarArr2[i3];
            if (xVar.f42005d == i) {
                break;
            }
            i3++;
        }
        C15483x xVar2 = xVar == null ? C15483x.MODE_LIGHT : xVar;
        C15484y[] yVarArr = C15484y.f42006e;
        C15484y[] yVarArr2 = C15484y.f42006e;
        int length2 = yVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            C15484y yVar2 = yVarArr2[i4];
            if (yVar2.f42010d == i2) {
                yVar = yVar2;
                break;
            }
            i4++;
        }
        return C15440n.m14441q(nVar, list, iArr, xVar2, yVar == null ? C15484y.SIZE_NORMAL : yVar, 0, view, (Map) null, 80, (Object) null);
    }

    /* renamed from: UB */
    public void mo85040UB(TextView textView, List<String> list, List<Float> list2, String str, int i, boolean z) {
        C87412m.m108594g(textView, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(str, "str");
        C61866i0.f175909a.getClass();
        if (list == null || list.isEmpty()) {
            textView.setText(str);
            return;
        }
        LinkedList linkedList = new LinkedList();
        if ((list2 != null ? list2.size() : 0) != 0) {
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str2 = (String) next;
                    float f = 1.0f;
                    float floatValue = list2 != null ? list2.get(i2).floatValue() : 1.0f;
                    if (!(floatValue == 0.0f)) {
                        f = floatValue;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((int) (((float) i) * f), i, Bitmap.Config.ARGB_8888);
                    createBitmap.eraseColor(textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_0_3));
                    C61866i0 i0Var = C61866i0.f175909a;
                    Context context = textView.getContext();
                    C87412m.m108593f(context, "text.context");
                    linkedList.add(i0Var.mo86792c(context, createBitmap, i));
                    if (z) {
                        linkedList.addLast(C15440n.f41895a.mo14262k());
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C15440n nVar = C15440n.f41895a;
            Context context2 = textView.getContext();
            C87412m.m108593f(context2, "text.context");
            textView.setText(nVar.mo14267p(context2, str, linkedList, true));
        }
    }

    /* renamed from: WK */
    public void mo85041WK(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "qrCodeUrl");
        Intent intent = new Intent(context, FinderLivePostSelectContactUI.class);
        intent.putExtra("KEY_PARAMS_IS_FROM_QR_CODE", true);
        intent.putExtra("KEY_PARAMS_QR_CODE_URL", str);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "enterLiveSelectRoom", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "enterLiveSelectRoom", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: XT */
    public void mo85042XT(int i) {
        C54405b bVar;
        HashMap<Integer, Integer> hashMap;
        if (i <= 0) {
            C54730a aVar = C54730a.f153378a;
            int i2 = C61159e.f174108a;
            aVar.mo75620g(-1);
        } else {
            C54730a aVar2 = C54730a.f153378a;
            int i3 = C61159e.f174108a;
            aVar2.mo75620g(2);
        }
        Integer[] a = C54422h.f152647a.mo75236a();
        for (int i4 = 0; i4 < 22; i4++) {
            int intValue = a[i4].intValue();
            C54730a aVar3 = C54730a.f153378a;
            aVar3.mo75619f(aVar3.mo75616c(), intValue, i);
            FinderLiveService.f159376d.getClass();
            C36624a aVar4 = FinderLiveService.f159390t;
            if (!(aVar4 == null || (hashMap = aVar4.f97362a) == null)) {
                Integer put = hashMap.put(Integer.valueOf(intValue), Integer.valueOf(i));
            }
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C60735a aVar5 = FinderLiveService.f159378f;
        if (aVar5 != null && (bVar = aVar5.f173032r) != null) {
            finderLiveService.getClass();
            ((C54412f) bVar).mo75226i(FinderLiveService.f159390t);
        }
    }

    /* renamed from: Xf */
    public void mo85043Xf(String str, String str2, boolean z) {
        C58765p3 p3Var = C58765p3.f168247a;
        Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "dealShare, appid:" + str + ", extInfo:" + str2);
        if (str2 == null || Util.isNullOrNil(str2) || str == null || Util.isNullOrNil(str)) {
            if (str == null) {
                str = "";
            }
            p3Var.mo83803b(10001, "appid or extInfo empty", str);
            return;
        }
        Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "checkAccount, isSameAccount:" + z + ", appid:" + str + ", extInfo:" + str2);
        boolean z2 = true;
        if (!z) {
            if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
                p3Var.mo83803b(10001, "appid or extInfo empty", str);
            } else {
                try {
                    if (C58765p3.f168248b.contains(Integer.valueOf(new JSONObject(str2).getInt("liveEntryScene"))) && !z) {
                        Log.m105924i("Finder.FinderThirdPartyGameLiveUtil", "checkAccount false");
                        C77426q qVar = new C77426q(MMApplicationContext.getContext());
                        qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.dnj));
                        qVar.mo107589a(true);
                        qVar.mo107602n(MMApplicationContext.getContext().getString(C0966R.string.a18));
                        qVar.mo107600l(new C7849o3(str));
                        qVar.mo107603o();
                        z2 = false;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        if (z2) {
            C58777u0.f168284b = 19;
            Intent intent = new Intent();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int i = jSONObject.getInt("routeScene");
                if (i == 3) {
                    p3Var.mo83802a(jSONObject, str, intent);
                    return;
                }
                p3Var.mo83803b(10001, "error routeScene " + i, str);
            } catch (Throwable unused2) {
                p3Var.mo83803b(10001, "error json exception", str);
            }
        }
    }

    /* renamed from: Xi */
    public void mo85044Xi(int i) {
        C54405b bVar;
        if (i <= 0) {
            C54763g6.f153485a.mo75667d(0);
        } else {
            C54763g6.f153485a.mo75667d(1);
            Iterator it = ((ArrayList) C65933h.f189544a.mo89975f()).iterator();
            while (it.hasNext()) {
                C65933h.C65935b bVar2 = (C65933h.C65935b) it.next();
                C54763g6 g6Var = C54763g6.f153485a;
                g6Var.mo75668e(1, 1, i);
                g6Var.mo75668e(1, 2, i);
            }
        }
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null && (bVar = aVar.f173032r) != null) {
            if (i <= 0) {
                ((C54412f) bVar).mo75225h("", "");
            } else {
                C65933h.C65935b bVar3 = (C65933h.C65935b) C110818d0.m150917O(C65933h.f189544a.mo89975f(), 1);
                if (bVar3 != null) {
                    ((C54412f) bVar).mo75225h(bVar3.f189559d, bVar3.f189560e);
                }
            }
            ((C54412f) bVar).mo75224g(i);
            C54405b.C54406a.m61097a(bVar, i, false, false, 4, (Object) null);
        }
    }

    /* renamed from: Xr */
    public HashMap<Integer, C91753f.C66827b> mo85045Xr() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        hashMap.put(-1485971404, C33010i.f89669a);
        hashMap.put(-660204944, C8717j.f27955a);
        hashMap.put(-1283379592, C33013k.f89672a);
        hashMap.put(-1801960912, C33015l.f89674a);
        hashMap.put(-1275972199, C33017m.f89676a);
        hashMap.put(469954213, C33018n.f89677a);
        hashMap.put(1656915120, C33019o.f89678a);
        hashMap.put(-386214326, C33020p.f89679a);
        hashMap.put(-1552673420, C8720q.f27960a);
        return hashMap;
    }

    /* renamed from: Z3 */
    public void mo85046Z3(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13275Z3(context, intent);
    }

    /* renamed from: ZH */
    public void mo85047ZH(Intent intent, Context context, long j, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, boolean z) {
        String str8;
        C51713vn0 vn02;
        C64273c21 c212;
        C48924by0 by02;
        C51713vn0 vn03;
        C64273c21 c213;
        C64265bq2 bq22;
        C64254b81 b812;
        Context context2 = context;
        Long l2 = l;
        String str9 = str4;
        Class cls = C10432i.class;
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(str2, "nonceId");
        C87412m.m108594g(str9, "contextId");
        String str10 = str7;
        C87412m.m108594g(str10, "streamUrl");
        if (context2 != null && l2 != null) {
            if (!((C10432i) C86312j.m106911c(cls)).mo10750e() || ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9636zX() || !z) {
                int i3 = 0;
                int i4 = 1;
                byte[] bArr = null;
                if (str.length() == 0) {
                    C61926c.m72656A((String) null, new C60125t(str2, j, str4, context, intent, this, l, str3, str5, str6));
                    return;
                }
                ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(str9);
                C13605o oVar = this.f171510g.get(l2);
                int i5 = C60184m.f171717b;
                if (i5 <= 0) {
                    i5 = C32444a.f86123a1;
                }
                long j2 = (long) (i5 * 1000);
                if (oVar != null && System.currentTimeMillis() - ((Number) oVar.f38558e).longValue() < j2) {
                    str10 = "";
                }
                if (!(oVar != null && 1 == ((Number) oVar.f38557d).intValue()) || System.currentTimeMillis() - ((Number) oVar.f38558e).longValue() >= j2) {
                    i4 = i2;
                    str8 = str10;
                } else {
                    C64273c21 c214 = ((C51713vn0) oVar.f38559f).f143572d;
                    String str11 = c214 != null ? c214.f182395g : null;
                    if (str11 == null) {
                        str11 = "";
                    }
                    if (!(c214 == null || (b812 = c214.f182401p) == null)) {
                        i4 = b812.f182228d;
                    }
                    if (!(c214 == null || (bq22 = c214.f182358D) == null)) {
                        bArr = bq22.toByteArray();
                    }
                    str8 = str11;
                }
                byte[] bArr2 = bArr;
                Intent intent2 = intent == null ? new Intent() : intent;
                if (intent2.getIntExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", 0) == 0) {
                    if (!(oVar == null || (vn03 = (C51713vn0) oVar.f38559f) == null || (c213 = vn03.f143572d) == null)) {
                        i3 = c213.f182384X;
                    }
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", i3);
                }
                if (!(intent2.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO") != null || oVar == null || (vn02 = (C51713vn0) oVar.f38559f) == null || (c212 = vn02.f143572d) == null || (by02 = c212.f182402p0) == null)) {
                    intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
                }
                C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
                String str12 = str3 == null ? "" : str3;
                C87412m.m108593f(o1Var, "getService(IActivityRouter::class.java)");
                C13883o1.C13884a.m13252d(o1Var, intent2, context, j, l.longValue(), str, str2, str12, str4, i, str5, str6, str8, Integer.valueOf(i4), 0, bArr2, (FinderObject) null, false, 106496, (Object) null);
                return;
            }
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(context2);
        }
    }

    public void a50(int i) {
        FinderLiveService.f159376d.mo77652z(i);
    }

    public void ae0(String str, C0000n0 n0Var, TextView textView, List<String> list, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(n0Var, "scope");
        TextView textView2 = textView;
        C87412m.m108594g(textView2, MimeTypes.BASE_TYPE_TEXT);
        String str3 = str2;
        C87412m.m108594g(str3, "str");
        C61866i0.f175909a.mo86802n(str, n0Var, textView2, list, str3, z, z2, z3, z4, i, aVar);
    }

    /* renamed from: bT */
    public void mo85050bT(EGLContext eGLContext, int i, int i2, int i3, long j) {
        C87412m.m108594g(eGLContext, "eglContext");
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            TRTCCloudDef.TRTCTexture tRTCTexture = aVar.f173027n;
            tRTCTexture.eglContext14 = eGLContext;
            tRTCTexture.textureId = i;
            TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = aVar.f173026j;
            tRTCVideoFrame.texture = tRTCTexture;
            tRTCVideoFrame.width = i2;
            tRTCVideoFrame.height = i3;
            tRTCVideoFrame.pixelFormat = 2;
            tRTCVideoFrame.bufferType = 3;
            aVar.mo85679W().sendCustomVideoData(aVar.f173026j);
        }
    }

    /* renamed from: bg */
    public int mo85051bg(long j) {
        return Cx0().mo58845Lo(j);
    }

    /* renamed from: c7 */
    public void mo85052c7(Context context, C32226l<? super Boolean, C13598b0> lVar) {
        if (context != null) {
            C62042e eVar = C62042e.f176370a;
            boolean u = C61926c.m72696u(eVar.mo87106p0().getInt("live_status_flag", 0), 1);
            C8477a0 a0Var = new C8477a0();
            boolean m = C61104a.m71657m(context, false, (Bundle) null);
            if (u && !m) {
                eVar.mo87106p0().putInt("live_status_flag", 0);
                new C45366h0(C66785b.f191882e.mo90662O5(), new C60119h(System.currentTimeMillis(), lVar, a0Var, context, this)).mo9225i();
            } else if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "checkUnfinishLive localUnfinishLive:" + u + " livingAsAnchor:" + m);
        }
    }

    public void ck0(long j, int i, long j2, C9487b<C9486a> bVar, C60606n.C60609c cVar, int i2) {
        C13605o oVar = this.f171510g.get(Long.valueOf(j));
        if (oVar == null || (((Number) oVar.f38557d).intValue() != i && !Ex0(oVar, j2))) {
            long j3 = j;
            C60606n.C60609c cVar2 = cVar;
            C60606n.C60607a.m70857a(this, j, true, bVar, cVar, i2, (String) null, (C50429mo2) null, 96, (Object) null);
            return;
        }
        long j4 = j;
        C61926c.m72668M(new C60111c0(cVar, j, oVar));
    }

    /* renamed from: dz */
    public void mo85054dz(boolean z) {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            aVar.mo85699r0(z);
        }
    }

    public void enableAudioVolumeEvaluation(int i) {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            aVar.mo85679W().enableAudioVolumeEvaluation(i);
        }
    }

    /* renamed from: fR */
    public void mo85056fR() {
        C54421g gVar;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null && (gVar = eVar.f176822Y0) != null) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "pausePlay");
            C58924d dVar = gVar.f152627a;
            if (dVar != null) {
                dVar.pause();
            }
        }
    }

    public void fs0(long j) {
        this.f171512i.post(new C33021p0(j, this));
    }

    /* renamed from: fy */
    public C64321dp2 mo85058fy(long j, C64390ga1 ga12) {
        return C63889i.f181100a.mo88654a(j, ga12);
    }

    /* renamed from: h4 */
    public C49098d51 mo85059h4(String str, String str2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13343h4(str, str2);
    }

    public View h40() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = new FinderLiveAudioWaveRootView(context, (AttributeSet) null);
        finderLiveAudioWaveRootView.f159497i.setTextSize(1, 12.0f);
        int h = C76577a.m92157h(finderLiveAudioWaveRootView.getContext(), C0966R.dimen.f3738cr);
        int h2 = C76577a.m92157h(finderLiveAudioWaveRootView.getContext(), C0966R.dimen.f3725ce);
        float h3 = (float) C76577a.m92157h(finderLiveAudioWaveRootView.getContext(), C0966R.dimen.f3703bv);
        float b = (float) C76577a.m92151b(finderLiveAudioWaveRootView.getContext(), 2);
        finderLiveAudioWaveRootView.f159495g.setLayoutParams(new LinearLayout.LayoutParams(h2, h));
        finderLiveAudioWaveRootView.f159496h.setLayoutParams(new LinearLayout.LayoutParams(h2, h));
        finderLiveAudioWaveRootView.f159495g.setTranslationX((float) C76577a.m92151b(finderLiveAudioWaveRootView.getContext(), 2));
        finderLiveAudioWaveRootView.f159496h.setTranslationX(-((float) C76577a.m92151b(finderLiveAudioWaveRootView.getContext(), 2)));
        finderLiveAudioWaveRootView.f159495g.setArcWidth(h3);
        finderLiveAudioWaveRootView.f159496h.setArcWidth(h3);
        finderLiveAudioWaveRootView.f159495g.setWaveWidth(b);
        finderLiveAudioWaveRootView.f159496h.setWaveWidth(b);
        finderLiveAudioWaveRootView.mo77689a();
        finderLiveAudioWaveRootView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        return finderLiveAudioWaveRootView;
    }

    /* renamed from: hZ */
    public void mo85061hZ(int i) {
        FinderLiveService.f159376d.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (liveRoomControllerStore != null) {
            C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59907o(liveRoomControllerStore, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r11 = z04.C66731x.m78732f(r11);
     */
    /* renamed from: iC */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ks3.C61161k mo85062iC(te3.C64623p81 r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class<ls3.g> r0 = ls3.C61397g.class
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            java.lang.String r2 = "shareObject"
            gy3.C87412m.m108594g(r10, r2)
            if (r11 == 0) goto L_0x0026
            java.lang.String r11 = r10.f184778d
            if (r11 == 0) goto L_0x001b
            java.lang.Long r11 = z04.C66731x.m78732f(r11)
            if (r11 == 0) goto L_0x001b
            long r2 = r11.longValue()
            goto L_0x001d
        L_0x001b:
            r2 = 0
        L_0x001d:
            te3.c21 r11 = r9.T70(r2)
            if (r11 != 0) goto L_0x0028
            te3.c21 r11 = r10.f184761E
            goto L_0x0028
        L_0x0026:
            te3.c21 r11 = r10.f184761E
        L_0x0028:
            r2 = 0
            r3 = 1
            if (r11 == 0) goto L_0x0037
            di3.d r4 = di3.C86312j.m106911c(r1)
            ir.n r4 = (p565ir.C60606n) r4
            boolean r4 = r4.mo85008I1(r11)
            goto L_0x004a
        L_0x0037:
            int r4 = ks3.C61160f.f174109a
            int r4 = r10.f184759C
            r5 = 2
            if (r4 == r5) goto L_0x0049
            r5 = 8
            if (r4 == r5) goto L_0x0049
            r5 = 16
            if (r4 != r5) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r4 = 0
            goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            if (r11 == 0) goto L_0x0059
            di3.d r1 = di3.C86312j.m106911c(r0)
            ls3.g r1 = (ls3.C61397g) r1
            java.lang.String r5 = r10.f184779e
            boolean r1 = r1.ah0(r5, r11)
            goto L_0x0063
        L_0x0059:
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            boolean r1 = r1.mo85005G0(r10)
        L_0x0063:
            if (r11 == 0) goto L_0x0070
            di3.d r0 = di3.C86312j.m106911c(r0)
            ls3.g r0 = (ls3.C61397g) r0
            boolean r0 = r0.mo83480Qg(r11)
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r11 == 0) goto L_0x0076
            int r5 = r11.f182394f
            goto L_0x0078
        L_0x0076:
            int r5 = r10.f184791t
        L_0x0078:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "updateLiveTag desc:"
            r6.append(r7)
            java.lang.String r7 = r10.f184782h
            r6.append(r7)
            java.lang.String r7 = "(live:"
            r6.append(r7)
            java.lang.String r7 = r10.f184778d
            r6.append(r7)
            r7 = 32
            r6.append(r7)
            java.lang.String r7 = r10.f184781g
            r6.append(r7)
            java.lang.String r7 = "),liveStatus:"
            r6.append(r7)
            r6.append(r5)
            r7 = 40
            r6.append(r7)
            r7 = 0
            if (r11 == 0) goto L_0x00b3
            int r8 = r11.f182394f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00b4
        L_0x00b3:
            r8 = r7
        L_0x00b4:
            r6.append(r8)
            java.lang.String r8 = "),chargFlag:"
            r6.append(r8)
            int r10 = r10.f184759C
            r6.append(r10)
            java.lang.String r10 = ",isChargeLive:"
            r6.append(r10)
            r6.append(r4)
            java.lang.String r10 = ",isLiveReplay:"
            r6.append(r10)
            r6.append(r1)
            java.lang.String r10 = ", producingReplay:"
            r6.append(r10)
            r6.append(r0)
            java.lang.String r10 = ", liveInfo null:"
            r6.append(r10)
            if (r11 != 0) goto L_0x00e2
            r10 = 1
            goto L_0x00e3
        L_0x00e2:
            r10 = 0
        L_0x00e3:
            r6.append(r10)
            java.lang.String r10 = ",purchaseInfo null:"
            r6.append(r10)
            if (r11 == 0) goto L_0x00ef
            te3.e61 r7 = r11.f182363I
        L_0x00ef:
            if (r7 != 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            r6.append(r2)
            java.lang.String r10 = r6.toString()
            java.lang.String r11 = "MicroMsg.FinderLiveFeatureService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            if (r4 == 0) goto L_0x0103
            ks3.k r10 = ks3.C61161k.Charge
            goto L_0x0114
        L_0x0103:
            if (r1 == 0) goto L_0x0108
            ks3.k r10 = ks3.C61161k.Replay
            goto L_0x0114
        L_0x0108:
            if (r0 == 0) goto L_0x010d
            ks3.k r10 = ks3.C61161k.ReplayAuditing
            goto L_0x0114
        L_0x010d:
            if (r5 != r3) goto L_0x0112
            ks3.k r10 = ks3.C61161k.Living
            goto L_0x0114
        L_0x0112:
            ks3.k r10 = ks3.C61161k.LiveEnd
        L_0x0114:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo85062iC(te3.p81, boolean):ks3.k");
    }

    /* renamed from: ie */
    public void mo85063ie(Context context, String str) {
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_LUCKY_MONEY_GUIDE_INT_SYNC;
        Intent intent = null;
        String str2 = "";
        if (C87412m.m108589b(i.mo119685f(aVar, 0), 0)) {
            C115669n.INSTANCE.mo160131h(22385, 3, Long.valueOf(System.currentTimeMillis()));
            Intent intent2 = new Intent();
            String obj = C86709a0.m107535s().mo121142i().mo119684e(274436, str2).toString();
            if (Util.isNullOrNil(obj)) {
                obj = LocaleUtil.getCurrentCountryCode();
            }
            if (!Util.isNullOrNil(obj) && !Util.isAllAlpha(obj)) {
                obj = str2;
            }
            Object[] objArr = new Object[3];
            if (str != null) {
                str2 = str;
            }
            objArr[0] = URLEncoder.encode(str2);
            objArr[1] = LocaleUtil.getApplicationLanguage();
            objArr[2] = obj;
            String string = context2.getString(C0966R.string.e65, objArr);
            C87412m.m108593f(string, "context.getString(\n     …tryCode\n                )");
            Charset charset = C119027c.f356488a;
            byte[] bytes = string.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] encode = Base64.encode(bytes, 0);
            C87412m.m108593f(encode, "encode(WILCOME_URL.toByteArray(), Base64.DEFAULT)");
            String str3 = new String(encode, charset);
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "WILCOME_URL:" + str3);
            intent2.putExtra("rawUrl", string);
            intent2.putExtra("showShare", false);
            C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            Log.m105924i("MicroMsg.FinderLiveFeatureService", "createLuckyMoneyLive show guide");
            return;
        }
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "createLuckyMoneyLiveImpl");
        Intent intent3 = new Intent();
        if (str != null) {
            str2 = str;
        }
        intent3.putExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME", str2);
        intent3.putExtra("ENTER_SCENE", 1);
        if (!(context2 instanceof Activity)) {
            intent = intent3;
        }
        if (intent != null) {
            intent.addFlags(268435456);
        }
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1.C64917a.m76443j((C64916p1) c, context, intent3, 0, (String) null, 0, 0, false, 124, (Object) null);
        intent3.setClass(context2, FinderLivePostPendingUI.class);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent3);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createLuckyMoneyLiveImpl", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createLuckyMoneyLiveImpl", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean ih0(long j) {
        C13605o oVar = this.f171510g.get(Long.valueOf(j));
        int i = C60184m.f171717b;
        if (i <= 0) {
            i = C32444a.f86123a1;
        }
        return Ex0(oVar, (long) (i * 1000));
    }

    /* renamed from: jR */
    public void mo85065jR(String str) {
        C87412m.m108594g(str, "funcMsgId");
        C32434d.f86010d.getClass();
        Log.m105924i("Finder.FinderLiveNotifyFuncMsgExtension", "requestOnLiveClose");
        HashMap hashMap = new HashMap();
        hashMap.put(".sysmsg.functionmsg.cgi", "/cgi-bin/micromsg-bin/findergetlivetips");
        hashMap.put(".sysmsg.functionmsg.cmdid", "6407");
        hashMap.put(".sysmsg.functionmsg.functionmsgid", str);
        hashMap.put(".sysmsg.functionmsg.businessid", String.valueOf(70001));
        C32434d.f86012f = (String) hashMap.get(".sysmsg.functionmsg.functionmsgid");
        ((C36332a) ((C37461n0) C86312j.m106911c(C37461n0.class)).mo61109lG()).mo60622c(new C77949j3(), hashMap, "requestOnLiveClose");
    }

    /* renamed from: jY */
    public void mo85066jY(String str, String str2) {
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "shopName");
        Intent intent = new Intent();
        intent.putExtra("FROM_APP_ID", str);
        intent.putExtra("FROM_SHOP_NAME", str2);
        C13091a aVar = C13091a.f37264a;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        aVar.mo12593a(context, intent);
    }

    public void jd0(int i) {
        FinderLiveService.f159376d.getClass();
        LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
        if (liveRoomControllerStore != null) {
            C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59908p(liveRoomControllerStore, i));
        }
    }

    public void jr0(View view, C61161k kVar, boolean z) {
        String str;
        C87412m.m108594g(kVar, "cardStatus");
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.f360544dj1);
        } else if (ordinal == 1) {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dj6);
        } else if (ordinal == 2) {
            str = z ? MMApplicationContext.getContext().getResources().getString(C0966R.string.n1r) : MMApplicationContext.getContext().getResources().getString(C0966R.string.fow);
        } else if (ordinal == 3) {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dj8);
        } else if (ordinal == 4) {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dkt);
        } else {
            throw new C13603j();
        }
        C87412m.m108593f(str, "when(cardStatus) {\n     …)\n            }\n        }");
        if (view instanceof FinderLiveOnliveWidget) {
            ((FinderLiveOnliveWidget) view).setText(str);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(str);
        }
    }

    public C61161k jv0(String str, C64273c21 c212) {
        Class cls = C61397g.class;
        C87412m.m108594g(c212, "liveInfo");
        boolean I1 = ((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(c212);
        boolean ah02 = ((C61397g) C86312j.m106911c(cls)).ah0(str, c212);
        boolean Qg = ((C61397g) C86312j.m106911c(cls)).mo83480Qg(c212);
        int i = c212.f182394f;
        StringBuilder sb = new StringBuilder();
        sb.append("getLiveCardState(live:");
        sb.append(c212.f182392d);
        sb.append("),liveStatus:");
        sb.append(i);
        sb.append('(');
        sb.append(c212.f182394f);
        sb.append("),isChargeLive:");
        sb.append(I1);
        sb.append(",isLiveReplay:");
        sb.append(ah02);
        sb.append(", producingReplay:");
        sb.append(Qg);
        sb.append(",purchaseInfo null:");
        sb.append(c212.f182363I == null);
        sb.append(",anchorUserName:");
        sb.append(str);
        sb.append('!');
        Log.m105924i("MicroMsg.FinderLiveFeatureService", sb.toString());
        return I1 ? C61161k.Charge : ah02 ? C61161k.Replay : Qg ? C61161k.ReplayAuditing : i == 1 ? C61161k.Living : C61161k.LiveEnd;
    }

    /* renamed from: k4 */
    public void mo85070k4(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13282k4(context, intent);
    }

    public C50508n81 kj0() {
        String str;
        String str2;
        C58961d.C58963b bVar = C58961d.f168673a;
        bVar.getClass();
        C50508n81 n812 = new C50508n81();
        n812.f138477f = C61926c.m72696u((int) bVar.mo84158e().field_liveSwitchFlag, 512);
        C50075k34 k342 = bVar.mo84158e().field_settlementInfo;
        String str3 = "";
        if (k342 == null || (str = k342.f136534d) == null) {
            str = str3;
        }
        n812.f138475d = str;
        C50075k34 k343 = bVar.mo84158e().field_settlementInfo;
        if (!(k343 == null || (str2 = k343.f136535e) == null)) {
            str3 = str2;
        }
        n812.f138476e = str3;
        return n812;
    }

    public String l90() {
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar != null) {
            return oVar.f154252S0;
        }
        return null;
    }

    public void lc0(boolean z) {
        T t;
        String str;
        int i;
        boolean z2;
        T t2;
        String str2;
        boolean z3;
        T t3;
        String str3;
        int i2;
        boolean z4;
        T t4;
        String str4;
        boolean z5;
        T t5;
        String str5;
        int i3;
        int i4;
        boolean z6;
        boolean z7 = z;
        C16217b bVar = C16217b.f43438a;
        Class cls = C60200t1.class;
        Iterator<T> it = C16217b.f43440c.iterator();
        boolean z8 = false;
        int i5 = 0;
        while (true) {
            String str6 = "";
            int i6 = 4;
            char c = '.';
            T t6 = null;
            if (it.hasNext()) {
                T next = it.next();
                int i7 = i5 + 1;
                if (i5 >= 0) {
                    String str7 = (String) next;
                    if (!C87412m.m108589b(str7, "audience.more") && C112551y.m153820t(str7, "audience.more", false, 2, (Object) null)) {
                        Iterator<T> it4 = C16217b.f43440c.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            T next2 = it4.next();
                            String str8 = (String) next2;
                            if (C87412m.m108589b(str8, str7) || !C112551y.m153820t(str8, str7, false, 2, (Object) null)) {
                                z6 = false;
                                continue;
                            } else {
                                z6 = true;
                                continue;
                            }
                            if (z6) {
                                t6 = next2;
                                break;
                            }
                        }
                        if (t6 == null) {
                            List U = C112550d0.m153785U(str7, new String[]{"."}, false, 0, 6, (Object) null);
                            if (U.size() == 4) {
                                str6 = "audience.more" + '.' + ((String) U.get(2));
                            }
                            C51978xi1 xi12 = new C51978xi1();
                            xi12.f144674i = 3600;
                            xi12.f144669d = 400000;
                            xi12.f144686x = -4758357817339078452L;
                            xi12.f144670e = i5 + 30000;
                            xi12.f144677o = true;
                            LinkedList<C64586nn1> linkedList = xi12.f144672g;
                            C64586nn1 nn12 = new C64586nn1();
                            nn12.f184502d = 1;
                            nn12.f184506h = 1;
                            nn12.f184515t = z7;
                            nn12.f184508j = str6.length() == 0 ? "audience.more" : str6;
                            nn12.f184507i = str7;
                            linkedList.add(nn12);
                            if (str6.length() > 0) {
                                LinkedList<C64586nn1> linkedList2 = xi12.f144672g;
                                C64586nn1 nn13 = new C64586nn1();
                                i4 = 1;
                                nn13.f184502d = 1;
                                nn13.f184506h = 2;
                                nn13.f184508j = "audience.more";
                                nn13.f184507i = str6;
                                linkedList2.add(nn13);
                            } else {
                                i4 = 1;
                            }
                            LinkedList<C64586nn1> linkedList3 = xi12.f144672g;
                            C64586nn1 nn14 = new C64586nn1();
                            nn14.f184502d = i4;
                            nn14.f184506h = 2;
                            nn14.f184507i = "audience.more";
                            linkedList3.add(nn14);
                            xi12.f144673h = String.valueOf(str7.hashCode());
                            C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(cls)).Nt0(), xi12, "mockVisitor", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                        }
                    }
                    i5 = i7;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            } else {
                int i8 = 0;
                for (T next3 : C16217b.f43440c) {
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        String str9 = (String) next3;
                        if (!C87412m.m108589b(str9, "anchorlive.more") && C112551y.m153820t(str9, "anchorlive.more", false, 2, (Object) null)) {
                            Iterator<T> it5 = C16217b.f43440c.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    t5 = null;
                                    break;
                                }
                                t5 = it5.next();
                                String str10 = (String) t5;
                                if (!C87412m.m108589b(str10, str9) && C112551y.m153820t(str10, str9, false, 2, (Object) null)) {
                                    break;
                                }
                            }
                            if (t5 == null) {
                                List U2 = C112550d0.m153785U(str9, new String[]{"."}, false, 0, 6, (Object) null);
                                if (U2.size() == i6) {
                                    str5 = "anchorlive.more" + c + ((String) U2.get(2));
                                } else {
                                    str5 = str6;
                                }
                                C51978xi1 xi13 = new C51978xi1();
                                xi13.f144674i = 3600;
                                xi13.f144669d = 400000;
                                xi13.f144686x = -4758357817339078452L;
                                xi13.f144670e = i8 + 30000;
                                xi13.f144677o = true;
                                LinkedList<C64586nn1> linkedList4 = xi13.f144672g;
                                C64586nn1 nn15 = new C64586nn1();
                                nn15.f184502d = 1;
                                nn15.f184515t = z7;
                                nn15.f184506h = 1;
                                nn15.f184508j = str5.length() == 0 ? "anchorlive.more" : str5;
                                nn15.f184507i = str9;
                                linkedList4.add(nn15);
                                if (str5.length() > 0) {
                                    LinkedList<C64586nn1> linkedList5 = xi13.f144672g;
                                    C64586nn1 nn16 = new C64586nn1();
                                    i3 = 1;
                                    nn16.f184502d = 1;
                                    nn16.f184506h = 2;
                                    nn16.f184508j = "anchorlive.more";
                                    nn16.f184507i = str5;
                                    linkedList5.add(nn16);
                                } else {
                                    i3 = 1;
                                }
                                LinkedList<C64586nn1> linkedList6 = xi13.f144672g;
                                C64586nn1 nn17 = new C64586nn1();
                                nn17.f184502d = i3;
                                nn17.f184506h = 2;
                                nn17.f184507i = "anchorlive.more";
                                linkedList6.add(nn17);
                                xi13.f144673h = String.valueOf(str9.hashCode());
                                C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(cls)).Nt0(), xi13, "mockAnchorMore", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                            }
                        }
                        i8 = i9;
                        i6 = 4;
                        c = '.';
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                int i15 = 0;
                for (T next4 : C16217b.f43440c) {
                    int i16 = i15 + 1;
                    if (i15 >= 0) {
                        String str11 = (String) next4;
                        if (!C87412m.m108589b(str11, "anchorlive.bottom") && C112551y.m153820t(str11, "anchorlive.bottom", false, 2, (Object) null)) {
                            Iterator<T> it6 = C16217b.f43440c.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    t4 = null;
                                    break;
                                }
                                t4 = it6.next();
                                String str12 = (String) t4;
                                if (C87412m.m108589b(str12, str11) || !C112551y.m153820t(str12, str11, false, 2, (Object) null)) {
                                    z5 = false;
                                    continue;
                                } else {
                                    z5 = true;
                                    continue;
                                }
                                if (z5) {
                                    break;
                                }
                            }
                            if (t4 == null) {
                                List U3 = C112550d0.m153785U(str11, new String[]{"."}, false, 0, 6, (Object) null);
                                if (U3.size() == 4) {
                                    str4 = "anchorlive.bottom" + '.' + ((String) U3.get(2));
                                } else {
                                    str4 = null;
                                }
                                C51978xi1 xi14 = new C51978xi1();
                                xi14.f144674i = 3600;
                                xi14.f144669d = 400000;
                                xi14.f144686x = -4758357817339078452L;
                                xi14.f144670e = i15 + 30000;
                                xi14.f144677o = true;
                                LinkedList<C64586nn1> linkedList7 = xi14.f144672g;
                                C64586nn1 nn18 = new C64586nn1();
                                nn18.f184502d = 1;
                                nn18.f184515t = z7;
                                nn18.f184506h = 1;
                                nn18.f184508j = str4;
                                nn18.f184507i = str11;
                                linkedList7.add(nn18);
                                if (!(str4 == null || str4.length() == 0)) {
                                    LinkedList<C64586nn1> linkedList8 = xi14.f144672g;
                                    C64586nn1 nn19 = new C64586nn1();
                                    nn19.f184502d = 1;
                                    nn19.f184506h = 2;
                                    nn19.f184507i = str4;
                                    linkedList8.add(nn19);
                                }
                                xi14.f144673h = String.valueOf(str11.hashCode());
                                C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(cls)).Nt0(), xi14, "mockAnchorBottom", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                            }
                        }
                        i15 = i16;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                int i17 = 0;
                for (T next5 : C16217b.f43440c) {
                    int i18 = i17 + 1;
                    if (i17 >= 0) {
                        String str13 = (String) next5;
                        if (!C87412m.m108589b(str13, "startlive.more") && C112551y.m153820t(str13, "startlive.more", false, 2, (Object) null)) {
                            Iterator<T> it7 = C16217b.f43440c.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    t3 = null;
                                    break;
                                }
                                t3 = it7.next();
                                String str14 = (String) t3;
                                if (C87412m.m108589b(str14, str13) || !C112551y.m153820t(str14, str13, false, 2, (Object) null)) {
                                    z4 = false;
                                    continue;
                                } else {
                                    z4 = true;
                                    continue;
                                }
                                if (z4) {
                                    break;
                                }
                            }
                            if (t3 == null) {
                                List U4 = C112550d0.m153785U(str13, new String[]{"."}, false, 0, 6, (Object) null);
                                if (U4.size() == 4) {
                                    str3 = "startlive.more" + '.' + ((String) U4.get(2));
                                } else {
                                    str3 = str6;
                                }
                                C51978xi1 xi15 = new C51978xi1();
                                xi15.f144674i = 3600;
                                xi15.f144669d = 400000;
                                xi15.f144686x = -4758357817339078452L;
                                xi15.f144670e = i17 + 30000;
                                xi15.f144677o = true;
                                LinkedList<C64586nn1> linkedList9 = xi15.f144672g;
                                C64586nn1 nn110 = new C64586nn1();
                                nn110.f184502d = 1;
                                nn110.f184515t = z7;
                                nn110.f184506h = 1;
                                nn110.f184508j = str3.length() == 0 ? "startlive.more" : str3;
                                nn110.f184507i = str13;
                                linkedList9.add(nn110);
                                if (str3.length() > 0) {
                                    LinkedList<C64586nn1> linkedList10 = xi15.f144672g;
                                    C64586nn1 nn111 = new C64586nn1();
                                    i2 = 1;
                                    nn111.f184502d = 1;
                                    nn111.f184506h = 2;
                                    nn111.f184508j = "startlive.more";
                                    nn111.f184507i = str3;
                                    linkedList10.add(nn111);
                                } else {
                                    i2 = 1;
                                }
                                LinkedList<C64586nn1> linkedList11 = xi15.f144672g;
                                C64586nn1 nn112 = new C64586nn1();
                                nn112.f184502d = i2;
                                nn112.f184506h = 2;
                                nn112.f184507i = "startlive.more";
                                linkedList11.add(nn112);
                                xi15.f144673h = String.valueOf(str13.hashCode());
                                C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(cls)).Nt0(), xi15, "mockStartLiveMore", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                            }
                        }
                        i17 = i18;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                int i19 = 0;
                for (T next6 : C16217b.f43440c) {
                    int i25 = i19 + 1;
                    if (i19 >= 0) {
                        String str15 = (String) next6;
                        if (!C87412m.m108589b(str15, "startlive.bottom") && C112551y.m153820t(str15, "startlive.bottom", false, 2, (Object) null)) {
                            Iterator<T> it8 = C16217b.f43440c.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    t2 = null;
                                    break;
                                }
                                t2 = it8.next();
                                String str16 = (String) t2;
                                if (C87412m.m108589b(str16, str15) || !C112551y.m153820t(str16, str15, false, 2, (Object) null)) {
                                    z3 = false;
                                    continue;
                                } else {
                                    z3 = true;
                                    continue;
                                }
                                if (z3) {
                                    break;
                                }
                            }
                            if (t2 == null) {
                                List U5 = C112550d0.m153785U(str15, new String[]{"."}, false, 0, 6, (Object) null);
                                if (U5.size() == 4) {
                                    str2 = "startlive.bottom" + '.' + ((String) U5.get(2));
                                } else {
                                    str2 = null;
                                }
                                C51978xi1 xi16 = new C51978xi1();
                                xi16.f144674i = 3600;
                                xi16.f144669d = 400000;
                                xi16.f144686x = -4758357817339078452L;
                                xi16.f144670e = i19 + 30000;
                                xi16.f144677o = true;
                                LinkedList<C64586nn1> linkedList12 = xi16.f144672g;
                                C64586nn1 nn113 = new C64586nn1();
                                nn113.f184502d = 1;
                                nn113.f184515t = z7;
                                nn113.f184506h = 1;
                                nn113.f184508j = str2;
                                nn113.f184507i = str15;
                                linkedList12.add(nn113);
                                if (!(str2 == null || str2.length() == 0)) {
                                    LinkedList<C64586nn1> linkedList13 = xi16.f144672g;
                                    C64586nn1 nn114 = new C64586nn1();
                                    nn114.f184502d = 1;
                                    nn114.f184506h = 2;
                                    nn114.f184507i = str2;
                                    linkedList13.add(nn114);
                                }
                                xi16.f144673h = String.valueOf(str15.hashCode());
                                C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(cls)).Nt0(), xi16, "mockStartLiveBottom", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                            }
                        }
                        i19 = i25;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                int i26 = 0;
                for (T next7 : C16217b.f43440c) {
                    int i27 = i26 + 1;
                    if (i26 >= 0) {
                        String str17 = (String) next7;
                        if (!C87412m.m108589b(str17, "assistant.more") && C112551y.m153820t(str17, "assistant.more", z8, 2, (Object) null)) {
                            Iterator<T> it9 = C16217b.f43440c.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it9.next();
                                String str18 = (String) t;
                                if (C87412m.m108589b(str18, str17) || !C112551y.m153820t(str18, str17, z8, 2, (Object) null)) {
                                    z2 = false;
                                    continue;
                                } else {
                                    z2 = true;
                                    continue;
                                }
                                if (z2) {
                                    break;
                                }
                            }
                            if (t == null) {
                                List U6 = C112550d0.m153785U(str17, new String[]{"."}, false, 0, 6, (Object) null);
                                if (U6.size() == 4) {
                                    str = "assistant.more" + '.' + ((String) U6.get(2));
                                } else {
                                    str = str6;
                                }
                                C51978xi1 xi17 = new C51978xi1();
                                xi17.f144674i = 3600;
                                xi17.f144669d = 400000;
                                xi17.f144686x = -4758357817339078452L;
                                xi17.f144670e = i26 + 30000;
                                xi17.f144677o = true;
                                LinkedList<C64586nn1> linkedList14 = xi17.f144672g;
                                C64586nn1 nn115 = new C64586nn1();
                                nn115.f184502d = 1;
                                nn115.f184515t = z7 ? 1 : 0;
                                nn115.f184506h = 1;
                                nn115.f184508j = str.length() == 0 ? "assistant.more" : str;
                                nn115.f184507i = str17;
                                linkedList14.add(nn115);
                                if (str.length() > 0) {
                                    LinkedList<C64586nn1> linkedList15 = xi17.f144672g;
                                    C64586nn1 nn116 = new C64586nn1();
                                    i = 1;
                                    nn116.f184502d = 1;
                                    nn116.f184506h = 2;
                                    nn116.f184508j = "assistant.more";
                                    nn116.f184507i = str;
                                    linkedList15.add(nn116);
                                } else {
                                    i = 1;
                                }
                                LinkedList<C64586nn1> linkedList16 = xi17.f144672g;
                                C64586nn1 nn117 = new C64586nn1();
                                nn117.f184502d = i;
                                nn117.f184506h = 2;
                                nn117.f184507i = "assistant.more";
                                linkedList16.add(nn117);
                                xi17.f144673h = String.valueOf(str17.hashCode());
                                C60152b4.C8759a.m8561a(((C60200t1) C86312j.m106911c(cls)).Nt0(), xi17, "mockAssistantMore", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                                i26 = i27;
                                z8 = false;
                            }
                        }
                        i26 = i27;
                        z8 = false;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: n5 */
    public C89132b<C51965xf0> mo85074n5(String str, String str2, int i, C49712hj1 hj12, int i2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "noticeId");
        return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13351n5(str, str2, i, hj12, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = r6.f182363I;
     */
    /* renamed from: nB */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo85075nB(te3.C64273c21 r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo85008I1(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            if (r6 == 0) goto L_0x0014
            te3.e61 r0 = r6.f182363I
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.f182921e
            if (r0 != r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x0029
            hg1.b r0 = r5.yx0()
            if (r6 == 0) goto L_0x0020
            long r3 = r6.f182392d
            goto L_0x0022
        L_0x0020:
            r3 = 0
        L_0x0022:
            boolean r6 = r0.mo9440jo(r3)
            if (r6 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo85075nB(te3.c21):boolean");
    }

    public void o90(Intent intent, Context context, long j, Long l, String str, String str2, String str3, String str4, String str5) {
        String str6 = str3;
        C87412m.m108594g(str, "nonceId");
        C87412m.m108594g(str6, "contextId");
        if (context != null && l != null) {
            ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(str6);
            ((C13883o1) C86312j.m106911c(C13883o1.class)).Uq0(intent, context, j, l.longValue(), str, str2, str3, str4, str5);
        }
    }

    public void ok0(AppCompatActivity appCompatActivity, C32224a<C13598b0> aVar) {
        FinderObject finderObject;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(aVar, "failCallback");
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        Class cls = C54991o.class;
        C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
        if (oVar != null && (finderObject = oVar.f154341n) != null) {
            C7335d c = C86312j.m106911c(C13883o1.class);
            C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
            C13883o1 o1Var = (C13883o1) c;
            FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16384);
            a.setMediaType(9);
            C13598b0 b0Var = C13598b0.f38549a;
            Bundle bundle = new Bundle();
            C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
            boolean z = true;
            if (oVar2 == null || !oVar2.f154301c3) {
                z = false;
            }
            if (z) {
                bundle.putBoolean("Retr_show_success_tips", false);
            }
            C13883o1.C13884a.m13254f(o1Var, appCompatActivity, a, bundle, 0, new C28569f5(appCompatActivity, aVar), 8, (Object) null);
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        ((C119157j) C119157j.f356862d).mo183876g(C28586r5.f78461d, "Finder.LiveExceptionMonitor");
        if (this.f171514n == null) {
            this.f171514n = new C33007b();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        MMApplicationContext.getContext().registerReceiver(this.f171514n, intentFilter);
        boolean z = true;
        C61926c.m72658C((String) null, C8719n0.f27959d, 1, (Object) null);
        String string = MultiProcessMMKV.getDefault().getString("FinderLiveHandOffUtil_current", (String) null);
        if (string != null) {
            if (string.length() <= 0) {
                z = false;
            }
            if (!z) {
                string = null;
            }
            if (string != null) {
                Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "delete not deleted HandOffKey " + string);
                ((C92331c) C86312j.m106911c(C92331c.class)).mo58349Bn(string);
                Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + null);
                MultiProcessMMKV.getDefault().remove("FinderLiveHandOffUtil_current");
            }
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        C2816v vVar = C2816v.f14072a;
        ConcurrentHashMap<String, ArrayList<C2816v.C2817a>> concurrentHashMap = C2816v.f14073b;
        synchronized (concurrentHashMap) {
            concurrentHashMap.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (this.f171514n != null) {
            MMApplicationContext.getContext().unregisterReceiver(this.f171514n);
        }
        this.f171514n = null;
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        mo58017LR();
    }

    /* renamed from: pP */
    public void mo85078pP(C60622a aVar) {
        if (aVar != null) {
            FinderLiveService.f159376d.getClass();
            C54806r1 r1Var = FinderLiveService.f159382j;
            r1Var.getClass();
            C61926c.m72668M(new C28580o1(r1Var, aVar));
        }
    }

    /* renamed from: pT */
    public boolean mo85079pT(String str, View view, View view2, long j) {
        return ((C61397g) C86312j.m106911c(C61397g.class)).Nj0(str, view, view2, j);
    }

    public void pj0(Context context, String str) {
        C64848y91 y912;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "extInfo");
        Intent intent = new Intent();
        C62042e.f176370a.getClass();
        Intent intent2 = null;
        if ((str.length() > 0 ? str : null) != null) {
            C104289g gVar = new C104289g(str);
            y912 = new C64848y91();
            C104289g m = gVar.optJSONObject("tag");
            C87412m.m108593f(m, "tag");
            C62042e.m72811x1(m, y912);
            C104289g m2 = m.optJSONObject("sub_tag");
            y912.f186456g = new C64848y91();
            C87412m.m108593f(m2, "subTag");
            C62042e.m72811x1(m2, y912.f186456g);
        } else {
            y912 = null;
        }
        if (y912 != null) {
            intent.putExtra("KEY_TAG_INFO", y912.toByteArray());
        }
        if (!(context instanceof Activity)) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1.C64917a.m76443j((C64916p1) c, context, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
        intent.setClass(context, FinderLivePostPendingUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "createFinderLive", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0182  */
    /* renamed from: pt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85081pt(org.json.JSONObject r23, boolean r24, ht1.C60216z4.C8821a<java.lang.Integer> r25, ht1.C60216z4.C8821a<java.lang.Object> r26, java.lang.String r27) {
        /*
            r22 = this;
            r1 = r23
            r2 = r26
            r0 = r27
            java.lang.String r3 = "by_pass_info"
            java.lang.String r4 = "extInfo"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "appid"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "feedID"
            java.lang.String r4 = r1.optString(r4)
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x001e
            r8 = r5
            goto L_0x001f
        L_0x001e:
            r8 = r4
        L_0x001f:
            java.lang.String r4 = "nonceID"
            java.lang.String r4 = r1.optString(r4)
            if (r4 != 0) goto L_0x0029
            r10 = r5
            goto L_0x002a
        L_0x0029:
            r10 = r4
        L_0x002a:
            java.lang.String r4 = "commentScene"
            int r4 = r1.optInt(r4)
            java.lang.String r6 = "reportExtraInfo"
            java.lang.String r15 = r1.optString(r6, r5)
            java.lang.String r7 = "sceneNote"
            java.lang.String r9 = r1.optString(r7, r5)
            java.lang.String r11 = "showRecommend"
            r12 = 0
            boolean r11 = r1.optBoolean(r11, r12)
            er1.j4 r13 = er1.C58739j4.f168176a
            boolean r13 = r13.mo83685N(r15)
            if (r13 == 0) goto L_0x004e
            r13 = 4
            goto L_0x004f
        L_0x004e:
            r13 = 2
        L_0x004f:
            java.util.UUID r18 = java.util.UUID.randomUUID()
            java.lang.String r14 = r18.toString()
            java.lang.String r12 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r14, r12)
            java.lang.String r12 = "-"
            r20 = r10
            r10 = 0
            java.lang.String r12 = z04.C112551y.m153814n(r14, r12, r5, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r4 = 45
            r10.append(r4)
            r10.append(r13)
            r10.append(r4)
            r13 = 65
            r10.append(r13)
            r10.append(r4)
            r10.append(r12)
            java.lang.String r14 = r10.toString()
            java.lang.String r4 = "bizId"
            r10 = 0
            int r4 = r1.optInt(r4, r10)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)
            if (r12 != 0) goto L_0x00a9
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r10] = r14
            r10 = 1
            r13[r10] = r0
            r10 = 2
            r13[r10] = r5
            r10 = 3
            r13[r10] = r5
            r10 = 21140(0x5294, float:2.9623E-41)
            r12.mo160131h(r10, r13)
        L_0x00a9:
            java.lang.Class<mr.m> r10 = p204mr.C61568m.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            mr.m r10 = (p204mr.C61568m) r10
            gy3.C87412m.m108593f(r9, r7)
            int r7 = r9.length()
            if (r7 <= 0) goto L_0x00bc
            r7 = 1
            goto L_0x00bd
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            if (r7 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r9 = r0
        L_0x00c1:
            r10.mo74891sS(r9)
            java.lang.Class<kq.h> r7 = p185kq.C10383h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            kq.h r7 = (p185kq.C10383h) r7
            r7.mo10697OK(r14)
            java.lang.Class<kq.g> r7 = p185kq.C61130g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            kq.g r7 = (p185kq.C61130g) r7
            java.lang.String r9 = "temp_13"
            r7.mo33246ry(r9)
            java.lang.String r7 = "MicroMsg.FinderLiveFeatureService"
            if (r24 != 0) goto L_0x00ee
            te3.j51 r4 = new te3.j51
            r4.<init>()
            r9 = 1
            r4.f135871d = r9
            r4.f135872e = r0
            r16 = r4
            goto L_0x0110
        L_0x00ee:
            te3.j51 r9 = new te3.j51
            r9.<init>()
            r10 = 2
            r9.f135871d = r10
            r9.f135872e = r0
            r9.f135873f = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "openFinderLive private, bizId:"
            r0.append(r10)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r16 = r9
        L_0x0110:
            r4 = 1
            rx3.l[] r0 = new rx3.C13604l[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            rx3.l r9 = new rx3.l
            java.lang.String r10 = "key_finder_show_recommend"
            r9.<init>(r10, r4)
            r4 = 0
            r0[r4] = r9
            java.util.Map r21 = sx3.C90364q0.m113148g(r0)
            java.lang.String r0 = "byPass"
            java.lang.String r0 = r1.optString(r0, r5)
            if (r0 != 0) goto L_0x012e
            r0 = r5
        L_0x012e:
            c30.g r9 = new c30.g     // Catch:{ Exception -> 0x0150 }
            r9.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = "by_pass_type"
            int r12 = r9.optInt(r0)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r0 = r9.optString(r3)     // Catch:{ Exception -> 0x014e }
            if (r0 != 0) goto L_0x0141
            r4 = r5
            goto L_0x0142
        L_0x0141:
            r4 = r0
        L_0x0142:
            java.lang.String r0 = r9.optString(r3)     // Catch:{ Exception -> 0x014b }
            if (r0 != 0) goto L_0x0149
            goto L_0x016a
        L_0x0149:
            r5 = r0
            goto L_0x016a
        L_0x014b:
            r0 = move-exception
            r5 = r4
            goto L_0x0152
        L_0x014e:
            r0 = move-exception
            goto L_0x0152
        L_0x0150:
            r0 = move-exception
            r12 = 0
        L_0x0152:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "openFinderLive ex:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x016a:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "key_enter_live_param_by_pass_type"
            r0.putExtra(r3, r12)
            java.lang.String r3 = "key_enter_live_param_by_pass_info"
            r0.putExtra(r3, r5)
            java.lang.String r3 = "adJSAPIType"
            int r3 = r1.optInt(r3)
            r4 = 1
            if (r3 != r4) goto L_0x0281
            te3.mp1 r3 = new te3.mp1
            r3.<init>()
            java.lang.String r4 = "feedId"
            java.lang.String r4 = r1.optString(r4)
            r3.f184367d = r4
            java.lang.String r4 = "nonceId"
            java.lang.String r4 = r1.optString(r4)
            r3.f184368e = r4
            java.lang.String r4 = "finderUserName"
            java.lang.String r4 = r1.optString(r4)
            r3.f184369f = r4
            java.lang.String r4 = "expReportLink"
            java.lang.String r4 = r1.optString(r4)
            r3.f184370g = r4
            java.lang.String r4 = "clkReportLink"
            java.lang.String r4 = r1.optString(r4)
            r3.f184371h = r4
            java.lang.String r4 = "reportInfo"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x01bd
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x01c6
        L_0x01bd:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r4 = r4.toString()
        L_0x01c6:
            r3.f184372i = r4
            org.json.JSONObject r4 = r1.optJSONObject(r6)
            if (r4 == 0) goto L_0x01d4
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x01dd
        L_0x01d4:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r4 = r4.toString()
        L_0x01dd:
            r3.f184375o = r4
            java.lang.String r4 = "clickPosMap"
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 == 0) goto L_0x01ed
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x01f6
        L_0x01ed:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r4 = r4.toString()
        L_0x01f6:
            r3.f184373j = r4
            java.lang.String r4 = "feedbackUrl"
            java.lang.String r1 = r1.optString(r4)
            r3.f184374n = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "adFlowInfo feedId:"
            r1.append(r4)
            java.lang.String r4 = r3.f184367d
            r1.append(r4)
            java.lang.String r4 = ", nonceId:"
            r1.append(r4)
            java.lang.String r4 = r3.f184368e
            r1.append(r4)
            java.lang.String r4 = ", finderUserName:"
            r1.append(r4)
            java.lang.String r4 = r3.f184369f
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "adFlowInfo expReportLink:"
            r1.append(r4)
            java.lang.String r4 = r3.f184370g
            r1.append(r4)
            java.lang.String r4 = ", clkReportLink:"
            r1.append(r4)
            java.lang.String r4 = r3.f184371h
            r1.append(r4)
            java.lang.String r4 = ", reportInfo:"
            r1.append(r4)
            java.lang.String r4 = r3.f184372i
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "adFlowInfo clickPosMap:"
            r1.append(r4)
            java.lang.String r4 = r3.f184373j
            r1.append(r4)
            java.lang.String r4 = ", feedbackUrl:"
            r1.append(r4)
            java.lang.String r4 = r3.f184374n
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            byte[] r1 = r3.toByteArray()
            java.lang.String r3 = "KEY_MINI_APP_AD_FLOW_INFO"
            r0.putExtra(r3, r1)
            hq1.C60091f.f171471a = r2
        L_0x0281:
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r3 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            r6 = r1
            tf0.p1 r6 = (tf0.C64916p1) r6
            r11 = 0
            hr.t$o0 r13 = new hr.t$o0
            r13.<init>(r2)
            java.lang.String r1 = "extraInfo"
            gy3.C87412m.m108593f(r15, r1)
            r17 = 0
            java.lang.String r7 = ""
            r9 = r25
            r10 = r20
            r19 = r0
            r20 = r21
            r6.mo76731z7(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo85081pt(org.json.JSONObject, boolean, ht1.z4$a, ht1.z4$a, java.lang.String):void");
    }

    public void pu0(String str, Context context, ViewGroup viewGroup, String str2, float f, int i, int i2, boolean z) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "promoteGroup");
        C87412m.m108594g(str2, "desc");
        C61866i0.f175909a.getClass();
        Log.m105924i(str, "addGuarentee " + str2);
        if (!(str2.length() == 0)) {
            TextView textView = new TextView(context);
            if (z) {
                textView.setBackgroundResource(C0966R.C0969drawable.cpd);
            } else {
                textView.setBackgroundResource(C0966R.C0969drawable.cpe);
            }
            textView.setTextColor(C76577a.m92153d(context, C0966R.color.aor));
            textView.setText(str2);
            textView.setTextSize(1, f);
            textView.setPadding(i, textView.getPaddingTop(), i, textView.getPaddingBottom());
            textView.setGravity(17);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i2, 0);
            viewGroup.addView(textView, layoutParams);
        }
    }

    /* renamed from: qY */
    public void mo85083qY(AppCompatActivity appCompatActivity) {
        FinderObject finderObject;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
        if (oVar != null && (finderObject = oVar.f154341n) != null) {
            C7335d c = C86312j.m106911c(C13883o1.class);
            C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
            C13883o1.C13884a.m13255g((C13883o1) c, appCompatActivity, new C0797z(FinderItem.Companion.mo79056a(finderObject, 16384)), (Bundle) null, 0, 0, 28, (Object) null);
        }
    }

    /* renamed from: r0 */
    public void mo85084r0(String str) {
        C87412m.m108594g(str, "json");
        C32434d.f86010d.getClass();
        Log.m105924i("Finder.FinderLiveNotifyFuncMsgExtension", "requestFinderLiveNotify");
        HashMap hashMap = new HashMap();
        hashMap.put(".sysmsg.functionmsg.cgi", "/cgi-bin/micromsg-bin/findergetlivetips");
        hashMap.put(".sysmsg.functionmsg.cmdid", "6407");
        hashMap.put(".sysmsg.functionmsg.functionmsgid", "client_findergetlivetips_" + C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
        hashMap.put(".sysmsg.functionmsg.businessid", String.valueOf(70001));
        hashMap.put(".sysmsg.functionmsg.reportid", "1559");
        hashMap.put(".sysmsg.functionmsg.successkey", "222");
        C32434d.f86011e = (String) hashMap.get(".sysmsg.functionmsg.functionmsgid");
        C32434d.f86013g = str;
        ((C36332a) ((C37461n0) C86312j.m106911c(C37461n0.class)).mo61109lG()).mo60622c(new C77949j3(), hashMap, "requestFinderLiveNotify");
    }

    /* renamed from: sN */
    public void mo85085sN(List<? extends Pair<Long, String>> list, C60606n.C60608b bVar, Context context) {
        C87412m.m108594g(list, "finderObjectList");
        C87412m.m108594g(bVar, "callback");
        if (list.isEmpty()) {
            Log.m105928w("MicroMsg.FinderLiveFeatureService", "batchGetLiveInfo: finderObject list is null!");
            return;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (Pair pair : list) {
            arrayList.add(new C13604l(pair.first, pair.second));
        }
        C60803l lVar = new C60803l(arrayList, 1, 0, (String) null, (String) null, 28, (C8480h) null);
        lVar.f172733o = false;
        C88629c J = C61926c.m72665J(lVar.mo9225i(), new C60117f(bVar));
        if (context != null && (context instanceof MMActivity)) {
            J.mo11397F((C9487b) context);
        }
    }

    /* renamed from: sb */
    public void mo85086sb(String str, C60606n.C60610e eVar) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "topic");
        C87412m.m108594g(eVar, "callback");
        FinderLiveService.f159376d.getClass();
        C54806r1 r1Var = FinderLiveService.f159382j;
        C54795n5 n5Var = FinderLiveService.f159396y;
        C45795b bVar = FinderLiveService.f159348A;
        r1Var.getClass();
        if (n5Var == null || bVar == null) {
            b0Var = null;
        } else {
            n5Var.mo75749q(str, new C54801p1(bVar, str, eVar));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            eVar.mo85563a(false, "invalid status");
        }
    }

    public void setVoiceCaptureVolume(int i) {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            Log.m105924i("MicroMsg.LiveCore", "setVoiceCaptureVolume volume:" + i);
            TXAudioEffectManager audioEffectManager = aVar.mo85679W().getAudioEffectManager();
            if (audioEffectManager != null) {
                audioEffectManager.setVoiceCaptureVolume(i);
            }
        }
    }

    public HashMap<Integer, C91753f.C66827b> sr0() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        int i = C66274t3.f190671z1;
        hashMap.put(633857321, C60123r.f171592a);
        return hashMap;
    }

    /* renamed from: tW */
    public void mo85089tW(Context context, C49352ez ezVar, C49712hj1 hj12, String str, String str2) {
        Context context2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(ezVar, "ticketInfo");
        C87412m.m108594g(str2, "enterScene");
        if ((context instanceof Activity) || (context2 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0()) == null) {
            context2 = context;
        }
        if (hj12 == null) {
            hj12 = ((C60172g4) C39818r.f106831a.mo62443b(context).mo62447c(C60172g4.class)).mo12861q3();
        }
        String valueOf = String.valueOf(hj12.f134675i);
        String str3 = hj12.f134671e;
        if (str3 == null) {
            str3 = "";
        }
        Log.m105924i("MicroMsg.FinderLiveFeatureService", "jumpToTicket commentScene: " + valueOf + ", contextId: " + str3);
        Intent intent = new Intent();
        intent.setClass(context2, FinderLiveConcertUI.class);
        intent.putExtra("concert_ticket_info_enter_scene", str2);
        intent.putExtra("concert_ticket_info_data", ezVar.toByteArray());
        intent.putExtra("concert_ticket_info_comment_scene", valueOf);
        intent.putExtra("concert_ticket_info_context_id", str3);
        intent.putExtra("concert_ticket_info_anchor_name", str);
        intent.putExtra("concert_ticket_info_enter_scene", str2);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context3 = context2;
        C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "jumpToGetConcertTicket", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/ConcertTicketInfo;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context3, "com/tencent/mm/feature/finder/live/FinderLiveFeatureService", "jumpToGetConcertTicket", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/ConcertTicketInfo;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public String tx0() {
        C104289g gVar = new C104289g();
        gVar.mo145953n("t2_switch", ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83772S5() ? 1 : 0);
        gVar.mo145953n("new_square_switch", Q30() ? 1 : 0);
        gVar.mo145953n("reddot_switch", mo85009IS() ? 1 : 0);
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "jsonObject.toString()");
        return C112551y.m153814n(gVar2, ",", ";", false);
    }

    /* renamed from: uI */
    public int mo85091uI(int i) {
        int i2 = C11269h.f33201a;
        if (i == 1) {
            return C0966R.C0969drawable.bp8;
        }
        if (i == 2) {
            return C0966R.C0969drawable.bp9;
        }
        if (i == 3) {
            return C0966R.C0969drawable.bp_;
        }
        if (i == 4) {
            return C0966R.C0969drawable.bpa;
        }
        if (i != 5) {
            return 0;
        }
        return C0966R.C0969drawable.bpb;
    }

    public void uq0(byte[] bArr, int i, int i2, long j) {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrame.timestamp = j;
            aVar.mo85679W().mixExternalAudioFrame(tRTCAudioFrame);
        }
    }

    /* renamed from: vB */
    public void mo85093vB(int i) {
        FinderLiveService.f159376d.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        if (n5Var != null) {
            n5Var.mo75727c(2, i, new C54751e5());
        }
    }

    /* renamed from: vK */
    public void mo85094vK(boolean z, boolean z2) {
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            aVar.mo85679W().enableMixExternalAudioFrame(z, z2);
        }
    }

    /* renamed from: va */
    public void mo85095va(String str, String str2, String str3, String str4) {
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C60127u0(str3, str4, str, str2, (C15601d<? super C60127u0>) null), 3, (Object) null);
    }

    public void vb0(ImageView imageView, TextView textView, ImageView imageView2) {
        Class cls = C11990s0.class;
        Class cls2 = C60200t1.class;
        C87412m.m108594g(imageView, "avator");
        C87412m.m108594g(textView, "nickname");
        C87412m.m108594g(imageView2, "author");
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        C39818r rVar = C39818r.f106831a;
        String str = null;
        ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(Util.nullAsNil(b != null ? b.getAvatarUrl() : null), C27696y.SMALL_AVATAR_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        C15064b bVar = C15064b.f41199a;
        Context context = imageView.getContext();
        C87412m.m108593f(context, "avator.context");
        C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
        if (b != null) {
            str = b.getNickname();
        }
        textView.setText(str);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        if (b != null) {
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            ((C60200t1) c).mo76826X(imageView2, b.field_authInfo, 1, C58960c.m68830b(b, false));
        }
    }

    /* renamed from: vi */
    public void mo85097vi(String str, C10407d dVar) {
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(dVar, "action");
        C33339a aVar = (C33339a) ((C36570n) this.f171520t).getValue();
        aVar.getClass();
        String jo = aVar.mo59077jo(str, dVar);
        synchronized (aVar) {
            C33316a aVar2 = new C33316a();
            aVar2.field_actionTag = jo;
            aVar2.field_actionTime = Util.nowMilliSecond();
            boolean replace = aVar.replace(aVar2);
            Log.m105918d("Finder.FinderLiveActionRecordStorage", "recordAction tag:" + jo + " suc:" + replace);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public Object vj0(Context context, long j, String str, ImageView imageView, int i, C15601d<? super C13598b0> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C8725u(this, i, context, j, str, imageView, (C15601d<? super C8725u>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }

    /* renamed from: wF */
    public void mo85099wF(boolean z, Context context) {
        FinderLiveService.f159376d.getClass();
        C61926c.m72668M(new C54808r4(z, context));
    }

    /* renamed from: ww */
    public C76242a3 mo85100ww() {
        return C31595x.f84430a;
    }

    public void x30(ImageView imageView, C61165t tVar, int i) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(tVar, "resType");
        imageView.setImageResource(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* renamed from: y7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85102y7(android.content.Context r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            boolean r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r2 == 0) goto L_0x0106
            if (r11 != 0) goto L_0x000f
            goto L_0x0106
        L_0x000f:
            zt3.t r2 = zt3.C119157j.f356862d
            cj1.w5 r3 = cj1.C28594w5.f78482d
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r4 = "Finder.LiveExceptionMonitor"
            r2.mo183876g(r3, r4)
            j50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r2 == 0) goto L_0x0021
            r2.mo75580f0()
        L_0x0021:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r2 == 0) goto L_0x002a
            gh1.j r3 = gh1.C59447j.f169870a
            r3.mo84553e(r2)
        L_0x002a:
            com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            r3 = 0
            if (r2 == 0) goto L_0x0034
            android.content.Context r2 = r2.getContext()
            goto L_0x0035
        L_0x0034:
            r2 = r3
        L_0x0035:
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r4 == 0) goto L_0x003c
            com.tencent.mm.plugin.finder.ui.MMFinderUI r2 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r2
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            r8 = 0
            r4 = 1
            if (r2 == 0) goto L_0x007a
            java.lang.Class r2 = r2.getClass()
            pt1.b r5 = pt1.C35640b.f95284a
            rx3.g r5 = pt1.C35640b.f95299p
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = gy3.C87412m.m108589b(r2, r5)
            if (r5 != 0) goto L_0x006a
            rx3.g r5 = pt1.C35640b.f95298o
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = gy3.C87412m.m108589b(r2, r5)
            if (r5 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r5 = 0
            goto L_0x006b
        L_0x006a:
            r5 = 1
        L_0x006b:
            if (r5 == 0) goto L_0x006e
            goto L_0x0078
        L_0x006e:
            rx3.g r2 = pt1.C35640b.f95298o
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Class r2 = (java.lang.Class) r2
        L_0x0078:
            if (r2 != 0) goto L_0x0086
        L_0x007a:
            pt1.b r2 = pt1.C35640b.f95284a
            rx3.g r2 = pt1.C35640b.f95298o
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Class r2 = (java.lang.Class) r2
        L_0x0086:
            if (r12 == 0) goto L_0x00b2
            androidx.lifecycle.i0 r5 = r0.mo77630e(r1)
            cl1.o r5 = (cl1.C54991o) r5
            if (r5 != 0) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r5.mo76027y4(r4)
        L_0x0094:
            androidx.lifecycle.i0 r5 = r0.mo77630e(r1)
            cl1.o r5 = (cl1.C54991o) r5
            if (r5 != 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r5.f154331j3 = r13
        L_0x009f:
            com.tencent.mm.plugin.finder.live.view.b r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r5 == 0) goto L_0x00a9
            d60.b$b r6 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
            r7 = 2
            d60.C58124b.C7172a.m7372a(r5, r6, r3, r7, r3)
        L_0x00a9:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r3 == 0) goto L_0x00b2
            gh1.j r5 = gh1.C59447j.f169870a
            r5.mo84549a(r3)
        L_0x00b2:
            androidx.lifecycle.i0 r0 = r0.mo77630e(r1)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 != 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r0.f154284Y2 = r8
        L_0x00bd:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.setClass(r11, r2)
            java.lang.String r1 = "route_to_maximize"
            r0.putExtra(r1, r4)
            r1 = 872415232(0x34000000, float:1.1920929E-7)
            r0.addFlags(r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r3 = "backToFinderLiveAnchorUIOnExternalLive"
            java.lang.String r4 = "(Landroid/content/Context;ZZ)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r11
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.mo10231a(r8)
            android.content.Intent r0 = (android.content.Intent) r0
            r11.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r2 = "backToFinderLiveAnchorUIOnExternalLive"
            java.lang.String r3 = "(Landroid/content/Context;ZZ)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r11
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p165hr.C60106t.mo85102y7(android.content.Context, boolean, boolean):void");
    }

    /* renamed from: yW */
    public void mo85103yW(long j, long j2, String str, String str2, C89349b bVar, LinkedList<String> linkedList, String str3, Context context, boolean z, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        Context context2 = context;
        String str4 = str;
        C87412m.m108594g(str4, "anchorUsername");
        LinkedList<String> linkedList2 = linkedList;
        C87412m.m108594g(linkedList2, "stockIds");
        String str5 = str3;
        C87412m.m108594g(str5, "noticeId");
        C87412m.m108594g(context2, "context");
        new C46505a1(j, j2, str4, str2, bVar, linkedList2, new C8723t0(pVar, context2, z), str5).mo9225i().mo11397F((MMActivity) context2);
    }

    public final C8527b yx0() {
        return (C8923b) ((C36570n) this.f171523w).getValue();
    }

    public void z40(Context context, String str, String str2, String str3, String str4, String str5) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
        String str6 = "";
        long P = C61926c.m72671P(str4 == null ? str6 : str4);
        if (str5 != null) {
            str6 = str5;
        }
        o1Var.mo13276ZK(context, str, str2, str3, P, C61926c.m72671P(str6));
    }

    public C64351ey0 zg0() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159382j.f153637b;
    }

    public void zr0(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        C87412m.m108594g(context, "context");
        C13883o1 o1Var = (C13883o1) C86312j.m106911c(C13883o1.class);
        Intent intent = new Intent();
        Integer num = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (!(activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            num = Integer.valueOf(defaultDisplay.getRotation());
        }
        if (num != null && num.intValue() == 1) {
            intent.putExtra("LANDSCAPE_TYPE", 1);
        } else if (num != null && num.intValue() == 3) {
            intent.putExtra("LANDSCAPE_TYPE", 2);
        } else {
            intent.putExtra("LANDSCAPE_TYPE", 0);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        o1Var.za0(context, intent);
    }

    public final C8925e zx0() {
        return (C8925e) ((C36570n) this.f171515o).getValue();
    }
}

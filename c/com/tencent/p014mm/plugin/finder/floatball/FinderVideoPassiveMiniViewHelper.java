package com.tencent.p014mm.plugin.finder.floatball;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.finder.feed.p052ui.BizProfileTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAtTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFriendLikeTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiTimelineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI;
import com.tencent.p014mm.plugin.finder.floatball.BaseFinderMiniViewHelper;
import com.tencent.p014mm.plugin.finder.megavideo.p053ui.FinderMegaVideoMiniView;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderLikedFeedUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderFeedDetailUI;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C7435f2;
import em1.C58636b;
import er1.C58752o;
import er1.C58794z;
import fs3.C59314b;
import fs3.C59318d;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59670o2;
import gr1.C59673q2;
import gr1.C59684w2;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60157c5;
import ht1.C60171g1;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.ResultKt;
import nc3.C34767b;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import p182kk.C61104a;
import rs1.C63566lb;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C110826x0;
import te3.C49712hj1;
import te3.C64689rq2;
import te3.C64726td1;
import te3.C64897zv2;
import up1.C37521f;
import vc3.C78382a;
import wx3.C15601d;
import wx3.C66212f;
import xv0.C112185h;
import xv0.C53451i;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper */
public final class FinderVideoPassiveMiniViewHelper extends BaseFinderMiniViewHelper {

    /* renamed from: D */
    public static final C55856d f159083D = new C55856d((C8480h) null);

    /* renamed from: E */
    public static final C13601g<Set<Class<? extends MMFinderFeedDetailUI>>> f159084E = C36568h.m40985a(C3115c.f14982d);

    /* renamed from: F */
    public static final C13601g<FinderVideoPassiveMiniViewHelper> f159085F = C36568h.m40986b(C13602i.SYNCHRONIZED, C55855b.f159096d);

    /* renamed from: G */
    public static final C112185h f159086G = new C55853a();

    /* renamed from: A */
    public int f159087A;

    /* renamed from: B */
    public boolean f159088B = true;

    /* renamed from: C */
    public final FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1 f159089C = new FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1(this, C40008f.f107254d);

    /* renamed from: v */
    public C55857e f159090v;

    /* renamed from: w */
    public C59670o2 f159091w;

    /* renamed from: x */
    public C58636b f159092x;

    /* renamed from: y */
    public C55857e f159093y;

    /* renamed from: z */
    public String f159094z;

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$c */
    public static final class C3115c extends C87413o implements C32224a<Set<? extends Class<? extends MMFinderFeedDetailUI>>> {

        /* renamed from: d */
        public static final C3115c f14982d = new C3115c();

        public C3115c() {
            super(0);
        }

        public Object invoke() {
            return C110826x0.m151017e(FinderHomeUI.class, FinderHomeAffinityUI.class, FinderShareFeedRelUI.class, BizProfileTimelineUI.class, FinderTopicTimelineUI.class, FinderProfileTimeLineUI.class, FinderAtTimelineUI.class, FinderFavTimelineUI.class, FinderPoiTimelineUI.class, FinderFriendLikeTimelineUI.class, FinderLikedFeedUI.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$a */
    public static final class C55853a extends C53451i {

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$Companion$floatBallInfoEventListener$1$onAddMessageFloatBall$1", mo125469f = "FinderVideoPassiveMiniViewHelper.kt", mo125470l = {154}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$a$a */
        public static final class C55854a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f159095d;

            public C55854a(C15601d<? super C55854a> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C55854a(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C55854a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f159095d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinderVideoPassiveMiniViewHelper a = FinderVideoPassiveMiniViewHelper.f159083D.mo77472a();
                    this.f159095d = 1;
                    if (a.mo77464H0(true, true, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: D2 */
        public void mo74085D2(BallInfo ballInfo) {
            C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
            boolean O0 = dVar.mo77472a().mo77471O0(false, true);
            C7435f2 f2Var = C7435f2.f25626a;
            String str = O0 ? "button_pause_play_by_float_frame" : "button_goon_play_by_float_frame";
            JSONObject jSONObject = new JSONObject();
            String str2 = dVar.mo77472a().f159094z;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("float_frame_id", str2);
            jSONObject.put("float_frame_create_type", String.valueOf(dVar.mo77472a().f159087A));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a((C49712hj1) null, str, 1, jSONObject);
        }

        /* renamed from: G1 */
        public void mo64040G1(BallInfo ballInfo) {
        }

        /* renamed from: c2 */
        public void mo64042c2(BallInfo ballInfo) {
            Log.m105924i("FinderVideoPassive", "onFloatBallInfoRemoved: ballInfo=" + ballInfo);
            boolean z = false;
            if (ballInfo != null && ballInfo.f311686d == 32) {
                z = true;
            }
            if (z) {
                FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77454E0();
            }
        }

        /* renamed from: f5 */
        public void mo74087f5(BallInfo ballInfo) {
            C7435f2 f2Var = C7435f2.f25626a;
            JSONObject jSONObject = new JSONObject();
            C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
            String str = dVar.mo77472a().f159094z;
            if (str == null) {
                str = "";
            }
            jSONObject.put("float_frame_id", str);
            jSONObject.put("float_frame_create_type", String.valueOf(dVar.mo77472a().f159087A));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a((C49712hj1) null, "button_close_float_frame", 1, jSONObject);
            dVar.mo77472a().f311726d.f311683H.f311721j = 14;
            dVar.mo77472a().f311726d.f311697r = true;
            dVar.mo77472a().mo77454E0();
            C63566lb.C13324a.m12677a((C63566lb) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C63566lb.class), false, (Context) null, 2, (Object) null);
        }

        /* renamed from: u5 */
        public boolean mo74089u5(BallInfo ballInfo) {
            C37521f.f99374d.getClass();
            if (C37521f.f99450l6.mo60266n().intValue() != 1) {
                Log.m105924i("FinderVideoPassive", "addMiniView: FINDER_PASSIVE_VIDEO_SWITCH is close");
                return true;
            }
            FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo77470N0();
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, C53934p0.UNDISPATCHED, new C55854a((C15601d<? super C55854a>) null), 1, (Object) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$b */
    public static final class C55855b extends C87413o implements C32224a<FinderVideoPassiveMiniViewHelper> {

        /* renamed from: d */
        public static final C55855b f159096d = new C55855b();

        public C55855b() {
            super(0);
        }

        public Object invoke() {
            return new FinderVideoPassiveMiniViewHelper();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$d */
    public static final class C55856d {
        public C55856d(C8480h hVar) {
        }

        /* renamed from: a */
        public final FinderVideoPassiveMiniViewHelper mo77472a() {
            return FinderVideoPassiveMiniViewHelper.f159085F.getValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e */
    public final class C55857e {

        /* renamed from: a */
        public C59673q2 f159097a;

        /* renamed from: b */
        public long f159098b;

        /* renamed from: c */
        public float f159099c = 1.0f;

        /* renamed from: d */
        public C49712hj1 f159100d;

        /* renamed from: e */
        public boolean f159101e;

        /* renamed from: f */
        public int f159102f;

        /* renamed from: g */
        public FeedData f159103g;

        /* renamed from: h */
        public C64726td1 f159104h;

        /* renamed from: i */
        public boolean f159105i;

        /* renamed from: j */
        public Size f159106j;

        /* renamed from: k */
        public C64897zv2 f159107k;

        /* renamed from: l */
        public Class<?> f159108l;

        /* renamed from: m */
        public Bundle f159109m;

        public C55857e(FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper", mo125469f = "FinderVideoPassiveMiniViewHelper.kt", mo125470l = {268}, mo125471m = "addMiniView")
    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$f */
    public static final class C55858f extends C66704d {

        /* renamed from: d */
        public Object f159110d;

        /* renamed from: e */
        public /* synthetic */ Object f159111e;

        /* renamed from: f */
        public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159112f;

        /* renamed from: g */
        public int f159113g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55858f(FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper, C15601d<? super C55858f> dVar) {
            super(dVar);
            this.f159112f = finderVideoPassiveMiniViewHelper;
        }

        public final Object invokeSuspend(Object obj) {
            this.f159111e = obj;
            this.f159113g |= Integer.MIN_VALUE;
            return this.f159112f.mo77464H0(false, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$addMiniView$2$1", mo125469f = "FinderVideoPassiveMiniViewHelper.kt", mo125470l = {270}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$g */
    public static final class C55859g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f159114d;

        /* renamed from: e */
        public final /* synthetic */ Activity f159115e;

        /* renamed from: f */
        public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159116f;

        /* renamed from: g */
        public final /* synthetic */ boolean f159117g;

        /* renamed from: h */
        public final /* synthetic */ C8477a0 f159118h;

        /* renamed from: i */
        public final /* synthetic */ boolean f159119i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55859g(Activity activity, FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper, boolean z, C8477a0 a0Var, boolean z2, C15601d<? super C55859g> dVar) {
            super(2, dVar);
            this.f159115e = activity;
            this.f159116f = finderVideoPassiveMiniViewHelper;
            this.f159117g = z;
            this.f159118h = a0Var;
            this.f159119i = z2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55859g(this.f159115e, this.f159116f, this.f159117g, this.f159118h, this.f159119i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55859g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f159114d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58794z zVar = C58794z.f168327a;
                Activity activity = this.f159115e;
                String string = activity.getString(C0966R.string.f361027gr3);
                C87412m.m108593f(string, "it.getString(R.string.me…permission_alert_content)");
                String b = C78382a.m94650b();
                C87412m.m108593f(b, "getMessageChannelIdUse()");
                this.f159114d = 1;
                obj2 = zVar.mo83987b(activity, 32, string, false, true, b, 20000, "finderfloatpermission", this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                } catch (Throwable th) {
                    FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper = this.f159116f;
                    C55856d dVar = FinderVideoPassiveMiniViewHelper.f159083D;
                    finderVideoPassiveMiniViewHelper.mo77470N0();
                    Log.m105925i("FinderVideoPassive", "coroutine cancel throw: " + th.getMessage(), th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C58752o oVar = (C58752o) obj2;
            if (oVar instanceof C58752o.C58755c) {
                FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper2 = this.f159116f;
                boolean z = this.f159117g;
                boolean z2 = this.f159118h.f27482d;
                boolean z3 = this.f159119i;
                C55856d dVar2 = FinderVideoPassiveMiniViewHelper.f159083D;
                finderVideoPassiveMiniViewHelper2.mo77467K0(z, z2, z3);
            } else {
                if (oVar instanceof C58752o.C58754b ? true : oVar instanceof C58752o.C58753a) {
                    FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper3 = this.f159116f;
                    C55856d dVar3 = FinderVideoPassiveMiniViewHelper.f159083D;
                    finderVideoPassiveMiniViewHelper3.mo77470N0();
                } else if (oVar instanceof C58752o.C58756d) {
                    Log.m105924i("FinderVideoPassive", "ShowWarningAlert timeout");
                    FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper4 = this.f159116f;
                    C55856d dVar4 = FinderVideoPassiveMiniViewHelper.f159083D;
                    finderVideoPassiveMiniViewHelper4.mo77470N0();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$h */
    public static final class C55860h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnClickListener f159120d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159121e;

        public C55860h(View.OnClickListener onClickListener, FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper) {
            this.f159120d = onClickListener;
            this.f159121e = finderVideoPassiveMiniViewHelper;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7435f2 f2Var = C7435f2.f25626a;
            JSONObject jSONObject = new JSONObject();
            FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper = this.f159121e;
            String str = finderVideoPassiveMiniViewHelper.f159094z;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject.put("float_frame_id", str);
            String valueOf = String.valueOf(finderVideoPassiveMiniViewHelper.f159087A);
            if (valueOf != null) {
                str2 = valueOf;
            }
            jSONObject.put("float_frame_create_type", str2);
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a((C49712hj1) null, "button_close_float_frame", 1, jSONObject);
            this.f159120d.onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateCloseClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$i */
    public static final class C55861i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159122d;

        public C55861i(FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper) {
            this.f159122d = finderVideoPassiveMiniViewHelper;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
            r1 = r1.f159100d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x01d0  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0160  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
                r18 = this;
                r6 = r18
                java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r19
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateWindowClickListener$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r18
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r1 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r1.f159093y
                r2 = 0
                if (r1 == 0) goto L_0x0035
                te3.hj1 r1 = r1.f159100d
                if (r1 == 0) goto L_0x0035
                int r1 = r1.f134675i
                goto L_0x0036
            L_0x0035:
                r1 = 0
            L_0x0036:
                java.lang.String r3 = "key_extra_info"
                java.lang.String r4 = "{\"floatWindowType\":1}"
                r0.putExtra(r3, r4)
                java.lang.String r3 = "key_need_change_reporter"
                r4 = 1
                r0.putExtra(r3, r4)
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.ball.model.BallInfo r3 = r3.f311726d
                java.lang.String r3 = r3.f311688f
                java.lang.String r5 = "FLOAT_BALL_KEY"
                r0.putExtra(r5, r3)
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.ball.model.BallInfo r3 = r3.f311726d
                int r3 = r3.f311686d
                r5 = 20
                if (r3 != r5) goto L_0x005b
                r3 = 1
                goto L_0x005c
            L_0x005b:
                r3 = 0
            L_0x005c:
                java.lang.String r5 = "IS_PASSIVE_KEY"
                r0.putExtra(r5, r3)
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r3.f159093y
                r5 = 0
                if (r3 == 0) goto L_0x006b
                java.lang.Class<?> r3 = r3.f159108l
                goto L_0x006c
            L_0x006b:
                r3 = r5
            L_0x006c:
                java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeUI> r8 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI.class
                boolean r3 = gy3.C87412m.m108589b(r3, r8)
                if (r3 != 0) goto L_0x0089
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r3.f159093y
                if (r3 == 0) goto L_0x007d
                java.lang.Class<?> r3 = r3.f159108l
                goto L_0x007e
            L_0x007d:
                r3 = r5
            L_0x007e:
                java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI> r8 = com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI.class
                boolean r3 = gy3.C87412m.m108589b(r3, r8)
                if (r3 == 0) goto L_0x0087
                goto L_0x0089
            L_0x0087:
                r3 = 0
                goto L_0x008a
            L_0x0089:
                r3 = 1
            L_0x008a:
                if (r3 != 0) goto L_0x0099
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r8 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r8 = r8.f159093y
                if (r8 == 0) goto L_0x0099
                android.os.Bundle r8 = r8.f159109m
                if (r8 == 0) goto L_0x0099
                r0.putExtras(r8)
            L_0x0099:
                java.lang.ref.WeakReference r8 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
                if (r8 == 0) goto L_0x00a8
                java.lang.Object r8 = r8.get()
                android.app.Activity r8 = (android.app.Activity) r8
                if (r8 == 0) goto L_0x00a8
                goto L_0x00ac
            L_0x00a8:
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            L_0x00ac:
                r15 = r8
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r8 = r6.f159122d
                gr1.o2 r8 = r8.f159091w
                boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r9 == 0) goto L_0x00b8
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r8 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r8
                goto L_0x00b9
            L_0x00b8:
                r8 = r5
            L_0x00b9:
                java.lang.String r9 = "KEY_VIDEO_START_PLAY_TIME_MS"
                if (r8 == 0) goto L_0x00cd
                long r10 = r8.getCurrentPlayMs()
                r0.putExtra(r9, r10)
                float r8 = r8.getPlaySpeedRatio()
                java.lang.String r10 = "KEY_VIDEO_PLAY_SPEED_RATIO"
                r0.putExtra(r10, r8)
            L_0x00cd:
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r8 = r6.f159122d
                em1.b r8 = r8.f159092x
                if (r8 == 0) goto L_0x00da
                long r10 = r8.mo83512a()
                r0.putExtra(r9, r10)
            L_0x00da:
                dp1.f2 r8 = dp1.C7435f2.f25626a
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r10 = r6.f159122d
                java.lang.String r11 = r10.f159094z
                java.lang.String r14 = ""
                if (r11 != 0) goto L_0x00ea
                r11 = r14
            L_0x00ea:
                java.lang.String r12 = "float_frame_id"
                r9.put(r12, r11)
                int r10 = r10.f159087A
                java.lang.String r10 = java.lang.String.valueOf(r10)
                if (r10 != 0) goto L_0x00f8
                r10 = r14
            L_0x00f8:
                java.lang.String r11 = "float_frame_create_type"
                r9.put(r11, r10)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                java.lang.String r10 = "button_goback_finder_from_float_frame"
                r8.mo8577a(r5, r10, r4, r9)
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r8 = r6.f159122d
                gr1.o2 r9 = r8.f159091w
                if (r9 == 0) goto L_0x010f
                boolean r8 = r9.isPlaying()
                goto L_0x0119
            L_0x010f:
                em1.b r8 = r8.f159092x
                if (r8 == 0) goto L_0x0118
                boolean r8 = r8.isPlaying()
                goto L_0x0119
            L_0x0118:
                r8 = 0
            L_0x0119:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "generateWindowClickListener: isPlaying = "
                r9.append(r10)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                java.lang.String r13 = "FinderVideoPassive"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r9)
                r9 = 0
                if (r8 == 0) goto L_0x0141
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r8 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r8 = r8.f159093y
                if (r8 == 0) goto L_0x0141
                com.tencent.mm.plugin.finder.storage.FeedData r8 = r8.f159103g
                if (r8 == 0) goto L_0x0141
                long r9 = r8.getFeedId()
            L_0x0141:
                java.lang.String r8 = "KEY_ENTER_PLAYING_FEED_ID"
                r0.putExtra(r8, r9)
                di3.d r8 = di3.C86312j.m106911c(r7)
                ht1.t1 r8 = (ht1.C60200t1) r8
                r9 = 8
                r10 = 6
                r8.mo76842e7(r9, r10, r1, r0)
                di3.d r1 = di3.C86312j.m106911c(r7)
                ht1.t1 r1 = (ht1.C60200t1) r1
                r7 = 2
                r1.mo76876sZ(r7, r0)
                java.lang.String r1 = "context"
                if (r3 == 0) goto L_0x01d0
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r3.f159093y
                if (r3 == 0) goto L_0x019c
                te3.hj1 r3 = r3.f159100d
                if (r3 == 0) goto L_0x019c
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                dp1.y0 r8 = (dp1.C58417y0) r8
                int r3 = r3.f134675i
                int r3 = r8.Xy0(r3)
                if (r3 == r4) goto L_0x0187
                r8 = 3
                if (r3 == r8) goto L_0x0184
                r8 = 4
                if (r3 == r8) goto L_0x0181
                goto L_0x0189
            L_0x0181:
                java.lang.String r14 = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB"
                goto L_0x0189
            L_0x0184:
                java.lang.String r14 = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB"
                goto L_0x0189
            L_0x0187:
                java.lang.String r14 = "KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB"
            L_0x0189:
                int r3 = r14.length()
                if (r3 <= 0) goto L_0x0191
                r3 = 1
                goto L_0x0192
            L_0x0191:
                r3 = 0
            L_0x0192:
                if (r3 == 0) goto L_0x0197
                r0.putExtra(r14, r4)
            L_0x0197:
                java.lang.String r3 = "KEY_FORCE_NOT_REFRESH_FIRST_TIME"
                r0.putExtra(r3, r4)
            L_0x019c:
                gy3.C87412m.m108593f(r15, r1)
                vv0.C65884b.m77630b(r15, r0, r4)
                java.lang.Class<er1.b> r1 = er1.C58684b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er1.b r1 = (er1.C58684b) r1
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r3.f159093y
                if (r3 == 0) goto L_0x01b6
                boolean r3 = r3.f159101e
                if (r3 != r4) goto L_0x01b6
                r3 = 1
                goto L_0x01b7
            L_0x01b6:
                r3 = 0
            L_0x01b7:
                if (r3 == 0) goto L_0x01ba
                goto L_0x01bb
            L_0x01ba:
                r10 = 2
            L_0x01bb:
                r1.ay0(r15, r0, r10, r2)
                boolean r0 = r15 instanceof android.app.Activity
                if (r0 == 0) goto L_0x01c5
                r5 = r15
                android.app.Activity r5 = (android.app.Activity) r5
            L_0x01c5:
                if (r5 == 0) goto L_0x01cd
                r0 = 2130771992(0x7f010018, float:1.714709E38)
                r5.overridePendingTransition(r0, r0)
            L_0x01cd:
                r5 = r13
                goto L_0x02a5
            L_0x01d0:
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r3.f159093y
                if (r3 == 0) goto L_0x024b
                te3.zv2 r3 = r3.f159107k
                if (r3 == 0) goto L_0x024b
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r3.f186888j
                java.lang.String r8 = "it.cacheNewVideoList"
                gy3.C87412m.m108593f(r7, r8)
                java.util.ArrayList r10 = new java.util.ArrayList
                r8 = 10
                int r8 = sx3.C36907w.m41090l(r7, r8)
                r10.<init>(r8)
                java.util.Iterator r7 = r7.iterator()
            L_0x01f0:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0211
                java.lang.Object r8 = r7.next()
                com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
                com.tencent.mm.plugin.finder.storage.FinderItem$a r9 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                java.lang.String r11 = "feedObject"
                gy3.C87412m.m108593f(r8, r11)
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r9.mo79056a(r8, r4)
                wp1.f$a r9 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r9.mo14348k(r8)
                r10.add(r8)
                goto L_0x01f0
            L_0x0211:
                boolean r7 = r10.isEmpty()
                r7 = r7 ^ r4
                if (r7 == 0) goto L_0x0230
                er1.w3 r8 = er1.C58784w3.f168295a
                int r9 = r3.f186884f
                pe3.b r11 = r3.f186886h
                r7 = 0
                r16 = 16
                r17 = 0
                r12 = r0
                r5 = r13
                r13 = r7
                r7 = r14
                r14 = r16
                r2 = r15
                r15 = r17
                er1.C58784w3.m68427B1(r8, r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0233
            L_0x0230:
                r5 = r13
                r7 = r14
                r2 = r15
            L_0x0233:
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f186893r
                if (r3 == 0) goto L_0x024d
                java.lang.String r8 = "feed_encrypted_object_id"
                r0.putExtra(r8, r7)
                long r7 = r3.f164794id
                java.lang.String r9 = "feed_object_id"
                r0.putExtra(r9, r7)
                java.lang.String r3 = r3.objectNonceId
                java.lang.String r7 = "feed_object_nonceId"
                r0.putExtra(r7, r3)
                goto L_0x024d
            L_0x024b:
                r5 = r13
                r2 = r15
            L_0x024d:
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r3 = r6.f159122d
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r3.f159093y
                if (r3 == 0) goto L_0x02a5
                java.lang.Class<?> r3 = r3.f159108l
                if (r3 == 0) goto L_0x02a5
                r0.setClass(r2, r3)
                boolean r3 = r2 instanceof android.app.Activity
                if (r3 != 0) goto L_0x0260
                r3 = r0
                goto L_0x0261
            L_0x0260:
                r3 = 0
            L_0x0261:
                if (r3 == 0) goto L_0x0268
                r7 = 268435456(0x10000000, float:2.5243549E-29)
                r3.addFlags(r7)
            L_0x0268:
                gy3.C87412m.m108593f(r2, r1)
                vv0.C65884b.m77630b(r2, r0, r4)
                k20.a r1 = new k20.a
                r1.<init>()
                r1.mo10233c(r0)
                java.lang.Object[] r10 = r1.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateWindowClickListener$1"
                java.lang.String r12 = "onClick"
                java.lang.String r13 = "(Landroid/view/View;)V"
                java.lang.String r14 = "Undefined"
                java.lang.String r15 = "startActivity"
                java.lang.String r16 = "(Landroid/content/Intent;)V"
                r9 = r2
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                r0 = 0
                java.lang.Object r1 = r1.mo10231a(r0)
                android.content.Intent r1 = (android.content.Intent) r1
                r2.startActivity(r1)
                java.lang.String r10 = "com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateWindowClickListener$1"
                java.lang.String r11 = "onClick"
                java.lang.String r12 = "(Landroid/view/View;)V"
                java.lang.String r13 = "Undefined"
                java.lang.String r14 = "startActivity"
                java.lang.String r15 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            L_0x02a5:
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r0 = r6.f159122d
                com.tencent.mm.plugin.ball.model.BallInfo r0 = r0.f311726d
                com.tencent.mm.plugin.ball.model.BallReportInfo r0 = r0.f311683H
                r0.f311721j = r4
                java.lang.Class<pn.e> r0 = p646pn.C110234e.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                pn.e r0 = (p646pn.C110234e) r0
                xv0.e r0 = r0.mo161399pY()
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r1 = r6.f159122d
                com.tencent.mm.plugin.ball.model.BallInfo r1 = r1.f311726d
                r2 = 0
                r0.mo149083A(r1, r2)
                java.lang.Object[] r0 = new java.lang.Object[r4]
                com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper r1 = r6.f159122d
                com.tencent.mm.plugin.ball.model.BallInfo r1 = r1.f311726d
                java.lang.String r1 = r1.f311688f
                r0[r2] = r1
                java.lang.String r1 = "startFinderFeed key: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
                java.lang.String r0 = "com/tencent/mm/plugin/finder/floatball/FinderVideoPassiveMiniViewHelper$generateWindowClickListener$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.C55861i.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$j */
    public static final class C55862j extends FinderMegaVideoMiniView.C56149b {

        /* renamed from: a */
        public boolean f159123a = true;

        /* renamed from: b */
        public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159124b;

        /* renamed from: c */
        public final /* synthetic */ long f159125c;

        /* renamed from: d */
        public final /* synthetic */ float f159126d;

        /* renamed from: e */
        public final /* synthetic */ boolean f159127e;

        /* renamed from: f */
        public final /* synthetic */ FinderThumbPlayerProxy f159128f;

        /* renamed from: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$j$a */
        public static final class C55863a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderVideoPassiveMiniViewHelper f159129d;

            /* renamed from: e */
            public final /* synthetic */ long f159130e;

            /* renamed from: f */
            public final /* synthetic */ float f159131f;

            /* renamed from: g */
            public final /* synthetic */ boolean f159132g;

            /* renamed from: h */
            public final /* synthetic */ FinderThumbPlayerProxy f159133h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55863a(FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper, long j, float f, boolean z, FinderThumbPlayerProxy finderThumbPlayerProxy) {
                super(0);
                this.f159129d = finderVideoPassiveMiniViewHelper;
                this.f159130e = j;
                this.f159131f = f;
                this.f159132g = z;
                this.f159133h = finderThumbPlayerProxy;
            }

            public Object invoke() {
                FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper = this.f159129d;
                C59670o2 o2Var = finderVideoPassiveMiniViewHelper.f159091w;
                FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var : null;
                if (finderThumbPlayerProxy != null) {
                    long j = this.f159130e;
                    float f = this.f159131f;
                    boolean z = this.f159132g;
                    FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f159133h;
                    boolean z2 = true;
                    if (j > 0) {
                        finderThumbPlayerProxy.mo79450W(j, true, 3);
                    }
                    finderThumbPlayerProxy.setPlaySpeed(f);
                    if (!z) {
                        C55857e eVar = finderVideoPassiveMiniViewHelper.f159093y;
                        if (eVar == null || !eVar.f159105i) {
                            z2 = false;
                        }
                        if (!z2) {
                            finderVideoPassiveMiniViewHelper.mo77450A0().getClass();
                        }
                    }
                    finderThumbPlayerProxy2.pause();
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55862j(FinderVideoPassiveMiniViewHelper finderVideoPassiveMiniViewHelper, long j, float f, boolean z, FinderThumbPlayerProxy finderThumbPlayerProxy, FinderMegaVideoMiniView finderMegaVideoMiniView) {
            super(finderMegaVideoMiniView);
            this.f159124b = finderVideoPassiveMiniViewHelper;
            this.f159125c = j;
            this.f159126d = f;
            this.f159127e = z;
            this.f159128f = finderThumbPlayerProxy;
        }

        /* renamed from: e */
        public void mo77475e(C64689rq2 rq22) {
            if (this.f159123a) {
                C61926c.m72668M(new C55863a(this.f159124b, this.f159125c, this.f159126d, this.f159127e, this.f159128f));
                this.f159123a = false;
            }
        }
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        getReportInfo().f311717f = 24;
    }

    /* renamed from: C0 */
    public void mo77452C0() {
        mo77471O0(true, false);
    }

    /* renamed from: D0 */
    public void mo77453D0() {
        super.mo77453D0();
        this.f159089C.dead();
    }

    /* renamed from: E0 */
    public boolean mo77454E0() {
        C59318d eventDetector;
        C59314b eventDetectorAdapter;
        C59670o2 o2Var = this.f159091w;
        if (!(o2Var == null || (eventDetector = o2Var.getEventDetector()) == null || (eventDetectorAdapter = eventDetector.getEventDetectorAdapter()) == null)) {
            eventDetectorAdapter.mo84415a((View) null);
        }
        mo77470N0();
        this.f159090v = null;
        this.f159093y = null;
        return super.mo77454E0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77464H0(boolean r16, boolean r17, wx3.C15601d<? super java.lang.Boolean> r18) {
        /*
            r15 = this;
            r7 = r15
            r3 = r16
            r5 = r17
            r0 = r18
            java.lang.Class<tf0.q1> r1 = tf0.C13887q1.class
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.C55858f
            if (r2 == 0) goto L_0x001c
            r2 = r0
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$f r2 = (com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.C55858f) r2
            int r4 = r2.f159113g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r4 & r6
            if (r8 == 0) goto L_0x001c
            int r4 = r4 - r6
            r2.f159113g = r4
            goto L_0x0021
        L_0x001c:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$f r2 = new com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$f
            r2.<init>(r15, r0)
        L_0x0021:
            r8 = r2
            java.lang.Object r0 = r8.f159111e
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r8.f159113g
            java.lang.String r10 = "FinderVideoPassive"
            r4 = 0
            r11 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r11) goto L_0x0035
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00e8
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r0)
            if (r5 == 0) goto L_0x004b
            boolean r0 = r15.mo77465I0(r16, r17)
            if (r0 != 0) goto L_0x004b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x004b:
            gy3.a0 r6 = new gy3.a0
            r6.<init>()
            if (r3 != 0) goto L_0x0093
            rx3.g<wl1.a> r0 = wl1.C66138a.f190116v
            rx3.g<wl1.a> r0 = wl1.C66138a.f190116v
            java.lang.Object r0 = r0.getValue()
            wl1.a r0 = (wl1.C66138a) r0
            boolean r0 = r0.mo77454E0()
            r6.f27482d = r0
            r0 = 0
            boolean r0 = p182kk.C61104a.m71656l(r4, r0)
            java.lang.String r2 = "getService(IFinderCommonLiveService::class.java)"
            if (r0 == 0) goto L_0x0079
            di3.d r0 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r0, r2)
            tf0.q1 r0 = (tf0.C13887q1) r0
            r0.mo13358sY(r11)
            r6.f27482d = r11
        L_0x0079:
            di3.d r0 = di3.C86312j.m106911c(r1)
            tf0.q1 r0 = (tf0.C13887q1) r0
            boolean r0 = r0.mo13346ib()
            if (r0 == 0) goto L_0x0093
            di3.d r0 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r0, r2)
            tf0.q1 r0 = (tf0.C13887q1) r0
            r0.Ut0(r11)
            r6.f27482d = r11
        L_0x0093:
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 32
            boolean r0 = r0.mo125776TW(r1, r2)
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "addVideoFloatBall: showVideoTalking, permission denied"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            java.lang.ref.WeakReference r0 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L_0x00c8
        L_0x00ba:
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            java.lang.ref.WeakReference r0 = r0.mo174212f()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x00c8:
            r1 = r0
            goto L_0x00cb
        L_0x00ca:
            r1 = r4
        L_0x00cb:
            if (r1 == 0) goto L_0x00ea
            a14.h0 r12 = a14.C53872d1.f151118b
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$g r13 = new com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$g
            r14 = 0
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r6
            r5 = r17
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f159110d = r7
            r8.f159113g = r11
            java.lang.Object r0 = a14.C53895h.m60469g(r12, r13, r8)
            if (r0 != r9) goto L_0x00e8
            return r9
        L_0x00e8:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x00ea:
            if (r4 != 0) goto L_0x00f7
            java.lang.String r0 = "addVideoFloatBall: showVideoTalking, request permission dialog show failed, top activity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x00f7
        L_0x00f2:
            boolean r0 = r6.f27482d
            r15.mo77467K0(r3, r0, r5)
        L_0x00f7:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.mo77464H0(boolean, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: I0 */
    public final boolean mo77465I0(boolean z, boolean z2) {
        boolean z3;
        if (C61104a.m71653i(MMApplicationContext.getContext(), false, (Bundle) null)) {
            if (!z && !z2) {
                C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.auu, 0).show();
            }
            Log.m105928w("FinderVideoPassive", "checkEnableAddFinderFloatBall: failed to add video float ball, checkCameraUsingAndShowToast");
            return false;
        }
        Context context = MMApplicationContext.getContext();
        boolean z4 = !z && !z2;
        if (C61104a.m71644D()) {
            if (z4) {
                C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.gzg), 0).show();
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            if (!C61104a.m71642B(MMApplicationContext.getContext(), !z && !z2) && !C61104a.m71648d() && !C61104a.m71645a()) {
                if (!C61104a.m71657m(MMApplicationContext.getContext(), !z && !z2, (Bundle) null) && (!z || !z2 || !C61104a.m71656l((Context) null, false))) {
                    return true;
                }
            }
        }
        Log.m105928w("FinderVideoPassive", "checkEnableAddFinderFloatBall: failed to add video float ball");
        return false;
    }

    /* renamed from: J0 */
    public final void mo77466J0(FinderThumbPlayerProxy finderThumbPlayerProxy, long j, float f, boolean z) {
        finderThumbPlayerProxy.setFullScreenEnjoy(true);
        finderThumbPlayerProxy.setLifecycle(new C55862j(this, j, f, z, finderThumbPlayerProxy, mo77450A0()));
        finderThumbPlayerProxy.setOnlyAudio(true);
        finderThumbPlayerProxy.setVideoViewCallback(mo77450A0().getVideoViewCallback());
        boolean z2 = false;
        finderThumbPlayerProxy.setLoop(false);
        finderThumbPlayerProxy.setMute(false);
        finderThumbPlayerProxy.setVideoViewFocused(true);
        if (finderThumbPlayerProxy.f161745p == 6) {
            z2 = true;
        }
        if (!z2) {
            C60171g1.C8767a.m8577a(finderThumbPlayerProxy, (Integer) null, 1, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if ((r1 != null && !r1.f159105i) != false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77467K0(boolean r26, boolean r27, boolean r28) {
        /*
            r25 = this;
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "innerAddMiniView: isPassive = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", fromMessage = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", needPost = "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = "FinderVideoPassive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r6.f311726d
            r1 = 32
            r0.f311686d = r1
            r0.f311687e = r1
            r11 = 1
            if (r9 == 0) goto L_0x003b
            r0.f311696q = r11
        L_0x003b:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159090v
            r6.f159093y = r1
            com.tencent.mm.plugin.ball.model.BallReportInfo r0 = r0.f311683H
            if (r9 == 0) goto L_0x0047
            if (r7 == 0) goto L_0x0047
            r2 = 5
            goto L_0x004d
        L_0x0047:
            if (r7 == 0) goto L_0x004b
            r2 = 3
            goto L_0x004d
        L_0x004b:
            r2 = 8
        L_0x004d:
            r0.f311715d = r2
            java.lang.String r12 = ""
            if (r1 == 0) goto L_0x0065
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f159103g
            if (r1 == 0) goto L_0x0065
            long r1 = r1.getFeedId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0066
        L_0x0065:
            r1 = r12
        L_0x0066:
            r0.f311718g = r1
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159093y
            if (r1 == 0) goto L_0x035f
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r1.f159103g
            if (r2 == 0) goto L_0x035f
            int r3 = r1.f159102f
            gr1.q2 r4 = r1.f159097a
            te3.td1 r5 = r1.f159104h
            long r13 = r1.f159098b
            float r11 = r1.f159099c
            android.util.Size r1 = r1.f159106j
            if (r1 != 0) goto L_0x009c
            android.util.Size r1 = new android.util.Size
            r15 = 2131166550(0x7f070556, float:1.7947349E38)
            int r15 = r0.getDimensionPixelOffset(r15)
            r22 = r12
            r12 = 2131166549(0x7f070555, float:1.7947346E38)
            int r0 = r0.getDimensionPixelOffset(r12)
            r1.<init>(r15, r0)
            goto L_0x009e
        L_0x009c:
            r22 = r12
        L_0x009e:
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$i r1 = new com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$i
            r1.<init>(r6)
            r0.getClass()
            r0.setOnClickListener(r1)
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = 0
            r0.setPadding(r1, r1, r1, r1)
            java.util.LinkedList r0 = r2.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            r12 = r0
            te3.rq2 r12 = (te3.C64689rq2) r12
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r6.f311726d
            com.tencent.mm.plugin.ball.model.BallInfo$BallButtonInfo r0 = r0.f311693n
            gr1.o2 r1 = r6.f159091w
            if (r1 == 0) goto L_0x00d1
            boolean r1 = r1.isPlaying()
            r15 = 1
            if (r1 != r15) goto L_0x00d1
            r1 = 1
            goto L_0x00d2
        L_0x00d1:
            r1 = 0
        L_0x00d2:
            if (r1 != 0) goto L_0x00e6
            if (r7 != 0) goto L_0x00e4
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159093y
            if (r1 == 0) goto L_0x00e0
            boolean r1 = r1.f159105i
            if (r1 != 0) goto L_0x00e0
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            if (r1 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r1 = 0
            goto L_0x00e7
        L_0x00e6:
            r1 = 1
        L_0x00e7:
            r0.f311706d = r1
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r6.f311726d
            com.tencent.mm.plugin.ball.model.BallInfo$c r0 = r0.f311694o
            if (r12 == 0) goto L_0x00f2
            java.lang.String r1 = r12.f185283w
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 == 0) goto L_0x0104
            java.lang.String r15 = r12.f185267e
            if (r15 != 0) goto L_0x0106
        L_0x0104:
            r15 = r22
        L_0x0106:
            r1.append(r15)
            if (r12 == 0) goto L_0x010f
            java.lang.String r15 = r12.f185288z
            if (r15 != 0) goto L_0x0111
        L_0x010f:
            r15 = r22
        L_0x0111:
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            goto L_0x0138
        L_0x0119:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 == 0) goto L_0x0124
            java.lang.String r15 = r12.f185283w
            if (r15 != 0) goto L_0x0126
        L_0x0124:
            r15 = r22
        L_0x0126:
            r1.append(r15)
            if (r12 == 0) goto L_0x012f
            java.lang.String r15 = r12.f185234A
            if (r15 != 0) goto L_0x0131
        L_0x012f:
            r15 = r22
        L_0x0131:
            r1.append(r15)
            java.lang.String r1 = r1.toString()
        L_0x0138:
            r0.f158210a = r1
            java.lang.String r0 = "getContext()"
            java.lang.String r1 = ", isPassive = "
            r23 = r13
            r13 = 0
            r15 = 2
            if (r3 == r15) goto L_0x02cd
            r5 = 4
            if (r3 == r5) goto L_0x0201
            r5 = 9
            if (r3 == r5) goto L_0x015c
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = 0
            r0.setMusicCtrlBtnStatus(r1)
            r25.mo77470N0()
            r6.mo77458w0(r8)
            goto L_0x0345
        L_0x015c:
            gr1.o2 r3 = r6.f159091w
            if (r3 != 0) goto L_0x01d4
            if (r4 == 0) goto L_0x01d4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "playLive: mediaInfo = "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = ", feedData = "
            r3.append(r5)
            r3.append(r2)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r25.mo77470N0()
            java.lang.Class<tf0.q1> r1 = tf0.C13887q1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.q1 r1 = (tf0.C13887q1) r1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r3, r0)
            gr1.o2 r0 = r1.mo13333W8(r3)
            r6.f159091w = r0
            if (r0 == 0) goto L_0x01a4
            pl1.u0 r1 = r4.f170495e
            r3 = 0
            r0.mo78639o(r1, r3, r2)
        L_0x01a4:
            gr1.o2 r0 = r6.f159091w
            r1 = 1
            if (r0 == 0) goto L_0x01ac
            r0.setVideoViewFocused(r1)
        L_0x01ac:
            gr1.o2 r0 = r6.f159091w
            r15 = 0
            if (r0 == 0) goto L_0x01b4
            ht1.C60171g1.C8767a.m8577a(r0, r15, r1, r15)
        L_0x01b4:
            gr1.o2 r0 = r6.f159091w
            if (r0 == 0) goto L_0x01c0
            xf1.b r1 = new xf1.b
            r1.<init>(r6)
            r0.setVideoPlayLifecycle(r1)
        L_0x01c0:
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = r7 ^ 1
            r0.setMusicCtrlBtnStatus(r1)
            if (r7 == 0) goto L_0x01d5
            xf1.c r0 = new xf1.c
            r0.<init>(r6)
            o40.C61926c.m72666K(r13, r0)
            goto L_0x01d5
        L_0x01d4:
            r15 = 0
        L_0x01d5:
            gr1.o2 r0 = r6.f159091w
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x01df
            r14 = r0
            android.view.View r14 = (android.view.View) r14
            goto L_0x01e0
        L_0x01df:
            r14 = r15
        L_0x01e0:
            if (r14 == 0) goto L_0x0345
            if (r12 == 0) goto L_0x01e7
            r6.mo77457v0(r12, r8)
        L_0x01e7:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1 r0 = r6.f159089C
            r0.alive()
            gr1.o2 r0 = r6.f159091w
            if (r0 == 0) goto L_0x01f9
            boolean r0 = r0.isPlaying()
            r1 = 1
            if (r0 != r1) goto L_0x01f9
            r0 = 1
            goto L_0x01fa
        L_0x01f9:
            r0 = 0
        L_0x01fa:
            if (r0 == 0) goto L_0x0345
            r25.mo77455F0()
            goto L_0x0345
        L_0x0201:
            r15 = 0
            long r2 = r2.getFeedId()
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x021a
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = 0
            r0.setMusicCtrlBtnStatus(r1)
            r25.mo77470N0()
            r6.mo77458w0(r8)
            goto L_0x035c
        L_0x021a:
            gr1.o2 r2 = r6.f159091w
            if (r2 != 0) goto L_0x02a5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "playVideo: mediaInfo = "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ", targetTimeMs = "
            r2.append(r3)
            r13 = r23
            r2.append(r13)
            java.lang.String r3 = ", playSpeedRatio = "
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r25.mo77470N0()
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler> r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r1
            xf1.d r2 = new xf1.d
            r2.<init>(r4)
            r1.mo80074d3(r2)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r2, r0)
            r1.<init>(r2)
            r6.f159091w = r1
            r18 = 1
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r1
            r17 = r4
            com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64978Q(r16, r17, r18, r19, r20, r21)
            r0 = r25
            r2 = r13
            r4 = r11
            r5 = r26
            r0.mo77466J0(r1, r2, r4, r5)
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            if (r7 != 0) goto L_0x02a1
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159093y
            if (r1 == 0) goto L_0x029c
            boolean r1 = r1.f159105i
            r2 = 1
            if (r1 != r2) goto L_0x029c
            r1 = 1
            goto L_0x029d
        L_0x029c:
            r1 = 0
        L_0x029d:
            if (r1 != 0) goto L_0x02a1
            r1 = 1
            goto L_0x02a2
        L_0x02a1:
            r1 = 0
        L_0x02a2:
            r0.setMusicCtrlBtnStatus(r1)
        L_0x02a5:
            gr1.o2 r0 = r6.f159091w
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x02af
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            goto L_0x02b0
        L_0x02af:
            r1 = r15
        L_0x02b0:
            if (r1 == 0) goto L_0x0345
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x02ba
            r14 = r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r14 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r14
            goto L_0x02bb
        L_0x02ba:
            r14 = r15
        L_0x02bb:
            if (r14 == 0) goto L_0x02c6
            boolean r0 = r14.isPlaying()
            if (r0 == 0) goto L_0x02c6
            r25.mo77455F0()
        L_0x02c6:
            if (r12 == 0) goto L_0x0345
            r6.mo77457v0(r12, r8)
            goto L_0x0345
        L_0x02cd:
            r15 = 0
            if (r5 == 0) goto L_0x0325
            em1.b r2 = r6.f159092x
            if (r2 != 0) goto L_0x032d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "playImageMusic: feedId = "
            r2.append(r3)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r3 = r6.f159093y
            if (r3 == 0) goto L_0x02ef
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r3.f159103g
            if (r3 == 0) goto L_0x02ef
            long r3 = r3.getFeedId()
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            r15 = r3
        L_0x02ef:
            r2.append(r15)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r25.mo77470N0()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r1, r0)
            em1.a r0 = new em1.a
            r0.<init>(r1, r5)
            r6.f159092x = r0
            r0.play()
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = r7 ^ 1
            r0.setMusicCtrlBtnStatus(r1)
            xf1.a r0 = new xf1.a
            r0.<init>(r6, r7)
            o40.C61926c.m72666K(r13, r0)
            goto L_0x032d
        L_0x0325:
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = 0
            r0.setMusicCtrlBtnStatus(r1)
        L_0x032d:
            em1.b r0 = r6.f159092x
            if (r0 == 0) goto L_0x033a
            boolean r0 = r0.isPlaying()
            r1 = 1
            if (r0 != r1) goto L_0x033a
            r1 = 1
            goto L_0x033b
        L_0x033a:
            r1 = 0
        L_0x033b:
            if (r1 == 0) goto L_0x0340
            r25.mo77455F0()
        L_0x0340:
            if (r12 == 0) goto L_0x0345
            r6.mo77457v0(r12, r8)
        L_0x0345:
            gr1.o2 r0 = r6.f159091w
            if (r0 == 0) goto L_0x035c
            fs3.d r0 = r0.getEventDetector()
            if (r0 == 0) goto L_0x035c
            fs3.b r0 = r0.getEventDetectorAdapter()
            if (r0 == 0) goto L_0x035c
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r1 = r25.mo77450A0()
            r0.mo84415a(r1)
        L_0x035c:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            goto L_0x0363
        L_0x035f:
            r22 = r12
            r15 = 0
            r14 = r15
        L_0x0363:
            if (r14 != 0) goto L_0x037d
            java.lang.String r0 = "innerAddMiniView: feedData is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r25.mo77470N0()
            boolean r0 = r6.f159088B
            if (r0 == 0) goto L_0x037d
            r6.mo77458w0(r8)
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r25.mo77450A0()
            r1 = 0
            r0.setMusicCtrlBtnStatus(r1)
            goto L_0x037e
        L_0x037d:
            r1 = 0
        L_0x037e:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159093y
            r2 = 16
            if (r0 == 0) goto L_0x03e7
            te3.hj1 r0 = r0.f159100d
            if (r0 == 0) goto L_0x03e7
            if (r9 == 0) goto L_0x03c9
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r6.f159094z = r3
            r3 = 2
            r6.f159087A = r3
            dp1.f2 r3 = dp1.C7435f2.f25626a
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = r6.f159094z
            if (r5 != 0) goto L_0x03a5
            r12 = r22
            goto L_0x03a6
        L_0x03a5:
            r12 = r5
        L_0x03a6:
            java.lang.String r5 = "float_frame_id"
            r4.put(r5, r12)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r5 = r6.f159093y
            if (r5 == 0) goto L_0x03c0
            com.tencent.mm.plugin.finder.storage.FeedData r5 = r5.f159103g
            if (r5 == 0) goto L_0x03c0
            long r7 = r5.getFeedId()
            java.lang.String r5 = o40.C61926c.m72691p(r7)
            java.lang.String r7 = "feedid"
            r4.put(r7, r5)
        L_0x03c0:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            java.lang.String r5 = "wechat_push_card"
            r7 = 1
            r3.mo8577a(r0, r5, r7, r4)
        L_0x03c9:
            com.tencent.mm.plugin.ball.model.BallInfo r3 = r6.f311726d
            com.tencent.mm.plugin.ball.model.BallReportInfo r3 = r3.f311683H
            int r0 = r0.f134675i
            r4 = 17
            if (r0 == r4) goto L_0x03e3
            r5 = 18
            if (r0 == r5) goto L_0x03e0
            r5 = 20
            if (r0 == r5) goto L_0x03dd
            r15 = 0
            goto L_0x03e5
        L_0x03dd:
            r15 = 17
            goto L_0x03e5
        L_0x03e0:
            r15 = 16
            goto L_0x03e5
        L_0x03e3:
            r15 = 15
        L_0x03e5:
            r3.f311716e = r15
        L_0x03e7:
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r6.f311726d
            com.tencent.mm.plugin.ball.model.BallReportInfo r0 = r0.f311683H
            r0.f311721j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.mo77467K0(boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: te3.zv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: te3.zv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: te3.hj1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: te3.zv2} */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77468L0(androidx.appcompat.app.AppCompatActivity r21, androidx.recyclerview.widget.RecyclerView r22, int r23, boolean r24, long r25) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            r0 = r24
            r1 = r25
            java.lang.Class<rs1.o6> r3 = rs1.C13354o6.class
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r5 = r5.mo62444c(r7)
            bl3.t r5 = r5.mo62449e(r3)
            rs1.o6 r5 = (rs1.C13354o6) r5
            r8 = 0
            java.lang.String r9 = "FinderVideoPassive"
            if (r5 == 0) goto L_0x002f
            com.tencent.mm.plugin.finder.feed.n r5 = r5.f37856d
            jq3.o r5 = r5.mo2931f()
            java.lang.String r10 = "internalSaveCurrVideo: is long video share holder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            r11 = 4
            goto L_0x0032
        L_0x002f:
            r5 = 0
            r10 = 0
            r11 = 0
        L_0x0032:
            if (r10 != 0) goto L_0x0082
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r22.getLayoutManager()
            boolean r11 = r10 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r11 == 0) goto L_0x003f
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            goto L_0x0040
        L_0x003f:
            r10 = 0
        L_0x0040:
            if (r10 == 0) goto L_0x007a
            int r11 = r10.mo17004z()
            int r10 = r10.mo16958D()
            if (r11 > r10) goto L_0x007a
            r12 = 0
            r13 = r22
        L_0x004f:
            androidx.recyclerview.widget.RecyclerView$z r8 = r13.mo17024J0(r11, r8)
            if (r8 != 0) goto L_0x0056
            goto L_0x0074
        L_0x0056:
            android.view.View r14 = r8.f44854d
            java.lang.String r15 = "holder.itemView"
            gy3.C87412m.m108593f(r14, r15)
            r14.getLocalVisibleRect(r4)
            int r14 = r4.height()
            if (r14 <= r12) goto L_0x0074
            int r5 = r4.height()
            boolean r12 = r8 instanceof jq3.C60905o
            if (r12 == 0) goto L_0x0071
            jq3.o r8 = (jq3.C60905o) r8
            goto L_0x0072
        L_0x0071:
            r8 = 0
        L_0x0072:
            r12 = r5
            r5 = r8
        L_0x0074:
            if (r11 == r10) goto L_0x007a
            int r11 = r11 + 1
            r8 = 0
            goto L_0x004f
        L_0x007a:
            if (r5 == 0) goto L_0x007f
            int r11 = r5.f44859i
            goto L_0x0082
        L_0x007f:
            r4 = 0
            r8 = r5
            goto L_0x0084
        L_0x0082:
            r8 = r5
            r4 = r11
        L_0x0084:
            if (r8 != 0) goto L_0x008c
            java.lang.String r0 = "saveCurrentVideo: focusHolder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return
        L_0x008c:
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler> r5 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r10 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r11 = new com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e
            r11.<init>(r6)
            r6.f159090v = r11
            r11.f159102f = r4
            java.lang.Object r11 = r8.f173503E
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x00a2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            if (r11 == 0) goto L_0x00ec
            er1.w3 r12 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            te3.z0 r12 = r12.mo83940j0(r13)
            if (r12 == 0) goto L_0x00b9
            java.lang.String r12 = r12.f145601e
            if (r12 != 0) goto L_0x00c2
        L_0x00b9:
            fe1.q r12 = r11.mo3507l()
            if (r12 == 0) goto L_0x00c2
            r12.getAvatarUrl()
        L_0x00c2:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r12 = r6.f159090v
            if (r12 != 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            com.tencent.mm.plugin.finder.storage.FeedData$a r13 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r13 = r13.mo78883a(r11)
            r12.f159103g = r13
        L_0x00cf:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "saveCurrentVideo: feedId = "
            r12.append(r13)
            long r13 = r11.getItemId()
            java.lang.String r13 = o40.C61926c.m72691p(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
            goto L_0x00ed
        L_0x00ec:
            r11 = 0
        L_0x00ed:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r12 = r6.f159090v
            if (r12 != 0) goto L_0x00f2
            goto L_0x0112
        L_0x00f2:
            te3.zv2 r13 = new te3.zv2
            r13.<init>()
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r14 = r14.mo62444c(r7)
            bl3.t r3 = r14.mo62449e(r3)
            rs1.o6 r3 = (rs1.C13354o6) r3
            if (r3 == 0) goto L_0x010a
            com.tencent.mm.plugin.finder.feed.n r3 = r3.f37856d
            int r3 = r3.f14123s
            goto L_0x010e
        L_0x010a:
            int r3 = r8.mo17363j()
        L_0x010e:
            r13.f186884f = r3
            r12.f159107k = r13
        L_0x0112:
            r3 = r0 ^ 1
            r12 = 0
            r14 = 1
            int r15 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x0130
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = "saveCurrentVideo: need to play enterFeedId="
            r3.append(r15)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            r3 = 1
        L_0x0130:
            if (r3 == 0) goto L_0x0135
            r20.mo77470N0()
        L_0x0135:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveCurrentVideo: itemViewType="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", needPlay="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", tabType="
            r1.append(r2)
            r2 = r23
            r1.append(r2)
            java.lang.String r2 = ", isPassive="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r0 = 2
            if (r4 == r0) goto L_0x02e6
            r0 = 2131302685(0x7f09191d, float:1.8223463E38)
            r1 = 4
            if (r4 == r1) goto L_0x0212
            r1 = 9
            if (r4 == r1) goto L_0x0172
            goto L_0x0395
        L_0x0172:
            android.view.View r0 = r8.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r0
            if (r0 == 0) goto L_0x0395
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159090v
            if (r1 != 0) goto L_0x017f
            goto L_0x018d
        L_0x017f:
            gr1.o2 r2 = r0.getVideoView()
            if (r2 == 0) goto L_0x018a
            gr1.q2 r2 = r2.getVideoMediaInfo()
            goto L_0x018b
        L_0x018a:
            r2 = 0
        L_0x018b:
            r1.f159097a = r2
        L_0x018d:
            gr1.o2 r1 = r0.getVideoView()
            boolean r2 = r1 instanceof ht1.C60155c3
            if (r2 == 0) goto L_0x0198
            ht1.c3 r1 = (ht1.C60155c3) r1
            goto L_0x0199
        L_0x0198:
            r1 = 0
        L_0x0199:
            if (r1 == 0) goto L_0x01b8
            int r2 = r0.getWidth()
            int r4 = r0.getHeight()
            int[] r1 = r1.mo79414e(r2, r4)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r2 = r6.f159090v
            if (r2 != 0) goto L_0x01ac
            goto L_0x01b8
        L_0x01ac:
            android.util.Size r4 = new android.util.Size
            r11 = 0
            r11 = r1[r11]
            r1 = r1[r14]
            r4.<init>(r11, r1)
            r2.f159106j = r4
        L_0x01b8:
            if (r3 == 0) goto L_0x0395
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveCurrentVideo: reuse live view, mediaInfo = "
            r1.append(r2)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r2 = r6.f159090v
            if (r2 == 0) goto L_0x01cb
            gr1.q2 r2 = r2.f159097a
            goto L_0x01cc
        L_0x01cb:
            r2 = 0
        L_0x01cc:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            gr1.o2 r1 = r0.getVideoView()
            r6.f159091w = r1
            gr1.o2 r1 = r0.getVideoView()
            if (r1 == 0) goto L_0x01e5
            r1.mo51232t()
        L_0x01e5:
            gr1.o2 r1 = r6.f159091w
            if (r1 == 0) goto L_0x01f1
            xf1.f r2 = new xf1.f
            r2.<init>(r6)
            r1.setVideoPlayLifecycle(r2)
        L_0x01f1:
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62446e(r10)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r1
            xf1.g r2 = new xf1.g
            r2.<init>(r6)
            r1.mo80074d3(r2)
            r1 = 0
            r0.setVideoView(r1)
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r20.mo77450A0()
            r0.setMusicCtrlBtnStatus(r14)
            goto L_0x0395
        L_0x0212:
            android.view.View r0 = r8.mo85812D(r0)
            r11 = r0
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r11 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r11
            if (r11 == 0) goto L_0x0395
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x0220
            goto L_0x022e
        L_0x0220:
            gr1.o2 r1 = r11.getVideoView()
            if (r1 == 0) goto L_0x022b
            gr1.q2 r1 = r1.getVideoMediaInfo()
            goto L_0x022c
        L_0x022b:
            r1 = 0
        L_0x022c:
            r0.f159097a = r1
        L_0x022e:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x0233
            goto L_0x0249
        L_0x0233:
            gr1.q2 r1 = r0.f159097a
            if (r1 == 0) goto L_0x0246
            pl1.u0 r1 = r1.f170495e
            if (r1 == 0) goto L_0x0246
            te3.rq2 r1 = r1.mo87421f()
            if (r1 == 0) goto L_0x0246
            android.util.Size r1 = vp1.C65840n.m77566b(r1, r14)
            goto L_0x0247
        L_0x0246:
            r1 = 0
        L_0x0247:
            r0.f159106j = r1
        L_0x0249:
            gr1.o2 r0 = r11.getVideoView()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x0254
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            r1 = r0
            if (r1 == 0) goto L_0x0395
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x025d
            goto L_0x0263
        L_0x025d:
            long r14 = r1.getCurrentPlayMs()
            r0.f159098b = r14
        L_0x0263:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 == 0) goto L_0x026a
            long r14 = r0.f159098b
            goto L_0x026b
        L_0x026a:
            r14 = r12
        L_0x026b:
            long r16 = r1.getVideoDurationMs()
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x027a
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r0.f159098b = r12
        L_0x027a:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x027f
            goto L_0x0285
        L_0x027f:
            float r2 = r1.getPlaySpeedRatio()
            r0.f159099c = r2
        L_0x0285:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x028a
            goto L_0x0292
        L_0x028a:
            boolean r2 = r1.isPlaying()
            r2 = r2 ^ 1
            r0.f159105i = r2
        L_0x0292:
            if (r3 == 0) goto L_0x0395
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "reuseVideoView: thumbPlayerProxy = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r6.f159091w = r1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 7
            r19 = 0
            r14 = r1
            com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64978Q(r14, r15, r16, r17, r18, r19)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62446e(r10)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r0
            xf1.e r2 = new xf1.e
            r2.<init>(r1)
            r0.mo80074d3(r2)
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r20.mo77450A0()
            boolean r2 = r1.isPlaying()
            r0.setMusicCtrlBtnStatus(r2)
            r2 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r0 = r20
            r0.mo77466J0(r1, r2, r4, r5)
            r0 = 0
            r11.setVideoView(r0)
            goto L_0x0396
        L_0x02e6:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x02eb
            goto L_0x02f5
        L_0x02eb:
            if (r11 == 0) goto L_0x02f2
            te3.td1 r1 = r11.mo3524x()
            goto L_0x02f3
        L_0x02f2:
            r1 = 0
        L_0x02f3:
            r0.f159104h = r1
        L_0x02f5:
            if (r11 == 0) goto L_0x02fc
            te3.td1 r0 = r11.mo3524x()
            goto L_0x02fd
        L_0x02fc:
            r0 = 0
        L_0x02fd:
            if (r0 == 0) goto L_0x0395
            r0 = 2131297745(0x7f0905d1, float:1.8213444E38)
            android.view.View r0 = r8.mo85812D(r0)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r0 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r0
            if (r0 == 0) goto L_0x0395
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159090v
            if (r1 != 0) goto L_0x030f
            goto L_0x031d
        L_0x030f:
            em1.b r2 = r0.f160193e
            if (r2 == 0) goto L_0x0318
            boolean r2 = r2.isPlaying()
            goto L_0x0319
        L_0x0318:
            r2 = 0
        L_0x0319:
            r2 = r2 ^ 1
            r1.f159105i = r2
        L_0x031d:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r1 = r6.f159090v
            if (r1 != 0) goto L_0x0322
            goto L_0x0330
        L_0x0322:
            em1.b r2 = r0.getPlayer()
            if (r2 == 0) goto L_0x032d
            long r4 = r2.mo83512a()
            goto L_0x032e
        L_0x032d:
            r4 = r12
        L_0x032e:
            r1.f159098b = r4
        L_0x0330:
            if (r3 == 0) goto L_0x0393
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveCurrentVideo: reuse music player, feedId = "
            r1.append(r2)
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r2 = r6.f159090v
            if (r2 == 0) goto L_0x034d
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f159103g
            if (r2 == 0) goto L_0x034d
            long r2 = r2.getFeedId()
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            goto L_0x034e
        L_0x034d:
            r2 = 0
        L_0x034e:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r8.f173499A
            java.lang.String r3 = "focusHolder.context"
            gy3.C87412m.m108593f(r2, r3)
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<dm1.c> r2 = dm1.C58322c.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            dm1.c r1 = (dm1.C58322c) r1
            r1.getClass()
            java.util.HashMap<com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag, em1.b> r1 = r1.f167005d
            r1.remove(r0)
            em1.b r1 = r0.getPlayer()
            r6.f159092x = r1
            com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r1 = r20.mo77450A0()
            em1.b r2 = r0.getPlayer()
            if (r2 == 0) goto L_0x038a
            boolean r2 = r2.isPlaying()
            goto L_0x038b
        L_0x038a:
            r2 = 0
        L_0x038b:
            r1.setMusicCtrlBtnStatus(r2)
            r1 = 0
            r0.setPlayer(r1)
            goto L_0x0397
        L_0x0393:
            r1 = 0
            goto L_0x0397
        L_0x0395:
            r0 = 0
        L_0x0396:
            r1 = r0
        L_0x0397:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 == 0) goto L_0x039e
            te3.zv2 r2 = r0.f159107k
            goto L_0x039f
        L_0x039e:
            r2 = r1
        L_0x039f:
            if (r2 != 0) goto L_0x03a2
            goto L_0x03a8
        L_0x03a2:
            if (r0 == 0) goto L_0x03a6
            long r12 = r0.f159098b
        L_0x03a6:
            r2.f186890o = r12
        L_0x03a8:
            if (r0 != 0) goto L_0x03ab
            goto L_0x03bb
        L_0x03ab:
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r2.mo12873f(r7)
            if (r2 == 0) goto L_0x03b8
            te3.hj1 r2 = r2.mo12861q3()
            goto L_0x03b9
        L_0x03b8:
            r2 = r1
        L_0x03b9:
            r0.f159100d = r2
        L_0x03bb:
            com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$e r0 = r6.f159090v
            if (r0 != 0) goto L_0x03c0
            goto L_0x03e0
        L_0x03c0:
            android.content.Context r2 = r8.f173499A
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x03c9
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
        L_0x03c9:
            if (r1 == 0) goto L_0x03dd
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x03dd
            java.lang.String r2 = "FROM_SCENE_KEY"
            r3 = 2
            int r1 = r1.getIntExtra(r2, r3)
            r2 = 6
            if (r1 != r2) goto L_0x03dd
            r1 = 1
            goto L_0x03de
        L_0x03dd:
            r1 = 0
        L_0x03de:
            r0.f159101e = r1
        L_0x03e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.mo77468L0(androidx.appcompat.app.AppCompatActivity, androidx.recyclerview.widget.RecyclerView, int, boolean, long):void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77469M0() {
        /*
            r4 = this;
            gr1.o2 r0 = r4.f159091w
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.view.View r0 = (android.view.View) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x001d
            android.view.ViewParent r1 = r0.getParent()
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.video.FinderVideoLayout
            if (r3 == 0) goto L_0x0018
            r2 = r1
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r2
        L_0x0018:
            if (r2 == 0) goto L_0x001d
            r2.removeView(r0)
        L_0x001d:
            xv0.e r0 = r4.f311729g
            if (r0 == 0) goto L_0x0026
            com.tencent.mm.plugin.ball.model.BallInfo r1 = r4.f311726d
            r0.mo149119f(r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper.mo77469M0():void");
    }

    /* renamed from: N0 */
    public final void mo77470N0() {
        Log.m105924i("FinderVideoPassive", "resetPlayers: playingView = " + this.f159091w + ", musicPlayer = " + this.f159092x);
        C59670o2 o2Var = this.f159091w;
        if (o2Var != null) {
            FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setVideoViewCallback((C60157c5) null);
                finderThumbPlayerProxy.setLifecycle((C59684w2) null);
            }
            o2Var.setVideoPlayLifecycle((C59684w2) null);
            o2Var.mo78608c();
            o2Var.mo78609d();
        }
        this.f159091w = null;
        C58636b bVar = this.f159092x;
        if (bVar != null) {
            bVar.stop();
            bVar.release();
        }
        this.f159092x = null;
    }

    /* renamed from: O0 */
    public final boolean mo77471O0(boolean z, boolean z2) {
        FeedData feedData;
        FeedData feedData2;
        C59670o2 o2Var = this.f159091w;
        boolean isPlaying = o2Var != null ? o2Var.isPlaying() : false;
        C58636b bVar = this.f159092x;
        boolean isPlaying2 = isPlaying | (bVar != null ? bVar.isPlaying() : false);
        Log.m105924i("FinderVideoPassive", "togglePlayer: isPlaying = " + isPlaying2 + ", forcePause = " + z);
        if (isPlaying2) {
            C59670o2 o2Var2 = this.f159091w;
            if (o2Var2 != null) {
                o2Var2.pause();
            }
            C58636b bVar2 = this.f159092x;
            if (bVar2 != null) {
                bVar2.pause();
            }
            mo77450A0().setMusicCtrlBtnStatus(false);
            if (z2) {
                Log.m105924i("BaseFinderMiniViewHelper", "abandonAudioFocus");
                C34767b.C34768c cVar = this.f159066n;
                if (cVar != null) {
                    ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
                }
                this.f159066n = null;
            }
        } else if (!z) {
            if (this.f159091w == null && this.f159092x == null) {
                mo77450A0().setMusicCtrlBtnStatus(false);
                C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f361030lv1, 0).show();
            } else {
                C55857e eVar = this.f159093y;
                if (eVar != null) {
                    eVar.f159105i = false;
                }
                if (!((eVar == null || (feedData2 = eVar.f159103g) == null || feedData2.getLiveId() != 0) ? false : true)) {
                    C55857e eVar2 = this.f159093y;
                    if ((eVar2 == null || (feedData = eVar2.f159103g) == null || feedData.getLiveStatus() != 2) ? false : true) {
                        C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.ltq, 0).show();
                        return isPlaying2;
                    }
                }
                if (z2) {
                    mo77455F0();
                }
                C59670o2 o2Var3 = this.f159091w;
                if (o2Var3 != null) {
                    o2Var3.setMute(false);
                }
                C58636b bVar3 = this.f159092x;
                if (bVar3 != null) {
                    bVar3.setMute(false);
                }
                C59670o2 o2Var4 = this.f159091w;
                if (o2Var4 != null) {
                    C60171g1.C8767a.m8577a(o2Var4, (Integer) null, 1, (Object) null);
                }
                C58636b bVar4 = this.f159092x;
                if (bVar4 != null) {
                    bVar4.play();
                }
                if (this.f159091w != null) {
                    mo77450A0().getClass();
                }
                mo77450A0().setMusicCtrlBtnStatus(true);
            }
        }
        return isPlaying2;
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return true;
    }

    /* renamed from: x0 */
    public void mo77459x0() {
        mo77471O0(false, false);
    }

    /* renamed from: y0 */
    public View.OnClickListener mo77460y0() {
        return new C55860h(new BaseFinderMiniViewHelper.C55849a(this), this);
    }

    /* renamed from: z0 */
    public View.OnClickListener mo77461z0() {
        return new C55861i(this);
    }
}

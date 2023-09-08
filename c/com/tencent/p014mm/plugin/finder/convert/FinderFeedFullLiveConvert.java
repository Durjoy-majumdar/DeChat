package com.tencent.p014mm.plugin.finder.convert;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53851a;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import ak1.C54067f0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C0576n4;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C4100m;
import com.tencent.p014mm.plugin.finder.view.C4189u7;
import com.tencent.p014mm.plugin.finder.view.C4190v;
import com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView;
import com.tencent.p014mm.plugin.finder.view.FinderFeedLiveRecommendView;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.plugin.finder.view.FinderVideoBanner;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import df1.C58259c;
import di3.C86312j;
import dp1.C58417y0;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C8777j5;
import ht1.C8809w2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import kotlin.ResultKt;
import ls3.C10649f;
import nj3.C76874e0;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import q31.C118148a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sk1.C63947a;
import sx3.C90364q0;
import te3.C48978cb0;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C50217l51;
import te3.C50355m51;
import te3.C51384te1;
import te3.C52294zq0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64686ro2;
import te3.C64689rq2;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C37521f;
import up1.C65426w0;
import ve1.C14476c2;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert */
public class FinderFeedFullLiveConvert extends FinderFeedFullConvert<C0797z> {

    /* renamed from: L */
    public final FinderVideoCore f12778L;

    /* renamed from: M */
    public final int f12779M;

    /* renamed from: N */
    public final String f12780N;

    /* renamed from: P */
    public C53973z1 f12781P;

    /* renamed from: Q */
    public long f12782Q;

    /* renamed from: R */
    public final FinderFeedFullLiveConvert$liveFeedExposeListener$1 f12783R;

    /* renamed from: S */
    public final FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 f12784S;

    /* renamed from: T */
    public volatile boolean f12785T;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$checkDeleteLiveFeed$1$1$1", mo125469f = "FinderFeedFullLiveConvert.kt", mo125470l = {828, 829}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$a */
    public static final class C2406a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f12786d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullLiveConvert f12787e;

        /* renamed from: f */
        public final /* synthetic */ long f12788f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$checkDeleteLiveFeed$1$1$1$1", mo125469f = "FinderFeedFullLiveConvert.kt", mo125470l = {830}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$a$a */
        public static final class C2407a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f12789d;

            /* renamed from: e */
            public final /* synthetic */ FinderFeedFullLiveConvert f12790e;

            /* renamed from: f */
            public final /* synthetic */ long f12791f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2407a(FinderFeedFullLiveConvert finderFeedFullLiveConvert, long j, C15601d<? super C2407a> dVar) {
                super(2, dVar);
                this.f12790e = finderFeedFullLiveConvert;
                this.f12791f = j;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C2407a(this.f12790e, this.f12791f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C2407a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f12789d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f12790e;
                    long j = this.f12791f;
                    this.f12789d = 1;
                    if (FinderFeedFullLiveConvert.m2273Q0(finderFeedFullLiveConvert, j, this) == aVar) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2406a(FinderFeedFullLiveConvert finderFeedFullLiveConvert, long j, C15601d<? super C2406a> dVar) {
            super(2, dVar);
            this.f12787e = finderFeedFullLiveConvert;
            this.f12788f = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C2406a(this.f12787e, this.f12788f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C2406a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f12786d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f12786d = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C2407a aVar2 = new C2407a(this.f12787e, this.f12788f, (C15601d<? super C2407a>) null);
            this.f12786d = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$b */
    public static final class C2408b implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullLiveConvert f12792a;

        /* renamed from: b */
        public final /* synthetic */ C0797z f12793b;

        public C2408b(FinderFeedFullLiveConvert finderFeedFullLiveConvert, C0797z zVar) {
            this.f12792a = finderFeedFullLiveConvert;
            this.f12793b = zVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return this.f12792a.mo2394U0(this.f12793b.mo3513o().getLiveInfo());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$c */
    public static final class C2409c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullLiveConvert f12794d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12795e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2409c(FinderFeedFullLiveConvert finderFeedFullLiveConvert, C60905o oVar) {
            super(0);
            this.f12794d = finderFeedFullLiveConvert;
            this.f12795e = oVar;
        }

        public Object invoke() {
            FinderFeedFullLiveConvert finderFeedFullLiveConvert = this.f12794d;
            Object obj = this.f12795e.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            finderFeedFullLiveConvert.mo2392S0((C0740i2) obj, this.f12795e, true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderFeedFullLiveConvert(FinderVideoCore finderVideoCore, C10008v1 v1Var, boolean z, int i, int i2, int i3, C8480h hVar) {
        this(finderVideoCore, v1Var, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r2 = r2.getAdapter();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m2273Q0(com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert r7, long r8, wx3.C15601d r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof ve1.C14490d2
            if (r0 == 0) goto L_0x0016
            r0 = r10
            ve1.d2 r0 = (ve1.C14490d2) r0
            int r1 = r0.f40179f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f40179f = r1
            goto L_0x001b
        L_0x0016:
            ve1.d2 r0 = new ve1.d2
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.f40177d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f40179f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00c9
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r10)
            r4 = 0
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00ce
            jq3.o r10 = r7.mo2393T0(r8)
            if (r10 == 0) goto L_0x00ce
            android.view.View r2 = r10.f44854d
            boolean r2 = r2.isShown()
            if (r2 != 0) goto L_0x006c
            java.lang.String r7 = r7.f12780N
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "deleteLiveFeed not same pos: "
            r8.append(r9)
            int r9 = r10.mo17363j()
            r8.append(r9)
            java.lang.String r9 = " isShown = false"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x00d0
        L_0x006c:
            int r10 = r10.mo17363j()
            androidx.recyclerview.widget.RecyclerView r2 = r7.f12554A
            if (r2 == 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x007f
            int r2 = r2.getItemCount()
            goto L_0x0080
        L_0x007f:
            r2 = 0
        L_0x0080:
            java.lang.String r4 = r7.f12780N
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "deleteLiveFeed itemCount: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " adapterPosition: "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
            int r4 = r10 + 1
            if (r4 >= r2) goto L_0x00ce
            if (r10 < 0) goto L_0x00ce
            androidx.recyclerview.widget.RecyclerView r10 = r7.f12554A
            if (r10 == 0) goto L_0x00ce
            we1.d r2 = new we1.d
            r2.<init>(r10)
            r10.setItemAnimator(r2)
            ve1.e2 r2 = new ve1.e2
            r2.<init>(r7, r8)
            r10.post(r2)
            a14.h0 r10 = a14.C53872d1.f151119c
            ve1.f2 r2 = new ve1.f2
            r4 = 0
            r2.<init>(r7, r8, r4)
            r0.f40179f = r3
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r0)
            if (r10 != r1) goto L_0x00c9
            goto L_0x00d0
        L_0x00c9:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.booleanValue()
        L_0x00ce:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert.m2273Q0(com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert, long, wx3.d):java.lang.Object");
    }

    /* renamed from: O */
    public void mo2276O(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.mo2276O(oVar);
        Object obj = oVar.f173503E;
        C0797z zVar = obj instanceof C0797z ? (C0797z) obj : null;
        if (zVar != null) {
            C64273c21 liveInfo = zVar.mo3513o().getLiveInfo();
            boolean z = false;
            if (liveInfo != null && liveInfo.f182394f == 2) {
                z = true;
            }
            if (z) {
                mo2315r(oVar, zVar);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01df, code lost:
        if (r10.equals("999") == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ff, code lost:
        if (r10.equals("102") == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0208, code lost:
        if (r10.equals("101") == false) goto L_0x020a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023d  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2280Q(jq3.C60905o r43, android.view.View r44, com.tencent.p014mm.protocal.protobuf.FinderObject r45) {
        /*
            r42 = this;
            r0 = r42
            r1 = r43
            r2 = r44
            r3 = r45
            java.lang.Class<l31.e> r4 = l31.C61212e.class
            ak1.f0$q r15 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            java.lang.Class<ht1.j5> r5 = ht1.C8777j5.class
            java.lang.String r6 = "holder"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "view"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "finderObj"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.Class<tf0.q1> r6 = tf0.C13887q1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            tf0.q1 r6 = (tf0.C13887q1) r6
            android.content.Context r7 = r1.f173499A
            java.lang.String r8 = "holder.context"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Class<tf0.p1> r9 = tf0.C64916p1.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            tf0.p1 r9 = (tf0.C64916p1) r9
            android.content.Context r10 = r1.f173499A
            gy3.C87412m.m108593f(r10, r8)
            ht1.g4 r9 = r9.gr0(r10)
            if (r9 == 0) goto L_0x0045
            te3.hj1 r9 = r9.mo12861q3()
            goto L_0x0046
        L_0x0045:
            r9 = 0
        L_0x0046:
            r14 = 0
            r6.mo13319Lr(r7, r3, r9, r14)
            r6 = 2131302880(0x7f0919e0, float:1.8223859E38)
            android.view.View r7 = r1.mo85812D(r6)
            com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView r7 = (com.tencent.p014mm.plugin.finder.view.FinderFeedLiveRecommendView) r7
            r7.mo4529f()
            android.view.View r6 = r1.mo85812D(r6)
            com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView r6 = (com.tencent.p014mm.plugin.finder.view.FinderFeedLiveRecommendView) r6
            te3.c21 r7 = r3.liveInfo
            if (r7 == 0) goto L_0x0063
            long r11 = r7.f182392d
            goto L_0x0065
        L_0x0063:
            r11 = 0
        L_0x0065:
            r6.getClass()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap<java.lang.String, java.lang.String> r9 = r6.f17771w
            r7.putAll(r9)
            boolean r9 = r6.f17769u
            if (r9 == 0) goto L_0x0079
            java.lang.String r9 = "1"
            goto L_0x007b
        L_0x0079:
            java.lang.String r9 = "0"
        L_0x007b:
            java.lang.String r10 = "button_colour"
            r7.put(r10, r9)
            boolean r9 = r6.f17769u
            r10 = 1
            if (r9 != 0) goto L_0x00bb
            java.util.LinkedList<java.lang.String> r9 = r6.f17763o
            if (r9 == 0) goto L_0x0092
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r10
            if (r9 != r10) goto L_0x0092
            r9 = 1
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            if (r9 == 0) goto L_0x00bb
            int r9 = r6.f17767s
            int r9 = r9 + -2
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "text_index"
            r7.put(r10, r9)
            java.util.LinkedList<java.lang.String> r9 = r6.f17763o
            gy3.C87412m.m108591d(r9)
            int r6 = r6.f17767s
            int r6 = r6 + -2
            java.lang.Object r6 = r9.get(r6)
            java.lang.String r9 = "recommendTips!![curVisiblePosition - 2]"
            gy3.C87412m.m108593f(r6, r9)
            java.lang.String r9 = "text_value"
            r7.put(r9, r6)
        L_0x00bb:
            t91.c$a r6 = t91.C64208c.f181951a
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, java.lang.String>> r9 = t91.C64208c.f181947N
            r9.put(r6, r7)
            di3.d r6 = di3.C86312j.m106911c(r5)
            java.lang.String r9 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r6, r9)
            r16 = r6
            ht1.j5 r16 = (ht1.C8777j5) r16
            ak1.f0$m r17 = ak1.C54067f0.C0064m.TIMELINE_BTN_SHOW
            r19 = 0
            r20 = 4
            r21 = 0
            r18 = r7
            ht1.C8777j5.C8778a.m8606g(r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r1.f173503E
            cm1.z r6 = (cm1.C0797z) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            r7 = 69
            android.content.Context r10 = r1.f173499A
            gy3.C87412m.m108593f(r10, r8)
            r0.mo2399Z0(r6, r7, r10)
            java.lang.String r6 = r3.username
            zc1.b r7 = zc1.C66785b.f191882e
            java.lang.String r7 = r7.mo90662O5()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r7)
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x014e
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(ActivityRouter::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            r25 = r2
            tf0.o1 r25 = (tf0.C13883o1) r25
            android.content.Context r1 = r1.f173499A
            gy3.C87412m.m108593f(r1, r8)
            long r4 = r3.f164794id
            java.lang.String r2 = r3.objectNonceId
            if (r2 != 0) goto L_0x011f
            r29 = r7
            goto L_0x0121
        L_0x011f:
            r29 = r2
        L_0x0121:
            te3.c21 r2 = r3.liveInfo
            if (r2 != 0) goto L_0x012a
            te3.c21 r2 = new te3.c21
            r2.<init>()
        L_0x012a:
            r30 = r2
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            java.lang.String r2 = r3.sessionBuffer
            r37 = r2
            r38 = 0
            r39 = 0
            r40 = 7152(0x1bf0, float:1.0022E-41)
            r41 = 0
            r26 = r1
            r27 = r4
            tf0.C13883o1.C13884a.m13249a(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r4 = 1
            goto L_0x03f3
        L_0x014e:
            android.content.Context r6 = r1.f173499A
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "HABBYGE-MALI, onMediaClick, pageName="
            r8.append(r10)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "Finder.FeedFullLiveConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderHomeUI"
            boolean r8 = gy3.C87412m.m108589b(r8, r6)
            r16 = -1
            if (r8 != 0) goto L_0x0268
            java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
            boolean r8 = gy3.C87412m.m108589b(r8, r6)
            if (r8 == 0) goto L_0x0182
            goto L_0x0268
        L_0x0182:
            di3.d r8 = di3.C86312j.m106911c(r5)
            ht1.j5 r8 = (ht1.C8777j5) r8
            ak1.f0 r8 = r8.getConfig()
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r8.f151430L
            java.lang.Object r6 = r8.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0262
            java.lang.String r8 = "27"
            boolean r10 = gy3.C87412m.m108589b(r6, r8)
            if (r10 == 0) goto L_0x01a7
            boolean r6 = t91.C64208c.f181962l
            if (r6 == 0) goto L_0x01a4
            goto L_0x020c
        L_0x01a4:
            java.lang.String r8 = "9"
            goto L_0x020c
        L_0x01a7:
            java.lang.String r8 = "25"
            boolean r10 = gy3.C87412m.m108589b(r6, r8)
            if (r10 == 0) goto L_0x020f
            java.lang.Class<kq.h> r10 = p185kq.C10383h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            kq.h r10 = (p185kq.C10383h) r10
            kq.l r10 = r10.mo10693DZ()
            z91.b r10 = (z91.C23462b) r10
            java.lang.String r10 = r10.mo36921e()
            java.lang.Class<oq.e> r12 = p217oq.C62120e.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            oq.e r12 = (p217oq.C62120e) r12
            boolean r12 = r12.tu0(r10)
            if (r12 != 0) goto L_0x020f
            if (r10 == 0) goto L_0x020a
            int r6 = r10.hashCode()
            switch(r6) {
                case 48626: goto L_0x0202;
                case 48627: goto L_0x01f9;
                case 48690: goto L_0x01ed;
                case 48780: goto L_0x01e2;
                case 56601: goto L_0x01d9;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            goto L_0x020a
        L_0x01d9:
            java.lang.String r6 = "999"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x020c
            goto L_0x020a
        L_0x01e2:
            java.lang.String r6 = "150"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x020a
            java.lang.String r8 = "15"
            goto L_0x020c
        L_0x01ed:
            java.lang.String r6 = "123"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x01f6
            goto L_0x020a
        L_0x01f6:
            java.lang.String r8 = "38"
            goto L_0x020c
        L_0x01f9:
            java.lang.String r6 = "102"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x020c
            goto L_0x020a
        L_0x0202:
            java.lang.String r6 = "101"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x020c
        L_0x020a:
            java.lang.String r8 = "39"
        L_0x020c:
            r18 = r8
            goto L_0x0211
        L_0x020f:
            r18 = r6
        L_0x0211:
            di3.d r5 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r5, r9)
            ht1.j5 r5 = (ht1.C8777j5) r5
            long r8 = r3.f164794id
            te3.c21 r6 = r3.liveInfo
            if (r6 == 0) goto L_0x0223
            long r13 = r6.f182392d
            goto L_0x0225
        L_0x0223:
            r13 = 0
        L_0x0225:
            java.lang.String r6 = r3.username
            if (r6 != 0) goto L_0x022b
            r10 = r7
            goto L_0x022c
        L_0x022b:
            r10 = r6
        L_0x022c:
            int r6 = r43.mo17363j()
            long r6 = (long) r6
            te3.c21 r12 = r3.liveInfo
            if (r12 == 0) goto L_0x023d
            int r12 = r12.f182393e
            r21 = r6
            long r6 = (long) r12
            r16 = r6
            goto L_0x023f
        L_0x023d:
            r21 = r6
        L_0x023f:
            r23 = 0
            r25 = 0
            r26 = 384(0x180, float:5.38E-43)
            r27 = 0
            r6 = r8
            r8 = r13
            r13 = 1
            r14 = r11
            r11 = r21
            r24 = r4
            r2 = r14
            r4 = 1
            r13 = r16
            r16 = r18
            r17 = r23
            r18 = r25
            r19 = r26
            r20 = r27
            ht1.C8777j5.C8778a.m8603d(r5, r6, r8, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            goto L_0x02dd
        L_0x0262:
            r24 = r4
            r2 = r11
            r4 = 1
            goto L_0x02dd
        L_0x0268:
            r24 = r4
            r2 = r11
            r4 = 1
            di3.d r6 = di3.C86312j.m106911c(r5)
            ht1.j5 r6 = (ht1.C8777j5) r6
            ak1.f0 r6 = r6.getConfig()
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r6.f151431M
            java.lang.String r8 = t91.C64208c.f181960j
            java.lang.Object r6 = r6.get(r8)
            r18 = r6
            java.lang.String r18 = (java.lang.String) r18
            if (r18 == 0) goto L_0x02c7
            di3.d r5 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r5, r9)
            ht1.j5 r5 = (ht1.C8777j5) r5
            long r8 = r3.f164794id
            te3.c21 r6 = r3.liveInfo
            if (r6 == 0) goto L_0x0298
            long r10 = r6.f182392d
            r22 = r10
            goto L_0x029a
        L_0x0298:
            r22 = 0
        L_0x029a:
            java.lang.String r6 = r3.username
            if (r6 != 0) goto L_0x02a0
            r10 = r7
            goto L_0x02a1
        L_0x02a0:
            r10 = r6
        L_0x02a1:
            int r6 = r43.mo17363j()
            long r11 = (long) r6
            te3.c21 r6 = r3.liveInfo
            if (r6 == 0) goto L_0x02af
            int r6 = r6.f182393e
            long r6 = (long) r6
            r13 = r6
            goto L_0x02b1
        L_0x02af:
            r13 = r16
        L_0x02b1:
            r17 = 0
            r19 = 0
            r20 = 384(0x180, float:5.38E-43)
            r25 = 0
            r6 = r8
            r8 = r22
            r16 = r18
            r18 = r19
            r19 = r20
            r20 = r25
            ht1.C8777j5.C8778a.m8603d(r5, r6, r8, r10, r11, r13, r15, r16, r17, r18, r19, r20)
        L_0x02c7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "HABBYGE-MALI, onMediaClick, pageObj:"
            r5.append(r6)
            java.lang.String r6 = t91.C64208c.f181960j
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
        L_0x02dd:
            r5 = 2131304482(0x7f092022, float:1.8227108E38)
            android.view.View r5 = r1.mo85812D(r5)
            com.tencent.mm.plugin.finder.view.FinderVideoBanner r5 = (com.tencent.p014mm.plugin.finder.view.FinderVideoBanner) r5
            android.view.View r5 = r5.getMediaView()
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r5 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r5
            gr1.o2 r5 = r5.getVideoView()
            te3.c21 r6 = r3.liveInfo
            if (r6 == 0) goto L_0x02fa
            int r7 = r6.f182394f
            if (r7 != r4) goto L_0x02fa
            r14 = 1
            goto L_0x02fb
        L_0x02fa:
            r14 = 0
        L_0x02fb:
            if (r6 == 0) goto L_0x0303
            int r6 = r6.f182384X
            if (r6 != r4) goto L_0x0303
            r6 = 1
            goto L_0x0304
        L_0x0303:
            r6 = 0
        L_0x0304:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "liveStatusOpen "
            r7.append(r8)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            java.lang.String r7 = "holder.getAssociatedObject()"
            java.lang.String r8 = " finderLivePlayView:"
            if (r5 == 0) goto L_0x03a6
            boolean r9 = r5.isPlaying()
            if (r9 == 0) goto L_0x03a6
            ph1.b r9 = ph1.C11937b.f34871a
            boolean r10 = r9.mo11813c()
            if (r10 == 0) goto L_0x0334
            boolean r9 = r9.mo11811a(r3)
            if (r9 != 0) goto L_0x0334
            r9 = 1
            goto L_0x0335
        L_0x0334:
            r9 = 0
        L_0x0335:
            if (r9 == 0) goto L_0x03a6
            android.content.Context r9 = r44.getContext()
            r10 = 0
            r11 = 0
            boolean r9 = p182kk.C61104a.m71657m(r9, r11, r10)
            if (r9 != 0) goto L_0x03a6
            if (r14 == 0) goto L_0x03a6
            if (r6 != 0) goto L_0x03a6
            long r9 = r3.f164794id
            ph1.j r6 = r5.mo78640p(r9)
            if (r6 != 0) goto L_0x035a
            java.lang.Object r2 = r1.f173503E
            gy3.C87412m.m108593f(r2, r7)
            cm1.i2 r2 = (cm1.C0740i2) r2
            r0.mo2392S0(r2, r1, r11)
            return r4
        L_0x035a:
            ph1.i r7 = ph1.C62293i.f177081a
            android.content.Context r11 = r44.getContext()
            java.lang.String r12 = "view.context"
            gy3.C87412m.m108593f(r11, r12)
            ph1.m r7 = r7.mo87363h(r11, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "startSwitchOutFromSquare animation for feed:"
            r11.append(r12)
            java.lang.String r9 = o40.C61926c.m72691p(r9)
            r11.append(r9)
            java.lang.String r9 = " res:["
            r11.append(r9)
            int r9 = r6.f177092d
            r11.append(r9)
            java.lang.String r9 = " x "
            r11.append(r9)
            int r6 = r6.f177093e
            r11.append(r6)
            r11.append(r8)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r5)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$c r2 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$c
            r2.<init>(r0, r1)
            r7.mo84323h(r2)
            goto L_0x03d2
        L_0x03a6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "startSwitchOutFromSquare no animation for feed:"
            r6.append(r9)
            long r9 = r3.f164794id
            java.lang.String r9 = o40.C61926c.m72691p(r9)
            r6.append(r9)
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r5)
            java.lang.Object r2 = r1.f173503E
            gy3.C87412m.m108593f(r2, r7)
            cm1.i2 r2 = (cm1.C0740i2) r2
            r5 = 0
            r0.mo2392S0(r2, r1, r5)
        L_0x03d2:
            di3.d r1 = di3.C86312j.m106911c(r24)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "live_room_card"
            r5 = r44
            r1.o30(r5, r2)
            di3.d r1 = di3.C86312j.m106911c(r24)
            l31.e r1 = (l31.C61212e) r1
            te3.c21 r2 = r3.liveInfo
            java.util.Map r2 = r0.mo2394U0(r2)
            r3 = 26236(0x667c, float:3.6764E-41)
            java.lang.String r6 = "view_clk"
            r1.mo86153W7(r6, r5, r2, r3)
        L_0x03f3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert.mo2280Q(jq3.o, android.view.View, com.tencent.mm.protocal.protobuf.FinderObject):boolean");
    }

    /* renamed from: R */
    public void mo2281R(C60905o oVar, View view, MotionEvent motionEvent, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(motionEvent, "e");
    }

    /* renamed from: R0 */
    public final void mo2391R0(long j, boolean z) {
        String str = this.f12780N;
        Log.m105924i(str, "checkDeleteLiveFeed feedId: " + j + " isNeedCheck: " + z);
        C60905o T0 = mo2393T0(j);
        Object obj = null;
        if (T0 != null) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) T0.f173503E;
            if ((baseFinderFeed != null ? baseFinderFeed.getItemId() : 0) != j) {
                String str2 = this.f12780N;
                StringBuilder sb = new StringBuilder();
                sb.append("checkDeleteLiveFeed isShown = false, feedId: ");
                sb.append(j);
                sb.append(" deleteJob: ");
                C53973z1 z1Var = this.f12781P;
                if (z1Var != null) {
                    obj = Boolean.valueOf(z1Var.mo74466a());
                }
                sb.append(obj);
                Log.m105920e(str2, sb.toString());
                return;
            }
            BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) T0.f173503E;
            C0797z zVar = baseFinderFeed2 instanceof C0797z ? (C0797z) baseFinderFeed2 : null;
            if (zVar != null) {
                if (z) {
                    C64273c21 liveInfo = zVar.mo3513o().getLiveInfo();
                    boolean z2 = false;
                    if (liveInfo != null && liveInfo.f182394f == 2) {
                        z2 = true;
                    }
                    if (!z2) {
                        String str3 = this.f12780N;
                        Log.m105924i(str3, "checkDeleteLiveFeed status not end, feedId: " + j);
                        obj = C13598b0.f38549a;
                    }
                }
                C53973z1 z1Var2 = this.f12781P;
                if (z1Var2 != null) {
                    C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                }
                this.f12781P = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C2406a(this, j, (C15601d<? super C2406a>) null), 3, (Object) null);
                obj = C13598b0.f38549a;
            }
            if (obj == null) {
                String str4 = this.f12780N;
                Log.m105924i(str4, "checkDeleteLiveFeed holder data not FinderFeedLive, " + j);
            }
            obj = C13598b0.f38549a;
        }
        if (obj == null) {
            String str5 = this.f12780N;
            Log.m105924i(str5, "checkDeleteLiveFeed cur holder = null feedId, " + j);
        }
    }

    /* renamed from: S0 */
    public final void mo2392S0(C0740i2 i2Var, C60905o oVar, boolean z) {
        String str;
        C50124kf1 kf12;
        C51384te1 te12;
        String str2;
        FinderItem o;
        FinderItem o2;
        FinderItem o3;
        FinderItem o4;
        FinderItem o5;
        FinderItem o6;
        FinderItem o7;
        FinderObject feedObject;
        FinderItem o8;
        Class cls = C10649f.class;
        Intent intent = new Intent();
        boolean z2 = i2Var instanceof BaseFinderFeed;
        FinderObject finderObject = null;
        BaseFinderFeed baseFinderFeed = z2 ? (BaseFinderFeed) i2Var : null;
        long j = 0;
        intent.putExtra("CURRENT_FEED_ID", (baseFinderFeed == null || (o8 = baseFinderFeed.mo3513o()) == null) ? 0 : o8.getId());
        BaseFinderFeed baseFinderFeed2 = z2 ? (BaseFinderFeed) i2Var : null;
        intent.putExtra("key_ad_flag", (baseFinderFeed2 == null || (o7 = baseFinderFeed2.mo3513o()) == null || (feedObject = o7.getFeedObject()) == null) ? 0 : feedObject.adFlag);
        intent.putExtra("LAUNCH_WITH_ANIM", z);
        intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
        intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", false);
        MMActivity activity = this.f12564e.getActivity();
        if (activity != null) {
            BaseFinderFeed baseFinderFeed3 = z2 ? (BaseFinderFeed) i2Var : null;
            if (!(baseFinderFeed3 == null || (o6 = baseFinderFeed3.mo3513o()) == null)) {
                j = o6.getId();
            }
            C50355m51 m512 = new C50355m51();
            C50217l51 l512 = new C50217l51();
            C52294zq0 zq02 = new C52294zq0();
            C52294zq0 z0 = ((C8809w2) C39818r.f106831a.mo62444c(activity).mo62447c(C8809w2.class)).mo9638z0(j);
            zq02.f146179d = z0 != null ? z0.f146179d : null;
            l512.f137181d = zq02;
            m512.f137842d = l512;
            BaseFinderFeed baseFinderFeed4 = z2 ? (BaseFinderFeed) i2Var : null;
            m512.f137843e = (baseFinderFeed4 == null || (o5 = baseFinderFeed4.mo3513o()) == null) ? null : o5.getDescription();
            BaseFinderFeed baseFinderFeed5 = z2 ? (BaseFinderFeed) i2Var : null;
            m512.f137844f = (baseFinderFeed5 == null || (o4 = baseFinderFeed5.mo3513o()) == null) ? null : o4.getLocation();
            intent.putExtra("PRE_JOIN_LIVE_INFO", m512.toByteArray());
        }
        BaseFinderFeed baseFinderFeed6 = z2 ? (BaseFinderFeed) i2Var : null;
        FinderObject feedObject2 = (baseFinderFeed6 == null || (o3 = baseFinderFeed6.mo3513o()) == null) ? null : o3.getFeedObject();
        if (!(this.f12779M == 0 || feedObject2 == null)) {
            Log.m105924i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI rewrite commentScene:" + this.f12779M + " sessionBuffer:" + feedObject2.sessionBuffer);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).j80(feedObject2, this.f12779M);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(i2Var);
        C13604l<List<FinderObject>, Integer> sr = ((C10649f) C86312j.m106911c(cls)).mo10915sr(arrayList, i2Var);
        List list = (List) sr.f38555d;
        int intValue = ((Number) sr.f38556e).intValue();
        C64279c90 c902 = new C64279c90();
        String str3 = "";
        c902.f182444d = str3;
        c902.f182445e = str3;
        c902.f182446f = false;
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = 1;
        C64686ro2 ro22 = new C64686ro2();
        ro22.f185214e = this.f12779M;
        BaseFinderFeed baseFinderFeed7 = z2 ? (BaseFinderFeed) i2Var : null;
        if (baseFinderFeed7 == null || (o2 = baseFinderFeed7.mo3513o()) == null || (str = o2.getNickName()) == null) {
            str = str3;
        }
        ro22.f185215f = str;
        BaseFinderFeed baseFinderFeed8 = z2 ? (BaseFinderFeed) i2Var : null;
        if (!(baseFinderFeed8 == null || (o = baseFinderFeed8.mo3513o()) == null)) {
            finderObject = o.getFeedObject();
        }
        ro22.f185218i = finderObject;
        c902.f182450j = ro22;
        C64347eq2 eq22 = new C64347eq2();
        eq22.f183026q = oVar.mo17363j() + 1;
        if (!(feedObject2 == null || (kf12 = feedObject2.object_extend) == null || (te12 = kf12.f136749h) == null || (str2 = te12.f142158f) == null)) {
            str3 = str2;
        }
        byte[] bytes = str3.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        eq22.f183017e = new C89349b(bytes, 0, bytes.length);
        c902.f182451n = eq22;
        C0576n4.f1379b.mo600c(intent);
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        ((C10649f) C86312j.m106911c(cls)).mo10913cP(context, intent, list, intValue, c902, (C10649f.C10650a) null);
    }

    /* renamed from: T0 */
    public final C60905o mo2393T0(long j) {
        RecyclerView recyclerView = this.f12554A;
        RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null) {
            return (C60905o) C60898l.m71330b6(wxRecyclerAdapter, j, false, 2, (Object) null);
        }
        return null;
    }

    /* renamed from: U */
    public void mo2284U(long j) {
        String str = this.f12780N;
        StringBuilder sb = new StringBuilder();
        sb.append("onScrollIdle focusPos: ");
        C60905o oVar = this.f12581y;
        sb.append(oVar != null ? Integer.valueOf(oVar.mo17363j()) : null);
        sb.append(" feedId: ");
        sb.append(j);
        Log.m105924i(str, sb.toString());
        C60905o T0 = mo2393T0(j);
        if (T0 != null) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) T0.f173503E;
            if ((baseFinderFeed != null ? baseFinderFeed.getItemId() : 0) != j) {
                String str2 = this.f12780N;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onScrollIdle isShown = false, feedId: ");
                sb4.append(j);
                sb4.append(" deleteJob: ");
                C53973z1 z1Var = this.f12781P;
                sb4.append(z1Var != null ? Boolean.valueOf(((C53851a) z1Var).mo74466a()) : null);
                Log.m105924i(str2, sb4.toString());
                C53973z1 z1Var2 = this.f12781P;
                if (z1Var2 != null) {
                    C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                    return;
                }
                return;
            }
            this.f12782Q = j;
            mo2391R0(j, true);
        }
    }

    /* renamed from: U0 */
    public final Map<String, Object> mo2394U0(C64273c21 c212) {
        C13604l[] lVarArr = new C13604l[3];
        boolean z = false;
        lVarArr[0] = new C13604l("live_id", c212 != null ? C61926c.m72691p(c212.f182392d) : 0);
        if (c212 != null && c212.f182394f == 1) {
            z = true;
        }
        lVarArr[1] = new C13604l("live_enter_status", Long.valueOf(z ? 1 : 2));
        lVarArr[2] = new C13604l("share_username", "");
        return C90364q0.m113147f(lVarArr);
    }

    /* renamed from: V0 */
    public final void mo2395V0(C60905o oVar, C64273c21 c212, long j) {
        C13598b0 b0Var;
        if (oVar != null) {
            Log.m105924i("Finder.FeedFullLiveConvert", "handleLiveStatus");
            View D = oVar.mo85812D(C0966R.C0970id.fv8);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "handleLiveStatusEnd", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "handleLiveStatusEnd", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.dgq);
            if (imageView != null) {
                imageView.animate().cancel();
                imageView.setVisibility(0);
            }
            ((FinderFeedLiveRecommendView) oVar.mo85812D(C0966R.C0970id.d9p)).mo4539i(c212, 2);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("Finder.FeedFullLiveConvert", "handleLiveStatus holder:" + oVar);
        }
    }

    /* renamed from: W */
    public void mo2286W(C60905o oVar, int i, int i2, boolean z) {
        FinderItem o;
        C87412m.m108594g(oVar, "holder");
        super.mo2286W(oVar, i, i2, z);
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) rVar.mo62443b(context).mo62449e(FinderHomeUIC.class);
        int d3 = finderHomeUIC != null ? finderHomeUIC.mo5128d3() : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("onUnFocusFeedCenter isFromScroll:");
        sb.append(z);
        sb.append(",newTabType:");
        sb.append(d3);
        sb.append(",curTabType:");
        sb.append(this.f12566g);
        sb.append(',');
        C63947a aVar = C63947a.f181274a;
        Object obj = oVar.f173503E;
        C49712hj1 hj12 = null;
        C0797z zVar = obj instanceof C0797z ? (C0797z) obj : null;
        sb.append(aVar.mo88736v((zVar == null || (o = zVar.mo3513o()) == null) ? null : o.getLiveInfo()));
        Log.m105924i("Finder.FeedFullLiveConvert", sb.toString());
        if (z || d3 != this.f12566g) {
            Context context2 = oVar.mo85811C().getContext();
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            mo2400a1(activity != null ? activity.getWindow() : null);
        }
        Object obj2 = oVar.f173503E;
        C0797z zVar2 = obj2 instanceof C0797z ? (C0797z) obj2 : null;
        if (zVar2 != null) {
            C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
            Context context3 = oVar.f173499A;
            C87412m.m108593f(context3, "holder.context");
            FinderObject feedObject = zVar2.mo3513o().getFeedObject();
            Context context4 = oVar.f173499A;
            C87412m.m108593f(context4, "holder.context");
            C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context4);
            if (gr02 != null) {
                hj12 = gr02.mo12861q3();
            }
            q1Var.mo13319Lr(context3, feedObject, hj12, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2396W0(cm1.C0797z r6) {
        /*
            r5 = this;
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r6.mo3513o()
            te3.c21 r0 = r0.getLiveInfo()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            te3.by0 r0 = r0.f182402p0
            if (r0 == 0) goto L_0x001c
            int r3 = r0.f131380d
            int r4 = ks3.C10411s.f31639a
            if (r3 != r1) goto L_0x001c
            int r0 = r0.f131383g
            if (r0 == r1) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0069
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r6.mo3513o()
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r0.f182395g
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 == 0) goto L_0x0038
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 != 0) goto L_0x0069
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r6.mo3513o()
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x0051
            sk1.a r3 = sk1.C63947a.f181274a
            java.lang.String r4 = ""
            boolean r0 = r3.mo88733s(r0, r4)
            if (r0 != 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 != 0) goto L_0x0069
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            te3.c21 r6 = r6.getLiveInfo()
            if (r6 == 0) goto L_0x0064
            int r6 = r6.f182384X
            if (r6 != r1) goto L_0x0064
            r6 = 1
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r6 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert.mo2396W0(cm1.z):boolean");
    }

    /* renamed from: X */
    public void mo2287X(C58259c.C58260a aVar) {
        C60905o oVar;
        C87412m.m108594g(aVar, "ev");
        RecyclerView recyclerView = this.f12554A;
        C49712hj1 hj12 = null;
        RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null && (oVar = (C60905o) C60898l.m71330b6(wxRecyclerAdapter, aVar.f166817h, false, 2, (Object) null)) != null) {
            Object obj = oVar.f173503E;
            C0797z zVar = obj instanceof C0797z ? (C0797z) obj : null;
            if (zVar != null) {
                C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderObject feedObject = zVar.mo3513o().getFeedObject();
                Context context2 = oVar.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context2);
                if (gr02 != null) {
                    hj12 = gr02.mo12861q3();
                }
                q1Var.mo13319Lr(context, feedObject, hj12, true);
                ((FinderFeedLiveRecommendView) oVar.mo85812D(C0966R.C0970id.d9p)).mo4529f();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r21, cm1.C0797z r22, int r23, int r24, boolean r25, java.util.List<java.lang.Object> r26) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            super.mo44e(r21, r22, r23, r24, r25, r26)
            if (r25 != 0) goto L_0x02b3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onBindViewHolder liveFeedStateChangeListener:"
            r3.append(r4)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 r4 = r0.f12784S
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.FeedFullLiveConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1 r3 = r0.f12784S
            r3.alive()
            java.lang.String r3 = r0.f12780N
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onBindViewHolder getItemId: "
            r5.append(r6)
            long r6 = r22.getItemId()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x0059
            int r3 = r3.f182394f
            goto L_0x005a
        L_0x0059:
            r3 = 2
        L_0x005a:
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            r7 = 2131315204(0x7f094a04, float:1.8248855E38)
            android.view.View r7 = r1.mo85812D(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131303236(0x7f091b44, float:1.822458E38)
            android.view.View r8 = r1.mo85812D(r8)
            r10 = r8
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r8 = 32
            if (r10 != 0) goto L_0x00b1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "[refreshMask] holder="
            r9.append(r11)
            int r11 = r1.f44859i
            r9.append(r11)
            java.lang.String r11 = " position="
            r9.append(r11)
            int r11 = r21.mo17363j()
            r9.append(r11)
            java.lang.String r11 = " data="
            r9.append(r11)
            java.lang.Object r11 = r1.f173503E
            r9.append(r11)
            java.lang.String r11 = " holder="
            r9.append(r11)
            r9.append(r1)
            r9.append(r8)
            android.view.View r11 = r1.f44854d
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r9)
        L_0x00b1:
            r9 = 2131307628(0x7f092c6c, float:1.8233489E38)
            android.view.View r9 = r1.mo85812D(r9)
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r22.mo3513o()
            java.util.LinkedList r11 = r11.getLiveMediaList()
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            te3.rq2 r11 = (te3.C64689rq2) r11
            r19 = 0
            if (r11 != 0) goto L_0x00f1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r22.mo3513o()
            te3.c21 r13 = r13.getLiveInfo()
            if (r13 == 0) goto L_0x00e0
            long r13 = r13.f182392d
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x00e2
        L_0x00e0:
            r13 = r19
        L_0x00e2:
            r12.append(r13)
            java.lang.String r13 = " firstMedia is empty"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
        L_0x00f1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r11 == 0) goto L_0x00fb
            java.lang.String r13 = r11.f185283w
            goto L_0x00fd
        L_0x00fb:
            r13 = r19
        L_0x00fd:
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r12.append(r13)
            if (r11 == 0) goto L_0x0109
            java.lang.String r13 = r11.f185234A
            goto L_0x010b
        L_0x0109:
            r13 = r19
        L_0x010b:
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x0142
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r11 == 0) goto L_0x0126
            java.lang.String r13 = r11.f185267e
            goto L_0x0128
        L_0x0126:
            r13 = r19
        L_0x0128:
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            r12.append(r13)
            if (r11 == 0) goto L_0x0134
            java.lang.String r11 = r11.f185288z
            goto L_0x0136
        L_0x0134:
            r11 = r19
        L_0x0136:
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            goto L_0x0143
        L_0x0142:
            r11 = r12
        L_0x0143:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "refreshMask item="
            r12.append(r13)
            fe1.q r13 = r22.mo3507l()
            if (r13 == 0) goto L_0x0158
            java.lang.String r13 = r13.getNickname()
            goto L_0x015a
        L_0x0158:
            r13 = r19
        L_0x015a:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            r4 = 0
            if (r10 != 0) goto L_0x0168
            goto L_0x016b
        L_0x0168:
            r10.setVisibility(r4)
        L_0x016b:
            r12 = 8
            if (r7 != 0) goto L_0x0170
            goto L_0x0173
        L_0x0170:
            r7.setVisibility(r12)
        L_0x0173:
            r7 = 1
            if (r3 != r7) goto L_0x0181
            android.view.View r7 = r1.f44854d
            ve1.h2 r13 = new ve1.h2
            r13.<init>(r1, r2, r3, r0)
            r7.post(r13)
            goto L_0x0194
        L_0x0181:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            te3.c21 r3 = r3.getLiveInfo()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r22.mo3513o()
            long r13 = r7.getId()
            r0.mo2395V0(r1, r3, r13)
        L_0x0194:
            boolean r3 = r0.mo2396W0(r2)
            java.lang.String r7 = "blurView"
            if (r3 == 0) goto L_0x020b
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r13 = r3.mo62446e(r6)
            bl3.c r13 = r13.mo62447c(r5)
            pl1.s0 r13 = (pl1.C11990s0) r13
            k60.d r13 = r13.mo11871f2()
            pl1.t r14 = new pl1.t
            r14.<init>(r11)
            gy3.C87412m.m108593f(r10, r7)
            pl1.e0$a r7 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r3 = r3.mo62446e(r6)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r7)
            r13.mo85957c(r14, r10, r3)
            if (r9 != 0) goto L_0x01ca
            goto L_0x0222
        L_0x01ca:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r3.mo10233c(r5)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert"
            java.lang.String r14 = "refreshMask"
            java.lang.String r15 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r9
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r9.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert"
            java.lang.String r13 = "refreshMask"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0222
        L_0x020b:
            java.lang.Class<tf0.q1> r3 = tf0.C13887q1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r4 = "getService(IFinderCommonLiveService::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            r9 = r3
            tf0.q1 r9 = (tf0.C13887q1) r9
            gy3.C87412m.m108593f(r10, r7)
            r12 = 0
            r13 = 4
            r14 = 0
            tf0.C13887q1.C13888a.m13309e(r9, r10, r11, r12, r13, r14)
        L_0x0222:
            android.view.View r3 = r1.f44854d
            android.content.Context r3 = r3.getContext()
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r4 == 0) goto L_0x0230
            r19 = r3
            com.tencent.mm.plugin.finder.ui.MMFinderUI r19 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r19
        L_0x0230:
            r15 = r19
            if (r15 == 0) goto L_0x02b3
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            long r3 = r3.block_cgi_flag
            r5 = 1
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0278
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62444c(r15)
            java.lang.Class<ht1.w2> r4 = ht1.C8809w2.class
            bl3.c r3 = r3.mo62447c(r4)
            r9 = r3
            ht1.w2 r9 = (ht1.C8809w2) r9
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            long r10 = r3.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            java.lang.String r12 = r3.getObjectNonceId()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x0274
            long r3 = r3.f182392d
            r13 = r3
            goto L_0x0275
        L_0x0274:
            r13 = r5
        L_0x0275:
            r9.mo9637P0(r10, r12, r13, r15)
        L_0x0278:
            com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$b r3 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$b
            r3.<init>(r0, r2)
            r4 = 2131304482(0x7f092022, float:1.8227108E38)
            android.view.View r1 = r1.mo85812D(r4)
            if (r1 == 0) goto L_0x02b3
            java.lang.Class<l31.e> r4 = l31.C61212e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            l31.e r4 = (l31.C61212e) r4
            java.lang.String r5 = "live_room_card"
            l31.e r4 = r4.o30(r1, r5)
            r5 = 26236(0x667c, float:3.6764E-41)
            l31.e r4 = r4.mo86175pO(r1, r8, r5)
            r4.E60(r1, r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r22.mo3513o()
            android.content.Context r3 = r1.getContext()
            java.lang.String r4 = "view.context"
            gy3.C87412m.m108593f(r3, r4)
            ve1.g2 r4 = new ve1.g2
            r4.<init>(r2, r0, r3)
            zp3.C23564m.m28138h(r1, r4)
        L_0x02b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert.mo44e(jq3.o, cm1.z, int, int, boolean, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088 A[SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2288Y(df1.C58259c.C58260a r13) {
        /*
            r12 = this;
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            java.lang.String r2 = "ev"
            gy3.C87412m.m108594g(r13, r2)
            androidx.recyclerview.widget.RecyclerView r2 = r12.f12554A
            r3 = 0
            if (r2 == 0) goto L_0x0013
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            goto L_0x0014
        L_0x0013:
            r2 = r3
        L_0x0014:
            boolean r4 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r4 == 0) goto L_0x001c
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r2
            r4 = r2
            goto L_0x001d
        L_0x001c:
            r4 = r3
        L_0x001d:
            if (r4 != 0) goto L_0x0020
            return
        L_0x0020:
            long r5 = r13.f166817h
            r7 = 0
            r8 = 2
            r9 = 0
            androidx.recyclerview.widget.RecyclerView$z r13 = jq3.C60898l.m71330b6(r4, r5, r7, r8, r9)
            jq3.o r13 = (jq3.C60905o) r13
            if (r13 != 0) goto L_0x002e
            return
        L_0x002e:
            java.lang.Object r2 = r13.f173503E
            boolean r4 = r2 instanceof cm1.C0797z
            if (r4 == 0) goto L_0x0037
            cm1.z r2 = (cm1.C0797z) r2
            goto L_0x0038
        L_0x0037:
            r2 = r3
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return
        L_0x003b:
            di3.d r4 = di3.C86312j.m106911c(r1)
            tf0.p1 r4 = (tf0.C64916p1) r4
            android.content.Context r5 = r13.f173499A
            java.lang.String r6 = "holder.context"
            gy3.C87412m.m108593f(r5, r6)
            ht1.g4 r4 = r4.gr0(r5)
            r5 = 0
            if (r4 == 0) goto L_0x0054
            int r4 = r4.mo12864t3()
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            r6 = 2131302880(0x7f0919e0, float:1.8223859E38)
            android.view.View r6 = r13.mo85812D(r6)
            com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView r6 = (com.tencent.p014mm.plugin.finder.view.FinderFeedLiveRecommendView) r6
            monitor-enter(r6)
            java.util.LinkedList<java.lang.String> r7 = r6.f17763o     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x006c
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r7 = 0
            goto L_0x006d
        L_0x006c:
            r7 = 1
        L_0x006d:
            if (r7 != 0) goto L_0x0088
            boolean r7 = r6.f17768t     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x0088
            boolean r7 = r6.f17769u     // Catch:{ all -> 0x020b }
            if (r7 != 0) goto L_0x0088
            boolean r7 = r6.f17770v     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x0088
            r6.mo4538h()     // Catch:{ all -> 0x020b }
            java.lang.String r5 = r6.f17755d     // Catch:{ all -> 0x020b }
            java.lang.String r7 = "[startRecommendTipsAnim] resume anim"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ all -> 0x020b }
            monitor-exit(r6)
            goto L_0x01cc
        L_0x0088:
            boolean r7 = r6.f17768t     // Catch:{ all -> 0x020b }
            if (r7 != 0) goto L_0x01c4
            boolean r7 = r6.f17769u     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x0092
            goto L_0x01c4
        L_0x0092:
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ all -> 0x020b }
            r7.<init>()     // Catch:{ all -> 0x020b }
            r6.f17763o = r7     // Catch:{ all -> 0x020b }
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r6.f17771w     // Catch:{ all -> 0x020b }
            java.lang.String r8 = "liveid"
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r2.mo3513o()     // Catch:{ all -> 0x020b }
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFinderObject()     // Catch:{ all -> 0x020b }
            te3.c21 r9 = r9.liveInfo     // Catch:{ all -> 0x020b }
            if (r9 == 0) goto L_0x00b0
            long r9 = r9.f182392d     // Catch:{ all -> 0x020b }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x020b }
            goto L_0x00b1
        L_0x00b0:
            r9 = r3
        L_0x00b1:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x020b }
            r7.put(r8, r9)     // Catch:{ all -> 0x020b }
            java.lang.String r8 = "feedid"
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r2.mo3513o()     // Catch:{ all -> 0x020b }
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFinderObject()     // Catch:{ all -> 0x020b }
            long r9 = r9.f164794id     // Catch:{ all -> 0x020b }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x020b }
            r7.put(r8, r9)     // Catch:{ all -> 0x020b }
            java.lang.String r8 = "text_total"
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r2.mo3513o()     // Catch:{ all -> 0x020b }
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFinderObject()     // Catch:{ all -> 0x020b }
            te3.c21 r9 = r9.liveInfo     // Catch:{ all -> 0x020b }
            if (r9 == 0) goto L_0x00e7
            java.util.LinkedList<java.lang.String> r9 = r9.f182382W     // Catch:{ all -> 0x020b }
            if (r9 == 0) goto L_0x00e7
            int r9 = r9.size()     // Catch:{ all -> 0x020b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x020b }
            goto L_0x00e8
        L_0x00e7:
            r9 = r3
        L_0x00e8:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x020b }
            r7.put(r8, r9)     // Catch:{ all -> 0x020b }
            up1.f r7 = up1.C37521f.f99374d     // Catch:{ all -> 0x020b }
            r7.getClass()     // Catch:{ all -> 0x020b }
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99258P6     // Catch:{ all -> 0x020b }
            java.lang.Object r8 = r7.mo60266n()     // Catch:{ all -> 0x020b }
            java.lang.Number r8 = (java.lang.Number) r8     // Catch:{ all -> 0x020b }
            int r8 = r8.intValue()     // Catch:{ all -> 0x020b }
            r9 = -1
            if (r8 != r9) goto L_0x014e
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()     // Catch:{ all -> 0x020b }
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFinderObject()     // Catch:{ all -> 0x020b }
            te3.c21 r7 = r7.liveInfo     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x0118
            java.util.LinkedList<java.lang.String> r7 = r7.f182382W     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x0118
            int r7 = r7.size()     // Catch:{ all -> 0x020b }
            goto L_0x0119
        L_0x0118:
            r7 = 0
        L_0x0119:
            java.lang.String r8 = r6.f17755d     // Catch:{ all -> 0x020b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r9.<init>()     // Catch:{ all -> 0x020b }
            java.lang.String r10 = "[startRecommendTipsAnim] using svr data,size = "
            r9.append(r10)     // Catch:{ all -> 0x020b }
            r9.append(r7)     // Catch:{ all -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x020b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x020b }
            if (r7 <= 0) goto L_0x018d
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()     // Catch:{ all -> 0x020b }
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFinderObject()     // Catch:{ all -> 0x020b }
            te3.c21 r7 = r7.liveInfo     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x018d
            java.util.LinkedList<java.lang.String> r7 = r7.f182382W     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x018d
            java.util.LinkedList<java.lang.String> r8 = r6.f17763o     // Catch:{ all -> 0x020b }
            if (r8 == 0) goto L_0x018d
            r9 = 3
            java.util.List r7 = sx3.C110818d0.m150947s0(r7, r9)     // Catch:{ all -> 0x020b }
            r8.addAll(r7)     // Catch:{ all -> 0x020b }
            goto L_0x018d
        L_0x014e:
            java.lang.Object r7 = r7.mo60266n()     // Catch:{ all -> 0x020b }
            java.lang.Number r7 = (java.lang.Number) r7     // Catch:{ all -> 0x020b }
            int r7 = r7.intValue()     // Catch:{ all -> 0x020b }
            java.lang.String r8 = r6.f17755d     // Catch:{ all -> 0x020b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r9.<init>()     // Catch:{ all -> 0x020b }
            java.lang.String r10 = "[startRecommendTipsAnim] using fake data,size = "
            r9.append(r10)     // Catch:{ all -> 0x020b }
            r9.append(r7)     // Catch:{ all -> 0x020b }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x020b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ all -> 0x020b }
            r8 = 0
        L_0x016f:
            if (r8 >= r7) goto L_0x018d
            java.util.LinkedList<java.lang.String> r9 = r6.f17763o     // Catch:{ all -> 0x020b }
            if (r9 == 0) goto L_0x018a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x020b }
            r10.<init>()     // Catch:{ all -> 0x020b }
            java.lang.String r11 = "test_"
            r10.append(r11)     // Catch:{ all -> 0x020b }
            r10.append(r8)     // Catch:{ all -> 0x020b }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x020b }
            r9.add(r10)     // Catch:{ all -> 0x020b }
        L_0x018a:
            int r8 = r8 + 1
            goto L_0x016f
        L_0x018d:
            java.util.LinkedList<java.lang.String> r7 = r6.f17763o     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x0196
            java.lang.String r8 = " "
            r7.add(r5, r8)     // Catch:{ all -> 0x020b }
        L_0x0196:
            java.util.LinkedList<java.lang.String> r7 = r6.f17763o     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x019f
            java.lang.String r8 = " "
            r7.addLast(r8)     // Catch:{ all -> 0x020b }
        L_0x019f:
            java.util.LinkedList<java.lang.String> r7 = r6.f17763o     // Catch:{ all -> 0x020b }
            if (r7 == 0) goto L_0x01a8
            java.lang.String r8 = " "
            r7.addLast(r8)     // Catch:{ all -> 0x020b }
        L_0x01a8:
            com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r6.getRecyclerView()     // Catch:{ all -> 0x020b }
            r7.setVisibility(r5)     // Catch:{ all -> 0x020b }
            androidx.recyclerview.widget.RecyclerView$e r5 = r6.getAdapter()     // Catch:{ all -> 0x020b }
            r5.notifyDataSetChanged()     // Catch:{ all -> 0x020b }
            com.tencent.mm.view.recyclerview.WxRecyclerView r5 = r6.getRecyclerView()     // Catch:{ all -> 0x020b }
            com.tencent.mm.plugin.finder.view.r2 r7 = new com.tencent.mm.plugin.finder.view.r2     // Catch:{ all -> 0x020b }
            r7.<init>(r6)     // Catch:{ all -> 0x020b }
            r5.post(r7)     // Catch:{ all -> 0x020b }
            monitor-exit(r6)
            goto L_0x01cc
        L_0x01c4:
            java.lang.String r5 = r6.f17755d     // Catch:{ all -> 0x020b }
            java.lang.String r7 = "[startRecommendTipsAnim] hasStartAnim or hasFinishAnim,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ all -> 0x020b }
            monitor-exit(r6)
        L_0x01cc:
            di3.d r5 = di3.C86312j.m106911c(r0)
            tf0.q1 r5 = (tf0.C13887q1) r5
            int r6 = r12.f12566g
            boolean r4 = r5.mo13341cR(r6, r4, r2)
            if (r4 != 0) goto L_0x01db
            return
        L_0x01db:
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.q1 r0 = (tf0.C13887q1) r0
            android.content.Context r4 = r13.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.p1 r1 = (tf0.C64916p1) r1
            android.content.Context r13 = r13.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r13, r5)
            ht1.g4 r13 = r1.gr0(r13)
            if (r13 == 0) goto L_0x0207
            te3.hj1 r3 = r13.mo12861q3()
        L_0x0207:
            r0.mo13310Ho(r4, r2, r3)
            return
        L_0x020b:
            r13 = move-exception
            monitor-exit(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert.mo2288Y(df1.c$a):void");
    }

    /* renamed from: Y0 */
    public void mo2282S(C60905o oVar, View view, C0797z zVar, MotionEvent motionEvent) {
        C60905o oVar2 = oVar;
        View view2 = view;
        C0797z zVar2 = zVar;
        Class cls = C64916p1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(zVar2, "item");
        Log.m105924i("Finder.FeedFullLiveConvert", "[onMediaLongClick] feedId=" + C61926c.m72691p(zVar.getItemId()));
        if (mo2313q(zVar2) && zVar.mo3513o().getMediaType() == 9 && !zVar.mo3479M()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99515s8.mo60266n().intValue() != 1 || this.f12564e.mo2497u0()) {
                Context context = oVar2.f173499A;
                C87412m.m108593f(context, "holder.context");
                C60172g4 gr02 = ((C64916p1) C86312j.m106911c(cls)).gr0(context);
                String valueOf = String.valueOf(gr02 != null ? Integer.valueOf(gr02.mo12864t3()) : null);
                Context context2 = oVar2.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C60172g4 gr03 = ((C64916p1) C86312j.m106911c(cls)).gr0(context2);
                String v3 = gr03 != null ? gr03.mo12866v3() : null;
                C8777j5 j5Var = (C8777j5) C86312j.m106911c(C8777j5.class);
                C54067f0.C0066n nVar = C54067f0.C0066n.PANEL_UNLIKE_BUTTON;
                C13604l[] lVarArr = new C13604l[4];
                C64273c21 liveInfo = zVar.mo3513o().getLiveInfo();
                lVarArr[0] = new C13604l("liveId", String.valueOf(liveInfo != null ? Long.valueOf(liveInfo.f182392d) : null));
                FinderObject feedObject = zVar.mo3513o().getFeedObject();
                lVarArr[1] = new C13604l("feedId", String.valueOf(feedObject != null ? Long.valueOf(feedObject.f164794id) : null));
                lVarArr[2] = new C13604l("panel_sence", "1");
                lVarArr[3] = new C13604l("sessionBuffer", zVar.mo3526z());
                j5Var.lb0(nVar, C90364q0.m113148g(lVarArr), v3, valueOf, zVar.mo3526z());
                view2.performHapticFeedback(0, 2);
                mo2272M(oVar2, zVar2, view2, 3);
                return;
            }
            C77407n nVar2 = new C77407n(oVar2.f173499A, 1, false);
            nVar2.f225771i = this.f12564e.mo2570B5(zVar2, nVar2);
            nVar2.f225782p = this.f12564e.mo2573X2(zVar2, oVar2);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).wx0(oVar2, zVar.getItemId(), zVar.mo3513o());
            C76874e0 e0Var = new C76874e0(oVar2.f173499A);
            this.f12564e.mo2570B5(zVar2, nVar2).onCreateMMMenu(e0Var);
            if (!Util.isNullOrNil((List) e0Var.f224704d)) {
                view2.performHapticFeedback(0, 2);
                nVar2.mo107573q();
            }
        }
    }

    /* renamed from: Z */
    public void mo2289Z(C60905o oVar, BaseFinderFeed baseFinderFeed, boolean z, long j, C65426w0 w0Var, int i, int i2, boolean z2, long j2, int i3, int i4) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0797z) baseFinderFeed, "item");
    }

    /* renamed from: Z0 */
    public final void mo2399Z0(FinderItem finderItem, int i, Context context) {
        C48978cb0 cb02 = new C48978cb0();
        cb02.f131607d = finderItem.getFeedObject().f164794id;
        cb02.f131608e = finderItem.getFeedObject().username;
        cb02.f131609f = finderItem.getFeedObject().sessionBuffer;
        cb02.f131612i = finderItem.getMediaType();
        Log.m105924i("Finder.FeedFullLiveConvert", "live expose adFlag : " + finderItem.getFeedObject().adFlag + " actionType: " + i);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedActionType", i);
        jSONObject.put("value", System.currentTimeMillis() / ((long) 1000));
        cb02.f131610g = jSONObject.toString();
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        t1Var.mo76900y(gr02 != null ? gr02.mo12861q3() : null, 18054, cb02);
    }

    /* renamed from: a1 */
    public final void mo2400a1(Window window) {
        if (this.f12785T && window != null) {
            window.clearFlags(8192);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unlock screen record:");
        sb.append(this.f12785T);
        sb.append(",window:");
        sb.append(window != null ? window.hashCode() : 0);
        sb.append('!');
        Log.m105924i("Finder.FeedFullLiveConvert", sb.toString());
        this.f12785T = false;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6250p;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        C4189u7 u7Var = C4189u7.VIDEO;
        C4190v vVar = new C4190v();
        vVar.f18453a = recyclerView;
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_)).mo4636b(u7Var, vVar);
        oVar.mo85817I(C0966R.C0970id.a2s, 8);
        oVar.mo85817I(C0966R.C0970id.bjq, 8);
        oVar.mo85817I(C0966R.C0970id.ji4, 8);
        oVar.mo85817I(C0966R.C0970id.k07, 8);
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.mo2296g(recyclerView);
        Log.m105924i("Finder.FeedFullLiveConvert", "onDetachedFromRecyclerView liveFeedStateChangeListener:" + this.f12784S);
        Context context = recyclerView.getContext();
        Boolean bool = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        mo2400a1(activity != null ? activity.getWindow() : null);
        this.f12784S.dead();
        this.f12783R.dead();
        C53973z1 z1Var = this.f12781P;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        String str = this.f12780N;
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromRecyclerView deleteJob: ");
        C53973z1 z1Var2 = this.f12781P;
        if (z1Var2 != null) {
            bool = Boolean.valueOf(((C53851a) z1Var2).mo74466a());
        }
        sb.append(bool);
        Log.m105924i(str, sb.toString());
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.mo735i(oVar);
        Log.m105924i("Finder.FeedFullLiveConvert", "onViewRecycled liveFeedStateChangeListener:" + this.f12784S);
        RecyclerView C = oVar.mo85811C();
        Window window = null;
        Context context = C != null ? C.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            window = activity.getWindow();
        }
        mo2400a1(window);
        this.f12784S.dead();
        this.f12783R.dead();
        ((FinderFeedLiveRecommendView) oVar.mo85812D(C0966R.C0970id.d9p)).mo4527d();
    }

    /* renamed from: k0 */
    public void mo2302k0(C60905o oVar, BaseFinderFeed baseFinderFeed, Boolean bool) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0797z) baseFinderFeed, "item");
        FinderFeedLiveNoticeView finderFeedLiveNoticeView = (FinderFeedLiveNoticeView) oVar.mo85812D(C0966R.C0970id.d9o);
        if (finderFeedLiveNoticeView != null) {
            finderFeedLiveNoticeView.setVisibility(8);
        }
    }

    /* renamed from: l0 */
    public void mo2304l0(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0797z) baseFinderFeed, "item");
    }

    /* renamed from: n */
    public void mo2307n(C60905o oVar, BaseFinderFeed baseFinderFeed, int i) {
        C0797z zVar = (C0797z) baseFinderFeed;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(zVar, "item");
        FinderVideoBanner finderVideoBanner = (FinderVideoBanner) oVar.mo85812D(C0966R.C0970id.ol9);
        if (finderVideoBanner != null) {
            Context context = finderVideoBanner.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            int i2 = ((Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels;
            int intValue = ((Number) ((C36570n) this.f12572p).getValue()).intValue();
            LinkedList<C64689rq2> mediaList = zVar.mo3513o().getMediaList();
            C64689rq2 first = mediaList.getFirst();
            for (C64689rq2 rq22 : mediaList) {
                C64689rq2 rq23 = first;
                if ((rq23.f185271i * 1.0f) / rq23.f185270h < (rq22.f185271i * 1.0f) / rq22.f185270h) {
                    first = rq22;
                }
                Log.m105924i("Finder.FeedFullLiveConvert", "calculateMediaLayoutParams res:[" + rq22.f185270h + " x " + rq22.f185271i);
            }
            ((FinderVideoLayout) finderVideoBanner.getMediaView()).getLayoutParams().width = i2;
            ((FinderVideoLayout) finderVideoBanner.getMediaView()).getLayoutParams().height = intValue;
            ViewGroup.LayoutParams layoutParams = finderVideoBanner.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.gravity = 17;
            finderVideoBanner.requestLayout();
        }
    }

    /* renamed from: w */
    public void mo2324w(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2) {
        C0797z zVar = (C0797z) baseFinderFeed;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(zVar, "item");
        View D = oVar.mo85812D(C0966R.C0970id.fv8);
        if (mo2396W0(zVar)) {
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (D != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = D;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C4100m mVar = new C4100m();
        mVar.f18245d = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        mVar.f18243b = true;
        mVar.f18246e = this.f12778L;
        mVar.f18244c = this.f12566g;
        mVar.f18248g = new C14476c2(D, oVar, zVar, this);
        C13598b0 b0Var = C13598b0.f38549a;
        ((FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_)).mo4635a(zVar, mVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedFullLiveConvert(FinderVideoCore finderVideoCore, C10008v1 v1Var, boolean z, int i, int i2) {
        super(v1Var, z, i, false);
        C87412m.m108594g(finderVideoCore, "videoCore");
        C87412m.m108594g(v1Var, "contract");
        this.f12778L = finderVideoCore;
        this.f12779M = i2;
        this.f12780N = "LiveFeedDelete_" + hashCode();
        this.f12783R = new FinderFeedFullLiveConvert$liveFeedExposeListener$1(this, v1Var, v1Var.getActivity());
        this.f12784S = new FinderFeedFullLiveConvert$liveFeedStateChangeListener$1(this, v1Var.getActivity());
    }
}

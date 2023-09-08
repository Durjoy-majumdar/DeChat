package ou2;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c14.C54624g;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.AdAlphaPlayerView;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import d14.C20380j;
import d14.C45252f;
import d14.C45253g;
import d14.C58017a1;
import d14.C58042h;
import d14.C58052j1;
import d14.C58054k;
import d14.C58056k1;
import d14.C58076p0;
import d14.C58078q;
import d14.C58085t0;
import d14.C58087u0;
import d14.C58100z0;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32230s;
import fy3.C32231t;
import gy3.C24565l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import jp2.C98963o;
import jq2.C60889i;
import jq2.C98985g;
import kotlin.ResultKt;
import nq2.C100151a;
import os2.C100397a;
import os2.C100413l;
import p329d3.C86165a;
import rx3.C13598b0;
import te3.C101804kv2;
import up2.C102064e;
import vr2.C102236a0;
import vr2.C102268v;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ou2.b */
public final class C100464b implements C100485g {

    /* renamed from: a */
    public final int f294311a;

    /* renamed from: b */
    public C100151a.C100155d f294312b;

    /* renamed from: c */
    public SnsInfo f294313c;

    /* renamed from: d */
    public Context f294314d;

    /* renamed from: e */
    public C98963o f294315e;

    /* renamed from: f */
    public final C58087u0<FrameLayout.LayoutParams> f294316f = C58056k1.m67214a(null);

    /* renamed from: g */
    public C32224a<? extends C102064e> f294317g;

    /* renamed from: h */
    public C32224a<Integer> f294318h;

    /* renamed from: i */
    public C32230s<? super Double, ? super Integer, ? super C100397a, ? super Integer, ? super Integer, ? extends FrameLayout.LayoutParams> f294319i;

    /* renamed from: j */
    public C0000n0 f294320j;

    /* renamed from: k */
    public final C58087u0<C100467c> f294321k = C58056k1.m67214a(C100467c.STOP);

    /* renamed from: l */
    public final C58085t0<Boolean> f294322l = C58017a1.m67172a(1, 0, C54624g.DROP_OLDEST);

    /* renamed from: m */
    public String f294323m = "";

    /* renamed from: n */
    public C100413l f294324n;

    /* renamed from: o */
    public C101804kv2 f294325o;

    /* renamed from: p */
    public C100462a f294326p;

    /* renamed from: q */
    public Object f294327q;

    /* renamed from: ou2.b$a */
    public enum C100465a {
        PLAY,
        PAUSE
    }

    /* renamed from: ou2.b$b */
    public static final class C100466b {

        /* renamed from: a */
        public final C100465a f294331a;

        /* renamed from: b */
        public final C98985g.C98988c f294332b;

        /* renamed from: c */
        public final C98985g.C98988c f294333c;

        /* renamed from: d */
        public final FrameLayout.LayoutParams f294334d;

        public C100466b(C100465a aVar, C98985g.C98988c cVar, C98985g.C98988c cVar2, FrameLayout.LayoutParams layoutParams) {
            C87412m.m108594g(aVar, "command");
            C87412m.m108594g(cVar, "sight");
            C87412m.m108594g(cVar2, "breakSight");
            this.f294331a = aVar;
            this.f294332b = cVar;
            this.f294333c = cVar2;
            this.f294334d = layoutParams;
        }

        /* renamed from: a */
        public final FrameLayout.LayoutParams mo139970a() {
            SnsMethodCalculate.markStartTimeMs("getBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
            FrameLayout.LayoutParams layoutParams = this.f294334d;
            SnsMethodCalculate.markEndTimeMs("getBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
            return layoutParams;
        }

        /* renamed from: b */
        public final C100465a mo139971b() {
            SnsMethodCalculate.markStartTimeMs("getCommand", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
            C100465a aVar = this.f294331a;
            SnsMethodCalculate.markEndTimeMs("getCommand", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo");
            return aVar;
        }
    }

    /* renamed from: ou2.b$c */
    public enum C100467c {
        CANPLAY,
        PAUSE,
        STOP
    }

    /* renamed from: ou2.b$d */
    public static final class C100468d {

        /* renamed from: a */
        public final C98985g.C98987b f294339a;

        /* renamed from: b */
        public final C98985g.C98988c f294340b;

        /* renamed from: c */
        public final C98985g.C98988c f294341c;

        /* renamed from: d */
        public final ViewGroup.LayoutParams f294342d;

        /* renamed from: e */
        public final C100467c f294343e;

        public C100468d(C98985g.C98987b bVar, C98985g.C98988c cVar, C98985g.C98988c cVar2, ViewGroup.LayoutParams layoutParams, C100467c cVar3) {
            C87412m.m108594g(bVar, "thumb");
            C87412m.m108594g(cVar, "sight");
            C87412m.m108594g(cVar2, "breakSight");
            C87412m.m108594g(cVar3, "playState");
            this.f294339a = bVar;
            this.f294340b = cVar;
            this.f294341c = cVar2;
            this.f294342d = layoutParams;
            this.f294343e = cVar3;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                return true;
            } else if (!(obj instanceof C100468d)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                return false;
            } else {
                C100468d dVar = (C100468d) obj;
                if (!C87412m.m108589b(this.f294339a, dVar.f294339a)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                    return false;
                } else if (!C87412m.m108589b(this.f294340b, dVar.f294340b)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                    return false;
                } else if (!C87412m.m108589b(this.f294341c, dVar.f294341c)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                    return false;
                } else if (!C87412m.m108589b(this.f294342d, dVar.f294342d)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                    return false;
                } else {
                    C100467c cVar = this.f294343e;
                    C100467c cVar2 = dVar.f294343e;
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
                    return cVar == cVar2;
                }
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            int hashCode = ((((this.f294339a.hashCode() * 31) + this.f294340b.hashCode()) * 31) + this.f294341c.hashCode()) * 31;
            ViewGroup.LayoutParams layoutParams = this.f294342d;
            int hashCode2 = ((hashCode + (layoutParams == null ? 0 : layoutParams.hashCode())) * 31) + this.f294343e.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return hashCode2;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            String str = "UIModel(thumb=" + this.f294339a + ", sight=" + this.f294340b + ", breakSight=" + this.f294341c + ", uiLayoutParams=" + this.f294342d + ", playState=" + this.f294343e + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return str;
        }
    }

    /* renamed from: ou2.b$e */
    public static final class C100469e<T> implements C86165a {

        /* renamed from: a */
        public final /* synthetic */ C100464b f294344a;

        public C100469e(C100464b bVar) {
            this.f294344a = bVar;
        }

        public void accept(Object obj) {
            SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$1");
            Boolean bool = (Boolean) obj;
            SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$1");
            C100464b bVar = this.f294344a;
            SnsMethodCalculate.markStartTimeMs("access$getRestartPlayFlow$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            C58085t0<Boolean> t0Var = bVar.f294322l;
            SnsMethodCalculate.markEndTimeMs("access$getRestartPlayFlow$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            ((C58100z0) t0Var).mo82832d(Boolean.TRUE);
            SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$1");
            SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$1");
        }
    }

    /* renamed from: ou2.b$f */
    public /* synthetic */ class C100470f extends C24565l implements C32228q<C100397a, AdClickActionInfo, SnsInfo, C13598b0> {
        public C100470f(Object obj) {
            super(3, obj, C100464b.class, "setClickArea", "setClickArea(Lcom/tencent/mm/plugin/sns/storage/AdBreakFrameClickInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$2");
            C100464b.m131497f((C100464b) this.receiver, (C100397a) obj, (AdClickActionInfo) obj2, (SnsInfo) obj3);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$2");
            return b0Var;
        }
    }

    /* renamed from: ou2.b$g */
    public /* synthetic */ class C100471g extends C24565l implements C32228q<C100397a, AdClickActionInfo, SnsInfo, C13598b0> {
        public C100471g(Object obj) {
            super(3, obj, C100464b.class, "setClickArea", "setClickArea(Lcom/tencent/mm/plugin/sns/storage/AdBreakFrameClickInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3");
            C100464b.m131497f((C100464b) this.receiver, (C100397a) obj, (AdClickActionInfo) obj2, (SnsInfo) obj3);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1", mo125469f = "BaseBreakFrameCardAdController.kt", mo125470l = {249}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.b$h */
    public static final class C100472h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294345d;

        /* renamed from: e */
        public final /* synthetic */ C94901o f294346e;

        /* renamed from: f */
        public final /* synthetic */ C101804kv2 f294347f;

        /* renamed from: g */
        public final /* synthetic */ C96983o3 f294348g;

        /* renamed from: h */
        public final /* synthetic */ SnsInfo f294349h;

        /* renamed from: i */
        public final /* synthetic */ C101804kv2 f294350i;

        /* renamed from: j */
        public final /* synthetic */ C100464b f294351j;

        /* renamed from: n */
        public final /* synthetic */ C58085t0<C100466b> f294352n;

        /* renamed from: o */
        public final /* synthetic */ ImageView f294353o;

        /* renamed from: p */
        public final /* synthetic */ MMPinProgressBtn f294354p;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1", mo125469f = "BaseBreakFrameCardAdController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: ou2.b$h$a */
        public static final class C100473a extends C91594j implements C32231t<C98985g.C98987b, C98985g.C98988c, C98985g.C98988c, FrameLayout.LayoutParams, C100467c, C15601d<? super C100468d>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f294355d;

            /* renamed from: e */
            public /* synthetic */ Object f294356e;

            /* renamed from: f */
            public /* synthetic */ Object f294357f;

            /* renamed from: g */
            public /* synthetic */ Object f294358g;

            /* renamed from: h */
            public /* synthetic */ Object f294359h;

            public C100473a(C15601d<? super C100473a> dVar) {
                super(6, dVar);
            }

            /* renamed from: L */
            public Object mo14122L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
                C100473a aVar = new C100473a((C15601d) obj6);
                aVar.f294355d = (C98985g.C98987b) obj;
                aVar.f294356e = (C98985g.C98988c) obj2;
                aVar.f294357f = (C98985g.C98988c) obj3;
                aVar.f294358g = (FrameLayout.LayoutParams) obj4;
                aVar.f294359h = (C100467c) obj5;
                Object invokeSuspend = aVar.invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
                ResultKt.throwOnFailure(obj);
                C100468d dVar = new C100468d((C98985g.C98987b) this.f294355d, (C98985g.C98988c) this.f294356e, (C98985g.C98988c) this.f294357f, (FrameLayout.LayoutParams) this.f294358g, (C100467c) this.f294359h);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$1");
                return dVar;
            }
        }

        /* renamed from: ou2.b$h$b */
        public static final class C100474b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100464b f294360d;

            /* renamed from: e */
            public final /* synthetic */ C58085t0<C100466b> f294361e;

            /* renamed from: f */
            public final /* synthetic */ ImageView f294362f;

            /* renamed from: g */
            public final /* synthetic */ MMPinProgressBtn f294363g;

            /* renamed from: h */
            public final /* synthetic */ C94901o f294364h;

            /* renamed from: i */
            public final /* synthetic */ C101804kv2 f294365i;

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2", mo125469f = "BaseBreakFrameCardAdController.kt", mo125470l = {275, 281}, mo125471m = "emit")
            /* renamed from: ou2.b$h$b$a */
            public static final class C100475a extends C66704d {

                /* renamed from: d */
                public Object f294366d;

                /* renamed from: e */
                public /* synthetic */ Object f294367e;

                /* renamed from: f */
                public final /* synthetic */ C100474b<T> f294368f;

                /* renamed from: g */
                public int f294369g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100475a(C100474b<? super T> bVar, C15601d<? super C100475a> dVar) {
                    super(dVar);
                    this.f294368f = bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2$emit$1");
                    this.f294367e = obj;
                    this.f294369g |= Integer.MIN_VALUE;
                    Object a = this.f294368f.mo139975a((C100468d) null, this);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2$emit$1");
                    return a;
                }
            }

            public C100474b(C100464b bVar, C58085t0<C100466b> t0Var, ImageView imageView, MMPinProgressBtn mMPinProgressBtn, C94901o oVar, C101804kv2 kv22) {
                this.f294360d = bVar;
                this.f294361e = t0Var;
                this.f294362f = imageView;
                this.f294363g = mMPinProgressBtn;
                this.f294364h = oVar;
                this.f294365i = kv22;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:126:0x0250, code lost:
                r2 = r2.get();
             */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0144  */
            /* JADX WARNING: Removed duplicated region for block: B:67:0x0174  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x018d  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x0197  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo139975a(ou2.C100464b.C100468d r18, wx3.C15601d<? super rx3.C13598b0> r19) {
                /*
                    r17 = this;
                    r0 = r17
                    r1 = r18
                    r2 = r19
                    java.lang.String r3 = "emit"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r5 = r2 instanceof ou2.C100464b.C100472h.C100474b.C100475a
                    if (r5 == 0) goto L_0x0020
                    r5 = r2
                    ou2.b$h$b$a r5 = (ou2.C100464b.C100472h.C100474b.C100475a) r5
                    int r6 = r5.f294369g
                    r7 = -2147483648(0xffffffff80000000, float:-0.0)
                    r8 = r6 & r7
                    if (r8 == 0) goto L_0x0020
                    int r6 = r6 - r7
                    r5.f294369g = r6
                    goto L_0x0025
                L_0x0020:
                    ou2.b$h$b$a r5 = new ou2.b$h$b$a
                    r5.<init>(r0, r2)
                L_0x0025:
                    java.lang.Object r2 = r5.f294367e
                    xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r7 = r5.f294369g
                    java.lang.String r8 = "BreakFrameCardAdController"
                    r9 = 2
                    r10 = 1
                    r11 = 8
                    java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
                    java.lang.String r13 = "access$getMContext$p"
                    if (r7 == 0) goto L_0x0058
                    if (r7 == r10) goto L_0x004f
                    if (r7 != r9) goto L_0x0044
                    java.lang.Object r1 = r5.f294366d
                    ou2.b$h$b r1 = (ou2.C100464b.C100472h.C100474b) r1
                    kotlin.ResultKt.throwOnFailure(r2)
                    goto L_0x0170
                L_0x0044:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    throw r1
                L_0x004f:
                    java.lang.Object r1 = r5.f294366d
                    ou2.b$h$b r1 = (ou2.C100464b.C100472h.C100474b) r1
                    kotlin.ResultKt.throwOnFailure(r2)
                    goto L_0x0136
                L_0x0058:
                    kotlin.ResultKt.throwOnFailure(r2)
                    r18.getClass()
                    java.lang.String r2 = "component1"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                    jq2.g$b r15 = r1.f294339a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                    java.lang.String r2 = "component2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                    jq2.g$c r14 = r1.f294340b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                    java.lang.String r2 = "component3"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                    jq2.g$c r9 = r1.f294341c
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                    java.lang.String r2 = "component4"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                    android.view.ViewGroup$LayoutParams r10 = r1.f294342d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                    java.lang.String r2 = "component5"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
                    ou2.b$c r1 = r1.f294343e
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r7 = "readySnsSightOffline.combine  thumb = "
                    r2.append(r7)
                    r2.append(r15)
                    java.lang.String r7 = ", sight = "
                    r2.append(r7)
                    r2.append(r14)
                    java.lang.String r7 = ", breakSight = "
                    r2.append(r7)
                    r2.append(r9)
                    java.lang.String r7 = ", uiLayoutParams = "
                    r2.append(r7)
                    r2.append(r10)
                    java.lang.String r7 = " , playState="
                    r2.append(r7)
                    r2.append(r1)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
                    ou2.b r2 = r0.f294360d
                    nq2.a$d r2 = ou2.C100464b.m131496e(r2)
                    if (r2 == 0) goto L_0x00da
                    com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
                    if (r2 == 0) goto L_0x00da
                    com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r2.f280507j
                    if (r2 == 0) goto L_0x00da
                    r2.setVisibility(r11)
                L_0x00da:
                    ou2.b r2 = r0.f294360d
                    nq2.a$d r2 = ou2.C100464b.m131496e(r2)
                    if (r2 == 0) goto L_0x00ed
                    com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
                    if (r2 == 0) goto L_0x00ed
                    android.widget.ImageView r2 = r2.f280506i
                    if (r2 == 0) goto L_0x00ed
                    r2.setVisibility(r11)
                L_0x00ed:
                    if (r10 != 0) goto L_0x00f5
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                L_0x00f5:
                    ou2.b$c r2 = ou2.C100464b.C100467c.STOP
                    if (r1 != r2) goto L_0x00ff
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                L_0x00ff:
                    jq2.g$a r2 = r14.mo138348b()
                    jq2.g$a r7 = jq2.C98985g.C98986a.RESULT_STATE_COMPLETE
                    r16 = 0
                    if (r2 != r7) goto L_0x019c
                    jq2.g$a r2 = r9.mo138348b()
                    if (r2 != r7) goto L_0x019c
                    ou2.b$c r2 = ou2.C100464b.C100467c.CANPLAY
                    if (r1 != r2) goto L_0x0149
                    d14.t0<ou2.b$b> r1 = r0.f294361e
                    ou2.b$b r2 = new ou2.b$b
                    ou2.b$a r7 = ou2.C100464b.C100465a.PLAY
                    boolean r12 = r10 instanceof android.widget.FrameLayout.LayoutParams
                    if (r12 == 0) goto L_0x0121
                    r16 = r10
                    android.widget.FrameLayout$LayoutParams r16 = (android.widget.FrameLayout.LayoutParams) r16
                L_0x0121:
                    r10 = r16
                    r2.<init>(r7, r14, r9, r10)
                    r5.f294366d = r0
                    r7 = 1
                    r5.f294369g = r7
                    java.lang.Object r1 = r1.emit(r2, r5)
                    if (r1 != r6) goto L_0x0135
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r6
                L_0x0135:
                    r1 = r0
                L_0x0136:
                    android.widget.ImageView r2 = r1.f294362f
                    if (r2 != 0) goto L_0x013b
                    goto L_0x013e
                L_0x013b:
                    r2.setVisibility(r11)
                L_0x013e:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.f294363g
                    if (r1 != 0) goto L_0x0144
                    goto L_0x02a8
                L_0x0144:
                    r1.setVisibility(r11)
                    goto L_0x02a8
                L_0x0149:
                    ou2.b$c r2 = ou2.C100464b.C100467c.PAUSE
                    if (r1 != r2) goto L_0x02a8
                    d14.t0<ou2.b$b> r1 = r0.f294361e
                    ou2.b$b r2 = new ou2.b$b
                    ou2.b$a r7 = ou2.C100464b.C100465a.PAUSE
                    boolean r15 = r10 instanceof android.widget.FrameLayout.LayoutParams
                    if (r15 == 0) goto L_0x015b
                    r16 = r10
                    android.widget.FrameLayout$LayoutParams r16 = (android.widget.FrameLayout.LayoutParams) r16
                L_0x015b:
                    r10 = r16
                    r2.<init>(r7, r14, r9, r10)
                    r5.f294366d = r0
                    r7 = 2
                    r5.f294369g = r7
                    java.lang.Object r1 = r1.emit(r2, r5)
                    if (r1 != r6) goto L_0x016f
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r6
                L_0x016f:
                    r1 = r0
                L_0x0170:
                    android.widget.ImageView r2 = r1.f294362f
                    if (r2 == 0) goto L_0x0188
                    ou2.b r5 = r1.f294360d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
                    android.content.Context r5 = r5.f294314d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
                    r6 = 2131756957(0x7f10079d, float:1.9144836E38)
                    android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
                    r2.setImageDrawable(r5)
                L_0x0188:
                    android.widget.ImageView r2 = r1.f294362f
                    if (r2 != 0) goto L_0x018d
                    goto L_0x0191
                L_0x018d:
                    r5 = 0
                    r2.setVisibility(r5)
                L_0x0191:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.f294363g
                    if (r1 != 0) goto L_0x0197
                    goto L_0x02a8
                L_0x0197:
                    r1.setVisibility(r11)
                    goto L_0x02a8
                L_0x019c:
                    jq2.g$a r1 = r14.mo138348b()
                    jq2.g$a r2 = jq2.C98985g.C98986a.RESULT_STATE_ERROR
                    java.lang.String r5 = "getBitmap"
                    java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult"
                    if (r1 == r2) goto L_0x0233
                    jq2.g$a r1 = r9.mo138348b()
                    if (r1 != r2) goto L_0x01b0
                    goto L_0x0233
                L_0x01b0:
                    r15.getClass()
                    java.lang.String r1 = "getState"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
                    jq2.g$a r2 = r15.f290241c
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
                    if (r2 != r7) goto L_0x0218
                    ou2.b r1 = r0.f294360d
                    nq2.a$d r1 = ou2.C100464b.m131496e(r1)
                    if (r1 == 0) goto L_0x01e9
                    com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
                    if (r1 == 0) goto L_0x01e9
                    com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r1 = r1.f280504g
                    if (r1 == 0) goto L_0x01e9
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                    java.lang.ref.WeakReference<com.tencent.mm.memory.n> r2 = r15.f290240b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                    if (r2 == 0) goto L_0x01e4
                    java.lang.Object r2 = r2.get()
                    com.tencent.mm.memory.n r2 = (com.tencent.p014mm.memory.C92714n) r2
                    if (r2 == 0) goto L_0x01e4
                    android.graphics.Bitmap r2 = r2.f266818d
                    goto L_0x01e6
                L_0x01e4:
                    r2 = r16
                L_0x01e6:
                    r1.setThumbBmp(r2)
                L_0x01e9:
                    ou2.b r1 = r0.f294360d
                    nq2.a$d r1 = ou2.C100464b.m131496e(r1)
                    if (r1 == 0) goto L_0x01fd
                    com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
                    if (r1 == 0) goto L_0x01fd
                    com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r1 = r1.f280504g
                    if (r1 == 0) goto L_0x01fd
                    r2 = 1
                    r1.mo134053x(r2)
                L_0x01fd:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r0.f294363g
                    if (r1 != 0) goto L_0x0202
                    goto L_0x0206
                L_0x0202:
                    r2 = 0
                    r1.setVisibility(r2)
                L_0x0206:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r0.f294363g
                    if (r1 == 0) goto L_0x020d
                    r1.mo153891a()
                L_0x020d:
                    android.widget.ImageView r1 = r0.f294362f
                    if (r1 != 0) goto L_0x0213
                    goto L_0x02a8
                L_0x0213:
                    r1.setVisibility(r11)
                    goto L_0x02a8
                L_0x0218:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r0.f294363g
                    if (r1 != 0) goto L_0x021d
                    goto L_0x0221
                L_0x021d:
                    r2 = 0
                    r1.setVisibility(r2)
                L_0x0221:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r0.f294363g
                    if (r1 == 0) goto L_0x0228
                    r1.mo153891a()
                L_0x0228:
                    android.widget.ImageView r1 = r0.f294362f
                    if (r1 != 0) goto L_0x022e
                    goto L_0x02a8
                L_0x022e:
                    r1.setVisibility(r11)
                    goto L_0x02a8
                L_0x0233:
                    ou2.b r1 = r0.f294360d
                    nq2.a$d r1 = ou2.C100464b.m131496e(r1)
                    if (r1 == 0) goto L_0x0260
                    com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
                    if (r1 == 0) goto L_0x0260
                    com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r1 = r1.f280504g
                    if (r1 == 0) goto L_0x0260
                    r15.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                    java.lang.ref.WeakReference<com.tencent.mm.memory.n> r2 = r15.f290240b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                    if (r2 == 0) goto L_0x025b
                    java.lang.Object r2 = r2.get()
                    com.tencent.mm.memory.n r2 = (com.tencent.p014mm.memory.C92714n) r2
                    if (r2 == 0) goto L_0x025b
                    android.graphics.Bitmap r2 = r2.f266818d
                    goto L_0x025d
                L_0x025b:
                    r2 = r16
                L_0x025d:
                    r1.setThumbBmp(r2)
                L_0x0260:
                    ou2.b r1 = r0.f294360d
                    nq2.a$d r1 = ou2.C100464b.m131496e(r1)
                    if (r1 == 0) goto L_0x0274
                    com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
                    if (r1 == 0) goto L_0x0274
                    com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r1 = r1.f280504g
                    if (r1 == 0) goto L_0x0274
                    r2 = 1
                    r1.mo134053x(r2)
                L_0x0274:
                    com.tencent.mm.plugin.sns.model.o r1 = r0.f294364h
                    if (r1 == 0) goto L_0x027f
                    te3.kv2 r2 = r0.f294365i
                    java.lang.String r2 = r2.f298689d
                    r1.mo131093M(r2)
                L_0x027f:
                    android.widget.ImageView r1 = r0.f294362f
                    if (r1 == 0) goto L_0x0297
                    ou2.b r2 = r0.f294360d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
                    android.content.Context r2 = r2.f294314d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
                    r5 = 2131234866(0x7f081032, float:1.808591E38)
                    android.graphics.drawable.Drawable r2 = kg3.C76577a.m92158i(r2, r5)
                    r1.setImageDrawable(r2)
                L_0x0297:
                    com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r0.f294363g
                    if (r1 != 0) goto L_0x029c
                    goto L_0x029f
                L_0x029c:
                    r1.setVisibility(r11)
                L_0x029f:
                    android.widget.ImageView r1 = r0.f294362f
                    if (r1 != 0) goto L_0x02a4
                    goto L_0x02a8
                L_0x02a4:
                    r2 = 0
                    r1.setVisibility(r2)
                L_0x02a8:
                    java.lang.String r1 = "readySnsSightOffline.combine  end！"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ou2.C100464b.C100472h.C100474b.mo139975a(ou2.b$d, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2");
                Object a = mo139975a((C100468d) obj, dVar);
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1$2");
                return a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100472h(C94901o oVar, C101804kv2 kv22, C96983o3 o3Var, SnsInfo snsInfo, C101804kv2 kv23, C100464b bVar, C58085t0<C100466b> t0Var, ImageView imageView, MMPinProgressBtn mMPinProgressBtn, C15601d<? super C100472h> dVar) {
            super(2, dVar);
            this.f294346e = oVar;
            this.f294347f = kv22;
            this.f294348g = o3Var;
            this.f294349h = snsInfo;
            this.f294350i = kv23;
            this.f294351j = bVar;
            this.f294352n = t0Var;
            this.f294353o = imageView;
            this.f294354p = mMPinProgressBtn;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            C100472h hVar = new C100472h(this.f294346e, this.f294347f, this.f294348g, this.f294349h, this.f294350i, this.f294351j, this.f294352n, this.f294353o, this.f294354p, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            Object invokeSuspend = ((C100472h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C45252f fVar;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294345d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C98985g gVar = C98985g.f290230a;
                C94901o oVar = this.f294346e;
                C101804kv2 kv22 = this.f294347f;
                C96983o3 o3Var = this.f294348g;
                SnsMethodCalculate.markStartTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                if (kv22 == null) {
                    fVar = new C20380j(new C98985g.C98987b[0]);
                    SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                } else if (oVar == null) {
                    fVar = new C20380j(new C98985g.C98987b[0]);
                    SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                } else {
                    String y = C102236a0.m134780y(1, kv22.f298689d);
                    Set<String> set = C98985g.f290233d;
                    synchronized (set) {
                        try {
                            set.add(y == null ? "" : y);
                        } catch (Throwable th) {
                            SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                            throw th;
                        }
                    }
                    String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                    C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
                    String X = C102236a0.m134729X(kv22);
                    if (!C86013q1.m106450k(e + X)) {
                        C87412m.m108593f(y, "cacheName");
                        C98985g.m128891b(y).setValue(null);
                        C102268v vVar = new C102268v(kv22);
                        vVar.mo141832d(1);
                        vVar.mo141833e(kv22.f298689d);
                        C94866e1.Vx0().mo130979d(kv22, kv22.f298690e == 6 ? 5 : 1, vVar, o3Var);
                    }
                    C92714n i2 = oVar.mo131121i(y, kv22.f298689d);
                    if (!C102236a0.m134742f(i2)) {
                        SnsMethodCalculate.markStartTimeMs("isHashSetContainsKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        boolean contains = ((HashSet) oVar.f275018x).contains(y);
                        SnsMethodCalculate.markEndTimeMs("isHashSetContainsKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        if (!contains) {
                            oVar.mo131084D(1, kv22, o3Var);
                        }
                        String str = kv22.f298689d;
                        C87412m.m108593f(str, "media.Id");
                        C58078q qVar = new C58078q(new C58054k(new C98985g.C98987b(str, (WeakReference<C92714n>) null, C98985g.C98986a.RESULT_STATE_DOWNLOADING)), new C60889i(y, (C15601d<? super C60889i>) null));
                        SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                        fVar = qVar;
                    } else {
                        String str2 = kv22.f298689d;
                        C87412m.m108593f(str2, "media.Id");
                        fVar = new C58054k(new C98985g.C98987b(str2, new WeakReference(i2), C98985g.C98986a.RESULT_STATE_COMPLETE));
                        SnsMethodCalculate.markEndTimeMs("getThumbDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                    }
                }
                C45252f<C98985g.C98988c> a = gVar.mo138342a(this.f294349h, this.f294346e, this.f294347f, this.f294348g);
                C45252f<C98985g.C98988c> a2 = gVar.mo138342a(this.f294349h, this.f294346e, this.f294350i, this.f294348g);
                C58087u0<FrameLayout.LayoutParams> h = this.f294351j.mo139967h();
                C100464b bVar = this.f294351j;
                SnsMethodCalculate.markStartTimeMs("access$getPlayStateFlow$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                C58087u0<C100467c> u0Var = bVar.f294321k;
                SnsMethodCalculate.markEndTimeMs("access$getPlayStateFlow$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                C45252f e2 = C58042h.m67196e(new C58076p0(new C45252f[]{fVar, a, a2, h, u0Var}, new C100473a((C15601d<? super C100473a>) null)));
                C100474b bVar2 = new C100474b(this.f294351j, this.f294352n, this.f294353o, this.f294354p, this.f294346e, this.f294347f);
                this.f294345d = 1;
                if (e2.mo31880a(bVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$uiModelJob$1");
            return b0Var;
        }
    }

    public C100464b(int i) {
        this.f294311a = i;
    }

    /* renamed from: e */
    public static final /* synthetic */ C100151a.C100155d m131496e(C100464b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C100151a.C100155d i = bVar.mo139968i();
        SnsMethodCalculate.markEndTimeMs("access$getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return i;
    }

    /* renamed from: f */
    public static final void m131497f(C100464b bVar, C100397a aVar, AdClickActionInfo adClickActionInfo, SnsInfo snsInfo) {
        ViewGroup.LayoutParams layoutParams;
        AdAlphaPlayerView mPlayerView;
        C100464b bVar2 = bVar;
        SnsMethodCalculate.markStartTimeMs("access$setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C100509l g = bVar.mo139966g();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = g instanceof SnsAdBreakFrameVideoView ? (SnsAdBreakFrameVideoView) g : null;
        ViewGroup.LayoutParams layoutParams2 = (snsAdBreakFrameVideoView == null || (mPlayerView = snsAdBreakFrameVideoView.getMPlayerView()) == null) ? null : mPlayerView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        int i = 0;
        double d = ((double) (marginLayoutParams != null ? marginLayoutParams.width : 0)) / 1440.0d;
        C32230s<? super Double, ? super Integer, ? super C100397a, ? super Integer, ? super Integer, ? extends FrameLayout.LayoutParams> sVar = bVar2.f294319i;
        if (sVar != null) {
            Double valueOf = Double.valueOf(d);
            Integer valueOf2 = Integer.valueOf((snsAdBreakFrameVideoView == null || (layoutParams = snsAdBreakFrameVideoView.getLayoutParams()) == null) ? 0 : layoutParams.height);
            C32224a<Integer> aVar2 = bVar2.f294318h;
            Integer valueOf3 = Integer.valueOf(aVar2 != null ? aVar2.invoke().intValue() : 0);
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) sVar.mo237D(valueOf, valueOf2, aVar, valueOf3, Integer.valueOf(i));
            if (layoutParams3 != null) {
                View view = new View(bVar2.f294314d);
                if (snsAdBreakFrameVideoView != null) {
                    SnsMethodCalculate.markStartTimeMs("addViewRemovedOnStop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                    snsAdBreakFrameVideoView.f281424g.add(view);
                    SnsMethodCalculate.markEndTimeMs("addViewRemovedOnStop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                }
                if (snsAdBreakFrameVideoView != null) {
                    snsAdBreakFrameVideoView.addView(view, layoutParams3);
                }
                int i2 = layoutParams3.leftMargin;
                int i3 = layoutParams3.topMargin;
                Rect rect = new Rect(i2, i3, layoutParams3.width + i2, layoutParams3.height + i3);
                if (snsAdBreakFrameVideoView != null) {
                    C100476c cVar = new C100476c(bVar, aVar);
                    SnsMethodCalculate.markStartTimeMs("setCanClickRect", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                    snsAdBreakFrameVideoView.f281425h = cVar;
                    snsAdBreakFrameVideoView.f281426i = rect;
                    SnsMethodCalculate.markEndTimeMs("setCanClickRect", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                }
                view.setOnClickListener(new C100477d(bVar, adClickActionInfo, snsInfo));
                SnsMethodCalculate.markEndTimeMs("setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                SnsMethodCalculate.markEndTimeMs("access$setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            }
        }
        SnsMethodCalculate.markEndTimeMs("setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        SnsMethodCalculate.markEndTimeMs("access$setClickArea", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
    }

    /* renamed from: a */
    public void mo139962a(boolean z) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        Log.m105918d("BreakFrameCardAdController", "startPlay() called with: useOnlineVideo = " + z);
        ((C58052j1) this.f294321k).setValue(C100467c.CANPLAY);
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
    }

    /* renamed from: b */
    public void mo139963b(boolean z) {
        C96066m2 m2Var;
        SnsAdTimelineVideoView snsAdTimelineVideoView;
        SnsMethodCalculate.markStartTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        Log.m105918d("BreakFrameCardAdController", "restartPlay() called with: useOnlineVideo = " + z);
        C100151a.C100155d i = mo139968i();
        if (!(i == null || (m2Var = i.f293368m) == null || (snsAdTimelineVideoView = m2Var.f280504g) == null)) {
            snsAdTimelineVideoView.mo134052w();
        }
        SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        r1 = (r1 = r28.getAdXml()).adBreakFrameInfo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139964c(com.tencent.p014mm.plugin.sns.storage.SnsInfo r28, com.tencent.p014mm.plugin.sns.model.C94901o r29, te3.C101804kv2 r30, com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdTimelineVideoView r31, com.tencent.p014mm.storage.C96983o3 r32) {
        /*
            r27 = this;
            r12 = r27
            r0 = r28
            r2 = r29
            r3 = r30
            r4 = r32
            java.lang.String r1 = "readySnsSightOffline"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            java.lang.String r1 = "BreakFrameCardAdController"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "readySnsSightOffline() called with: snsInfo = "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", imageLoader2 = "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", media = "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", newVideoView = "
            r5.append(r6)
            r6 = r31
            r5.append(r6)
            java.lang.String r6 = ", fromscene = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
            nq2.a$d r1 = r27.mo139968i()
            r13 = 8
            if (r1 == 0) goto L_0x005e
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
            if (r1 == 0) goto L_0x005e
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.f280507j
            if (r1 == 0) goto L_0x005e
            r1.setVisibility(r13)
        L_0x005e:
            nq2.a$d r1 = r27.mo139968i()
            if (r1 == 0) goto L_0x006f
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
            if (r1 == 0) goto L_0x006f
            android.widget.ImageView r1 = r1.f280506i
            if (r1 == 0) goto L_0x006f
            r1.setVisibility(r13)
        L_0x006f:
            r14 = 0
            if (r0 == 0) goto L_0x0081
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r28.getAdXml()
            if (r1 == 0) goto L_0x0081
            com.tencent.mm.plugin.sns.storage.a r1 = r1.adBreakFrameInfo
            if (r1 == 0) goto L_0x0081
            os2.l r1 = r1.mo132012a()
            goto L_0x0082
        L_0x0081:
            r1 = r14
        L_0x0082:
            r12.f294324n = r1
            java.lang.String r1 = "initCurrentBreakVideoMedia"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            os2.l r6 = r12.f294324n
            r15 = 1
            if (r6 == 0) goto L_0x0098
            int r6 = r6.mo139878c()
            if (r6 != r15) goto L_0x0098
            r6 = 1
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            java.lang.String r7 = "BreakFrameCardAdController"
            r8 = 6
            r10 = 1913(0x779, float:2.68E-42)
            r9 = 5
            if (r6 == 0) goto L_0x00e8
            wo2.l r6 = wo2.C102477l.f301757a
            r11 = 2880(0xb40, float:4.036E-42)
            r13 = 1080(0x438, float:1.513E-42)
            boolean r6 = r6.mo142086c(r11, r13)
            if (r6 == 0) goto L_0x00cd
            os2.l r6 = r12.f294324n
            if (r6 == 0) goto L_0x00b6
            te3.kv2 r6 = r6.mo139876a()
            goto L_0x00b7
        L_0x00b6:
            r6 = r14
        L_0x00b7:
            if (r6 == 0) goto L_0x00cd
            java.lang.String r6 = "currentMedia : use high level"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 4
            r6.mo175911u(r10, r11)
            os2.l r6 = r12.f294324n
            if (r6 == 0) goto L_0x0103
            te3.kv2 r6 = r6.mo139876a()
            goto L_0x0104
        L_0x00cd:
            java.lang.String r6 = "currentMedia : use low level"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6.mo175911u(r10, r9)
            os2.l r6 = r12.f294324n
            if (r6 == 0) goto L_0x0103
            java.lang.String r11 = "getOneToOneLowMedia"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            te3.kv2 r6 = r6.f294171c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            goto L_0x0104
        L_0x00e8:
            java.lang.String r6 = "currentMedia : use 3 to 1 level"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6.mo175911u(r10, r8)
            os2.l r6 = r12.f294324n
            if (r6 == 0) goto L_0x0103
            java.lang.String r11 = "getMedia"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            te3.kv2 r6 = r6.f294169a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            goto L_0x0104
        L_0x0103:
            r6 = r14
        L_0x0104:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "currentMedia : type = "
            r11.append(r13)
            os2.l r13 = r12.f294324n
            if (r13 == 0) goto L_0x011b
            int r13 = r13.mo139878c()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x011c
        L_0x011b:
            r13 = r14
        L_0x011c:
            r11.append(r13)
            java.lang.String r13 = "  mediaId = "
            r11.append(r13)
            if (r6 == 0) goto L_0x0129
            java.lang.String r13 = r6.f298689d
            goto L_0x012a
        L_0x0129:
            r13 = r14
        L_0x012a:
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            r12.f294325o = r6
            java.lang.String r1 = "shouldClearSns"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            java.lang.String r7 = r12.f294323m
            java.lang.String r11 = ""
            boolean r11 = gy3.C87412m.m108589b(r7, r11)
            if (r11 == 0) goto L_0x014c
            goto L_0x015a
        L_0x014c:
            if (r0 == 0) goto L_0x0153
            java.lang.String r11 = r28.getSnsId()
            goto L_0x0154
        L_0x0153:
            r11 = r14
        L_0x0154:
            boolean r7 = gy3.C87412m.m108589b(r7, r11)
            if (r7 == 0) goto L_0x015c
        L_0x015a:
            r7 = 0
            goto L_0x015d
        L_0x015c:
            r7 = 1
        L_0x015d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            if (r7 == 0) goto L_0x0189
            java.lang.String r1 = "BreakFrameCardAdController"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "shouldClearSns called with: snsInfo = "
            r5.append(r7)
            if (r0 == 0) goto L_0x0176
            java.lang.String r7 = r28.getSnsId()
            goto L_0x0177
        L_0x0176:
            r7 = r14
        L_0x0177:
            if (r7 != 0) goto L_0x017c
            java.lang.String r7 = "null"
        L_0x017c:
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
            r27.mo139969j()
        L_0x0189:
            a14.n0 r1 = r12.f294320j
            if (r1 != 0) goto L_0x03ea
            a14.n0 r1 = a14.C53930o0.m60555b()
            a14.w r5 = a14.C53959v2.m60598a(r14, r15, r14)
            a14.n0 r1 = a14.C53930o0.m60561h(r1, r5)
            r12.f294320j = r1
            java.lang.String r1 = "trySetThumb"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            if (r3 == 0) goto L_0x01a8
            java.lang.String r7 = r3.f298689d
            goto L_0x01a9
        L_0x01a8:
            r7 = r14
        L_0x01a9:
            java.lang.String r7 = vr2.C102236a0.m134780y(r15, r7)
            if (r2 == 0) goto L_0x01ba
            if (r3 == 0) goto L_0x01b4
            java.lang.String r8 = r3.f298689d
            goto L_0x01b5
        L_0x01b4:
            r8 = r14
        L_0x01b5:
            com.tencent.mm.memory.n r7 = r2.mo131121i(r7, r8)
            goto L_0x01bb
        L_0x01ba:
            r7 = r14
        L_0x01bb:
            boolean r8 = vr2.C102236a0.m134742f(r7)
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            if (r3 == 0) goto L_0x01c8
            java.lang.String r11 = r3.f298689d
            goto L_0x01c9
        L_0x01c8:
            r11 = r14
        L_0x01c9:
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r9, r11)
            java.lang.String r11 = "getMediaFilePath(SnsCore…tAccSnsPath(), media?.Id)"
            gy3.C87412m.m108593f(r9, r11)
            java.lang.String r11 = vr2.C102236a0.m134729X(r30)
            if (r8 == 0) goto L_0x01f0
            nq2.a$d r8 = r27.mo139968i()
            if (r8 == 0) goto L_0x0214
            com.tencent.mm.plugin.sns.ui.m2 r8 = r8.f293368m
            if (r8 == 0) goto L_0x0214
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r8 = r8.f280504g
            if (r8 == 0) goto L_0x0214
            if (r7 == 0) goto L_0x01eb
            android.graphics.Bitmap r7 = r7.f266818d
            goto L_0x01ec
        L_0x01eb:
            r7 = r14
        L_0x01ec:
            r8.setThumbBmp(r7)
            goto L_0x0214
        L_0x01f0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r7)
            nq2.a$d r8 = r27.mo139968i()
            if (r8 == 0) goto L_0x0214
            com.tencent.mm.plugin.sns.ui.m2 r8 = r8.f293368m
            if (r8 == 0) goto L_0x0214
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r8 = r8.f280504g
            if (r8 == 0) goto L_0x0214
            r8.setThumbBmp(r7)
        L_0x0214:
            nq2.a$d r7 = r27.mo139968i()
            if (r7 == 0) goto L_0x0225
            com.tencent.mm.plugin.sns.ui.m2 r7 = r7.f293368m
            if (r7 == 0) goto L_0x0225
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r7 = r7.f280504g
            if (r7 == 0) goto L_0x0225
            r7.mo134053x(r15)
        L_0x0225:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            if (r2 == 0) goto L_0x022f
            java.lang.String r1 = r2.mo131083C(r0, r3, r4, r15)
            goto L_0x0230
        L_0x022f:
            r1 = r14
        L_0x0230:
            if (r1 == 0) goto L_0x023b
            boolean r5 = z04.C112551y.m153811k(r1)
            if (r5 == 0) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r5 = 0
            goto L_0x023c
        L_0x023b:
            r5 = 1
        L_0x023c:
            if (r5 != 0) goto L_0x0252
            nq2.a$d r5 = r27.mo139968i()
            if (r5 == 0) goto L_0x024b
            com.tencent.mm.plugin.sns.ui.m2 r5 = r5.f293368m
            if (r5 == 0) goto L_0x024b
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r5 = r5.f280504g
            goto L_0x024c
        L_0x024b:
            r5 = r14
        L_0x024c:
            if (r5 != 0) goto L_0x024f
            goto L_0x0252
        L_0x024f:
            r5.setVideoPath(r1)
        L_0x0252:
            if (r0 == 0) goto L_0x0259
            java.lang.String r1 = r28.getSnsId()
            goto L_0x025a
        L_0x0259:
            r1 = r14
        L_0x025a:
            if (r1 != 0) goto L_0x025e
            java.lang.String r1 = "0"
        L_0x025e:
            r12.f294323m = r1
            nq2.a$d r1 = r12.f294312b
            if (r1 == 0) goto L_0x0273
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r1 = r1.f293370o
            if (r1 == 0) goto L_0x0273
            r5 = 2131311498(0x7f093b8a, float:1.8241338E38)
            android.view.View r1 = r1.findViewById(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r1 = (com.tencent.p014mm.p136ui.widget.MMPinProgressBtn) r1
            r11 = r1
            goto L_0x0274
        L_0x0273:
            r11 = r14
        L_0x0274:
            nq2.a$d r1 = r12.f294312b
            if (r1 == 0) goto L_0x0287
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r1 = r1.f293370o
            if (r1 == 0) goto L_0x0287
            r5 = 2131314332(0x7f09469c, float:1.8247086E38)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r9 = r1
            goto L_0x0288
        L_0x0287:
            r9 = r14
        L_0x0288:
            if (r9 == 0) goto L_0x0296
            android.content.Context r1 = r12.f294314d
            r5 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r1 = kg3.C76577a.m92158i(r1, r5)
            r9.setImageDrawable(r1)
        L_0x0296:
            if (r11 != 0) goto L_0x0299
            goto L_0x029e
        L_0x0299:
            r1 = 8
            r11.setVisibility(r1)
        L_0x029e:
            if (r9 != 0) goto L_0x02a2
            r13 = 0
            goto L_0x02a6
        L_0x02a2:
            r13 = 0
            r9.setVisibility(r13)
        L_0x02a6:
            c14.g r1 = c14.C54624g.SUSPEND
            d14.t0 r19 = d14.C58017a1.m67172a(r13, r13, r1)
            nq2.a$d r1 = r27.mo139968i()
            if (r1 == 0) goto L_0x02c2
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
            if (r1 == 0) goto L_0x02c2
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r1 = r1.f280504g
            if (r1 == 0) goto L_0x02c2
            ou2.b$e r5 = new ou2.b$e
            r5.<init>(r12)
            r1.setOnReplay(r5)
        L_0x02c2:
            a14.n0 r8 = r12.f294320j
            if (r8 == 0) goto L_0x02f2
            r21 = 0
            r22 = 0
            ou2.b$h r23 = new ou2.b$h
            r17 = 0
            r1 = r23
            r2 = r29
            r3 = r30
            r4 = r32
            r5 = r28
            r7 = r27
            r18 = r8
            r8 = r19
            r13 = 1913(0x779, float:2.68E-42)
            r10 = r11
            r26 = 0
            r11 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r24 = 3
            r25 = 0
            r20 = r18
            a14.C53895h.m60466d(r20, r21, r22, r23, r24, r25)
            goto L_0x02f6
        L_0x02f2:
            r13 = 1913(0x779, float:2.68E-42)
            r26 = 0
        L_0x02f6:
            nq2.a$d r1 = r27.mo139968i()
            if (r1 == 0) goto L_0x0303
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f293368m
            if (r1 == 0) goto L_0x0303
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r1 = r1.f280504g
            goto L_0x0304
        L_0x0303:
            r1 = r14
        L_0x0304:
            if (r1 != 0) goto L_0x030f
            java.lang.String r0 = "readySnsSightOffline"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x030f:
            int r2 = r12.f294311a
            if (r2 != 0) goto L_0x0375
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 7
            r2.mo175911u(r13, r3)
            ou2.h r2 = new ou2.h
            ou2.l r3 = r27.mo139966g()
            nq2.a$d r4 = r12.f294312b
            if (r4 == 0) goto L_0x0326
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r4 = r4.f293370o
            goto L_0x0327
        L_0x0326:
            r4 = r14
        L_0x0327:
            gv2.j r5 = new gv2.j
            r5.<init>(r1)
            a14.n0 r1 = r12.f294320j
            d14.t0<java.lang.Boolean> r6 = r12.f294322l
            ou2.b$f r7 = new ou2.b$f
            r7.<init>(r12)
            os2.l r8 = r12.f294324n
            te3.kv2 r9 = r12.f294325o
            jp2.o r10 = r12.f294315e
            java.lang.String r11 = "isTimeLine"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            jp2.o r14 = r12.f294315e
            if (r14 == 0) goto L_0x034a
            int r14 = r14.f290131k
            goto L_0x034b
        L_0x034a:
            r14 = 0
        L_0x034b:
            if (r14 != 0) goto L_0x034e
            goto L_0x034f
        L_0x034e:
            r15 = 0
        L_0x034f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            if (r15 == 0) goto L_0x0357
            r25 = 0
            goto L_0x035b
        L_0x0357:
            java.lang.Object r11 = r12.f294327q
            r25 = r11
        L_0x035b:
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r1
            r18 = r6
            r20 = r28
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r12.f294326p = r2
            goto L_0x03da
        L_0x0375:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 8
            r2.mo175911u(r13, r3)
            ou2.m r2 = new ou2.m
            ou2.l r14 = r27.mo139966g()
            nq2.a$d r3 = r12.f294312b
            if (r3 == 0) goto L_0x0389
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r3 = r3.f293370o
            goto L_0x038a
        L_0x0389:
            r3 = 0
        L_0x038a:
            gv2.j r4 = new gv2.j
            r4.<init>(r1)
            a14.n0 r1 = r12.f294320j
            d14.t0<java.lang.Boolean> r5 = r12.f294322l
            ou2.b$g r6 = new ou2.b$g
            r6.<init>(r12)
            os2.l r7 = r12.f294324n
            te3.kv2 r8 = r12.f294325o
            jp2.o r9 = r12.f294315e
            nq2.a$d r10 = r12.f294312b
            java.lang.String r11 = "isTimeLine"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            jp2.o r15 = r12.f294315e
            if (r15 == 0) goto L_0x03af
            int r15 = r15.f290131k
            goto L_0x03b0
        L_0x03af:
            r15 = 0
        L_0x03b0:
            if (r15 != 0) goto L_0x03b4
            r15 = 1
            goto L_0x03b5
        L_0x03b4:
            r15 = 0
        L_0x03b5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            if (r15 == 0) goto L_0x03bd
            r26 = 0
            goto L_0x03c1
        L_0x03bd:
            java.lang.Object r11 = r12.f294327q
            r26 = r11
        L_0x03c1:
            r13 = r2
            r15 = r3
            r16 = r4
            r17 = r1
            r18 = r5
            r20 = r28
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r12.f294326p = r2
        L_0x03da:
            ou2.a r0 = r12.f294326p
            if (r0 == 0) goto L_0x03e1
            r0.mo139961l()
        L_0x03e1:
            java.lang.String r0 = "readySnsSightOffline"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x03ea:
            java.lang.String r1 = "BreakFrameCardAdController"
            java.lang.String r2 = "readySnsSightOffline has inited!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            jq2.g r1 = jq2.C98985g.f290230a
            r1.mo138343f(r0, r3, r4)
            r1.mo138343f(r0, r6, r4)
            java.lang.String r0 = "triggerDownloadMediaThumb"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r3 != 0) goto L_0x040d
            java.lang.String r0 = "triggerDownloadMediaThumb"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0466
        L_0x040d:
            java.util.Set<java.lang.String> r1 = jq2.C98985g.f290233d
            monitor-enter(r1)
            java.lang.String r0 = r3.f298689d     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x0416
            java.lang.String r0 = ""
        L_0x0416:
            r1.add(r0)     // Catch:{ all -> 0x046f }
            monitor-exit(r1)
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r1 = r3.f298689d
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r0, r1)
            java.lang.String r1 = "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = vr2.C102236a0.m134729X(r30)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x045e
            vr2.v r0 = new vr2.v
            r0.<init>((te3.C101804kv2) r3)
            r1 = 1
            r0.mo141832d(r1)
            java.lang.String r2 = r3.f298689d
            r0.mo141833e(r2)
            com.tencent.mm.plugin.sns.model.e r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            int r5 = r3.f298690e
            if (r5 != r8) goto L_0x045a
            r15 = 5
            goto L_0x045b
        L_0x045a:
            r15 = 1
        L_0x045b:
            r2.mo130979d(r3, r15, r0, r4)
        L_0x045e:
            java.lang.String r0 = "triggerDownloadMediaThumb"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x0466:
            java.lang.String r0 = "readySnsSightOffline"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x046f:
            r0 = move-exception
            monitor-exit(r1)
            java.lang.String r1 = "triggerDownloadMediaThumb"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100464b.mo139964c(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.model.o, te3.kv2, com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView, com.tencent.mm.storage.o3):void");
    }

    /* renamed from: d */
    public void mo139965d(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        Log.m105918d("BreakFrameCardAdController", "pausePlay() called with: useOnlineVideo = " + z);
        if (((C58052j1) this.f294321k).getValue() != C100467c.STOP) {
            ((C58052j1) this.f294321k).setValue(C100467c.PAUSE);
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
    }

    /* renamed from: g */
    public final C100509l mo139966g() {
        SnsMethodCalculate.markStartTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C100151a.C100155d dVar = this.f294312b;
        SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = dVar != null ? dVar.f293370o : null;
        SnsMethodCalculate.markEndTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return snsAdBreakFrameVideoView;
    }

    /* renamed from: h */
    public final C58087u0<FrameLayout.LayoutParams> mo139967h() {
        SnsMethodCalculate.markStartTimeMs("getUiReadyFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C58087u0<FrameLayout.LayoutParams> u0Var = this.f294316f;
        SnsMethodCalculate.markEndTimeMs("getUiReadyFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return u0Var;
    }

    /* renamed from: i */
    public final C100151a.C100155d mo139968i() {
        SnsMethodCalculate.markStartTimeMs("getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C100151a.C100155d dVar = this.f294312b;
        SnsMethodCalculate.markEndTimeMs("getWrapHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r2 = (r2 = r2.getAdXml()).adBreakFrameInfo;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139969j() {
        /*
            r5 = this;
            java.lang.String r0 = "onClear"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "BreakFrameCardAdController"
            java.lang.String r3 = "scope.cancel called"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r5.f294313c
            r3 = 0
            if (r2 == 0) goto L_0x0024
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.getAdXml()
            if (r2 == 0) goto L_0x0024
            com.tencent.mm.plugin.sns.storage.a r2 = r2.adBreakFrameInfo
            if (r2 == 0) goto L_0x0024
            os2.l r2 = r2.mo132012a()
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            if (r2 == 0) goto L_0x002e
            ou2.a r4 = r5.f294326p
            if (r4 == 0) goto L_0x002e
            r4.mo139951a(r2)
        L_0x002e:
            java.lang.String r2 = ""
            r5.f294323m = r2
            a14.n0 r2 = r5.f294320j
            if (r2 == 0) goto L_0x0039
            a14.C53930o0.m60556c(r2, r3)
        L_0x0039:
            r5.f294320j = r3
            nq2.a$d r2 = r5.f294312b
            if (r2 == 0) goto L_0x0046
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r2 = r2.f293370o
            if (r2 == 0) goto L_0x0046
            r2.stop()
        L_0x0046:
            nq2.a$d r2 = r5.mo139968i()
            if (r2 == 0) goto L_0x0057
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            if (r2 == 0) goto L_0x0057
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r2 = r2.f280504g
            if (r2 == 0) goto L_0x0057
            r2.mo134051v()
        L_0x0057:
            nq2.a$d r2 = r5.mo139968i()
            if (r2 == 0) goto L_0x0069
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            if (r2 == 0) goto L_0x0069
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r2 = r2.f280504g
            if (r2 == 0) goto L_0x0069
            r4 = 1
            r2.mo134053x(r4)
        L_0x0069:
            nq2.a$d r2 = r5.mo139968i()
            if (r2 == 0) goto L_0x007a
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            if (r2 == 0) goto L_0x007a
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r2 = r2.f280504g
            if (r2 == 0) goto L_0x007a
            r2.setOnReplay(r3)
        L_0x007a:
            d14.u0<ou2.b$c> r2 = r5.f294321k
            ou2.b$c r4 = ou2.C100464b.C100467c.STOP
            d14.j1 r2 = (d14.C58052j1) r2
            r2.setValue(r4)
            ou2.a r2 = r5.f294326p
            if (r2 == 0) goto L_0x008a
            r2.mo139959j()
        L_0x008a:
            ou2.a r2 = r5.f294326p
            if (r2 == 0) goto L_0x009b
            java.lang.String r3 = "getStoredData"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.Object r2 = r2.f294300l
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r3 = r2
        L_0x009b:
            r5.f294327q = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100464b.mo139969j():void");
    }
}

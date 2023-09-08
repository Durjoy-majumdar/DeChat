package ou2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.C103733h;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.C95301a;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C45252f;
import d14.C45253g;
import d14.C58031e0;
import d14.C58042h;
import d14.C58085t0;
import e14.C58496n;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C59741c0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98963o;
import kg3.C76577a;
import kotlin.ResultKt;
import ky3.C88334c;
import lo2.C99558o;
import lo2.C99561p;
import lo2.C99564q;
import lo2.C99567r;
import nq2.C100151a;
import org.json.JSONObject;
import os2.C100397a;
import os2.C100413l;
import os2.C100418s;
import os2.C100419u;
import os2.C62176t;
import os2.C62179t0;
import ou2.C100464b;
import p823sg.C101611g;
import rq2.C63489a;
import rx3.C13598b0;
import rx3.C13600d;
import sx3.C110818d0;
import sx3.C110823p;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102260r;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ou2.m */
public final class C100511m extends C100462a {

    /* renamed from: w */
    public static final C100512a f294465w = new C100512a((C8480h) null);

    /* renamed from: m */
    public final C100151a.C100155d f294466m;

    /* renamed from: n */
    public long f294467n;

    /* renamed from: o */
    public boolean f294468o;

    /* renamed from: p */
    public int f294469p = 0;

    /* renamed from: q */
    public int f294470q = 0;

    /* renamed from: r */
    public boolean f294471r;

    /* renamed from: s */
    public long f294472s;

    /* renamed from: t */
    public int f294473t;

    /* renamed from: u */
    public ImageView f294474u;

    /* renamed from: v */
    public AdAppCompatTextView f294475v;

    /* renamed from: ou2.m$a */
    public static final class C100512a {
        public C100512a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo139984a() {
            SnsMethodCalculate.markStartTimeMs("getSTATE_STOP", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getSTATE_STOP$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("access$getSTATE_STOP$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("getSTATE_STOP", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            return 1;
        }

        /* renamed from: b */
        public final String mo139985b() {
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            return "IpInteractScheduleVideoController";
        }

        /* renamed from: c */
        public final void mo139986c(SnsInfo snsInfo, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            C87412m.m108594g(snsInfo, "snsInfo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", C102236a0.m134765q0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            String str = snsInfo.getAdXml().adExtInfo;
            if (str == null) {
                str = "";
            }
            jSONObject.put("adExtInfo", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionType", i);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "obj.toString()");
            mo139985b();
            Log.m105924i("IpInteractScheduleVideoController", "sns_ad_ip_interact_user_action_report:" + jSONObject3);
            C102260r.m134858a("sns_ad_ip_interact_user_action_report", jSONObject3);
            SnsMethodCalculate.markEndTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
        }
    }

    /* renamed from: ou2.m$b */
    public static final class C100513b {

        /* renamed from: a */
        public final long f294476a;

        /* renamed from: b */
        public final int f294477b;

        public C100513b(long j, int i) {
            this.f294476a = j;
            this.f294477b = i;
        }
    }

    /* renamed from: ou2.m$c */
    public static final class C100514c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100511m f294478d;

        public C100514c(C100511m mVar) {
            this.f294478d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/IpInteractScheduleVideoController$startProcessCommandFlow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$1");
            C98963o h = this.f294478d.mo139957h();
            int i = (h != null ? h.f290131k : 0) == 0 ? 1 : 2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", C102236a0.m134765q0(this.f294478d.mo139958i().field_snsId));
            jSONObject.put("uxinfo", this.f294478d.mo139958i().getUxinfo());
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            String str = this.f294478d.mo139958i().getAdXml().adExtInfo;
            if (str == null) {
                str = "";
            }
            jSONObject.put("adExtInfo", str);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "obj.toString()");
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            Log.m105924i("IpInteractScheduleVideoController", "sns_ad_ip_interact_tag_click_report:" + jSONObject2);
            C102260r.m134858a("sns_ad_ip_interact_tag_click_report", jSONObject2);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/IpInteractScheduleVideoController$startProcessCommandFlow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {371}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.m$d */
    public static final class C100515d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294479d;

        /* renamed from: e */
        public /* synthetic */ Object f294480e;

        /* renamed from: f */
        public final /* synthetic */ C100511m f294481f;

        /* renamed from: g */
        public final /* synthetic */ C100397a f294482g;

        /* renamed from: h */
        public final /* synthetic */ AdClickActionInfo f294483h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<C53973z1> f294484i;

        /* renamed from: j */
        public final /* synthetic */ C100419u f294485j;

        /* renamed from: n */
        public final /* synthetic */ C58085t0<Boolean> f294486n;

        /* renamed from: ou2.m$d$a */
        public static final class C100516a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100511m f294487d;

            /* renamed from: e */
            public final /* synthetic */ C100397a f294488e;

            /* renamed from: f */
            public final /* synthetic */ AdClickActionInfo f294489f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<C53973z1> f294490g;

            /* renamed from: h */
            public final /* synthetic */ C0000n0 f294491h;

            /* renamed from: i */
            public final /* synthetic */ C100419u f294492i;

            /* renamed from: j */
            public final /* synthetic */ C58085t0<Boolean> f294493j;

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {382, 383, 403, 409}, mo125471m = "emit")
            /* renamed from: ou2.m$d$a$a */
            public static final class C100517a extends C66704d {

                /* renamed from: d */
                public Object f294494d;

                /* renamed from: e */
                public Object f294495e;

                /* renamed from: f */
                public long f294496f;

                /* renamed from: g */
                public /* synthetic */ Object f294497g;

                /* renamed from: h */
                public final /* synthetic */ C100516a<T> f294498h;

                /* renamed from: i */
                public int f294499i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100517a(C100516a<? super T> aVar, C15601d<? super C100517a> dVar) {
                    super(dVar);
                    this.f294498h = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1$emit$1");
                    this.f294497g = obj;
                    this.f294499i |= Integer.MIN_VALUE;
                    Object a = this.f294498h.mo139988a((C100464b.C100466b) null, this);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1$emit$1");
                    return a;
                }
            }

            public C100516a(C100511m mVar, C100397a aVar, AdClickActionInfo adClickActionInfo, C8479f0<C53973z1> f0Var, C0000n0 n0Var, C100419u uVar, C58085t0<Boolean> t0Var) {
                this.f294487d = mVar;
                this.f294488e = aVar;
                this.f294489f = adClickActionInfo;
                this.f294490g = f0Var;
                this.f294491h = n0Var;
                this.f294492i = uVar;
                this.f294493j = t0Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:103:0x0316  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x0172  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x01b1  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x01e3  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0228  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x0240  */
            /* JADX WARNING: Removed duplicated region for block: B:78:0x0279  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:94:0x02e5  */
            /* JADX WARNING: Removed duplicated region for block: B:95:0x02f8  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo139988a(ou2.C100464b.C100466b r30, wx3.C15601d<? super rx3.C13598b0> r31) {
                /*
                    r29 = this;
                    r0 = r29
                    r1 = r30
                    r2 = r31
                    java.lang.String r3 = "emit"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r5 = r2 instanceof ou2.C100511m.C100515d.C100516a.C100517a
                    if (r5 == 0) goto L_0x0020
                    r5 = r2
                    ou2.m$d$a$a r5 = (ou2.C100511m.C100515d.C100516a.C100517a) r5
                    int r6 = r5.f294499i
                    r7 = -2147483648(0xffffffff80000000, float:-0.0)
                    r8 = r6 & r7
                    if (r8 == 0) goto L_0x0020
                    int r6 = r6 - r7
                    r5.f294499i = r6
                    goto L_0x0025
                L_0x0020:
                    ou2.m$d$a$a r5 = new ou2.m$d$a$a
                    r5.<init>(r0, r2)
                L_0x0025:
                    java.lang.Object r2 = r5.f294497g
                    xx3.a r13 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r6 = r5.f294499i
                    java.lang.String r14 = "access$getTAG$cp"
                    java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
                    java.lang.String r12 = "getTAG"
                    java.lang.String r11 = "IpInteractScheduleVideoController"
                    java.lang.String r10 = "access$setPlaying$p"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayInfo"
                    java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController"
                    java.lang.String r9 = "access$getHasPrepared$p"
                    r17 = r10
                    r10 = 1
                    r20 = r13
                    java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                    if (r6 == 0) goto L_0x00ac
                    if (r6 == r10) goto L_0x0090
                    r1 = 2
                    if (r6 == r1) goto L_0x007a
                    r1 = 3
                    if (r6 == r1) goto L_0x006c
                    r1 = 4
                    if (r6 != r1) goto L_0x0061
                    java.lang.Object r1 = r5.f294495e
                    ou2.b$b r1 = (ou2.C100464b.C100466b) r1
                    java.lang.Object r5 = r5.f294494d
                    ou2.m$d$a r5 = (ou2.C100511m.C100515d.C100516a) r5
                    kotlin.ResultKt.throwOnFailure(r2)
                    r2 = r12
                    r8 = r13
                    r10 = r17
                    r7 = 0
                    goto L_0x02d9
                L_0x0061:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    throw r1
                L_0x006c:
                    java.lang.Object r1 = r5.f294494d
                    ou2.m$d$a r1 = (ou2.C100511m.C100515d.C100516a) r1
                    kotlin.ResultKt.throwOnFailure(r2)
                    r8 = r13
                    r26 = r17
                    r6 = 1
                L_0x0077:
                    r7 = 0
                    goto L_0x028b
                L_0x007a:
                    r1 = 3
                    long r6 = r5.f294496f
                    java.lang.Object r9 = r5.f294494d
                    ou2.m$d$a r9 = (ou2.C100511m.C100515d.C100516a) r9
                    kotlin.ResultKt.throwOnFailure(r2)
                    r2 = r8
                    r25 = r11
                    r1 = r12
                    r24 = r13
                    r26 = r17
                    r13 = r20
                    goto L_0x01c1
                L_0x0090:
                    r21 = r11
                    r1 = 3
                    long r10 = r5.f294496f
                    java.lang.Object r6 = r5.f294495e
                    ou2.b$b r6 = (ou2.C100464b.C100466b) r6
                    java.lang.Object r9 = r5.f294494d
                    ou2.m$d$a r9 = (ou2.C100511m.C100515d.C100516a) r9
                    kotlin.ResultKt.throwOnFailure(r2)
                    r1 = r6
                    r22 = r8
                    r23 = r12
                    r24 = r13
                    r13 = r20
                    r12 = 1
                    goto L_0x015e
                L_0x00ac:
                    r21 = r11
                    r10 = 3
                    kotlin.ResultKt.throwOnFailure(r2)
                    ou2.b$a r2 = r30.mo139971b()
                    ou2.b$a r6 = ou2.C100464b.C100465a.PLAY
                    if (r2 != r6) goto L_0x02ae
                    ou2.m r2 = r0.f294487d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r13)
                    boolean r2 = r2.f294471r
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
                    if (r2 != 0) goto L_0x0245
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r15)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r15)
                    java.lang.String r2 = "playCommand is not hasStarted, should prepare!"
                    r11 = r21
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
                    long r10 = java.lang.System.currentTimeMillis()
                    ou2.m r6 = r0.f294487d
                    r6.getClass()
                    java.lang.String r9 = "getAlphaRenderControl"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                    ou2.k r6 = r6.f294290b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                    if (r6 != 0) goto L_0x00f0
                    goto L_0x0105
                L_0x00f0:
                    ou2.m r9 = r0.f294487d
                    os2.l r9 = r9.mo139953d()
                    if (r9 == 0) goto L_0x0101
                    int r9 = r9.mo139878c()
                    r2 = 1
                    if (r9 != r2) goto L_0x0101
                    r2 = 1
                    goto L_0x0102
                L_0x0101:
                    r2 = 0
                L_0x0102:
                    r6.setRenderMode(r2)
                L_0x0105:
                    ou2.m r2 = r0.f294487d
                    ou2.l r2 = r2.mo139955f()
                    if (r2 == 0) goto L_0x0160
                    java.lang.String r6 = "getBreakSight"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                    jq2.g$c r9 = r1.f294333c
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                    java.lang.String r6 = r9.mo138347a()
                    android.widget.FrameLayout$LayoutParams r9 = r30.mo139970a()
                    r22 = r8
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r23 = r12
                    java.lang.String r12 = "snsId="
                    r8.append(r12)
                    ou2.m r12 = r0.f294487d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r12.mo139958i()
                    r24 = r13
                    if (r12 == 0) goto L_0x013b
                    long r12 = r12.field_snsId
                    goto L_0x013d
                L_0x013b:
                    r12 = 0
                L_0x013d:
                    java.lang.String r12 = vr2.C102236a0.m134765q0(r12)
                    r8.append(r12)
                    java.lang.String r8 = r8.toString()
                    r5.f294494d = r0
                    r5.f294495e = r1
                    r5.f294496f = r10
                    r12 = 1
                    r5.f294499i = r12
                    java.lang.Object r2 = r2.mo133978b(r6, r9, r8, r5)
                    r13 = r20
                    if (r2 != r13) goto L_0x015d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r13
                L_0x015d:
                    r9 = r0
                L_0x015e:
                    r2 = r9
                    goto L_0x016a
                L_0x0160:
                    r22 = r8
                    r23 = r12
                    r24 = r13
                    r13 = r20
                    r12 = 1
                    r2 = r0
                L_0x016a:
                    ou2.m r6 = r2.f294487d
                    ou2.l r6 = r6.mo139956g()
                    if (r6 == 0) goto L_0x01b1
                    r1.getClass()
                    java.lang.String r8 = "getSight"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
                    jq2.g$c r1 = r1.f294332b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
                    java.lang.String r7 = r1.mo138347a()
                    r8 = 0
                    r9 = 0
                    r1 = 6
                    r19 = 0
                    r5.f294494d = r2
                    r12 = 0
                    r5.f294495e = r12
                    r5.f294496f = r10
                    r12 = 2
                    r5.f294499i = r12
                    r12 = r22
                    r27 = r10
                    r11 = r17
                    r16 = r27
                    r10 = r5
                    r26 = r11
                    r25 = r21
                    r11 = r1
                    r18 = r2
                    r2 = r12
                    r1 = r23
                    r12 = r19
                    java.lang.Object r6 = ou2.C100509l.C100510a.m131542a(r6, r7, r8, r9, r10, r11, r12)
                    if (r6 != r13) goto L_0x01bd
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r13
                L_0x01b1:
                    r18 = r2
                    r26 = r17
                    r25 = r21
                    r2 = r22
                    r1 = r23
                    r16 = r10
                L_0x01bd:
                    r6 = r16
                    r9 = r18
                L_0x01c1:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r15)
                    r8 = r24
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r15)
                    java.lang.String r10 = "playCommand prepared!"
                    r11 = r25
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
                    long r16 = java.lang.System.currentTimeMillis()
                    long r6 = r16 - r6
                    r16 = 3000(0xbb8, double:1.482E-320)
                    int r10 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
                    if (r10 <= 0) goto L_0x0204
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r15)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r15)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r10 = "prepare cost too much time!  "
                    r1.append(r10)
                    r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
                L_0x0204:
                    ou2.m r1 = r9.f294487d
                    r1.getClass()
                    java.lang.String r6 = "getSetClickArea"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
                    fy3.q<os2.a, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo, rx3.b0> r1 = r1.f294296h
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
                    os2.a r2 = r9.f294488e
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r6 = r9.f294489f
                    ou2.m r7 = r9.f294487d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r7.mo139958i()
                    r1.invoke(r2, r6, r7)
                    ou2.m r1 = r9.f294487d
                    ou2.l r1 = r1.mo139956g()
                    if (r1 == 0) goto L_0x022b
                    r1.start()
                L_0x022b:
                    ou2.m r1 = r9.f294487d
                    java.lang.String r2 = "access$setHasPrepared$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r8)
                    r6 = 1
                    r1.f294471r = r6
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r8)
                    ou2.m r1 = r9.f294487d
                    ou2.l r1 = r1.mo139955f()
                    if (r1 == 0) goto L_0x0243
                    r1.start()
                L_0x0243:
                    r1 = r9
                    goto L_0x0271
                L_0x0245:
                    r8 = r13
                    r26 = r17
                    r13 = r20
                    r6 = 1
                    ou2.m r2 = r0.f294487d
                    ou2.l r2 = r2.mo139955f()
                    if (r2 == 0) goto L_0x0256
                    r2.resume()
                L_0x0256:
                    ou2.m r2 = r0.f294487d
                    ou2.l r2 = r2.mo139956g()
                    if (r2 == 0) goto L_0x0261
                    r2.resume()
                L_0x0261:
                    ou2.m r2 = r0.f294487d
                    ou2.l r2 = r2.mo139955f()
                    if (r2 == 0) goto L_0x0270
                    android.widget.FrameLayout$LayoutParams r1 = r30.mo139970a()
                    r2.mo133977a(r1)
                L_0x0270:
                    r1 = r0
                L_0x0271:
                    gy3.f0<a14.z1> r2 = r1.f294490g
                    T r2 = r2.f27484d
                    a14.z1 r2 = (a14.C53973z1) r2
                    if (r2 == 0) goto L_0x0077
                    r5.f294494d = r1
                    r7 = 0
                    r5.f294495e = r7
                    r9 = 3
                    r5.f294499i = r9
                    java.lang.Object r2 = a14.C53873d2.m60391c(r2, r5)
                    if (r2 != r13) goto L_0x028b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r13
                L_0x028b:
                    gy3.f0<a14.z1> r2 = r1.f294490g
                    a14.n0 r5 = r1.f294491h
                    ou2.m r9 = r1.f294487d
                    os2.u r10 = r1.f294492i
                    d14.t0<java.lang.Boolean> r11 = r1.f294493j
                    a14.z1 r5 = ou2.C100511m.m131547q(r5, r9, r10, r11)
                    r2.f27484d = r5
                    ou2.m r2 = r1.f294487d
                    r10 = r26
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
                    r2.f294468o = r6
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
                    ou2.m r1 = r1.f294487d
                    r1.mo139951a(r7)
                    goto L_0x032d
                L_0x02ae:
                    r2 = r12
                    r8 = r13
                    r10 = r17
                    r13 = r20
                    r11 = r21
                    r7 = 0
                    ou2.b$a r6 = r30.mo139971b()
                    ou2.b$a r12 = ou2.C100464b.C100465a.PAUSE
                    if (r6 != r12) goto L_0x032d
                    gy3.f0<a14.z1> r6 = r0.f294490g
                    T r6 = r6.f27484d
                    a14.z1 r6 = (a14.C53973z1) r6
                    if (r6 == 0) goto L_0x02d8
                    r5.f294494d = r0
                    r5.f294495e = r1
                    r12 = 4
                    r5.f294499i = r12
                    java.lang.Object r5 = a14.C53873d2.m60391c(r6, r5)
                    if (r5 != r13) goto L_0x02d8
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r13
                L_0x02d8:
                    r5 = r0
                L_0x02d9:
                    ou2.m r6 = r5.f294487d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
                    boolean r6 = r6.f294471r
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
                    if (r6 != 0) goto L_0x02f8
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r15)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)
                    java.lang.String r2 = "playCommand call pause but not started!!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)
                    goto L_0x030e
                L_0x02f8:
                    ou2.m r2 = r5.f294487d
                    ou2.l r2 = r2.mo139955f()
                    if (r2 == 0) goto L_0x0303
                    r2.pause()
                L_0x0303:
                    ou2.m r2 = r5.f294487d
                    ou2.l r2 = r2.mo139956g()
                    if (r2 == 0) goto L_0x030e
                    r2.pause()
                L_0x030e:
                    ou2.m r2 = r5.f294487d
                    ou2.l r2 = r2.mo139955f()
                    if (r2 == 0) goto L_0x031d
                    android.widget.FrameLayout$LayoutParams r1 = r1.mo139970a()
                    r2.mo133977a(r1)
                L_0x031d:
                    ou2.m r1 = r5.f294487d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
                    r2 = 0
                    r1.f294468o = r2
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
                    ou2.m r1 = r5.f294487d
                    r1.mo139951a(r7)
                L_0x032d:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100515d.C100516a.mo139988a(ou2.b$b, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1");
                Object a = mo139988a((C100464b.C100466b) obj, dVar);
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1");
                return a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100515d(C100511m mVar, C100397a aVar, AdClickActionInfo adClickActionInfo, C8479f0<C53973z1> f0Var, C100419u uVar, C58085t0<Boolean> t0Var, C15601d<? super C100515d> dVar) {
            super(2, dVar);
            this.f294481f = mVar;
            this.f294482g = aVar;
            this.f294483h = adClickActionInfo;
            this.f294484i = f0Var;
            this.f294485j = uVar;
            this.f294486n = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            C100515d dVar2 = new C100515d(this.f294481f, this.f294482g, this.f294483h, this.f294484i, this.f294485j, this.f294486n, dVar);
            dVar2.f294480e = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            Object invokeSuspend = ((C100515d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294479d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C100511m mVar = this.f294481f;
                mVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getPlayCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C58085t0<C100464b.C100466b> t0Var = mVar.f294294f;
                SnsMethodCalculate.markEndTimeMs("getPlayCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C45252f<C100464b.C100466b> e = C58042h.m67196e(t0Var);
                C100516a aVar2 = new C100516a(this.f294481f, this.f294482g, this.f294483h, this.f294484i, (C0000n0) this.f294480e, this.f294485j, this.f294486n);
                this.f294479d = 1;
                if (e.mo31880a(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {230}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.m$e */
    public static final class C100518e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294500d;

        /* renamed from: e */
        public final /* synthetic */ C100511m f294501e;

        /* renamed from: f */
        public final /* synthetic */ C100419u f294502f;

        /* renamed from: ou2.m$e$a */
        public static final class C100519a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100511m f294503d;

            /* renamed from: e */
            public final /* synthetic */ C100419u f294504e;

            public C100519a(C100511m mVar, C100419u uVar) {
                this.f294503d = mVar;
                this.f294504e = uVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                String str;
                String b;
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                C100511m mVar = this.f294503d;
                SnsMethodCalculate.markStartTimeMs("access$setHasPrepared$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                mVar.f294471r = false;
                SnsMethodCalculate.markEndTimeMs("access$setHasPrepared$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                C100509l f = this.f294503d.mo139955f();
                if (f != null) {
                    f.pause();
                }
                C100509l f2 = this.f294503d.mo139955f();
                if (f2 != null) {
                    f2.stop();
                }
                C100511m mVar2 = this.f294503d;
                SnsMethodCalculate.markStartTimeMs("getSTATE_BREAK", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getSTATE_BREAK$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                SnsMethodCalculate.markEndTimeMs("access$getSTATE_BREAK$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                SnsMethodCalculate.markEndTimeMs("getSTATE_BREAK", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                C100511m.m131546p(mVar2, 0);
                C100511m mVar3 = this.f294503d;
                SnsMethodCalculate.markStartTimeMs("getSTATE_BREAK", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getSTATE_BREAK$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                SnsMethodCalculate.markEndTimeMs("access$getSTATE_BREAK$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                SnsMethodCalculate.markEndTimeMs("getSTATE_BREAK", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                SnsMethodCalculate.markStartTimeMs("access$setLastSeekState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                mVar3.f294470q = 0;
                SnsMethodCalculate.markEndTimeMs("access$setLastSeekState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                C62179t0 t0Var = (C62179t0) C110818d0.m150935g0(this.f294504e.mo139882a().mo87231a(), C88334c.f255322d);
                String str2 = "";
                if (t0Var == null || (str = t0Var.mo87234a()) == null) {
                    str = str2;
                }
                C63489a.m74826a(str, C100511m.m131544n(this.f294503d));
                AdAppCompatTextView o = C100511m.m131545o(this.f294503d);
                if (o != null) {
                    if (!(t0Var == null || (b = t0Var.mo87235b()) == null)) {
                        str2 = b;
                    }
                    o.setText(str2);
                }
                AdAppCompatTextView o2 = C100511m.m131545o(this.f294503d);
                if (o2 != null) {
                    Context context = o2.getContext();
                    SnsMethodCalculate.markStartTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                    int round = Math.round(C76577a.m92156g(context) * ((float) 14));
                    SnsMethodCalculate.markEndTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                    C103733h.m138105b(o2, 1, round, 1, 0);
                }
                C100511m mVar4 = this.f294503d;
                SnsMethodCalculate.markStartTimeMs("access$getVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                int i = mVar4.f294473t;
                SnsMethodCalculate.markEndTimeMs("access$getVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                SnsMethodCalculate.markStartTimeMs("access$setVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                mVar4.f294473t = i + 1;
                SnsMethodCalculate.markEndTimeMs("access$setVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100518e(C100511m mVar, C100419u uVar, C15601d<? super C100518e> dVar) {
            super(2, dVar);
            this.f294501e = mVar;
            this.f294502f = uVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            C100518e eVar = new C100518e(this.f294501e, this.f294502f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            ((C100518e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294500d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C100511m mVar = this.f294501e;
                mVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getRestartPlayFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C58085t0<Boolean> t0Var = mVar.f294293e;
                SnsMethodCalculate.markEndTimeMs("getRestartPlayFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                C100519a aVar2 = new C100519a(this.f294501e, this.f294502f);
                this.f294500d = 1;
                if (t0Var.mo31880a(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
                    return aVar;
                }
            } else if (i != 1) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
                throw illegalStateException;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            C13600d dVar = new C13600d();
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$restartPlayJob$1");
            throw dVar;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {262}, mo125471m = "invokeSuspend")
    /* renamed from: ou2.m$f */
    public static final class C100520f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f294505d;

        /* renamed from: e */
        public /* synthetic */ Object f294506e;

        /* renamed from: f */
        public final /* synthetic */ C58085t0<Boolean> f294507f;

        /* renamed from: g */
        public final /* synthetic */ C100511m f294508g;

        /* renamed from: h */
        public final /* synthetic */ C100419u f294509h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<C53973z1> f294510i;

        /* renamed from: j */
        public final /* synthetic */ C100418s f294511j;

        /* renamed from: n */
        public final /* synthetic */ C8479f0<C53973z1> f294512n;

        /* renamed from: o */
        public final /* synthetic */ C62179t0 f294513o;

        /* renamed from: ou2.m$f$a */
        public static final class C100521a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C100511m f294514d;

            /* renamed from: e */
            public final /* synthetic */ C100419u f294515e;

            /* renamed from: f */
            public final /* synthetic */ C8479f0<C53973z1> f294516f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<C53973z1> f294517g;

            /* renamed from: h */
            public final /* synthetic */ C100418s f294518h;

            /* renamed from: i */
            public final /* synthetic */ C0000n0 f294519i;

            /* renamed from: j */
            public final /* synthetic */ C58085t0<Boolean> f294520j;

            /* renamed from: n */
            public final /* synthetic */ C8479f0<C53973z1> f294521n;

            /* renamed from: o */
            public final /* synthetic */ C62179t0 f294522o;

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {335, 336, 337}, mo125471m = "invokeSuspend")
            /* renamed from: ou2.m$f$a$a */
            public static final class C100522a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public Object f294523d;

                /* renamed from: e */
                public int f294524e;

                /* renamed from: f */
                public /* synthetic */ Object f294525f;

                /* renamed from: g */
                public final /* synthetic */ float f294526g;

                /* renamed from: h */
                public final /* synthetic */ C100511m f294527h;

                /* renamed from: i */
                public final /* synthetic */ C62176t f294528i;

                /* renamed from: j */
                public final /* synthetic */ C8479f0<C53973z1> f294529j;

                /* renamed from: n */
                public final /* synthetic */ C100419u f294530n;

                /* renamed from: o */
                public final /* synthetic */ C58085t0<Boolean> f294531o;

                /* renamed from: ou2.m$f$a$a$a */
                public static final class C100523a extends C87413o implements C32224a<Boolean> {

                    /* renamed from: d */
                    public final /* synthetic */ C100511m f294532d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100523a(C100511m mVar) {
                        super(0);
                        this.f294532d = mVar;
                    }

                    public Object invoke() {
                        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$1");
                        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$1");
                        C100511m mVar = this.f294532d;
                        SnsMethodCalculate.markStartTimeMs("access$isPlaying$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                        boolean z = mVar.f294468o;
                        SnsMethodCalculate.markEndTimeMs("access$isPlaying$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                        Boolean valueOf = Boolean.valueOf(z);
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$1");
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$1");
                        return valueOf;
                    }
                }

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {329}, mo125471m = "invokeSuspend")
                /* renamed from: ou2.m$f$a$a$b */
                public static final class C100524b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                    /* renamed from: d */
                    public int f294533d;

                    /* renamed from: e */
                    public /* synthetic */ Object f294534e;

                    /* renamed from: f */
                    public final /* synthetic */ long f294535f;

                    /* renamed from: g */
                    public final /* synthetic */ C59741c0 f294536g;

                    /* renamed from: h */
                    public final /* synthetic */ float f294537h;

                    /* renamed from: i */
                    public final /* synthetic */ C100511m f294538i;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100524b(long j, C59741c0 c0Var, float f, C100511m mVar, C15601d<? super C100524b> dVar) {
                        super(2, dVar);
                        this.f294535f = j;
                        this.f294536g = c0Var;
                        this.f294537h = f;
                        this.f294538i = mVar;
                    }

                    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
                        C100524b bVar = new C100524b(this.f294535f, this.f294536g, this.f294537h, this.f294538i, dVar);
                        bVar.f294534e = obj;
                        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
                        return bVar;
                    }

                    public Object invoke(Object obj, Object obj2) {
                        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
                        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
                        Object invokeSuspend = ((C100524b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1");
                        return invokeSuspend;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
                    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.String r0 = "invokeSuspend"
                            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1$alphaJob$1"
                            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                            int r3 = r8.f294533d
                            r4 = 1
                            if (r3 == 0) goto L_0x0025
                            if (r3 != r4) goto L_0x001a
                            java.lang.Object r3 = r8.f294534e
                            a14.n0 r3 = (a14.C0000n0) r3
                            kotlin.ResultKt.throwOnFailure(r9)
                            r9 = r8
                            goto L_0x0044
                        L_0x001a:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r2)
                            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                            throw r9
                        L_0x0025:
                            kotlin.ResultKt.throwOnFailure(r9)
                            java.lang.Object r9 = r8.f294534e
                            a14.n0 r9 = (a14.C0000n0) r9
                            r3 = r9
                            r9 = r8
                        L_0x002e:
                            boolean r5 = a14.C53930o0.m60560g(r3)
                            if (r5 == 0) goto L_0x0064
                            long r5 = r9.f294535f
                            r9.f294534e = r3
                            r9.f294533d = r4
                            java.lang.Object r5 = a14.C53965x0.m60607b(r5, r9)
                            if (r5 != r2) goto L_0x0044
                            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                            return r2
                        L_0x0044:
                            gy3.c0 r5 = r9.f294536g
                            float r6 = r5.f170634d
                            float r7 = r9.f294537h
                            float r6 = r6 - r7
                            r5.f170634d = r6
                            r7 = 0
                            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                            if (r6 >= 0) goto L_0x0054
                            r5.f170634d = r7
                        L_0x0054:
                            ou2.m r5 = r9.f294538i
                            ou2.l r5 = r5.mo139955f()
                            if (r5 == 0) goto L_0x002e
                            gy3.c0 r6 = r9.f294536g
                            float r6 = r6.f170634d
                            r5.setFrameLayoutAlpha(r6)
                            goto L_0x002e
                        L_0x0064:
                            rx3.b0 r9 = rx3.C13598b0.f38549a
                            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100521a.C100522a.C100524b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100522a(float f, C100511m mVar, C62176t tVar, C8479f0<C53973z1> f0Var, C100419u uVar, C58085t0<Boolean> t0Var, C15601d<? super C100522a> dVar) {
                    super(2, dVar);
                    this.f294526g = f;
                    this.f294527h = mVar;
                    this.f294528i = tVar;
                    this.f294529j = f0Var;
                    this.f294530n = uVar;
                    this.f294531o = t0Var;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
                    C100522a aVar = new C100522a(this.f294526g, this.f294527h, this.f294528i, this.f294529j, this.f294530n, this.f294531o, dVar);
                    aVar.f294525f = obj;
                    SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
                    return aVar;
                }

                public Object invoke(Object obj, Object obj2) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
                    Object invokeSuspend = ((C100522a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1");
                    return invokeSuspend;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: a14.n0} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x00f7  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                    /*
                        r21 = this;
                        r6 = r21
                        java.lang.String r7 = "invokeSuspend"
                        java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$1"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                        xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r0 = r6.f294524e
                        r10 = 1065353216(0x3f800000, float:1.0)
                        r1 = 3
                        r2 = 2
                        r11 = 1
                        if (r0 == 0) goto L_0x0044
                        if (r0 == r11) goto L_0x0038
                        if (r0 == r2) goto L_0x002f
                        if (r0 != r1) goto L_0x0024
                        java.lang.Object r0 = r6.f294525f
                        a14.n0 r0 = (a14.C0000n0) r0
                        kotlin.ResultKt.throwOnFailure(r22)
                        goto L_0x00d5
                    L_0x0024:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                        throw r0
                    L_0x002f:
                        java.lang.Object r0 = r6.f294525f
                        a14.n0 r0 = (a14.C0000n0) r0
                        kotlin.ResultKt.throwOnFailure(r22)
                        r12 = r0
                        goto L_0x009f
                    L_0x0038:
                        java.lang.Object r0 = r6.f294523d
                        a14.z1 r0 = (a14.C53973z1) r0
                        java.lang.Object r3 = r6.f294525f
                        a14.n0 r3 = (a14.C0000n0) r3
                        kotlin.ResultKt.throwOnFailure(r22)
                        goto L_0x008d
                    L_0x0044:
                        kotlin.ResultKt.throwOnFailure(r22)
                        java.lang.Object r0 = r6.f294525f
                        r3 = r0
                        a14.n0 r3 = (a14.C0000n0) r3
                        r4 = 32
                        float r0 = (float) r4
                        float r4 = r6.f294526g
                        r5 = 0
                        float r4 = r4 + r5
                        float r16 = r0 / r4
                        gy3.c0 r15 = new gy3.c0
                        r15.<init>()
                        r15.f170634d = r10
                        r0 = 0
                        r4 = 0
                        ou2.m$f$a$a$b r5 = new ou2.m$f$a$a$b
                        ou2.m r13 = r6.f294527h
                        r18 = 0
                        r19 = 32
                        r12 = r5
                        r17 = r13
                        r13 = r19
                        r12.<init>(r13, r15, r16, r17, r18)
                        r16 = 3
                        r17 = 0
                        r12 = r3
                        r13 = r0
                        r14 = r4
                        r15 = r5
                        a14.z1 r0 = a14.C53895h.m60466d(r12, r13, r14, r15, r16, r17)
                        float r4 = r6.f294526g
                        long r4 = (long) r4
                        r6.f294525f = r3
                        r6.f294523d = r0
                        r6.f294524e = r11
                        java.lang.Object r4 = a14.C53965x0.m60607b(r4, r6)
                        if (r4 != r9) goto L_0x008d
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                        return r9
                    L_0x008d:
                        r6.f294525f = r3
                        r4 = 0
                        r6.f294523d = r4
                        r6.f294524e = r2
                        java.lang.Object r0 = a14.C53873d2.m60391c(r0, r6)
                        if (r0 != r9) goto L_0x009e
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                        return r9
                    L_0x009e:
                        r12 = r3
                    L_0x009f:
                        ou2.m r0 = r6.f294527h
                        ou2.l r0 = r0.mo139955f()
                        if (r0 == 0) goto L_0x00d6
                        os2.t r2 = r6.f294528i
                        r2.getClass()
                        java.lang.String r3 = "getSectionBegin"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.PlayState"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                        float r2 = r2.f176780b
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                        long r2 = (long) r2
                        r4 = 1
                        ou2.m$f$a$a$a r5 = new ou2.m$f$a$a$a
                        ou2.m r13 = r6.f294527h
                        r5.<init>(r13)
                        r6.f294525f = r12
                        r6.f294524e = r1
                        r1 = r2
                        r3 = r4
                        r4 = r5
                        r5 = r21
                        java.lang.Object r0 = r0.mo133979c(r1, r3, r4, r5)
                        if (r0 != r9) goto L_0x00d4
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                        return r9
                    L_0x00d4:
                        r0 = r12
                    L_0x00d5:
                        r12 = r0
                    L_0x00d6:
                        ou2.m r0 = r6.f294527h
                        java.lang.String r1 = "access$getVideoPlayCount$p"
                        java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                        int r3 = r0.f294473t
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                        int r3 = r3 + r11
                        java.lang.String r1 = "access$setVideoPlayCount$p"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                        r0.f294473t = r3
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                        ou2.m r0 = r6.f294527h
                        ou2.l r0 = r0.mo139955f()
                        if (r0 == 0) goto L_0x00fa
                        r0.setFrameLayoutAlpha(r10)
                    L_0x00fa:
                        gy3.f0<a14.z1> r0 = r6.f294529j
                        ou2.m r1 = r6.f294527h
                        os2.u r2 = r6.f294530n
                        d14.t0<java.lang.Boolean> r3 = r6.f294531o
                        a14.z1 r1 = ou2.C100511m.m131547q(r12, r1, r2, r3)
                        r0.f27484d = r1
                        rx3.b0 r0 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100521a.C100522a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* renamed from: ou2.m$f$a$b */
            public static final class C100525b extends C87413o implements C32226l<Throwable, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C100511m f294539d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100525b(C100511m mVar) {
                    super(1);
                    this.f294539d = mVar;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$2");
                    Throwable th = (Throwable) obj;
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$2");
                    SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                    SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                    SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                    SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
                    Log.m105924i("IpInteractScheduleVideoController", "alphaAnimJob end!");
                    C100509l f = this.f294539d.mo139955f();
                    if (f != null) {
                        f.setFrameLayoutAlpha(1.0f);
                    }
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$2");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$2");
                    return b0Var;
                }
            }

            @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {309, 311, 352}, mo125471m = "emit")
            /* renamed from: ou2.m$f$a$c */
            public static final class C100526c extends C66704d {

                /* renamed from: d */
                public Object f294540d;

                /* renamed from: e */
                public Object f294541e;

                /* renamed from: f */
                public int f294542f;

                /* renamed from: g */
                public long f294543g;

                /* renamed from: h */
                public /* synthetic */ Object f294544h;

                /* renamed from: i */
                public final /* synthetic */ C100521a<T> f294545i;

                /* renamed from: j */
                public int f294546j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C100526c(C100521a<? super T> aVar, C15601d<? super C100526c> dVar) {
                    super(dVar);
                    this.f294545i = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$emit$1");
                    this.f294544h = obj;
                    this.f294546j |= Integer.MIN_VALUE;
                    Object a = this.f294545i.mo139989a(0, this);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$emit$1");
                    return a;
                }
            }

            public C100521a(C100511m mVar, C100419u uVar, C8479f0<C53973z1> f0Var, C8479f0<C53973z1> f0Var2, C100418s sVar, C0000n0 n0Var, C58085t0<Boolean> t0Var, C8479f0<C53973z1> f0Var3, C62179t0 t0Var2) {
                this.f294514d = mVar;
                this.f294515e = uVar;
                this.f294516f = f0Var;
                this.f294517g = f0Var2;
                this.f294518h = sVar;
                this.f294519i = n0Var;
                this.f294520j = t0Var;
                this.f294521n = f0Var3;
                this.f294522o = t0Var2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x022e  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x0243  */
            /* JADX WARNING: Removed duplicated region for block: B:60:0x0291  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0296  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x02c8  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x034a  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x035e  */
            /* JADX WARNING: Removed duplicated region for block: B:82:0x0387  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x03ca  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:97:0x047b  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo139989a(int r30, wx3.C15601d<? super rx3.C13598b0> r31) {
                /*
                    r29 = this;
                    r0 = r29
                    r1 = r30
                    r2 = r31
                    java.lang.String r3 = "emit"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r5 = r2 instanceof ou2.C100511m.C100520f.C100521a.C100526c
                    if (r5 == 0) goto L_0x0020
                    r5 = r2
                    ou2.m$f$a$c r5 = (ou2.C100511m.C100520f.C100521a.C100526c) r5
                    int r6 = r5.f294546j
                    r7 = -2147483648(0xffffffff80000000, float:-0.0)
                    r8 = r6 & r7
                    if (r8 == 0) goto L_0x0020
                    int r6 = r6 - r7
                    r5.f294546j = r6
                    goto L_0x0025
                L_0x0020:
                    ou2.m$f$a$c r5 = new ou2.m$f$a$c
                    r5.<init>(r0, r2)
                L_0x0025:
                    r11 = r5
                    java.lang.Object r2 = r11.f294544h
                    xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r6 = r11.f294546j
                    java.lang.String r13 = "access$getTAG$cp"
                    java.lang.String r14 = "getTAG"
                    java.lang.String r15 = "IpInteractScheduleVideoController"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.PlayStateInfo"
                    r10 = 2
                    java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
                    r12 = 1
                    java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                    if (r6 == 0) goto L_0x0091
                    if (r6 == r12) goto L_0x007c
                    if (r6 == r10) goto L_0x0065
                    r1 = 3
                    if (r6 != r1) goto L_0x005a
                    long r5 = r11.f294543g
                    java.lang.Object r1 = r11.f294540d
                    ou2.m$f$a r1 = (ou2.C100511m.C100520f.C100521a) r1
                    kotlin.ResultKt.throwOnFailure(r2)
                    r2 = r1
                    r7 = r4
                    r0 = r8
                    r18 = r13
                    r4 = r14
                    r16 = r15
                    r1 = 3
                    r12 = r5
                    r5 = r3
                    r3 = r9
                    goto L_0x03d3
                L_0x005a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    throw r1
                L_0x0065:
                    r16 = r13
                    long r12 = r11.f294543g
                    int r1 = r11.f294542f
                    java.lang.Object r6 = r11.f294541e
                    os2.t r6 = (os2.C62176t) r6
                    java.lang.Object r10 = r11.f294540d
                    ou2.m$f$a r10 = (ou2.C100511m.C100520f.C100521a) r10
                    kotlin.ResultKt.throwOnFailure(r2)
                    r2 = r10
                    r17 = r14
                    r14 = 2
                    goto L_0x0245
                L_0x007c:
                    r16 = r13
                    long r12 = r11.f294543g
                    int r1 = r11.f294542f
                    java.lang.Object r6 = r11.f294541e
                    os2.t r6 = (os2.C62176t) r6
                    java.lang.Object r10 = r11.f294540d
                    ou2.m$f$a r10 = (ou2.C100511m.C100520f.C100521a) r10
                    kotlin.ResultKt.throwOnFailure(r2)
                    r17 = r14
                    goto L_0x0226
                L_0x0091:
                    r16 = r13
                    kotlin.ResultKt.throwOnFailure(r2)
                    ou2.m$a r2 = ou2.C100511m.f294465w
                    r2.mo139985b()
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r10 = "seekJobFlow called it = "
                    r6.append(r10)
                    r6.append(r1)
                    java.lang.String r6 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r6)
                    ou2.m r6 = r0.f294514d
                    int r6 = ou2.C100511m.m131543m(r6)
                    ou2.m r10 = r0.f294514d
                    jp2.o r10 = r10.mo139957h()
                    if (r10 == 0) goto L_0x00c1
                    int r10 = r10.f290131k
                    goto L_0x00c2
                L_0x00c1:
                    r10 = 0
                L_0x00c2:
                    if (r10 != 0) goto L_0x00c6
                    r10 = 1
                    goto L_0x00c7
                L_0x00c6:
                    r10 = 2
                L_0x00c7:
                    java.lang.String r12 = "getPLAY_EVENT_CANCEL_LIKE"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    java.lang.String r13 = "access$getPLAY_EVENT_CANCEL_LIKE$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r17 = r14
                    r14 = 3
                    if (r1 != r14) goto L_0x00fd
                    os2.u r14 = r0.f294515e
                    os2.t r14 = r14.mo139883b()
                    if (r14 != 0) goto L_0x00fd
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r5 = 11
                    r6 = 1913(0x779, float:2.68E-42)
                    r1.mo175911u(r6, r5)
                    ou2.m r1 = r0.f294514d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139958i()
                    r5 = 2
                    r2.mo139986c(r1, r5, r10)
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                L_0x00fd:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r12 = 3
                    if (r1 != r12) goto L_0x013d
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r12 = 11
                    r13 = 1913(0x779, float:2.68E-42)
                    r1.mo175911u(r13, r12)
                    ou2.m r1 = r0.f294514d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139958i()
                    r12 = 2
                    r2.mo139986c(r1, r12, r10)
                    os2.u r1 = r0.f294515e
                    os2.t r1 = r1.mo139883b()
                    ou2.m r10 = r0.f294514d
                    java.lang.String r12 = "getSTATE_CANCEL_LIKE"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    java.lang.String r13 = "access$getSTATE_CANCEL_LIKE$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r12 = 4
                    ou2.C100511m.m131546p(r10, r12)
                    goto L_0x01d9
                L_0x013d:
                    java.lang.String r12 = "getPLAY_EVENT_COMMENT"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    java.lang.String r13 = "access$getPLAY_EVENT_COMMENT$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r12 = 2
                    if (r1 != r12) goto L_0x017f
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r10 = 9
                    r12 = 1913(0x779, float:2.68E-42)
                    r1.mo175911u(r12, r10)
                    os2.u r1 = r0.f294515e
                    r1.getClass()
                    java.lang.String r10 = "getCommentState"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r7)
                    os2.t r1 = r1.f294186e
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r7)
                    ou2.m r10 = r0.f294514d
                    java.lang.String r12 = "getSTATE_COMMENT"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    java.lang.String r13 = "access$getSTATE_COMMENT$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r12 = 3
                    ou2.C100511m.m131546p(r10, r12)
                    goto L_0x01d9
                L_0x017f:
                    java.lang.String r12 = "getPLAY_EVENT_LIKE"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    java.lang.String r13 = "access$getPLAY_EVENT_LIKE$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r12 = 1
                    if (r1 != r12) goto L_0x01ca
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r13 = 10
                    r14 = 1913(0x779, float:2.68E-42)
                    r1.mo175911u(r14, r13)
                    ou2.m r1 = r0.f294514d
                    com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139958i()
                    r2.mo139986c(r1, r12, r10)
                    os2.u r1 = r0.f294515e
                    r1.getClass()
                    java.lang.String r10 = "getLikeState"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r7)
                    os2.t r1 = r1.f294185d
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r7)
                    ou2.m r10 = r0.f294514d
                    java.lang.String r12 = "getSTATE_LIKE"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r8)
                    java.lang.String r13 = "access$getSTATE_LIKE$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r8)
                    r12 = 2
                    ou2.C100511m.m131546p(r10, r12)
                    goto L_0x01d9
                L_0x01ca:
                    os2.u r1 = r0.f294515e
                    os2.t r1 = r1.mo139884c()
                    ou2.m r10 = r0.f294514d
                    r2.mo139984a()
                    r12 = 1
                    ou2.C100511m.m131546p(r10, r12)
                L_0x01d9:
                    if (r1 != 0) goto L_0x01ff
                    r2.mo139985b()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "playState == null ! currentState = "
                    r1.append(r2)
                    ou2.m r2 = r0.f294514d
                    int r2 = ou2.C100511m.m131543m(r2)
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r1)
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r1
                L_0x01ff:
                    long r12 = java.lang.System.currentTimeMillis()
                    gy3.f0<a14.z1> r2 = r0.f294516f
                    T r2 = r2.f27484d
                    a14.z1 r2 = (a14.C53973z1) r2
                    if (r2 == 0) goto L_0x0220
                    r11.f294540d = r0
                    r11.f294541e = r1
                    r11.f294542f = r6
                    r11.f294543g = r12
                    r10 = 1
                    r11.f294546j = r10
                    java.lang.Object r2 = a14.C53873d2.m60391c(r2, r11)
                    if (r2 != r5) goto L_0x0220
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r5
                L_0x0220:
                    r10 = r0
                    r28 = r6
                    r6 = r1
                    r1 = r28
                L_0x0226:
                    gy3.f0<a14.z1> r2 = r10.f294517g
                    T r2 = r2.f27484d
                    a14.z1 r2 = (a14.C53973z1) r2
                    if (r2 == 0) goto L_0x0243
                    r11.f294540d = r10
                    r11.f294541e = r6
                    r11.f294542f = r1
                    r11.f294543g = r12
                    r14 = 2
                    r11.f294546j = r14
                    java.lang.Object r2 = a14.C53873d2.m60391c(r2, r11)
                    if (r2 != r5) goto L_0x0244
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    return r5
                L_0x0243:
                    r14 = 2
                L_0x0244:
                    r2 = r10
                L_0x0245:
                    r10 = r17
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
                    r14 = r16
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r17 = r10
                    java.lang.String r10 = "cancelCostTime = "
                    r0.append(r10)
                    long r18 = java.lang.System.currentTimeMillis()
                    long r12 = r18 - r12
                    r0.append(r12)
                    r10 = 33
                    r0.append(r10)
                    java.lang.String r0 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                    os2.s r0 = r2.f294518h
                    os2.u r0 = r0.mo139881b()
                    r0.getClass()
                    java.lang.String r10 = "getBreakHideDuration"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r7)
                    float r0 = r0.f294182a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r7)
                    ou2.m r7 = r2.f294514d
                    ou2.l r7 = r7.mo139955f()
                    if (r7 == 0) goto L_0x0296
                    long r12 = r7.getCurrentPosInMills()
                    goto L_0x0298
                L_0x0296:
                    r12 = 0
                L_0x0298:
                    ou2.m r7 = r2.f294514d
                    java.lang.String r10 = "access$getLastSeekState$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r9)
                    int r7 = r7.f294470q
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
                    java.lang.String r10 = "getSTATE_BREAK"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
                    r16 = r15
                    java.lang.String r15 = "access$getSTATE_BREAK$cp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
                    r18 = r14
                    java.lang.String r14 = "com.tencent.mm.plugin.sns.storage.PlayState"
                    r26 = r3
                    java.lang.String r3 = "getSectionBegin"
                    r27 = r4
                    java.lang.String r4 = "access$getSTATE_STOP$cp"
                    r19 = r5
                    java.lang.String r5 = "getSTATE_STOP"
                    if (r7 != 0) goto L_0x034a
                    ou2.m r7 = r2.f294514d
                    int r7 = ou2.C100511m.m131543m(r7)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                    r20 = r11
                    r11 = 1
                    if (r7 == r11) goto L_0x034c
                    r7 = 0
                    int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                    if (r7 <= 0) goto L_0x034c
                    float r7 = (float) r12
                    float r7 = r7 + r0
                    r11 = 50
                    float r11 = (float) r11
                    float r7 = r7 + r11
                    os2.s r11 = r2.f294518h
                    os2.u r11 = r11.mo139881b()
                    os2.t r11 = r11.mo139884c()
                    r11.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r14)
                    float r11 = r11.f176780b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r14)
                    int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                    if (r7 >= 0) goto L_0x034c
                    gy3.f0<a14.z1> r1 = r2.f294517g
                    a14.n0 r10 = r2.f294519i
                    r11 = 0
                    r12 = 0
                    ou2.m$f$a$a r13 = new ou2.m$f$a$a
                    ou2.m r3 = r2.f294514d
                    gy3.f0<a14.z1> r4 = r2.f294516f
                    os2.u r5 = r2.f294515e
                    d14.t0<java.lang.Boolean> r7 = r2.f294520j
                    r25 = 0
                    r18 = r13
                    r19 = r0
                    r20 = r3
                    r21 = r6
                    r22 = r4
                    r23 = r5
                    r24 = r7
                    r18.<init>(r19, r20, r21, r22, r23, r24, r25)
                    r14 = 3
                    r15 = 0
                    a14.z1 r0 = a14.C53895h.m60466d(r10, r11, r12, r13, r14, r15)
                    r1.f27484d = r0
                    gy3.f0<a14.z1> r0 = r2.f294517g
                    T r0 = r0.f27484d
                    a14.z1 r0 = (a14.C53973z1) r0
                    if (r0 == 0) goto L_0x0340
                    ou2.m$f$a$b r1 = new ou2.m$f$a$b
                    ou2.m r3 = r2.f294514d
                    r1.<init>(r3)
                    r0.mo74515E(r1)
                L_0x0340:
                    r3 = r9
                    r4 = r16
                    r5 = r26
                    r7 = r27
                    r1 = 3
                    goto L_0x0425
                L_0x034a:
                    r20 = r11
                L_0x034c:
                    long r12 = java.lang.System.currentTimeMillis()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
                    if (r1 != 0) goto L_0x037f
                    ou2.m r0 = r2.f294514d
                    int r0 = ou2.C100511m.m131543m(r0)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                    r1 = 1
                    if (r0 == r1) goto L_0x0374
                    goto L_0x037f
                L_0x0374:
                    r0 = r8
                    r3 = r9
                    r4 = r17
                    r5 = r26
                    r7 = r27
                    r1 = 3
                    goto L_0x03eb
                L_0x037f:
                    ou2.m r0 = r2.f294514d
                    ou2.l r0 = r0.mo139955f()
                    if (r0 == 0) goto L_0x03ca
                    r6.getClass()
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r14)
                    float r1 = r6.f176780b
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r14)
                    long r3 = (long) r1
                    r5 = r20
                    r5.f294540d = r2
                    r1 = 0
                    r5.f294541e = r1
                    r5.f294543g = r12
                    r1 = 3
                    r5.f294546j = r1
                    java.lang.String r14 = "seek$default"
                    java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame$DefaultImpls"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
                    r10 = 0
                    r11 = 0
                    r6 = r0
                    r0 = r8
                    r7 = r3
                    r3 = r9
                    r9 = r10
                    r4 = r17
                    r10 = r11
                    r11 = r5
                    java.lang.Object r5 = r6.mo133979c(r7, r9, r10, r11)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
                    r6 = r19
                    if (r5 != r6) goto L_0x03c5
                    r5 = r26
                    r7 = r27
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
                    return r6
                L_0x03c5:
                    r5 = r26
                    r7 = r27
                    goto L_0x03d3
                L_0x03ca:
                    r0 = r8
                    r3 = r9
                    r4 = r17
                    r5 = r26
                    r7 = r27
                    r1 = 3
                L_0x03d3:
                    ou2.m r6 = r2.f294514d
                    java.lang.String r8 = "access$getVideoPlayCount$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
                    int r9 = r6.f294473t
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
                    r8 = 1
                    int r9 = r9 + r8
                    java.lang.String r8 = "access$setVideoPlayCount$p"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
                    r6.f294473t = r9
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
                L_0x03eb:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r0)
                    r6 = r18
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r4 = "seek cost "
                    r0.append(r4)
                    long r8 = java.lang.System.currentTimeMillis()
                    long r8 = r8 - r12
                    r0.append(r8)
                    java.lang.String r0 = r0.toString()
                    r4 = r16
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                    gy3.f0<a14.z1> r0 = r2.f294516f
                    a14.n0 r6 = r2.f294519i
                    ou2.m r8 = r2.f294514d
                    os2.u r9 = r2.f294515e
                    d14.t0<java.lang.Boolean> r10 = r2.f294520j
                    a14.z1 r6 = ou2.C100511m.m131547q(r6, r8, r9, r10)
                    r0.f27484d = r6
                L_0x0425:
                    a14.n0 r8 = r2.f294519i
                    ou2.m r10 = r2.f294514d
                    gy3.f0<a14.z1> r0 = r2.f294521n
                    os2.u r6 = r2.f294515e
                    os2.t0 r11 = r2.f294522o
                    java.lang.String r2 = "access$startProcessCommandFlow$startWordingPlayAnim"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                    java.lang.String r15 = "startProcessCommandFlow$startWordingPlayAnim"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r3)
                    os2.t r12 = ou2.C100511m.m131548r(r10, r6)
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r9 = "startWordingPlayAnim() called "
                    r6.append(r9)
                    int r9 = r10.f294470q
                    r6.append(r9)
                    r9 = 32
                    r6.append(r9)
                    int r9 = r10.f294469p
                    r6.append(r9)
                    java.lang.String r6 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
                    gy3.c0 r13 = new gy3.c0
                    r13.<init>()
                    r4 = 1148846080(0x447a0000, float:1000.0)
                    r13.f170634d = r4
                    int r4 = r10.f294470q
                    int r6 = r10.f294469p
                    if (r4 != r6) goto L_0x0473
                    if (r6 == r1) goto L_0x0473
                    r1 = 2
                    if (r6 != r1) goto L_0x0494
                L_0x0473:
                    r10.f294470q = r6
                    T r1 = r0.f27484d
                    a14.z1 r1 = (a14.C53973z1) r1
                    if (r1 == 0) goto L_0x0480
                    r4 = 0
                    r6 = 1
                    a14.C53973z1.C53974a.m60623a(r1, r4, r6, r4)
                L_0x0480:
                    r1 = 0
                    r4 = 0
                    ou2.o r6 = new ou2.o
                    r14 = 0
                    r9 = r6
                    r9.<init>(r10, r11, r12, r13, r14)
                    r12 = 3
                    r13 = 0
                    r9 = r1
                    r10 = r4
                    r11 = r6
                    a14.z1 r1 = a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
                    r0.f27484d = r1
                L_0x0494:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r3)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100521a.mo139989a(int, wx3.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5");
                Object a = mo139989a(((Number) obj).intValue(), dVar);
                SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5");
                return a;
            }
        }

        /* renamed from: ou2.m$f$b */
        public static final class C100527b implements C45252f<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f294547d;

            /* renamed from: ou2.m$f$b$a */
            public static final class C100528a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f294548d;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ou2.m$f$b$a$a */
                public static final class C100529a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f294549d;

                    /* renamed from: e */
                    public int f294550e;

                    /* renamed from: f */
                    public final /* synthetic */ C100528a f294551f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100529a(C100528a aVar, C15601d dVar) {
                        super(dVar);
                        this.f294551f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
                        this.f294549d = obj;
                        this.f294550e |= Integer.MIN_VALUE;
                        Object emit = this.f294551f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
                        return emit;
                    }
                }

                public C100528a(C45253g gVar) {
                    this.f294548d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r9, wx3.C15601d r10) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r10 instanceof ou2.C100511m.C100520f.C100527b.C100528a.C100529a
                        if (r2 == 0) goto L_0x001a
                        r2 = r10
                        ou2.m$f$b$a$a r2 = (ou2.C100511m.C100520f.C100527b.C100528a.C100529a) r2
                        int r3 = r2.f294550e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f294550e = r3
                        goto L_0x001f
                    L_0x001a:
                        ou2.m$f$b$a$a r2 = new ou2.m$f$b$a$a
                        r2.<init>(r8, r10)
                    L_0x001f:
                        java.lang.Object r10 = r2.f294549d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f294550e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L_0x0069
                    L_0x002e:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r9
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r10)
                        d14.g r10 = r8.f294548d
                        java.lang.Boolean r9 = (java.lang.Boolean) r9
                        r9.booleanValue()
                        java.lang.String r9 = "getPLAY_EVENT_END_TO_STOP"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                        java.lang.String r6 = "access$getPLAY_EVENT_END_TO_STOP$cp"
                        java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                        r9 = 4
                        java.lang.Integer r4 = new java.lang.Integer
                        r4.<init>(r9)
                        r2.f294550e = r5
                        java.lang.Object r9 = r10.emit(r4, r2)
                        if (r9 != r3) goto L_0x0069
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0069:
                        rx3.b0 r9 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100527b.C100528a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C100527b(C45252f fVar) {
                this.f294547d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1");
                Object a = this.f294547d.mo31880a(new C100528a(gVar), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1");
                return b0Var;
            }
        }

        /* renamed from: ou2.m$f$c */
        public static final class C100530c implements C45252f<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f294552d;

            /* renamed from: ou2.m$f$c$a */
            public static final class C100531a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f294553d;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ou2.m$f$c$a$a */
                public static final class C100532a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f294554d;

                    /* renamed from: e */
                    public int f294555e;

                    /* renamed from: f */
                    public final /* synthetic */ C100531a f294556f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100532a(C100531a aVar, C15601d dVar) {
                        super(dVar);
                        this.f294556f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2$1");
                        this.f294554d = obj;
                        this.f294555e |= Integer.MIN_VALUE;
                        Object emit = this.f294556f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2$1");
                        return emit;
                    }
                }

                public C100531a(C45253g gVar) {
                    this.f294553d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r9, wx3.C15601d r10) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r10 instanceof ou2.C100511m.C100520f.C100530c.C100531a.C100532a
                        if (r2 == 0) goto L_0x001a
                        r2 = r10
                        ou2.m$f$c$a$a r2 = (ou2.C100511m.C100520f.C100530c.C100531a.C100532a) r2
                        int r3 = r2.f294555e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f294555e = r3
                        goto L_0x001f
                    L_0x001a:
                        ou2.m$f$c$a$a r2 = new ou2.m$f$c$a$a
                        r2.<init>(r8, r10)
                    L_0x001f:
                        java.lang.Object r10 = r2.f294554d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f294555e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L_0x0066
                    L_0x002e:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r9
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r10)
                        d14.g r10 = r8.f294553d
                        com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
                        java.lang.String r9 = "getPLAY_EVENT_CANCEL_LIKE"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                        java.lang.String r6 = "access$getPLAY_EVENT_CANCEL_LIKE$cp"
                        java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                        java.lang.Integer r9 = new java.lang.Integer
                        r4 = 3
                        r9.<init>(r4)
                        r2.f294555e = r5
                        java.lang.Object r9 = r10.emit(r9, r2)
                        if (r9 != r3) goto L_0x0066
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0066:
                        rx3.b0 r9 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100530c.C100531a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C100530c(C45252f fVar) {
                this.f294552d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2");
                Object a = this.f294552d.mo31880a(new C100531a(gVar), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$2");
                return b0Var;
            }
        }

        /* renamed from: ou2.m$f$d */
        public static final class C100533d implements C45252f<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f294557d;

            /* renamed from: ou2.m$f$d$a */
            public static final class C100534a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f294558d;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3$2", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ou2.m$f$d$a$a */
                public static final class C100535a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f294559d;

                    /* renamed from: e */
                    public int f294560e;

                    /* renamed from: f */
                    public final /* synthetic */ C100534a f294561f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100535a(C100534a aVar, C15601d dVar) {
                        super(dVar);
                        this.f294561f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3$2$1");
                        this.f294559d = obj;
                        this.f294560e |= Integer.MIN_VALUE;
                        Object emit = this.f294561f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3$2$1");
                        return emit;
                    }
                }

                public C100534a(C45253g gVar) {
                    this.f294558d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r9, wx3.C15601d r10) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r10 instanceof ou2.C100511m.C100520f.C100533d.C100534a.C100535a
                        if (r2 == 0) goto L_0x001a
                        r2 = r10
                        ou2.m$f$d$a$a r2 = (ou2.C100511m.C100520f.C100533d.C100534a.C100535a) r2
                        int r3 = r2.f294560e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f294560e = r3
                        goto L_0x001f
                    L_0x001a:
                        ou2.m$f$d$a$a r2 = new ou2.m$f$d$a$a
                        r2.<init>(r8, r10)
                    L_0x001f:
                        java.lang.Object r10 = r2.f294559d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f294560e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L_0x0065
                    L_0x002e:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r9
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r10)
                        d14.g r10 = r8.f294558d
                        com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
                        java.lang.String r9 = "getPLAY_EVENT_LIKE"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                        java.lang.String r6 = "access$getPLAY_EVENT_LIKE$cp"
                        java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                        java.lang.Integer r9 = new java.lang.Integer
                        r9.<init>(r5)
                        r2.f294560e = r5
                        java.lang.Object r9 = r10.emit(r9, r2)
                        if (r9 != r3) goto L_0x0065
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0065:
                        rx3.b0 r9 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100533d.C100534a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C100533d(C45252f fVar) {
                this.f294557d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3");
                Object a = this.f294557d.mo31880a(new C100534a(gVar), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3");
                return b0Var;
            }
        }

        /* renamed from: ou2.m$f$e */
        public static final class C100536e implements C45252f<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C45252f f294562d;

            /* renamed from: ou2.m$f$e$a */
            public static final class C100537a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C45253g f294563d;

                @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4$2", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {224}, mo125471m = "emit")
                /* renamed from: ou2.m$f$e$a$a */
                public static final class C100538a extends C66704d {

                    /* renamed from: d */
                    public /* synthetic */ Object f294564d;

                    /* renamed from: e */
                    public int f294565e;

                    /* renamed from: f */
                    public final /* synthetic */ C100537a f294566f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C100538a(C100537a aVar, C15601d dVar) {
                        super(dVar);
                        this.f294566f = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4$2$1");
                        this.f294564d = obj;
                        this.f294565e |= Integer.MIN_VALUE;
                        Object emit = this.f294566f.emit((Object) null, this);
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4$2$1");
                        return emit;
                    }
                }

                public C100537a(C45253g gVar) {
                    this.f294563d = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r9, wx3.C15601d r10) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "emit"
                        java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4$2"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                        boolean r2 = r10 instanceof ou2.C100511m.C100520f.C100536e.C100537a.C100538a
                        if (r2 == 0) goto L_0x001a
                        r2 = r10
                        ou2.m$f$e$a$a r2 = (ou2.C100511m.C100520f.C100536e.C100537a.C100538a) r2
                        int r3 = r2.f294565e
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L_0x001a
                        int r3 = r3 - r4
                        r2.f294565e = r3
                        goto L_0x001f
                    L_0x001a:
                        ou2.m$f$e$a$a r2 = new ou2.m$f$e$a$a
                        r2.<init>(r8, r10)
                    L_0x001f:
                        java.lang.Object r10 = r2.f294564d
                        xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                        int r4 = r2.f294565e
                        r5 = 1
                        if (r4 == 0) goto L_0x0039
                        if (r4 != r5) goto L_0x002e
                        kotlin.ResultKt.throwOnFailure(r10)
                        goto L_0x0066
                    L_0x002e:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        throw r9
                    L_0x0039:
                        kotlin.ResultKt.throwOnFailure(r10)
                        d14.g r10 = r8.f294563d
                        com.tencent.mm.plugin.sns.storage.SnsInfo r9 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r9
                        java.lang.String r9 = "getPLAY_EVENT_COMMENT"
                        java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
                        java.lang.String r6 = "access$getPLAY_EVENT_COMMENT$cp"
                        java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
                        java.lang.Integer r9 = new java.lang.Integer
                        r4 = 2
                        r9.<init>(r4)
                        r2.f294565e = r5
                        java.lang.Object r9 = r10.emit(r9, r2)
                        if (r9 != r3) goto L_0x0066
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r3
                    L_0x0066:
                        rx3.b0 r9 = rx3.C13598b0.f38549a
                        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.C100520f.C100536e.C100537a.emit(java.lang.Object, wx3.d):java.lang.Object");
                }
            }

            public C100536e(C45252f fVar) {
                this.f294562d = fVar;
            }

            /* renamed from: a */
            public Object mo31880a(C45253g gVar, C15601d dVar) {
                SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4");
                Object a = this.f294562d.mo31880a(new C100537a(gVar), dVar);
                if (a == C15911a.COROUTINE_SUSPENDED) {
                    SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4");
                    return a;
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100520f(C58085t0<Boolean> t0Var, C100511m mVar, C100419u uVar, C8479f0<C53973z1> f0Var, C100418s sVar, C8479f0<C53973z1> f0Var2, C62179t0 t0Var2, C15601d<? super C100520f> dVar) {
            super(2, dVar);
            this.f294507f = t0Var;
            this.f294508g = mVar;
            this.f294509h = uVar;
            this.f294510i = f0Var;
            this.f294511j = sVar;
            this.f294512n = f0Var2;
            this.f294513o = t0Var2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            C100520f fVar = new C100520f(this.f294507f, this.f294508g, this.f294509h, this.f294510i, this.f294511j, this.f294512n, this.f294513o, dVar);
            fVar.f294506e = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            Object invokeSuspend = ((C100520f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f294505d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var = (C0000n0) this.f294506e;
                C8479f0 f0Var = new C8479f0();
                C45252f[] fVarArr = new C45252f[4];
                fVarArr[0] = new C100527b(this.f294507f);
                C99567r rVar = C99567r.f291863a;
                SnsInfo i2 = this.f294508g.mo139958i();
                String str = null;
                String snsId = i2 != null ? i2.getSnsId() : null;
                String str2 = "";
                if (snsId == null) {
                    snsId = str2;
                }
                SnsMethodCalculate.markStartTimeMs("getAdUnlikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                C99564q qVar = new C99564q(C99567r.f291866d, snsId);
                SnsMethodCalculate.markEndTimeMs("getAdUnlikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                fVarArr[1] = new C100530c(qVar);
                SnsInfo i3 = this.f294508g.mo139958i();
                String snsId2 = i3 != null ? i3.getSnsId() : null;
                if (snsId2 == null) {
                    snsId2 = str2;
                }
                SnsMethodCalculate.markStartTimeMs("getAdLikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                C99561p pVar = new C99561p(C99567r.f291865c, snsId2);
                SnsMethodCalculate.markEndTimeMs("getAdLikeFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                fVarArr[2] = new C100533d(pVar);
                SnsInfo i4 = this.f294508g.mo139958i();
                if (i4 != null) {
                    str = i4.getSnsId();
                }
                if (str != null) {
                    str2 = str;
                }
                SnsMethodCalculate.markStartTimeMs("getAdCommentFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                C99558o oVar = new C99558o(C99567r.f291864b, str2);
                SnsMethodCalculate.markEndTimeMs("getAdCommentFlow", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                fVarArr[3] = new C100536e(oVar);
                int i5 = C58031e0.f165996a;
                C58496n nVar = new C58496n(C110823p.m151005u(fVarArr), C66217g.f190253d, -2, C54624g.SUSPEND);
                C100521a aVar2 = new C100521a(this.f294508g, this.f294509h, this.f294510i, f0Var, this.f294511j, n0Var, this.f294507f, this.f294512n, this.f294513o);
                this.f294505d = 1;
                if (nVar.mo31880a(aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1");
            return b0Var;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C100511m(ou2.C100509l r16, ou2.C100508k r17, ou2.C100509l r18, a14.C0000n0 r19, d14.C58085t0<java.lang.Boolean> r20, d14.C58085t0<ou2.C100464b.C100466b> r21, com.tencent.p014mm.plugin.sns.storage.SnsInfo r22, fy3.C32228q<? super os2.C100397a, ? super com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo, ? super com.tencent.p014mm.plugin.sns.storage.SnsInfo, rx3.C13598b0> r23, os2.C100413l r24, te3.C101804kv2 r25, jp2.C98963o r26, nq2.C100151a.C100155d r27, java.lang.Object r28) {
        /*
            r15 = this;
            r13 = r15
            r14 = r28
            java.lang.String r0 = "restartPlayFlow"
            r5 = r20
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "playCommandFlow"
            r6 = r21
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "setClickArea"
            r8 = r23
            gy3.C87412m.m108594g(r8, r0)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r7 = r22
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r27
            r13.f294466m = r0
            r0 = 0
            r13.f294469p = r0
            r13.f294470q = r0
            boolean r1 = r14 instanceof ou2.C100511m.C100513b
            r2 = 0
            if (r1 == 0) goto L_0x0043
            r3 = r14
            ou2.m$b r3 = (ou2.C100511m.C100513b) r3
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo"
            if (r3 == 0) goto L_0x0053
            java.lang.String r5 = "getVideoPlayTotalTimeMs"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            long r6 = r3.f294476a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            goto L_0x0055
        L_0x0053:
            r6 = 0
        L_0x0055:
            r13.f294472s = r6
            if (r1 == 0) goto L_0x005c
            r2 = r14
            ou2.m$b r2 = (ou2.C100511m.C100513b) r2
        L_0x005c:
            if (r2 == 0) goto L_0x0069
            java.lang.String r0 = "getVideoPlayCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            int r1 = r2.f294477b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r0 = r1
        L_0x0069:
            r13.f294473t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.<init>(ou2.l, ou2.k, ou2.l, a14.n0, d14.t0, d14.t0, com.tencent.mm.plugin.sns.storage.SnsInfo, fy3.q, os2.l, te3.kv2, jp2.o, nq2.a$d, java.lang.Object):void");
    }

    /* renamed from: m */
    public static final /* synthetic */ int m131543m(C100511m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$getCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        int i = mVar.f294469p;
        SnsMethodCalculate.markEndTimeMs("access$getCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return i;
    }

    /* renamed from: n */
    public static final /* synthetic */ ImageView m131544n(C100511m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$getTagIconView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        ImageView imageView = mVar.f294474u;
        SnsMethodCalculate.markEndTimeMs("access$getTagIconView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return imageView;
    }

    /* renamed from: o */
    public static final /* synthetic */ AdAppCompatTextView m131545o(C100511m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$getTagTextView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        AdAppCompatTextView adAppCompatTextView = mVar.f294475v;
        SnsMethodCalculate.markEndTimeMs("access$getTagTextView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return adAppCompatTextView;
    }

    /* renamed from: p */
    public static final /* synthetic */ void m131546p(C100511m mVar, int i) {
        SnsMethodCalculate.markStartTimeMs("access$setCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        mVar.f294469p = i;
        SnsMethodCalculate.markEndTimeMs("access$setCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    /* renamed from: q */
    public static final C53973z1 m131547q(C0000n0 n0Var, C100511m mVar, C100419u uVar, C58085t0 t0Var) {
        SnsMethodCalculate.markStartTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        C100511m mVar2 = mVar;
        C53973z1 d = C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C100539n(m131548r(mVar, uVar), mVar2, mVar2.f294469p, t0Var, (C15601d<? super C100539n>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        SnsMethodCalculate.markEndTimeMs("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return d;
    }

    /* renamed from: r */
    public static final C62176t m131548r(C100511m mVar, C100419u uVar) {
        C62176t tVar;
        C62176t tVar2;
        SnsMethodCalculate.markStartTimeMs("startProcessCommandFlow$getPlayState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        int i = mVar.f294469p;
        if (i == 4) {
            tVar = uVar.mo139883b();
        } else {
            if (i == 3) {
                uVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                tVar2 = uVar.f294186e;
                SnsMethodCalculate.markEndTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            } else if (i == 2) {
                uVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                tVar2 = uVar.f294185d;
                SnsMethodCalculate.markEndTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            } else {
                tVar = i == 0 ? uVar.mo139882a() : uVar.mo139884c();
            }
            tVar = tVar2;
        }
        SnsMethodCalculate.markEndTimeMs("startProcessCommandFlow$getPlayState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return tVar;
    }

    /* renamed from: a */
    public void mo139951a(C100413l lVar) {
        SnsMethodCalculate.markStartTimeMs("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        Log.m105918d("IpInteractScheduleVideoController", "videoPlayTotalTimeMs " + this.f294472s + "     lastPlayTime " + this.f294467n + "    cur " + SystemClock.elapsedRealtime() + "  " + this.f294468o);
        if (this.f294467n > 0) {
            this.f294472s += SystemClock.elapsedRealtime() - this.f294467n;
        }
        if (this.f294468o) {
            this.f294467n = SystemClock.elapsedRealtime();
        } else {
            this.f294467n = 0;
        }
        SnsMethodCalculate.markEndTimeMs("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    /* renamed from: j */
    public void mo139959j() {
        View view;
        SnsMethodCalculate.markStartTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        ImageView imageView = this.f294474u;
        if (imageView != null) {
            imageView.setImageDrawable((Drawable) null);
            C101611g<String, Bitmap> gVar = C63489a.f180085a;
            SnsMethodCalculate.markStartTimeMs("resetLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            imageView.setTag(C0966R.C0970id.joh, "");
            SnsMethodCalculate.markEndTimeMs("resetLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
        AdAppCompatTextView adAppCompatTextView = this.f294475v;
        if (adAppCompatTextView != null) {
            adAppCompatTextView.setText("");
        }
        C100151a.C100155d dVar = this.f294466m;
        if (!(dVar == null || (view = dVar.f293353I) == null)) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        C100513b bVar = new C100513b(this.f294472s, this.f294473t);
        SnsMethodCalculate.markStartTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        this.f294300l = bVar;
        SnsMethodCalculate.markEndTimeMs("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        SnsMethodCalculate.markEndTimeMs("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    /* renamed from: k */
    public void mo139960k(SnsInfo snsInfo) {
        float f;
        SnsMethodCalculate.markStartTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        try {
            C95301a aVar = snsInfo.getAdXml().adBreakFrameInfo;
            if (aVar != null) {
                C100397a b = aVar.mo132013b();
                if (b != null) {
                    C95301a aVar2 = snsInfo.getAdXml().adBreakFrameInfo;
                    if (aVar2 != null) {
                        C100413l a = aVar2.mo132012a();
                        if (a != null) {
                            SnsMethodCalculate.markStartTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                            C101804kv2 kv22 = this.f294298j;
                            SnsMethodCalculate.markEndTimeMs("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
                            if (kv22 == null) {
                                SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                                return;
                            }
                            mo139951a(a);
                            a.mo139877b().mo139880a();
                            float f2 = kv22.f298684R;
                            long j = 0;
                            if (f2 > 0.0f) {
                                f = f2 * 1000.0f;
                            } else {
                                C100509l f3 = mo139955f();
                                f = (float) (f3 != null ? f3.getDurationMs() : 0);
                            }
                            C100418s b2 = a.mo139877b();
                            b2.getClass();
                            SnsMethodCalculate.markStartTimeMs("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
                            float f4 = b2.f294180d;
                            SnsMethodCalculate.markEndTimeMs("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
                            if (f4 > 0.0f) {
                                Math.min(f4, f);
                            }
                            C98963o h = mo139957h();
                            int i = 0;
                            int i2 = (h != null ? h.f290131k : 0) == 0 ? 1 : 2;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("snsid", C102236a0.m134765q0(snsInfo.field_snsId));
                            jSONObject.put("uxinfo", snsInfo.getUxinfo());
                            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
                            String str = snsInfo.getAdXml().adExtInfo;
                            if (str == null) {
                                str = "";
                            }
                            jSONObject.put("adExtInfo", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject.put("extInfo", jSONObject2);
                            jSONObject2.put("videoDuration", Float.valueOf(f));
                            C100413l d = mo139953d();
                            if (d != null) {
                                i = d.mo139878c();
                            }
                            jSONObject2.put("videoCompositeType", i);
                            SnsMethodCalculate.markStartTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                            float f5 = b.f294079e;
                            SnsMethodCalculate.markEndTimeMs("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                            jSONObject2.put("clickAreaStartTime", Float.valueOf(f5));
                            long j2 = this.f294472s;
                            if (j2 >= 0) {
                                j = j2;
                            }
                            jSONObject2.put("videoPlayTotalTime", j);
                            jSONObject2.put("videoSeekCount", this.f294473t + 1);
                            String jSONObject3 = jSONObject.toString();
                            C87412m.m108593f(jSONObject3, "obj.toString()");
                            Log.m105918d("IpInteractScheduleVideoController", "sns_ad_ip_interact_report:" + jSONObject3);
                            C102260r.m134858a("sns_ad_ip_interact_report", jSONObject3);
                            SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                            return;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        } catch (Exception e) {
            Log.m105920e("IpInteractScheduleVideoController", "sns_ad_ip_interact_report, exp=" + e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = r0.getAdXml();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139961l() {
        /*
            r29 = this;
            r9 = r29
            java.lang.String r10 = "startProcessCommandFlow"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r29.mo139958i()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            if (r0 == 0) goto L_0x001a
            com.tencent.mm.plugin.sns.storage.a r0 = r0.adBreakFrameInfo
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            java.lang.String r2 = "IpInteractScheduleVideoController"
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "adBreakFrameInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x0028:
            os2.l r3 = r0.mo132012a()
            if (r3 == 0) goto L_0x0034
            os2.s r3 = r3.mo139877b()
            r5 = r3
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            os2.a r12 = r0.mo132013b()
            os2.a r0 = r0.mo132013b()
            if (r0 == 0) goto L_0x004d
            java.lang.String r3 = "getClickActionInfo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r0.f294081g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r13 = r0
            goto L_0x004e
        L_0x004d:
            r13 = r1
        L_0x004e:
            if (r5 == 0) goto L_0x0158
            os2.u r14 = r5.mo139881b()
            if (r14 != 0) goto L_0x0058
            goto L_0x0158
        L_0x0058:
            nq2.a$d r0 = r9.f294466m
            if (r0 == 0) goto L_0x006a
            android.view.View r0 = r0.f293353I
            if (r0 == 0) goto L_0x006a
            r2 = 2131313837(0x7f0944ad, float:1.8246082E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto L_0x006b
        L_0x006a:
            r0 = r1
        L_0x006b:
            r9.f294474u = r0
            nq2.a$d r0 = r9.f294466m
            if (r0 == 0) goto L_0x007f
            android.view.View r0 = r0.f293353I
            if (r0 == 0) goto L_0x007f
            r2 = 2131313839(0x7f0944af, float:1.8246086E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r0 = (com.tencent.p014mm.plugin.sns.p104ad.widget.appcompat.AdAppCompatTextView) r0
            goto L_0x0080
        L_0x007f:
            r0 = r1
        L_0x0080:
            r9.f294475v = r0
            nq2.a$d r0 = r9.f294466m
            if (r0 == 0) goto L_0x0092
            android.view.View r0 = r0.f293353I
            if (r0 == 0) goto L_0x0092
            ou2.m$c r2 = new ou2.m$c
            r2.<init>(r9)
            r0.setOnClickListener(r2)
        L_0x0092:
            r0 = 7
            r2 = 0
            d14.t0 r15 = d14.C58017a1.m67173b(r2, r2, r1, r0, r1)
            gy3.f0 r16 = new gy3.f0
            r16.<init>()
            os2.t r0 = r14.mo139882a()
            java.util.List r0 = r0.mo87231a()
            ky3.c$a r3 = ky3.C88334c.f255322d
            java.lang.Object r0 = sx3.C110818d0.m150935g0(r0, r3)
            r7 = r0
            os2.t0 r7 = (os2.C62179t0) r7
            java.lang.String r0 = ""
            if (r7 == 0) goto L_0x00b8
            java.lang.String r3 = r7.mo87234a()
            if (r3 != 0) goto L_0x00b9
        L_0x00b8:
            r3 = r0
        L_0x00b9:
            android.widget.ImageView r4 = r9.f294474u
            rq2.C63489a.m74826a(r3, r4)
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r3 = r9.f294475v
            if (r3 == 0) goto L_0x00cf
            if (r7 == 0) goto L_0x00cc
            java.lang.String r4 = r7.mo87235b()
            if (r4 != 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r0 = r4
        L_0x00cc:
            r3.setText(r0)
        L_0x00cf:
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r0 = r9.f294475v
            if (r0 == 0) goto L_0x00f2
            r3 = 14
            android.content.Context r4 = r0.getContext()
            java.lang.String r6 = "dp2Pix"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            float r4 = kg3.C76577a.m92156g(r4)
            float r3 = (float) r3
            float r4 = r4 * r3
            int r3 = java.lang.Math.round(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            r4 = 1
            androidx.core.widget.C103733h.m138105b(r0, r4, r3, r4, r2)
        L_0x00f2:
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            a14.n0 r17 = r29.mo139954e()
            if (r17 == 0) goto L_0x010f
            r18 = 0
            r19 = 0
            ou2.m$e r0 = new ou2.m$e
            r0.<init>(r9, r14, r1)
            r21 = 3
            r22 = 0
            r20 = r0
            a14.C53895h.m60466d(r17, r18, r19, r20, r21, r22)
        L_0x010f:
            a14.n0 r23 = r29.mo139954e()
            if (r23 == 0) goto L_0x012e
            r24 = 0
            r25 = 0
            ou2.m$f r26 = new ou2.m$f
            r8 = 0
            r0 = r26
            r1 = r15
            r2 = r29
            r3 = r14
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r27 = 3
            r28 = 0
            a14.C53895h.m60466d(r23, r24, r25, r26, r27, r28)
        L_0x012e:
            a14.n0 r8 = r29.mo139954e()
            if (r8 == 0) goto L_0x0154
            r17 = 0
            r18 = 0
            ou2.m$d r19 = new ou2.m$d
            r7 = 0
            r0 = r19
            r1 = r29
            r2 = r12
            r3 = r13
            r4 = r16
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r4 = 3
            r5 = 0
            r0 = r8
            r1 = r17
            r2 = r18
            r3 = r19
            a14.C53895h.m60466d(r0, r1, r2, r3, r4, r5)
        L_0x0154:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x0158:
            java.lang.String r0 = "playStateInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100511m.mo139961l():void");
    }
}

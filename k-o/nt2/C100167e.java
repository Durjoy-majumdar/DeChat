package nt2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import br2.C54550e;
import co2.C92445n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.countdown.PromotionBarLayout;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94764b;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.FinderLivingAnimWrapper;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.C96319y2;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCardAdTagListView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import cq2.C97354d;
import jp2.C98957g;
import jp2.C98963o;
import jq2.C60893t;
import kg3.C76577a;
import os2.C100417r0;
import rq2.C101432s;
import up2.C102064e;
import vr2.C102260r;

/* renamed from: nt2.e */
public class C100167e extends C100165c implements C98957g {

    /* renamed from: A */
    public View f293420A;

    /* renamed from: B */
    public View f293421B;

    /* renamed from: C */
    public PromotionBarLayout f293422C;

    /* renamed from: D */
    public C98963o f293423D;

    /* renamed from: E */
    public int f293424E;

    /* renamed from: F */
    public C96177r2 f293425F;

    /* renamed from: G */
    public C96319y2 f293426G;

    /* renamed from: H */
    public LivingDescBarLayout f293427H;

    /* renamed from: I */
    public ViewGroup f293428I;

    /* renamed from: J */
    public C94764b f293429J;

    /* renamed from: K */
    public LivingDescBarLayout f293430K;

    /* renamed from: L */
    public C60893t f293431L;

    /* renamed from: M */
    public ViewStub f293432M;

    /* renamed from: N */
    public FinderLivingAnimWrapper f293433N;

    /* renamed from: P */
    public ViewStub f293434P;

    /* renamed from: Q */
    public AdLivingStreamContainer f293435Q;

    /* renamed from: R */
    public C54550e f293436R;

    /* renamed from: S */
    public ViewGroup f293437S;

    /* renamed from: T */
    public SnsTimelineVideoView f293438T;

    /* renamed from: U */
    public boolean f293439U;

    /* renamed from: V */
    public String f293440V;

    /* renamed from: W */
    public Handler f293441W = new Handler(Looper.getMainLooper());

    /* renamed from: X */
    public AdViewComponent<SnsInfo> f293442X;

    /* renamed from: Y */
    public C102064e.C102069c f293443Y = new C100170c();

    /* renamed from: Z */
    public boolean f293444Z = false;

    /* renamed from: o */
    public Context f293445o;

    /* renamed from: p */
    public TextView f293446p;

    /* renamed from: q */
    public TextView f293447q;

    /* renamed from: r */
    public View f293448r;

    /* renamed from: s */
    public Button f293449s;

    /* renamed from: t */
    public Button f293450t;

    /* renamed from: u */
    public View f293451u;

    /* renamed from: v */
    public ImageView f293452v;

    /* renamed from: w */
    public MaskImageView f293453w;

    /* renamed from: x */
    public SnsCardAdTagListView f293454x;

    /* renamed from: y */
    public View f293455y;

    /* renamed from: z */
    public View f293456z;

    /* renamed from: nt2.e$a */
    public class C100168a implements SnsTimelineVideoView.C96253d {
        public C100168a() {
        }

        /* renamed from: O3 */
        public void mo133426O3(String str) {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$2");
            Log.m105928w("MicroMsg.CardAdDetailItemView", "timelineVideoView setUICallback onDestroy, the tlId is " + str + ", the timelineId is " + C100167e.this.f293411d.f283893Id);
            if (!Util.isNullOrNil(str) && str.equals(C100167e.this.f293411d.f283893Id)) {
                C100167e eVar = C100167e.this;
                SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                eVar.f293444Z = false;
                SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$2");
        }
    }

    /* renamed from: nt2.e$b */
    public class C100169b implements Runnable {
        public C100169b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
            if (C100167e.this.f293438T.mo132371x() || C100167e.this.f293438T.mo133919h0()) {
                C100167e.this.f293438T.mo130404K();
            } else {
                C100167e.this.f293438T.mo130403E();
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
        }
    }

    /* renamed from: nt2.e$c */
    public class C100170c implements C102064e.C102069c {
        public C100170c() {
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$4");
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$4");
            return null;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$4");
            C100167e eVar = C100167e.this;
            eVar.f293418n.mo133538A(eVar);
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$4");
        }
    }

    /* renamed from: nt2.e$d */
    public class C100171d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92445n f293460d;

        /* renamed from: e */
        public final /* synthetic */ String f293461e;

        public C100171d(C92445n nVar, String str) {
            this.f293460d = nVar;
            this.f293461e = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$6");
            try {
                C100167e eVar = C100167e.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                Context context = eVar.f293445o;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                int b = C76577a.m92151b(context, 60);
                int height = C100167e.this.f293413f.getHeight() - C100167e.this.f293456z.getHeight();
                C100167e eVar2 = C100167e.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                Context context2 = eVar2.f293445o;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                int b2 = height + C76577a.m92151b(context2, 8);
                C100167e eVar3 = C100167e.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                FinderLivingAnimWrapper finderLivingAnimWrapper = eVar3.f293433N;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                finderLivingAnimWrapper.mo130549d(this.f293460d, this.f293461e, b, b2);
                C100167e eVar4 = C100167e.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                FinderLivingAnimWrapper finderLivingAnimWrapper2 = eVar4.f293433N;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                finderLivingAnimWrapper2.setVisibility(0);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$6");
        }
    }

    public C100167e(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar) {
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
        this.f293423D = oVar;
        this.f293440V = snsInfo.getLocalid();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x07cf  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0628 A[Catch:{ Exception -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0664 A[Catch:{ Exception -> 0x067c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139451a(android.view.View r25, android.view.View r26) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "initView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r1.f293413f = r2
            android.content.Context r0 = r25.getContext()
            r1.f293445o = r0
            java.lang.String r0 = "initActiontButtonComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            android.content.Context r5 = r1.f293445o
            boolean r6 = r5 instanceof androidx.lifecycle.C0125s
            if (r6 == 0) goto L_0x0021
            androidx.lifecycle.s r5 = (androidx.lifecycle.C0125s) r5
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            nt2.d r6 = new nt2.d
            android.view.View r7 = r1.f293413f
            java.lang.String r8 = "actionButtonLayoutRoot"
            r6.<init>(r1, r8, r5, r7)
            r1.f293442X = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r0 = r26
            r1.f293414g = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131309065(0x7f093209, float:1.8236403E38)
            android.view.View r0 = r0.findViewById(r5)
            r1.f293456z = r0
            boolean r5 = r0 instanceof com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout
            r6 = 4
            if (r5 == 0) goto L_0x0050
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r0
            android.content.Context r5 = r1.f293445o
            int r5 = kg3.C76577a.m92151b(r5, r6)
            float r5 = (float) r5
            r0.setRadius(r5)
        L_0x0050:
            android.view.View r0 = r1.f293413f
            r5 = 2131310676(0x7f093854, float:1.823967E38)
            android.view.View r0 = r0.findViewById(r5)
            r1.f293420A = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131298719(0x7f09099f, float:1.821542E38)
            android.view.View r0 = r0.findViewById(r5)
            r1.f293448r = r0
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r15 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r5.mo10233c(r7)
            java.lang.Object[] r8 = r5.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r10 = "initView"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r0 = r1.f293413f
            r5 = 2131298904(0x7f090a58, float:1.8215794E38)
            android.view.View r0 = r0.findViewById(r5)
            r1.f293451u = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131316920(0x7f0950b8, float:1.8252335E38)
            android.view.View r0 = r0.findViewById(r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f293452v = r0
            android.view.View r7 = r1.f293451u
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r0.mo10233c(r5)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.setVisibility(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r0 = r1.f293413f
            r5 = 2131313921(0x7f094501, float:1.8246252E38)
            android.view.View r0 = r0.findViewById(r5)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r0
            r1.f293453w = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131298720(0x7f0909a0, float:1.8215421E38)
            android.view.View r0 = r0.findViewById(r5)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.f293449s = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131298721(0x7f0909a1, float:1.8215423E38)
            android.view.View r0 = r0.findViewById(r5)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.f293450t = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131296447(0x7f0900bf, float:1.821081E38)
            android.view.View r0 = r0.findViewById(r5)
            r1.f293421B = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131313922(0x7f094502, float:1.8246254E38)
            android.view.View r0 = r0.findViewById(r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.f293437S = r0
            android.view.View r0 = r1.f293413f
            r5 = 2131313847(0x7f0944b7, float:1.8246102E38)
            android.view.View r0 = r0.findViewById(r5)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r1.f293434P = r0
            android.widget.ImageView r0 = r1.f293452v
            java.lang.String r5 = ""
            r0.setTag(r5)
            android.widget.ImageView r0 = r1.f293452v
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0162
            android.widget.ImageView r0 = r1.f293452v
            r0.setVisibility(r6)
        L_0x0162:
            android.view.View r0 = r1.f293413f
            r6 = 2131316923(0x7f0950bb, float:1.8252341E38)
            android.view.View r0 = r0.findViewById(r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.getAdInfo()
            if (r6 == 0) goto L_0x01d4
            boolean r7 = r6.isWeapp()
            if (r7 == 0) goto L_0x01d4
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            boolean r7 = r7.isTurnCardAd()
            if (r7 != 0) goto L_0x01d4
            android.view.View r7 = r1.f293451u
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r8.mo10233c(r9)
            java.lang.Object[] r17 = r8.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r8 = r8.mo10231a(r14)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r18 = "initView"
            java.lang.String r19 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r7 = 2131836750(0x7f113f4e, float:1.9306676E38)
            r0.setText(r7)
            com.tencent.mm.plugin.sns.storage.ADInfo$b r0 = r6.actionExtWeApp
            java.lang.String r0 = r0.f275645a
            android.widget.ImageView r7 = r1.f293452v
            lo2.C88617x.m110484b(r0, r7, r6)
            goto L_0x0227
        L_0x01d4:
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r7.getAdXml()
            boolean r6 = lo2.C99542h0.m129910h(r7, r6)
            if (r6 == 0) goto L_0x0227
            android.view.View r7 = r1.f293451u
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r6.mo10233c(r8)
            java.lang.Object[] r17 = r6.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r6 = r6.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7.setVisibility(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            r6 = 2131826159(0x7f1115ef, float:1.9285195E38)
            r0.setText(r6)
        L_0x0227:
            android.view.View r0 = r1.f293451u
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x027f
            android.view.View r0 = r1.f293413f
            r6 = 2131316922(0x7f0950ba, float:1.825234E38)
            android.view.View r0 = r0.findViewById(r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r6 == 0) goto L_0x0260
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r6.getAdXml()
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADInfo r7 = r7.getAdInfo()
            boolean r6 = lo2.C99542h0.m129910h(r6, r7)
            if (r6 == 0) goto L_0x0259
            r6 = 2131755047(0x7f100027, float:1.9140962E38)
            r0.setImageResource(r6)
            goto L_0x027f
        L_0x0259:
            r6 = 2131755050(0x7f10002a, float:1.9140968E38)
            r0.setImageResource(r6)
            goto L_0x027f
        L_0x0260:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r6.getAdXml()
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADInfo r7 = r7.getAdInfo()
            boolean r6 = lo2.C99542h0.m129910h(r6, r7)
            if (r6 == 0) goto L_0x0279
            r6 = 2131755048(0x7f100028, float:1.9140964E38)
            r0.setImageResource(r6)
            goto L_0x027f
        L_0x0279:
            r6 = 2131755049(0x7f100029, float:1.9140966E38)
            r0.setImageResource(r6)
        L_0x027f:
            android.view.View r0 = r1.f293413f
            r6 = 2131300841(0x7f0911e9, float:1.8219723E38)
            android.view.View r0 = r0.findViewById(r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f293447q = r0
            r0.setClickable(r14)
            android.widget.TextView r0 = r1.f293447q
            r0.setLongClickable(r14)
            r0 = 1
            r1.f293439U = r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "card ad detail useOnlineVideo="
            r6.append(r7)
            boolean r7 = r1.f293439U
            r6.append(r7)
            java.lang.String r7 = ", snsId="
            r6.append(r7)
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r1.f293411d
            if (r7 != 0) goto L_0x02b0
            goto L_0x02b2
        L_0x02b0:
            java.lang.String r5 = r7.f283893Id
        L_0x02b2:
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "MicroMsg.CardAdDetailItemView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            android.content.Context r5 = r1.f293445o
            java.lang.String r7 = "window"
            java.lang.Object r5 = r5.getSystemService(r7)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            android.view.Display r7 = r5.getDefaultDisplay()
            int r7 = r7.getWidth()
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getHeight()
            int r5 = java.lang.Math.min(r7, r5)
            android.content.Context r7 = r1.f293445o
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131167200(0x7f0707e0, float:1.7948667E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r5 = r5 - r7
            android.content.Context r7 = r1.f293445o
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165281(0x7f070061, float:1.7944775E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r5 = r5 - r7
            android.content.Context r7 = r1.f293445o
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165590(0x7f070196, float:1.7945401E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r5 = r5 - r7
            android.content.Context r7 = r1.f293445o
            android.content.res.Resources r7 = r7.getResources()
            int r7 = r7.getDimensionPixelSize(r8)
            int r5 = r5 - r7
            r1.f293424E = r5
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106197n0()
            if (r5 == 0) goto L_0x033f
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106156M(r5)
            if (r5 != 0) goto L_0x0332
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r5 = r5.getContentResolver()
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106155L(r5)
            if (r5 == 0) goto L_0x033f
        L_0x0332:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131167219(0x7f0707f3, float:1.7948705E38)
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r5, r7)
            r1.f293424E = r5
        L_0x033f:
            android.view.View r5 = r1.f293413f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.Context r7 = r1.f293445o
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165574(0x7f070186, float:1.7945369E38)
            int r7 = r7.getDimensionPixelOffset(r8)
            r5.topMargin = r7
            r5.bottomMargin = r14
            int r7 = r1.f293424E
            r5.width = r7
            r7 = -2
            r5.height = r7
            android.view.View r7 = r1.f293413f
            r7.setLayoutParams(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "initView, contentLayoutParam width is "
            r7.append(r8)
            int r8 = r5.width
            r7.append(r8)
            java.lang.String r8 = ", contentLayoutParam height is "
            r7.append(r8)
            int r8 = r5.height
            r7.append(r8)
            java.lang.String r8 = ", contentLayoutParam topMargin is "
            r7.append(r8)
            int r8 = r5.topMargin
            r7.append(r8)
            java.lang.String r8 = ", contentLayoutParam bottomMargin is "
            r7.append(r8)
            int r5 = r5.bottomMargin
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            android.view.View r5 = r1.f293413f
            android.content.Context r7 = r1.f293445o
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131234935(0x7f081077, float:1.808605E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r5.setBackground(r7)
            android.view.View r5 = r1.f293413f
            r7 = 2131300840(0x7f0911e8, float:1.821972E38)
            android.view.View r5 = r5.findViewById(r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f293446p = r5
            r5.setClickable(r14)
            android.widget.TextView r5 = r1.f293446p
            r5.setLongClickable(r14)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            java.lang.String r5 = r5.adCardTitle
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x03ee
            com.tencent.mm.smiley.p0 r5 = com.tencent.p014mm.smiley.C96963p0.wx0()
            android.widget.TextView r7 = r1.f293446p
            android.content.Context r7 = r7.getContext()
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r8.getAdXml()
            java.lang.String r8 = r8.adCardTitle
            android.text.SpannableString r5 = r5.mo83004M(r7, r8)
            android.widget.TextView r7 = r1.f293446p
            r7.setText(r5)
            android.widget.TextView r5 = r1.f293446p
            r5.setVisibility(r14)
            goto L_0x03f3
        L_0x03ee:
            android.widget.TextView r5 = r1.f293446p
            r5.setVisibility(r15)
        L_0x03f3:
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            java.lang.String r5 = r5.adCardDesc
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0406
            com.tencent.mm.protocal.protobuf.TimeLineObject r5 = r1.f293411d
            java.lang.String r5 = r5.ContentDesc
            goto L_0x040e
        L_0x0406:
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            java.lang.String r5 = r5.adCardDesc
        L_0x040e:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x042d
            com.tencent.mm.smiley.p0 r7 = com.tencent.p014mm.smiley.C96963p0.wx0()
            android.widget.TextView r8 = r1.f293447q
            android.content.Context r8 = r8.getContext()
            android.text.SpannableString r5 = r7.mo83004M(r8, r5)
            android.widget.TextView r7 = r1.f293447q
            r7.setText(r5)
            android.widget.TextView r5 = r1.f293447q
            r5.setVisibility(r14)
            goto L_0x0432
        L_0x042d:
            android.widget.TextView r5 = r1.f293447q
            r5.setVisibility(r15)
        L_0x0432:
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            boolean r5 = r5.hasSelectInfo()
            if (r5 != 0) goto L_0x0495
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            boolean r5 = r5.hasVoteInfo()
            if (r5 == 0) goto L_0x044b
            goto L_0x0495
        L_0x044b:
            android.view.View r7 = r1.f293448r
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r5.mo10233c(r8)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.plugin.sns.ui.y2 r5 = r1.f293426G
            if (r5 == 0) goto L_0x0570
            r5.mo134155b()
            goto L_0x0570
        L_0x0495:
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            boolean r5 = r5.isNewStyleVote()
            if (r5 == 0) goto L_0x0523
            com.tencent.mm.plugin.sns.ui.y2 r5 = r1.f293426G
            if (r5 != 0) goto L_0x04c5
            android.view.View r5 = r1.f293413f
            r7 = 2131313762(0x7f094462, float:1.824593E38)
            android.view.View r5 = r5.findViewById(r7)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            if (r5 == 0) goto L_0x04c5
            android.view.View r5 = rq2.C101432s.m133125g(r5)
            if (r5 == 0) goto L_0x04c5
            com.tencent.mm.plugin.sns.ui.y2 r5 = new com.tencent.mm.plugin.sns.ui.y2
            android.content.Context r7 = r1.f293445o
            android.view.View r8 = r1.f293413f
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r1.f293418n
            r5.<init>(r7, r8, r9)
            r1.f293426G = r5
        L_0x04c5:
            com.tencent.mm.plugin.sns.ui.y2 r5 = r1.f293426G
            if (r5 == 0) goto L_0x04d3
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            r5.mo134156c(r7, r1)
            com.tencent.mm.plugin.sns.ui.y2 r5 = r1.f293426G
            r5.mo134157d()
        L_0x04d3:
            android.view.View r7 = r1.f293448r
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r5.mo10233c(r8)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r5 = r1.f293446p
            if (r5 == 0) goto L_0x051b
            r5.setVisibility(r15)
        L_0x051b:
            android.widget.TextView r5 = r1.f293447q
            if (r5 == 0) goto L_0x0570
            r5.setVisibility(r15)
            goto L_0x0570
        L_0x0523:
            android.view.View r7 = r1.f293448r
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r5.mo10233c(r8)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "initView"
            java.lang.String r20 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.plugin.sns.ui.y2 r5 = r1.f293426G
            if (r5 == 0) goto L_0x056b
            r5.mo134155b()
        L_0x056b:
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            r1.mo139462j(r5)
        L_0x0570:
            com.tencent.mm.plugin.sns.ui.m2 r5 = new com.tencent.mm.plugin.sns.ui.m2
            r5.<init>()
            r1.f293415h = r5
            android.view.View r7 = r1.f293413f
            r8 = 2131313923(0x7f094503, float:1.8246256E38)
            android.view.View r7 = r7.findViewById(r8)
            r5.f280505h = r7
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f293415h
            android.view.View r7 = r5.f280505h
            r5.f280501d = r7
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r5 = r1.f293418n
            android.view.View$OnClickListener r5 = r5.f280353I
            r7.setOnClickListener(r5)
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f293415h
            android.view.View r7 = r5.f280505h
            r8 = 2131314332(0x7f09469c, float:1.8247086E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r5.f280506i = r7
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f293415h
            android.view.View r7 = r5.f280505h
            r8 = 2131311498(0x7f093b8a, float:1.8241338E38)
            android.view.View r7 = r7.findViewById(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = (com.tencent.p014mm.p136ui.widget.MMPinProgressBtn) r7
            r5.f280507j = r7
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f293415h
            android.view.View r7 = r5.f280505h
            r8 = 2131301661(0x7f09151d, float:1.8221386E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f280509l = r7
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f293415h
            android.view.View r7 = r5.f280505h
            r8 = 2131301687(0x7f091537, float:1.8221439E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5.f280508k = r7
            android.view.View r5 = r1.f293413f
            r7 = 2131313759(0x7f09445f, float:1.8245924E38)
            android.view.View r5 = r5.findViewById(r7)
            r1.f293455y = r5
            java.lang.String r5 = "initCardAdHeader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            android.view.View r7 = r1.f293413f
            r8 = 2131298690(0x7f090982, float:1.821536E38)
            android.view.View r7 = r7.findViewById(r8)
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r7 = (com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCardAdTagListView) r7
            r1.f293454x = r7
            android.content.Context r8 = r1.f293445o
            android.app.Activity r8 = (android.app.Activity) r8
            r7.setActivityContext(r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e     // Catch:{ Exception -> 0x067c }
            java.lang.String r7 = r7.getSnsId()     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r8 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            java.lang.String r8 = r8.getOriginSnsId()     // Catch:{ Exception -> 0x067c }
            java.lang.String r9 = "isSameAd"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)     // Catch:{ Exception -> 0x067c }
            boolean r11 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x067c }
            java.lang.String r12 = "SnsCardAdTagUtils"
            if (r11 != 0) goto L_0x061c
            boolean r8 = r8.equals(r7)     // Catch:{ Exception -> 0x067c }
            if (r8 != 0) goto L_0x0612
            goto L_0x061c
        L_0x0612:
            java.lang.String r8 = "should not refresh adTag, show origin adTag"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r8)     // Catch:{ Exception -> 0x067c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)     // Catch:{ Exception -> 0x067c }
            goto L_0x0626
        L_0x061c:
            java.lang.String r0 = "should refresh adTag"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)     // Catch:{ Exception -> 0x067c }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)     // Catch:{ Exception -> 0x067c }
            r0 = 0
        L_0x0626:
            if (r0 != 0) goto L_0x0664
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            r0.removeAllViews()     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.ADXml$c r0 = r0.adCardTagInfo     // Catch:{ Exception -> 0x067c }
            java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$d> r0 = r0.f82061a     // Catch:{ Exception -> 0x067c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x067c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x067c }
            if (r0 <= 0) goto L_0x065e
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            android.content.Context r8 = r1.f293445o     // Catch:{ Exception -> 0x067c }
            int r8 = kg3.C76577a.m92151b(r8, r15)     // Catch:{ Exception -> 0x067c }
            r0.setTagSpace(r8)     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r1.f293412e     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r8.getAdXml()     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.ADXml$c r8 = r8.adCardTagInfo     // Catch:{ Exception -> 0x067c }
            java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$d> r8 = r8.f82061a     // Catch:{ Exception -> 0x067c }
            r0.mo134071a(r8)     // Catch:{ Exception -> 0x067c }
        L_0x065e:
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            r0.setOriginSnsId(r7)     // Catch:{ Exception -> 0x067c }
            goto L_0x0684
        L_0x0664:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()     // Catch:{ Exception -> 0x067c }
            com.tencent.mm.plugin.sns.storage.ADXml$c r0 = r0.adCardTagInfo     // Catch:{ Exception -> 0x067c }
            java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$d> r0 = r0.f82061a     // Catch:{ Exception -> 0x067c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x067c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x067c }
            if (r0 <= 0) goto L_0x0684
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x     // Catch:{ Exception -> 0x067c }
            r0.setVisibility(r14)     // Catch:{ Exception -> 0x067c }
            goto L_0x0684
        L_0x067c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x0684:
            android.content.Context r0 = r1.f293445o
            boolean r0 = vr2.C102260r.m134842K(r0)
            if (r0 == 0) goto L_0x0691
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView r0 = r1.f293454x
            r0.setVisibility(r15)
        L_0x0691:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            java.lang.String r0 = r0.adCard3dHeadTitle
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x073f
            android.view.View r0 = r1.f293455y
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r6)
            java.lang.Object[] r7 = r13.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initCardAdHeader"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r6 = r0
            r15 = r13
            r13 = r16
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r15.mo10231a(r14)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r8 = "initCardAdHeader"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r0
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r0 = r1.f293455y
            r6 = 2131313760(0x7f094460, float:1.8245926E38)
            android.view.View r7 = r0.findViewById(r6)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r0.mo10233c(r8)
            java.lang.Object[] r16 = r0.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r18 = "initCardAdHeader"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r7
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.setVisibility(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initCardAdHeader"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r0 = r1.f293455y
            android.view.View r0 = r0.findViewById(r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r6.getAdXml()
            java.lang.String r6 = r6.adCard3dHeadTitle
            r0.setText(r6)
        L_0x073f:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            java.lang.String r0 = r0.adCard3dHeadUrl
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x075f
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            java.lang.String r0 = r0.adCard3dHeadUrl
            r6 = 41
            nt2.f r7 = new nt2.f
            r7.<init>(r1)
            ps2.C100891r.m132206a(r0, r14, r6, r14, r7)
        L_0x075f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r1.f293453w
            r5 = 8
            r0.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r1.f293453w
            com.tencent.mm.ui.widget.QImageView$a r6 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r0.setScaleType(r6)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            android.view.View r0 = r0.f280501d
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r7 = r15.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r9 = "initView"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r15.mo10231a(r14)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r8 = "initView"
            java.lang.String r9 = "(Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r0 = r1.f293413f
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r5 = r1.f293418n
            android.view.View$OnClickListener r5 = r5.f280365U
            r0.setOnClickListener(r5)
            r0 = 2131296630(0x7f090176, float:1.8211182E38)
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r1.f293432M = r0
            java.lang.String r0 = "addOnRemovedListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            jp2.o r2 = r1.f293423D
            if (r2 == 0) goto L_0x07e6
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            java.lang.String r5 = vr2.C102236a0.m134728W(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x07e6
            java.lang.String r6 = "0"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x07e6
            r2.mo138294a(r5, r1)
        L_0x07e6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100167e.mo139451a(android.view.View, android.view.View):void");
    }

    /* renamed from: b */
    public void mo139452b() {
        SnsInfo snsInfo;
        SnsTimelineVideoView snsTimelineVideoView;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            boolean a = C54550e.m61296a(this.f293412e);
            Log.m105924i("MicroMsg.CardAdDetailItemView", "onPause, hasPlayedVideo=" + this.f293444Z + ", useOnlineVideo=" + this.f293439U + ", isAdLivingStream=" + a);
            if (a) {
                this.f293436R.mo75432g();
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                return;
            }
            if (this.f293444Z && this.f293415h != null) {
                if (this.f293439U && (snsTimelineVideoView = this.f293438T) != null) {
                    snsTimelineVideoView.mo132317G();
                }
                C98963o oVar = this.f293423D;
                if (!(oVar == null || (snsInfo = this.f293412e) == null)) {
                    oVar.mo138314u(snsInfo.field_snsId);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.CardAdDetailItemView", "onPause, exp=" + th.toString());
        }
    }

    /* renamed from: c */
    public final boolean mo139459c(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
            SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        return true;
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        C54550e eVar;
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (C54550e.m61296a(this.f293412e) && (eVar = this.f293436R) != null) {
            eVar.mo75427b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:138|139|140|(1:142)|143|144|145|146|(1:148)|149|150|151) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x06cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x06ef */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0650 A[Catch:{ all -> 0x06fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x067e A[Catch:{ all -> 0x06fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x06ea A[Catch:{ all -> 0x06ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x06f3 A[Catch:{ all -> 0x06fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x071c A[Catch:{ all -> 0x079f }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x071e A[Catch:{ all -> 0x079f }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0724 A[Catch:{ all -> 0x079f }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0795 A[SYNTHETIC, Splitter:B:185:0x0795] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139454g() {
        /*
            r32 = this;
            r1 = r32
            java.lang.String r2 = "refreshView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            java.lang.String r0 = r0.getSnsId()
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = os2.C100416r.m131408a(r0)
            r1.f293412e = r0
            java.lang.String r4 = "MicroMsg.CardAdDetailItemView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            android.view.View r0 = r1.f293413f
            r5 = 2131296612(0x7f090164, float:1.8211146E38)
            android.view.View r0 = r0.findViewById(r5)
            boolean r5 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0034
            com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout r0 = (com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout) r0
            r0.setIsReportTouchDownPositon(r7)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            r0.mo134108c(r5, r6)
        L_0x0034:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            boolean r0 = r0.hasSelectInfo()
            if (r0 != 0) goto L_0x004c
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            boolean r0 = r0.hasVoteInfo()
            if (r0 == 0) goto L_0x0067
        L_0x004c:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            boolean r0 = r0.isNewStyleVote()
            if (r0 == 0) goto L_0x0062
            com.tencent.mm.plugin.sns.ui.y2 r0 = r1.f293426G
            if (r0 == 0) goto L_0x0067
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            r0.mo134156c(r5, r1)
            goto L_0x0067
        L_0x0062:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            r1.mo139462j(r0)
        L_0x0067:
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            android.widget.TextView r0 = r0.f280508k
            r5 = 8
            r0.setVisibility(r5)
            r8 = 0
            r1.f293444Z = r8
            com.tencent.mm.plugin.sns.model.o r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f293411d     // Catch:{ all -> 0x0095 }
            te3.j00 r0 = r0.ContentObj     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0092
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h     // Catch:{ all -> 0x0095 }
            int r0 = r0.size()     // Catch:{ all -> 0x0095 }
            if (r0 < r7) goto L_0x0092
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r1.f293411d     // Catch:{ all -> 0x0095 }
            te3.j00 r0 = r0.ContentObj     // Catch:{ all -> 0x0095 }
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0095 }
            te3.kv2 r0 = (te3.C101804kv2) r0     // Catch:{ all -> 0x0095 }
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            r15 = r0
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r8] = r0
            java.lang.String r0 = "error in get media"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r11)
            r15 = 0
        L_0x00a0:
            android.content.Context r0 = r1.f293445o
            java.lang.String r11 = "window"
            java.lang.Object r0 = r0.getSystemService(r11)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getWidth()
            if (r15 == 0) goto L_0x07aa
            int r0 = r1.f293424E
            android.content.Context r11 = r1.f293445o
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r11 = r11.getDimensionPixelSize(r12)
            int r0 = r0 - r11
            android.content.Context r11 = r1.f293445o
            android.content.res.Resources r11 = r11.getResources()
            int r11 = r11.getDimensionPixelSize(r12)
            int r0 = r0 - r11
            float r11 = (float) r0
            te3.mv2 r12 = r15.f298698p
            float r13 = r12.f298876e
            float r11 = r11 * r13
            float r12 = r12.f298875d
            float r11 = r11 / r12
            int r11 = (int) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "refreshView, adMediaDisplayWidth is "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r13 = ", adMediaDisplayHeight is "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            com.tencent.mm.protocal.protobuf.TimeLineObject r12 = r1.f293411d
            te3.j00 r12 = r12.ContentObj
            int r12 = r12.f298424e
            if (r12 != r7) goto L_0x0147
            com.tencent.mm.plugin.sns.ui.MaskImageView r6 = r1.f293453w
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r6.width = r0
            r6.height = r11
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r1.f293453w
            r0.setLayoutParams(r6)
            com.tencent.mm.plugin.sns.model.o r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.MaskImageView r14 = r1.f293453w
            r0 = -1
            android.content.Context r6 = r1.f293445o
            int r16 = r6.hashCode()
            com.tencent.mm.storage.o3 r17 = com.tencent.p014mm.storage.C96983o3.f284138j
            r13 = r15
            r15 = r0
            r12.mo131114e0(r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r1.f293453w
            r0.setVisibility(r8)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r1.f293453w
            r0.setTag(r1)
            android.view.View r0 = r1.f293413f
            r0.setTag(r1)
            android.widget.Button r0 = r1.f293449s
            r0.setTag(r1)
            android.widget.Button r0 = r1.f293450t
            r0.setTag(r1)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r1.f293453w
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r6 = r1.f293418n
            android.view.View$OnClickListener r6 = r6.f280385o
            r0.setOnClickListener(r6)
        L_0x0144:
            r10 = 1
            goto L_0x05cd
        L_0x0147:
            r13 = 5
            if (r12 == r13) goto L_0x0157
            r14 = 15
            if (r12 != r14) goto L_0x014f
            goto L_0x0157
        L_0x014f:
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            android.widget.TextView r0 = r0.f280509l
            r0.setVisibility(r5)
            goto L_0x0144
        L_0x0157:
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r1.f293412e
            boolean r12 = br2.C54550e.m61296a(r12)
            if (r12 == 0) goto L_0x0237
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            r1.mo139461i(r6)
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r1.f293412e
            java.lang.String r6 = "fillAdLivingStreamViewInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            android.view.ViewStub r9 = r1.f293434P
            if (r9 == 0) goto L_0x017b
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r10 = r1.f293435Q
            if (r10 != 0) goto L_0x017b
            android.view.View r9 = rq2.C101432s.m133125g(r9)
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r9 = (com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer) r9
            r1.f293435Q = r9
        L_0x017b:
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r9 = r1.f293435Q
            if (r9 != 0) goto L_0x0184
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x0230
        L_0x0184:
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f293415h
            java.lang.String r10 = r13.getLocalid()
            r9.f280499b = r10
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f293415h
            android.view.View r9 = r9.f280505h
            r9.setTag(r1)
            android.view.View r9 = r1.f293413f
            r9.setTag(r1)
            android.widget.Button r9 = r1.f293449s
            r9.setTag(r1)
            android.widget.Button r9 = r1.f293450t
            r9.setTag(r1)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f293415h
            android.view.View r9 = r9.f280501d
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r10.mo10233c(r12)
            java.lang.Object[] r17 = r10.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "fillAdLivingStreamViewInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/MediaObj;II)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r9
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r9.setVisibility(r10)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r18 = "fillAdLivingStreamViewInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/MediaObj;II)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f293415h
            android.widget.ImageView r9 = r9.f280506i
            r9.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f293415h
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r9.setVisibility(r5)
            android.view.ViewGroup r9 = r1.f293437S
            r9.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.MaskImageView r9 = r1.f293453w
            r9.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f293415h
            android.view.View r9 = r9.f280501d
            rq2.C101432s.m133131m(r9, r0, r11)
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r9 = r1.f293435Q
            rq2.C101432s.m133131m(r9, r0, r11)
            br2.e r9 = r1.f293436R
            if (r9 != 0) goto L_0x0218
            br2.e r9 = new br2.e
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r10 = r1.f293435Q
            r9.<init>(r10)
            r1.f293436R = r9
        L_0x0218:
            br2.e r12 = r1.f293436R
            android.content.Context r9 = r1.f293445o
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r9 = (com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI) r9
            int r14 = r9.mo132622j8()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)
            r12.mo75429d(r13, r14, r15, r16, r17)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x0230:
            br2.e r0 = r1.f293436R
            r0.mo75434i()
            goto L_0x0144
        L_0x0237:
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f293415h
            android.view.View r12 = r12.f280501d
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r14.mo10233c(r10)
            java.lang.Object[] r17 = r14.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r19 = "refreshView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r12
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r10 = r14.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r12.setVisibility(r10)
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r18 = "refreshView"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f293415h
            android.view.View r10 = r10.f280501d
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            r10.width = r0
            r10.height = r11
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f293415h
            android.view.View r12 = r12.f280501d
            r12.setLayoutParams(r10)
            boolean r10 = r1.f293439U
            if (r10 == 0) goto L_0x029a
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r1.f293412e
            lo2.C99556n.m129940c(r10, r15)
        L_0x029a:
            long r16 = java.lang.System.nanoTime()
            boolean r10 = r9.mo131141x(r15)
            long r18 = java.lang.System.nanoTime()
            long r18 = r18 - r16
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            r12[r8] = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r18)
            r12[r7] = r14
            java.lang.String r14 = "isMediaSightExist %b duration %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r12)
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f293415h
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r1.f293412e
            java.lang.String r14 = r14.getLocalid()
            r12.f280499b = r14
            r14 = 2131834031(0x7f1134af, float:1.930116E38)
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            if (r10 != 0) goto L_0x0352
            boolean r10 = r9.mo131140w(r15)
            if (r10 == 0) goto L_0x02e5
            android.widget.ImageView r10 = r12.f280506i
            r10.setVisibility(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r12.f280507j
            r10.setVisibility(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r12.f280507j
            r10.mo153891a()
            goto L_0x03c8
        L_0x02e5:
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r1.f293412e
            int r10 = r9.mo131133p(r10)
            if (r10 != r13) goto L_0x0301
            r9.mo131097Q(r15)
            android.widget.ImageView r10 = r12.f280506i
            r10.setVisibility(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r12.f280507j
            r10.setVisibility(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r12.f280507j
            r10.mo153891a()
            goto L_0x03c8
        L_0x0301:
            boolean r10 = r9.mo131137t(r15)
            if (r10 == 0) goto L_0x031b
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r12.f280507j
            r10.setVisibility(r5)
            android.widget.ImageView r10 = r12.f280506i
            r7 = 2131756959(0x7f10079f, float:1.914484E38)
            r10.setImageResource(r7)
            android.widget.ImageView r7 = r12.f280506i
            r7.setVisibility(r8)
            goto L_0x03c8
        L_0x031b:
            r9.mo131098R(r15)
            android.widget.ImageView r7 = r12.f280506i
            r7.setVisibility(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = r12.f280507j
            r7.setVisibility(r5)
            android.widget.ImageView r7 = r12.f280506i
            android.content.Context r10 = r1.f293445o
            android.graphics.drawable.Drawable r10 = kg3.C76577a.m92158i(r10, r6)
            r7.setImageDrawable(r10)
            android.widget.ImageView r7 = r12.f280506i
            android.content.Context r10 = r1.f293445o
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r14)
            r7.setContentDescription(r10)
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            int r7 = r9.mo131133p(r7)
            r10 = 4
            if (r7 != r10) goto L_0x03c8
            android.widget.TextView r7 = r12.f280508k
            r7.setVisibility(r8)
            goto L_0x03c8
        L_0x0352:
            boolean r7 = r9.mo131143z(r15)
            if (r7 == 0) goto L_0x037d
            android.widget.ImageView r7 = r12.f280506i
            r7.setVisibility(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = r12.f280507j
            r7.setVisibility(r5)
            android.widget.ImageView r7 = r12.f280506i
            android.content.Context r10 = r1.f293445o
            android.graphics.drawable.Drawable r10 = kg3.C76577a.m92158i(r10, r6)
            r7.setImageDrawable(r10)
            android.widget.ImageView r7 = r12.f280506i
            android.content.Context r10 = r1.f293445o
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r14)
            r7.setContentDescription(r10)
            goto L_0x03c8
        L_0x037d:
            boolean r7 = r9.mo131139v(r15)
            if (r7 == 0) goto L_0x038e
            android.widget.ImageView r7 = r12.f280506i
            r7.setVisibility(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = r12.f280507j
            r7.setVisibility(r5)
            goto L_0x03c8
        L_0x038e:
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            int r7 = r9.mo131133p(r7)
            if (r7 > r13) goto L_0x03a1
            android.widget.ImageView r7 = r12.f280506i
            r7.setVisibility(r5)
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = r12.f280507j
            r7.setVisibility(r5)
            goto L_0x03c8
        L_0x03a1:
            r9.mo131098R(r15)
            android.widget.ImageView r7 = r12.f280506i
            r7.setVisibility(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = r12.f280507j
            r7.setVisibility(r5)
            android.widget.ImageView r7 = r12.f280506i
            android.content.Context r10 = r1.f293445o
            android.graphics.drawable.Drawable r10 = kg3.C76577a.m92158i(r10, r6)
            r7.setImageDrawable(r10)
            android.widget.ImageView r7 = r12.f280506i
            android.content.Context r10 = r1.f293445o
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getString(r14)
            r7.setContentDescription(r10)
        L_0x03c8:
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f293415h
            android.view.View r7 = r7.f280501d
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r10.mo10233c(r5)
            java.lang.Object[] r25 = r10.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r27 = "refreshView"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r7
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r5 = r10.mo10231a(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r25 = "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem"
            java.lang.String r26 = "refreshView"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.View r5 = r12.f280505h
            r5.setTag(r1)
            android.view.View r5 = r1.f293413f
            r5.setTag(r1)
            android.widget.Button r5 = r1.f293449s
            r5.setTag(r1)
            android.widget.Button r5 = r1.f293450t
            r5.setTag(r1)
            jp2.o r5 = r1.f293423D
            if (r5 == 0) goto L_0x047e
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r7 = r15.f298689d
            java.lang.String r5 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r5, r7)
            java.lang.String r7 = vr2.C102236a0.m134725T(r15)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r7)
            java.lang.String r5 = r10.toString()
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 == 0) goto L_0x0459
            jp2.o r5 = r1.f293423D
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            long r6 = r7.field_snsId
            float r12 = r15.f298684R
            int r12 = (int) r12
            r10 = 1
            r5.mo138292G(r6, r12, r10)
            lo2.C99556n.m129942e()
            goto L_0x0465
        L_0x0459:
            jp2.o r5 = r1.f293423D
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            long r6 = r6.field_snsId
            float r10 = r15.f298684R
            int r10 = (int) r10
            r5.mo138292G(r6, r10, r8)
        L_0x0465:
            com.tencent.mm.plugin.sns.model.o r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            int r5 = r5.mo131133p(r6)
            if (r5 != r13) goto L_0x0473
            r5 = 1
            goto L_0x0474
        L_0x0473:
            r5 = 0
        L_0x0474:
            jp2.o r6 = r1.f293423D
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r1.f293412e
            long r12 = r7.field_snsId
            r7 = 1
            r6.mo138290E(r12, r5, r7)
        L_0x047e:
            boolean r5 = r1.f293439U
            if (r5 == 0) goto L_0x0144
            android.view.ViewGroup r5 = r1.f293437S
            rq2.C101432s.m133131m(r5, r0, r11)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            if (r0 != 0) goto L_0x0501
            android.view.ViewGroup r0 = r1.f293437S
            rq2.C101432s.m133121c(r0)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView
            android.content.Context r5 = r1.f293445o
            r6 = 1
            r0.<init>((android.content.Context) r5, (boolean) r6)
            r1.f293438T = r0
            r0.mo132372y(r8)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            com.tencent.mm.pluginsdk.ui.a$e r5 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r0.setVideoScaleType(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setThumbViewScaleType(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            r5 = -1
            rq2.C101432s.m133131m(r0, r5, r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            r5 = 1
            rq2.C101432s.m133132n(r0, r5)
            android.view.ViewGroup r0 = r1.f293437S
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r1.f293438T
            rq2.C101432s.m133120b(r0, r5, r8)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            nt2.e$a r5 = new nt2.e$a
            r5.<init>()
            r0.setUICallback(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            qq2.b r5 = new qq2.b
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r1.f293412e
            jp2.o r7 = r1.f293423D
            r10 = 3
            r5.<init>(r6, r0, r7, r10)
            r0.setVideoCallback(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "refreshView, new OnLineVideoView, hash="
            r0.append(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r1.f293438T
            int r5 = r5.hashCode()
            r0.append(r5)
            java.lang.String r5 = ", innerType="
            r0.append(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r1.f293438T
            android.view.View r5 = r5.getInnerVideoView()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x052a
        L_0x0501:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "refreshView, OnLineVideoView.hash="
            r0.append(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r1.f293438T
            int r5 = r5.hashCode()
            r0.append(r5)
            java.lang.String r5 = ", hasErr="
            r0.append(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r1.f293438T
            boolean r5 = r5.mo132368t()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x052a:
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            r5 = 1
            r0.setMute(r5)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            java.lang.String r5 = r1.f293440V
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r1.f293411d
            int r6 = r6.CreateTime
            r0.mo132324P(r15, r5, r6)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            r0.mo132334a()
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            r0.mo132370w()
            android.os.Handler r0 = r1.f293441W
            r5 = 0
            r0.removeCallbacksAndMessages(r5)
            android.os.Handler r0 = r1.f293441W
            nt2.e$b r5 = new nt2.e$b
            r5.<init>()
            r6 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r5, r6)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r0.f280507j
            rq2.C101432s.m133132n(r0, r8)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r0 = r1.f293438T
            boolean r0 = r0.mo132368t()
            if (r0 == 0) goto L_0x05ca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "play video error "
            r0.append(r5)
            java.lang.String r5 = r15.f298689d
            r0.append(r5)
            java.lang.String r5 = " "
            r0.append(r5)
            java.lang.String r6 = r15.f298692g
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r15.f298694i
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r9.mo131098R(r15)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            android.widget.ImageView r0 = r0.f280506i
            r5 = 1
            rq2.C101432s.m133132n(r0, r5)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r0.f280507j
            rq2.C101432s.m133132n(r0, r8)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            android.widget.ImageView r0 = r0.f280506i
            android.content.Context r5 = r1.f293445o
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
            r0.setImageDrawable(r5)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r1.f293415h
            android.widget.ImageView r0 = r0.f280506i
            android.content.Context r5 = r1.f293445o
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getString(r14)
            r0.setContentDescription(r5)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1910(0x776, float:2.676E-42)
            r6 = 2
            r0.mo175911u(r5, r6)
        L_0x05ca:
            r10 = 1
            r1.f293444Z = r10
        L_0x05cd:
            com.tencent.mm.plugin.sns.ui.widget.AdViewComponent<com.tencent.mm.plugin.sns.storage.SnsInfo> r0 = r1.f293442X
            if (r0 == 0) goto L_0x05f6
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            if (r0 == 0) goto L_0x05f6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "bindActionButton "
            r0.append(r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            java.lang.String r5 = r5.getSnsId()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.sns.ui.widget.AdViewComponent<com.tencent.mm.plugin.sns.storage.SnsInfo> r0 = r1.f293442X
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            r0.mo133971d(r5)
        L_0x05f6:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            boolean r0 = br2.C54550e.m61296a(r0)
            if (r0 != 0) goto L_0x0604
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            r1.mo139461i(r0)
            goto L_0x0641
        L_0x0604:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            boolean r0 = r1.mo139459c(r0)
            if (r0 == 0) goto L_0x0641
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r0.getTimeLine()
            if (r0 == 0) goto L_0x0641
            com.tencent.mm.plugin.sns.ad.widget.living.b r5 = r1.f293429J
            if (r5 == 0) goto L_0x0641
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r1.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r5.getAdXml()
            co2.n r5 = r5.adLiveInfo
            java.lang.String r0 = r0.f283893Id
            int r5 = r5.f264555a
            int r0 = com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a.m120036c(r0, r5)
            com.tencent.mm.plugin.sns.ad.widget.living.b r5 = r1.f293429J
            com.tencent.mm.plugin.sns.ui.r2 r6 = r1.f293425F
            r5.getClass()
            java.lang.String r7 = "setSnsAdCardActionBtnCtrl"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.widget.living.SnsAdLivingStatusController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r9)
            r5.f274436e = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r9)
            com.tencent.mm.plugin.sns.ad.widget.living.b r5 = r1.f293429J
            r5.mo130561i(r0)
        L_0x0641:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            java.lang.String r5 = "fillPromotionalBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            java.lang.String r6 = "shouldShowPromotionalBar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)     // Catch:{ all -> 0x06fc }
            if (r0 == 0) goto L_0x0678
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r0.getAdXml()     // Catch:{ all -> 0x06fc }
            if (r7 != 0) goto L_0x0657
            goto L_0x0678
        L_0x0657:
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r0.getAdXml()     // Catch:{ all -> 0x06fc }
            co2.o r7 = r7.adPromotionInfo     // Catch:{ all -> 0x06fc }
            if (r7 == 0) goto L_0x0673
            long r11 = r7.f264567a     // Catch:{ all -> 0x06fc }
            long r13 = r7.f264568b     // Catch:{ all -> 0x06fc }
            boolean r7 = rq2.C101426m.m133105c(r11, r13)     // Catch:{ all -> 0x06fc }
            if (r7 == 0) goto L_0x0673
            android.content.Context r7 = r1.f293445o     // Catch:{ all -> 0x06fc }
            boolean r7 = vr2.C102260r.m134842K(r7)     // Catch:{ all -> 0x06fc }
            if (r7 != 0) goto L_0x0673
            r7 = 1
            goto L_0x0674
        L_0x0673:
            r7 = 0
        L_0x0674:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch:{ all -> 0x06fc }
            goto L_0x067c
        L_0x0678:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch:{ all -> 0x06fc }
            r7 = 0
        L_0x067c:
            if (r7 == 0) goto L_0x06f3
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()     // Catch:{ all -> 0x06fc }
            co2.o r0 = r0.adPromotionInfo     // Catch:{ all -> 0x06fc }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = r1.f293422C     // Catch:{ all -> 0x06fc }
            if (r6 != 0) goto L_0x069d
            android.view.View r6 = r1.f293413f     // Catch:{ all -> 0x06fc }
            r7 = 2131296644(0x7f090184, float:1.821121E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ all -> 0x06fc }
            android.view.ViewStub r6 = (android.view.ViewStub) r6     // Catch:{ all -> 0x06fc }
            if (r6 == 0) goto L_0x069d
            android.view.View r6 = rq2.C101432s.m133125g(r6)     // Catch:{ all -> 0x06fc }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = (com.tencent.p014mm.plugin.sns.p104ad.widget.countdown.PromotionBarLayout) r6     // Catch:{ all -> 0x06fc }
            r1.f293422C = r6     // Catch:{ all -> 0x06fc }
        L_0x069d:
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = r1.f293422C     // Catch:{ all -> 0x06fc }
            if (r6 == 0) goto L_0x06fc
            r6.setVisibility(r8)     // Catch:{ all -> 0x06fc }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = r1.f293422C     // Catch:{ all -> 0x06fc }
            java.lang.String r7 = r0.f264571e     // Catch:{ all -> 0x06fc }
            r6.setPromotionalPrice(r7)     // Catch:{ all -> 0x06fc }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = r1.f293422C     // Catch:{ all -> 0x06fc }
            java.lang.String r7 = r0.f264572f     // Catch:{ all -> 0x06fc }
            r6.setRightTitle(r7)     // Catch:{ all -> 0x06fc }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = r1.f293422C     // Catch:{ all -> 0x06fc }
            java.lang.String r7 = r0.f264570d     // Catch:{ all -> 0x06fc }
            java.lang.String r9 = r0.f264569c     // Catch:{ all -> 0x06fc }
            java.lang.String r7 = rq2.C13098l.m12545c(r7, r9)     // Catch:{ all -> 0x06fc }
            java.lang.String r9 = "setBackgroundColor"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.utils.ViewUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r11)     // Catch:{ all -> 0x06fc }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ all -> 0x06cd }
            if (r6 == 0) goto L_0x06cd
            r6.setBackgroundColor(r7)     // Catch:{ all -> 0x06cd }
        L_0x06cd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r11)     // Catch:{ all -> 0x06fc }
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r6 = r1.f293422C     // Catch:{ all -> 0x06fc }
            xq2.b r7 = new xq2.b     // Catch:{ all -> 0x06fc }
            long r11 = r0.f264567a     // Catch:{ all -> 0x06fc }
            long r13 = r0.f264568b     // Catch:{ all -> 0x06fc }
            r7.<init>(r11, r13)     // Catch:{ all -> 0x06fc }
            r6.getClass()     // Catch:{ all -> 0x06fc }
            java.lang.String r0 = "startCountDown"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)     // Catch:{ all -> 0x06fc }
            xq2.a r11 = r6.f274368h     // Catch:{ all -> 0x06ef }
            if (r11 == 0) goto L_0x06ed
            r11.mo142513a(r7)     // Catch:{ all -> 0x06ef }
        L_0x06ed:
            r6.f274367g = r7     // Catch:{ all -> 0x06ef }
        L_0x06ef:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)     // Catch:{ all -> 0x06fc }
            goto L_0x06fc
        L_0x06f3:
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r0 = r1.f293422C     // Catch:{ all -> 0x06fc }
            if (r0 == 0) goto L_0x06fc
            r6 = 8
            r0.setVisibility(r6)     // Catch:{ all -> 0x06fc }
        L_0x06fc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r1.f293412e
            java.lang.String r5 = "fillRollViewInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            java.lang.String r6 = "shouldShowRollView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x071e
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r0.getAdXml()     // Catch:{ all -> 0x079f }
            if (r7 == 0) goto L_0x071e
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r0.getAdXml()     // Catch:{ all -> 0x079f }
            co2.p r7 = r7.adRollInfo     // Catch:{ all -> 0x079f }
            if (r7 == 0) goto L_0x071e
            r7 = 1
            goto L_0x071f
        L_0x071e:
            r7 = 0
        L_0x071f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)     // Catch:{ all -> 0x079f }
            if (r7 == 0) goto L_0x0795
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()     // Catch:{ all -> 0x079f }
            co2.p r0 = r0.adRollInfo     // Catch:{ all -> 0x079f }
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout r6 = r1.f293430K     // Catch:{ all -> 0x079f }
            if (r6 != 0) goto L_0x0748
            android.view.View r6 = r1.f293413f     // Catch:{ all -> 0x079f }
            r7 = 2131296647(0x7f090187, float:1.8211217E38)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ all -> 0x079f }
            android.view.ViewStub r6 = (android.view.ViewStub) r6     // Catch:{ all -> 0x079f }
            if (r6 == 0) goto L_0x0748
            android.view.View r6 = rq2.C101432s.m133125g(r6)     // Catch:{ all -> 0x079f }
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout r6 = (com.tencent.p014mm.plugin.sns.p104ad.widget.living.LivingDescBarLayout) r6     // Catch:{ all -> 0x079f }
            r1.f293430K = r6     // Catch:{ all -> 0x079f }
            java.lang.String r6 = "inflate the rollTextBar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)     // Catch:{ all -> 0x079f }
        L_0x0748:
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout r6 = r1.f293430K     // Catch:{ all -> 0x079f }
            if (r6 == 0) goto L_0x078b
            if (r0 != 0) goto L_0x074f
            goto L_0x078b
        L_0x074f:
            jq2.t r7 = r1.f293431L     // Catch:{ all -> 0x079f }
            if (r7 != 0) goto L_0x075a
            jq2.t r7 = new jq2.t     // Catch:{ all -> 0x079f }
            r7.<init>(r6)     // Catch:{ all -> 0x079f }
            r1.f293431L = r7     // Catch:{ all -> 0x079f }
        L_0x075a:
            jq2.t r6 = r1.f293431L     // Catch:{ all -> 0x079f }
            r6.getClass()     // Catch:{ all -> 0x079f }
            java.lang.String r7 = "setAdRollInfo"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)     // Catch:{ all -> 0x079f }
            r6.f173474b = r0     // Catch:{ all -> 0x079f }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch:{ all -> 0x079f }
            jq2.t r0 = r1.f293431L     // Catch:{ all -> 0x079f }
            r0.mo85785b()     // Catch:{ all -> 0x079f }
            jq2.t r0 = r1.f293431L     // Catch:{ all -> 0x079f }
            r0.mo85787d()     // Catch:{ all -> 0x079f }
            jq2.t r0 = r1.f293431L     // Catch:{ all -> 0x079f }
            r0.mo85788e()     // Catch:{ all -> 0x079f }
            android.content.Context r0 = r1.f293445o     // Catch:{ all -> 0x079f }
            boolean r0 = vr2.C102260r.m134842K(r0)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x07a7
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout r0 = r1.f293430K     // Catch:{ all -> 0x079f }
            r6 = 8
            r0.setVisibility(r6)     // Catch:{ all -> 0x079f }
            goto L_0x07a7
        L_0x078b:
            java.lang.String r0 = "the rollingBar or adRollInfo is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x079f }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x07aa
        L_0x0795:
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout r0 = r1.f293430K     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x07a7
            r6 = 8
            r0.setVisibility(r6)     // Catch:{ all -> 0x079f }
            goto L_0x07a7
        L_0x079f:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x07a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x07aa:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100167e.mo139454g():void");
    }

    /* renamed from: h */
    public final void mo139460h(C92445n nVar, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (FinderLivingAnimWrapper.m120030e(nVar, z)) {
            if (this.f293433N == null) {
                this.f293433N = (FinderLivingAnimWrapper) this.f293432M.inflate();
            }
            if (this.f293433N != null) {
                MMHandlerThread.postToMainThreadDelayed(new C100171d(nVar, str), 150);
            }
        } else {
            FinderLivingAnimWrapper finderLivingAnimWrapper = this.f293433N;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    /* renamed from: i */
    public final void mo139461i(SnsInfo snsInfo) {
        ViewStub viewStub;
        ViewStub viewStub2;
        SnsMethodCalculate.markStartTimeMs("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            if (mo139459c(snsInfo)) {
                TimeLineObject timeLine = snsInfo.getTimeLine();
                if (this.f293428I == null && (viewStub2 = (ViewStub) this.f293413f.findViewById(C0966R.C0970id.f5555i9)) != null) {
                    this.f293428I = (ViewGroup) C101432s.m133125g(viewStub2);
                }
                if (this.f293427H == null && (viewStub = (ViewStub) this.f293413f.findViewById(C0966R.C0970id.f5552i6)) != null) {
                    this.f293427H = (LivingDescBarLayout) C101432s.m133125g(viewStub);
                }
                ViewGroup viewGroup = this.f293428I;
                if (viewGroup != null) {
                    LivingDescBarLayout livingDescBarLayout = this.f293427H;
                    if (livingDescBarLayout != null) {
                        if (this.f293429J == null) {
                            this.f293429J = new C94764b(viewGroup, livingDescBarLayout, this.f293425F);
                        }
                        if (!(timeLine == null || this.f293429J == null)) {
                            C92445n nVar = snsInfo.getAdXml().adLiveInfo;
                            int c = C94762a.m120036c(timeLine.f283893Id, nVar.f264555a);
                            this.f293429J.mo130559g(timeLine.f283893Id, nVar);
                            this.f293429J.mo130560h(c);
                            C94762a.m120034a(timeLine.f283893Id, this.f293429J);
                            if (!C54550e.m61296a(snsInfo)) {
                                C97354d.m125367c(this.f293445o).mo136623b(1, snsInfo);
                            }
                            mo139460h(nVar, timeLine.f283893Id, C94764b.m120042f(c));
                        }
                        if (C102260r.m134842K(this.f293445o)) {
                            this.f293427H.setVisibility(8);
                        }
                    }
                }
                Log.m105920e("MicroMsg.CardAdDetailItemView", "the livingStatusLayout or livingDescBar is null!!");
                SnsMethodCalculate.markEndTimeMs("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                return;
            }
            ViewGroup viewGroup2 = this.f293428I;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            LivingDescBarLayout livingDescBarLayout2 = this.f293427H;
            if (livingDescBarLayout2 != null) {
                livingDescBarLayout2.setVisibility(8);
            }
            FinderLivingAnimWrapper finderLivingAnimWrapper = this.f293433N;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.CardAdDetailItemView", "fillLivingViewInfo, exp=" + android.util.Log.getStackTraceString(th));
        }
        SnsMethodCalculate.markEndTimeMs("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    /* renamed from: j */
    public final void mo139462j(SnsInfo snsInfo) {
        int b;
        SnsMethodCalculate.markStartTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (snsInfo == null || !snsInfo.isCardAd()) {
            SnsMethodCalculate.markEndTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        int color = this.f293445o.getResources().getColor(C0966R.color.f3144gt);
        int color2 = this.f293445o.getResources().getColor(C0966R.color.BW_0_Alpha_0_2);
        Button button = this.f293449s;
        if (button == null || this.f293450t == null) {
            SnsMethodCalculate.markEndTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        button.setOnClickListener(this.f293418n.f280363S);
        this.f293450t.setOnClickListener(this.f293418n.f280364T);
        boolean z = false;
        if (!snsInfo.getAdXml().hasVoteInfo() || (b = C100417r0.m131413b(snsInfo.getAdXml().adVoteInfo.f275731a, snsInfo.getUxinfo())) <= 0 || b > 2) {
            z = true;
        } else if (b == 1) {
            this.f293450t.setTextColor(color2);
            this.f293450t.setText(snsInfo.getAdXml().adVoteInfo.mo131458a(1));
            this.f293449s.setTextColor(color);
            this.f293449s.setText(snsInfo.getAdXml().adVoteInfo.mo131459b(0));
        } else if (b == 2) {
            this.f293449s.setTextColor(color2);
            this.f293449s.setText(snsInfo.getAdXml().adVoteInfo.mo131458a(0));
            this.f293450t.setTextColor(color);
            this.f293450t.setText(snsInfo.getAdXml().adVoteInfo.mo131459b(1));
        }
        if (z) {
            this.f293449s.setTextColor(color);
            this.f293450t.setTextColor(color);
            this.f293449s.setText(snsInfo.getAdXml().getCardSelectLeftTitle());
            this.f293450t.setText(snsInfo.getAdXml().getCardSelectRightTitle());
        }
        SnsMethodCalculate.markEndTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }
}

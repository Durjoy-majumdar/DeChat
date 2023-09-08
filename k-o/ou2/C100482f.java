package ou2;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58052j1;
import fy3.C32224a;
import fy3.C32230s;
import gy3.C24565l;
import gy3.C8478d0;
import gy3.C87413o;
import os2.C100397a;

/* renamed from: ou2.f */
public final class C100482f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C100478e f294382d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f294383e;

    /* renamed from: ou2.f$a */
    public static final class C100483a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C100478e f294384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100483a(C100478e eVar) {
            super(0);
            this.f294384d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$1");
            View q = this.f294384d.mo139978q();
            Integer valueOf = Integer.valueOf(q != null ? q.getHeight() : 0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$1");
            return valueOf;
        }
    }

    /* renamed from: ou2.f$b */
    public /* synthetic */ class C100484b extends C24565l implements C32230s<Double, Integer, C100397a, Integer, Integer, FrameLayout.LayoutParams> {
        public C100484b(Object obj) {
            super(5, obj, C100478e.class, "getClickAreaLayoutParams", "getClickAreaLayoutParams(DILcom/tencent/mm/plugin/sns/storage/AdBreakFrameClickInfo;II)Landroid/widget/FrameLayout$LayoutParams;", 0);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            String str;
            String str2;
            FrameLayout.LayoutParams layoutParams;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2");
            double doubleValue = ((Number) obj).doubleValue();
            int intValue = ((Number) obj2).intValue();
            C100397a aVar = (C100397a) obj3;
            int intValue2 = ((Number) obj4).intValue();
            int intValue3 = ((Number) obj5).intValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2");
            C100478e eVar = (C100478e) this.receiver;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((C58052j1) eVar.f294376l.mo139967h()).getValue();
            if (aVar == null || layoutParams2 == null) {
                str2 = "invoke";
                str = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2";
                layoutParams = new FrameLayout.LayoutParams(0, 0);
                SnsMethodCalculate.markEndTimeMs("getClickAreaLayoutParams", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            } else {
                SnsMethodCalculate.markStartTimeMs("getAreaWidth", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                int i = aVar.f294077c;
                SnsMethodCalculate.markEndTimeMs("getAreaWidth", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                int i2 = (int) (((double) i) * doubleValue);
                SnsMethodCalculate.markStartTimeMs("getAreaHeight", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                int i3 = aVar.f294078d;
                SnsMethodCalculate.markEndTimeMs("getAreaHeight", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                int i4 = (int) (((double) i3) * doubleValue);
                SnsMethodCalculate.markStartTimeMs("getAreaLeft", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                int i5 = aVar.f294075a;
                SnsMethodCalculate.markEndTimeMs("getAreaLeft", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                str2 = "invoke";
                str = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1$onPreDraw$2";
                int i6 = (int) (((double) i5) * doubleValue);
                SnsMethodCalculate.markStartTimeMs("getAreaTop", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                int i7 = aVar.f294076b;
                SnsMethodCalculate.markEndTimeMs("getAreaTop", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                String str3 = "getClickAreaLayoutParams";
                String str4 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness";
                int i8 = ((int) (((double) i7) * doubleValue)) + intValue3;
                int i9 = (intValue - i4) - i8;
                if (i9 < intValue2) {
                    i4 -= intValue2 - i9;
                }
                layoutParams = new FrameLayout.LayoutParams(i2, i4);
                layoutParams.leftMargin = i6 + layoutParams2.leftMargin;
                layoutParams.topMargin = i8 + layoutParams2.rightMargin;
                SnsMethodCalculate.markEndTimeMs(str3, str4);
            }
            String str5 = str2;
            String str6 = str;
            SnsMethodCalculate.markEndTimeMs(str5, str6);
            SnsMethodCalculate.markEndTimeMs(str5, str6);
            return layoutParams;
        }
    }

    public C100482f(C100478e eVar, C8478d0 d0Var) {
        this.f294382d = eVar;
        this.f294383e = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "onPreDraw"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness$triggerReadyToMeasureViews$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            ou2.e r3 = r0.f294382d
            r3.getClass()
            java.lang.String r4 = "getBreakType"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            int r3 = r3.f294375k
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r4 = "access$getMWrapHolder$p$s-274574479"
            r6 = 2
            r7 = 1
            r8 = 0
            java.lang.String r9 = "BreakFrameAdBusiness"
            if (r3 != r7) goto L_0x005b
            ou2.e r3 = r0.f294382d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            nq2.a$d r3 = r3.f293576c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r3 == 0) goto L_0x0045
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r3 = r3.f293348D
            if (r3 == 0) goto L_0x0045
            java.lang.String r10 = "isHasLayouted"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            boolean r3 = r3.f274312S
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            if (r3 != r7) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r3 == 0) goto L_0x005b
            gy3.d0 r3 = r0.f294383e
            int r10 = r3.f27483d
            int r10 = r10 + r7
            r3.f27483d = r10
            if (r10 >= r6) goto L_0x005b
            java.lang.String r3 = "onPreDraw() try next"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r7
        L_0x005b:
            ou2.e r3 = r0.f294382d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            nq2.a$d r3 = r3.f293576c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            if (r3 == 0) goto L_0x0074
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r3 = r3.f293370o
            if (r3 == 0) goto L_0x0074
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            if (r3 == 0) goto L_0x0074
            r3.removeOnPreDrawListener(r0)
        L_0x0074:
            ou2.e r3 = r0.f294382d
            java.lang.String r4 = "access$calViewLocation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r3.getClass()
            java.lang.String r10 = "calViewLocation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r5)
            java.lang.String r11 = "calVideoContainerLocation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r5)
            android.view.View r12 = r3.mo139978q()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            if (r12 == 0) goto L_0x0202
            nq2.a$d r15 = r3.f293576c
            if (r15 == 0) goto L_0x0099
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r14 = r15.f293370o
            goto L_0x009a
        L_0x0099:
            r14 = 0
        L_0x009a:
            if (r14 == 0) goto L_0x0202
            if (r15 == 0) goto L_0x00a1
            android.view.View r14 = r15.f293377v
            goto L_0x00a2
        L_0x00a1:
            r14 = 0
        L_0x00a2:
            if (r14 != 0) goto L_0x00a6
            goto L_0x0202
        L_0x00a6:
            int[] r13 = new int[r6]
            r12.getLocationOnScreen(r13)
            int[] r14 = new int[r6]
            nq2.a$d r15 = r3.f293576c
            if (r15 == 0) goto L_0x00b8
            android.view.View r15 = r15.f293377v
            if (r15 == 0) goto L_0x00b8
            r15.getLocationOnScreen(r14)
        L_0x00b8:
            int[] r15 = new int[r6]
            nq2.a$d r6 = r3.f293576c
            if (r6 == 0) goto L_0x00c5
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r6 = r6.f293370o
            if (r6 == 0) goto L_0x00c5
            r6.getLocationOnScreen(r15)
        L_0x00c5:
            nq2.a$d r6 = r3.f293576c
            if (r6 == 0) goto L_0x00d2
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r6 = r6.f293370o
            if (r6 == 0) goto L_0x00d2
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x00d3
        L_0x00d2:
            r6 = 0
        L_0x00d3:
            r7 = r15[r8]
            if (r6 == 0) goto L_0x0100
            java.lang.String r8 = "setLeftMarginOff"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
            r18 = r1
            boolean r1 = r6 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L_0x00ee
            r1 = r6
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r19 = r2
            int r2 = r1.leftMargin
            int r2 = r2 - r7
            r1.leftMargin = r2
            goto L_0x00fc
        L_0x00ee:
            r19 = r2
            boolean r1 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r1 == 0) goto L_0x00fc
            r1 = r6
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            int r2 = r1.leftMargin
            int r2 = r2 - r7
            r1.leftMargin = r2
        L_0x00fc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
            goto L_0x0104
        L_0x0100:
            r18 = r1
            r19 = r2
        L_0x0104:
            r1 = 1
            r2 = r15[r1]
            r8 = r14[r1]
            int r2 = r2 - r8
            if (r6 == 0) goto L_0x012e
            java.lang.String r1 = "setTopMarginOff"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            boolean r8 = r6 instanceof android.widget.FrameLayout.LayoutParams
            if (r8 == 0) goto L_0x011f
            r8 = r6
            android.widget.FrameLayout$LayoutParams r8 = (android.widget.FrameLayout.LayoutParams) r8
            int r15 = r8.topMargin
            int r15 = r15 - r2
            r8.topMargin = r15
            goto L_0x012b
        L_0x011f:
            boolean r8 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r8 == 0) goto L_0x012b
            r8 = r6
            android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8
            int r15 = r8.topMargin
            int r15 = r15 - r2
            r8.topMargin = r15
        L_0x012b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
        L_0x012e:
            r1 = 1
            r8 = r13[r1]
            int r12 = r12.getHeight()
            int r8 = r8 + r12
            if (r6 != 0) goto L_0x0139
            goto L_0x013e
        L_0x0139:
            r12 = r14[r1]
            int r8 = r8 - r12
            r6.height = r8
        L_0x013e:
            android.app.Activity r1 = r3.f293574a
            if (r1 == 0) goto L_0x014a
            java.lang.String r8 = "window"
            java.lang.Object r1 = r1.getSystemService(r8)
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            boolean r8 = r1 instanceof android.view.WindowManager
            if (r8 == 0) goto L_0x0152
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r1 == 0) goto L_0x0160
            android.view.Display r1 = r1.getDefaultDisplay()
            if (r1 == 0) goto L_0x0160
            int r1 = r1.getWidth()
            goto L_0x0161
        L_0x0160:
            r1 = 0
        L_0x0161:
            if (r6 != 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r6.width = r1
        L_0x0166:
            nq2.a$d r1 = r3.f293576c
            if (r1 == 0) goto L_0x0173
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r1 = r1.f293370o
            if (r1 == 0) goto L_0x0173
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0174
        L_0x0173:
            r1 = 0
        L_0x0174:
            boolean r6 = r1 instanceof android.widget.FrameLayout
            if (r6 == 0) goto L_0x01ca
            int r6 = r3.mo139979r()
            r8 = 1
            if (r6 == r8) goto L_0x0186
            int r6 = r3.mo139979r()
            r8 = 2
            if (r6 != r8) goto L_0x01ca
        L_0x0186:
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            int r6 = r6.height
            r8 = -1
            if (r6 != 0) goto L_0x0197
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            r6.height = r8
        L_0x0197:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            int r6 = r6.width
            if (r6 != 0) goto L_0x01a5
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            r6.width = r8
        L_0x01a5:
            android.view.ViewParent r6 = r1.getParent()
            boolean r8 = r6 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x01b0
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x01b1
        L_0x01b0:
            r6 = 0
        L_0x01b1:
            r8 = 0
            if (r6 != 0) goto L_0x01b5
            goto L_0x01b8
        L_0x01b5:
            r6.setClipChildren(r8)
        L_0x01b8:
            android.view.ViewParent r1 = r1.getParent()
            boolean r6 = r1 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x01c3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            if (r1 != 0) goto L_0x01c7
            goto L_0x01ca
        L_0x01c7:
            r1.setClipToPadding(r8)
        L_0x01ca:
            nq2.a$d r1 = r3.f293576c
            if (r1 == 0) goto L_0x01d5
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r1 = r1.f293370o
            if (r1 == 0) goto L_0x01d5
            r1.requestLayout()
        L_0x01d5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "currentOffLeft, currentOffTop = "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ", "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            rx3.l r1 = new rx3.l
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r6, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
            goto L_0x020e
        L_0x0202:
            r18 = r1
            r19 = r2
            rx3.l r1 = new rx3.l
            r1.<init>(r13, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r5)
        L_0x020e:
            A r2 = r1.f38555d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            B r1 = r1.f38556e
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r6 = "calControlViewLocation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            nq2.a$d r7 = r3.f293576c
            if (r7 == 0) goto L_0x0233
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r7 = r7.f293370o
            if (r7 == 0) goto L_0x0233
            r8 = 2131313773(0x7f09446d, float:1.8245952E38)
            android.view.View r7 = r7.findViewById(r8)
            goto L_0x0234
        L_0x0233:
            r7 = 0
        L_0x0234:
            r8 = 2
            int[] r11 = new int[r8]
            nq2.a$d r12 = r3.f293576c
            if (r12 == 0) goto L_0x0242
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r12 = r12.f293370o
            if (r12 == 0) goto L_0x0242
            r12.getLocationOnScreen(r11)
        L_0x0242:
            int[] r12 = new int[r8]
            nq2.a$d r8 = r3.f293576c
            if (r8 == 0) goto L_0x024f
            android.view.View r8 = r8.f293379x
            if (r8 == 0) goto L_0x024f
            r8.getLocationOnScreen(r12)
        L_0x024f:
            if (r7 == 0) goto L_0x0256
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            goto L_0x0257
        L_0x0256:
            r8 = 0
        L_0x0257:
            boolean r13 = r8 instanceof android.widget.FrameLayout.LayoutParams
            if (r13 == 0) goto L_0x025e
            android.widget.FrameLayout$LayoutParams r8 = (android.widget.FrameLayout.LayoutParams) r8
            goto L_0x025f
        L_0x025e:
            r8 = 0
        L_0x025f:
            if (r8 != 0) goto L_0x0265
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            goto L_0x029d
        L_0x0265:
            r13 = 0
            r14 = r12[r13]
            r15 = r11[r13]
            int r14 = r14 - r15
            int r14 = r14 + r2
            r8.leftMargin = r14
            r13 = 1
            r12 = r12[r13]
            r11 = r11[r13]
            int r12 = r12 - r11
            int r12 = r12 + r1
            r8.topMargin = r12
            nq2.a$d r11 = r3.f293576c
            if (r11 == 0) goto L_0x0284
            android.view.View r11 = r11.f293379x
            if (r11 == 0) goto L_0x0284
            int r11 = r11.getWidth()
            goto L_0x0285
        L_0x0284:
            r11 = 0
        L_0x0285:
            r8.width = r11
            nq2.a$d r11 = r3.f293576c
            if (r11 == 0) goto L_0x0294
            android.view.View r11 = r11.f293379x
            if (r11 == 0) goto L_0x0294
            int r11 = r11.getHeight()
            goto L_0x0295
        L_0x0294:
            r11 = 0
        L_0x0295:
            r8.height = r11
            r7.requestLayout()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
        L_0x029d:
            java.lang.String r6 = "calVideoViewLocation"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            nq2.a$d r7 = r3.f293576c
            if (r7 == 0) goto L_0x02a9
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r8 = r7.f293370o
            goto L_0x02aa
        L_0x02a9:
            r8 = 0
        L_0x02aa:
            if (r8 != 0) goto L_0x02b0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            goto L_0x02cb
        L_0x02b0:
            r8 = 2
            int[] r11 = new int[r8]
            int[] r12 = new int[r8]
            if (r7 == 0) goto L_0x02be
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView r7 = r7.f293370o
            if (r7 == 0) goto L_0x02be
            r7.getLocationOnScreen(r11)
        L_0x02be:
            nq2.a$d r3 = r3.f293576c
            if (r3 == 0) goto L_0x02c5
            android.view.View r3 = r3.f293379x
            goto L_0x02c6
        L_0x02c5:
            r3 = 0
        L_0x02c6:
            if (r3 != 0) goto L_0x02d4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
        L_0x02cb:
            r16 = r4
            r1 = r5
            r17 = r9
            r2 = r10
            r14 = 0
            goto L_0x039c
        L_0x02d4:
            r7 = 2
            int[] r7 = new int[r7]
            int r8 = r3.getWidth()
            r13 = 0
            r7[r13] = r8
            int r8 = r3.getHeight()
            r13 = 1
            r7[r13] = r8
            r13 = 4654048002422341632(0x4096800000000000, double:1440.0)
            int r8 = r3.getWidth()
            r16 = r4
            r15 = r5
            double r4 = (double) r8
            double r4 = r4 * r13
            r13 = 4651655465120301056(0x408e000000000000, double:960.0)
            double r4 = r4 / r13
            int r4 = (int) r4
            r20 = 4652464705678344192(0x4090e00000000000, double:1080.0)
            int r5 = r3.getHeight()
            double r13 = (double) r5
            double r13 = r13 * r20
            r20 = 4649544402794971136(0x4086800000000000, double:720.0)
            double r13 = r13 / r20
            int r5 = (int) r13
            r3.getLocationOnScreen(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "contentContainer wh = "
            r8.append(r13)
            r13 = 0
            r14 = r7[r13]
            r8.append(r14)
            r14 = 58
            r8.append(r14)
            r17 = 1
            r7 = r7[r17]
            r8.append(r7)
            java.lang.String r7 = "  "
            r8.append(r7)
            r7 = r11[r13]
            r8.append(r7)
            r8.append(r14)
            r7 = r11[r17]
            r8.append(r7)
            r7 = 32
            r8.append(r7)
            r7 = r12[r13]
            r8.append(r7)
            r8.append(r14)
            r7 = r12[r17]
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            r7 = 4646448178051153920(0x407b800000000000, double:440.0)
            int r13 = r3.getWidth()
            double r13 = (double) r13
            double r13 = r13 * r7
            r7 = 4651655465120301056(0x408e000000000000, double:960.0)
            double r13 = r13 / r7
            r7 = 4639657594238009344(0x4063600000000000, double:155.0)
            int r3 = r3.getHeight()
            r17 = r9
            r22 = r10
            double r9 = (double) r3
            double r9 = r9 * r7
            double r9 = r9 / r20
            r3 = 0
            r7 = r12[r3]
            r8 = r11[r3]
            int r7 = r7 - r8
            int r7 = r7 + r2
            double r2 = (double) r7
            double r13 = r13 - r2
            double r2 = -r13
            r7 = 1
            r8 = r12[r7]
            r11 = r11[r7]
            int r8 = r8 - r11
            int r8 = r8 + r1
            double r7 = (double) r8
            double r9 = r9 - r7
            double r7 = -r9
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            r14.<init>(r4, r5)
            int r1 = (int) r7
            r14.topMargin = r1
            int r1 = (int) r2
            r14.leftMargin = r1
            r1 = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            r2 = r22
        L_0x039c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r2 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            ou2.e r2 = r0.f294382d
            ou2.b r2 = r2.mo139977p()
            ou2.f$a r3 = new ou2.f$a
            ou2.e r4 = r0.f294382d
            r3.<init>(r4)
            r2.getClass()
            java.lang.String r4 = "setShowCommentHeight"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f294318h = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            ou2.e r2 = r0.f294382d
            ou2.b r2 = r2.mo139977p()
            ou2.f$b r3 = new ou2.f$b
            ou2.e r4 = r0.f294382d
            r3.<init>(r4)
            r2.getClass()
            java.lang.String r4 = "setGetClickAreaLayoutParams"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r2.f294319i = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            ou2.e r2 = r0.f294382d
            ou2.b r2 = r2.mo139977p()
            d14.u0 r2 = r2.mo139967h()
            d14.j1 r2 = (d14.C58052j1) r2
            r2.setValue(r14)
            ou2.e r2 = r0.f294382d
            r2.getClass()
            java.lang.String r3 = "setHasSetOnPreDrawListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            r4 = 0
            r2.f294378n = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            java.lang.String r1 = "onPreDraw() called"
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = r18
            r2 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100482f.onPreDraw():boolean");
    }
}

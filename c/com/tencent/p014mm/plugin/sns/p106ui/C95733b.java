package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gq2.C98175d;
import j20.C117292a;
import jp2.C98963o;
import js2.C99020a;
import k20.C60958c;
import k20.C9556a;
import vr2.C102244f;

/* renamed from: com.tencent.mm.plugin.sns.ui.b */
public class C95733b {

    /* renamed from: a */
    public Context f279208a;

    /* renamed from: b */
    public TimelineClickListener f279209b;

    /* renamed from: c */
    public FrameLayout f279210c;

    /* renamed from: d */
    public C98963o f279211d;

    /* renamed from: e */
    public AbsoluteLayout f279212e = null;

    /* renamed from: f */
    public Animation f279213f;

    /* renamed from: g */
    public Animation f279214g;

    /* renamed from: h */
    public boolean f279215h = false;

    /* renamed from: i */
    public C99020a f279216i;

    /* renamed from: j */
    public boolean f279217j = false;

    /* renamed from: k */
    public C98175d f279218k;

    /* renamed from: l */
    public TextView f279219l;

    /* renamed from: m */
    public ListView f279220m;

    /* renamed from: n */
    public View f279221n;

    /* renamed from: o */
    public int f279222o = -1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.b$a */
    public class C95734a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f279223d;

        /* renamed from: e */
        public final /* synthetic */ View f279224e;

        public C95734a(View view, View view2) {
            this.f279223d = view;
            this.f279224e = view2;
        }

        public void run() {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$1");
            C95733b bVar = C95733b.this;
            View view = this.f279223d;
            View view2 = this.f279224e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("initCommentView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            String str = "run";
            C102244f fVar = (C102244f) view.getTag();
            String str2 = "initCommentView";
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar.f279215h = true;
            bVar.f279213f.setAnimationListener(new C43102c(bVar));
            view2.startAnimation(bVar.f279213f);
            TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f5574ir);
            bVar.f279219l = textView;
            C102244f fVar2 = fVar;
            textView.setTag(fVar2);
            C96071m8 m8Var = fVar2.f301107a;
            if (m8Var == null || m8Var.f280526j == null) {
                z = false;
            } else {
                ADInfo aDInfo = m8Var.f280527k;
                String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
                String str3 = "zh_CN".equals(currentLanguage) ? aDInfo.adDislikeInfoTitle_cn : ("zh_TW".equals(currentLanguage) || "zh_HK".equals(currentLanguage)) ? aDInfo.adDislikeInfoTitle_tw : aDInfo.adDislikeInfoTitle_en;
                if (!Util.isNullOrNil(str3)) {
                    bVar.f279219l.setText(str3);
                }
                z = aDInfo.forbidClick;
            }
            ListView listView = (ListView) view2.findViewById(C0966R.C0970id.f5569im);
            bVar.f279220m = listView;
            listView.setAdapter(new C95762e(bVar.f279208a, (C102244f) view.getTag()));
            if (z) {
                bVar.f279220m.setClickable(false);
                bVar.f279220m.setOnItemClickListener((AdapterView.OnItemClickListener) null);
            } else {
                bVar.f279220m.setClickable(true);
                bVar.f279220m.setOnItemClickListener(bVar.f279209b.f280361Q);
            }
            bVar.f279219l.setClickable(false);
            bVar.f279221n = view2;
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.b$b */
    public class C95735b extends Animation {

        /* renamed from: d */
        public final /* synthetic */ int f279226d;

        /* renamed from: e */
        public final /* synthetic */ int f279227e;

        public C95735b(int i, int i2) {
            this.f279226d = i;
            this.f279227e = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            SnsMethodCalculate.markStartTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
            ((RelativeLayout.LayoutParams) C95733b.this.f279220m.getLayoutParams()).bottomMargin = f == 1.0f ? 0 : (int) (((float) (this.f279226d - this.f279227e)) * (1.0f - f));
            C95733b.this.f279220m.requestLayout();
            SnsMethodCalculate.markEndTimeMs("applyTransformation", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
        }

        public boolean willChangeBounds() {
            SnsMethodCalculate.markStartTimeMs("willChangeBounds", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
            SnsMethodCalculate.markEndTimeMs("willChangeBounds", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.b$c */
    public class C95736c {

        /* renamed from: a */
        public View f279229a;

        public C95736c(C95733b bVar, String str, View view) {
            this.f279229a = view;
        }
    }

    public C95733b(Context context, TimelineClickListener timelineClickListener, FrameLayout frameLayout, View view, C99020a aVar) {
        C98175d dVar = null;
        this.f279208a = context;
        this.f279216i = aVar;
        this.f279209b = timelineClickListener;
        this.f279210c = frameLayout;
        this.f279213f = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f279213f = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2368b5);
        this.f279214g = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f279214g = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2369b6);
        SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        if (context != null) {
            try {
                C98175d dVar2 = new C98175d(context);
                try {
                    SnsMethodCalculate.markStartTimeMs("setTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                    dVar2.f287839i = timelineClickListener;
                    SnsMethodCalculate.markEndTimeMs("setTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                    dVar = dVar2;
                } catch (Throwable unused) {
                    dVar = dVar2;
                    Log.m105928w("FeedbackPromptManager", "create new feedback panel failed!");
                    SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                    this.f279218k = dVar;
                }
            } catch (Throwable unused2) {
                Log.m105928w("FeedbackPromptManager", "create new feedback panel failed!");
                SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                this.f279218k = dVar;
            }
        }
        SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        this.f279218k = dVar;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m122540a(C95733b bVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        bVar.f279215h = z;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo133176b(android.view.View r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "addUnLikeView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            js2.c r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Qx0()
            r4.getClass()
            java.lang.String r4 = "isAbTestRunner"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r4 = 1
            r5 = 0
            java.lang.Object r6 = r22.getTag()     // Catch:{ all -> 0x004a }
            boolean r7 = r6 instanceof vr2.C102244f     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x004b
            os2.e0 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ all -> 0x004a }
            vr2.f r6 = (vr2.C102244f) r6     // Catch:{ all -> 0x004a }
            java.lang.String r6 = r6.f301109c     // Catch:{ all -> 0x004a }
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r7.mo139798DN(r6)     // Catch:{ all -> 0x004a }
            jp2.o r7 = r0.f279211d     // Catch:{ all -> 0x004a }
            rq2.q$a r7 = hq2.C98496b.m127947c(r6, r5, r1, r7)     // Catch:{ all -> 0x004a }
            rq2.C63505q.m74843b(r7)     // Catch:{ all -> 0x004a }
            gq2.d r7 = r0.f279218k     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x004b
            boolean r6 = r7.mo137478k(r1, r6)     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x004b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x004a:
        L_0x004b:
            boolean r6 = r0.f279215h
            if (r6 == 0) goto L_0x0053
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x0053:
            android.widget.AbsoluteLayout r6 = r0.f279212e
            if (r6 == 0) goto L_0x008a
            java.lang.Object r1 = r6.getTag()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.C95733b.C95736c
            if (r1 == 0) goto L_0x0083
            android.widget.AbsoluteLayout r1 = r0.f279212e
            java.lang.Object r1 = r1.getTag()
            com.tencent.mm.plugin.sns.ui.b$c r1 = (com.tencent.p014mm.plugin.sns.p106ui.C95733b.C95736c) r1
            android.view.View r1 = r1.f279229a
            java.lang.String r6 = "closeAdUnLikeView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            r0.f279215h = r4
            android.view.animation.Animation r4 = r0.f279214g
            r1.startAnimation(r4)
            android.view.animation.Animation r4 = r0.f279214g
            com.tencent.mm.plugin.sns.ui.d r7 = new com.tencent.mm.plugin.sns.ui.d
            r7.<init>(r0, r1)
            r4.setAnimationListener(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x0086
        L_0x0083:
            r21.mo133177c()
        L_0x0086:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x008a:
            java.lang.Object r6 = r22.getTag()
            if (r6 == 0) goto L_0x0253
            java.lang.Object r6 = r22.getTag()
            boolean r6 = r6 instanceof vr2.C102244f
            if (r6 != 0) goto L_0x009a
            goto L_0x0253
        L_0x009a:
            java.lang.Object r6 = r22.getTag()
            vr2.f r6 = (vr2.C102244f) r6
            java.lang.String r7 = r6.f301109c
            android.widget.AbsoluteLayout r8 = new android.widget.AbsoluteLayout
            android.content.Context r9 = r0.f279208a
            r8.<init>(r9)
            r0.f279212e = r8
            r9 = 2131296700(0x7f0901bc, float:1.8211324E38)
            r8.setId(r9)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r8.<init>(r9, r9)
            android.widget.FrameLayout r8 = r0.f279210c
            android.widget.AbsoluteLayout r9 = r0.f279212e
            r8.addView(r9)
            android.content.Context r8 = r0.f279208a
            r9 = 1125515264(0x43160000, float:150.0)
            int r8 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r8, r9)
            android.content.Context r9 = r0.f279208a
            r10 = 1099431936(0x41880000, float:17.0)
            int r9 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r9, r10)
            android.content.Context r10 = r0.f279208a
            r11 = 1109393408(0x42200000, float:40.0)
            com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r10, r11)
            android.content.Context r10 = r0.f279208a
            android.view.LayoutInflater r10 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r10)
            r11 = 2131493007(0x7f0c008f, float:1.8609482E38)
            r12 = 0
            android.view.View r10 = r10.inflate(r11, r12)
            r11 = 2131296661(0x7f090195, float:1.8211245E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r12)
            com.tencent.mm.plugin.sns.ui.m8 r13 = r6.f301107a
            com.tencent.mm.plugin.sns.storage.ADXml r13 = r13.f280526j
            if (r13 == 0) goto L_0x012a
            java.lang.String r14 = "zh_CN"
            boolean r14 = r14.equals(r12)
            if (r14 == 0) goto L_0x0106
            java.lang.String r12 = r13.expandInsideTitle_cn
            goto L_0x011e
        L_0x0106:
            java.lang.String r14 = "zh_TW"
            boolean r14 = r14.equals(r12)
            if (r14 != 0) goto L_0x011c
            java.lang.String r14 = "zh_HK"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0119
            goto L_0x011c
        L_0x0119:
            java.lang.String r12 = r13.expandInsideTitle_en
            goto L_0x011e
        L_0x011c:
            java.lang.String r12 = r13.expandInsideTitle_tw
        L_0x011e:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x012a
            r11.setText(r12)
            r11.setClickable(r4)
        L_0x012a:
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.content.Context r11 = r0.f279208a
            int r11 = wc3.C78538u.m94866b(r11)
            com.tencent.mm.plugin.sns.ui.m8 r6 = r6.f301107a
            r6.getClass()
            java.lang.String r12 = "getAdViewLoction"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.TimeLineAdView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r14 = 2
            int[] r15 = new int[r14]
            android.widget.LinearLayout r14 = r6.f280517a
            r4 = 5
            if (r14 == 0) goto L_0x0166
            android.view.View r14 = r6.f280523g
            r14.getLocationInWindow(r15)
            r14 = r15[r5]
            android.view.View r5 = r6.f280523g
            int r5 = r5.getMeasuredWidth()
            android.view.View r6 = r6.f280523g
            android.content.Context r6 = r6.getContext()
            int r4 = kg3.C76577a.m92151b(r6, r4)
            int r5 = r5 + r4
            int r14 = r14 + r5
            r5 = 0
            r15[r5] = r14
            goto L_0x0185
        L_0x0166:
            android.view.View r14 = r6.f280523g
            if (r14 == 0) goto L_0x0185
            r14.getLocationInWindow(r15)
            r14 = r15[r5]
            android.view.View r5 = r6.f280523g
            int r5 = r5.getMeasuredWidth()
            android.view.View r6 = r6.f280523g
            android.content.Context r6 = r6.getContext()
            int r4 = kg3.C76577a.m92151b(r6, r4)
            int r5 = r5 + r4
            int r14 = r14 + r5
            r4 = 0
            r15[r4] = r14
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "addCommentView getLocationInWindow "
            r5.append(r6)
            r6 = r15[r4]
            r5.append(r6)
            java.lang.String r4 = "  "
            r5.append(r4)
            r4 = 1
            r6 = r15[r4]
            r5.append(r6)
            java.lang.String r4 = " height: "
            r5.append(r4)
            r5.append(r11)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MicroMsg.AdNotLikeHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
            android.content.Context r4 = r0.f279208a
            java.lang.String r5 = "getStatusBarHeight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            int r4 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            r0.f279222o = r4
            boolean r4 = r0.f279217j
            if (r4 == 0) goto L_0x01d3
            android.content.Context r4 = r0.f279208a
            r5 = 2
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r6 = 0
            r0.f279222o = r6
            goto L_0x01dc
        L_0x01d3:
            r5 = 2
            r6 = 0
            android.content.Context r4 = r0.f279208a
            int r4 = kg3.C76577a.m92151b(r4, r5)
            int r4 = r4 + r11
        L_0x01dc:
            r5 = r15[r6]
            int r5 = r5 - r8
            r6 = 1
            r8 = r15[r6]
            int r6 = r0.f279222o
            int r8 = r8 - r6
            int r8 = r8 - r4
            int r8 = r8 + r9
            android.widget.AbsoluteLayout$LayoutParams r4 = new android.widget.AbsoluteLayout$LayoutParams
            r6 = -2
            r4.<init>(r6, r6, r5, r8)
            com.tencent.mm.plugin.sns.ui.b$c r5 = new com.tencent.mm.plugin.sns.ui.b$c
            r5.<init>(r0, r7, r10)
            android.widget.AbsoluteLayout r6 = r0.f279212e
            r6.setTag(r5)
            android.widget.AbsoluteLayout r5 = r0.f279212e
            r5.addView(r10, r4)
            r4 = 8
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r4)
            java.lang.Object[] r14 = r5.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper"
            java.lang.String r16 = "addUnLikeView"
            java.lang.String r17 = "(Landroid/view/View;)Z"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r10
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r4 = 0
            java.lang.Object r4 = r5.mo10231a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r10.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper"
            java.lang.String r15 = "addUnLikeView"
            java.lang.String r16 = "(Landroid/view/View;)Z"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            r4 = 1
            r0.f279215h = r4
            com.tencent.mm.sdk.platformtools.MMHandler r5 = new com.tencent.mm.sdk.platformtools.MMHandler
            r5.<init>()
            com.tencent.mm.plugin.sns.ui.b$a r6 = new com.tencent.mm.plugin.sns.ui.b$a
            r6.<init>(r1, r10)
            r5.post(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0253:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95733b.mo133176b(android.view.View):boolean");
    }

    /* renamed from: c */
    public boolean mo133177c() {
        SnsMethodCalculate.markStartTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        if (this.f279216i != null) {
            C94866e1.Qx0().getClass();
            SnsMethodCalculate.markStartTimeMs("isAbTestRunner", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
            SnsMethodCalculate.markEndTimeMs("isAbTestRunner", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        }
        AbsoluteLayout absoluteLayout = this.f279212e;
        if (absoluteLayout != null) {
            this.f279210c.removeView(absoluteLayout);
            this.f279212e = null;
            SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return true;
        }
        this.f279215h = false;
        this.f279220m = null;
        this.f279221n = null;
        SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return false;
    }

    /* renamed from: d */
    public boolean mo133178d() {
        SnsMethodCalculate.markStartTimeMs("showUnLikeReasonList", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        int height = this.f279219l.getHeight();
        this.f279219l.setVisibility(8);
        View view = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f279220m.getAdapter().getCount(); i2++) {
            view = this.f279220m.getAdapter().getView(i2, view, (ViewGroup) null);
            view.measure(this.f279221n.getWidth(), -2);
            i += view.getMeasuredHeight();
        }
        ((RelativeLayout.LayoutParams) this.f279220m.getLayoutParams()).bottomMargin = height - i;
        this.f279220m.setVisibility(0);
        C95735b bVar = new C95735b(height, i);
        bVar.setDuration(250);
        this.f279220m.startAnimation(bVar);
        SnsMethodCalculate.markEndTimeMs("showUnLikeReasonList", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return true;
    }
}

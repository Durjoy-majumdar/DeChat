package gq2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C7021t1;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import vr2.C102244f;

/* renamed from: gq2.c */
public final class C98171c implements View.OnClickListener {

    /* renamed from: A */
    public C98174c f287805A;

    /* renamed from: B */
    public int f287806B;

    /* renamed from: C */
    public int f287807C;

    /* renamed from: D */
    public int f287808D;

    /* renamed from: E */
    public ViewGroup f287809E;

    /* renamed from: F */
    public boolean f287810F = false;

    /* renamed from: d */
    public Context f287811d;

    /* renamed from: e */
    public View f287812e;

    /* renamed from: f */
    public WeImageView f287813f;

    /* renamed from: g */
    public WeImageView f287814g;

    /* renamed from: h */
    public TextView f287815h;

    /* renamed from: i */
    public View f287816i;

    /* renamed from: j */
    public View f287817j;

    /* renamed from: n */
    public View f287818n;

    /* renamed from: o */
    public WeImageView f287819o;

    /* renamed from: p */
    public View f287820p;

    /* renamed from: q */
    public WeImageView f287821q;

    /* renamed from: r */
    public View f287822r;

    /* renamed from: s */
    public TextView f287823s;

    /* renamed from: t */
    public WeImageView f287824t;

    /* renamed from: u */
    public View f287825u;

    /* renamed from: v */
    public ViewGroup f287826v;

    /* renamed from: w */
    public TextView f287827w;

    /* renamed from: x */
    public TextView f287828x;

    /* renamed from: y */
    public TextView f287829y;

    /* renamed from: z */
    public C98176e f287830z;

    /* renamed from: gq2.c$a */
    public class C98172a implements View.OnClickListener {
        public C98172a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00bb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo137466a(android.view.View r12) {
            /*
                r11 = this;
                java.lang.String r0 = "onClickInner"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                if (r12 != 0) goto L_0x000e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            L_0x000e:
                boolean r2 = r12.isSelected()
                r3 = 1
                r2 = r2 ^ r3
                r12.setSelected(r2)
                gq2.c r2 = gq2.C98171c.this
                java.lang.String r4 = "access$000"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                android.widget.TextView r2 = r2.f287827w
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                if (r2 == 0) goto L_0x00d3
                java.lang.String r2 = "shouldShowConfirmBtn"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
                gq2.c r4 = gq2.C98171c.this
                java.lang.String r6 = "access$600"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                android.view.ViewGroup r4 = r4.f287826v
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                r6 = 0
                if (r4 == 0) goto L_0x0052
                int r7 = r4.getChildCount()
                r8 = 0
            L_0x0041:
                if (r8 >= r7) goto L_0x0052
                android.view.View r9 = r4.getChildAt(r8)
                boolean r9 = r9.isSelected()
                if (r9 == 0) goto L_0x004f
                r4 = 1
                goto L_0x0053
            L_0x004f:
                int r8 = r8 + 1
                goto L_0x0041
            L_0x0052:
                r4 = 0
            L_0x0053:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
                java.lang.String r2 = "access$200"
                if (r4 == 0) goto L_0x00bb
                gq2.c r4 = gq2.C98171c.this
                java.lang.String r7 = "access$300"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)
                r4.getClass()
                java.lang.String r8 = "showCloseWithFeedbackBt"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                r4.f287810F = r3
                android.widget.TextView r3 = r4.f287827w
                if (r3 == 0) goto L_0x00a9
                android.content.Context r9 = r4.f287811d
                if (r9 == 0) goto L_0x00a9
                r3.setVisibility(r6)
                android.widget.TextView r3 = r4.f287827w
                android.content.Context r9 = r4.f287811d
                r10 = 2131836807(0x7f113f87, float:1.9306791E38)
                java.lang.CharSequence r9 = r9.getText(r10)
                r3.setText(r9)
                android.widget.TextView r3 = r4.f287827w
                android.content.Context r9 = r4.f287811d
                android.content.res.Resources r9 = r9.getResources()
                r10 = 2131101484(0x7f06072c, float:1.781538E38)
                int r9 = r9.getColor(r10)
                r3.setTextColor(r9)
                android.widget.TextView r3 = r4.f287827w
                android.content.Context r4 = r4.f287811d
                android.content.res.Resources r4 = r4.getResources()
                r9 = 2131234916(0x7f081064, float:1.8086011E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r9)
                r3.setBackground(r4)
            L_0x00a9:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
                gq2.c r3 = gq2.C98171c.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                r3.mo137461a(r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
                goto L_0x00d3
            L_0x00bb:
                gq2.c r3 = gq2.C98171c.this
                java.lang.String r4 = "access$400"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                r3.mo137463c()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                gq2.c r3 = gq2.C98171c.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
                r3.mo137461a(r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            L_0x00d3:
                gq2.c r2 = gq2.C98171c.this
                java.lang.String r3 = "access$500"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
                gq2.e r2 = r2.f287830z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                if (r2 == 0) goto L_0x00ee
                r3 = 2131313775(0x7f09446f, float:1.8245956E38)
                java.lang.Object r3 = r12.getTag(r3)
                r4 = 5
                gq2.d r2 = (gq2.C98175d) r2
                r2.mo137471d(r12, r4, r3)
            L_0x00ee:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gq2.C98171c.C98172a.mo137466a(android.view.View):void");
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer$DynamicTextViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            try {
                mo137466a(view);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer$DynamicTextViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gq2.c$b */
    public static class C98173b {

        /* renamed from: a */
        public boolean f287832a;

        /* renamed from: b */
        public String f287833b;
    }

    /* renamed from: gq2.c$c */
    public interface C98174c {
    }

    public C98171c(Context context, C98174c cVar, C98176e eVar) {
        this.f287811d = context;
        this.f287805A = cVar;
        this.f287830z = eVar;
    }

    /* renamed from: a */
    public final void mo137461a(int i) {
        RelativeLayout.LayoutParams layoutParams;
        SnsMethodCalculate.markStartTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        Log.m105924i("FeedbackDisplayer", "adjustTitleView() called with: visibility = [" + i + "]");
        if (i == 0) {
            int i2 = 0;
            try {
                TextView textView = this.f287827w;
                if (textView != null) {
                    i2 = textView.getWidth();
                }
                if (this.f287807C == i2) {
                    Log.m105924i("FeedbackDisplayer", "adjustTitleView() just return");
                    SnsMethodCalculate.markEndTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    return;
                }
                if (i2 != 0) {
                    this.f287807C = i2;
                }
                int i3 = this.f287807C;
                if (i3 <= 0) {
                    Log.m105924i("FeedbackDisplayer", "adjustTitleView() not get width");
                    SnsMethodCalculate.markEndTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((this.f287806B - i3) - (this.f287808D * 2), -2);
            } catch (Throwable unused) {
            }
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            new RelativeLayout.LayoutParams(-1, -2);
        }
        int i4 = this.f287808D;
        layoutParams.topMargin = i4;
        layoutParams.setMarginStart(i4);
        layoutParams.setMarginEnd(this.f287808D);
        this.f287828x.setLayoutParams(layoutParams);
        TextView textView2 = this.f287829y;
        if (textView2 != null && (textView2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f287829y.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.setMarginStart(this.f287808D);
            layoutParams2.setMarginEnd(this.f287808D);
            this.f287829y.setLayoutParams(layoutParams2);
        }
        SnsMethodCalculate.markEndTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    /* renamed from: b */
    public final C102244f mo137462b() {
        SnsMethodCalculate.markStartTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        Object obj = ((ArrayMap) ((C98169a) this.f287805A).mo137453f("unlike_tag")).get("unlike_tag");
        if (obj instanceof C102244f) {
            C102244f fVar = (C102244f) obj;
            SnsMethodCalculate.markEndTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            return fVar;
        }
        SnsMethodCalculate.markEndTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        return null;
    }

    /* renamed from: c */
    public final void mo137463c() {
        SnsMethodCalculate.markStartTimeMs("showDirectCloseBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        this.f287810F = false;
        TextView textView = this.f287827w;
        if (!(textView == null || this.f287811d == null)) {
            textView.setVisibility(0);
            this.f287827w.setText(this.f287811d.getText(C0966R.string.myg));
            this.f287827w.setTextColor(this.f287811d.getResources().getColor(C0966R.color.ac9));
            this.f287827w.setBackground(this.f287811d.getResources().getDrawable(C0966R.C0969drawable.clq));
        }
        SnsMethodCalculate.markEndTimeMs("showDirectCloseBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x043d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137464d(android.view.View r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.String r1 = "updateView"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r28
            r0.f287812e = r3
            java.lang.String r3 = "initializeView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            java.lang.String r4 = "findViewWithId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            android.view.View r5 = r0.f287812e
            r6 = 2131313901(0x7f0944ed, float:1.8246212E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f287813f = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313755(0x7f09445b, float:1.8245916E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f287814g = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313795(0x7f094483, float:1.8245997E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f287815h = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313794(0x7f094482, float:1.8245995E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f287816i = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313784(0x7f094478, float:1.8245975E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f287817j = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313780(0x7f094474, float:1.8245966E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f287822r = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313781(0x7f094475, float:1.8245968E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f287823s = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313779(0x7f094473, float:1.8245964E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f287824t = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313786(0x7f09447a, float:1.8245979E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f287825u = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313789(0x7f09447d, float:1.8245985E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f287820p = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313788(0x7f09447c, float:1.8245983E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f287821q = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313778(0x7f094472, float:1.8245962E38)
            android.view.View r5 = r5.findViewById(r6)
            r0.f287818n = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313777(0x7f094471, float:1.824596E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            r0.f287819o = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313785(0x7f094479, float:1.8245977E38)
            android.view.View r5 = r5.findViewById(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.f287826v = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313782(0x7f094476, float:1.824597E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f287827w = r5
            android.content.Context r5 = r0.f287811d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131167171(0x7f0707c3, float:1.7948608E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            r0.f287806B = r5
            android.content.Context r5 = r0.f287811d
            r6 = 16
            int r5 = kg3.C76577a.m92151b(r5, r6)
            r0.f287808D = r5
            android.widget.TextView r5 = r0.f287827w
            if (r5 == 0) goto L_0x00f4
            gq2.b r6 = new gq2.b
            r6.<init>(r0)
            r5.addOnLayoutChangeListener(r6)
        L_0x00f4:
            android.view.View r5 = r0.f287812e
            r6 = 2131313797(0x7f094485, float:1.8246E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f287828x = r5
            android.view.View r5 = r0.f287812e
            r6 = 2131313796(0x7f094484, float:1.8245999E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f287829y = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initializeArrowView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f287813f
            r6 = 2131756975(0x7f1007af, float:1.9144873E38)
            if (r5 == 0) goto L_0x0120
            r5.setImageResource(r6)
        L_0x0120:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f287814g
            if (r5 == 0) goto L_0x012e
            r5.setImageResource(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f287814g
            r6 = 1127481344(0x43340000, float:180.0)
            r5.setRotation(r6)
        L_0x012e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initializeTitle"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            android.widget.TextView r5 = r0.f287828x
            if (r5 == 0) goto L_0x015d
            gq2.c$c r5 = r0.f287805A
            if (r5 == 0) goto L_0x015d
            gq2.a r5 = (gq2.C98169a) r5
            java.lang.String r6 = "expand_title"
            java.util.Map r5 = r5.mo137453f(r6)
            boolean r7 = rq2.C101425k.m133101e(r5)
            if (r7 == 0) goto L_0x015d
            android.util.ArrayMap r5 = (android.util.ArrayMap) r5
            java.lang.Object r5 = r5.get(r6)
            boolean r6 = r5 instanceof java.lang.CharSequence
            if (r6 == 0) goto L_0x015d
            android.widget.TextView r6 = r0.f287828x
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
        L_0x015d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initializeImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f287821q
            if (r5 == 0) goto L_0x016f
            r6 = 2131756973(0x7f1007ad, float:1.9144869E38)
            r5.setImageResource(r6)
        L_0x016f:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f287819o
            if (r5 == 0) goto L_0x0179
            r6 = 2131756972(0x7f1007ac, float:1.9144867E38)
            r5.setImageResource(r6)
        L_0x0179:
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r0.f287824t
            r6 = 2131756974(0x7f1007ae, float:1.914487E38)
            if (r5 == 0) goto L_0x0183
            r5.setImageResource(r6)
        L_0x0183:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initializeClickListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            android.view.View r5 = r0.f287820p
            if (r5 == 0) goto L_0x0192
            r5.setOnClickListener(r0)
        L_0x0192:
            android.view.View r5 = r0.f287818n
            if (r5 == 0) goto L_0x0199
            r5.setOnClickListener(r0)
        L_0x0199:
            android.view.View r5 = r0.f287822r
            if (r5 == 0) goto L_0x01a0
            r5.setOnClickListener(r0)
        L_0x01a0:
            android.widget.TextView r5 = r0.f287827w
            if (r5 == 0) goto L_0x01a7
            r5.setOnClickListener(r0)
        L_0x01a7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "fillDynamicContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            android.view.ViewGroup r5 = r0.f287826v
            r7 = 1
            r8 = 8
            if (r5 == 0) goto L_0x0257
            java.lang.String r5 = "getNotInterestReason"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            gq2.c$c r9 = r0.f287805A
            if (r9 == 0) goto L_0x01db
            gq2.a r9 = (gq2.C98169a) r9
            java.lang.String r10 = "reason_list"
            java.util.Map r9 = r9.mo137453f(r10)
            boolean r11 = rq2.C101425k.m133101e(r9)
            if (r11 == 0) goto L_0x01db
            android.util.ArrayMap r9 = (android.util.ArrayMap) r9
            java.lang.Object r9 = r9.get(r10)
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x01db
            java.util.Collection r9 = (java.util.Collection) r9
            goto L_0x01dc
        L_0x01db:
            r9 = 0
        L_0x01dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            boolean r5 = rq2.C101425k.m133100d(r9)
            if (r5 == 0) goto L_0x0257
            java.util.Iterator r5 = r9.iterator()
        L_0x01e9:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0257
            java.lang.Object r9 = r5.next()
            hq2.c r9 = (hq2.C98497c) r9
            android.content.Context r10 = r0.f287811d
            java.lang.String r11 = r9.f288887b
            java.lang.String r12 = "createTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r2)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r10)
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r15 = -2
            r14.<init>(r15, r15)
            r13.setLayoutParams(r14)
            r13.setSingleLine(r7)
            android.text.TextUtils$TruncateAt r14 = android.text.TextUtils.TruncateAt.END
            r13.setEllipsize(r14)
            r14 = 2131234918(0x7f081066, float:1.8086015E38)
            r13.setBackgroundResource(r14)
            android.content.Context r14 = r0.f287811d
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131101471(0x7f06071f, float:1.7815353E38)
            android.content.res.ColorStateList r14 = r14.getColorStateList(r15)
            r13.setTextColor(r14)
            r14 = 12
            int r14 = kg3.C76577a.m92151b(r10, r14)
            int r10 = kg3.C76577a.m92151b(r10, r8)
            r13.setPadding(r14, r10, r14, r10)
            r10 = 2
            r14 = 1096810496(0x41600000, float:14.0)
            r13.setTextSize(r10, r14)
            r13.setText(r11)
            gq2.c$a r10 = new gq2.c$a
            r10.<init>()
            r13.setOnClickListener(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r2)
            r10 = 2131313775(0x7f09446f, float:1.8245956E38)
            r13.setTag(r10, r9)
            android.view.ViewGroup r9 = r0.f287826v
            r9.addView(r13)
            goto L_0x01e9
        L_0x0257:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initializeSpecialFeedback"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            java.lang.String r5 = "isSpecialAdFeedback"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            gq2.c$c r9 = r0.f287805A
            if (r9 == 0) goto L_0x028c
            gq2.a r9 = (gq2.C98169a) r9
            java.lang.String r10 = "is_special"
            java.util.Map r9 = r9.mo137453f(r10)
            boolean r11 = rq2.C101425k.m133101e(r9)
            if (r11 == 0) goto L_0x028c
            android.util.ArrayMap r9 = (android.util.ArrayMap) r9
            java.lang.Object r9 = r9.get(r10)
            boolean r10 = r9 instanceof java.lang.Boolean
            if (r10 == 0) goto L_0x028c
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            goto L_0x0290
        L_0x028c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            r9 = 1
        L_0x0290:
            r5 = 0
            if (r9 == 0) goto L_0x0305
            android.view.View r9 = r0.f287817j
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r13 = "initializeSpecialFeedback"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r9
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9.setVisibility(r7)
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r12 = "initializeSpecialFeedback"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.widget.TextView r7 = r0.f287815h
            r7.setVisibility(r5)
            gq2.c$c r7 = r0.f287805A
            if (r7 == 0) goto L_0x0305
            gq2.a r7 = (gq2.C98169a) r7
            java.lang.String r9 = "special_prompt"
            java.util.Map r7 = r7.mo137453f(r9)
            boolean r10 = rq2.C101425k.m133101e(r7)
            if (r10 == 0) goto L_0x0305
            android.util.ArrayMap r7 = (android.util.ArrayMap) r7
            java.lang.Object r7 = r7.get(r9)
            boolean r9 = r7 instanceof java.lang.CharSequence
            if (r9 == 0) goto L_0x0305
            android.widget.TextView r9 = r0.f287815h
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r9.setText(r7)
        L_0x0305:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initializeComplaintContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            android.widget.TextView r7 = r0.f287823s
            if (r7 == 0) goto L_0x033a
            gq2.c$c r7 = r0.f287805A
            if (r7 == 0) goto L_0x033a
            gq2.a r7 = (gq2.C98169a) r7
            java.lang.String r9 = "complaint_content"
            java.util.Map r7 = r7.mo137453f(r9)
            boolean r10 = rq2.C101425k.m133101e(r7)
            if (r10 == 0) goto L_0x033a
            android.util.ArrayMap r7 = (android.util.ArrayMap) r7
            java.lang.Object r7 = r7.get(r9)
            boolean r9 = r7 instanceof java.lang.CharSequence
            if (r9 == 0) goto L_0x033a
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x033a
            android.widget.TextView r9 = r0.f287823s
            r9.setText(r7)
        L_0x033a:
            java.lang.String r7 = "showComplaintLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            android.view.View r15 = r0.f287822r
            if (r15 == 0) goto L_0x03d6
            android.view.View r9 = r0.f287816i
            if (r9 == 0) goto L_0x03d6
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r14.mo10233c(r9)
            java.lang.Object[] r10 = r14.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r12 = "showComplaintLayout"
            java.lang.String r13 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r9 = r15
            r8 = r14
            r14 = r16
            r6 = r15
            r15 = r17
            r16 = r18
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r11 = "showComplaintLayout"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r9 = r6
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r6 = r0.f287816i
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8.mo10233c(r9)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r22 = "showComplaintLayout"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r6
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r21 = "showComplaintLayout"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x03d6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r4 = "initPersonalizeAdLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            android.view.View r6 = r0.f287812e
            r7 = 2131313791(0x7f09447f, float:1.8245989E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f287809E = r6
            if (r6 == 0) goto L_0x03f3
            r6.setOnClickListener(r0)
        L_0x03f3:
            android.view.View r6 = r0.f287812e
            r7 = 2131313790(0x7f09447e, float:1.8245987E38)
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            if (r6 == 0) goto L_0x0406
            r7 = 2131756445(0x7f10059d, float:1.9143798E38)
            r6.setImageResource(r7)
        L_0x0406:
            android.view.View r6 = r0.f287812e
            r7 = 2131313792(0x7f094480, float:1.824599E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.View r6 = r0.f287812e
            r7 = 2131313793(0x7f094481, float:1.8245993E38)
            android.view.View r6 = r6.findViewById(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            if (r6 == 0) goto L_0x0424
            r7 = 2131756974(0x7f1007ae, float:1.914487E38)
            r6.setImageResource(r7)
        L_0x0424:
            java.lang.String r6 = "updatePersonalizedUIModel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
            android.view.ViewGroup r7 = r0.f287809E
            r8 = 8
            r7.setVisibility(r8)
            gq2.c$c r7 = r0.f287805A
            gq2.a r7 = (gq2.C98169a) r7
            gq2.c$b r7 = r7.mo137458k()
            boolean r7 = r7.f287832a
            if (r7 == 0) goto L_0x0516
            android.view.ViewGroup r7 = r0.f287809E
            r7.setVisibility(r5)
            android.view.View r7 = r0.f287825u
            if (r7 == 0) goto L_0x048f
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r12 = "updatePersonalizedUIModel"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r7
            r8 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer"
            java.lang.String r11 = "updatePersonalizedUIModel"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x048f:
            r0.f287810F = r5
            android.widget.TextView r7 = r0.f287827w
            if (r7 == 0) goto L_0x04ce
            android.content.Context r8 = r0.f287811d
            if (r8 == 0) goto L_0x04ce
            r7.setVisibility(r5)
            android.widget.TextView r7 = r0.f287827w
            android.content.Context r8 = r0.f287811d
            r9 = 2131836812(0x7f113f8c, float:1.9306801E38)
            java.lang.CharSequence r8 = r8.getText(r9)
            r7.setText(r8)
            android.widget.TextView r7 = r0.f287827w
            android.content.Context r8 = r0.f287811d
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101483(0x7f06072b, float:1.7815377E38)
            int r8 = r8.getColor(r9)
            r7.setTextColor(r8)
            android.widget.TextView r7 = r0.f287827w
            android.content.Context r8 = r0.f287811d
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131234919(0x7f081067, float:1.8086017E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r9)
            r7.setBackground(r8)
        L_0x04ce:
            android.widget.TextView r7 = r0.f287828x
            if (r7 == 0) goto L_0x04e8
            android.content.Context r8 = r7.getContext()
            r9 = 2131101489(0x7f060731, float:1.781539E38)
            int r8 = kg3.C76577a.m92153d(r8, r9)
            r7.setTextColor(r8)
            android.widget.TextView r7 = r0.f287828x
            r8 = 2131836813(0x7f113f8d, float:1.9306803E38)
            r7.setText(r8)
        L_0x04e8:
            android.widget.TextView r7 = r0.f287829y
            if (r7 == 0) goto L_0x050a
            android.content.Context r8 = r7.getContext()
            r9 = 2131101487(0x7f06072f, float:1.7815385E38)
            int r8 = kg3.C76577a.m92153d(r8, r9)
            r7.setTextColor(r8)
            android.widget.TextView r7 = r0.f287829y
            android.content.Context r8 = r7.getContext()
            r9 = 2131836815(0x7f113f8f, float:1.9306807E38)
            java.lang.String r8 = r8.getString(r9)
            r7.setText(r8)
        L_0x050a:
            r0.mo137461a(r5)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 1962(0x7aa, float:2.75E-42)
            r8 = 1
            r5.mo175911u(r7, r8)
            goto L_0x0524
        L_0x0516:
            r7 = 1962(0x7aa, float:2.75E-42)
            android.widget.TextView r8 = r0.f287827w
            r9 = 8
            r8.setVisibility(r9)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8.mo175911u(r7, r5)
        L_0x0524:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            gq2.e r4 = r0.f287830z
            if (r4 == 0) goto L_0x0543
            gq2.d r4 = (gq2.C98175d) r4
            java.lang.String r5 = "cleanReasonIds"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.util.Set<java.lang.Integer> r4 = r4.f287840j
            if (r4 == 0) goto L_0x0540
            java.util.HashSet r4 = (java.util.HashSet) r4
            r4.clear()
        L_0x0540:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x0543:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gq2.C98171c.mo137464d(android.view.View):void");
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        int id = view.getId();
        if (id == C0966R.C0970id.jp7) {
            SnsMethodCalculate.markStartTimeMs("onNoInteresting", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            ViewGroup viewGroup = this.f287826v;
            if (viewGroup != null && viewGroup.getChildCount() > 0) {
                this.f287826v.setVisibility(0);
                View view3 = this.f287825u;
                if (view3 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "onNoInteresting", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "onNoInteresting", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView = this.f287828x;
                if (textView != null) {
                    textView.setTextColor(C76577a.m92153d(textView.getContext(), C0966R.color.ace));
                    this.f287828x.setText(C0966R.string.f361365ja1);
                }
                TextView textView2 = this.f287829y;
                if (textView2 != null) {
                    textView2.setTextColor(C76577a.m92153d(textView2.getContext(), C0966R.color.acc));
                    TextView textView3 = this.f287829y;
                    textView3.setText(textView3.getContext().getString(C0966R.string.f361366ja2));
                }
            }
            if (this.f287830z != null) {
                C102244f b = mo137462b();
                if (b != null) {
                    view2.setTag(b);
                }
                ((C98175d) this.f287830z).mo137471d(view2, 1, (Object) null);
            }
            mo137463c();
            mo137461a(0);
            SnsMethodCalculate.markStartTimeMs("hideComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            View view5 = this.f287822r;
            if (!(view5 == null || this.f287816i == null)) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = this.f287816i;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("hideComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            SnsMethodCalculate.markEndTimeMs("onNoInteresting", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        } else if (id == C0966R.C0970id.jow) {
            SnsMethodCalculate.markStartTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            C98176e eVar = this.f287830z;
            if (eVar != null) {
                ((C98175d) eVar).mo137471d(view2, 2, (Object) null);
            }
            SnsMethodCalculate.markEndTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        } else if (id == C0966R.C0970id.joy) {
            SnsMethodCalculate.markStartTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            C98176e eVar2 = this.f287830z;
            if (eVar2 != null) {
                ((C98175d) eVar2).mo137471d(view2, 3, (Object) null);
            }
            SnsMethodCalculate.markEndTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        } else if (id == C0966R.C0970id.f359230jp0) {
            SnsMethodCalculate.markStartTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            if (this.f287830z != null) {
                C102244f b2 = mo137462b();
                if (b2 != null) {
                    view2.setTag(b2);
                }
                ((C98175d) this.f287830z).mo137471d(view2, 4, Boolean.valueOf(this.f287810F));
            }
            SnsMethodCalculate.markEndTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        } else if (id == C0966R.C0970id.npo) {
            SnsMethodCalculate.markStartTimeMs("onJumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            C98174c cVar = this.f287805A;
            if (cVar != null) {
                C98173b k = ((C98169a) cVar).mo137458k();
                Context context = this.f287811d;
                String str = k.f287833b;
                SnsMethodCalculate.markStartTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                if (str == null) {
                    SnsMethodCalculate.markEndTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                } else if (context == null) {
                    SnsMethodCalculate.markEndTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                } else {
                    if (!Util.isNullOrNil(str)) {
                        str = C7021t1.m7266a(str, "lang=" + LocaleUtil.getCurrentLanguage(context));
                    }
                    Intent intent = new Intent();
                    intent.putExtra("showShare", false);
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("show_feedback", false);
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("needRedirect", false);
                    intent.putExtra("neverGetA8Key", false);
                    C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    C115669n.INSTANCE.mo175911u(1962, 2);
                    SnsMethodCalculate.markEndTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                }
            }
            C98176e eVar3 = this.f287830z;
            if (eVar3 != null) {
                SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
                ((C98175d) eVar3).mo137469b();
                SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            }
            SnsMethodCalculate.markEndTimeMs("onJumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

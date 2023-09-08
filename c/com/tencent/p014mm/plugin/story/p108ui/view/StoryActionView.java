package com.tencent.p014mm.plugin.story.p108ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import ew2.C97757a;
import fy3.C32226l;
import go3.C76003c;
import gw2.C98261f;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import jw2.C99069d;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryActionView;", "Landroid/widget/RelativeLayout;", "Lgw2/f;", "comment", "Lrx3/b0;", "setup", "Lkotlin/Function1;", "", "B", "Lfy3/l;", "getOnActionClicked", "()Lfy3/l;", "setOnActionClicked", "(Lfy3/l;)V", "onActionClicked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "d", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView */
public final class StoryActionView extends RelativeLayout {

    /* renamed from: A */
    public final C96355d f281801A;

    /* renamed from: B */
    public C32226l<? super Integer, C13598b0> f281802B;

    /* renamed from: d */
    public final String f281803d;

    /* renamed from: e */
    public final float f281804e;

    /* renamed from: f */
    public final float f281805f;

    /* renamed from: g */
    public final int f281806g;

    /* renamed from: h */
    public final int f281807h;

    /* renamed from: i */
    public final int f281808i;

    /* renamed from: j */
    public final String f281809j;

    /* renamed from: n */
    public final String f281810n;

    /* renamed from: o */
    public final TextView f281811o;

    /* renamed from: p */
    public final TextView f281812p;

    /* renamed from: q */
    public final View f281813q;

    /* renamed from: r */
    public final View f281814r;

    /* renamed from: s */
    public boolean f281815s;

    /* renamed from: t */
    public int f281816t;

    /* renamed from: u */
    public boolean f281817u;

    /* renamed from: v */
    public float f281818v;

    /* renamed from: w */
    public int f281819w;

    /* renamed from: x */
    public boolean f281820x;

    /* renamed from: y */
    public int f281821y;

    /* renamed from: z */
    public C98261f f281822z;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$a */
    public static final class C96352a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryActionView f281823d;

        public C96352a(StoryActionView storyActionView) {
            this.f281823d = storyActionView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onActionClicked = this.f281823d.getOnActionClicked();
            if (onActionClicked != null) {
                onActionClicked.invoke(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$b */
    public static final class C96353b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryActionView f281824d;

        public C96353b(StoryActionView storyActionView) {
            this.f281824d = storyActionView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onActionClicked = this.f281824d.getOnActionClicked();
            if (onActionClicked != null) {
                onActionClicked.invoke(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$c */
    public static final class C96354c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryActionView f281825d;

        public C96354c(StoryActionView storyActionView) {
            this.f281825d = storyActionView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryActionView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> onActionClicked = this.f281825d.getOnActionClicked();
            if (onActionClicked != null) {
                onActionClicked.invoke(0);
            }
            C99069d.f290418a.mo138412a(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryActionView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$d */
    public static final class C96355d extends C76003c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96355d(Drawable drawable, int i) {
            super(drawable, i);
            C87412m.m108594g(drawable, "drawable");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$e */
    public static final class C96356e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281826d;

        public C96356e(TextView textView) {
            this.f281826d = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.f281826d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            textView.setTextColor(((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$f */
    public static final class C96357f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281827d;

        public C96357f(TextView textView) {
            this.f281827d = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.f281827d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setTextSize(0, ((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$g */
    public static final class C96358g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281828d;

        public C96358g(TextView textView) {
            this.f281828d = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.f281828d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            textView.setTextColor(((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$h */
    public static final class C96359h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281829d;

        public C96359h(TextView textView) {
            this.f281829d = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.f281829d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setTextSize(0, ((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$i */
    public static final class C96360i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281830d;

        public C96360i(TextView textView) {
            this.f281830d = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.f281830d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            textView.setTextColor(((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryActionView$j */
    public static final class C96361j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f281831d;

        public C96361j(TextView textView) {
            this.f281831d = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextView textView = this.f281831d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setTextSize(0, ((Float) animatedValue).floatValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f281803d = "MicroMsg.StoryActionView";
        this.f281804e = (float) C74942w4.m89784a(context, 17);
        this.f281805f = (float) C74942w4.m89784a(context, 14);
        this.f281806g = Color.parseColor("#FFFFFFFF");
        this.f281807h = Color.parseColor("#7FFFFFFF");
        this.f281808i = 1;
        this.f281809j = "  ";
        this.f281810n = " ";
        this.f281818v = -1.0f;
        this.f281819w = -1;
        View.inflate(context, C0966R.C0971layout.c5t, this);
        View findViewById = findViewById(C0966R.C0970id.k2r);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_action_like_tip_tv)");
        TextView textView = (TextView) findViewById;
        this.f281811o = textView;
        View findViewById2 = findViewById(C0966R.C0970id.k2p);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_action_comment_tip_tv)");
        TextView textView2 = (TextView) findViewById2;
        this.f281812p = textView2;
        View findViewById3 = findViewById(C0966R.C0970id.k4h);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_…ment_others_comment_icon)");
        StoryCommentBubbleView storyCommentBubbleView = (StoryCommentBubbleView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.k2t);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_action_self)");
        this.f281813q = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.k2s);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_action_other)");
        this.f281814r = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.k2q);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_action_like_tip_group)");
        LinearLayout linearLayout = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.k4i);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_comment_others_comment_tv)");
        C61926c.m72678c((TextView) findViewById7);
        Drawable drawable = context.getResources().getDrawable(C0966R.C0969drawable.avk);
        drawable.setBounds(0, 0, C74942w4.m89784a(context, 8), C74942w4.m89784a(context, 8));
        this.f281801A = new C96355d(drawable, 1);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C74942w4.m89784a(context, 48);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = C74942w4.m89784a(context, 48) + C75044y4.m89991c(context);
        ViewGroup.LayoutParams layoutParams3 = findViewById5.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = C74942w4.m89784a(context, 48);
        ViewGroup.LayoutParams layoutParams4 = findViewById5.getLayoutParams();
        C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = C74942w4.m89784a(context, 48) + C75044y4.m89991c(context);
        storyCommentBubbleView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_chats, -1));
        textView.setOnClickListener(new C96352a(this));
        textView2.setOnClickListener(new C96353b(this));
        storyCommentBubbleView.setOnClickListener(new C96354c(this));
    }

    /* renamed from: a */
    public final void mo134212a(TextView textView) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{textView.getCurrentTextColor(), this.f281806g});
        ofArgb.setEvaluator(new ArgbEvaluator());
        ofArgb.addUpdateListener(new C96356e(textView));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{textView.getTextSize(), this.f281804e});
        ofFloat.addUpdateListener(new C96357f(textView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150);
        animatorSet.playTogether(new Animator[]{ofArgb, ofFloat});
        animatorSet.start();
    }

    /* renamed from: b */
    public final void mo134213b(TextView textView) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{textView.getCurrentTextColor(), this.f281806g});
        ofArgb.setEvaluator(new ArgbEvaluator());
        ofArgb.addUpdateListener(new C96358g(textView));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{textView.getTextSize(), this.f281805f});
        ofFloat.addUpdateListener(new C96359h(textView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150);
        animatorSet.playTogether(new Animator[]{ofArgb, ofFloat});
        animatorSet.start();
    }

    /* renamed from: c */
    public final void mo134214c(TextView textView) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{textView.getCurrentTextColor(), this.f281807h});
        ofArgb.setEvaluator(new ArgbEvaluator());
        ofArgb.addUpdateListener(new C96360i(textView));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{textView.getTextSize(), this.f281805f});
        ofFloat.addUpdateListener(new C96361j(textView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150);
        animatorSet.playTogether(new Animator[]{ofArgb, ofFloat});
        animatorSet.start();
    }

    /* renamed from: d */
    public final void mo134215d(boolean z, TextView textView) {
        CharSequence text = textView.getText();
        if (text == null) {
            text = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        boolean z2 = true;
        if (z) {
            C96355d[] dVarArr = (C96355d[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C96355d.class);
            if (dVarArr != null) {
                if (!(dVarArr.length == 0)) {
                    z2 = false;
                }
            }
            if (z2) {
                spannableStringBuilder.append(this.f281809j).append(this.f281810n);
                spannableStringBuilder.setSpan(this.f281801A, spannableStringBuilder.length() - this.f281810n.length(), spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        C96355d[] dVarArr2 = (C96355d[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C96355d.class);
        if (dVarArr2 != null) {
            if (!(dVarArr2.length == 0)) {
                z2 = false;
            }
        }
        if (!z2) {
            spannableStringBuilder.removeSpan(C96355d.class);
            textView.setText(C112550d0.m153799i0(spannableStringBuilder));
        }
    }

    /* renamed from: e */
    public final void mo134216e(C98261f fVar) {
        C87412m.m108594g(fVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        if (this.f281815s) {
            LinkedList<C97757a> linkedList = fVar.f288075h;
            if (!(linkedList == null || linkedList.isEmpty())) {
                TextView textView = this.f281812p;
                String string = getContext().getResources().getString(C0966R.string.jqk);
                C87412m.m108593f(string, "context.resources.getStr…tory_gallery_comment_tip)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(linkedList.size())}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                textView.setText(format);
                return;
            }
            this.f281812p.setText(getContext().getResources().getString(C0966R.string.jqm));
        }
    }

    public final C32226l<Integer, C13598b0> getOnActionClicked() {
        return this.f281802B;
    }

    public final void setOnActionClicked(C32226l<? super Integer, C13598b0> lVar) {
        this.f281802B = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setup(gw2.C98261f r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "comment"
            gy3.C87412m.m108594g(r1, r2)
            r0.f281822z = r1
            com.tencent.mm.plugin.story.model.StoryCore$h r2 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r2 = r2.mo134187e()
            java.lang.String r3 = r1.f288068a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)
            r0.f281815s = r2
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            if (r2 == 0) goto L_0x01d0
            java.util.LinkedList<ew2.a> r2 = r1.f288077j
            java.util.LinkedList<ew2.a> r1 = r1.f288075h
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x0033:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0048
            java.lang.Object r8 = r7.next()
            r9 = r8
            ew2.a r9 = (ew2.C97757a) r9
            boolean r9 = r9.f286813f
            if (r9 == 0) goto L_0x0033
            r6.add(r8)
            goto L_0x0033
        L_0x0048:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r2.iterator()
        L_0x0051:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0066
            java.lang.Object r9 = r8.next()
            r10 = r9
            ew2.a r10 = (ew2.C97757a) r10
            boolean r10 = r10.f286813f
            if (r10 == 0) goto L_0x0051
            r7.add(r9)
            goto L_0x0051
        L_0x0066:
            boolean r8 = r2.isEmpty()
            r9 = 1
            if (r8 == 0) goto L_0x006f
            r8 = 1
            goto L_0x0070
        L_0x006f:
            r8 = 0
        L_0x0070:
            java.lang.String r10 = "format(format, *args)"
            if (r8 != 0) goto L_0x00a5
            android.widget.TextView r8 = r0.f281811o
            android.content.Context r11 = r21.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131837524(0x7f114254, float:1.9308245E38)
            java.lang.String r11 = r11.getString(r12)
            java.lang.String r12 = "context.resources.getStr…story_gallery_bubble_tip)"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12[r3] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r12, r9)
            java.lang.String r2 = java.lang.String.format(r11, r2)
            gy3.C87412m.m108593f(r2, r10)
            r8.setText(r2)
            goto L_0x00b9
        L_0x00a5:
            android.widget.TextView r2 = r0.f281811o
            android.content.Context r8 = r21.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131837526(0x7f114256, float:1.930825E38)
            java.lang.String r8 = r8.getString(r11)
            r2.setText(r8)
        L_0x00b9:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00c1
            r2 = 1
            goto L_0x00c2
        L_0x00c1:
            r2 = 0
        L_0x00c2:
            if (r2 != 0) goto L_0x00f5
            android.widget.TextView r2 = r0.f281812p
            android.content.Context r8 = r21.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131837527(0x7f114257, float:1.9308252E38)
            java.lang.String r8 = r8.getString(r11)
            java.lang.String r11 = "context.resources.getStr…tory_gallery_comment_tip)"
            gy3.C87412m.m108593f(r8, r11)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r3] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r11, r9)
            java.lang.String r1 = java.lang.String.format(r8, r1)
            gy3.C87412m.m108593f(r1, r10)
            r2.setText(r1)
            goto L_0x0109
        L_0x00f5:
            android.widget.TextView r1 = r0.f281812p
            android.content.Context r2 = r21.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r8 = 2131837529(0x7f114259, float:1.9308256E38)
            java.lang.String r2 = r2.getString(r8)
            r1.setText(r2)
        L_0x0109:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0123
            boolean r1 = r0.f281820x
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f281821y
            if (r1 == r9) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r1 = 0
            goto L_0x011b
        L_0x011a:
            r1 = 1
        L_0x011b:
            if (r1 == 0) goto L_0x0123
            android.widget.TextView r1 = r0.f281812p
            r0.mo134215d(r9, r1)
            goto L_0x0128
        L_0x0123:
            android.widget.TextView r1 = r0.f281812p
            r0.mo134215d(r3, r1)
        L_0x0128:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0142
            boolean r1 = r0.f281820x
            if (r1 == 0) goto L_0x0139
            int r1 = r0.f281821y
            if (r1 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r1 = 0
            goto L_0x013a
        L_0x0139:
            r1 = 1
        L_0x013a:
            if (r1 == 0) goto L_0x0142
            android.widget.TextView r1 = r0.f281811o
            r0.mo134215d(r9, r1)
            goto L_0x0147
        L_0x0142:
            android.widget.TextView r1 = r0.f281811o
            r0.mo134215d(r3, r1)
        L_0x0147:
            android.widget.TextView r1 = r0.f281811o
            r1.requestLayout()
            android.widget.TextView r1 = r0.f281812p
            r1.requestLayout()
            android.view.View r1 = r0.f281813q
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r2.mo10233c(r4)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r9 = "setup"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r8 = "setup"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f281814r
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r5)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r16 = "setup"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r15 = "setup"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x024e
        L_0x01d0:
            android.view.View r1 = r0.f281813q
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r8 = "setup"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r7 = "setup"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r1 = r0.f281814r
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r4)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r15 = "setup"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/story/ui/view/StoryActionView"
            java.lang.String r14 = "setup"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x024e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.StoryActionView.setup(gw2.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}

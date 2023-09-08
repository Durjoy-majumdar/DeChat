package com.tencent.p014mm.plugin.story.p108ui.view;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import ew2.C97757a;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000289B!\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b5\u00107R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006:"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/CommentItemView;", "Landroid/widget/LinearLayout;", "", "Landroid/animation/ValueAnimator;", "d", "Landroid/animation/ValueAnimator;", "getNormalAnimator", "()Landroid/animation/ValueAnimator;", "setNormalAnimator", "(Landroid/animation/ValueAnimator;)V", "normalAnimator", "e", "getNormalBgAnimator", "setNormalBgAnimator", "normalBgAnimator", "Landroid/view/View;", "f", "Landroid/view/View;", "getMaskView", "()Landroid/view/View;", "setMaskView", "(Landroid/view/View;)V", "maskView", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "getAvatarView", "()Landroid/widget/ImageView;", "setAvatarView", "(Landroid/widget/ImageView;)V", "avatarView", "Landroid/view/ViewGroup;", "h", "Landroid/view/ViewGroup;", "getContentLayout", "()Landroid/view/ViewGroup;", "setContentLayout", "(Landroid/view/ViewGroup;)V", "contentLayout", "Lew2/a;", "i", "Lew2/a;", "getComment", "()Lew2/a;", "setComment", "(Lew2/a;)V", "comment", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.CommentItemView */
public final class CommentItemView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public ValueAnimator f206287d;

    /* renamed from: e */
    public ValueAnimator f206288e;

    /* renamed from: f */
    public View f206289f;

    /* renamed from: g */
    public ImageView f206290g;

    /* renamed from: h */
    public ViewGroup f206291h;

    /* renamed from: i */
    public C97757a f206292i;

    /* renamed from: j */
    public boolean f206293j;

    /* renamed from: n */
    public int f206294n;

    /* renamed from: o */
    public int f206295o;

    /* renamed from: p */
    public int f206296p;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.CommentItemView$a */
    public static final class C71268a implements TypeEvaluator<Object> {
        public Object evaluate(float f, Object obj, Object obj2) {
            C87412m.m108594g(obj, "startValue");
            C87412m.m108594g(obj2, "endValue");
            int intValue = ((Integer) obj).intValue();
            float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
            int intValue2 = ((Integer) obj2).intValue();
            float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
            float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
            float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
            float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
            float pow5 = pow3 + (f * (((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3));
            return Integer.valueOf((Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.CommentItemView$b */
    public static final class C71269b implements Interpolator {

        /* renamed from: a */
        public final PointF f206297a;

        /* renamed from: b */
        public final PointF f206298b;

        /* renamed from: c */
        public final PointF f206299c;

        public C71269b(PointF pointF) {
            C87412m.m108594g(pointF, "divide");
            this.f206297a = pointF;
            float f = (float) 1;
            float f2 = f - 0.2f;
            this.f206298b = new PointF(pointF.x * f2, pointF.y * f2);
            float f3 = pointF.x;
            float f4 = pointF.y;
            this.f206299c = new PointF(f3 + ((f - f3) * 0.2f), f4 + ((f - f4) * 0.2f));
        }

        public float getInterpolation(float f) {
            PointF pointF = this.f206298b;
            float f2 = pointF.x;
            if (f < f2) {
                PointF pointF2 = this.f206297a;
                return (f * pointF2.y) / pointF2.x;
            }
            PointF pointF3 = this.f206299c;
            float f3 = pointF3.x;
            if (f < f3) {
                float f4 = pointF.y;
                return f4 + (((f - f2) / (f3 - f2)) * (pointF3.y - f4));
            }
            PointF pointF4 = this.f206297a;
            float f5 = pointF4.y;
            float f6 = pointF4.x;
            float f7 = (float) 1;
            return f5 + (((f - f6) / (f7 - f6)) * (f7 - f5));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f206292i = new C97757a();
        this.f206294n = C76577a.m92151b(context, 48);
    }

    public final ImageView getAvatarView() {
        ImageView imageView = this.f206290g;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("avatarView");
        throw null;
    }

    public final C97757a getComment() {
        return this.f206292i;
    }

    public final ViewGroup getContentLayout() {
        ViewGroup viewGroup = this.f206291h;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("contentLayout");
        throw null;
    }

    public final View getMaskView() {
        View view = this.f206289f;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("maskView");
        throw null;
    }

    public final ValueAnimator getNormalAnimator() {
        return this.f206287d;
    }

    public final ValueAnimator getNormalBgAnimator() {
        return this.f206288e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.k3l);
        if (findViewById == null) {
            findViewById = findViewById(C0966R.C0970id.k3s);
        }
        if (findViewById == null) {
            setMaskView(this);
        } else {
            setMaskView(findViewById);
        }
        View findViewById2 = findViewById(C0966R.C0970id.k45);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_comment_item_avatar)");
        setAvatarView((ImageView) findViewById2);
        View findViewById3 = findViewById(C0966R.C0970id.k49);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_…ment_item_content_layout)");
        setContentLayout((ViewGroup) findViewById3);
    }

    public final void setAvatarView(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f206290g = imageView;
    }

    public final void setComment(C97757a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f206292i = aVar;
    }

    public final void setContentLayout(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "<set-?>");
        this.f206291h = viewGroup;
    }

    public final void setMaskView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f206289f = view;
    }

    public final void setNormalAnimator(ValueAnimator valueAnimator) {
        this.f206287d = valueAnimator;
    }

    public final void setNormalBgAnimator(ValueAnimator valueAnimator) {
        this.f206288e = valueAnimator;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}

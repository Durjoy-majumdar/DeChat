package nw2;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentItemView;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentsContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import ew2.C97757a;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: nw2.e */
public final class C76968e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CommentItemView f224900d;

    /* renamed from: e */
    public final /* synthetic */ CommentsContainer f224901e;

    /* renamed from: f */
    public final /* synthetic */ C97757a f224902f;

    /* renamed from: g */
    public final /* synthetic */ int f224903g;

    /* renamed from: nw2.e$a */
    public static final class C76969a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CommentsContainer f224904d;

        /* renamed from: e */
        public final /* synthetic */ C97757a f224905e;

        /* renamed from: f */
        public final /* synthetic */ CommentItemView f224906f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76969a(CommentsContainer commentsContainer, C97757a aVar, CommentItemView commentItemView) {
            super(0);
            this.f224904d = commentsContainer;
            this.f224905e = aVar;
            this.f224906f = commentItemView;
        }

        public Object invoke() {
            String str = this.f224904d.f206300d;
            Log.m105924i(str, "LogStory: comment appear " + this.f224905e.f286815h);
            if (this.f224905e.f286815h) {
                this.f224906f.getClass();
                this.f224905e.f286815h = false;
            }
            if (this.f224905e.f286813f) {
                CommentItemView commentItemView = this.f224906f;
                Drawable background = commentItemView.getMaskView().getBackground();
                if (background instanceof GradientDrawable) {
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(background, "color", new int[]{commentItemView.getResources().getColor(C0966R.color.f2956ac), commentItemView.getContext().getResources().getColor(C0966R.color.aex)});
                    ofInt.setEvaluator(new CommentItemView.C71268a());
                    ofInt.setStartDelay(400);
                    ofInt.setDuration(2000);
                    ofInt.start();
                }
                this.f224905e.f286813f = false;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: nw2.e$b */
    public static final class C76970b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CommentsContainer f224907d;

        /* renamed from: e */
        public final /* synthetic */ CommentItemView f224908e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76970b(CommentsContainer commentsContainer, CommentItemView commentItemView) {
            super(0);
            this.f224907d = commentsContainer;
            this.f224908e = commentItemView;
        }

        public Object invoke() {
            String str = this.f224907d.f206300d;
            Log.m105924i(str, "LogStory: remove " + this.f224908e + ' ' + this.f224908e.getParent());
            this.f224907d.removeView(this.f224908e);
            return C13598b0.f38549a;
        }
    }

    public C76968e(CommentItemView commentItemView, CommentsContainer commentsContainer, C97757a aVar, int i) {
        this.f224900d = commentItemView;
        this.f224901e = commentsContainer;
        this.f224902f = aVar;
        this.f224903g = i;
    }

    public final void run() {
        View maskView = this.f224900d.getMaskView();
        CommentsContainer commentsContainer = this.f224901e;
        Context context = commentsContainer.getContext();
        C87412m.m108593f(context, "context");
        commentsContainer.getClass();
        int color = context.getResources().getColor(C0966R.color.f2956ac);
        int color2 = context.getResources().getColor(C0966R.color.aex);
        if (!commentsContainer.f206308o) {
            color = color2;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius((float) C76577a.m92151b(context, 24));
        maskView.setBackground(gradientDrawable);
        this.f224900d.setVisibility(0);
        int measuredHeight = this.f224900d.getMeasuredHeight();
        int paddingBottom = this.f224903g - this.f224901e.getPaddingBottom();
        CommentsContainer commentsContainer2 = this.f224901e;
        commentsContainer2.f206304h = ((long) C76577a.m92152c(commentsContainer2.getContext(), paddingBottom)) * 9;
        CommentsContainer commentsContainer3 = this.f224901e;
        if (commentsContainer3.f206304h <= 0) {
            commentsContainer3.f206304h = 4000;
        }
        CommentItemView commentItemView = this.f224900d;
        long j = commentsContainer3.f206304h;
        int paddingBottom2 = commentsContainer3.getPaddingBottom();
        int i = this.f224903g - (measuredHeight / 2);
        T aVar = new C76969a(this.f224901e, this.f224902f, this.f224900d);
        C76970b bVar = new C76970b(this.f224901e, this.f224900d);
        commentItemView.f206296p = commentItemView.getMeasuredWidth();
        commentItemView.f206295o = commentItemView.getMeasuredHeight();
        commentItemView.getContentLayout().setVisibility(8);
        ViewGroup.LayoutParams layoutParams = commentItemView.getLayoutParams();
        int i2 = commentItemView.f206294n;
        layoutParams.height = i2;
        layoutParams.width = i2;
        commentItemView.setLayoutParams(layoutParams);
        Log.m105924i("MicroMsg.CommentItemView", "LogStory: animation start " + commentItemView.f206294n + ", " + commentItemView.f206296p + ' ' + commentItemView.f206295o);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = aVar;
        CommentItemView.C71269b bVar2 = new CommentItemView.C71269b(new PointF(0.05f, 0.1f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        commentItemView.f206287d = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(bVar2);
        }
        ValueAnimator valueAnimator = commentItemView.f206287d;
        if (valueAnimator != null) {
            valueAnimator.setDuration(j);
        }
        ValueAnimator valueAnimator2 = commentItemView.f206287d;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new C76967c(i, paddingBottom2, commentItemView, 0.1f, f0Var, bVar));
        }
        ValueAnimator valueAnimator3 = commentItemView.f206287d;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        CommentsContainer commentsContainer4 = this.f224901e;
        commentsContainer4.f206303g = ((long) (C76577a.m92152c(commentsContainer4.getContext(), measuredHeight) + 96)) * 6;
        CommentsContainer commentsContainer5 = this.f224901e;
        if (commentsContainer5.f206302f == commentsContainer5.f206301e.size() - 1) {
            CommentsContainer commentsContainer6 = this.f224901e;
            long j2 = commentsContainer6.f206304h;
            commentsContainer6.f206303g = j2;
            commentsContainer6.postDelayed(commentsContainer6.f206310q, j2);
        }
        CommentsContainer commentsContainer7 = this.f224901e;
        commentsContainer7.postDelayed(commentsContainer7.f206309p, commentsContainer7.f206303g);
    }
}

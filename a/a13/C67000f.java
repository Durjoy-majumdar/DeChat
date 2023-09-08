package a13;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.topstory.p113ui.widget.TopStoryCommentFloatDialog;

/* renamed from: a13.f */
public class C67000f extends Animation {

    /* renamed from: d */
    public final /* synthetic */ int f192473d;

    /* renamed from: e */
    public final /* synthetic */ TopStoryCommentFloatDialog f192474e;

    public C67000f(TopStoryCommentFloatDialog topStoryCommentFloatDialog, int i) {
        this.f192474e = topStoryCommentFloatDialog;
        this.f192473d = i;
    }

    public void applyTransformation(float f, Transformation transformation) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f192474e.f207334d.getLayoutParams();
        layoutParams.bottomMargin = (int) (((float) this.f192473d) * f);
        this.f192474e.f207334d.setLayoutParams(layoutParams);
    }
}

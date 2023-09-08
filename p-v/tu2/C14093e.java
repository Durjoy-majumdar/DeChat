package tu2;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: tu2.e */
public final class C14093e extends RelativeLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14093e(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setGravity(17);
        WeImageView weImageView = new WeImageView(context);
        weImageView.setRotation(90.0f);
        weImageView.setIconColor(C76577a.m92153d(context, C0966R.color.FG_2));
        weImageView.setImageDrawable(C76577a.m92158i(context, C0966R.raw.icons_filled_arrow));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundResource(C0966R.C0969drawable.atq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C13598b0 b0Var = C13598b0.f38549a;
        frameLayout.addView(weImageView, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C76577a.m92157h(context, C0966R.dimen.f3745cw), C76577a.m92157h(context, C0966R.dimen.f3736cp));
        setGravity(17);
        addView(frameLayout, layoutParams2);
        int h = C76577a.m92157h(context, C0966R.dimen.f3766df);
        int h2 = C76577a.m92157h(context, C0966R.dimen.auz);
        setPadding(h, h2, 0, h2);
    }
}

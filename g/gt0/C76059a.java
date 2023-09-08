package gt0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import kg3.C76577a;
import kk0.C88191m;

/* renamed from: gt0.a */
public final class C76059a extends FrameLayout {
    public C76059a(Context context, View view) {
        super(context);
        addView(view);
    }

    public void onMeasure(int i, int i2) {
        if ((getParent() instanceof View) && ((View) getParent()).getMeasuredHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(((View) getParent()).getMeasuredHeight() - C76577a.m92151b(getContext(), KeyBoardUtil.isPortOrientation(getContext()) ? C88191m.CTRL_INDEX : 24), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
    }
}

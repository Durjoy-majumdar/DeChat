package er1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: er1.o0 */
public final class C7847o0 {

    /* renamed from: a */
    public static final C7847o0 f26422a = new C7847o0();

    /* renamed from: b */
    public static final ConcurrentHashMap<Integer, List<C0740i2>> f26423b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final void mo8956a(ViewGroup viewGroup) {
        if (!BuildInfo.DEBUG) {
            if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) {
                C37521f.f99374d.getClass();
                if (C37521f.f99277R7.mo60266n().intValue() < 1) {
                    return;
                }
            } else {
                return;
            }
        }
        Object tag = viewGroup.getTag(C0966R.C0970id.d3k);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            viewGroup.removeView(view);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setAlpha(0.5f);
        viewGroup.setTag(C0966R.C0970id.d3k, frameLayout);
        frameLayout.setBackgroundColor(-65536);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setText("feed match error!\n by changelcai");
        textView.setTextColor(-1);
        textView.setTextSize(1, 22.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C13598b0 b0Var = C13598b0.f38549a;
        frameLayout.addView(textView, layoutParams);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }
}

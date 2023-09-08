package il1;

import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: il1.b9 */
public final class C60351b9 {

    /* renamed from: a */
    public ViewGroup f172020a;

    /* renamed from: b */
    public final String f172021b = "FinderLiveWarnningCountWidget";

    /* renamed from: c */
    public View f172022c;

    /* renamed from: d */
    public TextView f172023d;

    /* renamed from: e */
    public TextView f172024e;

    /* renamed from: f */
    public ValueAnimator f172025f;

    public C60351b9(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "root");
        this.f172020a = viewGroup;
    }

    /* renamed from: a */
    public final void mo85315a(int i) {
        boolean z = true;
        if (1 <= i && i < 4) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.din);
            C87412m.m108593f(string, "getContext().getString(R…_free_time_warnning_tips)");
            Long l = null;
            if (this.f172022c == null) {
                View inflate = LayoutInflater.from(this.f172020a.getContext()).inflate(C0966R.C0971layout.f359767al1, this.f172020a, false);
                this.f172022c = inflate;
                this.f172023d = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.bu7) : null;
                View view = this.f172022c;
                this.f172024e = view != null ? (TextView) view.findViewById(C0966R.C0970id.iik) : null;
                View view2 = this.f172022c;
                if (view2 != null) {
                    view2.setBackgroundColor(-16777216);
                }
                if (this.f172020a.indexOfChild(this.f172022c) == -1) {
                    this.f172020a.addView(this.f172022c);
                }
            }
            View view3 = this.f172022c;
            if (view3 == null || view3.getVisibility() != 0) {
                z = false;
            }
            if (!z) {
                ValueAnimator valueAnimator = this.f172025f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 0.6f});
                ofFloat.setDuration((long) (i * 1000));
                ofFloat.addUpdateListener(new C60568z8(this));
                ofFloat.addListener(new C60344a9(this));
                this.f172025f = ofFloat;
                ofFloat.start();
                String str = this.f172021b;
                StringBuilder sb = new StringBuilder();
                sb.append("start alpha anim:duration$");
                ValueAnimator valueAnimator2 = this.f172025f;
                if (valueAnimator2 != null) {
                    l = Long.valueOf(valueAnimator2.getDuration());
                }
                sb.append(l);
                Log.m105924i(str, sb.toString());
            }
            View view4 = this.f172022c;
            if (view4 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "show", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "show", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = this.f172023d;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            TextView textView2 = this.f172024e;
            if (textView2 != null) {
                textView2.setText(string);
                return;
            }
            return;
        }
        mo85316b();
    }

    /* renamed from: b */
    public final void mo85316b() {
        View view = this.f172022c;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveWarnningCountWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ValueAnimator valueAnimator = this.f172025f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}

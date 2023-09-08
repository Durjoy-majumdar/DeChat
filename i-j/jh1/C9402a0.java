package jh1;

import a14.C0000n0;
import a14.C53930o0;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: jh1.a0 */
public final class C9402a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C0000n0 f29347d;

    /* renamed from: e */
    public final /* synthetic */ View f29348e;

    /* renamed from: f */
    public final /* synthetic */ float f29349f;

    /* renamed from: g */
    public final /* synthetic */ View f29350g;

    /* renamed from: h */
    public final /* synthetic */ C9403b0 f29351h;

    /* renamed from: i */
    public final /* synthetic */ int f29352i;

    /* renamed from: j */
    public final /* synthetic */ C9433z f29353j;

    public C9402a0(C0000n0 n0Var, View view, float f, View view2, C9403b0 b0Var, int i, C9433z zVar) {
        this.f29347d = n0Var;
        this.f29348e = view;
        this.f29349f = f;
        this.f29350g = view2;
        this.f29351h = b0Var;
        this.f29352i = i;
        this.f29353j = zVar;
    }

    public final void run() {
        C0000n0 n0Var = this.f29347d;
        boolean z = true;
        if (n0Var == null || !C53930o0.m60560g(n0Var)) {
            z = false;
        }
        if (z) {
            View view = this.f29348e;
            float width = this.f29349f * ((float) (view != null ? view.getWidth() : 0));
            if (width > 0.0f) {
                ViewGroup.LayoutParams layoutParams = this.f29350g.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.LayoutParams) layoutParams).width = (int) width;
                String str = this.f29351h.f29354e;
                Log.m105924i(str, "item pos:" + this.f29352i + ' ' + this.f29353j.f29458h + ", progressWidth:" + width);
                View view2 = this.f29350g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert$onBindViewHolder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/VoteConvert$onBindViewHolder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            String str2 = this.f29351h.f29354e;
            Log.m105924i(str2, "item pos:" + this.f29352i + ' ' + this.f29353j.f29458h + ", progressWidth invalid:" + width);
            return;
        }
        String str3 = this.f29351h.f29354e;
        StringBuilder sb = new StringBuilder();
        sb.append("item pos:");
        sb.append(this.f29352i);
        sb.append(' ');
        sb.append(this.f29353j.f29458h);
        sb.append(", scope invalid:");
        C0000n0 n0Var2 = this.f29347d;
        sb.append(n0Var2 != null ? Boolean.valueOf(C53930o0.m60560g(n0Var2)) : null);
        Log.m105924i(str3, sb.toString());
    }
}

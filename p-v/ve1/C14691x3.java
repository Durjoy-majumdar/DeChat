package ve1;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ve1.x3 */
public final class C14691x3 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f40633d;

    /* renamed from: e */
    public final /* synthetic */ View f40634e;

    /* renamed from: f */
    public final /* synthetic */ View f40635f;

    /* renamed from: g */
    public final /* synthetic */ C14456a4 f40636g;

    public C14691x3(TextView textView, View view, View view2, C14456a4 a4Var) {
        this.f40633d = textView;
        this.f40634e = view;
        this.f40635f = view2;
        this.f40636g = a4Var;
    }

    public boolean onPreDraw() {
        this.f40633d.getViewTreeObserver().removeOnPreDrawListener(this);
        ViewParent parent = this.f40633d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((View) parent).getWidth();
        int i = 0;
        if (this.f40634e.getVisibility() == 0) {
            i = 0 + this.f40634e.getWidth() + ((int) this.f40634e.getResources().getDimension(C0966R.dimen.f3738cr));
        }
        if (this.f40635f.getVisibility() == 0) {
            i += this.f40635f.getWidth() + ((int) this.f40635f.getResources().getDimension(C0966R.dimen.f3766df));
        }
        if (this.f40633d.getWidth() + i <= width) {
            return true;
        }
        this.f40633d.setMaxWidth(width - i);
        String str = this.f40636g.f40087e;
        Log.m105924i(str, "adjustNickNameTvSize titleW:" + this.f40633d.getWidth() + ", containerW:" + width + ",iconW:" + i);
        return true;
    }
}

package v82;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: v82.t1 */
public final class C14418t1 extends RecyclerView.C16631z {

    /* renamed from: z */
    public RelativeLayout f40024z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14418t1(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.jnc);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f40024z = (RelativeLayout) findViewById;
    }
}

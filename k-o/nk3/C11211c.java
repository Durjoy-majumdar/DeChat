package nk3;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: nk3.c */
public final class C11211c extends RecyclerView.C16631z {

    /* renamed from: z */
    public final TextView f33066z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11211c(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.knx);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.title)");
        this.f33066z = (TextView) findViewById;
    }
}

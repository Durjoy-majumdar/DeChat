package hp1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: hp1.e0 */
public final class C8659e0 extends RecyclerView.C16631z {

    /* renamed from: A */
    public TextView f27821A;

    /* renamed from: B */
    public View f27822B;

    /* renamed from: C */
    public TextView f27823C;

    /* renamed from: z */
    public final String f27824z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8659e0(View view, String str) {
        super(view);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(str, "headerTips");
        this.f27824z = str;
        View findViewById = view.findViewById(C0966R.C0970id.h06);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.more_tv)");
        this.f27821A = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f358770gz3);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.more_arrow)");
        this.f27822B = findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.c2h);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.desc_tv)");
        this.f27823C = (TextView) findViewById3;
    }
}

package hp1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: hp1.h0 */
public final class C8667h0 extends RecyclerView.C16631z {

    /* renamed from: A */
    public TextView f27855A;

    /* renamed from: z */
    public View f27856z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8667h0(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.c8m);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.divider_view)");
        this.f27856z = findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.d9z);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_feed_search_safety_text)");
        this.f27855A = (TextView) findViewById2;
    }
}

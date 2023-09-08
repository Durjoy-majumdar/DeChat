package nk3;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: nk3.e */
public final class C11212e extends RecyclerView.C16631z {

    /* renamed from: z */
    public TextView f33067z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11212e(View view, Context context) {
        super(view);
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(context, "context");
        View findViewById = view.findViewById(C0966R.C0970id.n0s);
        C87412m.m108593f(findViewById, "convertView.findViewById…fts_multi_item_date_info)");
        TextView textView = (TextView) findViewById;
        this.f33067z = textView;
        textView.setTextColor(context.getResources().getColor(C0966R.color.f3288ma));
        View findViewById2 = view.findViewById(C0966R.C0970id.n0j);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.view.View");
        findViewById2.setBackgroundColor(context.getResources().getColor(C0966R.color.f3284m6));
    }
}

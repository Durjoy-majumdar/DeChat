package nk3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.EllipsizeTextView;
import gy3.C87412m;

/* renamed from: nk3.m */
public final class C61808m extends RecyclerView.C16631z {

    /* renamed from: A */
    public final EllipsizeTextView f175738A;

    /* renamed from: B */
    public final TextView f175739B;

    /* renamed from: C */
    public final TextView f175740C;

    /* renamed from: D */
    public final View f175741D;

    /* renamed from: z */
    public final ImageView f175742z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61808m(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.a27);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.f175742z = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.hg4);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.nickname_tv)");
        this.f175738A = (EllipsizeTextView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.h2q);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.msg_tv)");
        this.f175739B = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.kky);
        C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.time_tv)");
        this.f175740C = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.c7p);
        C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.divider)");
        this.f175741D = findViewById5;
    }
}

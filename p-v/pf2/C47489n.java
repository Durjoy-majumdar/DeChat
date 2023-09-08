package pf2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nf2.C47240a;

/* renamed from: pf2.n */
public final class C47489n extends RecyclerView.C16631z {

    /* renamed from: A */
    public final String f127394A = "FeaturedMsgSingleFinderLiveViewHolder";

    /* renamed from: B */
    public final Context f127395B;

    /* renamed from: C */
    public final View f127396C;

    /* renamed from: D */
    public final View f127397D;

    /* renamed from: E */
    public final TextView f127398E;

    /* renamed from: z */
    public final C47240a f127399z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47489n(C47240a aVar, View view) {
        super(view);
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(view, "itemView");
        this.f127399z = aVar;
        this.f127395B = aVar.f126805d;
        this.f127396C = view.findViewById(C0966R.C0970id.hmb);
        this.f127397D = view.findViewById(C0966R.C0970id.ikt);
        this.f127398E = (TextView) view.findViewById(C0966R.C0970id.iks);
    }
}

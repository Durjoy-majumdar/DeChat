package nf2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: nf2.h */
public final class C47253h extends RecyclerView.C16631z {

    /* renamed from: A */
    public final String f126847A = "FeaturedMsgSingleVideoViewHolder";

    /* renamed from: B */
    public final Context f126848B;

    /* renamed from: C */
    public final TextView f126849C;

    /* renamed from: D */
    public final View f126850D;

    /* renamed from: E */
    public final View f126851E;

    /* renamed from: F */
    public final TextView f126852F;

    /* renamed from: G */
    public final TextView f126853G;

    /* renamed from: H */
    public final TextView f126854H;

    /* renamed from: I */
    public final ImageView f126855I;

    /* renamed from: z */
    public final C47240a f126856z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47253h(C47240a aVar, View view) {
        super(view);
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(view, "itemView");
        this.f126856z = aVar;
        this.f126848B = aVar.f126805d;
        this.f126849C = (TextView) view.findViewById(C0966R.C0970id.iks);
        this.f126850D = view.findViewById(C0966R.C0970id.hmb);
        this.f126851E = view.findViewById(C0966R.C0970id.ikt);
        this.f126852F = (TextView) view.findViewById(C0966R.C0970id.ikv);
        this.f126853G = (TextView) view.findViewById(C0966R.C0970id.hu4);
        this.f126854H = (TextView) view.findViewById(C0966R.C0970id.iuz);
        this.f126855I = (ImageView) view.findViewById(C0966R.C0970id.ium);
    }
}

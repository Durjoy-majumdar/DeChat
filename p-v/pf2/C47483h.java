package pf2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nf2.C47240a;

/* renamed from: pf2.h */
public final class C47483h extends RecyclerView.C16631z {

    /* renamed from: A */
    public final Context f127371A;

    /* renamed from: B */
    public final TextView f127372B;

    /* renamed from: C */
    public final RecyclerView f127373C;

    /* renamed from: D */
    public final View f127374D;

    /* renamed from: E */
    public final View f127375E;

    /* renamed from: z */
    public final C47240a f127376z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47483h(C47240a aVar, View view) {
        super(view);
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(view, "itemView");
        this.f127376z = aVar;
        this.f127371A = aVar.f126805d;
        this.f127372B = (TextView) view.findViewById(C0966R.C0970id.iks);
        this.f127373C = (RecyclerView) view.findViewById(C0966R.C0970id.hmg);
        this.f127374D = view.findViewById(C0966R.C0970id.hmb);
        this.f127375E = view.findViewById(C0966R.C0970id.ikt);
    }
}

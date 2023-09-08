package pf2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import nf2.C47240a;
import te3.C50117ke;

/* renamed from: pf2.a */
public class C47466a extends RecyclerView.C16631z {

    /* renamed from: A */
    public final C50117ke f127315A;

    /* renamed from: z */
    public final C47240a f127316z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47466a(View view, C47240a aVar, C50117ke keVar) {
        super(view);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127316z = aVar;
        this.f127315A = keVar;
        mo17376v(false);
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C87412m.m108594g(cVar, "dataModel");
    }
}

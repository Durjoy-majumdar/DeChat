package s61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gc0.C20828a;
import gy3.C87412m;
import i61.C98601f;
import kg3.C76577a;
import te3.C101824o80;
import u61.C101962d;

/* renamed from: s61.f */
public final class C101546f extends C101540a<C101545e> {

    /* renamed from: B */
    public final ImageView f297282B;

    /* renamed from: C */
    public final TextView f297283C;

    /* renamed from: D */
    public final String f297284D;

    /* renamed from: E */
    public final Drawable f297285E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101546f(Context context, View view, C101542b bVar) {
        super(view, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        this.f297282B = (ImageView) view.findViewById(C0966R.C0970id.iy6);
        this.f297283C = (TextView) view.findViewById(C0966R.C0970id.iy7);
        this.f297284D = C76577a.m92166q(context, C0966R.string.fn9);
        int d = C76577a.m92153d(context, C0966R.color.ahf);
        int d2 = C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_0_5);
        float h = (float) C76577a.m92157h(context, C0966R.dimen.auz);
        this.f297285E = C101962d.f300168a.mo141484b(d, d2, h, h, h, h);
    }

    /* renamed from: y */
    public void mo141016y(C101543c cVar) {
        C87412m.m108594g(cVar, "dataItem");
        this.f297278A = cVar;
        this.f44854d.setBackground(this.f297285E);
        C101824o80 o802 = null;
        C101545e eVar = cVar instanceof C101545e ? (C101545e) cVar : null;
        if (eVar != null) {
            o802 = eVar.f297281a;
        }
        if (o802 != null) {
            C20828a b = C20828a.m22825b();
            String str = o802.f298995e;
            b.mo32519h(str, this.f297282B, C98601f.m128139d(o802.f298994d, str));
        }
        this.f297283C.setText(this.f297284D);
    }
}

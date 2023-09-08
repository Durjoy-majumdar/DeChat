package pf2;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import gy3.C87412m;
import nf2.C47240a;
import qc0.C101093a;
import qc0.C101106m;
import sf0.C77702q0;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.f0 */
public final class C47481f0 extends C47466a {

    /* renamed from: F */
    public static final /* synthetic */ int f127363F = 0;

    /* renamed from: B */
    public final Context f127364B;

    /* renamed from: C */
    public final TextView f127365C;

    /* renamed from: D */
    public final TextView f127366D;

    /* renamed from: E */
    public final ImageView f127367E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47481f0(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127364B = view.getContext();
        this.f127365C = (TextView) view.findViewById(C0966R.C0970id.lzi);
        this.f127366D = (TextView) view.findViewById(C0966R.C0970id.lzh);
        this.f127367E = (ImageView) view.findViewById(C0966R.C0970id.aet);
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C87412m.m108594g(cVar, "dataModel");
        C49699hg hgVar = cVar.f127337c;
        C50249le leVar = cVar.f127336b;
        C47478f fVar = C47478f.f127353a;
        Context context = this.f127364B;
        C87412m.m108593f(context, "mContext");
        C47240a aVar = this.f127316z;
        View view = this.f44854d;
        C87412m.m108593f(view, "itemView");
        fVar.mo72496d(context, aVar, view, hgVar, leVar, this.f127315A, i);
        View view2 = this.f44854d;
        C87412m.m108593f(view2, "itemView");
        fVar.mo72493a(view2, i);
        this.f127365C.setText(leVar.f137336d);
        boolean z = false;
        if (C77702q0.m93719b(leVar.f137317A)) {
            this.f127366D.setVisibility(8);
        } else {
            this.f127366D.setVisibility(0);
            this.f127366D.setText(leVar.f137317A);
        }
        ImageView imageView = this.f127367E;
        String str = leVar.f137340h;
        C87412m.m108593f(str, "detail.ContentUrl");
        String k = C40714i.m43962k(str);
        C101106m b = C101093a.m132480b();
        if (b != null && C87412m.m108589b(b.f295960e, k) && b.f295959d == 0 && C101093a.m132481c()) {
            z = true;
        }
        if (z) {
            imageView.setImageResource(C0966R.C0969drawable.f4604p4);
            Drawable drawable = imageView.getDrawable();
            C87412m.m108592e(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((AnimationDrawable) drawable).start();
        } else {
            imageView.setImageResource(C0966R.C0969drawable.f4602p3);
        }
        imageView.setOnClickListener(new C47477e0(imageView, k, leVar));
    }
}

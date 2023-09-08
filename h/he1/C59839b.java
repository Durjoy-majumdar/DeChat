package he1;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.StrokeTextView;
import gy3.C87412m;
import p464ck.C54869f;

/* renamed from: he1.b */
public final class C59839b extends C54869f.C54870a {

    /* renamed from: d */
    public final View f170847d;

    /* renamed from: e */
    public final ImageView f170848e;

    /* renamed from: f */
    public final StrokeTextView f170849f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59839b(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f170847d = view;
        this.f170848e = (ImageView) view.findViewById(C0966R.C0970id.mo5);
        View findViewById = view.findViewById(C0966R.C0970id.amw);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.bullet_tv)");
        this.f170849f = (StrokeTextView) findViewById;
    }
}

package s61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: s61.h */
public final class C101548h extends C101540a<C101547g> {

    /* renamed from: B */
    public final String f297286B = "MicroMsg.PreviewMoreEmotionViewHolder";

    /* renamed from: C */
    public final Drawable f297287C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101548h(Context context, View view, C101542b bVar) {
        super(view, bVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        int d = C76577a.m92153d(context, C0966R.color.f2932f);
        int d2 = C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_0_5);
        int h = C76577a.m92157h(context, C0966R.dimen.f3761db);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(d2);
        gradientDrawable.setSize(h, h);
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(d);
        gradientDrawable2.setSize(h, h);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        this.f297287C = stateListDrawable;
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.iy8);
    }

    /* renamed from: y */
    public void mo141016y(C101543c cVar) {
        C87412m.m108594g(cVar, "dataItem");
        this.f297278A = cVar;
        this.f44854d.setBackground(this.f297287C);
        String str = this.f297286B;
        Log.m105918d(str, "onBind, hash:" + hashCode());
    }
}

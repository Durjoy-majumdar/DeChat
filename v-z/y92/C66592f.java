package y92;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import v92.C65558a;
import w92.C65943a;

/* renamed from: y92.f */
public final class C66592f extends C66590e {

    /* renamed from: j */
    public final String f191503j = "MicroMsg.NoteMinusScreenRoundCornerConvert";

    public C66592f(C65943a aVar) {
        super(C0966R.C0971layout.bbn, aVar);
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C65558a aVar = (C65558a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        Log.m105918d(this.f191503j, "onBindViewHolder");
        super.mo90637l(oVar, aVar, i, i2, z, list);
        ((ImageView) oVar.f44854d.findViewById(C0966R.C0970id.h3f)).setImageDrawable((Drawable) null);
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) oVar.f44854d.findViewById(C0966R.C0970id.f357834c01);
        roundCornerImageView.setPadding(C76577a.m92151b(roundCornerImageView.getContext(), 2), C76577a.m92151b(roundCornerImageView.getContext(), 2), C76577a.m92151b(roundCornerImageView.getContext(), 2), C76577a.m92151b(roundCornerImageView.getContext(), 2));
        roundCornerImageView.setVisibility(0);
        roundCornerImageView.setImageResource(C0966R.raw.bottomsheet_icon_fav);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
    }

    /* renamed from: j */
    public String mo90635j(Context context, C65558a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "item");
        return context.getResources().getString(C0966R.string.gsh);
    }
}

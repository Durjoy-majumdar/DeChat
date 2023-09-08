package y92;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103925l;
import aw0.C92162m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import v92.C65558a;
import w92.C65943a;

/* renamed from: y92.b */
public final class C66585b extends C66590e {

    /* renamed from: j */
    public final String f191477j = "MicroMsg.FileMinusScreenRoundCornerConvert";

    public C66585b(C65943a aVar) {
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
        Log.m105918d(this.f191477j, "onBindViewHolder");
        super.mo90637l(oVar, aVar, i, i2, z, list);
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.h3f);
        imageView.setImageDrawable((Drawable) null);
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) oVar.f44854d.findViewById(C0966R.C0970id.f357834c01);
        imageView.setVisibility(8);
        roundCornerImageView.setVisibility(0);
        String str = aVar.f188631d.mo80305m2().f183755h;
        Boolean bool = C103925l.f307288a;
        Integer a = C92162m.m115833a(str);
        if (a == null) {
            a = C92162m.m115833a("unknown");
        }
        C87412m.m108593f(a, "iconRes");
        roundCornerImageView.setImageResource(a.intValue());
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
    }

    /* renamed from: j */
    public String mo90635j(Context context, C65558a aVar) {
        String str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "item");
        StringBuilder sb = new StringBuilder();
        String str2 = aVar.f188631d.mo80305m2().f183755h;
        if (str2 != null) {
            str = str2.toUpperCase();
            C87412m.m108593f(str, "this as java.lang.String).toUpperCase()");
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(context.getResources().getString(C0966R.string.gsd));
        return sb.toString();
    }
}

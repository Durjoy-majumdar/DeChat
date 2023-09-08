package om3;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: om3.c */
public final class C77021c extends C60896i<C77020b> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bwj;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C77020b bVar = (C77020b) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.h06);
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.f358770gz3);
        Context context = oVar.f44854d.getContext();
        if (bVar.f225019u) {
            String string = context.getString(C0966R.string.iho, new Object[]{context.getString(C0966R.string.f2r)});
            C87412m.m108593f(string, "context.getString(\n     …ring.fts_header_contact))");
            C93938f0.m118694b(string, textView);
            imageView.setRotation(0.0f);
            return;
        }
        String string2 = context.getString(C0966R.string.ihp);
        C87412m.m108593f(string2, "context.getString(com.te…ch_more_contact_collapse)");
        C93938f0.m118694b(string2, textView);
        imageView.setRotation(180.0f);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}

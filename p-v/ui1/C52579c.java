package ui1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import nk1.C47272h;
import org.libpag.PAGFile;
import org.libpag.PAGView;

/* renamed from: ui1.c */
public final class C52579c extends C60896i<C52580d> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.b1f;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C52580d dVar = (C52580d) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.j07);
        C47272h hVar = C47272h.f126894a;
        C87412m.m108593f(textView, LocaleUtil.ITALIAN);
        String str = dVar.f146861d.f106360d;
        if (str == null) {
            str = "";
        }
        textView.setText(hVar.mo72300e(textView, str, 6));
        if (dVar.f146861d.f106362f) {
            PAGView pAGView = (PAGView) oVar.mo85812D(C0966R.C0970id.j09);
            if (!pAGView.isPlaying()) {
                pAGView.play();
            }
            pAGView.setVisibility(0);
            ((WeImageView) oVar.mo85812D(C0966R.C0970id.j08)).setVisibility(8);
            return;
        }
        PAGView pAGView2 = (PAGView) oVar.mo85812D(C0966R.C0970id.j09);
        pAGView2.setVisibility(4);
        pAGView2.stop();
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.j08)).setVisibility(0);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        PAGView pAGView = (PAGView) oVar.mo85812D(C0966R.C0970id.j09);
        pAGView.setComposition(PAGFile.Load(pAGView.getContext().getAssets(), "finder_live_link_mic_wave.pag"));
        pAGView.setRepeatCount(-1);
    }
}

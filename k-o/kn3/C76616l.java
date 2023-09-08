package kn3;

import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import ln3.C76718l;
import mn3.C76798k;

/* renamed from: kn3.l */
public final class C76616l extends C61118a<C76718l> {

    /* renamed from: e */
    public final C76798k f224236e;

    public C76616l(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76798k kVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(kVar, "processor");
        this.f224236e = kVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cwk;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public void mo44e(C60905o oVar, C76718l lVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(lVar, "item");
        super.mo86076k(oVar, lVar, i, i2, z, list);
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.fc8)).mo104518r(lVar.f224447u, lVar.f224448v);
        ((TextView) oVar.mo85812D(C0966R.C0970id.kvy)).setText(lVar.f224449w);
        long min = Math.min(Math.max(C31543z5.m39453c() - lVar.f224450x, 0), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        C76798k kVar = this.f224236e;
        kVar.f215752d.mo91571l().removeCallbacks(kVar.f224618g);
        kVar.f215752d.mo91571l().postDelayed(kVar.f224618g, min);
    }
}

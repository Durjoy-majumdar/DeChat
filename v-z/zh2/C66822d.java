package zh2;

import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioFinderTabFragment;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;

/* renamed from: zh2.d */
public final class C66822d extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ EditorAudioFinderTabFragment f191942a;

    public C66822d(EditorAudioFinderTabFragment editorAudioFinderTabFragment) {
        this.f191942a = editorAudioFinderTabFragment;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        this.f191942a.mo6011c();
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (!cVar.f24951f) {
            RefreshLoadMoreLayout a = this.f191942a.getLoadMoreLayout();
            C87412m.m108593f(a, "loadMoreLayout");
            RefreshLoadMoreLayout.m66896C(a, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
        }
    }
}

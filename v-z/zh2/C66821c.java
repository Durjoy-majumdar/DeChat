package zh2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioFinderTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import fy3.C32228q;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C60898l;
import jq3.C60905o;
import kg3.C76577a;
import nj3.C76912y0;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: zh2.c */
public final class C66821c implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioFinderTabFragment f191941d;

    public C66821c(EditorAudioFinderTabFragment editorAudioFinderTabFragment) {
        this.f191941d = editorAudioFinderTabFragment;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        C66820b bVar = (C66820b) C110818d0.m150917O(this.f191941d.f163866d, i);
        if (bVar != null) {
            EditorAudioFinderTabFragment editorAudioFinderTabFragment = this.f191941d;
            boolean z = false;
            if (bVar.f191940f) {
                FinderObjectDesc finderObjectDesc = bVar.f191938d.objectDesc;
                if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || finderMedia.mediaType != 2)) {
                    z = true;
                }
                if (z) {
                    C76912y0.m92773l(editorAudioFinderTabFragment.getContext(), C76577a.m92166q(editorAudioFinderTabFragment.getContext(), C0966R.string.jpl));
                } else {
                    C76912y0.m92773l(editorAudioFinderTabFragment.getContext(), C76577a.m92166q(editorAudioFinderTabFragment.getContext(), C0966R.string.jpm));
                }
            } else if (!bVar.f191939e) {
                C66820b bVar2 = (C66820b) C110818d0.m150917O(editorAudioFinderTabFragment.f163866d, editorAudioFinderTabFragment.f163867e);
                if (bVar2 != null) {
                    bVar2.f191939e = false;
                }
                bVar.f191939e = true;
                eVar.notifyItemChanged(editorAudioFinderTabFragment.f163867e, 1);
                eVar.notifyItemChanged(i, 1);
                editorAudioFinderTabFragment.f163867e = i;
                C32228q<EditorAudioFinderTabFragment, Integer, FinderObject, C13598b0> onFinderVideoSelectListener = editorAudioFinderTabFragment.getOnFinderVideoSelectListener();
                if (onFinderVideoSelectListener != null) {
                    onFinderVideoSelectListener.invoke(editorAudioFinderTabFragment, Integer.valueOf(i), bVar.f191938d);
                }
            }
        }
    }
}

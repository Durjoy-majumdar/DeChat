package zh2;

import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioFinderTabFragment;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zh2.m */
public final class C112632m extends C87413o implements C32228q<EditorAudioFinderTabFragment, Integer, FinderObject, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337284d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112632m(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        super(3);
        this.f337284d = editorAudioSelectFinderVideoView;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        FinderObject finderObject = (FinderObject) obj3;
        C87412m.m108594g((EditorAudioFinderTabFragment) obj, "<anonymous parameter 0>");
        C87412m.m108594g(finderObject, "finderObj");
        this.f337284d.getFinishBtn().setEnabled(true);
        this.f337284d.getFinderLikeFragment().mo80771b();
        EditorAudioSelectFinderVideoView.m142624d(this.f337284d, finderObject, 6);
        return C13598b0.f38549a;
    }
}

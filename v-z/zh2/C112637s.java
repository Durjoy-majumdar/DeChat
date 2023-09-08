package zh2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioFinderFavFragment;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: zh2.s */
public final class C112637s extends C87413o implements C32224a<EditorAudioFinderFavFragment> {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337289d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112637s(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        super(0);
        this.f337289d = editorAudioSelectFinderVideoView;
    }

    public Object invoke() {
        return (EditorAudioFinderFavFragment) this.f337289d.findViewById(C0966R.C0970id.k5t);
    }
}

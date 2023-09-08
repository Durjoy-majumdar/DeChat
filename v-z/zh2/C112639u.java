package zh2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioFinderLikeFragment;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: zh2.u */
public final class C112639u extends C87413o implements C32224a<EditorAudioFinderLikeFragment> {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337291d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112639u(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        super(0);
        this.f337291d = editorAudioSelectFinderVideoView;
    }

    public Object invoke() {
        return (EditorAudioFinderLikeFragment) this.f337291d.findViewById(C0966R.C0970id.k5z);
    }
}

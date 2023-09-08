package zh2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioFinderTabFragment;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: zh2.f */
public final class C66824f extends C87413o implements C32224a<WxRecyclerView> {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioFinderTabFragment f191944d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66824f(EditorAudioFinderTabFragment editorAudioFinderTabFragment) {
        super(0);
        this.f191944d = editorAudioFinderTabFragment;
    }

    public Object invoke() {
        return (WxRecyclerView) this.f191944d.findViewById(C0966R.C0970id.e6f);
    }
}

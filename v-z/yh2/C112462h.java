package yh2;

import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import jh2.C108745d;
import rx3.C13598b0;
import te3.C64839xt2;

/* renamed from: yh2.h */
public final class C112462h extends C87413o implements C32226l<LinkedList<C64839xt2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioView f336729d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112462h(EditorAudioView editorAudioView) {
        super(1);
        this.f336729d = editorAudioView;
    }

    public Object invoke(Object obj) {
        LinkedList linkedList = (LinkedList) obj;
        C87412m.m108594g(linkedList, LocaleUtil.ITALIAN);
        EditorAudioView editorAudioView = this.f336729d;
        if (editorAudioView.f315534S) {
            int i = EditorAudioView.f315516y0;
            Log.m105924i("MicroMsg.EditorAudioView", "EditorView has been destroyed, skip callback");
        } else {
            editorAudioView.f315527K = !linkedList.isEmpty();
            EditorAudioView editorAudioView2 = this.f336729d;
            if (editorAudioView2.f315527K) {
                C108745d dVar = C108745d.f325633i;
                if (dVar != null) {
                    dVar.f325638d = editorAudioView2.getMusicRequestId();
                }
                EditorAudioView editorAudioView3 = this.f336729d;
                editorAudioView3.f315552x.setMRelatedRecId(editorAudioView3.getMusicRequestId());
                MMHandlerThread.postToMainThread(new C112461g(this.f336729d, linkedList));
            }
        }
        return C13598b0.f38549a;
    }
}

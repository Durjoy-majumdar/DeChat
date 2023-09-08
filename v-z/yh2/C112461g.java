package yh2;

import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import java.util.LinkedList;
import te3.C64839xt2;

/* renamed from: yh2.g */
public final class C112461g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioView f336727d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C64839xt2> f336728e;

    public C112461g(EditorAudioView editorAudioView, LinkedList<C64839xt2> linkedList) {
        this.f336727d = editorAudioView;
        this.f336728e = linkedList;
    }

    public final void run() {
        this.f336727d.mo151382g(this.f336728e);
    }
}

package yh2;

import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioSearchView;

/* renamed from: yh2.d */
public final class C66647d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSearchView f191646d;

    public C66647d(EditorAudioSearchView editorAudioSearchView) {
        this.f191646d = editorAudioSearchView;
    }

    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f191646d.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f191646d.f315496n, 0);
        }
    }
}

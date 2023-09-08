package zh2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zh2.k */
public final class C112630k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337282d;

    public C112630k(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f337282d = editorAudioSelectFinderVideoView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorAudioSelectFinderVideoView.C106054a callback = this.f337282d.getCallback();
        if (callback != null) {
            callback.mo151525a(this.f337282d.f315696o);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

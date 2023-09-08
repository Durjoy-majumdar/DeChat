package zh2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zh2.i */
public final class C112628i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337280d;

    public C112628i(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f337280d = editorAudioSelectFinderVideoView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorAudioSelectFinderVideoView.C106054a callback = this.f337280d.getCallback();
        if (callback != null) {
            callback.mo151527c();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package zh2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zh2.j */
public final class C112629j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337281d;

    public C112629j(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f337281d = editorAudioSelectFinderVideoView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorAudioSelectFinderVideoView.C106054a callback = this.f337281d.getCallback();
        if (callback != null) {
            callback.mo151527c();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package zh2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zh2.o */
public final class C112634o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337286d;

    public C112634o(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f337286d = editorAudioSelectFinderVideoView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView = this.f337286d;
        C87412m.m108593f(view, LocaleUtil.ITALIAN);
        int i = EditorAudioSelectFinderVideoView.f315687q;
        editorAudioSelectFinderVideoView.mo151521g(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

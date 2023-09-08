package zh2;

import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zh2.n */
public final class C112633n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorAudioSelectFinderVideoView f337285d;

    public C112633n(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f337285d = editorAudioSelectFinderVideoView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView = this.f337285d;
        C87412m.m108593f(view, LocaleUtil.ITALIAN);
        int i = EditorAudioSelectFinderVideoView.f315687q;
        editorAudioSelectFinderVideoView.mo151521g(view);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package yh2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import xh2.C112151a;

/* renamed from: yh2.f */
public final class C112460f implements EditorAudioSelectFinderVideoView.C106054a {

    /* renamed from: a */
    public final /* synthetic */ EditorAudioView f336726a;

    public C112460f(EditorAudioView editorAudioView) {
        this.f336726a = editorAudioView;
    }

    /* renamed from: a */
    public void mo151525a(AudioCacheInfo audioCacheInfo) {
        if (audioCacheInfo != null) {
            ArrayList arrayList = new ArrayList();
            audioCacheInfo.f163820o = 1;
            arrayList.add(audioCacheInfo);
            C112151a aVar = this.f336726a.f315524H;
            aVar.getClass();
            aVar.f335823d.addAll(0, arrayList);
            aVar.notifyDataSetChanged();
            EditorAudioView editorAudioView = this.f336726a;
            if (editorAudioView.f315535T) {
                RecyclerView recyclerView = editorAudioView.f315540j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f336726a.mo151399r(0, false);
            } else {
                editorAudioView.f315524H.mo163964O4(0);
                RecyclerView recyclerView3 = this.f336726a.f315540j;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                RecyclerView recyclerView4 = recyclerView3;
                C117292a.m165358d(recyclerView4, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView3.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            this.f336726a.setShowAudioPanel(true);
            EditorAudioView.m142567f(this.f336726a, false);
            this.f336726a.mo151381A(true);
            EditorAudioView.C106012i callback = this.f336726a.getCallback();
            if (callback != null) {
                callback.mo151423b(audioCacheInfo);
            }
        }
    }

    /* renamed from: b */
    public void mo151526b(AudioCacheInfo audioCacheInfo) {
        EditorAudioView.C106012i callback = this.f336726a.getCallback();
        if (callback != null) {
            callback.mo151424c(audioCacheInfo);
        }
    }

    /* renamed from: c */
    public void mo151527c() {
        this.f336726a.setShowAudioPanel(true);
        EditorAudioView.m142567f(this.f336726a, false);
        if (this.f336726a.getWithMusic()) {
            EditorAudioView editorAudioView = this.f336726a;
            editorAudioView.mo151399r(editorAudioView.f315525I, true);
        } else {
            this.f336726a.f315524H.mo163964O4((Integer) null);
            EditorAudioView.C106012i callback = this.f336726a.getCallback();
            if (callback != null) {
                callback.mo151424c((AudioCacheInfo) null);
            }
        }
        EditorAudioView.C106012i callback2 = this.f336726a.getCallback();
        if (callback2 != null) {
            callback2.mo151422a();
        }
    }
}

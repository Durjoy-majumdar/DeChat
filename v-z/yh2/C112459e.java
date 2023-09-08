package yh2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioSearchView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import xh2.C112151a;

/* renamed from: yh2.e */
public final class C112459e implements EditorAudioSearchView.C105997a {

    /* renamed from: a */
    public final /* synthetic */ EditorAudioView f336725a;

    public C112459e(EditorAudioView editorAudioView) {
        this.f336725a = editorAudioView;
    }

    /* renamed from: a */
    public void mo151373a() {
        this.f336725a.setShowAudioPanel(true);
        this.f336725a.mo151411w(false);
        if (this.f336725a.getWithMusic()) {
            EditorAudioView editorAudioView = this.f336725a;
            editorAudioView.mo151399r(editorAudioView.f315525I, true);
        } else {
            this.f336725a.f315524H.mo163964O4((Integer) null);
            EditorAudioView.C106012i callback = this.f336725a.getCallback();
            if (callback != null) {
                callback.mo151424c((AudioCacheInfo) null);
            }
        }
        EditorAudioView.C106012i callback2 = this.f336725a.getCallback();
        if (callback2 != null) {
            callback2.mo151422a();
        }
    }

    /* renamed from: b */
    public void mo151374b(AudioCacheInfo audioCacheInfo) {
        if (audioCacheInfo != null) {
            ArrayList arrayList = new ArrayList();
            audioCacheInfo.f163820o = 1;
            audioCacheInfo.f163821p = 4;
            arrayList.add(audioCacheInfo);
            C112151a aVar = this.f336725a.f315524H;
            aVar.getClass();
            aVar.f335823d.addAll(0, arrayList);
            aVar.notifyDataSetChanged();
            EditorAudioView editorAudioView = this.f336725a;
            if (editorAudioView.f315535T) {
                RecyclerView recyclerView = editorAudioView.f315540j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f336725a.mo151399r(0, false);
            } else {
                editorAudioView.f315524H.mo163964O4(0);
                RecyclerView recyclerView3 = this.f336725a.f315540j;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                RecyclerView recyclerView4 = recyclerView3;
                C117292a.m165358d(recyclerView4, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView3.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            this.f336725a.mo151411w(false);
            this.f336725a.setShowAudioPanel(true);
            this.f336725a.mo151381A(true);
            EditorAudioView.C106012i callback = this.f336725a.getCallback();
            if (callback != null) {
                callback.mo151423b(audioCacheInfo);
            }
        }
    }

    /* renamed from: c */
    public void mo151375c(AudioCacheInfo audioCacheInfo) {
        EditorAudioView.C106012i callback;
        boolean z = false;
        if (audioCacheInfo != null && audioCacheInfo.f163820o == 3) {
            z = true;
        }
        if (z && (callback = this.f336725a.getCallback()) != null) {
            callback.mo151424c(audioCacheInfo);
        }
    }

    /* renamed from: d */
    public void mo151376d() {
        EditorAudioView.C106012i callback = this.f336725a.getCallback();
        if (callback != null) {
            callback.mo151426e();
        }
    }
}

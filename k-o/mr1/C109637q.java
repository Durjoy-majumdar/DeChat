package mr1;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import gy3.C87412m;
import kr1.C109034a;
import qh2.C101198e;
import y23.C112386e;

/* renamed from: mr1.q */
public final class C109637q extends C112386e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109637q(BasePluginLayout basePluginLayout) {
        super(basePluginLayout);
        C87412m.m108594g(basePluginLayout, "pluginLayout");
    }

    /* renamed from: a */
    public void mo14581a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        super.mo14581a(intent);
        FinderShowInWXProfileStruct finderShowInWXProfileStruct = (FinderShowInWXProfileStruct) this.f336503d;
        if (finderShowInWXProfileStruct != null) {
            finderShowInWXProfileStruct.mo1037s("99");
        }
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        Class cls = C109034a.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        boolean z = false;
        if (ordinal != 45) {
            if (ordinal == 47) {
                C109034a aVar = (C109034a) this.f336497e.mo151221j(cls);
                if (aVar != null) {
                    EditorAudioView editorAudioView = aVar.f326544g;
                    if (editorAudioView != null ? editorAudioView.mo151397o() : false) {
                        EditorAudioView editorAudioView2 = aVar.f326544g;
                        if (editorAudioView2 != null) {
                            z = editorAudioView2.f315553x0;
                        }
                        mo164100j(z);
                        return;
                    }
                    return;
                }
                return;
            } else if (!(ordinal == 89 || ordinal == 90)) {
                return;
            }
        }
        C109034a aVar2 = (C109034a) this.f336497e.mo151221j(cls);
        if (aVar2 != null && C30517h0.m39112a()) {
            EditorAudioView editorAudioView3 = aVar2.f326544g;
            if (editorAudioView3 != null) {
                z = editorAudioView3.mo151396n();
            }
            mo164101k(z);
        }
    }
}

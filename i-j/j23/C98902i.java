package j23;

import android.os.Bundle;
import com.tencent.p014mm.plugin.vlog.p117ui.VLogPreviewPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import qh2.C101198e;
import rx3.C13598b0;
import te3.C50308lt1;

/* renamed from: j23.i */
public final class C98902i extends C87413o implements C32226l<C50308lt1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ VLogPreviewPluginLayout f289927d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98902i(VLogPreviewPluginLayout vLogPreviewPluginLayout) {
        super(1);
        this.f289927d = vLogPreviewPluginLayout;
    }

    public Object invoke(Object obj) {
        Log.m105924i("MicroMsg.VLogPreviewPluginLayout", "requestVLogScript finish ,size:" + ((C50308lt1) obj));
        VLogPreviewPluginLayout.m123908n(this.f289927d);
        this.f289927d.mo14585p(C101198e.C101199b.EDIT_VLOG_SEARCH_MUSIC_SCRIPT_FINISH, (Bundle) null);
        return C13598b0.f38549a;
    }
}

package l23;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.vlog.p117ui.preview.VLogPreloadPlayView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: l23.s0 */
public final class C109230s0 implements C109344g0 {

    /* renamed from: d */
    public VLogPreloadPlayView f327030d;

    /* renamed from: e */
    public C101198e f327031e;

    /* renamed from: l23.s0$a */
    public static final class C109231a extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109230s0 f327032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109231a(C109230s0 s0Var) {
            super(2);
            this.f327032d = s0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            Log.m105924i("MicroMsg.VLogPreviewPlayerPlugin", "onSizeChanged " + intValue + ' ' + intValue2);
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_WIDTH_INT", intValue);
            bundle.putInt("PARAM_HEIGHT_INT", intValue2);
            this.f327032d.f327031e.mo14585p(C101198e.C101199b.EDIT_VLOG_SIZE_CHANGE, bundle);
            return C13598b0.f38549a;
        }
    }

    public C109230s0(VLogPreloadPlayView vLogPreloadPlayView, C101198e eVar) {
        C87412m.m108594g(vLogPreloadPlayView, "videoPreloadPlayView");
        C87412m.m108594g(eVar, "status");
        this.f327030d = vLogPreloadPlayView;
        this.f327031e = eVar;
        vLogPreloadPlayView.setOnSizeChangedListener(new C109231a(this));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C109230s0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
        this.f327030d.getClass();
    }

    public void onPause() {
        VLogPreloadPlayView vLogPreloadPlayView = this.f327030d;
        vLogPreloadPlayView.getClass();
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "pause");
        MMHandler mMHandler = vLogPreloadPlayView.f316821i;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        VLogPreloadPlayView vLogPreloadPlayView = this.f327030d;
        vLogPreloadPlayView.getClass();
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "resume");
        vLogPreloadPlayView.mo152297E(vLogPreloadPlayView.f316823n);
    }

    public void release() {
        VLogPreloadPlayView vLogPreloadPlayView = this.f327030d;
        vLogPreloadPlayView.getClass();
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "release  vLogDirector:null  0");
        MMHandler mMHandler = vLogPreloadPlayView.f316821i;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        vLogPreloadPlayView.f316820h.quitSafely();
        vLogPreloadPlayView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

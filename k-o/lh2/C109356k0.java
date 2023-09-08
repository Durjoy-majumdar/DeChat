package lh2;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105538j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i21.C60242i;
import j20.C117292a;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.k0 */
public final class C109356k0 implements C105538j {

    /* renamed from: a */
    public final /* synthetic */ C109345h0 f327374a;

    /* renamed from: lh2.k0$a */
    public static final class C109357a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109345h0 f327375d;

        public C109357a(C109345h0 h0Var) {
            this.f327375d = h0Var;
        }

        public final void run() {
            this.f327375d.f327345g.setVisibility(4);
        }
    }

    public C109356k0(C109345h0 h0Var) {
        this.f327374a = h0Var;
    }

    /* renamed from: a */
    public void mo150385a() {
        C109345h0 h0Var = this.f327374a;
        h0Var.getClass();
        Log.m105924i("MicroMsg.ImproveRecordButtonPlugin", JsApiStartRecordVoice.NAME);
        C101198e.C62622a.m73576a(h0Var.f327343e, C101198e.C101199b.RECORD_START, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo150386b() {
        Future<?> future = this.f327374a.f327352q;
        if (future != null) {
            future.cancel(true);
        }
        View view = this.f327374a.f327346h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin$setEnableType$3", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/ImproveRecordButtonPlugin$setEnableType$3", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        this.f327374a.f327344f.getLocationOnScreen(iArr);
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT", iArr[1]);
        this.f327374a.f327343e.mo14585p(C101198e.C101199b.PREPARE_CAMERA_ZOOM, bundle);
        this.f327374a.f327345g.animate().alpha(0.0f).withEndAction(new C109357a(this.f327374a)).start();
        C110992d dVar = C110992d.f332425a;
        dVar.mo162670d(2);
        dVar.mo162669b(2);
        C110992d.f332431g.f310319i = 1;
    }

    /* renamed from: c */
    public void mo150387c() {
        Log.m105924i("MicroMsg.ImproveRecordButtonPlugin", "onLongPressFinish");
        this.f327374a.f327355t = Util.currentTicks();
        this.f327374a.mo160542j(false);
        C60960c.f173618a.mo85927k("SnsPublishProcess", "endSessionShot", 1, C60242i.APPEND);
    }
}

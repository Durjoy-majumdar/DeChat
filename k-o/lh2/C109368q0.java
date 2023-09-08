package lh2;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import i21.C60242i;
import j20.C117292a;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import qh2.C101198e;
import th2.C110992d;

/* renamed from: lh2.q0 */
public final class C109368q0 implements MMSightRecordButton.C105502i {

    /* renamed from: a */
    public final /* synthetic */ C109360o0 f327405a;

    /* renamed from: lh2.q0$a */
    public static final class C109369a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109360o0 f327406d;

        public C109369a(C109360o0 o0Var) {
            this.f327406d = o0Var;
        }

        public final void run() {
            this.f327406d.f327381g.setVisibility(4);
        }
    }

    public C109368q0(C109360o0 o0Var) {
        this.f327405a = o0Var;
    }

    /* renamed from: a */
    public void mo128039a() {
        C109360o0 o0Var = this.f327405a;
        o0Var.f327391t = true;
        o0Var.getClass();
        this.f327405a.mo160563t();
    }

    /* renamed from: b */
    public void mo128040b() {
        Future<?> future = this.f327405a.f327395x;
        if (future != null) {
            future.cancel(true);
        }
        View view = this.f327405a.f327382h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$setEnableType$2", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/RecordButtonPlugin$setEnableType$2", "onPressDown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        this.f327405a.f327380f.getLocationOnScreen(iArr);
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT", iArr[1]);
        this.f327405a.f327379e.mo14585p(C101198e.C101199b.PREPARE_CAMERA_ZOOM, bundle);
        this.f327405a.f327381g.animate().alpha(0.0f).withEndAction(new C109369a(this.f327405a)).start();
        C110992d dVar = C110992d.f332425a;
        dVar.mo162670d(2);
        dVar.mo162669b(2);
        C110992d.f332431g.f310319i = 1;
    }

    /* renamed from: c */
    public void mo128041c() {
        Log.m105924i("MicroMsg.RecordButtonPlugin", "onLongPressFinish");
        C109360o0 o0Var = this.f327405a;
        if (o0Var.f327391t) {
            o0Var.f327391t = false;
            C101198e.C62622a.m73576a(o0Var.f327379e, C101198e.C101199b.RECORD_CANCEL_COUNTDOWN, (Bundle) null, 2, (Object) null);
        } else {
            o0Var.mo160557n(false);
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "endSessionShot", 1, C60242i.APPEND);
    }
}

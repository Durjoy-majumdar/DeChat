package lh2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105539k;
import qh2.C101198e;

/* renamed from: lh2.l0 */
public final class C109358l0 implements C105539k {

    /* renamed from: a */
    public final /* synthetic */ C109345h0 f327376a;

    public C109358l0(C109345h0 h0Var) {
        this.f327376a = h0Var;
    }

    /* renamed from: a */
    public void mo150388a(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", i);
        this.f327376a.f327343e.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
    }

    /* renamed from: b */
    public void mo150389b(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", i);
        this.f327376a.f327343e.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
    }
}

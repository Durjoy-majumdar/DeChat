package lh2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import qh2.C101198e;

/* renamed from: lh2.r0 */
public final class C109371r0 implements MMSightRecordButton.C105503j {

    /* renamed from: a */
    public final /* synthetic */ C109360o0 f327423a;

    public C109371r0(C109360o0 o0Var) {
        this.f327423a = o0Var;
    }

    /* renamed from: a */
    public void mo128046a(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", i);
        this.f327423a.f327379e.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
    }

    /* renamed from: b */
    public void mo128047b(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", true);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", i);
        this.f327423a.f327379e.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
    }
}

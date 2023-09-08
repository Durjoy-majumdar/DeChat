package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.p077ui.CameraFrontSightView;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCaptureTouchView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.v0 */
public final class C99469v0 implements C109344g0 {

    /* renamed from: d */
    public View f291635d;

    /* renamed from: e */
    public final CameraFrontSightView f291636e;

    /* renamed from: f */
    public final MMSightCaptureTouchView f291637f;

    /* renamed from: g */
    public long f291638g = Util.currentTicks();

    /* renamed from: lh2.v0$a */
    public static final class C99470a implements MMSightCaptureTouchView.C105491a {

        /* renamed from: a */
        public final /* synthetic */ C99469v0 f291639a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f291640b;

        public C99470a(C99469v0 v0Var, C101198e eVar) {
            this.f291639a = v0Var;
            this.f291640b = eVar;
        }

        /* renamed from: a */
        public void mo128048a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            this.f291640b.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
        }

        /* renamed from: b */
        public void mo128049b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            this.f291640b.mo14585p(C101198e.C101199b.TRIGGER_CAMERA_ZOOM, bundle);
        }

        /* renamed from: c */
        public void mo128050c() {
            if (Util.ticksToNow(this.f291639a.f291638g) >= 1000) {
                this.f291639a.f291638g = Util.currentTicks();
                C101198e.C62622a.m73576a(this.f291640b, C101198e.C101199b.SWITCH_CAMERA, (Bundle) null, 2, (Object) null);
            }
        }

        /* renamed from: e */
        public void mo128051e(float f, float f2) {
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_WIDTH_INT", this.f291639a.f291637f.getWidth());
            bundle.putInt("PARAM_HEIGHT_INT", this.f291639a.f291637f.getHeight());
            bundle.putFloat("PARAM_POINT_X", f);
            bundle.putFloat("PARAM_POINT_Y", f2);
            this.f291640b.mo14585p(C101198e.C101199b.FOCUS_ON_TOUCH, bundle);
            this.f291639a.f291636e.mo129481a(f, f2);
        }
    }

    public C99469v0(View view, C101198e eVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "status");
        this.f291635d = view;
        View findViewById = view.findViewById(C0966R.C0970id.ar6);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.capture_focus_frame)");
        CameraFrontSightView cameraFrontSightView = (CameraFrontSightView) findViewById;
        this.f291636e = cameraFrontSightView;
        View findViewById2 = this.f291635d.findViewById(C0966R.C0970id.ar9);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.capture_touch_view)");
        MMSightCaptureTouchView mMSightCaptureTouchView = (MMSightCaptureTouchView) findViewById2;
        this.f291637f = mMSightCaptureTouchView;
        int b = C76577a.m92151b(this.f291635d.getContext(), 120);
        cameraFrontSightView.mo129482b(b, b);
        mMSightCaptureTouchView.setTouchCallback(new C99470a(this, eVar));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99469v0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
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

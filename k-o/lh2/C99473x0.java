package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraActionsLogStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110990b;
import th2.C110992d;

/* renamed from: lh2.x0 */
public final class C99473x0 implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ImageView f291647d;

    /* renamed from: e */
    public C101198e f291648e;

    /* renamed from: f */
    public boolean f291649f = true;

    /* renamed from: g */
    public float f291650g;

    /* renamed from: h */
    public boolean f291651h;

    public C99473x0(ImageView imageView, C101198e eVar) {
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291647d = imageView;
        this.f291648e = eVar;
        imageView.setOnClickListener(this);
        ImageView imageView2 = this.f291647d;
        imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_camera_switch, -1));
    }

    /* renamed from: a */
    public final void mo138905a(boolean z) {
        if (z) {
            ImageView imageView = this.f291647d;
            imageView.setContentDescription(imageView.getContext().getString(C0966R.string.huv));
        } else {
            ImageView imageView2 = this.f291647d;
            imageView2.setContentDescription(imageView2.getContext().getString(C0966R.string.huw));
        }
        this.f291651h = z;
    }

    /* renamed from: b */
    public final void mo138906b(float f) {
        if (this.f291649f) {
            if (!(this.f291650g == f) && AppForegroundDelegate.INSTANCE.f343454n) {
                Log.m105924i("MicroMsg.RecordSwitchCameraPlugin", "updateOrientation " + f + "  " + this.f291647d.getRotation());
                this.f291650g = f;
                this.f291647d.animate().cancel();
                this.f291647d.animate().rotation(f).setDuration(100).start();
            }
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99473x0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchCameraPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.RecordSwitchCameraPlugin", "RecordSwitchCameraPlugin switch " + this.f291651h);
        String str = null;
        C101198e.C62622a.m73576a(this.f291648e, C101198e.C101199b.SWITCH_CAMERA, (Bundle) null, 2, (Object) null);
        C110992d dVar = C110992d.f332425a;
        dVar.mo162670d(1);
        dVar.mo162669b(1);
        StringBuilder sb = new StringBuilder();
        sb.append("setSwitchCameraByButtonCount >> ");
        CameraActionsLogStruct cameraActionsLogStruct = C110990b.f332422a;
        sb.append(cameraActionsLogStruct != null ? Long.valueOf(cameraActionsLogStruct.f310040k) : null);
        sb.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct2 = C110990b.f332422a;
        if (cameraActionsLogStruct2 != null) {
            str = cameraActionsLogStruct2.f310044o;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb.toString());
        CameraActionsLogStruct cameraActionsLogStruct3 = C110990b.f332422a;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.f310040k++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchCameraPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
        Log.m105924i("MicroMsg.RecordSwitchCameraPlugin", "onPause");
        this.f291649f = false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.RecordSwitchCameraPlugin", "onResume");
        this.f291649f = true;
    }

    public void release() {
        Log.m105924i("MicroMsg.RecordSwitchCameraPlugin", "release");
        this.f291649f = false;
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        this.f291647d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

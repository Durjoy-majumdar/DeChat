package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraActionsLogStruct;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import th2.C110990b;

/* renamed from: lh2.y0 */
public final class C109381y0 implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public WeImageView f327451d;

    /* renamed from: e */
    public C101198e f327452e;

    /* renamed from: f */
    public C34276c f327453f = C34276c.FLASH_OFF;

    /* renamed from: g */
    public float f327454g;

    public C109381y0(WeImageView weImageView, C101198e eVar) {
        C87412m.m108594g(weImageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f327451d = weImageView;
        this.f327452e = eVar;
        weImageView.mo104518r(C0966R.raw.icons_filled_camera_flash_off, C0966R.color.BW_100_Alpha_0_9);
        this.f327451d.setOnClickListener(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C109381y0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        C34276c cVar = C34276c.FLASH_ON;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchFlashPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.RecordSwitchFlashPlugin", "onClick >> " + this.f327453f);
        C34276c cVar2 = this.f327453f;
        C34276c cVar3 = C34276c.FLASH_OFF;
        if (cVar2 == cVar3) {
            cVar3 = cVar;
        }
        this.f327453f = cVar3;
        this.f327451d.mo104518r(cVar3 == cVar ? C0966R.raw.icons_filled_camera_flash_on : C0966R.raw.icons_filled_camera_flash_off, C0966R.color.BW_100_Alpha_0_9);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", this.f327453f == cVar);
        this.f327452e.mo14585p(C101198e.C101199b.SWITCH_FLASH, bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("setClickFlashLightCount >> ");
        CameraActionsLogStruct cameraActionsLogStruct = C110990b.f332422a;
        Long l = null;
        sb.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f310044o : null);
        sb.append(", ");
        CameraActionsLogStruct cameraActionsLogStruct2 = C110990b.f332422a;
        if (cameraActionsLogStruct2 != null) {
            l = Long.valueOf(cameraActionsLogStruct2.f310042m);
        }
        sb.append(l);
        Log.m105924i("MicroMsg.ImproveRecordReporter", sb.toString());
        CameraActionsLogStruct cameraActionsLogStruct3 = C110990b.f332422a;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.f310042m++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordSwitchFlashPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        this.f327451d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}

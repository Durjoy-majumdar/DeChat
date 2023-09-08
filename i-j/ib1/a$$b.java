package ib1;

import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;

public final /* synthetic */ class a$$b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FaceDetectConfirmUI f28137a;

    public /* synthetic */ a$$b(FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f28137a = faceDetectConfirmUI;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FaceDetectConfirmUI faceDetectConfirmUI = this.f28137a;
        faceDetectConfirmUI.f12369e.setEnabled(z && faceDetectConfirmUI.f12370f.isChecked());
    }
}

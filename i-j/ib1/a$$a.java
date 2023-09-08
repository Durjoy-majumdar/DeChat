package ib1;

import android.widget.Button;
import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;

public final /* synthetic */ class a$$a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ FaceDetectConfirmUI f28136a;

    public /* synthetic */ a$$a(FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f28136a = faceDetectConfirmUI;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FaceDetectConfirmUI faceDetectConfirmUI = this.f28136a;
        boolean z2 = false;
        boolean z3 = faceDetectConfirmUI.f12364J.getVisibility() == 8 || faceDetectConfirmUI.f12365K.isChecked();
        Button button = faceDetectConfirmUI.f12369e;
        if (z && z3) {
            z2 = true;
        }
        button.setEnabled(z2);
    }
}

package ib1;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class a$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectConfirmUI f28138d;

    public /* synthetic */ a$$c(FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f28138d = faceDetectConfirmUI;
    }

    public final void onClick(View view) {
        FaceDetectConfirmUI faceDetectConfirmUI = this.f28138d;
        int i = FaceDetectConfirmUI.f12354N;
        faceDetectConfirmUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", faceDetectConfirmUI, array);
        CheckBox checkBox = faceDetectConfirmUI.f12365K;
        checkBox.setChecked(!checkBox.isChecked());
        C117292a.m165361g(faceDetectConfirmUI, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

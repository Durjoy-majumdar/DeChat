package ib1;

import android.view.View;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ib1.c */
public class C8873c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectConfirmUI f28139d;

    public C8873c(FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f28139d = faceDetectConfirmUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FaceDetectConfirmUI faceDetectConfirmUI = this.f28139d;
        int i = FaceDetectConfirmUI.f12354N;
        faceDetectConfirmUI.mo2163I7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

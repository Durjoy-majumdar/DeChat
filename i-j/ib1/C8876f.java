package ib1;

import android.view.View;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p206nj.C117627q;

/* renamed from: ib1.f */
public class C8876f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectConfirmUI f28144d;

    public C8876f(FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f28144d = faceDetectConfirmUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            Object[] objArr = new Object[1];
            String str = this.f28144d.f12379r;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            String str2 = this.f28144d.f12377p + "?customInfo=" + C117627q.m165909b(String.format("appid=%s", objArr), "UTF-8");
            Log.m105925i("MicroMsg.FaceDetectConfirmUI", "alvinluo jump realUrl: %s", str2);
            FaceDetectConfirmUI.m2062H7(this.f28144d, str2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceDetectConfirmUI", e, "alvinluo jumpToWebView exception", new Object[0]);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package ib1;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49996ji3;

/* renamed from: ib1.e */
public class C8875e extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C49996ji3 f28142d;

    /* renamed from: e */
    public final /* synthetic */ FaceDetectConfirmUI f28143e;

    public C8875e(FaceDetectConfirmUI faceDetectConfirmUI, C49996ji3 ji32) {
        this.f28143e = faceDetectConfirmUI;
        this.f28142d = ji32;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f28142d.f136141e)) {
            FaceDetectConfirmUI.m2062H7(this.f28143e, this.f28142d.f136141e);
        } else {
            Log.m105920e("MicroMsg.FaceDetectConfirmUI", "alvinluo promptInfo url is null");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f28143e.getResources().getColor(C0966R.color.a1d));
    }
}

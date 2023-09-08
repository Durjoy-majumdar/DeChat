package ib1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import p206nj.C117627q;

/* renamed from: ib1.d */
public class C8874d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f28140d;

    /* renamed from: e */
    public final /* synthetic */ FaceDetectConfirmUI f28141e;

    public C8874d(FaceDetectConfirmUI faceDetectConfirmUI, int i) {
        this.f28141e = faceDetectConfirmUI;
        this.f28140d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f28141e.f12376o + "?customInfo=" + C117627q.m165909b(String.format("appid=%s;errcode=%d", new Object[]{this.f28141e.f12379r, Integer.valueOf(this.f28140d)}), "UTF-8"));
            C88144b.m109791i(this.f28141e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceDetectConfirmUI", e, "face start feedback webview exception", new Object[0]);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

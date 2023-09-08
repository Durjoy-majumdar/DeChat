package com.tencent.p014mm.plugin.flash.action;

import android.view.View;
import bu1.C0381a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.flash.action.h */
public class C4376h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f19002d;

    /* renamed from: e */
    public final /* synthetic */ FaceFlashActionProcessLayout f19003e;

    public C4376h(FaceFlashActionProcessLayout faceFlashActionProcessLayout, JSONObject jSONObject) {
        this.f19003e = faceFlashActionProcessLayout;
        this.f19002d = jSONObject;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = FaceFlashActionProcessLayout.f18966t;
        Log.m105924i("MicroMsg.FaceFlashActionProcessLayout", "click customBtn");
        try {
            this.f19002d.put("click_other_verify_btn", "yes");
            this.f19003e.f18967d.mo5272I7(this.f19002d);
            if (C0381a.m327d(this.f19002d)) {
                C115669n.INSTANCE.mo160131h(23269, 1, 1, 1);
            }
        } catch (Exception e) {
            int i2 = FaceFlashActionProcessLayout.f18966t;
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "face start feedback webview exception", new Object[0]);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

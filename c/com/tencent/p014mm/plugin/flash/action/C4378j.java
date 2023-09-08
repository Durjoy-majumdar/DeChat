package com.tencent.p014mm.plugin.flash.action;

import android.view.View;
import bu1.C0381a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.flash.action.j */
public class C4378j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f19007d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f19008e;

    /* renamed from: f */
    public final /* synthetic */ String f19009f;

    /* renamed from: g */
    public final /* synthetic */ FaceFlashActionProcessLayout f19010g;

    public C4378j(FaceFlashActionProcessLayout faceFlashActionProcessLayout, boolean z, JSONObject jSONObject, String str) {
        this.f19010g = faceFlashActionProcessLayout;
        this.f19007d = z;
        this.f19008e = jSONObject;
        this.f19009f = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = FaceFlashActionProcessLayout.f18966t;
        Log.m105925i("MicroMsg.FaceFlashActionProcessLayout", "click retry btn, canRetry：%s", Boolean.valueOf(this.f19007d));
        if (this.f19007d) {
            this.f19010g.f18967d.mo5276M7();
        } else {
            this.f19010g.f18967d.mo5272I7(this.f19008e);
            if (C0381a.m327d(this.f19008e)) {
                if (!Util.isNullOrNil(this.f19009f)) {
                    C115669n.INSTANCE.mo160131h(23269, 1, 3, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(23269, 1, 3, 0);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

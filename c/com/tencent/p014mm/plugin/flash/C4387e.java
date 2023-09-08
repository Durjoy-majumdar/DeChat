package com.tencent.p014mm.plugin.flash;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.flash.e */
public class C4387e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f19022d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f19023e;

    /* renamed from: f */
    public final /* synthetic */ FaceFlashProcessLayout f19024f;

    public C4387e(FaceFlashProcessLayout faceFlashProcessLayout, boolean z, JSONObject jSONObject) {
        this.f19024f = faceFlashProcessLayout;
        this.f19022d = z;
        this.f19023e = jSONObject;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f19022d) {
            this.f19024f.f18889d.mo5241M7();
        } else {
            this.f19024f.f18889d.mo5238I7(this.f19023e);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.plugin.flash;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.flash.c */
public class C4385c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashProcessLayout f19018d;

    public C4385c(FaceFlashProcessLayout faceFlashProcessLayout) {
        this.f19018d = faceFlashProcessLayout;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        MultiProcessMMKV.getMMKV("face-flash").encode("show-dialog", 0);
        C76912y0.makeText(this.f19018d.getContext(), (CharSequence) "ok", 1).show();
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

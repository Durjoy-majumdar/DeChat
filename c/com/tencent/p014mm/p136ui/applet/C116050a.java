package com.tencent.p014mm.p136ui.applet;

import android.view.View;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.applet.a */
public class C116050a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SecurityImage f348175d;

    public C116050a(SecurityImage securityImage) {
        this.f348175d = securityImage;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/applet/SecurityImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SecurityImage securityImage = this.f348175d;
        int i = SecurityImage.f348162p;
        securityImage.mo177229a(false);
        SecurityImage.C116049b bVar = this.f348175d.f348171o;
        if (bVar != null) {
            bVar.mo93941a();
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/applet/SecurityImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.p136ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.z1 */
public abstract class C30870z1 implements View.OnClickListener {

    /* renamed from: d */
    public long f82899d = -1;

    /* renamed from: a */
    public abstract void mo57772a(View view);

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/MMCustomClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.MMCustomClickListener", "button onclick");
        if (this.f82899d != -1) {
            long nanoTime = (System.nanoTime() - this.f82899d) / TimeUtil.SECOND_TO_US;
            if (nanoTime < 3000) {
                Log.m105925i("MicroMsg.MMCustomClickListener", "click time limited limitetime:%d, delaytime:%d", Long.valueOf(nanoTime), 3000L);
                C117292a.m165361g(this, "com/tencent/mm/ui/MMCustomClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        this.f82899d = System.nanoTime();
        mo57772a(view);
        C117292a.m165361g(this, "com/tencent/mm/ui/MMCustomClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

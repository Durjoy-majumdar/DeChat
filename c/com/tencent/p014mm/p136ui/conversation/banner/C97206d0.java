package com.tencent.p014mm.p136ui.conversation.banner;

import android.view.View;
import com.tencent.p014mm.p136ui.conversation.banner.C97197b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hd0.C98385a0;
import hd0.C98393c0;
import hd0.C98398h0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.conversation.banner.d0 */
public class C97206d0 implements View.OnClickListener {
    public C97206d0(C97197b0.C97200c cVar) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/MassSightBanner$MassSightViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long longValue = ((Long) view.getTag()).longValue();
        Log.m105925i("MicroMsg.MassSightBanner", "on click cancel, massSendId %d", Long.valueOf(longValue));
        C98385a0 zx02 = C98398h0.zx0();
        zx02.getClass();
        C86709a0.m107525e().postToWorker(new C98393c0(zx02, longValue));
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/MassSightBanner$MassSightViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

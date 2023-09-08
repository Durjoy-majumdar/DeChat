package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.fav.ui.d2 */
public class C93497d2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhotoTransControl f270014d;

    public C93497d2(PhotoTransControl photoTransControl) {
        this.f270014d = photoTransControl;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/PhotoTransControl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CancelScanTranslationEvent cancelScanTranslationEvent = new CancelScanTranslationEvent();
        CancelScanTranslationEvent.C92467a aVar = cancelScanTranslationEvent.f264645d;
        aVar.f264646a = 1;
        aVar.f264647b = this.f270014d.f269947c;
        cancelScanTranslationEvent.publish();
        this.f270014d.mo128355b();
        this.f270014d.f269947c = 0;
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/PhotoTransControl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.plugin.subapp.p109ui.gallery;

import android.view.View;
import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryTransAndOcrLogic;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.b */
public class C96512b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GestureGalleryTransAndOcrLogic f282411d;

    public C96512b(GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic) {
        this.f282411d = gestureGalleryTransAndOcrLogic;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        GestureGalleryTransAndOcrLogic.C96468c cVar = this.f282411d.f282242g;
        if (cVar != null) {
            ((GestureGalleryUI) cVar).mo134464c8();
        }
        this.f282411d.mo134448a();
        CancelScanTranslationEvent cancelScanTranslationEvent = new CancelScanTranslationEvent();
        CancelScanTranslationEvent.C92467a aVar = cancelScanTranslationEvent.f264645d;
        GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = this.f282411d;
        aVar.f264646a = gestureGalleryTransAndOcrLogic.f282247l ? 6 : 5;
        aVar.f264647b = gestureGalleryTransAndOcrLogic.f282238c;
        cancelScanTranslationEvent.publish();
        this.f282411d.mo134452e();
        this.f282411d.f282238c = 0;
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

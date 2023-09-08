package com.tencent.p014mm.plugin.subapp.p109ui.gallery;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.subapp.p109ui.gallery.GestureGalleryTransAndOcrLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.a */
public class C96511a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationResultEvent f282409d;

    /* renamed from: e */
    public final /* synthetic */ GestureGalleryTransAndOcrLogic.C964641 f282410e;

    public C96511a(GestureGalleryTransAndOcrLogic.C964641 r1, ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f282410e = r1;
        this.f282409d = scanTranslationResultEvent;
    }

    public void run() {
        if (GestureGalleryTransAndOcrLogic.this.f282238c == this.f282409d.f265089d.f265090a) {
            GestureGalleryTransAndOcrLogic.this.mo134452e();
            ScanTranslationResultEvent scanTranslationResultEvent = this.f282409d;
            if (scanTranslationResultEvent.f265089d.f265092c) {
                GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = GestureGalleryTransAndOcrLogic.this;
                gestureGalleryTransAndOcrLogic.getClass();
                if (!C86013q1.m106450k(scanTranslationResultEvent.f265089d.f265093d)) {
                    Log.m105929w("MicroMsg.GestureGalleryTransLogic", "trans result path %s not exist!", scanTranslationResultEvent.f265089d.f265093d);
                } else {
                    GestureGalleryTransAndOcrLogic.C96469d dVar = gestureGalleryTransAndOcrLogic.f282240e;
                    if (dVar == null) {
                        Log.m105928w("MicroMsg.GestureGalleryTransLogic", "transCallback is null");
                    } else {
                        String str = ((GestureGalleryUI) dVar).f282302g;
                        Intent intent = new Intent();
                        intent.putExtra("original_file_path", str);
                        intent.putExtra("translate_source", scanTranslationResultEvent.f265089d.f265091b);
                        intent.setClassName(gestureGalleryTransAndOcrLogic.f282241f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                        MMActivity mMActivity = gestureGalleryTransAndOcrLogic.f282241f;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        MMActivity mMActivity2 = mMActivity;
                        C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "handleTranslationReusltEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "handleTranslationReusltEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        gestureGalleryTransAndOcrLogic.f282241f.finish();
                        gestureGalleryTransAndOcrLogic.f282241f.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                    }
                }
            }
            GestureGalleryTransAndOcrLogic.this.f282238c = 0;
            MMActivity mMActivity3 = GestureGalleryTransAndOcrLogic.this.f282241f;
            C76879j.m92713G(mMActivity3, mMActivity3.getString(C0966R.string.ien), "", false, (DialogInterface.OnClickListener) null);
        }
    }
}

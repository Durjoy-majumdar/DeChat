package com.tencent.p014mm.p136ui.chatting.gallery.query;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.query.a */
public final class C97119a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanTransImage f284962d;

    /* renamed from: e */
    public final /* synthetic */ ScanTranslationResultEvent f284963e;

    public C97119a(ScanTransImage scanTransImage, ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f284962d = scanTransImage;
        this.f284963e = scanTranslationResultEvent;
    }

    public final void run() {
        ScanTransImage scanTransImage = this.f284962d;
        int i = scanTransImage.f284955a;
        ScanTranslationResultEvent.C92560a aVar = this.f284963e.f265089d;
        if (i == aVar.f265090a) {
            if (!(!aVar.f265092c || scanTransImage.f284956b == null || scanTransImage.f284957c == null)) {
                if (C86013q1.m106450k(aVar.f265093d)) {
                    Intent intent = new Intent();
                    Activity activity = this.f284962d.f284956b;
                    C87412m.m108591d(activity);
                    Intent className = intent.setClassName(activity, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    C87412m.m108593f(className, "Intent().setClassName(co….ui.TranslationResultUI\")");
                    className.putExtra("original_file_path", this.f284962d.f284958d);
                    C72963f4 f4Var = this.f284962d.f284957c;
                    C87412m.m108591d(f4Var);
                    className.putExtra("msg_id", f4Var.getMsgId());
                    className.putExtra("translate_source", this.f284963e.f265089d.f265091b);
                    C92836k kVar = this.f284962d.f284959e;
                    if (kVar != null) {
                        C87412m.m108591d(kVar);
                        className.putExtra("fileid", kVar.mo127136g());
                        C92836k kVar2 = this.f284962d.f284959e;
                        C87412m.m108591d(kVar2);
                        className.putExtra("aeskey", kVar2.mo127133d());
                    }
                    Activity activity2 = this.f284962d.f284956b;
                    C87412m.m108591d(activity2);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(className);
                    Activity activity3 = activity2;
                    C117292a.m165358d(activity3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1$callback$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity2.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(activity3, "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1$callback$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    Activity activity4 = this.f284962d.f284956b;
                    C87412m.m108591d(activity4);
                    activity4.finish();
                    Activity activity5 = this.f284962d.f284956b;
                    C87412m.m108591d(activity5);
                    activity5.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                    return;
                }
                Log.m105929w("MicroMsg.ScanTransImageUtil", "trans result path %s not exist!", this.f284963e.f265089d.f265093d);
            }
            Activity activity6 = this.f284962d.f284956b;
            C76879j.m92713G(activity6, activity6 != null ? activity6.getString(C0966R.string.ien) : null, "", false, (DialogInterface.OnClickListener) null);
        }
    }
}

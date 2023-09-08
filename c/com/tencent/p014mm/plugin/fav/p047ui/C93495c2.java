package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.fav.ui.c2 */
public class C93495c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationResultEvent f270008d;

    /* renamed from: e */
    public final /* synthetic */ PhotoTransControl.C934751 f270009e;

    public C93495c2(PhotoTransControl.C934751 r1, ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f270009e = r1;
        this.f270008d = scanTranslationResultEvent;
    }

    public void run() {
        if (PhotoTransControl.this.f269947c == this.f270008d.f265089d.f265090a) {
            PhotoTransControl.this.mo128355b();
            ScanTranslationResultEvent.C92560a aVar = this.f270008d.f265089d;
            if (aVar.f265092c) {
                if (C86013q1.m106450k(aVar.f265093d)) {
                    String u5 = PhotoTransControl.this.f269949e.mo86627u5();
                    Intent intent = new Intent();
                    intent.putExtra("original_file_path", u5);
                    intent.putExtra("translate_source", this.f270008d.f265089d.f265091b);
                    intent.setClassName(PhotoTransControl.this.f269950f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    intent.putExtra("fileid", PhotoTransControl.this.f269949e.mo86626s2());
                    intent.putExtra("aeskey", PhotoTransControl.this.f269949e.getAesKey());
                    MMActivity mMActivity = PhotoTransControl.this.f269950f;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    MMActivity mMActivity2 = mMActivity;
                    C117292a.m165358d(mMActivity2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/PhotoTransControl$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/fav/ui/PhotoTransControl$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    PhotoTransControl.this.f269950f.finish();
                    PhotoTransControl.this.f269950f.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                    return;
                }
                Log.m105929w("MicroMsg.PhotoTransControl", "trans result path %s not exist!", this.f270008d.f265089d.f265093d);
            }
            PhotoTransControl.this.f269947c = 0;
            MMActivity mMActivity3 = PhotoTransControl.this.f269950f;
            C76879j.m92713G(mMActivity3, mMActivity3.getString(C0966R.string.ien), "", false, (DialogInterface.OnClickListener) null);
        }
    }
}

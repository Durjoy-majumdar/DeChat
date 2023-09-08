package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.SnsBaseGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.r3 */
public class C96196r3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationResultEvent f281028d;

    /* renamed from: e */
    public final /* synthetic */ SnsBaseGalleryUI.C9547012 f281029e;

    public C96196r3(SnsBaseGalleryUI.C9547012 r1, ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f281029e = r1;
        this.f281028d = scanTranslationResultEvent;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12$1");
        SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
        int i = SnsBaseGalleryUI.f277739N;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int i2 = snsBaseGalleryUI.f277771y;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (i2 == this.f281028d.f265089d.f265090a) {
            SnsBaseGalleryUI.this.mo132602x3();
            ScanTranslationResultEvent.C92560a aVar = this.f281028d.f265089d;
            C101804kv2 kv22 = null;
            boolean z = false;
            if (aVar.f265092c) {
                if (C86013q1.m106450k(aVar.f265093d)) {
                    SnsInfoFlip snsInfoFlip = SnsBaseGalleryUI.this.f277761o;
                    String m = snsInfoFlip != null ? C94901o.m120385m(snsInfoFlip.getCntMedia()) : null;
                    Intent intent = new Intent();
                    intent.putExtra("original_file_path", m);
                    intent.putExtra("translate_source", this.f281028d.f265089d.f265091b);
                    if (SnsBaseGalleryUI.this.getIntent().hasExtra("sns_gallery_thumb_location")) {
                        intent.putExtra("thumb_location", (Rect) SnsBaseGalleryUI.this.getIntent().getParcelableExtra("sns_gallery_thumb_location"));
                    }
                    SnsInfoFlip snsInfoFlip2 = SnsBaseGalleryUI.this.f277761o;
                    if (snsInfoFlip2 != null) {
                        kv22 = snsInfoFlip2.getCntMedia();
                    }
                    if (kv22 != null) {
                        intent.putExtra("fileid", kv22.f298692g);
                    }
                    intent.setClassName(SnsBaseGalleryUI.this, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    SnsBaseGalleryUI snsBaseGalleryUI2 = SnsBaseGalleryUI.this;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    SnsBaseGalleryUI snsBaseGalleryUI3 = snsBaseGalleryUI2;
                    C117292a.m165358d(snsBaseGalleryUI3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$12$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    snsBaseGalleryUI2.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(snsBaseGalleryUI3, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$12$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    SnsBaseGalleryUI snsBaseGalleryUI4 = SnsBaseGalleryUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    snsBaseGalleryUI4.getClass();
                    SnsMethodCalculate.markStartTimeMs("shouldFinishUIAfterTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    if (snsBaseGalleryUI4.mo132590S7() == 3) {
                        SnsMethodCalculate.markEndTimeMs("shouldFinishUIAfterTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        z = true;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("shouldFinishUIAfterTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    }
                    SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    if (z) {
                        SnsBaseGalleryUI.this.finish();
                    }
                    SnsBaseGalleryUI.this.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12$1");
                    return;
                }
                Log.m105929w("MicroMsg.SnsBaseGalleryUI", "trans result path %s not exist!", this.f281028d.f265089d.f265093d);
            }
            SnsBaseGalleryUI snsBaseGalleryUI5 = SnsBaseGalleryUI.this;
            snsBaseGalleryUI5.getClass();
            SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            snsBaseGalleryUI5.f277771y = 0;
            SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            SnsBaseGalleryUI snsBaseGalleryUI6 = SnsBaseGalleryUI.this;
            C76879j.m92713G(snsBaseGalleryUI6, snsBaseGalleryUI6.getString(C0966R.string.ien), "", false, (DialogInterface.OnClickListener) null);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12$1");
    }
}

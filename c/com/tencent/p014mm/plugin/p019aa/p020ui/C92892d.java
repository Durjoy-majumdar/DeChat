package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.aa.ui.d */
public class C92892d implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ MultiTouchImageView f267582a;

    /* renamed from: b */
    public final /* synthetic */ AAImagPreviewUI f267583b;

    /* renamed from: com.tencent.mm.plugin.aa.ui.d$a */
    public class C92893a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f267584d;

        public C92893a(Bitmap bitmap) {
            this.f267584d = bitmap;
        }

        public void run() {
            Dialog dialog = C92892d.this.f267583b.f267565i;
            if (dialog != null && dialog.isShowing()) {
                C92892d.this.f267583b.f267565i.dismiss();
            }
            Bitmap bitmap = this.f267584d;
            if (bitmap == null) {
                Log.m105920e("MicroMsg.PreviewHdHeadImg", "showAAImag onLoadImageEnd bm == null");
                C92892d.this.f267583b.finish();
                return;
            }
            C92892d dVar = C92892d.this;
            dVar.f267583b.mo127272I7(dVar.f267582a, bitmap);
        }
    }

    public C92892d(AAImagPreviewUI aAImagPreviewUI, MultiTouchImageView multiTouchImageView) {
        this.f267583b = aAImagPreviewUI;
        this.f267582a = multiTouchImageView;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        Log.m105925i("MicroMsg.PreviewHdHeadImg", "onLoadImageEnd() url:%s path:%s", str, str2);
        MMHandlerThread.postToMainThread(new C92893a(bitmap));
    }
}

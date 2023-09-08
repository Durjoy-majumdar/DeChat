package com.tencent.p014mm.plugin.game.media.preview;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.game.media.preview.GameVideoPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p625nu.C100196e;
import vw1.C102299l;

/* renamed from: com.tencent.mm.plugin.game.media.preview.c */
public class C94136c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102299l f271876d;

    /* renamed from: e */
    public final /* synthetic */ GameVideoPreviewUI.C94126h.C94127a f271877e;

    /* renamed from: com.tencent.mm.plugin.game.media.preview.c$a */
    public class C94137a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f271878d;

        public C94137a(Bitmap bitmap) {
            this.f271878d = bitmap;
        }

        public void run() {
            C94136c.this.f271877e.f271848C.setVisibility(8);
            C94136c.this.f271877e.f271847B.setImageBitmap(this.f271878d);
            Log.m105925i("MicroMsg.Haowan.GameVideoPreviewUI", "load thumb:%s", C94136c.this.f271876d.f301300i);
        }
    }

    public C94136c(GameVideoPreviewUI.C94126h hVar, C102299l lVar, GameVideoPreviewUI.C94126h.C94127a aVar) {
        this.f271876d = lVar;
        this.f271877e = aVar;
    }

    public void run() {
        Bitmap rk = ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(this.f271876d.f301300i);
        if (rk != null) {
            this.f271877e.f271847B.post(new C94137a(rk));
        }
    }
}

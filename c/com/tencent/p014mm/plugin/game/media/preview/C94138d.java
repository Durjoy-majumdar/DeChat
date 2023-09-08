package com.tencent.p014mm.plugin.game.media.preview;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.game.media.preview.GameVideoPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C21070h;
import jc0.C21210b;

/* renamed from: com.tencent.mm.plugin.game.media.preview.d */
public class C94138d implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ GameVideoPreviewUI.C94126h.C94127a f271880a;

    /* renamed from: com.tencent.mm.plugin.game.media.preview.d$a */
    public class C94139a implements Runnable {
        public C94139a() {
        }

        public void run() {
            C94138d.this.f271880a.f271848C.setVisibility(8);
        }
    }

    public C94138d(GameVideoPreviewUI.C94126h hVar, GameVideoPreviewUI.C94126h.C94127a aVar) {
        this.f271880a = aVar;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        if (bVar != null && bVar.f59988d != null) {
            Log.m105925i("MicroMsg.Haowan.GameVideoPreviewUI", "load thumb:%s, from:%d", str, Integer.valueOf(bVar.f59986b));
            this.f271880a.f271848C.post(new C94139a());
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}

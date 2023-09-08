package com.tencent.p014mm.plugin.webview.model;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.webview.model.C6062v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import ic0.C21070h;
import jc0.C21210b;
import kg3.C76577a;
import p003ay.C0235b;

/* renamed from: com.tencent.mm.plugin.webview.model.u1 */
public class C6059u1 implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ String f22355a;

    /* renamed from: b */
    public final /* synthetic */ String f22356b;

    /* renamed from: c */
    public final /* synthetic */ C6062v1.C6063a f22357c;

    /* renamed from: com.tencent.mm.plugin.webview.model.u1$a */
    public class C6060a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f22358d;

        public C6060a(C6059u1 u1Var, Intent intent) {
            this.f22358d = intent;
        }

        public void run() {
            ((C0235b) C86312j.m106911c(C0235b.class)).rb0(MMApplicationContext.getContext(), this.f22358d);
        }
    }

    public C6059u1(String str, String str2, C6062v1.C6063a aVar) {
        this.f22355a = str;
        this.f22356b = str2;
        this.f22357c = aVar;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        if (bVar.f59985a != 0 || bVar.f59988d == null) {
            C6062v1.m5941b(this.f22357c, false);
            return;
        }
        int g = (int) (C76577a.m92156g(MMApplicationContext.getContext()) * 48.0f);
        Bitmap bitmap = null;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bVar.f59988d, g, g, false);
        if (createScaledBitmap != null) {
            bitmap = createScaledBitmap.copy(Bitmap.Config.ARGB_8888, true);
            Log.m105925i("MicroMsg.WebViewShortcutManager", "bitmap recycle %s", createScaledBitmap);
            createScaledBitmap.recycle();
        }
        Intent a = C6062v1.m5940a(bitmap, this.f22355a, this.f22356b, true);
        if (a == null) {
            Log.m105920e("MicroMsg.WebViewShortcutManager", "intent is null");
            C6062v1.m5941b(this.f22357c, false);
            return;
        }
        MMHandlerThread.postToMainThreadDelayed(new C6060a(this, a), 500);
        C6062v1.m5941b(this.f22357c, true);
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}

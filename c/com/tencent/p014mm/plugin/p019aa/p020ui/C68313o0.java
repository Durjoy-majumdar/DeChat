package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.aa.ui.o0 */
public class C68313o0 implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ LaunchAAUI f196337a;

    /* renamed from: com.tencent.mm.plugin.aa.ui.o0$a */
    public class C68314a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f196338d;

        public C68314a(Bitmap bitmap) {
            this.f196338d = bitmap;
        }

        public void run() {
            Bitmap bitmap = this.f196338d;
            if (bitmap != null) {
                C68313o0.this.f196337a.f196159z.setImageBitmap(bitmap);
                return;
            }
            LaunchAAUI launchAAUI = C68313o0.this.f196337a;
            launchAAUI.f196158y0 = 2;
            launchAAUI.f196159z.setVisibility(8);
            C68313o0.this.f196337a.f196155x.setVisibility(0);
            C68313o0.this.f196337a.f196157y.setVisibility(0);
        }
    }

    public C68313o0(LaunchAAUI launchAAUI) {
        this.f196337a = launchAAUI;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = str;
        if (bitmap == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = str2;
        Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onLoadImageEnd() url:%s bitmap==null:%s path:%s", objArr);
        this.f196337a.f196112R0 = str2;
        MMHandlerThread.postToMainThread(new C68314a(bitmap));
    }
}

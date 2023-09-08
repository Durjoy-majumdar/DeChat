package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import zs2.C112685b;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.a */
public class C115756a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f347285d;

    /* renamed from: e */
    public final /* synthetic */ String f347286e;

    /* renamed from: f */
    public final /* synthetic */ C115750SphereImageView f347287f;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.a$a */
    public class C115757a implements Runnable {
        public C115757a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3$1");
            C115756a aVar = C115756a.this;
            aVar.f347287f.f347269p0.mo131838b(aVar.f347286e);
            Log.m105924i("SphereImageView.SphereView", "onUpdateImage, isAvailable=" + C115756a.this.f347287f.isAvailable());
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3$1");
        }
    }

    public C115756a(C115750SphereImageView sphereImageView, Bitmap bitmap, String str) {
        this.f347287f = sphereImageView;
        this.f347285d = bitmap;
        this.f347286e = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3");
        StringBuilder sb = new StringBuilder();
        sb.append("updateImage in GLThread, bmp.w=");
        Bitmap bitmap = this.f347285d;
        sb.append(bitmap == null ? 0 : bitmap.getWidth());
        sb.append(", h=");
        Bitmap bitmap2 = this.f347285d;
        sb.append(bitmap2 == null ? 0 : bitmap2.getHeight());
        Log.m105924i("SphereImageView.SphereView", sb.toString());
        C106164b g = C115750SphereImageView.m162797g(this.f347287f);
        Bitmap bitmap3 = this.f347285d;
        g.getClass();
        SnsMethodCalculate.markStartTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            int i = g.f316286j;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                Log.m105924i("SphereImageView.SphereRender", "delete old texture");
            }
            int b = C112685b.m154069b(bitmap3);
            Log.m105924i("SphereImageView.SphereRender", "updateImage, oldId=" + g.f316286j + ", newId=" + b + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
            g.f316286j = b;
        } catch (Throwable th) {
            Log.m105920e("SphereImageView.SphereRender", "updateImage, exp:" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        this.f347287f.mo176044d();
        C115750SphereImageView sphereImageView = this.f347287f;
        if (sphereImageView.f347269p0 != null) {
            sphereImageView.f347256J.post(new C115757a());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3");
    }
}

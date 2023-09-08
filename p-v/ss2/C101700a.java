package ss2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import rs2.C101462c;

/* renamed from: ss2.a */
public class C101700a extends View {

    /* renamed from: d */
    public C101462c f297755d;

    public C101700a(Context context, C101462c cVar) {
        super(context);
        this.f297755d = cVar;
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarCover");
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int min = (int) (((double) (((float) Math.min(height, width)) / 2.0f)) * 0.8d);
        int i = (int) (((float) width) / 2.0f);
        int i2 = (int) (((float) height) / 2.0f);
        C101462c cVar = this.f297755d;
        cVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        Bitmap bitmap = cVar.f297155m;
        SnsMethodCalculate.markEndTimeMs("getBorderImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
        if (bitmap != null) {
            C101462c cVar2 = this.f297755d;
            cVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            float f = cVar2.f297156n;
            SnsMethodCalculate.markEndTimeMs("getBorderImgWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.entity.GridLayerStyle");
            int i3 = (int) (((float) (min * 2)) + (f * 2.0f));
            int width2 = (bitmap.getWidth() * i3) / bitmap.getHeight();
            canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, width2, i3, false), (float) (i - (width2 >>> 1)), (float) (i2 - (i3 >>> 1)), (Paint) null);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarCover");
    }
}

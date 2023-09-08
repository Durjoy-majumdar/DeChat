package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView */
public class TimelineRefreshImageView extends ImageView {
    public TimelineRefreshImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void buildDrawingCache(boolean z) {
        SnsMethodCalculate.markStartTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        SnsMethodCalculate.markStartTimeMs("checkIfCanReuseDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        try {
            Field declaredField = View.class.getDeclaredField(z ? "mDrawingCache" : "mUnscaledDrawingCache");
            declaredField.setAccessible(true);
            Bitmap bitmap = (Bitmap) declaredField.get(this);
            Log.m105918d("MicroMsg.TimelineRefreshImageView", bitmap == null ? "cache is null" : String.format("cache.width: %s, cache.height: %s, width: %s, height: %s", new Object[]{Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(getHeight())}));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TimelineRefreshImageView", e, "", new Object[0]);
            Log.m105921e("MicroMsg.TimelineRefreshImageView", "checkIfCanReuseDrawingCache error: %s", e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("checkIfCanReuseDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        Log.m105919d("MicroMsg.TimelineRefreshImageView", "buildDrawingCache, autoScale: %s, width: %s, height: %s, hash: %s", Boolean.valueOf(z), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()));
        super.buildDrawingCache(z);
        SnsMethodCalculate.markEndTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
    }

    public void destroyDrawingCache() {
        SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
        super.destroyDrawingCache();
        Log.m105919d("MicroMsg.TimelineRefreshImageView", "destroyDrawingCache, width: %s, height: %s, hash: %s", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()));
        SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView");
    }

    public TimelineRefreshImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

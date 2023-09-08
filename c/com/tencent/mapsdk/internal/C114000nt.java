package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.map.lib.models.ScatterPlotInfo;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.nt */
public class C114000nt extends ScatterPlotInfo implements C113973mu {

    /* renamed from: a */
    public ScatterPlotOverlayProvider f340981a;

    public C114000nt(Context context, ScatterPlotOverlayProvider scatterPlotOverlayProvider) {
        this.f340981a = scatterPlotOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(scatterPlotOverlayProvider.getData());
        setDataList(arrayList);
        this.visible = scatterPlotOverlayProvider.isVisibility();
        this.opacity = scatterPlotOverlayProvider.getOpacity();
        this.maxZoom = scatterPlotOverlayProvider.getMaxZoom();
        this.minZoom = scatterPlotOverlayProvider.getMinZoom();
        this.draw3D = scatterPlotOverlayProvider.isEnable3D();
        this.level = scatterPlotOverlayProvider.getDisplayLevel();
        this.mType = scatterPlotOverlayProvider.getType();
        this.zIndex = scatterPlotOverlayProvider.getZIndex();
        if (scatterPlotOverlayProvider instanceof DotScatterPlotOverlayProvider) {
            DotScatterPlotOverlayProvider dotScatterPlotOverlayProvider = (DotScatterPlotOverlayProvider) scatterPlotOverlayProvider;
            this.radius = dotScatterPlotOverlayProvider.getRadius();
            this.colors = dotScatterPlotOverlayProvider.getColors();
            this.mAnimate = dotScatterPlotOverlayProvider.isAnimate();
        } else if (scatterPlotOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
            BitmapScatterPlotOverlayProvider bitmapScatterPlotOverlayProvider = (BitmapScatterPlotOverlayProvider) scatterPlotOverlayProvider;
            this.mBitmapWidth = bitmapScatterPlotOverlayProvider.getWidth();
            this.mBitmapHeight = bitmapScatterPlotOverlayProvider.getHeight();
            if (bitmapScatterPlotOverlayProvider.getBitmaps() != null && bitmapScatterPlotOverlayProvider.getBitmaps().length > 0) {
                this.mBitmaps = new Bitmap[bitmapScatterPlotOverlayProvider.getBitmaps().length];
                for (int i = 0; i < bitmapScatterPlotOverlayProvider.getBitmaps().length; i++) {
                    BitmapDescriptor bitmapDescriptor = bitmapScatterPlotOverlayProvider.getBitmaps()[i];
                    if (bitmapDescriptor != null) {
                        Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                        if (!(bitmap == null || (this.mBitmapWidth == bitmap.getWidth() && this.mBitmapHeight == bitmap.getHeight()))) {
                            int i2 = this.mBitmapWidth;
                            int i3 = this.mBitmapHeight;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Matrix matrix = new Matrix();
                            matrix.postScale(((float) i2) / ((float) width), ((float) i3) / ((float) height));
                            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                        }
                        this.mBitmaps[i] = bitmap;
                    } else {
                        this.mBitmaps[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m158398a(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: a */
    private ScatterPlotOverlayProvider m158399a() {
        return this.f340981a;
    }
}

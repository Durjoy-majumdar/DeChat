package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static final AtomicInteger sAttachIndex = new AtomicInteger(0);
    private static final List<TencentMapContext> sTencentMapContextList = new CopyOnWriteArrayList();

    private BitmapDescriptorFactory() {
    }

    public static void attachMapContext(TencentMapContext tencentMapContext) {
        List<TencentMapContext> list = sTencentMapContextList;
        if (!list.contains(tencentMapContext)) {
            list.add(tencentMapContext);
            sAttachIndex.incrementAndGet();
        }
    }

    private static Bitmap createBitmapFromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            if (!bitmap.isRecycled()) {
                return bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap[] createBitmapFromBitmaps(Bitmap... bitmapArr) {
        int length = bitmapArr.length;
        Bitmap[] bitmapArr2 = new Bitmap[length];
        int i = 0;
        while (i < length) {
            try {
                bitmapArr2[i] = createBitmapFromBitmap(bitmapArr[i]);
                i++;
            } catch (Throwable unused) {
            }
        }
        return bitmapArr2;
    }

    public static BitmapDescriptor defaultMarker() {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return defaultMarker(activeMapContext);
        }
        return null;
    }

    public static void detachMapContext(TencentMapContext tencentMapContext) {
        if (sTencentMapContextList.remove(tencentMapContext)) {
            sAttachIndex.decrementAndGet();
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromAsset(activeMapContext, str);
        }
        return null;
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromBitmap(activeMapContext, bitmap);
        }
        return null;
    }

    public static BitmapDescriptor fromBitmaps(Bitmap... bitmapArr) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromBitmaps(activeMapContext, bitmapArr);
        }
        return null;
    }

    public static BitmapDescriptor fromFile(String str) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromFile(activeMapContext, str);
        }
        return null;
    }

    public static BitmapDescriptor fromPath(String str) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromPath(activeMapContext, str);
        }
        return null;
    }

    public static BitmapDescriptor fromResource(int i) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromResource(activeMapContext, i);
        }
        return null;
    }

    public static BitmapDescriptor fromView(View view) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return fromView(activeMapContext, view);
        }
        return null;
    }

    private static TencentMapContext getActiveMapContext() {
        int i = sAttachIndex.get();
        if (i <= 0) {
            return null;
        }
        List<TencentMapContext> list = sTencentMapContextList;
        if (i <= list.size()) {
            return list.get(i - 1);
        }
        return null;
    }

    public static BitmapDescriptor defaultMarker(float f) {
        TencentMapContext activeMapContext = getActiveMapContext();
        if (activeMapContext != null) {
            return defaultMarker(activeMapContext, f);
        }
        return null;
    }

    public static BitmapDescriptor fromAsset(TencentMapContext tencentMapContext, String str) {
        return tencentMapContext.createBitmapDescriptor(str, 2);
    }

    public static BitmapDescriptor fromBitmap(TencentMapContext tencentMapContext, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return tencentMapContext.createBitmapDescriptor(createBitmapFromBitmap(bitmap), 7);
    }

    public static BitmapDescriptor fromBitmaps(TencentMapContext tencentMapContext, Bitmap... bitmapArr) {
        if (tencentMapContext == null || bitmapArr == null) {
            return null;
        }
        return tencentMapContext.createBitmapDescriptor(createBitmapFromBitmaps(bitmapArr), 10);
    }

    public static BitmapDescriptor fromFile(TencentMapContext tencentMapContext, String str) {
        return tencentMapContext.createBitmapDescriptor(str, 3);
    }

    public static BitmapDescriptor fromPath(TencentMapContext tencentMapContext, String str) {
        return tencentMapContext.createBitmapDescriptor(str, 4);
    }

    public static BitmapDescriptor fromResource(TencentMapContext tencentMapContext, int i) {
        return tencentMapContext.createBitmapDescriptor(i, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor fromView(com.tencent.tencentmap.mapsdk.maps.TencentMapContext r5, android.view.View r6) {
        /*
            java.lang.Class<com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory> r0 = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.class
            monitor-enter(r0)
            r1 = 0
            if (r6 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            r2 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r6.measure(r3, r4)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            int r3 = r6.getMeasuredWidth()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            int r4 = r6.getMeasuredHeight()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r6.layout(r2, r2, r3, r4)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r6.buildDrawingCache()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            android.graphics.Bitmap r2 = r6.getDrawingCache()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r5 = fromBitmap(r5, r2)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r6.destroyDrawingCache()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            monitor-exit(r0)
            return r5
        L_0x002f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L_0x0032:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(com.tencent.tencentmap.mapsdk.maps.TencentMapContext, android.view.View):com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor");
    }

    public static BitmapDescriptor defaultMarker(TencentMapContext tencentMapContext) {
        return tencentMapContext.createBitmapDescriptor(5);
    }

    public static BitmapDescriptor defaultMarker(TencentMapContext tencentMapContext, float f) {
        return tencentMapContext.createBitmapDescriptor(f, 6);
    }
}

package com.tencent.mapsdk.raster.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mapsdk.rastercore.core.MapContext;
import com.tencent.mapsdk.rastercore.tools.C40004IO;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class BitmapDescriptorFactory {
    public static BitmapDescriptor defaultMarker() {
        return fromAsset("marker.png");
    }

    public static BitmapDescriptor fromAsset(String str) {
        Class<BitmapDescriptorFactory> cls = BitmapDescriptorFactory.class;
        try {
            InputStream resourceAsStream = cls.getResourceAsStream("/assets/" + str);
            Bitmap decodeStream = BitmapFactory.decodeStream(resourceAsStream);
            resourceAsStream.close();
            return fromBitmap(decodeStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDescriptor(bitmap);
    }

    public static BitmapDescriptor fromFile(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            fileInputStream.close();
            return fromBitmap(decodeStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        try {
            return fromBitmap(BitmapFactory.decodeFile(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        InputStream inputStream;
        Throwable th;
        try {
            Context context = MapContext.getContext();
            if (context != null) {
                inputStream = context.getResources().openRawResource(i);
                try {
                    BitmapDescriptor fromBitmap = fromBitmap(BitmapFactory.decodeStream(inputStream));
                    C40004IO.safeClose(inputStream);
                    return fromBitmap;
                } catch (Exception unused) {
                    C40004IO.safeClose(inputStream);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    C40004IO.safeClose(inputStream);
                    throw th;
                }
            } else {
                C40004IO.safeClose((Closeable) null);
                return null;
            }
        } catch (Exception unused2) {
            inputStream = null;
            C40004IO.safeClose(inputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            C40004IO.safeClose(inputStream);
            throw th;
        }
    }

    public static BitmapDescriptor fromView(View view) {
        try {
            Context context = MapContext.getContext();
            if (context != null) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(view);
                frameLayout.destroyDrawingCache();
                return fromBitmap(getViewBitmap(frameLayout));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static Bitmap getViewBitmap(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache().copy(Bitmap.Config.ARGB_8888, false);
    }
}

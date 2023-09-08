package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.tencent.mapsdk.internal.qu */
public final class C114123qu extends UrlTileProvider {

    /* renamed from: a */
    public static int f341604a = 0;

    /* renamed from: c */
    private static final int f341605c = 256;

    /* renamed from: b */
    public TileOverlayOptions f341606b;

    public C114123qu(TileOverlayOptions tileOverlayOptions) {
        super(256, 256);
        this.f341606b = tileOverlayOptions;
        int a = C114121qs.m159235a();
        f341604a = a;
        TileOverlayOptions tileOverlayOptions2 = this.f341606b;
        if (tileOverlayOptions2 != null) {
            tileOverlayOptions2.versionInfo(Integer.toString(a));
        }
    }

    /* renamed from: a */
    public static String m159244a() {
        return Integer.toString(f341604a);
    }

    /* renamed from: b */
    private void m159245b() {
        int a = C114121qs.m159235a();
        f341604a = a;
        TileOverlayOptions tileOverlayOptions = this.f341606b;
        if (tileOverlayOptions != null) {
            tileOverlayOptions.versionInfo(Integer.toString(a));
        }
    }

    public final URL getTileUrl(int i, int i2, int i3) {
        String sketchTileUrl = ((C113617dc) ((C113634dq) C113601cl.m156511a(C113634dq.class)).mo171932h()).sketchTileUrl(i, (int) ((Math.pow(2.0d, (double) i3) - 1.0d) - ((double) i2)), i3, f341604a);
        try {
            if (!TextUtils.isEmpty(sketchTileUrl)) {
                return new URL(sketchTileUrl);
            }
            return null;
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}

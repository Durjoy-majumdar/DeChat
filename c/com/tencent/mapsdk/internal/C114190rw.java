package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.util.Log;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.tencent.mapsdk.internal.rw */
public final class C114190rw extends OverSeaTileProvider {

    /* renamed from: a */
    private C114199sd f341881a;

    /* renamed from: b */
    private C113792gv f341882b;

    /* renamed from: c */
    private Language f341883c = Language.zh;

    /* renamed from: d */
    private OverSeaSource f341884d;

    /* renamed from: com.tencent.mapsdk.internal.rw$1 */
    public static /* synthetic */ class C1141911 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f341885a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource[] r0 = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f341885a = r0
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource r1 = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f341885a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource r1 = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.SPARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114190rw.C1141911.<clinit>():void");
        }
    }

    public C114190rw(C114199sd sdVar, OverSeaSource overSeaSource, C113792gv gvVar) {
        super(sdVar.f341919a, sdVar.f341922d);
        this.f341882b = gvVar;
        this.f341884d = overSeaSource;
        this.f341881a = sdVar;
    }

    public final Bitmap getLogo(boolean z) {
        return null;
    }

    public final URL getTileUrl(int i, int i2, int i3) {
        C114199sd sdVar = this.f341881a;
        String name = this.f341883c.name();
        String str = sdVar.f341923e;
        int[] iArr = sdVar.f341924f;
        String replaceFirst = (iArr.length == 0 ? str.replaceFirst("\\{range\\}", "") : str.replaceFirst("\\{range\\}", Integer.toString(C114199sd.m159614a(i + i2, iArr.length)))).replaceFirst("\\{z\\}", Integer.toString(i3)).replaceFirst("\\{x\\}", Integer.toString(i)).replaceFirst("\\{y\\}", Integer.toString(i2)).replaceFirst("\\{style\\}", Integer.toString(sdVar.f341920b)).replaceFirst("\\{scene\\}", Integer.toString(sdVar.f341921c)).replaceFirst("\\{version\\}", Integer.toString(sdVar.f341922d)).replaceFirst("\\{ch\\}", name);
        if (replaceFirst != null) {
            C113889km.m157550c(C0949kl.f2238h, "请求海外图瓦片：".concat(replaceFirst));
            try {
                return new URL(replaceFirst);
            } catch (MalformedURLException e) {
                C113889km.m157549c(Log.getStackTraceString(e));
            }
        }
        return null;
    }

    public final boolean onLanguageChange(Language language) {
        this.f341883c = language;
        return false;
    }

    public final NetResponse requestTileData(String str) {
        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
        byte[] bArr = doGet != null ? doGet.data : null;
        if (!(bArr == null || bArr.length == 0 || this.f341882b == null)) {
            int i = C1141911.f341885a[this.f341884d.ordinal()];
            if (i == 1) {
                this.f341882b.mo172155b().f340423a++;
            } else if (i == 2) {
                this.f341882b.mo172155b().f340424b++;
            }
        }
        return doGet;
    }
}

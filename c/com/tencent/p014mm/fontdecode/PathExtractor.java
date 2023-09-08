package com.tencent.p014mm.fontdecode;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.fontdecode.PathExtractor */
public class PathExtractor {

    /* renamed from: a */
    public long f310684a;

    /* renamed from: com.tencent.mm.fontdecode.PathExtractor$Metrics */
    public static class Metrics {
        public float ascender;
        public float descender;
        public float height;
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("fontdecode");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/fontdecode/PathExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/fontdecode/PathExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public PathExtractor(String str) {
        long nInit = nInit(str);
        this.f310684a = nInit;
        if (nInit != 0) {
            Log.m105925i("MicroMsg.PathExtractor", "create for %s, %d", str, Long.valueOf(nInit));
            return;
        }
        Log.m105921e("MicroMsg.PathExtractor", "create for %s failed", str);
    }

    private static native boolean nExtractPath(long j, char c, Path path, int[] iArr);

    private static native void nFinalize(long j);

    private static native void nGetMetrics(long j, Metrics metrics);

    private static native long nInit(String str);

    private static native void nSetTextSize(long j, int i);

    /* renamed from: a */
    public boolean mo148235a(char c, Path path, RectF rectF) {
        boolean z;
        if (path == null) {
            Log.m105918d("MicroMsg.PathExtractor", "path is null");
            return false;
        }
        int[] iArr = new int[4];
        try {
            z = nExtractPath(this.f310684a, c, path, iArr);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.PathExtractor", "extract path error %c", Character.valueOf(c));
            z = false;
        }
        if (z) {
            Matrix matrix = new Matrix();
            matrix.setScale(0.015625f, 0.015625f);
            path.transform(matrix);
            if (rectF != null) {
                rectF.set(((float) iArr[0]) * 0.015625f, ((float) iArr[3]) * 0.015625f, ((float) iArr[2]) * 0.015625f, ((float) iArr[1]) * 0.015625f);
            }
            Log.m105924i("MicroMsg.PathExtractor", "load path for " + c);
            return true;
        }
        Log.m105928w("MicroMsg.PathExtractor", "not such char " + c);
        return false;
    }

    /* renamed from: b */
    public void mo148236b(Metrics metrics) {
        if (metrics == null) {
            Log.m105928w("MicroMsg.PathExtractor", "metrics is null");
            return;
        }
        nGetMetrics(this.f310684a, metrics);
        metrics.height *= 0.015625f;
        metrics.ascender *= 0.015625f;
        metrics.descender *= 0.015625f;
    }

    /* renamed from: c */
    public void mo148237c(int i) {
        Log.m105925i("MicroMsg.PathExtractor", "set text size %d, %d", Long.valueOf(this.f310684a), Integer.valueOf(i));
        nSetTextSize(this.f310684a, i);
    }

    public void finalize() {
        try {
            nFinalize(this.f310684a);
        } finally {
            super.finalize();
        }
    }
}

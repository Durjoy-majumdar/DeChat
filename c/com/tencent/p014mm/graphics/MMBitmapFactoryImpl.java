package com.tencent.p014mm.graphics;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import com.tencent.p014mm.feature.performance.C1252t;
import com.tencent.p014mm.feature.performance.C80867u;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86002c2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.stubs.logger.Log;
import j20.C117292a;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import k20.C9556a;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.graphics.MMBitmapFactoryImpl */
class MMBitmapFactoryImpl {
    private static final int DENSITY_DEFAULT = 160;
    private static final int REWIND_BUFFER_SIZE = 8388608;
    private static final String TAG = "MicroMsg.MMBitmapFactory";
    private static final int TEMP_STORAGE_SIZE = 4096;
    private static final MMBitmapFactory.C80870a[] sNativeLibraryLoader = {null};
    private byte _hellAccFlag_;
    private C80875a mDecodeCanary;
    private boolean mForceUsingSystemDecoderOpt;
    private MMBitmapFactory.C80871b mStreamProvider;

    /* renamed from: com.tencent.mm.graphics.MMBitmapFactoryImpl$b */
    public static class C80873b extends FilterInputStream {

        /* renamed from: d */
        public long f237699d = 0;

        public C80873b(FileInputStream fileInputStream) {
            super(fileInputStream);
        }

        public synchronized void mark(int i) {
            try {
                this.f237699d = ((FileInputStream) this.in).getChannel().position();
            } catch (IOException e) {
                Log.m106499e(MMBitmapFactoryImpl.TAG, (Throwable) e, "fail to mark position.");
                this.f237699d = -1;
            }
            return;
        }

        public boolean markSupported() {
            return true;
        }

        public synchronized void reset() {
            if (this.f237699d >= 0) {
                ((FileInputStream) this.in).getChannel().position(this.f237699d);
            } else {
                throw new IOException("Illegal marked position: " + this.f237699d);
            }
        }
    }

    /* renamed from: com.tencent.mm.graphics.MMBitmapFactoryImpl$c */
    public static final class C80874c {

        /* renamed from: a */
        public static final MMBitmapFactoryImpl f237700a = new MMBitmapFactoryImpl();
    }

    private void announceDecodeResult(BitmapFactory.Options options, Bitmap bitmap, boolean z) {
        assertNotNull(options, "[-] opts is null.");
        String str = z ? "system" : "mmcodec";
        int i = 0;
        if (!(bitmap == null && options.outMimeType == null) && options.outWidth > 0 && options.outHeight > 0) {
            Log.m106506i(TAG, "[+] decode success by %s, boundsOnly:%s, w:%s, h:%s, mime-type:%s, sampleSize:%s", str, Boolean.valueOf(options.inJustDecodeBounds), Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), options.outMimeType, Integer.valueOf(options.inSampleSize));
            if (this.mDecodeCanary != null && bitmap != null && !options.inJustDecodeBounds) {
                int byteCount = bitmap.getByteCount();
                this.mDecodeCanary.getClass();
                if (((long) byteCount) >= 20971520) {
                    C80867u uVar = (C80867u) this.mDecodeCanary;
                    uVar.getClass();
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.PluginPerformance", "WARNING: bitmap decode oversize \n(%s B/%s B), [w:%s, h:%s]", Integer.valueOf(byteCount), 20971520L, Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                    Throwable th = new Throwable();
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.PluginPerformance", th, "bitmap stacktrace", new Object[0]);
                    if (byteCount > 52428800) {
                        C117407d.INSTANCE.mo160131h(18613, MMApplicationContext.getProcessName(), android.util.Log.getStackTraceString(th).replace(10, ';').replace("\t", ""), Integer.valueOf(byteCount), BuildInfo.BUILD_TAG, BuildInfo.REV);
                        i = 2;
                    } else if (byteCount > 31457280) {
                        i = 1;
                    }
                    C117407d.INSTANCE.mo182088q(1230, i);
                    if (WeChatEnvironment.hasDebugger()) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C1252t(uVar, byteCount, options));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Log.m106498e(TAG, "[+] fail to decode by %s", str);
    }

    private static void assertNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private Bitmap decodeByteArrayInternal(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (isForceSystemDecoder(options)) {
            Log.m106513w(TAG, "[!] force decoding data by system codec.");
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            announceDecodeResult(options, decodeByteArray, true);
            return decodeByteArray;
        }
        try {
            Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options);
            if (options.outMimeType != null) {
                announceDecodeResult(options, nativeDecodeByteArray, false);
                setDensityFromOptions(nativeDecodeByteArray, options);
                return scaleBitmapOnDemand(nativeDecodeByteArray, options);
            }
            Log.m106513w(TAG, "[!] unsupported image format, try to decode with system codec.");
            Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, i, i2, options);
            announceDecodeResult(options, decodeByteArray2, true);
            return decodeByteArray2;
        } catch (Throwable th) {
            Log.m106499e(TAG, th, "decode failed.");
            return null;
        }
    }

    private Bitmap decodeFileDescriptorInternal(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (isForceSystemDecoder(options)) {
            Log.m106514w(TAG, "[!] force decoding fd %s by system codec.", fileDescriptor);
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            announceDecodeResult(options, decodeFileDescriptor, true);
            return decodeFileDescriptor;
        } else if (nativeIsSeekable(fileDescriptor)) {
            try {
                Bitmap nativeDecodeFileDescriptor = nativeDecodeFileDescriptor(fileDescriptor, getOrCreateStorageBuffer(options), rect, options);
                if (options.outMimeType != null) {
                    announceDecodeResult(options, nativeDecodeFileDescriptor, false);
                    setDensityFromOptions(nativeDecodeFileDescriptor, options);
                    return scaleBitmapOnDemand(nativeDecodeFileDescriptor, options);
                }
                Log.m106513w(TAG, "[!] unsupported image format, try to decode with system codec.");
                Bitmap decodeFileDescriptor2 = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                announceDecodeResult(options, decodeFileDescriptor2, true);
                return decodeFileDescriptor2;
            } catch (Throwable th) {
                Log.m106499e(TAG, th, "decode failed.");
                return null;
            }
        } else {
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    Bitmap decodeStreamInternal = decodeStreamInternal(fileInputStream, rect, options);
                    closeQuietly(fileInputStream);
                    return decodeStreamInternal;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        Log.m106499e(TAG, th, "decode failed.");
                        return null;
                    } finally {
                        closeQuietly(fileInputStream);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                Log.m106499e(TAG, th, "decode failed.");
                return null;
            }
        }
    }

    private Bitmap decodeFileInternal(String str, BitmapFactory.Options options) {
        InputStream inputStream;
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        boolean z = true;
        if (isForceSystemDecoder(options)) {
            Log.m106514w(TAG, "[!] force decoding file %s by system codec.", str);
            return decodeFileWithStreamBySystemInternal(str, options);
        }
        try {
            inputStream = wrapUnResetableStreamOnDemand(getStreamFromPath(str));
            try {
                inputStream.mark(getCompatibleRewindBufferSize());
                Bitmap nativeDecodeStream = nativeDecodeStream(inputStream, (Rect) null, options);
                if (options.outMimeType == null) {
                    z = false;
                }
                if (z) {
                    announceDecodeResult(options, nativeDecodeStream, false);
                    setDensityFromOptions(nativeDecodeStream, options);
                    Bitmap scaleBitmapOnDemand = scaleBitmapOnDemand(nativeDecodeStream, options);
                    closeQuietly(inputStream);
                    return scaleBitmapOnDemand;
                }
                Log.m106513w(TAG, "[!] unsupported image format, try to decode with system codec.");
                Bitmap decodeFileWithStreamBySystemInternal = decodeFileWithStreamBySystemInternal(str, options);
                closeQuietly(inputStream);
                return decodeFileWithStreamBySystemInternal;
            } catch (Throwable th) {
                th = th;
                try {
                    Log.m106499e(TAG, th, "decode failed.");
                    return null;
                } finally {
                    closeQuietly(inputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            Log.m106499e(TAG, th, "decode failed.");
            return null;
        }
    }

    private Bitmap decodeFileWithStreamBySystemInternal(String str, BitmapFactory.Options options) {
        InputStream inputStream;
        if (this.mStreamProvider != null) {
            try {
                inputStream = wrapUnResetableStreamOnDemand(getStreamFromPath(str));
                try {
                    inputStream.mark(getCompatibleRewindBufferSize());
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                    announceDecodeResult(options, decodeStream, true);
                    closeQuietly(inputStream);
                    return decodeStream;
                } catch (Throwable th) {
                    th = th;
                    try {
                        Log.m106499e(TAG, th, "decode by system failed.");
                        return null;
                    } finally {
                        closeQuietly(inputStream);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                Log.m106499e(TAG, th, "decode by system failed.");
                return null;
            }
        } else {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                announceDecodeResult(options, decodeFile, true);
                return decodeFile;
            } catch (Throwable th5) {
                Log.m106499e(TAG, th5, "decode by system failed.");
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[SYNTHETIC, Splitter:B:13:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap decodeStreamInternal(java.io.InputStream r6, android.graphics.Rect r7, android.graphics.BitmapFactory.Options r8) {
        /*
            r5 = this;
            if (r8 != 0) goto L_0x0007
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
        L_0x0007:
            boolean r0 = r6 instanceof android.content.res.AssetManager.AssetInputStream
            r1 = 0
            java.lang.String r2 = "MicroMsg.MMBitmapFactory"
            r3 = 1
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "[!] force decoding stream by system codec since it's asset stream."
            com.tencent.stubs.logger.Log.m106513w(r2, r0)
        L_0x0014:
            r0 = 1
            goto L_0x0023
        L_0x0016:
            boolean r0 = r5.isForceSystemDecoder(r8)
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = "[!] force decoding stream by system codec since specific options."
            com.tencent.stubs.logger.Log.m106513w(r2, r0)
            goto L_0x0014
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x002d
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6, r7, r8)
            r5.announceDecodeResult(r8, r6, r3)
            return r6
        L_0x002d:
            java.io.InputStream r6 = wrapUnResetableStreamOnDemand(r6)     // Catch:{ all -> 0x0067 }
            int r0 = getCompatibleRewindBufferSize()     // Catch:{ all -> 0x0067 }
            r6.mark(r0)     // Catch:{ all -> 0x0067 }
            android.graphics.Bitmap r0 = r5.nativeDecodeStream(r6, r7, r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = r8.outMimeType     // Catch:{ all -> 0x0067 }
            if (r4 == 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x0050
            r5.announceDecodeResult(r8, r0, r1)     // Catch:{ all -> 0x0067 }
            setDensityFromOptions(r0, r8)     // Catch:{ all -> 0x0067 }
            android.graphics.Bitmap r6 = scaleBitmapOnDemand(r0, r8)     // Catch:{ all -> 0x0067 }
            return r6
        L_0x0050:
            java.lang.String r0 = "[!] unsupported image format, try to decode with system codec."
            com.tencent.stubs.logger.Log.m106513w(r2, r0)     // Catch:{ all -> 0x0067 }
            r6.reset()     // Catch:{ all -> 0x0067 }
            int r0 = getCompatibleRewindBufferSize()     // Catch:{ all -> 0x0067 }
            r6.mark(r0)     // Catch:{ all -> 0x0067 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6, r7, r8)     // Catch:{ all -> 0x0067 }
            r5.announceDecodeResult(r8, r6, r3)     // Catch:{ all -> 0x0067 }
            return r6
        L_0x0067:
            r6 = move-exception
            java.lang.String r7 = "decode failed."
            com.tencent.stubs.logger.Log.m106499e((java.lang.String) r2, (java.lang.Throwable) r6, (java.lang.String) r7)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.graphics.MMBitmapFactoryImpl.decodeStreamInternal(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    private static int getCompatibleRewindBufferSize() {
        "HUAWEI".equals(Build.MANUFACTURER);
        return 8388608;
    }

    public static MMBitmapFactoryImpl getInstance() {
        return C80874c.f237700a;
    }

    private static byte[] getOrCreateStorageBuffer(BitmapFactory.Options options) {
        byte[] bArr = options != null ? options.inTempStorage : null;
        return bArr != null ? bArr : new byte[4096];
    }

    private InputStream getStreamFromPath(String str) {
        MMBitmapFactory.C80871b bVar = this.mStreamProvider;
        if (bVar == null) {
            return new FileInputStream(str);
        }
        ((C86002c2) bVar).getClass();
        InputStream E = C86013q1.m106423E(str);
        if (E != null) {
            return E;
        }
        throw new IllegalArgumentException("Injected stream provider returned null in getStreamFromPath.");
    }

    private boolean isForceSystemDecoder(BitmapFactory.Options options) {
        return this.mForceUsingSystemDecoderOpt || (options != null && Build.VERSION.SDK_INT >= 26 && Bitmap.Config.HARDWARE.equals(options.inPreferredConfig));
    }

    private void loadNativeModule(String str) {
        try {
            MMBitmapFactory.C80870a[] aVarArr = sNativeLibraryLoader;
            synchronized (aVarArr) {
                MMBitmapFactory.C80870a aVar = aVarArr[0];
                if (aVar != null) {
                    aVar.loadLibrary(str);
                } else {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(str);
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mm/graphics/MMBitmapFactoryImpl", "loadNativeModule", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    System.loadLibrary((String) aVar2.mo10231a(0));
                    C117292a.m165359e(obj, "com/tencent/mm/graphics/MMBitmapFactoryImpl", "loadNativeModule", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                }
            }
            Log.m106506i(TAG, "Successfully load native module: %s", str);
        } catch (Throwable th) {
            Log.m106500e(TAG, th, "Fail to load native module: %s", str);
            throw new RuntimeException(th);
        }
    }

    private native void nativeAddExternalLibDir(String str);

    private native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options);

    private native Bitmap nativeDecodeFileDescriptor(FileDescriptor fileDescriptor, byte[] bArr, Rect rect, BitmapFactory.Options options);

    private native Bitmap nativeDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    private native boolean nativeIsSeekable(FileDescriptor fileDescriptor);

    private native int nativePinBitmap(Bitmap bitmap);

    private native int nativeUnPinBitmap(Bitmap bitmap);

    private static Bitmap scaleBitmapOnDemand(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || options == null || !options.inScaled) {
            return bitmap;
        }
        int i = options.inDensity;
        int i2 = options.inTargetDensity;
        float f = (i == 0 || i2 == 0 || i == options.inScreenDensity) ? 1.0f : ((float) i2) / ((float) i);
        if (f == 1.0f) {
            return bitmap;
        }
        int width = (int) ((((float) bitmap.getWidth()) * f) + 0.5f);
        int height = (int) ((((float) bitmap.getHeight()) * f) + 0.5f);
        float width2 = ((float) width) / ((float) bitmap.getWidth());
        float height2 = ((float) height) / ((float) bitmap.getHeight());
        Log.m106494d(TAG, "[+] Bmp to scale: [sw: %s, sh: %s, dw: %s, dh: %s, scX: %s, scY: %s]", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(width2), Float.valueOf(height2));
        Matrix matrix = new Matrix();
        matrix.setScale(width2, height2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (i2 != 0 && i != i2 && i != options.inScreenDensity) {
                    byte[] ninePatchChunk = bitmap.getNinePatchChunk();
                    boolean z = ninePatchChunk != null && NinePatch.isNinePatchChunk(ninePatchChunk);
                    if (options.inScaled || z) {
                        bitmap.setDensity(i2);
                    }
                }
            } else if (options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    public static void setNativeLibraryLoader(MMBitmapFactory.C80870a aVar) {
        MMBitmapFactory.C80870a[] aVarArr = sNativeLibraryLoader;
        synchronized (aVarArr) {
            aVarArr[0] = aVar;
        }
    }

    private static InputStream wrapUnResetableStreamOnDemand(InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : inputStream instanceof FileInputStream ? new C80873b((FileInputStream) inputStream) : new BufferedInputStream(inputStream);
    }

    public void addExternalCodecLibDir(String str) {
        Log.m106506i(TAG, "[+] add external codec library path: %s", str);
        nativeAddExternalLibDir(str);
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2) {
        assertNotNull(bArr, "'data' is null.");
        return decodeByteArrayInternal(bArr, i, i2, (BitmapFactory.Options) null);
    }

    public Bitmap decodeFile(String str) {
        assertNotNull(str, "'pathName' is null.");
        return decodeFileInternal(str, (BitmapFactory.Options) null);
    }

    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor) {
        assertNotNull(fileDescriptor, "'fd' is null.");
        return decodeFileDescriptorInternal(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }

    public Bitmap decodeResource(Resources resources, int i) {
        Log.m106494d(TAG, "[*] transfer invocation to BitmapFactory.decodeResource, res: %s, id: %s", resources, Integer.valueOf(i));
        return BitmapFactory.decodeResource(resources, i);
    }

    public Bitmap decodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Log.m106494d(TAG, "[*] transfer invocation to BitmapFactory.decodeResourceStream, res: %s, value: %s, is: %s, pad: %s, opts: %s", resources, typedValue, inputStream, rect, options);
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public Bitmap decodeStream(InputStream inputStream) {
        assertNotNull(inputStream, "'is' is null.");
        return decodeStreamInternal(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    public Bitmap pinBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m106506i(TAG, "[tomys] Try to pin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), bitmap.getConfig(), Integer.valueOf(bitmap.getByteCount()));
            int nativePinBitmap = nativePinBitmap(bitmap);
            if (nativePinBitmap < 0) {
                Log.m106498e(TAG, "pinBitmap failed, ret: %s", Integer.valueOf(nativePinBitmap));
            }
        }
        return bitmap;
    }

    public void setDecodeCanary(C80875a aVar) {
        this.mDecodeCanary = aVar;
    }

    public void setForceUsingSystemDecoder(boolean z) {
        Log.m106514w(TAG, "[!] setForceUsingSystemDecoder, value: %s", Boolean.valueOf(z));
        this.mForceUsingSystemDecoderOpt = z;
    }

    public void setStreamProvider(MMBitmapFactory.C80871b bVar) {
        this.mStreamProvider = bVar;
    }

    public Bitmap unPinBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m106506i(TAG, "[tomys] Try to unpin bmp (%s), [w: %s, h: %s, config: %s, size: %s]", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), bitmap.getConfig(), Integer.valueOf(bitmap.getByteCount()));
            int nativeUnPinBitmap = nativeUnPinBitmap(bitmap);
            if (nativeUnPinBitmap < 0) {
                Log.m106498e(TAG, "unPinBitmap failed, ret: %s", Integer.valueOf(nativeUnPinBitmap));
            }
        }
        return bitmap;
    }

    private MMBitmapFactoryImpl() {
        this.mStreamProvider = null;
        this.mForceUsingSystemDecoderOpt = false;
        this.mDecodeCanary = null;
        loadNativeModule("mmimgcodec");
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        assertNotNull(bArr, "'data' is null.");
        return decodeByteArrayInternal(bArr, i, i2, options);
    }

    public Bitmap decodeFile(String str, BitmapFactory.Options options) {
        assertNotNull(str, "'pathName' is null.");
        return decodeFileInternal(str, options);
    }

    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        assertNotNull(fileDescriptor, "'fd' is null.");
        return decodeFileDescriptorInternal(fileDescriptor, rect, options);
    }

    public Bitmap decodeResource(Resources resources, int i, BitmapFactory.Options options) {
        Log.m106494d(TAG, "[*] transfer invocation to BitmapFactory.decodeResource, res: %s, id: %s, opts: %s", resources, Integer.valueOf(i), options);
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        assertNotNull(inputStream, "'is' is null.");
        return decodeStreamInternal(inputStream, rect, options);
    }
}

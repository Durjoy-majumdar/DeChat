package com.github.henryye.nativeiv;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p1015o6.C89117a;
import p1015o6.C89127f;
import p1019p6.C89314a;
import p1030s6.C90131a;
import p1030s6.C90132b;
import p673r6.C89876b;
import p673r6.C89880c;
import p673r6.C89881d;

public class BaseImageDecodeService implements IImageDecodeService {
    private static final String TAG = "BaseImageDecodeService";
    /* access modifiers changed from: private */
    public final IImageDecodeService.C80188b mCompactDecodeEventListener = new C80182b((C80181a) null);
    /* access modifiers changed from: private */
    public final List<IImageDecodeService.C80188b> mDecodeEventListeners = new LinkedList();
    private IImageDecodeService.C80187a mDecodeSlave = null;
    private C90132b mFallbackImageStreamFetcher;
    private final C90131a mHttpImageStreamFetcher;
    private LinkedList<C90132b> mImageStreamFetcherList;
    private boolean mIsTrackInitImages = false;

    /* renamed from: com.github.henryye.nativeiv.BaseImageDecodeService$b */
    public class C80182b implements IImageDecodeService.C80188b {
        public C80182b(C80181a aVar) {
        }

        /* renamed from: a */
        public void mo109472a(String str, Object obj, IImageDecodeService.C80190c cVar, ImageDecodeConfig imageDecodeConfig) {
            for (IImageDecodeService.C80188b a : new LinkedList(BaseImageDecodeService.this.mDecodeEventListeners)) {
                a.mo109472a(str, obj, cVar, imageDecodeConfig);
            }
        }

        /* renamed from: b */
        public void mo109473b(String str, IImageDecodeService.C80188b.C80189a aVar, C89314a aVar2) {
            for (IImageDecodeService.C80188b b : new LinkedList(BaseImageDecodeService.this.mDecodeEventListeners)) {
                b.mo109473b(str, aVar, aVar2);
            }
        }
    }

    /* renamed from: com.github.henryye.nativeiv.BaseImageDecodeService$c */
    public static class C80183c implements IImageDecodeService.C80190c {
    }

    /* renamed from: com.github.henryye.nativeiv.BaseImageDecodeService$d */
    public static class C80184d implements Runnable {

        /* renamed from: d */
        public Object f234714d;

        /* renamed from: e */
        public ImageDecodeConfig f234715e;

        /* renamed from: f */
        public WeakReference<BaseImageDecodeService> f234716f;

        /* renamed from: g */
        public final C80183c f234717g = new C80183c();

        public C80184d(BaseImageDecodeService baseImageDecodeService, Object obj, ImageDecodeConfig imageDecodeConfig) {
            this.f234714d = obj;
            this.f234715e = imageDecodeConfig;
            this.f234716f = new WeakReference<>(baseImageDecodeService);
        }

        public void run() {
            if (this.f234716f.get() != null) {
                this.f234716f.get().mCompactDecodeEventListener.mo109472a(this.f234714d.toString(), this.f234716f.get().loadBitmapSync(this.f234714d, this.f234715e), this.f234717g, this.f234715e);
            }
        }
    }

    public BaseImageDecodeService() {
        C90131a aVar = new C90131a();
        this.mHttpImageStreamFetcher = aVar;
        this.mImageStreamFetcherList = new LinkedList<>();
        addImageStreamFetcher(aVar, false);
        setBitmapDecodeSlave(new C89117a());
    }

    private Bitmap.CompressFormat ensureCompressFormat(String str) {
        if ("image/webp".equals(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        if ("image/jpeg".equals(str) || "image/jpg".equals(str)) {
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    private int ensureQuality(float f) {
        if (f < 0.0f || f > 1.0f) {
            f = 0.92f;
        }
        return (int) (f * 100.0f);
    }

    private void runInThreadPool(Object obj, Runnable runnable) {
        if (this.mHttpImageStreamFetcher.accept(obj)) {
            ((ThreadPoolExecutor) C80186a.INSTANCE.f234725d).execute(runnable);
        } else {
            ((ThreadPoolExecutor) C80186a.INSTANCE.f234726e).execute(runnable);
        }
    }

    public void addDecodeEventListener(IImageDecodeService.C80188b bVar) {
        this.mDecodeEventListeners.add(bVar);
    }

    public void addImageStreamFetcher(C90132b bVar, boolean z) {
        C89876b.m112385b(TAG, "hy: %d adding stream fetcher: %s %b", Integer.valueOf(hashCode()), bVar.getClass().getSimpleName(), Boolean.valueOf(z));
        if (!z) {
            this.mImageStreamFetcherList.push(bVar);
        } else {
            this.mFallbackImageStreamFetcher = bVar;
        }
    }

    public String encodeToBase64(Bitmap bitmap, int i, float f) {
        if (!(bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || bitmap.isRecycled())) {
            Bitmap.CompressFormat ensureCompressFormat = ensureCompressFormat(i);
            int ensureQuality = ensureQuality(f);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            boolean compress = bitmap.compress(ensureCompressFormat, ensureQuality, byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                C89876b.m112384a(TAG, "base64_encode IOException e %s", e.toString());
                compress = false;
            }
            if (compress && byteArrayOutputStream.size() > 0) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            C89876b.m112384a(TAG, "base64_encode Bitmap compress error.", new Object[0]);
        }
        return null;
    }

    public byte[] encodeToBuffer(Bitmap bitmap, int i, float f) {
        if (!(bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || bitmap.isRecycled())) {
            Bitmap.CompressFormat ensureCompressFormat = ensureCompressFormat(i);
            int ensureQuality = ensureQuality(f);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            boolean compress = bitmap.compress(ensureCompressFormat, ensureQuality, byteArrayOutputStream);
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                C89876b.m112384a(TAG, "encodeToBuffer IOException e %s", e.toString());
                compress = false;
            }
            if (compress && byteArrayOutputStream.size() > 0) {
                return byteArrayOutputStream.toByteArray();
            }
            C89876b.m112384a(TAG, "encodeToBuffer Bitmap compress error.", new Object[0]);
        }
        return null;
    }

    public void forceSetUseType(BitmapType bitmapType) {
        this.mDecodeSlave.forceSetUseType(bitmapType);
    }

    public Bitmap getBitmap(int i, int i2) {
        C89127f fVar;
        if (C89127f.f256785b == null) {
            synchronized (C89127f.class) {
                if (C89127f.f256785b == null) {
                    C89127f.f256785b = new C89127f();
                }
                fVar = C89127f.f256785b;
            }
        } else {
            fVar = C89127f.f256785b;
        }
        ((C89127f.C89129b) fVar.f256786a).getClass();
        C89876b.m112385b("MiroMsg.MBBitmapPool", "hy: dummy getTask", new Object[0]);
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public void init() {
    }

    public void loadBitmapAsync(String str) {
        if (str != null && str.length() != 0) {
            loadBitmapAsync(str, new ImageDecodeConfig());
        }
    }

    public IBitmap loadBitmapSync(Object obj, ImageDecodeConfig imageDecodeConfig) {
        C90132b bVar;
        if (imageDecodeConfig == null) {
            imageDecodeConfig = new ImageDecodeConfig();
        }
        Iterator<C90132b> it = this.mImageStreamFetcherList.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.accept(obj)) {
                break;
            }
        }
        if (bVar == null) {
            bVar = this.mFallbackImageStreamFetcher;
        }
        if (bVar == null) {
            C89876b.m112384a(TAG, "No fit image stream fetcher found for %s", obj.toString());
            return null;
        }
        IImageDecodeService.C80187a aVar = this.mDecodeSlave;
        if (aVar != null && !aVar.isDestroyed()) {
            return aVar.mo111029c(obj.toString(), obj, bVar, imageDecodeConfig);
        }
        C89876b.f258326a.mo123906w(TAG, "BitmapDecodeSlave destroyed", new Object[0]);
        return null;
    }

    public void release() {
        IImageDecodeService.C80187a aVar = this.mDecodeSlave;
        if (aVar != null) {
            aVar.destroy();
            this.mDecodeSlave = null;
        }
    }

    public void releaseBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            C89876b.m112385b(TAG, "recycle because releaseBitmap", new Object[0]);
            bitmap.recycle();
        }
    }

    public void removeDecodeEventListener(IImageDecodeService.C80188b bVar) {
        this.mDecodeEventListeners.remove(bVar);
    }

    public void removeImageStreamFetcher(C90132b bVar, boolean z) {
        C89876b.m112385b(TAG, "hy: %d removing stream fetcher: %s %b", Integer.valueOf(hashCode()), bVar.getClass().getSimpleName(), Boolean.valueOf(z));
        if (!z) {
            this.mImageStreamFetcherList.remove(bVar);
        } else {
            this.mFallbackImageStreamFetcher = null;
        }
    }

    public void setBitmapDecodeSlave(IImageDecodeService.C80187a aVar) {
        this.mDecodeSlave = aVar;
        aVar.mo111027a(this.mCompactDecodeEventListener);
    }

    public void setIdKeyReportDelegate(C89880c cVar) {
    }

    public void setKvReportDelegate(C89881d dVar) {
    }

    public void setMaxDecodeDimension(int i, int i2) {
        this.mDecodeSlave.mo111028b(i, i2);
    }

    public void setNetworkTimeout(int i, int i2) {
        C90131a aVar = this.mHttpImageStreamFetcher;
        aVar.getClass();
        if (i > 0 && i2 > 0) {
            aVar.f258826a = i;
            aVar.f258827b = i2;
            C89876b.m112385b("NativeImageHttpFetcher", "Http Timeout Set: connection[%d] read[%d]", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public void loadBitmapAsync(String str, ImageDecodeConfig imageDecodeConfig) {
        loadBitmapAsync((Object) str, imageDecodeConfig);
    }

    public void loadBitmapAsync(Object obj, ImageDecodeConfig imageDecodeConfig) {
        if (imageDecodeConfig == null) {
            imageDecodeConfig = new ImageDecodeConfig();
        }
        runInThreadPool(obj, new C80184d(this, obj, imageDecodeConfig));
    }

    private Bitmap.CompressFormat ensureCompressFormat(int i) {
        if (i == 1) {
            return Bitmap.CompressFormat.WEBP;
        }
        if (i != 2) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public IBitmap loadBitmapSync(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return loadBitmapSync(str, new ImageDecodeConfig());
    }

    public IBitmap loadBitmapSync(String str, ImageDecodeConfig imageDecodeConfig) {
        return loadBitmapSync((Object) str, imageDecodeConfig);
    }
}

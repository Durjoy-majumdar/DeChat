package com.davemorrissey.labs.subscaleview.legacy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.model.IBitmapLoaderFactory;
import com.davemorrissey.labs.subscaleview.model.ILoadable;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public class LegacyBitmapLoaderFactory implements IBitmapLoaderFactory {
    private static final String TAG = "MicroMsg.LegacyBitmapLoaderFactory";

    public static class BitmapLoaderWrapper extends AsyncTask<Void, Void, Integer> implements ILoadable {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private ImageDecodeResult decodeResult;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private Rect mRect;
        private long mStartLoadTime = -1;
        private final boolean preview;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public BitmapLoaderWrapper(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri, boolean z) {
            InputStream C;
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(decoderFactory);
            this.source = uri;
            this.preview = z;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                C = C86013q1.m106421C(uri, (C116281f0.C116288h) null);
                BitmapFactory.decodeStream(C, (Rect) null, options);
                if (C != null) {
                    C.close();
                }
            } catch (IOException e) {
                Log.printErrStackTrace(LegacyBitmapLoaderFactory.TAG, e, "Unable to read file: %s", uri.toString());
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            this.mRect = new Rect(0, 0, options.outWidth, options.outHeight);
            return;
            throw th;
        }

        private void onEnd(SubsamplingScaleImageView subsamplingScaleImageView) {
            if (subsamplingScaleImageView != null && this.preview && this.mStartLoadTime != -1) {
                Log.m105925i(LegacyBitmapLoaderFactory.TAG, "alvinluo preview decode onEnd %d", Long.valueOf(System.currentTimeMillis()));
                subsamplingScaleImageView.addPreviewLoadedTime((int) (System.currentTimeMillis() - this.mStartLoadTime));
            }
        }

        private void onExecuteEnd(Integer num) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 == null || num == null) {
                    if (this.exception != null && subsamplingScaleImageView.getOnImageEventListener() != null) {
                        if (this.preview) {
                            subsamplingScaleImageView.getOnImageEventListener().onPreviewLoadError(this.decodeResult);
                        } else {
                            subsamplingScaleImageView.getOnImageEventListener().onImageLoadError(this.decodeResult);
                        }
                    }
                } else if (this.preview) {
                    subsamplingScaleImageView.onPreviewLoaded(bitmap2, num);
                } else {
                    subsamplingScaleImageView.onImageLoaded(bitmap2, num.intValue(), false);
                }
            }
        }

        public void cancel() {
        }

        public void startLoad() {
            executeOnExecutor(this.viewRef.get().provideExecutor(), new Void[0]);
        }

        public Integer doInBackground(Void... voidArr) {
            Log.m105924i(LegacyBitmapLoaderFactory.TAG, "alvinluo preview decode start");
            if (this.preview) {
                this.mStartLoadTime = System.currentTimeMillis();
            }
            try {
                Context context = this.contextRef.get();
                DecoderFactory decoderFactory = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (!(context == null || decoderFactory == null || subsamplingScaleImageView == null)) {
                    subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                    ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) decoderFactory.make();
                    imageRegionDecoder.init(context, this.source);
                    this.bitmap = imageRegionDecoder.decodeRegion(this.mRect, 1);
                    Integer valueOf = Integer.valueOf(subsamplingScaleImageView.getExifOrientation(context, this.source));
                    imageRegionDecoder.recycle();
                    onEnd(subsamplingScaleImageView);
                    return valueOf;
                }
            } catch (FileNotFoundException e) {
                Log.printErrStackTrace(LegacyBitmapLoaderFactory.TAG, e, "alvinluo Failed to initialise bitmap decoder", new Object[0]);
                this.exception = e;
                this.decodeResult = new ImageDecodeResult(1, "tile init file not found");
            } catch (Exception e2) {
                Log.printErrStackTrace(LegacyBitmapLoaderFactory.TAG, e2, "Failed to load bitmap", new Object[0]);
                this.exception = e2;
                this.decodeResult = new ImageDecodeResult(2, "bitmap decode failed");
            } catch (OutOfMemoryError e3) {
                Log.printErrStackTrace(LegacyBitmapLoaderFactory.TAG, e3, "Failed to load bitmap - OutOfMemoryError", new Object[0]);
                this.exception = new RuntimeException(e3);
                this.decodeResult = new ImageDecodeResult(3, "bitmap decode OutOfMemoryError");
                SubsamplingScaleImageView.setPreferredBitmapConfig(Bitmap.Config.RGB_565);
            }
            onEnd(this.viewRef.get());
            return null;
        }

        public void onPostExecute(Integer num) {
            Log.m105925i(LegacyBitmapLoaderFactory.TAG, "alvinluo preview decode onPostExecute %d", Long.valueOf(System.currentTimeMillis()));
            onExecuteEnd(num);
        }
    }

    public ILoadable newInstance(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri, boolean z) {
        return new BitmapLoaderWrapper(subsamplingScaleImageView, context, decoderFactory, uri, z);
    }
}

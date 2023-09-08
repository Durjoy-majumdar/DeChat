package com.davemorrissey.labs.subscaleview.legacy;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.model.ILoadable;
import com.davemorrissey.labs.subscaleview.model.ITileInitLoaderFactory;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;

public class LegacyTileInitLoaderFactory implements ITileInitLoaderFactory {
    private static final String TAG = "MicroMsg.LegacyTileInitLoaderFactory";

    public static class LegacyTilesInitTaskWrapper extends AsyncTask<Void, Void, int[]> implements ILoadable {
        private final WeakReference<Context> contextRef;
        private ImageDecodeResult decodeResult;
        private ImageRegionDecoder decoder;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private long mStartLoadTime;
        private final Uri source;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public LegacyTilesInitTaskWrapper(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<>(context);
            this.decoderFactoryRef = new WeakReference<>(decoderFactory);
            this.source = uri;
        }

        private void onEnd(SubsamplingScaleImageView subsamplingScaleImageView) {
            if (subsamplingScaleImageView != null && this.mStartLoadTime != -1) {
                subsamplingScaleImageView.addTileInitTime((int) (System.currentTimeMillis() - this.mStartLoadTime));
            }
        }

        private void onExecuteEnd(int[] iArr) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView == null) {
                Log.m105920e(LegacyTileInitLoaderFactory.TAG, "alvinluo TileInitTask onPostExecute view is null");
            } else if (this.decoder != null && iArr != null && iArr.length == 3) {
                long currentTimeMillis = System.currentTimeMillis();
                subsamplingScaleImageView.onTilesInited(this.decoder, iArr[0], iArr[1], iArr[2]);
                subsamplingScaleImageView.addTileInitTime((int) (System.currentTimeMillis() - currentTimeMillis));
            } else if (this.exception != null && subsamplingScaleImageView.getOnImageEventListener() != null) {
                subsamplingScaleImageView.getOnImageEventListener().onImageLoadError(this.decodeResult);
            }
        }

        public void cancel() {
        }

        public void startLoad() {
            executeOnExecutor(this.viewRef.get().provideExecutor(), new Void[0]);
        }

        public int[] doInBackground(Void... voidArr) {
            Log.m105918d(LegacyTileInitLoaderFactory.TAG, "alvinluo TileInitTask doInBackground");
            this.mStartLoadTime = System.currentTimeMillis();
            try {
                Context context = this.contextRef.get();
                DecoderFactory decoderFactory = this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (!(context == null || decoderFactory == null || subsamplingScaleImageView == null)) {
                    ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder) decoderFactory.make();
                    this.decoder = imageRegionDecoder;
                    Point init = imageRegionDecoder.init(context, this.source);
                    int i = init.x;
                    int i2 = init.y;
                    int exifOrientation = subsamplingScaleImageView.getExifOrientation(context, this.source);
                    if (subsamplingScaleImageView.getsRegion() != null) {
                        Rect rect = subsamplingScaleImageView.getsRegion();
                        rect.left = Math.max(0, rect.left);
                        rect.top = Math.max(0, rect.top);
                        rect.right = Math.min(i, rect.right);
                        rect.bottom = Math.min(i2, rect.bottom);
                        i = rect.width();
                        i2 = rect.height();
                        subsamplingScaleImageView.setsRegion(rect);
                    }
                    onEnd(subsamplingScaleImageView);
                    return new int[]{i, i2, exifOrientation};
                }
            } catch (FileNotFoundException e) {
                Log.printErrStackTrace(LegacyTileInitLoaderFactory.TAG, e, "alvinluo Failed to initialise bitmap decoder", new Object[0]);
                this.exception = e;
                this.decodeResult = new ImageDecodeResult(1, "tile init file not found");
            } catch (Exception e2) {
                Log.printErrStackTrace(LegacyTileInitLoaderFactory.TAG, e2, "alvinluo Failed to initialise bitmap decoder", new Object[0]);
                this.exception = e2;
                this.decodeResult = new ImageDecodeResult(4, "tile init failed");
            }
            onEnd(this.viewRef.get());
            return null;
        }

        public void onPostExecute(int[] iArr) {
            onExecuteEnd(iArr);
        }
    }

    public ILoadable newInstance(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri) {
        return new LegacyTilesInitTaskWrapper(subsamplingScaleImageView, context, decoderFactory, uri);
    }
}

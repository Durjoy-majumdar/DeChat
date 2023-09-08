package com.davemorrissey.labs.subscaleview.legacy;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.model.ILoadable;
import com.davemorrissey.labs.subscaleview.model.ITileLoaderFactory;
import com.davemorrissey.labs.subscaleview.model.Tile;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

public class LegacyTileLoaderFactory implements ITileLoaderFactory {
    private static final String TAG = "MicroMsg.LegacyTileLoaderFactory";

    public static class LegacyTileLoadTaskWrapper extends AsyncTask<Void, Void, Bitmap> implements ILoadable {
        private ImageDecodeResult decodeResult;
        private final WeakReference<ImageRegionDecoder> decoderRef;
        private Exception exception;
        private boolean isCancelled = false;
        private long mStartTime = -1;
        private final WeakReference<Tile> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        public LegacyTileLoadTaskWrapper(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile) {
            this.viewRef = new WeakReference<>(subsamplingScaleImageView);
            this.decoderRef = new WeakReference<>(imageRegionDecoder);
            this.tileRef = new WeakReference<>(tile);
            tile.loading = true;
        }

        private void onEnd(SubsamplingScaleImageView subsamplingScaleImageView, Tile tile) {
            if (subsamplingScaleImageView != null && tile != null && this.mStartTime != -1 && subsamplingScaleImageView.getFullImageSampleSize() == tile.sampleSize) {
                subsamplingScaleImageView.addTileDecodeTime((int) (System.currentTimeMillis() - this.mStartTime));
            }
        }

        private void onExecuteEnd(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            Tile tile = this.tileRef.get();
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(subsamplingScaleImageView != null);
            objArr[1] = Boolean.valueOf(tile != null);
            objArr[2] = Integer.valueOf(tile != null ? tile.sampleSize : -1);
            objArr[3] = tile != null ? tile.sRect : "null";
            Log.m105919d(LegacyTileLoaderFactory.TAG, "alvinluo onExecuteEnd imageView != null: %b, tile != null: %b, sampleSize: %d, rect: %s", objArr);
            if (subsamplingScaleImageView != null && tile != null) {
                if (bitmap != null) {
                    tile.bitmap = bitmap;
                    tile.loading = false;
                    subsamplingScaleImageView.onTileLoaded(tile);
                } else if (this.exception != null && subsamplingScaleImageView.getOnImageEventListener() != null) {
                    subsamplingScaleImageView.getOnImageEventListener().onTileLoadError(this.decodeResult);
                }
            }
        }

        public void cancel() {
            try {
                cancel(true);
                this.isCancelled = true;
            } catch (Exception e) {
                Log.printErrStackTrace(LegacyTileLoaderFactory.TAG, e, "alvinluo TileLoaderTask cancel exception", new Object[0]);
            }
        }

        public void startLoad() {
            executeOnExecutor(this.viewRef.get().provideExecutor(), new Void[0]);
        }

        public Bitmap doInBackground(Void... voidArr) {
            SubsamplingScaleImageView subsamplingScaleImageView;
            if (!(this.viewRef.get() == null || this.tileRef.get() == null || this.viewRef.get().getFullImageSampleSize() != this.tileRef.get().sampleSize)) {
                this.mStartTime = System.currentTimeMillis();
            }
            try {
                subsamplingScaleImageView = this.viewRef.get();
                ImageRegionDecoder imageRegionDecoder = this.decoderRef.get();
                Tile tile = this.tileRef.get();
                if (imageRegionDecoder == null || tile == null || subsamplingScaleImageView == null || !imageRegionDecoder.isReady() || !tile.visible) {
                    if (tile != null) {
                        tile.loading = false;
                    }
                    onEnd(this.viewRef.get(), this.tileRef.get());
                    return null;
                }
                Log.m105919d(LegacyTileLoaderFactory.TAG, "alvinluo TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", tile.sRect, Integer.valueOf(tile.sampleSize));
                subsamplingScaleImageView.getDecoderLock().readLock().lock();
                if (imageRegionDecoder.isReady()) {
                    subsamplingScaleImageView.fileSRect(tile.sRect, tile.fileSRect);
                    if (subsamplingScaleImageView.getsRegion() != null) {
                        tile.fileSRect.offset(subsamplingScaleImageView.getsRegion().left, subsamplingScaleImageView.getsRegion().top);
                    }
                    Log.m105919d(LegacyTileLoaderFactory.TAG, "alvinluo tile sampleSize: %d", Integer.valueOf(tile.sampleSize));
                    Bitmap decodeRegion = imageRegionDecoder.decodeRegion(tile.fileSRect, tile.sampleSize);
                    onEnd(subsamplingScaleImageView, tile);
                    subsamplingScaleImageView.getDecoderLock().readLock().unlock();
                    return decodeRegion;
                }
                tile.loading = false;
                subsamplingScaleImageView.getDecoderLock().readLock().unlock();
                onEnd(this.viewRef.get(), this.tileRef.get());
                return null;
            } catch (Exception e) {
                Log.printErrStackTrace(LegacyTileLoaderFactory.TAG, e, "Failed to decode tile", new Object[0]);
                this.exception = e;
                this.decodeResult = new ImageDecodeResult(5, "decode tile failed");
            } catch (OutOfMemoryError e2) {
                Log.printErrStackTrace(LegacyTileLoaderFactory.TAG, e2, "Failed to decode tile - OutOfMemoryError", new Object[0]);
                this.exception = new RuntimeException(e2);
                this.decodeResult = new ImageDecodeResult(6, "decode tile OutOfMemoryError");
                SubsamplingScaleImageView.setPreferredBitmapConfig(Bitmap.Config.RGB_565);
            } catch (Throwable th) {
                subsamplingScaleImageView.getDecoderLock().readLock().unlock();
                throw th;
            }
        }

        public void onPostExecute(Bitmap bitmap) {
            Log.m105925i(LegacyTileLoaderFactory.TAG, "alvinluo onPostExecute %d", Long.valueOf(System.currentTimeMillis()));
            onExecuteEnd(bitmap);
        }
    }

    public ILoadable newInstance(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile) {
        return new LegacyTileLoadTaskWrapper(subsamplingScaleImageView, imageRegionDecoder, tile);
    }
}

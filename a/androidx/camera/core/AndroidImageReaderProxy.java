package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.concurrent.Executor;

class AndroidImageReaderProxy implements ImageReaderProxy {
    private final ImageReader mImageReader;
    private final Object mLock = new Object();

    public AndroidImageReaderProxy(ImageReader imageReader) {
        this.mImageReader = imageReader;
    }

    private boolean isImageReaderContextNotInitializedException(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$0(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$1(Executor executor, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, ImageReader imageReader) {
        executor.execute(new AndroidImageReaderProxy$$a(this, onImageAvailableListener));
    }

    public ImageProxy acquireLatestImage() {
        Image image;
        synchronized (this.mLock) {
            try {
                image = this.mImageReader.acquireLatestImage();
            } catch (RuntimeException e) {
                if (isImageReaderContextNotInitializedException(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            AndroidImageProxy androidImageProxy = new AndroidImageProxy(image);
            return androidImageProxy;
        }
    }

    public ImageProxy acquireNextImage() {
        Image image;
        synchronized (this.mLock) {
            try {
                image = this.mImageReader.acquireNextImage();
            } catch (RuntimeException e) {
                if (isImageReaderContextNotInitializedException(e)) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            AndroidImageProxy androidImageProxy = new AndroidImageProxy(image);
            return androidImageProxy;
        }
    }

    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mImageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mImageReader.close();
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReader.getHeight();
        }
        return height;
    }

    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReader.getImageFormat();
        }
        return imageFormat;
    }

    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReader.getMaxImages();
        }
        return maxImages;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReader.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReader.getWidth();
        }
        return width;
    }

    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            this.mImageReader.setOnImageAvailableListener(new AndroidImageReaderProxy$$b(this, executor, onImageAvailableListener), MainThreadAsyncHandler.getInstance());
        }
    }
}

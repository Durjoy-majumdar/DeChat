package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageProxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

abstract class ForwardingImageProxy implements ImageProxy {
    public final ImageProxy mImage;
    private final Set<OnImageCloseListener> mOnImageCloseListeners = new HashSet();

    public interface OnImageCloseListener {
        void onImageClose(ImageProxy imageProxy);
    }

    public ForwardingImageProxy(ImageProxy imageProxy) {
        this.mImage = imageProxy;
    }

    public synchronized void addOnImageCloseListener(OnImageCloseListener onImageCloseListener) {
        this.mOnImageCloseListeners.add(onImageCloseListener);
    }

    public void close() {
        synchronized (this) {
            this.mImage.close();
        }
        notifyOnImageCloseListeners();
    }

    public synchronized Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    public synchronized int getFormat() {
        return this.mImage.getFormat();
    }

    public synchronized int getHeight() {
        return this.mImage.getHeight();
    }

    public synchronized Image getImage() {
        return this.mImage.getImage();
    }

    public synchronized ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    public synchronized ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    public synchronized int getWidth() {
        return this.mImage.getWidth();
    }

    public void notifyOnImageCloseListeners() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.mOnImageCloseListeners);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((OnImageCloseListener) it.next()).onImageClose(this);
        }
    }

    public synchronized void setCropRect(Rect rect) {
        this.mImage.setCropRect(rect);
    }
}

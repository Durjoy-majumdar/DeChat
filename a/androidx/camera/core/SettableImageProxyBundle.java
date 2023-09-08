package androidx.camera.core;

import android.util.SparseArray;
import androidx.camera.core.impl.ImageProxyBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1167z8.C112608f;
import p202m2.C117512b;

final class SettableImageProxyBundle implements ImageProxyBundle {
    private final List<Integer> mCaptureIdList;
    private boolean mClosed = false;
    public final SparseArray<C117512b.C117513a<ImageProxy>> mCompleters = new SparseArray<>();
    private final SparseArray<C112608f<ImageProxy>> mFutureResults = new SparseArray<>();
    public final Object mLock = new Object();
    private final List<ImageProxy> mOwnedImageProxies = new ArrayList();
    private String mTagBundleKey;

    public SettableImageProxyBundle(List<Integer> list, String str) {
        this.mCaptureIdList = list;
        this.mTagBundleKey = str;
        setup();
    }

    private void setup() {
        synchronized (this.mLock) {
            for (Integer intValue : this.mCaptureIdList) {
                final int intValue2 = intValue.intValue();
                this.mFutureResults.put(intValue2, C117512b.m165760a(new C117512b.C117515c<ImageProxy>() {
                    public Object attachCompleter(C117512b.C117513a<ImageProxy> aVar) {
                        synchronized (SettableImageProxyBundle.this.mLock) {
                            SettableImageProxyBundle.this.mCompleters.put(intValue2, aVar);
                        }
                        return "getImageProxy(id: " + intValue2 + ")";
                    }
                }));
            }
        }
    }

    public void addImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                Integer num = (Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                if (num != null) {
                    C117512b.C117513a aVar = this.mCompleters.get(num.intValue());
                    if (aVar != null) {
                        this.mOwnedImageProxies.add(imageProxy);
                        aVar.mo182231a(imageProxy);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : this.mOwnedImageProxies) {
                    close.close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                this.mClosed = true;
            }
        }
    }

    public List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.mCaptureIdList);
    }

    public C112608f<ImageProxy> getImageProxy(int i) {
        C112608f<ImageProxy> fVar;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                fVar = this.mFutureResults.get(i);
                if (fVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return fVar;
    }

    public void reset() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : this.mOwnedImageProxies) {
                    close.close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                setup();
            }
        }
    }
}

package com.tencent.xweb.skia_canvas.resource_loader;

import com.tencent.xweb.skia_canvas.resource_loader.IResourceLoader;

public class ResourceLoaderDelegateWrapper {
    private static final String TAG = "ResourceLoaderDelegateW";
    private final IResourceLoader mDelegate;
    private final Thread mThread = Thread.currentThread();

    public ResourceLoaderDelegateWrapper(IResourceLoader iResourceLoader) {
        this.mDelegate = iResourceLoader;
        nativeCreatePeer();
    }

    /* access modifiers changed from: private */
    public void checkRunningThread() {
        if (Thread.currentThread() != this.mThread) {
            throw new IllegalStateException("Any method should be run at thread " + this.mThread);
        }
    }

    private native void nativeCreatePeer();

    /* access modifiers changed from: private */
    public native void nativeNotifyResourceLoad(int i, byte[] bArr);

    public byte[] loadResource(String str, String str2) {
        String.format("loadResource path:%s, referrerPolicy:%s, delegate: %s", new Object[]{str, str2, this.mDelegate});
        byte[] loadResource = this.mDelegate.loadResource(str, str2);
        return loadResource == null ? new byte[0] : loadResource;
    }

    public void loadResourceAsync(final int i, String str, String str2) {
        String.format("loadResourceAsync path:%s, referrerPolicy:%s, requestId: %d, delegate: %s", new Object[]{str, str2, Integer.valueOf(i), this.mDelegate});
        this.mDelegate.loadResourceAsync(str, str2, new IResourceLoader.ResourceLoadCallback() {
            public void onResourceLoaded(byte[] bArr) {
                ResourceLoaderDelegateWrapper.this.checkRunningThread();
                if (bArr == null) {
                    ResourceLoaderDelegateWrapper.this.nativeNotifyResourceLoad(i, new byte[0]);
                } else {
                    ResourceLoaderDelegateWrapper.this.nativeNotifyResourceLoad(i, bArr);
                }
            }
        });
    }
}

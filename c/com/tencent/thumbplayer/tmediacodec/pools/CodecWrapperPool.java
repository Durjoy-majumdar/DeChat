package com.tencent.thumbplayer.tmediacodec.pools;

import android.text.TextUtils;
import com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper;
import com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper;
import com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper;
import com.tencent.thumbplayer.tmediacodec.util.LogUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class CodecWrapperPool implements Pool<ReuseCodecWrapper, FormatWrapper> {
    public static final String TAG = "CodecWrapperPool";
    private PoolActionCallback mActionCallback;
    private final int mCapacity;
    private final String mName;
    private final CopyOnWriteArraySet<ReuseCodecWrapper> storeSet = new CopyOnWriteArraySet<>();

    public CodecWrapperPool(int i, String str) {
        this.mCapacity = i;
        this.mName = str;
    }

    private ReuseCodecWrapper getFirstCodecWrapper() {
        Iterator<ReuseCodecWrapper> it = this.storeSet.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r4 = replaceSameTypeCodec(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper getRemoveItem(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper> r0 = r3.storeSet
            java.util.Iterator r0 = r0.iterator()
            com.tencent.thumbplayer.tmediacodec.TCodecManager r1 = com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance()
            com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy r1 = r1.getReusePolicy()
            com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy$EraseType r1 = r1.eraseType
            com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy$EraseType r2 = com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy.EraseType.SAME
            if (r1 != r2) goto L_0x001b
            com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper r4 = r3.replaceSameTypeCodec(r4, r0)
            if (r4 == 0) goto L_0x001b
            return r4
        L_0x001b:
            com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper r4 = r3.getFirstCodecWrapper()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool.getRemoveItem(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper):com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper");
    }

    private final ReuseCodecWrapper pickSuitableCodecWrapper(FormatWrapper formatWrapper) {
        Iterator<ReuseCodecWrapper> it = this.storeSet.iterator();
        while (it.hasNext()) {
            ReuseCodecWrapper next = it.next();
            if (!next.mIsRecycled && next.canReuse(formatWrapper) != ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO) {
                return next;
            }
            next.trackCantReuse();
            if (next.needToErase()) {
                remove(next);
            }
        }
        return null;
    }

    private ReuseCodecWrapper replaceSameTypeCodec(ReuseCodecWrapper reuseCodecWrapper, Iterator it) {
        while (it.hasNext()) {
            ReuseCodecWrapper reuseCodecWrapper2 = (ReuseCodecWrapper) it.next();
            if (TextUtils.equals(reuseCodecWrapper.getCodecName(), reuseCodecWrapper2.getCodecName())) {
                return reuseCodecWrapper2;
            }
        }
        return null;
    }

    public void clear() {
        LogUtils.m21884i(TAG, "CodecWrapperPool clear:" + this.storeSet);
        Iterator<ReuseCodecWrapper> it = this.storeSet.iterator();
        while (it.hasNext()) {
            ReuseCodecWrapper next = it.next();
            PoolActionCallback poolActionCallback = this.mActionCallback;
            if (poolActionCallback != null) {
                poolActionCallback.onErase(next);
            }
        }
        this.storeSet.clear();
    }

    public boolean isEmpty() {
        return this.storeSet.isEmpty();
    }

    public boolean isFull() {
        return this.storeSet.size() == this.mCapacity;
    }

    public final void setActionCallback(PoolActionCallback poolActionCallback) {
        this.mActionCallback = poolActionCallback;
    }

    public String toString() {
        return "size:" + this.storeSet.size() + " elements:" + this.storeSet;
    }

    public ReuseCodecWrapper obtain(FormatWrapper formatWrapper) {
        ReuseCodecWrapper pickSuitableCodecWrapper = pickSuitableCodecWrapper(formatWrapper);
        if (LogUtils.isLogEnable()) {
            LogUtils.m21881d(TAG, "obtain codecWrapper:" + pickSuitableCodecWrapper);
        }
        if (pickSuitableCodecWrapper == null) {
            return null;
        }
        this.storeSet.remove(pickSuitableCodecWrapper);
        return pickSuitableCodecWrapper;
    }

    public void put(ReuseCodecWrapper reuseCodecWrapper) {
        if (isFull()) {
            remove(getRemoveItem(reuseCodecWrapper));
        }
        this.storeSet.add(reuseCodecWrapper);
    }

    public void remove(ReuseCodecWrapper reuseCodecWrapper) {
        if (this.storeSet.remove(reuseCodecWrapper)) {
            PoolActionCallback poolActionCallback = this.mActionCallback;
            if (poolActionCallback != null) {
                poolActionCallback.onErase(reuseCodecWrapper);
                return;
            }
            return;
        }
        LogUtils.m21886w(TAG, "pool:" + this.mName + " remove " + reuseCodecWrapper + " not found");
    }
}

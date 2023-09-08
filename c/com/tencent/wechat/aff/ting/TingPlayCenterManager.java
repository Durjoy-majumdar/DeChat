package com.tencent.wechat.aff.ting;

import com.google.protobuf.C23922p0;
import com.tencent.wechat.aff.ting.TingClientProto;
import com.tencent.wechat.aff.ting.TingProto;
import java.util.ArrayList;
import java.util.Iterator;

public class TingPlayCenterManager {
    private static TingPlayCenterManager instance = new TingPlayCenterManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    public interface Callback {
        void onApplyTapePlayingInfoComplete(int i);

        void onDeleteRecentTapeInfoComplete(int i);

        void onGetContiniousTapePlayingInfoComplete(int i, TingClientProto.TingTaskSnapshot tingTaskSnapshot);

        void onGetLastTapePlayingInfoComplete(int i, TingClientProto.TingTaskSnapshot tingTaskSnapshot);

        void onGetPreviousTapePlayingInfoComplete(int i, TingClientProto.TingTaskSnapshot tingTaskSnapshot);

        void onGetRecentTapeInfoListComplete(int i, TingClientProto.TingTapeItem[] tingTapeItemArr);

        void onLastPlayingInfoChangedEvent(TingClientProto.TingTaskSnapshot[] tingTaskSnapshotArr);

        void onRecentTapeInfoListChangedEvent(TingClientProto.TingTapeItem[] tingTapeItemArr);

        void onUpdateCurTapePlayingInfoComplete(int i);

        void oncallDeleteRecentTapeInfoComplete(int i);

        void oncallDeleteRecentTapeInfoEvent(long j, boolean z, TingClientProto.TingTapeItem tingTapeItem);

        void oncheckUpdateRecentTapeInfoListComplete(int i);

        void ononCategoryItemUpdatedComplete(int i);

        void ononManagerClearDataComplete(int i);

        void ononManagerInitComplete(int i);
    }

    private TingPlayCenterManager() {
        jniCreateTingPlayCenterManager();
    }

    public static TingPlayCenterManager getInstance() {
        return instance;
    }

    private native void jniApplyTapePlayingInfoAsync(int i, byte[] bArr);

    private native void jniCreateTingPlayCenterManager();

    private native void jniDeleteRecentTapeInfoAsync(int i, String str);

    private native void jniGetContiniousTapePlayingInfoAsync(int i, String str);

    private native byte[] jniGetContiniousTapePlayingInfoSync(String str);

    private native void jniGetLastTapePlayingInfoAsync(int i);

    private native byte[] jniGetLastTapePlayingInfoSync();

    private native void jniGetPreviousTapePlayingInfoAsync(int i);

    private native byte[] jniGetPreviousTapePlayingInfoSync();

    private native void jniGetRecentTapeInfoListAsync(int i);

    private native ArrayList<byte[]> jniGetRecentTapeInfoListSync();

    private native void jniSetCallback(Object obj);

    private native void jniUpdateCurTapePlayingInfoAsync(int i, String str, byte[] bArr);

    private native void jnicallDeleteRecentTapeInfoAsync(int i, long j, String str);

    private native void jnicheckUpdateRecentTapeInfoListAsync(int i);

    private native void jnionCategoryItemUpdatedAsync(int i, byte[] bArr);

    private native void jnionManagerClearDataAsync(int i);

    private native void jnionManagerInitAsync(int i);

    public void applyTapePlayingInfoAsync(int i, TingClientProto.TingTaskSnapshot tingTaskSnapshot) {
        jniApplyTapePlayingInfoAsync(i, tingTaskSnapshot.toByteArray());
    }

    public void callDeleteRecentTapeInfoAsync(int i, long j, String str) {
        jnicallDeleteRecentTapeInfoAsync(i, j, str);
    }

    public void checkUpdateRecentTapeInfoListAsync(int i) {
        jnicheckUpdateRecentTapeInfoListAsync(i);
    }

    public void deleteRecentTapeInfoAsync(int i, String str) {
        jniDeleteRecentTapeInfoAsync(i, str);
    }

    public void getContiniousTapePlayingInfoAsync(int i, String str) {
        jniGetContiniousTapePlayingInfoAsync(i, str);
    }

    public TingClientProto.TingTaskSnapshot getContiniousTapePlayingInfoSync(String str) {
        try {
            return TingClientProto.TingTaskSnapshot.parseFrom(jniGetContiniousTapePlayingInfoSync(str));
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public void getLastTapePlayingInfoAsync(int i) {
        jniGetLastTapePlayingInfoAsync(i);
    }

    public TingClientProto.TingTaskSnapshot getLastTapePlayingInfoSync() {
        try {
            return TingClientProto.TingTaskSnapshot.parseFrom(jniGetLastTapePlayingInfoSync());
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public void getPreviousTapePlayingInfoAsync(int i) {
        jniGetPreviousTapePlayingInfoAsync(i);
    }

    public TingClientProto.TingTaskSnapshot getPreviousTapePlayingInfoSync() {
        try {
            return TingClientProto.TingTaskSnapshot.parseFrom(jniGetPreviousTapePlayingInfoSync());
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public void getRecentTapeInfoListAsync(int i) {
        jniGetRecentTapeInfoListAsync(i);
    }

    public ArrayList<TingClientProto.TingTapeItem> getRecentTapeInfoListSync() {
        ArrayList<byte[]> jniGetRecentTapeInfoListSync = jniGetRecentTapeInfoListSync();
        ArrayList<TingClientProto.TingTapeItem> arrayList = new ArrayList<>();
        Iterator<byte[]> it = jniGetRecentTapeInfoListSync.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(TingClientProto.TingTapeItem.parseFrom(it.next()));
            } catch (C23922p0 unused) {
            }
        }
        return arrayList;
    }

    public void onCategoryItemUpdatedAsync(int i, TingProto.MMListenCategoryItem mMListenCategoryItem) {
        jnionCategoryItemUpdatedAsync(i, mMListenCategoryItem.toByteArray());
    }

    public void onManagerClearDataAsync(int i) {
        jnionManagerClearDataAsync(i);
    }

    public void onManagerInitAsync(int i) {
        jnionManagerInitAsync(i);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void updateCurTapePlayingInfoAsync(int i, String str, TingClientProto.TingTaskSnapshot tingTaskSnapshot) {
        jniUpdateCurTapePlayingInfoAsync(i, str, tingTaskSnapshot.toByteArray());
    }
}

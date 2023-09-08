package com.tencent.wechat.p326mm.biz;

import com.google.protobuf.C23922p0;
import com.tencent.wechat.p326mm.biz.BizCgiProto;
import com.tencent.wechat.p326mm.biz.BizProto;

/* renamed from: com.tencent.wechat.mm.biz.BizManager */
public class BizManager {
    private static BizManager instance = new BizManager();
    private long callbackHandle = 0;
    public long nativeHandle = 0;

    /* renamed from: com.tencent.wechat.mm.biz.BizManager$Callback */
    public interface Callback {
        void onDataChangeEvent(int i, BizProto.BizMsgInfo bizMsgInfo, String str);

        void onRecDataChangeEvent(int i, BizProto.BizRecInfo bizRecInfo);

        void ondeleteByUserNameAndSvrIdComplete(int i);

        void ondeleteByUserNameComplete(int i);

        void ongetDataComplete(int i, BizProto.BizMsgInfoList bizMsgInfoList);

        void ongetNewMsgLinePosComplete(int i, int i2);

        void ongetRecListStartPosComplete(int i, int i2);

        void oninitComplete(int i);

        void oninsertComplete(int i);

        void onmockInsertRecCardComplete(int i);

        void ononAppForegroundComplete(int i);

        void ononEnterComplete(int i);

        void ononExitComplete(int i);

        void ononExpandComplete(int i);

        void ononExposeComplete(int i);

        void ononMsgClickComplete(int i);

        void ononRecCardExposeComplete(int i);

        void onremoveAllDataComplete(int i);

        void onrequestMoreRecDataComplete(int i);

        void onresetAllNewMsgFlagComplete(int i);

        void onresetNewMsgLineComplete(int i, long j);

        void onsetFirstVisibleItemComplete(int i);

        void onsetIsKeepPosComplete(int i);

        void onupdateMsgContentComplete(int i, boolean z);
    }

    private BizManager() {
        jniCreateBizManager();
    }

    public static BizManager getInstance() {
        return instance;
    }

    private native void jniCreateBizManager();

    private native void jniSetCallback(Object obj);

    private native void jnicallOnDataChange(int i, byte[] bArr, String str);

    private native void jnicallOnRecDataChange(int i, byte[] bArr);

    private native void jnidebugPrintSnapshotList(boolean z);

    private native boolean jnideleteByMsgId(long j, int i);

    private native void jnideleteByUserNameAndSvrIdAsync(int i, String str, long j);

    private native void jnideleteByUserNameAsync(int i, String str);

    private native void jnidisableResortForDebug(boolean z);

    private native void jnigetDataAsync(int i, boolean z, boolean z2, int i2, long j);

    private native byte[] jnigetLastMsgInfo();

    private native int jnigetLastMsgTime();

    private native long jnigetLastMsgTimeByUserName(String str);

    private native void jnigetNewMsgLinePosAsync(int i);

    private native void jnigetRecListStartPosAsync(int i);

    private native byte[] jnigetTopNData(int i);

    private native int jnigetUnReadCount();

    private native boolean jnihasInit();

    private native void jniignoreResortNextReqTimeCheck(int i);

    private native void jniinitAsync(int i, String str, String str2, int i2, boolean z, boolean z2, boolean z3, boolean z4);

    private native void jniinsertAsync(int i, byte[] bArr);

    private native void jnimockInsertRecCardAsync(int i, byte[] bArr);

    private native void jnionAppForegroundAsync(int i);

    private native void jnionEnterAsync(int i, int i2);

    private native void jnionExitAsync(int i);

    private native void jnionExpandAsync(int i, long j);

    private native void jnionExposeAsync(int i, long j, boolean z, int i2);

    private native void jnionMsgClickAsync(int i, long j, int i2);

    private native void jnionRecCardExposeAsync(int i, long j, int i2);

    private native void jniremoveAllDataAsync(int i);

    private native void jnirequestMoreRecDataAsync(int i, int i2);

    private native void jniresetAllData();

    private native void jniresetAllNewMsgFlagAsync(int i);

    private native void jniresetNewMsgLineAsync(int i, long j);

    private native void jnisetFirstVisibleItemAsync(int i, int i2);

    private native void jnisetIsKeepPosAsync(int i, boolean z);

    private native void jniupdateMsgContentAsync(int i, long j, int i2, byte[] bArr);

    public void callOnDataChange(int i, BizProto.BizMsgInfo bizMsgInfo, String str) {
        jnicallOnDataChange(i, bizMsgInfo.toByteArray(), str);
    }

    public void callOnRecDataChange(int i, BizProto.BizRecInfo bizRecInfo) {
        jnicallOnRecDataChange(i, bizRecInfo.toByteArray());
    }

    public void debugPrintSnapshotList(boolean z) {
        jnidebugPrintSnapshotList(z);
    }

    public boolean deleteByMsgId(long j, int i) {
        return jnideleteByMsgId(j, i);
    }

    public void deleteByUserNameAndSvrIdAsync(int i, String str, long j) {
        jnideleteByUserNameAndSvrIdAsync(i, str, j);
    }

    public void deleteByUserNameAsync(int i, String str) {
        jnideleteByUserNameAsync(i, str);
    }

    public void disableResortForDebug(boolean z) {
        jnidisableResortForDebug(z);
    }

    public void getDataAsync(int i, boolean z, boolean z2, int i2, long j) {
        jnigetDataAsync(i, z, z2, i2, j);
    }

    public BizProto.BizMsgInfo getLastMsgInfo() {
        try {
            return BizProto.BizMsgInfo.parseFrom(jnigetLastMsgInfo());
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public int getLastMsgTime() {
        return jnigetLastMsgTime();
    }

    public long getLastMsgTimeByUserName(String str) {
        return jnigetLastMsgTimeByUserName(str);
    }

    public void getNewMsgLinePosAsync(int i) {
        jnigetNewMsgLinePosAsync(i);
    }

    public void getRecListStartPosAsync(int i) {
        jnigetRecListStartPosAsync(i);
    }

    public BizProto.BizMsgInfoList getTopNData(int i) {
        try {
            return BizProto.BizMsgInfoList.parseFrom(jnigetTopNData(i));
        } catch (C23922p0 unused) {
            return null;
        }
    }

    public int getUnReadCount() {
        return jnigetUnReadCount();
    }

    public boolean hasInit() {
        return jnihasInit();
    }

    public void ignoreResortNextReqTimeCheck(int i) {
        jniignoreResortNextReqTimeCheck(i);
    }

    public void initAsync(int i, String str, String str2, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        jniinitAsync(i, str, str2, i2, z, z2, z3, z4);
    }

    public void insertAsync(int i, BizProto.BizMsgInfo bizMsgInfo) {
        jniinsertAsync(i, bizMsgInfo.toByteArray());
    }

    public void mockInsertRecCardAsync(int i, BizCgiProto.ViewMsgCard viewMsgCard) {
        jnimockInsertRecCardAsync(i, viewMsgCard.toByteArray());
    }

    public void onAppForegroundAsync(int i) {
        jnionAppForegroundAsync(i);
    }

    public void onEnterAsync(int i, int i2) {
        jnionEnterAsync(i, i2);
    }

    public void onExitAsync(int i) {
        jnionExitAsync(i);
    }

    public void onExpandAsync(int i, long j) {
        jnionExpandAsync(i, j);
    }

    public void onExposeAsync(int i, long j, boolean z, int i2) {
        jnionExposeAsync(i, j, z, i2);
    }

    public void onMsgClickAsync(int i, long j, int i2) {
        jnionMsgClickAsync(i, j, i2);
    }

    public void onRecCardExposeAsync(int i, long j, int i2) {
        jnionRecCardExposeAsync(i, j, i2);
    }

    public void removeAllDataAsync(int i) {
        jniremoveAllDataAsync(i);
    }

    public void requestMoreRecDataAsync(int i, int i2) {
        jnirequestMoreRecDataAsync(i, i2);
    }

    public void resetAllData() {
        jniresetAllData();
    }

    public void resetAllNewMsgFlagAsync(int i) {
        jniresetAllNewMsgFlagAsync(i);
    }

    public void resetNewMsgLineAsync(int i, long j) {
        jniresetNewMsgLineAsync(i, j);
    }

    public void setCallback(Callback callback) {
        jniSetCallback(callback);
    }

    public void setFirstVisibleItemAsync(int i, int i2) {
        jnisetFirstVisibleItemAsync(i, i2);
    }

    public void setIsKeepPosAsync(int i, boolean z) {
        jnisetIsKeepPosAsync(i, z);
    }

    public void updateMsgContentAsync(int i, long j, int i2, BizProto.BizMsgItemContent bizMsgItemContent) {
        jniupdateMsgContentAsync(i, j, i2, bizMsgItemContent.toByteArray());
    }
}

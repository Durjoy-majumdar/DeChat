package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;

public final class DownloadChunkLogInfo extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "DownloadChunkLogInfo";
    public String UUID;
    public String appId;
    public byte currentRetryCnt;
    public long endTime;
    public int errorCode;
    public String flag;
    public byte isWap;
    public String networkOperator;
    public int networkType;
    public long readHeaderTime;
    public long receiveDataSize;
    public long requestRanagePosition;
    public long requestRanageSize;
    public String requestUrl;
    public long responseContentLength;
    public int responseHttpCode;
    public long responseRangeLength;
    public long responseRangePosition;
    public int resultState;
    public long startTime;
    public byte type;
    public String via;

    static {
        Class<DownloadChunkLogInfo> cls = DownloadChunkLogInfo.class;
    }

    public DownloadChunkLogInfo() {
        this.UUID = "";
        this.type = 0;
        this.requestUrl = "";
        this.networkOperator = "";
        this.networkType = 0;
        this.isWap = 0;
        this.requestRanagePosition = 0;
        this.requestRanageSize = 0;
        this.responseRangePosition = 0;
        this.responseRangeLength = 0;
        this.responseContentLength = 0;
        this.responseHttpCode = 0;
        this.receiveDataSize = 0;
        this.startTime = 0;
        this.readHeaderTime = 0;
        this.endTime = 0;
        this.errorCode = 0;
        this.resultState = 0;
        this.currentRetryCnt = 0;
        this.via = "";
        this.appId = "";
        this.flag = "";
    }

    public String className() {
        return "jce.DownloadChunkLogInfo";
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void display(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.display(this.UUID, "UUID");
        jceDisplayer.display(this.type, "type");
        jceDisplayer.display(this.requestUrl, "requestUrl");
        jceDisplayer.display(this.networkOperator, "networkOperator");
        jceDisplayer.display(this.networkType, "networkType");
        jceDisplayer.display(this.isWap, "isWap");
        jceDisplayer.display(this.requestRanagePosition, "requestRanagePosition");
        jceDisplayer.display(this.requestRanageSize, "requestRanageSize");
        jceDisplayer.display(this.responseRangePosition, "responseRangePosition");
        jceDisplayer.display(this.responseRangeLength, "responseRangeLength");
        jceDisplayer.display(this.responseContentLength, "responseContentLength");
        jceDisplayer.display(this.responseHttpCode, "responseHttpCode");
        jceDisplayer.display(this.receiveDataSize, "receiveDataSize");
        jceDisplayer.display(this.startTime, "startTime");
        jceDisplayer.display(this.readHeaderTime, "readHeaderTime");
        jceDisplayer.display(this.endTime, "endTime");
        jceDisplayer.display(this.errorCode, OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        jceDisplayer.display(this.resultState, "resultState");
        jceDisplayer.display(this.currentRetryCnt, "currentRetryCnt");
        jceDisplayer.display(this.via, OpenSDKTool4Assistant.EXTRA_VIA);
        jceDisplayer.display(this.appId, "appId");
        jceDisplayer.display(this.flag, "flag");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.UUID, true);
        jceDisplayer.displaySimple(this.type, true);
        jceDisplayer.displaySimple(this.requestUrl, true);
        jceDisplayer.displaySimple(this.networkOperator, true);
        jceDisplayer.displaySimple(this.networkType, true);
        jceDisplayer.displaySimple(this.isWap, true);
        jceDisplayer.displaySimple(this.requestRanagePosition, true);
        jceDisplayer.displaySimple(this.requestRanageSize, true);
        jceDisplayer.displaySimple(this.responseRangePosition, true);
        jceDisplayer.displaySimple(this.responseRangeLength, true);
        jceDisplayer.displaySimple(this.responseContentLength, true);
        jceDisplayer.displaySimple(this.responseHttpCode, true);
        jceDisplayer.displaySimple(this.receiveDataSize, true);
        jceDisplayer.displaySimple(this.startTime, true);
        jceDisplayer.displaySimple(this.readHeaderTime, true);
        jceDisplayer.displaySimple(this.endTime, true);
        jceDisplayer.displaySimple(this.errorCode, true);
        jceDisplayer.displaySimple(this.resultState, true);
        jceDisplayer.displaySimple(this.currentRetryCnt, true);
        jceDisplayer.displaySimple(this.via, true);
        jceDisplayer.displaySimple(this.appId, true);
        jceDisplayer.displaySimple(this.flag, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        DownloadChunkLogInfo downloadChunkLogInfo = (DownloadChunkLogInfo) obj;
        return JceUtil.equals((Object) this.UUID, (Object) downloadChunkLogInfo.UUID) && JceUtil.equals(this.type, downloadChunkLogInfo.type) && JceUtil.equals((Object) this.requestUrl, (Object) downloadChunkLogInfo.requestUrl) && JceUtil.equals((Object) this.networkOperator, (Object) downloadChunkLogInfo.networkOperator) && JceUtil.equals(this.networkType, downloadChunkLogInfo.networkType) && JceUtil.equals(this.isWap, downloadChunkLogInfo.isWap) && JceUtil.equals(this.requestRanagePosition, downloadChunkLogInfo.requestRanagePosition) && JceUtil.equals(this.requestRanageSize, downloadChunkLogInfo.requestRanageSize) && JceUtil.equals(this.responseRangePosition, downloadChunkLogInfo.responseRangePosition) && JceUtil.equals(this.responseRangeLength, downloadChunkLogInfo.responseRangeLength) && JceUtil.equals(this.responseContentLength, downloadChunkLogInfo.responseContentLength) && JceUtil.equals(this.responseHttpCode, downloadChunkLogInfo.responseHttpCode) && JceUtil.equals(this.receiveDataSize, downloadChunkLogInfo.receiveDataSize) && JceUtil.equals(this.startTime, downloadChunkLogInfo.startTime) && JceUtil.equals(this.readHeaderTime, downloadChunkLogInfo.readHeaderTime) && JceUtil.equals(this.endTime, downloadChunkLogInfo.endTime) && JceUtil.equals(this.errorCode, downloadChunkLogInfo.errorCode) && JceUtil.equals(this.resultState, downloadChunkLogInfo.resultState) && JceUtil.equals(this.currentRetryCnt, downloadChunkLogInfo.currentRetryCnt) && JceUtil.equals((Object) this.via, (Object) downloadChunkLogInfo.via) && JceUtil.equals((Object) this.appId, (Object) downloadChunkLogInfo.appId) && JceUtil.equals((Object) this.flag, (Object) downloadChunkLogInfo.flag);
    }

    public String fullClassName() {
        return TAG;
    }

    public String getAppId() {
        return this.appId;
    }

    public byte getCurrentRetryCnt() {
        return this.currentRetryCnt;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getFlag() {
        return this.flag;
    }

    public byte getIsWap() {
        return this.isWap;
    }

    public String getNetworkOperator() {
        return this.networkOperator;
    }

    public int getNetworkType() {
        return this.networkType;
    }

    public long getReadHeaderTime() {
        return this.readHeaderTime;
    }

    public long getReceiveDataSize() {
        return this.receiveDataSize;
    }

    public long getRequestRanagePosition() {
        return this.requestRanagePosition;
    }

    public long getRequestRanageSize() {
        return this.requestRanageSize;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public long getResponseContentLength() {
        return this.responseContentLength;
    }

    public int getResponseHttpCode() {
        return this.responseHttpCode;
    }

    public long getResponseRangeLength() {
        return this.responseRangeLength;
    }

    public long getResponseRangePosition() {
        return this.responseRangePosition;
    }

    public int getResultState() {
        return this.resultState;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public byte getType() {
        return this.type;
    }

    public String getUUID() {
        return this.UUID;
    }

    public String getVia() {
        return this.via;
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return 0;
        }
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.UUID = jceInputStream.readString(0, false);
        this.type = jceInputStream.read(this.type, 1, false);
        this.requestUrl = jceInputStream.readString(2, false);
        this.networkOperator = jceInputStream.readString(3, false);
        this.networkType = jceInputStream.read(this.networkType, 4, false);
        this.isWap = jceInputStream.read(this.isWap, 5, false);
        this.requestRanagePosition = jceInputStream.read(this.requestRanagePosition, 6, false);
        this.requestRanageSize = jceInputStream.read(this.requestRanageSize, 7, false);
        this.responseRangePosition = jceInputStream.read(this.responseRangePosition, 9, false);
        this.responseRangeLength = jceInputStream.read(this.responseRangeLength, 10, false);
        this.responseContentLength = jceInputStream.read(this.responseContentLength, 11, false);
        this.responseHttpCode = jceInputStream.read(this.responseHttpCode, 12, false);
        this.receiveDataSize = jceInputStream.read(this.receiveDataSize, 13, false);
        this.startTime = jceInputStream.read(this.startTime, 14, false);
        this.readHeaderTime = jceInputStream.read(this.readHeaderTime, 15, false);
        this.endTime = jceInputStream.read(this.endTime, 16, false);
        this.errorCode = jceInputStream.read(this.errorCode, 17, false);
        this.resultState = jceInputStream.read(this.resultState, 18, false);
        this.currentRetryCnt = jceInputStream.read(this.currentRetryCnt, 19, false);
        this.via = jceInputStream.readString(20, false);
        this.appId = jceInputStream.readString(21, false);
        this.flag = jceInputStream.readString(22, false);
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCurrentRetryCnt(byte b) {
        this.currentRetryCnt = b;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setFlag(String str) {
        this.flag = str;
    }

    public void setIsWap(byte b) {
        this.isWap = b;
    }

    public void setNetworkOperator(String str) {
        this.networkOperator = str;
    }

    public void setNetworkType(int i) {
        this.networkType = i;
    }

    public void setReadHeaderTime(long j) {
        this.readHeaderTime = j;
    }

    public void setReceiveDataSize(long j) {
        this.receiveDataSize = j;
    }

    public void setRequestRanagePosition(long j) {
        this.requestRanagePosition = j;
    }

    public void setRequestRanageSize(long j) {
        this.requestRanageSize = j;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setResponseContentLength(long j) {
        this.responseContentLength = j;
    }

    public void setResponseHttpCode(int i) {
        this.responseHttpCode = i;
    }

    public void setResponseRangeLength(long j) {
        this.responseRangeLength = j;
    }

    public void setResponseRangePosition(long j) {
        this.responseRangePosition = j;
    }

    public void setResultState(int i) {
        this.resultState = i;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setType(byte b) {
        this.type = b;
    }

    public void setUUID(String str) {
        this.UUID = str;
    }

    public void setVia(String str) {
        this.via = str;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.UUID;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        jceOutputStream.write(this.type, 1);
        String str2 = this.requestUrl;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        String str3 = this.networkOperator;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        jceOutputStream.write(this.networkType, 4);
        jceOutputStream.write(this.isWap, 5);
        jceOutputStream.write(this.requestRanagePosition, 6);
        jceOutputStream.write(this.requestRanageSize, 7);
        jceOutputStream.write(this.responseRangePosition, 9);
        jceOutputStream.write(this.responseRangeLength, 10);
        jceOutputStream.write(this.responseContentLength, 11);
        jceOutputStream.write(this.responseHttpCode, 12);
        jceOutputStream.write(this.receiveDataSize, 13);
        jceOutputStream.write(this.startTime, 14);
        jceOutputStream.write(this.readHeaderTime, 15);
        jceOutputStream.write(this.endTime, 16);
        jceOutputStream.write(this.errorCode, 17);
        jceOutputStream.write(this.resultState, 18);
        jceOutputStream.write(this.currentRetryCnt, 19);
        String str4 = this.via;
        if (str4 != null) {
            jceOutputStream.write(str4, 20);
        }
        String str5 = this.appId;
        if (str5 != null) {
            jceOutputStream.write(str5, 21);
        }
        String str6 = this.flag;
        if (str6 != null) {
            jceOutputStream.write(str6, 22);
        }
    }

    public DownloadChunkLogInfo(String str, byte b, String str2, String str3, int i, byte b2, long j, long j2, long j3, long j4, long j5, int i2, long j6, long j7, long j8, long j9, int i3, int i4, byte b3, String str4, String str5, String str6) {
        this.UUID = str;
        this.type = b;
        this.requestUrl = str2;
        this.networkOperator = str3;
        this.networkType = i;
        this.isWap = b2;
        this.requestRanagePosition = j;
        this.requestRanageSize = j2;
        this.responseRangePosition = j3;
        this.responseRangeLength = j4;
        this.responseContentLength = j5;
        this.responseHttpCode = i2;
        this.receiveDataSize = j6;
        this.startTime = j7;
        this.readHeaderTime = j8;
        this.endTime = j9;
        this.errorCode = i3;
        this.resultState = i4;
        this.currentRetryCnt = b3;
        this.via = str4;
        this.appId = str5;
        this.flag = str6;
    }
}

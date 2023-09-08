package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class ReportLogRequest extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReportLogRequest";
    public static byte[] cache_logData;
    public String hostAppPackageName;
    public int hostAppVersion;
    public String hostUserId;
    public byte[] logData;
    public int logType;

    static {
        Class<ReportLogRequest> cls = ReportLogRequest.class;
    }

    public ReportLogRequest() {
        this.logType = 0;
        this.logData = null;
        this.hostUserId = "";
        this.hostAppPackageName = "";
        this.hostAppVersion = 0;
    }

    public String className() {
        return "jce.ReportLogRequest";
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
        jceDisplayer.display(this.logType, "logType");
        jceDisplayer.display(this.logData, "logData");
        jceDisplayer.display(this.hostUserId, "hostUserId");
        jceDisplayer.display(this.hostAppPackageName, "hostAppPackageName");
        jceDisplayer.display(this.hostAppVersion, "hostAppVersion");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.logType, true);
        jceDisplayer.displaySimple(this.logData, true);
        jceDisplayer.displaySimple(this.hostUserId, true);
        jceDisplayer.displaySimple(this.hostAppPackageName, true);
        jceDisplayer.displaySimple(this.hostAppVersion, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ReportLogRequest reportLogRequest = (ReportLogRequest) obj;
        return JceUtil.equals(this.logType, reportLogRequest.logType) && JceUtil.equals((Object) this.logData, (Object) reportLogRequest.logData) && JceUtil.equals((Object) this.hostUserId, (Object) reportLogRequest.hostUserId) && JceUtil.equals((Object) this.hostAppPackageName, (Object) reportLogRequest.hostAppPackageName) && JceUtil.equals(this.hostAppVersion, reportLogRequest.hostAppVersion);
    }

    public String fullClassName() {
        return TAG;
    }

    public String getHostAppPackageName() {
        return this.hostAppPackageName;
    }

    public int getHostAppVersion() {
        return this.hostAppVersion;
    }

    public String getHostUserId() {
        return this.hostUserId;
    }

    public byte[] getLogData() {
        return this.logData;
    }

    public int getLogType() {
        return this.logType;
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
        this.logType = jceInputStream.read(this.logType, 0, false);
        if (cache_logData == null) {
            byte[] bArr = new byte[1];
            cache_logData = bArr;
            bArr[0] = 0;
        }
        this.logData = jceInputStream.read(cache_logData, 1, false);
        this.hostUserId = jceInputStream.readString(2, false);
        this.hostAppPackageName = jceInputStream.readString(3, false);
        this.hostAppVersion = jceInputStream.read(this.hostAppVersion, 4, false);
    }

    public void setHostAppPackageName(String str) {
        this.hostAppPackageName = str;
    }

    public void setHostAppVersion(int i) {
        this.hostAppVersion = i;
    }

    public void setHostUserId(String str) {
        this.hostUserId = str;
    }

    public void setLogData(byte[] bArr) {
        this.logData = bArr;
    }

    public void setLogType(int i) {
        this.logType = i;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.logType, 0);
        byte[] bArr = this.logData;
        if (bArr != null) {
            jceOutputStream.write(bArr, 1);
        }
        String str = this.hostUserId;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        String str2 = this.hostAppPackageName;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        jceOutputStream.write(this.hostAppVersion, 4);
    }

    public ReportLogRequest(int i, byte[] bArr, String str, String str2, int i2) {
        this.logType = i;
        this.logData = bArr;
        this.hostUserId = str;
        this.hostAppPackageName = str2;
        this.hostAppVersion = i2;
    }
}

package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class TipsInfoLog extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "TipsInfoLog";
    public int authorizedBtnClickCount;
    public int authorizedTipsCount;
    public int cancelBtnClickCount;
    public int downloadBtnClickCount;
    public int downloadTipsCount;
    public String gameChannelId;
    public String gamePackageName;
    public int gameVersionCode;
    public int installBtnClickCount;
    public int installTipsCount;
    public int networkErrorTipsCount;
    public String userId;
    public String userIdType;

    static {
        Class<TipsInfoLog> cls = TipsInfoLog.class;
    }

    public TipsInfoLog() {
        this.userId = "";
        this.userIdType = "";
        this.gamePackageName = "";
        this.gameVersionCode = 0;
        this.gameChannelId = "";
        this.authorizedTipsCount = 0;
        this.downloadTipsCount = 0;
        this.installTipsCount = 0;
        this.networkErrorTipsCount = 0;
        this.cancelBtnClickCount = 0;
        this.downloadBtnClickCount = 0;
        this.installBtnClickCount = 0;
        this.authorizedBtnClickCount = 0;
    }

    public String className() {
        return "jce.TipsInfoLog";
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
        jceDisplayer.display(this.userId, "userId");
        jceDisplayer.display(this.userIdType, "userIdType");
        jceDisplayer.display(this.gamePackageName, "gamePackageName");
        jceDisplayer.display(this.gameVersionCode, "gameVersionCode");
        jceDisplayer.display(this.gameChannelId, "gameChannelId");
        jceDisplayer.display(this.authorizedTipsCount, "authorizedTipsCount");
        jceDisplayer.display(this.downloadTipsCount, "downloadTipsCount");
        jceDisplayer.display(this.installTipsCount, "installTipsCount");
        jceDisplayer.display(this.networkErrorTipsCount, "networkErrorTipsCount");
        jceDisplayer.display(this.cancelBtnClickCount, "cancelBtnClickCount");
        jceDisplayer.display(this.downloadBtnClickCount, "downloadBtnClickCount");
        jceDisplayer.display(this.installBtnClickCount, "installBtnClickCount");
        jceDisplayer.display(this.authorizedBtnClickCount, "authorizedBtnClickCount");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.userId, true);
        jceDisplayer.displaySimple(this.userIdType, true);
        jceDisplayer.displaySimple(this.gamePackageName, true);
        jceDisplayer.displaySimple(this.gameVersionCode, true);
        jceDisplayer.displaySimple(this.gameChannelId, true);
        jceDisplayer.displaySimple(this.authorizedTipsCount, true);
        jceDisplayer.displaySimple(this.downloadTipsCount, true);
        jceDisplayer.displaySimple(this.installTipsCount, true);
        jceDisplayer.displaySimple(this.networkErrorTipsCount, true);
        jceDisplayer.displaySimple(this.cancelBtnClickCount, true);
        jceDisplayer.displaySimple(this.downloadBtnClickCount, true);
        jceDisplayer.displaySimple(this.installBtnClickCount, true);
        jceDisplayer.displaySimple(this.authorizedBtnClickCount, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        TipsInfoLog tipsInfoLog = (TipsInfoLog) obj;
        return JceUtil.equals((Object) this.userId, (Object) tipsInfoLog.userId) && JceUtil.equals((Object) this.userIdType, (Object) tipsInfoLog.userIdType) && JceUtil.equals((Object) this.gamePackageName, (Object) tipsInfoLog.gamePackageName) && JceUtil.equals(this.gameVersionCode, tipsInfoLog.gameVersionCode) && JceUtil.equals((Object) this.gameChannelId, (Object) tipsInfoLog.gameChannelId) && JceUtil.equals(this.authorizedTipsCount, tipsInfoLog.authorizedTipsCount) && JceUtil.equals(this.downloadTipsCount, tipsInfoLog.downloadTipsCount) && JceUtil.equals(this.installTipsCount, tipsInfoLog.installTipsCount) && JceUtil.equals(this.networkErrorTipsCount, tipsInfoLog.networkErrorTipsCount) && JceUtil.equals(this.cancelBtnClickCount, tipsInfoLog.cancelBtnClickCount) && JceUtil.equals(this.downloadBtnClickCount, tipsInfoLog.downloadBtnClickCount) && JceUtil.equals(this.installBtnClickCount, tipsInfoLog.installBtnClickCount) && JceUtil.equals(this.authorizedBtnClickCount, tipsInfoLog.authorizedBtnClickCount);
    }

    public String fullClassName() {
        return TAG;
    }

    public int getAuthorizedBtnClickCount() {
        return this.authorizedBtnClickCount;
    }

    public int getAuthorizedTipsCount() {
        return this.authorizedTipsCount;
    }

    public int getCancelBtnClickCount() {
        return this.cancelBtnClickCount;
    }

    public int getDownloadBtnClickCount() {
        return this.downloadBtnClickCount;
    }

    public int getDownloadTipsCount() {
        return this.downloadTipsCount;
    }

    public String getGameChannelId() {
        return this.gameChannelId;
    }

    public String getGamePackageName() {
        return this.gamePackageName;
    }

    public int getGameVersionCode() {
        return this.gameVersionCode;
    }

    public int getInstallBtnClickCount() {
        return this.installBtnClickCount;
    }

    public int getInstallTipsCount() {
        return this.installTipsCount;
    }

    public int getNetworkErrorTipsCount() {
        return this.networkErrorTipsCount;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserIdType() {
        return this.userIdType;
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
        this.userId = jceInputStream.readString(0, false);
        this.userIdType = jceInputStream.readString(1, false);
        this.gamePackageName = jceInputStream.readString(2, false);
        this.gameVersionCode = jceInputStream.read(this.gameVersionCode, 3, false);
        this.gameChannelId = jceInputStream.readString(4, false);
        this.authorizedTipsCount = jceInputStream.read(this.authorizedTipsCount, 5, false);
        this.downloadTipsCount = jceInputStream.read(this.downloadTipsCount, 6, false);
        this.installTipsCount = jceInputStream.read(this.installTipsCount, 7, false);
        this.networkErrorTipsCount = jceInputStream.read(this.networkErrorTipsCount, 8, false);
        this.cancelBtnClickCount = jceInputStream.read(this.cancelBtnClickCount, 9, false);
        this.downloadBtnClickCount = jceInputStream.read(this.downloadBtnClickCount, 10, false);
        this.installBtnClickCount = jceInputStream.read(this.installBtnClickCount, 11, false);
        this.authorizedBtnClickCount = jceInputStream.read(this.authorizedBtnClickCount, 12, false);
    }

    public void setAuthorizedBtnClickCount(int i) {
        this.authorizedBtnClickCount = i;
    }

    public void setAuthorizedTipsCount(int i) {
        this.authorizedTipsCount = i;
    }

    public void setCancelBtnClickCount(int i) {
        this.cancelBtnClickCount = i;
    }

    public void setDownloadBtnClickCount(int i) {
        this.downloadBtnClickCount = i;
    }

    public void setDownloadTipsCount(int i) {
        this.downloadTipsCount = i;
    }

    public void setGameChannelId(String str) {
        this.gameChannelId = str;
    }

    public void setGamePackageName(String str) {
        this.gamePackageName = str;
    }

    public void setGameVersionCode(int i) {
        this.gameVersionCode = i;
    }

    public void setInstallBtnClickCount(int i) {
        this.installBtnClickCount = i;
    }

    public void setInstallTipsCount(int i) {
        this.installTipsCount = i;
    }

    public void setNetworkErrorTipsCount(int i) {
        this.networkErrorTipsCount = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserIdType(String str) {
        this.userIdType = str;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.userId;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        String str2 = this.userIdType;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        String str3 = this.gamePackageName;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        jceOutputStream.write(this.gameVersionCode, 3);
        String str4 = this.gameChannelId;
        if (str4 != null) {
            jceOutputStream.write(str4, 4);
        }
        jceOutputStream.write(this.authorizedTipsCount, 5);
        jceOutputStream.write(this.downloadTipsCount, 6);
        jceOutputStream.write(this.installTipsCount, 7);
        jceOutputStream.write(this.networkErrorTipsCount, 8);
        jceOutputStream.write(this.cancelBtnClickCount, 9);
        jceOutputStream.write(this.downloadBtnClickCount, 10);
        jceOutputStream.write(this.installBtnClickCount, 11);
        jceOutputStream.write(this.authorizedBtnClickCount, 12);
    }

    public TipsInfoLog(String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.userId = str;
        this.userIdType = str2;
        this.gamePackageName = str3;
        this.gameVersionCode = i;
        this.gameChannelId = str4;
        this.authorizedTipsCount = i2;
        this.downloadTipsCount = i3;
        this.installTipsCount = i4;
        this.networkErrorTipsCount = i5;
        this.cancelBtnClickCount = i6;
        this.downloadBtnClickCount = i7;
        this.installBtnClickCount = i8;
        this.authorizedBtnClickCount = i9;
    }
}

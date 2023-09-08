package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;

public final class Net extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Net";
    public String extNetworkOperator;
    public int extNetworkType;
    public byte isWap;
    public byte netType;

    static {
        Class<Net> cls = Net.class;
    }

    public Net() {
        this.netType = 0;
        this.extNetworkOperator = "";
        this.extNetworkType = 0;
        this.isWap = 0;
    }

    public String className() {
        return "jce.Net";
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
        jceDisplayer.display(this.netType, DownloadInfo.NETTYPE);
        jceDisplayer.display(this.extNetworkOperator, "extNetworkOperator");
        jceDisplayer.display(this.extNetworkType, "extNetworkType");
        jceDisplayer.display(this.isWap, "isWap");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.netType, true);
        jceDisplayer.displaySimple(this.extNetworkOperator, true);
        jceDisplayer.displaySimple(this.extNetworkType, true);
        jceDisplayer.displaySimple(this.isWap, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Net net = (Net) obj;
        return JceUtil.equals(this.netType, net.netType) && JceUtil.equals((Object) this.extNetworkOperator, (Object) net.extNetworkOperator) && JceUtil.equals(this.extNetworkType, net.extNetworkType) && JceUtil.equals(this.isWap, net.isWap);
    }

    public String fullClassName() {
        return TAG;
    }

    public String getExtNetworkOperator() {
        return this.extNetworkOperator;
    }

    public int getExtNetworkType() {
        return this.extNetworkType;
    }

    public byte getIsWap() {
        return this.isWap;
    }

    public byte getNetType() {
        return this.netType;
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
        this.netType = jceInputStream.read(this.netType, 0, true);
        this.extNetworkOperator = jceInputStream.readString(1, false);
        this.extNetworkType = jceInputStream.read(this.extNetworkType, 2, false);
        this.isWap = jceInputStream.read(this.isWap, 3, false);
    }

    public void setExtNetworkOperator(String str) {
        this.extNetworkOperator = str;
    }

    public void setExtNetworkType(int i) {
        this.extNetworkType = i;
    }

    public void setIsWap(byte b) {
        this.isWap = b;
    }

    public void setNetType(byte b) {
        this.netType = b;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.netType, 0);
        String str = this.extNetworkOperator;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.extNetworkType, 2);
        jceOutputStream.write(this.isWap, 3);
    }

    public Net(byte b, String str, int i, byte b2) {
        this.netType = b;
        this.extNetworkOperator = str;
        this.extNetworkType = i;
        this.isWap = b2;
    }
}

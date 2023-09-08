package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class RspHead extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "RspHead";
    public int cmdId;
    public byte encryptWithPack;
    public String phoneGuid;
    public int requestId;
    public int ret;

    static {
        Class<RspHead> cls = RspHead.class;
    }

    public RspHead() {
        this.requestId = 0;
        this.cmdId = 0;
        this.ret = 0;
        this.encryptWithPack = 0;
        this.phoneGuid = "";
    }

    public String className() {
        return "jce.RspHead";
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
        jceDisplayer.display(this.requestId, "requestId");
        jceDisplayer.display(this.cmdId, "cmdId");
        jceDisplayer.display(this.ret, "ret");
        jceDisplayer.display(this.encryptWithPack, "encryptWithPack");
        jceDisplayer.display(this.phoneGuid, "phoneGuid");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.requestId, true);
        jceDisplayer.displaySimple(this.cmdId, true);
        jceDisplayer.displaySimple(this.ret, true);
        jceDisplayer.displaySimple(this.encryptWithPack, true);
        jceDisplayer.displaySimple(this.phoneGuid, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        RspHead rspHead = (RspHead) obj;
        return JceUtil.equals(this.requestId, rspHead.requestId) && JceUtil.equals(this.cmdId, rspHead.cmdId) && JceUtil.equals(this.ret, rspHead.ret) && JceUtil.equals(this.encryptWithPack, rspHead.encryptWithPack) && JceUtil.equals((Object) this.phoneGuid, (Object) rspHead.phoneGuid);
    }

    public String fullClassName() {
        return TAG;
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public byte getEncryptWithPack() {
        return this.encryptWithPack;
    }

    public String getPhoneGuid() {
        return this.phoneGuid;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public int getRet() {
        return this.ret;
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
        this.requestId = jceInputStream.read(this.requestId, 0, true);
        this.cmdId = jceInputStream.read(this.cmdId, 1, true);
        this.ret = jceInputStream.read(this.ret, 2, true);
        this.encryptWithPack = jceInputStream.read(this.encryptWithPack, 3, false);
        this.phoneGuid = jceInputStream.readString(4, false);
    }

    public void setCmdId(int i) {
        this.cmdId = i;
    }

    public void setEncryptWithPack(byte b) {
        this.encryptWithPack = b;
    }

    public void setPhoneGuid(String str) {
        this.phoneGuid = str;
    }

    public void setRequestId(int i) {
        this.requestId = i;
    }

    public void setRet(int i) {
        this.ret = i;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestId, 0);
        jceOutputStream.write(this.cmdId, 1);
        jceOutputStream.write(this.ret, 2);
        jceOutputStream.write(this.encryptWithPack, 3);
        String str = this.phoneGuid;
        if (str != null) {
            jceOutputStream.write(str, 4);
        }
    }

    public RspHead(int i, int i2, int i3, byte b, String str) {
        this.requestId = i;
        this.cmdId = i2;
        this.ret = i3;
        this.encryptWithPack = b;
        this.phoneGuid = str;
    }
}

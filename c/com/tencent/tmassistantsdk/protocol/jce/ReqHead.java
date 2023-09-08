package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class ReqHead extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReqHead";
    public static Net cache_net;
    public static Terminal cache_terminal;
    public int assistantAPILevel;
    public int assistantVersionCode;
    public int cmdId;
    public byte encryptWithPack;
    public Net net;
    public String phoneGuid;
    public String qua;
    public int requestId;
    public Terminal terminal;

    static {
        Class<ReqHead> cls = ReqHead.class;
    }

    public ReqHead() {
        this.requestId = 0;
        this.cmdId = 0;
        this.phoneGuid = "";
        this.qua = "";
        this.encryptWithPack = 0;
        this.terminal = null;
        this.assistantAPILevel = 0;
        this.assistantVersionCode = 0;
        this.net = null;
    }

    public String className() {
        return "jce.ReqHead";
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
        jceDisplayer.display(this.phoneGuid, "phoneGuid");
        jceDisplayer.display(this.qua, "qua");
        jceDisplayer.display(this.encryptWithPack, "encryptWithPack");
        jceDisplayer.display((JceStruct) this.terminal, "terminal");
        jceDisplayer.display(this.assistantAPILevel, "assistantAPILevel");
        jceDisplayer.display(this.assistantVersionCode, "assistantVersionCode");
        jceDisplayer.display((JceStruct) this.net, "net");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.requestId, true);
        jceDisplayer.displaySimple(this.cmdId, true);
        jceDisplayer.displaySimple(this.phoneGuid, true);
        jceDisplayer.displaySimple(this.qua, true);
        jceDisplayer.displaySimple(this.encryptWithPack, true);
        jceDisplayer.displaySimple((JceStruct) this.terminal, true);
        jceDisplayer.displaySimple(this.assistantAPILevel, true);
        jceDisplayer.displaySimple(this.assistantVersionCode, true);
        jceDisplayer.displaySimple((JceStruct) this.net, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ReqHead reqHead = (ReqHead) obj;
        return JceUtil.equals(this.requestId, reqHead.requestId) && JceUtil.equals(this.cmdId, reqHead.cmdId) && JceUtil.equals((Object) this.phoneGuid, (Object) reqHead.phoneGuid) && JceUtil.equals((Object) this.qua, (Object) reqHead.qua) && JceUtil.equals(this.encryptWithPack, reqHead.encryptWithPack) && JceUtil.equals((Object) this.terminal, (Object) reqHead.terminal) && JceUtil.equals(this.assistantAPILevel, reqHead.assistantAPILevel) && JceUtil.equals(this.assistantVersionCode, reqHead.assistantVersionCode) && JceUtil.equals((Object) this.net, (Object) reqHead.net);
    }

    public String fullClassName() {
        return TAG;
    }

    public int getAssistantAPILevel() {
        return this.assistantAPILevel;
    }

    public int getAssistantVersionCode() {
        return this.assistantVersionCode;
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public byte getEncryptWithPack() {
        return this.encryptWithPack;
    }

    public Net getNet() {
        return this.net;
    }

    public String getPhoneGuid() {
        return this.phoneGuid;
    }

    public String getQua() {
        return this.qua;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public Terminal getTerminal() {
        return this.terminal;
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
        this.phoneGuid = jceInputStream.readString(2, true);
        this.qua = jceInputStream.readString(3, true);
        this.encryptWithPack = jceInputStream.read(this.encryptWithPack, 4, false);
        if (cache_terminal == null) {
            cache_terminal = new Terminal();
        }
        this.terminal = (Terminal) jceInputStream.read((JceStruct) cache_terminal, 5, false);
        this.assistantAPILevel = jceInputStream.read(this.assistantAPILevel, 6, false);
        this.assistantVersionCode = jceInputStream.read(this.assistantVersionCode, 7, false);
        if (cache_net == null) {
            cache_net = new Net();
        }
        this.net = (Net) jceInputStream.read((JceStruct) cache_net, 8, false);
    }

    public void setAssistantAPILevel(int i) {
        this.assistantAPILevel = i;
    }

    public void setAssistantVersionCode(int i) {
        this.assistantVersionCode = i;
    }

    public void setCmdId(int i) {
        this.cmdId = i;
    }

    public void setEncryptWithPack(byte b) {
        this.encryptWithPack = b;
    }

    public void setNet(Net net2) {
        this.net = net2;
    }

    public void setPhoneGuid(String str) {
        this.phoneGuid = str;
    }

    public void setQua(String str) {
        this.qua = str;
    }

    public void setRequestId(int i) {
        this.requestId = i;
    }

    public void setTerminal(Terminal terminal2) {
        this.terminal = terminal2;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestId, 0);
        jceOutputStream.write(this.cmdId, 1);
        jceOutputStream.write(this.phoneGuid, 2);
        jceOutputStream.write(this.qua, 3);
        jceOutputStream.write(this.encryptWithPack, 4);
        Terminal terminal2 = this.terminal;
        if (terminal2 != null) {
            jceOutputStream.write((JceStruct) terminal2, 5);
        }
        jceOutputStream.write(this.assistantAPILevel, 6);
        jceOutputStream.write(this.assistantVersionCode, 7);
        Net net2 = this.net;
        if (net2 != null) {
            jceOutputStream.write((JceStruct) net2, 8);
        }
    }

    public ReqHead(int i, int i2, String str, String str2, byte b, Terminal terminal2, int i3, int i4, Net net2) {
        this.requestId = i;
        this.cmdId = i2;
        this.phoneGuid = str;
        this.qua = str2;
        this.encryptWithPack = b;
        this.terminal = terminal2;
        this.assistantAPILevel = i3;
        this.assistantVersionCode = i4;
        this.net = net2;
    }
}

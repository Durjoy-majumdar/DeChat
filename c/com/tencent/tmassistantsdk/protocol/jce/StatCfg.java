package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;

public final class StatCfg extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "StatCfg";
    public int internal;
    public short lineNum;
    public byte netType;
    public byte type;

    static {
        Class<StatCfg> cls = StatCfg.class;
    }

    public StatCfg() {
        this.type = 0;
        this.netType = 0;
        this.lineNum = 0;
        this.internal = 0;
    }

    public String className() {
        return "jce.StatCfg";
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
        jceDisplayer.display(this.type, "type");
        jceDisplayer.display(this.netType, DownloadInfo.NETTYPE);
        jceDisplayer.display(this.lineNum, "lineNum");
        jceDisplayer.display(this.internal, "internal");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.type, true);
        jceDisplayer.displaySimple(this.netType, true);
        jceDisplayer.displaySimple(this.lineNum, true);
        jceDisplayer.displaySimple(this.internal, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        StatCfg statCfg = (StatCfg) obj;
        return JceUtil.equals(this.type, statCfg.type) && JceUtil.equals(this.netType, statCfg.netType) && JceUtil.equals(this.lineNum, statCfg.lineNum) && JceUtil.equals(this.internal, statCfg.internal);
    }

    public String fullClassName() {
        return TAG;
    }

    public int getInternal() {
        return this.internal;
    }

    public short getLineNum() {
        return this.lineNum;
    }

    public byte getNetType() {
        return this.netType;
    }

    public byte getType() {
        return this.type;
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
        this.type = jceInputStream.read(this.type, 0, true);
        this.netType = jceInputStream.read(this.netType, 1, true);
        this.lineNum = jceInputStream.read(this.lineNum, 2, false);
        this.internal = jceInputStream.read(this.internal, 3, false);
    }

    public void setInternal(int i) {
        this.internal = i;
    }

    public void setLineNum(short s) {
        this.lineNum = s;
    }

    public void setNetType(byte b) {
        this.netType = b;
    }

    public void setType(byte b) {
        this.type = b;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.type, 0);
        jceOutputStream.write(this.netType, 1);
        jceOutputStream.write(this.lineNum, 2);
        jceOutputStream.write(this.internal, 3);
    }

    public StatCfg(byte b, byte b2, short s, int i) {
        this.type = b;
        this.netType = b2;
        this.lineNum = s;
        this.internal = i;
    }
}

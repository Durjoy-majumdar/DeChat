package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class SettingsCfg extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "SettingsCfg";
    public static byte[] cache_cfg;
    public byte[] cfg;
    public long revision;
    public byte type;

    static {
        Class<SettingsCfg> cls = SettingsCfg.class;
    }

    public SettingsCfg() {
        this.type = 0;
        this.cfg = null;
        this.revision = 0;
    }

    public String className() {
        return "jce.SettingsCfg";
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
        jceDisplayer.display(this.cfg, "cfg");
        jceDisplayer.display(this.revision, "revision");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.type, true);
        jceDisplayer.displaySimple(this.cfg, true);
        jceDisplayer.displaySimple(this.revision, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        SettingsCfg settingsCfg = (SettingsCfg) obj;
        return JceUtil.equals(this.type, settingsCfg.type) && JceUtil.equals((Object) this.cfg, (Object) settingsCfg.cfg) && JceUtil.equals(this.revision, settingsCfg.revision);
    }

    public String fullClassName() {
        return TAG;
    }

    public byte[] getCfg() {
        return this.cfg;
    }

    public long getRevision() {
        return this.revision;
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
        if (cache_cfg == null) {
            byte[] bArr = new byte[1];
            cache_cfg = bArr;
            bArr[0] = 0;
        }
        this.cfg = jceInputStream.read(cache_cfg, 1, true);
        this.revision = jceInputStream.read(this.revision, 2, false);
    }

    public void setCfg(byte[] bArr) {
        this.cfg = bArr;
    }

    public void setRevision(long j) {
        this.revision = j;
    }

    public void setType(byte b) {
        this.type = b;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.type, 0);
        jceOutputStream.write(this.cfg, 1);
        jceOutputStream.write(this.revision, 2);
    }

    public SettingsCfg(byte b, byte[] bArr, long j) {
        this.type = b;
        this.cfg = bArr;
        this.revision = j;
    }
}

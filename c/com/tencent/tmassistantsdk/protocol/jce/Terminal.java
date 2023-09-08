package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class Terminal extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Terminal";
    public String androidId;
    public String androidIdSdCard;
    public String imei;
    public String imsi;
    public String macAdress;

    static {
        Class<Terminal> cls = Terminal.class;
    }

    public Terminal() {
        this.imei = "";
        this.macAdress = "";
        this.androidId = "";
        this.androidIdSdCard = "";
        this.imsi = "";
    }

    public String className() {
        return "jce.Terminal";
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
        jceDisplayer.display(this.imei, "imei");
        jceDisplayer.display(this.macAdress, "macAdress");
        jceDisplayer.display(this.androidId, "androidId");
        jceDisplayer.display(this.androidIdSdCard, "androidIdSdCard");
        jceDisplayer.display(this.imsi, "imsi");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.imei, true);
        jceDisplayer.displaySimple(this.macAdress, true);
        jceDisplayer.displaySimple(this.androidId, true);
        jceDisplayer.displaySimple(this.androidIdSdCard, true);
        jceDisplayer.displaySimple(this.imsi, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Terminal terminal = (Terminal) obj;
        return JceUtil.equals((Object) this.imei, (Object) terminal.imei) && JceUtil.equals((Object) this.macAdress, (Object) terminal.macAdress) && JceUtil.equals((Object) this.androidId, (Object) terminal.androidId) && JceUtil.equals((Object) this.androidIdSdCard, (Object) terminal.androidIdSdCard) && JceUtil.equals((Object) this.imsi, (Object) terminal.imsi);
    }

    public String fullClassName() {
        return TAG;
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public String getAndroidIdSdCard() {
        return this.androidIdSdCard;
    }

    public String getImei() {
        return this.imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public String getMacAdress() {
        return this.macAdress;
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
        this.imei = jceInputStream.readString(0, false);
        this.macAdress = jceInputStream.readString(1, false);
        this.androidId = jceInputStream.readString(2, false);
        this.androidIdSdCard = jceInputStream.readString(3, false);
        this.imsi = jceInputStream.readString(4, false);
    }

    public void setAndroidId(String str) {
        this.androidId = str;
    }

    public void setAndroidIdSdCard(String str) {
        this.androidIdSdCard = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setImsi(String str) {
        this.imsi = str;
    }

    public void setMacAdress(String str) {
        this.macAdress = str;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.imei;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        String str2 = this.macAdress;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        String str3 = this.androidId;
        if (str3 != null) {
            jceOutputStream.write(str3, 2);
        }
        String str4 = this.androidIdSdCard;
        if (str4 != null) {
            jceOutputStream.write(str4, 3);
        }
        String str5 = this.imsi;
        if (str5 != null) {
            jceOutputStream.write(str5, 4);
        }
    }

    public Terminal(String str, String str2, String str3, String str4, String str5) {
        this.imei = str;
        this.macAdress = str2;
        this.androidId = str3;
        this.androidIdSdCard = str4;
        this.imsi = str5;
    }
}

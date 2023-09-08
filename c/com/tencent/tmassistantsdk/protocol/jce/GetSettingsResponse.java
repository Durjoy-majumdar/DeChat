package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

public final class GetSettingsResponse extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "GetSettingsResponse";
    public static ArrayList<SettingsCfg> cache_settings;
    public int ret;
    public ArrayList<SettingsCfg> settings;

    static {
        Class<GetSettingsResponse> cls = GetSettingsResponse.class;
    }

    public GetSettingsResponse() {
        this.ret = 0;
        this.settings = null;
    }

    public String className() {
        return "jce.GetSettingsResponse";
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
        jceDisplayer.display(this.ret, "ret");
        jceDisplayer.display(this.settings, "settings");
    }

    public void displaySimple(StringBuilder sb, int i) {
        JceDisplayer jceDisplayer = new JceDisplayer(sb, i);
        jceDisplayer.displaySimple(this.ret, true);
        jceDisplayer.displaySimple(this.settings, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        GetSettingsResponse getSettingsResponse = (GetSettingsResponse) obj;
        return JceUtil.equals(this.ret, getSettingsResponse.ret) && JceUtil.equals((Object) this.settings, (Object) getSettingsResponse.settings);
    }

    public String fullClassName() {
        return TAG;
    }

    public int getRet() {
        return this.ret;
    }

    public ArrayList<SettingsCfg> getSettings() {
        return this.settings;
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
        this.ret = jceInputStream.read(this.ret, 0, true);
        if (cache_settings == null) {
            cache_settings = new ArrayList<>();
            cache_settings.add(new SettingsCfg());
        }
        this.settings = (ArrayList) jceInputStream.read(cache_settings, 1, false);
    }

    public void setRet(int i) {
        this.ret = i;
    }

    public void setSettings(ArrayList<SettingsCfg> arrayList) {
        this.settings = arrayList;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ret, 0);
        ArrayList<SettingsCfg> arrayList = this.settings;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 1);
        }
    }

    public GetSettingsResponse(int i, ArrayList<SettingsCfg> arrayList) {
        this.ret = i;
        this.settings = arrayList;
    }
}

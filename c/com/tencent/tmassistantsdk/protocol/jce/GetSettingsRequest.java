package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class GetSettingsRequest extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "GetSettingsRequest";
    public String reserve;

    static {
        Class<GetSettingsRequest> cls = GetSettingsRequest.class;
    }

    public GetSettingsRequest() {
        this.reserve = "";
    }

    public String className() {
        return "jce.GetSettingsRequest";
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void display(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).display(this.reserve, "reserve");
    }

    public void displaySimple(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).displaySimple(this.reserve, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return JceUtil.equals((Object) this.reserve, (Object) ((GetSettingsRequest) obj).reserve);
    }

    public String fullClassName() {
        return TAG;
    }

    public String getReserve() {
        return this.reserve;
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
        this.reserve = jceInputStream.readString(0, false);
    }

    public void setReserve(String str) {
        this.reserve = str;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.reserve;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
    }

    public GetSettingsRequest(String str) {
        this.reserve = str;
    }
}

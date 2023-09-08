package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceDisplayer;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.p013qq.taf.jce.JceUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

public final class ReportLogResponse extends JceStruct implements Cloneable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReportLogResponse";
    public int ret;

    static {
        Class<ReportLogResponse> cls = ReportLogResponse.class;
    }

    public ReportLogResponse() {
        this.ret = 0;
    }

    public String className() {
        return "jce.ReportLogResponse";
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void display(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).display(this.ret, "ret");
    }

    public void displaySimple(StringBuilder sb, int i) {
        new JceDisplayer(sb, i).displaySimple(this.ret, false);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return JceUtil.equals(this.ret, ((ReportLogResponse) obj).ret);
    }

    public String fullClassName() {
        return TAG;
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
        this.ret = jceInputStream.read(this.ret, 0, true);
    }

    public void setRet(int i) {
        this.ret = i;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ret, 0);
    }

    public ReportLogResponse(int i) {
        this.ret = i;
    }
}

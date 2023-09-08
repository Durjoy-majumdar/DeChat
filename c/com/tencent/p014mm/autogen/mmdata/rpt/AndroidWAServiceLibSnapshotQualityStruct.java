package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct */
public final class AndroidWAServiceLibSnapshotQualityStruct extends C61103a {

    /* renamed from: d */
    public int f236322d = 0;

    /* renamed from: e */
    public String f236323e = "";

    /* renamed from: f */
    public String f236324f = "";

    /* renamed from: g */
    public long f236325g;

    /* renamed from: h */
    public String f236326h = "";

    /* renamed from: i */
    public String f236327i = "";

    /* renamed from: j */
    public String f236328j = "";

    /* renamed from: k */
    public String f236329k = "";

    /* renamed from: l */
    public int f236330l = 0;

    /* renamed from: m */
    public String f236331m = "";

    /* renamed from: n */
    public String f236332n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25956;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236322d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236323e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236324f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236325g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236326h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236327i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236328j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236329k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236330l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236331m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236332n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236322d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LibVersionInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236323e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("V8Version");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236324f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionCostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236325g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionParams1");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236326h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionParams2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236327i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionParams3");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236328j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionParams4");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236329k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236330l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionParams5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236331m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionParams6");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236332n);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public AndroidWAServiceLibSnapshotQualityStruct mo112526s(long j) {
        this.f236325g = j;
        mo86046c("ActionCostTimeMs", j);
        return this;
    }

    /* renamed from: t */
    public AndroidWAServiceLibSnapshotQualityStruct mo112527t(String str) {
        this.f236326h = mo86045b("ActionParams1", str, true);
        return this;
    }

    /* renamed from: u */
    public AndroidWAServiceLibSnapshotQualityStruct mo112528u(String str) {
        this.f236327i = mo86045b("ActionParams2", str, true);
        return this;
    }

    /* renamed from: v */
    public AndroidWAServiceLibSnapshotQualityStruct mo112529v(String str) {
        this.f236323e = mo86045b("LibVersionInfo", str, true);
        return this;
    }

    /* renamed from: w */
    public AndroidWAServiceLibSnapshotQualityStruct mo112530w(String str) {
        this.f236324f = mo86045b("V8Version", str, true);
        return this;
    }
}

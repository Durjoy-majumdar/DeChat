package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPageExposeStruct */
public final class FinderPageExposeStruct extends C61103a {

    /* renamed from: d */
    public String f9876d = "";

    /* renamed from: e */
    public String f9877e = "";

    /* renamed from: f */
    public String f9878f = "";

    /* renamed from: g */
    public int f9879g;

    /* renamed from: h */
    public String f9880h = "";

    /* renamed from: i */
    public String f9881i = "";

    /* renamed from: j */
    public String f9882j = "";

    /* renamed from: k */
    public String f9883k = "";

    /* renamed from: l */
    public String f9884l = "";

    /* renamed from: m */
    public long f9885m;

    /* renamed from: n */
    public String f9886n = "";

    /* renamed from: o */
    public String f9887o = "";

    /* renamed from: A */
    public FinderPageExposeStruct mo1028A(String str) {
        this.f9882j = mo86045b("udf_kv", str, true);
        return this;
    }

    /* renamed from: j */
    public int mo1004j() {
        return 21874;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9876d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9877e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9878f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9879g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9880h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9881i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9882j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9883k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9884l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9885m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9886n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9887o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9876d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("findercontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9877e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9878f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_code");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9879g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9880h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9881i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9882j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9883k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ref_commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9884l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9885m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("jump_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9886n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("extrainfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9887o);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderPageExposeStruct mo1029s(String str) {
        this.f9883k = mo86045b("clicktabcontextid", str, true);
        return this;
    }

    /* renamed from: t */
    public FinderPageExposeStruct mo1030t(String str) {
        this.f9878f = mo86045b("commentscene", str, true);
        return this;
    }

    /* renamed from: u */
    public FinderPageExposeStruct mo1031u(String str) {
        this.f9880h = mo86045b("event_time", str, true);
        return this;
    }

    /* renamed from: v */
    public FinderPageExposeStruct mo1032v(String str) {
        this.f9877e = mo86045b("findercontextid", str, true);
        return this;
    }

    /* renamed from: w */
    public FinderPageExposeStruct mo1033w(String str) {
        this.f9881i = mo86045b("finderusername", str, true);
        return this;
    }

    /* renamed from: x */
    public FinderPageExposeStruct mo1034x(String str) {
        this.f9886n = mo86045b("jump_id", str, true);
        return this;
    }

    /* renamed from: y */
    public FinderPageExposeStruct mo1035y(String str) {
        this.f9884l = mo86045b("ref_commentscene", str, true);
        return this;
    }

    /* renamed from: z */
    public FinderPageExposeStruct mo1036z(String str) {
        this.f9876d = mo86045b("sessionid", str, true);
        return this;
    }
}

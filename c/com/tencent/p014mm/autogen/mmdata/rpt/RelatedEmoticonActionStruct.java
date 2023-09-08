package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct */
public final class RelatedEmoticonActionStruct extends C61103a {

    /* renamed from: d */
    public long f265792d = 0;

    /* renamed from: e */
    public long f265793e = 0;

    /* renamed from: f */
    public String f265794f = "";

    /* renamed from: g */
    public String f265795g = "";

    /* renamed from: h */
    public String f265796h = "";

    /* renamed from: i */
    public String f265797i = "";

    /* renamed from: j */
    public long f265798j = 0;

    /* renamed from: k */
    public long f265799k = 0;

    /* renamed from: l */
    public String f265800l = "";

    /* renamed from: m */
    public String f265801m = "";

    /* renamed from: n */
    public String f265802n = "";

    /* renamed from: o */
    public String f265803o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 18739;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265792d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265793e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265794f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265795g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265796h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265797i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265798j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265799k);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265800l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265801m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265802n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265803o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265792d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265793e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourcePid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265794f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceMd5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265795g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Pid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265796h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Md5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265797i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Index");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265798j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MaxRowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265799k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFree");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsLocal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFree2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265800l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265801m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsLocal2");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265802n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265803o);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public RelatedEmoticonActionStruct mo126625s(String str) {
        this.f265803o = mo86045b("ChatID", str, true);
        return this;
    }

    /* renamed from: t */
    public RelatedEmoticonActionStruct mo126626t(String str) {
        this.f265795g = mo86045b("SourceMd5", str, true);
        return this;
    }

    /* renamed from: u */
    public RelatedEmoticonActionStruct mo126627u(String str) {
        this.f265794f = mo86045b("SourcePid", str, true);
        return this;
    }
}

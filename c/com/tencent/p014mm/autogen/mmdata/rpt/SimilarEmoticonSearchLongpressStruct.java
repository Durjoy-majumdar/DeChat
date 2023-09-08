package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct */
public final class SimilarEmoticonSearchLongpressStruct extends C61103a {

    /* renamed from: d */
    public String f265913d = "";

    /* renamed from: e */
    public String f265914e = "";

    /* renamed from: f */
    public long f265915f = 0;

    /* renamed from: g */
    public String f265916g = "";

    /* renamed from: h */
    public String f265917h = "";

    /* renamed from: i */
    public long f265918i = 0;

    /* renamed from: j */
    public long f265919j = 0;

    /* renamed from: k */
    public long f265920k;

    /* renamed from: l */
    public String f265921l = "";

    /* renamed from: m */
    public long f265922m;

    /* renamed from: n */
    public long f265923n = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 19651;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265913d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265914e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265915f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265916g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265917h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265918i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265919j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265920k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265921l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265922m);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265923n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265913d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265914e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265915f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickMD5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265916g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QueryMD5");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265917h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Offset");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265918i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Pos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265919j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClientTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265920k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265921l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265922m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Tab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSelf");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265923n);
        return stringBuffer.toString();
    }
}

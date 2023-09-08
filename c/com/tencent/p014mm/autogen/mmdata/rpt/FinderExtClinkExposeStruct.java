package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct */
public final class FinderExtClinkExposeStruct extends C61103a {

    /* renamed from: d */
    public String f9796d = "";

    /* renamed from: e */
    public String f9797e = "";

    /* renamed from: f */
    public String f9798f = "";

    /* renamed from: g */
    public String f9799g = "";

    /* renamed from: h */
    public long f9800h;

    /* renamed from: i */
    public long f9801i;

    /* renamed from: j */
    public String f9802j = "";

    /* renamed from: k */
    public String f9803k = "";

    /* renamed from: l */
    public long f9804l;

    /* renamed from: m */
    public String f9805m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21464;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9796d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9797e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9798f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9799g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9800h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9801i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9802j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9803k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9804l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9805m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9796d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9797e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9798f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Url");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9799g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9800h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9801i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MiniAppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9802j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9803k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9804l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9805m);
        return stringBuffer.toString();
    }
}

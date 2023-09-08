package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderNoticeLiveStreamStruct */
public final class FinderNoticeLiveStreamStruct extends C61103a {

    /* renamed from: d */
    public String f155739d = "";

    /* renamed from: e */
    public String f155740e = "";

    /* renamed from: f */
    public int f155741f;

    /* renamed from: g */
    public String f155742g = "";

    /* renamed from: h */
    public long f155743h;

    /* renamed from: i */
    public long f155744i;

    /* renamed from: j */
    public String f155745j = "";

    /* renamed from: k */
    public long f155746k;

    /* renamed from: l */
    public String f155747l = "";

    /* renamed from: m */
    public long f155748m;

    /* renamed from: j */
    public int mo1004j() {
        return 21106;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155739d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155740e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155741f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155742g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155743h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155744i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155745j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155746k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155747l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155748m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinderUsrname");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155739d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderWxAppInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155740e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsPrivate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155741f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155742g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155743h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155744i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionJson");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155745j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155746k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Description");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155747l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Advancetype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155748m);
        return stringBuffer.toString();
    }
}

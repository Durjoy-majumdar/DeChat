package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPersonalCenterEventStruct */
public final class FinderPersonalCenterEventStruct extends C61103a {

    /* renamed from: d */
    public String f155749d = "";

    /* renamed from: e */
    public long f155750e;

    /* renamed from: f */
    public long f155751f;

    /* renamed from: g */
    public long f155752g;

    /* renamed from: h */
    public long f155753h;

    /* renamed from: i */
    public long f155754i;

    /* renamed from: j */
    public long f155755j;

    /* renamed from: k */
    public long f155756k;

    /* renamed from: l */
    public String f155757l = "";

    /* renamed from: m */
    public String f155758m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20372;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155749d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155750e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155751f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155752g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155753h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155754i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155755j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155756k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155757l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155758m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155749d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155750e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsRedDotEnter");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155751f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Event");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155752g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BannerType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155753h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155754i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsHaveRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155755j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155756k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RedDotCountDetail");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155757l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155758m);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MainFrameEnterSessionStruct */
public final class MainFrameEnterSessionStruct extends C61103a {

    /* renamed from: d */
    public long f194261d;

    /* renamed from: e */
    public String f194262e = "";

    /* renamed from: f */
    public long f194263f;

    /* renamed from: g */
    public long f194264g;

    /* renamed from: h */
    public long f194265h;

    /* renamed from: i */
    public long f194266i;

    /* renamed from: j */
    public long f194267j;

    /* renamed from: k */
    public long f194268k;

    /* renamed from: l */
    public long f194269l;

    /* renamed from: m */
    public long f194270m;

    /* renamed from: j */
    public int mo1004j() {
        return 23513;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194261d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194262e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194263f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194264g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194265h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194266i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194267j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194268k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194269l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194270m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194261d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194262e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194263f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194264g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clipStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194265h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rownumAbsolute");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194266i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("unreadCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194267j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsMute");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194268k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194269l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrMainTabTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194270m);
        return stringBuffer.toString();
    }
}

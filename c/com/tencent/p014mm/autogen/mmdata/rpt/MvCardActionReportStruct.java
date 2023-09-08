package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct */
public final class MvCardActionReportStruct extends C61103a {

    /* renamed from: d */
    public String f156512d = "";

    /* renamed from: e */
    public String f156513e = "";

    /* renamed from: f */
    public String f156514f = "";

    /* renamed from: g */
    public String f156515g = "";

    /* renamed from: h */
    public String f156516h = "";

    /* renamed from: i */
    public String f156517i = "";

    /* renamed from: j */
    public long f156518j;

    /* renamed from: k */
    public long f156519k;

    /* renamed from: l */
    public String f156520l = "";

    /* renamed from: m */
    public String f156521m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22243;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156512d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156513e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156514f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156515g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156516h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156517i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156518j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156519k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156520l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156521m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156512d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156513e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156514f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156515g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156516h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156517i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156518j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156519k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromSourceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156520l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156521m);
        return stringBuffer.toString();
    }
}

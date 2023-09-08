package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct */
public final class FavoriteNoteClickReportStruct extends C61103a {

    /* renamed from: d */
    public long f265562d = 0;

    /* renamed from: e */
    public String f265563e = "";

    /* renamed from: f */
    public String f265564f = "";

    /* renamed from: g */
    public int f265565g;

    /* renamed from: j */
    public int mo1004j() {
        return 14547;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265562d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265563e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265564f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265565g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OperationType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265562d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265563e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("noteid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265564f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("picStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265565g);
        return stringBuffer.toString();
    }
}

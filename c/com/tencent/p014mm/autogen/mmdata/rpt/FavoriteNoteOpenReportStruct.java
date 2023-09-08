package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteOpenReportStruct */
public final class FavoriteNoteOpenReportStruct extends C61103a {

    /* renamed from: d */
    public long f265566d = 0;

    /* renamed from: e */
    public String f265567e = "";

    /* renamed from: f */
    public String f265568f = "";

    /* renamed from: g */
    public int f265569g;

    /* renamed from: h */
    public int f265570h;

    /* renamed from: i */
    public int f265571i;

    /* renamed from: j */
    public int mo1004j() {
        return 14789;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265566d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265567e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265568f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265569g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265570h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265571i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OpenNoteFrom");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265566d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265567e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("noteid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265568f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("picStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265569g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("owner");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265570h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("picViewCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265571i);
        return stringBuffer.toString();
    }
}

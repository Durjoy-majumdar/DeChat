package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MusicPlayReportStruct */
public final class MusicPlayReportStruct extends C61103a {

    /* renamed from: d */
    public String f265757d = "";

    /* renamed from: e */
    public String f265758e = "";

    /* renamed from: f */
    public String f265759f = "";

    /* renamed from: g */
    public String f265760g = "";

    /* renamed from: h */
    public String f265761h = "";

    /* renamed from: i */
    public long f265762i;

    /* renamed from: j */
    public String f265763j = "";

    /* renamed from: k */
    public String f265764k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 24576;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265757d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265758e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265759f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265760g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265761h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265762i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265763j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265764k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265757d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265758e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Singer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265759f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WebUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265760g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DataUrl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265761h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Length");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265762i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayTrace");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265763j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265764k);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public MusicPlayReportStruct mo126622s(String str) {
        this.f265763j = mo86045b("PlayTrace", str, true);
        return this;
    }
}

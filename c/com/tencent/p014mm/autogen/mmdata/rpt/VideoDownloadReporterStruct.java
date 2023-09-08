package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VideoDownloadReporterStruct */
public final class VideoDownloadReporterStruct extends C61103a {

    /* renamed from: d */
    public int f266495d;

    /* renamed from: e */
    public int f266496e;

    /* renamed from: f */
    public String f266497f = "";

    /* renamed from: g */
    public long f266498g;

    /* renamed from: h */
    public int f266499h;

    /* renamed from: i */
    public String f266500i = "";

    /* renamed from: j */
    public int f266501j;

    /* renamed from: k */
    public long f266502k;

    /* renamed from: l */
    public long f266503l;

    /* renamed from: j */
    public int mo1004j() {
        return 25022;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266495d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266496e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266497f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266498g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266499h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266500i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266501j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266502k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266503l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266495d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266496e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FildID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266497f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OverwriteMsgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266498g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266499h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266500i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266501j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266502k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266503l);
        return stringBuffer.toString();
    }
}

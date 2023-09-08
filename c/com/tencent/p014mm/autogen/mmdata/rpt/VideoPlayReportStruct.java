package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VideoPlayReportStruct */
public final class VideoPlayReportStruct extends C61103a {

    /* renamed from: d */
    public String f266504d = "";

    /* renamed from: e */
    public long f266505e;

    /* renamed from: f */
    public long f266506f;

    /* renamed from: g */
    public long f266507g;

    /* renamed from: h */
    public String f266508h = "";

    /* renamed from: i */
    public long f266509i;

    /* renamed from: j */
    public String f266510j = "";

    /* renamed from: k */
    public long f266511k;

    /* renamed from: l */
    public long f266512l;

    /* renamed from: m */
    public long f266513m;

    /* renamed from: n */
    public long f266514n;

    /* renamed from: o */
    public long f266515o;

    /* renamed from: j */
    public int mo1004j() {
        return 25000;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266504d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266505e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266506f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266507g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266508h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266509i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266510j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266511k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266512l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266513m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266514n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266515o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FileId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266504d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266505e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompressSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266506f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266507g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266508h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266509i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SenderUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266510j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266511k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginLoadingTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266512l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoPlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266513m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266514n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OverWriteMsgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266515o);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PreloadClientReportStruct */
public final class PreloadClientReportStruct extends C61103a {

    /* renamed from: d */
    public long f265765d;

    /* renamed from: e */
    public long f265766e;

    /* renamed from: f */
    public String f265767f = "";

    /* renamed from: g */
    public String f265768g = "";

    /* renamed from: h */
    public String f265769h = "";

    /* renamed from: i */
    public long f265770i;

    /* renamed from: j */
    public long f265771j;

    /* renamed from: k */
    public long f265772k;

    /* renamed from: l */
    public long f265773l;

    /* renamed from: m */
    public long f265774m;

    /* renamed from: n */
    public long f265775n;

    /* renamed from: j */
    public int mo1004j() {
        return 27004;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265765d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265766e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265767f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265768g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265769h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265770i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265771j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265772k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265773l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265774m);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265775n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265765d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265766e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265767f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265768g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265769h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFirstClkOrExpo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreloadStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265770i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClientPreloadPriority");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265771j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ServerPreloadPriority");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265772k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResourceStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265773l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgCreateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265774m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgReceiveTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265775n);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public PreloadClientReportStruct mo126623s(String str) {
        this.f265767f = mo86045b("ChatName", str, true);
        return this;
    }

    /* renamed from: t */
    public PreloadClientReportStruct mo126624t(String str) {
        this.f265768g = mo86045b("MsgID", str, true);
        return this;
    }
}

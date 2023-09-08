package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveEngineReportStruct */
public final class FinderLiveEngineReportStruct extends C61103a {

    /* renamed from: d */
    public long f155502d;

    /* renamed from: e */
    public long f155503e;

    /* renamed from: f */
    public String f155504f = "";

    /* renamed from: g */
    public long f155505g = 0;

    /* renamed from: h */
    public long f155506h = 0;

    /* renamed from: i */
    public long f155507i = 0;

    /* renamed from: j */
    public long f155508j = 0;

    /* renamed from: k */
    public long f155509k = 0;

    /* renamed from: l */
    public long f155510l = 0;

    /* renamed from: m */
    public long f155511m = 0;

    /* renamed from: n */
    public long f155512n = 0;

    /* renamed from: o */
    public long f155513o = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 24524;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155502d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155503e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155504f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155505g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155506h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155507i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155508j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155509k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155510l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155511m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155512n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155513o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LiveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155502d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SdkLiveId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155503e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155504f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LiveScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155505g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155506h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Wave3AEnable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155507i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Wave3AAllEnable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155508j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Wave3AMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155509k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Trtc3AEnable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155510l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LivePushMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155511m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoCustomRenderEnable");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155512n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoCustomRenderMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155513o);
        return stringBuffer.toString();
    }
}

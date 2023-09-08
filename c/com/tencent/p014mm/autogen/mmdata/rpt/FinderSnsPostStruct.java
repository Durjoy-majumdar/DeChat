package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSnsPostStruct */
public final class FinderSnsPostStruct extends C61103a {

    /* renamed from: d */
    public String f156063d = "";

    /* renamed from: e */
    public long f156064e;

    /* renamed from: f */
    public long f156065f;

    /* renamed from: g */
    public long f156066g;

    /* renamed from: h */
    public String f156067h = "";

    /* renamed from: i */
    public String f156068i = "";

    /* renamed from: j */
    public long f156069j;

    /* renamed from: k */
    public long f156070k;

    /* renamed from: l */
    public String f156071l = "";

    /* renamed from: m */
    public long f156072m;

    /* renamed from: n */
    public long f156073n;

    /* renamed from: o */
    public long f156074o;

    /* renamed from: j */
    public int mo1004j() {
        return 20747;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156063d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156064e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156065f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156066g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156067h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156068i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156069j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156070k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156071l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156072m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156073n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156074o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessinId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156063d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156064e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OperationTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156065f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShootEntranceEndType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156066g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsFeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156067h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderFeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156068i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HaveFinderUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156069j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HavePostFinderVideo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156070k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Wording");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156071l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EntraceExposeMaxTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156072m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EntractExposeTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156073n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156074o);
        return stringBuffer.toString();
    }
}

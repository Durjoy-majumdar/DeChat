package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidCdnCallbackTimeStruct */
public final class AndroidCdnCallbackTimeStruct extends C61103a {

    /* renamed from: d */
    public String f265275d = "";

    /* renamed from: e */
    public int f265276e = 0;

    /* renamed from: f */
    public int f265277f = 0;

    /* renamed from: g */
    public int f265278g = 0;

    /* renamed from: h */
    public int f265279h = 0;

    /* renamed from: i */
    public int f265280i = 0;

    /* renamed from: j */
    public int f265281j = 0;

    /* renamed from: k */
    public int f265282k = 0;

    /* renamed from: l */
    public int f265283l = 0;

    /* renamed from: m */
    public int f265284m = 0;

    /* renamed from: n */
    public int f265285n = 0;

    /* renamed from: o */
    public int f265286o = 0;

    /* renamed from: p */
    public String f265287p = "";

    /* renamed from: q */
    public int f265288q = 0;

    /* renamed from: r */
    public int f265289r = 0;

    /* renamed from: s */
    public long f265290s = 0;

    /* renamed from: t */
    public long f265291t = 0;

    /* renamed from: u */
    public long f265292u = 0;

    /* renamed from: v */
    public long f265293v = 0;

    /* renamed from: w */
    public String f265294w = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20667;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265275d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265276e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265277f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265278g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265279h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265280i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265281j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265282k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265283l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265284m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265285n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265286o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265287p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265288q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265289r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265290s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265291t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265292u);
        stringBuffer.append(",");
        stringBuffer.append(this.f265293v);
        stringBuffer.append(",");
        stringBuffer.append(this.f265294w);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MediaId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265275d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSend");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265276e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalLen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265277f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265278g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265279h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265280i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BzScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265281j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BizType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265282k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Chattype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265283l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Advideoflag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265284m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Largesvideo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265285n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestVideoFormat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265286o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265287p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsImageDownload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265288q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoTaskType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265289r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeCostL");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265290s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNCallbackStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265291t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNCallbackEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265292u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ThreadId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265293v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TaskName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265294w);
        return stringBuffer.toString();
    }
}

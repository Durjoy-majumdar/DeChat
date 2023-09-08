package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFeedLoadingTimeStruct */
public final class FinderFeedLoadingTimeStruct extends C61103a {

    /* renamed from: d */
    public String f48415d = "";

    /* renamed from: e */
    public String f48416e = "";

    /* renamed from: f */
    public long f48417f;

    /* renamed from: g */
    public long f48418g;

    /* renamed from: h */
    public long f48419h;

    /* renamed from: i */
    public long f48420i;

    /* renamed from: j */
    public long f48421j;

    /* renamed from: k */
    public String f48422k = "";

    /* renamed from: l */
    public long f48423l;

    /* renamed from: m */
    public long f48424m;

    /* renamed from: n */
    public long f48425n;

    /* renamed from: j */
    public int mo1004j() {
        return 20672;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48415d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48416e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48417f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48418g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48419h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48420i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48421j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48422k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48423l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48424m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48425n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48415d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48416e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48417f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CgiType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48418g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LoadingTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48419h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartCgiTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48420i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48421j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48422k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48423l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pullType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48424m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndCgiTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48425n);
        return stringBuffer.toString();
    }
}

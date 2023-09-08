package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveLinkMicFinishStruct */
public final class LiveLinkMicFinishStruct extends C61103a {

    /* renamed from: d */
    public String f156385d = "";

    /* renamed from: e */
    public long f156386e;

    /* renamed from: f */
    public String f156387f = "";

    /* renamed from: g */
    public long f156388g;

    /* renamed from: h */
    public long f156389h;

    /* renamed from: i */
    public long f156390i;

    /* renamed from: j */
    public String f156391j = "";

    /* renamed from: k */
    public String f156392k = "";

    /* renamed from: l */
    public long f156393l;

    /* renamed from: m */
    public long f156394m;

    /* renamed from: n */
    public long f156395n;

    /* renamed from: o */
    public long f156396o;

    /* renamed from: j */
    public int mo1004j() {
        return 19895;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156385d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156386e);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f156387f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156388g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156389h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156390i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156391j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156392k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156393l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156394m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156395n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156396o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156385d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156386e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("micid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveuin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156387f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156388g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("closeRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156389h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasVideo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156390i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156391j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("livemicid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156392k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156393l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156394m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartAudienceUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156395n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndAudienceUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156396o);
        return stringBuffer.toString();
    }
}

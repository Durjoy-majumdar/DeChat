package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct */
public final class WeAppQualityCGISpeedStruct extends C61103a {

    /* renamed from: d */
    public String f236761d = "";

    /* renamed from: e */
    public String f236762e = "";

    /* renamed from: f */
    public String f236763f = "";

    /* renamed from: g */
    public long f236764g;

    /* renamed from: h */
    public long f236765h;

    /* renamed from: i */
    public long f236766i;

    /* renamed from: j */
    public String f236767j = "";

    /* renamed from: k */
    public long f236768k;

    /* renamed from: l */
    public int f236769l;

    /* renamed from: m */
    public int f236770m;

    /* renamed from: n */
    public int f236771n;

    /* renamed from: o */
    public long f236772o;

    /* renamed from: p */
    public long f236773p;

    /* renamed from: j */
    public int mo1004j() {
        return 19127;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236761d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236762e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236763f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236764g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236765h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236766i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236767j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236768k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236769l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236770m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236771n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236772o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236773p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("instanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236761d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236762e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236763f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("startTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236764g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("endTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236765h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("costTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236766i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236767j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("responseSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236768k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ret");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236769l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bizRet");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236770m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cgiNo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236771n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WeakNetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236772o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProtocolType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236773p);
        return stringBuffer.toString();
    }
}

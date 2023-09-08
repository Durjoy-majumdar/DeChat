package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RingtoneCallingReportStruct */
public final class RingtoneCallingReportStruct extends C61103a {

    /* renamed from: d */
    public long f310278d;

    /* renamed from: e */
    public int f310279e;

    /* renamed from: f */
    public long f310280f;

    /* renamed from: g */
    public String f310281g = "";

    /* renamed from: h */
    public long f310282h;

    /* renamed from: i */
    public long f310283i;

    /* renamed from: j */
    public String f310284j = "";

    /* renamed from: k */
    public long f310285k;

    /* renamed from: l */
    public long f310286l;

    /* renamed from: j */
    public int mo1004j() {
        return 23653;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310278d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310279e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310280f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310281g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310282h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310283i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310284j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310285k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310286l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310278d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310279e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310280f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310281g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310282h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isIndividual");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310283i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("toUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310284j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("logoClick");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310285k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("playDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310286l);
        return stringBuffer.toString();
    }
}

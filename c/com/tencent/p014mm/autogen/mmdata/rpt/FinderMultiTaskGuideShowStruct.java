package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderMultiTaskGuideShowStruct */
public final class FinderMultiTaskGuideShowStruct extends C61103a {

    /* renamed from: d */
    public long f155736d;

    /* renamed from: e */
    public long f155737e;

    /* renamed from: f */
    public long f155738f;

    /* renamed from: j */
    public int mo1004j() {
        return 23863;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155736d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155737e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155738f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ExpoFrom");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155736d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155737e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155738f);
        return stringBuffer.toString();
    }
}

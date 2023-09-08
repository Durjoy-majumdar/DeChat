package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgConsumingTimeLogStruct */
public final class IntelligentMsgConsumingTimeLogStruct extends C61103a {

    /* renamed from: d */
    public long f156333d;

    /* renamed from: e */
    public long f156334e;

    /* renamed from: f */
    public long f156335f;

    /* renamed from: j */
    public int mo1004j() {
        return 24737;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156333d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156334e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156335f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("imagecount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156333d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("consumingtime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156334e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("model");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156335f);
        return stringBuffer.toString();
    }
}

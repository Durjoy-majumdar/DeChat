package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct */
public final class ForwardToWeWorkStruct extends C61103a {

    /* renamed from: d */
    public long f48510d;

    /* renamed from: e */
    public String f48511e = "";

    /* renamed from: f */
    public long f48512f;

    /* renamed from: g */
    public long f48513g;

    /* renamed from: h */
    public String f48514h = "";

    /* renamed from: i */
    public long f48515i;

    /* renamed from: j */
    public int mo1004j() {
        return 27331;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48510d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48511e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48512f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48513g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48514h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48515i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48510d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48511e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ForwardType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48512f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48513g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgTypes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48514h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BizSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48515i);
        return stringBuffer.toString();
    }
}

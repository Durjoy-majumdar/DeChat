package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderTraceActionStruct */
public final class FinderTraceActionStruct extends C61103a {

    /* renamed from: d */
    public String f156162d = "";

    /* renamed from: e */
    public long f156163e;

    /* renamed from: f */
    public String f156164f = "";

    /* renamed from: g */
    public String f156165g = "";

    /* renamed from: h */
    public long f156166h;

    /* renamed from: j */
    public int mo1004j() {
        return 19433;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156162d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156163e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156164f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156165g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156166h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156162d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156163e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156164f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156165g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156166h);
        return stringBuffer.toString();
    }
}

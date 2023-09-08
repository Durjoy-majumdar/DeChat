package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBacktoTopStruct */
public final class FinderBacktoTopStruct extends C61103a {

    /* renamed from: d */
    public String f155077d = "";

    /* renamed from: e */
    public String f155078e = "";

    /* renamed from: f */
    public String f155079f = "";

    /* renamed from: g */
    public long f155080g;

    /* renamed from: h */
    public long f155081h;

    /* renamed from: i */
    public long f155082i;

    /* renamed from: j */
    public int mo1004j() {
        return 19995;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155077d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155078e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155079f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155080g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155081h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155082i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155077d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155078e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155079f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155080g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155081h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasWording");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155082i);
        return stringBuffer.toString();
    }
}

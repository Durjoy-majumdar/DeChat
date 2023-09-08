package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemPageBrowseStruct */
public final class MultiTaskItemPageBrowseStruct extends C61103a {

    /* renamed from: d */
    public String f343775d = "";

    /* renamed from: e */
    public String f343776e = "";

    /* renamed from: f */
    public long f343777f;

    /* renamed from: g */
    public String f343778g = "";

    /* renamed from: h */
    public long f343779h;

    /* renamed from: j */
    public int mo1004j() {
        return 21947;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343775d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343776e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343777f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343778g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343779h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343775d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343776e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343777f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemSubId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343778g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343779h);
        return stringBuffer.toString();
    }
}

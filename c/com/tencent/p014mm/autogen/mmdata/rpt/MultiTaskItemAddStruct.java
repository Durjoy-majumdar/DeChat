package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemAddStruct */
public final class MultiTaskItemAddStruct extends C61103a {

    /* renamed from: d */
    public String f343769d = "";

    /* renamed from: e */
    public long f343770e;

    /* renamed from: f */
    public long f343771f;

    /* renamed from: g */
    public long f343772g;

    /* renamed from: h */
    public String f343773h = "";

    /* renamed from: i */
    public String f343774i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21935;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343769d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343770e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343771f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343772g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343773h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343774i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343769d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343770e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343771f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343772g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343773h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemSubId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343774i);
        return stringBuffer.toString();
    }
}

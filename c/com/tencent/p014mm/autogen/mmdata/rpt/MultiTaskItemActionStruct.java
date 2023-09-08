package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemActionStruct */
public final class MultiTaskItemActionStruct extends C61103a {

    /* renamed from: d */
    public String f343760d = "";

    /* renamed from: e */
    public long f343761e;

    /* renamed from: f */
    public String f343762f = "";

    /* renamed from: g */
    public long f343763g;

    /* renamed from: h */
    public long f343764h;

    /* renamed from: i */
    public long f343765i;

    /* renamed from: j */
    public String f343766j = "";

    /* renamed from: k */
    public long f343767k;

    /* renamed from: l */
    public long f343768l;

    /* renamed from: j */
    public int mo1004j() {
        return 21922;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343760d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343761e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343762f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343763g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343764h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343765i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343766j);
        stringBuffer.append(",");
        stringBuffer.append(this.f343767k);
        stringBuffer.append(",");
        stringBuffer.append(this.f343768l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343760d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343761e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343762f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Position");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343763g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposeTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343764h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343765i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemSubId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343766j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActualExposeTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343767k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343768l);
        return stringBuffer.toString();
    }
}

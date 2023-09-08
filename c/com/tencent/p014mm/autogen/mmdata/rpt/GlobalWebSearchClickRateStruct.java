package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GlobalWebSearchClickRateStruct */
public final class GlobalWebSearchClickRateStruct extends C61103a {

    /* renamed from: d */
    public String f48516d = "";

    /* renamed from: e */
    public long f48517e = 0;

    /* renamed from: f */
    public long f48518f = 0;

    /* renamed from: g */
    public long f48519g = 0;

    /* renamed from: h */
    public long f48520h = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 12639;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48516d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48517e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48518f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48519g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48520h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Query");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48516d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasWebSearchEntryShown");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48517e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48518f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Style");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48519g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48520h);
        return stringBuffer.toString();
    }
}

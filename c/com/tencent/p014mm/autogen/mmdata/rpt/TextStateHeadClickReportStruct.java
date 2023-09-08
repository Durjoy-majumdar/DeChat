package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStateHeadClickReportStruct */
public final class TextStateHeadClickReportStruct extends C61103a {

    /* renamed from: d */
    public String f108009d = "";

    /* renamed from: e */
    public long f108010e;

    /* renamed from: f */
    public long f108011f;

    /* renamed from: g */
    public long f108012g;

    /* renamed from: h */
    public long f108013h;

    /* renamed from: i */
    public String f108014i = "";

    /* renamed from: j */
    public String f108015j = "";

    /* renamed from: k */
    public String f108016k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22210;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f108009d);
        stringBuffer.append(",");
        stringBuffer.append(this.f108010e);
        stringBuffer.append(",");
        stringBuffer.append(this.f108011f);
        stringBuffer.append(",");
        stringBuffer.append(this.f108012g);
        stringBuffer.append(",");
        stringBuffer.append(this.f108013h);
        stringBuffer.append(",");
        stringBuffer.append(this.f108014i);
        stringBuffer.append(",");
        stringBuffer.append(this.f108015j);
        stringBuffer.append(",");
        stringBuffer.append(this.f108016k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108009d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108010e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasTextStatusIcon");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108011f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108012g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108013h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneExtInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108014i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108015j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToStatusIconID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f108016k);
        return stringBuffer.toString();
    }
}

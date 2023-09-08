package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XFileOtherAppActionStruct */
public final class XFileOtherAppActionStruct extends C61103a {

    /* renamed from: d */
    public long f48680d;

    /* renamed from: e */
    public long f48681e;

    /* renamed from: f */
    public String f48682f = "";

    /* renamed from: g */
    public String f48683g = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27653;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48680d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48681e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48682f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48683g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48680d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48681e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OtherInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48682f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileFormat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48683g);
        return stringBuffer.toString();
    }
}

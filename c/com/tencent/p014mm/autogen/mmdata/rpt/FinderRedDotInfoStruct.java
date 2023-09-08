package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRedDotInfoStruct */
public final class FinderRedDotInfoStruct extends C61103a {

    /* renamed from: d */
    public String f48468d = "";

    /* renamed from: e */
    public int f48469e;

    /* renamed from: f */
    public int f48470f;

    /* renamed from: g */
    public String f48471g = "";

    /* renamed from: h */
    public int f48472h;

    /* renamed from: i */
    public String f48473i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48468d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48469e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48470f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48471g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48472h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48473i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48468d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderSyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48469e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48470f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48471g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShowType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48472h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Url");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48473i);
        return stringBuffer.toString();
    }
}

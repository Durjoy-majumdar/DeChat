package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.view_id_identifyStruct */
public final class view_id_identifyStruct extends C61103a {

    /* renamed from: d */
    public String f48695d = "";

    /* renamed from: e */
    public String f48696e = "";

    /* renamed from: f */
    public String f48697f = "";

    /* renamed from: g */
    public int f48698g = -1;

    /* renamed from: h */
    public long f48699h = 0;

    /* renamed from: i */
    public String f48700i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19316;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48695d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48696e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48697f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48698g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48699h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48700i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ViewId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48695d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48696e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LayoutId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48697f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OpEvent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48698g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("timeConsuming");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48699h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("resName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48700i);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderUserFlowActionStruct */
public final class FinderUserFlowActionStruct extends C61103a {

    /* renamed from: d */
    public String f9914d = "";

    /* renamed from: e */
    public String f9915e = "";

    /* renamed from: f */
    public String f9916f = "";

    /* renamed from: g */
    public String f9917g = "";

    /* renamed from: h */
    public String f9918h = "";

    /* renamed from: i */
    public String f9919i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23462;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9914d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9915e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9916f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9917g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9918h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9919i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("biz_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9914d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("flow_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9915e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9916f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9917g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderuin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9918h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9919i);
        return stringBuffer.toString();
    }
}

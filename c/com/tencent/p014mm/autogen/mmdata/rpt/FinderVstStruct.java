package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderVstStruct */
public final class FinderVstStruct extends C61103a {

    /* renamed from: d */
    public String f156256d = "";

    /* renamed from: e */
    public String f156257e = "";

    /* renamed from: f */
    public String f156258f = "";

    /* renamed from: g */
    public long f156259g;

    /* renamed from: h */
    public String f156260h = "";

    /* renamed from: i */
    public long f156261i;

    /* renamed from: j */
    public String f156262j = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23898;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156256d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156257e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156258f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156259g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156260h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156261i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156262j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156256d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156257e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156258f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156259g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("vst_type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156260h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("duration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156261i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156262j);
        return stringBuffer.toString();
    }
}

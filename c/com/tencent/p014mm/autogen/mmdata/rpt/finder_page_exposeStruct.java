package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.finder_page_exposeStruct */
public final class finder_page_exposeStruct extends C61103a {

    /* renamed from: d */
    public String f156965d = "";

    /* renamed from: e */
    public String f156966e = "";

    /* renamed from: f */
    public String f156967f = "";

    /* renamed from: g */
    public int f156968g;

    /* renamed from: h */
    public String f156969h = "";

    /* renamed from: i */
    public String f156970i = "";

    /* renamed from: j */
    public String f156971j = "";

    /* renamed from: k */
    public String f156972k = "";

    /* renamed from: l */
    public String f156973l = "";

    /* renamed from: m */
    public long f156974m;

    /* renamed from: j */
    public int mo1004j() {
        return 21874;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156965d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156966e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156967f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156968g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156969h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156970i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156971j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156972k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156973l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156974m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156965d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("findercontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156966e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156967f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_code");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156968g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156969h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156970i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156971j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156972k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ref_commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156973l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156974m);
        return stringBuffer.toString();
    }
}

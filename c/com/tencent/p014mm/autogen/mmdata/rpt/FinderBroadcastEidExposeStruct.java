package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct */
public final class FinderBroadcastEidExposeStruct extends C61103a {

    /* renamed from: d */
    public long f9740d;

    /* renamed from: e */
    public String f9741e = "";

    /* renamed from: f */
    public String f9742f = "";

    /* renamed from: g */
    public String f9743g = "";

    /* renamed from: h */
    public String f9744h = "";

    /* renamed from: i */
    public String f9745i = "";

    /* renamed from: j */
    public String f9746j = "";

    /* renamed from: k */
    public String f9747k = "";

    /* renamed from: l */
    public String f9748l = "";

    /* renamed from: m */
    public String f9749m = "";

    /* renamed from: n */
    public String f9750n = "";

    /* renamed from: o */
    public String f9751o = "";

    /* renamed from: p */
    public String f9752p = "";

    /* renamed from: q */
    public String f9753q = "";

    /* renamed from: r */
    public String f9754r = "";

    /* renamed from: s */
    public String f9755s = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23057;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9740d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9741e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9742f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9743g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9744h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9745i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9746j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9747k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9748l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9749m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9750n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9751o);
        stringBuffer.append(",");
        stringBuffer.append(this.f9752p);
        stringBuffer.append(",");
        stringBuffer.append(this.f9753q);
        stringBuffer.append(",");
        stringBuffer.append(this.f9754r);
        stringBuffer.append(",");
        stringBuffer.append(this.f9755s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("client_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9740d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9741e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chnl_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9742f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9743g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sub_tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9744h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9745i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9746j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9747k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9748l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubTabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9749m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pg_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9750n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ref_commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9751o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9752p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eld_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9753q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switch_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9754r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_buffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9755s);
        return stringBuffer.toString();
    }
}

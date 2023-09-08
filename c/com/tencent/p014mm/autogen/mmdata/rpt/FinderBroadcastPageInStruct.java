package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct */
public final class FinderBroadcastPageInStruct extends C61103a {

    /* renamed from: d */
    public long f9756d;

    /* renamed from: e */
    public String f9757e = "";

    /* renamed from: f */
    public String f9758f = "";

    /* renamed from: g */
    public String f9759g = "";

    /* renamed from: h */
    public String f9760h = "";

    /* renamed from: i */
    public String f9761i = "";

    /* renamed from: j */
    public String f9762j = "";

    /* renamed from: k */
    public String f9763k = "";

    /* renamed from: l */
    public String f9764l = "";

    /* renamed from: m */
    public String f9765m = "";

    /* renamed from: n */
    public String f9766n = "";

    /* renamed from: o */
    public String f9767o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22946;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9756d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9757e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9758f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9759g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9760h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9761i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9762j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9763k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9764l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9765m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9766n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9767o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("client_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9756d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pag_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9757e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9758f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sub_tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9759g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9760h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9761i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9762j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubTabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9763k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pg_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9764l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ref_page_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9765m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9766n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switch_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9767o);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderBroadcastPageInStruct mo1020s(String str) {
        this.f9766n = mo86045b("commentscene", str, true);
        return this;
    }

    /* renamed from: t */
    public FinderBroadcastPageInStruct mo1021t(String str) {
        this.f9761i = mo86045b("contextid", str, true);
        return this;
    }

    /* renamed from: u */
    public FinderBroadcastPageInStruct mo1022u(String str) {
        this.f9757e = mo86045b("pag_id", str, true);
        return this;
    }

    /* renamed from: v */
    public FinderBroadcastPageInStruct mo1023v(String str) {
        this.f9764l = mo86045b("pg_udf_kv", str, true);
        return this;
    }
}

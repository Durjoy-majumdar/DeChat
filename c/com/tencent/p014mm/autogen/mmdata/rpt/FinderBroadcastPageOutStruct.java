package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct */
public final class FinderBroadcastPageOutStruct extends C61103a {

    /* renamed from: d */
    public long f9768d;

    /* renamed from: e */
    public String f9769e = "";

    /* renamed from: f */
    public String f9770f = "";

    /* renamed from: g */
    public String f9771g = "";

    /* renamed from: h */
    public String f9772h = "";

    /* renamed from: i */
    public String f9773i = "";

    /* renamed from: j */
    public String f9774j = "";

    /* renamed from: k */
    public String f9775k = "";

    /* renamed from: l */
    public String f9776l = "";

    /* renamed from: m */
    public String f9777m = "";

    /* renamed from: n */
    public String f9778n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22947;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9768d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9769e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9770f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9771g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9772h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9773i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9774j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9775k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9776l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9777m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9778n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("client_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9768d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pag_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9769e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9770f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sub_tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9771g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9772h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9773i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9774j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubTabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9775k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pg_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9776l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9777m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switch_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9778n);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderBroadcastPageOutStruct mo1024s(String str) {
        this.f9777m = mo86045b("commentscene", str, true);
        return this;
    }

    /* renamed from: t */
    public FinderBroadcastPageOutStruct mo1025t(String str) {
        this.f9773i = mo86045b("contextid", str, true);
        return this;
    }

    /* renamed from: u */
    public FinderBroadcastPageOutStruct mo1026u(String str) {
        this.f9769e = mo86045b("pag_id", str, true);
        return this;
    }

    /* renamed from: v */
    public FinderBroadcastPageOutStruct mo1027v(String str) {
        this.f9776l = mo86045b("pg_udf_kv", str, true);
        return this;
    }
}

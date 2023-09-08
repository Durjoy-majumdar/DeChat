package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct */
public final class FinderBroadcastEidClickStruct extends C61103a {

    /* renamed from: d */
    public long f9725d;

    /* renamed from: e */
    public String f9726e = "";

    /* renamed from: f */
    public String f9727f = "";

    /* renamed from: g */
    public String f9728g = "";

    /* renamed from: h */
    public String f9729h = "";

    /* renamed from: i */
    public String f9730i = "";

    /* renamed from: j */
    public String f9731j = "";

    /* renamed from: k */
    public String f9732k = "";

    /* renamed from: l */
    public String f9733l = "";

    /* renamed from: m */
    public String f9734m = "";

    /* renamed from: n */
    public String f9735n = "";

    /* renamed from: o */
    public String f9736o = "";

    /* renamed from: p */
    public String f9737p = "";

    /* renamed from: q */
    public String f9738q = "";

    /* renamed from: r */
    public String f9739r = "";

    /* renamed from: A */
    public FinderBroadcastEidClickStruct mo1007A(String str) {
        this.f9734m = mo86045b("SubTabContextID", str, true);
        return this;
    }

    /* renamed from: B */
    public FinderBroadcastEidClickStruct mo1008B(String str) {
        this.f9729h = mo86045b("sub_tab_id", str, true);
        return this;
    }

    /* renamed from: C */
    public FinderBroadcastEidClickStruct mo1009C(String str) {
        this.f9738q = mo86045b("switch_extra", str, true);
        return this;
    }

    /* renamed from: D */
    public FinderBroadcastEidClickStruct mo1010D(String str) {
        this.f9733l = mo86045b("TabContextID", str, true);
        return this;
    }

    /* renamed from: E */
    public FinderBroadcastEidClickStruct mo1011E(String str) {
        this.f9728g = mo86045b("tab_id", str, true);
        return this;
    }

    /* renamed from: j */
    public int mo1004j() {
        return 23059;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9725d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9726e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9727f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9728g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9729h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9730i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9731j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9732k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9733l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9734m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9735n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9736o);
        stringBuffer.append(",");
        stringBuffer.append(this.f9737p);
        stringBuffer.append(",");
        stringBuffer.append(this.f9738q);
        stringBuffer.append(",");
        stringBuffer.append(this.f9739r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("client_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9725d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9726e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chnl_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9727f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9728g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sub_tab_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9729h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9730i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9731j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9732k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9733l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubTabContextID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9734m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pg_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9735n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9736o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eld_udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9737p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("switch_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9738q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_buffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9739r);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderBroadcastEidClickStruct mo1012s(String str) {
        this.f9727f = mo86045b("chnl_extra", str, true);
        return this;
    }

    /* renamed from: t */
    public FinderBroadcastEidClickStruct mo1013t(String str) {
        this.f9732k = mo86045b("commentscene", str, true);
        return this;
    }

    /* renamed from: u */
    public FinderBroadcastEidClickStruct mo1014u(String str) {
        this.f9731j = mo86045b("contextid", str, true);
        return this;
    }

    /* renamed from: v */
    public FinderBroadcastEidClickStruct mo1015v(String str) {
        this.f9736o = mo86045b("eid", str, true);
        return this;
    }

    /* renamed from: w */
    public FinderBroadcastEidClickStruct mo1016w(String str) {
        this.f9737p = mo86045b("eld_udf_kv", str, true);
        return this;
    }

    /* renamed from: x */
    public FinderBroadcastEidClickStruct mo1017x(String str) {
        this.f9726e = mo86045b("finderusername", str, true);
        return this;
    }

    /* renamed from: y */
    public FinderBroadcastEidClickStruct mo1018y(String str) {
        this.f9735n = mo86045b("pg_udf_kv", str, true);
        return this;
    }

    /* renamed from: z */
    public FinderBroadcastEidClickStruct mo1019z(String str) {
        this.f9730i = mo86045b("sessionid", str, true);
        return this;
    }
}

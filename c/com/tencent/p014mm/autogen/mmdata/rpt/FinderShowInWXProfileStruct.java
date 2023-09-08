package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct */
public final class FinderShowInWXProfileStruct extends C61103a {

    /* renamed from: d */
    public String f9899d = "";

    /* renamed from: e */
    public String f9900e = "";

    /* renamed from: f */
    public String f9901f = "";

    /* renamed from: g */
    public int f9902g;

    /* renamed from: h */
    public String f9903h = "";

    /* renamed from: i */
    public String f9904i = "";

    /* renamed from: j */
    public String f9905j = "";

    /* renamed from: k */
    public String f9906k = "";

    /* renamed from: l */
    public String f9907l = "";

    /* renamed from: m */
    public String f9908m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21875;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9899d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9900e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9901f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9902g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9903h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9904i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9905j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9906k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9907l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9908m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9899d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("findercontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9900e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9901f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_code");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9902g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9903h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9904i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9905j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9906k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ref_commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9907l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("jump_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9908m);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderShowInWXProfileStruct mo1037s(String str) {
        this.f9901f = mo86045b("commentscene", str, true);
        return this;
    }

    /* renamed from: t */
    public FinderShowInWXProfileStruct mo1038t(String str) {
        this.f9904i = mo86045b("eid", str, true);
        return this;
    }

    /* renamed from: u */
    public FinderShowInWXProfileStruct mo1039u(String str) {
        this.f9903h = mo86045b("event_time", str, true);
        return this;
    }

    /* renamed from: v */
    public FinderShowInWXProfileStruct mo1040v(String str) {
        this.f9900e = mo86045b("findercontextid", str, true);
        return this;
    }

    /* renamed from: w */
    public FinderShowInWXProfileStruct mo1041w(String str) {
        this.f9899d = mo86045b("sessionid", str, true);
        return this;
    }

    /* renamed from: x */
    public FinderShowInWXProfileStruct mo1042x(String str) {
        this.f9905j = mo86045b("udf_kv", str, true);
        return this;
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MentionedFeedFilterStruct */
public final class MentionedFeedFilterStruct extends C61103a {

    /* renamed from: d */
    public String f156501d = "";

    /* renamed from: e */
    public String f156502e = "";

    /* renamed from: f */
    public int f156503f;

    /* renamed from: g */
    public String f156504g = "";

    /* renamed from: h */
    public String f156505h = "";

    /* renamed from: i */
    public String f156506i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22657;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156501d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156502e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156503f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156504g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156505h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156506i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156501d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("findercontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156502e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_code");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156503f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("event_time");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156504g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("eid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156505h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156506i);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSettingExposeStruct */
public final class FinderSettingExposeStruct extends C61103a {

    /* renamed from: d */
    public long f156057d = 0;

    /* renamed from: e */
    public long f156058e = 0;

    /* renamed from: f */
    public long f156059f = 0;

    /* renamed from: g */
    public long f156060g = 0;

    /* renamed from: h */
    public long f156061h = 0;

    /* renamed from: i */
    public String f156062i = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20673;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156057d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156058e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156059f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156060g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156061h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156062i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156057d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156058e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasReddot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156059f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156060g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("region");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156061h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156062i);
        return stringBuffer.toString();
    }
}

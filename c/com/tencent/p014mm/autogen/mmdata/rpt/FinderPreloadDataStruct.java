package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPreloadDataStruct */
public final class FinderPreloadDataStruct extends C61103a {

    /* renamed from: d */
    public String f155890d = "";

    /* renamed from: e */
    public String f155891e = "";

    /* renamed from: f */
    public int f155892f;

    /* renamed from: g */
    public int f155893g;

    /* renamed from: h */
    public String f155894h = "";

    /* renamed from: i */
    public long f155895i;

    /* renamed from: j */
    public int f155896j;

    /* renamed from: k */
    public String f155897k = "";

    /* renamed from: l */
    public long f155898l;

    /* renamed from: m */
    public String f155899m = "";

    /* renamed from: n */
    public long f155900n;

    /* renamed from: j */
    public int mo1004j() {
        return 24123;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155890d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155891e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155892f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155893g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155894h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155895i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155896j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155897k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155898l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155899m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155900n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("opType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155890d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreloadSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155891e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155892f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("pullType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155893g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("entranceRedDotObjectId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155894h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("entranceRedDotScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155895i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("entranceRedDotPreloadFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155896j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("serverConfig");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155897k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("refreshPrefetchStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155898l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clearCacheSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155899m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("innerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155900n);
        return stringBuffer.toString();
    }
}

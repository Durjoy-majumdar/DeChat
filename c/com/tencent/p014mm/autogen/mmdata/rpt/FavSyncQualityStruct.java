package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavSyncQualityStruct */
public final class FavSyncQualityStruct extends C61103a {

    /* renamed from: d */
    public int f265540d = 0;

    /* renamed from: e */
    public String f265541e = "";

    /* renamed from: f */
    public int f265542f = 0;

    /* renamed from: g */
    public int f265543g = 0;

    /* renamed from: h */
    public int f265544h = 0;

    /* renamed from: i */
    public int f265545i = 0;

    /* renamed from: j */
    public long f265546j = 0;

    /* renamed from: k */
    public int f265547k = 0;

    /* renamed from: l */
    public int f265548l = 0;

    /* renamed from: m */
    public int f265549m = 0;

    /* renamed from: n */
    public int f265550n = 0;

    /* renamed from: o */
    public String f265551o = "";

    /* renamed from: p */
    public int f265552p = 0;

    /* renamed from: q */
    public long f265553q = 0;

    /* renamed from: r */
    public int f265554r = 0;

    /* renamed from: s */
    public int f265555s = 0;

    /* renamed from: t */
    public int f265556t = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 28269;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265540d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265541e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265542f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265543g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265544h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265545i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265546j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265547k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265548l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265549m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265550n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265551o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265552p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265553q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265554r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265555s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265556t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SyncScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265540d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265541e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265542f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncErrorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265543g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265544h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncItemCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncTimeOver");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265545i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SyncTimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265546j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265547k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetErrorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265548l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265549m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetXmllegal");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265550n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetIllegalXmlContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265551o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetTimeOver");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265552p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetTimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265553q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnInitCycleCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265554r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnFinishCycleCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265555s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BatchGetIllegalXmlCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265556t);
        return stringBuffer.toString();
    }
}

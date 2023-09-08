package com.tencent.p014mm.autogen.mmdata.rpt;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSearchActionReportStruct */
public final class FinderSearchActionReportStruct extends C61103a {

    /* renamed from: d */
    public String f156014d = "";

    /* renamed from: e */
    public String f156015e = "";

    /* renamed from: f */
    public long f156016f;

    /* renamed from: g */
    public String f156017g = "";

    /* renamed from: h */
    public String f156018h = "";

    /* renamed from: i */
    public String f156019i = "";

    /* renamed from: j */
    public long f156020j;

    /* renamed from: k */
    public long f156021k;

    /* renamed from: l */
    public long f156022l;

    /* renamed from: m */
    public long f156023m;

    /* renamed from: n */
    public long f156024n;

    /* renamed from: o */
    public long f156025o;

    /* renamed from: j */
    public int mo1004j() {
        return 21690;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156014d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156015e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156016f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156017g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156018h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156019i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156020j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156021k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156022l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156023m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156024n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156025o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156014d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156015e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("myAccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156016f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156017g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("requestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156018h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SearchIntents.EXTRA_QUERY);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156019i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156020j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156021k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156022l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchResultType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156023m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isAccountEmpty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156024n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFeedEmpty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156025o);
        return stringBuffer.toString();
    }
}

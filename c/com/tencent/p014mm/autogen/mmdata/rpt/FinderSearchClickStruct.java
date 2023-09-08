package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSearchClickStruct */
public final class FinderSearchClickStruct extends C61103a {

    /* renamed from: d */
    public String f156026d = "";

    /* renamed from: e */
    public String f156027e = "";

    /* renamed from: f */
    public int f156028f;

    /* renamed from: g */
    public int f156029g;

    /* renamed from: h */
    public String f156030h = "";

    /* renamed from: i */
    public int f156031i;

    /* renamed from: j */
    public int f156032j;

    /* renamed from: k */
    public int f156033k;

    /* renamed from: l */
    public String f156034l = "";

    /* renamed from: m */
    public String f156035m = "";

    /* renamed from: n */
    public int f156036n;

    /* renamed from: o */
    public String f156037o = "";

    /* renamed from: p */
    public int f156038p;

    /* renamed from: q */
    public int f156039q;

    /* renamed from: j */
    public int mo1004j() {
        return 18690;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156026d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156027e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156028f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156029g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156030h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156031i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156032j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156033k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156034l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156035m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156036n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156037o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156038p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156039q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156026d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Query");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156027e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156028f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156029g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156030h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Position");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156031i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156032j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("myAccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156033k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156034l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clicktabcontextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156035m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156036n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156037o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156038p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156039q);
        return stringBuffer.toString();
    }
}

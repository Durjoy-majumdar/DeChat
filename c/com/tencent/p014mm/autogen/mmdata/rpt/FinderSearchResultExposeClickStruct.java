package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderSearchResultExposeClickStruct */
public final class FinderSearchResultExposeClickStruct extends C61103a {

    /* renamed from: d */
    public String f156040d = "";

    /* renamed from: e */
    public String f156041e = "";

    /* renamed from: f */
    public int f156042f;

    /* renamed from: g */
    public int f156043g;

    /* renamed from: h */
    public String f156044h = "";

    /* renamed from: i */
    public int f156045i;

    /* renamed from: j */
    public int f156046j;

    /* renamed from: k */
    public int f156047k;

    /* renamed from: l */
    public String f156048l = "";

    /* renamed from: m */
    public String f156049m = "";

    /* renamed from: n */
    public int f156050n;

    /* renamed from: o */
    public String f156051o = "";

    /* renamed from: p */
    public int f156052p;

    /* renamed from: q */
    public int f156053q;

    /* renamed from: r */
    public String f156054r = "";

    /* renamed from: s */
    public String f156055s = "";

    /* renamed from: t */
    public int f156056t;

    /* renamed from: j */
    public int mo1004j() {
        return 22178;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156040d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156041e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156042f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156043g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156044h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156045i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156046j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156047k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156048l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156049m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156050n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156051o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156052p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156053q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156054r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156055s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156056t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156040d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Query");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156041e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156042f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156043g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156044h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ItemPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156045i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156046j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156047k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156048l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClicktabcontextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156049m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156050n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156051o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156052p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156053q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("udf_kv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156054r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hotWordId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156055s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("itemtab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156056t);
        return stringBuffer.toString();
    }
}

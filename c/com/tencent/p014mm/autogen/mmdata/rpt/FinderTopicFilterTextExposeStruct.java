package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderTopicFilterTextExposeStruct */
public final class FinderTopicFilterTextExposeStruct extends C61103a {

    /* renamed from: d */
    public long f156152d;

    /* renamed from: e */
    public String f156153e = "";

    /* renamed from: f */
    public String f156154f = "";

    /* renamed from: g */
    public String f156155g = "";

    /* renamed from: h */
    public String f156156h = "";

    /* renamed from: i */
    public String f156157i = "";

    /* renamed from: j */
    public long f156158j;

    /* renamed from: k */
    public long f156159k;

    /* renamed from: l */
    public long f156160l;

    /* renamed from: m */
    public long f156161m;

    /* renamed from: j */
    public int mo1004j() {
        return 19996;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156152d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156153e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156154f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156155g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156156h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156157i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156158j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156159k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156160l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156161m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156152d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156153e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156154f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClickTabContextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156155g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PoiText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156156h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FilterTextItems");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156157i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsUnflodtab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156158j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsUnflodopen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156159k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FliterPageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156160l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156161m);
        return stringBuffer.toString();
    }
}

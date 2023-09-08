package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct */
public final class IntelligentMsgActionLogStruct extends C61103a {

    /* renamed from: d */
    public String f156313d = "";

    /* renamed from: e */
    public String f156314e = "";

    /* renamed from: f */
    public long f156315f;

    /* renamed from: g */
    public long f156316g;

    /* renamed from: h */
    public String f156317h = "";

    /* renamed from: i */
    public String f156318i = "";

    /* renamed from: j */
    public String f156319j = "";

    /* renamed from: k */
    public String f156320k = "";

    /* renamed from: l */
    public long f156321l;

    /* renamed from: m */
    public long f156322m;

    /* renamed from: n */
    public long f156323n;

    /* renamed from: o */
    public long f156324o;

    /* renamed from: p */
    public long f156325p;

    /* renamed from: q */
    public long f156326q;

    /* renamed from: r */
    public long f156327r;

    /* renamed from: s */
    public String f156328s = "";

    /* renamed from: t */
    public long f156329t;

    /* renamed from: u */
    public long f156330u;

    /* renamed from: v */
    public long f156331v;

    /* renamed from: w */
    public long f156332w;

    /* renamed from: j */
    public int mo1004j() {
        return 24736;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156313d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156314e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156315f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156316g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156317h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156318i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156319j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156320k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156321l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156322m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156323n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156324o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156325p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156326q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156327r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156328s);
        stringBuffer.append(",");
        stringBuffer.append(this.f156329t);
        stringBuffer.append(",");
        stringBuffer.append(this.f156330u);
        stringBuffer.append(",");
        stringBuffer.append(this.f156331v);
        stringBuffer.append(",");
        stringBuffer.append(this.f156332w);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156313d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("searchsessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156314e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156315f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156316g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PrintQuery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156317h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchQuery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156318i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExpoQuery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156319j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Keyword");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156320k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156321l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156322m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PeopleCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156323n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImageSendTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156324o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Tab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156325p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156326q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfImageDone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156327r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156328s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AllImageCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156329t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MatchLogic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156330u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IfAlllmageDone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156331v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ifPopups");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156332w);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public IntelligentMsgActionLogStruct mo76269s(String str) {
        this.f156318i = mo86045b("SearchQuery", str, true);
        return this;
    }
}

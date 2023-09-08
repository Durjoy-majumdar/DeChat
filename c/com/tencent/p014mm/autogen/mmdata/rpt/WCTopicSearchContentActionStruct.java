package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchContentActionStruct */
public final class WCTopicSearchContentActionStruct extends C61103a {

    /* renamed from: d */
    public long f10095d = 0;

    /* renamed from: e */
    public long f10096e = 0;

    /* renamed from: f */
    public long f10097f = 0;

    /* renamed from: g */
    public String f10098g = "";

    /* renamed from: h */
    public long f10099h = 0;

    /* renamed from: i */
    public String f10100i = "";

    /* renamed from: j */
    public long f10101j;

    /* renamed from: k */
    public long f10102k;

    /* renamed from: l */
    public String f10103l = "";

    /* renamed from: m */
    public int f10104m = -1;

    /* renamed from: n */
    public int f10105n = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 20998;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f10095d);
        stringBuffer.append(",");
        stringBuffer.append(this.f10096e);
        stringBuffer.append(",");
        stringBuffer.append(this.f10097f);
        stringBuffer.append(",");
        stringBuffer.append(this.f10098g);
        stringBuffer.append(",");
        stringBuffer.append(this.f10099h);
        stringBuffer.append(",");
        stringBuffer.append(this.f10100i);
        stringBuffer.append(",");
        stringBuffer.append(this.f10101j);
        stringBuffer.append(",");
        stringBuffer.append(this.f10102k);
        stringBuffer.append(",");
        stringBuffer.append(this.f10103l);
        stringBuffer.append(",");
        stringBuffer.append(this.f10104m);
        stringBuffer.append(",");
        stringBuffer.append(this.f10105n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10095d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10096e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResultType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10097f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResultQuery");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10098g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10099h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareSceneId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10100i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CreateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10101j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimelineEnterSource");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10102k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SearchSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10103l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PageType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10104m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f10105n);
        return stringBuffer.toString();
    }
}

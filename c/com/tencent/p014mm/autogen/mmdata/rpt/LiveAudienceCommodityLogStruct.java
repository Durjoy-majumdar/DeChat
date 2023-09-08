package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct */
public final class LiveAudienceCommodityLogStruct extends C61103a {

    /* renamed from: d */
    public String f156354d = "";

    /* renamed from: e */
    public String f156355e = "";

    /* renamed from: f */
    public String f156356f = "";

    /* renamed from: g */
    public String f156357g = "";

    /* renamed from: h */
    public String f156358h = "";

    /* renamed from: i */
    public String f156359i = "";

    /* renamed from: j */
    public String f156360j = "";

    /* renamed from: k */
    public int f156361k;

    /* renamed from: l */
    public String f156362l = "";

    /* renamed from: m */
    public String f156363m = "";

    /* renamed from: n */
    public String f156364n = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23782;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156354d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156355e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156356f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156357g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156358h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156359i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156360j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156361k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156362l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156363m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156364n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LiveID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156354d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156355e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156356f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156357g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156358h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContextId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156359i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156360j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterIconType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156361k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chnl_extra");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156362l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Event");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156363m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Params");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156364n);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public LiveAudienceCommodityLogStruct mo76270s(String str) {
        this.f156363m = mo86045b("Event", str, true);
        return this;
    }

    /* renamed from: t */
    public LiveAudienceCommodityLogStruct mo76271t(String str) {
        this.f156364n = mo86045b("Params", str, true);
        return this;
    }
}

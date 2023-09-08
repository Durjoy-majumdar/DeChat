package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct */
public final class SnsTimelineWeiShangeFoldExposeStruct extends C61103a {

    /* renamed from: d */
    public String f266178d = "";

    /* renamed from: e */
    public String f266179e = "";

    /* renamed from: f */
    public String f266180f = "";

    /* renamed from: g */
    public long f266181g;

    /* renamed from: h */
    public int f266182h;

    /* renamed from: i */
    public int f266183i;

    /* renamed from: j */
    public long f266184j;

    /* renamed from: k */
    public long f266185k;

    /* renamed from: j */
    public int mo1004j() {
        return 21340;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266178d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266179e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266180f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266181g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266182h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266183i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266184j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266185k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266178d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FoldedBlockId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266179e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266180f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266181g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsExploded");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266182h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsClicked");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266183i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimelineBrowseFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266184j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocationIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266185k);
        return stringBuffer.toString();
    }
}

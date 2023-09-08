package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldBrowseStruct */
public final class SnsTimelineWeiShangeFoldBrowseStruct extends C61103a {

    /* renamed from: d */
    public String f266168d = "";

    /* renamed from: e */
    public String f266169e = "";

    /* renamed from: f */
    public String f266170f = "";

    /* renamed from: g */
    public long f266171g;

    /* renamed from: h */
    public long f266172h;

    /* renamed from: i */
    public String f266173i = "";

    /* renamed from: j */
    public String f266174j = "";

    /* renamed from: k */
    public long f266175k;

    /* renamed from: l */
    public long f266176l;

    /* renamed from: m */
    public long f266177m;

    /* renamed from: j */
    public int mo1004j() {
        return 21341;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266168d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266169e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266170f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266171g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266172h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266173i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266174j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266175k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266176l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266177m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266168d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FoldedBlockId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266169e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266170f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266171g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266172h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266173i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseFeedList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266174j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BrowseTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266175k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnfoldClickFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266176l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnfoldConfirmFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266177m);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnExposureStruct */
public final class TimelineMissReadJumpBtnExposureStruct extends C61103a {

    /* renamed from: d */
    public String f266411d = "";

    /* renamed from: e */
    public String f266412e = "";

    /* renamed from: f */
    public long f266413f;

    /* renamed from: g */
    public String f266414g = "";

    /* renamed from: h */
    public long f266415h;

    /* renamed from: i */
    public long f266416i;

    /* renamed from: j */
    public long f266417j;

    /* renamed from: k */
    public long f266418k;

    /* renamed from: l */
    public long f266419l;

    /* renamed from: m */
    public long f266420m;

    /* renamed from: n */
    public long f266421n;

    /* renamed from: o */
    public long f266422o;

    /* renamed from: p */
    public long f266423p;

    /* renamed from: q */
    public long f266424q;

    /* renamed from: r */
    public long f266425r;

    /* renamed from: s */
    public long f266426s;

    /* renamed from: t */
    public long f266427t;

    /* renamed from: u */
    public String f266428u = "";

    /* renamed from: v */
    public long f266429v;

    /* renamed from: w */
    public String f266430w = "";

    /* renamed from: x */
    public String f266431x = "";

    /* renamed from: j */
    public int mo1004j() {
        return 19055;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266411d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266412e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266413f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266414g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266415h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266416i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266417j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266418k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266419l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266420m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266421n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266422o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266423p);
        stringBuffer.append(",");
        stringBuffer.append(this.f266424q);
        stringBuffer.append(",");
        stringBuffer.append(this.f266425r);
        stringBuffer.append(",");
        stringBuffer.append(this.f266426s);
        stringBuffer.append(",");
        stringBuffer.append(this.f266427t);
        stringBuffer.append(",");
        stringBuffer.append(this.f266428u);
        stringBuffer.append(",");
        stringBuffer.append(this.f266429v);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f266430w);
        stringBuffer.append(",");
        stringBuffer.append(this.f266431x);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266411d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewFeeds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266412e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewFeedsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266413f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposureNewFeeds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266414g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposureNewFeedsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266415h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadBreakLayersCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266416i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpableMissReadBreakLayersCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266417j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBtnExposureCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266418k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBtnClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266419l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266420m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266421n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266422o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBtnId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266423p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBtnClickType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266424q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBtnFirstExposureTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266425r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266426s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerWeishangFeedCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266427t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerFeeds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266428u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBreakLayerId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266429v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsGenNewBreakLayer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NewBreakLayerID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreCheckNewFeedCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreCheckWeishangFeedCnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AvatarList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266430w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IdList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266431x);
        return stringBuffer.toString();
    }
}

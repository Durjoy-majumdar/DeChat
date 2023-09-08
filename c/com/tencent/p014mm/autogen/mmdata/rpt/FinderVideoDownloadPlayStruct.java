package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderVideoDownloadPlayStruct */
public final class FinderVideoDownloadPlayStruct extends C61103a {

    /* renamed from: A */
    public String f69481A = "";

    /* renamed from: B */
    public String f69482B = "";

    /* renamed from: d */
    public long f69483d;

    /* renamed from: e */
    public long f69484e;

    /* renamed from: f */
    public long f69485f;

    /* renamed from: g */
    public long f69486g;

    /* renamed from: h */
    public String f69487h = "";

    /* renamed from: i */
    public long f69488i;

    /* renamed from: j */
    public long f69489j;

    /* renamed from: k */
    public long f69490k;

    /* renamed from: l */
    public String f69491l = "";

    /* renamed from: m */
    public long f69492m;

    /* renamed from: n */
    public String f69493n = "";

    /* renamed from: o */
    public String f69494o = "";

    /* renamed from: p */
    public long f69495p;

    /* renamed from: q */
    public long f69496q;

    /* renamed from: r */
    public long f69497r;

    /* renamed from: s */
    public long f69498s;

    /* renamed from: t */
    public long f69499t;

    /* renamed from: u */
    public String f69500u = "";

    /* renamed from: v */
    public String f69501v = "";

    /* renamed from: w */
    public long f69502w;

    /* renamed from: x */
    public long f69503x;

    /* renamed from: y */
    public long f69504y;

    /* renamed from: z */
    public long f69505z;

    /* renamed from: j */
    public int mo1004j() {
        return 25857;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69483d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69484e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69485f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69486g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69487h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69488i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69489j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69490k);
        stringBuffer.append(",");
        stringBuffer.append(this.f69491l);
        stringBuffer.append(",");
        stringBuffer.append(this.f69492m);
        stringBuffer.append(",");
        stringBuffer.append(this.f69493n);
        stringBuffer.append(",");
        stringBuffer.append(this.f69494o);
        stringBuffer.append(",");
        stringBuffer.append(this.f69495p);
        stringBuffer.append(",");
        stringBuffer.append(this.f69496q);
        stringBuffer.append(",");
        stringBuffer.append(this.f69497r);
        stringBuffer.append(",");
        stringBuffer.append(this.f69498s);
        stringBuffer.append(",");
        stringBuffer.append(this.f69499t);
        stringBuffer.append(",");
        stringBuffer.append(this.f69500u);
        stringBuffer.append(",");
        stringBuffer.append(this.f69501v);
        stringBuffer.append(",");
        stringBuffer.append(this.f69502w);
        stringBuffer.append(",");
        stringBuffer.append(this.f69503x);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69504y);
        stringBuffer.append(",");
        stringBuffer.append(this.f69505z);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f69481A);
        stringBuffer.append(",");
        stringBuffer.append(this.f69482B);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69483d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69484e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69485f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadStrategy");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69486g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69487h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DurationS");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69488i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DurationMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69489j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69490k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VideoFormat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69491l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69492m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69493n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownloadEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69494o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69495p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UniqPlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69496q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RealPlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69497r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69498s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69499t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayStartTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69500u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayEndTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69501v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayStartPos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69502w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PlayStopPos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69503x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CompleteDownloadSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnRxSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69504y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WxRxSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69505z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UsePcdn");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetConnInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69481A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("codecFormat");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69482B);
        return stringBuffer.toString();
    }
}

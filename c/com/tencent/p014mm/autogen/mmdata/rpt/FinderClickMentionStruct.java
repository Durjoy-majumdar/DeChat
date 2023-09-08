package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderClickMentionStruct */
public final class FinderClickMentionStruct extends C61103a {

    /* renamed from: d */
    public String f155128d = "";

    /* renamed from: e */
    public String f155129e = "";

    /* renamed from: f */
    public String f155130f = "";

    /* renamed from: g */
    public String f155131g = "";

    /* renamed from: h */
    public String f155132h = "";

    /* renamed from: i */
    public long f155133i;

    /* renamed from: j */
    public long f155134j;

    /* renamed from: k */
    public long f155135k;

    /* renamed from: l */
    public long f155136l;

    /* renamed from: j */
    public int mo1004j() {
        return 19793;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155128d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155129e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155130f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155131g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155132h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155133i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155134j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155135k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155136l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FeedId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155128d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155129e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PosterUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155130f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ViewerUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155131g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MentionedUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155132h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155133i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("recommendtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155134j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("likecnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155135k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commcnt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155136l);
        return stringBuffer.toString();
    }
}

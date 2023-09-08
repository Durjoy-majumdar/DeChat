package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct */
public final class ShakeActionReportStruct extends C61103a {

    /* renamed from: d */
    public int f48563d;

    /* renamed from: e */
    public long f48564e;

    /* renamed from: f */
    public String f48565f = "";

    /* renamed from: g */
    public String f48566g = "";

    /* renamed from: h */
    public long f48567h;

    /* renamed from: i */
    public long f48568i;

    /* renamed from: j */
    public String f48569j = "";

    /* renamed from: k */
    public long f48570k;

    /* renamed from: l */
    public int f48571l;

    /* renamed from: m */
    public int f48572m;

    /* renamed from: n */
    public long f48573n;

    /* renamed from: o */
    public String f48574o = "";

    /* renamed from: p */
    public String f48575p = "";

    /* renamed from: q */
    public String f48576q = "";

    /* renamed from: r */
    public String f48577r = "";

    /* renamed from: s */
    public String f48578s = "";

    /* renamed from: t */
    public String f48579t = "";

    /* renamed from: u */
    public long f48580u;

    /* renamed from: j */
    public int mo1004j() {
        return 23899;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48563d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48564e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48565f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48566g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48567h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48568i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48569j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48570k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48571l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48572m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48573n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48574o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48575p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48576q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48577r);
        stringBuffer.append(",");
        stringBuffer.append(this.f48578s);
        stringBuffer.append(",");
        stringBuffer.append(this.f48579t);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f48580u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48563d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48564e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48565f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongOrTv");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48566g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUinPos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48567h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUinGender");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48568i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUinDistanceStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48569j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUinHasSignature");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48570k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48571l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48572m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShakeCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48573n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48574o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SharkSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48575p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48576q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongSinger");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48577r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongWeburl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48578s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongDataurl");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48579t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongRecommendPos");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToSongCopyRighted");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48580u);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct */
public final class LiveVisitorEnterLiveStruct extends C61103a {

    /* renamed from: d */
    public long f156451d;

    /* renamed from: e */
    public String f156452e = "";

    /* renamed from: f */
    public long f156453f;

    /* renamed from: g */
    public String f156454g = "";

    /* renamed from: h */
    public long f156455h;

    /* renamed from: i */
    public long f156456i;

    /* renamed from: j */
    public long f156457j;

    /* renamed from: k */
    public long f156458k;

    /* renamed from: l */
    public long f156459l;

    /* renamed from: m */
    public long f156460m;

    /* renamed from: n */
    public long f156461n;

    /* renamed from: o */
    public String f156462o = "";

    /* renamed from: p */
    public long f156463p;

    /* renamed from: q */
    public long f156464q;

    /* renamed from: r */
    public long f156465r;

    /* renamed from: s */
    public long f156466s;

    /* renamed from: j */
    public int mo1004j() {
        return 19892;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156451d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156452e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156453f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156454g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156455h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156456i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156457j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156458k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156459l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156460m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156461n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156462o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156463p);
        stringBuffer.append(",");
        stringBuffer.append(this.f156464q);
        stringBuffer.append(",");
        stringBuffer.append(this.f156465r);
        stringBuffer.append(",");
        stringBuffer.append(this.f156466s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156451d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156452e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156453f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveuin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156454g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("errcode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156455h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterRoomCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156456i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitRoomCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156457j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156458k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("heartCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156459l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("connectReqCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156460m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("connectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156461n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156462o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lastTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156463p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156464q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitTimestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156465r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitChatroomUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156466s);
        return stringBuffer.toString();
    }
}

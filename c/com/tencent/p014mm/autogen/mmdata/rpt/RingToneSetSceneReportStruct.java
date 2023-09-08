package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RingToneSetSceneReportStruct */
public final class RingToneSetSceneReportStruct extends C61103a {

    /* renamed from: d */
    public String f156797d = "";

    /* renamed from: e */
    public long f156798e;

    /* renamed from: f */
    public long f156799f;

    /* renamed from: g */
    public long f156800g;

    /* renamed from: h */
    public String f156801h = "";

    /* renamed from: i */
    public long f156802i;

    /* renamed from: j */
    public long f156803j;

    /* renamed from: k */
    public long f156804k;

    /* renamed from: l */
    public String f156805l = "";

    /* renamed from: m */
    public long f156806m;

    /* renamed from: n */
    public long f156807n;

    /* renamed from: o */
    public String f156808o = "";

    /* renamed from: p */
    public long f156809p;

    /* renamed from: j */
    public int mo1004j() {
        return 24158;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156797d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156798e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156799f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156800g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156801h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156802i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156803j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156804k);
        stringBuffer.append(",");
        stringBuffer.append(this.f156805l);
        stringBuffer.append(",");
        stringBuffer.append(this.f156806m);
        stringBuffer.append(",");
        stringBuffer.append(this.f156807n);
        stringBuffer.append(",");
        stringBuffer.append(this.f156808o);
        stringBuffer.append(",");
        stringBuffer.append(this.f156809p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156797d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156798e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156799f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156800g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156801h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("channel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156802i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_individual");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156803j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("status");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156804k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("toUserName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156805l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("setType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156806m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_vibrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156807n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rec_request_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156808o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("is_video_stream");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156809p);
        return stringBuffer.toString();
    }
}

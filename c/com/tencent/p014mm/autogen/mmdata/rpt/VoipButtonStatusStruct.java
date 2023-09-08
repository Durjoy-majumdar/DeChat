package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipButtonStatusStruct */
public final class VoipButtonStatusStruct extends C61103a {

    /* renamed from: d */
    public long f310345d;

    /* renamed from: e */
    public long f310346e;

    /* renamed from: f */
    public long f310347f;

    /* renamed from: g */
    public long f310348g;

    /* renamed from: h */
    public String f310349h = "";

    /* renamed from: i */
    public long f310350i;

    /* renamed from: j */
    public long f310351j;

    /* renamed from: k */
    public String f310352k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 26491;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310345d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310346e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310347f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310348g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310349h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310350i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310351j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310352k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310345d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomkey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310346e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310347f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memberidx");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310348g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310349h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("operatetime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310350i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(IXWebBroadcastListener.STAGE_TAG);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310351j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("audio_session_port");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310352k);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public VoipButtonStatusStruct mo148156s(String str) {
        this.f310349h = mo86045b("action", str, true);
        return this;
    }

    /* renamed from: t */
    public VoipButtonStatusStruct mo148157t(String str) {
        this.f310352k = mo86045b("audio_session_port", str, true);
        return this;
    }
}

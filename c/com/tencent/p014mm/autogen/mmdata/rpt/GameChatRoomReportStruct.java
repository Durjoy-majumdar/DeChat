package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct */
public final class GameChatRoomReportStruct extends C61103a {

    /* renamed from: d */
    public long f107903d;

    /* renamed from: e */
    public long f107904e;

    /* renamed from: f */
    public long f107905f;

    /* renamed from: g */
    public long f107906g;

    /* renamed from: h */
    public long f107907h;

    /* renamed from: i */
    public long f107908i;

    /* renamed from: j */
    public long f107909j;

    /* renamed from: k */
    public String f107910k = "";

    /* renamed from: l */
    public String f107911l = "";

    /* renamed from: m */
    public long f107912m;

    /* renamed from: n */
    public String f107913n = "";

    /* renamed from: o */
    public String f107914o = "";

    /* renamed from: p */
    public String f107915p = "";

    /* renamed from: q */
    public long f107916q;

    /* renamed from: r */
    public String f107917r = "";

    /* renamed from: s */
    public long f107918s;

    /* renamed from: t */
    public int f107919t;

    /* renamed from: u */
    public String f107920u = "";

    /* renamed from: v */
    public long f107921v;

    /* renamed from: j */
    public int mo1004j() {
        return 23070;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107903d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107904e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107905f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107906g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107907h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107908i);
        stringBuffer.append(",");
        stringBuffer.append(this.f107909j);
        stringBuffer.append(",");
        stringBuffer.append(this.f107910k);
        stringBuffer.append(",");
        stringBuffer.append(this.f107911l);
        stringBuffer.append(",");
        stringBuffer.append(this.f107912m);
        stringBuffer.append(",");
        stringBuffer.append(this.f107913n);
        stringBuffer.append(",");
        stringBuffer.append(this.f107914o);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f107915p);
        stringBuffer.append(",");
        stringBuffer.append(this.f107916q);
        stringBuffer.append(",");
        stringBuffer.append(this.f107917r);
        stringBuffer.append(",");
        stringBuffer.append(this.f107918s);
        stringBuffer.append(",");
        stringBuffer.append(this.f107919t);
        stringBuffer.append(",");
        stringBuffer.append(this.f107920u);
        stringBuffer.append(",");
        stringBuffer.append(this.f107921v);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SceneID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107903d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UIArea");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107904e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PositionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107905f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107906g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107907h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Ssid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107908i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SourceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107909j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GameID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107910k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatroomID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107911l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MessageID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107912m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GameLeval");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107913n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GameTitle");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107914o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107915p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107916q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExternInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107917r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoticeID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107918s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TalkTab");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107919t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("session_id");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107920u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("client_timestamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107921v);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public GameChatRoomReportStruct mo62727s(String str) {
        this.f107911l = mo86045b("ChatroomID", str, true);
        return this;
    }

    /* renamed from: t */
    public GameChatRoomReportStruct mo62728t(String str) {
        this.f107910k = mo86045b("GameID", str, true);
        return this;
    }
}

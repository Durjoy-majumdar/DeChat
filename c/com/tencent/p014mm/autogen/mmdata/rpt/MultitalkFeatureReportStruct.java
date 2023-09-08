package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultitalkFeatureReportStruct */
public final class MultitalkFeatureReportStruct extends C61103a {

    /* renamed from: A */
    public int f310237A;

    /* renamed from: d */
    public String f310238d = "";

    /* renamed from: e */
    public int f310239e;

    /* renamed from: f */
    public String f310240f = "";

    /* renamed from: g */
    public long f310241g;

    /* renamed from: h */
    public long f310242h;

    /* renamed from: i */
    public long f310243i;

    /* renamed from: j */
    public int f310244j;

    /* renamed from: k */
    public long f310245k;

    /* renamed from: l */
    public int f310246l;

    /* renamed from: m */
    public long f310247m;

    /* renamed from: n */
    public long f310248n;

    /* renamed from: o */
    public long f310249o;

    /* renamed from: p */
    public String f310250p = "";

    /* renamed from: q */
    public String f310251q = "";

    /* renamed from: r */
    public long f310252r;

    /* renamed from: s */
    public String f310253s = "";

    /* renamed from: t */
    public long f310254t;

    /* renamed from: u */
    public String f310255u = "";

    /* renamed from: v */
    public long f310256v;

    /* renamed from: w */
    public int f310257w;

    /* renamed from: x */
    public int f310258x;

    /* renamed from: y */
    public int f310259y;

    /* renamed from: z */
    public int f310260z;

    /* renamed from: j */
    public int mo1004j() {
        return 23991;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310238d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310239e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310240f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310241g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310242h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310243i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310244j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310245k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310246l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310247m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310248n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310249o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310250p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310251q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310252r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310253s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310254t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310255u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310256v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310257w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310258x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310259y);
        stringBuffer.append(",");
        stringBuffer.append(this.f310260z);
        stringBuffer.append(",");
        stringBuffer.append(this.f310237A);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("multiTalkGroupId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310238d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isIlink");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310239e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memberUins");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310240f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("startTalkingTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310241g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("talkDurationSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310242h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maxOpenCameraNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310243i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openedCamera");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310244j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maxMemberNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310245k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickScreenCastBtn");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310246l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("screenCastDurationSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310247m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maxOpenScreenCastNum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310248n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subscribeScreenCastDurationSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310249o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subscribeScreenCastOp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310250p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("clickScreenCastBtnOp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310251q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openCameraDurationSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310252r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openCameraOp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310253s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subscribeBigVideoDurationSec");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310254t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("subscribeBigVideoOp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310255u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomKeyOrRoomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310256v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("callAcceptState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310257w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memberId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310258x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useNewRender");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310259y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maxGLWorker");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310260z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("renderFps");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310237A);
        return stringBuffer.toString();
    }
}

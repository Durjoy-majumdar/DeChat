package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppMsgWxaExposeClickStruct */
public final class AppMsgWxaExposeClickStruct extends C61103a {

    /* renamed from: F0 */
    public int f48164F0;

    /* renamed from: d */
    public int f48165d;

    /* renamed from: e */
    public int f48166e;

    /* renamed from: f */
    public String f48167f = "";

    /* renamed from: g */
    public int f48168g;

    /* renamed from: h */
    public String f48169h = "";

    /* renamed from: i */
    public long f48170i;

    /* renamed from: j */
    public long f48171j;

    /* renamed from: k */
    public int f48172k;

    /* renamed from: l */
    public String f48173l = "";

    /* renamed from: m */
    public String f48174m = "";

    /* renamed from: n */
    public String f48175n = "";

    /* renamed from: o */
    public String f48176o = "";

    /* renamed from: p */
    public int f48177p;

    /* renamed from: q */
    public long f48178q;

    /* renamed from: r */
    public int f48179r;

    /* renamed from: j */
    public int mo1004j() {
        return 24822;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48165d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48166e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48167f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48168g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48169h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48170i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48171j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48172k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48173l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48174m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48175n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48176o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48177p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48178q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48179r);
        stringBuffer.append(",");
        stringBuffer.append(this.f48164F0);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48165d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48166e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48167f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatRoomUserCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48168g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48169h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48170i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CardId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48171j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CardType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48172k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SenderUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48173l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48174m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48175n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48176o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48177p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExposePeriod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48178q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasRelievedBuyFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48179r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasFlagshipFlag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48164F0);
        return stringBuffer.toString();
    }
}

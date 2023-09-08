package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStatusNotificationCliOpStruct */
public final class TextStatusNotificationCliOpStruct extends C61103a {

    /* renamed from: d */
    public String f194597d = "";

    /* renamed from: e */
    public String f194598e = "";

    /* renamed from: f */
    public long f194599f;

    /* renamed from: g */
    public String f194600g = "";

    /* renamed from: h */
    public long f194601h;

    /* renamed from: i */
    public long f194602i;

    /* renamed from: j */
    public long f194603j;

    /* renamed from: k */
    public long f194604k;

    /* renamed from: l */
    public long f194605l;

    /* renamed from: m */
    public long f194606m;

    /* renamed from: n */
    public String f194607n = "";

    /* renamed from: o */
    public String f194608o = "";

    /* renamed from: p */
    public String f194609p = "";

    /* renamed from: q */
    public String f194610q = "";

    /* renamed from: r */
    public String f194611r = "";

    /* renamed from: s */
    public String f194612s = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23836;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194597d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194598e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194599f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194600g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194601h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194602i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194603j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194604k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194605l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194606m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194607n);
        stringBuffer.append(",");
        stringBuffer.append(this.f194608o);
        stringBuffer.append(",");
        stringBuffer.append(this.f194609p);
        stringBuffer.append(",");
        stringBuffer.append(this.f194610q);
        stringBuffer.append(",");
        stringBuffer.append(this.f194611r);
        stringBuffer.append(",");
        stringBuffer.append(this.f194612s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194597d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NotificationSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194598e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194599f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194600g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionTs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194601h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194602i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterPosition");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194603j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadInteractCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194604k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadMsgCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194605l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UnreadHelloToMeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194606m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUserSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194607n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUserIconID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194608o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUserSourceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194609p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUserHashTag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194610q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUserStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194611r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MyCurrentStatusID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194612s);
        return stringBuffer.toString();
    }
}

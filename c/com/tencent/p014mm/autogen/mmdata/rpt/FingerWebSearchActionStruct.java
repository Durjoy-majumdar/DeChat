package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FingerWebSearchActionStruct */
public final class FingerWebSearchActionStruct extends C61103a {

    /* renamed from: d */
    public String f48494d = "";

    /* renamed from: e */
    public long f48495e;

    /* renamed from: f */
    public long f48496f;

    /* renamed from: g */
    public long f48497g;

    /* renamed from: h */
    public String f48498h = "";

    /* renamed from: i */
    public String f48499i = "";

    /* renamed from: j */
    public String f48500j = "";

    /* renamed from: k */
    public String f48501k = "";

    /* renamed from: l */
    public long f48502l;

    /* renamed from: m */
    public String f48503m = "";

    /* renamed from: n */
    public long f48504n;

    /* renamed from: o */
    public long f48505o;

    /* renamed from: p */
    public long f48506p;

    /* renamed from: q */
    public String f48507q = "";

    /* renamed from: r */
    public String f48508r = "";

    /* renamed from: s */
    public long f48509s;

    /* renamed from: j */
    public int mo1004j() {
        return 20257;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48494d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48495e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48496f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48497g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48498h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48499i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48500j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48501k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48502l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48503m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48504n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48505o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48506p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48507q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48508r);
        stringBuffer.append(",");
        stringBuffer.append(this.f48509s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48494d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48495e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48496f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasReddot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48497g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HitWordList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48498h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HitWordVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48499i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48500j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgFromUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48501k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48502l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatRoomID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48503m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48504n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgContentLength");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48505o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48506p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShowHitWord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48507q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MatchTypeList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48508r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MatchResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48509s);
        return stringBuffer.toString();
    }
}

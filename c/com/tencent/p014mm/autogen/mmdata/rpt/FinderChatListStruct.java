package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderChatListStruct */
public final class FinderChatListStruct extends C61103a {

    /* renamed from: d */
    public long f107882d;

    /* renamed from: e */
    public long f107883e;

    /* renamed from: f */
    public long f107884f;

    /* renamed from: g */
    public String f107885g = "";

    /* renamed from: h */
    public long f107886h;

    /* renamed from: i */
    public long f107887i;

    /* renamed from: j */
    public long f107888j;

    /* renamed from: k */
    public long f107889k;

    /* renamed from: l */
    public long f107890l;

    /* renamed from: m */
    public long f107891m;

    /* renamed from: n */
    public long f107892n;

    /* renamed from: o */
    public String f107893o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20688;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107882d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107883e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107884f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107885g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107886h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107887i);
        stringBuffer.append(",");
        stringBuffer.append(this.f107888j);
        stringBuffer.append(",");
        stringBuffer.append(this.f107889k);
        stringBuffer.append(",");
        stringBuffer.append(this.f107890l);
        stringBuffer.append(",");
        stringBuffer.append(this.f107891m);
        stringBuffer.append(",");
        stringBuffer.append(this.f107892n);
        stringBuffer.append(",");
        stringBuffer.append(this.f107893o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("myAccountType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107882d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isGreetSession");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107883e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fromCommentScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107884f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("chatlistSessionid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107885g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exposeSessionCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107886h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exposeChatCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107887i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107888j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("openSessionCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107889k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("delSessionCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107890l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stayDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107891m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("dotClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107892n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107893o);
        return stringBuffer.toString();
    }
}

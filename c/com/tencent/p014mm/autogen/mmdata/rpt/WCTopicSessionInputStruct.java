package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCTopicSessionInputStruct */
public final class WCTopicSessionInputStruct extends C61103a {

    /* renamed from: d */
    public long f69642d;

    /* renamed from: e */
    public String f69643e = "";

    /* renamed from: f */
    public String f69644f = "";

    /* renamed from: g */
    public long f69645g;

    /* renamed from: h */
    public String f69646h = "";

    /* renamed from: i */
    public String f69647i = "";

    /* renamed from: j */
    public long f69648j;

    /* renamed from: k */
    public long f69649k;

    /* renamed from: j */
    public int mo1004j() {
        return 21174;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69642d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69643e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69644f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69645g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69646h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69647i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69648j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69649k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69642d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterSceneId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69643e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69644f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69645g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QueryKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69646h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69647i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContentType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69648j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EventTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69649k);
        return stringBuffer.toString();
    }
}

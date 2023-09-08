package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryRevokeStruct */
public final class ShareRoomHistoryRevokeStruct extends C61103a {

    /* renamed from: d */
    public String f69607d = "";

    /* renamed from: e */
    public long f69608e;

    /* renamed from: f */
    public long f69609f = 0;

    /* renamed from: g */
    public long f69610g = 0;

    /* renamed from: h */
    public long f69611h;

    /* renamed from: i */
    public long f69612i;

    /* renamed from: j */
    public long f69613j = 0;

    /* renamed from: k */
    public String f69614k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 20542;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f69607d);
        stringBuffer.append(",");
        stringBuffer.append(this.f69608e);
        stringBuffer.append(",");
        stringBuffer.append(this.f69609f);
        stringBuffer.append(",");
        stringBuffer.append(this.f69610g);
        stringBuffer.append(",");
        stringBuffer.append(this.f69611h);
        stringBuffer.append(",");
        stringBuffer.append(this.f69612i);
        stringBuffer.append(",");
        stringBuffer.append(this.f69613j);
        stringBuffer.append(",");
        stringBuffer.append(this.f69614k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("RoomId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69607d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OrigInvitedUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69608e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AvailUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69609f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Opt");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69610g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69611h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69612i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HistoryID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69613j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUsers");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f69614k);
        return stringBuffer.toString();
    }
}

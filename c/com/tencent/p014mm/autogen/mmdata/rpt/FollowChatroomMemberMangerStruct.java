package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FollowChatroomMemberMangerStruct */
public final class FollowChatroomMemberMangerStruct extends C61103a {

    /* renamed from: d */
    public String f107895d = "";

    /* renamed from: e */
    public long f107896e;

    /* renamed from: f */
    public long f107897f;

    /* renamed from: g */
    public int f107898g;

    /* renamed from: h */
    public int f107899h;

    /* renamed from: i */
    public int f107900i;

    /* renamed from: j */
    public int f107901j = 0;

    /* renamed from: k */
    public int f107902k = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 20247;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f107895d);
        stringBuffer.append(",");
        stringBuffer.append(this.f107896e);
        stringBuffer.append(",");
        stringBuffer.append(this.f107897f);
        stringBuffer.append(",");
        stringBuffer.append(this.f107898g);
        stringBuffer.append(",");
        stringBuffer.append(this.f107899h);
        stringBuffer.append(",");
        stringBuffer.append(this.f107900i);
        stringBuffer.append(",");
        stringBuffer.append(this.f107901j);
        stringBuffer.append(",");
        stringBuffer.append(this.f107902k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107895d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107896e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107897f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasClickedPlus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107898g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasClickedMinus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107899h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasConfirmedChanges");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107900i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterFollowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107901j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("exitFollowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f107902k);
        return stringBuffer.toString();
    }
}

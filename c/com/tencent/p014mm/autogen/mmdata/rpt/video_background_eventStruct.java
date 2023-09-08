package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.video_background_eventStruct */
public final class video_background_eventStruct extends C61103a {

    /* renamed from: d */
    public long f310550d;

    /* renamed from: e */
    public long f310551e;

    /* renamed from: f */
    public long f310552f;

    /* renamed from: g */
    public long f310553g;

    /* renamed from: h */
    public long f310554h;

    /* renamed from: i */
    public long f310555i;

    /* renamed from: j */
    public long f310556j;

    /* renamed from: k */
    public String f310557k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25060;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310550d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310551e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310552f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310553g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310554h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310555i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310556j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310557k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310550d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomkey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310551e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomtype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310552f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberIdx");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310553g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DialTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310554h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConnectTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310555i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HangupTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310556j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Background_event");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310557k);
        return stringBuffer.toString();
    }
}

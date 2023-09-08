package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct */
public final class SnsFakeVideoLogStruct extends C61103a {

    /* renamed from: d */
    public int f266021d = 0;

    /* renamed from: e */
    public String f266022e = "";

    /* renamed from: f */
    public int f266023f = -1;

    /* renamed from: g */
    public int f266024g = 0;

    /* renamed from: h */
    public int f266025h = 0;

    /* renamed from: i */
    public long f266026i = 0;

    /* renamed from: j */
    public long f266027j = 0;

    /* renamed from: k */
    public long f266028k = 0;

    /* renamed from: l */
    public long f266029l = 0;

    /* renamed from: m */
    public int f266030m = 0;

    /* renamed from: n */
    public String f266031n = "";

    /* renamed from: o */
    public int f266032o = 0;

    /* renamed from: p */
    public String f266033p = "";

    /* renamed from: q */
    public int f266034q = 0;

    /* renamed from: r */
    public int f266035r = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 26122;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266021d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266022e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266023f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266024g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266025h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266026i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266027j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266028k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266029l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266030m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266031n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266032o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266033p);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f266034q);
        stringBuffer.append(",");
        stringBuffer.append(this.f266035r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266021d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WorkId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266022e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MuxCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266023f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LastWorkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266024g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CurrentWorkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266025h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfirmEditTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266026i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfirmPublishTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266027j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartMuxTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266028k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinishMuxTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266029l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FakeVideoIsPlaySuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266030m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeConfig");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266031n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSnsDoubleCheck");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266032o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MixVideoInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266033p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsUseSoftRetry");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsKilledProcessReStart");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266034q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266035r);
        return stringBuffer.toString();
    }
}

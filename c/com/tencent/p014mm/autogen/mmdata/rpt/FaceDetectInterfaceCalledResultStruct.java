package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct */
public final class FaceDetectInterfaceCalledResultStruct extends C61103a {

    /* renamed from: d */
    public long f9668d = 0;

    /* renamed from: e */
    public String f9669e = "";

    /* renamed from: f */
    public long f9670f = 0;

    /* renamed from: g */
    public String f9671g = "";

    /* renamed from: h */
    public long f9672h = 0;

    /* renamed from: i */
    public long f9673i = 0;

    /* renamed from: j */
    public long f9674j = 0;

    /* renamed from: k */
    public long f9675k = 0;

    /* renamed from: l */
    public long f9676l = 0;

    /* renamed from: m */
    public long f9677m = 0;

    /* renamed from: n */
    public long f9678n = 0;

    /* renamed from: o */
    public long f9679o = 0;

    /* renamed from: j */
    public int mo1004j() {
        return 14560;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9668d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9669e);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f9670f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9671g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9672h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9673i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9674j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9675k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9676l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9677m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9678n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9679o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("calledSessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9668d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("functionName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9669e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("interfaceType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("businessType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9670f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("appId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9671g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFaceDetectVerifySuccess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9672h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9673i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("faceDetectCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9674j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BeginFaceTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9675k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BeginLivenessTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9676l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BeginVerifyTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9677m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExitFaceTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9678n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CheckAliveType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9679o);
        return stringBuffer.toString();
    }
}

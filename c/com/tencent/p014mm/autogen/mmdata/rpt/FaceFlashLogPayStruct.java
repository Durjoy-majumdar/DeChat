package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct */
public final class FaceFlashLogPayStruct extends C61103a {

    /* renamed from: d */
    public long f9711d;

    /* renamed from: e */
    public long f9712e;

    /* renamed from: f */
    public long f9713f;

    /* renamed from: g */
    public int f9714g;

    /* renamed from: h */
    public int f9715h;

    /* renamed from: i */
    public int f9716i;

    /* renamed from: j */
    public int f9717j;

    /* renamed from: k */
    public long f9718k;

    /* renamed from: l */
    public long f9719l;

    /* renamed from: m */
    public long f9720m;

    /* renamed from: n */
    public String f9721n = "";

    /* renamed from: o */
    public String f9722o = "";

    /* renamed from: p */
    public int f9723p;

    /* renamed from: q */
    public int f9724q = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 21131;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f9711d);
        stringBuffer.append(",");
        stringBuffer.append(this.f9712e);
        stringBuffer.append(",");
        stringBuffer.append(this.f9713f);
        stringBuffer.append(",");
        stringBuffer.append(this.f9714g);
        stringBuffer.append(",");
        stringBuffer.append(this.f9715h);
        stringBuffer.append(",");
        stringBuffer.append(this.f9716i);
        stringBuffer.append(",");
        stringBuffer.append(this.f9717j);
        stringBuffer.append(",");
        stringBuffer.append(this.f9718k);
        stringBuffer.append(",");
        stringBuffer.append(this.f9719l);
        stringBuffer.append(",");
        stringBuffer.append(this.f9720m);
        stringBuffer.append(",");
        stringBuffer.append(this.f9721n);
        stringBuffer.append(",");
        stringBuffer.append(this.f9722o);
        stringBuffer.append(",");
        stringBuffer.append(this.f9723p);
        stringBuffer.append(",");
        stringBuffer.append(this.f9724q);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ResultCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9711d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AliveType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9712e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9713f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PrepareCgiErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9714g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ConfigCgiErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9715h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9716i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VerifyCgiErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9717j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CdnCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9718k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LivenessCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9719l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ResetCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9720m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StateRecord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9721n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AndroidStateRecord");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9722o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FaceReset");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9723p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f9724q);
        return stringBuffer.toString();
    }
}

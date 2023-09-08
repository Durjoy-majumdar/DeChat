package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderRedDotCancelStruct */
public final class FinderRedDotCancelStruct extends C61103a {

    /* renamed from: d */
    public long f155938d;

    /* renamed from: e */
    public String f155939e = "";

    /* renamed from: f */
    public long f155940f;

    /* renamed from: g */
    public long f155941g;

    /* renamed from: h */
    public String f155942h = "";

    /* renamed from: i */
    public long f155943i;

    /* renamed from: j */
    public int mo1004j() {
        return 20223;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155938d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155939e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155940f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155941g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155942h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155943i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CtrType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155938d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155939e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RecallTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155940f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155941g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155942h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RevokeStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155943i);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct */
public final class FinderGlobalLoadingRptStruct extends C61103a {

    /* renamed from: d */
    public long f155345d;

    /* renamed from: e */
    public long f155346e;

    /* renamed from: f */
    public String f155347f = "";

    /* renamed from: g */
    public String f155348g = "";

    /* renamed from: h */
    public String f155349h = "";

    /* renamed from: j */
    public int mo1004j() {
        return 21680;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155345d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155346e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155347f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155348g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155349h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155345d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155346e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("data");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155347f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("tag");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155348g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("majorData");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155349h);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public FinderGlobalLoadingRptStruct mo76254s(String str) {
        this.f155347f = mo86045b("data", str, true);
        return this;
    }
}

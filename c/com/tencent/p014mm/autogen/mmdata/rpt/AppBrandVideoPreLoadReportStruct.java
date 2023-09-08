package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandVideoPreLoadReportStruct */
public final class AppBrandVideoPreLoadReportStruct extends C61103a {

    /* renamed from: d */
    public String f343653d = "";

    /* renamed from: e */
    public long f343654e = 0;

    /* renamed from: f */
    public C114700a f343655f;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandVideoPreLoadReportStruct$a */
    public enum C114700a {
        NoDownLoad(0),
        DownLoading(1),
        DownLoaded(2),
        DownLoadFail(3);
        

        /* renamed from: d */
        public final int f343661d;

        /* access modifiers changed from: public */
        C114700a(int i) {
            this.f343661d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15586;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343653d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343654e);
        stringBuffer.append(",");
        C114700a aVar = this.f343655f;
        stringBuffer.append(aVar != null ? aVar.f343661d : -1);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Url");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343653d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DownLoadCostStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343654e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreLoadStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343655f);
        return stringBuffer.toString();
    }
}

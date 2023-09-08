package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct */
public final class WeAppQualitySystemProcessReadyStruct extends C61103a {

    /* renamed from: d */
    public String f237241d = "";

    /* renamed from: e */
    public String f237242e = "";

    /* renamed from: f */
    public long f237243f = 0;

    /* renamed from: g */
    public C80786a f237244g;

    /* renamed from: h */
    public long f237245h = 0;

    /* renamed from: i */
    public long f237246i = 0;

    /* renamed from: j */
    public long f237247j = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemProcessReadyStruct$a */
    public enum C80786a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237252d;

        /* access modifiers changed from: public */
        C80786a(int i) {
            this.f237252d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15853;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237241d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237242e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237243f);
        stringBuffer.append(",");
        C80786a aVar = this.f237244g;
        stringBuffer.append(aVar != null ? aVar.f237252d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237245h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237246i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237247j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237241d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237242e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237243f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237244g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237245h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237246i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitingTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237247j);
        return stringBuffer.toString();
    }
}

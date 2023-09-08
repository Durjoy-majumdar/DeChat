package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct */
public final class FinishSelectPOIStruct extends C61103a {

    /* renamed from: d */
    public long f343725d = 0;

    /* renamed from: e */
    public long f343726e = 0;

    /* renamed from: f */
    public long f343727f = 0;

    /* renamed from: g */
    public long f343728g = 0;

    /* renamed from: h */
    public long f343729h;

    /* renamed from: i */
    public long f343730i;

    /* renamed from: j */
    public long f343731j;

    /* renamed from: k */
    public long f343732k;

    /* renamed from: j */
    public int mo1004j() {
        return 17993;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343725d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343726e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343727f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343728g);
        stringBuffer.append(",");
        stringBuffer.append(this.f343729h);
        stringBuffer.append(",");
        stringBuffer.append(this.f343730i);
        stringBuffer.append(",");
        stringBuffer.append(this.f343731j);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f343732k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FinishType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343725d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343726e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343727f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SelectPOIIndex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343728g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FloorWidgetShowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343729h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FloorWidgetClkCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343730i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFinalPoiIndoor");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343731j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFinalPoiIndoorSameFloorOfSender");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinalPoiAndSenderDistanceRange");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343732k);
        return stringBuffer.toString();
    }
}

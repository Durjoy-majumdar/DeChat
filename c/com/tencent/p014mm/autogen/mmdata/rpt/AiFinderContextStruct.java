package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct */
public final class AiFinderContextStruct extends C61103a {

    /* renamed from: d */
    public boolean f79079d;

    /* renamed from: e */
    public long f79080e = 0;

    /* renamed from: f */
    public long f79081f = 0;

    /* renamed from: g */
    public String f79082g = "";

    /* renamed from: h */
    public long f79083h = 0;

    /* renamed from: i */
    public long f79084i = 0;

    public AiFinderContextStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f79079d ? 1 : 0);
        stringBuffer.append(",");
        stringBuffer.append(this.f79080e);
        stringBuffer.append(",");
        stringBuffer.append(this.f79081f);
        stringBuffer.append(",");
        stringBuffer.append(this.f79082g);
        stringBuffer.append(",");
        stringBuffer.append(this.f79083h);
        stringBuffer.append(",");
        stringBuffer.append(this.f79084i);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NewMsgOpenWechatBool");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79079d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LastEnterFinderTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79080e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LastFinderStayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79081f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderRedDotTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79082g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderRedDotCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79083h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinderRedDotShowType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f79084i);
        return stringBuffer.toString();
    }

    public AiFinderContextStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            boolean z = false;
            if (split.length < 6) {
                String[] strArr = new String[6];
                Arrays.fill(strArr, 0, 6, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f79079d = Util.getInt(split[0], 0) != 0 ? true : z;
            long k = mo86051k(split[1]);
            this.f79080e = k;
            mo86048e("LastEnterFinderTimeStampMs", k);
            this.f79081f = mo86051k(split[2]);
            this.f79082g = mo86045b("FinderRedDotTipsId", split[3], true);
            this.f79083h = mo86051k(split[4]);
            this.f79084i = mo86051k(split[5]);
        }
    }
}

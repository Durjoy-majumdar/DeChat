package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct */
public final class MMKVPageFlowStruct extends C61103a {

    /* renamed from: d */
    public String f343748d = "";

    /* renamed from: e */
    public long f343749e = 0;

    /* renamed from: f */
    public long f343750f = 0;

    /* renamed from: g */
    public long f343751g = 0;

    public MMKVPageFlowStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343748d);
        stringBuffer.append(",");
        stringBuffer.append(this.f343749e);
        stringBuffer.append(",");
        stringBuffer.append(this.f343750f);
        stringBuffer.append(",");
        stringBuffer.append(this.f343751g);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Name");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343748d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343749e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343750f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HashCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343751g);
        return stringBuffer.toString();
    }

    public MMKVPageFlowStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 4) {
                String[] strArr = new String[4];
                Arrays.fill(strArr, 0, 4, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f343748d = mo86045b("Name", split[0], true);
            this.f343749e = mo86051k(split[1]);
            long k = mo86051k(split[2]);
            this.f343750f = k;
            mo86048e("TimeStampMs", k);
            this.f343751g = mo86051k(split[3]);
        }
    }
}

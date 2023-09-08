package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CalendarFinderSyncStatisticsStruct */
public final class CalendarFinderSyncStatisticsStruct extends C61103a {

    /* renamed from: d */
    public long f48229d = 0;

    /* renamed from: e */
    public long f48230e = 0;

    /* renamed from: f */
    public long f48231f = 0;

    /* renamed from: g */
    public long f48232g = 0;

    /* renamed from: h */
    public long f48233h = 0;

    public CalendarFinderSyncStatisticsStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 0;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48229d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48230e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48231f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48232g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48233h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48229d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finderSyncCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48230e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveSyncCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48231f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mixSyncCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48232g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalSync");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48233h);
        return stringBuffer.toString();
    }

    public CalendarFinderSyncStatisticsStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 5) {
                String[] strArr = new String[5];
                Arrays.fill(strArr, 0, 5, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f48229d = mo86051k(split[0]);
            this.f48230e = mo86051k(split[1]);
            this.f48231f = mo86051k(split[2]);
            this.f48232g = mo86051k(split[3]);
            this.f48233h = mo86051k(split[4]);
        }
    }
}

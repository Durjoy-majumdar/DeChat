package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct */
public final class BackupReportErrorStruct extends C61103a {

    /* renamed from: d */
    public int f265337d = 0;

    /* renamed from: e */
    public int f265338e = 0;

    /* renamed from: f */
    public int f265339f = 0;

    /* renamed from: g */
    public int f265340g = 0;

    /* renamed from: h */
    public int f265341h = 0;

    public BackupReportErrorStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 22772;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265337d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265338e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265339f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265340g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265341h);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265337d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265338e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FailedTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265339f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MergeSession");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265340g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalSession");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265341h);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public BackupReportErrorStruct mo126602s(int i) {
        this.f265338e = i;
        return this;
    }

    /* renamed from: t */
    public BackupReportErrorStruct mo126603t(int i) {
        this.f265339f = i;
        return this;
    }

    /* renamed from: u */
    public BackupReportErrorStruct mo126604u(int i) {
        this.f265340g = i;
        return this;
    }

    /* renamed from: v */
    public BackupReportErrorStruct mo126605v(int i) {
        this.f265337d = i;
        return this;
    }

    /* renamed from: w */
    public BackupReportErrorStruct mo126606w(int i) {
        this.f265341h = i;
        return this;
    }

    public BackupReportErrorStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 5) {
                String[] strArr = new String[5];
                Arrays.fill(strArr, 0, 5, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f265337d = Util.getInt(split[0], 0);
            this.f265338e = Util.getInt(split[1], 0);
            this.f265339f = Util.getInt(split[2], 0);
            this.f265340g = Util.getInt(split[3], 0);
            this.f265341h = Util.getInt(split[4], 0);
        }
    }
}

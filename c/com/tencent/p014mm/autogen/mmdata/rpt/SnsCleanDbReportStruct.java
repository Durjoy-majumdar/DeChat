package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsCleanDbReportStruct */
public final class SnsCleanDbReportStruct extends C61103a {

    /* renamed from: d */
    public int f265955d = 0;

    /* renamed from: e */
    public long f265956e = 0;

    /* renamed from: f */
    public long f265957f = 0;

    /* renamed from: g */
    public long f265958g = 0;

    /* renamed from: h */
    public long f265959h = 0;

    /* renamed from: i */
    public long f265960i = 0;

    /* renamed from: j */
    public int f265961j = 0;

    /* renamed from: k */
    public long f265962k = 0;

    /* renamed from: l */
    public int f265963l = -1;

    /* renamed from: m */
    public long f265964m = 0;

    /* renamed from: n */
    public long f265965n = -1;

    /* renamed from: o */
    public int f265966o = 0;

    /* renamed from: p */
    public int f265967p = 0;

    /* renamed from: q */
    public int f265968q = 0;

    /* renamed from: r */
    public long f265969r = 0;

    /* renamed from: s */
    public long f265970s = 0;

    /* renamed from: t */
    public long f265971t = 0;

    /* renamed from: u */
    public long f265972u = 0;

    public SnsCleanDbReportStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 23030;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265955d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265956e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265957f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265958g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265959h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265960i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265961j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265962k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265963l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265964m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265965n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265966o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265967p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265968q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265969r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265970s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265971t);
        stringBuffer.append(",");
        stringBuffer.append(this.f265972u);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Code");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265955d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginDbCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265956e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeleteDbCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265957f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginDbSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265958g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeleteDbSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265959h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CleanCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265960i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NeedRestUserSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265961j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeLimit");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265962k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsFirstTimeClean");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265963l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartCleanTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265964m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeSinceLastClean");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265965n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReportType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265966o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FailTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265967p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DbType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265968q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginFileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265969r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeleteFileSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265970s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("OriginFileCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265971t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeleteFileCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265972u);
        return stringBuffer.toString();
    }

    public SnsCleanDbReportStruct(String str) {
        String[] split;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 18) {
                String[] strArr = new String[18];
                Arrays.fill(strArr, 0, 18, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f265955d = Util.getInt(split[0], 0);
            this.f265956e = mo86051k(split[1]);
            this.f265957f = mo86051k(split[2]);
            this.f265958g = mo86051k(split[3]);
            this.f265959h = mo86051k(split[4]);
            this.f265960i = mo86051k(split[5]);
            this.f265961j = Util.getInt(split[6], 0);
            this.f265962k = mo86051k(split[7]);
            this.f265963l = Util.getInt(split[8], 0);
            this.f265964m = mo86051k(split[9]);
            this.f265965n = mo86051k(split[10]);
            this.f265966o = Util.getInt(split[11], 0);
            this.f265967p = Util.getInt(split[12], 0);
            this.f265968q = Util.getInt(split[13], 0);
            this.f265969r = mo86051k(split[14]);
            this.f265970s = mo86051k(split[15]);
            this.f265971t = mo86051k(split[16]);
            this.f265972u = mo86051k(split[17]);
        }
    }
}

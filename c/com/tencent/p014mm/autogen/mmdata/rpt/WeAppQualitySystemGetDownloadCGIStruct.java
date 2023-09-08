package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct */
public final class WeAppQualitySystemGetDownloadCGIStruct extends C61103a {

    /* renamed from: d */
    public String f237165d = "";

    /* renamed from: e */
    public String f237166e = "";

    /* renamed from: f */
    public long f237167f = 0;

    /* renamed from: g */
    public C80779a f237168g;

    /* renamed from: h */
    public long f237169h = 0;

    /* renamed from: i */
    public long f237170i = 0;

    /* renamed from: j */
    public long f237171j = 0;

    /* renamed from: k */
    public long f237172k = 0;

    /* renamed from: l */
    public long f237173l = 0;

    /* renamed from: m */
    public C80780b f237174m;

    /* renamed from: n */
    public long f237175n = 0;

    /* renamed from: o */
    public String f237176o = "";

    /* renamed from: p */
    public long f237177p = 0;

    /* renamed from: q */
    public long f237178q;

    /* renamed from: r */
    public String f237179r = "";

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct$a */
    public enum C80779a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237184d;

        /* access modifiers changed from: public */
        C80779a(int i) {
            this.f237184d = i;
        }

        /* renamed from: a */
        public static C80779a m98593a(int i) {
            if (i == 1) {
                return release;
            }
            if (i == 2) {
                return debug;
            }
            if (i != 3) {
                return null;
            }
            return demo;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct$b */
    public enum C80780b {
        ok(0),
        common_fail(1);
        

        /* renamed from: d */
        public final int f237188d;

        /* access modifiers changed from: public */
        C80780b(int i) {
            this.f237188d = i;
        }
    }

    public WeAppQualitySystemGetDownloadCGIStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15798;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237165d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237166e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237167f);
        stringBuffer.append(",");
        C80779a aVar = this.f237168g;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f237184d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237169h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237170i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237171j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237172k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237173l);
        stringBuffer.append(",");
        C80780b bVar = this.f237174m;
        if (bVar != null) {
            i = bVar.f237188d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237175n);
        stringBuffer.append(",");
        stringBuffer.append(this.f237176o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237177p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237178q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237179r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237165d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237166e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237167f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237168g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237169h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237170i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237171j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237172k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237173l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Ret");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237174m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237175n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("username");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237176o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isParallel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237177p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isUesd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237178q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkTypeStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237179r);
        return stringBuffer.toString();
    }

    public WeAppQualitySystemGetDownloadCGIStruct(String str) {
        String[] split;
        C80780b bVar;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 15) {
                String[] strArr = new String[15];
                Arrays.fill(strArr, 0, 15, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f237165d = mo86045b("InstanceId", split[0], true);
            this.f237166e = mo86045b("AppId", split[1], true);
            this.f237167f = mo86051k(split[2]);
            this.f237168g = C80779a.m98593a(Util.getInt(split[3], 0));
            this.f237169h = mo86051k(split[4]);
            long k = mo86051k(split[5]);
            this.f237170i = k;
            mo86046c("CostTimeMs", k);
            this.f237171j = mo86051k(split[6]);
            long k2 = mo86051k(split[7]);
            this.f237172k = k2;
            mo86048e("StartTimeStampMs", k2);
            long k3 = mo86051k(split[8]);
            this.f237173l = k3;
            mo86048e("EndTimeStampMs", k3);
            int i = Util.getInt(split[9], 0);
            if (i == 0) {
                bVar = C80780b.ok;
            } else if (i != 1) {
                bVar = null;
            } else {
                bVar = C80780b.common_fail;
            }
            this.f237174m = bVar;
            this.f237175n = mo86051k(split[10]);
            this.f237176o = mo86045b("username", split[11], true);
            this.f237177p = mo86051k(split[12]);
            this.f237178q = mo86051k(split[13]);
            this.f237179r = mo86045b("NetworkTypeStr", split[14], true);
        }
    }
}

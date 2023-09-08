package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.Arrays;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct */
public final class PageFlowDetailStruct extends C61103a {

    /* renamed from: d */
    public int f343799d = 0;

    /* renamed from: e */
    public String f343800e = "";

    /* renamed from: f */
    public long f343801f = 0;

    /* renamed from: g */
    public String f343802g = "";

    /* renamed from: h */
    public long f343803h = 0;

    /* renamed from: i */
    public long f343804i = 0;

    /* renamed from: j */
    public long f343805j = 0;

    /* renamed from: k */
    public boolean f343806k;

    /* renamed from: l */
    public long f343807l = 0;

    public PageFlowDetailStruct() {
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15885;
    }

    /* renamed from: p */
    public String mo1005p() {
        return mo174258s(",");
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343799d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343800e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343801f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Name");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343802g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Type");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343803h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343804i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("GreenManFg");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343805j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("QueueFgBool");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343806k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HashCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f343807l);
        return stringBuffer.toString();
    }

    /* renamed from: s */
    public String mo174258s(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f343799d);
        stringBuffer.append(str);
        stringBuffer.append(this.f343800e);
        stringBuffer.append(str);
        stringBuffer.append(this.f343801f);
        stringBuffer.append(str);
        stringBuffer.append(this.f343802g);
        stringBuffer.append(str);
        stringBuffer.append(this.f343803h);
        stringBuffer.append(str);
        stringBuffer.append(this.f343804i);
        stringBuffer.append(str);
        stringBuffer.append(this.f343805j);
        stringBuffer.append(str);
        stringBuffer.append(this.f343806k ? 1 : 0);
        stringBuffer.append(str);
        stringBuffer.append(this.f343807l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    public PageFlowDetailStruct(String str) {
        String[] split;
        boolean z = false;
        if (str != null && (split = str.split(",")) != null) {
            if (split.length < 9) {
                String[] strArr = new String[9];
                Arrays.fill(strArr, 0, 9, "");
                System.arraycopy(split, 0, strArr, 0, split.length);
                split = strArr;
            }
            this.f343799d = Util.getInt(split[0], 0);
            this.f343800e = mo86045b("PName", split[1], true);
            this.f343801f = mo86051k(split[2]);
            this.f343802g = mo86045b("Name", split[3], true);
            this.f343803h = mo86051k(split[4]);
            long k = mo86051k(split[5]);
            this.f343804i = k;
            mo86048e("TimeStampMs", k);
            this.f343805j = mo86051k(split[6]);
            this.f343806k = Util.getInt(split[7], 0) != 0 ? true : z;
            this.f343807l = mo86051k(split[8]);
        }
    }
}

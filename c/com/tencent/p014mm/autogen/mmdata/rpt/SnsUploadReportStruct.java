package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct */
public final class SnsUploadReportStruct extends C61103a {

    /* renamed from: A */
    public String f266186A = "";

    /* renamed from: B */
    public int f266187B = -1;

    /* renamed from: C */
    public String f266188C = "";

    /* renamed from: d */
    public long f266189d;

    /* renamed from: e */
    public long f266190e;

    /* renamed from: f */
    public String f266191f = "";

    /* renamed from: g */
    public long f266192g;

    /* renamed from: h */
    public long f266193h;

    /* renamed from: i */
    public long f266194i;

    /* renamed from: j */
    public long f266195j;

    /* renamed from: k */
    public long f266196k;

    /* renamed from: l */
    public long f266197l;

    /* renamed from: m */
    public long f266198m;

    /* renamed from: n */
    public long f266199n;

    /* renamed from: o */
    public long f266200o;

    /* renamed from: p */
    public long f266201p;

    /* renamed from: q */
    public long f266202q;

    /* renamed from: r */
    public long f266203r;

    /* renamed from: s */
    public long f266204s;

    /* renamed from: t */
    public String f266205t = "";

    /* renamed from: u */
    public int f266206u = -1;

    /* renamed from: v */
    public String f266207v = "";

    /* renamed from: w */
    public int f266208w = -1;

    /* renamed from: x */
    public int f266209x = -1;

    /* renamed from: y */
    public String f266210y = "";

    /* renamed from: z */
    public int f266211z = -1;

    /* renamed from: j */
    public int mo1004j() {
        return 25272;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266189d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266190e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266191f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266192g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266193h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266194i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266195j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266196k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266197l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266198m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266199n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266200o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266201p);
        stringBuffer.append(",");
        stringBuffer.append(this.f266202q);
        stringBuffer.append(",");
        stringBuffer.append(this.f266203r);
        stringBuffer.append(",");
        stringBuffer.append(this.f266204s);
        stringBuffer.append(",");
        stringBuffer.append(this.f266205t);
        stringBuffer.append(",");
        stringBuffer.append(this.f266206u);
        stringBuffer.append(",");
        stringBuffer.append(this.f266207v);
        stringBuffer.append(",");
        stringBuffer.append(this.f266208w);
        stringBuffer.append(",");
        stringBuffer.append(this.f266209x);
        stringBuffer.append(",");
        stringBuffer.append(this.f266210y);
        stringBuffer.append(",");
        stringBuffer.append(this.f266211z);
        stringBuffer.append(",");
        stringBuffer.append(this.f266186A);
        stringBuffer.append(",");
        stringBuffer.append(this.f266187B);
        stringBuffer.append(",");
        stringBuffer.append(this.f266188C);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("LocalId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266189d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266190e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SnsSeverId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266191f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FeedType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266192g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaNumber");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266193h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UploadState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266194i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaLocalId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266195j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNRetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266196k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNRetCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266197l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PostRetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266198m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PostRetCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266199n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TotalCostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266200o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AddSendQueueTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266201p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WaitTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266202q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CDNCostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266203r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PostCostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266204s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Address");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266205t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemindSbCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266206u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemindSbStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266207v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Visibility");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266208w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VisiblePartCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266209x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("VisiblePartStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266210y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InvisiblePartCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266211z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InvisiblePartStr");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266186A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ShareQZone");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266187B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncryptContent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266188C);
        return stringBuffer.toString();
    }
}

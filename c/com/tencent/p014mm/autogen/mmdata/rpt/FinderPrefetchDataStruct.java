package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderPrefetchDataStruct */
public final class FinderPrefetchDataStruct extends C61103a {

    /* renamed from: d */
    public long f155883d;

    /* renamed from: e */
    public long f155884e;

    /* renamed from: f */
    public long f155885f;

    /* renamed from: g */
    public long f155886g;

    /* renamed from: h */
    public long f155887h;

    /* renamed from: i */
    public long f155888i;

    /* renamed from: j */
    public long f155889j;

    /* renamed from: j */
    public int mo1004j() {
        return 23105;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155883d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155884e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155885f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155886g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155887h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155888i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155889j);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("pullType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155883d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("curTabType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155884e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155885f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("abandonReasonType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155886g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("prefetchWithRedDot");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155887h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("rejectPrefetchReasonType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155888i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("localHasPrefetchData");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155889j);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TimelineMissReadJumpBtnClickActionStruct */
public final class TimelineMissReadJumpBtnClickActionStruct extends C61103a {

    /* renamed from: d */
    public String f266398d = "";

    /* renamed from: e */
    public long f266399e;

    /* renamed from: f */
    public long f266400f;

    /* renamed from: g */
    public long f266401g;

    /* renamed from: h */
    public long f266402h;

    /* renamed from: i */
    public String f266403i = "";

    /* renamed from: j */
    public long f266404j;

    /* renamed from: k */
    public String f266405k = "";

    /* renamed from: l */
    public long f266406l;

    /* renamed from: m */
    public long f266407m;

    /* renamed from: n */
    public long f266408n;

    /* renamed from: o */
    public long f266409o;

    /* renamed from: p */
    public long f266410p;

    /* renamed from: j */
    public int mo1004j() {
        return 19056;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266398d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266399e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266400f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266401g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266402h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266403i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266404j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266405k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266406l);
        stringBuffer.append(",");
        stringBuffer.append(this.f266407m);
        stringBuffer.append(",");
        stringBuffer.append(this.f266408n);
        stringBuffer.append(",");
        stringBuffer.append(this.f266409o);
        stringBuffer.append(",");
        stringBuffer.append(this.f266410p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266398d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBtnId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266399e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MissReadJumpBreakLayerId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266400f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsJumpToNearestBreakLayer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266401g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpSkipFeedsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266402h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerFeeds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266403i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerFeedsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266404j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerExposureFeeds");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266405k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("JumpBreakLayerExposureFeedsCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266406l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BreakLayerFirstFeedFromNow");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266407m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Seq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266408n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeq");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266409o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SubSeqSum");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266410p);
        return stringBuffer.toString();
    }
}

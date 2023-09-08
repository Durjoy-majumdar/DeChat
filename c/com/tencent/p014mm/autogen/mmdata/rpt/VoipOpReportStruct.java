package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipOpReportStruct */
public final class VoipOpReportStruct extends C61103a {

    /* renamed from: d */
    public int f310430d;

    /* renamed from: e */
    public int f310431e;

    /* renamed from: f */
    public int f310432f;

    /* renamed from: g */
    public int f310433g;

    /* renamed from: h */
    public int f310434h;

    /* renamed from: i */
    public int f310435i;

    /* renamed from: j */
    public int f310436j;

    /* renamed from: k */
    public int f310437k;

    /* renamed from: l */
    public int f310438l;

    /* renamed from: m */
    public int f310439m;

    /* renamed from: n */
    public int f310440n;

    /* renamed from: o */
    public int f310441o;

    /* renamed from: p */
    public int f310442p;

    /* renamed from: j */
    public int mo1004j() {
        return 25091;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310430d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310431e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310432f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310433g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310434h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310435i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310436j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310437k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310438l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310439m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310440n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310441o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310442p);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310430d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterFullScreenTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310431e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterFullScreenTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310432f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterMiniScreenTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310433g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterMiniScreenTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310434h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice0Times");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310435i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice90TImes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310436j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice180Times");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310437k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice270Times");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310438l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice0TotalTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310439m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice90TotalTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310440n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice180TotalTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310441o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RotateDevice270TotalTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310442p);
        return stringBuffer.toString();
    }
}

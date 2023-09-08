package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipEncoderReportStruct */
public final class VoipEncoderReportStruct extends C61103a {

    /* renamed from: d */
    public int f310374d;

    /* renamed from: e */
    public int f310375e;

    /* renamed from: f */
    public int f310376f;

    /* renamed from: g */
    public int f310377g;

    /* renamed from: h */
    public int f310378h;

    /* renamed from: i */
    public int f310379i;

    /* renamed from: j */
    public int f310380j;

    /* renamed from: k */
    public int f310381k;

    /* renamed from: l */
    public int f310382l;

    /* renamed from: m */
    public int f310383m;

    /* renamed from: n */
    public int f310384n;

    /* renamed from: o */
    public int f310385o;

    /* renamed from: p */
    public int f310386p;

    /* renamed from: q */
    public int f310387q;

    /* renamed from: r */
    public int f310388r;

    /* renamed from: s */
    public int f310389s;

    /* renamed from: t */
    public int f310390t;

    /* renamed from: u */
    public int f310391u;

    /* renamed from: v */
    public int f310392v;

    /* renamed from: w */
    public int f310393w;

    /* renamed from: x */
    public String f310394x = "";

    /* renamed from: y */
    public String f310395y = "";

    /* renamed from: j */
    public int mo1004j() {
        return 25072;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310374d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310375e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310376f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310377g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310378h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310379i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310380j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310381k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310382l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310383m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310384n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310385o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310386p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310387q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310388r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310389s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310390t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310391u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310392v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310393w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310394x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310395y);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Rating");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310374d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode320PTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310375e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode320PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310376f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode480PTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310377g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode480PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310378h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode640PTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310379i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode640Times");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310380j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode720PTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310381k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode720PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310382l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode1080PTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310383m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Encode1080PTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310384n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SoftEncodeTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310385o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HardEncodeTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310386p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SoftEncodeTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310387q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HardEncodeTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310388r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SoftEncodeBadFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310389s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HardEncodeBadFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310390t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoFrameEncodeTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310391u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NoFrameEncodeTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310392v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("totalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310393w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("encodeBitrate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310394x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("encodeFrameRate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310395y);
        return stringBuffer.toString();
    }
}

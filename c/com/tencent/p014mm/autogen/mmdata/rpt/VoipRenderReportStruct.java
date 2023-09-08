package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipRenderReportStruct */
public final class VoipRenderReportStruct extends C61103a {

    /* renamed from: A */
    public int f310474A;

    /* renamed from: B */
    public int f310475B;

    /* renamed from: C */
    public int f310476C;

    /* renamed from: D */
    public int f310477D;

    /* renamed from: E */
    public int f310478E;

    /* renamed from: F */
    public int f310479F;

    /* renamed from: G */
    public String f310480G = "";

    /* renamed from: H */
    public String f310481H = "";

    /* renamed from: I */
    public String f310482I = "";

    /* renamed from: J */
    public String f310483J = "";

    /* renamed from: d */
    public long f310484d;

    /* renamed from: e */
    public int f310485e;

    /* renamed from: f */
    public int f310486f;

    /* renamed from: g */
    public long f310487g;

    /* renamed from: h */
    public int f310488h;

    /* renamed from: i */
    public int f310489i;

    /* renamed from: j */
    public int f310490j;

    /* renamed from: k */
    public String f310491k = "";

    /* renamed from: l */
    public String f310492l = "";

    /* renamed from: m */
    public String f310493m = "";

    /* renamed from: n */
    public String f310494n = "";

    /* renamed from: o */
    public String f310495o = "";

    /* renamed from: p */
    public String f310496p = "";

    /* renamed from: q */
    public int f310497q;

    /* renamed from: r */
    public int f310498r;

    /* renamed from: s */
    public int f310499s;

    /* renamed from: t */
    public int f310500t;

    /* renamed from: u */
    public int f310501u;

    /* renamed from: v */
    public int f310502v;

    /* renamed from: w */
    public int f310503w;

    /* renamed from: x */
    public int f310504x;

    /* renamed from: y */
    public int f310505y;

    /* renamed from: z */
    public int f310506z;

    /* renamed from: j */
    public int mo1004j() {
        return 25081;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f310484d);
        stringBuffer.append(",");
        stringBuffer.append(this.f310485e);
        stringBuffer.append(",");
        stringBuffer.append(this.f310486f);
        stringBuffer.append(",");
        stringBuffer.append(this.f310487g);
        stringBuffer.append(",");
        stringBuffer.append(this.f310488h);
        stringBuffer.append(",");
        stringBuffer.append(this.f310489i);
        stringBuffer.append(",");
        stringBuffer.append(this.f310490j);
        stringBuffer.append(",");
        stringBuffer.append(this.f310491k);
        stringBuffer.append(",");
        stringBuffer.append(this.f310492l);
        stringBuffer.append(",");
        stringBuffer.append(this.f310493m);
        stringBuffer.append(",");
        stringBuffer.append(this.f310494n);
        stringBuffer.append(",");
        stringBuffer.append(this.f310495o);
        stringBuffer.append(",");
        stringBuffer.append(this.f310496p);
        stringBuffer.append(",");
        stringBuffer.append(this.f310497q);
        stringBuffer.append(",");
        stringBuffer.append(this.f310498r);
        stringBuffer.append(",");
        stringBuffer.append(this.f310499s);
        stringBuffer.append(",");
        stringBuffer.append(this.f310500t);
        stringBuffer.append(",");
        stringBuffer.append(this.f310501u);
        stringBuffer.append(",");
        stringBuffer.append(this.f310502v);
        stringBuffer.append(",");
        stringBuffer.append(this.f310503w);
        stringBuffer.append(",");
        stringBuffer.append(this.f310504x);
        stringBuffer.append(",");
        stringBuffer.append(this.f310505y);
        stringBuffer.append(",");
        stringBuffer.append(this.f310506z);
        stringBuffer.append(",");
        stringBuffer.append(this.f310474A);
        stringBuffer.append(",");
        stringBuffer.append(this.f310475B);
        stringBuffer.append(",");
        stringBuffer.append(this.f310476C);
        stringBuffer.append(",");
        stringBuffer.append(this.f310477D);
        stringBuffer.append(",");
        stringBuffer.append(this.f310478E);
        stringBuffer.append(",");
        stringBuffer.append(this.f310479F);
        stringBuffer.append(",");
        stringBuffer.append(this.f310480G);
        stringBuffer.append(",");
        stringBuffer.append(this.f310481H);
        stringBuffer.append(",");
        stringBuffer.append(this.f310482I);
        stringBuffer.append(",");
        stringBuffer.append(this.f310483J);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310484d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Rating");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310485e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DeocdeHardTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310486f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UseFaceBeauty");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310487g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DecodeHardTotalTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310488h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DecodeSoftTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310489i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DecodeSoftTotalTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310490j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalDrawSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310491k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalTextureSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310492l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteDrawSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310493m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteTextureSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310494n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalRotate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310495o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteRotate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310496p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalSourceNoFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310497q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalSourceNoFrameTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310498r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalOnScreenNoFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310499s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalOnScreenNoFrameTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310500t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteSourceNoFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310501u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteSourceNoFrameTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310502v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteOnScreenNoFrameTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310503w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteOnScreenNoFrameTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310504x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalTextureSizeErrorTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310505y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalTextureSizeErrorTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310506z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalDrawSizeErrorTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310474A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalDrawSizeErrorTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310475B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteTextureSizeErrorTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310476C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteTextureSizeErrorTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310477D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteDrawSizeErrorTimes");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310478E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteDrawSizeErrorTotalTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310479F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LocalFrameInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310480G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RemoteFrameInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310481H);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("DecodeFrameInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310482I);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EncodeFrameInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f310483J);
        return stringBuffer.toString();
    }
}

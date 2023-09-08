package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WC_MOMENTS_INPUT_ARER_LOGStruct */
public final class WC_MOMENTS_INPUT_ARER_LOGStruct extends C61103a {

    /* renamed from: d */
    public int f266547d;

    /* renamed from: e */
    public String f266548e = "";

    /* renamed from: f */
    public String f266549f = "";

    /* renamed from: g */
    public String f266550g = "";

    /* renamed from: h */
    public int f266551h;

    /* renamed from: i */
    public int f266552i;

    /* renamed from: j */
    public int f266553j;

    /* renamed from: k */
    public String f266554k = "";

    /* renamed from: l */
    public int f266555l;

    /* renamed from: j */
    public int mo1004j() {
        return 27790;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f266547d);
        stringBuffer.append(",");
        stringBuffer.append(this.f266548e);
        stringBuffer.append(",");
        stringBuffer.append(this.f266549f);
        stringBuffer.append(",");
        stringBuffer.append(this.f266550g);
        stringBuffer.append(",");
        stringBuffer.append(this.f266551h);
        stringBuffer.append(",");
        stringBuffer.append(this.f266552i);
        stringBuffer.append(",");
        stringBuffer.append(this.f266553j);
        stringBuffer.append(",");
        stringBuffer.append(this.f266554k);
        stringBuffer.append(",");
        stringBuffer.append(this.f266555l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("contextType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266547d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266548e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266549f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266550g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("opResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266551h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("wordCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266552i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lineCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266553j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("contextScreenHeightRatio");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266554k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("wordLimiedToastCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f266555l);
        return stringBuffer.toString();
    }
}

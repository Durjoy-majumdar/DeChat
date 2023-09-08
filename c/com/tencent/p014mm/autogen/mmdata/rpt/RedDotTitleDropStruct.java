package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RedDotTitleDropStruct */
public final class RedDotTitleDropStruct extends C61103a {

    /* renamed from: d */
    public long f156777d;

    /* renamed from: e */
    public String f156778e = "";

    /* renamed from: f */
    public String f156779f = "";

    /* renamed from: g */
    public String f156780g = "";

    /* renamed from: h */
    public String f156781h = "";

    /* renamed from: i */
    public long f156782i;

    /* renamed from: j */
    public long f156783j;

    /* renamed from: k */
    public String f156784k = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23363;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f156777d);
        stringBuffer.append(",");
        stringBuffer.append(this.f156778e);
        stringBuffer.append(",");
        stringBuffer.append(this.f156779f);
        stringBuffer.append(",");
        stringBuffer.append(this.f156780g);
        stringBuffer.append(",");
        stringBuffer.append(this.f156781h);
        stringBuffer.append(",");
        stringBuffer.append(this.f156782i);
        stringBuffer.append(",");
        stringBuffer.append(this.f156783j);
        stringBuffer.append(",");
        stringBuffer.append(this.f156784k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("reddotCtrlType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156777d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("redDotTipsId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156778e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156779f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("reportText");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156780g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156781h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156782i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("dropReason");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156783j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showInfoPath");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f156784k);
        return stringBuffer.toString();
    }
}

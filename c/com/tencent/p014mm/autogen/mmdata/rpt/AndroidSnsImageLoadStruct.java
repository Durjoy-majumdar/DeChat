package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidSnsImageLoadStruct */
public final class AndroidSnsImageLoadStruct extends C61103a {

    /* renamed from: d */
    public String f265302d = "";

    /* renamed from: e */
    public String f265303e = "";

    /* renamed from: f */
    public int f265304f;

    /* renamed from: g */
    public String f265305g = "";

    /* renamed from: h */
    public int f265306h;

    /* renamed from: i */
    public int f265307i;

    /* renamed from: j */
    public int f265308j = -1;

    /* renamed from: k */
    public String f265309k = "";

    /* renamed from: l */
    public int f265310l;

    /* renamed from: m */
    public String f265311m = "";

    /* renamed from: n */
    public String f265312n = "";

    /* renamed from: o */
    public String f265313o = "";

    /* renamed from: p */
    public int f265314p = 0;

    /* renamed from: q */
    public int f265315q = 0;

    /* renamed from: r */
    public int f265316r = -1;

    /* renamed from: s */
    public String f265317s = "";

    /* renamed from: t */
    public String f265318t = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23151;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265302d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265303e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265304f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265305g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265306h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265307i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265308j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265309k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265310l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265311m);
        stringBuffer.append(",");
        stringBuffer.append(this.f265312n);
        stringBuffer.append(",");
        stringBuffer.append(this.f265313o);
        stringBuffer.append(",");
        stringBuffer.append(this.f265314p);
        stringBuffer.append(",");
        stringBuffer.append(this.f265315q);
        stringBuffer.append(",");
        stringBuffer.append(this.f265316r);
        stringBuffer.append(",");
        stringBuffer.append(this.f265317s);
        stringBuffer.append(",");
        stringBuffer.append(this.f265318t);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265302d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MediaID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265303e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("RequestType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265304f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265305g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isBatchDownload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265306h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(IXWebBroadcastListener.STAGE_TAG);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265307i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cdnRetCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265308j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stageCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265309k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isAd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265310l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enqueueQueueSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265311m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("startDownloadQueueSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265312n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("callbackUIQueueSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265313o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("startImageLoaderQueueSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265314p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("finishedImageLoaderQueueSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265315q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(DownloadInfo.NETTYPE);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265316r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265317s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bizName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265318t);
        return stringBuffer.toString();
    }
}

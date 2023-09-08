package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStateFriendTopicListStruct */
public final class TextStateFriendTopicListStruct extends C61103a {

    /* renamed from: d */
    public String f194511d = "";

    /* renamed from: e */
    public long f194512e;

    /* renamed from: f */
    public String f194513f = "";

    /* renamed from: g */
    public String f194514g = "";

    /* renamed from: h */
    public int f194515h;

    /* renamed from: i */
    public String f194516i = "";

    /* renamed from: j */
    public long f194517j;

    /* renamed from: k */
    public long f194518k;

    /* renamed from: l */
    public long f194519l;

    /* renamed from: m */
    public String f194520m = "";

    /* renamed from: n */
    public long f194521n;

    /* renamed from: o */
    public long f194522o;

    /* renamed from: p */
    public String f194523p = "";

    /* renamed from: q */
    public long f194524q;

    /* renamed from: r */
    public String f194525r = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22663;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194511d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194512e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194513f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194514g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194515h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194516i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194517j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194518k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194519l);
        stringBuffer.append(",");
        stringBuffer.append(this.f194520m);
        stringBuffer.append(",");
        stringBuffer.append(this.f194521n);
        stringBuffer.append(",");
        stringBuffer.append(this.f194522o);
        stringBuffer.append(",");
        stringBuffer.append(this.f194523p);
        stringBuffer.append(",");
        stringBuffer.append(this.f194524q);
        stringBuffer.append(",");
        stringBuffer.append(this.f194525r);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194511d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194512e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IconID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194513f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ToUsername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194514g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SameStatusUsersCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194515h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UvPerIcon");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194516i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Source");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194517j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ReddotType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194518k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSameTopic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194519l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneSessionID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194520m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SceneStaytime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194521n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ClusterMethod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194522o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CustomTitle");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194523p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IconType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194524q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ContentList");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194525r);
        return stringBuffer.toString();
    }
}

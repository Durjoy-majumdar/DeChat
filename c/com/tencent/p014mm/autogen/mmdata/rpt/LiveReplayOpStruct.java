package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LiveReplayOpStruct */
public final class LiveReplayOpStruct extends C61103a {

    /* renamed from: d */
    public String f265655d = "";

    /* renamed from: e */
    public long f265656e;

    /* renamed from: f */
    public String f265657f = "";

    /* renamed from: g */
    public String f265658g = "";

    /* renamed from: h */
    public long f265659h;

    /* renamed from: i */
    public long f265660i;

    /* renamed from: j */
    public long f265661j;

    /* renamed from: k */
    public long f265662k;

    /* renamed from: j */
    public int mo1004j() {
        return 19898;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265655d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265656e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265657f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265658g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265659h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265660i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265661j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265662k);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("roomid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265655d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265656e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("topic");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265657f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveusername");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265658g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265659h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("roomRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265660i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("wholeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265661j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("viewTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265662k);
        return stringBuffer.toString();
    }
}

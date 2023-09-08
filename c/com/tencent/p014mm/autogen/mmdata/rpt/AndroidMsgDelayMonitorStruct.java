package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidMsgDelayMonitorStruct */
public final class AndroidMsgDelayMonitorStruct extends C61103a {

    /* renamed from: d */
    public long f48148d;

    /* renamed from: e */
    public long f48149e;

    /* renamed from: f */
    public String f48150f = "";

    /* renamed from: g */
    public long f48151g;

    /* renamed from: h */
    public int f48152h;

    /* renamed from: i */
    public int f48153i;

    /* renamed from: j */
    public int f48154j;

    /* renamed from: k */
    public int f48155k;

    /* renamed from: l */
    public int f48156l;

    /* renamed from: m */
    public int f48157m;

    /* renamed from: n */
    public int f48158n;

    /* renamed from: o */
    public int f48159o;

    /* renamed from: p */
    public int f48160p;

    /* renamed from: q */
    public int f48161q;

    /* renamed from: r */
    public String f48162r = "";

    /* renamed from: s */
    public String f48163s = "";

    /* renamed from: j */
    public int mo1004j() {
        return 28549;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48148d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48149e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48150f);
        stringBuffer.append(",");
        stringBuffer.append(this.f48151g);
        stringBuffer.append(",");
        stringBuffer.append(this.f48152h);
        stringBuffer.append(",");
        stringBuffer.append(this.f48153i);
        stringBuffer.append(",");
        stringBuffer.append(this.f48154j);
        stringBuffer.append(",");
        stringBuffer.append(this.f48155k);
        stringBuffer.append(",");
        stringBuffer.append(this.f48156l);
        stringBuffer.append(",");
        stringBuffer.append(this.f48157m);
        stringBuffer.append(",");
        stringBuffer.append(this.f48158n);
        stringBuffer.append(",");
        stringBuffer.append(this.f48159o);
        stringBuffer.append(",");
        stringBuffer.append(this.f48160p);
        stringBuffer.append(",");
        stringBuffer.append(this.f48161q);
        stringBuffer.append(",");
        stringBuffer.append(this.f48162r);
        stringBuffer.append(",");
        stringBuffer.append(this.f48163s);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MsgType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48148d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgDelaySecond");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48149e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgTalker");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48150f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InnerVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48151g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessStatus");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48152h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromCurrentProcessMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48153i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromLastProcessMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48154j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromLastDeepBackgroundMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48155k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromLastForegroundMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48156l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromLastScreenMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48157m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromLastNetworkMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48158n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FromLastTickMin");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48159o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("TickRate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48160p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NetworkTickRate");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48161q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgSvrId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48162r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48163s);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLivePerformanceDataStruct */
public final class FinderLivePerformanceDataStruct extends C61103a {

    /* renamed from: d */
    public long f155568d;

    /* renamed from: e */
    public long f155569e;

    /* renamed from: f */
    public long f155570f;

    /* renamed from: g */
    public long f155571g;

    /* renamed from: h */
    public long f155572h;

    /* renamed from: i */
    public long f155573i;

    /* renamed from: j */
    public long f155574j;

    /* renamed from: k */
    public int f155575k;

    /* renamed from: l */
    public long f155576l;

    /* renamed from: m */
    public String f155577m = "";

    /* renamed from: n */
    public long f155578n;

    /* renamed from: o */
    public String f155579o = "";

    /* renamed from: j */
    public int mo1004j() {
        return 23799;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155568d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155569e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155570f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155571g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155572h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155573i);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f155574j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155575k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155576l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155577m);
        stringBuffer.append(",");
        stringBuffer.append(this.f155578n);
        stringBuffer.append(",");
        stringBuffer.append(this.f155579o);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sceneType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155568d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actionType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155569e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("firstFrameTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155570f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("startPlayTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155571g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("connectTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155572h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("connectToDecodeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155573i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("decodeTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("playTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155574j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFirstLivePreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155575k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("startPlayToFrameTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155576l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("snn");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155577m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("liveid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155578n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("data");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155579o);
        return stringBuffer.toString();
    }
}

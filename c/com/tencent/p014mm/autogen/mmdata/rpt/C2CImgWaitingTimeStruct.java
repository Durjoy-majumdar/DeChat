package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct */
public final class C2CImgWaitingTimeStruct extends C61103a {

    /* renamed from: d */
    public String f265342d = "";

    /* renamed from: e */
    public long f265343e = 0;

    /* renamed from: f */
    public long f265344f = 0;

    /* renamed from: g */
    public long f265345g = 0;

    /* renamed from: h */
    public boolean f265346h;

    /* renamed from: i */
    public long f265347i = 0;

    /* renamed from: j */
    public long f265348j = 0;

    /* renamed from: k */
    public long f265349k = 0;

    /* renamed from: l */
    public long f265350l = 0;

    /* renamed from: m */
    public long f265351m = 0;

    /* renamed from: n */
    public C92612a f265352n;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct$a */
    public enum C92612a {
        ok(0),
        cancel(1),
        error(2);
        

        /* renamed from: d */
        public final int f265357d;

        /* access modifiers changed from: public */
        C92612a(int i) {
            this.f265357d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 15749;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265342d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265343e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265344f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265345g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265346h ? 1 : 0);
        stringBuffer.append(",");
        stringBuffer.append(this.f265347i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265348j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265349k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265350l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265351m);
        stringBuffer.append(",");
        C92612a aVar = this.f265352n;
        stringBuffer.append(aVar != null ? aVar.f265357d : -1);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265342d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265343e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgSvrId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265344f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgCreateTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265345g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsHdImgBool");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265346h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImgSize");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265347i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImgWidth");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265348j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ImgHeight");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265349k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartDownloadTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265350l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinishDownloadTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265351m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("FinishCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265352n);
        return stringBuffer.toString();
    }
}

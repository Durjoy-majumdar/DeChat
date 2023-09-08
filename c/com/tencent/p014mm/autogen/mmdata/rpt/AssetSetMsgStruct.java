package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AssetSetMsgStruct */
public final class AssetSetMsgStruct extends C61103a {

    /* renamed from: d */
    public long f265319d;

    /* renamed from: e */
    public String f265320e = "";

    /* renamed from: f */
    public String f265321f = "";

    /* renamed from: g */
    public String f265322g = "";

    /* renamed from: h */
    public long f265323h;

    /* renamed from: i */
    public long f265324i;

    /* renamed from: j */
    public long f265325j;

    /* renamed from: k */
    public long f265326k;

    /* renamed from: l */
    public long f265327l;

    /* renamed from: m */
    public String f265328m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 27985;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f265319d);
        stringBuffer.append(",");
        stringBuffer.append(this.f265320e);
        stringBuffer.append(",");
        stringBuffer.append(this.f265321f);
        stringBuffer.append(",");
        stringBuffer.append(this.f265322g);
        stringBuffer.append(",");
        stringBuffer.append(this.f265323h);
        stringBuffer.append(",");
        stringBuffer.append(this.f265324i);
        stringBuffer.append(",");
        stringBuffer.append(this.f265325j);
        stringBuffer.append(",");
        stringBuffer.append(this.f265326k);
        stringBuffer.append(",");
        stringBuffer.append(this.f265327l);
        stringBuffer.append(",");
        stringBuffer.append(this.f265328m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265319d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ActionElements");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265320e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265321f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MsgID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265322g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CollectionImageCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265323h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CollectionVideoCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265324i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("UserRole");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265325j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsSentWhenEnter");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265326k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EnterScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265327l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Uuid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f265328m);
        return stringBuffer.toString();
    }
}

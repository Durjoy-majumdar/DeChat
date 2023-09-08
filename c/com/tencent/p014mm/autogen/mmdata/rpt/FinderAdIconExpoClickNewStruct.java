package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderAdIconExpoClickNewStruct */
public final class FinderAdIconExpoClickNewStruct extends C61103a {

    /* renamed from: d */
    public String f155022d = "";

    /* renamed from: e */
    public long f155023e;

    /* renamed from: f */
    public long f155024f;

    /* renamed from: g */
    public long f155025g;

    /* renamed from: h */
    public String f155026h = "";

    /* renamed from: i */
    public String f155027i = "";

    /* renamed from: j */
    public String f155028j = "";

    /* renamed from: k */
    public String f155029k = "";

    /* renamed from: l */
    public String f155030l = "";

    /* renamed from: m */
    public String f155031m = "";

    /* renamed from: j */
    public int mo1004j() {
        return 22955;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f155022d);
        stringBuffer.append(",");
        stringBuffer.append(this.f155023e);
        stringBuffer.append(",");
        stringBuffer.append(this.f155024f);
        stringBuffer.append(",");
        stringBuffer.append(this.f155025g);
        stringBuffer.append(",");
        stringBuffer.append(this.f155026h);
        stringBuffer.append(",");
        stringBuffer.append(this.f155027i);
        stringBuffer.append(",");
        stringBuffer.append(this.f155028j);
        stringBuffer.append(",");
        stringBuffer.append(this.f155029k);
        stringBuffer.append(",");
        stringBuffer.append(this.f155030l);
        stringBuffer.append(",");
        stringBuffer.append(this.f155031m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("feedid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155022d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("commentscene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155023e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IconType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155024f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("actiontype");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155025g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("feedplayinfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155026h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MutualAdInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155027i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sessionbuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155028j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Contextid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155029k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ExtraInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155030l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("enterSourceInfo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f155031m);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AtUserSelectionStruct */
public final class AtUserSelectionStruct extends C61103a {

    /* renamed from: d */
    public String f194133d = "";

    /* renamed from: e */
    public long f194134e;

    /* renamed from: f */
    public long f194135f;

    /* renamed from: g */
    public long f194136g;

    /* renamed from: h */
    public long f194137h;

    /* renamed from: i */
    public long f194138i;

    /* renamed from: j */
    public long f194139j;

    /* renamed from: k */
    public long f194140k;

    /* renamed from: l */
    public long f194141l;

    /* renamed from: j */
    public int mo1004j() {
        return 22597;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f194133d);
        stringBuffer.append(",");
        stringBuffer.append(this.f194134e);
        stringBuffer.append(",");
        stringBuffer.append(this.f194135f);
        stringBuffer.append(",");
        stringBuffer.append(this.f194136g);
        stringBuffer.append(",");
        stringBuffer.append(this.f194137h);
        stringBuffer.append(",");
        stringBuffer.append(this.f194138i);
        stringBuffer.append(",");
        stringBuffer.append(this.f194139j);
        stringBuffer.append(",");
        stringBuffer.append(this.f194140k);
        stringBuffer.append(",");
        stringBuffer.append(this.f194141l);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ChatName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194133d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Role");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194134e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MemberCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194135f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Action");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194136g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("abcClickCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194137h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasSearch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194138i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("IsInRefMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194139j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MultiSelectedUV");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194140k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("MultiSelectedContainsRefUser");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f194141l);
        return stringBuffer.toString();
    }
}

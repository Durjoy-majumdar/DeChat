package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct */
public final class DiscoverViewEntranceSettingStruct extends C61103a {

    /* renamed from: d */
    public long f48274d = 0;

    /* renamed from: e */
    public long f48275e = 0;

    /* renamed from: f */
    public long f48276f;

    /* renamed from: j */
    public int mo1004j() {
        return 15185;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f48274d);
        stringBuffer.append(",");
        stringBuffer.append(this.f48275e);
        stringBuffer.append(",");
        stringBuffer.append(this.f48276f);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EntranceID");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48274d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SettingEvent");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48275e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("settingMethod");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f48276f);
        return stringBuffer.toString();
    }
}

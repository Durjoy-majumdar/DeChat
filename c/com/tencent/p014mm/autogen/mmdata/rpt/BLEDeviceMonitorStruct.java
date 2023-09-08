package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BLEDeviceMonitorStruct */
public final class BLEDeviceMonitorStruct extends C61103a {

    /* renamed from: d */
    public long f236365d;

    /* renamed from: e */
    public String f236366e = "";

    /* renamed from: f */
    public long f236367f = 0;

    /* renamed from: g */
    public long f236368g;

    /* renamed from: h */
    public String f236369h = "";

    /* renamed from: i */
    public String f236370i = "";

    /* renamed from: j */
    public String f236371j = "";

    /* renamed from: k */
    public String f236372k = "";

    /* renamed from: l */
    public String f236373l = "";

    /* renamed from: m */
    public long f236374m;

    /* renamed from: j */
    public int mo1004j() {
        return 25092;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236365d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236366e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236367f);
        stringBuffer.append(",");
        stringBuffer.append(this.f236368g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236369h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236370i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236371j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236372k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236373l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236374m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Event");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236365d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236366e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236367f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236368g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Sn");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236369h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("BluetoothDeviceid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236370i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EntryPackage");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236371j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236372k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236373l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartErrCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236374m);
        return stringBuffer.toString();
    }
}

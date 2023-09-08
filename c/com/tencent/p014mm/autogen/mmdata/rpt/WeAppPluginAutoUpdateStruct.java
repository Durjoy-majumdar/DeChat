package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct */
public final class WeAppPluginAutoUpdateStruct extends C61103a {

    /* renamed from: d */
    public String f236613d = "";

    /* renamed from: e */
    public long f236614e;

    /* renamed from: f */
    public C80753a f236615f;

    /* renamed from: g */
    public long f236616g;

    /* renamed from: h */
    public String f236617h = "";

    /* renamed from: i */
    public C80754b f236618i;

    /* renamed from: j */
    public String f236619j = "";

    /* renamed from: k */
    public String f236620k = "";

    /* renamed from: l */
    public long f236621l;

    /* renamed from: m */
    public long f236622m;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct$a */
    public enum C80753a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236627d;

        /* access modifiers changed from: public */
        C80753a(int i) {
            this.f236627d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPluginAutoUpdateStruct$b */
    public enum C80754b {
        release(1);
        

        /* renamed from: d */
        public final int f236630d;

        /* access modifiers changed from: public */
        C80754b(int i) {
            this.f236630d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 19280;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236613d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236614e);
        stringBuffer.append(",");
        C80753a aVar = this.f236615f;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f236627d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236616g);
        stringBuffer.append(",");
        stringBuffer.append(this.f236617h);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        C80754b bVar = this.f236618i;
        if (bVar != null) {
            i = bVar.f236630d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236619j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236620k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236621l);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f236622m);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236613d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236614e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236615f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236616g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PluginAppid");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236617h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PluginVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PluginState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236618i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236619j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236620k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236621l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("updateScene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("updateResult");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236622m);
        return stringBuffer.toString();
    }
}

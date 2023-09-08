package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPreDownloadStruct */
public final class WeAppPreDownloadStruct extends C61103a {

    /* renamed from: d */
    public String f236631d = "";

    /* renamed from: e */
    public String f236632e = "";

    /* renamed from: f */
    public long f236633f = 0;

    /* renamed from: g */
    public C80755a f236634g;

    /* renamed from: h */
    public C80756b f236635h;

    /* renamed from: i */
    public long f236636i = 0;

    /* renamed from: j */
    public long f236637j = 0;

    /* renamed from: k */
    public long f236638k = 0;

    /* renamed from: l */
    public long f236639l = 0;

    /* renamed from: m */
    public long f236640m = 0;

    /* renamed from: n */
    public long f236641n = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPreDownloadStruct$a */
    public enum C80755a {
        release(1),
        debug(2),
        test(3);
        

        /* renamed from: d */
        public final int f236646d;

        /* access modifiers changed from: public */
        C80755a(int i) {
            this.f236646d = i;
        }
    }

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPreDownloadStruct$b */
    public enum C80756b {
        undefined(0),
        normal(1000),
        plugin(1001),
        wxstore(1002),
        merchant(1003),
        wagame(1004),
        gift(1005);
        

        /* renamed from: d */
        public final int f236655d;

        /* access modifiers changed from: public */
        C80756b(int i) {
            this.f236655d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16602;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236631d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236632e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236633f);
        stringBuffer.append(",");
        C80755a aVar = this.f236634g;
        int i = -1;
        stringBuffer.append(aVar != null ? aVar.f236646d : -1);
        stringBuffer.append(",");
        C80756b bVar = this.f236635h;
        if (bVar != null) {
            i = bVar.f236655d;
        }
        stringBuffer.append(i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236636i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236637j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236638k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236639l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236640m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236641n);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SessionId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236631d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236632e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236633f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236634g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236635h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236636i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreloadKey");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236637j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("PreloadValue");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236638k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isDownloadCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236639l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236640m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("hasSplashScreen");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236641n);
        return stringBuffer.toString();
    }
}

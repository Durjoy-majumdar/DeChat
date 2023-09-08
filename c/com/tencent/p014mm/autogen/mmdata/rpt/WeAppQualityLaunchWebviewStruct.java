package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.tinker.loader.SystemClassLoaderAdder;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct */
public final class WeAppQualityLaunchWebviewStruct extends C61103a {

    /* renamed from: A */
    public long f236881A;

    /* renamed from: B */
    public long f236882B;

    /* renamed from: C */
    public long f236883C;

    /* renamed from: D */
    public String f236884D = "";

    /* renamed from: E */
    public long f236885E;

    /* renamed from: F */
    public long f236886F;

    /* renamed from: G */
    public long f236887G;

    /* renamed from: H */
    public long f236888H = 0;

    /* renamed from: I */
    public String f236889I = "";

    /* renamed from: d */
    public String f236890d = "";

    /* renamed from: e */
    public String f236891e = "";

    /* renamed from: f */
    public long f236892f = 0;

    /* renamed from: g */
    public C80768a f236893g;

    /* renamed from: h */
    public long f236894h = 0;

    /* renamed from: i */
    public long f236895i = 0;

    /* renamed from: j */
    public long f236896j = 0;

    /* renamed from: k */
    public long f236897k = 0;

    /* renamed from: l */
    public long f236898l = 0;

    /* renamed from: m */
    public String f236899m = "";

    /* renamed from: n */
    public long f236900n = 0;

    /* renamed from: o */
    public long f236901o = 0;

    /* renamed from: p */
    public long f236902p = 0;

    /* renamed from: q */
    public long f236903q = 0;

    /* renamed from: r */
    public String f236904r = "";

    /* renamed from: s */
    public long f236905s = 0;

    /* renamed from: t */
    public long f236906t = 0;

    /* renamed from: u */
    public long f236907u = 0;

    /* renamed from: v */
    public long f236908v = 0;

    /* renamed from: w */
    public String f236909w = "";

    /* renamed from: x */
    public long f236910x;

    /* renamed from: y */
    public long f236911y;

    /* renamed from: z */
    public long f236912z;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchWebviewStruct$a */
    public enum C80768a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f236917d;

        /* access modifiers changed from: public */
        C80768a(int i) {
            this.f236917d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16009;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f236890d);
        stringBuffer.append(",");
        stringBuffer.append(this.f236891e);
        stringBuffer.append(",");
        stringBuffer.append(this.f236892f);
        stringBuffer.append(",");
        C80768a aVar = this.f236893g;
        stringBuffer.append(aVar != null ? aVar.f236917d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f236894h);
        stringBuffer.append(",");
        stringBuffer.append(this.f236895i);
        stringBuffer.append(",");
        stringBuffer.append(this.f236896j);
        stringBuffer.append(",");
        stringBuffer.append(this.f236897k);
        stringBuffer.append(",");
        stringBuffer.append(this.f236898l);
        stringBuffer.append(",");
        stringBuffer.append(this.f236899m);
        stringBuffer.append(",");
        stringBuffer.append(this.f236900n);
        stringBuffer.append(",");
        stringBuffer.append(this.f236901o);
        stringBuffer.append(",");
        stringBuffer.append(this.f236902p);
        stringBuffer.append(",");
        stringBuffer.append(this.f236903q);
        stringBuffer.append(",");
        stringBuffer.append(this.f236904r);
        stringBuffer.append(",");
        stringBuffer.append(this.f236905s);
        stringBuffer.append(",");
        stringBuffer.append(this.f236906t);
        stringBuffer.append(",");
        stringBuffer.append(this.f236907u);
        stringBuffer.append(",");
        stringBuffer.append(this.f236908v);
        stringBuffer.append(",");
        stringBuffer.append(this.f236909w);
        stringBuffer.append(",");
        stringBuffer.append(this.f236910x);
        stringBuffer.append(",");
        stringBuffer.append(this.f236911y);
        stringBuffer.append(",");
        stringBuffer.append(this.f236912z);
        stringBuffer.append(",");
        stringBuffer.append(this.f236881A);
        stringBuffer.append(",");
        stringBuffer.append(this.f236882B);
        stringBuffer.append(",");
        stringBuffer.append(this.f236883C);
        stringBuffer.append(",");
        stringBuffer.append(this.f236884D);
        stringBuffer.append(",");
        stringBuffer.append(this.f236885E);
        stringBuffer.append(",");
        stringBuffer.append(this.f236886F);
        stringBuffer.append(",");
        stringBuffer.append(this.f236887G);
        stringBuffer.append(",");
        stringBuffer.append(this.f236888H);
        stringBuffer.append(",");
        stringBuffer.append(this.f236889I);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236890d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236891e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236892f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236893g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236894h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236895i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236896j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236897k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236898l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("path");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236899m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isDownloadCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236900n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(SystemClassLoaderAdder.CHECK_DEX_FIELD);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236901o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreload");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236902p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreloadPageFrame");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236903q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236904r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isSplitCodeLib");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236905s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("initProcess");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236906t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isFirstPageRenderingCacheAccepted");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236907u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showAd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236908v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("libVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236909w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("canShowLoadingAdvert");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236910x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("LoadingInEndT");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236911y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runningState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236912z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreloadSo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236881A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("webviewType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236882B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("WeakNetType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236883C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236884D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runtimeNo");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236885E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("ProcessModel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236886F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("lazyCodeLoading");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236887G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("HasTinkerPatch");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236888H);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("NickName");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f236889I);
        return stringBuffer.toString();
    }
}

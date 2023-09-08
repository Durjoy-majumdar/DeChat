package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct */
public final class WeAppQualitySplashAdStruct extends C61103a {

    /* renamed from: A */
    public long f237076A;

    /* renamed from: B */
    public long f237077B;

    /* renamed from: C */
    public int f237078C = -1;

    /* renamed from: D */
    public long f237079D;

    /* renamed from: E */
    public long f237080E = 0;

    /* renamed from: F */
    public long f237081F;

    /* renamed from: G */
    public long f237082G;

    /* renamed from: H */
    public long f237083H;

    /* renamed from: I */
    public long f237084I;

    /* renamed from: J */
    public long f237085J;

    /* renamed from: K */
    public long f237086K;

    /* renamed from: L */
    public long f237087L;

    /* renamed from: M */
    public long f237088M;

    /* renamed from: N */
    public long f237089N = 0;

    /* renamed from: O */
    public long f237090O;

    /* renamed from: P */
    public String f237091P = "";

    /* renamed from: Q */
    public long f237092Q;

    /* renamed from: R */
    public long f237093R = 2;

    /* renamed from: S */
    public long f237094S;

    /* renamed from: d */
    public String f237095d = "";

    /* renamed from: e */
    public String f237096e = "";

    /* renamed from: f */
    public long f237097f = 0;

    /* renamed from: g */
    public C80774a f237098g;

    /* renamed from: h */
    public long f237099h = 0;

    /* renamed from: i */
    public long f237100i = 0;

    /* renamed from: j */
    public long f237101j = 0;

    /* renamed from: k */
    public long f237102k = 0;

    /* renamed from: l */
    public long f237103l = 0;

    /* renamed from: m */
    public long f237104m;

    /* renamed from: n */
    public long f237105n;

    /* renamed from: o */
    public long f237106o;

    /* renamed from: p */
    public long f237107p;

    /* renamed from: q */
    public long f237108q;

    /* renamed from: r */
    public long f237109r;

    /* renamed from: s */
    public long f237110s;

    /* renamed from: t */
    public long f237111t;

    /* renamed from: u */
    public long f237112u;

    /* renamed from: v */
    public long f237113v;

    /* renamed from: w */
    public long f237114w;

    /* renamed from: x */
    public long f237115x;

    /* renamed from: y */
    public long f237116y;

    /* renamed from: z */
    public long f237117z;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashAdStruct$a */
    public enum C80774a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237122d;

        /* access modifiers changed from: public */
        C80774a(int i) {
            this.f237122d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 18859;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237095d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237096e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237097f);
        stringBuffer.append(",");
        C80774a aVar = this.f237098g;
        stringBuffer.append(aVar != null ? aVar.f237122d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237099h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237100i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237101j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237102k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237103l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237104m);
        stringBuffer.append(",");
        stringBuffer.append(this.f237105n);
        stringBuffer.append(",");
        stringBuffer.append(this.f237106o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237107p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237108q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237109r);
        stringBuffer.append(",");
        stringBuffer.append(this.f237110s);
        stringBuffer.append(",");
        stringBuffer.append(this.f237111t);
        stringBuffer.append(",");
        stringBuffer.append(this.f237112u);
        stringBuffer.append(",");
        stringBuffer.append(this.f237113v);
        stringBuffer.append(",");
        stringBuffer.append(this.f237114w);
        stringBuffer.append(",");
        stringBuffer.append(this.f237115x);
        stringBuffer.append(",");
        stringBuffer.append(this.f237116y);
        stringBuffer.append(",");
        stringBuffer.append(this.f237117z);
        stringBuffer.append(",");
        stringBuffer.append(this.f237076A);
        stringBuffer.append(",");
        stringBuffer.append(this.f237077B);
        stringBuffer.append(",");
        stringBuffer.append(this.f237078C);
        stringBuffer.append(",");
        stringBuffer.append(this.f237079D);
        stringBuffer.append(",");
        stringBuffer.append(this.f237080E);
        stringBuffer.append(",");
        stringBuffer.append(this.f237081F);
        stringBuffer.append(",");
        stringBuffer.append(this.f237082G);
        stringBuffer.append(",");
        stringBuffer.append(this.f237083H);
        stringBuffer.append(",");
        stringBuffer.append(this.f237084I);
        stringBuffer.append(",");
        stringBuffer.append(this.f237085J);
        stringBuffer.append(",");
        stringBuffer.append(this.f237086K);
        stringBuffer.append(",");
        stringBuffer.append(this.f237087L);
        stringBuffer.append(",");
        stringBuffer.append(this.f237088M);
        stringBuffer.append(",");
        stringBuffer.append(this.f237089N);
        stringBuffer.append(",");
        stringBuffer.append(this.f237090O);
        stringBuffer.append(",");
        stringBuffer.append(this.f237091P);
        stringBuffer.append(",");
        stringBuffer.append(this.f237092Q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237093R);
        stringBuffer.append(",");
        stringBuffer.append(this.f237094S);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237095d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237096e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237097f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237098g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237099h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237100i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237101j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237102k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237103l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showAd");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237104m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("willCheckStageTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237105n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("didCheckStageTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237106o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkStageTimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237107p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("willFirstStepViewLayoutTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237108q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("didFirstStepViewLayoutTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237109r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("firstStepViewLayoutTimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237110s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("willAllViewLayoutTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237111t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("didAllViewLayoutTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237112u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("allViewLayoutTimeCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237113v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkShowAdTimeThreshold");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237114w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("shouldShowReceivedTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237115x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("shouldShowEventCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237116y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showCallTimeStamp");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237117z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("showCallCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237076A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkShowAdCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237077B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("benchmarkLevel");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237078C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("prepareServiceCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237079D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("notShowAdErrorCode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237080E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("adOperateCallTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237081F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("adOperateCallReceivedTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237082G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("adOperateCallbackTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237083H);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("adOperateCallbackReceivedTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237084I);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("adOperrateCallCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237085J);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("adOperateCallClientCostTime");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237086K);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("codeBlockTimeThreshold");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237087L);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("checkAdTimeThreshold");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237088M);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("serviceInjectReady");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237089N);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("publicLibVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237090O);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("networkType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237091P);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isPreloaded");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237092Q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isWorker");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237093R);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("waitingWorkerCreateCost");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237094S);
        return stringBuffer.toString();
    }
}

package com.tencent.p014mm.autogen.mmdata.rpt;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import kj2.C61103a;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStruct */
public final class WeAppQualityRuntimeStruct extends C61103a {

    /* renamed from: A */
    public long f237038A = 0;

    /* renamed from: B */
    public long f237039B = 0;

    /* renamed from: C */
    public long f237040C = 0;

    /* renamed from: D */
    public long f237041D = 0;

    /* renamed from: E */
    public long f237042E = 0;

    /* renamed from: F */
    public long f237043F = 0;

    /* renamed from: G */
    public long f237044G = 0;

    /* renamed from: H */
    public long f237045H = 0;

    /* renamed from: I */
    public long f237046I = 0;

    /* renamed from: J */
    public String f237047J = "";

    /* renamed from: d */
    public String f237048d = "";

    /* renamed from: e */
    public String f237049e = "";

    /* renamed from: f */
    public long f237050f = 0;

    /* renamed from: g */
    public C80773a f237051g;

    /* renamed from: h */
    public long f237052h = 0;

    /* renamed from: i */
    public long f237053i = 0;

    /* renamed from: j */
    public long f237054j = 0;

    /* renamed from: k */
    public long f237055k = 0;

    /* renamed from: l */
    public long f237056l = 0;

    /* renamed from: m */
    public long f237057m = 0;

    /* renamed from: n */
    public long f237058n = 0;

    /* renamed from: o */
    public long f237059o = 0;

    /* renamed from: p */
    public long f237060p = 0;

    /* renamed from: q */
    public long f237061q = 0;

    /* renamed from: r */
    public long f237062r = 0;

    /* renamed from: s */
    public long f237063s = 0;

    /* renamed from: t */
    public long f237064t = 0;

    /* renamed from: u */
    public long f237065u = 0;

    /* renamed from: v */
    public long f237066v = 0;

    /* renamed from: w */
    public long f237067w = 0;

    /* renamed from: x */
    public long f237068x = 0;

    /* renamed from: y */
    public long f237069y = 0;

    /* renamed from: z */
    public long f237070z = 0;

    /* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStruct$a */
    public enum C80773a {
        release(1),
        debug(2),
        demo(3);
        

        /* renamed from: d */
        public final int f237075d;

        /* access modifiers changed from: public */
        C80773a(int i) {
            this.f237075d = i;
        }
    }

    /* renamed from: j */
    public int mo1004j() {
        return 16023;
    }

    /* renamed from: p */
    public String mo1005p() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f237048d);
        stringBuffer.append(",");
        stringBuffer.append(this.f237049e);
        stringBuffer.append(",");
        stringBuffer.append(this.f237050f);
        stringBuffer.append(",");
        C80773a aVar = this.f237051g;
        stringBuffer.append(aVar != null ? aVar.f237075d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f237052h);
        stringBuffer.append(",");
        stringBuffer.append(this.f237053i);
        stringBuffer.append(",");
        stringBuffer.append(this.f237054j);
        stringBuffer.append(",");
        stringBuffer.append(this.f237055k);
        stringBuffer.append(",");
        stringBuffer.append(this.f237056l);
        stringBuffer.append(",");
        stringBuffer.append(this.f237057m);
        stringBuffer.append(",");
        stringBuffer.append(this.f237058n);
        stringBuffer.append(",");
        stringBuffer.append(this.f237059o);
        stringBuffer.append(",");
        stringBuffer.append(this.f237060p);
        stringBuffer.append(",");
        stringBuffer.append(this.f237061q);
        stringBuffer.append(",");
        stringBuffer.append(this.f237062r);
        stringBuffer.append(",");
        stringBuffer.append(this.f237063s);
        stringBuffer.append(",");
        stringBuffer.append(this.f237064t);
        stringBuffer.append(",");
        stringBuffer.append(this.f237065u);
        stringBuffer.append(",");
        stringBuffer.append(this.f237066v);
        stringBuffer.append(",");
        stringBuffer.append(this.f237067w);
        stringBuffer.append(",");
        stringBuffer.append(this.f237068x);
        stringBuffer.append(",");
        stringBuffer.append(this.f237069y);
        stringBuffer.append(",");
        stringBuffer.append(this.f237070z);
        stringBuffer.append(",");
        stringBuffer.append(this.f237038A);
        stringBuffer.append(",");
        stringBuffer.append(this.f237039B);
        stringBuffer.append(",");
        stringBuffer.append(this.f237040C);
        stringBuffer.append(",");
        stringBuffer.append(this.f237041D);
        stringBuffer.append(",");
        stringBuffer.append(this.f237042E);
        stringBuffer.append(",");
        stringBuffer.append(this.f237043F);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237044G);
        stringBuffer.append(",");
        stringBuffer.append(this.f237045H);
        stringBuffer.append(",");
        stringBuffer.append(this.f237046I);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(0);
        stringBuffer.append(",");
        stringBuffer.append(this.f237047J);
        String stringBuffer2 = stringBuffer.toString();
        mo86044a(stringBuffer2);
        return stringBuffer2;
    }

    /* renamed from: q */
    public String mo1006q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("InstanceId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237048d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237049e);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237050f);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppState");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237051g);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("AppType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237052h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("CostTimeMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237053i);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("Scene");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237054j);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("StartTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237055k);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("EndTimeStampMs");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237056l);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append(V2TXJSAdapterConstants.PUSHER_KEY_FPS);
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237057m);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fpsVariance");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237058n);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cpu");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237059o);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237060p);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memoryDiff");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237061q);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("androidNativeMemory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237062r);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("androidDalvikMemory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237063s);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runtimeDuration");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237064t);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("runtimeCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237065u);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mainCanvasType");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237066v);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("triangles");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237067w);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("drawcall");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237068x);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("vertex");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237069y);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("useCommandBuffer");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237070z);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("sceneId");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237038A);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fpsEx");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237039B);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("graphicsMemory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237040C);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("cmdPool");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237041D);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fpsLagCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237042E);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("fpsLowCount");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237043F);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memoryInFootprint");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("memoryDiffInFootprint");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("maxThreadCpu");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("jank");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237044G);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("bigjank");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237045H);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("stutter");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237046I);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("allJSFootprintMemory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("mainContextJSFootprintMemory");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("isJITMode");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(0);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("libVersion");
        stringBuffer.append(XVFSFile.PATH_SEPARATOR);
        stringBuffer.append(this.f237047J);
        return stringBuffer.toString();
    }
}

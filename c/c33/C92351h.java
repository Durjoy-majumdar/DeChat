package c33;

import a33.C91947a;
import android.os.Bundle;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C96536f;
import com.tencent.p014mm.plugin.vlog.model.C96553q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f33.C97826d;
import f40.C86709a0;
import fh2.C97882i;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98324b;
import hi2.C98453h;
import hi2.C98464o;
import java.util.ArrayList;
import lc3.C10485b;
import p156gj.C107835h0;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64899zy;
import th2.C101891f;

/* renamed from: c33.h */
public final class C92351h {

    /* renamed from: a */
    public static final C92351h f264261a = new C92351h();

    /* renamed from: c33.h$a */
    public static final class C92352a extends C87413o implements C32226l<C96553q, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecordConfigProvider f264262d;

        /* renamed from: e */
        public final /* synthetic */ int f264263e;

        /* renamed from: f */
        public final /* synthetic */ C97882i.C97883a f264264f;

        /* renamed from: g */
        public final /* synthetic */ int f264265g;

        /* renamed from: h */
        public final /* synthetic */ String f264266h;

        /* renamed from: i */
        public final /* synthetic */ C32227p<Integer, String, C13598b0> f264267i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92352a(RecordConfigProvider recordConfigProvider, int i, C97882i.C97883a aVar, int i2, String str, C32227p<? super Integer, ? super String, C13598b0> pVar) {
            super(1);
            this.f264262d = recordConfigProvider;
            this.f264263e = i;
            this.f264264f = aVar;
            this.f264265g = i2;
            this.f264266h = str;
            this.f264267i = pVar;
        }

        public Object invoke(Object obj) {
            C96553q qVar = (C96553q) obj;
            C87412m.m108594g(qVar, LocaleUtil.ITALIAN);
            if (qVar.f282582a) {
                Log.m105924i("MicroMsg.VideoExportUtil", "foreground reMux is success");
                C98464o oVar = C98464o.f288797a;
                String str = this.f264262d.f272901B;
                C87412m.m108593f(str, "configProvider.outputVideoPath");
                C98464o.C98465a a = oVar.mo137832a(str);
                if (this.f264262d.f272905F == 2) {
                    Log.m105924i("MicroMsg.VideoExportUtil", "snsCheck >> " + this.f264262d.f272901B);
                    if (a != null) {
                        a.f288806i = this.f264263e;
                    }
                    C92351h hVar = C92351h.f264261a;
                    C97882i.C97883a aVar = this.f264264f;
                    long l = C86013q1.m106451l(this.f264262d.f272901B);
                    RecordConfigProvider recordConfigProvider = this.f264262d;
                    int i = this.f264265g;
                    String str2 = this.f264266h;
                    Class cls = C10485b.class;
                    float f = (float) 1024;
                    float f2 = ((((float) l) * 1.0f) / f) / f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fileSize : ");
                    sb.append(f2);
                    sb.append(" M fileLength: ");
                    sb.append(l);
                    sb.append(" Byte   duration:");
                    sb.append(a != null ? Integer.valueOf(a.f288800c) : null);
                    Log.m105924i("MicroMsg.VideoExportUtil", sb.toString());
                    if (a != null) {
                        boolean z = C107835h0.f322852i.f322662k == 1;
                        boolean z2 = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("MMSightCheckSendVideoBitrate"), 0) == 1;
                        float f3 = Util.getFloat(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("MMSightCheckSendVideoBitrateLimit"), 1.3f);
                        if (aVar.f287163m == 2) {
                            f3 = 2.0f;
                        }
                        Log.m105925i("MicroMsg.VideoExportUtil", "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s, actualBR %s, targetBR: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Float.valueOf(f3), Integer.valueOf(a.f288802e), Integer.valueOf(recordConfigProvider.f272926n.f267169g));
                        boolean z3 = z || z2;
                        int i2 = a.f288806i;
                        if (i2 == 0) {
                            if (z3 && ((float) a.f288802e) >= ((float) i) * f3) {
                                Log.m105924i("MicroMsg.VideoExportUtil", "snsCheck >> forceRemux condition one");
                                C92351h.m116162d(hVar, aVar, recordConfigProvider, (String) null, 4, (Object) null);
                            }
                        } else if (i2 > 0 && z3 && ((float) a.f288802e) >= ((float) i) * 2.0f) {
                            Log.m105924i("MicroMsg.VideoExportUtil", "snsCheck >> forceRemux condition two");
                            C92351h.m116162d(hVar, aVar, recordConfigProvider, (String) null, 4, (Object) null);
                        }
                        if (str2.length() > 0) {
                            C97826d.f286974a.mo137162e(str2, false);
                        } else {
                            C101891f.f300035a.mo141386t(1);
                        }
                    }
                }
                this.f264267i.invoke(0, "remux finish");
            } else {
                this.f264267i.invoke(1002, "export remux error");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static boolean m116161b(C92351h hVar, boolean z, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, C98324b bVar, boolean z5, int i, Object obj) {
        String str4 = str;
        String str5 = str3;
        int i2 = i;
        C98324b bVar2 = (i2 & 128) != 0 ? null : bVar;
        boolean z6 = (i2 & 256) != 0 ? false : z5;
        hVar.getClass();
        C87412m.m108594g(str4, "thumbPath");
        C87412m.m108594g(str2, "inputVideoPath");
        C87412m.m108594g(str5, "outputVideoPath");
        C98464o.C98465a a = C98464o.f288797a.mo137832a(str5);
        if (!z6) {
            boolean t = C98453h.m127895t(C98453h.f288774a, str3, str, 0, 4, (Object) null);
            Log.m105924i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> saveResult: " + t);
            if (!t) {
                return false;
            }
        }
        Log.m105924i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> video thumbPath " + str4);
        Log.m105924i("MicroMsg.VideoExportUtil", "dealAfterRemuxSuccess >> video output path:" + str5 + " info:" + a);
        long currentTicks = Util.currentTicks();
        SightVideoJNI.optimizeMP4VFS(str3);
        Log.m105924i("MicroMsg.RemuxFileUtil", "time cost: " + Util.ticksToNow(currentTicks));
        C98453h.f288774a.mo137817o(z, str2, str3, z2, z3, z4);
        C92351h hVar2 = hVar;
        hVar.mo126333f(bVar2);
        if (!z6) {
            C101891f.f300035a.mo141378l(str5);
        }
        return true;
    }

    /* renamed from: d */
    public static void m116162d(C92351h hVar, C97882i.C97883a aVar, RecordConfigProvider recordConfigProvider, String str, int i, Object obj) {
        int i2;
        int i3;
        C97882i.C97883a aVar2 = aVar;
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        String str2 = (i & 4) != 0 ? "" : str;
        hVar.getClass();
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(985, 154, 1, false);
        if (str2.length() > 0) {
            C97826d.f286974a.mo137162e(str2, true);
        } else {
            C101891f.f300035a.mo141386t(0);
        }
        long currentTicks = Util.currentTicks();
        Log.m105924i("MicroMsg.VideoExportUtil", "start forceRemux");
        String str3 = recordConfigProvider2.f272901B + "_tmp";
        VideoTransPara videoTransPara = recordConfigProvider2.f272926n;
        if (videoTransPara.f267181v == 2) {
            Log.m105925i("MicroMsg.VideoExportUtil", "ABA: Using Min Max QP Limitation: [%d], [%d] ", Integer.valueOf(videoTransPara.f267157D), Integer.valueOf(recordConfigProvider2.f272926n.f267158E));
            VideoTransPara videoTransPara2 = recordConfigProvider2.f272926n;
            i2 = videoTransPara2.f267157D;
            i3 = videoTransPara2.f267158E;
        } else {
            i3 = 51;
            i2 = 0;
        }
        int i4 = aVar2.f287156f;
        C13604l lVar = (i4 == 90 || i4 == 270) ? new C13604l(Integer.valueOf(aVar2.f287151a), Integer.valueOf(aVar2.f287152b)) : new C13604l(Integer.valueOf(aVar2.f287152b), Integer.valueOf(aVar2.f287151a));
        int intValue = ((Number) lVar.f38555d).intValue();
        int intValue2 = ((Number) lVar.f38556e).intValue();
        String str4 = recordConfigProvider2.f272901B;
        int i5 = aVar2.f287153c;
        VideoTransPara videoTransPara3 = recordConfigProvider2.f272926n;
        int remuxingVFS = SightVideoJNI.remuxingVFS(str4, str3, intValue2, intValue, i5, videoTransPara3.f267177r, 8, videoTransPara3.f267176q, 25.0f, (float) aVar2.f287155e, (byte[]) null, 0, false, i2, i3);
        C86013q1.m106442c(str3, recordConfigProvider2.f272901B);
        C86013q1.m106447h(str3);
        long ticksToNow = Util.ticksToNow(currentTicks);
        Log.m105924i("MicroMsg.VideoExportUtil", "minQP :" + i2 + "  maxQP :" + i3 + "  duration:" + remuxingVFS + " cost:" + ticksToNow);
        nVar.idkeyStat(985, 155, ticksToNow, false);
    }

    /* renamed from: a */
    public final C91947a mo126330a(RecordConfigProvider recordConfigProvider, C97882i iVar, C97882i.C97883a aVar, C98324b bVar, boolean z, boolean z2) {
        String str;
        C87412m.m108594g(recordConfigProvider, "configProvider");
        C87412m.m108594g(iVar, "editConfig");
        C87412m.m108594g(aVar, "encode");
        C91947a aVar2 = new C91947a();
        int i = recordConfigProvider.f272905F;
        Class cls = C32735h.class;
        float f = 1.0f;
        if (i == 1) {
            f = ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_c2c_generate_multiple_kbps, 1.0f);
        } else if (i == 2) {
            f = ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_sns_generate_multiple_kbps, 1.0f);
        }
        Log.m105924i("MicroMsg.ABAParamsUtil", "final kbps: " + f + "  " + (((float) aVar.f287153c) * f));
        aVar2.f263227e = aVar.f287152b;
        aVar2.f263226d = aVar.f287151a;
        aVar2.f263228f = (int) (((float) aVar.f287153c) * f);
        aVar2.f263229g = aVar.f287155e;
        aVar2.f263230h = aVar.f287156f;
        if (aVar2.f263223a == null) {
            aVar2.f263223a = new AdaptiveAdjustBitrate();
        }
        AdaptiveAdjustBitrate adaptiveAdjustBitrate = aVar2.f263223a;
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.mo130038c();
        }
        if (recordConfigProvider.f272929q == 3) {
            aVar2.f263225c = true;
        }
        if (bVar == null || (str = bVar.f288180a) == null) {
            str = "";
        }
        aVar2.f263231i = str;
        if (z || z2) {
            Log.m105924i("MicroMsg.VideoExportUtil", "createABAParameter exportHevcHard:" + z + ", exportHevcSoft:" + z2);
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            if (videoTransPara != null) {
                videoTransPara.f267154A = z2 ? 1 : 2;
            }
        }
        VideoTransPara videoTransPara2 = recordConfigProvider.f272926n;
        C87412m.m108591d(videoTransPara2);
        int i2 = iVar.f287147g;
        int i3 = iVar.f287146f;
        if (aVar2.f263223a == null) {
            aVar2.f263223a = new AdaptiveAdjustBitrate();
        }
        Log.m105925i("MicroMsg.ABAParamsUtil", "Scene: [%d], ABASwitch: [%d] ceilingVideoBR:[%d]", Integer.valueOf(videoTransPara2.f267160G), Integer.valueOf(videoTransPara2.f267180u), Integer.valueOf(videoTransPara2.f267184y));
        AdaptiveAdjustBitrate adaptiveAdjustBitrate2 = aVar2.f263223a;
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273425a = aVar2.f263227e;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273426b = aVar2.f263226d;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273427c = aVar2.f263228f;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273428d = i3;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273429e = i2;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273430f = videoTransPara2.f267160G;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273431g = videoTransPara2.f267180u;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273432h = videoTransPara2.f267181v;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273433i = videoTransPara2.f267182w;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273434j = videoTransPara2.f267183x;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273435k = videoTransPara2.f267184y;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273436l = videoTransPara2.f267185z;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273438n = videoTransPara2.f267155B;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273437m = videoTransPara2.f267154A;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273439o = videoTransPara2.f267156C;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273440p = videoTransPara2.f267157D;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273441q = videoTransPara2.f267158E;
        }
        if (adaptiveAdjustBitrate2 != null) {
            adaptiveAdjustBitrate2.f273442r = videoTransPara2.f267159F;
        }
        return aVar2;
    }

    /* renamed from: c */
    public final void mo126331c(C64899zy zyVar, RecordConfigProvider recordConfigProvider, int i, C97882i.C97883a aVar, int i2, int i3, C32227p<? super Integer, ? super String, C13598b0> pVar, String str) {
        int i4;
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        int i5 = i;
        C87412m.m108594g(zyVar, "compositionInfo");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        C87412m.m108594g(aVar, "encode");
        C87412m.m108594g(pVar, "exportCallback");
        C87412m.m108594g(str, "backWorkTagId");
        Log.m105924i("MicroMsg.VideoExportUtil", "exportComposition >> id: " + zyVar.f186911s);
        C96536f fVar = new C96536f();
        fVar.f282497b = false;
        if (i5 == 0) {
            Log.m105928w("MicroMsg.VideoExportUtil", "getExporterScene >> tecScene is 0");
        } else {
            int i6 = i5 >> 4;
            Log.m105924i("MicroMsg.VideoExportUtil", "getExporterScene >> " + i + ", " + i6);
            if (i6 != 0) {
                boolean z = true;
                if (i6 == 1) {
                    i4 = 10;
                } else if (i6 == 2) {
                    if (str.length() != 0) {
                        z = false;
                    }
                    i4 = z ? 6 : 9;
                } else if (i6 == 3) {
                    if (str.length() != 0) {
                        z = false;
                    }
                    i4 = z ? 7 : 8;
                }
            } else {
                i4 = 4;
            }
            fVar.f282498c = i4;
            VideoTransPara videoTransPara = recordConfigProvider2.f272926n;
            C87412m.m108593f(videoTransPara, "configProvider.videoParam");
            fVar.mo81173a(false, videoTransPara);
            C57463v.C57464a.m66220b(fVar, zyVar, false, new C92352a(recordConfigProvider, i2, aVar, i3, str, pVar), 2, (Object) null);
        }
        i4 = 0;
        fVar.f282498c = i4;
        VideoTransPara videoTransPara2 = recordConfigProvider2.f272926n;
        C87412m.m108593f(videoTransPara2, "configProvider.videoParam");
        fVar.mo81173a(false, videoTransPara2);
        C57463v.C57464a.m66220b(fVar, zyVar, false, new C92352a(recordConfigProvider, i2, aVar, i3, str, pVar), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x05ca A[LOOP:5: B:159:0x05c4->B:161:0x05ca, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x034f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0358 A[LOOP:0: B:67:0x0290->B:82:0x0358, LOOP_END] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64899zy mo126332e(com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r28, fh2.C97882i r29, a33.C91954f r30, boolean r31, boolean r32, java.lang.String r33, int r34) {
        /*
            r27 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r33
            java.lang.String r4 = "configProvider"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "editConfig"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = r0.f272901B
            java.util.ArrayList<ai2.a> r5 = r1.f287144d
            float[] r6 = r1.f287150j
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            f40.e r9 = f40.C86709a0.m107523b()
            java.lang.String r9 = r9.mo121111i()
            r8.append(r9)
            r9 = 95
            r8.append(r9)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.os.Bundle r9 = r0.f272912M
            java.lang.String r10 = "key_fix_aspect_ratio"
            boolean r9 = r9.getBoolean(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getExportVideoCompositionInfo: configProvider.extra:"
            r10.append(r11)
            android.os.Bundle r11 = r0.f272912M
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.VideoExportUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "getExportVideoCompositionInfo >> editId: "
            r10.append(r12)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            r10 = 0
            if (r34 != 0) goto L_0x007b
            java.lang.String r0 = "exportVideo >> targetVideoBitrate is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            return r10
        L_0x007b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "exportVideo >> "
            r12.append(r13)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            android.graphics.RectF r11 = new android.graphics.RectF
            float[] r12 = r1.f287145e
            r13 = 0
            r14 = r12[r13]
            r15 = 1
            r10 = r12[r15]
            r13 = 2
            r15 = r12[r13]
            r13 = 3
            r12 = r12[r13]
            r11.<init>(r14, r10, r15, r12)
            r11.round(r7)
            com.tencent.mm.plugin.vlog.model.p0 r10 = new com.tencent.mm.plugin.vlog.model.p0
            gy3.C87412m.m108591d(r30)
            com.tencent.mm.plugin.vlog.model.p0 r11 = r2.f263265j
            r10.<init>((com.tencent.p014mm.plugin.vlog.model.C96552p0) r11)
            if (r3 == 0) goto L_0x00ba
            int r11 = r33.length()
            if (r11 != 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r11 = 0
            goto L_0x00bb
        L_0x00ba:
            r11 = 1
        L_0x00bb:
            if (r11 != 0) goto L_0x00c2
            r11 = 1
            r10.mo134608e(r3, r11)
            goto L_0x00c3
        L_0x00c2:
            r11 = 1
        L_0x00c3:
            boolean r1 = r1.f287141a
            r1 = r1 ^ r11
            r10.mo81185d(r1)
            te3.az r1 = new te3.az
            r1.<init>()
            te3.yy r3 = new te3.yy
            r3.<init>()
            if (r31 != 0) goto L_0x00d7
            if (r32 == 0) goto L_0x00fa
        L_0x00d7:
            th2.f r11 = th2.C101891f.f300035a
            if (r31 == 0) goto L_0x00dd
            r11 = 1
            goto L_0x00de
        L_0x00dd:
            r11 = 2
        L_0x00de:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "setRemuxHevcEncode:"
            r12.append(r14)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "MicroMsg.VideoWidgetReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct r12 = th2.C101891f.f300036b
            long r14 = (long) r11
            r12.f265885S = r14
        L_0x00fa:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "get maxWidth: "
            r11.append(r12)
            int r12 = r2.f263260e
            r11.append(r12)
            java.lang.String r12 = ", maxHeight: "
            r11.append(r12)
            int r12 = r2.f263261f
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.MediaModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            android.util.Size r11 = new android.util.Size
            int r12 = r2.f263260e
            int r14 = r2.f263261f
            r11.<init>(r12, r14)
            android.graphics.Rect r12 = r2.f263264i
            android.graphics.Rect r2 = r2.f263263h
            java.lang.String r14 = "MicroMsg.StoryRemuxIDKeyStat"
            java.lang.String r15 = "markRemuxProcessType, isForeground:true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r15)
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 986(0x3da, double:4.87E-321)
            r19 = 5
            r21 = 1
            r16.mo175913w(r17, r19, r21)
            java.lang.String r14 = "outPath"
            gy3.C87412m.m108593f(r4, r14)
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r0.f272926n
            java.lang.String r14 = "configProvider.videoParam"
            gy3.C87412m.m108593f(r0, r14)
            java.lang.String r14 = "cropRect"
            gy3.C87412m.m108594g(r12, r14)
            java.lang.String r14 = "originRect"
            gy3.C87412m.m108594g(r2, r14)
            int r14 = r11.getWidth()
            java.lang.String r15 = "MicroMsg.CompositionConverter"
            if (r14 == 0) goto L_0x0162
            int r14 = r11.getHeight()
            if (r14 != 0) goto L_0x0167
        L_0x0162:
            java.lang.String r14 = "chooseExportConfig previewSize == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r14)
        L_0x0167:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = "chooseExportConfig >> "
            r14.append(r13)
            r14.append(r4)
            java.lang.String r13 = ", "
            r14.append(r13)
            r14.append(r11)
            r14.append(r13)
            r14.append(r12)
            r14.append(r13)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            com.tencent.mm.modelcontrol.VideoTransPara r14 = new com.tencent.mm.modelcontrol.VideoTransPara
            r14.<init>((com.tencent.p014mm.modelcontrol.VideoTransPara) r0)
            r17 = r8
            int r8 = r14.f267166d
            r18 = r7
            float r7 = (float) r8
            r29 = r3
            int r3 = r11.getHeight()
            float r3 = (float) r3
            r19 = r5
            int r5 = r11.getWidth()
            float r5 = (float) r5
            float r3 = r3 / r5
            float r7 = r7 * r3
            int r3 = (int) r7
            r14.f267166d = r8
            r14.f267167e = r3
            r1.f297896d = r4
            int r3 = r11.getWidth()
            if (r3 == 0) goto L_0x01be
            int r3 = r11.getWidth()
            goto L_0x01c0
        L_0x01be:
            int r3 = ih2.C60287a.f171906a
        L_0x01c0:
            int r4 = r3 % 2
            if (r4 == 0) goto L_0x01c6
            int r3 = r3 + -1
        L_0x01c6:
            r1.f297897e = r3
            int r3 = r11.getHeight()
            if (r3 == 0) goto L_0x01d3
            int r3 = r11.getHeight()
            goto L_0x01d5
        L_0x01d3:
            int r3 = ih2.C60287a.f171907b
        L_0x01d5:
            int r4 = r3 % 2
            if (r4 == 0) goto L_0x01db
            int r3 = r3 + -1
        L_0x01db:
            r1.f297898f = r3
            te3.ep3 r3 = new te3.ep3
            r3.<init>()
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r12, r3)
            r1.f297899g = r3
            int r3 = r14.f267166d
            int r4 = r3 % 2
            if (r4 == 0) goto L_0x01ef
            int r3 = r3 + -1
        L_0x01ef:
            r1.f297901i = r3
            nr2.a r3 = nr2.C35014a.f93965a
            boolean r3 = r3.mo59824a()
            if (r3 == 0) goto L_0x020f
            int r3 = r14.f267166d
            int r4 = r2.height()
            int r3 = r3 * r4
            int r4 = r2.width()
            int r3 = r3 / r4
            int r4 = r3 % 2
            if (r4 == 0) goto L_0x020c
            int r3 = r3 + -1
        L_0x020c:
            r1.f297902j = r3
            goto L_0x0224
        L_0x020f:
            int r3 = r14.f267166d
            int r4 = r12.height()
            int r3 = r3 * r4
            int r4 = r12.width()
            int r3 = r3 / r4
            int r4 = r3 % 2
            if (r4 == 0) goto L_0x0222
            int r3 = r3 + -1
        L_0x0222:
            r1.f297902j = r3
        L_0x0224:
            if (r9 == 0) goto L_0x03dd
            java.util.Map<java.lang.Integer, android.util.Size> r4 = b23.C0243a.f778a
            int r4 = r1.f297901i
            int r5 = r1.f297902j
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_VC_OUTPPUT_SIZE_INT_SYNC
            r11 = 0
            int r7 = r7.mo119689j(r8, r11)
            r8 = 1
            if (r7 == r8) goto L_0x039e
            r8 = 2
            if (r7 == r8) goto L_0x0386
            r14 = 3
            if (r7 == r14) goto L_0x036e
            bp3.p r7 = bp3.C79758p.f233760a
            bp3.f r14 = bp3.C104160f.RepairerConfig_Media_VideoSoftEncodeFixedResolution_Int
            int r7 = r7.mo109882e(r14, r11)
            if (r7 != 0) goto L_0x025c
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_composition_fix_aspect_ratio_delta
            int r7 = r7.mo58779Qe(r11, r8)
        L_0x025c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "getThresholdLength:"
            r8.append(r11)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "MicroMsg.Composition.FixedResolutionExportConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            if (r7 > 0) goto L_0x0284
        L_0x0274:
            r26 = r0
            r23 = r2
            r20 = r6
            r22 = r9
            r25 = r10
            r33 = r12
            r24 = r13
            goto L_0x036c
        L_0x0284:
            java.util.Map<java.lang.Integer, android.util.Size> r8 = b23.C0243a.f778a
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0290:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0274
            java.lang.Object r14 = r8.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r20 = r14.getValue()
            android.util.Size r20 = (android.util.Size) r20
            int r3 = r20.getWidth()
            java.lang.Object r20 = r14.getValue()
            android.util.Size r20 = (android.util.Size) r20
            r30 = r8
            int r8 = r20.getHeight()
            r20 = r6
            float r6 = (float) r7
            r21 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r21
            r21 = r7
            r7 = 100
            float r7 = (float) r7
            float r6 = r6 / r7
            float r7 = (float) r3
            r22 = r9
            r33 = r12
            r9 = 1
            float r12 = (float) r9
            float r9 = r12 - r6
            r23 = r2
            float r2 = r7 * r9
            float r12 = r12 + r6
            float r7 = r7 * r12
            r24 = r13
            float r13 = (float) r8
            float r9 = r9 * r13
            float r13 = r13 * r12
            float r12 = (float) r4
            int r25 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r25 < 0) goto L_0x02ec
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 > 0) goto L_0x02ec
            float r12 = (float) r5
            int r25 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r25 < 0) goto L_0x02ec
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x02ec
            r25 = r10
            r12 = 1
            goto L_0x02ef
        L_0x02ec:
            r25 = r10
            r12 = 0
        L_0x02ef:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r26 = r0
            java.lang.String r0 = "enable:"
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = " ratio:"
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = " mapWidth:"
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = " outputWidth:"
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = " minWidth:"
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = " maxWidth:"
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = " mapHeight:"
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = " outputHeight:"
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = " minHeight:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = " maxHeight:"
            r10.append(r0)
            r10.append(r13)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r12 == 0) goto L_0x0358
            java.lang.Object r0 = r14.getValue()
            r10 = r0
            android.util.Size r10 = (android.util.Size) r10
            goto L_0x03b5
        L_0x0358:
            r8 = r30
            r12 = r33
            r6 = r20
            r7 = r21
            r9 = r22
            r2 = r23
            r13 = r24
            r10 = r25
            r0 = r26
            goto L_0x0290
        L_0x036c:
            r10 = 0
            goto L_0x03b5
        L_0x036e:
            r26 = r0
            r23 = r2
            r20 = r6
            r22 = r9
            r25 = r10
            r33 = r12
            r24 = r13
            android.util.Size r10 = new android.util.Size
            r0 = 1080(0x438, float:1.513E-42)
            r2 = 1920(0x780, float:2.69E-42)
            r10.<init>(r0, r2)
            goto L_0x03b5
        L_0x0386:
            r26 = r0
            r23 = r2
            r20 = r6
            r22 = r9
            r25 = r10
            r33 = r12
            r24 = r13
            android.util.Size r10 = new android.util.Size
            r0 = 720(0x2d0, float:1.009E-42)
            r2 = 1280(0x500, float:1.794E-42)
            r10.<init>(r0, r2)
            goto L_0x03b5
        L_0x039e:
            r26 = r0
            r23 = r2
            r20 = r6
            r22 = r9
            r25 = r10
            r33 = r12
            r24 = r13
            android.util.Size r10 = new android.util.Size
            r0 = 540(0x21c, float:7.57E-43)
            r2 = 960(0x3c0, float:1.345E-42)
            r10.<init>(r0, r2)
        L_0x03b5:
            if (r10 == 0) goto L_0x03da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "chooseExportConfig: target fixedResolutionSize "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            r0 = 1
            r1.f297895B = r0
            int r0 = r10.getWidth()
            r1.f297901i = r0
            int r0 = r10.getHeight()
            r1.f297902j = r0
        L_0x03da:
            r0 = r26
            goto L_0x03e9
        L_0x03dd:
            r23 = r2
            r20 = r6
            r22 = r9
            r25 = r10
            r33 = r12
            r24 = r13
        L_0x03e9:
            int r2 = r0.f267169g
            r1.f297903n = r2
            int r2 = r0.f267168f
            r1.f297904o = r2
            int r2 = r0.f267172j
            r1.f297905p = r2
            int r2 = r0.f267173n
            r1.f297906q = r2
            int r2 = r0.f267174o
            r1.f297907r = r2
            int r2 = r0.f267175p
            r1.f297908s = r2
            int r0 = r0.f267180u
            r1.f297910u = r0
            r0 = r25
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r2 = r0.f282570c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0412:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x042d
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.tencent.mm.plugin.vlog.model.q0 r5 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r5
            int r5 = r5.f316491b
            r6 = 2
            if (r5 != r6) goto L_0x0426
            r5 = 1
            goto L_0x0427
        L_0x0426:
            r5 = 0
        L_0x0427:
            if (r5 == 0) goto L_0x0412
            r3.add(r4)
            goto L_0x0412
        L_0x042d:
            int r2 = r3.size()
            r3 = 1
            if (r2 != r3) goto L_0x049c
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r2 = r0.f282570c
            java.util.Iterator r2 = r2.iterator()
        L_0x043a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0494
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.vlog.model.q0 r3 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r3
            int r4 = r3.f316491b
            r5 = 2
            if (r4 != r5) goto L_0x044d
            r4 = 1
            goto L_0x044e
        L_0x044d:
            r4 = 0
        L_0x044e:
            if (r4 == 0) goto L_0x043a
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r2 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r3 = r3.f316490a
            rw.m$a r2 = r2.mo129930b(r3)
            if (r2 == 0) goto L_0x04f5
            int r3 = r2.f180525a
            if (r3 <= 0) goto L_0x04f5
            int r3 = r2.f180526b
            if (r3 <= 0) goto L_0x04f5
            float r3 = r2.f180527c
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x04f5
            boolean r4 = r0.f282574g
            if (r4 != 0) goto L_0x0481
            int r4 = r1.f297906q
            int r5 = r2.f180532h
            if (r4 <= r5) goto L_0x0475
            r1.f297906q = r5
        L_0x0475:
            int r4 = r1.f297907r
            int r5 = r2.f180534j
            if (r4 <= r5) goto L_0x0481
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r4) goto L_0x0481
            r1.f297907r = r5
        L_0x0481:
            int r4 = r1.f297904o
            int r3 = (int) r3
            int r3 = java.lang.Math.min(r4, r3)
            r1.f297904o = r3
            int r2 = r2.f180533i
            r3 = 2
            int r2 = java.lang.Math.min(r2, r3)
            r1.f297908s = r2
            goto L_0x04f5
        L_0x0494:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        L_0x049c:
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r2 = r0.f282570c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x04a7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x04c2
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.tencent.mm.plugin.vlog.model.q0 r5 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r5
            int r5 = r5.f316491b
            r6 = 2
            if (r5 != r6) goto L_0x04bb
            r5 = 1
            goto L_0x04bc
        L_0x04bb:
            r5 = 0
        L_0x04bc:
            if (r5 == 0) goto L_0x04a7
            r3.add(r4)
            goto L_0x04a7
        L_0x04c2:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x04c9
            goto L_0x04ef
        L_0x04c9:
            java.util.Iterator r2 = r3.iterator()
        L_0x04cd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04ef
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.vlog.model.q0 r3 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r3
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r4 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r3 = r3.f316490a
            rw.m$a r3 = r4.mo129930b(r3)
            if (r3 == 0) goto L_0x04ea
            int r3 = r3.f180533i
            r4 = 1
            if (r3 != r4) goto L_0x04ea
            r3 = 1
            goto L_0x04eb
        L_0x04ea:
            r3 = 0
        L_0x04eb:
            if (r3 == 0) goto L_0x04cd
            r2 = 1
            goto L_0x04f0
        L_0x04ef:
            r2 = 0
        L_0x04f0:
            if (r2 == 0) goto L_0x04f7
            r2 = 1
            r1.f297908s = r2
        L_0x04f5:
            r2 = 2
            goto L_0x04fa
        L_0x04f7:
            r2 = 2
            r1.f297908s = r2
        L_0x04fa:
            int r3 = r1.f297908s
            int r3 = java.lang.Math.min(r3, r2)
            r1.f297908s = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f297900h = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getExportConfig: origin: "
            r2.append(r3)
            int r3 = r1.f297897e
            r2.append(r3)
            r3 = r24
            r2.append(r3)
            int r4 = r1.f297898f
            r2.append(r4)
            r2.append(r3)
            r4 = r23
            r2.append(r4)
            java.lang.String r4 = " target: "
            r2.append(r4)
            int r4 = r1.f297901i
            r2.append(r4)
            r2.append(r3)
            int r3 = r1.f297902j
            r2.append(r3)
            java.lang.String r3 = ", audio:"
            r2.append(r3)
            int r3 = r1.f297908s
            r2.append(r3)
            r3 = 44
            r2.append(r3)
            int r4 = r1.f297906q
            r2.append(r4)
            r2.append(r3)
            int r3 = r1.f297907r
            r2.append(r3)
            java.lang.String r3 = ", cropRect:"
            r2.append(r3)
            r3 = r33
            r2.append(r3)
            java.lang.String r3 = ", enableFixAspectRatio:"
            r2.append(r3)
            r3 = r22
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
            java.lang.String r2 = "validRect"
            r3 = r20
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = "editItems"
            r4 = r19
            gy3.C87412m.m108594g(r4, r2)
            te3.ep3 r2 = new te3.ep3
            r2.<init>()
            r5 = r29
            r5.f186610d = r2
            r6 = r18
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r6, r2)
            te3.ep3 r2 = new te3.ep3
            r2.<init>()
            r5.f186613g = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r6 = 0
            r7 = r3[r6]
            int r7 = (int) r7
            r8 = 1
            r9 = r3[r8]
            int r9 = (int) r9
            r10 = 2
            r10 = r3[r10]
            int r10 = (int) r10
            r11 = 3
            r3 = r3[r11]
            int r3 = (int) r3
            r2.<init>(r7, r9, r10, r3)
            te3.ep3 r3 = r5.f186613g
            java.lang.String r7 = "editData.validRect"
            gy3.C87412m.m108593f(r3, r7)
            com.tencent.p014mm.plugin.vlog.model.C96551o.m123877g(r2, r3)
            java.util.LinkedList<te3.ea> r2 = r5.f186611e
            java.util.ArrayList r3 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r4, r7)
            r3.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x05c4:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x05ed
            java.lang.Object r7 = r4.next()
            ai2.a r7 = (ai2.C92007a) r7
            te3.ea r9 = new te3.ea
            r9.<init>()
            ai2.d r10 = r7.f263402a
            int r10 = r10.f263445d
            r9.f182947d = r10
            pe3.a r7 = r7.toProtoBuf()
            byte[] r7 = r7.toByteArray()
            te3.qv3 r7 = sf0.C48374j0.m53712a(r7)
            r9.f182948e = r7
            r3.add(r9)
            goto L_0x05c4
        L_0x05ed:
            r2.addAll(r3)
            te3.zy r0 = com.tencent.p014mm.plugin.vlog.model.C96551o.m123871a(r0, r1)
            r0.f186906n = r5
            r1 = r17
            r0.f186911s = r1
            te3.az r1 = r0.f186904i
            if (r1 != 0) goto L_0x05ff
            goto L_0x0609
        L_0x05ff:
            if (r31 != 0) goto L_0x0606
            if (r32 == 0) goto L_0x0604
            goto L_0x0606
        L_0x0604:
            r13 = 0
            goto L_0x0607
        L_0x0606:
            r13 = 1
        L_0x0607:
            r1.f297913x = r13
        L_0x0609:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c33.C92351h.mo126332e(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, fh2.i, a33.f, boolean, boolean, java.lang.String, int):te3.zy");
    }

    /* renamed from: f */
    public final void mo126333f(C98324b bVar) {
        if (bVar != null) {
            CaptureDataManager.f272890c.f272892b.putBoolean("key_is_capture_video", bVar.f288182c);
            Bundle bundle = CaptureDataManager.f272890c.f272892b;
            ArrayList<String> arrayList = bVar.f288190k;
            boolean z = false;
            bundle.putBoolean("key_is_photo_video", !(arrayList == null || arrayList.isEmpty()));
            ArrayList<String> arrayList2 = bVar.f288190k;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z = true;
            }
            if (!z) {
                CaptureDataManager.f272890c.f272892b.putStringArrayList("key_src_list", bVar.f288190k);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(bVar.f288180a);
            CaptureDataManager.f272890c.f272892b.putStringArrayList("key_src_list", arrayList3);
        }
    }
}

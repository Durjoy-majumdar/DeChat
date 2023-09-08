package p406zn;

import a10.C112726y;
import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.biz.C55579f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.pigeon.BizPigeon;
import com.tencent.wechat.p326mm.biz.BizManager;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.concurrent.CancellationException;
import kj2.C117407d;
import kotlin.ResultKt;
import o40.C61926c;
import p007bo.C16801f;
import p007bo.C16804h;
import p007bo.C16812l;
import p007bo.C16813m;
import p220pr.C110245g;
import p227rn.C22240c0;
import p493do.C31220h;
import p493do.C86380f;
import p493do.C86382i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

@C86522b
/* renamed from: zn.j */
public final class C23522j extends C86301e implements C22240c0 {

    /* renamed from: d */
    public final String f67460d = "MicroMsg.FlutterBizFeatureService";

    /* renamed from: e */
    public final C0000n0 f67461e = C53930o0.m60555b();

    /* renamed from: f */
    public C53973z1 f67462f;

    /* renamed from: g */
    public C112726y f67463g;

    /* renamed from: h */
    public boolean f67464h;

    /* renamed from: j */
    public final C13601g f67465j = C36568h.m40985a(new C23528j(this));

    /* renamed from: n */
    public final C13601g f67466n = C36568h.m40985a(new C23529k(this));

    /* renamed from: o */
    public final C13601g f67467o = C36568h.m40985a(new C23527c(this));

    /* renamed from: p */
    public final C13601g f67468p = C36568h.m40985a(new C23526b(this));

    /* renamed from: q */
    public final long f67469q = 15000;

    /* renamed from: r */
    public long f67470r;

    /* renamed from: zn.j$e */
    public static final class C23523e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C23522j f67471d;

        public C23523e(C23522j jVar) {
            this.f67471d = jVar;
        }

        public final void run() {
            Log.m105924i(this.f67471d.f67460d, "doOnAppForeground");
            C16813m mVar = C16813m.f45424a;
            mVar.mo17857c().onAppForegroundAsync(mVar.mo17858d());
        }
    }

    /* renamed from: zn.j$f */
    public static final class C23524f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C23522j f67472d;

        public C23524f(C23522j jVar) {
            this.f67472d = jVar;
        }

        public final void run() {
            Log.m105924i(this.f67472d.f67460d, "doOnAppForeground");
            C16813m mVar = C16813m.f45424a;
            mVar.mo17857c().onAppForegroundAsync(mVar.mo17858d());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.brandservice.FlutterBizFeatureService$openBizTimeLineWithFlutter$1", mo125469f = "FlutterBizFeatureService.kt", mo125470l = {184, 196, 203, 217}, mo125471m = "invokeSuspend")
    /* renamed from: zn.j$i */
    public static final class C23525i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f67473d;

        /* renamed from: e */
        public int f67474e;

        /* renamed from: f */
        public final /* synthetic */ long f67475f;

        /* renamed from: g */
        public final /* synthetic */ Intent f67476g;

        /* renamed from: h */
        public final /* synthetic */ C23522j f67477h;

        /* renamed from: i */
        public final /* synthetic */ Context f67478i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23525i(long j, Intent intent, C23522j jVar, Context context, C15601d<? super C23525i> dVar) {
            super(2, dVar);
            this.f67475f = j;
            this.f67476g = intent;
            this.f67477h = jVar;
            this.f67478i = context;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C23525i(this.f67475f, this.f67476g, this.f67477h, this.f67478i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C23525i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:149:0x0453  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0460  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x04aa  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x054d  */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x055e  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x056b  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0591  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x05a0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                r37 = this;
                r8 = r37
                java.lang.Class<pr.g> r1 = p220pr.C110245g.class
                xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r8.f67474e
                r3 = 1
                r4 = 0
                r5 = 3
                r6 = 2
                r7 = 4
                r10 = 0
                java.lang.String r11 = "MicroMsg.BizFlutterReportHelper"
                if (r0 == 0) goto L_0x0041
                if (r0 == r3) goto L_0x0037
                if (r0 == r6) goto L_0x002c
                if (r0 == r5) goto L_0x0027
                if (r0 != r7) goto L_0x001f
                kotlin.ResultKt.throwOnFailure(r38)
                goto L_0x057e
            L_0x001f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r38)
                goto L_0x04a4
            L_0x002c:
                java.lang.Object r0 = r8.f67473d
                java.util.Map r0 = (java.util.Map) r0
                kotlin.ResultKt.throwOnFailure(r38)
                r1 = r38
                goto L_0x0443
            L_0x0037:
                java.lang.Object r0 = r8.f67473d
                java.util.Map r0 = (java.util.Map) r0
                kotlin.ResultKt.throwOnFailure(r38)
                r12 = 5
                goto L_0x03eb
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r38)
                long r12 = r8.f67475f
                r0 = 1000(0x3e8, float:1.401E-42)
                long r14 = (long) r0
                long r12 = r12 / r14
                int r0 = (int) r12
                com.tencent.p014mm.storage.C19636w0.f55626c = r0
                android.content.Intent r0 = r8.f67476g
                java.lang.String r12 = "intent"
                gy3.C87412m.m108594g(r0, r12)
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r12 = new com.tencent.pigeon.BizPigeon$BizEnterStatusInfo
                r12.<init>()
                p007bo.C16812l.f45421a = r12
                java.lang.String r13 = "biz_enter_source"
                int r14 = r0.getIntExtra(r13, r3)
                long r14 = (long) r14
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                r12.setEnterSource(r14)
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r12 = p007bo.C16812l.f45421a
                if (r12 != 0) goto L_0x006e
                goto L_0x007a
            L_0x006e:
                int r13 = r0.getIntExtra(r13, r3)
                long r13 = (long) r13
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r12.setEnterSource(r13)
            L_0x007a:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r12 = p007bo.C16812l.f45421a
                if (r12 != 0) goto L_0x007f
                goto L_0x0092
            L_0x007f:
                java.lang.Class<c00.n> r13 = c00.C0405n.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                c00.n r13 = (c00.C0405n) r13
                boolean r13 = r13.mo279e()
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                r12.setIsTeenMode(r13)
            L_0x0092:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r12 = p007bo.C16812l.f45421a
                if (r12 != 0) goto L_0x0097
                goto L_0x00a5
            L_0x0097:
                java.lang.String r13 = "Main_UnreadCount"
                int r13 = r0.getIntExtra(r13, r4)
                long r13 = (long) r13
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r12.setRedDotCount(r13)
            L_0x00a5:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r12 = p007bo.C16812l.f45421a
                r13 = 0
                if (r12 != 0) goto L_0x00ac
                goto L_0x00f3
            L_0x00ac:
                bo.f r15 = p007bo.C16801f.f45399a
                boolean r15 = r15.mo17845e()
                if (r15 == 0) goto L_0x00b9
                java.lang.Long r15 = java.lang.Long.valueOf(r13)
                goto L_0x00f0
            L_0x00b9:
                com.tencent.mm.storage.p0 r15 = rb0.C48009v0.Jx0()
                long r16 = r15.mo25791TO()
                r18 = 32
                long r5 = r16 << r18
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r2 = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= "
                r7.append(r2)
                r7.append(r5)
                java.lang.String r2 = r7.toString()
                zh3.f r5 = r15.f55550d
                android.database.Cursor r2 = r5.rawQuery(r2, r10)
                boolean r5 = r2.moveToFirst()
                if (r5 == 0) goto L_0x00e7
                int r5 = r2.getInt(r4)
                goto L_0x00e8
            L_0x00e7:
                r5 = 0
            L_0x00e8:
                r2.close()
                long r5 = (long) r5
                java.lang.Long r15 = java.lang.Long.valueOf(r5)
            L_0x00f0:
                r12.setFirstGroupMsgCount(r15)
            L_0x00f3:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x00f8
                goto L_0x0108
            L_0x00f8:
                r5 = 10000(0x2710, float:1.4013E-41)
                java.lang.String r6 = "KOpenArticleSceneFromScene"
                int r5 = r0.getIntExtra(r6, r5)
                long r5 = (long) r5
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.setOpenArticleFromScene(r5)
            L_0x0108:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x010d
                goto L_0x011b
            L_0x010d:
                java.lang.String r5 = "Main_IndexInSessionList"
                int r5 = r0.getIntExtra(r5, r4)
                long r5 = (long) r5
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.setPos(r5)
            L_0x011b:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                java.lang.String r5 = "Main_BizFinderLiveRedDotType"
                if (r2 != 0) goto L_0x0122
                goto L_0x012e
            L_0x0122:
                int r6 = r0.getIntExtra(r5, r4)
                long r6 = (long) r6
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r2.setFinderLiveRedDotType(r6)
            L_0x012e:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x0133
                goto L_0x0141
            L_0x0133:
                java.lang.String r6 = "Main_BizExposeMsgType"
                int r6 = r0.getIntExtra(r6, r4)
                long r6 = (long) r6
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r2.setExposeMsgType(r6)
            L_0x0141:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x0146
                goto L_0x0153
            L_0x0146:
                java.lang.String r6 = "Main_FromUserName"
                java.lang.String r0 = r0.getStringExtra(r6)
                if (r0 != 0) goto L_0x0150
                java.lang.String r0 = ""
            L_0x0150:
                r2.setExposeUserName(r0)
            L_0x0153:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 == 0) goto L_0x015d
                java.lang.Long r0 = r0.getFinderLiveRedDotType()
                if (r0 != 0) goto L_0x0161
            L_0x015d:
                java.lang.Long r0 = java.lang.Long.valueOf(r13)
            L_0x0161:
                long r6 = r0.longValue()
                int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
                if (r0 <= 0) goto L_0x0181
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x016e
                goto L_0x0181
            L_0x016e:
                com.tencent.mm.pluginsdk.model.d r2 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r6 = p007bo.C16812l.f45421a
                if (r6 == 0) goto L_0x0179
                java.lang.String r6 = r6.getExposeUserName()
                goto L_0x017a
            L_0x0179:
                r6 = r10
            L_0x017a:
                java.lang.String r2 = r2.mo25172f(r6)
                r0.setFinderFeedExportId(r2)
            L_0x0181:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x0186
                goto L_0x018f
            L_0x0186:
                long r6 = com.tencent.p014mm.storage.C19601c0.f55447b
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setLastExposeId(r2)
            L_0x018f:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x0194
                goto L_0x019d
            L_0x0194:
                long r6 = com.tencent.p014mm.storage.C19601c0.f55448c
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setLastExposeMid(r2)
            L_0x019d:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x01a2
                goto L_0x01ab
            L_0x01a2:
                long r6 = com.tencent.p014mm.storage.C19601c0.f55459n
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setLastExposeMsgId(r2)
            L_0x01ab:
                te3.lp3 r0 = com.tencent.p014mm.storage.C19601c0.f55452g
                if (r0 == 0) goto L_0x01c8
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a     // Catch:{ Exception -> 0x01bc }
                if (r2 != 0) goto L_0x01b4
                goto L_0x01c8
            L_0x01b4:
                byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x01bc }
                r2.setRedDotReportItem(r0)     // Catch:{ Exception -> 0x01bc }
                goto L_0x01c8
            L_0x01bc:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            L_0x01c8:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x01cd
                goto L_0x01d7
            L_0x01cd:
                int r2 = com.tencent.p014mm.storage.C19636w0.f55626c
                long r6 = (long) r2
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setSessionId(r2)
            L_0x01d7:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x01dc
                goto L_0x01e7
            L_0x01dc:
                long r6 = java.lang.System.currentTimeMillis()
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setEnterTime(r2)
            L_0x01e7:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x01ec
                goto L_0x01f5
            L_0x01ec:
                com.tencent.mm.pluginsdk.model.a r2 = com.tencent.p014mm.pluginsdk.model.C44545a.f120794a
                java.lang.String r2 = r2.mo69323a()
                r0.setNetType(r2)
            L_0x01f5:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x01fa
                goto L_0x0207
            L_0x01fa:
                com.tencent.mm.pluginsdk.model.a r2 = com.tencent.p014mm.pluginsdk.model.C44545a.f120794a
                boolean r2 = r2.mo69325c()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.setIsHeadsetOn(r2)
            L_0x0207:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x020c
                goto L_0x0215
            L_0x020c:
                boolean r2 = p007bo.C16812l.f45422b
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.setCreateEngineGroup(r2)
            L_0x0215:
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x021a
                goto L_0x0223
            L_0x021a:
                long r6 = p007bo.C16812l.f45423c
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setStartOpenTime(r2)
            L_0x0223:
                java.lang.String r0 = "markStartOpen"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
                long r6 = java.lang.System.currentTimeMillis()
                p007bo.C16812l.f45423c = r6
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r0 = p007bo.C16812l.f45421a
                if (r0 != 0) goto L_0x0233
                goto L_0x023a
            L_0x0233:
                java.lang.Long r2 = java.lang.Long.valueOf(r6)
                r0.setStartOpenTime(r2)
            L_0x023a:
                zn.j r0 = r8.f67477h
                boolean r0 = r0.mo35407eG()
                if (r0 == 0) goto L_0x0261
                zn.j r0 = r8.f67477h
                java.lang.String r0 = r0.f67460d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "openBizTimeLineWithFlutter aff initDone: "
                r2.append(r6)
                bo.m r6 = p007bo.C16813m.f45424a
                boolean r7 = p007bo.C16813m.f45428e
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                r6.mo17859e()
            L_0x0261:
                bo.h r0 = p007bo.C16804h.f45407a
                java.lang.String r2 = "MicroMsg.BizFlutterInstantsHelper"
                java.lang.String r6 = "onEnter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                bo.f r2 = p007bo.C16801f.f45399a
                boolean r2 = r2.mo17845e()
                if (r2 == 0) goto L_0x0281
                bo.m r2 = p007bo.C16813m.f45424a
                com.tencent.wechat.mm.biz.BizManager r6 = r2.mo17857c()
                int r2 = r2.mo17858d()
                int r7 = com.tencent.p014mm.storage.C19636w0.f55626c
                r6.onEnterAsync(r2, r7)
            L_0x0281:
                p007bo.C16804h.f45408b = r4
                p007bo.C16804h.f45409c = r4
                com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner r2 = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE
                bo.h$b r6 = p007bo.C16804h.f45414h
                r2.removeLifecycleCallback((com.tencent.matrix.lifecycle.C80401d) r6)
                com.tencent.p014mm.storage.C19636w0.f55627d = r3
                fx0.C45823f.m51112a()
                fx0.C45823f.m51113b()
                bo.j r2 = p007bo.C79728j.f233677d
                o40.C61926c.m72668M(r2)
                java.lang.String r2 = "markEndOnEnter"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
                long r6 = java.lang.System.currentTimeMillis()
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x02a7
                goto L_0x02ae
            L_0x02a7:
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r2.setEndOnEnterTime(r6)
            L_0x02ae:
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                rx3.g r6 = p007bo.C16801f.f45401c
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r7 = "personalCenterEnable"
                r2.put(r7, r6)
                boolean r6 = com.tencent.p014mm.storage.C19636w0.m21171m()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r7 = "recFeedOpen"
                r2.put(r7, r6)
                boolean r6 = com.tencent.p014mm.storage.C19636w0.m21172n()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r7 = "isShowBizTimeLineTime"
                r2.put(r7, r6)
                boolean r6 = com.tencent.p014mm.storage.C19636w0.m21171m()
                if (r6 == 0) goto L_0x0302
                eb0.z$b r6 = eb0.C20583z.f57949a
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r6.mo32230c()
                java.lang.String r7 = "BizTLRecommendFeedsTimingPreload"
                r12 = 5
                int r6 = r6.decodeInt(r7, r12)
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                java.lang.String r6 = "recFeedTimingOfPreload"
                r2.put(r6, r7)
                goto L_0x0303
            L_0x0302:
                r12 = 5
            L_0x0303:
                zn.j r6 = r8.f67477h
                boolean r6 = r6.mo35407eG()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r7 = "useAff"
                r2.put(r7, r6)
                bo.e r6 = p007bo.C0336e.f914a
                boolean r6 = r6.mo376a()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r7 = "openAdBrandServiceCard"
                r2.put(r7, r6)
                rx3.g r6 = p007bo.C0336e.f916c
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r7 = "openBrandServiceCard"
                r2.put(r7, r6)
                android.content.Intent r6 = r8.f67476g
                int r5 = r6.getIntExtra(r5, r4)
                if (r5 != r3) goto L_0x0343
                r5 = 1
                goto L_0x0344
            L_0x0343:
                r5 = 0
            L_0x0344:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.String r6 = "bizFinderLiveRedDot"
                r2.put(r6, r5)
                com.tencent.mm.pluginsdk.model.d r5 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
                boolean r5 = r5.mo25177l()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.String r6 = "openFinderLiveBar"
                r2.put(r6, r5)
                rx3.g<java.lang.Boolean> r5 = qx0.C22140b.f62638m
                rx3.g<java.lang.Boolean> r5 = qx0.C22140b.f62638m
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                java.lang.String r6 = "openFirstScreenCardExposeReport"
                r2.put(r6, r5)
                r24 = 0
                kj2.d r5 = kj2.C117407d.INSTANCE
                r22 = 1971(0x7b3, double:9.74E-321)
                r26 = 1
                r21 = r5
                r21.mo182089r(r22, r24, r26)
                boolean r0 = r0.mo17848c()
                if (r0 == 0) goto L_0x03ea
                r27 = 1971(0x7b3, double:9.74E-321)
                r31 = 1
                r29 = 1
                r26 = r5
                r26.mo182089r(r27, r29, r31)
                boolean r0 = p007bo.C16804h.f45411e
                r6 = 27908(0x6d04, float:3.9107E-41)
                if (r0 != 0) goto L_0x03b2
                r29 = 3
                r27 = 1971(0x7b3, double:9.74E-321)
                r31 = 1
                r26 = r5
                r26.mo182089r(r27, r29, r31)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
                r7[r4] = r14
                r0.mo160131h(r6, r7)
            L_0x03b2:
                zn.j r0 = r8.f67477h
                a10.y r7 = r0.f67463g
                if (r7 == 0) goto L_0x03ea
                java.lang.String r0 = r0.f67460d
                java.lang.String r7 = "onEnter fail to killFlutterInstants"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
                r27 = 1971(0x7b3, double:9.74E-321)
                r31 = 1
                r29 = 2
                r26 = r5
                r26.mo182089r(r27, r29, r31)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                r5[r4] = r7
                r0.mo160131h(r6, r5)
                zn.j r0 = r8.f67477h
                a10.y r5 = r0.f67463g
                r0.f67463g = r10
                if (r5 == 0) goto L_0x03ea
                r8.f67473d = r2
                r8.f67474e = r3
                java.lang.Object r0 = r5.mo164469e(r0, r8)
                if (r0 != r9) goto L_0x03ea
                return r9
            L_0x03ea:
                r0 = r2
            L_0x03eb:
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r5 = 1991(0x7c7, float:2.79E-42)
                di3.d r6 = di3.C86312j.m106911c(r1)
                pr.g r6 = (p220pr.C110245g) r6
                boolean r6 = r6.bf0()
                if (r6 == 0) goto L_0x03fc
                r12 = 4
            L_0x03fc:
                r2.mo175911u(r5, r12)
                di3.d r2 = di3.C86312j.m106911c(r1)
                pr.g r2 = (p220pr.C110245g) r2
                boolean r2 = r2.bf0()
                if (r2 != 0) goto L_0x041c
                java.lang.String r2 = "markCreateEngineGroup create=true"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
                p007bo.C16812l.f45422b = r3
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x0417
                goto L_0x041c
            L_0x0417:
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r2.setCreateEngineGroup(r5)
            L_0x041c:
                java.lang.String r2 = "markStartCreateEngineGroup"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
                long r5 = java.lang.System.currentTimeMillis()
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x042a
                goto L_0x0431
            L_0x042a:
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.setStartCreateEngineGroupTime(r5)
            L_0x0431:
                di3.d r1 = di3.C86312j.m106911c(r1)
                pr.g r1 = (p220pr.C110245g) r1
                r8.f67473d = r0
                r2 = 2
                r8.f67474e = r2
                java.lang.Object r1 = r1.Tw0(r8)
                if (r1 != r9) goto L_0x0443
                return r9
            L_0x0443:
                a10.c r1 = (a10.C112713c) r1
                java.lang.String r2 = "markStartCreateEngine"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
                long r5 = java.lang.System.currentTimeMillis()
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x0453
                goto L_0x045a
            L_0x0453:
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r2.setStartCreateEngineTime(r5)
            L_0x045a:
                zn.j r2 = r8.f67477h
                a10.y r2 = r2.f67463g
                if (r2 != 0) goto L_0x0528
                java.lang.String r2 = "markCreateEngine create=true"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x046a
                goto L_0x046f
            L_0x046a:
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r2.setCreateEngine(r5)
            L_0x046f:
                zn.j r2 = r8.f67477h
                a10.y r5 = new a10.y
                java.lang.String r6 = "biz"
                r5.<init>(r1, r6)
                r2.f67463g = r5
                zn.j r1 = r8.f67477h
                a10.y r2 = r1.f67463g
                if (r2 == 0) goto L_0x0490
                rx3.g r1 = r1.f67467o
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2.f337508e = r1
            L_0x0490:
                zn.j r1 = r8.f67477h
                a10.y r1 = r1.f67463g
                if (r1 == 0) goto L_0x04a4
                r8.f67473d = r10
                r2 = 3
                r8.f67474e = r2
                java.lang.String r2 = "/"
                java.lang.Object r0 = r1.mo164471g(r2, r0, r8)
                if (r0 != r9) goto L_0x04a4
                return r9
            L_0x04a4:
                zn.j r0 = r8.f67477h
                a10.y r0 = r0.f67463g
                if (r0 == 0) goto L_0x051d
                r1 = 4
                io.flutter.embedding.engine.plugins.FlutterPlugin[] r2 = new p172io.flutter.embedding.engine.plugins.FlutterPlugin[r1]
                com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin r1 = new com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin
                r1.<init>()
                r2[r4] = r1
                java.lang.Class<ab2.b> r1 = ab2.C91982b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ab2.b r1 = (ab2.C91982b) r1
                io.flutter.embedding.engine.plugins.FlutterPlugin r1 = r1.wg0(r3)
                r2[r3] = r1
                lo.f r1 = new lo.f
                r1.<init>()
                r5 = 2
                r2[r5] = r1
                n6.b r1 = new n6.b
                r1.<init>()
                r5 = 3
                r2[r5] = r1
                java.util.List r1 = sx3.C64197v.m75537f(r2)
                zn.j r2 = r8.f67477h
                r2.getClass()
                java.lang.Class<do.j> r2 = p493do.C86383j.class
                di3.d r5 = di3.C86312j.m106911c(r2)
                do.j r5 = (p493do.C86383j) r5
                f70.b r5 = r5.mo120808xK()
                di3.d r6 = di3.C86312j.m106911c(r2)
                do.j r6 = (p493do.C86383j) r6
                co.b r6 = r6.mo120806lx()
                di3.d r7 = di3.C86312j.m106911c(r2)
                do.j r7 = (p493do.C86383j) r7
                co.a r7 = r7.yh0()
                di3.d r2 = di3.C86312j.m106911c(r2)
                do.j r2 = (p493do.C86383j) r2
                f70.g r2 = r2.mo120807tl()
                r12 = 4
                io.flutter.embedding.engine.plugins.FlutterPlugin[] r13 = new p172io.flutter.embedding.engine.plugins.FlutterPlugin[r12]
                r13[r4] = r5
                r13[r3] = r6
                r3 = 2
                r13[r3] = r7
                r3 = 3
                r13[r3] = r2
                java.util.List r2 = sx3.C64197v.m75537f(r13)
                java.util.List r1 = sx3.C110818d0.m150933e0(r1, r2)
                r0.mo164465a(r1)
            L_0x051d:
                com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r18 = 1993(0x7c9, double:9.847E-321)
                r20 = 0
                r22 = 1
                r17.mo175913w(r18, r20, r22)
            L_0x0528:
                com.tencent.mm.flutter.ui.FlutterPageStyle r3 = new com.tencent.mm.flutter.ui.FlutterPageStyle
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 1023(0x3ff, float:1.434E-42)
                r36 = 0
                r24 = r3
                r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
                zn.j r0 = r8.f67477h
                a10.y r1 = r0.f67463g
                if (r1 == 0) goto L_0x0550
                r1.mo164466b(r0)
            L_0x0550:
                java.lang.String r0 = "markShowFlutterPage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
                long r0 = java.lang.System.currentTimeMillis()
                com.tencent.pigeon.BizPigeon$BizEnterStatusInfo r2 = p007bo.C16812l.f45421a
                if (r2 != 0) goto L_0x055e
                goto L_0x0565
            L_0x055e:
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r2.setStartShowFlutterPageTime(r0)
            L_0x0565:
                zn.j r0 = r8.f67477h
                a10.y r1 = r0.f67463g
                if (r1 == 0) goto L_0x057e
                android.content.Context r2 = r8.f67478i
                r4 = 0
                r6 = 4
                r7 = 0
                r8.f67473d = r10
                r5 = 4
                r8.f67474e = r5
                r5 = r37
                java.lang.Object r0 = a10.C112726y.m154145i(r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L_0x057e
                return r9
            L_0x057e:
                bo.f r0 = p007bo.C16801f.f45399a
                java.lang.Class<ex0.d> r1 = ex0.C45696d.class
                k40.a r1 = f40.C86709a0.m107533q(r1)
                ex0.d r1 = (ex0.C45696d) r1
                r2 = 90
                r1.mo70972RM(r2)
                boolean r1 = p007bo.C16797b.f45394a
                if (r1 != 0) goto L_0x059c
                r12 = 4
                kj2.d r9 = kj2.C117407d.INSTANCE
                r10 = 1971(0x7b3, double:9.74E-321)
                r14 = 1
                r9.mo182089r(r10, r12, r14)
            L_0x059c:
                boolean r1 = p007bo.C16813m.f45428e
                if (r1 != 0) goto L_0x05ab
                r12 = 6
                kj2.d r9 = kj2.C117407d.INSTANCE
                r10 = 1971(0x7b3, double:9.74E-321)
                r14 = 1
                r9.mo182089r(r10, r12, r14)
            L_0x05ab:
                java.lang.Class<l31.e> r1 = l31.C61212e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                l31.e r1 = (l31.C61212e) r1
                o31.b r2 = o31.C11345b.BizTimeLineUI
                l31.e r1 = r1.mo86178qr(r0, r2)
                o31.a r2 = o31.C76986a.BizTimeline
                r1.mo86179qs(r0, r2)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p406zn.C23522j.C23525i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: zn.j$b */
    public static final class C23526b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C23522j f67479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23526b(C23522j jVar) {
            super(0);
            this.f67479d = jVar;
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_biz_expose_warm_up_engine_group, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C23522j jVar = this.f67479d;
            boolean booleanValue = valueOf.booleanValue();
            String str = jVar.f67460d;
            Log.m105924i(str, "alwaysWarmUpEngineGroup " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: zn.j$c */
    public static final class C23527c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C23522j f67480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23527c(C23522j jVar) {
            super(0);
            this.f67480d = jVar;
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_flutter_check_surface_on_stop_or_pause, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C23522j jVar = this.f67480d;
            boolean booleanValue = valueOf.booleanValue();
            String str = jVar.f67460d;
            Log.m105924i(str, "checkSurfaceOnStopOrPause " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: zn.j$j */
    public static final class C23528j extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C23522j f67481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23528j(C23522j jVar) {
            super(0);
            this.f67481d = jVar;
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_use_flutter, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C23522j jVar = this.f67481d;
            boolean booleanValue = valueOf.booleanValue();
            String str = jVar.f67460d;
            Log.m105924i(str, "openFlutter " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: zn.j$k */
    public static final class C23529k extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C23522j f67482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23529k(C23522j jVar) {
            super(0);
            this.f67482d = jVar;
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_biz_time_use_aff, 1) != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            C23522j jVar = this.f67482d;
            boolean booleanValue = valueOf.booleanValue();
            String str = jVar.f67460d;
            Log.m105924i(str, "useAff " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: zn.j$h */
    public static final class C23530h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C23530h f67483d = new C23530h();

        public C23530h() {
            super(0);
        }

        public Object invoke() {
            ((C86380f) C86312j.m106911c(C86380f.class)).mo120802DN(8, (Activity) null);
            ((C86382i) C86312j.m106911c(C86382i.class)).mo120802DN(8, (Activity) null);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.brandservice.FlutterBizFeatureService$onBizMainCellExpose$1", mo125469f = "FlutterBizFeatureService.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
    /* renamed from: zn.j$g */
    public static final class C23531g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f67484d;

        public C23531g(C15601d<? super C23531g> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C23531g(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C23531g((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f67484d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f67484d = 1;
                if (((C110245g) C86312j.m106911c(C110245g.class)).Tw0(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.brandservice.FlutterBizFeatureService$killFlutterInstants$1", mo125469f = "FlutterBizFeatureService.kt", mo125470l = {244}, mo125471m = "invokeSuspend")
    /* renamed from: zn.j$d */
    public static final class C23532d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f67485d;

        /* renamed from: e */
        public final /* synthetic */ C23522j f67486e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23532d(C23522j jVar, C15601d<? super C23532d> dVar) {
            super(2, dVar);
            this.f67486e = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C23532d(this.f67486e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C23532d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f67485d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C23522j jVar = this.f67486e;
                C112726y yVar = jVar.f67463g;
                if (yVar != null) {
                    this.f67485d = 1;
                    if (yVar.mo164469e(jVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f67486e.f67463g = null;
            return C13598b0.f38549a;
        }
    }

    public void Ca0() {
        C53895h.m60466d(this.f67461e, (C66212f) null, (C53934p0) null, new C23532d(this, (C15601d<? super C23532d>) null), 3, (Object) null);
    }

    /* renamed from: G8 */
    public void mo35403G8() {
        if (mo35410vH()) {
            C16804h.f45407a.mo17846a("mainCellExpose");
            boolean bf02 = ((C110245g) C86312j.m106911c(C110245g.class)).bf0();
            if ((!this.f67464h && !bf02) || (!bf02 && ((Boolean) ((C36570n) this.f67468p).getValue()).booleanValue())) {
                Log.m105918d("MicroMsg.BizFlutterReportHelper", "markCreateEngineGroup create=" + true);
                C16812l.f45422b = true;
                BizPigeon.BizEnterStatusInfo bizEnterStatusInfo = C16812l.f45421a;
                if (bizEnterStatusInfo != null) {
                    bizEnterStatusInfo.setCreateEngineGroup(true);
                }
                this.f67464h = true;
                this.f67462f = C53895h.m60466d(this.f67461e, (C66212f) null, (C53934p0) null, new C23531g((C15601d<? super C23531g>) null), 3, (Object) null);
            }
            C61926c.m72668M(C23530h.f67483d);
            ((C86382i) C86312j.m106911c(C86382i.class)).mo120803Lo("brandServiceBoxExpose");
            ((C86380f) C86312j.m106911c(C86380f.class)).mo120803Lo("brandServiceBoxExpose");
            ((C31220h) C86312j.m106911c(C31220h.class)).Io0("brandServiceBoxExpose");
        }
    }

    public void Hn0(String str, long j) {
        if (mo35407eG()) {
            C16813m mVar = C16813m.f45424a;
            BizManager c = mVar.mo17857c();
            int d = mVar.mo17858d();
            if (str == null) {
                str = "";
            }
            c.deleteByUserNameAndSvrIdAsync(d, str, j);
        }
    }

    public void R90() {
        if (mo35407eG()) {
            long currentTimeMillis = System.currentTimeMillis() - C55579f.f158250d;
            long j = this.f67469q;
            if (currentTimeMillis < j) {
                C119179t tVar = C119157j.f356862d;
                C23523e eVar = new C23523e(this);
                long j2 = j - currentTimeMillis;
                if (j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    j2 = 5000;
                }
                ((C119157j) tVar).mo183879j(eVar, j2, "onAppForeground");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C23524f(this), "onAppForeground");
        }
    }

    /* renamed from: dK */
    public void mo35406dK() {
        C16813m.f45424a.mo17859e();
    }

    /* renamed from: eG */
    public boolean mo35407eG() {
        boolean z = vx0() && C16813m.f45429f && mo35410vH();
        synchronized (C16813m.f45424a) {
            if (C16813m.f45430g == null) {
                C13601g gVar = C16813m.f45425b;
                boolean decodeBool = ((MultiProcessMMKV) ((C36570n) gVar).getValue()).decodeBool("openAff", false);
                Log.m105918d("MicroMsg.FlutterBizMsgBridge", "resetData useAff = " + z + " preOpenAff = " + decodeBool);
                ((MultiProcessMMKV) ((C36570n) gVar).getValue()).encode("openAff", z);
                if (decodeBool == z || !z) {
                    C16813m.f45430g = Boolean.FALSE;
                } else {
                    Log.m105924i("MicroMsg.FlutterBizMsgBridge", "resetData");
                    C16813m.f45430g = Boolean.TRUE;
                }
            }
        }
        return z;
    }

    public void gf0(String str) {
        if (mo35407eG()) {
            C16813m mVar = C16813m.f45424a;
            BizManager c = mVar.mo17857c();
            int d = mVar.mo17858d();
            if (str == null) {
                str = "";
            }
            c.deleteByUserNameAsync(d, str);
        }
    }

    public boolean u90(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.f67470r) < 1000) {
            C117407d.INSTANCE.mo182089r(1971, 7, 1);
            Log.m105924i(this.f67460d, "openBizTimeLineWithFlutter click in 1000ms");
            return false;
        }
        this.f67470r = currentTimeMillis;
        C53973z1 z1Var = this.f67462f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f67462f = C53895h.m60466d(this.f67461e, (C66212f) null, (C53934p0) null, new C23525i(currentTimeMillis, intent, this, context, (C15601d<? super C23525i>) null), 3, (Object) null);
        return true;
    }

    /* renamed from: vH */
    public boolean mo35410vH() {
        if (vx0()) {
            C16813m mVar = C16813m.f45424a;
            if (!C16813m.f45429f) {
                return false;
            }
        }
        C16801f fVar = C16801f.f45399a;
        int i = C16801f.f45402d;
        return (i == 1 || (i != 0 && (fVar.mo17844d() & 1) != 0)) && ((Boolean) ((C36570n) this.f67465j).getValue()).booleanValue();
    }

    public final boolean vx0() {
        C16801f fVar = C16801f.f45399a;
        int i = C16801f.f45403e;
        return (i == 1 || (i != 0 && (fVar.mo17844d() & 2) != 0)) && ((Boolean) ((C36570n) this.f67466n).getValue()).booleanValue();
    }

    /* renamed from: yU */
    public void mo35411yU() {
        if (mo35407eG()) {
            C16813m mVar = C16813m.f45424a;
            mVar.mo17857c().removeAllDataAsync(mVar.mo17858d());
        }
        Ca0();
    }
}

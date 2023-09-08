package c12;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import bp3.C79758p;
import com.tencent.ilink.CloudSession;
import com.tencent.ilink.Context;
import com.tencent.ilink.LogManager;
import com.tencent.ilink.base.Proto;
import com.tencent.ilink.network.Proto;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.ilink.net_change.C30128a;
import com.tencent.p014mm.plugin.ilink.net_change.C30129b;
import com.tencent.p014mm.plugin.ilink.net_change.C30132d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import p206nj.C88957l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uf3.C111158a;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: c12.e */
public final class C16834e {

    /* renamed from: a */
    public static final C16834e f45477a = new C16834e();

    /* renamed from: b */
    public static boolean f45478b;

    /* renamed from: c */
    public static final Object f45479c = new Object();

    /* renamed from: d */
    public static C0000n0 f45480d = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));

    /* renamed from: e */
    public static final C13601g f45481e = C36568h.m40985a(C16840d.f45486d);

    /* renamed from: f */
    public static final C16839a f45482f = new C16839a();

    /* renamed from: c12.e$b */
    public static final class C16835b implements LogManager.Callback {
        public boolean onFilterLogEvent(int i, String str, String str2, String str3, int i2, String str4) {
            return false;
        }

        public void onWriteLogEvent(int i, String str, String str2, String str3, int i2, String str4) {
        }
    }

    /* renamed from: c12.e$c */
    public static final class C16836c implements CloudSession.Callback {

        @C91590f(mo125468c = "com.tencent.mm.plugin.ilink.ILinkInitMgr$initILink$2$onSendCloudCgiRequestEvent$2", mo125469f = "ILinkInitMgr.kt", mo125470l = {151, 154}, mo125471m = "invokeSuspend")
        /* renamed from: c12.e$c$a */
        public static final class C16837a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f45483d;

            /* renamed from: e */
            public final /* synthetic */ Proto.CloudCgiRequest f45484e;

            /* renamed from: c12.e$c$a$a */
            public /* synthetic */ class C16838a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f45485a;

                static {
                    int[] iArr = new int[Proto.CloudCgiType.values().length];
                    iArr[Proto.CloudCgiType.kAuthRequest.ordinal()] = 1;
                    iArr[Proto.CloudCgiType.kTransferRequest.ordinal()] = 2;
                    f45485a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16837a(Proto.CloudCgiRequest cloudCgiRequest, C15601d<? super C16837a> dVar) {
                super(2, dVar);
                this.f45484e = cloudCgiRequest;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C16837a(this.f45484e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C16837a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r5.f45483d
                    java.lang.String r2 = "MicroMsg.ILinkInitMgr"
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L_0x001f
                    if (r1 == r4) goto L_0x001a
                    if (r1 != r3) goto L_0x0012
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L_0x007e
                L_0x0012:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x001a:
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L_0x009b
                L_0x001f:
                    kotlin.ResultKt.throwOnFailure(r6)
                    c12.e r6 = c12.C16834e.f45477a
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r1 = "onSendCloudCgiRequestEvent: taskid "
                    r6.append(r1)
                    com.tencent.ilink.network.Proto$CloudCgiRequest r1 = r5.f45484e
                    int r1 = r1.getCloudTaskid()
                    r6.append(r1)
                    java.lang.String r1 = ", type "
                    r6.append(r1)
                    com.tencent.ilink.network.Proto$CloudCgiRequest r1 = r5.f45484e
                    com.tencent.ilink.network.Proto$CloudCgiType r1 = r1.getCgiType()
                    r6.append(r1)
                    java.lang.String r6 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                    com.tencent.ilink.network.Proto$CloudCgiRequest r6 = r5.f45484e
                    com.tencent.ilink.network.Proto$CloudCgiType r6 = r6.getCgiType()
                    if (r6 != 0) goto L_0x0056
                    r6 = -1
                    goto L_0x005e
                L_0x0056:
                    int[] r1 = c12.C16834e.C16836c.C16837a.C16838a.f45485a
                    int r6 = r6.ordinal()
                    r6 = r1[r6]
                L_0x005e:
                    if (r6 == r4) goto L_0x0081
                    if (r6 == r3) goto L_0x0064
                    r6 = 0
                    goto L_0x009d
                L_0x0064:
                    c12.b r6 = c12.C39886b.f106941a
                    pe3.b r1 = new pe3.b
                    com.tencent.ilink.network.Proto$CloudCgiRequest r4 = r5.f45484e
                    com.google.protobuf.k r4 = r4.getRequestBody()
                    byte[] r4 = r4.mo18748s()
                    r1.<init>(r4)
                    r5.f45483d = r3
                    java.lang.Object r6 = r6.mo62500b(r1, r5)
                    if (r6 != r0) goto L_0x007e
                    return r0
                L_0x007e:
                    rx3.l r6 = (rx3.C13604l) r6
                    goto L_0x009d
                L_0x0081:
                    c12.b r6 = c12.C39886b.f106941a
                    pe3.b r1 = new pe3.b
                    com.tencent.ilink.network.Proto$CloudCgiRequest r3 = r5.f45484e
                    com.google.protobuf.k r3 = r3.getRequestBody()
                    byte[] r3 = r3.mo18748s()
                    r1.<init>(r3)
                    r5.f45483d = r4
                    java.lang.Object r6 = r6.mo62499a(r1, r5)
                    if (r6 != r0) goto L_0x009b
                    return r0
                L_0x009b:
                    rx3.l r6 = (rx3.C13604l) r6
                L_0x009d:
                    if (r6 == 0) goto L_0x00e2
                    com.tencent.ilink.network.Proto$CloudCgiRequest r0 = r5.f45484e
                    A r1 = r6.f38555d
                    java.lang.Number r1 = (java.lang.Number) r1
                    int r1 = r1.intValue()
                    B r6 = r6.f38556e
                    pe3.b r6 = (pe3.C89349b) r6
                    c12.e r3 = c12.C16834e.f45477a
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "onSendCloudCgiRequestEvent: resp taskid "
                    r3.append(r4)
                    int r4 = r0.getCloudTaskid()
                    r3.append(r4)
                    java.lang.String r4 = ", errcode "
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                    com.tencent.ilink.Context r2 = com.tencent.ilink.Context.getInstance()
                    com.tencent.ilink.CloudSession r2 = r2.getCloudSession()
                    int r0 = r0.getCloudTaskid()
                    byte[] r6 = r6.mo123703f()
                    r2.receiveCloudCgiResponse(r0, r1, r6)
                L_0x00e2:
                    rx3.b0 r6 = rx3.C13598b0.f38549a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: c12.C16834e.C16836c.C16837a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public void onCancelCloudCgiRequestEvent(int i) {
            C16834e eVar = C16834e.f45477a;
            Log.m105924i("MicroMsg.ILinkInitMgr", "onCancelCloudCgiRequestEvent taskid:" + i);
        }

        public int onLoginEvent() {
            C16834e eVar = C16834e.f45477a;
            Log.m105924i("MicroMsg.ILinkInitMgr", "onLoginEvent");
            return 0;
        }

        public void onLogoutComplete(int i, int i2) {
            C16834e eVar = C16834e.f45477a;
            Log.m105924i("MicroMsg.ILinkInitMgr", "onLogoutComplete");
        }

        public void onSendCloudCgiRequestEvent(Proto.CloudCgiRequest cloudCgiRequest) {
            C16834e eVar = C16834e.f45477a;
            Log.m105924i("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent");
            if (cloudCgiRequest == null) {
                Log.m105920e("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent: req is null");
            } else {
                C53895h.m60466d(C16834e.f45480d, (C66212f) null, (C53934p0) null, new C16837a(cloudCgiRequest, (C15601d<? super C16837a>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: c12.e$a */
    public static final class C16839a implements C114668z {
        public void onAppBackground(String str) {
            C16834e eVar = C16834e.f45477a;
            Log.m105924i("MicroMsg.ILinkInitMgr", "iLink onAppBackground:" + str);
            Context.getInstance().foregroundChanged(false);
        }

        public void onAppForeground(String str) {
            C16834e eVar = C16834e.f45477a;
            Log.m105924i("MicroMsg.ILinkInitMgr", "iLink onAppForeground:" + str);
            Context.getInstance().foregroundChanged(true);
        }
    }

    /* renamed from: c12.e$d */
    public static final class C16840d extends C87413o implements C32224a<C30128a> {

        /* renamed from: d */
        public static final C16840d f45486d = new C16840d();

        public C16840d() {
            super(0);
        }

        public Object invoke() {
            return MMApplicationContext.isMainProcess() ? new C30129b() : new C30132d();
        }
    }

    /* renamed from: a */
    public final void mo17885a() {
        long currentTicks = Util.currentTicks();
        C88957l.m111078n("ilink2");
        C88957l.m111078n("ilink_network");
        Log.m105924i("MicroMsg.ILinkInitMgr", "initILink, process:" + MMApplicationContext.getProcessName());
        String d = VFSStrategy.m163776d("ILinkCache");
        LogManager.getInstance().init((Proto.IlinkLogConfig) Proto.IlinkLogConfig.newBuilder().setLevel(Proto.IlinkLogLevel.kIlinkLogLevelDebug).setCustomLog(true).setEnableConsole(false).setEnableFilter(false).build());
        LogManager.getInstance().setCallback(new C16835b());
        LogManager.getInstance().open((String) null, (byte[]) null);
        Context.getInstance().init((Proto.IlinkStartConfig) Proto.IlinkStartConfig.newBuilder().setFileDir(C86013q1.m106448i(d, true)).setDebugNet(C79758p.f233760a.mo109883f(new C111158a())).build());
        AppForegroundDelegate.INSTANCE.mo174208a(f45482f);
        ((C30128a) ((C36570n) f45481e).getValue()).mo57166a();
        if (MMApplicationContext.isMainProcess()) {
            Log.m105928w("MicroMsg.ILinkInitMgr", "initILink: mainProcess, set cloud proxy callback");
            Context.getInstance().getCloudSession().config("wechat");
            Context.getInstance().getCloudSession().setCallback(new C16836c());
        }
        Log.m105924i("MicroMsg.ILinkInitMgr", "finished init ilink cost:" + Util.ticksToNow(currentTicks));
    }
}

package kz1;

import a14.C0000n0;
import a14.C53851a;
import a14.C53873d2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import com.tencent.p014mm.plugin.gamelive.service.GameLiveForegroundService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import is3.C60622a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kr0.C76630x0;
import p565ir.C60606n;
import p635os.C89291d;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C64351ey0;
import te3.C64864ys2;
import te3.C64895zs2;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C86522b(dependencies = {C89291d.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: kz1.h */
public final class C88341h extends C86301e implements C46828m {

    /* renamed from: d */
    public boolean f255332d;

    /* renamed from: e */
    public boolean f255333e;

    /* renamed from: f */
    public C53973z1 f255334f;

    /* renamed from: g */
    public boolean f255335g;

    /* renamed from: h */
    public final C60622a f255336h = new C88346e(this);

    /* renamed from: kz1.h$a */
    public interface C88342a {
        /* renamed from: a */
        void mo112617a(GameLiveAppbrandEventService.LiveMemberInfoListPayload liveMemberInfoListPayload);
    }

    /* renamed from: kz1.h$b */
    public interface C88343b {
        /* renamed from: a */
        void mo112616a(boolean z, String str);
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.gamelive.GameLiveMainProcessService$activateForegroundService$1", mo125469f = "GameLiveMainProcessService.kt", mo125470l = {118}, mo125471m = "invokeSuspend")
    /* renamed from: kz1.h$c */
    public static final class C88344c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f255337d;

        /* renamed from: e */
        public final /* synthetic */ C88341h f255338e;

        /* renamed from: f */
        public final /* synthetic */ Context f255339f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88344c(C88341h hVar, Context context, C15601d<? super C88344c> dVar) {
            super(2, dVar);
            this.f255338e = hVar;
            this.f255339f = context;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C88344c(this.f255338e, this.f255339f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C88344c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C53973z1 z1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f255337d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C88341h hVar = this.f255338e;
                boolean z = false;
                if (hVar.f255333e) {
                    C53973z1 z1Var2 = hVar.f255334f;
                    if (z1Var2 != null && ((C53851a) z1Var2).mo74466a()) {
                        z = true;
                    }
                    if (z && (z1Var = this.f255338e.f255334f) != null) {
                        this.f255337d = 1;
                        if (C53873d2.m60391c(z1Var, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    try {
                        Log.m105924i("MicroMsg.GameLiveMainProcessService", "do start service");
                        if (Build.VERSION.SDK_INT >= 26) {
                            this.f255339f.startForegroundService(new Intent(this.f255339f, GameLiveForegroundService.class));
                        } else {
                            this.f255339f.startService(new Intent(this.f255339f, GameLiveForegroundService.class));
                        }
                        this.f255338e.f255333e = true;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.GameLiveMainProcessService", e, "start foreground service error", new Object[0]);
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.gamelive.GameLiveMainProcessService$activateForegroundService$2", mo125469f = "GameLiveMainProcessService.kt", mo125470l = {139}, mo125471m = "invokeSuspend")
    /* renamed from: kz1.h$d */
    public static final class C88345d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f255340d;

        /* renamed from: e */
        public final /* synthetic */ Context f255341e;

        /* renamed from: f */
        public final /* synthetic */ C88341h f255342f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88345d(Context context, C88341h hVar, C15601d<? super C88345d> dVar) {
            super(2, dVar);
            this.f255341e = context;
            this.f255342f = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C88345d(this.f255341e, this.f255342f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C88345d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f255340d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f255340d = 1;
                if (C53965x0.m60607b(500, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "do stop service");
                this.f255341e.stopService(new Intent(this.f255341e, GameLiveForegroundService.class));
                this.f255342f.f255333e = false;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.GameLiveMainProcessService", e, "stop foreground service error", new Object[0]);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kz1.h$e */
    public static final class C88346e implements C60622a {

        /* renamed from: a */
        public final /* synthetic */ C88341h f255343a;

        public C88346e(C88341h hVar) {
            this.f255343a = hVar;
        }

        /* renamed from: a */
        public void mo85574a(int i) {
            Class cls = GameLiveCommonService.class;
            ((GameLiveCommonService) C86312j.m106911c(cls)).getClass();
            if (!GameLiveCommonService.f237640g.getBoolean("disableMicInfo", false)) {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "decide to send LiveVoiceVolume msg");
                XIPCInvoker.m98748a(((GameLiveCommonService) C86312j.m106911c(cls)).vx0(), new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveSendVolumnInfo, (String) null, 0, new GameLiveAppbrandEventService.SimpleLiveStateChangePayload(C90363p0.m113143b(new C13604l("micVolume", Integer.valueOf(i)))), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
                return;
            }
            Log.m105924i("MicroMsg.GameLiveMainProcessService", "receive LiveVoiceVolume msg, but disableMicInfo");
        }

        /* renamed from: b */
        public void mo85575b(List<? extends C64895zs2> list, C64864ys2 ys22) {
            C64864ys2 ys23 = ys22;
            Class cls = GameLiveCommonService.class;
            ((GameLiveCommonService) C86312j.m106911c(cls)).getClass();
            if (GameLiveCommonService.f237640g.getBoolean("disableLiveInfo", false)) {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "receive onLiveInfoChanged,but is disableLiveInfo");
                return;
            }
            GameLiveAppbrandEventService.LiveCommentWrapperInfoPayload liveCommentWrapperInfoPayload = new GameLiveAppbrandEventService.LiveCommentWrapperInfoPayload(0, 0, 0, 0, 0, (List) null, 63, (C8480h) null);
            if (ys23 != null) {
                liveCommentWrapperInfoPayload.f81433d = ys23.f186598g;
                liveCommentWrapperInfoPayload.f81434e = ys23.f186599h;
                liveCommentWrapperInfoPayload.f81435f = ys23.f186596e;
                liveCommentWrapperInfoPayload.f81436g = ys23.f186595d;
                liveCommentWrapperInfoPayload.f81437h = ys23.f186600i;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C64895zs2 zs22 : list) {
                    GameLiveAppbrandEventService.LiveSingleCommentPayload liveSingleCommentPayload = r6;
                    GameLiveAppbrandEventService.LiveSingleCommentPayload liveSingleCommentPayload2 = new GameLiveAppbrandEventService.LiveSingleCommentPayload((Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, 0, 4095, (C8480h) null);
                    GameLiveAppbrandEventService.LiveSingleCommentPayload liveSingleCommentPayload3 = liveSingleCommentPayload;
                    liveSingleCommentPayload3.f81441d = Integer.valueOf(zs22.f186858d);
                    liveSingleCommentPayload3.f81442e = zs22.f186859e;
                    liveSingleCommentPayload3.f81443f = zs22.f186867p;
                    liveSingleCommentPayload3.f81444g = zs22.f186860f;
                    liveSingleCommentPayload3.f81445h = Integer.valueOf(zs22.f186861g);
                    liveSingleCommentPayload3.f81446i = Long.valueOf(zs22.f186862h);
                    liveSingleCommentPayload3.f81447j = Integer.valueOf(zs22.f186873v);
                    liveSingleCommentPayload3.f81448n = Integer.valueOf(zs22.f186866o);
                    liveSingleCommentPayload3.f81449o = zs22.f186868q;
                    liveSingleCommentPayload3.f81450p = zs22.f186870s;
                    liveSingleCommentPayload3.f81451q = zs22.f186871t;
                    int i = zs22.f186873v;
                    if (i != 0) {
                        liveSingleCommentPayload3.f81452r = zs22.f186869r / i;
                    } else {
                        liveSingleCommentPayload3.f81452r = zs22.f186869r;
                    }
                    arrayList.add(liveSingleCommentPayload3);
                }
                liveCommentWrapperInfoPayload.f81438i = arrayList;
            }
            Log.m105924i("MicroMsg.GameLiveMainProcessService", "decide to send IPC msg");
            XIPCInvoker.m98748a(((GameLiveCommonService) C86312j.m106911c(cls)).vx0(), new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveSendCommentInfo, (String) null, 0, liveCommentWrapperInfoPayload, 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
        }

        /* renamed from: c */
        public void mo85576c(int i, int i2) {
            Log.m105924i("MicroMsg.GameLiveMainProcessService", "onLiveNetStatus changed");
            XIPCInvoker.m98748a(((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).vx0(), new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveSendNetWorkInfo, (String) null, 0, new GameLiveAppbrandEventService.LiveNetWorkPayload(i, i2), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
        }

        /* renamed from: d */
        public void mo85577d() {
            Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:onLiveFinished");
            this.f255343a.zx0(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveEventUserStopLiveFromFinderLive, 0, 4);
            this.f255343a.Bx0();
        }

        /* renamed from: e */
        public void mo85578e(boolean z, int i, int i2) {
            Log.m105919d("MicroMsg.GameLiveMainProcessService", "zbql:onShareLiveToConversation:result [%b],shareUserCount:%d,shareRoomCount:%d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
            if (!z) {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "ShareLiveToConversation failed");
                return;
            }
            XIPCInvoker.m98748a(((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).vx0(), new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveShareToFriendCallBack, (String) null, 0, new GameLiveAppbrandEventService.SimpleLiveStateChangePayload(C90364q0.m113147f(new C13604l("shareUserCount", Integer.valueOf(i)), new C13604l("shareRoomCount", Integer.valueOf(i2)))), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
        }

        /* renamed from: f */
        public void mo85579f(boolean z, String str, Integer num) {
            Class cls = GameLiveCommonService.class;
            String str2 = "zbql:onMiniWindowStatusChange,isShown:" + z + ",isGameLiving:%b,appid:" + str + ",versionType:" + num + ",state:%s";
            Object[] objArr = new Object[2];
            objArr[0] = ((GameLiveCommonService) C86312j.m106911c(cls)).Qq0(str == null ? "" : str, num != null ? num.intValue() : 0);
            objArr[1] = ((GameLiveCommonService) C86312j.m106911c(cls)).wx0().mo112614a();
            Log.m105925i("MicroMsg.GameLiveMainProcessService", str2, objArr);
            if (z) {
                GameLiveCommonService gameLiveCommonService = (GameLiveCommonService) C86312j.m106911c(cls);
                if (str == null) {
                    str = "";
                }
                if (gameLiveCommonService.Qq0(str, num != null ? num.intValue() : 0).booleanValue() && ((GameLiveCommonService) C86312j.m106911c(cls)).wx0() == GameLiveCommonService.C80853a.GameLiveState_LivingForeGround) {
                    this.f255343a.getClass();
                    ((C60606n) C86312j.m106911c(C60606n.class)).mo85099wF(false, MMApplicationContext.getContext());
                    Log.m105924i("MicroMsg.GameLiveMainProcessService", "hide MinimizeGameLive");
                }
            }
        }

        /* renamed from: g */
        public void mo85580g(boolean z, int i) {
            Class cls = GameLiveCommonService.class;
            if (z) {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:receive startLive success callback from finder");
                C88341h hVar = this.f255343a;
                hVar.getClass();
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "enableAudio");
                hVar.f255332d = false;
                hVar.wx0(true);
                this.f255343a.xx0();
                XIPCInvoker.m98748a(((GameLiveCommonService) C86312j.m106911c(cls)).vx0(), new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveEventLiveDidStart, (String) null, 0, (Parcelable) null, 14, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
            } else if (i == 1) {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:PostErrType.USER_CANCEL");
                this.f255343a.zx0(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveEventUserCancel, 3, 0);
                ((GameLiveCommonService) C86312j.m106911c(cls)).yx0();
                this.f255343a.Bx0();
            } else if (i != 2) {
                Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:invalid errType");
            } else {
                Log.m105920e("MicroMsg.GameLiveMainProcessService", "zbql:PostErrType.ENTER_ROOM_FAIL");
                ((GameLiveCommonService) C86312j.m106911c(cls)).yx0();
                this.f255343a.Bx0();
            }
        }
    }

    public final void Ax0(Context context, String str, int i, boolean z, String str2, String str3, int i2, long j) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        String str4 = str;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, "reportInfo");
        ((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).getClass();
        ((C88341h) C86312j.m106911c(C88341h.class)).yx0();
        ((C60606n) C86312j.m106911c(C60606n.class)).Qv0(context, str, i, z, str2, str3, i2, j);
    }

    public final void Bx0() {
        if (this.f255335g) {
            Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:unRegisterFinderLiveCallback");
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85031Sb(this.f255336h);
            this.f255335g = false;
        }
    }

    /* renamed from: dg */
    public void mo72034dg(Context context, String str, int i, Boolean bool, Boolean bool2, Long l) {
        C76630x0 x0Var;
        Context context2 = context;
        String str2 = str;
        int i2 = i;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        long longValue = l.longValue();
        Class cls = GameLiveCommonService.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str2, "appId");
        Log.m105924i("MicroMsg.GameLiveMainProcessService", "launchWAGameForFinderLive " + str2 + ' ' + i2 + ' ' + booleanValue + ' ' + booleanValue2);
        GameLiveCommonService gameLiveCommonService = (GameLiveCommonService) C86312j.m106911c(cls);
        if (booleanValue) {
            vx0(true);
            gameLiveCommonService.Cx0(str2);
            MultiProcessMMKV multiProcessMMKV = GameLiveCommonService.f237640g;
            multiProcessMMKV.putInt("onLiveVersionType", i2);
            gameLiveCommonService.Ax0(GameLiveCommonService.C80853a.GameLiveState_PrePare);
            multiProcessMMKV.putInt("gameLivePrepareScene", (booleanValue2 ? GameLiveCommonService.C80855c.PrePareScene_GameStart : GameLiveCommonService.C80855c.PrePareScene_FinderStart).f237688d);
            multiProcessMMKV.putBoolean("onLivingStatusForCrashCheck", true);
            gameLiveCommonService.f237643f = false;
            multiProcessMMKV.putString("onLiveAppIdForCrashCheck", str2);
            multiProcessMMKV.putInt("onLiveVersionTypeForCrashCheck", i2);
            yx0();
        } else {
            if (gameLiveCommonService.f237643f) {
                MultiProcessMMKV multiProcessMMKV2 = GameLiveCommonService.f237640g;
                if (!str2.equals(multiProcessMMKV2.getString("onLiveAppIdForCrashCheck", "")) || i2 != multiProcessMMKV2.getInt("onLiveVersionTypeForCrashCheck", 0)) {
                    Log.m105920e("MicroMsg.GameLiveMainProcessService", "zbql:wrong!!!! reset crash state in launchWAGameForFinderLive,but the appid or versionType is wrong");
                } else {
                    Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql: resumeGameLiveFromCrash");
                    yx0();
                    xx0();
                    GameLiveCommonService gameLiveCommonService2 = (GameLiveCommonService) C86312j.m106911c(cls);
                    Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:resumeGameLiveFromCrash reset GameLiveCommonService params");
                    gameLiveCommonService2.xx0();
                    gameLiveCommonService2.Cx0(str2);
                    multiProcessMMKV2.putInt("onLiveVersionType", i2);
                    gameLiveCommonService2.Ax0(GameLiveCommonService.C80853a.GameLiveState_Destroy);
                    Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:resumeGameLiveFromCrash reset GameLiveCommonService params done");
                    gameLiveCommonService.f237643f = false;
                }
            }
        }
        if (!booleanValue2 && (x0Var = (C76630x0) C86312j.m106911c(C76630x0.class)) != null) {
            C86299o oVar = new C86299o();
            oVar.f250930b = str2;
            oVar.f250931c = i2;
            oVar.f250939k = booleanValue ? 1198 : 1197;
            String h = C75592q0.m90778h();
            Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:" + h + XVFSFile.PATH_SEPARATOR_CHAR + longValue);
            StringBuilder sb = new StringBuilder();
            sb.append(h);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(longValue);
            oVar.f250940l = sb.toString();
            C13598b0 b0Var = C13598b0.f38549a;
            x0Var.mo106898tv(context2, oVar);
        }
        ((GameLiveCommonService) C86312j.m106911c(cls)).getClass();
        GameLiveCommonService.f237640g.putLong("Game_Live_liveId", longValue);
    }

    public final synchronized void vx0(boolean z) {
        C53973z1 z1Var;
        Log.m105924i("MicroMsg.GameLiveMainProcessService", "enableForegroundService current:" + this.f255333e + " request:" + z);
        Context context = MMApplicationContext.getContext();
        if (z) {
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C88344c(this, context, (C15601d<? super C88344c>) null), 3, (Object) null);
        } else if (this.f255333e) {
            C53973z1 z1Var2 = this.f255334f;
            boolean z2 = false;
            if (z1Var2 != null && z1Var2.mo74466a()) {
                z2 = true;
            }
            if (z2 && (z1Var = this.f255334f) != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f255334f = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C88345d(context, this, (C15601d<? super C88345d>) null), 3, (Object) null);
        }
    }

    public final void wx0(boolean z) {
        int i = 0;
        Log.m105925i("MicroMsg.GameLiveMainProcessService", "enableVoiceCapture %b", Boolean.valueOf(z));
        C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
        if (z) {
            i = 100;
        }
        nVar.setVoiceCaptureVolume(i);
    }

    public final void xx0() {
        C64351ey0 zg02 = ((C60606n) C86312j.m106911c(C60606n.class)).zg0();
        GameLiveCommonService gameLiveCommonService = (GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class);
        if (zg02 != null) {
            if (!Util.isNullOrNil(zg02.f183048g)) {
                String str = zg02.f183048g;
                gameLiveCommonService.getClass();
                GameLiveCommonService.f237640g.putString("Game_Live_Nickname", str);
            }
            long j = zg02.f183046e;
            if (j != 0) {
                gameLiveCommonService.getClass();
                GameLiveCommonService.f237640g.putLong("Game_Live_liveId", j);
            }
            if (!Util.isNullOrNil(zg02.f183047f)) {
                String str2 = zg02.f183047f;
                gameLiveCommonService.getClass();
                GameLiveCommonService.f237640g.putString("Game_Live_joinLiveTips", str2);
            }
            if (!Util.isNullOrNil(zg02.f183049h)) {
                String str3 = zg02.f183049h;
                gameLiveCommonService.getClass();
                GameLiveCommonService.f237640g.putString("Game_Live_anchorHeadUrl", str3);
            }
            if (!Util.isNullOrNil(zg02.f183050i)) {
                String str4 = zg02.f183050i;
                gameLiveCommonService.getClass();
                GameLiveCommonService.f237640g.putString("Game_Live_finderGameExportId", str4);
            }
        }
        String h = C75592q0.m90778h();
        gameLiveCommonService.getClass();
        MultiProcessMMKV multiProcessMMKV = GameLiveCommonService.f237640g;
        multiProcessMMKV.putString("Game_Live_finderUsrName", h);
        Log.m105925i("MicroMsg.GameLiveMainProcessService", "zbql:getStartData:gameLiveNickname:%s ,gameLiveAnchorHeadUrl:%s , exportId:%s", multiProcessMMKV.getString("Game_Live_Nickname", ""), multiProcessMMKV.getString("Game_Live_anchorHeadUrl", ""), multiProcessMMKV.getString("Game_Live_finderGameExportId", ""));
    }

    public final void yx0() {
        Log.m105924i("MicroMsg.GameLiveMainProcessService", "zbql:registerFinderLiveCallback");
        ((C60606n) C86312j.m106911c(C60606n.class)).mo85078pP(this.f255336h);
        this.f255335g = true;
    }

    public final void zx0(GameLiveCommonService.IPCLiveControlData.C80852b bVar, int i, int i2) {
        C87412m.m108594g(bVar, "action");
        GameLiveCommonService.IPCLiveControlData.C80852b bVar2 = bVar;
        XIPCInvoker.m98748a(((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).vx0(), new GameLiveCommonService.IPCLiveControlData(bVar2, (String) null, 0, new GameLiveAppbrandEventService.SimpleLiveStateChangePayload(C90364q0.m113147f(new C13604l("event", Integer.valueOf(i)), new C13604l(TPReportKeys.PlayerStep.PLAYER_REASON, Integer.valueOf(i2)))), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
    }
}

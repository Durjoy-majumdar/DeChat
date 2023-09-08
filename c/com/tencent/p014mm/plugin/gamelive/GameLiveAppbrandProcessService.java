package com.tencent.p014mm.plugin.gamelive;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.menu.C83674g;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import com.tencent.p014mm.plugin.gamelive.playgame.C85232a;
import com.tencent.p014mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86301e;
import di3.C86312j;
import ea2.C20561h;
import ea2.C86468a;
import eb0.C31543z5;
import ei3.C86522b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hl0.C87543b;
import hl0.C87545d;
import hl0.C87546e;
import hl0.d$$a;
import hl0.d$$b;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import kotlin.Metadata;
import kr0.C88267e;
import kz1.C88340f;
import kz1.C88341h;
import kz1.C88349l;
import lz1.C88672e;
import lz1.C88686l;
import mj0.C88733c;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import org.json.JSONObject;
import p169ib.C8870b;
import p547hb.C87464c;
import p565ir.C60606n;
import p635os.C89291d;
import qo3.C77407n;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import uj0.C90682i;
import uj0.C90684k;
import yj0.C91464b;
import zt3.C119143b;
import zt3.C119157j;

@C86522b(dependencies = {C89291d.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService */
public final class GameLiveAppbrandProcessService extends C86301e implements C88349l {

    /* renamed from: d */
    public C88349l.C88356g f248205d;

    /* renamed from: e */
    public GameLiveAppbrandEventService f248206e;

    /* renamed from: f */
    public boolean f248207f;

    /* renamed from: g */
    public boolean f248208g = true;

    /* renamed from: h */
    public boolean f248209h;

    /* renamed from: i */
    public C85232a f248210i;

    /* renamed from: j */
    public C88349l.C88355f f248211j;

    /* renamed from: n */
    public int f248212n;

    /* renamed from: o */
    public long f248213o;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/GameLiveAppbrandProcessService$EnterFinderLiveRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "CREATOR", "a", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest */
    public static final class EnterFinderLiveRequest extends AppBrandProxyUIProcessTask.ProcessRequest {
        public static final C85194a CREATOR = new C85194a((C8480h) null);

        /* renamed from: d */
        public final String f248214d;

        /* renamed from: e */
        public int f248215e;

        /* renamed from: f */
        public int f248216f;

        /* renamed from: g */
        public int f248217g;

        /* renamed from: h */
        public String f248218h;

        /* renamed from: i */
        public String f248219i;

        /* renamed from: j */
        public int f248220j;

        /* renamed from: n */
        public long f248221n;

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest$a */
        public static final class C85194a implements Parcelable.Creator<EnterFinderLiveRequest> {
            public C85194a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new EnterFinderLiveRequest(parcel);
            }

            public Object[] newArray(int i) {
                return new EnterFinderLiveRequest[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ EnterFinderLiveRequest(java.lang.String r14, int r15, int r16, int r17, java.lang.String r18, java.lang.String r19, int r20, long r21, int r23, gy3.C8480h r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 2
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r5 = 0
                goto L_0x000a
            L_0x0009:
                r5 = r15
            L_0x000a:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r1 = 1
                r7 = 1
                goto L_0x0013
            L_0x0011:
                r7 = r17
            L_0x0013:
                r1 = r0 & 16
                java.lang.String r3 = ""
                if (r1 == 0) goto L_0x001b
                r8 = r3
                goto L_0x001d
            L_0x001b:
                r8 = r18
            L_0x001d:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0023
                r9 = r3
                goto L_0x0025
            L_0x0023:
                r9 = r19
            L_0x0025:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002b
                r10 = 0
                goto L_0x002d
            L_0x002b:
                r10 = r20
            L_0x002d:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0035
                r0 = 0
                r11 = r0
                goto L_0x0037
            L_0x0035:
                r11 = r21
            L_0x0037:
                r3 = r13
                r4 = r14
                r6 = r16
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.EnterFinderLiveRequest.<init>(java.lang.String, int, int, int, java.lang.String, java.lang.String, int, long, int, gy3.h):void");
        }

        public int describeContents() {
            return 0;
        }

        public Class<C85196a> getTaskClass() {
            return C85196a.class;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeString(this.f248214d);
            parcel.writeInt(this.f248215e);
            parcel.writeInt(this.f248216f);
            parcel.writeInt(this.f248217g);
            parcel.writeString(this.f248218h);
            parcel.writeString(this.f248219i);
            parcel.writeInt(this.f248220j);
            parcel.writeLong(this.f248221n);
        }

        public EnterFinderLiveRequest(String str, int i, int i2, int i3, String str2, String str3, int i4, long j) {
            C87412m.m108594g(str, "appid");
            C87412m.m108594g(str2, "path");
            C87412m.m108594g(str3, "reportInfo");
            this.f248214d = str;
            this.f248215e = i;
            this.f248216f = i2;
            this.f248217g = i3;
            this.f248218h = str2;
            this.f248219i = str3;
            this.f248220j = i4;
            this.f248221n = j;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public EnterFinderLiveRequest(android.os.Parcel r13) {
            /*
                r12 = this;
                java.lang.String r0 = "parcel"
                gy3.C87412m.m108594g(r13, r0)
                java.lang.String r0 = r13.readString()
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x0010
                r3 = r1
                goto L_0x0011
            L_0x0010:
                r3 = r0
            L_0x0011:
                int r4 = r13.readInt()
                int r5 = r13.readInt()
                int r6 = r13.readInt()
                java.lang.String r0 = r13.readString()
                if (r0 != 0) goto L_0x0025
                r7 = r1
                goto L_0x0026
            L_0x0025:
                r7 = r0
            L_0x0026:
                java.lang.String r0 = r13.readString()
                if (r0 != 0) goto L_0x002e
                r8 = r1
                goto L_0x002f
            L_0x002e:
                r8 = r0
            L_0x002f:
                int r9 = r13.readInt()
                long r10 = r13.readLong()
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.EnterFinderLiveRequest.<init>(android.os.Parcel):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$a */
    public static final class C85196a extends AppBrandProxyUIProcessTask {

        /* renamed from: d */
        public final String f248223d = "MicroMsg.GameLive.EnterFinderLiveTask";

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$a$a */
        public static final class C85197a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C85196a f248224d;

            /* renamed from: e */
            public final /* synthetic */ AppBrandProxyUIProcessTask.ProcessRequest f248225e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85197a(C85196a aVar, AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
                super(1);
                this.f248224d = aVar;
                this.f248225e = processRequest;
            }

            public Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    Log.m105924i(this.f248224d.f248223d, "recover success");
                } else {
                    Log.m105924i(this.f248224d.f248223d, "recover failed, start game again");
                    MMActivity activityContext = this.f248224d.getActivityContext();
                    C87412m.m108593f(activityContext, "activityContext");
                    EnterFinderLiveRequest enterFinderLiveRequest = (EnterFinderLiveRequest) this.f248225e;
                    ((C88341h) C86312j.m106911c(C88341h.class)).Ax0(activityContext, enterFinderLiveRequest.f248214d, enterFinderLiveRequest.f248215e, true, enterFinderLiveRequest.f248218h, enterFinderLiveRequest.f248219i, enterFinderLiveRequest.f248220j, enterFinderLiveRequest.f248221n);
                }
                this.f248224d.finishProcess(new EnterFinderLiveResult(0));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$a$b */
        public static final class C85198b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C85196a f248226d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C85198b(C85196a aVar) {
                super(0);
                this.f248226d = aVar;
            }

            public Object invoke() {
                this.f248226d.finishProcess(new EnterFinderLiveResult(0));
                return C13598b0.f38549a;
            }
        }

        public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
            AppBrandProxyUIProcessTask.ProcessRequest processRequest2 = processRequest;
            Class cls = GameLiveCommonService.class;
            Class cls2 = C60606n.class;
            if (!(processRequest2 instanceof EnterFinderLiveRequest)) {
                Log.m105928w(this.f248223d, "handleRequest#EnterFinderTask, request is not EnterFinderRequest");
                return;
            }
            String str = this.f248223d;
            StringBuilder sb = new StringBuilder();
            sb.append("handleRequest appid ");
            EnterFinderLiveRequest enterFinderLiveRequest = (EnterFinderLiveRequest) processRequest2;
            sb.append(enterFinderLiveRequest.f248214d);
            Log.m105924i(str, sb.toString());
            int i = enterFinderLiveRequest.f248216f;
            if (i == 0) {
                if (((C60606n) C86312j.m106911c(cls2)).mo85002F()) {
                    Log.m105924i(this.f248223d, "try to startGame,but isAnchorLiving,finishProcess with error");
                    finishProcess(new EnterFinderLiveResult(1));
                } else if (((GameLiveCommonService) C86312j.m106911c(cls)).f237643f) {
                    Log.m105924i(this.f248223d, "try to startGame, but in crash state, decide to recover");
                    ((C60606n) C86312j.m106911c(cls2)).mo85052c7(getActivityContext(), new C85197a(this, processRequest2));
                } else {
                    Log.m105924i(this.f248223d, "startGame");
                    MMActivity activityContext = getActivityContext();
                    C87412m.m108593f(activityContext, "activityContext");
                    ((C88341h) C86312j.m106911c(C88341h.class)).Ax0(activityContext, enterFinderLiveRequest.f248214d, enterFinderLiveRequest.f248215e, true, enterFinderLiveRequest.f248218h, enterFinderLiveRequest.f248219i, enterFinderLiveRequest.f248220j, enterFinderLiveRequest.f248221n);
                    finishProcess(new EnterFinderLiveResult(0));
                }
            } else if (i == 1) {
                MMActivity activityContext2 = getActivityContext();
                C87412m.m108593f(activityContext2, "activityContext");
                ((C60606n) C86312j.m106911c(cls2)).zr0(activityContext2);
                finishProcess(new EnterFinderLiveResult(0));
            } else if (i == 2) {
                MMActivity activityContext3 = getActivityContext();
                C87412m.m108593f(activityContext3, "activityContext");
                ((C60606n) C86312j.m106911c(cls2)).mo85083qY(activityContext3);
                finishProcess(new EnterFinderLiveResult(0));
            } else if (i == 3) {
                getActivityContext().mmSetOnActivityResultCallback(this);
                MMActivity activityContext4 = getActivityContext();
                C87412m.m108593f(activityContext4, "activityContext");
                ((C60606n) C86312j.m106911c(cls2)).ok0(activityContext4, new C85198b(this));
            } else if (i == 4) {
                ((C60606n) C86312j.m106911c(cls2)).mo85102y7(getActivityContext(), true, enterFinderLiveRequest.f248217g == 1);
                ((GameLiveCommonService) C86312j.m106911c(cls)).yx0();
                finishProcess(new EnterFinderLiveResult(0));
            } else if (i == 5) {
                ((C60606n) C86312j.m106911c(cls2)).mo85102y7(getActivityContext(), false, false);
                finishProcess(new EnterFinderLiveResult(0));
            }
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            super.mmOnActivityResult(i, i2, intent);
            finishProcess(new EnterFinderLiveResult(0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$b */
    public /* synthetic */ class C85199b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f248227a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f248228b;

        static {
            int[] iArr = new int[GameLiveCommonService.C80855c.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            f248227a = iArr;
            int[] iArr2 = new int[GameLiveCommonService.C80853a.values().length];
            iArr2[1] = 1;
            iArr2[3] = 2;
            iArr2[4] = 3;
            f248228b = iArr2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$c */
    public static final class C85200c<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public static final C85200c<R> f248229a = new C85200c<>();

        public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EnterFinderLiveResult enterFinderLiveResult = (EnterFinderLiveResult) processResult;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$d */
    public static final class C85201d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f248230d;

        /* renamed from: e */
        public final /* synthetic */ int f248231e;

        /* renamed from: f */
        public final /* synthetic */ Context f248232f;

        /* renamed from: g */
        public final /* synthetic */ GameLiveAppbrandProcessService f248233g;

        /* renamed from: h */
        public final /* synthetic */ int f248234h;

        /* renamed from: i */
        public final /* synthetic */ C88349l.C88351b f248235i;

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$d$a */
        public static final class C85202a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ Context f248236d;

            public C85202a(Context context) {
                this.f248236d = context;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107140d(0, C76577a.m92153d(this.f248236d, C0966R.color.a_3), C76577a.m92166q(this.f248236d, C0966R.string.a6e));
            }
        }

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$d$b */
        public static final class C85203b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ GameLiveAppbrandProcessService f248237d;

            /* renamed from: e */
            public final /* synthetic */ String f248238e;

            /* renamed from: f */
            public final /* synthetic */ Context f248239f;

            /* renamed from: g */
            public final /* synthetic */ int f248240g;

            /* renamed from: h */
            public final /* synthetic */ C88349l.C88351b f248241h;

            public C85203b(GameLiveAppbrandProcessService gameLiveAppbrandProcessService, String str, Context context, int i, C88349l.C88351b bVar) {
                this.f248237d = gameLiveAppbrandProcessService;
                this.f248238e = str;
                this.f248239f = context;
                this.f248240g = i;
                this.f248241h = bVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                GameLiveAppbrandProcessService.vx0(this.f248237d, this.f248238e, this.f248239f, true);
                this.f248237d.wx0(0, this.f248240g, (GameLiveAppbrandEventService.LiveStartInfoPayload) null);
                C88349l.C88351b bVar = this.f248241h;
                if (bVar != null) {
                    ((C87543b) bVar).mo122010a(1);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$d$c */
        public static final class C85204c implements C77407n.C12924o {

            /* renamed from: a */
            public final /* synthetic */ C88349l.C88351b f248242a;

            public C85204c(C88349l.C88351b bVar) {
                this.f248242a = bVar;
            }

            /* renamed from: a */
            public final void mo2362a() {
                C88349l.C88351b bVar = this.f248242a;
                if (bVar != null) {
                    ((C87543b) bVar).mo122010a(0);
                }
            }
        }

        public C85201d(String str, int i, Context context, GameLiveAppbrandProcessService gameLiveAppbrandProcessService, int i2, C88349l.C88351b bVar) {
            this.f248230d = str;
            this.f248231e = i;
            this.f248232f = context;
            this.f248233g = gameLiveAppbrandProcessService;
            this.f248234h = i2;
            this.f248235i = bVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.GameLiveAppbrandProcessService", "zbql:exitGameLive from js or menu");
            if (((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).Qq0(this.f248230d, this.f248231e).booleanValue()) {
                C77407n nVar = new C77407n(this.f248232f, 1, false);
                Context context = this.f248232f;
                GameLiveAppbrandProcessService gameLiveAppbrandProcessService = this.f248233g;
                String str = this.f248230d;
                int i = this.f248234h;
                C88349l.C88351b bVar = this.f248235i;
                nVar.f225779n1 = true;
                nVar.f225771i = new C85202a(context);
                nVar.f225782p = new C85203b(gameLiveAppbrandProcessService, str, context, i, bVar);
                nVar.f225802y = new C85204c(bVar);
                nVar.mo107573q();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$e */
    public static final class C85205e<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C88349l.C88352c f248243d;

        public C85205e(C88349l.C88352c cVar) {
            this.f248243d = cVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Parcelable parcelable = ((GameLiveCommonService.IPCLiveControlData) obj).f237647g;
            C87412m.m108592e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveCurrentRoomInfoPayload");
            GameLiveAppbrandEventService.LiveCurrentRoomInfoPayload liveCurrentRoomInfoPayload = (GameLiveAppbrandEventService.LiveCurrentRoomInfoPayload) parcelable;
            C88349l.C88352c cVar = this.f248243d;
            if (cVar != null) {
                int i = liveCurrentRoomInfoPayload.f81439d;
                String str = liveCurrentRoomInfoPayload.f81440e;
                d$$a d__a = (d$$a) cVar;
                C87545d dVar = d__a.f253610a;
                C88267e eVar = d__a.f253611b;
                int i2 = d__a.f253612c;
                dVar.getClass();
                HashMap hashMap = new HashMap(1);
                hashMap.put("startTime", Long.valueOf(((System.currentTimeMillis() - C31543z5.m39452b()) / 1000) + ((long) i)));
                hashMap.put("topic", str);
                eVar.mo109647a(i2, dVar.mo115112m("ok", hashMap));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$f */
    public static final class C85206f<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C88349l.C88353d f248244d;

        public C85206f(C88349l.C88353d dVar) {
            this.f248244d = dVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            ArrayList arrayList = new ArrayList();
            Parcelable parcelable = ((GameLiveCommonService.IPCLiveControlData) obj).f237647g;
            C87412m.m108592e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveMemberInfoListPayload");
            List<GameLiveAppbrandEventService.LiveMemberInfoPayload> list = ((GameLiveAppbrandEventService.LiveMemberInfoListPayload) parcelable).f248282d;
            C87412m.m108592e(list, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveMemberInfoPayload>");
            for (GameLiveAppbrandEventService.LiveMemberInfoPayload next : list) {
                arrayList.add(C90364q0.m113147f(new C13604l("nickname", next.f248283d), new C13604l("rewardAmountInHeat", Integer.valueOf(next.f248284e))));
            }
            C87546e eVar = (C87546e) this.f248244d;
            eVar.getClass();
            HashMap hashMap = new HashMap(1);
            hashMap.put("memberList", arrayList);
            eVar.f253628a.mo109647a(eVar.f253629b, eVar.f253630c.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$g */
    public static final class C85207g<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public static final C85207g<R> f248245a = new C85207g<>();

        public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EnterFinderLiveResult enterFinderLiveResult = (EnterFinderLiveResult) processResult;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$h */
    public static final class C85208h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntimeWC f248246d;

        /* renamed from: e */
        public final /* synthetic */ Context f248247e;

        /* renamed from: f */
        public final /* synthetic */ String f248248f;

        /* renamed from: g */
        public final /* synthetic */ int f248249g;

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$h$a */
        public static final class C85209a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntimeWC f248250d;

            /* renamed from: e */
            public final /* synthetic */ Context f248251e;

            /* renamed from: f */
            public final /* synthetic */ String f248252f;

            /* renamed from: g */
            public final /* synthetic */ int f248253g;

            /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$h$a$a */
            public static final class C85210a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

                /* renamed from: a */
                public static final C85210a<R> f248254a = new C85210a<>();

                public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
                    EnterFinderLiveResult enterFinderLiveResult = (EnterFinderLiveResult) processResult;
                }
            }

            public C85209a(AppBrandRuntimeWC appBrandRuntimeWC, Context context, String str, int i) {
                this.f248250d = appBrandRuntimeWC;
                this.f248251e = context;
                this.f248252f = str;
                this.f248253g = i;
            }

            public final void run() {
                C83928t1 J1 = this.f248250d.mo113178J1();
                C87464c cVar = J1 != null ? (C87464c) J1.mo116150E0(C87464c.class) : null;
                if (cVar != null) {
                    cVar.mo111266l(true, false, new C8870b());
                }
                C81956c.m100675c(this.f248251e, new EnterFinderLiveRequest(this.f248252f, this.f248253g, 1, 0, (String) null, (String) null, 0, 0, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (C8480h) null), C85210a.f248254a, (Intent) null);
            }
        }

        public C85208h(AppBrandRuntimeWC appBrandRuntimeWC, Context context, String str, int i) {
            this.f248246d = appBrandRuntimeWC;
            this.f248247e = context;
            this.f248248f = str;
            this.f248249g = i;
        }

        public final void run() {
            ((C83181q) ((C88267e) this.f248246d.f238150p).getJsRuntime().mo63321n0(C83181q.class)).post(new C85209a(this.f248246d, this.f248247e, this.f248248f, this.f248249g));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$i */
    public static final class C85211i implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ Context f248255d;

        public C85211i(Context context) {
            this.f248255d = context;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107140d(0, C76577a.m92153d(this.f248255d, C0966R.color.a_3), C76577a.m92166q(this.f248255d, C0966R.string.a6d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$j */
    public static final class C85212j implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f248256d;

        /* renamed from: e */
        public final /* synthetic */ GameLiveAppbrandProcessService f248257e;

        /* renamed from: f */
        public final /* synthetic */ String f248258f;

        /* renamed from: g */
        public final /* synthetic */ Runnable f248259g;

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$j$a */
        public static final class C85213a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ Context f248260d;

            public C85213a(Context context) {
                this.f248260d = context;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107140d(0, C76577a.m92153d(this.f248260d, C0966R.color.a_3), C76577a.m92166q(this.f248260d, C0966R.string.a6e));
            }
        }

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$j$b */
        public static final class C85214b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ GameLiveAppbrandProcessService f248261d;

            /* renamed from: e */
            public final /* synthetic */ String f248262e;

            /* renamed from: f */
            public final /* synthetic */ Context f248263f;

            /* renamed from: g */
            public final /* synthetic */ Runnable f248264g;

            public C85214b(GameLiveAppbrandProcessService gameLiveAppbrandProcessService, String str, Context context, Runnable runnable) {
                this.f248261d = gameLiveAppbrandProcessService;
                this.f248262e = str;
                this.f248263f = context;
                this.f248264g = runnable;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                GameLiveAppbrandProcessService.vx0(this.f248261d, this.f248262e, this.f248263f, false);
                this.f248261d.wx0(0, 2, (GameLiveAppbrandEventService.LiveStartInfoPayload) null);
                this.f248264g.run();
            }
        }

        public C85212j(Context context, GameLiveAppbrandProcessService gameLiveAppbrandProcessService, String str, Runnable runnable) {
            this.f248256d = context;
            this.f248257e = gameLiveAppbrandProcessService;
            this.f248258f = str;
            this.f248259g = runnable;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C77407n nVar = new C77407n(this.f248256d, 1, false);
            Context context = this.f248256d;
            GameLiveAppbrandProcessService gameLiveAppbrandProcessService = this.f248257e;
            String str = this.f248258f;
            Runnable runnable = this.f248259g;
            nVar.f225771i = new C85213a(context);
            nVar.f225782p = new C85214b(gameLiveAppbrandProcessService, str, context, runnable);
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$k */
    public static final class C85215k<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C88349l.C88354e f248265d;

        public C85215k(C88349l.C88354e eVar) {
            this.f248265d = eVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Parcelable parcelable = ((GameLiveCommonService.IPCLiveControlData) obj).f237647g;
            C87412m.m108592e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveTopicPayload");
            GameLiveAppbrandEventService.LiveTopicPayload liveTopicPayload = (GameLiveAppbrandEventService.LiveTopicPayload) parcelable;
            C88349l.C88354e eVar = this.f248265d;
            if (eVar != null) {
                Boolean valueOf = Boolean.valueOf(liveTopicPayload.f248298e);
                String str = liveTopicPayload.f248299f;
                d$$b d__b = (d$$b) eVar;
                C87545d dVar = d__b.f253613a;
                C88267e eVar2 = d__b.f253614b;
                int i = d__b.f253615c;
                dVar.getClass();
                HashMap hashMap = new HashMap(1);
                if (valueOf.booleanValue()) {
                    eVar2.mo109647a(i, dVar.mo115112m("ok", hashMap));
                    return;
                }
                hashMap.put("errMsg", str);
                eVar2.mo109647a(i, dVar.mo115112m("fail", hashMap));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$l */
    public static final class C85216l<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public static final C85216l<R> f248266a = new C85216l<>();

        public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EnterFinderLiveResult enterFinderLiveResult = (EnterFinderLiveResult) processResult;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$m */
    public static final class C85217m<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public static final C85217m<R> f248267a = new C85217m<>();

        public /* bridge */ /* synthetic */ void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            EnterFinderLiveResult enterFinderLiveResult = (EnterFinderLiveResult) processResult;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$n */
    public static final class C85218n<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ Context f248268a;

        public C85218n(Context context) {
            this.f248268a = context;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            if (((EnterFinderLiveResult) processResult).f248222d != 0) {
                C77426q qVar = new C77426q(this.f248268a);
                qVar.mo107606r(C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a5_));
                qVar.mo107595g(C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a59));
                qVar.mo107601m(C0966R.string.a5a);
                qVar.mo107589a(true);
                qVar.mo107603o();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$o */
    public static final class C85219o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GameLiveAppbrandProcessService f248269d;

        /* renamed from: e */
        public final /* synthetic */ Context f248270e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f248271f;

        /* renamed from: g */
        public final /* synthetic */ String f248272g;

        /* renamed from: h */
        public final /* synthetic */ int f248273h;

        /* renamed from: i */
        public final /* synthetic */ C88349l.C88350a f248274i;

        public C85219o(GameLiveAppbrandProcessService gameLiveAppbrandProcessService, Context context, JSONObject jSONObject, String str, int i, C88349l.C88350a aVar) {
            this.f248269d = gameLiveAppbrandProcessService;
            this.f248270e = context;
            this.f248271f = jSONObject;
            this.f248272g = str;
            this.f248273h = i;
            this.f248274i = aVar;
        }

        public final void run() {
            GameLiveAppbrandProcessService gameLiveAppbrandProcessService = this.f248269d;
            C85232a aVar = gameLiveAppbrandProcessService.f248210i;
            if (aVar == null) {
                gameLiveAppbrandProcessService.f248210i = new C85232a(this.f248270e, this.f248271f, this.f248272g, this.f248273h, this.f248274i);
            } else if (aVar != null) {
                JSONObject jSONObject = this.f248271f;
                String str = this.f248272g;
                int i = this.f248273h;
                C88349l.C88350a aVar2 = this.f248274i;
                aVar.f248302c = jSONObject;
                aVar.f248314o = aVar2;
                aVar.mo118322a(str, i);
                aVar.mo118323b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$p */
    public static final class C85220p implements Runnable {

        /* renamed from: d */
        public static final C85220p f248275d = new C85220p();

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$p$a */
        public static final class C85221a<T> implements C1256g {

            /* renamed from: d */
            public static final C85221a<T> f248276d = new C85221a<>();

            /* renamed from: a */
            public void mo894a(Object obj) {
                GameLiveCommonService.IPCLiveControlData iPCLiveControlData = (GameLiveCommonService.IPCLiveControlData) obj;
                C88672e eVar = (C88672e) C86312j.m106911c(C88672e.class);
                eVar.getClass();
                Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "stop appbrand audio");
                C20561h.m22332s().mo32149H();
                WeakReference<C88733c> weakReference = eVar.f256004w;
                if (!(weakReference == null || weakReference.get() == null)) {
                    eVar.f256004w.get().mo123168z((C86468a) null);
                }
                try {
                    OutputStream outputStream = eVar.f255996o;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException unused) {
                }
                for (C91464b c : ((HashMap) eVar.f255993i).values()) {
                    c.mo125399c();
                }
                ((HashMap) eVar.f255993i).clear();
                if (eVar.f255990f != null) {
                    Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "quit handler");
                    eVar.f255990f.getLooper().quit();
                    eVar.f255990f.quit();
                }
                if (eVar.f255991g != null) {
                    Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "quit ipcHandler");
                    eVar.f255991g.getLooper().quit();
                    eVar.f255991g.quit();
                }
                if (eVar.f255992h != null) {
                    try {
                        eVar.f255989e.write(1);
                        eVar.f255989e.flush();
                        eVar.f255989e.close();
                        eVar.f255989e = null;
                        eVar.f255992h.close();
                    } catch (IOException e) {
                        Log.m105921e("MicroMsg.GameLiveAppbrandAudioMgrService", "close localServerSocket exception", e);
                    }
                }
                C119143b bVar = eVar.f255988d;
                if (bVar != null) {
                    bVar.shutdownNow();
                    eVar.f255988d = null;
                }
                eVar.f255992h = null;
                eVar.f255990f = null;
                eVar.f255991g = null;
                MMApplicationContext.getContext().getContentResolver().unregisterContentObserver(eVar.f256002u);
                if (!eVar.vx0()) {
                    eVar.f256006y.mo80134c(MMApplicationContext.getContext());
                }
            }
        }

        public final void run() {
            ((GameLiveAppbrandRenderMgrService) C86312j.m106911c(GameLiveAppbrandRenderMgrService.class)).getClass();
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionStopPush, (String) null, 0, (Parcelable) null, 14, (C8480h) null), GameLiveCommonService.C80854b.class, C85221a.f248276d);
        }
    }

    public static final void vx0(GameLiveAppbrandProcessService gameLiveAppbrandProcessService, String str, Context context, boolean z) {
        gameLiveAppbrandProcessService.f248209h = true;
        ((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).getClass();
        MultiProcessMMKV multiProcessMMKV = GameLiveCommonService.f237640g;
        multiProcessMMKV.putBoolean("onLivingStatusForCrashCheck", false);
        multiProcessMMKV.putString("onLiveAppIdForCrashCheck", "");
        multiProcessMMKV.putInt("onLiveVersionTypeForCrashCheck", 0);
        gameLiveAppbrandProcessService.xx0();
        C81956c.m100675c(context, new EnterFinderLiveRequest(str, 0, 4, z ? 1 : 0, (String) null, (String) null, 0, 0, 242, (C8480h) null), C88340f.f255331a, (Intent) null);
    }

    /* renamed from: Ao */
    public Boolean mo118236Ao() {
        return Boolean.valueOf(this.f248208g);
    }

    /* renamed from: Bc */
    public void mo118237Bc(String str, int i, Context context) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(context, "context");
        C81956c.m100675c(context, new EnterFinderLiveRequest(str, 0, 5, 0, (String) null, (String) null, 0, 0, 250, (C8480h) null), C85200c.f248229a, (Intent) null);
    }

    /* renamed from: F9 */
    public void mo118238F9(C88349l.C88353d dVar) {
        C87412m.m108594g(dVar, "callback1");
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionGetMemberList, (String) null, 0, (Parcelable) null, 14, (C8480h) null), GameLiveCommonService.C80854b.class, new C85206f(dVar));
    }

    public void P40(Context context, String str, int i, JSONObject jSONObject, C88349l.C88350a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        if (!((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).Qq0(str, i).booleanValue()) {
            Log.m105920e("MicroMsg.GameLiveAppbrandProcessService", "startPlayGameAnchorSetting failed, not gameliving");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C85219o(this, context, jSONObject, str, i, aVar));
    }

    /* renamed from: QG */
    public long mo118240QG() {
        return this.f248213o;
    }

    public void R00() {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionSyncLiveState, (String) null, 0, (Parcelable) null, 14, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
    }

    /* renamed from: R8 */
    public void mo118242R8(Context context, String str, int i) {
        Class<GameLiveCommonService.C80854b> cls = GameLiveCommonService.C80854b.class;
        Class cls2 = GameLiveCommonService.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        Log.m105924i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterBackGround");
        if (((GameLiveCommonService) C86312j.m106911c(cls2)).Qq0(str, i).booleanValue()) {
            String str2 = WeChatProcess.PROCESS_MAIN;
            XIPCInvoker.m98748a(str2, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionMinimizeGameLive, str, 0, (Parcelable) null, 12, (C8480h) null), cls, (C1256g) null);
            ((C88672e) C86312j.m106911c(C88672e.class)).wx0();
            if (!this.f248209h) {
                XIPCInvoker.m98748a(str2, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionPauseLive, str, 0, (Parcelable) null, 12, (C8480h) null), cls, (C1256g) null);
            }
            ((GameLiveCommonService) C86312j.m106911c(cls2)).Ax0(GameLiveCommonService.C80853a.GameLiveState_LivingBackGround);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.tencent.mm.ipcinvoker.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.tencent.mm.ipcinvoker.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: hb.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: com.tencent.mm.ipcinvoker.g} */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void T80(java.lang.Object r27, android.content.Context r28, java.lang.String r29, int r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r15 = r29
            r5 = r30
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r14 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80853a.GameLiveState_LivingForeGround
            java.lang.Class<lz1.e> r8 = lz1.C88672e.class
            java.lang.Class<hb.c> r9 = p547hb.C87464c.class
            java.lang.Class<com.tencent.mm.feature.gamelive.GameLiveCommonService> r10 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.class
            java.lang.Class<com.tencent.mm.feature.gamelive.GameLiveCommonService$b> r13 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80854b.class
            java.lang.String r3 = "runtime"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r3 = "appId"
            gy3.C87412m.m108594g(r15, r3)
            java.lang.String r11 = "MicroMsg.GameLiveAppbrandProcessService"
            java.lang.String r3 = "zbql:onAppbrandEnterForeground"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            di3.d r3 = di3.C86312j.m106911c(r10)
            r12 = r3
            com.tencent.mm.feature.gamelive.GameLiveCommonService r12 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService) r12
            r7 = r1
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r7 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r7
            java.lang.Boolean r1 = r12.Qq0(r15, r5)
            boolean r1 = r1.booleanValue()
            r6 = 0
            if (r1 != 0) goto L_0x0063
            com.tencent.mm.plugin.appbrand.page.t1 r1 = r7.mo113178J1()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r1.mo116150E0(r9)
            hb.c r1 = (p547hb.C87464c) r1
            goto L_0x004f
        L_0x004e:
            r1 = r6
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.mo111258h()
        L_0x0054:
            com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService r1 = r0.f248206e
            if (r1 == 0) goto L_0x005a
            r1.f248277a = r6
        L_0x005a:
            r0.f248206e = r6
            java.lang.String r1 = "zbql:onAppbrandEnterForeground not gameLiving,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            return
        L_0x0063:
            com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService r1 = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService
            r1.<init>(r7)
            r0.f248206e = r1
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r1 = r12.wx0()
            int[] r3 = com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.C85199b.f248228b
            int r1 = r1.ordinal()
            r1 = r3[r1]
            java.lang.String r3 = "state %s"
            r4 = 1
            r27 = r7
            r7 = 2
            r6 = 0
            if (r1 == r4) goto L_0x0246
            r5 = 3
            if (r1 == r7) goto L_0x009a
            if (r1 == r5) goto L_0x009a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r2 = r12.wx0()
            java.lang.String r2 = r2.mo112614a()
            r1[r6] = r2
            java.lang.String r2 = "gameLiving onAppbrandEnterForeground,but state is wrong,state:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r1)
            r7 = 0
            r9 = 0
            goto L_0x0241
        L_0x009a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r2 = r12.wx0()
            java.lang.String r2 = r2.mo112614a()
            r1[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r1)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData r2 = new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData
            com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$b r17 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionResumeLive
            r18 = 0
            r19 = 0
            r20 = 12
            r21 = 0
            r1 = r2
            r22 = r2
            r2 = r17
            r23 = r3
            r3 = r29
            r4 = r18
            r5 = r19
            r6 = r20
            r16 = r27
            r15 = 2
            r7 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = r22
            r1 = r23
            r7 = 0
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r1, r2, r13, r7)
            di3.d r1 = di3.C86312j.m106911c(r8)
            lz1.e r1 = (lz1.C88672e) r1
            r1.xx0()
            com.tencent.mm.plugin.appbrand.page.t1 r1 = r16.mo113178J1()
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r1 = r1.mo116150E0(r9)
            r6 = r1
            hb.c r6 = (p547hb.C87464c) r6
            goto L_0x00ee
        L_0x00ed:
            r6 = r7
        L_0x00ee:
            if (r6 == 0) goto L_0x00f3
            r6.mo111258h()
        L_0x00f3:
            di3.d r1 = di3.C86312j.m106911c(r10)
            com.tencent.mm.feature.gamelive.GameLiveCommonService r1 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService) r1
            r1.getClass()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.f237640g
            java.lang.String r2 = "isPushing"
            r9 = 0
            boolean r3 = r1.getBoolean(r2, r9)
            if (r3 == 0) goto L_0x0110
            java.lang.String r1 = "startPush: isPushing return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r4 = 1
            goto L_0x021b
        L_0x0110:
            java.lang.String r3 = "startPush"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            di3.d r3 = di3.C86312j.m106911c(r10)
            com.tencent.mm.feature.gamelive.GameLiveCommonService r3 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService) r3
            r3.getClass()
            r4 = 1
            r1.putBoolean(r2, r4)
            di3.d r1 = di3.C86312j.m106911c(r8)
            lz1.e r1 = (lz1.C88672e) r1
            r1.getClass()
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.String r5 = "MicroMsgGameLiveAudio"
            r3[r9] = r5
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r16.mo113210l1()
            int r5 = r5.f234818T
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r5 = "%s%d"
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)
            byte[] r2 = r2.getBytes()
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)
            r1.f256005x = r2
            zt3.t r3 = zt3.C119157j.f356862d
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r9] = r2
            java.lang.String r2 = "gamelive_audio_mix_%s"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            java.util.concurrent.LinkedBlockingQueue r5 = new java.util.concurrent.LinkedBlockingQueue
            r5.<init>()
            zt3.j r3 = (zt3.C119157j) r3
            zt3.b r2 = r3.mo183882m(r2, r15, r15, r5)
            r1.f255988d = r2
            r6 = r16
            com.tencent.mm.plugin.appbrand.i2 r2 = r6.f238150p
            kr0.e r2 = (kr0.C88267e) r2
            java.lang.Class<mj0.c> r3 = mj0.C88733c.class
            java.lang.Object r2 = r2.mo125517G0(r3)
            mj0.c r2 = (mj0.C88733c) r2
            java.lang.Object[] r3 = new java.lang.Object[r15]
            r3[r9] = r2
            java.lang.String r5 = r1.f256005x
            r3[r4] = r5
            java.lang.String r5 = "MicroMsg.GameLiveAppbrandAudioMgrService"
            java.lang.String r6 = "start appbrand audio %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.f256004w = r3
            r1.f256000s = r9
            zt3.b r3 = r1.f255988d
            lz1.f r5 = new lz1.f
            r5.<init>(r1)
            r3.execute(r5)
            zt3.b r3 = r1.f255988d
            lz1.g r5 = new lz1.g
            r5.<init>(r1, r2)
            r3.execute(r5)
            di3.d r2 = di3.C86312j.m106911c(r10)
            com.tencent.mm.feature.gamelive.GameLiveCommonService r2 = (com.tencent.p014mm.feature.gamelive.GameLiveCommonService) r2
            rx3.g r2 = r2.f237641d
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01c4
            java.lang.String r2 = "/sdcard/pcm/mix.pcm"
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r2, r9)     // Catch:{ FileNotFoundException -> 0x01c3 }
            r1.f255996o = r2     // Catch:{ FileNotFoundException -> 0x01c3 }
            goto L_0x01c4
        L_0x01c3:
        L_0x01c4:
            yj0.a r2 = r1.f255994j
            r3 = 44100(0xac44, float:6.1797E-41)
            r2.mo125395b(r3, r15)
            android.media.AudioManager r2 = r1.f255997p
            r3 = 3
            int r2 = r2.getStreamVolume(r3)
            r1.f255999r = r2
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r3 = android.provider.Settings.System.CONTENT_URI
            lz1.e$c r5 = r1.f256002u
            r2.registerContentObserver(r3, r4, r5)
            boolean r2 = r1.vx0()
            if (r2 != 0) goto L_0x01f3
            mt1.a r2 = r1.f256006y
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.mo80133b(r3, r1)
        L_0x01f3:
            java.lang.Class<com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService> r1 = com.tencent.p014mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService r1 = (com.tencent.p014mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService) r1
            r1.getClass()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData r2 = new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData
            com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$b r17 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionStartPush
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 14
            r22 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            kz1.e r3 = new kz1.e
            r3.<init>(r0)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r1, r2, r13, r3)
        L_0x021b:
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r1 = r12.wx0()
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r2 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80853a.GameLiveState_Destroy
            if (r1 != r2) goto L_0x023e
            f40.j r1 = f40.C86709a0.m107531m()
            j40.a r1 = r1.mo58407a()
            j40.b r1 = (j40.C87829b) r1
            java.lang.String r1 = r1.f124988a
            java.lang.String r2 = "process().current().getProcessName()"
            gy3.C87412m.m108593f(r1, r2)
            r12.zx0(r1)
            r0.wx0(r15, r9, r7)
            r0.wx0(r4, r9, r7)
        L_0x023e:
            r12.Ax0(r14)
        L_0x0241:
            r8 = r7
            r25 = r13
            goto L_0x02f6
        L_0x0246:
            r6 = r27
            r7 = 0
            r9 = 0
            r15 = 2
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.mm.feature.gamelive.GameLiveCommonService$a r8 = r12.wx0()
            java.lang.String r8 = r8.mo112614a()
            r1[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r1)
            f40.j r1 = f40.C86709a0.m107531m()
            j40.a r1 = r1.mo58407a()
            j40.b r1 = (j40.C87829b) r1
            java.lang.String r1 = r1.f124988a
            java.lang.String r3 = "process().current().processName"
            gy3.C87412m.m108593f(r1, r3)
            r12.zx0(r1)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.f237640g
            java.lang.String r3 = "gameLivePrepareScene"
            int r1 = r1.getInt(r3, r9)
            if (r1 == r4) goto L_0x0281
            if (r1 == r15) goto L_0x027e
            com.tencent.mm.feature.gamelive.GameLiveCommonService$c r1 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80855c.PrePareScene_Origin
            goto L_0x0283
        L_0x027e:
            com.tencent.mm.feature.gamelive.GameLiveCommonService$c r1 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80855c.PrePareScene_FinderStart
            goto L_0x0283
        L_0x0281:
            com.tencent.mm.feature.gamelive.GameLiveCommonService$c r1 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.C80855c.PrePareScene_GameStart
        L_0x0283:
            int[] r3 = com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.C85199b.f248227a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r4) goto L_0x02b5
            if (r1 == r15) goto L_0x0299
            java.lang.String r1 = "preparing, the scene is wrong"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            r15 = r29
            r10 = 2
            goto L_0x02ad
        L_0x0299:
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$h r3 = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$h
            r15 = r29
            r10 = 2
            r3.<init>(r6, r2, r15, r5)
            r4 = 300(0x12c, double:1.48E-321)
            zt3.j r1 = (zt3.C119157j) r1
            r1.getClass()
            r1.mo183892w(r3, r4, r9)
        L_0x02ad:
            r8 = r7
            r24 = r12
            r25 = r13
            r15 = r14
            r1 = 2
            goto L_0x02ee
        L_0x02b5:
            r15 = r29
            r10 = 2
            java.lang.String r1 = "from gamestart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest r1 = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest
            r6 = 1
            r8 = 0
            r11 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 248(0xf8, float:3.48E-43)
            r21 = 0
            r3 = r1
            r4 = r29
            r5 = r30
            r7 = r8
            r8 = r11
            r11 = 0
            r9 = r16
            r10 = r17
            r24 = r12
            r11 = r18
            r25 = r13
            r13 = r20
            r15 = r14
            r14 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$g<R> r3 = com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.C85207g.f248245a
            r8 = 0
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r2, r1, r3, r8)
            r1 = 2
            r9 = 0
        L_0x02ee:
            r0.wx0(r1, r9, r8)
            r3 = r24
            r3.Ax0(r15)
        L_0x02f6:
            r0.f248207f = r9
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData r11 = new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData
            com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData$b r2 = com.tencent.p014mm.feature.gamelive.GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionHideMinimizeGameLive
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r11
            r3 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = r25
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r10, r11, r1, r8)
            r0.f248209h = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gamelive.GameLiveAppbrandProcessService.T80(java.lang.Object, android.content.Context, java.lang.String, int):void");
    }

    public void Ti0(String str, int i, Context context) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(context, "context");
        if (((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).Qq0(str, i).booleanValue()) {
            C81956c.m100675c(context, new EnterFinderLiveRequest(str, 0, 2, 0, (String) null, (String) null, 0, 0, 250, (C8480h) null), C85217m.f248267a, (Intent) null);
        }
    }

    public void V60(String str, int i, Context context, int i2, C88349l.C88351b bVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(context, "context");
        ((C119157j) C119157j.f356862d).mo183895z(new C85201d(str, i, context, this, i2, bVar));
    }

    /* renamed from: VG */
    public int mo118246VG() {
        return this.f248212n;
    }

    public void Wl0(Boolean bool, int i) {
        boolean booleanValue = bool.booleanValue();
        ((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).getClass();
        GameLiveCommonService.f237640g.putBoolean("disableLiveInfo", !booleanValue);
        if (booleanValue) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionSendVolumnCallBackDuration, (String) null, 0, new GameLiveAppbrandEventService.LiveIntPayload(i), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
        }
    }

    /* renamed from: Zs */
    public void mo118248Zs(Boolean bool) {
        AppBrandRuntimeWC appBrandRuntimeWC;
        boolean booleanValue = bool.booleanValue();
        Class<GameLiveCommonService.C80854b> cls = GameLiveCommonService.C80854b.class;
        if (booleanValue) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionEnableMute, (String) null, 0, (Parcelable) null, 14, (C8480h) null), cls, (C1256g) null);
        } else {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionDisableMute, (String) null, 0, (Parcelable) null, 14, (C8480h) null), cls, (C1256g) null);
        }
        GameLiveAppbrandEventService gameLiveAppbrandEventService = this.f248206e;
        if (!(gameLiveAppbrandEventService == null || (appBrandRuntimeWC = gameLiveAppbrandEventService.f248277a) == null)) {
            GameLiveAppbrandEventService.C85230b bVar = new GameLiveAppbrandEventService.C85230b();
            Log.m105924i("GameLiveAppbrandEventService", "send LiveMute event without volumn，mute:" + booleanValue);
            bVar.mo115194p((C88267e) appBrandRuntimeWC.f238150p);
            bVar.mo115164n("mute", Boolean.valueOf(booleanValue ^ true));
            bVar.mo115158h();
        }
        this.f248208g = booleanValue;
        ((C88686l) C86312j.m106911c(C88686l.class)).kg0(false, false);
    }

    public void aj0(String str, int i, Context context, String str2, String str3, int i2, long j) {
        Context context2 = context;
        C87412m.m108594g(str, "appId");
        String str4 = str2;
        C87412m.m108594g(str4, "path");
        String str5 = str3;
        C87412m.m108594g(str5, "reportInfo");
        C81956c.m100675c(context2, new EnterFinderLiveRequest(str, i, 0, 0, str4, str5, i2, j, 8, (C8480h) null), new C85218n(context2), (Intent) null);
    }

    public void ax0(String str, int i) {
        C87412m.m108594g(str, "appId");
        this.f248207f = true;
    }

    /* renamed from: bw */
    public void mo118251bw(int i, long j) {
        this.f248212n = i;
        this.f248213o = j;
    }

    /* renamed from: cV */
    public void mo118252cV(String str, C88349l.C88354e eVar) {
        C87412m.m108594g(str, "topic");
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionSetTopic, (String) null, 0, new GameLiveAppbrandEventService.LiveTopicPayload(str, false, (String) null), 6, (C8480h) null), GameLiveCommonService.C80854b.class, new C85215k(eVar));
    }

    public void d20(Context context, String str, int i) {
        Class cls = GameLiveCommonService.class;
        C87412m.m108594g(str, "appId");
        if (((GameLiveCommonService) C86312j.m106911c(cls)).Qq0(str, i).booleanValue()) {
            ((GameLiveCommonService) C86312j.m106911c(cls)).Ax0(GameLiveCommonService.C80853a.GameLiveState_Destroy);
            xx0();
        }
    }

    public void dq0(int i) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionReportAnchorEntranceEvent, (String) null, 0, new GameLiveAppbrandEventService.AnchorLiveEntrance(i, this.f248212n, this.f248213o), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
    }

    /* renamed from: ea */
    public void mo118255ea(String str, int i, Context context, C88349l.C88355f fVar) {
        String str2 = str;
        Context context2 = context;
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(context2, "context");
        this.f248211j = fVar;
        if (((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).Qq0(str2, i).booleanValue()) {
            C81956c.m100675c(context2, new EnterFinderLiveRequest(str, 0, 3, 0, (String) null, (String) null, 0, 0, 250, (C8480h) null), C85216l.f248266a, (Intent) null);
        }
    }

    /* renamed from: lq */
    public void mo118256lq() {
        this.f248205d = null;
    }

    /* renamed from: sG */
    public void mo118257sG(Context context, String str, int i, Runnable runnable) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(runnable, "closeRunnable");
        if (!((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).Qq0(str, i).booleanValue() || this.f248207f) {
            runnable.run();
            return;
        }
        C77407n nVar = new C77407n(context, 1, true);
        nVar.f225779n1 = true;
        nVar.f225771i = new C85211i(context);
        nVar.f225782p = new C85212j(context, this, str, runnable);
        nVar.f225784p1 = true;
        nVar.mo107568m(C76577a.m92166q(context, C0966R.string.a6f), 17, C76577a.m92151b(context, 14));
        nVar.mo107573q();
    }

    public final void wx0(int i, int i2, GameLiveAppbrandEventService.LiveStartInfoPayload liveStartInfoPayload) {
        AppBrandRuntimeWC appBrandRuntimeWC;
        GameLiveAppbrandEventService gameLiveAppbrandEventService = this.f248206e;
        if (gameLiveAppbrandEventService != null && (appBrandRuntimeWC = gameLiveAppbrandEventService.f248277a) != null) {
            C83674g.C83676b bVar = new C83674g.C83676b();
            bVar.mo115194p((C88267e) appBrandRuntimeWC.f238150p);
            bVar.mo115165o(C90364q0.m113147f(new C13604l("event", Integer.valueOf(i)), new C13604l(TPReportKeys.PlayerStep.PLAYER_REASON, Integer.valueOf(i2))));
            Log.m105924i("GameLiveAppbrandEventService", "zbql: send Event:" + i + ",reason:" + i2);
            if (i == 1) {
                ((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).getClass();
                MultiProcessMMKV multiProcessMMKV = GameLiveCommonService.f237640g;
                Map f = C90364q0.m113147f(new C13604l("nickname", multiProcessMMKV.getString("Game_Live_Nickname", "")), new C13604l("headerUrl", multiProcessMMKV.getString("Game_Live_anchorHeadUrl", "")), new C13604l("joinLiveTips", multiProcessMMKV.getString("Game_Live_joinLiveTips", "")), new C13604l("liveId", Long.valueOf(multiProcessMMKV.getLong("Game_Live_liveId", 0))), new C13604l("finderUsername", multiProcessMMKV.getString("Game_Live_finderUsrName", "")), new C13604l("wxaGameExportId", multiProcessMMKV.getString("Game_Live_finderGameExportId", "")));
                Log.m105925i("GameLiveAppbrandEventService", "zbql: start Event,nickname:%s,blabla", multiProcessMMKV.getString("Game_Live_Nickname", ""));
                bVar.mo115164n("extra", f);
            }
            bVar.mo115158h();
        }
    }

    public final void xx0() {
        Class cls = GameLiveCommonService.class;
        ((GameLiveCommonService) C86312j.m106911c(cls)).getClass();
        MultiProcessMMKV multiProcessMMKV = GameLiveCommonService.f237640g;
        if (!multiProcessMMKV.getBoolean("isPushing", false)) {
            Log.m105924i("MicroMsg.GameLiveAppbrandProcessService", "stopPushing: isNotPushing return");
            return;
        }
        ((GameLiveCommonService) C86312j.m106911c(cls)).getClass();
        multiProcessMMKV.putBoolean("isPushing", false);
        C88349l.C88356g gVar = this.f248205d;
        if (gVar != null) {
            C85220p pVar = C85220p.f248275d;
            C90684k kVar = (C90684k) gVar;
            kVar.f260499v.getMagicBrush().mo111504c();
            kVar.f260499v.mo111630b(false, 0, new C90682i(kVar, pVar));
        }
    }

    /* renamed from: yA */
    public void mo118260yA(C88349l.C88356g gVar) {
        this.f248205d = gVar;
    }

    public void yg0(C88349l.C88352c cVar) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionGetCurrentRoomInfo, (String) null, 0, (Parcelable) null, 14, (C8480h) null), GameLiveCommonService.C80854b.class, new C85205e(cVar));
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/GameLiveAppbrandProcessService$EnterFinderLiveResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "CREATOR", "a", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult */
    public static final class EnterFinderLiveResult extends AppBrandProxyUIProcessTask.ProcessResult {
        public static final C85195a CREATOR = new C85195a((C8480h) null);

        /* renamed from: d */
        public final int f248222d;

        /* renamed from: com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult$a */
        public static final class C85195a implements Parcelable.Creator<EnterFinderLiveResult> {
            public C85195a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new EnterFinderLiveResult(parcel);
            }

            public Object[] newArray(int i) {
                return new EnterFinderLiveResult[i];
            }
        }

        public EnterFinderLiveResult(int i) {
            this.f248222d = i;
        }

        public int describeContents() {
            return 0;
        }

        public void readParcel(Parcel parcel) {
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeInt(this.f248222d);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public EnterFinderLiveResult(Parcel parcel) {
            this(parcel.readInt());
            C87412m.m108594g(parcel, "parcel");
        }
    }
}

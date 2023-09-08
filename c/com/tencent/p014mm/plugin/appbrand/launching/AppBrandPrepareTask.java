package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.appcache.AssetReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import iq0.C87791a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import js0.C88024r;
import k20.C60958c;
import k20.C9556a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask */
public final class AppBrandPrepareTask {

    /* renamed from: a */
    public PrepareParams f243155a;

    /* renamed from: b */
    public volatile transient boolean f243156b = false;

    /* renamed from: c */
    public volatile transient C83453r2<AppBrandSysConfigWC> f243157c;

    /* renamed from: d */
    public volatile transient C1256g<?> f243158d;

    /* renamed from: e */
    public volatile transient WeakReference<Activity> f243159e;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams */
    public static final class PrepareParams implements Parcelable {
        public static final Parcelable.Creator<PrepareParams> CREATOR = new C83249a();

        /* renamed from: A */
        public String f243160A;

        /* renamed from: B */
        public int f243161B;

        /* renamed from: C */
        public int f243162C;

        /* renamed from: D */
        public AppBrandRuntimeReloadReportBundle f243163D;

        /* renamed from: E */
        public boolean f243164E;

        /* renamed from: d */
        public String f243165d;

        /* renamed from: e */
        public int f243166e;

        /* renamed from: f */
        public int f243167f;

        /* renamed from: g */
        public String f243168g;

        /* renamed from: h */
        public String f243169h;

        /* renamed from: i */
        public String f243170i;

        /* renamed from: j */
        public String f243171j;

        /* renamed from: n */
        public int f243172n;

        /* renamed from: o */
        public AppBrandLaunchReferrer f243173o;

        /* renamed from: p */
        public String f243174p;

        /* renamed from: q */
        public WxaAttributes.WxaVersionInfo f243175q;

        /* renamed from: r */
        public boolean f243176r;

        /* renamed from: s */
        public boolean f243177s;

        /* renamed from: t */
        public boolean f243178t;

        /* renamed from: u */
        public QualitySession f243179u;

        /* renamed from: v */
        public ICommLibReader f243180v;

        /* renamed from: w */
        public AppBrandLaunchFromNotifyReferrer f243181w;

        /* renamed from: x */
        public long f243182x;

        /* renamed from: y */
        public boolean f243183y;

        /* renamed from: z */
        public C80247h f243184z;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareParams$a */
        public class C83249a implements Parcelable.Creator<PrepareParams> {
            public Object createFromParcel(Parcel parcel) {
                return new PrepareParams(parcel);
            }

            public Object[] newArray(int i) {
                return new PrepareParams[i];
            }
        }

        public PrepareParams() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f243165d);
            parcel.writeInt(this.f243166e);
            parcel.writeInt(this.f243167f);
            parcel.writeString(this.f243168g);
            parcel.writeString(this.f243169h);
            parcel.writeString(this.f243170i);
            parcel.writeString(this.f243171j);
            parcel.writeInt(this.f243172n);
            parcel.writeParcelable(this.f243173o, i);
            parcel.writeString(this.f243174p);
            parcel.writeParcelable(this.f243175q, i);
            parcel.writeInt(this.f243176r ? 1 : 0);
            parcel.writeInt(this.f243177s ? 1 : 0);
            parcel.writeInt(this.f243178t ? 1 : 0);
            parcel.writeParcelable(this.f243179u, i);
            ICommLibReader.C29316b.m38624b(this.f243180v, parcel, i);
            parcel.writeParcelable(this.f243181w, i);
            parcel.writeLong(this.f243182x);
            parcel.writeByte(this.f243183y ? (byte) 1 : 0);
            parcel.writeInt(this.f243184z.ordinal());
            parcel.writeString(this.f243160A);
            parcel.writeInt(this.f243161B);
            parcel.writeInt(this.f243162C);
            parcel.writeParcelable(this.f243163D, i);
            parcel.writeByte(this.f243164E ? (byte) 1 : 0);
        }

        public PrepareParams(Parcel parcel) {
            this.f243165d = parcel.readString();
            this.f243166e = parcel.readInt();
            this.f243167f = parcel.readInt();
            this.f243168g = parcel.readString();
            this.f243169h = parcel.readString();
            this.f243170i = parcel.readString();
            this.f243171j = parcel.readString();
            this.f243172n = parcel.readInt();
            this.f243173o = (AppBrandLaunchReferrer) parcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader());
            this.f243174p = parcel.readString();
            this.f243175q = (WxaAttributes.WxaVersionInfo) parcel.readParcelable(WxaAttributes.WxaVersionInfo.class.getClassLoader());
            boolean z = false;
            this.f243176r = parcel.readInt() == 1;
            this.f243177s = parcel.readInt() > 0;
            this.f243178t = parcel.readInt() > 0;
            this.f243179u = (QualitySession) parcel.readParcelable(QualitySession.class.getClassLoader());
            this.f243180v = ICommLibReader.C29316b.m38623a(parcel);
            this.f243181w = (AppBrandLaunchFromNotifyReferrer) parcel.readParcelable(AppBrandLaunchFromNotifyReferrer.class.getClassLoader());
            this.f243182x = parcel.readLong();
            this.f243183y = parcel.readByte() > 0;
            this.f243184z = C80247h.m97636c(parcel);
            this.f243160A = parcel.readString();
            this.f243161B = parcel.readInt();
            this.f243162C = parcel.readInt();
            this.f243163D = (AppBrandRuntimeReloadReportBundle) parcel.readParcelable(AppBrandRuntimeReloadReportBundle.class.getClassLoader());
            this.f243164E = parcel.readByte() > 0 ? true : z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$a */
    public class C83251a implements C1256g<PrepareResult> {
        public C83251a() {
            AppBrandPrepareTask.this.f243158d = this;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            try {
                AppBrandPrepareTask.m102178a(AppBrandPrepareTask.this, (PrepareResult) obj);
            } catch (Throwable th) {
                MMHandlerThread.postToMainThread(new C83395o(this, th));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$b */
    public static final class C83252b implements C80883e<PrepareParams, PrepareResult> {
        private C83252b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C83483u uVar;
            int i;
            int i2;
            C1256g gVar2 = gVar;
            PrepareParams prepareParams = (PrepareParams) obj;
            if (prepareParams == null) {
                Log.m105920e("MicroMsg.AppBrandPrepareTask", "PrepareCall invoke NULL input");
                if (gVar2 != null) {
                    PrepareResult prepareResult = new PrepareResult();
                    prepareResult.f243185d = C83254d.EVENT_PREPARE_DONE;
                    prepareResult.f243187f = null;
                    prepareResult.f243186e = null;
                    prepareResult.f243188g = null;
                    gVar2.mo894a(prepareResult);
                    return;
                }
                return;
            }
            String str = prepareParams.f243171j;
            String str2 = prepareParams.f243170i;
            int i3 = prepareParams.f243172n;
            int i4 = prepareParams.f243167f;
            String str3 = prepareParams.f243168g;
            String str4 = prepareParams.f243169h;
            Log.m105925i("MicroMsg.AppBrandPrepareTask", "PrepareCall#invoke username[%s] appId[%s]", str, str2);
            C83483u uVar2 = new C83483u(this, gVar2, prepareParams, str);
            AppLaunchPrepareProcess k = AppLaunchPrepareProcess.m102199k(prepareParams.f243179u.f245832d, true);
            if (k == null) {
                int i5 = i4;
                C83483u uVar3 = uVar2;
                AppLaunchPrepareProcess appLaunchPrepareProcess = new AppLaunchPrepareProcess(str, str2, i3, prepareParams.f243166e, i5, str3, str4, prepareParams.f243173o, prepareParams.f243174p, prepareParams.f243180v, prepareParams.f243175q, prepareParams.f243176r, prepareParams.f243177s, prepareParams.f243179u, prepareParams.f243182x, prepareParams.f243183y, prepareParams.f243184z, prepareParams.f243181w, prepareParams.f243160A, prepareParams.f243161B, prepareParams.f243162C, prepareParams.f243163D, prepareParams.f243164E);
                i2 = 1;
                i = 2;
                uVar = uVar3;
                String str5 = str2;
                int i6 = i3;
                String str6 = str;
                AppBrandPrepareTask$PrepareCall$2 appBrandPrepareTask$PrepareCall$2 = new AppBrandPrepareTask$PrepareCall$2(this, str, str2, gVar, appLaunchPrepareProcess, i6, i5, prepareParams);
                if (C86709a0.m107528h().f251724a.f251792d) {
                    appBrandPrepareTask$PrepareCall$2.mo1180e();
                } else {
                    Log.m105925i("MicroMsg.AppBrandPrepareTask", "prepareCall kernel startup not done yet, wait for it, username[%s] appId[%s]", str6, str5);
                    C86709a0.m107528h().mo121097c(appBrandPrepareTask$PrepareCall$2);
                }
                k = appLaunchPrepareProcess;
            } else {
                uVar = uVar2;
                i2 = 1;
                i = 2;
                C83606m1.m102639c(22, prepareParams.f243170i, prepareParams.f243175q.f239452d, prepareParams.f243172n, prepareParams.f243176r);
                long j = k.f243261n;
                if (j > 0 && gVar2 != null) {
                    PrepareResult prepareResult2 = new PrepareResult();
                    prepareResult2.f243185d = C83254d.EVENT_NEED_DOWNLOAD;
                    prepareResult2.f243190i = j;
                    gVar2.mo894a(prepareResult2);
                }
            }
            k.f243257g = uVar;
            if (k.f243273x0) {
                Object[] objArr = new Object[i];
                objArr[0] = k.f243262o;
                objArr[i2] = k.f243263p;
                Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "setCallback, username[%s] appId[%s], invoke onFallbackBackupWxaAttrsRequested", objArr);
                uVar.mo115780b();
            } else if (k.f243275y0) {
                Object[] objArr2 = new Object[i];
                objArr2[0] = k.f243262o;
                objArr2[i2] = k.f243263p;
                Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "setCallback, username[%s], appId[%s], invoke notifyAppRestartOnLaunchRequested", objArr2);
                uVar.mo115778J();
            } else {
                if (k.f243258h && k.f243260j != null) {
                    Object[] objArr3 = new Object[5];
                    objArr3[0] = k.f243263p;
                    objArr3[i2] = Integer.valueOf(k.f243265q);
                    objArr3[i] = k.f243260j.mo182596a(i2);
                    objArr3[3] = k.f243271w;
                    objArr3[4] = k.f243254d;
                    Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[applaunch][ILaunchWxaAppInfoNotify] setResultCallback already done %s %d, errorAction=%s, sessionId:%s, instanceId:%s", objArr3);
                    k.mo115523h(k.f243260j);
                    k.mo115520e("setCallback");
                    k.mo115518c("setCallback");
                }
                if (k.f243253Z) {
                    C83483u uVar4 = (C83483u) k.f243257g;
                    if (uVar4.f243928d != null) {
                        PrepareResult prepareResult3 = new PrepareResult();
                        prepareResult3.f243185d = C83254d.EVENT_ON_SYNC_JSAPIINFO_START;
                        uVar4.f243928d.mo894a(prepareResult3);
                    }
                }
                if (k.f243264p0) {
                    C83483u uVar5 = (C83483u) k.f243257g;
                    if (uVar5.f243928d != null) {
                        PrepareResult prepareResult4 = new PrepareResult();
                        prepareResult4.f243185d = C83254d.EVENT_ON_SYNC_APPID_ABTEST_INFO_START;
                        uVar5.f243928d.mo894a(prepareResult4);
                    }
                }
                if (k.f243259i && k.f243257g != null) {
                    C83483u uVar6 = (C83483u) k.f243257g;
                    if (uVar6.f243928d != null) {
                        PrepareResult prepareResult5 = new PrepareResult();
                        prepareResult5.f243189h = 100;
                        prepareResult5.f243185d = C83254d.EVENT_DOWNLOAD_PROGRESS;
                        uVar6.f243928d.mo894a(prepareResult5);
                    }
                }
                if (k.f243250W != null && k.f243250W.booleanValue()) {
                    C83483u uVar7 = (C83483u) k.f243257g;
                    if (uVar7.f243928d != null) {
                        PrepareResult prepareResult6 = new PrepareResult();
                        prepareResult6.f243185d = C83254d.EVENT_ON_SYNC_LAUNCH_START;
                        uVar7.f243928d.mo894a(prepareResult6);
                    }
                }
                k.mo115521f();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$c */
    public interface C83253c<C extends AppBrandSysConfigLU> extends C83291b1 {
        /* renamed from: B */
        void mo113268B();

        /* renamed from: C */
        void mo113269C(String str);

        /* renamed from: I */
        void mo113270I();

        /* renamed from: J */
        void mo113271J();

        /* renamed from: L */
        void mo113272L();

        /* renamed from: N */
        void mo113273N(C c, AppBrandLaunchErrorAction appBrandLaunchErrorAction, AppStartupPerformanceReportBundle appStartupPerformanceReportBundle);

        /* renamed from: Q */
        void mo113274Q(int i);

        /* renamed from: c */
        void mo113275c(long j);

        /* renamed from: z */
        void mo113276z();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$d */
    public enum C83254d {
        EVENT_NEED_DOWNLOAD,
        EVENT_PREPARE_DONE,
        EVENT_KILL_CLIENT_PROCESS,
        EVENT_DOWNLOAD_PROGRESS,
        EVENT_ON_SYNC_LAUNCH_START,
        EVENT_DATA_TRANSFER_STATS,
        EVENT_ON_SYNC_JSAPIINFO_START,
        EVENT_ON_LAUNCH_TIMEOUT_FALLBACK_BACKUP_WXAATTRS_RELOAD_REQUESTED,
        EVENT_ON_SYNC_APPID_ABTEST_INFO_START,
        EVENT_NOTIFY_APP_RESTART_ON_LAUNCH_REQUESTED,
        EVENT_NOTIFY_START_MIGRATE_TARGET_APP
    }

    public AppBrandPrepareTask(Activity activity, AppBrandRuntimeWC appBrandRuntimeWC) {
        AppBrandStatObject n1 = appBrandRuntimeWC.mo121253n1();
        this.f243155a = new PrepareParams();
        this.f243159e = new WeakReference<>(activity);
        this.f243155a.f243165d = MMApplicationContext.getProcessName();
        this.f243155a.f243170i = appBrandRuntimeWC.f238147j;
        this.f243155a.f243171j = appBrandRuntimeWC.mo113210l1().f234839s;
        this.f243155a.f243172n = appBrandRuntimeWC.f238149o.f239365g;
        PrepareParams prepareParams = this.f243155a;
        prepareParams.f243166e = n1 == null ? 0 : n1.f245531d;
        prepareParams.f243167f = n1 == null ? 0 : n1.f245533f;
        prepareParams.f243168g = appBrandRuntimeWC.mo113210l1().f239367i;
        this.f243155a.f243169h = appBrandRuntimeWC.mo113210l1().f234840t;
        this.f243155a.f243173o = appBrandRuntimeWC.mo113210l1().f234846y;
        this.f243155a.f243174p = appBrandRuntimeWC.mo113210l1().f234837q;
        this.f243155a.f243180v = appBrandRuntimeWC.mo113184O1(false);
        this.f243155a.f243175q = appBrandRuntimeWC.mo113210l1().f234804H;
        this.f243155a.f243176r = appBrandRuntimeWC.mo121254q1();
        this.f243155a.f243178t = appBrandRuntimeWC.mo113210l1().f234825W0;
        this.f243155a.f243179u = appBrandRuntimeWC.mo113210l1().f239379j1;
        this.f243155a.f243181w = appBrandRuntimeWC.mo113210l1().f239384o1;
        this.f243155a.f243182x = appBrandRuntimeWC.mo113210l1().f234800D;
        this.f243155a.f243183y = appBrandRuntimeWC.mo113210l1().f239389t1;
        this.f243155a.f243184z = appBrandRuntimeWC.mo113210l1().f234829Y0;
        this.f243155a.f243161B = appBrandRuntimeWC.mo113210l1().f234813Q0;
        this.f243155a.f243162C = appBrandRuntimeWC.mo113210l1().f234819T0;
        this.f243155a.f243163D = appBrandRuntimeWC.mo113210l1().f234833b1;
        this.f243155a.f243160A = 1173 == this.f243155a.f243167f ? C87791a.m109237b(appBrandRuntimeWC.mo113210l1().f234807K) : null;
    }

    /* renamed from: a */
    public static void m102178a(AppBrandPrepareTask appBrandPrepareTask, PrepareResult prepareResult) {
        appBrandPrepareTask.getClass();
        C83254d dVar = prepareResult.f243185d;
        PrepareParams prepareParams = appBrandPrepareTask.f243155a;
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "[applaunch] runInClientProcess, event = %s, %s %d", dVar, prepareParams.f243170i, Integer.valueOf(prepareParams.f243172n));
        if (dVar != null) {
            switch (dVar.ordinal()) {
                case 0:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113275c(prepareResult.f243190i);
                        return;
                    }
                    return;
                case 1:
                    AppBrandSysConfigWC appBrandSysConfigWC = prepareResult.f243187f;
                    if (appBrandSysConfigWC == null && prepareResult.f243186e == null) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C83441q(appBrandPrepareTask));
                    } else if (appBrandSysConfigWC != null) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C83450r(appBrandPrepareTask));
                    }
                    if (appBrandPrepareTask.f243157c != null) {
                        AppBrandSysConfigWC appBrandSysConfigWC2 = prepareResult.f243187f;
                        if (appBrandSysConfigWC2 != null) {
                            C88024r.m109571a().postToWorker(new C83457s(appBrandPrepareTask, appBrandSysConfigWC2.f261072r));
                        } else {
                            Log.m105924i("MicroMsg.AppBrandPrepareTask", "runInClientProcess, config null");
                        }
                        try {
                            appBrandPrepareTask.f243157c.mo113273N(prepareResult.f243187f, prepareResult.f243186e, prepareResult.f243188g);
                            return;
                        } catch (Throwable th) {
                            Log.printErrStackTrace("MicroMsg.AppBrandPrepareTask", th, "runInClientProcess, prepare done exception interrupted[%b] appId[%s]", Boolean.valueOf(appBrandPrepareTask.f243156b), appBrandPrepareTask.f243155a.f243170i);
                            if (!appBrandPrepareTask.f243156b) {
                                Activity activity = appBrandPrepareTask.f243159e.get();
                                if (activity != null) {
                                    activity.finish();
                                }
                                MMHandlerThread.postToMainThread(new C83463t(appBrandPrepareTask, th));
                                return;
                            }
                            return;
                        }
                    } else {
                        Log.m105920e("MicroMsg.AppBrandPrepareTask", "runInClientProcess, prepare done, but callback is null");
                        return;
                    }
                case 2:
                    WeakReference<Activity> weakReference = appBrandPrepareTask.f243159e;
                    Activity activity2 = weakReference == null ? null : weakReference.get();
                    if (activity2 != null) {
                        activity2.finish();
                        activity2.overridePendingTransition(0, 0);
                    }
                    int myPid = Process.myPid();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(myPid));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask", "onEventResult", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareResult;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask", "onEventResult", "(Lcom/tencent/mm/plugin/appbrand/launching/AppBrandPrepareTask$PrepareResult;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                case 3:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113274Q(prepareResult.f243189h);
                        return;
                    }
                    return;
                case 4:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113270I();
                        return;
                    }
                    return;
                case 5:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113179K(prepareResult.f243191j);
                        return;
                    }
                    return;
                case 6:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113276z();
                        return;
                    }
                    return;
                case 7:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113272L();
                        return;
                    }
                    return;
                case 8:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113268B();
                        return;
                    }
                    return;
                case 9:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113271J();
                        return;
                    }
                    return;
                case 10:
                    if (appBrandPrepareTask.f243157c != null) {
                        appBrandPrepareTask.f243157c.mo113269C(prepareResult.f243192n);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public void mo115499b() {
        Object[] objArr = new Object[2];
        PrepareParams prepareParams = this.f243155a;
        objArr[0] = prepareParams == null ? null : prepareParams.f243170i;
        objArr[1] = Integer.valueOf(prepareParams == null ? -1 : prepareParams.f243172n);
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "interrupt() appId[%s] type[%d]", objArr);
        this.f243156b = true;
        C83453r2<AppBrandSysConfigWC> r2Var = this.f243157c;
        if (r2Var != null) {
            r2Var.dead();
        }
        if (this.f243158d != null) {
            XIPCInvoker.m98750c(this.f243158d);
            this.f243158d = null;
        }
    }

    /* renamed from: c */
    public boolean mo115500c() {
        return this.f243156b;
    }

    /* renamed from: d */
    public void mo115501d() {
        PrepareParams prepareParams = this.f243155a;
        ICommLibReader iCommLibReader = prepareParams.f243180v;
        Class<KSProcessWeAppLaunch> cls = KSProcessWeAppLaunch.class;
        String str = prepareParams.f243170i;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(iCommLibReader instanceof AssetReader);
        objArr[1] = Integer.valueOf(iCommLibReader == null ? -1 : iCommLibReader.mo113371a());
        objArr[2] = iCommLibReader == null ? "" : iCommLibReader.mo113377i();
        C83226n.m102124a(cls, str, String.format(locale, "CommLibInfo: useLocal=%b,libVersionInt=%d,libVersionStr=%s", objArr));
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, this.f243155a, C83252b.class, new C83251a());
        PrepareParams prepareParams2 = this.f243155a;
        Log.m105925i("MicroMsg.AppBrandPrepareTask", "[applaunch] startPrepare in appbrand %s, %d", prepareParams2.f243170i, Integer.valueOf(prepareParams2.f243172n));
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult */
    public static final class PrepareResult implements Parcelable {
        public static final Parcelable.Creator<PrepareResult> CREATOR = new C83250a();

        /* renamed from: d */
        public C83254d f243185d;

        /* renamed from: e */
        public AppBrandLaunchErrorAction f243186e;

        /* renamed from: f */
        public AppBrandSysConfigWC f243187f;

        /* renamed from: g */
        public AppStartupPerformanceReportBundle f243188g;

        /* renamed from: h */
        public int f243189h;

        /* renamed from: i */
        public long f243190i;

        /* renamed from: j */
        public int f243191j = 0;

        /* renamed from: n */
        public String f243192n;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult$a */
        public class C83250a implements Parcelable.Creator<PrepareResult> {
            public Object createFromParcel(Parcel parcel) {
                return new PrepareResult(parcel);
            }

            public Object[] newArray(int i) {
                return new PrepareResult[i];
            }
        }

        public PrepareResult() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Log.m105925i("MicroMsg.AppBrandPrepareTask", "writeToParcel event[%s]", this.f243185d);
            C83254d dVar = this.f243185d;
            parcel.writeInt(dVar != null ? dVar.ordinal() + 1 : -1);
            parcel.writeParcelable(this.f243186e, i);
            parcel.writeParcelable(this.f243187f, i);
            parcel.writeInt(this.f243189h);
            parcel.writeLong(this.f243190i);
            parcel.writeParcelable(this.f243188g, i);
            parcel.writeInt(this.f243191j);
            parcel.writeString(this.f243192n);
        }

        public PrepareResult(Parcel parcel) {
            C83254d dVar;
            int i = 0;
            int readInt = parcel.readInt();
            C83254d[] values = C83254d.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i];
                if (readInt == dVar.ordinal() + 1) {
                    break;
                }
                i++;
            }
            this.f243185d = dVar;
            this.f243186e = (AppBrandLaunchErrorAction) parcel.readParcelable(AppBrandLaunchErrorAction.class.getClassLoader());
            this.f243187f = (AppBrandSysConfigWC) parcel.readParcelable(AppBrandSysConfigWC.class.getClassLoader());
            this.f243189h = parcel.readInt();
            this.f243190i = parcel.readLong();
            this.f243188g = (AppStartupPerformanceReportBundle) parcel.readParcelable(AppStartupPerformanceReportBundle.class.getClassLoader());
            this.f243191j = parcel.readInt();
            this.f243192n = parcel.readString();
        }
    }
}

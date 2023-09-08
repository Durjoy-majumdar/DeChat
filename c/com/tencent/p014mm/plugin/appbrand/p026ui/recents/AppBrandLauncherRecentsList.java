package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C54258u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.appcache.C81243g;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C29378l0;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81506j0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81508l;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.plugin.appbrand.appusage.C81523q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83229q;
import com.tencent.p014mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherBlankPage;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C68658s0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C68659t0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84678u0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84711y4;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandLauncherDesktopReporter;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84175n;
import com.tencent.p014mm.plugin.appbrand.report.C84243v;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import jr0.C88013a;
import k20.C60958c;
import k20.C9556a;
import kr0.C88273g1;
import ky2.C10432i;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import my3.C61594j;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C76912y0;
import p1031sb.C90159e;
import p849e3.C107168a0;
import p849e3.C107207u;
import sx3.C110818d0;
import zr0.C91931a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList */
public final class AppBrandLauncherRecentsList extends AppBrandLauncherUI.Fragment {

    /* renamed from: y0 */
    public static final /* synthetic */ int f246810y0 = 0;

    /* renamed from: A */
    public final MMHandler f246811A;

    /* renamed from: B */
    public final C84605j f246812B;

    /* renamed from: C */
    public final C84635h0 f246813C;

    /* renamed from: D */
    public C84608m f246814D;

    /* renamed from: E */
    public View f246815E;

    /* renamed from: F */
    public View f246816F;

    /* renamed from: G */
    public C84620b f246817G;

    /* renamed from: H */
    public C84657x f246818H;

    /* renamed from: I */
    public final C104801e0 f246819I;

    /* renamed from: J */
    public int f246820J;

    /* renamed from: K */
    public int f246821K;

    /* renamed from: L */
    public boolean f246822L;

    /* renamed from: M */
    public boolean f246823M;

    /* renamed from: N */
    public String f246824N;

    /* renamed from: P */
    public boolean f246825P;

    /* renamed from: Q */
    public int f246826Q;

    /* renamed from: R */
    public final Object f246827R;

    /* renamed from: S */
    public final C54258u f246828S;

    /* renamed from: T */
    public final C84606k f246829T;

    /* renamed from: U */
    public final MStorage.IOnStorageChange f246830U;

    /* renamed from: V */
    public final MStorage.IOnStorageChange f246831V;

    /* renamed from: W */
    public final MStorage.IOnStorageChange f246832W;

    /* renamed from: X */
    public final MStorage.IOnStorageChange f246833X;

    /* renamed from: Y */
    public final C84607l f246834Y;

    /* renamed from: Z */
    public boolean f246835Z;

    /* renamed from: h */
    public final int f246836h;

    /* renamed from: i */
    public final boolean f246837i;

    /* renamed from: j */
    public final boolean f246838j;

    /* renamed from: n */
    public final boolean f246839n;

    /* renamed from: o */
    public final C84622b0 f246840o;

    /* renamed from: p */
    public final C81516o f246841p;

    /* renamed from: p0 */
    public int f246842p0;

    /* renamed from: q */
    public final Bundle f246843q;

    /* renamed from: r */
    public final AtomicLong f246844r;

    /* renamed from: s */
    public final AtomicLong f246845s;

    /* renamed from: t */
    public final AtomicBoolean f246846t;

    /* renamed from: u */
    public final AtomicLong f246847u;

    /* renamed from: v */
    public final AtomicBoolean f246848v;

    /* renamed from: w */
    public LoadMoreRecyclerView f246849w;

    /* renamed from: x */
    public LinearLayoutManager f246850x;

    /* renamed from: x0 */
    public Dialog f246851x0;

    /* renamed from: y */
    public C84639j0 f246852y;

    /* renamed from: z */
    public final C84624c0 f246853z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$a */
    public class C84592a implements MessageQueue.IdleHandler {
        public C84592a() {
        }

        public boolean queueIdle() {
            LoadMoreRecyclerView loadMoreRecyclerView;
            Looper.myQueue().removeIdleHandler(this);
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
            if (appBrandLauncherRecentsList.f246835Z || (loadMoreRecyclerView = appBrandLauncherRecentsList.f246849w) == null) {
                return false;
            }
            try {
                loadMoreRecyclerView.setLayoutFrozen(true);
                return false;
            } catch (IllegalStateException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$b */
    public class C84593b extends LinearLayoutManager {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$b$a */
        public class C84594a implements Runnable {
            public C84594a() {
            }

            public void run() {
                try {
                    AppBrandLauncherRecentsList.this.f246852y.notifyDataSetChanged();
                } catch (IllegalStateException e) {
                    Log.m105929w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren retry notifyDataSetChanged after scroll e=%s", e);
                }
            }
        }

        public C84593b(Context context, int i, boolean z) {
            super(context, i, z);
        }

        public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
            try {
                super.onLayoutChildren(rVar, wVar);
            } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                Log.m105929w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren exception(%s) retry notifyDataSetChanged", e);
                try {
                    AppBrandLauncherRecentsList.this.f246852y.notifyDataSetChanged();
                } catch (IllegalStateException e2) {
                    Log.m105929w("MicroMsg.AppBrandLauncherRecentsList", "onLayoutChildren retry notifyDataSetChanged e=%s", e2);
                    if (Util.nullAsNil(e2.getMessage()).contains("computing a layout or scrolling")) {
                        C84594a aVar = new C84594a();
                        C84605j jVar = AppBrandLauncherRecentsList.this.f246812B;
                        jVar.sendMessage(jVar.obtainMessage(2, aVar));
                    }
                }
            }
        }

        public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
            try {
                return super.scrollVerticallyBy(i, rVar, wVar);
            } catch (IndexOutOfBoundsException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", e, "scrollVerticallyBy(%d, %s)", Integer.valueOf(i), wVar);
                return 0;
            }
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
            C40553g0 g0Var = new C40553g0(AppBrandLauncherRecentsList.this.getActivity(), AppBrandLauncherRecentsList.this.f246850x);
            g0Var.f44872a = i;
            startSmoothScroll(g0Var);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$c */
    public class C84595c extends RecentsRecyclerView {
        public C84595c(Context context) {
            super(context);
        }

        /* renamed from: B1 */
        public LinearLayoutManager mo63429B1() {
            return AppBrandLauncherRecentsList.this.f246850x;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$d */
    public class C84596d implements C54258u {
        public C84596d() {
        }

        /* renamed from: a */
        public void mo2860a(int i, int i2) {
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
            AppBrandLauncherRecentsList.this.f246819I.f311277t = true;
            appBrandLauncherRecentsList.f246852y.notifyItemRangeRemoved(i, i2);
        }

        /* renamed from: b */
        public void mo2861b(int i, int i2) {
            AppBrandLauncherRecentsList.this.f246852y.notifyItemRangeInserted(i, i2);
        }

        /* renamed from: c */
        public void mo2862c(int i, int i2, Object obj) {
            AppBrandLauncherRecentsList.this.f246852y.notifyItemRangeChanged(i, i2, obj);
        }

        /* renamed from: d */
        public void mo2863d(int i, int i2) {
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
            AppBrandLauncherRecentsList.this.f246819I.f311277t = true;
            appBrandLauncherRecentsList.f246852y.notifyItemMoved(i, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$e */
    public class C84597e implements MStorage.IOnStorageChange {
        public C84597e() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (MStorageEventData.EventType.SINGLE.equals(str)) {
                int i = mStorageEventData.eventId;
                if ((5 == i && AppBrandLauncherRecentsList.this.f246838j) || 2 == i || 3 == i) {
                    Log.m105919d("MicroMsg.AppBrandLauncherRecentsList", "onStarRecordModified, event %d", Integer.valueOf(i));
                    AppBrandLauncherRecentsList.m104192P(AppBrandLauncherRecentsList.this, false, -1, true);
                }
            } else if (MStorageEventData.EventType.BATCH.equals(str) && 3 == mStorageEventData.eventId) {
                Object obj = mStorageEventData.obj;
                if (!(obj instanceof Long) || ((Long) obj).longValue() != AppBrandLauncherRecentsList.this.f246844r.get()) {
                    Log.m105918d("MicroMsg.AppBrandLauncherRecentsList", "onStarRecordModified, batch update");
                    AppBrandLauncherRecentsList.m104192P(AppBrandLauncherRecentsList.this, false, MAlarmHandler.NEXT_FIRE_INTERVAL, true);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$f */
    public class C84598f implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$f$a */
        public class C84599a implements Runnable {
            public C84599a() {
            }

            public void run() {
                AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                if (appBrandLauncherRecentsList.f246849w.f44722C) {
                    appBrandLauncherRecentsList.f246819I.f311278u = false;
                }
            }
        }

        public C84598f() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (MStorageEventData.EventType.SINGLE.equals(str)) {
                int i = mStorageEventData.eventId;
                if (3 == i || 2 == i) {
                    AppBrandLauncherRecentsList.this.mo117067N(new C84599a());
                    Log.m105918d("MicroMsg.AppBrandLauncherRecentsList", "onHistoryRecordModified");
                    AppBrandLauncherRecentsList.m104192P(AppBrandLauncherRecentsList.this, true, MAlarmHandler.NEXT_FIRE_INTERVAL, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$g */
    public class C84600g implements MStorage.IOnStorageChange {
        public C84600g() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105919d("MicroMsg.AppBrandLauncherRecentsList", "onContactUpdate %s", str);
            AppBrandLauncherRecentsList.m104192P(AppBrandLauncherRecentsList.this, false, -1, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$h */
    public class C84601h implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$h$a */
        public class C84602a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f246864d;

            /* renamed from: e */
            public final /* synthetic */ ArrayList f246865e;

            public C84602a(ArrayList arrayList, ArrayList arrayList2) {
                this.f246864d = arrayList;
                this.f246865e = arrayList2;
            }

            public void run() {
                AppBrandLauncherRecentsList.m104193Q(AppBrandLauncherRecentsList.this, this.f246864d, this.f246865e, true);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$h$b */
        public class C84603b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f246867d;

            public C84603b(ArrayList arrayList) {
                this.f246867d = arrayList;
            }

            public void run() {
                LoadMoreRecyclerView loadMoreRecyclerView = AppBrandLauncherRecentsList.this.f246849w;
                if (loadMoreRecyclerView != null && loadMoreRecyclerView.f44787x) {
                    if (loadMoreRecyclerView.mo17036W0()) {
                        C84605j jVar = AppBrandLauncherRecentsList.this.f246812B;
                        jVar.sendMessage(jVar.obtainMessage(2, this));
                        return;
                    }
                    AppBrandLauncherRecentsList.m104194R(AppBrandLauncherRecentsList.this, this.f246867d);
                }
            }
        }

        public C84601h() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            ArrayList<AppBrandRecentTaskInfo> arrayList;
            try {
                Object obj = mStorageEventData.obj;
                if (obj != null && (obj instanceof Long)) {
                    long j = AppBrandLauncherRecentsList.this.f246844r.get();
                    long j2 = AppBrandLauncherRecentsList.this.f246845s.get();
                    Log.m105919d("MicroMsg.AppBrandLauncherRecentsList", "onPagingDataBack ticket %d, mInitFetchTicket %d, mPagingFetchTicket %d", (Long) mStorageEventData.obj, Long.valueOf(j), Long.valueOf(j2));
                    if (mStorageEventData.obj.equals(Long.valueOf(j))) {
                        C81161g2.requireAccountInitializedOnDemand();
                        arrayList = C81161g2.f238473i.f80166f.mo56648a(MAlarmHandler.NEXT_FIRE_INTERVAL, 32);
                    } else {
                        C81161g2.requireAccountInitializedOnDemand();
                        arrayList = C81161g2.f238473i.f80166f.mo56648a(AppBrandLauncherRecentsList.this.f246847u.get(), 32);
                    }
                    if (!Util.isNullOrNil((List) arrayList)) {
                        AppBrandLauncherRecentsList.this.f246847u.set(arrayList.get(arrayList.size() - 1).f239037z);
                    }
                    AppBrandLauncherRecentsList.this.f246840o.getClass();
                    if (mStorageEventData.obj.equals(Long.valueOf(j))) {
                        AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                        AppBrandLauncherRecentsList.this.mo117067N(new C84602a(appBrandLauncherRecentsList.f246838j ? new ArrayList<>(0) : appBrandLauncherRecentsList.f246837i ? C81161g2.Ax0().mo113792Yt(-1, C68585h1.C68586a.ASC) : null, arrayList));
                    } else if (mStorageEventData.obj.equals(Long.valueOf(j2))) {
                        C84605j jVar = AppBrandLauncherRecentsList.this.f246812B;
                        int i = C84605j.f246870b;
                        jVar.mo117294a();
                        C84605j jVar2 = AppBrandLauncherRecentsList.this.f246812B;
                        jVar2.sendMessage(jVar2.obtainMessage(1, new C84603b(arrayList)));
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandLauncherRecentsList", "onPagingDataBack e %s", e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$i */
    public class C84604i implements Runnable {
        public C84604i() {
        }

        public void run() {
            AppBrandLauncherRecentsList.m104195S(AppBrandLauncherRecentsList.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$j */
    public final class C84605j extends Handler {

        /* renamed from: b */
        public static final /* synthetic */ int f246870b = 0;

        public C84605j() {
            super(Looper.getMainLooper());
        }

        /* renamed from: a */
        public final void mo117294a() {
            removeMessages(1);
            removeMessages(2);
            removeCallbacksAndMessages((Object) null);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ((Runnable) message.obj).run();
                removeMessages(2);
                synchronized (AppBrandLauncherRecentsList.this.f246827R) {
                    AppBrandLauncherRecentsList.this.f246827R.notifyAll();
                }
            } else if (i == 2) {
                ((Runnable) message.obj).run();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$k */
    public final class C84606k implements RecyclerView.C16616j.C16618a {
        public C84606k(C84649p pVar) {
        }

        /* renamed from: a */
        public void mo17330a() {
            AppBrandLauncherRecentsList.this.f246819I.f311277t = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$l */
    public final class C84607l extends RecyclerView.C16615g implements RecyclerView.C16616j.C16618a {
        public C84607l(C84649p pVar) {
        }

        /* renamed from: a */
        public void mo17330a() {
            AppBrandLauncherRecentsList.this.mo117066M(new C84656v(this, false));
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            AppBrandLauncherRecentsList.this.mo117066M(new C84656v(this, false));
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            AppBrandLauncherRecentsList.this.mo117066M(new C84656v(this, false));
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            AppBrandLauncherRecentsList.this.mo117066M(new C84656v(this, true));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$m */
    public final class C84608m extends C84642k0<AppBrandRecentTaskInfo, C84609n> {

        /* renamed from: a */
        public final Map<String, String> f246874a = new HashMap();

        public C84608m(C84649p pVar) {
        }

        /* renamed from: a */
        public long mo117296a(Object obj) {
            AppBrandRecentTaskInfo appBrandRecentTaskInfo = (AppBrandRecentTaskInfo) obj;
            return (long) (appBrandRecentTaskInfo.f239031t + appBrandRecentTaskInfo.f239035x).hashCode();
        }

        /* renamed from: b */
        public boolean mo117297b(RecyclerView.C16631z zVar, Object obj, Object obj2) {
            C84609n nVar = (C84609n) zVar;
            if (obj2 != null && (obj2 instanceof Bundle)) {
                Bundle bundle = (Bundle) obj2;
                if (bundle.size() > 0) {
                    if (bundle.containsKey("nick_name")) {
                        nVar.f246876A.setText(bundle.getString("nick_name"));
                    }
                    if (!(bundle.get("running_flag") == null && bundle.get("third_party_app_using_desc") == null)) {
                        C84609n nVar2 = nVar;
                        mo117302g(nVar2, ((AppBrandRecentTaskInfo) obj).f239035x, bundle.getLong("running_flag", 0), bundle.getString("third_party_app_using_desc"));
                    }
                    if (bundle.get("icon") != null) {
                        mo117300e(nVar, bundle.getString("icon"));
                    }
                    if (!AppBrandLauncherRecentsList.this.f246819I.f311278u) {
                        bundle.containsKey("star");
                    }
                    mo117301f(nVar);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public void mo117298c(RecyclerView.C16631z zVar, Object obj) {
            C84609n nVar = (C84609n) zVar;
            AppBrandRecentTaskInfo appBrandRecentTaskInfo = (AppBrandRecentTaskInfo) obj;
            nVar.f246877B.setVisibility(8);
            View view = nVar.f246885z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandRecentTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandRecentTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            nVar.f246876A.setText(Util.isNullOrNil(appBrandRecentTaskInfo.f239032u) ? appBrandRecentTaskInfo.f239031t.replaceFirst("@app", "") : appBrandRecentTaskInfo.f239032u);
            mo117302g(nVar, appBrandRecentTaskInfo.f239035x, appBrandRecentTaskInfo.f239048o, appBrandRecentTaskInfo.f239050q ? appBrandRecentTaskInfo.f239051r : "");
            mo117300e(nVar, appBrandRecentTaskInfo.f239033v);
            String a = C81243g.m99551a(appBrandRecentTaskInfo.f239035x);
            if (Util.isNullOrNil(a)) {
                nVar.f246878C.setVisibility(8);
            } else {
                nVar.f246878C.setText(a);
                nVar.f246878C.setVisibility(0);
            }
            mo117301f(nVar);
            if (!C90159e.m112823b(appBrandRecentTaskInfo.f239027A, 6) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) != 1) {
                nVar.f246882G.setVisibility(8);
                return;
            }
            nVar.f246882G.setVisibility(0);
            C84711y4.m104367a(nVar.f246882G);
        }

        /* renamed from: d */
        public RecyclerView.C16631z mo117299d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new C84609n(layoutInflater.inflate(C0966R.C0971layout.f6422ef, viewGroup, false));
        }

        /* renamed from: e */
        public final void mo117300e(C84609n nVar, String str) {
            boolean z = AppBrandLauncherRecentsList.this.f246822L;
            String str2 = C88394b.f255384g;
            ((HashMap) this.f246874a).put(str, C88394b.C88418q.f255427a.mo122786b(nVar.f246880E, str, C88393a.m110230a(), C88431k.f255437d));
        }

        /* renamed from: f */
        public final void mo117301f(C84609n nVar) {
            C84609n nVar2 = nVar;
            if (AppBrandLauncherRecentsList.this.f246849w.mo17029N0(nVar2.f44854d) == AppBrandLauncherRecentsList.this.f246852y.getItemCount() - 1) {
                View view = nVar2.f246885z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = nVar2.f246885z;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
            if (appBrandLauncherRecentsList.f246839n) {
                nVar2.f246879D.setText(String.valueOf(appBrandLauncherRecentsList.f246849w.mo17029N0(nVar2.f44854d)));
                nVar2.f246879D.setVisibility(0);
                return;
            }
            nVar2.f246879D.setVisibility(8);
        }

        /* renamed from: g */
        public final void mo117302g(C84609n nVar, int i, long j, String str) {
            nVar.f246877B.setVisibility(8);
            nVar.f246883H.setVisibility(8);
            nVar.f246880E.setColorFilter((ColorFilter) null);
            if (!TextUtils.isEmpty(str)) {
                nVar.f246877B.setVisibility(0);
                nVar.f246883H.setVisibility(0);
                nVar.f246883H.setImageResource(C0966R.raw.app_brand_third_party_running_flag);
                nVar.f246883H.setIconColor(AppBrandLauncherRecentsList.this.getResources().getColor(C0966R.color.f3288ma));
                nVar.f246877B.setText(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n */
    public final class C84609n extends RecyclerView.C16631z implements View.OnCreateContextMenuListener, C11184p0, View.OnClickListener {

        /* renamed from: A */
        public TextView f246876A;

        /* renamed from: B */
        public TextView f246877B;

        /* renamed from: C */
        public TextView f246878C;

        /* renamed from: D */
        public TextView f246879D;

        /* renamed from: E */
        public ImageView f246880E;

        /* renamed from: F */
        public View f246881F;

        /* renamed from: G */
        public ImageView f246882G;

        /* renamed from: H */
        public WeImageView f246883H;

        /* renamed from: z */
        public View f246885z;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n$a */
        public class C84610a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRecentTaskInfo f246886d;

            /* renamed from: e */
            public final /* synthetic */ int f246887e;

            /* renamed from: f */
            public final /* synthetic */ String f246888f;

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n$a$a */
            public class C84611a implements Runnable {
                public C84611a() {
                }

                public void run() {
                    if (AppBrandLauncherRecentsList.this.getActivity() != null) {
                        C76879j.m92711E(AppBrandLauncherRecentsList.this.getActivity(), AppBrandLauncherRecentsList.this.getResources().getString(C0966R.string.f7659my, new Object[]{Integer.valueOf(AppBrandLauncherRecentsList.this.f246836h)}), "", AppBrandLauncherRecentsList.this.getResources().getString(C0966R.string.a18), false, (DialogInterface.OnClickListener) null);
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n$a$b */
            public class C84612b implements Runnable {
                public C84612b() {
                }

                public void run() {
                    if (AppBrandLauncherRecentsList.this.getContext() != null) {
                        C76912y0.m92768g(AppBrandLauncherRecentsList.this.getContext(), AppBrandLauncherRecentsList.this.getContext().getResources().getString(C0966R.string.f7909vy));
                    }
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n$a$c */
            public class C84613c implements Runnable {
                public C84613c() {
                }

                public void run() {
                    if (AppBrandLauncherRecentsList.this.getContext() != null) {
                        C76912y0.m92768g(AppBrandLauncherRecentsList.this.getContext(), AppBrandLauncherRecentsList.this.getContext().getResources().getString(C0966R.string.f7910vz));
                    }
                }
            }

            public C84610a(AppBrandRecentTaskInfo appBrandRecentTaskInfo, int i, String str) {
                this.f246886d = appBrandRecentTaskInfo;
                this.f246887e = i;
                this.f246888f = str;
            }

            public void run() {
                int i;
                Class cls = C81500i0.class;
                if (!this.f246886d.f239036y) {
                    AppBrandRecentTaskInfo appBrandRecentTaskInfo = this.f246886d;
                    int jo = ((C81500i0) C81161g2.Bx0(cls)).mo113794jo(appBrandRecentTaskInfo.f239031t, appBrandRecentTaskInfo.f239035x);
                    if (jo == -2) {
                        AppBrandLauncherRecentsList.this.mo117067N(new C84611a());
                        return;
                    } else if (jo == -1) {
                        AppBrandRecentTaskInfo appBrandRecentTaskInfo2 = this.f246886d;
                        Log.m105921e("MicroMsg.AppBrandLauncherRecentsList", "addStarApp, username %s, type %d, fatal", appBrandRecentTaskInfo2.f239031t, Integer.valueOf(appBrandRecentTaskInfo2.f239035x));
                        return;
                    } else {
                        AppBrandLauncherRecentsList.this.mo117066M(new C84612b());
                        i = 6;
                    }
                } else {
                    AppBrandRecentTaskInfo appBrandRecentTaskInfo3 = this.f246886d;
                    ((C81500i0) C81161g2.Bx0(cls)).mo113795kD(appBrandRecentTaskInfo3.f239031t, appBrandRecentTaskInfo3.f239035x, true);
                    i = 7;
                    AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                    if (!appBrandLauncherRecentsList.f246838j && appBrandLauncherRecentsList.f246837i) {
                        C81161g2.requireAccountInitializedOnDemand();
                        C29378l0 l0Var = C81161g2.f238473i;
                        AppBrandRecentTaskInfo appBrandRecentTaskInfo4 = this.f246886d;
                        if (l0Var.mo56645jo(appBrandRecentTaskInfo4.f239031t, appBrandRecentTaskInfo4.f239035x, 2, true, false, 0, 2, (String) null)) {
                            C81508l.m100003e(true, true, (String) null);
                        }
                    }
                    AppBrandLauncherRecentsList.this.mo117066M(new C84613c());
                }
                C84243v.m103852b(this.f246886d, i, this.f246887e, this.f246888f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n$b */
        public class C84614b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRecentTaskInfo f246893d;

            /* renamed from: e */
            public final /* synthetic */ int f246894e;

            /* renamed from: f */
            public final /* synthetic */ String f246895f;

            public C84614b(C84609n nVar, AppBrandRecentTaskInfo appBrandRecentTaskInfo, int i, String str) {
                this.f246893d = appBrandRecentTaskInfo;
                this.f246894e = i;
                this.f246895f = str;
            }

            public void run() {
                AppBrandRecentTaskInfo appBrandRecentTaskInfo = this.f246893d;
                ((C81500i0) C81161g2.Bx0(C81500i0.class)).mo113795kD(appBrandRecentTaskInfo.f239031t, appBrandRecentTaskInfo.f239035x, true);
                C84243v.m103852b(this.f246893d, 7, this.f246894e, this.f246895f);
            }
        }

        public C84609n(View view) {
            super(view);
            this.f246885z = view.findViewById(C0966R.C0970id.c7p);
            this.f246876A = (TextView) view.findViewById(C0966R.C0970id.i2m);
            this.f246877B = (TextView) view.findViewById(C0966R.C0970id.j7l);
            this.f246878C = (TextView) view.findViewById(C0966R.C0970id.kem);
            this.f246879D = (TextView) view.findViewById(C0966R.C0970id.bty);
            this.f246880E = (ImageView) view.findViewById(C0966R.C0970id.f15);
            this.f246881F = view.findViewById(C0966R.C0970id.k05);
            this.f246882G = (ImageView) view.findViewById(C0966R.C0970id.ktf);
            this.f246883H = (WeImageView) view.findViewById(C0966R.C0970id.j7e);
            view.setOnClickListener(this);
            new C68657w(this, view.getContext()).mo108275j(view, this, this);
        }

        public void onClick(View view) {
            C81481f0.C81485d dVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandRecentTaskInfo y = mo117305y();
            if (y == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (AppBrandLauncherRecentsList.this.getActivity() == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                appBrandStatObject.f245533f = 1001;
                appBrandStatObject.f245534g = "" + (C90159e.m112823b(y.f239027A, 6) ? 1 : 0);
                AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                int i = appBrandLauncherRecentsList.f246389e;
                if (i == 10) {
                    appBrandStatObject.f245531d = 11;
                } else if (i == 11) {
                    appBrandStatObject.f245531d = 12;
                } else if (i == 13) {
                    appBrandStatObject.f245531d = 13;
                }
                C84635h0 h0Var = appBrandLauncherRecentsList.f246813C;
                int x1 = appBrandLauncherRecentsList.f246849w.mo63440x1(this);
                WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = h0Var.f246936d;
                if (wAMainFrameEnterHistoryListExposeStruct != null) {
                    wAMainFrameEnterHistoryListExposeStruct.f236471f = 2;
                    wAMainFrameEnterHistoryListExposeStruct.f236472g = (long) x1;
                    wAMainFrameEnterHistoryListExposeStruct.f236473h = wAMainFrameEnterHistoryListExposeStruct.mo86045b("ClickAppid", y.f239041e, true);
                    WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct2 = h0Var.f246936d;
                    wAMainFrameEnterHistoryListExposeStruct2.f236474i = wAMainFrameEnterHistoryListExposeStruct2.mo86045b("ClickAppidName", y.f239044h, true);
                    h0Var.f246936d.f236475j = y.f239036y ? 1 : 0;
                }
                AppBrandLauncherDesktopReporter a = C84175n.f245826d.mo116851a(AppBrandLauncherRecentsList.this.getActivity());
                String str = y.f239041e;
                int x15 = AppBrandLauncherRecentsList.this.f246849w.mo63440x1(this);
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[7];
                objArr[0] = 6;
                objArr[1] = "";
                objArr[2] = "";
                objArr[3] = Integer.valueOf(x15);
                if (str == null) {
                    str = "";
                }
                objArr[4] = str;
                objArr[5] = "";
                objArr[6] = Long.valueOf(a.f158155d);
                nVar.mo160131h(19468, objArr);
                AppBrandLaunchProxyUI.m102164N7(AppBrandLauncherRecentsList.this.getActivity(), y.f239031t, y.f239041e, (String) null, y.f239035x, -1, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
                if (!(AppBrandLauncherRecentsList.this.getActivity() == null || !(AppBrandLauncherRecentsList.this.getActivity() instanceof AppBrandLauncherUI) || (dVar = ((AppBrandLauncherUI) AppBrandLauncherRecentsList.this.getActivity()).f246387h) == null)) {
                    dVar.f239081a[7] = "1";
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            AppBrandRecentTaskInfo y = mo117305y();
            if (y != null) {
                AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                if (appBrandLauncherRecentsList.f246837i) {
                    if (y.f239036y) {
                        contextMenu.add(0, 1, 0, this.f44854d.getContext().getString(C0966R.string.f7911w0));
                    } else {
                        if (!appBrandLauncherRecentsList.f246825P || appBrandLauncherRecentsList.f246826Q == 1) {
                            contextMenu.add(0, 1, 0, this.f44854d.getContext().getString(C0966R.string.f7907vw));
                        }
                    }
                }
                contextMenu.add(0, 2, 0, this.f44854d.getContext().getString(C0966R.string.f7744q8));
                if (C88013a.m109543a()) {
                    contextMenu.add(0, 3, 0, this.f44854d.getContext().getString(C0966R.string.fzl));
                }
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                    contextMenu.add(0, 4, 0, MMApplicationContext.getContext().getString(C0966R.string.f7913w2));
                }
            }
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            ArrayList<AppBrandRecentTaskInfo> arrayList;
            AppBrandRecentTaskInfo y = mo117305y();
            if (y != null && menuItem != null && AppBrandLauncherRecentsList.this.getActivity() != null) {
                int i2 = AppBrandLauncherRecentsList.this.getActivity().getIntent().getIntExtra("extra_get_usage_reason", 3) != 9 ? 1 : 7;
                if (i2 == 7) {
                    str = C84243v.f246076b;
                } else {
                    if (TextUtils.isEmpty(AppBrandLauncherRecentsList.this.f246824N)) {
                        AppBrandLauncherRecentsList.this.f246824N = C84243v.m103851a();
                    }
                    str = AppBrandLauncherRecentsList.this.f246824N;
                }
                if (1 == menuItem.getItemId()) {
                    AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                    if (!appBrandLauncherRecentsList.f246838j) {
                        C84624c0 c0Var = appBrandLauncherRecentsList.f246853z;
                        synchronized (c0Var) {
                            try {
                                arrayList = c0Var.f246906d;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        int size = arrayList.size();
                        AppBrandLauncherRecentsList appBrandLauncherRecentsList2 = AppBrandLauncherRecentsList.this;
                        if (size >= appBrandLauncherRecentsList2.f246836h && !y.f239036y) {
                            if (appBrandLauncherRecentsList2.getActivity() != null) {
                                C76879j.m92711E(AppBrandLauncherRecentsList.this.getActivity(), AppBrandLauncherRecentsList.this.getResources().getString(C0966R.string.f7659my, new Object[]{Integer.valueOf(AppBrandLauncherRecentsList.this.f246836h)}), "", AppBrandLauncherRecentsList.this.getResources().getString(C0966R.string.a18), false, (DialogInterface.OnClickListener) null);
                                return;
                            }
                            return;
                        }
                    }
                    AppBrandLauncherRecentsList.this.f246811A.post(new C84610a(y, i2, str));
                    AppBrandLauncherRecentsList.this.f246819I.f311278u = true;
                    return;
                }
                if (2 == menuItem.getItemId()) {
                    if (y.f239036y) {
                        AppBrandLauncherRecentsList appBrandLauncherRecentsList3 = AppBrandLauncherRecentsList.this;
                        if (!appBrandLauncherRecentsList3.f246838j) {
                            appBrandLauncherRecentsList3.f246811A.post(new C84614b(this, y, i2, str));
                        }
                    }
                    AppBrandLauncherRecentsList appBrandLauncherRecentsList4 = AppBrandLauncherRecentsList.this;
                    appBrandLauncherRecentsList4.f246853z.remove(appBrandLauncherRecentsList4.f246849w.mo63440x1(this));
                    AppBrandLauncherRecentsList appBrandLauncherRecentsList5 = AppBrandLauncherRecentsList.this;
                    appBrandLauncherRecentsList5.f246819I.f311278u = true;
                    AppBrandLauncherRecentsList.this.f246819I.f311277t = true;
                    appBrandLauncherRecentsList5.f246852y.notifyItemRemoved(appBrandLauncherRecentsList5.f246849w.mo63440x1(this));
                    AppBrandLauncherRecentsList.m104195S(AppBrandLauncherRecentsList.this);
                    C81523q1.m100016a(y.f239031t, y.f239041e, y.f239035x);
                }
                if (3 == menuItem.getItemId()) {
                    Class<KSProcessWeAppLaunch> cls = KSProcessWeAppLaunch.class;
                    String str2 = y.f239034w == 4 ? "game" : WeChatBrands.Business.GROUP_MP;
                    String[] strArr = {y.f239041e, y.f239040d};
                    Map<String, String> map = C83229q.f243077a;
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 2; i3++) {
                        sb.append(strArr[i3]);
                        if (i3 != 1) {
                            sb.append("|");
                        }
                    }
                    sb.append(".*");
                    Pattern compile = Pattern.compile(sb.toString());
                    Context context = MMApplicationContext.getContext();
                    Intent intent = new Intent();
                    intent.setClass(context, KeyStepAnalyserActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra("process", cls);
                    intent.putExtra("category", str2);
                    intent.putExtra("session_id_prefix", compile);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyser", "analyse", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/regex/Pattern;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyser", "analyse", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/regex/Pattern;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (4 == menuItem.getItemId()) {
                    Context context3 = AppBrandLauncherRecentsList.this.getContext();
                    String str3 = y.f239031t;
                    WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
                    bVar.f239557a = y.f239041e;
                    bVar.f239566j = 3;
                    AppBrandProfileUI.m104017R7(context3, str3, 3, "", true, bVar.mo113977a(), (Bundle) null, (ActivityStarterIpcDelegate) null);
                }
            }
        }

        /* renamed from: y */
        public AppBrandRecentTaskInfo mo117305y() {
            try {
                AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
                return (AppBrandRecentTaskInfo) appBrandLauncherRecentsList.f246852y.mo117348F4(appBrandLauncherRecentsList.f246849w.mo63440x1(this));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", e, "getAppInfo", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$o */
    public final class C84615o extends RecyclerView.C0130p implements Runnable {
        public C84615o(C84649p pVar) {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            AppBrandLauncherRecentsList appBrandLauncherRecentsList = AppBrandLauncherRecentsList.this;
            appBrandLauncherRecentsList.f246822L = i == 2;
            if (i == 0) {
                appBrandLauncherRecentsList.mo117066M(this);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            AppBrandLauncherRecentsList.m104197U(AppBrandLauncherRecentsList.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsListScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            r2 = (com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.C84609n) r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList r0 = com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.this
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r1 = r0.f246849w
                if (r1 == 0) goto L_0x0040
                androidx.recyclerview.widget.LinearLayoutManager r1 = r0.f246850x
                if (r1 == 0) goto L_0x0040
                com.tencent.mm.plugin.appbrand.ui.recents.j0 r2 = r0.f246852y
                if (r2 == 0) goto L_0x0040
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$m r0 = r0.f246814D
                if (r0 == 0) goto L_0x0040
                int r0 = r1.mo16957C()
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList r1 = com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.this
                androidx.recyclerview.widget.LinearLayoutManager r1 = r1.f246850x
                int r1 = r1.mo16959E()
            L_0x001e:
                if (r0 > r1) goto L_0x0040
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList r2 = com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.this
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView r2 = r2.f246849w
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.mo17023I0(r0)
                boolean r3 = r2 instanceof com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.C84609n
                if (r3 == 0) goto L_0x003d
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$n r2 = (com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.C84609n) r2
                com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo r3 = r2.mo117305y()
                if (r3 == 0) goto L_0x003d
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList r4 = com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.this
                com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$m r4 = r4.f246814D
                java.lang.String r3 = r3.f239033v
                r4.mo117300e(r2, r3)
            L_0x003d:
                int r0 = r0 + 1
                goto L_0x001e
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.C84615o.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$p */
    public final class C84616p extends RecyclerView.C0129l {
        public C84616p(C84649p pVar) {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            rect.left = 0;
            rect.right = 0;
            rect.bottom = 0;
            rect.top = 0;
            if (recyclerView instanceof MRecyclerView) {
                RecyclerView.C16631z P0 = recyclerView.mo17031P0(view);
                if (P0 instanceof C84609n) {
                    View view2 = ((C84609n) P0).f246885z;
                    int i = ((MRecyclerView) recyclerView).mo63440x1(P0) == AppBrandLauncherRecentsList.this.f246852y.getItemCount() + -1 ? 8 : 0;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$ThisItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$ThisItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    public AppBrandLauncherRecentsList() {
        this(true);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r19.getActivity();
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m104192P(com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList r19, boolean r20, long r21, boolean r23) {
        /*
            r0 = r19
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f246848v
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            androidx.fragment.app.FragmentActivity r1 = r19.getActivity()
            if (r1 == 0) goto L_0x001c
            boolean r1 = r1.isFinishing()
            if (r1 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0021
            goto L_0x0167
        L_0x0021:
            com.tencent.mm.plugin.appbrand.ui.recents.c0 r1 = r0.f246853z
            com.tencent.mm.plugin.appbrand.ui.recents.c0 r1 = r1.clone()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r4 == 0) goto L_0x0031
            if (r20 != 0) goto L_0x0031
            goto L_0x0167
        L_0x0031:
            monitor-enter(r1)
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> r4 = r1.f246907e     // Catch:{ all -> 0x0168 }
            monitor-exit(r1)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r5 == 0) goto L_0x0043
            r4 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0060
        L_0x0043:
            int r5 = r4.size()
            int r5 = r5 - r3
            java.lang.Object r5 = r4.get(r5)
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo r5 = (com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) r5
            long r5 = r5.f239037z
            java.lang.Object r4 = r4.get(r2)
            com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo r4 = (com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) r4
            long r7 = r4.f239037z
            r9 = r21
            long r7 = java.lang.Math.max(r7, r9)
            r4 = r5
            r6 = r7
        L_0x0060:
            com.tencent.mm.plugin.appbrand.ui.recents.b0 r8 = r0.f246840o
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appusage.l0 r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238473i
            com.tencent.mm.plugin.appbrand.appusage.l0$d r9 = r9.f80166f
            com.tencent.mm.plugin.appbrand.appusage.l0 r9 = com.tencent.p014mm.plugin.appbrand.appusage.C29378l0.this
            zh3.f r10 = r9.f80165e
            java.util.Locale r9 = java.util.Locale.US
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r13 = "updateTime"
            r12[r2] = r13
            r12[r3] = r13
            java.lang.String r14 = "scene"
            r15 = 2
            r12[r15] = r14
            java.lang.String r14 = "%s>=? and %s<=? and %s=?"
            java.lang.String r14 = java.lang.String.format(r9, r14, r12)
            java.lang.String[] r12 = new java.lang.String[r11]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r12[r2] = r4
            java.lang.String r4 = java.lang.String.valueOf(r6)
            r12[r3] = r4
            java.lang.String r4 = java.lang.String.valueOf(r15)
            r12[r15] = r4
            r4 = 0
            r16 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r13
            java.lang.String r6 = " %s desc "
            java.lang.String r17 = java.lang.String.format(r9, r6, r5)
            r18 = 2
            r5 = 0
            java.lang.String r11 = "AppBrandLauncherLayoutItem"
            r6 = r12
            r12 = r5
            r13 = r14
            r14 = r6
            r5 = 2
            r15 = r4
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.ArrayList r4 = com.tencent.p014mm.plugin.appbrand.appusage.C29378l0.m38692SE(r4)
            r8.getClass()
            boolean r6 = r0.f246838j
            if (r6 == 0) goto L_0x00c6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r2)
            goto L_0x00db
        L_0x00c6:
            boolean r6 = r0.f246837i
            if (r6 == 0) goto L_0x00da
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.i0> r6 = com.tencent.p014mm.plugin.appbrand.appusage.C81500i0.class
            java.lang.Object r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r6)
            com.tencent.mm.plugin.appbrand.appusage.i0 r6 = (com.tencent.p014mm.plugin.appbrand.appusage.C81500i0) r6
            com.tencent.mm.plugin.appbrand.appusage.h1$a r7 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.C68586a.ASC
            r8 = -1
            java.util.ArrayList r6 = r6.mo113792Yt(r8, r7)
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            com.tencent.mm.plugin.appbrand.ui.recents.c0 r7 = new com.tencent.mm.plugin.appbrand.ui.recents.c0
            r7.<init>()
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> r8 = r7.f246906d
            p225rc.C89914c.m112445a(r8, r6)
            java.util.ArrayList<com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> r6 = r7.f246907e
            p225rc.C89914c.m112445a(r6, r4)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            int r5 = r1.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            int r5 = r7.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String r5 = "MicroMsg.AppBrandLauncherRecentsList"
            java.lang.String r6 = "diff old.size %d, new.size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f246848v
            boolean r4 = r4.get()
            if (r4 == 0) goto L_0x0110
            goto L_0x011c
        L_0x0110:
            androidx.fragment.app.FragmentActivity r4 = r19.getActivity()
            if (r4 == 0) goto L_0x011c
            boolean r4 = r4.isFinishing()
            if (r4 == 0) goto L_0x011d
        L_0x011c:
            r2 = 1
        L_0x011d:
            if (r2 == 0) goto L_0x0120
            goto L_0x0167
        L_0x0120:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
            if (r2 == 0) goto L_0x0132
            com.tencent.mm.plugin.appbrand.ui.recents.p r1 = new com.tencent.mm.plugin.appbrand.ui.recents.p
            r1.<init>(r0)
            r0.mo117067N(r1)
            r19.mo117286V()
            goto L_0x0167
        L_0x0132:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r2 == 0) goto L_0x0144
            com.tencent.mm.plugin.appbrand.ui.recents.t r1 = new com.tencent.mm.plugin.appbrand.ui.recents.t
            r1.<init>(r0, r7)
            r0.mo117067N(r1)
            r19.mo117286V()
            goto L_0x0167
        L_0x0144:
            com.tencent.mm.plugin.appbrand.ui.recents.d0 r2 = new com.tencent.mm.plugin.appbrand.ui.recents.d0
            r2.<init>(r1, r7)
            r1 = r23
            androidx.recyclerview.widget.l$c r1 = androidx.recyclerview.widget.C54248l.m60949a(r2, r1)
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$j r2 = r0.f246812B
            int r4 = com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.C84605j.f246870b
            r2.mo117294a()
            com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList$j r2 = r0.f246812B
            com.tencent.mm.plugin.appbrand.ui.recents.u r4 = new com.tencent.mm.plugin.appbrand.ui.recents.u
            r4.<init>(r0, r7, r1)
            android.os.Message r1 = r2.obtainMessage(r3, r4)
            r2.sendMessage(r1)
            r19.mo117286V()
        L_0x0167:
            return
        L_0x0168:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList.m104192P(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList, boolean, long, boolean):void");
    }

    /* renamed from: Q */
    public static void m104193Q(AppBrandLauncherRecentsList appBrandLauncherRecentsList, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        appBrandLauncherRecentsList.getClass();
        boolean z2 = true;
        Log.m105925i("MicroMsg.AppBrandLauncherRecentsList", "onFirstPageFetched fromSvr %b", Boolean.valueOf(z));
        Dialog dialog = appBrandLauncherRecentsList.f246851x0;
        if (dialog != null) {
            dialog.dismiss();
        }
        appBrandLauncherRecentsList.f246851x0 = null;
        appBrandLauncherRecentsList.f246849w.mo63430I(true);
        if (z) {
            appBrandLauncherRecentsList.f246823M = true;
            appBrandLauncherRecentsList.f246846t.set(false);
            appBrandLauncherRecentsList.f246818H.mo117364a(C81516o.m100008vF());
            C84624c0 f = appBrandLauncherRecentsList.f246853z.clone();
            C84624c0 f2 = appBrandLauncherRecentsList.f246853z.clone();
            f2.mo117332l(arrayList, arrayList2);
            appBrandLauncherRecentsList.f246811A.post(new C84650q(appBrandLauncherRecentsList, f, f2));
        } else {
            appBrandLauncherRecentsList.f246853z.mo117332l(arrayList, arrayList2);
            appBrandLauncherRecentsList.f246852y.notifyItemRangeChanged(0, appBrandLauncherRecentsList.f246853z.size());
            if (appBrandLauncherRecentsList.f246853z.size() > 0) {
                AppBrandProcessesManager I = AppBrandProcessesManager.m103869I();
                LuggageServiceType luggageServiceType = LuggageServiceType.WAGAME;
                C88273g1 g1Var = C88273g1.APPBRAND_LAUNCHER;
                I.mo116954S(luggageServiceType, g1Var);
                AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WASERVICE, g1Var);
                AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f238248d.mo113165a(false);
                C81194z.zx0(C81194z.C81196b.APPBRAND_LAUNCHER);
            }
            View view = appBrandLauncherRecentsList.f246815E;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onFirstPageFetched", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onFirstPageFetched", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!(appBrandLauncherRecentsList.getActivity() == null || !(appBrandLauncherRecentsList.getActivity() instanceof AppBrandLauncherUI) || appBrandLauncherRecentsList.getActivity().getIntent() == null || appBrandLauncherRecentsList.f246815E == null || !appBrandLauncherRecentsList.getActivity().getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false))) {
                C84636i iVar = new C84636i(appBrandLauncherRecentsList);
                View view3 = appBrandLauncherRecentsList.f246815E;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145208c(view3)) {
                    iVar.run();
                } else {
                    appBrandLauncherRecentsList.f246815E.getViewTreeObserver().addOnPreDrawListener(new C84638j(appBrandLauncherRecentsList, iVar));
                }
            }
        }
        if ((z || appBrandLauncherRecentsList.f246853z.isEmpty()) && !z) {
            z2 = false;
        }
        if (z2) {
            appBrandLauncherRecentsList.f246849w.getViewTreeObserver().addOnPreDrawListener(new C84653s(appBrandLauncherRecentsList, new C84652r(appBrandLauncherRecentsList)));
        }
    }

    /* renamed from: R */
    public static void m104194R(AppBrandLauncherRecentsList appBrandLauncherRecentsList, ArrayList arrayList) {
        View view;
        ArrayList<AppBrandRecentTaskInfo> arrayList2;
        int size = appBrandLauncherRecentsList.f246853z.size();
        if (!Util.isNullOrNil((List) arrayList)) {
            C84624c0 c0Var = appBrandLauncherRecentsList.f246853z;
            synchronized (c0Var) {
                arrayList2 = c0Var.f246907e;
            }
            arrayList2.addAll(arrayList);
            appBrandLauncherRecentsList.f246852y.notifyItemRangeInserted(size, arrayList.size());
            if (size > 0) {
                appBrandLauncherRecentsList.f246852y.notifyItemChanged(size - 1);
            }
        } else if (!C81516o.m100008vF()) {
            appBrandLauncherRecentsList.f246818H.mo117364a(false);
            View view2 = appBrandLauncherRecentsList.f246818H.f246975a;
            if (view2 != null) {
                view2.post(new C84645m(appBrandLauncherRecentsList));
            }
        } else {
            C84657x xVar = appBrandLauncherRecentsList.f246818H;
            if (!(xVar == null || (view = xVar.f246975a) == null || !view.isShown())) {
                appBrandLauncherRecentsList.mo117066M(new C84646n(appBrandLauncherRecentsList));
            }
        }
        appBrandLauncherRecentsList.f246846t.set(false);
    }

    /* renamed from: S */
    public static boolean m104195S(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        AppBrandLauncherRecentsList appBrandLauncherRecentsList2 = appBrandLauncherRecentsList;
        if (!appBrandLauncherRecentsList2.f246852y.mo117349G4() || ((appBrandLauncherRecentsList2.f246817G.mo117312c() != null && appBrandLauncherRecentsList2.f246817G.mo117312c().getVisibility() == 0) || appBrandLauncherRecentsList.getActivity() == null)) {
            C84639j0 j0Var = appBrandLauncherRecentsList2.f246852y;
            if (!(j0Var == null || appBrandLauncherRecentsList2.f246815E == null)) {
                if (j0Var.mo117349G4()) {
                    View view = appBrandLauncherRecentsList2.f246815E;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view2 = appBrandLauncherRecentsList2.f246815E;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (appBrandLauncherRecentsList2.f246852y.mo117349G4()) {
                if (appBrandLauncherRecentsList2.f246816F == null) {
                    ViewGroup P = AppBrandLauncherBlankPage.m103992P(appBrandLauncherRecentsList.getActivity(), appBrandLauncherRecentsList2.getString(C0966R.string.f7742q6));
                    appBrandLauncherRecentsList2.f246816F = P;
                    ((FrameLayout) appBrandLauncherRecentsList2.f246391g).addView(P, 0);
                    ((ViewGroup.MarginLayoutParams) appBrandLauncherRecentsList2.f246816F.getLayoutParams()).topMargin = appBrandLauncherRecentsList2.f246817G.mo117312c().getMeasuredHeight();
                    appBrandLauncherRecentsList2.f246816F.requestLayout();
                }
                C84620b bVar = appBrandLauncherRecentsList2.f246817G;
                if (bVar instanceof C84658y) {
                    C84658y yVar = (C84658y) bVar;
                    if (yVar.f246981g.getChildCount() > 0) {
                        ViewGroup viewGroup = yVar.f246981g;
                        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                        if (childAt.getId() == C0966R.C0970id.f5937ss) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(4);
                            View view4 = childAt;
                            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "hideBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            childAt.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "hideBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                View view5 = appBrandLauncherRecentsList2.f246818H.f246975a;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = appBrandLauncherRecentsList2.f246816F;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view9 = appBrandLauncherRecentsList2.f246816F;
                if (view9 != null) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar6.mo10233c(8);
                    C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C84620b bVar2 = appBrandLauncherRecentsList2.f246817G;
                if (bVar2 instanceof C84658y) {
                    C84658y yVar2 = (C84658y) bVar2;
                    if (yVar2.f246981g.getChildCount() > 0) {
                        ViewGroup viewGroup2 = yVar2.f246981g;
                        View childAt2 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
                        if (childAt2.getId() == C0966R.C0970id.f5937ss) {
                            C9556a aVar7 = new C9556a();
                            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                            aVar7.mo10233c(0);
                            View view10 = childAt2;
                            C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "showBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            childAt2.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view10, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "showBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                View view11 = appBrandLauncherRecentsList2.f246818H.f246975a;
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view12 = view11;
                C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return true;
        }
        ((C91931a) appBrandLauncherRecentsList.getActivity()).mo117057A2(false);
        return false;
    }

    /* renamed from: T */
    public static void m104196T(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        ArrayList<AppBrandRecentTaskInfo> arrayList;
        if (appBrandLauncherRecentsList.f246823M && !appBrandLauncherRecentsList.f246846t.get()) {
            appBrandLauncherRecentsList.f246845s.set(Util.nowMilliSecond());
            if (C81516o.m100008vF()) {
                C81516o.m100007qq().sp0(appBrandLauncherRecentsList.f246845s.get(), false, appBrandLauncherRecentsList.f246843q, appBrandLauncherRecentsList.f246820J, appBrandLauncherRecentsList.f246821K);
                appBrandLauncherRecentsList.f246846t.set(true);
                return;
            }
            C84624c0 c0Var = appBrandLauncherRecentsList.f246853z;
            synchronized (c0Var) {
                arrayList = c0Var.f246907e;
            }
            appBrandLauncherRecentsList.f246811A.postToWorker(new C84643l(appBrandLauncherRecentsList, Util.isNullOrNil((List) arrayList) ? MAlarmHandler.NEXT_FIRE_INTERVAL : arrayList.get(arrayList.size() - 1).f239037z));
        }
    }

    /* renamed from: U */
    public static void m104197U(AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        LoadMoreRecyclerView loadMoreRecyclerView = appBrandLauncherRecentsList.f246849w;
        int x1 = loadMoreRecyclerView.mo63440x1(loadMoreRecyclerView.mo17024J0(appBrandLauncherRecentsList.f246850x.mo16957C(), false));
        LoadMoreRecyclerView loadMoreRecyclerView2 = appBrandLauncherRecentsList.f246849w;
        int x15 = loadMoreRecyclerView2.mo63440x1(loadMoreRecyclerView2.mo17024J0(appBrandLauncherRecentsList.f246850x.mo16959E(), false));
        C84635h0 h0Var = appBrandLauncherRecentsList.f246813C;
        C84624c0 f = appBrandLauncherRecentsList.f246853z.clone();
        if (h0Var.f246936d != null && h0Var.f246937e.size() < 20 && !f.isEmpty()) {
            int max = Math.max(x1, 0);
            int min = Math.min(f.size() - 1, x15) + 1;
            h0Var.f246937e.addAll(max > min ? Collections.emptyList() : f.subList(max, min));
        }
        if (appBrandLauncherRecentsList.getActivity() != null && appBrandLauncherRecentsList.f246853z.size() > 0) {
            C84175n.f245826d.mo116851a(appBrandLauncherRecentsList.getActivity()).f158157f.addAll(C110818d0.m150951w0(new C61594j(Math.max(x1, 0), Math.min(appBrandLauncherRecentsList.f246853z.size() - 1, x15))));
        }
    }

    /* renamed from: K */
    public void mo117064K(Intent intent, int i) {
        C84635h0 h0Var = this.f246813C;
        h0Var.f246934b = intent;
        h0Var.f246933a = true;
    }

    /* renamed from: L */
    public void mo117065L() {
        LoadMoreRecyclerView loadMoreRecyclerView = this.f246849w;
        if (loadMoreRecyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(loadMoreRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            loadMoreRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(loadMoreRecyclerView, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: O */
    public void mo117068O(int i) {
        this.f246389e = i;
        this.f246843q.putInt("launcher_ui_enter_scene", i);
    }

    /* renamed from: V */
    public final void mo117286V() {
        try {
            synchronized (this.f246827R) {
                this.f246827R.wait(500);
            }
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", e, "", new Object[0]);
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        C84593b bVar = new C84593b(getActivity(), 1, false);
        this.f246850x = bVar;
        bVar.setItemPrefetchEnabled(false);
        C84595c cVar = new C84595c(getContext());
        this.f246849w = cVar;
        cVar.setVerticalScrollBarEnabled(true);
        ((FrameLayout) this.f246391g).addView(this.f246849w, new ViewGroup.LayoutParams(-1, -1));
        this.f246849w.mo17085h0(new C84616p((C84649p) null));
        this.f246849w.setItemAnimator(this.f246819I);
        this.f246819I.mo148686H(this.f246834Y);
        this.f246819I.mo148686H(this.f246829T);
        C84639j0 j0Var = new C84639j0(this.f246853z);
        C84608m mVar = new C84608m((C84649p) null);
        this.f246814D = mVar;
        j0Var.f246944d.put(AppBrandRecentTaskInfo.class.hashCode(), mVar);
        this.f246852y = j0Var;
        j0Var.setHasStableIds(true);
        this.f246852y.registerAdapterDataObserver(this.f246834Y);
        this.f246849w.setAdapter(this.f246852y);
        this.f246849w.mo17043c(new C84615o((C84649p) null));
        if (getArguments() == null || getArguments().getBoolean("showHeader", true)) {
            C84658y yVar = new C84658y(getActivity(), this.f246849w, false, false);
            this.f246817G = yVar;
            this.f246849w.addHeaderView(yVar.f246981g);
            View c = this.f246817G.mo117312c();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = c;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f246817G.mo117280e();
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6451f8, this.f246849w, false);
            this.f246849w.addHeaderView(inflate);
            this.f246815E = inflate;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(inflate, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(inflate, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f246817G = new C84617a(getActivity(), this.f246849w);
        }
        C84657x xVar = new C84657x(getContext(), this.f246849w);
        this.f246818H = xVar;
        xVar.mo117364a(true);
        this.f246849w.setLoadingView(this.f246818H.f246975a);
        this.f246849w.mo63430I(false);
        this.f246818H.getClass();
        this.f246849w.setOnLoadingStateChangedListener(new C84640k(this));
        Dialog dialog = this.f246851x0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f246851x0 = null;
        FragmentActivity activity = getActivity();
        View inflate2 = View.inflate(activity, C0966R.C0971layout.f6510gt, (ViewGroup) null);
        C84678u0 u0Var = new C84678u0(activity, C0966R.style.f8223t);
        u0Var.setContentView(inflate2);
        u0Var.setCancelable(true);
        u0Var.setCanceledOnTouchOutside(false);
        u0Var.setOnCancelListener(new C68658s0(activity, u0Var));
        u0Var.setOnShowListener(new C68659t0(u0Var));
        this.f246851x0 = u0Var;
        u0Var.show();
        this.f246819I.f311278u = false;
        this.f246844r.set(Util.nowMilliSecond());
        this.f246811A.post(new C84647o(this));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.f246820J = getActivity().getIntent().getIntExtra("extra_get_usage_reason", this.f246820J);
            this.f246821K = getActivity().getIntent().getIntExtra("extra_get_usage_prescene", this.f246821K);
        }
        C84635h0 h0Var = this.f246813C;
        FragmentActivity activity = getActivity();
        h0Var.getClass();
        if (activity.getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false)) {
            WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = new WAMainFrameEnterHistoryListExposeStruct();
            h0Var.f246936d = wAMainFrameEnterHistoryListExposeStruct;
            wAMainFrameEnterHistoryListExposeStruct.f236480o = (long) activity.getIntent().getIntExtra("extra_desktop_open_session", 0);
            h0Var.f246937e = new LinkedHashSet<>();
            RecentsReporter$1 recentsReporter$1 = new RecentsReporter$1(h0Var, C40008f.f107254d);
            h0Var.f246938f = recentsReporter$1;
            recentsReporter$1.alive();
        }
        h0Var.f246935c = Util.nowMilliSecond();
    }

    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f246851x0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f246851x0 = null;
        this.f246848v.set(true);
        C84605j jVar = this.f246812B;
        int i = C84605j.f246870b;
        jVar.mo117294a();
    }

    public void onDestroyView() {
        super.onDestroyView();
        C84635h0 h0Var = this.f246813C;
        FragmentActivity activity = getActivity();
        if (h0Var.f246936d != null) {
            h0Var.mo117345a("onDestroy", activity);
        }
        C84620b bVar = this.f246817G;
        if (bVar != null) {
            bVar.mo117313f();
        }
        C84657x xVar = this.f246818H;
        if (xVar != null) {
            xVar.f246976b = null;
            xVar.f246978d = null;
        }
        C84639j0 j0Var = this.f246852y;
        if (j0Var != null) {
            j0Var.unregisterAdapterDataObserver(this.f246834Y);
        }
        C84608m mVar = this.f246814D;
        if (mVar != null) {
            ((HashMap) mVar.f246874a).clear();
            this.f246814D = null;
        }
        if (C86709a0.m107523b().f251765p && !C86718e.m107551r()) {
            C81661j.m100182g().remove(this.f246832W);
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238473i.remove(this.f246831V);
            ((C81500i0) C81161g2.Bx0(C81500i0.class)).remove(this.f246830U);
            this.f246841p.remove(this.f246833X);
        }
        this.f246811A.removeCallbacksAndMessages((Object) null);
        this.f246811A.quit();
        this.f246844r.set(-1);
        this.f246845s.set(-1);
        this.f246846t.set(false);
        this.f246847u.set(MAlarmHandler.NEXT_FIRE_INTERVAL);
        this.f246819I.mo148687I(this.f246834Y);
        this.f246819I.mo148687I(this.f246829T);
    }

    public void onPause() {
        this.f246835Z = false;
        super.onPause();
        C84620b bVar = this.f246817G;
        if (bVar != null) {
            bVar.mo117314g();
        }
        try {
            LoadMoreRecyclerView loadMoreRecyclerView = this.f246849w;
            if (loadMoreRecyclerView != null) {
                loadMoreRecyclerView.setLayoutFrozen(true);
            }
        } catch (IllegalStateException unused) {
            Looper.myQueue().addIdleHandler(new C84592a());
        }
        C84635h0 h0Var = this.f246813C;
        FragmentActivity activity = getActivity();
        if (h0Var.f246933a && h0Var.f246936d != null) {
            h0Var.mo117345a("startActivity", activity);
        }
    }

    public void onResume() {
        this.f246835Z = true;
        super.onResume();
        LoadMoreRecyclerView loadMoreRecyclerView = this.f246849w;
        if (loadMoreRecyclerView != null) {
            loadMoreRecyclerView.setLayoutFrozen(false);
        }
        int i = this.f246842p0 + 1;
        this.f246842p0 = i;
        if (i > 1) {
            C84620b bVar = this.f246817G;
            if (bVar != null) {
                bVar.mo117281h();
            }
            mo117066M(new C84604i());
        }
        Class cls = C10432i.class;
        this.f246825P = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        this.f246826Q = ((C10432i) C86312j.m106911c(cls)).Oh0();
        Log.m105927v("MicroMsg.AppBrandLauncherRecentsList", "updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", Boolean.valueOf(this.f246825P), Integer.valueOf(this.f246826Q));
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        C84635h0 h0Var = this.f246813C;
        h0Var.f246934b = intent;
        h0Var.f246933a = true;
    }

    public AppBrandLauncherRecentsList(boolean z) {
        this.f246841p = C81516o.m100007qq();
        this.f246843q = new Bundle();
        this.f246844r = new AtomicLong(-1);
        this.f246845s = new AtomicLong(-1);
        this.f246846t = new AtomicBoolean(false);
        this.f246847u = new AtomicLong(MAlarmHandler.NEXT_FIRE_INTERVAL);
        this.f246848v = new AtomicBoolean(false);
        this.f246853z = new C84624c0();
        this.f246811A = new MMHandler("AppBrandLauncherUI#RecentsListUI");
        this.f246812B = new C84605j();
        this.f246813C = new C84635h0();
        this.f246819I = new C104801e0();
        this.f246820J = 3;
        this.f246821K = 0;
        this.f246822L = false;
        this.f246823M = false;
        this.f246825P = false;
        this.f246826Q = -1;
        this.f246827R = new Object();
        this.f246828S = new C84596d();
        this.f246829T = new C84606k((C84649p) null);
        this.f246830U = new C84597e();
        this.f246831V = new C84598f();
        this.f246832W = new C84600g();
        this.f246833X = new C84601h();
        this.f246834Y = new C84607l((C84649p) null);
        this.f246835Z = false;
        this.f246842p0 = 0;
        this.f246851x0 = null;
        boolean z2 = true;
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("showHeader", z);
        setArguments(bundle);
        Integer num = C81506j0.f239106d;
        this.f246837i = true;
        this.f246838j = true;
        this.f246839n = (!WeChatEnvironment.hasDebugger() || !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_APP_BRAND_SHOW_HISTORY_COUNT_BOOLEAN, false)) ? false : z2;
        this.f246836h = C81506j0.m99996a();
        this.f246840o = new C84622b0(false);
    }
}

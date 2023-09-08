package com.tencent.p014mm.plugin.expt.pageflow;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MMKVPageFlowStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.PageFlowDetailStruct;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.expt.pageflow.C2264d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f91.C116850b;
import h81.C32735h;
import h81.C8496k;
import j91.C21199a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import ma1.C117543a;
import pa1.C35418c;
import w91.C22880b;
import zt3.C119157j;

@C86522b
/* renamed from: com.tencent.mm.plugin.expt.pageflow.MMPageFlowService */
public class MMPageFlowService extends C86301e implements C8496k, Application.ActivityLifecycleCallbacks {

    /* renamed from: i */
    public static int[] f345924i = {10, 1000, 10000, 100000};

    /* renamed from: j */
    public static boolean f345925j = false;

    /* renamed from: d */
    public boolean f345926d = false;

    /* renamed from: e */
    public boolean f345927e = false;

    /* renamed from: f */
    public String f345928f = "";

    /* renamed from: g */
    public HashSet<String> f345929g = new HashSet<>();

    /* renamed from: h */
    public IListener<AppActiveEvent> f345930h = new IListener<AppActiveEvent>(C40008f.f107254d) {
        {
            this.__eventId = 2123042947;
        }

        public boolean callback(IEvent iEvent) {
            AppActiveEvent appActiveEvent = (AppActiveEvent) iEvent;
            if (appActiveEvent == null) {
                return false;
            }
            C8496k.C8497a aVar = appActiveEvent.f78710d.f78711a ? C8496k.C8497a.MMAppMgr_Activated : C8496k.C8497a.MMAppMgr_Deactivated;
            MMPageFlowService.this.zx0(aVar.name(), aVar, hashCode(), System.currentTimeMillis());
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.expt.pageflow.MMPageFlowService$a */
    public class C115414a implements Comparator<MMKVPageFlowStruct> {
        public C115414a(MMPageFlowService mMPageFlowService) {
        }

        public int compare(Object obj, Object obj2) {
            return Long.compare(((MMKVPageFlowStruct) obj).f343750f, ((MMKVPageFlowStruct) obj2).f343750f);
        }
    }

    public MMPageFlowService() {
        if (!MMApplicationContext.isMMProcess()) {
            f345925j = true;
        }
    }

    public static MMPageFlowService wx0() {
        return (MMPageFlowService) C86312j.m106911c(MMPageFlowService.class);
    }

    public void onAccountInitialized(Context context) {
        f345924i = new int[]{10, 1000, 10000, 100000};
        boolean z = true;
        f345925j = true;
        if (Util.getInt(C35418c.m40699b().mo60251c(C32735h.C32737c.clicfg_weixin_register_mm_app_active_event, "", false), 0) <= 0) {
            z = false;
        }
        if (z) {
            this.f345930h.alive();
        }
    }

    public void onAccountReleased(Context context) {
        f345924i = new int[]{10, 1000, 10000, 100000};
        f345925j = false;
        this.f345930h.dead();
        this.f345926d = false;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        String className = activity.getComponentName().getClassName();
        if (f345925j && "com.tencent.mm.ui.LauncherUI".equals(className) && this.f345927e) {
            Log.m105925i("MicroMsg.MMPageFlowService", "%s launcher ui ondestroyed but wechat in foreground hashcode[%d]", xx0(), Integer.valueOf(activity.hashCode()));
        }
    }

    public void onActivityPaused(Activity activity) {
        C8496k.C8497a aVar = C8496k.C8497a.MMLifeCall_OnPause;
        if (activity != null) {
            zx0(activity.getComponentName().getClassName(), aVar, activity.hashCode(), System.currentTimeMillis());
        }
    }

    public void onActivityResumed(Activity activity) {
        C8496k.C8497a aVar = C8496k.C8497a.MMLifeCall_OnResume;
        if (activity != null) {
            zx0(activity.getComponentName().getClassName(), aVar, activity.hashCode(), System.currentTimeMillis());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: s1 */
    public void mo9419s1() {
        f345925j = false;
        C22880b.m26858f(106, (String) null, 0, System.currentTimeMillis());
        C22880b d = C22880b.m26857d();
        d.mo36055g(8);
        C21199a.m23657b(8);
        d.mo36056h(true);
        Log.m105924i("MicroMsg.MMPageFlowService", "habbyge-mali, MMPageFlowService: logout补偿上报");
    }

    public void vx0() {
        if (MMApplicationContext.isMMProcess()) {
            long currentTicks = Util.currentTicks();
            MultiProcessMMKV b = C2262b.m2058a().mo2157b();
            String[] allKeys = b == null ? null : b.allKeys();
            ArrayList arrayList = new ArrayList();
            if (allKeys != null && allKeys.length > 0) {
                for (String str : allKeys) {
                    if (!this.f345929g.contains(str)) {
                        String str2 = "";
                        MultiProcessMMKV b2 = C2262b.m2058a().mo2157b();
                        if (b2 != null) {
                            str2 = b2.getString(str, str2);
                        }
                        if (!Util.isNullOrNil(str2)) {
                            MMKVPageFlowStruct mMKVPageFlowStruct = new MMKVPageFlowStruct(str2);
                            if (mMKVPageFlowStruct.f343751g > 0 && mMKVPageFlowStruct.f343750f > 0) {
                                arrayList.add(new MMKVPageFlowStruct(str2));
                                this.f345929g.add(str);
                            }
                            MultiProcessMMKV b3 = C2262b.m2058a().mo2157b();
                            if (b3 != null) {
                                b3.remove(str);
                            }
                        }
                    }
                    MultiProcessMMKV b4 = C2262b.m2058a().mo2157b();
                    if (b4 != null) {
                        b4.remove(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new C115414a(this));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MMKVPageFlowStruct mMKVPageFlowStruct2 = (MMKVPageFlowStruct) it.next();
                    yx0(mMKVPageFlowStruct2.f343748d, C8496k.C8497a.m8414a((int) mMKVPageFlowStruct2.f343749e), (int) mMKVPageFlowStruct2.f343751g, mMKVPageFlowStruct2.f343750f, Process.myPid());
                }
                C115669n.INSTANCE.idkeyStat(932, 102, (long) arrayList.size(), false);
                Log.m105925i("MicroMsg.MMPageFlowService", "check mmkv list[%d] cost[%d]", Integer.valueOf(arrayList.size()), Long.valueOf(Util.ticksToNow(currentTicks)));
            }
            Log.m105919d("MicroMsg.MMPageFlowService", "check mm kv cost[%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    public final String xx0() {
        return hashCode() + "";
    }

    public final void yx0(String str, C8496k.C8497a aVar, int i, long j, int i2) {
        int Qe;
        String str2 = str;
        C8496k.C8497a aVar2 = aVar;
        long j2 = j;
        if (!str2.contains("WeChatSplashActivity") && !str2.contains("FakeSwitchAccountUI")) {
            int i3 = aVar2.f27521d;
            char c = i3 <= 2 ? 0 : i3 <= 4 ? 1 : i3 <= 6 ? (char) 2 : 3;
            C8496k.C8497a aVar3 = C8496k.C8497a.MMActivity_Back2Front;
            if (aVar2 == aVar3) {
                this.f345927e = true;
            }
            C8496k.C8497a aVar4 = C8496k.C8497a.MMActivity_Front2Back;
            if (aVar2 == aVar4) {
                this.f345927e = false;
            }
            PageFlowDetailStruct pageFlowDetailStruct = new PageFlowDetailStruct();
            pageFlowDetailStruct.f343799d = i2;
            pageFlowDetailStruct.f343800e = pageFlowDetailStruct.mo86045b("PName", C86709a0.m107531m().mo58407a().f124988a, true);
            pageFlowDetailStruct.f343802g = pageFlowDetailStruct.mo86045b("Name", str2, true);
            int[] iArr = f345924i;
            int i4 = iArr[c];
            iArr[c] = i4 + 1;
            pageFlowDetailStruct.f343801f = (long) i4;
            pageFlowDetailStruct.f343803h = (long) aVar2.f27521d;
            pageFlowDetailStruct.f343804i = j2;
            pageFlowDetailStruct.mo86048e("TimeStampMs", j2);
            pageFlowDetailStruct.f343807l = (long) i;
            if (C29897i.f80988a == null) {
                C29897i.f80988a = new C29897i();
            }
            C29897i.f80988a.mo56975b(pageFlowDetailStruct);
            Log.m105919d("MicroMsg.MMPageFlowService", "%s pure report [%s]", xx0(), pageFlowDetailStruct.mo1006q());
            if (aVar2 == aVar3 || aVar2 == aVar4) {
                Log.m105925i("MicroMsg.MMPageFlowService", "habbyge-mali, %s frontback-pure-report [%s]", xx0(), pageFlowDetailStruct.mo1006q());
            }
            if (!MMApplicationContext.isMMProcess()) {
                return;
            }
            if (aVar2 == aVar3 || aVar2 == aVar4) {
                boolean z = this.f345927e;
                if (f345925j && (Qe = C117543a.Cx0().mo58779Qe(C32735h.C32737c.clicfg_weixin_unread_records_rpt_time, 0)) > 0) {
                    if (Util.nowSecond() - C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_WEIXIN_UNREAD_RECORDS_LAST_RPT_TIME_LONG, 0) >= ((long) Qe)) {
                        ((C119157j) C119157j.f356862d).mo183894y("calc_unread_task");
                        ((C119157j) C119157j.f356862d).mo183879j(new C41385e(this, j2, z), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, "calc_unread_task");
                    }
                }
                int i5 = f345924i[3];
                if (!TextUtils.isEmpty("page_hell_seq_mmkv_key")) {
                    C116850b.m164832b().putInt("page_hell_seq_mmkv_key", i5);
                }
            }
        }
    }

    public void zx0(String str, C8496k.C8497a aVar, int i, long j) {
        String str2;
        String str3 = str;
        C8496k.C8497a aVar2 = aVar;
        int myPid = Process.myPid();
        long currentTicks = Util.currentTicks();
        if (!MMApplicationContext.isMMProcess()) {
            if (C2264d.f12348a == null) {
                C2264d.f12348a = new C2264d();
            }
            C2264d dVar = C2264d.f12348a;
            dVar.getClass();
            Log.m105925i("MicroMsg.MMPageFlowSenderByIPCInvoker", "%s send page flow [%s-%d-%d] [%s]", "" + dVar.hashCode(), str3, Integer.valueOf(i), Long.valueOf(j), aVar2);
            Bundle bundle = new Bundle();
            bundle.putInt("key_page_flow_type", aVar2.f27521d);
            bundle.putString("key_page_flow_name", str3);
            bundle.putInt("key_page_flow_hashcode", i);
            String str4 = "MicroMsg.MMPageFlowService";
            bundle.putLong("key_page_flow_time_stamp", j);
            C115669n.INSTANCE.idkeyStat(932, 100, 1, false);
            String string = bundle.getString("key_page_flow_name");
            int i2 = bundle.getInt("key_page_flow_type");
            int i3 = bundle.getInt("key_page_flow_hashcode", 0);
            long j2 = bundle.getLong("key_page_flow_time_stamp", 0);
            StringBuilder sb = new StringBuilder();
            sb.append((i3 + "_" + j2).hashCode());
            sb.append("");
            String sb4 = sb.toString();
            MMKVPageFlowStruct mMKVPageFlowStruct = new MMKVPageFlowStruct();
            mMKVPageFlowStruct.f343751g = (long) i3;
            mMKVPageFlowStruct.f343748d = mMKVPageFlowStruct.mo86045b("Name", string, true);
            mMKVPageFlowStruct.f343749e = (long) i2;
            mMKVPageFlowStruct.f343750f = j2;
            mMKVPageFlowStruct.mo86048e("TimeStampMs", j2);
            C2262b a = C2262b.m2058a();
            String p = mMKVPageFlowStruct.mo1005p();
            MultiProcessMMKV b = a.mo2157b();
            if (b != null) {
                b.putString(sb4, p);
            }
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C2264d.C2265a.class, (C1256g) null);
            str2 = str4;
            Log.m105918d(str2, "reportPageFlow: mm-process NOT");
            f345925j = true;
        } else {
            int i4 = i;
            str2 = "MicroMsg.MMPageFlowService";
        }
        if (!f345925j) {
            Log.m105920e(str2, "reportPageFlow: mm-process isAccReady = FALSE");
            return;
        }
        Log.m105918d(str2, "reportPageFlow: mm-process YES");
        if (MMApplicationContext.isMMProcess()) {
            vx0();
        }
        yx0(str, aVar, i, j, myPid);
        Log.m105927v(str2, "report page Flow cost[%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
    }
}

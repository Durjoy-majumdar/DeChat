package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import be2.C79693c;
import ce2.C28544a;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.matrix.dice.C80982a;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1743m1;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83113m;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83119r;
import com.tencent.p014mm.plugin.performance.watchdogs.C85337k;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.wechat.aff.ting.TingClientProto;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.file.XVFSFile;
import ee2.C86511b;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import kj2.C117407d;
import org.xwalk.core.XWalkEnvironment;
import p1012ne.C88932a;
import p1028re.C89928a;
import p757xv.C91349n;
import p757xv.C91350o;
import p757xv.C91352r;
import p757xv.C91355x;
import p761yd.C38993b;
import q70.C89491c0;
import rz1.C36595a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog */
public class MemoryWatchDog implements Application.ActivityLifecycleCallbacks, Runnable, C91352r, C89928a {

    /* renamed from: A */
    public static final MemoryWatchDog f248575A = new MemoryWatchDog();

    /* renamed from: d */
    public int f248576d;

    /* renamed from: e */
    public int f248577e;

    /* renamed from: f */
    public int f248578f = 0;

    /* renamed from: g */
    public volatile String f248579g;

    /* renamed from: h */
    public final Set<String> f248580h = new HashSet();

    /* renamed from: i */
    public boolean f248581i = true;

    /* renamed from: j */
    public volatile boolean f248582j = true;

    /* renamed from: n */
    public volatile boolean f248583n = false;

    /* renamed from: o */
    public final ActivityManager f248584o = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME));

    /* renamed from: p */
    public long f248585p = 524288000;

    /* renamed from: q */
    public long f248586q = 1258291;

    /* renamed from: r */
    public long f248587r;

    /* renamed from: s */
    public long f248588s;

    /* renamed from: t */
    public long f248589t;

    /* renamed from: u */
    public boolean f248590u = false;

    /* renamed from: v */
    public boolean f248591v = false;

    /* renamed from: w */
    public C91350o f248592w;

    /* renamed from: x */
    public int f248593x = 0;

    /* renamed from: y */
    public long f248594y = 0;

    /* renamed from: z */
    public long f248595z;

    public MemoryWatchDog() {
        if (MMApplicationContext.isMainProcess() && (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE)) {
            MultiProcessMMKV.getMMKV("diagnostic_storage").encode("KEY_ENABLE_HOOK_TOAST", true);
        }
        MemoryWatchDog$$b memoryWatchDog$$b = new MemoryWatchDog$$b(this);
        ProcessUILifecycleOwner.f235399x.getClass();
        HashSet<C88932a> hashSet = ProcessUILifecycleOwner.f235395t;
        synchronized (hashSet) {
            hashSet.add(memoryWatchDog$$b);
        }
        C80982a.f237863f.mo112808c(new MemoryWatchDog$$c(this));
        new IListener<MMTrimMemoryEvent>(this, C40008f.f107254d) {
            {
                this.__eventId = 708811463;
            }

            public boolean callback(IEvent iEvent) {
                MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
                Log.m105918d("MicroMsg.MemoryWatchDog", "received MMTrimMemoryEvent");
                return false;
            }
        }.alive();
        if (!BuildInfo.IS_ARM64) {
            C79693c.m96809c();
        }
    }

    /* renamed from: a */
    public void mo391a(int i) {
    }

    /* renamed from: b */
    public void mo392b() {
        ((C119157j) C119157j.f356862d).mo183884o(new MemoryWatchDog$$f(this));
    }

    /* renamed from: c */
    public final boolean mo118577c() {
        boolean z;
        C80814d b = C80814d.m98665b(MMApplicationContext.getContext());
        if (b == null || !Util.nullAs(b.mo112567a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            try {
                z = C38993b.m41993c(C32735h.C32737c.clicfg_memory_hook_auto_trigger_sos, false);
            } catch (Throwable unused) {
                z = false;
            }
            if (z) {
                return false;
            }
            return this.f248590u;
        }
        Log.m105920e("MicroMsg.MemoryWatchDog", "disabled by assist");
        return false;
    }

    /* renamed from: d */
    public void mo118578d(boolean z) {
        int i;
        long j;
        long j2;
        String str;
        long j3;
        long j4;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        String str2;
        C91355x h = mo118582h(true, 3);
        h.toString();
        Log.m105925i("MicroMsg.MemoryWatchDog", "[AutoCheck] process = %s AppForeground = %s %s", MMApplicationContext.getProcessName(), Boolean.valueOf(this.f248582j), h);
        boolean z5 = !((HashSet) this.f248580h).isEmpty();
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(959);
        iDKey.SetValue(1);
        long j5 = h.f262014p - h.f262015q;
        if (j5 < DownloadHelper.SAVE_LENGTH) {
            iDKey.SetKey(120);
        } else if (j5 < 209715200) {
            iDKey.SetKey(121);
        } else if (j5 < 314572800) {
            iDKey.SetKey(122);
        } else if (j5 < 419430400) {
            iDKey.SetKey(123);
        } else if (j5 < 524288000) {
            iDKey.SetKey(124);
        } else if (j5 < 629145600) {
            iDKey.SetKey(125);
        } else if (j5 < 734003200) {
            iDKey.SetKey(126);
        } else if (j5 < 838860800) {
            iDKey.SetKey(127);
        } else {
            iDKey.SetKey(128);
        }
        arrayList.add(iDKey);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(959);
        iDKey2.SetValue(1);
        long j6 = h.f262012n;
        if (j6 < DownloadHelper.SAVE_LENGTH) {
            iDKey2.SetKey(131);
        } else if (j6 < 209715200) {
            iDKey2.SetKey(132);
        } else if (j6 < 314572800) {
            iDKey2.SetKey(133);
        } else if (j6 < 419430400) {
            iDKey2.SetKey(134);
        } else if (j6 < 524288000) {
            iDKey2.SetKey(135);
        } else if (j6 < 629145600) {
            iDKey2.SetKey(136);
        } else if (j6 < 734003200) {
            iDKey2.SetKey(137);
        } else if (j6 < 838860800) {
            iDKey2.SetKey(138);
        } else {
            iDKey2.SetKey(139);
        }
        arrayList.add(iDKey2);
        IDKey iDKey3 = new IDKey();
        iDKey3.SetID(959);
        iDKey3.SetValue(1);
        int i2 = h.f262003e;
        if (i2 < 2097152) {
            iDKey3.SetKey(TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
        } else {
            float f = (float) i2;
            if (f < 2516582.5f) {
                iDKey3.SetKey(TPOptionalID.f349338xc9bdf6cd);
            } else if (f < 2936012.8f) {
                iDKey3.SetKey(144);
            } else if (f < 3145728.0f) {
                iDKey3.SetKey(145);
            } else if (f < 3565158.5f) {
                iDKey3.SetKey(146);
            } else if (f < 3984588.8f) {
                iDKey3.SetKey(147);
            } else {
                iDKey3.SetKey(148);
            }
        }
        if (((float) h.f262003e) >= 3858759.8f) {
            IDKey iDKey4 = new IDKey();
            i = 959;
            iDKey4.SetID(959);
            j = 1;
            iDKey4.SetValue(1);
            iDKey4.SetKey(149);
            arrayList.add(iDKey4);
        } else {
            j = 1;
            i = 959;
        }
        arrayList.add(iDKey3);
        IDKey iDKey5 = new IDKey();
        iDKey5.SetID(i);
        iDKey5.SetValue(j);
        iDKey5.SetKey(151);
        arrayList.add(iDKey5);
        C117407d.INSTANCE.mo160124a(arrayList, false);
        int i3 = MMApplicationContext.isMainProcess() ? 1161 : MMApplicationContext.isAppBrandProcess() ? C1743m1.CTRL_INDEX : MMApplicationContext.isToolsProcess() ? C83113m.CTRL_INDEX : MMApplicationContext.isPushProcess() ? C83119r.CTRL_INDEX : -1;
        if (i3 > 0) {
            ArrayList arrayList2 = new ArrayList();
            IDKey iDKey6 = new IDKey();
            iDKey6.SetID(i3);
            iDKey6.SetValue(1);
            iDKey6.SetKey(0);
            arrayList2.add(iDKey6);
            IDKey iDKey7 = new IDKey();
            iDKey7.SetID(i3);
            iDKey7.SetValue(1);
            iDKey7.SetKey(BuildInfo.IS_ARM64 ? 254 : 255);
            arrayList2.add(iDKey7);
            long j7 = h.f262014p - h.f262015q;
            C85337k.m105353b(h, true);
            IDKey iDKey8 = new IDKey();
            iDKey8.SetID(i3);
            iDKey8.SetValue(1);
            if (j7 < DownloadHelper.SAVE_LENGTH) {
                iDKey8.SetKey(1);
            } else if (j7 < 209715200) {
                iDKey8.SetKey(2);
            } else if (j7 < 314572800) {
                iDKey8.SetKey(3);
            } else if (j7 < 419430400) {
                iDKey8.SetKey(4);
            } else if (j7 < 524288000) {
                iDKey8.SetKey(5);
            } else if (j7 < 629145600) {
                iDKey8.SetKey(6);
            } else if (j7 < 734003200) {
                iDKey8.SetKey(7);
            } else if (j7 < 838860800) {
                iDKey8.SetKey(8);
            } else if (j7 < 943718400) {
                iDKey8.SetKey(9);
            } else if (j7 < 1048576000) {
                iDKey8.SetKey(10);
            } else {
                iDKey8.SetKey(11);
            }
            arrayList2.add(iDKey8);
            long j8 = h.f262012n;
            C85337k.m105354c(h, true);
            IDKey iDKey9 = new IDKey();
            iDKey9.SetID(i3);
            iDKey9.SetValue(1);
            if (j8 < DownloadHelper.SAVE_LENGTH) {
                iDKey9.SetKey(33);
            } else if (j8 < 209715200) {
                iDKey9.SetKey(34);
            } else if (j8 < 314572800) {
                iDKey9.SetKey(35);
            } else if (j8 < 419430400) {
                iDKey9.SetKey(36);
            } else if (j8 < 524288000) {
                iDKey9.SetKey(37);
            } else if (j8 < 629145600) {
                iDKey9.SetKey(38);
            } else if (j8 < 734003200) {
                iDKey9.SetKey(39);
            } else if (j8 < 838860800) {
                iDKey9.SetKey(40);
            } else if (j8 < 943718400) {
                iDKey9.SetKey(41);
            } else if (j8 < 1048576000) {
                iDKey9.SetKey(42);
            } else {
                iDKey9.SetKey(43);
            }
            arrayList2.add(iDKey9);
            long j9 = (long) h.f262003e;
            C85337k.m105357f(h, true);
            IDKey iDKey10 = new IDKey();
            iDKey10.SetID(i3);
            iDKey10.SetValue(1);
            double d = (double) j9;
            if (d < 1572864.0d) {
                iDKey10.SetKey(65);
            } else if (j9 < 2097152) {
                iDKey10.SetKey(66);
            } else if (d < 2621440.0d) {
                iDKey10.SetKey(67);
            } else if (j9 < 3145728) {
                iDKey10.SetKey(68);
            } else if (d < 3670016.0d) {
                iDKey10.SetKey(69);
            } else if (j9 < 4194304) {
                iDKey10.SetKey(70);
            } else if (d < 4718592.0d) {
                iDKey10.SetKey(71);
            } else if (j9 < 5242880) {
                iDKey10.SetKey(72);
            } else if (d < 5767168.0d) {
                iDKey10.SetKey(73);
            } else if (d < 6291456.0d) {
                iDKey10.SetKey(74);
            } else if (d < 6815744.0d) {
                iDKey10.SetKey(75);
            } else if (d < 7340032.0d) {
                iDKey10.SetKey(76);
            } else if (d < 7864320.0d) {
                iDKey10.SetKey(77);
            } else if (d < 8388608.0d) {
                iDKey10.SetKey(78);
            } else if (d < 8912896.0d) {
                iDKey10.SetKey(79);
            } else if (d < 9437184.0d) {
                iDKey10.SetKey(80);
            } else if (d < 9961472.0d) {
                iDKey10.SetKey(81);
            } else if (j9 < 10485760) {
                iDKey10.SetKey(82);
            } else {
                iDKey10.SetKey(83);
            }
            arrayList2.add(iDKey10);
            int i4 = h.f262023y;
            C85337k.m105356e(h, true);
            C85337k.m105352a(h, true);
            IDKey iDKey11 = new IDKey();
            iDKey11.SetID(i3);
            long j15 = j9;
            iDKey11.SetValue(1);
            if (i4 < 102400) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 154 : 122);
            } else if (i4 < 204800) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 155 : 123);
            } else if (i4 < 307200) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 156 : 124);
            } else if (i4 < 409600) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 157 : 125);
            } else if (i4 < 512000) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 158 : 126);
            } else if (i4 < 614400) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 159 : 127);
            } else if (i4 < 716800) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 160 : 128);
            } else if (i4 < 819200) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 161 : 129);
            } else if (i4 < 921600) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 162 : 130);
            } else if (i4 < 1024000) {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 163 : 131);
            } else {
                iDKey11.SetKey(BuildInfo.IS_ARM64 ? 164 : 132);
            }
            arrayList2.add(iDKey11);
            String str3 = "";
            if (MMApplicationContext.isMainProcess()) {
                ArrayList arrayList3 = new ArrayList();
                IDKey iDKey12 = new IDKey();
                iDKey12.SetID(1308);
                iDKey12.SetValue(1);
                iDKey12.SetKey(BuildInfo.IS_ARM64 ? 1 : 0);
                arrayList3.add(iDKey12);
                IDKey iDKey13 = new IDKey();
                iDKey13.SetID(1308);
                iDKey13.SetValue(1);
                iDKey13.SetKey(C85337k.m105358g(h.f261988A));
                arrayList3.add(iDKey13);
                C85337k.m105355d(h, true);
                String packageName = WeChatBrands.AppInfo.current().getPackageName();
                HashMap hashMap = new HashMap();
                hashMap.put(packageName + str3, 1595);
                hashMap.put(packageName + ":appbrand0", 1596);
                hashMap.put(packageName + ":appbrand1", 1596);
                hashMap.put(packageName + ":appbrand2", 1596);
                hashMap.put(packageName + ":appbrand3", 1596);
                hashMap.put(packageName + ":appbrand4", 1596);
                hashMap.put(packageName + ":tools", 1607);
                hashMap.put(packageName + ":push", 1599);
                hashMap.put(packageName + ":hotpot..", 1600);
                hashMap.put(packageName + ":sandbox", Integer.valueOf(TingClientProto.TingScene.TingScene_FinderLiteAppSinger_VALUE));
                hashMap.put(packageName + ":exdevice", 1610);
                C91355x[] xVarArr = h.f261990C;
                int length = xVarArr.length;
                int i5 = 0;
                while (i5 < length) {
                    C91355x xVar = xVarArr[i5];
                    Integer num = (Integer) hashMap.remove(xVar.f262000b);
                    int intValue = num != null ? num.intValue() : TingClientProto.TingScene.TingScene_FinderProfileSinger_VALUE;
                    C91355x[] xVarArr2 = xVarArr;
                    Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "id = %s, process = %s", Integer.valueOf(intValue), xVar.f262000b);
                    arrayList3.add(new IDKey(intValue, BuildInfo.IS_ARM64 ? 1 : 0, 1));
                    IDKey iDKey14 = new IDKey();
                    iDKey14.SetID(intValue);
                    iDKey14.SetValue(1);
                    iDKey14.SetKey(C85337k.m105358g(xVar.f262023y));
                    arrayList3.add(iDKey14);
                    i5++;
                    xVarArr = xVarArr2;
                    length = length;
                    str3 = str3;
                    j8 = j8;
                }
                j2 = j8;
                str = str3;
                for (Map.Entry entry : hashMap.entrySet()) {
                    Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "stub : id = %s, process = %s", entry.getValue(), entry.getKey());
                    arrayList3.add(new IDKey(((Integer) entry.getValue()).intValue(), BuildInfo.IS_ARM64 ? 1 : 0, 1));
                    arrayList3.add(new IDKey(((Integer) entry.getValue()).intValue(), BuildInfo.IS_ARM64 ? 57 : 17, 1));
                }
                IDKey iDKey15 = new IDKey();
                iDKey15.SetID(1308);
                iDKey15.SetValue(1);
                long j16 = h.f262022x.availMem;
                if (j16 < DownloadHelper.SAVE_LENGTH) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 113 : 82);
                } else if (j16 < 209715200) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 114 : 83);
                } else if (j16 < 314572800) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 115 : 84);
                } else if (j16 < 419430400) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 116 : 85);
                } else if (j16 < 524288000) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 117 : 86);
                } else if (j16 < 629145600) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 118 : 87);
                } else if (j16 < 734003200) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 119 : 88);
                } else if (j16 < 838860800) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 120 : 89);
                } else if (j16 < 943718400) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 121 : 90);
                } else if (j16 < 1048576000) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 122 : 91);
                } else if (j16 < 1572864000) {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 123 : 92);
                } else {
                    iDKey15.SetKey(BuildInfo.IS_ARM64 ? 124 : 93);
                }
                arrayList3.add(iDKey15);
                arrayList2.addAll(arrayList3);
            } else {
                j2 = j8;
                str = str3;
            }
            C117407d.INSTANCE.mo160124a(arrayList2, false);
            Map<String, String> map = h.f262001c;
            if (map != null) {
                j4 = Util.getLong(map.get("summary.system"), -1);
                j3 = Util.getLong(h.f262001c.get("summary.graphics"), -1);
            } else {
                j4 = -1;
                j3 = -1;
            }
            Log.m105925i("MicroMsg.MemoryWatchDog.Reporter", "systemPss = %d, graphics = %d", Long.valueOf(j4), Long.valueOf(j3));
            StringBuilder sb = new StringBuilder();
            Log.m105918d("MicroMsg.MemoryWatchDog.Reporter", "mergeType = 0");
            C85337k.C85338a[] values = C85337k.C85338a.values();
            int length2 = values.length;
            int i6 = 0;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            while (i6 < length2) {
                C85337k.C85338a aVar = values[i6];
                C85337k.C85338a[] aVarArr = values;
                if (aVar.f248679f >= 3) {
                    aVar.f248678e |= 1;
                }
                if (aVar.f248680g >= 3) {
                    aVar.f248678e |= 2;
                }
                if (aVar.f248681h >= 3) {
                    aVar.f248678e |= 4;
                }
                if (aVar.f248682i >= 3) {
                    aVar.f248678e |= 8;
                }
                int i7 = length2;
                if (aVar.f248683j >= 3) {
                    aVar.f248678e |= 16;
                }
                if (aVar.f248684n > 3) {
                    aVar.f248678e |= 512;
                }
                int i8 = aVar.f248678e;
                if ((((~C85337k.C85338a.f248675t) & i8) != 0) && !aVar.f248685o) {
                    if ((i8 & 16) == 16 && !z6) {
                        sb.append("allProcess:");
                        C91355x[] xVarArr3 = h.f261990C;
                        int length3 = xVarArr3.length;
                        int i9 = 0;
                        while (i9 < length3) {
                            int i15 = length3;
                            C91355x xVar2 = xVarArr3[i9];
                            sb.append(xVar2.f261999a);
                            sb.append("-");
                            sb.append(xVar2.f262000b);
                            sb.append("-pss:");
                            sb.append(xVar2.f262023y);
                            sb.append(";");
                            i9++;
                            length3 = i15;
                            xVarArr3 = xVarArr3;
                        }
                        z6 = true;
                    }
                    if ((i8 & 4) != 4 || z7) {
                        z2 = z6;
                        z3 = false;
                    } else {
                        if (z6) {
                            sb.append("--------;");
                        }
                        Iterator it4 = ((ArrayList) h.f261991D).iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            String str4 = (String) entry2.getKey();
                            if (TextUtils.isEmpty(str4)) {
                                str2 = "<no-name>";
                                it = it4;
                                z4 = z6;
                            } else {
                                it = it4;
                                StringBuilder sb4 = new StringBuilder();
                                z4 = z6;
                                sb4.append("'");
                                sb4.append(str4);
                                sb4.append("'");
                                str2 = sb4.toString();
                            }
                            sb.append(str2);
                            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                            sb.append(entry2.getValue());
                            sb.append(" bytes;");
                            it4 = it;
                            z6 = z4;
                        }
                        z2 = z6;
                        z3 = false;
                        z7 = true;
                    }
                    boolean b = i8 | C85337k.m105353b(h, z3) | (C85337k.m105354c(h, z3) ? 2 : 0) | (C85337k.m105357f(h, z3) ? 4 : 0) | (C85337k.m105356e(h, z3) ? 8 : 0) | (C85337k.m105355d(h, z3) ? 16 : 0) | (C85337k.m105352a(h, z3) ? 512 : 0) | (((ArrayList) h.f262008j).isEmpty() ? 0 : 256) | z8;
                    Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "mergeType |= sceneType ==> %s", Integer.valueOf(b ? 1 : 0));
                    aVar.f248685o = true;
                    z8 = b;
                    z6 = z2;
                }
                i6++;
                values = aVarArr;
                length2 = i7;
            }
            if (!TextUtils.isEmpty(h.f261992E)) {
                sb.append(h.f261992E);
            }
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z8 ? 1 : 0);
            int i16 = C85337k.C85338a.f248675t;
            boolean z9 = true;
            objArr[1] = Boolean.valueOf((~i16) & z8);
            Log.m105919d("MicroMsg.MemoryWatchDog.Reporter", "final mergeType = %s, checkRunningOutBits = %s", objArr);
            if ((~i16) == false || !z8) {
                z9 = false;
            }
            if (z9 || z) {
                if (MMApplicationContext.isMainProcess()) {
                    if (TextUtils.isEmpty(h.f261993F)) {
                        h.f261993F = "graphic:" + C36595a.f97312g;
                    } else {
                        h.f261993F += "|graphic:" + C36595a.f97312g;
                    }
                }
                C85337k.m105359h(z8 ? 1 : 0, j7, j2, j15, (long) i4, (long) h.f261988A, sb.toString(), -1, j4, j3, h.f262021w, h.f262022x.totalMem, TextUtils.isEmpty(h.f261993F) ? str : h.f261993F, TextUtils.isEmpty(h.f261994G) ? str : h.f261994G, TextUtils.isEmpty(h.f261995H) ? str : h.f261995H, TextUtils.isEmpty(h.f261996I) ? str : h.f261996I, (long) h.f262024z, h.f262005g);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int i17 = MMApplicationContext.isMainProcess() ? 10 : MMApplicationContext.isToolsProcess() ? 20 : MMApplicationContext.isAppBrandProcess() ? 30 : 0;
        IDKey iDKey16 = new IDKey();
        iDKey16.SetID(1031);
        iDKey16.SetKey(i17);
        iDKey16.SetValue(((h.f262014p - h.f262015q) / 1024) / 1024);
        arrayList4.add(iDKey16);
        IDKey iDKey17 = new IDKey();
        iDKey17.SetID(1031);
        iDKey17.SetKey(i17 + 1);
        iDKey17.SetValue((h.f262012n / 1024) / 1024);
        arrayList4.add(iDKey17);
        IDKey iDKey18 = new IDKey();
        iDKey18.SetID(1031);
        iDKey18.SetKey(i17 + 2);
        iDKey18.SetValue(1);
        arrayList4.add(iDKey18);
        C117407d.INSTANCE.mo160124a(arrayList4, false);
        C85330f.m105346a(h);
        if (MMApplicationContext.isAppBrandProcess() || MMApplicationContext.isToolsProcess()) {
            C85337k.m105360i(h, z5);
        }
        if (mo118577c()) {
            mo118597p(h, 3);
        }
    }

    /* renamed from: e */
    public final void mo118579e(C91355x xVar) {
        long currentTimeMillis = System.currentTimeMillis();
        for (ActivityManager.RunningServiceInfo next : this.f248584o.getRunningServices(Integer.MAX_VALUE)) {
            if (next.uid == Process.myUid() && next.pid == Process.myPid()) {
                Log.m105919d("MicroMsg.MemoryWatchDog", "foreground %s, stared %s, lastActivityTime %s, activeSince %s, class %s", Boolean.valueOf(next.foreground), Boolean.valueOf(next.started), Long.valueOf(next.lastActivityTime), Long.valueOf(next.activeSince), next.service.getClassName());
                if (next.foreground) {
                    ((ArrayList) xVar.f262008j).add(next.service.getClassName());
                }
            }
        }
        Log.m105919d("MicroMsg.MemoryWatchDog", "getting running service info cost %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r5 = r8.substring(r13).trim();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118580f(p757xv.C91355x r21) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r2 = "MicroMsg.MemoryWatchDog"
            long r3 = java.lang.System.currentTimeMillis()
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.Long>> r0 = r1.f261991D
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0123 }
            java.io.FileReader r8 = new java.io.FileReader     // Catch:{ all -> 0x0123 }
            java.lang.String r9 = "/proc/self/maps"
            r8.<init>(r9)     // Catch:{ all -> 0x0123 }
            r7.<init>(r8)     // Catch:{ all -> 0x0123 }
        L_0x0020:
            java.lang.String r8 = r7.readLine()     // Catch:{ all -> 0x011e }
            r9 = 1
            if (r8 == 0) goto L_0x00dc
            java.lang.String r8 = r8.trim()     // Catch:{ all -> 0x011e }
            boolean r10 = r8.isEmpty()     // Catch:{ all -> 0x011e }
            if (r10 == 0) goto L_0x0032
            goto L_0x0020
        L_0x0032:
            r10 = 3
            r11 = 2
            r5 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
        L_0x003b:
            int r6 = r8.length()     // Catch:{ all -> 0x011e }
            if (r14 >= r6) goto L_0x00b2
            if (r15 == r9) goto L_0x009e
            if (r15 == r11) goto L_0x008f
            if (r15 != r10) goto L_0x0086
            if (r5 != 0) goto L_0x0074
            java.lang.String r6 = r8.substring(r12, r13)     // Catch:{ all -> 0x011e }
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x011e }
            r15 = 45
            int r15 = r6.indexOf(r15)     // Catch:{ all -> 0x011e }
            if (r15 >= 0) goto L_0x005a
            goto L_0x00b2
        L_0x005a:
            r10 = 0
            java.lang.String r11 = r6.substring(r10, r15)     // Catch:{ all -> 0x011e }
            int r15 = r15 + 1
            java.lang.String r6 = r6.substring(r15)     // Catch:{ all -> 0x011e }
            r10 = 16
            long r18 = java.lang.Long.parseLong(r6, r10)     // Catch:{ all -> 0x00b2 }
            long r10 = java.lang.Long.parseLong(r11, r10)     // Catch:{ all -> 0x00b2 }
            long r18 = r18 - r10
            r16 = r18
            goto L_0x0080
        L_0x0074:
            r6 = 4
            if (r5 != r6) goto L_0x0080
            java.lang.String r5 = r8.substring(r13)     // Catch:{ all -> 0x011e }
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x011e }
            goto L_0x00b3
        L_0x0080:
            int r5 = r5 + 1
            r10 = 3
            r11 = 2
            r15 = 1
            goto L_0x003b
        L_0x0086:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011e }
            java.lang.String r3 = "should not be here."
            r0.<init>(r3)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x008f:
            char r6 = r8.charAt(r14)     // Catch:{ all -> 0x011e }
            boolean r6 = java.lang.Character.isSpaceChar(r6)     // Catch:{ all -> 0x011e }
            if (r6 == 0) goto L_0x00a8
            r13 = r14
            r10 = 3
            r11 = 2
            r15 = 3
            goto L_0x003b
        L_0x009e:
            char r6 = r8.charAt(r14)     // Catch:{ all -> 0x011e }
            boolean r6 = java.lang.Character.isSpaceChar(r6)     // Catch:{ all -> 0x011e }
            if (r6 == 0) goto L_0x00ad
        L_0x00a8:
            int r14 = r14 + 1
            r10 = 3
            r11 = 2
            goto L_0x003b
        L_0x00ad:
            r12 = r14
            r10 = 3
            r11 = 2
            r15 = 2
            goto L_0x003b
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            int r6 = r8.length()     // Catch:{ all -> 0x011e }
            if (r14 != r6) goto L_0x00bd
            if (r5 != 0) goto L_0x00bd
            java.lang.String r5 = ""
        L_0x00bd:
            if (r5 == 0) goto L_0x0020
            r8 = 0
            int r6 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0020
            java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x011e }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x011e }
            if (r6 == 0) goto L_0x00d3
            long r8 = r6.longValue()     // Catch:{ all -> 0x011e }
            long r16 = r8 + r16
        L_0x00d3:
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x011e }
            r0.put(r5, r6)     // Catch:{ all -> 0x011e }
            goto L_0x0020
        L_0x00dc:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.Long>> r5 = r1.f261991D
            java.util.Set r0 = r0.entrySet()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.addAll(r0)
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.Long>> r0 = r1.f261991D
            com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$d r5 = new com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$d
            r6 = r20
            r5.<init>(r6)
            java.util.Collections.sort(r0, r5)
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.Long>> r0 = r1.f261991D
            r1 = 20
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.List r0 = r0.subList(r1, r5)
            r0.clear()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "getting mapped memory region info cost %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r1, r0)
            return
        L_0x011e:
            r0 = move-exception
            r6 = r20
            r5 = r7
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            r6 = r20
            r5 = 0
        L_0x0127:
            java.lang.String r3 = "[-] Fail to parse self maps."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)     // Catch:{ all -> 0x013a }
            java.util.List<java.util.Map$Entry<java.lang.String, java.lang.Long>> r0 = r1.f261991D     // Catch:{ all -> 0x013a }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x013a }
            r0.clear()     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            return
        L_0x013a:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog.mo118580f(xv.x):void");
    }

    /* renamed from: g */
    public C91355x mo118581g() {
        return mo118582h(true, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02c1 A[Catch:{ all -> 0x02d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a A[Catch:{ Exception -> 0x011c, all -> 0x0119 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ab A[Catch:{ all -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ac A[Catch:{ all -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c0  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p757xv.C91355x mo118582h(boolean r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            long r3 = java.lang.System.currentTimeMillis()
            xv.x r5 = new xv.x
            r5.<init>()
            java.lang.String r6 = r1.f248579g
            if (r6 == 0) goto L_0x0017
            java.lang.String r6 = r1.f248579g
            r5.f262005g = r6
        L_0x0017:
            r5.f262004f = r0
            int r6 = r1.f248576d
            long r6 = (long) r6
            r5.f262017s = r6
            int r6 = r1.f248577e
            long r6 = (long) r6
            r5.f262018t = r6
            java.lang.String r6 = ""
            java.lang.String r7 = "adjust for printing async!"
            java.lang.String r9 = "Something wrong when dumping memory"
            r10 = 30
            java.lang.String r12 = "MicroMsg.MemoryWatchDog"
            r15 = 4
            r13 = 1
            if (r2 == 0) goto L_0x0074
            r1.mo118583i(r5)     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            r1.mo118579e(r5)     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            r1.mo118584j(r5)     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            boolean r16 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            if (r16 != 0) goto L_0x0074
            if (r0 != r15) goto L_0x0074
            boolean r0 = qe3.C89625d.f257845k     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            if (r0 == 0) goto L_0x0074
            boolean r0 = be2.C79693c.m96809c()     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            if (r0 == 0) goto L_0x0050
            r14 = 4703052617197027328(0x4144997000000000, double:2700000.0)
            goto L_0x0057
        L_0x0050:
            r16 = 4704555855750627328(0x4149f0a000000000, double:3400000.0)
            r14 = r16
        L_0x0057:
            long r14 = (long) r14     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            int r0 = r5.f262003e     // Catch:{ Exception -> 0x0065, all -> 0x0069 }
            r17 = r9
            long r8 = (long) r0
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            r1.mo118580f(r5)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            goto L_0x0076
        L_0x0065:
            r0 = move-exception
            r17 = r9
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            r17 = r9
        L_0x006c:
            r8 = r17
            goto L_0x02e0
        L_0x0070:
            r8 = r17
            goto L_0x011f
        L_0x0074:
            r17 = r9
        L_0x0076:
            java.lang.String r0 = "\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            java.lang.String r8 = r18.mo118586l()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            java.util.regex.Matcher r0 = r0.matcher(r8)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            boolean r8 = r0.find()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            if (r8 == 0) goto L_0x0094
            java.lang.String r0 = r0.group()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262003e = r0     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
        L_0x0094:
            long r8 = android.os.Debug.getNativeHeapSize()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262011m = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            long r8 = android.os.Debug.getNativeHeapAllocatedSize()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262012n = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            long r8 = android.os.Debug.getNativeHeapFreeSize()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262013o = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            long r8 = r0.totalMemory()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262014p = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            long r8 = r0.freeMemory()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262015q = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            long r8 = r0.maxMemory()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262016r = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r0.<init>()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            android.app.ActivityManager r8 = r1.f248584o     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r8.getMemoryInfo(r0)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f262022x = r0     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            int r0 = android.os.Process.myPid()     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            com.tencent.matrix.util.StatusInfo$b r8 = com.tencent.matrix.util.StatusInfo.f235698o     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            com.tencent.matrix.util.StatusInfo r0 = r8.mo112189a(r0)     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            int r8 = r0.f235705j     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f261997J = r8     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            int r0 = r0.f235706n     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            r5.f261998K = r0     // Catch:{ Exception -> 0x011c, all -> 0x0119 }
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r3
            r5.f262019u = r8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x010a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x010a
            if (r2 != 0) goto L_0x010a
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x010a
            boolean r0 = r1.f248581i
            if (r0 == 0) goto L_0x010a
            int r0 = r1.f248578f
            int r0 = r0 + r13
            r1.f248578f = r0
            r3 = 10
            if (r0 <= r3) goto L_0x010a
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r7)
            r3 = 0
            r1.f248581i = r3
        L_0x010a:
            android.app.ActivityManager$MemoryInfo r0 = r5.f262022x
            if (r0 != 0) goto L_0x015b
            r8 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r8)
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            goto L_0x0159
        L_0x0119:
            r0 = move-exception
            goto L_0x006c
        L_0x011c:
            r0 = move-exception
            goto L_0x0070
        L_0x011f:
            r9 = 0
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ all -> 0x02df }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r14)     // Catch:{ all -> 0x02df }
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r3
            r5.f262019u = r14
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x014d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 != 0) goto L_0x014d
            if (r2 != 0) goto L_0x014d
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            boolean r0 = r1.f248581i
            if (r0 == 0) goto L_0x014d
            int r0 = r1.f248578f
            int r0 = r0 + r13
            r1.f248578f = r0
            r3 = 10
            if (r0 <= r3) goto L_0x014d
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r7)
            r3 = 0
            r1.f248581i = r3
        L_0x014d:
            android.app.ActivityManager$MemoryInfo r0 = r5.f262022x
            if (r0 != 0) goto L_0x015b
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r8)
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
        L_0x0159:
            r5.f262022x = r0
        L_0x015b:
            boolean r0 = r1.f248582j
            r5.f262006h = r0
            boolean r0 = r1.f248583n
            r5.f262007i = r0
            boolean r0 = p757xv.C91355x.m114610b()
            if (r0 == 0) goto L_0x0174
            java.util.Set<java.lang.String> r0 = r1.f248580h
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r13
            r5.f262010l = r0
        L_0x0174:
            boolean r0 = p757xv.C91355x.m114610b()
            if (r0 == 0) goto L_0x0188
            boolean r0 = r5.f262007i
            if (r0 != 0) goto L_0x0188
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r1.f248588s
            long r3 = r3 - r7
            r5.f262021w = r3
            goto L_0x019b
        L_0x0188:
            boolean r0 = p757xv.C91355x.m114610b()
            if (r0 != 0) goto L_0x019b
            boolean r0 = r5.f262006h
            if (r0 != 0) goto L_0x019b
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r1.f248587r
            long r3 = r3 - r7
            r5.f262021w = r3
        L_0x019b:
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_enable_publish_trim_memory_event     // Catch:{ all -> 0x01b4 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x01b4 }
            if (r3 != 0) goto L_0x01ae
            boolean r3 = qe3.C89625d.f257845k     // Catch:{ all -> 0x01b4 }
            if (r3 != 0) goto L_0x01ae
            boolean r3 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x01b4 }
            if (r3 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r3 = 0
            goto L_0x01af
        L_0x01ae:
            r3 = 1
        L_0x01af:
            boolean r0 = p761yd.C38993b.m41993c(r0, r3)     // Catch:{ all -> 0x01b4 }
            goto L_0x01bc
        L_0x01b4:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r4)
            r0 = 0
        L_0x01bc:
            if (r0 != 0) goto L_0x01c0
            goto L_0x02a3
        L_0x01c0:
            long r3 = java.lang.System.currentTimeMillis()
            long r6 = r1.f248594y
            long r6 = r3 - r6
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r0.toMillis(r10)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01da
            java.lang.String r0 = "less than 30 seconds since last publish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x02a3
        L_0x01da:
            long r6 = r1.f248594y
            long r3 = r3 - r6
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r6 = r0.toMinutes(r10)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f3
            int r0 = r1.f248593x
            if (r0 == 0) goto L_0x01f3
            java.lang.String r0 = "has not published for more than 30 minutes. reset publish times limit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r3 = 0
            r1.f248593x = r3
        L_0x01f3:
            int r0 = r1.f248593x
            r3 = 5
            if (r0 <= r3) goto L_0x01ff
            java.lang.String r0 = "has published more than 5 times, ignore in 30 minutes"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x02a3
        L_0x01ff:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r0 != 0) goto L_0x020b
            boolean r0 = be2.C79693c.m96809c()
            if (r0 == 0) goto L_0x020b
            r0 = 1
            goto L_0x020c
        L_0x020b:
            r0 = 0
        L_0x020c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            r7 = 1660(0x67c, float:2.326E-42)
            r8 = 0
            r6.<init>((int) r7, (int) r8, (int) r13)
            r4.add(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r6 != 0) goto L_0x024f
            if (r0 == 0) goto L_0x0228
            r8 = 4703052617197027328(0x4144997000000000, double:2700000.0)
            goto L_0x022d
        L_0x0228:
            r8 = 4705200100845027328(0x414c3a9000000000, double:3700000.0)
        L_0x022d:
            long r8 = (long) r8
            int r6 = r5.f262003e
            long r10 = (long) r6
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x024f
            java.lang.String r3 = "shouldPublish: vmsize"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            if (r0 == 0) goto L_0x0241
            r15 = 1
            goto L_0x0242
        L_0x0241:
            r15 = 4
        L_0x0242:
            r3.<init>((int) r7, (int) r15, (int) r13)
            r4.add(r3)
            kj2.d r0 = kj2.C117407d.INSTANCE
            r3 = 0
            r0.mo160124a(r4, r3)
            goto L_0x02a1
        L_0x024f:
            if (r0 == 0) goto L_0x0255
            r8 = 367001600(0x15e00000, double:1.813228825E-315)
            goto L_0x0258
        L_0x0255:
            r8 = 471859200(0x1c200000, double:2.331294204E-315)
        L_0x0258:
            long r10 = r5.f262014p
            long r14 = r5.f262015q
            long r10 = r10 - r14
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0279
            java.lang.String r6 = "shouldPublish: java heap"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            if (r0 == 0) goto L_0x026c
            r3 = 2
        L_0x026c:
            r6.<init>((int) r7, (int) r3, (int) r13)
            r4.add(r6)
            kj2.d r0 = kj2.C117407d.INSTANCE
            r3 = 0
            r0.mo160124a(r4, r3)
            goto L_0x02a1
        L_0x0279:
            if (r0 == 0) goto L_0x027f
            r8 = 734003200(0x2bc00000, double:3.62645765E-315)
            goto L_0x0282
        L_0x027f:
            r8 = 943718400(0x38400000, double:4.66258841E-315)
        L_0x0282:
            long r10 = r5.f262012n
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x02a3
            java.lang.String r3 = "shouldPublish: native heap"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            if (r0 == 0) goto L_0x0294
            r0 = 3
            goto L_0x0295
        L_0x0294:
            r0 = 6
        L_0x0295:
            r3.<init>((int) r7, (int) r0, (int) r13)
            r4.add(r3)
            kj2.d r0 = kj2.C117407d.INSTANCE
            r3 = 0
            r0.mo160124a(r4, r3)
        L_0x02a1:
            r0 = 1
            goto L_0x02a4
        L_0x02a3:
            r0 = 0
        L_0x02a4:
            if (r0 == 0) goto L_0x02b4
            long r3 = java.lang.System.currentTimeMillis()
            r1.f248594y = r3
            int r0 = r1.f248593x
            int r0 = r0 + r13
            r1.f248593x = r0
            r1.mo118588n(r5, r2)
        L_0x02b4:
            long r2 = r5.f262014p     // Catch:{ all -> 0x02d5 }
            long r6 = r5.f262015q     // Catch:{ all -> 0x02d5 }
            long r2 = r2 - r6
            long r6 = r5.f262012n     // Catch:{ all -> 0x02d5 }
            boolean r0 = com.tencent.p014mm.plugin.performance.watchdogs.C85331g.m105350d(r2, r6)     // Catch:{ all -> 0x02d5 }
            if (r0 != 0) goto L_0x02de
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ all -> 0x02d5 }
            com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$a r2 = new com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$a     // Catch:{ all -> 0x02d5 }
            r2.<init>(r5)     // Catch:{ all -> 0x02d5 }
            java.lang.String r3 = "MicroMsg.MemoryWatchDog.dump"
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ all -> 0x02d5 }
            r0.getClass()     // Catch:{ all -> 0x02d5 }
            r6 = 0
            r0.mo183887r(r2, r6, r3)     // Catch:{ all -> 0x02d5 }
            goto L_0x02de
        L_0x02d5:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "dump hprof failed"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r2)
        L_0x02de:
            return r5
        L_0x02df:
            r0 = move-exception
        L_0x02e0:
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r3
            r5.f262019u = r14
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 != 0) goto L_0x0308
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r3 != 0) goto L_0x0308
            if (r2 != 0) goto L_0x0308
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0308
            boolean r2 = r1.f248581i
            if (r2 == 0) goto L_0x0308
            int r2 = r1.f248578f
            int r2 = r2 + r13
            r1.f248578f = r2
            r3 = 10
            if (r2 <= r3) goto L_0x0308
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r7)
            r2 = 0
            r1.f248581i = r2
        L_0x0308:
            android.app.ActivityManager$MemoryInfo r2 = r5.f262022x
            if (r2 != 0) goto L_0x0316
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r8)
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo
            r2.<init>()
            r5.f262022x = r2
        L_0x0316:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog.mo118582h(boolean, int):xv.x");
    }

    /* renamed from: i */
    public final void mo118583i(C91355x xVar) {
        C91355x xVar2 = xVar;
        long currentTimeMillis = System.currentTimeMillis();
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        xVar2.f262023y = memoryInfo.getTotalPss();
        int i = Build.VERSION.SDK_INT;
        long j = currentTimeMillis;
        if (i >= 23) {
            xVar2.f262001c = memoryInfo.getMemoryStats();
        } else {
            HashMap hashMap = new HashMap();
            xVar2.f262001c = hashMap;
            hashMap.put("summary.java-heap", String.valueOf(memoryInfo.dalvikPrivateDirty));
            xVar2.f262001c.put("summary.native-heap", String.valueOf(memoryInfo.nativePrivateDirty));
            xVar2.f262001c.put("summary.code", "-1");
            xVar2.f262001c.put("summary.stack", "-1");
            xVar2.f262001c.put("summary.graphics", "-1");
            xVar2.f262001c.put("summary.private-other", "-1");
            xVar2.f262001c.put("summary.system", String.valueOf((memoryInfo.getTotalPss() - memoryInfo.getTotalPrivateClean()) - memoryInfo.getTotalPrivateDirty()));
            xVar2.f262001c.put("summary.total-pss", String.valueOf(memoryInfo.getTotalPss()));
            xVar2.f262001c.put("summary.total-swap", "-1");
        }
        Debug.MemoryInfo[] processMemoryInfo = this.f248584o.getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo != null && processMemoryInfo.length == 1) {
            Debug.MemoryInfo memoryInfo2 = processMemoryInfo[0];
            xVar2.f262024z = memoryInfo2.getTotalPss();
            if (i >= 23) {
                xVar2.f262001c.put("summary.graphics", memoryInfo2.getMemoryStat("summary.graphics"));
                xVar2.f262002d = memoryInfo2.getMemoryStats();
            } else {
                HashMap hashMap2 = new HashMap();
                xVar2.f262002d = hashMap2;
                hashMap2.put("summary.java-heap", String.valueOf(memoryInfo2.dalvikPrivateDirty));
                xVar2.f262002d.put("summary.native-heap", String.valueOf(memoryInfo2.nativePrivateDirty));
                xVar2.f262002d.put("summary.code", "-1");
                xVar2.f262002d.put("summary.stack", "-1");
                xVar2.f262002d.put("summary.graphics", "-1");
                xVar2.f262002d.put("summary.private-other", "-1");
                xVar2.f262002d.put("summary.system", String.valueOf((memoryInfo2.getTotalPss() - memoryInfo2.getTotalPrivateClean()) - memoryInfo2.getTotalPrivateDirty()));
                xVar2.f262002d.put("summary.total-pss", String.valueOf(memoryInfo2.getTotalPss()));
                xVar2.f262002d.put("summary.total-swap", "-1");
            }
        }
        Log.m105919d("MicroMsg.MemoryWatchDog", "getting process memory info costs %s", Long.valueOf(System.currentTimeMillis() - j));
        if (MMApplicationContext.isMainProcess()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f248584o.getRunningAppProcesses();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < runningAppProcesses.size(); i2++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i2);
                String packageName = WeChatBrands.AppInfo.current().getPackageName();
                Log.m105919d("MicroMsg.MemoryWatchDog", "pkg name is [%s]", packageName);
                if (Process.myUid() != runningAppProcessInfo.uid || TextUtils.isEmpty(runningAppProcessInfo.processName) || !runningAppProcessInfo.processName.startsWith(packageName)) {
                    Log.m105921e("MicroMsg.MemoryWatchDog", "info with uid [%s] & process name [%s] is not current app [%s][%s]", Integer.valueOf(runningAppProcesses.get(i2).uid), runningAppProcesses.get(i2).processName, Integer.valueOf(Process.myUid()), packageName);
                } else {
                    C91355x xVar3 = new C91355x();
                    xVar3.f261999a = runningAppProcesses.get(i2).pid;
                    xVar3.f262000b = runningAppProcesses.get(i2).processName;
                    arrayList.add(xVar3);
                    Log.m105919d("MicroMsg.MemoryWatchDog", "pid = %s, process = %s", Integer.valueOf(xVar3.f261999a), xVar3.f262000b);
                }
            }
            int size = arrayList.size();
            C91355x[] xVarArr = new C91355x[size];
            arrayList.toArray(xVarArr);
            ActivityManager activityManager = this.f248584o;
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = xVarArr[i3].f261999a;
            }
            Debug.MemoryInfo[] processMemoryInfo2 = activityManager.getProcessMemoryInfo(iArr);
            if (processMemoryInfo2 != null) {
                Log.m105919d("MicroMsg.MemoryWatchDog", "pidMemInfoArray2 size = %s, memoryInfos size = %s", Integer.valueOf(processMemoryInfo2.length), Integer.valueOf(size));
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.isCoolassistEnv()) {
                    Assert.assertEquals(size, processMemoryInfo2.length);
                }
                int i4 = 0;
                for (int i5 = 0; i5 < Math.min(processMemoryInfo2.length, size); i5++) {
                    Log.m105919d("MicroMsg.MemoryWatchDog", "total pss = %d", Integer.valueOf(processMemoryInfo2[i5].getTotalPss()));
                    xVarArr[i5].f262023y = processMemoryInfo2[i5].getTotalPss();
                    i4 += xVarArr[i5].f262023y;
                }
                xVar2.f261988A = i4;
                xVar2.f261990C = xVarArr;
                xVar2.f261989B = XWebSdk.getRenderSandboxProcessMemory();
            } else {
                Log.m105920e("MicroMsg.MemoryWatchDog", "pidMemInfoArray2 == null");
            }
            Log.m105919d("MicroMsg.MemoryWatchDog", "getting process memory info costs %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        }
    }

    /* renamed from: j */
    public final void mo118584j(C91355x xVar) {
        C91350o oVar = this.f248592w;
        if (oVar == null) {
            Log.m105920e("MicroMsg.MemoryWatchDog", "mAppbrandExtraMemoryInfo == null");
            return;
        }
        xVar.f261992E = oVar.mo116860a();
        xVar.f261993F = this.f248592w.mo116864e();
        xVar.f261994G = this.f248592w.mo116862c();
        xVar.f261995H = this.f248592w.mo116863d();
        xVar.f261996I = this.f248592w.mo116861b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC, Splitter:B:26:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo118585k(java.lang.String r6) {
        /*
            r5 = this;
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r0 = r6.getPath()
            if (r0 == 0) goto L_0x0025
            r1 = 0
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r1, r1)
            java.lang.String r1 = r6.getPath()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0025
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r0)
            android.net.Uri r6 = r6.build()
        L_0x0025:
            r0 = 0
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0068 }
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r6, r0)     // Catch:{ all -> 0x0068 }
            java.io.InputStream r6 = com.tencent.p014mm.vfs.C86013q1.m106421C(r6, r1)     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0061 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0061 }
            r3.<init>(r6)     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
        L_0x003f:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x004e
            r1.append(r0)     // Catch:{ all -> 0x005d }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x005d }
            goto L_0x003f
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x005a
            r6.close()
        L_0x005a:
            return r0
        L_0x005b:
            r0 = move-exception
            goto L_0x006c
        L_0x005d:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0062
        L_0x0061:
            r1 = move-exception
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ all -> 0x005b }
        L_0x0067:
            throw r1     // Catch:{ all -> 0x005b }
        L_0x0068:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            r6.close()
        L_0x0071:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog.mo118585k(java.lang.String):java.lang.String");
    }

    /* renamed from: l */
    public final String mo118586l() {
        try {
            String[] split = mo118585k(String.format("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    return str;
                }
            }
            Log.m105929w("MicroMsg.MemoryWatchDog", "[getVmSize] Wrong!", split[12]);
            return split[12];
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: m */
    public void mo118587m(boolean z) {
        Log.m105919d("MicroMsg.MemoryWatchDog", "isAppForeground: %s", Boolean.valueOf(z));
        this.f248582j = z;
        if (!z) {
            this.f248587r = System.currentTimeMillis();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f248589t > 300000) {
            Log.m105924i("MicroMsg.MemoryWatchDog", "onAppForeground: forward check");
            this.f248589t = currentTimeMillis;
            ((C119157j) C119157j.f356862d).mo183894y("MicroMsg.MemoryWatchDog");
            ((C119157j) C119157j.f356862d).mo183879j(this, 300000, "MicroMsg.MemoryWatchDog");
        }
    }

    /* renamed from: n */
    public final void mo118588n(C91355x xVar, boolean z) {
        MMTrimMemoryEvent mMTrimMemoryEvent = new MMTrimMemoryEvent();
        MMTrimMemoryEvent.C80728a aVar = mMTrimMemoryEvent.f236229d;
        aVar.f236230a = 1;
        aVar.f236231b = (long) xVar.f262003e;
        aVar.f236232c = xVar.f262011m;
        aVar.f236233d = xVar.f262012n;
        aVar.f236234e = xVar.f262014p - xVar.f262015q;
        if (z) {
            aVar.f236235f = (long) xVar.f262023y;
            aVar.f236236g = (long) Util.getInt(xVar.f262001c.get("summary.graphics"), 0);
            mMTrimMemoryEvent.f236229d.f236237h = (long) Util.getInt(xVar.f262001c.get("summary.native-heap"), 0);
            mMTrimMemoryEvent.f236229d.f236238i = (long) xVar.f261988A;
        }
        mMTrimMemoryEvent.publish();
    }

    /* renamed from: o */
    public void mo118589o(C91350o oVar) {
        this.f248592w = oVar;
        C89491c0.f257566a.getClass();
        C87412m.m108594g(oVar, "factory");
        String tag = oVar.getTag();
        ConcurrentHashMap<String, C91349n> concurrentHashMap = C89491c0.f257567b;
        if (!concurrentHashMap.contains(tag)) {
            C87412m.m108593f(tag, "tag");
            concurrentHashMap.put(tag, oVar);
            return;
        }
        throw new RuntimeException("Tag of ExtraInfoFactory conflict");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (MMApplicationContext.isAppBrandProcess() || MMApplicationContext.isToolsProcess()) {
            String str = activity.toString() + XVFSFile.PATH_SEPARATOR + activity.hashCode();
            ((HashSet) this.f248580h).add(str);
            Log.m105925i("MicroMsg.MemoryWatchDog", "onActivityCreated: %s, mActivities.size = %s", str, Integer.valueOf(((HashSet) this.f248580h).size()));
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (MMApplicationContext.isAppBrandProcess() || MMApplicationContext.isToolsProcess()) {
            String str = activity.toString() + XVFSFile.PATH_SEPARATOR + activity.hashCode();
            ((HashSet) this.f248580h).remove(str);
            Log.m105925i("MicroMsg.MemoryWatchDog", "onActivityDestroyed: %s, mActivities.size = %s", str, Integer.valueOf(((HashSet) this.f248580h).size()));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        this.f248579g = activity.getClass().getSimpleName();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        this.f248579g = activity.getClass().getSimpleName();
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = uptimeMillis - this.f248595z > 2000;
        this.f248595z = uptimeMillis;
        if (z) {
            ((C119157j) C119157j.f356862d).mo183878i(new C85340l(this, 1), 2000);
        }
    }

    public void onActivityStopped(Activity activity) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = uptimeMillis - this.f248595z > 2000;
        this.f248595z = uptimeMillis;
        if (z) {
            ((C119157j) C119157j.f356862d).mo183878i(new C85340l(this, 2), 2000);
        }
    }

    /* renamed from: p */
    public final void mo118597p(C91355x xVar, int i) {
        Log.m105924i("MicroMsg.MemoryWatchDog", "check triggerMemoryHook");
        if (this.f248591v) {
            long j = xVar.f262012n;
            if (j > this.f248585p || ((long) xVar.f262023y) > this.f248586q) {
                long j2 = j + DownloadHelper.SAVE_LENGTH;
                this.f248585p = j2;
                if (this.f248586q < 2097152) {
                    this.f248586q = (long) (xVar.f262023y + 102400);
                } else {
                    this.f248586q = MAlarmHandler.NEXT_FIRE_INTERVAL;
                }
                Log.m105925i("MicroMsg.MemoryWatchDog", "trigger report, next threshold : native %s pss %s, isFg=%s, fgSvs=%s, bgDur=%s", Long.valueOf(j2), Long.valueOf(this.f248586q), Boolean.valueOf(xVar.f262006h), Arrays.toString(((ArrayList) xVar.f262008j).toArray()), Long.valueOf(xVar.f262021w));
                if (i != 3) {
                    Log.m105924i("MicroMsg.MemoryWatchDog", "not SOURCE_AUTO_CHECK, dumpForegroundService");
                    mo118579e(xVar);
                }
                ((C86511b) C28544a.INSTANCE.mo56045a(C86511b.class)).mo118541p(false);
            }
        } else if ((xVar.f262012n > 209715200 || xVar.f262023y > 1048576) && Build.VERSION.SDK_INT >= 26) {
            Log.m105924i("MicroMsg.MemoryWatchDog", "trigger hook");
            StringBuilder sb = new StringBuilder();
            sb.append("<cmd><diagnostic><MemoryHook enable='1' source='auto' process='");
            sb.append(MMApplicationContext.isMainProcess() ? XWalkEnvironment.MODULE_MM : MMApplicationContext.isAppBrandProcess() ? XWalkEnvironment.MODULE_APPBRAND : MMApplicationContext.isToolsProcess() ? XWalkEnvironment.MODULE_TOOLS : "all");
            sb.append("' duration='24' hook='");
            sb.append(".*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$");
            sb.append("' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>");
            C28544a.INSTANCE.mo56047c(sb.toString());
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey(1571, 1, 1);
            IDKey iDKey2 = new IDKey(1571, MMApplicationContext.isMainProcess() ? 30 : MMApplicationContext.isAppBrandProcess() ? 31 : (MMApplicationContext.isToolsProcess() || MMApplicationContext.isToolsIsolatedProcess()) ? 32 : -1, 1);
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C117407d.INSTANCE.mo160124a(arrayList, false);
            this.f248591v = true;
            if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !WeChatEnvironment.hasDebugger()) {
                return;
            }
            if (!MultiProcessMMKV.getMMKV("diagnostic_storage").decodeBool("KEY_ENABLE_HOOK_TOAST", true)) {
                Log.m105924i("MicroMsg.MemoryWatchDog", "skip toast");
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(new MemoryWatchDog$$e(this));
            }
        }
    }

    public void run() {
        mo118578d(false);
        this.f248589t = System.currentTimeMillis();
        ((C119157j) C119157j.f356862d).mo183879j(this, this.f248582j ? 300000 : 1800000, "MicroMsg.MemoryWatchDog");
    }
}

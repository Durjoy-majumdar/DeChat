package nj2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p653pv.C35689d;
import vc3.C65583b;
import wj2.C53183e;
import wj2.C66128a;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import z04.C112551y;
import z04.C91602g0;

/* renamed from: nj2.p */
public final class C61768p {

    /* renamed from: a */
    public static final C61768p f175586a;

    /* renamed from: b */
    public static String f175587b = "";

    /* renamed from: c */
    public static MultiProcessMMKV f175588c;

    /* renamed from: d */
    public static MultiProcessMMKV f175589d;

    /* renamed from: e */
    public static MultiProcessMMKV f175590e;

    /* renamed from: f */
    public static final MultiProcessMMKV f175591f;

    /* renamed from: g */
    public static C0000n0 f175592g = C53930o0.m60561h(C53930o0.m60554a(C53872d1.f151119c), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: h */
    public static C53973z1 f175593h;

    /* renamed from: i */
    public static String f175594i = "";

    /* renamed from: j */
    public static HashSet<String> f175595j = new HashSet<>();

    /* renamed from: k */
    public static volatile boolean f175596k;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.RingtoneManager", mo125469f = "RingtoneManager.kt", mo125470l = {345, 358}, mo125471m = "cacheRingtone")
    /* renamed from: nj2.p$a */
    public static final class C61769a extends C66704d {

        /* renamed from: d */
        public Object f175597d;

        /* renamed from: e */
        public Object f175598e;

        /* renamed from: f */
        public Object f175599f;

        /* renamed from: g */
        public boolean f175600g;

        /* renamed from: h */
        public boolean f175601h;

        /* renamed from: i */
        public /* synthetic */ Object f175602i;

        /* renamed from: j */
        public final /* synthetic */ C61768p f175603j;

        /* renamed from: n */
        public int f175604n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61769a(C61768p pVar, C15601d<? super C61769a> dVar) {
            super(dVar);
            this.f175603j = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f175602i = obj;
            this.f175604n |= Integer.MIN_VALUE;
            return this.f175603j.mo86689a((String) null, (C66132f) null, false, this);
        }
    }

    static {
        C61768p pVar = new C61768p();
        f175586a = pVar;
        f175588c = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_ringtone_manager"));
        f175589d = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_exclusive_manager"));
        f175590e = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_ringtone_params"));
        f175591f = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_ringtone_new_calling_info"));
    }

    /* renamed from: d */
    public static final C66132f m72477d(String str) {
        C87412m.m108594g(str, "username");
        String string = f175586a.mo86692e().getString(str, "");
        if (string == null || C112551y.m153811k(string)) {
            return null;
        }
        return new C66128a((C66132f) null, (String) null, 0, 7, (C8480h) null).mo90165a(string).f190059d;
    }

    /* renamed from: f */
    public static final C66132f m72478f() {
        String string = f175586a.mo86692e().getString(C75592q0.m90789s(), "");
        return (string == null || C112551y.m153811k(string)) ? C66135h.f190107E.mo90187b() : C66135h.f190107E.mo90190f(string);
    }

    /* renamed from: g */
    public static final List<C66128a> m72479g() {
        ArrayList<String> arrayList;
        String[] allKeys = f175586a.mo86692e().allKeys();
        if (allKeys != null) {
            arrayList = new ArrayList<>();
            for (String str : allKeys) {
                if (!C87412m.m108589b(str, C75592q0.m90789s())) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            for (String string : arrayList) {
                String string2 = f175586a.mo86692e().getString(string, (String) null);
                if (string2 != null) {
                    C66128a a = new C66128a((C66132f) null, (String) null, 0, 7, (C8480h) null).mo90165a(string2);
                    String str2 = a.f190060e;
                    if (str2 == null || C112551y.m153811k(str2)) {
                        Log.m105920e("MicroMsg.RingtoneManager", "getVoipExclusiveList find invalid empty username!!!");
                    } else {
                        arrayList2.add(a);
                    }
                }
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return arrayList2;
    }

    /* renamed from: h */
    public static final String m72480h(String str) {
        C87412m.m108594g(str, "toUser");
        String str2 = m72482j(str).f190089l;
        Log.m105924i("MicroMsg.RingtoneManager", "getVoipRingtoneChannelInUse toUser:" + str + " channelId:" + str2);
        return str2;
    }

    /* renamed from: i */
    public static final C66132f m72481i(String str) {
        C87412m.m108594g(str, "toUser");
        if (C87412m.m108589b(str, C75592q0.m90789s())) {
            str = "";
        }
        C61768p pVar = f175586a;
        String c = pVar.mo86691c("voip_ringtone_channel_" + str);
        m72487o();
        MultiProcessMMKV multiProcessMMKV = f175588c;
        C87412m.m108593f(multiProcessMMKV, "mmkv");
        String string = multiProcessMMKV.getString(c, (String) null);
        if (string == null) {
            return null;
        }
        return C66135h.f190107E.mo90190f(string);
    }

    /* renamed from: j */
    public static final C66132f m72482j(String str) {
        C87412m.m108594g(str, "toUser");
        f175594i = str;
        C66132f i = m72481i(str);
        C66132f fVar = null;
        if (i != null) {
            i.f190090m = C53183e.EXCLUSIVE;
        } else {
            i = null;
        }
        boolean z = false;
        if (!(i != null && i.mo90170a())) {
            i = null;
        }
        C66132f i2 = m72481i("");
        if (i2 != null) {
            i2.f190090m = C53183e.GLOBAL;
        } else {
            i2 = null;
        }
        if (i2 != null && i2.mo90170a()) {
            z = true;
        }
        if (z) {
            fVar = i2;
        }
        C66132f b = C66135h.f190107E.mo90187b();
        String a = C65583b.m77266a();
        C87412m.m108593f(a, "getVoipChannelId()");
        b.f190089l = a;
        b.f190090m = C53183e.DEFAULT;
        return i == null ? fVar == null ? b : fVar : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m72483k() {
        /*
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121115m()
            if (r0 == 0) goto L_0x00db
            m72487o()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x00db
            nj2.p r0 = f175586a
            java.lang.String r1 = "MicroMsg.RingtoneManager"
            java.lang.String r2 = "deleteNonMyVoipChannel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            f40.e r2 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x00c2 }
            boolean r2 = r2.mo121115m()     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x00db
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r3 = "notification"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r3 = "null cannot be cast to non-null type android.app.NotificationManager"
            gy3.C87412m.m108592e(r2, r3)     // Catch:{ Exception -> 0x00c2 }
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch:{ Exception -> 0x00c2 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo86692e()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String[] r0 = r0.allKeys()     // Catch:{ Exception -> 0x00c2 }
            r3 = 0
            if (r0 == 0) goto L_0x0066
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00c2 }
            r4.<init>()     // Catch:{ Exception -> 0x00c2 }
            int r5 = r0.length     // Catch:{ Exception -> 0x00c2 }
            r6 = 0
        L_0x004b:
            if (r6 >= r5) goto L_0x0068
            r7 = r0[r6]     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r8 = "it"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ Exception -> 0x00c2 }
            wj2.f r7 = m72481i(r7)     // Catch:{ Exception -> 0x00c2 }
            if (r7 == 0) goto L_0x005d
            java.lang.String r7 = r7.f190089l     // Catch:{ Exception -> 0x00c2 }
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            if (r7 == 0) goto L_0x0063
            r4.add(r7)     // Catch:{ Exception -> 0x00c2 }
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x004b
        L_0x0066:
            sx3.f0 r4 = sx3.C64186f0.f181907d     // Catch:{ Exception -> 0x00c2 }
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
            r0.<init>()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r5 = "debug myRingtoneChannels:"
            r0.append(r5)     // Catch:{ Exception -> 0x00c2 }
            r0.append(r4)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ Exception -> 0x00c2 }
            java.util.List r0 = r2.getNotificationChannels()     // Catch:{ Exception -> 0x00c2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00c2 }
        L_0x0084:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x00c2 }
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x00c2 }
            android.app.NotificationChannel r5 = (android.app.NotificationChannel) r5     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r6 = r5.getId()     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r7 = "channel.id"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r7 = "voip_ringtone_channel_"
            boolean r6 = z04.C112550d0.m153801u(r6, r7, r3)     // Catch:{ Exception -> 0x00c2 }
            if (r6 == 0) goto L_0x0084
            java.lang.String r6 = r5.getId()     // Catch:{ Exception -> 0x00c2 }
            boolean r6 = r4.contains(r6)     // Catch:{ Exception -> 0x00c2 }
            if (r6 != 0) goto L_0x0084
            java.lang.String r6 = "deleteNonMyVoipChannel id:%s"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r8 = r5.getId()     // Catch:{ Exception -> 0x00c2 }
            r7[r3] = r8     // Catch:{ Exception -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r5 = r5.getId()     // Catch:{ Exception -> 0x00c2 }
            r2.deleteNotificationChannel(r5)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x0084
        L_0x00c2:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "deleteNonMyVoipChannel error: "
            r2.append(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.C61768p.m72483k():void");
    }

    /* renamed from: l */
    public static final void m72484l(String str, C66132f fVar) {
        String str2;
        String str3;
        C87412m.m108594g(str, "toUser");
        Log.m105924i("MicroMsg.RingtoneManager", "resetVoipRingtoneInfo toUser:" + str);
        String str4 = "";
        String str5 = C87412m.m108589b(str, C75592q0.m90789s()) ? str4 : str;
        C66132f i = m72481i(str5);
        String h = m72480h(str5);
        if (fVar == null) {
            C86013q1.m106447h(i != null ? i.mo90177h() : null);
        }
        String c = f175586a.mo86691c("voip_ringtone_channel_" + str5);
        if (fVar != null) {
            String str6 = c + System.currentTimeMillis();
            C87412m.m108594g(str6, "<set-?>");
            fVar.f190089l = str6;
            fVar.f190096s = System.currentTimeMillis();
            m72487o();
            MultiProcessMMKV multiProcessMMKV = f175588c;
            C87412m.m108593f(multiProcessMMKV, "mmkv");
            multiProcessMMKV.putString(c, fVar.mo90183n());
        } else {
            m72487o();
            MultiProcessMMKV multiProcessMMKV2 = f175588c;
            C87412m.m108593f(multiProcessMMKV2, "mmkv");
            multiProcessMMKV2.remove(c);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioAttributes build = new AudioAttributes.Builder().setUsage(6).setContentType(2).build();
            C35689d dVar = (C35689d) C86312j.m106911c(C35689d.class);
            String str7 = (i == null || (str3 = i.f190089l) == null) ? str4 : str3;
            String str8 = (fVar == null || (str2 = fVar.f190089l) == null) ? str4 : str2;
            if (fVar != null) {
                str4 = fVar.mo90177h();
            }
            dVar.mo60200Ev(str5, str7, str8, h, str4, build);
        }
    }

    /* renamed from: m */
    public static final void m72485m(String str, C66132f fVar, long j) {
        C87412m.m108594g(str, "username");
        if (fVar == null) {
            if (!C87412m.m108589b(str, C75592q0.m90789s())) {
                f175595j.remove(str);
            }
            f175586a.mo86692e().remove(str);
        } else if (!C87412m.m108589b(str, C75592q0.m90789s())) {
            MultiProcessMMKV e = f175586a.mo86692e();
            C104289g gVar = new C104289g();
            gVar.put("info", fVar.mo90183n());
            gVar.put("name", str);
            gVar.mo145954o("order", j);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "JSONObject().apply {\n   …der)\n        }.toString()");
            e.putString(str, gVar2);
        } else {
            f175586a.mo86692e().putString(C75592q0.m90789s(), fVar.mo90183n());
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m72486n(String str, C66132f fVar, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        }
        m72485m(str, fVar, j);
    }

    /* renamed from: o */
    public static final synchronized void m72487o() {
        synchronized (C61768p.class) {
            if (!f175596k) {
                try {
                    if (C86709a0.m107523b().mo121115m()) {
                        f175594i = "";
                        String mD5String = MD5Util.getMD5String(C86709a0.m107523b().mo121111i());
                        C87412m.m108593f(mD5String, "getMD5String(MMKernel.account().uinString)");
                        f175587b = C91602g0.m114947o0(mD5String, 16);
                        C61768p pVar = f175586a;
                        f175588c = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_ringtone_manager"));
                        f175590e = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_ringtone_params"));
                        f175589d = MultiProcessMMKV.getMMKV(pVar.mo86691c("mmkv_exclusive_manager"));
                        f175596k = true;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.RingtoneManager", th, "", new Object[0]);
                }
            } else {
                return;
            }
        }
        return;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107 A[Catch:{ Exception -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127 A[Catch:{ Exception -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86689a(java.lang.String r17, wj2.C66132f r18, boolean r19, wx3.C15601d<? super java.lang.Boolean> r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof nj2.C61768p.C61769a
            if (r3 == 0) goto L_0x001b
            r3 = r2
            nj2.p$a r3 = (nj2.C61768p.C61769a) r3
            int r4 = r3.f175604n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.f175604n = r4
            r4 = r16
            goto L_0x0022
        L_0x001b:
            nj2.p$a r3 = new nj2.p$a
            r4 = r16
            r3.<init>(r4, r2)
        L_0x0022:
            java.lang.Object r2 = r3.f175602i
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r3.f175604n
            r7 = 2
            r8 = 0
            java.lang.String r9 = "MicroMsg.RingtoneManager"
            r10 = 1
            if (r6 == 0) goto L_0x0056
            if (r6 == r10) goto L_0x0040
            if (r6 != r7) goto L_0x0038
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ Exception -> 0x0169 }
            goto L_0x0160
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            boolean r0 = r3.f175601h
            boolean r1 = r3.f175600g
            java.lang.Object r6 = r3.f175599f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r3.f175598e
            wj2.f r11 = (wj2.C66132f) r11
            java.lang.Object r12 = r3.f175597d
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ Exception -> 0x0169 }
            r13 = r1
            goto L_0x0103
        L_0x0056:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "cacheRingtone toUser:"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            java.lang.String r2 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x0169 }
            boolean r2 = gy3.C87412m.m108589b(r0, r2)     // Catch:{ Exception -> 0x0169 }
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = ""
            r6 = r2
            goto L_0x007c
        L_0x007b:
            r6 = r0
        L_0x007c:
            d03.a r2 = r1.f190078a     // Catch:{ Exception -> 0x0169 }
            if (r2 == 0) goto L_0x0182
            wj2.f r11 = m72481i(r6)     // Catch:{ Exception -> 0x0169 }
            if (r11 == 0) goto L_0x008e
            boolean r12 = r11.mo90170a()     // Catch:{ Exception -> 0x0169 }
            if (r12 != r10) goto L_0x008e
            r12 = 1
            goto L_0x008f
        L_0x008e:
            r12 = 0
        L_0x008f:
            if (r12 == 0) goto L_0x00ca
            java.lang.String r12 = r2.f165947s     // Catch:{ Exception -> 0x0169 }
            java.lang.String r13 = r11.mo90176g()     // Catch:{ Exception -> 0x0169 }
            boolean r12 = gy3.C87412m.m108589b(r12, r13)     // Catch:{ Exception -> 0x0169 }
            if (r12 == 0) goto L_0x00ca
            java.lang.String r11 = r11.mo90177h()     // Catch:{ Exception -> 0x0169 }
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)     // Catch:{ Exception -> 0x0169 }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00ac
            goto L_0x00ca
        L_0x00ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0169 }
            r0.<init>()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r1 = "cacheRingtone, mediaId is same:"
            r0.append(r1)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r1 = r2.f165947s     // Catch:{ Exception -> 0x0169 }
            r0.append(r1)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r1 = ", skip cache!"
            r0.append(r1)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0169 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)     // Catch:{ Exception -> 0x0169 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0169 }
            return r0
        L_0x00ca:
            boolean r11 = r1.f190077C     // Catch:{ Exception -> 0x0169 }
            jh2.m$a r12 = jh2.C60863m.f173403b     // Catch:{ Exception -> 0x0169 }
            jh2.m r12 = jh2.C60863m.f173404c     // Catch:{ Exception -> 0x0169 }
            r3.f175597d = r0     // Catch:{ Exception -> 0x0169 }
            r3.f175598e = r1     // Catch:{ Exception -> 0x0169 }
            r3.f175599f = r6     // Catch:{ Exception -> 0x0169 }
            r13 = r19
            r3.f175600g = r13     // Catch:{ Exception -> 0x0169 }
            r3.f175601h = r11     // Catch:{ Exception -> 0x0169 }
            r3.f175604n = r10     // Catch:{ Exception -> 0x0169 }
            r12.getClass()     // Catch:{ Exception -> 0x0169 }
            wx3.h r14 = new wx3.h     // Catch:{ Exception -> 0x0169 }
            wx3.d r15 = xx3.C66447b.m78392b(r3)     // Catch:{ Exception -> 0x0169 }
            r14.<init>(r15)     // Catch:{ Exception -> 0x0169 }
            gy3.f0 r15 = new gy3.f0     // Catch:{ Exception -> 0x0169 }
            r15.<init>()     // Catch:{ Exception -> 0x0169 }
            r15.f27484d = r14     // Catch:{ Exception -> 0x0169 }
            jh2.n r7 = new jh2.n     // Catch:{ Exception -> 0x0169 }
            r7.<init>(r15)     // Catch:{ Exception -> 0x0169 }
            r12.mo85770d(r2, r7)     // Catch:{ Exception -> 0x0169 }
            java.lang.Object r2 = r14.mo90314b()     // Catch:{ Exception -> 0x0169 }
            if (r2 != r5) goto L_0x0100
            return r5
        L_0x0100:
            r12 = r0
            r0 = r11
            r11 = r1
        L_0x0103:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0169 }
            if (r2 == 0) goto L_0x0127
            java.lang.String r0 = "Ringtone"
            java.lang.String r0 = nj2.C61767o.m72470f(r6, r0)     // Catch:{ Exception -> 0x0169 }
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r0)     // Catch:{ Exception -> 0x0169 }
            r11.getClass()     // Catch:{ Exception -> 0x0169 }
            d03.a r1 = r11.f190078a     // Catch:{ Exception -> 0x0169 }
            if (r1 != 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r1.f165948t = r0     // Catch:{ Exception -> 0x0169 }
        L_0x011a:
            if (r1 != 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1.f165933e = r10     // Catch:{ Exception -> 0x0169 }
        L_0x011f:
            if (r13 == 0) goto L_0x0124
            m72484l(r6, r11)     // Catch:{ Exception -> 0x0169 }
        L_0x0124:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0169 }
            return r0
        L_0x0127:
            nj2.p r1 = f175586a     // Catch:{ Exception -> 0x0169 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0169 }
            r2.<init>()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r6 = "cacheRingtone fail, tryFinderAudio:"
            r2.append(r6)     // Catch:{ Exception -> 0x0169 }
            if (r0 == 0) goto L_0x0137
            r6 = 1
            goto L_0x0138
        L_0x0137:
            r6 = 0
        L_0x0138:
            r2.append(r6)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0169 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r2)     // Catch:{ Exception -> 0x0169 }
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = "cacheRingtone, try switch to video!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)     // Catch:{ Exception -> 0x0169 }
            r11.mo90182m(r8)     // Catch:{ Exception -> 0x0169 }
            if (r13 == 0) goto L_0x014f
            r8 = 1
        L_0x014f:
            r0 = 0
            r3.f175597d = r0     // Catch:{ Exception -> 0x0169 }
            r3.f175598e = r0     // Catch:{ Exception -> 0x0169 }
            r3.f175599f = r0     // Catch:{ Exception -> 0x0169 }
            r0 = 2
            r3.f175604n = r0     // Catch:{ Exception -> 0x0169 }
            java.lang.Object r2 = r1.mo86689a(r12, r11, r8, r3)     // Catch:{ Exception -> 0x0169 }
            if (r2 != r5) goto L_0x0160
            return r5
        L_0x0160:
            return r2
        L_0x0161:
            java.lang.String r0 = "cacheRingtone, download ringtone fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ Exception -> 0x0169 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0169 }
            return r0
        L_0x0169:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cacheRingtone fail:"
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x0182:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.C61768p.mo86689a(java.lang.String, wj2.f, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean mo86690b(C66132f fVar) {
        C87412m.m108594g(fVar, "ringtone");
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object systemService = MMApplicationContext.getContext().getSystemService("notification");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(fVar.f190089l);
                if (notificationChannel == null) {
                    return false;
                }
                Uri sound = notificationChannel.getSound();
                String path = sound.getPath();
                if (!C87412m.m108589b(path != null ? C91602g0.m114948p0(path, 36) : null, C91602g0.m114948p0(fVar.mo90177h(), 36))) {
                    String path2 = sound.getPath();
                    if (!(path2 != null && C112551y.m153808h(path2, "phonering.mp3", false, 2, (Object) null))) {
                        Log.m105924i("MicroMsg.RingtoneManager", "find user modify channel! sound path:" + sound.getPath() + ", ringtone path:" + fVar.mo90177h());
                        return true;
                    }
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.RingtoneManager", "checkIfChannelModifiedByUser error:" + e.getLocalizedMessage());
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String mo86691c(String str) {
        return f175587b + '#' + str;
    }

    /* renamed from: e */
    public final MultiProcessMMKV mo86692e() {
        m72487o();
        MultiProcessMMKV multiProcessMMKV = f175589d;
        C87412m.m108593f(multiProcessMMKV, "exclusiveMMKv");
        return multiProcessMMKV;
    }
}

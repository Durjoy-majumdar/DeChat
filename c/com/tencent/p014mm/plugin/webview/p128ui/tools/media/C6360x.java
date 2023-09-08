package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import gy3.C8480h;
import gy3.C87412m;
import pe3.C47465a;
import rx3.C13598b0;
import te3.a35;
import te3.z25;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.x */
public final class C6360x {

    /* renamed from: j */
    public static final C6361a f23275j = new C6361a((C8480h) null);

    /* renamed from: k */
    public static C6360x f23276k;

    /* renamed from: a */
    public Context f23277a;

    /* renamed from: b */
    public z25 f23278b;

    /* renamed from: c */
    public String f23279c = "";

    /* renamed from: d */
    public final MMKVSlotManager f23280d;

    /* renamed from: e */
    public final IListener<MusicPlayerEvent> f23281e;

    /* renamed from: f */
    public MTimerHandler f23282f;

    /* renamed from: g */
    public int f23283g;

    /* renamed from: h */
    public String f23284h;

    /* renamed from: i */
    public String f23285i;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.x$a */
    public static final class C6361a {
        public C6361a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C6360x mo7360a() {
            if (C6360x.f23276k == null) {
                synchronized (C6360x.class) {
                    if (C6360x.f23276k == null) {
                        Context context = MMApplicationContext.getContext();
                        C87412m.m108593f(context, "getContext()");
                        C6360x xVar = new C6360x(context, (C8480h) null);
                        C6360x.f23276k = xVar;
                        IListener<MusicPlayerEvent> iListener = xVar.f23281e;
                        if (iListener != null) {
                            iListener.alive();
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            return C6360x.f23276k;
        }
    }

    public C6360x(Context context, C8480h hVar) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__web_music_slot_mmkv_key__");
        C87412m.m108593f(mmkv, "getMMKV(\"__web_music_slot_mmkv_key__\")");
        this.f23280d = new MMKVSlotManager(mmkv, 15552000);
        this.f23281e = new WebViewMusicAlbumHelper$musicPlayerListener$1(this, C40008f.f107254d);
        this.f23282f = new MTimerHandler("MicroMsg.MusicAlbumHelper", (MTimerHandler.CallBack) new C6362y(this), true);
        this.f23283g = 1;
        this.f23284h = "";
        this.f23285i = "";
        this.f23277a = context;
    }

    /* renamed from: a */
    public final String mo7351a(String str, String str2) {
        C87412m.m108594g(str, "<this>");
        return "album_" + str2 + '_' + str + '}';
    }

    /* renamed from: b */
    public final void mo7352b(a35 a35, int i) {
        if (a35 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[20];
            objArr[0] = a35.f130285i;
            boolean z = true;
            objArr[1] = Long.valueOf(a35.f130286j);
            objArr[2] = Integer.valueOf(a35.f130287n);
            objArr[3] = a35.f130283g;
            objArr[4] = a35.f130282f;
            objArr[5] = Integer.valueOf(a35.f130284h);
            objArr[6] = Long.valueOf(a35.f130292s);
            objArr[7] = a35.f130288o;
            objArr[8] = Integer.valueOf(a35.f130293t);
            objArr[9] = Integer.valueOf(a35.f130294u);
            objArr[10] = this.f23284h;
            objArr[11] = Integer.valueOf(a35.f130280d);
            objArr[12] = Integer.valueOf(a35.f130281e);
            objArr[13] = Long.valueOf(currentTimeMillis);
            objArr[14] = Integer.valueOf(i);
            objArr[15] = Integer.valueOf(this.f23283g);
            String str = a35.f130289p;
            QueueWorkerThread queueWorkerThread = C44625c2.f121005a;
            objArr[16] = WebViewUtilities.doUrlEncode(str);
            objArr[17] = Integer.valueOf(a35.f130295v);
            String str2 = a35.f130290q;
            String str3 = "";
            objArr[18] = str2 == null || C112551y.m153811k(str2) ? str3 : C112551y.m153814n(str2, ",", str3, false);
            String str4 = a35.f130291r;
            if (str4 != null && !C112551y.m153811k(str4)) {
                z = false;
            }
            if (!z) {
                str3 = C112551y.m153814n(str4, ",", str3, false);
            }
            objArr[19] = str3;
            nVar.mo160131h(19839, objArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[Catch:{ Exception -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x005a A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo7353c(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ all -> 0x00ca }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r10)
            return r1
        L_0x000a:
            r10.mo7357g()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r10.f23279c     // Catch:{ all -> 0x00ca }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r0)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x001f
            te3.z25 r0 = r10.f23278b     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x001f
            gy3.C87412m.m108591d(r0)     // Catch:{ all -> 0x00ca }
            java.util.LinkedList<java.lang.String> r0 = r0.f145663e     // Catch:{ all -> 0x00ca }
            goto L_0x002d
        L_0x001f:
            te3.z25 r0 = r10.mo7354d(r11, r12)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x002c
            r10.f23278b = r0     // Catch:{ all -> 0x00ca }
            r10.f23279c = r11     // Catch:{ all -> 0x00ca }
            java.util.LinkedList<java.lang.String> r0 = r0.f145663e     // Catch:{ all -> 0x00ca }
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0035
            monitor-exit(r10)
            return r1
        L_0x0035:
            r2 = 1
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b8 }
            r4.<init>()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = "albumId"
            r4.put(r5, r11)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = "audioId"
            te3.z25 r6 = r10.f23278b     // Catch:{ Exception -> 0x00b8 }
            if (r6 == 0) goto L_0x004a
            java.lang.String r6 = r6.f145662d     // Catch:{ Exception -> 0x00b8 }
            goto L_0x004b
        L_0x004a:
            r6 = r1
        L_0x004b:
            if (r6 != 0) goto L_0x0051
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00b8 }
        L_0x0051:
            r4.put(r5, r6)     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00b2
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b8 }
        L_0x005a:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x00b8 }
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00b8 }
            if (r5 == 0) goto L_0x0071
            boolean r6 = z04.C112551y.m153811k(r5)     // Catch:{ Exception -> 0x00b8 }
            if (r6 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r6 = 0
            goto L_0x0072
        L_0x0071:
            r6 = 1
        L_0x0072:
            if (r6 != 0) goto L_0x005a
            gy3.C87412m.m108591d(r11)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r6 = r10.mo7356f(r5, r11, r12)     // Catch:{ Exception -> 0x00b8 }
            te3.a35 r6 = r10.mo7355e(r6)     // Catch:{ Exception -> 0x00b8 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b8 }
            r7.<init>()     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = "currentTime"
            if (r6 == 0) goto L_0x008b
            int r9 = r6.f130281e     // Catch:{ Exception -> 0x00b8 }
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            int r9 = r9 / 1000
            r7.put(r8, r9)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = "duration"
            if (r6 == 0) goto L_0x0098
            int r9 = r6.f130280d     // Catch:{ Exception -> 0x00b8 }
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            int r9 = r9 / 1000
            r7.put(r8, r9)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r8 = "playbackRate"
            if (r6 == 0) goto L_0x00a5
            float r6 = r6.f130297x     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00a7
        L_0x00a5:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00a7:
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x00b8 }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x00b8 }
            r4.put(r5, r7)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x005a
        L_0x00b2:
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x00b8 }
            monitor-exit(r10)
            return r11
        L_0x00b8:
            r11 = move-exception
            java.lang.String r12 = "MicroMsg.MusicAlbumHelper"
            java.lang.String r0 = "getAudioListState ex:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00ca }
            r2[r3] = r11     // Catch:{ all -> 0x00ca }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r2)     // Catch:{ all -> 0x00ca }
            monitor-exit(r10)
            return r1
        L_0x00ca:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.media.C6360x.mo7353c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public final z25 mo7354d(String str, String str2) {
        byte[] decodeBytes;
        C47465a aVar = null;
        if (str == null || C112551y.m153811k(str)) {
            return null;
        }
        if (str2 == null || C112551y.m153811k(str2)) {
            return null;
        }
        MMKVSlotManager mMKVSlotManager = this.f23280d;
        String a = mo7351a(str, str2);
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) mMKVSlotManager.findSlot(a);
        if (!(multiProcessMMKV == null || !multiProcessMMKV.containsKey(a) || (decodeBytes = multiProcessMMKV.decodeBytes(a)) == null)) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C47465a newInstance = z25.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return (z25) aVar;
    }

    /* renamed from: e */
    public final a35 mo7355e(String str) {
        byte[] decodeBytes;
        C47465a aVar = null;
        if (str == null || C112551y.m153811k(str)) {
            return null;
        }
        MMKVSlotManager mMKVSlotManager = this.f23280d;
        C87412m.m108594g(str, "<this>");
        String str2 = "audioInfo_" + str + '}';
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) mMKVSlotManager.findSlot(str2);
        if (!(multiProcessMMKV == null || !multiProcessMMKV.containsKey(str2) || (decodeBytes = multiProcessMMKV.decodeBytes(str2)) == null)) {
            if (true ^ (decodeBytes.length == 0)) {
                try {
                    C47465a newInstance = a35.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return (a35) aVar;
    }

    /* renamed from: f */
    public final String mo7356f(String str, String str2, String str3) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "albumId");
        return str3 + '_' + str2 + '_' + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7357g() {
        /*
            r6 = this;
            monitor-enter(r6)
            qc0.m r0 = qc0.C101093a.m132480b()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = r0.f295960e     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r6)
            return
        L_0x000d:
            qc0.j r1 = qc0.C101093a.m132479a()     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0082
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r2 = r6.f23280d     // Catch:{ all -> 0x0084 }
            java.lang.Object r2 = r2.getSlotForWrite()     // Catch:{ all -> 0x0084 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r0.f295960e     // Catch:{ all -> 0x0084 }
            te3.a35 r3 = r6.mo7355e(r3)     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x0082
            int r4 = r3.f130281e     // Catch:{ all -> 0x0084 }
            r5 = -1
            if (r4 <= r5) goto L_0x0082
            int r4 = r1.f35261b     // Catch:{ all -> 0x0084 }
            if (r4 <= 0) goto L_0x002e
            r3.f130281e = r4     // Catch:{ all -> 0x0084 }
        L_0x002e:
            r4 = 0
            int r1 = r1.f35260a     // Catch:{ all -> 0x0084 }
            int r1 = java.lang.Math.max(r4, r1)     // Catch:{ all -> 0x0084 }
            r3.f130280d = r1     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r0.f295960e     // Catch:{ all -> 0x0084 }
            r6.mo7359i(r1, r3)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = r0.f295960e     // Catch:{ all -> 0x0084 }
            te3.a35 r1 = r6.mo7355e(r1)     // Catch:{ all -> 0x0084 }
            r3 = 0
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r1.f130283g     // Catch:{ all -> 0x0084 }
            goto L_0x0049
        L_0x0048:
            r1 = r3
        L_0x0049:
            java.lang.String r4 = r0.f295960e     // Catch:{ all -> 0x0084 }
            te3.a35 r4 = r6.mo7355e(r4)     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r4.f130282f     // Catch:{ all -> 0x0084 }
            goto L_0x0055
        L_0x0054:
            r4 = r3
        L_0x0055:
            java.lang.String r0 = r0.f295960e     // Catch:{ all -> 0x0084 }
            te3.a35 r0 = r6.mo7355e(r0)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r3 = r0.f130296w     // Catch:{ all -> 0x0084 }
        L_0x005f:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0082
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "currentAlbumId"
            r2.encode((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0084 }
            te3.z25 r0 = r6.mo7354d(r1, r3)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0082
            te3.z25 r2 = r6.f23278b     // Catch:{ all -> 0x0084 }
            if (r2 != 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r2.f145662d = r4     // Catch:{ all -> 0x0084 }
        L_0x007d:
            r0.f145662d = r4     // Catch:{ all -> 0x0084 }
            r6.mo7358h(r1, r3, r0)     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r6)
            return
        L_0x0084:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.media.C6360x.mo7357g():void");
    }

    /* renamed from: h */
    public final void mo7358h(String str, String str2, z25 z25) {
        boolean z = false;
        if (!(str == null || C112551y.m153811k(str))) {
            if (str2 == null || C112551y.m153811k(str2)) {
                z = true;
            }
            if (!z) {
                try {
                    ((MultiProcessMMKV) this.f23280d.getSlotForWrite()).encode(mo7351a(str, str2), z25.toByteArray());
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.MusicAlbumHelper", "saveWebViewAlbumInfoInfo ex " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo7359i(String str, a35 a35) {
        if (!(str == null || C112551y.m153811k(str))) {
            try {
                C87412m.m108594g(str, "<this>");
                ((MultiProcessMMKV) this.f23280d.getSlotForWrite()).encode("audioInfo_" + str + '}', a35.toByteArray());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MusicAlbumHelper", "saveWebViewAudioInfo ex " + e.getMessage());
            }
        }
    }
}

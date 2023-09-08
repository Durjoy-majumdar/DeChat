package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import a70.C112760b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.p014mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12154i;
import qc0.C89588n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState */
public class JsApiSetBackgroundAudioState extends C82268c {
    public static final int CTRL_INDEX = 160;
    public static final String NAME = "setBackgroundAudioState";

    /* renamed from: g */
    public SetBackgroundAudioListenerTask f240623g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$a */
    public class C82056a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C86493v0.C86495c f240646d;

        /* renamed from: e */
        public final /* synthetic */ C82381f f240647e;

        /* renamed from: f */
        public final /* synthetic */ int f240648f;

        public C82056a(C86493v0.C86495c cVar, C82381f fVar, int i) {
            this.f240646d = cVar;
            this.f240647e = fVar;
            this.f240648f = i;
        }

        /* renamed from: c */
        public void mo109497c() {
            String f = this.f240646d.mo120959f("appId", "");
            Log.m105925i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", f);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operationType", "stop");
            } catch (JSONException unused) {
            }
            SetBackgroundAudioStateTask setBackgroundAudioStateTask = new SetBackgroundAudioStateTask(JsApiSetBackgroundAudioState.this, this.f240647e, this.f240648f);
            setBackgroundAudioStateTask.f240641n = jSONObject.toString();
            setBackgroundAudioStateTask.f240639i = f;
            setBackgroundAudioStateTask.mo114396f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r17, org.json.JSONObject r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            if (r2 != 0) goto L_0x001c
            java.lang.String r2 = "fail:data is null"
            java.lang.String r2 = r1.mo115109j(r2)
            r0.mo109647a(r3, r2)
            java.lang.String r0 = "MicroMsg.Music.JsApiSetBackgroundAudioState"
            java.lang.String r2 = "setBackgroundAudioState data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return
        L_0x001c:
            java.lang.String r4 = r17.getAppId()
            java.lang.String r5 = "MicroMsg.Music.JsApiSetBackgroundAudioState"
            java.lang.String r6 = "setBackgroundAudioState appId:%s ,data:%s"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r4
            java.lang.String r10 = r18.toString()
            r11 = 1
            r8[r11] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r5 = r1.f240623g
            if (r5 != 0) goto L_0x0040
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC r5 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC
            r5.<init>(r1, r0, r3)
            r1.f240623g = r5
        L_0x0040:
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r5 = r1.f240623g
            r5.f240626h = r3
            r5.f240630o = r4
            r5.f240633r = r11
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AppBrandService#"
            r5.append(r6)
            int r6 = r17.hashCode()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = eb0.C86493v0.m107223a(r5)
            r6 = r1
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC r6 = (com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC) r6
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r8 = r6.f240623g
            r10 = 0
            if (r8 == 0) goto L_0x0101
            boolean r12 = r0 instanceof com.tencent.p014mm.plugin.appbrand.C81879g
            if (r12 == 0) goto L_0x007e
            r12 = r0
            com.tencent.mm.plugin.appbrand.g r12 = (com.tencent.p014mm.plugin.appbrand.C81879g) r12
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r12 = r12.getRuntime()
            li0.c r12 = r12.f238113K
            com.tencent.mm.plugin.appbrand.jsapi.audio.u r13 = new com.tencent.mm.plugin.appbrand.jsapi.audio.u
            r13.<init>(r6, r8, r5)
            r12.mo122978a(r13)
        L_0x007e:
            java.lang.Class<wi0.l> r8 = wi0.C90988l.class
            com.tencent.mm.plugin.appbrand.jsapi.m r8 = r0.mo109671p(r8)
            wi0.l r8 = (wi0.C90988l) r8
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r12 = r6.f240623g
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r13 = r8.f261072r
            int r13 = r13.f238585d
            r12.f240627i = r13
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r12 = r6.f240623g
            java.lang.String r13 = r8.f261061d
            r12.f240628j = r13
            java.lang.String r13 = com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible.m99325a(r17)
            r12.f240629n = r13
            java.lang.String r12 = "MicroMsg.Music.JsApiSetBackgroundAudioState"
            java.lang.String r13 = "pkgType:%d, brandName:%s, appUserName"
            r14 = 3
            java.lang.Object[] r14 = new java.lang.Object[r14]
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r15 = r6.f240623g
            int r15 = r15.f240627i
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r9] = r15
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r15 = r6.f240623g
            java.lang.String r9 = r15.f240628j
            r14[r11] = r9
            java.lang.String r9 = r15.f240629n
            r14[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r14)
            eb0.v0 r9 = eb0.C86493v0.m107224d()
            eb0.v0$c r9 = r9.mo120947c(r5, r11)
            monitor-enter(r9)
            java.lang.String r12 = "StickyBannerChangeListener"
            java.lang.Object r12 = r9.mo120956c(r12, r10)     // Catch:{ all -> 0x00fe }
            com.tencent.mm.plugin.appbrand.ui.banner.l r12 = (com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84498l) r12     // Catch:{ all -> 0x00fe }
            if (r12 != 0) goto L_0x00ed
            com.tencent.mm.plugin.appbrand.jsapi.audio.v r12 = new com.tencent.mm.plugin.appbrand.jsapi.audio.v     // Catch:{ all -> 0x00fe }
            r12.<init>(r6, r9)     // Catch:{ all -> 0x00fe }
            java.lang.String r13 = "pkgType"
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r8.f261072r     // Catch:{ all -> 0x00fe }
            int r8 = r8.f238585d     // Catch:{ all -> 0x00fe }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00fe }
            r9.mo120962i(r13, r8)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = "StickyBannerChangeListener"
            r9.mo120962i(r8, r12)     // Catch:{ all -> 0x00fe }
            java.lang.String r8 = "appId"
            java.lang.String r13 = r17.getAppId()     // Catch:{ all -> 0x00fe }
            r9.mo120962i(r8, r13)     // Catch:{ all -> 0x00fe }
        L_0x00ed:
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r6 = r6.f240623g     // Catch:{ all -> 0x00fe }
            boolean r8 = r6 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC     // Catch:{ all -> 0x00fe }
            if (r8 == 0) goto L_0x00fc
            r8 = r6
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC r8 = (com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC) r8     // Catch:{ all -> 0x00fe }
            r8.f240651u = r12     // Catch:{ all -> 0x00fe }
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC r6 = (com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC.SetBackgroundAudioListenerTaskWC) r6     // Catch:{ all -> 0x00fe }
            r6.f240650t = r9     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            monitor-exit(r9)     // Catch:{ all -> 0x00fe }
            goto L_0x0101
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00fe }
            throw r0
        L_0x0101:
            eb0.v0 r6 = eb0.C86493v0.m107224d()
            eb0.v0$c r5 = r6.mo120947c(r5, r11)
            monitor-enter(r5)
            java.lang.String r6 = "AppBrandLifeCycle.Listener"
            java.lang.Object r6 = r5.mo120956c(r6, r10)     // Catch:{ all -> 0x01e7 }
            com.tencent.mm.plugin.appbrand.l$d r6 = (com.tencent.p014mm.plugin.appbrand.C83231l.C83234d) r6     // Catch:{ all -> 0x01e7 }
            if (r6 != 0) goto L_0x0127
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$a r6 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$a     // Catch:{ all -> 0x01e7 }
            r6.<init>(r5, r0, r3)     // Catch:{ all -> 0x01e7 }
            java.lang.String r8 = "AppBrandLifeCycle.Listener"
            r5.mo120962i(r8, r6)     // Catch:{ all -> 0x01e7 }
            java.lang.String r8 = "appId"
            r5.mo120962i(r8, r4)     // Catch:{ all -> 0x01e7 }
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r8 = r1.f240623g     // Catch:{ all -> 0x01e7 }
            r8.f240624f = r6     // Catch:{ all -> 0x01e7 }
        L_0x0127:
            monitor-exit(r5)     // Catch:{ all -> 0x01e7 }
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask r5 = r1.f240623g
            r5.mo114395c()
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioStateTaskWC r5 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioStateTaskWC
            r5.<init>(r1, r0, r3)
            r5.f240638h = r3
            r5.f240639i = r4
            java.lang.String r3 = r18.toString()
            r5.f240641n = r3
            java.lang.String r3 = "src"
            java.lang.String r3 = r2.optString(r3)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x018b
            int r6 = r3.length()
            if (r6 > 0) goto L_0x014e
            goto L_0x018b
        L_0x014e:
            java.lang.String r6 = "http://"
            boolean r6 = r3.startsWith(r6)
            if (r6 != 0) goto L_0x018c
            java.lang.String r6 = "https://"
            boolean r6 = r3.startsWith(r6)
            if (r6 == 0) goto L_0x015f
            goto L_0x018c
        L_0x015f:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r6 = r17.getFileSystem()
            com.tencent.mm.vfs.m1 r3 = r6.getAbsoluteFile(r3)
            if (r3 == 0) goto L_0x018b
            boolean r6 = r3.mo119967g()
            if (r6 == 0) goto L_0x018b
            java.lang.String r3 = r3.mo119971i()
            java.lang.String r4 = "file://"
            boolean r6 = r3.startsWith(r4)
            if (r6 != 0) goto L_0x018c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            goto L_0x018c
        L_0x018b:
            r3 = r4
        L_0x018c:
            r5.f240640j = r3
            java.lang.Class<km0.a> r3 = km0.C88224a.class
            ra.b r3 = p224ra.C89909e.m112436a(r3)
            km0.a r3 = (km0.C88224a) r3
            java.lang.String r4 = "MicroMsg.Music.JsApiSetBackgroundAudioState"
            java.lang.String r6 = "invalidReferrer"
            if (r3 != 0) goto L_0x01a7
            java.lang.String r0 = "getReferrers, referrerHelper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r10, r6)
            goto L_0x01d7
        L_0x01a7:
            java.lang.String r2 = r3.mo117490BT(r2)
            if (r2 == 0) goto L_0x01c5
            km0.c r8 = r3.mo117494kn(r2)
            if (r8 != 0) goto L_0x01b7
            km0.c r8 = r3.mo117492eV(r0)
        L_0x01b7:
            km0.c r9 = km0.C88226c.NO_REFERRER
            if (r9 != r8) goto L_0x01bc
            goto L_0x01c6
        L_0x01bc:
            km0.c r9 = km0.C88226c.ORIGIN
            if (r9 != r8) goto L_0x01c5
            java.lang.String r10 = r3.mo117489A4(r0)
            goto L_0x01c6
        L_0x01c5:
            r10 = r6
        L_0x01c6:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r3 = 0
            r0[r3] = r2
            r0[r11] = r10
            java.lang.String r3 = "getReferrers, referrerPolicyStr: %s, referrer: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r10)
        L_0x01d7:
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            r5.f240644q = r2
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r5.f240645r = r0
            r5.mo114395c()
            return
        L_0x01e7:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01e7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask */
    public static class SetBackgroundAudioListenerTask extends MainProcessTask {
        public static final Parcelable.Creator<SetBackgroundAudioListenerTask> CREATOR = new C82054a();

        /* renamed from: f */
        public C83231l.C83234d f240624f;

        /* renamed from: g */
        public C82381f f240625g;

        /* renamed from: h */
        public int f240626h;

        /* renamed from: i */
        public int f240627i;

        /* renamed from: j */
        public String f240628j;

        /* renamed from: n */
        public String f240629n;

        /* renamed from: o */
        public String f240630o;

        /* renamed from: p */
        public String f240631p;

        /* renamed from: q */
        public int f240632q;

        /* renamed from: r */
        public boolean f240633r = false;

        /* renamed from: s */
        public final IListener f240634s = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                Log.m105925i("MicroMsg.Music.SetBackgroundAudioListenerTask", "musicPlayerListener callback action : %d", Integer.valueOf(musicPlayerEvent.f9336d.f9337a));
                HashMap hashMap = new HashMap();
                MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
                String str = aVar.f9341e;
                int i = aVar.f9337a;
                if (i == 10) {
                    String str2 = aVar.f9344h;
                    if (str2.equals(SetBackgroundAudioListenerTask.this.f240630o)) {
                        Log.m105924i("MicroMsg.Music.SetBackgroundAudioListenerTask", "appId is same, don't send ON_PREEMPTED event");
                    } else {
                        Log.m105925i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send ON_PREEMPTED event, sender appId:%s,  receive appId:%s", str2, SetBackgroundAudioListenerTask.this.f240630o);
                        hashMap.put("state", str);
                        SetBackgroundAudioListenerTask.this.f240631p = new JSONObject(hashMap).toString();
                        SetBackgroundAudioListenerTask setBackgroundAudioListenerTask = SetBackgroundAudioListenerTask.this;
                        setBackgroundAudioListenerTask.f240632q = musicPlayerEvent.f9336d.f9337a;
                        setBackgroundAudioListenerTask.mo114394b();
                        return true;
                    }
                } else {
                    C101106m mVar = aVar.f9338b;
                    if (mVar == null) {
                        Log.m105920e("MicroMsg.Music.SetBackgroundAudioListenerTask", "wrapper is null");
                    } else if (!aVar.f9342f) {
                        Log.m105920e("MicroMsg.Music.SetBackgroundAudioListenerTask", "is not from QQMusicPlayer, don't callback!");
                    } else {
                        if (i == 2 && aVar.f9343g) {
                            Log.m105920e("MicroMsg.Music.SetBackgroundAudioListenerTask", "isSwitchMusicIng, don't callback!");
                        } else {
                            String str3 = C83613a.C83615b.f244198a.f244191a;
                            if (!SetBackgroundAudioListenerTask.this.f240630o.equals(str3)) {
                                Log.m105925i("MicroMsg.Music.SetBackgroundAudioListenerTask", "appId is not equals preAppId, don't send any event, appId:%s, preAppId:%s", SetBackgroundAudioListenerTask.this.f240630o, str3);
                            } else {
                                hashMap.put("src", mVar.f295966n);
                                hashMap.put("state", str);
                                hashMap.put("errCode", Integer.valueOf(musicPlayerEvent.f9336d.f9345i));
                                hashMap.put("errMsg", !TextUtils.isEmpty(musicPlayerEvent.f9336d.f9346j) ? musicPlayerEvent.f9336d.f9346j : "");
                                SetBackgroundAudioListenerTask.this.f240631p = new JSONObject(hashMap).toString();
                                SetBackgroundAudioListenerTask setBackgroundAudioListenerTask2 = SetBackgroundAudioListenerTask.this;
                                setBackgroundAudioListenerTask2.f240632q = musicPlayerEvent.f9336d.f9337a;
                                setBackgroundAudioListenerTask2.mo114394b();
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        };

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask$a */
        public class C82054a implements Parcelable.Creator<SetBackgroundAudioListenerTask> {
            public Object createFromParcel(Parcel parcel) {
                return new SetBackgroundAudioListenerTask(parcel);
            }

            public Object[] newArray(int i) {
                return new SetBackgroundAudioListenerTask[i];
            }
        }

        public SetBackgroundAudioListenerTask(C82268c cVar, C82381f fVar, int i) {
            this.f240625g = fVar;
            this.f240626h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240630o = parcel.readString();
            this.f240631p = parcel.readString();
            this.f240632q = parcel.readInt();
            this.f240627i = parcel.readInt();
            this.f240628j = parcel.readString();
            this.f240629n = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f240633r = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f240625g == null) {
                Log.m105920e("MicroMsg.Music.SetBackgroundAudioListenerTask", "service is null, don't callback");
                return;
            }
            mo114506q(this.f240632q);
            int i = this.f240632q;
            if (i == 0 || i == 1) {
                C83231l.m102140a(this.f240630o, this.f240624f);
                AppBrandMusicClientService.f244185c.f244187b = this.f240630o;
            } else if (i == 2 || i == 3 || i == 4 || i == 7) {
                C83231l.m102144e(this.f240630o, this.f240624f);
            } else if (i == 13) {
                C82381f fVar = this.f240625g;
                JsApiOperateBackgroundAudio.C82032b bVar = JsApiOperateBackgroundAudio.C82032b.f240536i;
                synchronized (JsApiOperateBackgroundAudio.C82032b.class) {
                    Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioPrev");
                    JsApiOperateBackgroundAudio.C82032b bVar2 = JsApiOperateBackgroundAudio.C82032b.f240536i;
                    bVar2.mo115161k(fVar);
                    bVar2.mo115158h();
                }
                return;
            } else if (i == 14) {
                C82381f fVar2 = this.f240625g;
                JsApiOperateBackgroundAudio.C82031a aVar = JsApiOperateBackgroundAudio.C82031a.f240535i;
                synchronized (JsApiOperateBackgroundAudio.C82031a.class) {
                    Log.m105924i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onBackgroundAudioNext");
                    JsApiOperateBackgroundAudio.C82031a aVar2 = JsApiOperateBackgroundAudio.C82031a.f240535i;
                    aVar2.mo115161k(fVar2);
                    aVar2.mo115158h();
                }
                return;
            }
            Log.m105925i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInClientProcess callback action:%d, retJson:%s", Integer.valueOf(this.f240632q), this.f240631p);
            JsApiOperateBackgroundAudio.C82033c cVar = new JsApiOperateBackgroundAudio.C82033c();
            cVar.mo115161k(this.f240625g);
            cVar.mo115163m(this.f240631p);
            cVar.mo115158h();
            AppBrandMusicClientService appBrandMusicClientService = AppBrandMusicClientService.f244185c;
            int i2 = this.f240632q;
            appBrandMusicClientService.getClass();
            Log.m105925i("MicroMsg.AppBrandMusicClientService", "notifyAction, action:%d", Integer.valueOf(i2));
            for (Map.Entry next : appBrandMusicClientService.f244186a.entrySet()) {
                if (next != null) {
                    String str = (String) next.getKey();
                    AppBrandMusicClientService.C83612a aVar3 = (AppBrandMusicClientService.C83612a) next.getValue();
                    if (!TextUtils.isEmpty(appBrandMusicClientService.f244187b) && appBrandMusicClientService.f244187b.equalsIgnoreCase(str)) {
                        Log.m105925i("MicroMsg.AppBrandMusicClientService", "current play music appId is %s", appBrandMusicClientService.f244187b);
                        if (aVar3 != null) {
                            if (i2 == 10) {
                                aVar3.mo115925b();
                            } else if (i2 == 2) {
                                aVar3.onStop();
                            } else if (i2 == 7) {
                                aVar3.mo115924a();
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInMainProcess");
            if (this.f240633r) {
                Log.m105924i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send Preempted Event");
                this.f240633r = false;
                MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
                MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
                aVar.f9337a = 10;
                aVar.f9341e = "preempted";
                aVar.f9344h = this.f240630o;
                aVar.f9342f = true;
                musicPlayerEvent.publish();
            }
            String str = C83613a.C83615b.f244198a.f244191a;
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.Music.SetBackgroundAudioListenerTask", "remove listener preAppid is %s, appid is %s", str, this.f240630o);
                C83613a.C83615b.f244198a.mo115930d(str);
            }
            C83613a.C83615b.f244198a.mo115927a(this.f240634s, this.f240630o);
            C83613a aVar2 = C83613a.C83615b.f244198a;
            String str2 = this.f240630o;
            int i = this.f240627i;
            String str3 = this.f240628j;
            String str4 = this.f240629n;
            aVar2.f244191a = str2;
            aVar2.f244194d = i;
            aVar2.f244195e = str3;
            aVar2.f244196f = str4;
        }

        /* renamed from: q */
        public void mo114506q(int i) {
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240630o);
            parcel.writeString(this.f240631p);
            parcel.writeInt(this.f240632q);
            parcel.writeInt(this.f240627i);
            parcel.writeString(this.f240628j);
            parcel.writeString(this.f240629n);
            parcel.writeInt(this.f240633r ? 1 : 0);
        }

        public SetBackgroundAudioListenerTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask */
    public static class SetBackgroundAudioStateTask extends MainProcessTask {
        public static final Parcelable.Creator<SetBackgroundAudioStateTask> CREATOR = new C82055a();

        /* renamed from: f */
        public C82870p f240636f;

        /* renamed from: g */
        public C82381f f240637g;

        /* renamed from: h */
        public int f240638h;

        /* renamed from: i */
        public String f240639i;

        /* renamed from: j */
        public String f240640j;

        /* renamed from: n */
        public String f240641n;

        /* renamed from: o */
        public boolean f240642o = false;

        /* renamed from: p */
        public String f240643p = "";

        /* renamed from: q */
        public String f240644q = null;

        /* renamed from: r */
        public String f240645r = null;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask$a */
        public class C82055a implements Parcelable.Creator<SetBackgroundAudioStateTask> {
            public Object createFromParcel(Parcel parcel) {
                return new SetBackgroundAudioStateTask(parcel);
            }

            public Object[] newArray(int i) {
                return new SetBackgroundAudioStateTask[i];
            }
        }

        public SetBackgroundAudioStateTask(C82268c cVar, C82381f fVar, int i) {
            this.f240636f = cVar;
            this.f240637g = fVar;
            this.f240638h = i;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240639i = parcel.readString();
            this.f240641n = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f240642o = z;
            this.f240643p = parcel.readString();
            this.f240640j = parcel.readString();
            this.f240644q = parcel.readString();
            this.f240645r = parcel.readString();
        }

        /* renamed from: i */
        public void mo1552i() {
            if (this.f240637g == null) {
                Log.m105920e("MicroMsg.Music.JsApiSetBackgroundAudioState", "service is null, don't callback");
                return;
            }
            if (!this.f240642o) {
                Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
                this.f240637g.mo109647a(this.f240638h, this.f240636f.mo115109j("ok"));
            } else {
                Log.m105921e("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState fail:%s", this.f240643p);
                C82381f fVar = this.f240637g;
                int i = this.f240638h;
                C82870p pVar = this.f240636f;
                fVar.mo109647a(i, pVar.mo115109j("fail:" + this.f240643p));
            }
            mo114397h();
        }

        /* renamed from: j */
        public void mo1553j() {
            Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess");
            try {
                JSONObject jSONObject = new JSONObject(this.f240641n);
                String optString = jSONObject.optString("src");
                String optString2 = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                String optString3 = jSONObject.optString("epname");
                String optString4 = jSONObject.optString("singer");
                String optString5 = jSONObject.optString("coverImgUrl");
                String optString6 = jSONObject.optString("webUrl");
                String optString7 = jSONObject.optString("protocol");
                double optDouble = jSONObject.optDouble("startTime", 0.0d);
                String optString8 = jSONObject.optString("songLyric");
                double optDouble2 = jSONObject.optDouble("playbackRate", 1.0d);
                String str = optString5;
                double optDouble3 = jSONObject.optDouble("volume", 1.0d);
                String optString9 = jSONObject.optString("operationType");
                if (!TextUtils.isEmpty(optString9)) {
                    Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "come from onStickyBannerChanged pause or lifeCycleListener onDestroy");
                    String str2 = C83613a.C83615b.f244198a.f244191a;
                    if (Util.isNullOrNil(str2) || str2.equals(this.f240639i)) {
                        this.f240642o = false;
                        if (optString9.equalsIgnoreCase("pause")) {
                            if (C12154i.m11768b()) {
                                Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "pause music ok");
                                return;
                            } else {
                                this.f240642o = true;
                                this.f240643p = "pause music fail";
                            }
                        } else if (optString9.equalsIgnoreCase("stop")) {
                            if (C12154i.m11770d()) {
                                Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "stop music ok");
                                return;
                            } else {
                                this.f240642o = true;
                                this.f240643p = "stop music fail";
                            }
                        }
                        mo114394b();
                        return;
                    }
                    Log.m105925i("MicroMsg.Music.JsApiSetBackgroundAudioState", "appid not match cannot operate, preAppId:%s, appId:%s", str2, this.f240639i);
                } else if (TextUtils.isEmpty(optString)) {
                    Log.m105920e("MicroMsg.Music.JsApiSetBackgroundAudioState", "src is null");
                    this.f240642o = true;
                    this.f240643p = "src is null";
                    mo114394b();
                } else if (optString8 == null || optString8.length() <= 32768) {
                    Log.m105925i("MicroMsg.Music.JsApiSetBackgroundAudioState", "src;%s, title:%s, epname:%s, singer:%s, coverImgUrl:%s, protocol:%s, webUrl:%s, startTime:%f, localPath:%s, playbackRate:%f", optString, optString2, optString3, optString4, str, optString7, optString6, Double.valueOf(optDouble), this.f240640j, Double.valueOf(optDouble2));
                    double d = (optDouble2 < 0.5d || optDouble2 > 2.0d) ? 1.0d : optDouble2;
                    if (str == null) {
                        str = "";
                    }
                    if (TextUtils.isEmpty(optString8)) {
                        Log.m105920e("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric is empty");
                    } else {
                        Log.m105925i("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric:%s", optString8);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append((this.f240639i + optString + str).hashCode());
                    double d2 = optDouble3;
                    C101106m a = C89588n.m112021a(11, str, optString2, optString4, optString6, optString, optString, sb.toString(), C112760b.m154195C(), mo114509q(str), optString3, this.f240639i);
                    a.f295943D = (int) (1000.0d * optDouble);
                    a.f295945F = optString7;
                    a.f295969q = optString8;
                    a.f295950K = d;
                    if (this.f240640j.startsWith("file://")) {
                        a.f295971s = this.f240640j;
                    }
                    a.f295956R = this.f240644q;
                    a.f295957S = this.f240645r;
                    a.f295951L = (float) d2;
                    C83613a aVar = C83613a.C83615b.f244198a;
                    aVar.f244192b = a.f295960e;
                    aVar.f244193c = a;
                    if (!(a.mo140556b(C101093a.m132480b()) && C101093a.m132481c())) {
                        Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "play the music");
                        C101093a.m132488j(a);
                    } else {
                        Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "The same music is playing");
                        C101093a.m132491m(a);
                    }
                    Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "runInMainProcess startPlayMusic");
                    Log.m105924i("MicroMsg.Music.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
                    this.f240642o = false;
                    mo114394b();
                } else {
                    Log.m105920e("MicroMsg.Music.JsApiSetBackgroundAudioState", "songLyric is large than 32KB");
                    this.f240642o = true;
                    this.f240643p = "songLyric is large than 32KB";
                    mo114394b();
                }
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.Music.JsApiSetBackgroundAudioState", "new json exists exception, data is invalid");
                this.f240642o = true;
                this.f240643p = "parser data fail, data is invalid";
                Log.m105920e("MicroMsg.Music.JsApiSetBackgroundAudioState", "exception:%s" + e.getMessage());
                mo114394b();
            }
        }

        /* renamed from: q */
        public String mo114509q(String str) {
            return C112760b.m154195C() + "/image/" + str.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240639i);
            parcel.writeString(this.f240641n);
            parcel.writeInt(this.f240642o ? 1 : 0);
            parcel.writeString(this.f240643p);
            parcel.writeString(this.f240640j);
            parcel.writeString(this.f240644q);
            parcel.writeString(this.f240645r);
        }

        public SetBackgroundAudioStateTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }
}

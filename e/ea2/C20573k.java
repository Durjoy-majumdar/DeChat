package ea2;

import android.os.Looper;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C20561h;
import qc0.C12155j;

/* renamed from: ea2.k */
public abstract class C20573k implements C94223g, C20574l {

    /* renamed from: d */
    public boolean f57906d;

    /* renamed from: e */
    public C20560e f57907e = null;

    /* renamed from: d */
    public C12155j mo32193d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo32194e() {
        return false;
    }

    /* renamed from: g */
    public abstract String mo32195g();

    /* renamed from: i */
    public void mo32196i() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028d  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32197l(int r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "MicroMsg.Audio.BaseAudioPlayer"
            java.lang.String r2 = "onErrorEvent with errCode:%d"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            r6 = 0
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            com.tencent.mm.autogen.events.AudioPlayerEvent r0 = new com.tencent.mm.autogen.events.AudioPlayerEvent
            r0.<init>()
            com.tencent.mm.autogen.events.AudioPlayerEvent$a r2 = r0.f48073d
            r4 = 4
            r2.f48074a = r4
            java.lang.String r4 = "error"
            r2.f48077d = r4
            int r4 = com.tencent.p014mm.plugin.music.player.base.C94225h.m119168b(r20)
            r2.f48079f = r4
            com.tencent.mm.autogen.events.AudioPlayerEvent$a r2 = r0.f48073d
            java.lang.String r4 = com.tencent.p014mm.plugin.music.player.base.C94225h.m119167a(r20)
            r2.f48080g = r4
            com.tencent.mm.autogen.events.AudioPlayerEvent$a r2 = r0.f48073d
            r4 = r1
            ea2.m r4 = (ea2.C20575m) r4
            java.lang.String r5 = r4.f57915f
            r2.f48076c = r5
            java.lang.String r5 = r19.mo32195g()
            r2.f48078e = r5
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.asyncPublish((android.os.Looper) r2)
            ea2.e r0 = r1.f57907e
            if (r0 == 0) goto L_0x02aa
            java.lang.String r2 = r4.f57915f
            ea2.h$b r0 = (ea2.C20561h.C20563b) r0
            ea2.h r4 = ea2.C20561h.this
            ea2.m r4 = r4.mo32174o(r2)
            if (r4 != 0) goto L_0x005e
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "onError player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x02aa
        L_0x005e:
            ea2.h r5 = ea2.C20561h.this
            r5.mo32155N(r2, r4)
            ea2.h r5 = ea2.C20561h.this
            int r7 = r4.f57926t
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r5.f57880m
            boolean r8 = r8.containsKey(r2)
            if (r8 == 0) goto L_0x007c
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r5.f57880m
            java.lang.Object r8 = r8.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x007d
        L_0x007c:
            r8 = 0
        L_0x007d:
            if (r8 < r3) goto L_0x008d
            java.lang.String r3 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r7 = "try it one time, don't try again"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f57880m
            r3.remove(r2)
            goto L_0x0096
        L_0x008d:
            r9 = 66
            if (r9 == r7) goto L_0x0099
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f57880m
            r3.remove(r2)
        L_0x0096:
            r9 = 0
            goto L_0x0276
        L_0x0099:
            java.lang.String r7 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r9 = "canRemoveAudioPlayerInPlayingListForTry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Object r11 = r5.f57882o
            monitor-enter(r11)
            java.util.HashMap<java.lang.String, ea2.m> r12 = r5.f57869b     // Catch:{ all -> 0x02a7 }
            int r12 = r12.size()     // Catch:{ all -> 0x02a7 }
            r13 = 5
            if (r12 > r13) goto L_0x00cd
            java.lang.String r7 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r9 = "playerCount:%d is not need to remove for try"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02a7 }
            r10[r6] = r12     // Catch:{ all -> 0x02a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)     // Catch:{ all -> 0x02a7 }
            monitor-exit(r11)     // Catch:{ all -> 0x02a7 }
            goto L_0x0178
        L_0x00cd:
            java.util.LinkedList<java.lang.String> r12 = r5.f57870c     // Catch:{ all -> 0x02a7 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x02a7 }
        L_0x00d3:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x02a7 }
            if (r13 == 0) goto L_0x014b
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x02a7 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x02a7 }
            java.util.HashMap<java.lang.String, nb0.b> r14 = r5.f57876i     // Catch:{ all -> 0x02a7 }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ all -> 0x02a7 }
            nb0.b r13 = (nb0.C88912b) r13     // Catch:{ all -> 0x02a7 }
            if (r13 == 0) goto L_0x00d3
            java.lang.String r14 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            if (r14 != 0) goto L_0x00ee
            goto L_0x00d3
        L_0x00ee:
            boolean r14 = r9.containsKey(r14)     // Catch:{ all -> 0x02a7 }
            if (r14 != 0) goto L_0x010d
            java.lang.String r14 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02a7 }
            r9.put(r14, r15)     // Catch:{ all -> 0x02a7 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x02a7 }
            r14.<init>()     // Catch:{ all -> 0x02a7 }
            java.lang.String r15 = r13.f256416a     // Catch:{ all -> 0x02a7 }
            r14.add(r15)     // Catch:{ all -> 0x02a7 }
            java.lang.String r15 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            r10.put(r15, r14)     // Catch:{ all -> 0x02a7 }
            goto L_0x013d
        L_0x010d:
            java.lang.String r14 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            java.lang.Object r14 = r9.get(r14)     // Catch:{ all -> 0x02a7 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x02a7 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x02a7 }
            int r14 = r14 + r3
            java.lang.String r15 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x02a7 }
            r9.put(r15, r14)     // Catch:{ all -> 0x02a7 }
            java.lang.String r14 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            java.lang.Object r14 = r10.get(r14)     // Catch:{ all -> 0x02a7 }
            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ all -> 0x02a7 }
            java.lang.String r15 = r13.f256416a     // Catch:{ all -> 0x02a7 }
            boolean r15 = r14.contains(r15)     // Catch:{ all -> 0x02a7 }
            if (r15 != 0) goto L_0x0138
            java.lang.String r15 = r13.f256416a     // Catch:{ all -> 0x02a7 }
            r14.add(r15)     // Catch:{ all -> 0x02a7 }
        L_0x0138:
            java.lang.String r15 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            r10.put(r15, r14)     // Catch:{ all -> 0x02a7 }
        L_0x013d:
            java.lang.String r14 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            boolean r14 = r7.contains(r14)     // Catch:{ all -> 0x02a7 }
            if (r14 != 0) goto L_0x00d3
            java.lang.String r13 = r13.f256417b     // Catch:{ all -> 0x02a7 }
            r7.add(r13)     // Catch:{ all -> 0x02a7 }
            goto L_0x00d3
        L_0x014b:
            monitor-exit(r11)     // Catch:{ all -> 0x02a7 }
            java.util.HashMap<java.lang.String, nb0.b> r11 = r5.f57876i
            java.lang.Object r11 = r11.get(r2)
            nb0.b r11 = (nb0.C88912b) r11
            java.util.Iterator r12 = r7.iterator()
        L_0x0158:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x017c
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            if (r11 == 0) goto L_0x0158
            if (r13 == 0) goto L_0x0158
            java.lang.String r14 = r11.f256417b
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 == 0) goto L_0x0158
            java.lang.String r7 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r9 = "srcUrl is same, not remove and don't play again for try"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
        L_0x0178:
            r9 = 0
            r12 = 0
            goto L_0x0267
        L_0x017c:
            java.lang.String r11 = ""
            java.lang.String r12 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r13 = "removePlayerGroupMinCountForTry:%d"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r15 = 2
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r14[r6] = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r13, r14)
            java.util.Iterator r7 = r7.iterator()
            r12 = 0
            r13 = 2
        L_0x0194:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x01dd
            java.lang.Object r14 = r7.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r16 = r9.get(r14)
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r3 = r16.intValue()
            java.lang.String r6 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "count:%d, url:%s"
            r20 = r7
            java.lang.Object[] r7 = new java.lang.Object[r15]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)
            r16 = 0
            r7[r16] = r18
            r17 = 1
            r7[r17] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r7)
            if (r3 < r15) goto L_0x01d6
            if (r13 >= r3) goto L_0x01c7
            r13 = r3
            r11 = r14
        L_0x01c7:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L_0x01ce
            r11 = r14
        L_0x01ce:
            r1 = r19
            r7 = r20
            r3 = 1
            r6 = 0
            r12 = 1
            goto L_0x0194
        L_0x01d6:
            r1 = r19
            r7 = r20
            r3 = 1
            r6 = 0
            goto L_0x0194
        L_0x01dd:
            if (r12 == 0) goto L_0x025f
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "need to remove player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.lang.Object r1 = r10.get(r11)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x025d
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x025d
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01fd:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0217
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, nb0.b> r7 = r5.f57876i
            java.lang.Object r6 = r7.get(r6)
            nb0.b r6 = (nb0.C88912b) r6
            if (r6 == 0) goto L_0x01fd
            r3.add(r6)
            goto L_0x01fd
        L_0x0217:
            ea2.h$i r1 = new ea2.h$i
            r1.<init>(r5)
            java.util.Collections.sort(r3, r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0228:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x023a
            java.lang.Object r6 = r3.next()
            nb0.b r6 = (nb0.C88912b) r6
            java.lang.String r6 = r6.f256416a
            r1.add(r6)
            goto L_0x0228
        L_0x023a:
            java.util.LinkedList<java.lang.String> r3 = r5.f57881n
            java.lang.Object r1 = r1.getLast()
            java.lang.String r1 = (java.lang.String) r1
            r3.add(r1)
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "need remove and stop player count for try: %d"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.util.LinkedList<java.lang.String> r6 = r5.f57881n
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 0
            r7[r9] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r7)
            goto L_0x0267
        L_0x025d:
            r9 = 0
            goto L_0x0267
        L_0x025f:
            r9 = 0
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "not need to remove player for try"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
        L_0x0267:
            if (r12 == 0) goto L_0x0276
            r1 = 1
            int r8 = r8 + r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f57880m
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.put(r2, r5)
            r3 = 1
            goto L_0x0277
        L_0x0276:
            r3 = 0
        L_0x0277:
            if (r3 == 0) goto L_0x028d
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "try to stop same url players and play again"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            ea2.h r1 = ea2.C20561h.this
            r1.mo32148G()
            ea2.h r0 = ea2.C20561h.this
            r1 = 0
            r0.mo32153L(r2, r1)
            goto L_0x02aa
        L_0x028d:
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "not try to play again"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            ea2.h r1 = ea2.C20561h.this
            r1.mo32181w(r2, r4)
            ea2.h r1 = ea2.C20561h.this
            ea2.C20561h.m22331c(r1)
            ea2.h r0 = ea2.C20561h.this
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            r0.mo32147F(r1)
            goto L_0x02aa
        L_0x02a7:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x02a7 }
            throw r0
        L_0x02aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ea2.C20573k.mo32197l(int):void");
    }

    /* renamed from: m */
    public void mo32198m() {
        Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onPauseEvent");
        AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
        AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
        aVar.f48074a = 2;
        aVar.f48077d = "pause";
        C20575m mVar = (C20575m) this;
        aVar.f48076c = mVar.f57915f;
        aVar.f48078e = mo32195g();
        audioPlayerEvent.asyncPublish(Looper.getMainLooper());
        C20560e eVar = this.f57907e;
        if (eVar != null) {
            String str = mVar.f57915f;
            C20561h.C20563b bVar = (C20561h.C20563b) eVar;
            C20575m o = C20561h.this.mo32174o(str);
            if (o == null) {
                Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "onPause player is null");
                return;
            }
            C20561h.this.mo32155N(str, o);
            C20561h.this.mo32181w(str, o);
            C20561h.m22331c(C20561h.this);
            C20561h.this.mo32147F(Camera2CameraImpl.StateCallback.CameraReopenMonitor.ACTIVE_REOPEN_LIMIT_MS);
        }
    }

    /* renamed from: n */
    public void mo32199n() {
        Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onPrepareEvent");
        AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
        AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
        aVar.f48074a = 7;
        aVar.f48077d = "canplay";
        C20575m mVar = (C20575m) this;
        aVar.f48075b = (long) mVar.getDuration();
        AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
        aVar2.f48076c = mVar.f57915f;
        aVar2.f48078e = mo32195g();
        C20561h s = C20561h.m22332s();
        if (!s.f57878k.contains(mVar.f57915f)) {
            audioPlayerEvent.asyncPublish(Looper.getMainLooper());
            return;
        }
        Log.m105925i("MicroMsg.Audio.BaseAudioPlayer", "removeSendPreparedEvent audioId:%s", mVar.f57915f);
        C20561h s2 = C20561h.m22332s();
        s2.f57878k.remove(mVar.f57915f);
    }

    /* renamed from: o */
    public void mo32200o() {
        Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onSeekToEvent");
        AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
        AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
        aVar.f48074a = 6;
        aVar.f48077d = "seeked";
        aVar.f48076c = ((C20575m) this).f57915f;
        aVar.f48078e = mo32195g();
        audioPlayerEvent.asyncPublish(Looper.getMainLooper());
    }

    public void onPhoneCall(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                C20575m mVar = (C20575m) this;
                if (mVar.mo32206f()) {
                    this.f57906d = true;
                    mVar.pause();
                }
            }
        } else if (this.f57906d) {
            this.f57906d = false;
            ((C20575m) this).resume();
        }
    }

    /* renamed from: p */
    public void mo32202p() {
        Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
        AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
        AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
        aVar.f48074a = 3;
        aVar.f48077d = "stop";
        C20575m mVar = (C20575m) this;
        aVar.f48076c = mVar.f57915f;
        aVar.f48078e = mo32195g();
        audioPlayerEvent.asyncPublish(Looper.getMainLooper());
        C20560e eVar = this.f57907e;
        if (eVar != null) {
            String str = mVar.f57915f;
            C20561h.C20563b bVar = (C20561h.C20563b) eVar;
            C20575m o = C20561h.this.mo32174o(str);
            if (o == null) {
                Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "onStop player is null");
                return;
            }
            C20561h.this.mo32155N(str, o);
            C20561h.this.mo32181w(str, o);
            C20561h.m22331c(C20561h.this);
            C20561h.this.mo32147F(Camera2CameraImpl.StateCallback.CameraReopenMonitor.ACTIVE_REOPEN_LIMIT_MS);
            C20561h.this.mo32160S(str);
            C20561h.this.mo32142A(str);
        }
    }
}

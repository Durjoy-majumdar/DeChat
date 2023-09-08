package p489dh;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p156gj.C87203t;
import p489dh.C107038f;
import p492dn.C107054l;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: dh.g */
public final class C107040g extends C107032a {

    /* renamed from: c */
    public C107038f.C107039a f320447c;

    /* renamed from: dh.g$a */
    public static final class C107041a extends AudioDeviceCallback {

        /* renamed from: a */
        public final /* synthetic */ C107040g f320448a;

        public C107041a(C107040g gVar) {
            this.f320448a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0104 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] r15) {
            /*
                r14 = this;
                super.onAudioDevicesAdded(r15)
                if (r15 == 0) goto L_0x0108
                dh.g r0 = r14.f320448a
                int r1 = r15.length
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0108
                r4 = r15[r3]
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "activie device is "
                r5.append(r6)
                java.lang.String r6 = r4.getAddress()
                r5.append(r6)
                java.lang.String r6 = " and "
                r5.append(r6)
                java.lang.CharSequence r7 = r4.getProductName()
                r5.append(r7)
                r5.append(r6)
                int r6 = r4.getType()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "MicroMsg.LEAudioProfile"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                int r5 = r4.getType()
                r6 = 7
                r7 = 1
                if (r5 == r6) goto L_0x004e
                int r5 = r4.getType()
                r6 = 26
                if (r5 != r6) goto L_0x009f
            L_0x004e:
                java.lang.CharSequence r5 = r4.getProductName()
                java.lang.String r6 = p156gj.C87203t.m108275k()
                boolean r5 = gy3.C87412m.m108589b(r5, r6)
                if (r5 != 0) goto L_0x0074
                java.lang.CharSequence r5 = r4.getProductName()
                if (r5 == 0) goto L_0x006b
                boolean r5 = z04.C112551y.m153811k(r5)
                if (r5 == 0) goto L_0x0069
                goto L_0x006b
            L_0x0069:
                r5 = 0
                goto L_0x006c
            L_0x006b:
                r5 = 1
            L_0x006c:
                if (r5 == 0) goto L_0x006f
                goto L_0x0074
            L_0x006f:
                java.lang.CharSequence r5 = r4.getProductName()
                goto L_0x0083
            L_0x0074:
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r5 = r5.getResources()
                r6 = 2131822022(0x7f1105c6, float:1.9276804E38)
                java.lang.String r5 = r5.getString(r6)
            L_0x0083:
                dn.l$a r6 = new dn.l$a
                r9 = 4
                java.lang.String r10 = r5.toString()
                r11 = 0
                r12 = 4
                r13 = 0
                r8 = r6
                r8.<init>(r9, r10, r11, r12, r13)
                r0.f320434b = r6
                dh.f$a r6 = r0.f320447c
                if (r6 == 0) goto L_0x009f
                r8 = 4
                java.lang.String r5 = r5.toString()
                r6.mo157481c(r8, r5)
            L_0x009f:
                int r5 = r4.getType()
                r6 = 3
                if (r5 == r6) goto L_0x00b6
                int r5 = r4.getType()
                r8 = 22
                if (r5 == r8) goto L_0x00b6
                int r5 = r4.getType()
                r8 = 11
                if (r5 != r8) goto L_0x0104
            L_0x00b6:
                java.lang.CharSequence r5 = r4.getProductName()
                java.lang.String r8 = p156gj.C87203t.m108275k()
                boolean r5 = gy3.C87412m.m108589b(r5, r8)
                if (r5 != 0) goto L_0x00da
                java.lang.CharSequence r5 = r4.getProductName()
                if (r5 == 0) goto L_0x00d2
                boolean r5 = z04.C112551y.m153811k(r5)
                if (r5 == 0) goto L_0x00d1
                goto L_0x00d2
            L_0x00d1:
                r7 = 0
            L_0x00d2:
                if (r7 == 0) goto L_0x00d5
                goto L_0x00da
            L_0x00d5:
                java.lang.CharSequence r4 = r4.getProductName()
                goto L_0x00e9
            L_0x00da:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131822024(0x7f1105c8, float:1.9276808E38)
                java.lang.String r4 = r4.getString(r5)
            L_0x00e9:
                dn.l$a r5 = new dn.l$a
                r8 = 3
                java.lang.String r9 = r4.toString()
                r10 = 0
                r11 = 4
                r12 = 0
                r7 = r5
                r7.<init>(r8, r9, r10, r11, r12)
                r0.f320433a = r5
                dh.f$a r5 = r0.f320447c
                if (r5 == 0) goto L_0x0104
                java.lang.String r4 = r4.toString()
                r5.mo157481c(r6, r4)
            L_0x0104:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p489dh.C107040g.C107041a.onAudioDevicesAdded(android.media.AudioDeviceInfo[]):void");
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            C107038f.C107039a aVar;
            C107038f.C107039a aVar2;
            super.onAudioDevicesRemoved(audioDeviceInfoArr);
            if (audioDeviceInfoArr != null) {
                C107040g gVar = this.f320448a;
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    Log.m105924i("MicroMsg.LEAudioProfile", "onAudioDevicesRemoved device is " + audioDeviceInfo.getAddress() + " and " + audioDeviceInfo.getProductName());
                    if ((audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) && (aVar2 = gVar.f320447c) != null) {
                        aVar2.mo157480b(4, audioDeviceInfo.getProductName().toString());
                    }
                    if ((audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11) && (aVar = gVar.f320447c) != null) {
                        aVar.mo157480b(3, audioDeviceInfo.getProductName().toString());
                    }
                }
            }
        }
    }

    /* renamed from: dh.g$b */
    public static final class C107042b implements AudioManager.OnCommunicationDeviceChangedListener {

        /* renamed from: a */
        public final /* synthetic */ C107040g f320449a;

        public C107042b(C107040g gVar) {
            this.f320449a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCommunicationDeviceChanged(android.media.AudioDeviceInfo r11) {
            /*
                r10 = this;
                if (r11 == 0) goto L_0x0116
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "current device changed to "
                r0.append(r1)
                int r1 = r11.getType()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.LEAudioProfile"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                int r0 = r11.getType()
                r1 = 2
                r2 = 1
                if (r0 == r2) goto L_0x00fe
                if (r0 == r1) goto L_0x00e5
                r1 = 0
                r3 = 3
                if (r0 == r3) goto L_0x0092
                r4 = 7
                if (r0 == r4) goto L_0x003f
                r4 = 11
                if (r0 == r4) goto L_0x0092
                r4 = 22
                if (r0 == r4) goto L_0x0092
                r3 = 26
                if (r0 == r3) goto L_0x003f
                goto L_0x0116
            L_0x003f:
                java.lang.CharSequence r0 = r11.getProductName()
                java.lang.String r3 = android.os.Build.MODEL
                boolean r0 = gy3.C87412m.m108589b(r0, r3)
                if (r0 != 0) goto L_0x0061
                java.lang.CharSequence r0 = r11.getProductName()
                if (r0 == 0) goto L_0x0059
                boolean r0 = z04.C112551y.m153811k(r0)
                if (r0 == 0) goto L_0x0058
                goto L_0x0059
            L_0x0058:
                r2 = 0
            L_0x0059:
                if (r2 == 0) goto L_0x005c
                goto L_0x0061
            L_0x005c:
                java.lang.CharSequence r11 = r11.getProductName()
                goto L_0x0070
            L_0x0061:
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r0 = 2131822022(0x7f1105c6, float:1.9276804E38)
                java.lang.String r11 = r11.getString(r0)
            L_0x0070:
                dh.g r0 = r10.f320449a
                dn.l$a r7 = new dn.l$a
                r2 = 4
                java.lang.String r3 = r11.toString()
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r0.f320434b = r7
                dh.g r0 = r10.f320449a
                dh.f$a r0 = r0.f320447c
                if (r0 == 0) goto L_0x0116
                r1 = 4
                java.lang.String r11 = r11.toString()
                r0.mo157479a(r1, r11)
                goto L_0x0116
            L_0x0092:
                java.lang.CharSequence r0 = r11.getProductName()
                java.lang.String r4 = p156gj.C87203t.m108275k()
                boolean r0 = gy3.C87412m.m108589b(r0, r4)
                if (r0 != 0) goto L_0x00b6
                java.lang.CharSequence r0 = r11.getProductName()
                if (r0 == 0) goto L_0x00ae
                boolean r0 = z04.C112551y.m153811k(r0)
                if (r0 == 0) goto L_0x00ad
                goto L_0x00ae
            L_0x00ad:
                r2 = 0
            L_0x00ae:
                if (r2 == 0) goto L_0x00b1
                goto L_0x00b6
            L_0x00b1:
                java.lang.CharSequence r11 = r11.getProductName()
                goto L_0x00c5
            L_0x00b6:
                android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r11 = r11.getResources()
                r0 = 2131822024(0x7f1105c8, float:1.9276808E38)
                java.lang.String r11 = r11.getString(r0)
            L_0x00c5:
                dh.g r0 = r10.f320449a
                dn.l$a r1 = new dn.l$a
                r5 = 3
                java.lang.String r6 = r11.toString()
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9)
                r0.f320433a = r1
                dh.g r0 = r10.f320449a
                dh.f$a r0 = r0.f320447c
                if (r0 == 0) goto L_0x0116
                java.lang.String r11 = r11.toString()
                r0.mo157479a(r3, r11)
                goto L_0x0116
            L_0x00e5:
                dh.g r11 = r10.f320449a
                dh.f$a r11 = r11.f320447c
                if (r11 == 0) goto L_0x0116
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131822025(0x7f1105c9, float:1.927681E38)
                java.lang.String r0 = r0.getString(r1)
                r11.mo157479a(r2, r0)
                goto L_0x0116
            L_0x00fe:
                dh.g r11 = r10.f320449a
                dh.f$a r11 = r11.f320447c
                if (r11 == 0) goto L_0x0116
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131822023(0x7f1105c7, float:1.9276806E38)
                java.lang.String r0 = r0.getString(r2)
                r11.mo157479a(r1, r0)
            L_0x0116:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p489dh.C107040g.C107042b.onCommunicationDeviceChanged(android.media.AudioDeviceInfo):void");
        }
    }

    public C107040g() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        C107041a aVar = new C107041a(this);
        C107042b bVar = new C107042b(this);
        audioManager.registerAudioDeviceCallback(aVar, (Handler) null);
        audioManager.addOnCommunicationDeviceChangedListener(((C119157j) C119157j.f356862d).mo183883n(""), bVar);
    }

    /* renamed from: a */
    public String mo157483a(boolean z) {
        Object obj;
        Object obj2;
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        C87412m.m108593f(availableCommunicationDevices, "audioManager.availableCommunicationDevices");
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            boolean z2 = false;
            if (audioDeviceInfo.getType() == 26) {
                if (!audioManager.setCommunicationDevice(audioDeviceInfo)) {
                    Log.m105920e("MicroMsg.LEAudioProfile", "error happened in route to device ble audio ");
                    return null;
                }
                if (!C87412m.m108589b(audioDeviceInfo.getProductName(), C87203t.m108275k())) {
                    CharSequence productName = audioDeviceInfo.getProductName();
                    if (productName == null || C112551y.m153811k(productName)) {
                        z2 = true;
                    }
                    if (!z2) {
                        obj = audioDeviceInfo.getProductName();
                        this.f320434b = new C107054l.C107055a(4, obj.toString(), 0, 4, (C8480h) null);
                        return obj.toString();
                    }
                }
                obj = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                this.f320434b = new C107054l.C107055a(4, obj.toString(), 0, 4, (C8480h) null);
                return obj.toString();
            } else if (audioDeviceInfo.getType() == 7) {
                if (!audioManager.setCommunicationDevice(audioDeviceInfo)) {
                    Log.m105920e("MicroMsg.LEAudioProfile", "error happened in route to device bluetooth");
                    return null;
                }
                if (!C87412m.m108589b(audioDeviceInfo.getProductName(), C87203t.m108275k())) {
                    CharSequence productName2 = audioDeviceInfo.getProductName();
                    if (productName2 == null || C112551y.m153811k(productName2)) {
                        z2 = true;
                    }
                    if (!z2) {
                        obj2 = audioDeviceInfo.getProductName();
                        this.f320434b = new C107054l.C107055a(4, obj2.toString(), 0, 4, (C8480h) null);
                        return obj2.toString();
                    }
                }
                obj2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                this.f320434b = new C107054l.C107055a(4, obj2.toString(), 0, 4, (C8480h) null);
                return obj2.toString();
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo157484b(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        C87412m.m108593f(availableCommunicationDevices, "audioManager.availableCommunicationDevices");
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            if ((audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11) && !audioManager.setCommunicationDevice(audioDeviceInfo)) {
                Log.m105920e("MicroMsg.LEAudioProfile", "error happened in route to device headset");
            }
        }
    }

    /* renamed from: c */
    public void mo157485c(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        C87412m.m108593f(availableCommunicationDevices, "audioManager.availableCommunicationDevices");
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            if (audioDeviceInfo.getType() == 1 && !audioManager.setCommunicationDevice(audioDeviceInfo)) {
                Log.m105920e("MicroMsg.LEAudioProfile", "error happened in route to device earpiece");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo157486d() {
        /*
            r4 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.media.AudioManager"
            gy3.C87412m.m108592e(r0, r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            java.util.List r0 = r0.getAvailableCommunicationDevices()
            java.lang.String r1 = "audioManager.availableCommunicationDevices"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r0.next()
            android.media.AudioDeviceInfo r1 = (android.media.AudioDeviceInfo) r1
            int r2 = r1.getType()
            r3 = 7
            if (r2 == r3) goto L_0x0039
            int r1 = r1.getType()
            r2 = 26
            if (r1 != r2) goto L_0x001e
        L_0x0039:
            r0 = 1
            return r0
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p489dh.C107040g.mo157486d():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo157487e() {
        /*
            r4 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.media.AudioManager"
            gy3.C87412m.m108592e(r0, r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            java.util.List r0 = r0.getAvailableCommunicationDevices()
            java.lang.String r1 = "audioManager.availableCommunicationDevices"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r0.next()
            android.media.AudioDeviceInfo r1 = (android.media.AudioDeviceInfo) r1
            int r2 = r1.getType()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            int r2 = r1.getType()
            r3 = 22
            if (r2 == r3) goto L_0x0041
            int r1 = r1.getType()
            r2 = 11
            if (r1 != r2) goto L_0x001e
        L_0x0041:
            r0 = 1
            return r0
        L_0x0043:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p489dh.C107040g.mo157487e():boolean");
    }

    /* renamed from: f */
    public void mo157488f(C107038f.C107039a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f320447c = aVar;
    }

    /* renamed from: g */
    public boolean mo157489g() {
        return true;
    }

    /* renamed from: h */
    public void mo157490h(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        List<AudioDeviceInfo> availableCommunicationDevices = audioManager.getAvailableCommunicationDevices();
        C87412m.m108593f(availableCommunicationDevices, "audioManager.availableCommunicationDevices");
        for (AudioDeviceInfo audioDeviceInfo : availableCommunicationDevices) {
            if (audioDeviceInfo.getType() == 2 && !audioManager.setCommunicationDevice(audioDeviceInfo)) {
                Log.m105920e("MicroMsg.LEAudioProfile", "error happened in route to device speaker");
            }
        }
    }

    public void release() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).clearCommunicationDevice();
    }
}

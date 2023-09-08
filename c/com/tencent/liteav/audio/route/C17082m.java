package com.tencent.liteav.audio.route;

import android.media.AudioManager;
import android.os.Handler;
import com.tencent.liteav.audio.route.C17069b;
import com.tencent.liteav.base.Log;
import j20.C117292a;

/* renamed from: com.tencent.liteav.audio.route.m */
public final class C17082m {

    /* renamed from: com.tencent.liteav.audio.route.m$1 */
    public static /* synthetic */ class C170831 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46063a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46064b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0042 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                int[] r0 = com.tencent.liteav.audio.route.C17082m.C17087b.C17088a.m16875a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46064b = r0
                r1 = 1
                int r2 = com.tencent.liteav.audio.route.C17082m.C17087b.C17088a.f46075a     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f46064b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r3 = com.tencent.liteav.audio.route.C17082m.C17087b.C17088a.f46076b     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r3 = r3 - r1
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r2 = 3
                int[] r3 = f46064b     // Catch:{ NoSuchFieldError -> 0x001f }
                int r4 = com.tencent.liteav.audio.route.C17082m.C17087b.C17088a.f46078d     // Catch:{ NoSuchFieldError -> 0x001f }
                int r4 = r4 - r1
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r3 = 4
                int[] r4 = f46064b     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r5 = com.tencent.liteav.audio.route.C17082m.C17087b.C17088a.f46077c     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r5 = r5 - r1
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.tencent.liteav.audio.route.b$a[] r4 = com.tencent.liteav.audio.route.C17069b.C17070a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f46063a = r4
                com.tencent.liteav.audio.route.b$a r5 = com.tencent.liteav.audio.route.C17069b.C17070a.EARPHONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r1 = f46063a     // Catch:{ NoSuchFieldError -> 0x0042 }
                com.tencent.liteav.audio.route.b$a r4 = com.tencent.liteav.audio.route.C17069b.C17070a.SPEAKERPHONE     // Catch:{ NoSuchFieldError -> 0x0042 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0042 }
            L_0x0042:
                int[] r0 = f46063a     // Catch:{ NoSuchFieldError -> 0x004c }
                com.tencent.liteav.audio.route.b$a r1 = com.tencent.liteav.audio.route.C17069b.C17070a.WIRED_HEADSET     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                int[] r0 = f46063a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.tencent.liteav.audio.route.b$a r1 = com.tencent.liteav.audio.route.C17069b.C17070a.BLUETOOTH_HEADSET     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.C17082m.C170831.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.liteav.audio.route.m$a */
    public static abstract class C17084a {

        /* renamed from: a */
        public final AudioManager f46065a;

        /* renamed from: b */
        public final Handler f46066b;

        /* renamed from: c */
        public C17069b.C17070a f46067c = C17069b.C17070a.NONE;

        /* renamed from: d */
        public C17067a f46068d = C17067a.STOPPED;

        /* renamed from: e */
        public C17086a f46069e = null;

        /* renamed from: f */
        public int f46070f = 0;

        /* renamed from: g */
        public boolean f46071g = false;

        /* renamed from: h */
        public final Runnable f46072h = new Runnable() {
            public final void run() {
                long d = C17084a.this.mo19336d();
                C17084a aVar = C17084a.this;
                aVar.f46070f++;
                aVar.f46066b.removeCallbacks(aVar.f46072h);
                C17084a aVar2 = C17084a.this;
                if (aVar2.f46071g && d >= 0) {
                    aVar2.f46066b.postDelayed(aVar2.f46072h, d);
                }
            }
        };

        /* renamed from: com.tencent.liteav.audio.route.m$a$a */
        public interface C17086a {
            /* renamed from: a */
            void mo19317a(C17069b.C17070a aVar);

            /* renamed from: b */
            void mo19318b(C17069b.C17070a aVar);
        }

        public C17084a(AudioManager audioManager, Handler handler, C17067a aVar) {
            this.f46065a = audioManager;
            this.f46066b = handler;
            this.f46068d = aVar;
        }

        /* renamed from: a */
        public final void mo19332a(C17086a aVar) {
            this.f46069e = aVar;
        }

        /* renamed from: a */
        public void mo19333a(boolean z) {
        }

        /* renamed from: b */
        public final void mo19334b() {
            mo19335c();
            this.f46066b.removeCallbacks(this.f46072h);
            this.f46071g = false;
        }

        /* renamed from: c */
        public void mo19335c() {
        }

        /* renamed from: d */
        public abstract long mo19336d();

        /* renamed from: a */
        public final void mo19330a() {
            this.f46071g = true;
            C17086a aVar = this.f46069e;
            if (aVar != null) {
                aVar.mo19317a(this.f46067c);
            }
            this.f46066b.post(this.f46072h);
        }

        /* renamed from: a */
        public void mo19331a(C17067a aVar) {
            this.f46068d = aVar;
            this.f46066b.removeCallbacks(this.f46072h);
            this.f46070f = 0;
            this.f46066b.post(this.f46072h);
        }
    }

    /* renamed from: com.tencent.liteav.audio.route.m$c */
    public static class C17089c extends C17084a {
        public C17089c(AudioManager audioManager, Handler handler, C17067a aVar) {
            super(audioManager, handler, aVar);
            this.f46067c = C17069b.C17070a.EARPHONE;
        }

        /* renamed from: d */
        public final long mo19336d() {
            long j = this.f46070f < 5 ? 1000 : 4000;
            if (!this.f46068d.mo19319a() || !this.f46065a.isSpeakerphoneOn()) {
                Log.m97547i("AudioRouteSwitcher", "EarphoneSwitcher do nothing, mCurrentIOScene: " + this.f46068d + ", isSpeakerOn: " + this.f46065a.isSpeakerphoneOn(), new Object[0]);
            } else {
                Log.m97547i("AudioRouteSwitcher", "EarphoneSwitcher switch to earphone", new Object[0]);
                this.f46065a.setSpeakerphoneOn(false);
            }
            return j;
        }
    }

    /* renamed from: com.tencent.liteav.audio.route.m$d */
    public static class C17090d extends C17084a {
        public C17090d(AudioManager audioManager, Handler handler, C17067a aVar) {
            super(audioManager, handler, aVar);
            this.f46067c = C17069b.C17070a.SPEAKERPHONE;
        }

        /* renamed from: d */
        public final long mo19336d() {
            long j = this.f46070f < 5 ? 1000 : 4000;
            if (!this.f46068d.mo19319a() || this.f46065a.isSpeakerphoneOn()) {
                Log.m97547i("AudioRouteSwitcher", "SpeakerSwitcher do nothing, mCurrentIOScene: " + this.f46068d + ", isSpeakerOn: " + this.f46065a.isSpeakerphoneOn(), new Object[0]);
            } else {
                Log.m97547i("AudioRouteSwitcher", "SpeakerSwitcher switch to speakerphone", new Object[0]);
                this.f46065a.setSpeakerphoneOn(true);
            }
            return j;
        }
    }

    /* renamed from: com.tencent.liteav.audio.route.m$e */
    public static class C17091e extends C17084a {
        public C17091e(AudioManager audioManager, Handler handler, C17067a aVar) {
            super(audioManager, handler, aVar);
            this.f46067c = C17069b.C17070a.WIRED_HEADSET;
        }

        /* renamed from: d */
        public final long mo19336d() {
            long j = this.f46070f < 5 ? 1000 : 4000;
            if (!this.f46068d.mo19319a() || !this.f46065a.isSpeakerphoneOn()) {
                Log.m97547i("AudioRouteSwitcher", "WiredHeadsetSwitcher do nothing, mCurrentIOScene: " + this.f46068d + ", isWiredHeadsetOn: " + this.f46065a.isWiredHeadsetOn() + ", isSpeakerphoneOn: " + this.f46065a.isSpeakerphoneOn(), new Object[0]);
            } else {
                Log.m97547i("AudioRouteSwitcher", "WiredHeadsetSwitcher switch to wired headset", new Object[0]);
                this.f46065a.setWiredHeadsetOn(true);
                this.f46065a.setSpeakerphoneOn(false);
            }
            return j;
        }
    }

    /* renamed from: com.tencent.liteav.audio.route.m$b */
    public static class C17087b extends C17084a {
        private byte _hellAccFlag_;

        /* renamed from: i */
        private int f46074i = C17088a.f46076b;

        /* renamed from: com.tencent.liteav.audio.route.m$b$a */
        public enum C17088a {
            ;
            

            /* renamed from: a */
            public static final int f46075a = 1;

            /* renamed from: b */
            public static final int f46076b = 2;

            /* renamed from: c */
            public static final int f46077c = 3;

            /* renamed from: d */
            public static final int f46078d = 4;

            /* access modifiers changed from: public */
            static {
                f46079e = new int[]{1, 2, 3, 4};
            }

            /* renamed from: a */
            public static int[] m16875a() {
                return (int[]) f46079e.clone();
            }
        }

        public C17087b(AudioManager audioManager, Handler handler, C17067a aVar) {
            super(audioManager, handler, aVar);
            this.f46067c = C17069b.C17070a.BLUETOOTH_HEADSET;
        }

        /* renamed from: e */
        private void m16870e() {
            Log.m97547i("AudioRouteSwitcher", "stopBluetoothSco", new Object[0]);
            try {
                AudioManager audioManager = this.f46065a;
                C117292a.m165357c(audioManager, "com/tencent/liteav/audio/route/m$b", "e", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                audioManager.stopBluetoothSco();
                C117292a.m165359e(audioManager, "com/tencent/liteav/audio/route/m$b", "e", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                this.f46065a.setBluetoothScoOn(false);
            } catch (Throwable th) {
                Log.m97549w("AudioRouteSwitcher", "stop bluetooth sco exception " + th.getMessage(), new Object[0]);
            }
        }

        /* renamed from: a */
        public final void mo19331a(C17067a aVar) {
            if (this.f46068d.mo19319a() != aVar.mo19319a()) {
                mo19333a(false);
            }
            super.mo19331a(aVar);
        }

        /* renamed from: c */
        public final void mo19335c() {
            Log.m97547i("AudioRouteSwitcher", "beforeStop: stop bluetooth SCO", new Object[0]);
            m16870e();
        }

        /* renamed from: d */
        public final long mo19336d() {
            if (!this.f46068d.mo19319a()) {
                Log.m97547i("AudioRouteSwitcher", "BluetoothHeadsetSwitcher stop sco, mCurrentIOScene: " + this.f46068d, new Object[0]);
                m16870e();
                return -1;
            }
            int i = C170831.f46064b[this.f46074i - 1];
            if (i == 1) {
                Log.m97547i("AudioRouteSwitcher", "Bluetooth Headset is connected, isBluetoothScoOn:" + this.f46065a.isBluetoothScoOn(), new Object[0]);
                return -1;
            } else if (i == 2 || i == 3) {
                if (this.f46070f > 5) {
                    Log.m97549w("AudioRouteSwitcher", "Bluetooth headset connection failed for 3 times, give it up", new Object[0]);
                    this.f46069e.mo19318b(this.f46067c);
                    return -1;
                }
                Log.m97547i("AudioRouteSwitcher", "BluetoothHeadsetSwitcher start bluetooth SCO mode", new Object[0]);
                try {
                    this.f46065a.setBluetoothScoOn(true);
                    AudioManager audioManager = this.f46065a;
                    C117292a.m165357c(audioManager, "com/tencent/liteav/audio/route/m$b", "d", "()J", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
                    audioManager.startBluetoothSco();
                    C117292a.m165359e(audioManager, "com/tencent/liteav/audio/route/m$b", "d", "()J", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
                } catch (Throwable th) {
                    Log.m97549w("AudioRouteSwitcher", "start bluetooth sco exception " + th.getMessage(), new Object[0]);
                }
                this.f46074i = C17088a.f46077c;
                return 4000;
            } else if (i != 4) {
                return -1;
            } else {
                m16870e();
                this.f46074i = C17088a.f46078d;
                return 4000;
            }
        }

        /* renamed from: a */
        public final void mo19333a(boolean z) {
            this.f46074i = z ? C17088a.f46075a : C17088a.f46076b;
        }
    }
}

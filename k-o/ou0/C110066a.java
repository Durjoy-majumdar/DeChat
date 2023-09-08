package ou0;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Stack;
import p156gj.C107835h0;
import p156gj.C107841m;
import p206nj.C11171e;
import p331dj.C107043a;
import p492dn.C107058n;
import pu0.C110248b;
import qu0.C110472b;
import qu0.C110473c;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: ou0.a */
public abstract class C110066a implements C107058n {

    /* renamed from: a */
    public int f329351a = -1;

    /* renamed from: b */
    public int f329352b = -1;

    /* renamed from: c */
    public ArrayList<String> f329353c = new ArrayList<>();

    /* renamed from: d */
    public boolean f329354d;

    /* renamed from: e */
    public int f329355e;

    /* renamed from: f */
    public boolean f329356f;

    /* renamed from: g */
    public boolean f329357g;

    /* renamed from: h */
    public AudioManager f329358h;

    /* renamed from: i */
    public Stack<Integer> f329359i;

    /* renamed from: j */
    public C32226l<? super Boolean, C13598b0> f329360j;

    /* renamed from: k */
    public boolean f329361k;

    /* renamed from: ou0.a$a */
    public static final class C110067a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110066a f329362d;

        public C110067a(C110066a aVar) {
            this.f329362d = aVar;
        }

        public final void run() {
            Log.m105924i("MicroMsg.BaseAudioManager", "dkbt post delay BLUETOOTH_SCO_CONNECTED ");
            C110472b.m150370c(this.f329362d.f329358h);
        }
    }

    /* renamed from: ou0.a$b */
    public static final class C110068b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110066a f329363d;

        /* renamed from: e */
        public final /* synthetic */ int f329364e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f329365f;

        public C110068b(C110066a aVar, int i, C32224a<C13598b0> aVar2) {
            this.f329363d = aVar;
            this.f329364e = i;
            this.f329365f = aVar2;
        }

        public final void run() {
            Log.m105925i("MicroMsg.BaseAudioManager", "set mode from %d to %d", Integer.valueOf(this.f329363d.mo161473O()), Integer.valueOf(this.f329364e));
            this.f329363d.f329358h.setMode(this.f329364e);
            C32224a<C13598b0> aVar = this.f329365f;
            if (aVar != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }
    }

    /* renamed from: ou0.a$c */
    public static final class C110069c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110066a f329366d;

        /* renamed from: e */
        public final /* synthetic */ int f329367e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f329368f;

        public C110069c(C110066a aVar, int i, C32224a<C13598b0> aVar2) {
            this.f329366d = aVar;
            this.f329367e = i;
            this.f329368f = aVar2;
        }

        public final void run() {
            Log.m105925i("MicroMsg.BaseAudioManager", "set mode from %d to %d", Integer.valueOf(this.f329366d.mo161473O()), Integer.valueOf(this.f329367e));
            this.f329366d.f329358h.setMode(this.f329367e);
            C32224a<C13598b0> aVar = this.f329368f;
            if (aVar != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }
    }

    public C110066a() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f329358h = (AudioManager) systemService;
        this.f329359i = new Stack<>();
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m149592a0(C110066a aVar, int i, C32224a aVar2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                aVar2 = null;
            }
            aVar.mo161483Z(i, aVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMode");
    }

    /* renamed from: C */
    public boolean mo157504C() {
        return C110473c.f330369a.mo161952a(this.f329358h);
    }

    /* renamed from: H */
    public boolean mo157505H(int i) {
        return this.f329358h.isStreamMute(i);
    }

    /* renamed from: L */
    public boolean mo161470L(int i) {
        return true;
    }

    /* renamed from: M */
    public final void mo161471M(int i) {
        Log.printInfoStack("MicroMsg.BaseAudioManager", "close prev audio playing device %s", Integer.valueOf(i));
        if (i == 1) {
            this.f329356f = false;
            this.f329358h.setSpeakerphoneOn(false);
        } else if (i == 3) {
            C110473c.f330370b = false;
        } else if (i == 4) {
            this.f329354d = false;
            C110472b.f330366b = false;
            AudioManager audioManager = this.f329358h;
            C87412m.m108594g(audioManager, "audioManager");
            C110248b.C110249a aVar = C110248b.f329777h;
            Log.printInfoStack("MicroMsg.BluetoothUtil", "dkbt begin stopBluetooth %s", aVar.mo161662g());
            audioManager.setBluetoothScoOn(false);
            C110472b.f330366b = false;
            if (!PhoneStatusWatcher.isCalling()) {
                Log.m105925i("MicroMsg.BluetoothUtil", "stop SrvDeviceInfo mCommonInfo getStartBluetoothSco:%s,getStopBluetoothInBU:%s ", Integer.valueOf(C107835h0.f322856m.f322893d), Integer.valueOf(C107835h0.f322856m.f322891c));
                C107841m mVar = C107835h0.f322856m;
                if (mVar.f322891c == 1 || mVar.f322893d == -1) {
                    Log.m105925i("MicroMsg.BluetoothUtil", "BluetoothUtil stopBluetoothSco stack: %s", Util.getStack());
                    AudioManager audioManager2 = audioManager;
                    C117292a.m165357c(audioManager2, "com/tencent/mm/plugin/audio/util/BluetoothUtil", "doStopBluetooth", "(Landroid/media/AudioManager;)Z", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                    audioManager.stopBluetoothSco();
                    C117292a.m165359e(audioManager2, "com/tencent/mm/plugin/audio/util/BluetoothUtil", "doStopBluetooth", "(Landroid/media/AudioManager;)Z", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                }
            }
            Log.m105925i("MicroMsg.BluetoothUtil", "dkbt end stopBluetooth %s", aVar.mo161662g());
            ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
        }
    }

    /* renamed from: N */
    public final int mo161472N() {
        if (this.f329359i.empty()) {
            return -1;
        }
        Integer lastElement = this.f329359i.lastElement();
        C87412m.m108593f(lastElement, "mDeviceQueue.lastElement()");
        return lastElement.intValue();
    }

    /* renamed from: O */
    public final int mo161473O() {
        return this.f329358h.getMode();
    }

    /* renamed from: P */
    public final boolean mo161474P(int i) {
        if (i == 3) {
            return C110473c.f330370b;
        }
        if (i != 4) {
            return true;
        }
        return C110472b.f330366b;
    }

    /* renamed from: Q */
    public final boolean mo161475Q() {
        mo157512y();
        return C110472b.f330366b || C110473c.f330370b;
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAudioDeviceStateChanged mstatus is ");
        sb.append(i);
        sb.append(" and  mCurrentAudioDeviceState = status ");
        sb.append(this.f329351a == i);
        Log.m105924i("MicroMsg.BaseAudioManager", sb.toString());
        if (this.f329351a != i) {
            if (!this.f329353c.isEmpty() || (i == 9 && i == 8)) {
                switch (i) {
                    case 0:
                    case 5:
                        if (mo161470L(i)) {
                            ((C119157j) C119157j.f356862d).mo183879j(new C110067a(this), 1000, "delayConnectBluetooth");
                            return;
                        }
                        return;
                    case 1:
                    case 6:
                    case 7:
                        mo161479V(false);
                        return;
                    case 2:
                        mo161482Y(true);
                        mo161479V(true);
                        return;
                    case 3:
                        ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
                        mo161479V(false);
                        return;
                    case 8:
                        mo161481X(true);
                        return;
                    case 9:
                        mo161481X(false);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: S */
    public final int mo161476S(boolean z, int i) {
        Log.printInfoStack("MicroMsg.BaseAudioManager", "current refresh audio playing isPlugged %s, and device is  %s", Boolean.valueOf(z), Integer.valueOf(i));
        if (!this.f329359i.isEmpty() && this.f329359i.size() > 1) {
            Stack<Integer> stack = this.f329359i;
            Integer num = stack.get(stack.size() - 1);
            Integer lastElement = this.f329359i.lastElement();
            if (z) {
                if (num == null || num.intValue() != i) {
                    C87412m.m108593f(num, "prevDevice");
                    mo161471M(num.intValue());
                }
                return mo161484c0(i);
            }
            mo161471M(i);
            if (lastElement == null || i != lastElement.intValue()) {
                C87412m.m108593f(lastElement, "nextDevice");
                return mo161484c0(lastElement.intValue());
            }
        } else if (z) {
            return mo161484c0(i);
        } else {
            mo161471M(i);
            if (i == 1 && ((!C110472b.f330365a.mo161950a() || !C110472b.f330366b) && !C110473c.f330369a.mo161952a(this.f329358h))) {
                mo161480W(true);
            }
        }
        return -1;
    }

    /* renamed from: T */
    public final void mo161477T(String str) {
        C87412m.m108594g(str, "type");
        Log.printInfoStack("MicroMsg.BaseAudioManager", "releaseAudioPlayingOrRecordingResource type " + str, new Object[0]);
        if (this.f329353c.contains(str) && this.f329359i.contains(4)) {
            mo161479V(false);
        }
        this.f329359i.clear();
        this.f329353c.remove(str);
    }

    /* renamed from: U */
    public final int mo161478U(String str, Integer num) {
        C87412m.m108594g(str, "type");
        this.f329357g = this.f329356f;
        Log.printInfoStack("MicroMsg.BaseAudioManager", "requestAudioPlayingOrRecordingResource type " + str + " adn target device " + num, new Object[0]);
        mo157512y();
        if (this.f329353c.contains(str)) {
            this.f329353c.remove(str);
        }
        this.f329353c.add(str);
        if (num != null && num.intValue() == 4) {
            return mo161479V(true);
        }
        if (num != null && num.intValue() == 3) {
            mo161481X(true);
        } else if (num != null && num.intValue() == 2) {
            mo161480W(true);
        } else if (num != null && num.intValue() == 1) {
            mo18028n(true);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo161479V(boolean r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.BaseAudioManager"
            java.lang.String r4 = "request bluetooth on value %s"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r2, r4, r1)
            java.lang.String r1 = "MicroMsg.BluetoothUtil"
            java.lang.String r4 = "mDeviceQueue"
            r5 = -1
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r9 == 0) goto L_0x006e
            java.util.Stack<java.lang.Integer> r9 = r8.f329359i
            gy3.C87412m.m108594g(r9, r4)
            java.lang.String r4 = "request the bluetooth resource"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x003e
            java.lang.Object r4 = r9.lastElement()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0052
        L_0x003e:
            qu0.b r4 = qu0.C110472b.f330365a
            boolean r4 = r4.mo161950a()
            if (r4 == 0) goto L_0x0054
            boolean r1 = r9.contains(r7)
            if (r1 == 0) goto L_0x004f
            r9.removeElement(r7)
        L_0x004f:
            r9.push(r7)
        L_0x0052:
            r9 = 1
            goto L_0x005a
        L_0x0054:
            java.lang.String r9 = "current bluetooth can not use "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            r9 = 0
        L_0x005a:
            if (r9 == 0) goto L_0x006a
            int r9 = r8.mo161476S(r0, r6)
            if (r9 == r5) goto L_0x0064
            r1 = 1
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            r8.mo161482Y(r1)
            r5 = r9
            goto L_0x0083
        L_0x006a:
            r8.mo161482Y(r3)
            goto L_0x0083
        L_0x006e:
            r8.mo161482Y(r3)
            java.util.Stack<java.lang.Integer> r9 = r8.f329359i
            gy3.C87412m.m108594g(r9, r4)
            java.lang.String r4 = " release the bluetooth resource"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            r9.removeElement(r7)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r8.mo161476S(r3, r6)
        L_0x0083:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r9[r3] = r0
            java.lang.String r0 = "request bluetooth failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ou0.C110066a.mo161479V(boolean):int");
    }

    /* renamed from: W */
    public void mo161480W(boolean z) {
        Integer lastElement;
        boolean z2 = false;
        if (z) {
            Stack<Integer> stack = this.f329359i;
            C87412m.m108594g(stack, "mDeviceQueue");
            Log.m105924i("MicroMsg.EarPieceUtil", " request the earpiece resource");
            if (stack.isEmpty() || (lastElement = stack.lastElement()) == null || lastElement.intValue() != 2) {
                if (stack.contains(2)) {
                    stack.removeElement(2);
                }
                stack.push(2);
                z2 = true;
            }
            if (z2) {
                mo161471M(1);
                mo161476S(true, 2);
                return;
            }
            return;
        }
        Stack<Integer> stack2 = this.f329359i;
        C87412m.m108594g(stack2, "mDeviceQueue");
        Log.m105924i("MicroMsg.EarPieceUtil", " release the earpiece resource");
        stack2.removeElement(2);
        C13598b0 b0Var = C13598b0.f38549a;
        mo161476S(false, 2);
    }

    /* renamed from: X */
    public final void mo161481X(boolean z) {
        Integer lastElement;
        boolean z2 = false;
        if (z) {
            Stack<Integer> stack = this.f329359i;
            C87412m.m108594g(stack, "mDeviceQueue");
            Log.m105924i("MicroMsg.HeadSetPlugUtil", " request the headset resource");
            if (stack.isEmpty() || (lastElement = stack.lastElement()) == null || lastElement.intValue() != 3) {
                if (stack.contains(3)) {
                    stack.removeElement(3);
                }
                stack.push(3);
                z2 = true;
            }
            if (z2) {
                mo161476S(true, 3);
                return;
            }
            return;
        }
        Stack<Integer> stack2 = this.f329359i;
        C87412m.m108594g(stack2, "mDeviceQueue");
        Log.m105924i("MicroMsg.HeadSetPlugUtil", " release the headset resource");
        stack2.removeElement(3);
        C13598b0 b0Var = C13598b0.f38549a;
        mo161476S(false, 3);
    }

    /* renamed from: Y */
    public final void mo161482Y(boolean z) {
        this.f329361k = z;
        C32226l<? super Boolean, C13598b0> lVar = this.f329360j;
        if (lVar != null) {
            C13598b0 invoke = lVar.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: Z */
    public final void mo161483Z(int i, C32224a<C13598b0> aVar) {
        if (C11171e.m11045b(30)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C110068b(this, i, aVar), "reset speaker");
        } else {
            int i2 = this.f329352b;
            if (i2 == -1 || i2 != i) {
                ((C119157j) C119157j.f356862d).mo183876g(new C110069c(this, i, aVar), "reset speaker");
            }
        }
        this.f329352b = i;
    }

    /* renamed from: b0 */
    public abstract boolean mo107365b0(boolean z);

    /* renamed from: c */
    public int mo157506c(int i) {
        return this.f329358h.getStreamVolume(i);
    }

    /* renamed from: c0 */
    public final int mo161484c0(int i) {
        boolean z = true;
        Log.printInfoStack("MicroMsg.BaseAudioManager", "start current audio playing device %s", Integer.valueOf(i));
        if (i == 1) {
            this.f329356f = true;
            this.f329358h.setSpeakerphoneOn(true);
        } else if (i == 2) {
            this.f329356f = false;
            this.f329358h.setSpeakerphoneOn(false);
        } else if (i == 3) {
            if (this.f329359i.contains(4)) {
                mo161471M(4);
            }
            C110473c.f330370b = true;
            this.f329356f = false;
            this.f329358h.setSpeakerphoneOn(false);
        } else if (i == 4) {
            if (this.f329354d) {
                return 1;
            }
            ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
            int c = C110472b.m150370c(this.f329358h);
            this.f329354d = c == 1;
            this.f329356f = false;
            this.f329358h.setSpeakerphoneOn(false);
            if (c != 1) {
                z = false;
            }
            C110472b.f330366b = z;
            return c;
        }
        return -1;
    }

    /* renamed from: d */
    public int mo157507d(int i) {
        return this.f329358h.getStreamMaxVolume(i);
    }

    /* renamed from: g */
    public void mo157508g(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.BaseAudioManager", "setStreamVolume streamType:%s,index:%s,flags:%s ", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C107043a.m144905c(this.f329358h, i, i2, i3);
    }

    /* renamed from: k */
    public AudioManager mo157509k() {
        return this.f329358h;
    }

    /* renamed from: m */
    public boolean mo157510m() {
        AudioManager audioManager = this.f329358h;
        C87412m.m108594g(audioManager, "audioManager");
        return audioManager.isBluetoothScoOn();
    }

    /* renamed from: n */
    public void mo18028n(boolean z) {
        Integer lastElement;
        Integer lastElement2;
        boolean z2 = false;
        Log.printInfoStack("MicroMsg.BaseAudioManager", "request speaker on value %s", Boolean.valueOf(z));
        if (z) {
            Stack<Integer> stack = this.f329359i;
            C87412m.m108594g(stack, "mDeviceQueue");
            Log.m105924i("MicroMsg.SpeakerUtil", " request the speaker resource");
            if ((stack.size() == 1 && (lastElement2 = stack.lastElement()) != null && lastElement2.intValue() == 1) || stack.isEmpty() || (lastElement = stack.lastElement()) == null || lastElement.intValue() != 1) {
                if (stack.contains(1)) {
                    stack.removeElement(1);
                }
                stack.push(1);
                z2 = true;
            }
            Log.m105924i("MicroMsg.BaseAudioManager", "isSpeakerphoneOn is " + mo161485s() + " and ret is " + z2);
            mo161476S(true, 1);
            return;
        }
        Stack<Integer> stack2 = this.f329359i;
        C87412m.m108594g(stack2, "mDeviceQueue");
        Log.m105924i("MicroMsg.SpeakerUtil", "release the speaker resource");
        stack2.removeElement(1);
        C13598b0 b0Var = C13598b0.f38549a;
        mo161476S(false, 1);
    }

    /* renamed from: s */
    public boolean mo161485s() {
        AudioManager audioManager = this.f329358h;
        C87412m.m108594g(audioManager, "audioManager");
        return audioManager.isSpeakerphoneOn();
    }

    /* renamed from: t */
    public void mo157511t() {
        Log.m105924i("MicroMsg.BaseAudioManager", "reset speaker to normal");
        m149592a0(this, 0, (C32224a) null, 2, (Object) null);
        if (C11171e.m11045b(30)) {
            try {
                this.f329358h.setSpeakerphoneOn(this.f329357g);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: y */
    public void mo157512y() {
        C110472b.f330366b = C110472b.f330365a.mo161951b();
        C110473c.f330370b = C110248b.f329777h.mo161666k();
    }
}

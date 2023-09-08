package p489dh;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Set;
import p206nj.C11171e;
import p489dh.C107038f;
import p492dn.C107054l;
import zt3.C119157j;

/* renamed from: dh.d */
public final class C107036d extends C107032a {

    /* renamed from: c */
    public boolean f320442c;

    /* renamed from: d */
    public C107038f.C107039a f320443d;

    /* renamed from: e */
    public BluetoothDevice f320444e;

    /* renamed from: dh.d$a */
    public static final class C107037a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107036d f320445d;

        /* renamed from: e */
        public final /* synthetic */ BluetoothDevice f320446e;

        public C107037a(C107036d dVar, BluetoothDevice bluetoothDevice) {
            this.f320445d = dVar;
            this.f320446e = bluetoothDevice;
        }

        public final void run() {
            Log.m105924i("MicroMsg.ClassicalAudioProfile", "delay check bluetooth connected");
            if (this.f320445d.mo157486d() && !this.f320445d.f320442c) {
                Log.m105924i("MicroMsg.ClassicalAudioProfile", "current bluetooth need reponse");
                C107036d dVar = this.f320445d;
                BluetoothDevice bluetoothDevice = this.f320446e;
                dVar.f320444e = bluetoothDevice;
                String name = bluetoothDevice.getName();
                if (name == null) {
                    name = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                    C87412m.m108593f(name, "getContext().resources.g…g.audio_device_bluetooth)");
                }
                dVar.f320434b = new C107054l.C107055a(4, name, 0, 4, (C8480h) null);
                C107038f.C107039a aVar = this.f320445d.f320443d;
                if (aVar != null) {
                    String name2 = this.f320446e.getName();
                    if (name2 == null) {
                        name2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                        C87412m.m108593f(name2, "getContext().resources.g…g.audio_device_bluetooth)");
                    }
                    aVar.mo157481c(4, name2);
                }
            }
        }
    }

    /* renamed from: a */
    public String mo157483a(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        audioManager.setSpeakerphoneOn(false);
        audioManager.setMode(3);
        AudioManager audioManager2 = audioManager;
        C117292a.m165357c(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToBluetooth", "(Z)Ljava/lang/String;", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
        audioManager.startBluetoothSco();
        C117292a.m165359e(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToBluetooth", "(Z)Ljava/lang/String;", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
        if (C11171e.m11044a(31)) {
            audioManager.setBluetoothScoOn(true);
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
        }
        this.f320442c = true;
        BluetoothDevice bluetoothDevice = this.f320444e;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getName();
        }
        return null;
    }

    /* renamed from: b */
    public void mo157484b(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (this.f320442c) {
            if (C11171e.m11044a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            AudioManager audioManager2 = audioManager;
            C117292a.m165357c(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToHeadset", "(Z)V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            C117292a.m165359e(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToHeadset", "(Z)V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            this.f320442c = false;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
        }
        audioManager.setSpeakerphoneOn(false);
        audioManager.setMode(3);
    }

    /* renamed from: c */
    public void mo157485c(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        audioManager.setSpeakerphoneOn(false);
        if (this.f320442c) {
            if (C11171e.m11044a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            AudioManager audioManager2 = audioManager;
            C117292a.m165357c(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToEarPiece", "(Z)V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            C117292a.m165359e(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToEarPiece", "(Z)V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            this.f320442c = false;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
        }
        audioManager.setMode(3);
    }

    /* renamed from: d */
    public boolean mo157486d() {
        try {
            Object systemService = MMApplicationContext.getContext().getSystemService("audio");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            if (!((AudioManager) systemService).isBluetoothScoAvailableOffCall()) {
                Log.m105924i("MicroMsg.ClassicalAudioProfile", "isBluetoothScoAvailableOffCall false");
                return false;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (mo157491j() && defaultAdapter != null) {
                if (defaultAdapter.isEnabled()) {
                    if (defaultAdapter.getBondedDevices() != null) {
                        if (!defaultAdapter.getBondedDevices().isEmpty()) {
                            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                            C87412m.m108593f(bondedDevices, "adp.bondedDevices");
                            for (BluetoothDevice bondState : bondedDevices) {
                                if (bondState.getBondState() == 12) {
                                    Log.m105924i("MicroMsg.ClassicalAudioProfile", "current bluetooth adapter can working");
                                    return true;
                                }
                            }
                            Log.m105924i("MicroMsg.ClassicalAudioProfile", "current bluetooth can not use");
                        }
                    }
                    return false;
                }
            }
            Log.m105924i("MicroMsg.ClassicalAudioProfile", "bluetooth state " + mo157491j() + " and " + defaultAdapter + " and " + defaultAdapter.isEnabled());
            return false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ClassicalAudioProfile", e, (String) null, new Object[0]);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo157487e() {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (isWiredHeadsetOn || !C11171e.m11046c(23)) {
            return isWiredHeadsetOn;
        }
        if (C11171e.m11046c(23)) {
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            C87412m.m108593f(devices, "audioDevices");
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                Log.m105925i("MicroMsg.ClassicalAudioProfile", "isWireHeadsetPluggedNew, deviceInfo type: %s", Integer.valueOf(audioDeviceInfo.getType()));
                if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 11) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo157488f(C107038f.C107039a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f320443d = aVar;
    }

    /* renamed from: g */
    public boolean mo157489g() {
        return false;
    }

    /* renamed from: h */
    public void mo157490h(boolean z) {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (this.f320442c) {
            if (C11171e.m11044a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            AudioManager audioManager2 = audioManager;
            C117292a.m165357c(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToSpeaker", "(Z)V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            C117292a.m165359e(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "routeToSpeaker", "(Z)V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            this.f320442c = false;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
        }
        audioManager.setMode(3);
        audioManager.setSpeakerphoneOn(true);
    }

    /* renamed from: i */
    public void mo157459i(Intent intent) {
        String str;
        Intent intent2 = intent;
        C87412m.m108594g(intent2, "intent");
        String action = intent.getAction();
        if (action != null) {
            String str2 = null;
            switch (action.hashCode()) {
                case -1692127708:
                    if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                        try {
                            int intExtra = intent2.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                            try {
                                int intExtra2 = intent2.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                                if (intExtra == 0) {
                                    this.f320444e = null;
                                    mo157492k(4, (String) null);
                                }
                                Log.m105924i("MicroMsg.ClassicalAudioProfile", "ACTION_SCO_AUDIO_STATE_UPDATED current " + intExtra + " and prev is " + intExtra2);
                                return;
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e));
                                return;
                            }
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e2));
                            return;
                        }
                    } else {
                        return;
                    }
                case -1676458352:
                    if (action.equals("android.intent.action.HEADSET_PLUG")) {
                        try {
                            int intExtra3 = intent2.getIntExtra("state", -1);
                            try {
                                String stringExtra = intent2.getStringExtra("name");
                                try {
                                    int intExtra4 = intent2.getIntExtra("microphone", -1);
                                    Log.m105924i("MicroMsg.ClassicalAudioProfile", "currentState " + intExtra3 + " and " + stringExtra + " and " + intExtra4);
                                    if (intExtra3 == 0) {
                                        if (stringExtra == null) {
                                            stringExtra = "";
                                        }
                                        mo157492k(3, stringExtra);
                                        return;
                                    }
                                    if (stringExtra == null) {
                                        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.nce);
                                        C87412m.m108593f(string, "getContext().resources.g…ing.audio_device_headset)");
                                        str = string;
                                    } else {
                                        str = stringExtra;
                                    }
                                    this.f320433a = new C107054l.C107055a(3, str, 0, 4, (C8480h) null);
                                    C107038f.C107039a aVar = this.f320443d;
                                    if (aVar != null) {
                                        if (stringExtra == null) {
                                            stringExtra = MMApplicationContext.getContext().getResources().getString(C0966R.string.nce);
                                            C87412m.m108593f(stringExtra, "getContext().resources.g…ing.audio_device_headset)");
                                        }
                                        aVar.mo157481c(3, stringExtra);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e3));
                                    return;
                                }
                            } catch (Exception e4) {
                                Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e4));
                                return;
                            }
                        } catch (Exception e5) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e5));
                            return;
                        }
                    } else {
                        return;
                    }
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        try {
                            int intExtra5 = intent2.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                            try {
                                int intExtra6 = intent2.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
                                if (intExtra5 == 10) {
                                    this.f320444e = null;
                                    mo157492k(4, (String) null);
                                }
                                Log.m105924i("MicroMsg.ClassicalAudioProfile", "ACTION_STATE_CHANGED  prev state = " + intExtra6 + " and now state = " + intExtra5);
                                return;
                            } catch (Exception e6) {
                                Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e6));
                                return;
                            }
                        } catch (Exception e7) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e7));
                            return;
                        }
                    } else {
                        return;
                    }
                case -1435586571:
                    if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                        try {
                            int intExtra7 = intent2.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            try {
                                int intExtra8 = intent2.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                                try {
                                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                    if (intExtra7 == 12 && !C87412m.m108589b(this.f320444e, bluetoothDevice)) {
                                        this.f320444e = bluetoothDevice;
                                        String name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                                        if (name == null) {
                                            name = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                                            C87412m.m108593f(name, "getContext().resources.g…g.audio_device_bluetooth)");
                                        }
                                        this.f320434b = new C107054l.C107055a(4, name, 0, 4, (C8480h) null);
                                        C107038f.C107039a aVar2 = this.f320443d;
                                        if (aVar2 != null) {
                                            if (bluetoothDevice != null) {
                                                str2 = bluetoothDevice.getName();
                                            }
                                            if (str2 == null) {
                                                str2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                                                C87412m.m108593f(str2, "getContext().resources.g…g.audio_device_bluetooth)");
                                            }
                                            aVar2.mo157479a(4, str2);
                                        }
                                    }
                                    Log.m105924i("MicroMsg.ClassicalAudioProfile", "AUDIO_STATE_CHANGED prev state = " + intExtra8 + " and now state = " + intExtra7 + " and device=" + bluetoothDevice);
                                    return;
                                } catch (Exception e8) {
                                    Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e8));
                                    return;
                                }
                            } catch (Exception e9) {
                                Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e9));
                                return;
                            }
                        } catch (Exception e15) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e15));
                            return;
                        }
                    } else {
                        return;
                    }
                case -549244379:
                    if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                        Log.m105924i("MicroMsg.ClassicalAudioProfile", "ACTION_AUDIO_BECOMING_NOISY");
                        return;
                    }
                    return;
                case 17117692:
                    if (action.equals("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED")) {
                        try {
                            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            if (bluetoothDevice2 != null) {
                                Log.m105924i("MicroMsg.ClassicalAudioProfile", bluetoothDevice2 + " ACTIVE_DEVICE_CHANGED");
                                if (!C87412m.m108589b(this.f320444e, bluetoothDevice2)) {
                                    Log.m105924i("MicroMsg.ClassicalAudioProfile", "response " + bluetoothDevice2 + " ACTIVE_DEVICE_CHANGED");
                                    this.f320444e = bluetoothDevice2;
                                    String name2 = bluetoothDevice2.getName();
                                    if (name2 == null) {
                                        name2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                                        C87412m.m108593f(name2, "getContext().resources.g…g.audio_device_bluetooth)");
                                    }
                                    this.f320434b = new C107054l.C107055a(4, name2, 0, 4, (C8480h) null);
                                    C107038f.C107039a aVar3 = this.f320443d;
                                    if (aVar3 != null) {
                                        String name3 = bluetoothDevice2.getName();
                                        if (name3 == null) {
                                            name3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                                            C87412m.m108593f(name3, "getContext().resources.g…g.audio_device_bluetooth)");
                                        }
                                        aVar3.mo157481c(4, name3);
                                    }
                                    ((C119157j) C119157j.f356862d).mo183879j(new C107037a(this, bluetoothDevice2), 1000, "delayConnectBluetooth");
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e16) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e16));
                            return;
                        }
                    } else {
                        return;
                    }
                case 545516589:
                    if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        try {
                            int intExtra9 = intent2.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            try {
                                int intExtra10 = intent2.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                                try {
                                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                    if (intExtra9 == 0) {
                                        this.f320444e = null;
                                        if (bluetoothDevice3 != null) {
                                            str2 = bluetoothDevice3.getName();
                                        }
                                        mo157492k(4, str2);
                                    } else if (intExtra9 == 2) {
                                        this.f320444e = bluetoothDevice3;
                                        String name4 = bluetoothDevice3 != null ? bluetoothDevice3.getName() : null;
                                        if (name4 == null) {
                                            name4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                                            C87412m.m108593f(name4, "getContext().resources.g…g.audio_device_bluetooth)");
                                        }
                                        this.f320434b = new C107054l.C107055a(4, name4, 0, 4, (C8480h) null);
                                        C107038f.C107039a aVar4 = this.f320443d;
                                        if (aVar4 != null) {
                                            if (bluetoothDevice3 != null) {
                                                str2 = bluetoothDevice3.getName();
                                            }
                                            if (str2 == null) {
                                                str2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ncc);
                                                C87412m.m108593f(str2, "getContext().resources.g…g.audio_device_bluetooth)");
                                            }
                                            aVar4.mo157481c(4, str2);
                                        }
                                    }
                                    Log.m105924i("MicroMsg.ClassicalAudioProfile", "ACTION_CONNECTION_STATE_CHANGED " + bluetoothDevice3 + " prev state = " + intExtra10 + " and now state = " + intExtra9);
                                    return;
                                } catch (Exception e17) {
                                    Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e17));
                                    return;
                                }
                            } catch (Exception e18) {
                                Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e18));
                                return;
                            }
                        } catch (Exception e19) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e19));
                            return;
                        }
                    } else {
                        return;
                    }
                case 1821585647:
                    if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                        try {
                            BluetoothDevice bluetoothDevice4 = (BluetoothDevice) intent2.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            Log.m105924i("MicroMsg.ClassicalAudioProfile", "ACTION_ACL_DISCONNECTED acl " + bluetoothDevice4);
                            if (C87412m.m108589b(bluetoothDevice4, this.f320444e)) {
                                this.f320444e = null;
                                if (bluetoothDevice4 != null) {
                                    str2 = bluetoothDevice4.getName();
                                }
                                mo157492k(4, str2);
                                Log.m105924i("MicroMsg.ClassicalAudioProfile", "response ACTION_ACL_DISCONNECTED acl " + bluetoothDevice4);
                                return;
                            }
                            return;
                        } catch (Exception e25) {
                            Log.m105921e("MicroMsg.ClassicalAudioProfile", "%s", Util.stackTraceToString(e25));
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo157491j() {
        try {
            int profileConnectionState = BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1);
            Log.m105925i("MicroMsg.ClassicalAudioProfile", "isConnectHeadset getProfileConnectionState: %s", Integer.valueOf(profileConnectionState));
            return profileConnectionState == 2;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.ClassicalAudioProfile", "exception in isConnectDevice()");
            return false;
        }
    }

    /* renamed from: k */
    public final void mo157492k(int i, String str) {
        C107038f.C107039a aVar = this.f320443d;
        if (aVar != null) {
            aVar.mo157480b(i, str);
        }
    }

    public void release() {
        if (this.f320442c) {
            Object systemService = MMApplicationContext.getContext().getSystemService("audio");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (C11171e.m11044a(31)) {
                audioManager.setBluetoothScoOn(false);
            }
            AudioManager audioManager2 = audioManager;
            C117292a.m165357c(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "release", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            audioManager.stopBluetoothSco();
            C117292a.m165359e(audioManager2, "com/tencent/mm/audio/manager/ClassicalAudioProfile", "release", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            this.f320442c = false;
        }
        ((C119157j) C119157j.f356862d).mo183894y("delayConnectBluetooth");
    }
}

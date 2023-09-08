package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;
import p385u2.C111105a;

@C86522b
/* renamed from: com.tencent.mm.sdk.platformtools.PhoneStatusWatcher */
public final class PhoneStatusWatcher extends C86301e {
    private static final String TAG = "MicroMsg.PhoneStatusWatcher";
    /* access modifiers changed from: private */
    public static volatile boolean calling;

    /* renamed from: tm */
    private static final TelephonyManager[] f82614tm = {null};
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public final List<PhoneCallListener> phoneCallListeners = new ArrayList();

    /* renamed from: com.tencent.mm.sdk.platformtools.PhoneStatusWatcher$PhoneCallListener */
    public interface PhoneCallListener {
        void onPhoneCall(int i);
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.PhoneStatusWatcher$PhoneStateChangeDispatcher */
    public class PhoneStateChangeDispatcher extends PhoneStateListener {
        private PhoneStateChangeDispatcher() {
        }

        public void onCallStateChanged(final int i, String str) {
            ArrayList arrayList;
            synchronized (PhoneStatusWatcher.this.phoneCallListeners) {
                arrayList = new ArrayList(PhoneStatusWatcher.this.phoneCallListeners);
            }
            Log.m105925i(PhoneStatusWatcher.TAG, "alvinluo onCallStateChanged state: %d", Integer.valueOf(i));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PhoneCallListener) it.next()).onPhoneCall(i);
                }
            }
            C38166b.m41755b(StaticPhoneCallListener.class, new C38172g<StaticPhoneCallListener>() {
                public boolean invoke(StaticPhoneCallListener staticPhoneCallListener) {
                    staticPhoneCallListener.onPhoneCall(i);
                    return false;
                }
            });
            super.onCallStateChanged(i, str);
            if (i == 0) {
                boolean unused = PhoneStatusWatcher.calling = false;
            } else if (i == 1 || i == 2) {
                boolean unused2 = PhoneStatusWatcher.calling = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.PhoneStatusWatcher$StaticPhoneCallListener */
    public interface StaticPhoneCallListener extends C15510f {
        void onPhoneCall(int i);
    }

    private void initialize(Context context) {
        TelephonyManager[] telephonyManagerArr = f82614tm;
        if (telephonyManagerArr[0] == null) {
            synchronized (telephonyManagerArr) {
                if (telephonyManagerArr[0] == null) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    try {
                        PhoneStateChangeDispatcher phoneStateChangeDispatcher = new PhoneStateChangeDispatcher();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(32);
                        aVar.mo10233c(phoneStateChangeDispatcher);
                        C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/PhoneStatusWatcher", "initialize", "(Landroid/content/Context;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                        telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                        C117292a.m165359e(telephonyManager, "com/tencent/mm/sdk/platformtools/PhoneStatusWatcher", "initialize", "(Landroid/content/Context;)V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                        telephonyManagerArr[0] = telephonyManager;
                    } catch (Throwable th) {
                        Log.printErrStackTrace(TAG, th, "Failure, read_phone_state permission: %s", Boolean.valueOf(C111105a.m151499a(context, "android.permission.READ_PHONE_STATE") != 0));
                    }
                }
            }
        }
    }

    public static boolean isCalling() {
        Log.m105925i(TAG, "alvinluo isCalling: %b", Boolean.valueOf(calling));
        return calling;
    }

    public void addPhoneCallListener(PhoneCallListener phoneCallListener) {
        initialize(MMApplicationContext.getContext());
        synchronized (this.phoneCallListeners) {
            this.phoneCallListeners.add(phoneCallListener);
        }
    }

    public void clearPhoneCallListener() {
        synchronized (this.phoneCallListeners) {
            this.phoneCallListeners.clear();
        }
    }

    public void onCreate(Context context) {
        try {
            initialize(context);
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "Fail to do initialization.", new Object[0]);
        }
    }

    public void removePhoneCallListener(PhoneCallListener phoneCallListener) {
        synchronized (this.phoneCallListeners) {
            this.phoneCallListeners.remove(phoneCallListener);
        }
    }
}

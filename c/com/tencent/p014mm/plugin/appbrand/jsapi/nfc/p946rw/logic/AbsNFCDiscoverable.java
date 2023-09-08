package com.tencent.p014mm.plugin.appbrand.jsapi.nfc.p946rw.logic;

import am0.C79589b;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.utils.C84799z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32228q;
import gy3.C87412m;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;
import zl0.C91768a;
import zl0.C91772d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable */
public abstract class AbsNFCDiscoverable implements C91768a {

    /* renamed from: a */
    public final C84799z0 f242302a;

    /* renamed from: b */
    public volatile C32228q<? super byte[], ? super List<String>, ? super List<NdefMessage>, C13598b0> f242303b;

    /* renamed from: c */
    public final Set<C79589b> f242304c = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: d */
    public final AtomicBoolean f242305d = new AtomicBoolean(false);

    /* renamed from: e */
    public boolean f242306e;

    /* renamed from: f */
    public final AbsNFCDiscoverable$sysNfcSwitchToggleListener$1 f242307f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$a */
    public static final class C82864a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ AbsNFCDiscoverable f242308d;

        public C82864a(AbsNFCDiscoverable absNFCDiscoverable) {
            this.f242308d = absNFCDiscoverable;
        }

        /* renamed from: c */
        public void mo109497c() {
            Context applicationContext;
            Log.m105918d("MicroMsg.AppBrand.AbsNFCDiscoverable", "onDestroy");
            Activity activity = this.f242308d.f242302a.getActivity();
            if (!(activity == null || (applicationContext = activity.getApplicationContext()) == null)) {
                applicationContext.unregisterReceiver(this.f242308d.f242307f);
            }
            this.f242308d.getClass();
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            NfcAdapter defaultAdapter;
            Log.m105918d("MicroMsg.AppBrand.AbsNFCDiscoverable", "onPause");
            C91772d dVar = (C91772d) this.f242308d;
            if (dVar.f242305d.getAndSet(false)) {
                Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onPause, isNFCDiscovering");
                try {
                    Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode");
                    Activity activity = dVar.f242302a.getActivity();
                    if (!(activity == null || (defaultAdapter = NfcAdapter.getDefaultAdapter(MMApplicationContext.getContext())) == null)) {
                        defaultAdapter.disableReaderMode(activity);
                    }
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode failed since " + e);
                }
                dVar.f242306e = true;
            }
        }

        /* renamed from: f */
        public void mo109498f() {
            NfcAdapter defaultAdapter;
            Log.m105918d("MicroMsg.AppBrand.AbsNFCDiscoverable", "onResume");
            C91772d dVar = (C91772d) this.f242308d;
            if (dVar.f242306e) {
                Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onResume, isNFCDiscoverySticky");
                NfcAdapter defaultAdapter2 = NfcAdapter.getDefaultAdapter(MMApplicationContext.getContext());
                if (!(defaultAdapter2 != null && true == defaultAdapter2.isEnabled())) {
                    Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "onResume, nfc is not enabled");
                    return;
                }
                try {
                    Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode");
                    Activity activity = dVar.f242302a.getActivity();
                    if (!(activity == null || (defaultAdapter = NfcAdapter.getDefaultAdapter(MMApplicationContext.getContext())) == null)) {
                        defaultAdapter.enableReaderMode(activity, dVar.f262829g, 15, (Bundle) null);
                    }
                    dVar.f242305d.set(true);
                } catch (Exception e) {
                    Log.m105928w("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode failed since " + e);
                }
                dVar.f242306e = false;
            }
        }
    }

    public AbsNFCDiscoverable(String str, C84799z0 z0Var) {
        Context applicationContext;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(z0Var, "activityProvider");
        this.f242302a = z0Var;
        AbsNFCDiscoverable$sysNfcSwitchToggleListener$1 absNFCDiscoverable$sysNfcSwitchToggleListener$1 = new AbsNFCDiscoverable$sysNfcSwitchToggleListener$1(this);
        this.f242307f = absNFCDiscoverable$sysNfcSwitchToggleListener$1;
        Activity activity = z0Var.getActivity();
        if (!(activity == null || (applicationContext = activity.getApplicationContext()) == null)) {
            applicationContext.registerReceiver(absNFCDiscoverable$sysNfcSwitchToggleListener$1, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        }
        C83231l.m102140a(str, new C82864a(this));
    }

    /* renamed from: a */
    public final C91768a.C91769a mo115088a() {
        this.f242306e = false;
        if (!this.f242305d.get()) {
            return C91768a.C91769a.FAIL_NOT_STARTED;
        }
        try {
            Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode");
            Activity activity = ((C91772d) this).f242302a.getActivity();
            if (activity == null) {
                Log.m105920e("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "disableReaderMode, activity is null");
            } else {
                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(MMApplicationContext.getContext());
                C87412m.m108591d(defaultAdapter);
                defaultAdapter.disableReaderMode(activity);
            }
            this.f242305d.set(false);
            return C91768a.C91769a.SUCCESS;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AbsNFCDiscoverable", "stopDiscovery failed since " + e);
            return C91768a.C91769a.FAIL_SYSTEM_INTERNAL_ERROR;
        }
    }

    /* renamed from: b */
    public Set<C79589b> mo115089b() {
        return this.f242304c;
    }

    /* renamed from: c */
    public void mo115090c(C32228q<? super byte[], ? super List<String>, ? super List<NdefMessage>, C13598b0> qVar) {
        this.f242303b = qVar;
    }

    /* renamed from: d */
    public final C91768a.C91769a mo115091d() {
        if (this.f242305d.get()) {
            return C91768a.C91769a.FAIL_ALREADY_STARTED;
        }
        try {
            C91772d dVar = (C91772d) this;
            Log.m105924i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode");
            Activity activity = dVar.f242302a.getActivity();
            if (activity == null) {
                Log.m105920e("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "enableReaderMode, activity is null");
            } else {
                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(MMApplicationContext.getContext());
                C87412m.m108591d(defaultAdapter);
                defaultAdapter.enableReaderMode(activity, dVar.f262829g, 15, (Bundle) null);
            }
            this.f242305d.set(true);
            return C91768a.C91769a.SUCCESS;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AbsNFCDiscoverable", "startDiscovery failed since " + e);
            return C91768a.C91769a.FAIL_SYSTEM_INTERNAL_ERROR;
        }
    }

    /* renamed from: e */
    public boolean mo115092e() {
        if (this.f242305d.get()) {
            Log.m105924i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, isDiscovering, using");
            return true;
        }
        Set<C79589b> set = this.f242304c;
        C87412m.m108593f(set, "connectedTech");
        if (!set.isEmpty()) {
            Log.m105924i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, connected, using");
            return true;
        }
        Log.m105924i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, not using");
        return false;
    }

    /* renamed from: f */
    public void mo115093f(boolean z) {
    }
}

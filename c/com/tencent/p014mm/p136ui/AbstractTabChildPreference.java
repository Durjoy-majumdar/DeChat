package com.tencent.p014mm.p136ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.base.preference.MMPreferenceFragment;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.AbstractTabChildPreference */
public abstract class AbstractTabChildPreference extends MMPreferenceFragment implements C74940w0 {

    /* renamed from: j */
    public boolean f214123j;

    /* renamed from: n */
    public Bundle f214124n;

    /* renamed from: o */
    public boolean f214125o;

    /* renamed from: p */
    public boolean f214126p = false;

    /* renamed from: q */
    public boolean f214127q = false;

    /* renamed from: r */
    public boolean f214128r;

    /* renamed from: A */
    public void mo101233A() {
        mo25922t();
        this.f214125o = true;
    }

    /* renamed from: E */
    public void mo101234E() {
        this.f214127q = true;
    }

    /* renamed from: O */
    public abstract void mo25888O(Bundle bundle);

    /* renamed from: P */
    public abstract void mo25889P();

    /* renamed from: Q */
    public abstract void mo25890Q();

    /* renamed from: R */
    public abstract void mo25891R();

    /* renamed from: S */
    public abstract void mo25892S();

    /* renamed from: T */
    public abstract void mo25893T();

    /* renamed from: l */
    public void mo101242l() {
        int L;
        if (this.f214126p) {
            if (this.f214123j) {
                mo25888O(this.f214124n);
                this.f214123j = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f214125o) {
                mo25918r();
                this.f214125o = false;
            }
            if (!this.f215105h && (L = mo25882L()) != -1) {
                this.f215101d.mo72520b(L);
                this.f215105h = true;
            }
            mo25891R();
            Log.m105918d("MicroMsg.INIT", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - currentTimeMillis));
            this.f214128r = true;
            this.f214126p = false;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f214124n = bundle;
        this.f214123j = true;
    }

    public void onDestroy() {
        mo25889P();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (this.f214128r) {
            long currentTimeMillis = System.currentTimeMillis();
            mo25890Q();
            Log.m105918d("MicroMsg.INIT", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - currentTimeMillis));
            this.f214128r = false;
        }
    }

    public void onResume() {
        super.onResume();
        mo25873D();
        LauncherUI instance = LauncherUI.getInstance();
        if (instance != null && instance.f214342r) {
            this.f214126p = true;
            if (this.f214127q) {
                mo101242l();
                this.f214127q = false;
            }
        }
    }

    public void onStart() {
        super.onStart();
        LauncherUI instance = LauncherUI.getInstance();
        if (instance != null && instance.f214342r) {
            mo25892S();
        }
    }

    public void onStop() {
        super.onStop();
        mo25893T();
    }
}

package go3;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import dl3.C45413b;
import gy3.C87412m;
import hk1.C59932c;

/* renamed from: go3.d */
public abstract class C59600d implements C45413b {

    /* renamed from: d */
    public boolean f170310d;

    /* renamed from: a */
    public void mo84135a() {
    }

    /* renamed from: b */
    public void mo84136b() {
    }

    /* renamed from: c */
    public long mo79974c() {
        return 1;
    }

    /* renamed from: d */
    public boolean mo79975d() {
        return this instanceof C59932c;
    }

    /* renamed from: e */
    public abstract void mo79961e();

    /* renamed from: f */
    public abstract void mo79962f();

    /* renamed from: g */
    public abstract void mo79963g();

    /* renamed from: h */
    public abstract void mo79964h();

    /* renamed from: i */
    public abstract void mo79965i(float f);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onBeforeFinish(Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onCreateAfter(Bundle bundle) {
    }

    public void onCreateBefore(Bundle bundle) {
    }

    public abstract void onDestroy();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return false;
    }

    public void onNewIntent(Intent intent) {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}

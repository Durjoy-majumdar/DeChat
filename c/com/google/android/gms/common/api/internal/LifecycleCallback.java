package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {
    public final LifecycleFragment mLifecycleFragment;

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static LifecycleFragment getFragment(Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    public static LifecycleFragment getFragment(LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzbv()) {
            return zzcc.zza(lifecycleActivity.zzby());
        }
        if (lifecycleActivity.zzbw()) {
            return zzbr.zzc(lifecycleActivity.zzbx());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Activity getActivity() {
        return this.mLifecycleFragment.getLifecycleActivity();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
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

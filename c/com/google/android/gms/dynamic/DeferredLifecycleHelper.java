package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */
    public T zzabc;
    /* access modifiers changed from: private */
    public Bundle zzabd;
    /* access modifiers changed from: private */
    public LinkedList<zza> zzabe;
    private final OnDelegateCreatedListener<T> zzabf = new zza(this);

    public interface zza {
        int getState();

        void zza(LifecycleDelegate lifecycleDelegate);
    }

    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String errorMessage = ConnectionErrorMessages.getErrorMessage(context, isGooglePlayServicesAvailable);
        String errorDialogButtonMessage = ConnectionErrorMessages.getErrorDialogButtonMessage(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(errorMessage);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, (String) null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(errorDialogButtonMessage);
            linearLayout.addView(button);
            button.setOnClickListener(new zze(context, errorResolutionIntent));
        }
    }

    private final void zza(Bundle bundle, zza zza2) {
        T t = this.zzabc;
        if (t != null) {
            zza2.zza(t);
            return;
        }
        if (this.zzabe == null) {
            this.zzabe = new LinkedList<>();
        }
        this.zzabe.add(zza2);
        if (bundle != null) {
            Bundle bundle2 = this.zzabd;
            if (bundle2 == null) {
                this.zzabd = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zzabf);
    }

    private final void zzm(int i) {
        while (!this.zzabe.isEmpty() && this.zzabe.getLast().getState() >= i) {
            this.zzabe.removeLast();
        }
    }

    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public T getDelegate() {
        return this.zzabc;
    }

    public void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    public void onCreate(Bundle bundle) {
        zza(bundle, (zza) new zzc(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zza(bundle, (zza) new zzd(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zzabc == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        T t = this.zzabc;
        if (t != null) {
            t.onDestroy();
        } else {
            zzm(1);
        }
    }

    public void onDestroyView() {
        T t = this.zzabc;
        if (t != null) {
            t.onDestroyView();
        } else {
            zzm(2);
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zza(bundle2, (zza) new zzb(this, activity, bundle, bundle2));
    }

    public void onLowMemory() {
        T t = this.zzabc;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void onPause() {
        T t = this.zzabc;
        if (t != null) {
            t.onPause();
        } else {
            zzm(5);
        }
    }

    public void onResume() {
        zza((Bundle) null, (zza) new zzg(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        T t = this.zzabc;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.zzabd;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        zza((Bundle) null, (zza) new zzf(this));
    }

    public void onStop() {
        T t = this.zzabc;
        if (t != null) {
            t.onStop();
        } else {
            zzm(4);
        }
    }
}

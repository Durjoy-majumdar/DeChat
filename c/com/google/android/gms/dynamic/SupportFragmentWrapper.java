package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.gms.dynamic.IFragmentWrapper;
import j20.C117292a;
import k20.C9556a;

public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {
    private byte _hellAccFlag_;
    private Fragment zzabq;

    private SupportFragmentWrapper(Fragment fragment) {
        this.zzabq = fragment;
    }

    public static SupportFragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    public final IObjectWrapper getActivity() {
        return ObjectWrapper.wrap(this.zzabq.getActivity());
    }

    public final Bundle getArguments() {
        return this.zzabq.getArguments();
    }

    public final int getId() {
        return this.zzabq.getId();
    }

    public final IFragmentWrapper getParentFragment() {
        return wrap(this.zzabq.getParentFragment());
    }

    public final IObjectWrapper getResources() {
        return ObjectWrapper.wrap(this.zzabq.getResources());
    }

    public final boolean getRetainInstance() {
        return this.zzabq.getRetainInstance();
    }

    public final String getTag() {
        return this.zzabq.getTag();
    }

    public final IFragmentWrapper getTargetFragment() {
        return wrap(this.zzabq.getTargetFragment());
    }

    public final int getTargetRequestCode() {
        return this.zzabq.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint() {
        return this.zzabq.getUserVisibleHint();
    }

    public final IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.zzabq.getView());
    }

    public final boolean isAdded() {
        return this.zzabq.isAdded();
    }

    public final boolean isDetached() {
        return this.zzabq.isDetached();
    }

    public final boolean isHidden() {
        return this.zzabq.isHidden();
    }

    public final boolean isInLayout() {
        return this.zzabq.isInLayout();
    }

    public final boolean isRemoving() {
        return this.zzabq.isRemoving();
    }

    public final boolean isResumed() {
        return this.zzabq.isResumed();
    }

    public final boolean isVisible() {
        return this.zzabq.isVisible();
    }

    public final void registerForContextMenu(IObjectWrapper iObjectWrapper) {
        this.zzabq.registerForContextMenu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void setHasOptionsMenu(boolean z) {
        this.zzabq.setHasOptionsMenu(z);
    }

    public final void setMenuVisibility(boolean z) {
        this.zzabq.setMenuVisibility(z);
    }

    public final void setRetainInstance(boolean z) {
        this.zzabq.setRetainInstance(z);
    }

    public final void setUserVisibleHint(boolean z) {
        this.zzabq.setUserVisibleHint(z);
    }

    public final void startActivity(Intent intent) {
        Fragment fragment = this.zzabq;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Fragment fragment2 = fragment;
        C117292a.m165358d(fragment2, aVar.mo10232b(), "com/google/android/gms/dynamic/SupportFragmentWrapper", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fragment.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(fragment2, "com/google/android/gms/dynamic/SupportFragmentWrapper", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.zzabq.startActivityForResult(intent, i);
    }

    public final void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
        this.zzabq.unregisterForContextMenu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}

package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;
import j20.C117292a;
import k20.C9556a;

public final class FragmentWrapper extends IFragmentWrapper.Stub {
    private byte _hellAccFlag_;
    private Fragment zzabm;

    private FragmentWrapper(Fragment fragment) {
        this.zzabm = fragment;
    }

    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    public final IObjectWrapper getActivity() {
        return ObjectWrapper.wrap(this.zzabm.getActivity());
    }

    public final Bundle getArguments() {
        return this.zzabm.getArguments();
    }

    public final int getId() {
        return this.zzabm.getId();
    }

    public final IFragmentWrapper getParentFragment() {
        return wrap(this.zzabm.getParentFragment());
    }

    public final IObjectWrapper getResources() {
        return ObjectWrapper.wrap(this.zzabm.getResources());
    }

    public final boolean getRetainInstance() {
        return this.zzabm.getRetainInstance();
    }

    public final String getTag() {
        return this.zzabm.getTag();
    }

    public final IFragmentWrapper getTargetFragment() {
        return wrap(this.zzabm.getTargetFragment());
    }

    public final int getTargetRequestCode() {
        return this.zzabm.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint() {
        return this.zzabm.getUserVisibleHint();
    }

    public final IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.zzabm.getView());
    }

    public final boolean isAdded() {
        return this.zzabm.isAdded();
    }

    public final boolean isDetached() {
        return this.zzabm.isDetached();
    }

    public final boolean isHidden() {
        return this.zzabm.isHidden();
    }

    public final boolean isInLayout() {
        return this.zzabm.isInLayout();
    }

    public final boolean isRemoving() {
        return this.zzabm.isRemoving();
    }

    public final boolean isResumed() {
        return this.zzabm.isResumed();
    }

    public final boolean isVisible() {
        return this.zzabm.isVisible();
    }

    public final void registerForContextMenu(IObjectWrapper iObjectWrapper) {
        this.zzabm.registerForContextMenu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void setHasOptionsMenu(boolean z) {
        this.zzabm.setHasOptionsMenu(z);
    }

    public final void setMenuVisibility(boolean z) {
        this.zzabm.setMenuVisibility(z);
    }

    public final void setRetainInstance(boolean z) {
        this.zzabm.setRetainInstance(z);
    }

    public final void setUserVisibleHint(boolean z) {
        this.zzabm.setUserVisibleHint(z);
    }

    public final void startActivity(Intent intent) {
        Fragment fragment = this.zzabm;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Fragment fragment2 = fragment;
        C117292a.m165358d(fragment2, aVar.mo10232b(), "com/google/android/gms/dynamic/FragmentWrapper", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fragment.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(fragment2, "com/google/android/gms/dynamic/FragmentWrapper", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.zzabm.startActivityForResult(intent, i);
    }

    public final void unregisterForContextMenu(IObjectWrapper iObjectWrapper) {
        this.zzabm.unregisterForContextMenu((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}

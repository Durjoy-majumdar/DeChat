package com.tencent.p014mm.p136ui.component;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C16795g;
import bl3.C54492n;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QB\u0011\b\u0016\u0012\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bP\u0010TB\t\b\u0016¢\u0006\u0004\bP\u0010UJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0017J\b\u0010\u0016\u001a\u00020\u0005H\u0017J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\"\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J/\u0010$\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\u0012\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016J\u0018\u00100\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016J$\u00102\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0007H\u0016J\u0012\u00106\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u00020\u0005H\u0016R\"\u00109\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b?\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0011\u0010M\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006V"}, mo182094d2 = {"Lcom/tencent/mm/ui/component/UIComponent;", "Lbl3/n;", "Lbl3/g;", "Landroid/os/Bundle;", "savedInstanceState", "Lrx3/b0;", "onCreate", "", "isBelongFragment", "onCreateBefore", "onCreateAfter", "outState", "onSaveInstanceState", "onRestoreInstanceState", "", "getLayoutId", "onStart", "onResume", "Landroid/view/View;", "contentView", "onViewCreated", "onUserVisibleFocused", "onUserVisibleUnFocused", "onPause", "onStop", "onDestroy", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onBackPressed", "intent", "onNewIntent", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "onKeyUp", "options", "onStartActivityForResult", "hasFocus", "onWindowFocusChanged", "resultIntent", "onBeforeFinish", "onFinished", "onBeforeFinishAfterTransition", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "isUserVisibleFocused", "Z", "()Z", "setUserVisibleFocused", "(Z)V", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", "context", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "()V", "plugin-uic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.component.UIComponent */
public abstract class UIComponent extends C54492n implements C16795g {
    private Bundle arguments;
    private boolean isUserVisibleFocused;
    public View rootView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UIComponent(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public final Bundle getArguments() {
        return this.arguments;
    }

    public final Activity getContext() {
        return getActivity();
    }

    public int getLayoutId() {
        return 0;
    }

    public final View getRootView() {
        View view = this.rootView;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("rootView");
        throw null;
    }

    public final boolean isBelongFragment() {
        return getFragment() != null;
    }

    public final boolean isUserVisibleFocused() {
        return this.isUserVisibleFocused;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onBeforeFinish(Intent intent) {
    }

    public void onBeforeFinishAfterTransition() {
    }

    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onCreate(Bundle bundle) {
    }

    public void onCreateAfter(Bundle bundle) {
    }

    public void onCreateBefore(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onFinished() {
    }

    public boolean onInterceptFinish() {
        return false;
    }

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

    public void onPostDestroyed() {
    }

    public void onPreDestroyed() {
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

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
    }

    public void onStop() {
    }

    public void onUserVisibleFocused() {
        this.isUserVisibleFocused = true;
    }

    public void onUserVisibleUnFocused() {
        this.isUserVisibleFocused = false;
    }

    public void onViewCreated(View view) {
        C87412m.m108594g(view, "contentView");
    }

    public void onWindowFocusChanged(boolean z) {
    }

    public final void setArguments(Bundle bundle) {
        this.arguments = bundle;
    }

    public final void setRootView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.rootView = view;
    }

    public final void setUserVisibleFocused(boolean z) {
        this.isUserVisibleFocused = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UIComponent(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public UIComponent() {
    }
}

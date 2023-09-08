package androidx.appcompat.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.C103527f;
import androidx.appcompat.widget.C103551m0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import p1042u.C111057f;
import p385u2.C111105a;
import p918s2.C110717l;
import p918s2.C90111a;
import p918s2.C90115d;
import p990k.C108781a;
import p990k.C108787f;

public class AppCompatActivity extends FragmentActivity implements C103414f, C110717l.C110718a {
    private C103415g mDelegate;
    private Resources mResources;
    private int mThemeId = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performMenuItemShortcut(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.performMenuItemShortcut(int, android.view.KeyEvent):boolean");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143400p();
        ((ViewGroup) appCompatDelegateImpl.f305028x.findViewById(16908290)).addView(view, layoutParams);
        appCompatDelegateImpl.f305013f.onContentChanged();
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo91096g()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo91110u(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143400p();
        return appCompatDelegateImpl.f305012e.findViewById(i);
    }

    public C103415g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new AppCompatDelegateImpl(this, getWindow(), this);
        }
        return this.mDelegate;
    }

    public C103408a getDrawerToggleDelegate() {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.getClass();
        return new AppCompatDelegateImpl.C103400b(appCompatDelegateImpl);
    }

    public MenuInflater getMenuInflater() {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        if (appCompatDelegateImpl.f305017j == null) {
            appCompatDelegateImpl.mo143403s();
            ActionBar actionBar = appCompatDelegateImpl.f305016i;
            appCompatDelegateImpl.f305017j = new C108787f(actionBar != null ? actionBar.mo91102m() : appCompatDelegateImpl.f305011d);
        }
        return appCompatDelegateImpl.f305017j;
    }

    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = C103551m0.f305819a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143403s();
        return appCompatDelegateImpl.f305016i;
    }

    public Intent getSupportParentActivityIntent() {
        return C90115d.m112743a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo143386d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        if (appCompatDelegateImpl.f304991C && appCompatDelegateImpl.f305027w) {
            appCompatDelegateImpl.mo143403s();
            ActionBar actionBar = appCompatDelegateImpl.f305016i;
            if (actionBar != null) {
                actionBar.mo91107r(configuration);
            }
        }
        C103527f g = C103527f.m137545g();
        Context context = appCompatDelegateImpl.f305011d;
        synchronized (g) {
            C111057f fVar = g.f305732d.get(context);
            if (fVar != null) {
                fVar.clear();
            }
        }
        appCompatDelegateImpl.mo143383a();
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreate(Bundle bundle) {
        int i;
        C103415g delegate = getDelegate();
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) delegate;
        LayoutInflater from = LayoutInflater.from(appCompatDelegateImpl.f305011d);
        if (from.getFactory() == null) {
            from.setFactory2(appCompatDelegateImpl);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
        delegate.mo143387e(bundle);
        if (delegate.mo143383a() && (i = this.mThemeId) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.mThemeId, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(C110717l lVar) {
        lVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C90115d.m112743a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(lVar.f331179e.getPackageManager());
            }
            int size = lVar.f331178d.size();
            try {
                Intent b = C90115d.m112744b(lVar.f331179e, component);
                while (b != null) {
                    lVar.f331178d.add(size, b);
                    b = C90115d.m112744b(lVar.f331179e, b.getComponent());
                }
                lVar.f331178d.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        if (appCompatDelegateImpl.f305004Q) {
            appCompatDelegateImpl.f305012e.getDecorView().removeCallbacks(appCompatDelegateImpl.f305006S);
        }
        appCompatDelegateImpl.f305000L = true;
        ActionBar actionBar = appCompatDelegateImpl.f305016i;
        if (actionBar != null) {
            actionBar.mo91108s();
        }
        AppCompatDelegateImpl.C103405f fVar = appCompatDelegateImpl.f305003P;
        if (fVar != null && (broadcastReceiver = fVar.f305058c) != null) {
            AppCompatDelegateImpl.this.f305011d.unregisterReceiver(broadcastReceiver);
            fVar.f305058c = null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo91100k() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AppCompatDelegateImpl) getDelegate()).mo143400p();
    }

    public void onPostResume() {
        super.onPostResume();
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143403s();
        ActionBar actionBar = appCompatDelegateImpl.f305016i;
        if (actionBar != null) {
            actionBar.mo91092J(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(C110717l lVar) {
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i = ((AppCompatDelegateImpl) getDelegate()).f305001M;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    public void onStart() {
        super.onStart();
        ((AppCompatDelegateImpl) getDelegate()).mo143383a();
    }

    public void onStop() {
        BroadcastReceiver broadcastReceiver;
        super.onStop();
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143403s();
        ActionBar actionBar = appCompatDelegateImpl.f305016i;
        if (actionBar != null) {
            actionBar.mo91092J(false);
        }
        AppCompatDelegateImpl.C103405f fVar = appCompatDelegateImpl.f305003P;
        if (fVar != null && (broadcastReceiver = fVar.f305058c) != null) {
            AppCompatDelegateImpl.this.f305011d.unregisterReceiver(broadcastReceiver);
            fVar.f305058c = null;
        }
    }

    public void onSupportActionModeFinished(C108781a aVar) {
    }

    public void onSupportActionModeStarted(C108781a aVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C110717l lVar = new C110717l(this);
            onCreateSupportNavigateUpTaskStack(lVar);
            onPrepareSupportNavigateUpTaskStack(lVar);
            if (!lVar.f331178d.isEmpty()) {
                ArrayList<Intent> arrayList = lVar.f331178d;
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Context context = lVar.f331179e;
                Object obj = C111105a.f332697a;
                C111105a.C90592a.m113490a(context, intentArr, (Bundle) null);
                try {
                    int i = C90111a.f258766c;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo143390h(charSequence);
    }

    public C108781a onWindowStartingSupportActionMode(C108781a.C108782a aVar) {
        return null;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo91111v()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        getDelegate().mo143389g(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        if (appCompatDelegateImpl.f305013f instanceof Activity) {
            appCompatDelegateImpl.mo143403s();
            ActionBar actionBar = appCompatDelegateImpl.f305016i;
            if (!(actionBar instanceof C103431r)) {
                appCompatDelegateImpl.f305017j = null;
                if (actionBar != null) {
                    actionBar.mo91108s();
                }
                if (toolbar != null) {
                    C103425o oVar = new C103425o(toolbar, ((Activity) appCompatDelegateImpl.f305013f).getTitle(), appCompatDelegateImpl.f305014g);
                    appCompatDelegateImpl.f305016i = oVar;
                    appCompatDelegateImpl.f305012e.setCallback(oVar.f305092c);
                } else {
                    appCompatDelegateImpl.f305016i = null;
                    appCompatDelegateImpl.f305012e.setCallback(appCompatDelegateImpl.f305014g);
                }
                appCompatDelegateImpl.mo143386d();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    public C108781a startSupportActionMode(C108781a.C108782a aVar) {
        return getDelegate().mo143391i(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo143386d();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo143388f(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public void setContentView(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143400p();
        ViewGroup viewGroup = (ViewGroup) appCompatDelegateImpl.f305028x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        appCompatDelegateImpl.f305013f.onContentChanged();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) getDelegate();
        appCompatDelegateImpl.mo143400p();
        ViewGroup viewGroup = (ViewGroup) appCompatDelegateImpl.f305028x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        appCompatDelegateImpl.f305013f.onContentChanged();
    }
}

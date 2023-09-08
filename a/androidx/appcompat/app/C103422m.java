package androidx.appcompat.app;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import p849e3.C107177e;
import p990k.C108781a;

/* renamed from: androidx.appcompat.app.m */
public class C103422m extends Dialog implements C103414f {

    /* renamed from: d */
    public C103415g f305079d;

    /* renamed from: e */
    public final C107177e.C107178a f305080e;

    /* renamed from: androidx.appcompat.app.m$a */
    public class C103423a implements C107177e.C107178a {
        public C103423a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return C103422m.this.mo143459B(keyEvent);
        }
    }

    public C103422m(Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo143459B(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: C */
    public boolean mo143460C(int i) {
        return mo143466u().mo143388f(i);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) mo143466u();
        appCompatDelegateImpl.mo143400p();
        ((ViewGroup) appCompatDelegateImpl.f305028x.findViewById(16908290)).addView(view, layoutParams);
        appCompatDelegateImpl.f305013f.onContentChanged();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C107177e.m145060b(this.f305080e, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) mo143466u();
        appCompatDelegateImpl.mo143400p();
        return appCompatDelegateImpl.f305012e.findViewById(i);
    }

    public void invalidateOptionsMenu() {
        mo143466u().mo143386d();
    }

    public void onCreate(Bundle bundle) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) mo143466u();
        LayoutInflater from = LayoutInflater.from(appCompatDelegateImpl.f305011d);
        if (from.getFactory() == null) {
            from.setFactory2(appCompatDelegateImpl);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
        super.onCreate(bundle);
        mo143466u().mo143387e(bundle);
    }

    public void onStop() {
        BroadcastReceiver broadcastReceiver;
        super.onStop();
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) mo143466u();
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

    public C108781a onWindowStartingSupportActionMode(C108781a.C108782a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo143466u().mo143389g(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo143466u().mo143390h(charSequence);
    }

    /* renamed from: u */
    public C103415g mo143466u() {
        if (this.f305079d == null) {
            this.f305079d = new AppCompatDelegateImpl(getContext(), getWindow(), this);
        }
        return this.f305079d;
    }

    public C103422m(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f305080e = new C103423a();
    }

    public void setContentView(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) mo143466u();
        appCompatDelegateImpl.mo143400p();
        ViewGroup viewGroup = (ViewGroup) appCompatDelegateImpl.f305028x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        appCompatDelegateImpl.f305013f.onContentChanged();
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo143466u().mo143390h(getContext().getString(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103422m(android.content.Context r4, int r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0014
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 2130968958(0x7f04017e, float:1.7546584E38)
            r2 = 1
            r0.resolveAttribute(r1, r5, r2)
            int r5 = r5.resourceId
        L_0x0014:
            r3.<init>(r4, r5)
            androidx.appcompat.app.m$a r4 = new androidx.appcompat.app.m$a
            r4.<init>()
            r3.f305080e = r4
            androidx.appcompat.app.g r4 = r3.mo143466u()
            r5 = 0
            r4.mo143387e(r5)
            androidx.appcompat.app.g r4 = r3.mo143466u()
            r4.mo143383a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C103422m.<init>(android.content.Context, int):void");
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) mo143466u();
        appCompatDelegateImpl.mo143400p();
        ViewGroup viewGroup = (ViewGroup) appCompatDelegateImpl.f305028x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        appCompatDelegateImpl.f305013f.onContentChanged();
    }
}

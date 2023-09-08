package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p329d3.C20434g;
import p385u2.C111105a;
import p918s2.C90111a;

/* renamed from: androidx.fragment.app.r */
public abstract class C112958r<E> extends C112946o {

    /* renamed from: d */
    public final Activity f338159d;

    /* renamed from: e */
    public final Context f338160e;

    /* renamed from: f */
    public final Handler f338161f;

    /* renamed from: g */
    public final FragmentManager f338162g = new FragmentManagerImpl();

    public C112958r(Activity activity, Context context, Handler handler, int i) {
        this.f338159d = activity;
        C20434g.m22020d(context, "context == null");
        Context context2 = context;
        this.f338160e = context;
        C20434g.m22020d(handler, "handler == null");
        Handler handler2 = handler;
        this.f338161f = handler;
    }

    /* renamed from: b */
    public View mo164813b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo164814c() {
        return true;
    }

    /* renamed from: d */
    public void mo164996d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public abstract E mo164997e();

    /* renamed from: f */
    public LayoutInflater mo164998f() {
        return LayoutInflater.from(this.f338160e);
    }

    @Deprecated
    /* renamed from: g */
    public void mo165246g(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: h */
    public boolean mo164999h(Fragment fragment) {
        return true;
    }

    /* renamed from: i */
    public boolean mo165000i(String str) {
        return false;
    }

    /* renamed from: j */
    public void mo165247j(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            Context context = this.f338160e;
            Object obj = C111105a.f332697a;
            C111105a.C90592a.m113491b(context, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: k */
    public void mo165248k(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            Activity activity = this.f338159d;
            int i5 = C90111a.f258766c;
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: l */
    public void mo165001l() {
    }
}

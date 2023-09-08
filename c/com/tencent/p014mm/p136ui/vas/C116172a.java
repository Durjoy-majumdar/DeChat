package com.tencent.p014mm.p136ui.vas;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.C112958r;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import gy3.C87412m;
import j20.C117292a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k20.C60958c;
import k20.C9556a;
import p918s2.C90111a;

/* renamed from: com.tencent.mm.ui.vas.a */
public final class C116172a extends C112958r<FragmentActivity> implements C0123n0 {

    /* renamed from: h */
    public final /* synthetic */ VASActivity f348656h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116172a(VASActivity vASActivity, Handler handler) {
        super(vASActivity instanceof Activity ? vASActivity : null, vASActivity, handler, 0);
        this.f348656h = vASActivity;
    }

    /* renamed from: b */
    public View mo164813b(int i) {
        return this.f348656h.get_activity().findViewById(i);
    }

    /* renamed from: c */
    public boolean mo164814c() {
        Window window = this.f348656h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    /* renamed from: d */
    public void mo164996d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(printWriter, "writer");
        this.f348656h.dump(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public Object mo164997e() {
        return this.f348656h;
    }

    /* renamed from: f */
    public LayoutInflater mo164998f() {
        LayoutInflater cloneInContext = this.f348656h.getLayoutInflater().cloneInContext(this.f348656h.get_activity());
        C87412m.m108593f(cloneInContext, "this@VASActivity.layoutI…cloneInContext(_activity)");
        return cloneInContext;
    }

    /* renamed from: g */
    public void mo165246g(Fragment fragment, String[] strArr, int i) {
        C87412m.m108594g(fragment, "fragment");
        C87412m.m108594g(strArr, "permissions");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(strArr);
        C117292a.m165358d(fragment, aVar.mo10232b(), "com/tencent/mm/ui/vas/VASActivity$_hostCallback$2$1", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        fragment.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(fragment, "com/tencent/mm/ui/vas/VASActivity$_hostCallback$2$1", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    public C39630m0 getViewModelStore() {
        return this.f348656h.getViewModelStore();
    }

    /* renamed from: h */
    public boolean mo164999h(Fragment fragment) {
        C87412m.m108594g(fragment, "fragment");
        return !this.f348656h.isFinishing();
    }

    /* renamed from: i */
    public boolean mo165000i(String str) {
        C87412m.m108594g(str, "permission");
        return C90111a.m112742f(this.f348656h, str);
    }

    /* renamed from: j */
    public void mo165247j(Fragment fragment, Intent intent, int i, Bundle bundle) {
        C87412m.m108594g(fragment, "fragment");
        this.f348656h.startActivityFromFragment(fragment, intent, i, bundle);
    }

    /* renamed from: k */
    public void mo165248k(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C87412m.m108594g(fragment, "fragment");
        this.f348656h.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: l */
    public void mo165001l() {
        this.f348656h.supportInvalidateOptionsMenu();
    }
}

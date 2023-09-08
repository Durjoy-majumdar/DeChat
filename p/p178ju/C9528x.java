package p178ju;

import android.os.Bundle;
import android.view.View;
import c62.C0419f;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.Map;
import wd3.C53155r0;

/* renamed from: ju.x */
public class C9528x extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ Map f29706e;

    /* renamed from: f */
    public final /* synthetic */ String f29707f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f29708g;

    /* renamed from: h */
    public final /* synthetic */ WeakReference f29709h;

    /* renamed from: i */
    public final /* synthetic */ String f29710i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f29711j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9528x(C9529y yVar, int i, C53155r0 r0Var, Map map, String str, Bundle bundle, WeakReference weakReference, String str2, WeakReference weakReference2) {
        super(i, r0Var);
        this.f29706e = map;
        this.f29707f = str;
        this.f29708g = bundle;
        this.f29709h = weakReference;
        this.f29710i = str2;
        this.f29711j = weakReference2;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        ((C0419f) C86312j.m106911c(C0419f.class)).Fx0(this.f29706e, this.f29707f, this.f29708g, this.f29709h, this.f29710i, true);
        ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_succeed_contact", this.f29706e, this.f29708g, this.f29709h, this.f29711j);
    }
}

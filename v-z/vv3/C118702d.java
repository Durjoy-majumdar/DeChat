package vv3;

import android.content.Context;
import lw3.C117488c;
import ov3.C117899b;
import uv3.C118618h;
import uv3.C118622l;
import wv3.C118788a;
import xv3.C118907b;

/* renamed from: vv3.d */
public class C118702d {

    /* renamed from: a */
    public Context f355205a;

    /* renamed from: b */
    public C118622l f355206b;

    /* renamed from: c */
    public C118907b f355207c;

    /* renamed from: d */
    public C117899b f355208d;

    /* renamed from: e */
    public C118706h f355209e;

    /* renamed from: f */
    public C117488c f355210f;

    /* renamed from: g */
    public C118788a f355211g;

    public C118702d(Context context, C118622l lVar) {
        this.f355205a = context != null ? context.getApplicationContext() : context;
        this.f355207c = new C118907b();
        this.f355210f = new C117488c(this);
        this.f355211g = new C118788a(this);
        this.f355206b = lVar;
        if (lVar == null) {
            C118622l.C118624b bVar = new C118622l.C118624b();
            bVar.f354969a = new C118618h();
            this.f355206b = new C118622l(bVar, (C118622l.C118623a) null);
        }
    }
}

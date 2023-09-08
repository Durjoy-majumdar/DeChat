package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.C103456i;

/* renamed from: androidx.appcompat.view.menu.a */
public abstract class C103438a implements C103456i {

    /* renamed from: d */
    public Context f305171d;

    /* renamed from: e */
    public Context f305172e;

    /* renamed from: f */
    public C103448e f305173f;

    /* renamed from: g */
    public LayoutInflater f305174g;

    /* renamed from: h */
    public C103456i.C103457a f305175h;

    /* renamed from: i */
    public int f305176i;

    /* renamed from: j */
    public int f305177j;

    /* renamed from: n */
    public C103458j f305178n;

    /* renamed from: o */
    public int f305179o;

    public C103438a(Context context, int i, int i2) {
        this.f305171d = context;
        this.f305174g = LayoutInflater.from(context);
        this.f305176i = i;
        this.f305177j = i2;
    }

    /* renamed from: e */
    public boolean mo143533e(C103448e eVar, C103452g gVar) {
        return false;
    }

    /* renamed from: g */
    public boolean mo143534g(C103448e eVar, C103452g gVar) {
        return false;
    }

    public int getId() {
        return this.f305179o;
    }

    /* renamed from: i */
    public void mo143536i(C103456i.C103457a aVar) {
        this.f305175h = aVar;
    }
}

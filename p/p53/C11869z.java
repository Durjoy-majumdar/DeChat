package p53;

import android.app.Activity;
import m53.C10761g;
import m53.C10762h;
import te3.C49562gh3;
import te3.C50675of3;

/* renamed from: p53.z */
public final class C11869z implements C11830b {

    /* renamed from: a */
    public final /* synthetic */ String f34703a;

    /* renamed from: b */
    public final /* synthetic */ C11862y f34704b;

    /* renamed from: c */
    public final /* synthetic */ Activity f34705c;

    /* renamed from: d */
    public final /* synthetic */ C49562gh3 f34706d;

    /* renamed from: e */
    public final /* synthetic */ C10761g f34707e;

    /* renamed from: f */
    public final /* synthetic */ String f34708f;

    /* renamed from: g */
    public final /* synthetic */ C10762h<Void> f34709g;

    public C11869z(String str, C11862y yVar, Activity activity, C49562gh3 gh32, C10761g gVar, String str2, C10762h<Void> hVar) {
        this.f34703a = str;
        this.f34704b = yVar;
        this.f34705c = activity;
        this.f34706d = gh32;
        this.f34707e = gVar;
        this.f34708f = str2;
        this.f34709g = hVar;
    }

    /* renamed from: a */
    public void mo11378a(C50675of3 of32) {
        if (of32 != null) {
            if (of32.f139143e == 3) {
                String str = this.f34703a;
                if (!(str == null || str.length() == 0)) {
                    this.f34704b.mo11739e(this.f34705c, this.f34706d, "release", this.f34707e, this.f34708f);
                    return;
                }
            }
            C10762h<Void> hVar = this.f34709g;
            if (hVar != null) {
                hVar.mo605a(4, 10000, "");
                return;
            }
            return;
        }
        C10762h<Void> hVar2 = this.f34709g;
        if (hVar2 != null) {
            hVar2.mo605a(4, 10000, "");
        }
    }
}

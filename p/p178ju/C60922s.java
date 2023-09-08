package p178ju;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.live.api.LiveConfig;
import d62.C7240a;
import di3.C86312j;
import java.lang.ref.WeakReference;
import p744wt.C66190c;
import wd3.C53155r0;

/* renamed from: ju.s */
public class C60922s extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ WeakReference f173541e;

    /* renamed from: f */
    public final /* synthetic */ String f173542f;

    /* renamed from: g */
    public final /* synthetic */ String f173543g;

    /* renamed from: h */
    public final /* synthetic */ long f173544h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60922s(C9526t tVar, int i, C53155r0 r0Var, WeakReference weakReference, String str, String str2, long j) {
        super(i, r0Var);
        this.f173541e = weakReference;
        this.f173542f = str;
        this.f173543g = str2;
        this.f173544h = j;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        try {
            if (this.f173541e.get() != null) {
                LiveConfig.C55204b bVar = new LiveConfig.C55204b();
                bVar.f157091a = 2;
                bVar.f157092b = this.f173542f;
                bVar.f157096f = this.f173543g;
                bVar.f157093c = this.f173544h;
                bVar.f157097g = 1;
                ((C66190c) C86312j.m106911c(C66190c.class)).mo89934OG().mo90324d((Context) this.f173541e.get(), bVar.mo76374a());
            }
        } catch (Throwable unused) {
        }
    }
}

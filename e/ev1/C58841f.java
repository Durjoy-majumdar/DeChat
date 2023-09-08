package ev1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C7335d;
import di3.C86312j;
import dv1.C58435m;
import fv1.C32183a;
import fy3.C32226l;
import gv1.C59712c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import jq3.C60905o;
import p687sr.C64152d;
import p687sr.C64156g;
import rx3.C13598b0;

/* renamed from: ev1.f */
public final class C58841f extends C58838a implements C64152d {

    /* renamed from: h */
    public final String f168442h;

    /* renamed from: i */
    public final String f168443i;

    /* renamed from: j */
    public final Map<String, String> f168444j;

    /* renamed from: n */
    public final int f168445n;

    /* renamed from: o */
    public final String f168446o;

    /* renamed from: p */
    public final Drawable f168447p;

    /* renamed from: q */
    public final boolean f168448q;

    /* renamed from: r */
    public final boolean f168449r;

    /* renamed from: s */
    public final C32226l<View, C13598b0> f168450s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58841f(String str, String str2, String str3, Map<String, String> map, int i, String str4, Drawable drawable, boolean z, boolean z2, C32226l<? super View, C13598b0> lVar) {
        super(str, 0, 2, (C8480h) null);
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "desc");
        C87412m.m108594g(map, "extraParams");
        this.f168442h = str2;
        this.f168443i = str3;
        this.f168444j = map;
        this.f168445n = i;
        this.f168446o = str4;
        this.f168447p = drawable;
        this.f168448q = z;
        this.f168449r = z2;
        this.f168450s = lVar;
    }

    /* renamed from: b */
    public Drawable mo84033b() {
        Drawable drawable = this.f168447p;
        return drawable == null ? super.mo84033b() : drawable;
    }

    /* renamed from: c */
    public int mo75c() {
        return 3;
    }

    /* renamed from: d */
    public String mo84034d() {
        String str = this.f168446o;
        return str == null ? super.mo84034d() : str;
    }

    public long getItemId() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo84036i() {
        return this.f168448q;
    }

    /* renamed from: j */
    public boolean mo84037j() {
        return this.f168449r;
    }

    /* renamed from: k */
    public void mo84038k() {
        int i;
        Class cls = C58435m.class;
        super.mo84038k();
        if (this.f168445n == 1) {
            C64156g gVar = (C64156g) C86312j.m106911c(C64156g.class);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(ForceNotifyService::class.java)");
            if (C58435m.zx0((C58435m) c, (Context) null, 1, (Object) null)) {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(ForceNotifyService::class.java)");
                i = C58435m.Ax0((C58435m) c2, (Context) null, 1, (Object) null) ? 1 : 4;
            } else {
                C7335d c3 = C86312j.m106911c(cls);
                C87412m.m108593f(c3, "getService(ForceNotifyService::class.java)");
                i = C58435m.Ax0((C58435m) c3, (Context) null, 1, (Object) null) ? 3 : 2;
            }
            gVar.ql0("", i, 5, this.f168434d, false);
        }
    }

    /* renamed from: l */
    public void mo84039l() {
        String str = this.f168444j.get("weAppUsername");
        if (str == null) {
            str = "";
        }
        ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(3, this.f168445n == 1 ? 5 : 3, str, C59712c.f170575I.mo84705a().f170589q.size(), this.f168434d);
    }

    /* renamed from: n */
    public void mo84041n(View view) {
        C87412m.m108594g(view, "view");
        C32226l<View, C13598b0> lVar = this.f168450s;
        if (lVar != null) {
            lVar.invoke(view);
        }
    }

    /* renamed from: o */
    public void mo84042o(boolean z) {
        super.mo84042o(z);
        if (z) {
            String str = this.f168444j.get("weAppUsername");
            if (str == null) {
                str = "";
            }
            ((C64156g) C86312j.m106911c(C64156g.class)).mo58060JU(2, this.f168445n == 1 ? 5 : 3, str, C59712c.f170575I.mo84705a().f170589q.size(), this.f168434d);
        }
    }

    /* renamed from: p */
    public void mo84043p(C60905o oVar, View view, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        C32226l<View, C13598b0> lVar = this.f168450s;
        if (lVar != null) {
            lVar.invoke(view);
        }
    }

    /* renamed from: q */
    public void mo84044q() {
        super.mo84044q();
        C58843i a = C58843i.f168452c.mo84050a();
        String str = this.f168434d;
        a.getClass();
        C87412m.m108594g(str, "forcePushId");
        a.f168455b.remove(str);
        C32183a.f85554d.mo58522c(this.f168434d);
    }
}

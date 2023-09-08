package p225rc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import wq0.C91075m;

/* renamed from: rc.g$$b */
public final /* synthetic */ class g$$b implements C91075m.C91076a {

    /* renamed from: a */
    public final /* synthetic */ C89916g f258387a;

    /* renamed from: b */
    public final /* synthetic */ int[] f258388b;

    /* renamed from: c */
    public final /* synthetic */ int f258389c;

    /* renamed from: d */
    public final /* synthetic */ String f258390d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f258391e;

    /* renamed from: f */
    public final /* synthetic */ String[] f258392f;

    /* renamed from: g */
    public final /* synthetic */ g$$i f258393g;

    public /* synthetic */ g$$b(C89916g gVar, int[] iArr, int i, String str, C82381f fVar, String[] strArr, g$$i g__i) {
        this.f258387a = gVar;
        this.f258388b = iArr;
        this.f258389c = i;
        this.f258390d = str;
        this.f258391e = fVar;
        this.f258392f = strArr;
        this.f258393g = g__i;
    }

    /* renamed from: a */
    public final void mo117448a(int i) {
        C89916g gVar = this.f258387a;
        int[] iArr = this.f258388b;
        int i2 = this.f258389c;
        String str = this.f258390d;
        C82381f fVar = this.f258391e;
        String[] strArr = this.f258392f;
        g$$i g__i = this.f258393g;
        gVar.getClass();
        iArr[i2] = i;
        Log.m105925i("Luggage.LuggageActivityHelper", "doReqPerm callback index:%d permission:%s grantResult:%d", Integer.valueOf(i2), str, Integer.valueOf(i));
        gVar.mo124230d(fVar, i2 + 1, strArr, iArr, g__i);
    }
}

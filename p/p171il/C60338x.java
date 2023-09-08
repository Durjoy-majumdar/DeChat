package p171il;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: il.x */
public abstract class C60338x {

    /* renamed from: a */
    public final String f171989a = "MicroMsg.PanelSizeResolver";

    /* renamed from: b */
    public int f171990b;

    /* renamed from: c */
    public int f171991c;

    /* renamed from: d */
    public int f171992d;

    /* renamed from: e */
    public int f171993e;

    /* renamed from: f */
    public int f171994f;

    public C60338x() {
        Context context = MMApplicationContext.getContext();
        context.getResources();
        this.f171990b = C76577a.m92151b(context, 400);
    }

    /* renamed from: a */
    public abstract float mo85305a();

    /* renamed from: b */
    public abstract float mo85306b();

    /* renamed from: c */
    public abstract float mo85307c();

    /* renamed from: d */
    public final void mo85309d(int i) {
        String str = this.f171989a;
        Log.m105924i(str, "setParentWidth: " + i);
        if (i > 0) {
            this.f171990b = i;
            mo85310e();
        }
    }

    /* renamed from: e */
    public final void mo85310e() {
        float f = (float) 2;
        float a = ((float) this.f171990b) - (mo85305a() * f);
        if (a < mo85306b() * f) {
            this.f171991c = 1;
            return;
        }
        int b = ((int) ((a - mo85306b()) / (mo85306b() + mo85307c()))) + 1;
        float f2 = (float) b;
        this.f171992d = (int) ((a - (mo85306b() * f2)) / ((float) (b - 1)));
        float b2 = ((float) this.f171990b) - (mo85306b() * f2);
        int i = this.f171992d;
        this.f171993e = (int) ((b2 - ((float) (i * b))) / f);
        this.f171994f = i / 2;
        String str = this.f171989a;
        Log.m105924i(str, "updateSize: " + mo85306b() + ", " + mo85305a() + ", " + mo85307c() + ", " + this.f171991c + ", " + this.f171992d + ", " + this.f171993e + ", " + this.f171994f);
        this.f171991c = b;
    }
}

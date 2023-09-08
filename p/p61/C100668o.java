package p61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: p61.o */
public abstract class C100668o {

    /* renamed from: a */
    public final String f294932a = "MicroMsg.EmojiStoreV3ItemSizeResolver";

    /* renamed from: b */
    public int f294933b = MMApplicationContext.getResources().getDisplayMetrics().widthPixels;

    /* renamed from: c */
    public int f294934c;

    /* renamed from: d */
    public int f294935d;

    /* renamed from: e */
    public int f294936e;

    /* renamed from: f */
    public int f294937f;

    /* renamed from: a */
    public abstract float mo140081a();

    /* renamed from: b */
    public abstract float mo140082b();

    /* renamed from: c */
    public abstract float mo140083c();

    /* renamed from: d */
    public final void mo140107d(int i) {
        String str = this.f294932a;
        Log.m105924i(str, "setParentWidth: " + i);
        if (i > 0) {
            this.f294933b = i;
            mo140084e();
        }
    }

    /* renamed from: e */
    public void mo140084e() {
        float f = (float) 2;
        float a = ((float) this.f294933b) - (mo140081a() * f);
        if (a < mo140082b() * f) {
            this.f294934c = 1;
            return;
        }
        int c = (int) ((mo140083c() + a) / (mo140082b() + mo140083c()));
        float f2 = (float) c;
        this.f294935d = (int) ((a - (mo140082b() * f2)) / ((float) (c - 1)));
        this.f294936e = (int) (((((float) this.f294933b) - (mo140082b() * f2)) - ((float) (this.f294935d * c))) / f);
        String str = this.f294932a;
        Log.m105924i(str, "updateSize: " + mo140082b() + ", " + mo140081a() + ", " + mo140083c() + ", " + this.f294934c + ", " + this.f294935d + ", " + this.f294936e);
        this.f294934c = c;
    }
}

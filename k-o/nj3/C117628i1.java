package nj3;

import com.tencent.p014mm.p136ui.base.WxImageView;

/* renamed from: nj3.i1 */
public class C117628i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ float f351871d;

    /* renamed from: e */
    public final /* synthetic */ long f351872e;

    /* renamed from: f */
    public final /* synthetic */ float f351873f;

    /* renamed from: g */
    public final /* synthetic */ float f351874g;

    /* renamed from: h */
    public final /* synthetic */ float f351875h;

    /* renamed from: i */
    public final /* synthetic */ float f351876i;

    /* renamed from: j */
    public final /* synthetic */ WxImageView f351877j;

    public C117628i1(WxImageView wxImageView, float f, long j, float f2, float f3, float f4, float f5) {
        this.f351877j = wxImageView;
        this.f351871d = f;
        this.f351872e = j;
        this.f351873f = f2;
        this.f351874g = f3;
        this.f351875h = f4;
        this.f351876i = f5;
    }

    public void run() {
        float min = Math.min(this.f351871d, (float) (System.currentTimeMillis() - this.f351872e));
        this.f351877j.mo26073l(this.f351873f + (this.f351874g * min), this.f351875h, this.f351876i);
        if (min < this.f351871d) {
            this.f351877j.f348346W.post(this);
        }
    }
}

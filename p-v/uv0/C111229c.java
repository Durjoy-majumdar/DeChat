package uv0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import lb0.C88394b;
import uv0.C111231e;

/* renamed from: uv0.c */
public class C111229c implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C111231e.C111232a f333069d;

    /* renamed from: e */
    public final /* synthetic */ int f333070e;

    /* renamed from: f */
    public final /* synthetic */ BallInfo f333071f;

    /* renamed from: g */
    public final /* synthetic */ C111231e f333072g;

    public C111229c(C111231e eVar, C111231e.C111232a aVar, int i, BallInfo ballInfo) {
        this.f333072g = eVar;
        this.f333069d = aVar;
        this.f333070e = i;
        this.f333071f = ballInfo;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105925i("MicroMsg.FloatBallMenuAdapter", "onLoadFailed, iconResId:%s, iconUrl:%s", Integer.valueOf(this.f333071f.f311698s), this.f333071f.f311695p);
        this.f333072g.mo162988F4(this.f333069d, this.f333070e, this.f333071f);
    }

    /* renamed from: d */
    public void mo1908d() {
        this.f333072g.mo162988F4(this.f333069d, this.f333070e, this.f333071f);
    }

    public String key() {
        return "FloatMenuIcon#" + this.f333071f.mo149041e();
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f333069d.f333095C.setVisibility(8);
            this.f333069d.f333094B.setVisibility(0);
            this.f333069d.f333094B.setImageBitmap(bitmap);
        }
    }
}

package tn2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: tn2.a */
public class C78072a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageView f228839d;

    /* renamed from: e */
    public final /* synthetic */ String f228840e;

    /* renamed from: f */
    public final /* synthetic */ int f228841f;

    /* renamed from: g */
    public final /* synthetic */ String f228842g;

    /* renamed from: h */
    public final /* synthetic */ int f228843h;

    public C78072a(ImageView imageView, String str, int i, String str2, int i2) {
        this.f228839d = imageView;
        this.f228840e = str;
        this.f228841f = i;
        this.f228842g = str2;
        this.f228843h = i2;
    }

    public void run() {
        Drawable drawable = this.f228839d.getDrawable();
        C78073b bVar = (drawable == null || !(drawable instanceof C78073b)) ? new C78073b(this.f228839d, this.f228840e, this.f228841f) : (C78073b) drawable;
        if (!Util.nullAs(bVar.f228847e, "").equals(this.f228842g)) {
            Log.m105925i("MicroMsg.ShakeAvatarDrawable", "not same refresh :%s, old: %s", this.f228842g, bVar.f228847e);
            this.f228839d.setImageDrawable((Drawable) null);
            bVar.f228846d = this.f228843h;
            bVar.f228847e = this.f228842g;
            bVar.f228848f = this.f228840e;
        } else {
            Log.m105925i("MicroMsg.ShakeAvatarDrawable", "same: %s", this.f228842g);
        }
        this.f228839d.setImageDrawable(bVar);
    }
}

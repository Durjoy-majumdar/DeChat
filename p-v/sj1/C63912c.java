package sj1;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import gy3.C87412m;
import o40.C61926c;
import pl1.C100810g0;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: sj1.c */
public final class C63912c<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ String f181158a;

    /* renamed from: b */
    public final /* synthetic */ MMRoundCornerImageView f181159b;

    public C63912c(String str, MMRoundCornerImageView mMRoundCornerImageView) {
        this.f181158a = str;
        this.f181159b = mMRoundCornerImageView;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (C87412m.m108589b(((C100810g0) aVar.f301995a).getUrl(), this.f181158a) && bitmap != null) {
            C61926c.m72668M(new C63911b(this.f181159b, bitmap));
        }
    }
}

package p188kw;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kg3.C76577a;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p199lw.C10657b;
import p823sg.C101614i;
import vd3.C78407r;

@C86522b
/* renamed from: kw.b */
public final class C10423b extends C86301e implements C10657b {

    /* renamed from: d */
    public Bitmap f31642d;

    /* renamed from: e */
    public Bitmap f31643e;

    /* renamed from: f */
    public final C101614i<String, WeakReference<Bitmap>> f31644f = new C101614i<>(15);

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        C87412m.m108594g(rVar, "drawable");
        if (rVar instanceof C10579k.C10580a) {
            ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b((C10579k.C10580a) rVar);
        }
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        C87412m.m108594g(str, "tag");
        return null;
    }

    public Bitmap loadBitmap(String str) {
        C87412m.m108594g(str, "tag");
        WeakReference weakReference = (WeakReference) this.f31644f.get(str);
        if (!(weakReference == null || weakReference.get() == null)) {
            Object obj = weakReference.get();
            C87412m.m108592e(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
            if (!((Bitmap) obj).isRecycled() && C87412m.m108589b(weakReference.get(), mo10728qq())) {
                return (Bitmap) weakReference.get();
            }
        }
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        if (N50 == null || N50.isRecycled()) {
            if (this.f31643e == null && mo10728qq() != null) {
                try {
                    Bitmap bitmap = this.f31642d;
                    C87412m.m108591d(bitmap);
                    this.f31643e = BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getWidth() / 2));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.RadarAvatarBitmapLoaderService", e, "", new Object[0]);
                }
            }
            return this.f31643e;
        }
        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(N50, false, (float) (N50.getWidth() / 2));
        this.f31644f.mo139557c(str, new WeakReference(roundedCornerBitmap));
        return roundedCornerBitmap;
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        C87412m.m108594g(str, "tag");
        return null;
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        if (this.f31642d == null) {
            try {
                this.f31642d = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.RadarAvatarBitmapLoaderService", e, "", new Object[0]);
            }
        }
        return this.f31642d;
    }
}

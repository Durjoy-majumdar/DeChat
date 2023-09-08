package ig3;

import com.tencent.p014mm.cache.ArtistCacheManager;
import eq3.C107283a;
import java.util.Iterator;
import java.util.Stack;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104084a;
import p1093bh.C104085b;
import p1093bh.C104090d;
import p248ug.C111162m0;
import p248ug.C111167t;
import p520fi.C107544a;
import p520fi.C107545b;
import p520fi.C107547d;
import p520fi.C107551k;
import z20.C112572b;

/* renamed from: ig3.i */
public class C108460i implements C111162m0 {

    /* renamed from: a */
    public C109623f f324778a;

    public C108460i(C109623f fVar) {
        this.f324778a = fVar;
    }

    /* renamed from: a */
    public int mo159001a() {
        C107545b bVar = (C107545b) ArtistCacheManager.m140185a().mo148160c(C104084a.DOODLE);
        if (bVar == null) {
            return 0;
        }
        return bVar.mo157975D1(true);
    }

    /* renamed from: b */
    public int mo159002b() {
        C107547d dVar = (C107547d) ArtistCacheManager.m140185a().mo148160c(C104084a.EMOJI_AND_TEXT);
        if (dVar == null) {
            return 0;
        }
        return dVar.mo157988a(true)[0];
    }

    /* renamed from: c */
    public int mo159003c() {
        C107551k kVar = (C107551k) ArtistCacheManager.m140185a().mo148160c(C104084a.MOSAIC);
        if (kVar == null) {
            return 0;
        }
        return kVar.mo157975D1(true);
    }

    /* renamed from: d */
    public int mo159004d() {
        C107545b bVar = (C107545b) ArtistCacheManager.m140185a().mo148160c(C104084a.DOODLE);
        if (bVar == null) {
            return 0;
        }
        int[] iArr = C107283a.f320962D;
        int[] iArr2 = new int[8];
        Stack<C112572b> stack = bVar.f321768d;
        if (stack != null) {
            Iterator<C112572b> it = stack.iterator();
            while (it.hasNext()) {
                C112572b next = it.next();
                int[] iArr3 = C107283a.f320962D;
                int i = 0;
                while (true) {
                    if (i >= 8) {
                        break;
                    } else if (next.f337061e == iArr3[i]) {
                        iArr2[i] = iArr2[i] + 1;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            if (iArr2[i3] > 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public int mo159005e() {
        C107547d dVar = (C107547d) ArtistCacheManager.m140185a().mo148160c(C104084a.EMOJI_AND_TEXT);
        if (dVar == null) {
            return 0;
        }
        return dVar.mo157988a(true)[1];
    }

    /* renamed from: f */
    public int mo159006f() {
        C107545b bVar = (C107545b) ArtistCacheManager.m140185a().mo148160c(C104084a.DOODLE);
        int i = 0;
        if (bVar != null) {
            i = 0 + bVar.f321770f;
        }
        C107551k kVar = (C107551k) ArtistCacheManager.m140185a().mo148160c(C104084a.MOSAIC);
        return kVar != null ? i + kVar.f321786h : i;
    }

    /* renamed from: g */
    public boolean mo159007g() {
        C107545b bVar = (C107545b) ArtistCacheManager.m140185a().mo148160c(C104084a.DOODLE);
        C107551k kVar = (C107551k) ArtistCacheManager.m140185a().mo148160c(C104084a.MOSAIC);
        C107544a aVar = (C107544a) ArtistCacheManager.m140185a().mo148160c(C104084a.CROP_PHOTO);
        C107547d dVar = (C107547d) ArtistCacheManager.m140185a().mo148160c(C104084a.EMOJI_AND_TEXT);
        return (bVar != null && bVar.mo157975D1(true) > 0) || (kVar != null && kVar.mo157975D1(true) > 0) || ((dVar != null && dVar.mo157975D1(true) > 0) || (aVar != null && aVar.mo157975D1(true) > 0));
    }

    /* renamed from: h */
    public boolean mo159008h() {
        C104085b b = ((C109612c) this.f324778a).mo160818b(C111167t.CROP_PHOTO);
        return (b == null || b.mo145700k() != C104084a.CROP_PHOTO || ((C104090d) b).mo145697h() == 0.0f) ? false : true;
    }
}

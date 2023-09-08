package p587kn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C1294e;
import com.tencent.p014mm.modelavatar.C68080d;
import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.modelavatar.C68092j;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import p196ln.C10578j;
import p196ln.C10579k;
import p196ln.C10581n;
import p196ln.C61311l;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76707h;
import p196ln.C76708i;
import p823sg.C77710q;
import te3.C50052jy2;
import vd3.C78391d;
import vd3.C78397h;
import vd3.C78407r;

@C86522b
/* renamed from: kn.a */
public class C76600a extends C86301e implements C76705f, C76708i, C76706g {
    /* renamed from: Bq */
    public C68097n mo106818Bq(String str, C50052jy2 jy22, C72996z1 z1Var) {
        return C68081f.m80470e(str, jy22, z1Var);
    }

    public void D20(ImageView imageView, String str, float f) {
        Class cls = C76707h.class;
        if (((C76707h) C86312j.m106911c(cls)).mo106990am(str)) {
            ((C76707h) C86312j.m106911c(cls)).mo106986QU(imageView, str, f);
        } else {
            C78391d.C78393b.m94670b(imageView, str, f, false);
        }
    }

    /* renamed from: Fj */
    public Bitmap mo106820Fj(String str, boolean z) {
        return C68081f.m80467b(str, z, -1, (C68080d) null);
    }

    /* renamed from: HB */
    public Bitmap mo106821HB(long j) {
        return C68081f.m80466a(new C77710q(j) + "@qqim");
    }

    /* renamed from: J5 */
    public void mo106822J5(ImageView imageView, String str) {
        Class cls = C76707h.class;
        if (((C76707h) C86312j.m106911c(cls)).mo106990am(str)) {
            ((C76707h) C86312j.m106911c(cls)).mo106986QU(imageView, str, 0.5f);
        } else {
            C78391d.C78393b.m94670b(imageView, str, 0.5f, false);
        }
    }

    /* renamed from: Jc */
    public void mo106823Jc(String str) {
        C68097n Lo = C68102u.zx0().mo93607Lo(str);
        if (Lo != null && str.equals(Lo.mo93598g())) {
            Lo.f195734g = 0;
            Lo.f195736i = 64;
            C68102u.zx0().mo93608Yt(Lo);
        }
    }

    public Bitmap N50(String str) {
        return C68081f.m80466a(str);
    }

    /* renamed from: Nj */
    public void mo106825Nj(ImageView imageView, String str, int i, C68080d dVar) {
        Bitmap bitmap;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            C78397h hVar = (drawable == null || !(drawable instanceof C78397h)) ? new C78397h(str) : (C78397h) drawable;
            C78397h.C78398a aVar = hVar.f229718s;
            if (aVar != null) {
                aVar.f229722f = dVar;
            }
            if (hVar.f229719t != i || aVar == null || (bitmap = aVar.f229721e) == null || bitmap.isRecycled()) {
                hVar.f229719t = i;
                Bitmap bitmapNative = BitmapUtil.getBitmapNative(i);
                C78397h.C78398a aVar2 = hVar.f229718s;
                if (aVar2 != null) {
                    aVar2.f229721e = bitmapNative;
                    aVar2.f229721e = aVar2.mo108344a(bitmapNative);
                }
            }
            hVar.mo108360a(str);
            imageView.setImageDrawable(hVar);
            imageView.invalidate();
            C78391d.C78393b.m94672d(imageView, str);
        }
    }

    /* renamed from: RE */
    public C10579k mo106826RE() {
        return C68102u.wx0();
    }

    /* renamed from: TR */
    public boolean mo106827TR(String str) {
        return C68081f.m80473h(str);
    }

    /* renamed from: Ux */
    public boolean mo106828Ux(long j, int i) {
        if (i != 3) {
            return false;
        }
        return C68081f.m80473h(new C77710q(j) + "@qqim");
    }

    /* renamed from: VT */
    public C78407r.C78409b mo106829VT() {
        return C78391d.C78393b.m94671c();
    }

    public Bitmap Wd0(String str, String str2) {
        return AvatarStorage.m80444f(str, str2, false);
    }

    /* renamed from: cr */
    public void mo106831cr(ImageView imageView, String str) {
        C78391d.C78393b.m94670b(imageView, str, 0.5f, true);
    }

    /* renamed from: eg */
    public C10581n mo106832eg() {
        return C68102u.zx0();
    }

    public String eg0(String str, boolean z, boolean z2) {
        return C68081f.m80468c(str, z, z2);
    }

    public void fc0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String str4 = str + "@google";
            C68097n Lo = C68102u.zx0().mo93607Lo(str4);
            if (Lo == null) {
                Lo = new C68097n();
            }
            Lo.f195728a = str4;
            Lo.f195729b = 3;
            Lo.f195732e = str2 + "?access_token=" + str3;
            Lo.f195731d = str2 + "?access_token=" + str3;
            Lo.f195733f = 1;
            Lo.f195736i = 31;
            C68102u.zx0().mo93608Yt(Lo);
        }
    }

    /* renamed from: fi */
    public C78407r mo106835fi(String str) {
        return new C78397h(str);
    }

    /* renamed from: g4 */
    public void mo106836g4(ImageView imageView, String str) {
        C78391d.C78393b.m94669a(imageView, str);
    }

    public void g40(String str) {
        if (!Util.isNullOrNil(str)) {
            String str2 = str + "@fb";
            C68097n Lo = C68102u.zx0().mo93607Lo(str2);
            if (Lo == null || !str2.equals(Lo.mo93598g()) || 3 != Lo.f195729b) {
                if (Lo == null) {
                    Lo = new C68097n();
                }
                Lo.f195728a = str2;
                Lo.f195729b = 3;
                Lo.f195732e = "http://graph.facebook.com/" + str + "/picture";
                Lo.f195731d = "http://graph.facebook.com/" + str + "/picture";
                Lo.f195733f = 1;
                Lo.f195736i = 31;
                C68102u.zx0().mo93608Yt(Lo);
            }
        }
    }

    /* renamed from: hh */
    public Bitmap mo106838hh(String str) {
        return C68081f.m80466a(str + "@fb");
    }

    public C61311l hl0() {
        return new C68092j();
    }

    /* renamed from: jC */
    public Bitmap mo106840jC(String str, boolean z, int i) {
        return C68081f.m80467b(str, z, i, (C68080d) null);
    }

    /* renamed from: jW */
    public void mo106841jW(ImageView imageView, String str, boolean z) {
        Class cls = C76707h.class;
        if (((C76707h) C86312j.m106911c(cls)).mo106990am(str)) {
            ((C76707h) C86312j.m106911c(cls)).mo106995z(imageView, str);
        } else if (imageView == null) {
            Log.m105920e("MicroMsg.AvatarDrawable", "imageView is null");
        } else {
            C78391d.C78393b.m94670b(imageView, str, 0.1f, false);
        }
    }

    public long kw0(String str) {
        if (!C72996z1.m85848s5(str)) {
            return -1;
        }
        try {
            return Util.getLong(str.split("@")[0], -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: mB */
    public void mo106843mB(ImageView imageView, String str, float f) {
        C78391d.C78393b.m94670b(imageView, str, f, true);
    }

    /* renamed from: mR */
    public Bitmap mo106844mR(String str) {
        return C68081f.m80466a(str + "@google");
    }

    /* renamed from: oX */
    public String mo106845oX(String str, boolean z) {
        return C68081f.m80468c(str, z, false);
    }

    /* renamed from: sO */
    public Bitmap mo106846sO(String str, int i, int i2, int i3) {
        if (Util.isNullOrNil(str) || !C86709a0.m107523b().mo121114l()) {
            return null;
        }
        AvatarStorage wx02 = C68102u.wx0();
        wx02.getClass();
        Log.m105919d("MicroMsg.AvatarStorage", "getHDBitmap user:%s, width:%d, height:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
        Bitmap bitmapNative = Util.isNullOrNil(str) ? null : BitmapUtil.getBitmapNative(wx02.mo93559h(str, true), i, i2);
        if (bitmapNative != null) {
            return i3 > 5 ? BitmapUtil.getRoundedCornerBitmap(bitmapNative, true, (float) i3) : bitmapNative;
        }
        C68092j jVar = new C68092j();
        jVar.mo86279b(str, new C1294e(jVar));
        return C68081f.m80467b(str, false, i3, (C68080d) null);
    }

    /* renamed from: uz */
    public C10578j mo106847uz() {
        return C68102u.vx0();
    }

    /* renamed from: yE */
    public boolean mo106848yE(String str, int i) {
        return C68081f.m80471f(str, i);
    }

    /* renamed from: z */
    public void mo106849z(ImageView imageView, String str) {
        Class cls = C76707h.class;
        if (((C76707h) C86312j.m106911c(cls)).mo106990am(str)) {
            ((C76707h) C86312j.m106911c(cls)).mo106995z(imageView, str);
        } else {
            C78391d.C78393b.m94669a(imageView, str);
        }
    }

    public void zv0(ImageView imageView, String str) {
        C78391d dVar;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof C78391d)) {
            dVar = new C78391d(str, (C78391d.C78392a) null);
            dVar.f229745f = true;
        } else {
            dVar = (C78391d) drawable;
        }
        dVar.mo108360a(str);
        imageView.setImageDrawable(dVar);
        imageView.invalidate();
        C78391d.C78393b.m94672d(imageView, str);
    }
}

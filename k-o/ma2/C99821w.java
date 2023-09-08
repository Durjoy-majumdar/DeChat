package ma2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.music.p080ui.C94243l;
import com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56975k;
import com.tencent.p014mm.plugin.p081mv.p082ui.shake.C56976l;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import jc0.C21210b;
import jr2.C99019x;
import kg3.C76577a;
import o90.C100301b;
import p158gt.C98201k;
import p529fv.C32180m;
import p823sg.C101611g;
import qc0.C101106m;
import ra2.C101365a;
import te3.C101804kv2;
import vp3.C65849b;
import za2.C102984b;

/* renamed from: ma2.w */
public class C99821w implements C32180m {

    /* renamed from: a */
    public C101611g<String, Bitmap> f292515a = new C100301b(5, C99821w.class);

    /* renamed from: b */
    public C34529b f292516b;

    /* renamed from: c */
    public C32180m.C32181a f292517c;

    /* renamed from: d */
    public C21070h f292518d = new C61455a();

    /* renamed from: e */
    public MMHandler f292519e = new MMHandler(Looper.getMainLooper());

    /* renamed from: ma2.w$b */
    public interface C34529b {
    }

    /* renamed from: ma2.w$a */
    public class C61455a implements C21070h {

        /* renamed from: ma2.w$a$a */
        public class C61456a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C101365a f174768d;

            /* renamed from: e */
            public final /* synthetic */ int[] f174769e;

            public C61456a(C101365a aVar, int[] iArr) {
                this.f174768d = aVar;
                this.f174769e = iArr;
            }

            public void run() {
                ((C94243l) C99821w.this.f292516b).mo129567d(this.f174768d, this.f174769e);
            }
        }

        public C61455a() {
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(bVar.f59988d != null);
            Log.m105925i("MicroMsg.Music.MusicImageLoader", "onImageLoadFinish %s %b", objArr);
            if (view != null) {
                C101365a aVar = (C101365a) view.getTag();
                Bitmap bitmap = bVar.f59988d;
                if (bitmap != null && aVar != null) {
                    C99821w.this.mo139178c(aVar, bitmap);
                    C32180m.C32181a aVar2 = C99821w.this.f292517c;
                    if (aVar2 != null) {
                        C56976l lVar = (C56976l) aVar2;
                        try {
                            lVar.f163181a.mo89891b(bVar.f59988d);
                            C65849b bVar2 = lVar.f163181a;
                            int i = lVar.f163182b;
                            int i2 = lVar.f163183c;
                            bVar2.f189363b = i;
                            bVar2.f189364c = i2;
                            bVar2.f189366e.f334033b.mo154924d();
                            lVar.f163181a.mo89890a(new C56975k(lVar));
                        } catch (Exception unused) {
                        }
                    }
                    int[] c = C85875k4.m106174c(bVar.f59988d, 4, 4);
                    if (!(aVar.field_songBgColor == c[0] && aVar.field_songLyricColor == c[1])) {
                        C99814o0.wx0().mo140852Ow(aVar.field_musicId, c[0], c[1]);
                    }
                    if (C99821w.this.f292516b != null) {
                        MMHandlerThread.postToMainThread(new C61456a(aVar, c));
                    }
                }
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: ma2.w$c */
    public class C99822c implements Runnable {

        /* renamed from: d */
        public C101365a f292520d;

        public C99822c(C101365a aVar) {
            this.f292520d = aVar;
        }

        public void run() {
            C101365a aVar;
            C101804kv2 kv22 = new C101804kv2();
            C101365a aVar2 = this.f292520d;
            kv22.f298689d = aVar2.field_songMediaId;
            String str = aVar2.field_songAlbumUrl;
            kv22.f298694i = str;
            kv22.f298695j = aVar2.field_songAlbumType;
            kv22.f298692g = str;
            Bitmap n = ((C94901o) C99019x.m128972d()).mo131130n(kv22);
            if (n != null) {
                Bitmap fastblur = BitmapUtil.fastblur(n, 10);
                C99821w.this.mo139178c(this.f292520d, fastblur);
                int[] c = C85875k4.m106174c(fastblur, 4, 4);
                C101365a aVar3 = this.f292520d;
                if (!(aVar3.field_songBgColor == c[0] && aVar3.field_songLyricColor == c[1])) {
                    this.f292520d = C99814o0.wx0().mo140852Ow(this.f292520d.field_musicId, c[0], c[1]);
                }
                C34529b bVar = C99821w.this.f292516b;
                if (bVar != null && (aVar = this.f292520d) != null) {
                    ((C94243l) bVar).mo129567d(aVar, c);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo139176a(C101106m mVar, CdnImageView cdnImageView, Context context, boolean z, boolean z2) {
        if (mVar != null && cdnImageView != null) {
            C101365a aVar = new C101365a();
            String str = mVar.f295960e;
            aVar.field_musicId = str;
            aVar.field_originMusicId = str;
            aVar.field_musicType = mVar.f295959d;
            aVar.field_songAlbum = mVar.f295964i;
            aVar.field_songAlbumType = mVar.f295973u;
            aVar.field_songAlbumLocalPath = mVar.f295970r;
            aVar.field_songAlbumUrl = mVar.f295965j;
            if (TextUtils.isEmpty(aVar.field_songLyric) && !TextUtils.isEmpty(mVar.f295969q)) {
                aVar.field_songLyric = mVar.f295969q;
            }
            aVar.field_songSnsShareUser = mVar.f295978z;
            if (TextUtils.isEmpty(aVar.field_songHAlbumUrl) && !Util.isNullOrNil(mVar.f295976x)) {
                aVar.field_songHAlbumUrl = mVar.f295976x;
            }
            mo139177b(aVar, cdnImageView, context, z, z2);
        }
    }

    /* renamed from: b */
    public void mo139177b(C101365a aVar, CdnImageView cdnImageView, Context context, boolean z, boolean z2) {
        C34529b bVar;
        C34529b bVar2;
        C101365a aVar2 = aVar;
        CdnImageView cdnImageView2 = cdnImageView;
        Class cls = C98201k.class;
        if (z) {
            ((C100301b) this.f292515a).remove(aVar2.field_musicId);
        }
        Bitmap bitmap = (Bitmap) ((C100301b) this.f292515a).get(aVar2.field_musicId);
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.Music.MusicImageLoader", "no hit cache %s %s %s %s", aVar2.field_musicId, aVar2.field_songHAlbumUrl, aVar2.field_songAlbumUrl, aVar2.field_songAlbumLocalPath);
            cdnImageView2.setTag(aVar2);
            Bitmap bitmap2 = null;
            if (!Util.isNullOrNil(aVar2.field_songHAlbumUrl)) {
                C20937c.C20939b bVar3 = new C20937c.C20939b();
                bVar3.f59350f = C102984b.m136169f(aVar2.field_musicId, true);
                bVar3.f59346b = true;
                bVar3.f59345a = true;
                bVar3.f59359o = C0966R.C0969drawable.bzf;
                if (z2) {
                    bVar3.f59357m = true;
                    bVar3.f59358n = 40;
                }
                C20828a.m22825b().mo32520i(aVar2.field_songHAlbumUrl, cdnImageView2, bVar3.mo32666a(), this.f292518d);
            } else {
                int i = aVar2.field_musicType;
                if (i != 0) {
                    if (i != 1) {
                        switch (i) {
                            case 4:
                                C20937c.C20939b bVar4 = new C20937c.C20939b();
                                bVar4.f59350f = C102984b.m136169f(aVar2.field_musicId, false);
                                bVar4.f59346b = true;
                                bVar4.f59345a = true;
                                if (z2) {
                                    bVar4.f59357m = true;
                                    bVar4.f59358n = 10;
                                }
                                C20828a.m22825b().mo32520i(aVar2.field_songAlbumUrl, cdnImageView2, bVar4.mo32666a(), this.f292518d);
                                break;
                            case 5:
                            case 7:
                            case 10:
                            case 11:
                                break;
                            case 6:
                                bitmap2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127167Lo(aVar2.field_songAlbumLocalPath, true, C76577a.m92156g(context), false, true);
                                break;
                            case 8:
                            case 9:
                                break;
                        }
                    }
                    C101804kv2 kv22 = new C101804kv2();
                    kv22.f298689d = aVar2.field_songMediaId;
                    String str = aVar2.field_songAlbumUrl;
                    kv22.f298694i = str;
                    kv22.f298695j = aVar2.field_songAlbumType;
                    kv22.f298692g = str;
                    if (C99019x.m128972d() != null) {
                        Bitmap n = ((C94901o) C99019x.m128972d()).mo131130n(kv22);
                        if (n != null) {
                            bitmap2 = BitmapUtil.fastblur(n, 10);
                        } else {
                            cdnImageView2.setImageResource(C0966R.C0969drawable.bzf);
                            if (!aVar.mo140849l2() && (bVar2 = this.f292516b) != null) {
                                ((C94243l) bVar2).mo129567d(aVar2, new int[]{-16777216, -1});
                            }
                            ((C94901o) C99019x.m128972d()).mo131091K(cdnImageView2);
                            ((C94901o) C99019x.m128972d()).mo131116f0(kv22, cdnImageView2, context.hashCode(), C96983o3.f284139k);
                            this.f292519e.removeCallbacksAndMessages((Object) null);
                            this.f292519e.postDelayed(new C99822c(aVar2), 1000);
                            bitmap2 = n;
                        }
                    }
                }
                if (bitmap2 == null) {
                    bitmap2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127188jo(aVar2.field_songAlbumLocalPath, C76577a.m92156g(context), false);
                }
                if (bitmap2 != null) {
                    bitmap2 = BitmapUtil.fastblur(bitmap2, 10);
                } else {
                    cdnImageView2.setImageResource(C0966R.C0969drawable.bzf);
                    if (!aVar.mo140849l2() && (bVar = this.f292516b) != null) {
                        ((C94243l) bVar).mo129567d(aVar2, new int[]{-16777216, -1});
                    }
                    Log.m105925i("MicroMsg.Music.MusicImageLoader", "field_songAlbumUrl:%s", aVar2.field_songAlbumUrl);
                    if (!TextUtils.isEmpty(aVar2.field_songAlbumUrl)) {
                        C20937c.C20939b bVar5 = new C20937c.C20939b();
                        bVar5.f59350f = C102984b.m136169f(aVar2.field_musicId, true);
                        bVar5.f59346b = true;
                        bVar5.f59345a = true;
                        if (z2) {
                            bVar5.f59357m = true;
                            bVar5.f59358n = 10;
                        }
                        C20828a.m22825b().mo32520i(aVar2.field_songAlbumUrl, cdnImageView2, bVar5.mo32666a(), this.f292518d);
                    }
                }
            }
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                mo139178c(aVar2, bitmap2);
                cdnImageView2.setImageBitmap(bitmap2);
                int[] c = C85875k4.m106174c(bitmap2, 4, 4);
                if (!(aVar2.field_songBgColor == c[0] && aVar2.field_songLyricColor == c[1])) {
                    aVar2 = C99814o0.wx0().mo140852Ow(aVar2.field_musicId, c[0], c[1]);
                }
                C34529b bVar6 = this.f292516b;
                if (bVar6 != null && aVar2 != null) {
                    ((C94243l) bVar6).mo129567d(aVar2, c);
                    return;
                }
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.Music.MusicImageLoader", "hit cache %s", aVar2.field_musicId);
        cdnImageView2.setImageBitmap(bitmap);
        int[] c2 = aVar.mo140849l2() ? new int[]{aVar2.field_songBgColor, aVar2.field_songLyricColor} : C85875k4.m106174c(bitmap, 4, 4);
        C34529b bVar7 = this.f292516b;
        if (bVar7 != null) {
            ((C94243l) bVar7).mo129567d(aVar2, c2);
        }
    }

    /* renamed from: c */
    public final void mo139178c(C101365a aVar, Bitmap bitmap) {
        Log.m105925i("MicroMsg.Music.MusicImageLoader", "putBitmapToCache %s", aVar.field_musicId);
        ((C100301b) this.f292515a).put(aVar.field_musicId, bitmap);
    }
}

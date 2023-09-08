package com.tencent.p014mm.p136ui;

import a70.C112760b;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ig3.C108460i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import p1093bh.C104084a;
import p159gw.C98250h;
import p248ug.C111161j0;
import p520fi.C107547d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.l2 */
public class C106714l2 implements C111161j0 {

    /* renamed from: a */
    public final /* synthetic */ int f319050a;

    /* renamed from: b */
    public final /* synthetic */ MMNewPhotoEditUI f319051b;

    public C106714l2(MMNewPhotoEditUI mMNewPhotoEditUI, int i) {
        this.f319051b = mMNewPhotoEditUI;
        this.f319050a = i;
    }

    /* renamed from: a */
    public void mo79184a(Bitmap bitmap, boolean z) {
        Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[onSuccess] w:%s h:%s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        try {
            String K = C112760b.m154203K();
            if (!C86013q1.m106450k(K)) {
                C86013q1.m106461v(K);
            }
            String str = K + String.format(Locale.US, "%s%d.%s", new Object[]{"mmexport", Long.valueOf(System.currentTimeMillis()), "jpg"});
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, str, true);
            Log.m105925i("MicroMsg.MMNewPhotoEditUI", "[onSuccess] photoPath:%s", str);
            MMNewPhotoEditUI mMNewPhotoEditUI = this.f319051b;
            PhotoEditProxy photoEditProxy = mMNewPhotoEditUI.f318662p;
            String str2 = mMNewPhotoEditUI.f318654e;
            long j = mMNewPhotoEditUI.f318655f;
            ((C108460i) mMNewPhotoEditUI.f318653d.mo162893b()).getClass();
            ArtistCacheManager a = ArtistCacheManager.m140185a();
            C104084a aVar = C104084a.EMOJI_AND_TEXT;
            String str3 = ((C107547d) a.mo148160c(aVar)).mo157989b(true, ",")[0];
            ((C108460i) this.f319051b.f318653d.mo162893b()).getClass();
            photoEditProxy.recordImage(str2, str, j, str3, ((C107547d) ArtistCacheManager.m140185a().mo148160c(aVar)).mo157989b(true, "||")[1]);
            MMNewPhotoEditUI mMNewPhotoEditUI2 = this.f319051b;
            mMNewPhotoEditUI2.f318657h = str;
            if (mMNewPhotoEditUI2.f318658i) {
                AndroidMediaUtil.refreshMediaScanner(str, mMNewPhotoEditUI2);
            }
            if (this.f319050a == 2) {
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137350sE(this.f319051b.getContext(), str);
                ((ArrayList) this.f319051b.f318663q).add(str);
            }
            if (this.f319050a != 0 && !bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.MMNewPhotoEditUI", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
            }
            MMNewPhotoEditUI mMNewPhotoEditUI3 = this.f319051b;
            int i = mMNewPhotoEditUI3.f318659j;
            if (i != 291) {
                if (i != 293) {
                    MMNewPhotoEditUI.m143995J7(mMNewPhotoEditUI3, str);
                    return;
                }
            }
            int i2 = this.f319050a;
            if (i2 == 0) {
                MMNewPhotoEditUI.m143993H7(mMNewPhotoEditUI3, str);
                this.f319051b.mo153392K7(false);
                MMNewPhotoEditUI.m143994I7(this.f319051b, 1);
            } else if (i2 == 1) {
                mMNewPhotoEditUI3.f318662p.doFav(str);
                MMNewPhotoEditUI.m143994I7(this.f319051b, 2);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f319051b.getString(C0966R.string.cmh), 1).show();
                this.f319051b.mo153392K7(false);
                this.f319051b.finish();
            } else if (i2 == 2) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f319051b.getString(C0966R.string.cgp, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
                MMNewPhotoEditUI.m143994I7(this.f319051b, 3);
                this.f319051b.mo153392K7(false);
                this.f319051b.finish();
            }
        } catch (IOException e) {
            mo79185b(e);
        }
    }

    /* renamed from: b */
    public void mo79185b(Exception exc) {
        MMNewPhotoEditUI mMNewPhotoEditUI = this.f319051b;
        int i = MMNewPhotoEditUI.f318652t;
        mMNewPhotoEditUI.mo153392K7(false);
        Log.m105921e("MicroMsg.MMNewPhotoEditUI", "[onRefreshed] %s", exc);
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f319051b.getResources().getString(C0966R.string.cbl), 1).show();
        this.f319051b.setResult(0);
        this.f319051b.finish();
    }
}

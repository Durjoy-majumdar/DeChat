package com.tencent.p014mm.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import p996kj.C88155a;
import vd3.C78407r;

/* renamed from: com.tencent.mm.app.g */
public class C67648g implements C78407r.C78409b {

    /* renamed from: d */
    public volatile Bitmap f193459d = null;

    /* renamed from: e */
    public C76708i f193460e = null;

    /* renamed from: f */
    public C10579k f193461f;

    /* renamed from: E0 */
    public void mo10724E0(C78407r rVar) {
        if (rVar instanceof C10579k.C10580a) {
            ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b((C10579k.C10580a) rVar);
        }
    }

    /* renamed from: O */
    public Bitmap mo10725O(String str) {
        if (this.f193461f == null) {
            synchronized (this) {
                if (this.f193461f == null) {
                    this.f193461f = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
                }
            }
        }
        return ((AvatarStorage) this.f193461f).mo93561j(str);
    }

    public Bitmap loadBitmap(String str) {
        if (this.f193460e == null) {
            synchronized (this) {
                if (this.f193460e == null) {
                    this.f193460e = (C76708i) C86312j.m106911c(C76708i.class);
                }
            }
        }
        return this.f193460e.N50(str);
    }

    public Bitmap ov0(String str, int i, int i2, int i3) {
        if (this.f193460e == null) {
            synchronized (this) {
                if (this.f193460e == null) {
                    this.f193460e = (C76708i) C86312j.m106911c(C76708i.class);
                }
            }
        }
        return this.f193460e.mo106846sO(str, i, i2, i3);
    }

    /* renamed from: qq */
    public Bitmap mo10728qq() {
        if (this.f193459d == null || this.f193459d.isRecycled()) {
            synchronized (this) {
                if (this.f193459d == null || this.f193459d.isRecycled()) {
                    this.f193459d = C88155a.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.raw.default_avatar, (BitmapFactory.Options) null);
                }
            }
        }
        return this.f193459d;
    }
}

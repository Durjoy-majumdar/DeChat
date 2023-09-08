package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107879e0;
import gq0.C107885g0;
import gq0.C59603h0;
import iq0.C98783b;
import java.lang.ref.WeakReference;
import kr0.C109033l0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v0 */
public class ImageGalleryUI$$v0 implements C59603h0 {

    /* renamed from: a */
    public final WeakReference<ImageGalleryUI> f284546a;

    /* renamed from: b */
    public final String f284547b;

    /* renamed from: c */
    public final C109033l0 f284548c;

    /* renamed from: d */
    public final C98783b f284549d;

    public ImageGalleryUI$$v0(ImageGalleryUI imageGalleryUI, String str, C109033l0 l0Var, C98783b bVar) {
        this.f284546a = new WeakReference<>(imageGalleryUI);
        this.f284547b = str;
        this.f284548c = l0Var;
        this.f284549d = bVar;
    }

    /* renamed from: a */
    public void mo25342a(boolean z, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        ImageGalleryUI imageGalleryUI = this.f284546a.get();
        if (imageGalleryUI == null) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, ui is null");
        } else if (!z) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, fail");
        } else {
            C77407n nVar = imageGalleryUI.f284448m1;
            if (nVar == null) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, bottomSheet is null");
                return;
            }
            imageGalleryUI.f284468s2 = this.f284547b;
            imageGalleryUI.f284471t2 = appBrandOpenMaterialCollection;
            if (!this.f284548c.mo158325ic(nVar, appBrandOpenMaterialCollection)) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, not need enhance");
                return;
            }
            C97149u1 u1Var = null;
            C97056h hVar = imageGalleryUI.f284432g;
            if (hVar != null) {
                u1Var = hVar.mo135933u();
            }
            if (u1Var != null && C97149u1.EXPIRED != u1Var) {
                C107885g0 g0Var = imageGalleryUI.f284474u2;
                if (g0Var != null) {
                    g0Var.dead();
                }
                C109033l0 l0Var = this.f284548c;
                C98783b bVar = this.f284549d;
                C77407n nVar2 = imageGalleryUI.f284448m1;
                AppBrandOpenMaterialCollection appBrandOpenMaterialCollection2 = imageGalleryUI.f284471t2;
                if (imageGalleryUI.f284477v2 == null) {
                    imageGalleryUI.f284477v2 = new ImageGalleryUI$$y0(imageGalleryUI);
                }
                imageGalleryUI.f284474u2 = l0Var.mo158322RD(bVar, imageGalleryUI, nVar2, appBrandOpenMaterialCollection2, (C107879e0) null, imageGalleryUI.f284477v2);
                if (C98783b.IMAGE == this.f284549d && imageGalleryUI.mo135727J8()) {
                    Log.m105924i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet#onMyOpenMaterialsGot, hide enhance bottomSheet");
                    imageGalleryUI.f284474u2.mo158311o(C107885g0.C45943b.HIDE);
                }
            }
        }
    }
}

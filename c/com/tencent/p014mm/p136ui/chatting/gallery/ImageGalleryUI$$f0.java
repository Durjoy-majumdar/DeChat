package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Bitmap;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gk3.C98140g;
import gk3.C98162q;
import gy3.C87412m;
import i21.C98591h;
import ig3.C98689k;
import java.util.Iterator;
import p1083jg.C98939a;
import p158gt.C76053l;
import p434ig.C98672d;
import p606mm.C99933h;
import qh0.C62619a;
import qo3.C77407n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$f0 */
public class ImageGalleryUI$$f0 implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public boolean f284506d = false;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284507e;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$f0$a */
    public class C97022a implements TouchMediaPreviewLayout.C97276b {
        public C97022a() {
        }

        /* renamed from: a */
        public void mo132739a() {
            ImageGalleryUI.m124729K7(ImageGalleryUI$$f0.this.f284507e);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$f0$b */
    public class C97023b implements MMViewPager.C19705g {
        public C97023b() {
        }

        /* renamed from: a */
        public void mo26055a() {
            ImageGalleryUI.m124729K7(ImageGalleryUI$$f0.this.f284507e);
        }
    }

    public ImageGalleryUI$$f0(ImageGalleryUI imageGalleryUI) {
        this.f284507e = imageGalleryUI;
    }

    public void onPageScrollStateChanged(int i) {
        Log.m105919d("MicroMsg.ImageGalleryUI", "onPageScrollStateChanged: %d", Integer.valueOf(i));
        if (i == 2) {
            this.f284507e.f284491z2 = true;
        }
        if (i == 0) {
            this.f284506d = false;
            ImageGalleryUI imageGalleryUI = this.f284507e;
            boolean z = imageGalleryUI.f284491z2;
            imageGalleryUI.f284491z2 = false;
        }
        C97056h hVar = this.f284507e.f284432g;
        if (hVar != null) {
            C97100o oVar = hVar.f284719o;
            if (oVar != null) {
                oVar.f284893p = i;
                C97109p pVar = oVar.f284888h;
                if (pVar != null) {
                    pVar.onPageScrollStateChanged(i);
                }
            }
            C97052g gVar = hVar.f284720p;
            if (gVar != null) {
                gVar.f284699g = i;
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        Log.m105927v("MicroMsg.ImageGalleryUI", "position: %d, positionOffset: %f, positionOffsetPixels: %d", Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
        if (!this.f284506d && i2 > 0) {
            this.f284506d = true;
        }
    }

    public void onPageSelected(int i) {
        int i2;
        C72963f4 w;
        CdnVideoResourceDownloader a;
        int i3 = i;
        Class cls = C98591h.class;
        boolean z = false;
        Log.m105927v("MicroMsg.ImageGalleryUI", "onPageChange position: %d", Integer.valueOf(i));
        ImageGalleryUI imageGalleryUI = this.f284507e;
        if (imageGalleryUI.f284432g != null) {
            if (imageGalleryUI.mo135762c8()) {
                ImageGalleryUI imageGalleryUI2 = this.f284507e;
                if (imageGalleryUI2.f284409X0 != null) {
                    if (imageGalleryUI2.f284432g.mo135935w().mo100994f4()) {
                        this.f284507e.f284409X0.setEnable(true);
                        if (this.f284507e.f284409X0.getLongPressListener() == null) {
                            this.f284507e.f284409X0.setLongPressListener(new C97022a());
                        }
                        ImageGalleryUI imageGalleryUI3 = this.f284507e;
                        imageGalleryUI3.f284453o = false;
                        imageGalleryUI3.f284450n.setLongClickOverListener((MMViewPager.C19705g) null);
                    } else if (this.f284507e.f284432g.mo135935w().mo100979R3()) {
                        this.f284507e.f284409X0.setEnable(false);
                        this.f284507e.f284409X0.setLongPressListener((TouchMediaPreviewLayout.C97276b) null);
                        ImageGalleryUI imageGalleryUI4 = this.f284507e;
                        if (!imageGalleryUI4.f284453o) {
                            imageGalleryUI4.f284453o = true;
                            imageGalleryUI4.f284450n.setLongClickOverListener(new C97023b());
                        }
                    }
                }
            }
            this.f284507e.f284362I.setVisibility(8);
            C97052g gVar = this.f284507e.f284432g.f284720p;
            if (!(gVar == null || (w = gVar.f284638d.mo135935w()) == null || (a = C73703d.f216412a.mo102767a(w.getMsgId())) == null || a.f282440e)) {
                a.f282445j = gVar;
            }
            ImageGalleryUI imageGalleryUI5 = this.f284507e;
            if (imageGalleryUI5.f284488y2 != i3) {
                C77407n nVar = imageGalleryUI5.f284448m1;
                if (nVar != null && nVar.mo107563h()) {
                    this.f284507e.f284448m1.mo107572p();
                }
                ImageGalleryUI imageGalleryUI6 = this.f284507e;
                imageGalleryUI6.f284368K.setVisibility(8);
                imageGalleryUI6.f284368K.setTextColor(-1);
                ImageGalleryUI imageGalleryUI7 = this.f284507e;
                if (!imageGalleryUI7.f284340A2) {
                    imageGalleryUI7.mo135731M8();
                    this.f284507e.f284404V1.mo137419e(2, C97100o.m125011p(this.f284507e.f284432g.mo135935w()));
                    ImageGalleryUI imageGalleryUI8 = this.f284507e;
                    int i4 = imageGalleryUI8.f284347D;
                    if (!(i4 == 0 || i4 == 4 || (imageGalleryUI8.f284461q1.mo137426f(i4) && imageGalleryUI8.f284461q1.mo137421a(imageGalleryUI8.f284347D)))) {
                        int i5 = imageGalleryUI8.f284464r1 + 1;
                        imageGalleryUI8.f284464r1 = i5;
                        Log.m105925i("MicroMsg.ImageGalleryUI", "alvinluo checkQuickButtonWhenPageChanged not valid %d, currentButtonType: %d", Integer.valueOf(i5), Integer.valueOf(imageGalleryUI8.f284347D));
                        if (imageGalleryUI8.f284464r1 >= 2) {
                            imageGalleryUI8.mo135721D8(0, false);
                            imageGalleryUI8.f284464r1 = 0;
                        }
                    }
                }
                ImageGalleryUI imageGalleryUI9 = this.f284507e;
                C98140g gVar2 = imageGalleryUI9.f284461q1;
                gVar2.getClass();
                Log.m105924i("MicroMsg.ImageScanButtonStatusManager", "alvinluo resetSet");
                gVar2.mo137428h(1);
                gVar2.mo137428h(5);
                gVar2.mo137428h(2);
                gVar2.mo137428h(3);
                gVar2.mo137428h(4);
                gVar2.mo137428h(6);
                Iterator<Integer> it = gVar2.f287752a.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    gVar2.mo137422b(intValue);
                    C98140g.C98141a aVar = gVar2.f287753b.get(Integer.valueOf(intValue));
                    if (aVar != null) {
                        aVar.setEnable(true);
                    }
                }
                C98162q qVar = imageGalleryUI9.f284451n1;
                qVar.f287785a.clear();
                qVar.f287786b = null;
                qVar.f287787c = null;
                imageGalleryUI9.f284357G1 = false;
                imageGalleryUI9.f284360H1 = 0;
                ImageGalleryUI$$x0 imageGalleryUI$$x0 = imageGalleryUI9.f284465r2;
                imageGalleryUI$$x0.getClass();
                Log.m105924i("MicroMsg.ImageGalleryUI", "reset#ScanState");
                imageGalleryUI$$x0.f284555a = 0;
                ImageGalleryUI imageGalleryUI10 = this.f284507e;
                imageGalleryUI10.f284354F1 = false;
                if (imageGalleryUI10.f284363I1 == 1) {
                    imageGalleryUI10.mo135756Z7(false);
                }
                ImageGalleryUI imageGalleryUI11 = this.f284507e;
                imageGalleryUI11.f284363I1 = 0;
                imageGalleryUI11.f284351E1 = 0;
            }
            if (this.f284507e.f284432g.mo139420e(i3) == null) {
                Log.m105921e("MicroMsg.ImageGalleryUI", "onPageSelected the view is null, position = %s ", Integer.valueOf(i));
            }
            ImageGalleryUI imageGalleryUI12 = this.f284507e;
            imageGalleryUI12.f284450n.setGalleryScaleListener(new C97036b0(imageGalleryUI12));
            ImageGalleryUI imageGalleryUI13 = this.f284507e;
            imageGalleryUI13.mo135774i9(imageGalleryUI13.f284488y2);
            ImageGalleryUI imageGalleryUI14 = this.f284507e;
            imageGalleryUI14.f284478w.mo136025d(imageGalleryUI14, imageGalleryUI14.f284488y2, i3);
            ImageGalleryUI imageGalleryUI15 = this.f284507e;
            imageGalleryUI15.f284488y2 = i3;
            C97056h hVar = imageGalleryUI15.f284432g;
            if (hVar != null) {
                hVar.f284720p.mo135852z();
                hVar.f284721q.mo136056o();
                C72963f4 y = this.f284507e.f284432g.mo135937y(i3);
                if (y != null) {
                    this.f284507e.f284341B = y.getMsgId();
                    ((C98591h) C86312j.m106911c(cls)).Gr0(y.mo108768t());
                    ImageGalleryUI imageGalleryUI16 = this.f284507e;
                    C97056h hVar2 = imageGalleryUI16.f284432g;
                    imageGalleryUI16.f284441j = C97056h.m124949B(y);
                    this.f284507e.f284397T0 = y.mo101016t3();
                    ImageGalleryUI imageGalleryUI17 = this.f284507e;
                    if (!imageGalleryUI17.f284340A2 && imageGalleryUI17.f284397T0) {
                        Class cls2 = C99933h.class;
                        C62619a aVar2 = new C62619a();
                        aVar2.f177833h = 2;
                        ((C99933h) C86312j.m106911c(cls2)).mo84399BM(18, "album_enter_from_scene", aVar2, new ImageGalleryUI$$a());
                        ((C99933h) C86312j.m106911c(cls2)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(1, y, 0, 0, (C98672d) null, 0));
                    }
                }
                if (C97056h.m124953H(y) || C97056h.m124952F(y)) {
                    ImageGalleryUI imageGalleryUI18 = this.f284507e;
                    View g8 = imageGalleryUI18.mo135770g8(imageGalleryUI18.f284432g, imageGalleryUI18.f284450n);
                    if (g8 != null && (g8 instanceof C19706a)) {
                        if (g8 instanceof MultiTouchImageView) {
                            ((MultiTouchImageView) g8).mo26059d();
                        } else if (g8 instanceof WxImageView) {
                            ((WxImageView) g8).mo26059d();
                        }
                    }
                    ImageGalleryUI imageGalleryUI19 = this.f284507e;
                    View L7 = ImageGalleryUI.m124730L7(imageGalleryUI19, imageGalleryUI19.f284432g, imageGalleryUI19.f284450n);
                    if (L7 instanceof WxImageView) {
                        ((WxImageView) L7).setDrawFullSampleSizeBitmap(false);
                    }
                    String u5 = this.f284507e.mo135788u5();
                    this.f284507e.mo135746U7(u5, false);
                    this.f284507e.mo135748V7(g8, C86013q1.m106448i(u5, false), (Bitmap) null, 1, this.f284507e.f284407W1);
                    ((C98591h) C86312j.m106911c(cls)).mo137967Gh(y, C97056h.C97063f.f284741p != i3);
                    ImageGalleryUI.m124727I7(this.f284507e, y.getMsgId());
                    ImageGalleryUI imageGalleryUI20 = this.f284507e;
                    String e8 = imageGalleryUI20.mo135766e8();
                    Log.m105925i("MicroMsg.ImageGalleryUI", "checkImageItemSourceUrl url: %s", e8);
                    if (!Util.isNullOrNil(e8)) {
                        i2 = 6;
                        imageGalleryUI20.f284461q1.mo137429i(6, 1);
                    } else {
                        i2 = 6;
                        imageGalleryUI20.f284461q1.mo137429i(6, 2);
                    }
                    imageGalleryUI20.mo135738Q7(i2, false);
                } else if (C97056h.m124955K(y)) {
                    ((C98591h) C86312j.m106911c(cls)).e20(y);
                    boolean z2 = C97056h.C97063f.f284741p != i3;
                    C87412m.m108594g(y, "msg");
                    ((C119157j) C119157j.f356862d).mo183875f(new C98689k(y, z2));
                }
                if (y != null) {
                    this.f284507e.mo135733N8(y.getMsgId());
                }
                C97056h hVar3 = this.f284507e.f284432g;
                if (hVar3 != null) {
                    C92836k x = hVar3.mo135936x(y, false);
                    if (this.f284507e.f284432g.mo135916G(y, x)) {
                        C92836k jD = ((C76053l) C86312j.m106911c(C76053l.class)).mo106261jD(x);
                        int i6 = jD.f267377d;
                        int max = Math.max(1, (int) (i6 != 0 ? ((((long) jD.f267376c) * 100) / ((long) i6)) - 1 : 0));
                        Log.m105919d("MicroMsg.ImageGalleryUI", "jacks loading hd from imgInfo : %d, time: %d", Integer.valueOf(max), Long.valueOf(System.currentTimeMillis()));
                        this.f284507e.mo135794z8(max);
                    }
                } else {
                    Log.m105920e("MicroMsg.ImageGalleryUI", "[arthurdan.ImageGallery] Notice!!! adapter is null");
                }
                if (y == null) {
                    Log.m105920e("MicroMsg.ImageGalleryUI", "update footer fail, msg is null, position = " + i3);
                } else {
                    ImageGalleryUI imageGalleryUI21 = this.f284507e;
                    imageGalleryUI21.mo135772h9(i3, y, true ^ imageGalleryUI21.f284340A2);
                    this.f284507e.f284340A2 = false;
                }
            }
            C97056h hVar4 = this.f284507e.f284432g;
            if (!(hVar4 == null || hVar4.f284719o == null || !C97056h.m124953H(hVar4.mo135937y(i3)))) {
                hVar4.f284719o.f284888h.onPageSelected(i3);
            }
            ImageGalleryUI imageGalleryUI22 = this.f284507e;
            C97056h hVar5 = imageGalleryUI22.f284432g;
            if (hVar5 != null) {
                Boolean A = hVar5.mo135914A(hVar5.mo135937y(imageGalleryUI22.f284488y2));
                ImageGalleryUI imageGalleryUI23 = this.f284507e;
                C72963f4 y2 = imageGalleryUI23.f284432g.mo135937y(imageGalleryUI23.f284488y2);
                if (A != null) {
                    z = A.booleanValue();
                }
                imageGalleryUI23.mo135732N7(y2, z);
            }
        }
    }
}

package com.tencent.p014mm.p136ui.chatting.gallery;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.p136ui.chatting.RevokeMsgListener;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.gallery.C97128t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.ImageOptimLib;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import d20.C20382b;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import o90.C100301b;
import ob0.C117747y;
import p154fy.C87121j;
import p158gt.C76051j;
import p158gt.C76053l;
import p158gt.C98201k;
import p206nj.C11171e;
import p556hw.C76247e;
import p823sg.C77710q;
import pr3.C35626b;

/* renamed from: com.tencent.mm.ui.chatting.gallery.o */
public class C97100o extends C97030a implements C76051j.C76052a, C97048f {

    /* renamed from: q */
    public static boolean f284883q = true;

    /* renamed from: r */
    public static long f284884r = ((long) (((double) Runtime.getRuntime().maxMemory()) * 0.05d));

    /* renamed from: e */
    public IListener f284885e;

    /* renamed from: f */
    public C97122r1 f284886f;

    /* renamed from: g */
    public HashMap<Long, Integer> f284887g = new HashMap<>();

    /* renamed from: h */
    public final C97109p f284888h;

    /* renamed from: i */
    public HashMap<String, WeakReference<Bitmap>> f284889i;

    /* renamed from: j */
    public HashMap<C72963f4, String> f284890j;

    /* renamed from: n */
    public HashMap<C72963f4, String> f284891n;

    /* renamed from: o */
    public long f284892o;

    /* renamed from: p */
    public int f284893p;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.o$a */
    public class C97101a implements C20382b {

        /* renamed from: a */
        public final /* synthetic */ String f284894a;

        /* renamed from: b */
        public final /* synthetic */ int f284895b;

        /* renamed from: c */
        public final /* synthetic */ C97087m1 f284896c;

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f284897d;

        public C97101a(String str, int i, C97087m1 m1Var, C72963f4 f4Var) {
            this.f284894a = str;
            this.f284895b = i;
            this.f284896c = m1Var;
            this.f284897d = f4Var;
        }

        public void onImageLoadError(ImageDecodeResult imageDecodeResult) {
            Log.m105921e("MicroMsg.ImageGalleryHolderImage", "alvinluo BigImgOpt onImageLoadError errCode: %d, errMsg: %s", Integer.valueOf(imageDecodeResult.errCode), imageDecodeResult.errMsg);
            C35626b.m40780a(imageDecodeResult.errCode);
            C97100o oVar = C97100o.this;
            String str = this.f284894a;
            C97087m1 m1Var = this.f284896c;
            int i = this.f284895b;
            oVar.getClass();
            try {
                Log.m105925i("MicroMsg.ImageGalleryHolderImage", "alvinluo tryLoadBitmap after big image load error, imgPath: %s", str);
                oVar.mo135989B(m1Var, false, true);
                oVar.f284888h.mo136011b(m1Var.f284820C, str, i);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ImageGalleryHolderImage", e, "alvinluo tryLoadBitmap exception", new Object[0]);
            }
            if (imageDecodeResult.errCode == 4) {
                C97100o.f284883q = false;
            }
        }

        public void onImageLoaded(Bitmap bitmap) {
            if (!(bitmap == null || C97100o.this.f284888h == null)) {
                Log.m105925i("MicroMsg.ImageGalleryHolderImage", "alvinluo onImageLoaded cache bitmap, cacheImagePath: %s", this.f284894a);
                C97109p pVar = C97100o.this.f284888h;
                int i = this.f284895b;
                if (i <= 0) {
                    i = this.f284896c.f284836c;
                }
                pVar.mo136012c(i, bitmap);
            }
            C97100o.this.mo135989B(this.f284896c, true, false);
            if (C97100o.this.f284886f != null) {
                C72963f4 f4Var = this.f284897d;
                ((ImageGalleryUI$$d0) C97100o.this.f284886f).mo135801a(f4Var != null ? f4Var.getMsgId() : 0, this.f284896c.f284821D, this.f284894a, bitmap);
            }
        }

        public void onPreviewLoadError(ImageDecodeResult imageDecodeResult) {
            Log.m105921e("MicroMsg.ImageGalleryHolderImage", "alvinluo BigImgOpt onPreviewLoadError errCode: %d, errMsg: %s", Integer.valueOf(imageDecodeResult.errCode), imageDecodeResult.errMsg);
        }

        public void onPreviewLoaded() {
            Log.m105924i("MicroMsg.ImageGalleryHolderImage", "alvinluo SubsamplingImageView onPreviewLoaded");
        }

        public void onPreviewReleased() {
        }

        public void onReady() {
        }

        public void onTileLoadError(ImageDecodeResult imageDecodeResult) {
            Log.m105921e("MicroMsg.ImageGalleryHolderImage", "alvinluo BigImgOpt onTileLoadError errCode: %d, errMsg: %s", Integer.valueOf(imageDecodeResult.errCode), imageDecodeResult.errMsg);
            C97100o.this.mo135992l(this.f284897d, this.f284896c, this.f284895b, 5);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.o$b */
    public class C97102b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f284899d;

        public C97102b(int i) {
            this.f284899d = i;
        }

        public void run() {
            ImageGalleryUI imageGalleryUI;
            C97056h hVar = C97100o.this.f284638d;
            if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
                int i = this.f284899d;
                imageGalleryUI.mo135772h9(i, imageGalleryUI.f284432g.mo135937y(i), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.o$c */
    public static class C97103c {

        /* renamed from: h */
        public static HashMap<String, C97103c> f284901h = new HashMap<>();

        /* renamed from: a */
        public int f284902a;

        /* renamed from: b */
        public int f284903b;

        /* renamed from: c */
        public int f284904c;

        /* renamed from: d */
        public long f284905d = 0;

        /* renamed from: e */
        public int f284906e = 0;

        /* renamed from: f */
        public String f284907f = "";

        /* renamed from: g */
        public int f284908g = 0;

        /* renamed from: a */
        public static void m125034a(String str, int i, int i2, int i3) {
            try {
                if (!Util.isNullOrNil(str) && i != 0) {
                    if (i2 != 0) {
                        C97103c cVar = f284901h.get(str);
                        if (cVar == null) {
                            cVar = new C97103c();
                            cVar.f284905d = Util.nowMilliSecond();
                            f284901h.put(str, cVar);
                        }
                        cVar.f284904c = i2;
                        cVar.f284903b = i;
                        cVar.f284907f += "" + i3 + "|";
                        if (i3 > 0) {
                            if (cVar.f284906e == 0) {
                                cVar.f284906e = i3;
                            }
                        } else if (cVar.f284906e != 0) {
                            cVar.f284908g++;
                            cVar.f284906e = 0;
                        }
                        Log.m105925i("MicroMsg.ImageGalleryHolderImage", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cVar.f284906e), Integer.valueOf(cVar.f284908g), cVar.f284907f, str);
                    }
                }
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.ImageGalleryHolderImage", "get useopt  addBit :%s", Util.stackTraceToString(th));
            }
        }
    }

    public C97100o(C97056h hVar, int[] iArr) {
        super(hVar);
        C97109p pVar = new C97109p(this);
        this.f284888h = pVar;
        this.f284889i = new HashMap<>();
        this.f284890j = new HashMap<>();
        this.f284891n = new HashMap<>();
        this.f284892o = 0;
        this.f284893p = 0;
        RevokeMsgListener revokeMsgListener = new RevokeMsgListener(RevokeMsgListener.C73288a.IMAGE_GALLERY_UI, hVar.f284714g);
        this.f284885e = revokeMsgListener;
        revokeMsgListener.alive();
        Map snapshot = ((C100301b) C97128t.C97130b.f284993a.f284989a).snapshot();
        for (String str : snapshot.keySet()) {
            Bitmap bitmap = (Bitmap) snapshot.get(str);
            if (bitmap != null) {
                ((C100301b) pVar.f284929q).put(str, bitmap);
                pVar.f284930r.push(Integer.valueOf(bitmap.hashCode()));
                Log.m105925i("MicroMsg.ImageGalleryLazyLoader", "we got one cache from preload : %s %s", str, Integer.valueOf(bitmap.hashCode()));
            } else {
                Log.m105920e("MicroMsg.ImageGalleryLazyLoader", "we got one null cache from preload");
            }
        }
        C97108o1.m125035a().f284915e = this;
    }

    /* renamed from: D */
    public static Bitmap m125010D(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        String str2 = str;
        String str3 = str2 + "_tmp.jpg";
        Bitmap bitmap = null;
        try {
            if (C11171e.m11044a(16)) {
                return null;
            }
            if (!CrashReportFactory.hasDebuger()) {
                int i6 = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("UseOptImageRecv"), 0);
                C77710q qVar = new C77710q(C97625j3.m125812b().mo105881G());
                Log.m105925i("MicroMsg.ImageGalleryHolderImage", "fromPathToImgInfo opt:%d uin:(%d,%d) debug:%b sdk:%d", Integer.valueOf(i6), Long.valueOf(qVar.longValue()), Long.valueOf(qVar.longValue() / 100), Boolean.valueOf(CrashReportFactory.hasDebuger()), Integer.valueOf(Build.VERSION.SDK_INT));
                if ((((int) (qVar.longValue() / 100)) % 100) + 1 > i6) {
                    return null;
                }
            }
            C86013q1.m106461v(C86013q1.m106458s(str3));
            C86013q1.m106442c(str2, str3);
            boolean IsJpegFile = MMNativeJpeg.IsJpegFile(str3);
            boolean isProgressive = MMNativeJpeg.isProgressive(str3);
            boolean checkIntegrity = ImageOptimLib.checkIntegrity(str3);
            int l = (int) C86013q1.m106451l(str3);
            if (!IsJpegFile || !isProgressive) {
                int i7 = i;
                int i8 = i2;
            } else {
                if (checkIntegrity) {
                    bitmap = MMNativeJpeg.decodeAsBitmap(str3);
                }
                if (bitmap != null) {
                    i3 = i;
                    i5 = i2;
                    i4 = l;
                } else {
                    i4 = 0 - l;
                    i3 = i;
                    i5 = i2;
                }
                C97103c.m125034a(str2, i5, i3, i4);
            }
            Log.m105925i("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt jpeg:%b isprog:%b inte:%b len:%d [%d,%d] bm:%s path:%s", Boolean.valueOf(IsJpegFile), Boolean.valueOf(isProgressive), Boolean.valueOf(checkIntegrity), Integer.valueOf(l), Integer.valueOf(i2), Integer.valueOf(i), bitmap, str2);
            C86013q1.m106447h(str3);
            return bitmap;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ImageGalleryHolderImage", "get useopt :%s", Util.stackTraceToString(e));
            return null;
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.ImageGalleryHolderImage", "dkprog tryUseImageOpt failed. file:%s e:%s", str2, Util.stackTraceToString(th));
        }
    }

    /* renamed from: p */
    public static C92836k m125011p(C72963f4 f4Var) {
        Class cls = C98201k.class;
        if (!C97056h.m124953H(f4Var)) {
            return null;
        }
        if (f4Var.mo108769t2() == 1) {
            long msgId = f4Var.getMsgId();
            C92836k vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var.mo108768t(), msgId);
            if (vP.f267374a != 0) {
                return vP;
            }
            long y2 = f4Var.mo108774y2();
            return ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), y2);
        }
        long y25 = f4Var.mo108774y2();
        return ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), y25);
    }

    /* renamed from: r */
    public static String m125012r(C72963f4 f4Var, C92836k kVar, boolean z) {
        String r502;
        Class cls = C98201k.class;
        String str = null;
        if (f4Var.mo108769t2() == 1) {
            String r503 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(f4Var.mo108768t(), kVar);
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r503, "", "", true);
            Log.m105919d("MicroMsg.ImageGalleryHolderImage", "getImgPath() pre fileName:%s bigImgPath:%s", r503, TY);
            if (C86013q1.m106450k(TY)) {
                return TY;
            }
            String str2 = kVar.f267378e;
            String TY2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str2, "", "", true);
            Log.m105919d("MicroMsg.ImageGalleryHolderImage", "getImgPath() after fileName:%s bigImgPath:%s", str2, TY2);
            if (C86013q1.m106450k(TY2)) {
                return TY2;
            }
            return null;
        } else if (z || kVar.mo127146q()) {
            String str3 = kVar.f267378e;
            if (kVar.mo127145p() && (r502 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(f4Var.mo108768t(), kVar)) != null) {
                String TY3 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r502, "", "", true);
                if (C86013q1.m106450k(TY3)) {
                    Log.m105924i("MicroMsg.ImageGalleryHolderImage", "hasHdImg");
                    str = TY3;
                }
            }
            if (str == null) {
                str = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str3, "", "", true);
            }
            Log.m105925i("MicroMsg.ImageGalleryHolderImage", "the path : %s", str);
            return str;
        } else {
            Log.m105929w("MicroMsg.ImageGalleryHolderImage", "getImagePath is null because of isTryToGetProgress %s img.isGetCompleted() %s", Boolean.valueOf(z), Boolean.valueOf(kVar.mo127146q()));
            return null;
        }
    }

    /* renamed from: A */
    public final void mo135988A(C72963f4 f4Var, String str, boolean z) {
        Log.m105925i("MicroMsg.ImageGalleryHolderImage", "[oreh download_and_save] hdImg end, msgLocalId:%d, %s", Long.valueOf(f4Var.getMsgId()), str);
        C97056h.m124958l(MMApplicationContext.getContext(), f4Var, z);
    }

    /* renamed from: B */
    public final void mo135989B(C97087m1 m1Var, boolean z, boolean z2) {
        if (m1Var != null) {
            WxImageView wxImageView = m1Var.f284821D;
            int i = 0;
            if (wxImageView != null) {
                wxImageView.setVisibility(z ? 0 : 8);
                m1Var.f284821D.setDrawFullSampleSizeBitmap(z);
            }
            MultiTouchImageView multiTouchImageView = m1Var.f284820C;
            if (multiTouchImageView != null) {
                if (!z2) {
                    i = 8;
                }
                multiTouchImageView.setVisibility(i);
            }
        }
    }

    /* renamed from: C */
    public final boolean mo135990C(C97087m1 m1Var, String str, String str2, C72963f4 f4Var) {
        C97087m1 m1Var2 = m1Var;
        m1Var.mo135972h(m1Var2.f284820C, 0);
        m1Var.mo135972h(m1Var2.f284854u, 8);
        m1Var.mo135972h(m1Var2.f284858y, 8);
        m1Var.mo135972h(m1Var2.f284859z, 8);
        return mo135999u(true, m1Var2.f284820C, str, str2, false, m1Var2.f284836c, f4Var, m1Var, (C92836k) null, -1, false);
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        Integer num;
        long j3 = j2;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        C97056h hVar = this.f284638d;
        if (hVar != null && hVar.f284714g != null) {
            if (C97108o1.m125035a().f284914d.contains(Long.valueOf(j2))) {
                int o = mo135995o(j3, obj);
                if (o == -1) {
                    mo135988A(((C72972g4) C97625j3.m125812b().mo105911z()).b00(j3), "background", false);
                    return;
                }
                num = new Integer(o);
            } else {
                num = obj;
            }
            if (!(num instanceof Integer)) {
                Log.m105920e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
                return;
            }
            int intValue = ((Integer) num).intValue();
            Log.m105924i("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos = " + intValue);
            if (intValue == -1) {
                Log.m105920e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, pos is -1");
                C115669n.INSTANCE.idkeyStat(111, 3, 1, true);
                return;
            }
            C97087m1 m1Var = this.f284638d.mo139420e(intValue) != null ? (C97087m1) this.f284638d.mo139420e(intValue).getTag() : null;
            boolean contains = C97108o1.m125035a().f284914d.contains(Long.valueOf(j2));
            if (i6 == 0 && i7 == 0) {
                if (contains) {
                    C72963f4 y = this.f284638d.mo135937y(intValue);
                    mo135988A(y, "hd_suc:" + intValue, intValue == this.f284638d.f284714g.mo135768f8());
                }
                Log.m105925i("MicroMsg.ImageGalleryHolderImage", "pos = " + intValue + ", selectedPos = " + this.f284638d.f284714g.mo135768f8(), new Object[0]);
                this.f284887g.put(Long.valueOf(j2), 4);
                C72963f4 y2 = this.f284638d.mo135937y(intValue);
                C92836k q = mo135996q(y2, true);
                if (y2 != null && q != null) {
                    C97122r1 r1Var = this.f284886f;
                    if (r1Var != null) {
                        long msgId = y2.getMsgId();
                        ImageGalleryUI$$d0 imageGalleryUI$$d0 = (ImageGalleryUI$$d0) r1Var;
                        Log.m105925i("MicroMsg.ImageGalleryUI", "alvinluo onImageDownloaded msgId: %d, currentMsgId: %d, compressType: %d", Long.valueOf(msgId), Long.valueOf(imageGalleryUI$$d0.f284502a.f284341B), Integer.valueOf(i));
                        ImageGalleryUI imageGalleryUI = imageGalleryUI$$d0.f284502a;
                        if (msgId == imageGalleryUI.f284341B) {
                            if (!(i5 == 1)) {
                                ImageGalleryUI.m124727I7(imageGalleryUI, msgId);
                            }
                        }
                    }
                    if (m1Var != null) {
                        if (intValue == this.f284638d.f284714g.mo135768f8()) {
                            if (i5 == 1) {
                                ImageGalleryUI imageGalleryUI2 = this.f284638d.f284714g;
                                imageGalleryUI2.mo135753X8(false);
                                imageGalleryUI2.mo135753X8(false);
                                Animation a8 = imageGalleryUI2.mo135758a8(1000);
                                a8.setAnimationListener(new C97079k0(imageGalleryUI2));
                                imageGalleryUI2.mo135722E8();
                                imageGalleryUI2.mo135780n8();
                                View view = imageGalleryUI2.f284414Z;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "startHdDownloadDoneAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "startHdDownloadDoneAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                imageGalleryUI2.mo135780n8();
                                imageGalleryUI2.f284457p0.setVisibility(8);
                                imageGalleryUI2.mo135780n8();
                                imageGalleryUI2.f284482x0.setVisibility(8);
                                imageGalleryUI2.mo135780n8();
                                View view3 = imageGalleryUI2.f284486y0;
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(0);
                                View view4 = view3;
                                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "startHdDownloadDoneAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "startHdDownloadDoneAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                imageGalleryUI2.mo135780n8();
                                imageGalleryUI2.f284486y0.startAnimation(a8);
                            } else {
                                m1Var.f284820C.post(new C97102b(intValue));
                            }
                        }
                        C92836k kVar = q;
                        C72963f4 f4Var = y2;
                        C97087m1 m1Var2 = m1Var;
                        if (mo135999u(false, m1Var.f284820C, ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(y2.mo108765s2(), true), m125012r(y2, q, true), true, -1, y2, m1Var, kVar, i, false)) {
                            m1Var2.mo135972h(m1Var2.f284854u, 8);
                            m1Var2.mo135972h(m1Var2.f284858y, 8);
                            m1Var2.mo135972h(m1Var2.f284859z, 8);
                            C72963f4 f4Var2 = f4Var;
                            if (mo136004z(f4Var2) == 4) {
                                C97056h hVar2 = this.f284638d;
                                if (hVar2.f284718n) {
                                    hVar2.mo135927n(f4Var2);
                                    this.f284638d.f284718n = false;
                                }
                            }
                            C97056h hVar3 = this.f284638d;
                            if (hVar3 != null) {
                                hVar3.mo135920O(f4Var2, kVar, i5, C2CImgWaitingTimeStruct.C92612a.ok);
                                return;
                            }
                            return;
                        }
                        Log.m105920e("MicroMsg.ImageGalleryHolderImage", "failed to show downloaded image!");
                        C115669n.INSTANCE.idkeyStat(111, 2, 1, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (contains) {
                C72963f4 y3 = this.f284638d.mo135937y(intValue);
                mo135988A(y3, "hd_failed:" + intValue, intValue == this.f284638d.f284714g.mo135768f8());
            }
            if (i7 == -5103059) {
                this.f284887g.put(Long.valueOf(j2), 5);
                C115669n.INSTANCE.idkeyStat(111, 0, 1, true);
            } else {
                this.f284887g.put(Long.valueOf(j2), 6);
                C115669n.INSTANCE.idkeyStat(111, 1, 1, true);
            }
            Log.m105920e("MicroMsg.ImageGalleryHolderImage", "onSceneEnd, errType = " + i6 + ", errCode = " + i7);
            this.f284638d.f284719o.mo135878i(intValue);
            C97056h hVar4 = this.f284638d;
            if (hVar4 != null) {
                hVar4.mo135920O(hVar4.mo135937y(intValue), (C92836k) null, i5, C2CImgWaitingTimeStruct.C92612a.error);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029a A[ADDED_TO_REGION] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102582f0(long r26, long r28, int r30, int r31, java.lang.Object r32, int r33, int r34, ob0.C117747y r35) {
        /*
            r25 = this;
            r13 = r25
            r14 = r30
            r1 = r33
            r2 = r34
            com.tencent.mm.ui.chatting.gallery.h r0 = r13.f284638d
            if (r0 == 0) goto L_0x0343
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            if (r0 != 0) goto L_0x0012
            goto L_0x0343
        L_0x0012:
            int r0 = r13.f284893p
            if (r0 == 0) goto L_0x0017
            return
        L_0x0017:
            com.tencent.mm.ui.chatting.gallery.o1 r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97108o1.m125035a()
            java.util.HashSet<java.lang.Long> r0 = r0.f284914d
            java.lang.Long r3 = java.lang.Long.valueOf(r28)
            boolean r0 = r0.contains(r3)
            r3 = -1
            if (r0 == 0) goto L_0x003a
            r4 = r28
            r0 = r32
            int r0 = r13.mo135995o(r4, r0)
            if (r0 != r3) goto L_0x0033
            return
        L_0x0033:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r0)
            r0 = r4
            goto L_0x003c
        L_0x003a:
            r0 = r32
        L_0x003c:
            boolean r4 = r0 instanceof java.lang.Integer
            java.lang.String r5 = "MicroMsg.ImageGalleryHolderImage"
            if (r4 != 0) goto L_0x0049
            java.lang.String r0 = "param data not integer instance"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x0049:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r15 = r0.intValue()
            r4 = 6
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r12 = 0
            r0[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r33)
            r11 = 1
            r0[r11] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r34)
            r7 = 2
            r0[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)
            r8 = 3
            r0[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r30)
            r9 = 4
            r0[r9] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r26)
            r10 = 5
            r0[r10] = r6
            java.lang.String r6 = "onImgTaskProgress, pos[%d], offset[%d], totalLen[%d], resId[%d], compressType[%d], imgLocalId[%d],"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r0)
            if (r15 != r3) goto L_0x008b
            java.lang.String r0 = "onImgTaskProgress, pos is -1"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x008b:
            com.tencent.mm.ui.chatting.gallery.h r0 = r13.f284638d
            android.view.View r0 = r0.mo139420e(r15)
            if (r0 != 0) goto L_0x0094
            return
        L_0x0094:
            com.tencent.mm.ui.chatting.gallery.h r0 = r13.f284638d
            android.view.View r0 = r0.mo139420e(r15)
            java.lang.Object r0 = r0.getTag()
            r6 = r0
            com.tencent.mm.ui.chatting.gallery.m1 r6 = (com.tencent.p014mm.p136ui.chatting.gallery.C97087m1) r6
            if (r6 != 0) goto L_0x00a4
            return
        L_0x00a4:
            if (r1 != 0) goto L_0x00a8
            r0 = 0
            goto L_0x00b7
        L_0x00a8:
            if (r2 == 0) goto L_0x00b5
            float r0 = (float) r1
            float r3 = (float) r2
            float r0 = r0 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            int r0 = (int) r0
        L_0x00b7:
            int r3 = java.lang.Math.max(r11, r0)
            com.tencent.mm.ui.chatting.gallery.h r0 = r13.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            int r0 = r0.mo135768f8()
            if (r15 != r0) goto L_0x00eb
            if (r14 != r11) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00eb
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            r0[r12] = r16
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r0[r11] = r16
            java.lang.String r4 = "jacks loading hd from progress : %d, time: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r0)
            com.tencent.mm.ui.chatting.gallery.h r0 = r13.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
            r0.mo135794z8(r3)
        L_0x00eb:
            r4 = r35
            com.tencent.mm.modelimage.a0 r4 = (com.tencent.p014mm.modelimage.C92805a0) r4
            java.lang.String r0 = r4.f267227x
            boolean r16 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.isProgressive(r0)
            boolean r10 = r4.f267203A
            r17 = r10
            long r9 = r13.f284892o
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r9)
            java.lang.String r0 = r4.f267227x
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.o$c> r18 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c.f284901h
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0258 }
            if (r18 != 0) goto L_0x0252
            if (r2 != 0) goto L_0x010d
            goto L_0x0252
        L_0x010d:
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.o$c> r7 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c.f284901h     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0258 }
            com.tencent.mm.ui.chatting.gallery.o$c r0 = (com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c) r0     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0119
            r0.f284902a = r2     // Catch:{ all -> 0x0258 }
        L_0x0119:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0258 }
            r0.<init>()     // Catch:{ all -> 0x0258 }
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.o$c> r7 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c.f284901h     // Catch:{ all -> 0x0258 }
            java.util.Set r7 = r7.keySet()     // Catch:{ all -> 0x0258 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0258 }
        L_0x0128:
            boolean r18 = r7.hasNext()     // Catch:{ all -> 0x0258 }
            if (r18 == 0) goto L_0x023a
            java.lang.Object r18 = r7.next()     // Catch:{ all -> 0x0258 }
            r11 = r18
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0258 }
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.o$c> r12 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c.f284901h     // Catch:{ all -> 0x0258 }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x0258 }
            com.tencent.mm.ui.chatting.gallery.o$c r12 = (com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c) r12     // Catch:{ all -> 0x0258 }
            if (r12 != 0) goto L_0x0143
        L_0x0140:
            r11 = 1
            r12 = 0
            goto L_0x0128
        L_0x0143:
            r20 = r9
            long r8 = r12.f284905d     // Catch:{ all -> 0x0238 }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r8)     // Catch:{ all -> 0x0238 }
            java.lang.String r10 = "dkprog report: diff:%d [%d,%d,%d] succ:%d change:%d str:%s file:%s"
            r1 = 8
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0238 }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0238 }
            r18 = 0
            r2[r18] = r1     // Catch:{ all -> 0x0238 }
            int r1 = r12.f284902a     // Catch:{ all -> 0x0238 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0238 }
            r19 = 1
            r2[r19] = r1     // Catch:{ all -> 0x0238 }
            int r1 = r12.f284903b     // Catch:{ all -> 0x0238 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0238 }
            r22 = 2
            r2[r22] = r1     // Catch:{ all -> 0x0238 }
            int r1 = r12.f284904c     // Catch:{ all -> 0x0238 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0238 }
            r22 = 3
            r2[r22] = r1     // Catch:{ all -> 0x0238 }
            int r1 = r12.f284906e     // Catch:{ all -> 0x0238 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0238 }
            r22 = 4
            r2[r22] = r1     // Catch:{ all -> 0x0238 }
            int r1 = r12.f284908g     // Catch:{ all -> 0x0238 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0238 }
            r22 = 5
            r2[r22] = r1     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = r12.f284907f     // Catch:{ all -> 0x0238 }
            r22 = 6
            r2[r22] = r1     // Catch:{ all -> 0x0238 }
            r1 = 7
            r2[r1] = r11     // Catch:{ all -> 0x0238 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r2)     // Catch:{ all -> 0x0238 }
            r22 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r2 >= 0) goto L_0x01a0
            goto L_0x0230
        L_0x01a0:
            int r2 = r12.f284902a     // Catch:{ all -> 0x0238 }
            if (r2 <= 0) goto L_0x022d
            java.lang.String r2 = r12.f284907f     // Catch:{ all -> 0x0238 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x0238 }
            if (r2 != 0) goto L_0x022d
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0238 }
            r8 = 11713(0x2dc1, float:1.6413E-41)
            r9 = 14
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0238 }
            r10 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r9[r10] = r18     // Catch:{ all -> 0x0238 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r10 = 1
            r9[r10] = r22     // Catch:{ all -> 0x0238 }
            r19 = 41
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0238 }
            r22 = 2
            r9[r22] = r19     // Catch:{ all -> 0x0238 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r10 = 3
            r9[r10] = r22     // Catch:{ all -> 0x0238 }
            r10 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r22 = 4
            r9[r22] = r18     // Catch:{ all -> 0x0238 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r22 = 5
            r9[r22] = r18     // Catch:{ all -> 0x0238 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r22 = 6
            r9[r22] = r18     // Catch:{ all -> 0x0238 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r9[r1] = r22     // Catch:{ all -> 0x0238 }
            int r1 = r12.f284902a     // Catch:{ all -> 0x0238 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0238 }
            r10 = 8
            r9[r10] = r1     // Catch:{ all -> 0x0238 }
            r1 = 9
            int r10 = r12.f284903b     // Catch:{ all -> 0x0238 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r9[r1] = r10     // Catch:{ all -> 0x0238 }
            r1 = 10
            int r10 = r12.f284904c     // Catch:{ all -> 0x0238 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r9[r1] = r10     // Catch:{ all -> 0x0238 }
            r1 = 11
            int r10 = r12.f284906e     // Catch:{ all -> 0x0238 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r9[r1] = r10     // Catch:{ all -> 0x0238 }
            r1 = 12
            int r10 = r12.f284908g     // Catch:{ all -> 0x0238 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0238 }
            r9[r1] = r10     // Catch:{ all -> 0x0238 }
            r1 = 13
            java.lang.String r10 = r12.f284907f     // Catch:{ all -> 0x0238 }
            r9[r1] = r10     // Catch:{ all -> 0x0238 }
            r2.mo160131h(r8, r9)     // Catch:{ all -> 0x0238 }
        L_0x022d:
            r0.add(r11)     // Catch:{ all -> 0x0238 }
        L_0x0230:
            r1 = r33
            r2 = r34
            r9 = r20
            goto L_0x0140
        L_0x0238:
            r0 = move-exception
            goto L_0x025b
        L_0x023a:
            r20 = r9
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0238 }
        L_0x0240:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0238 }
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0238 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0238 }
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.o$c> r2 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.C97103c.f284901h     // Catch:{ all -> 0x0238 }
            r2.remove(r1)     // Catch:{ all -> 0x0238 }
            goto L_0x0240
        L_0x0252:
            r20 = r9
        L_0x0254:
            r1 = 1
            r2 = 6
            r7 = 0
            goto L_0x026b
        L_0x0258:
            r0 = move-exception
            r20 = r9
        L_0x025b:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r7 = 0
            r2[r7] = r0
            java.lang.String r0 = "get useopt  setTotalLen :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r2)
            r2 = 6
        L_0x026b:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            r0[r7] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r16)
            r0[r1] = r2
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r2 = 2
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r2 = 3
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r34)
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r4.f267227x
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = "dkprog onImgTaskProgress getCanShow:%b isProg:%b timeDiff:%d  [%d/%d] %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            if (r17 == 0) goto L_0x0343
            if (r16 == 0) goto L_0x0343
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0343
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r13.f284892o = r0
            com.tencent.mm.ui.chatting.gallery.h r0 = r13.f284638d
            com.tencent.mm.storage.f4 r0 = r0.mo135937y(r15)
            if (r0 != 0) goto L_0x02c1
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r12 = 0
            r0[r12] = r1
            java.lang.String r1 = "msg is null! pos:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r0)
            return
        L_0x02c1:
            r11 = 1
            r12 = 0
            com.tencent.mm.modelimage.k r10 = r13.mo135996q(r0, r11)
            r2 = 0
            com.tencent.mm.ui.base.MultiTouchImageView r4 = r6.f284820C
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.String r5 = r0.mo108765s2()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r5 = r1.v10(r5, r11)
            java.lang.String r7 = m125012r(r0, r10, r11)
            r8 = 1
            r9 = -1
            r16 = 1
            r1 = r25
            r24 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r7
            r7 = r9
            r26 = r8
            r9 = 8
            r8 = r0
            r9 = r26
            r27 = r10
            r11 = r30
            r12 = r16
            boolean r1 = r1.mo135999u(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 == 0) goto L_0x0343
            r1 = r26
            android.widget.ImageView r2 = r1.f284857x
            r3 = 8
            r1.mo135972h(r2, r3)
            android.widget.LinearLayout r2 = r1.f284859z
            r1.mo135972h(r2, r3)
            com.tencent.mm.ui.chatting.gallery.h r2 = r13.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
            int r2 = r2.mo135768f8()
            if (r15 != r2) goto L_0x0343
            r2 = 1
            if (r14 != r2) goto L_0x0323
            r12 = 1
            goto L_0x0324
        L_0x0323:
            r12 = 0
        L_0x0324:
            if (r12 != 0) goto L_0x0343
            r2 = 50
            r4 = r24
            if (r4 <= r2) goto L_0x033d
            android.widget.ProgressBar r2 = r1.f284858y
            r1.mo135972h(r2, r3)
            com.tencent.mm.ui.chatting.gallery.h r1 = r13.f284638d
            if (r1 == 0) goto L_0x0343
            com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct$a r2 = com.tencent.p014mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct.C92612a.ok
            r3 = r27
            r1.mo135920O(r0, r3, r14, r2)
            goto L_0x0343
        L_0x033d:
            android.widget.ProgressBar r0 = r1.f284858y
            r2 = 0
            r1.mo135972h(r0, r2)
        L_0x0343:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97100o.mo102582f0(long, long, int, int, java.lang.Object, int, int, ob0.y):void");
    }

    /* renamed from: g */
    public boolean mo135842g(C97087m1 m1Var, C72963f4 f4Var, int i) {
        boolean z = false;
        if (!(m1Var == null || f4Var == null || i < 0)) {
            int z2 = mo136004z(f4Var);
            Log.m105925i("MicroMsg.ImageGalleryHolderImage", "filling image : %s position : %s currentState : %s", Integer.valueOf(m1Var.f284820C.hashCode()), Integer.valueOf(i), Integer.valueOf(z2));
            m1Var.mo135972h(m1Var.f284854u, 8);
            try {
                z = mo136000v(m1Var, f4Var, i, z2);
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.ImageGalleryHolderImage", e, "", new Object[0]);
            }
            m1Var.f284820C.f348260C = !C75569c4.m90663I(f4Var) ? 1.0f : C75569c4.f222002e;
            if (m1Var.f284820C.f348260C != 0.0f) {
                SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
                spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
                spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
                spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
                spamMediaToEmojiOPStruct.f194462g = 2;
                spamMediaToEmojiOPStruct.mo86054n();
            }
        }
        return z;
    }

    /* renamed from: k */
    public final void mo135991k(C97087m1 m1Var, C72963f4 f4Var, C92836k kVar, boolean z, boolean z2, int i) {
        int i2;
        C97087m1 m1Var2 = m1Var;
        C72963f4 f4Var2 = f4Var;
        C92836k kVar2 = kVar;
        boolean z3 = z;
        Class cls = C98201k.class;
        Log.m105924i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloading, isHd = " + z3);
        m1Var2.mo135972h(m1Var2.f284859z, 8);
        if (!z3) {
            m1Var2.f284820C.setVisibility(0);
        }
        C92836k jD = ((C76053l) C86312j.m106911c(C76053l.class)).mo106261jD(kVar2);
        if (z3 && i == this.f284638d.f284714g.mo135768f8()) {
            ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
            imageGalleryUI.mo135722E8();
            imageGalleryUI.mo135780n8();
            View view = imageGalleryUI.f284414Z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdWatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = view;
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdWatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageGalleryUI.mo135780n8();
            imageGalleryUI.f284457p0.setVisibility(8);
            imageGalleryUI.mo135780n8();
            imageGalleryUI.f284482x0.setVisibility(0);
            imageGalleryUI.mo135780n8();
            View view3 = imageGalleryUI.f284486y0;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdWatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hdWatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageGalleryUI.mo135780n8();
            imageGalleryUI.f284482x0.setText("0%");
        }
        String r = z3 ? m125012r(f4Var2, kVar2, true) : null;
        if (Util.isNullOrNil(r)) {
            r = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(jD.f267380g, "", "", true);
        }
        String v102 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(f4Var.mo108765s2(), true);
        if (z2) {
            mo135990C(m1Var2, v102, r, f4Var2);
        }
        if (!z3) {
            int i3 = kVar2.f267377d;
            if (Math.max(1, (int) (i3 != 0 ? ((((long) kVar2.f267376c) * 100) / ((long) i3)) - 1 : 0)) > 50) {
                m1Var.mo135967c();
                i2 = 8;
                m1Var2.f284858y.setVisibility(8);
            } else {
                i2 = 8;
                m1Var.mo135967c();
                m1Var2.f284858y.setVisibility(0);
            }
        } else {
            i2 = 8;
        }
        m1Var.mo135967c();
        m1Var2.f284857x.setVisibility(i2);
        m1Var.mo135967c();
        m1Var2.f284856w.setVisibility(i2);
        m1Var.mo135967c();
        m1Var2.f284855v.setVisibility(i2);
    }

    /* renamed from: l */
    public final void mo135992l(C72963f4 f4Var, C97087m1 m1Var, int i, int i2) {
        Log.m105925i("MicroMsg.ImageGalleryHolderImage", "edw dealFail", new Object[0]);
        String v102 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true);
        m1Var.mo135972h(m1Var.f284858y, 8);
        m1Var.mo135972h(m1Var.f284854u, 8);
        m1Var.mo135972h(m1Var.f284820C, 8);
        m1Var.mo135972h(m1Var.f284821D, 8);
        m1Var.mo135968d();
        m1Var.f284859z.setVisibility(0);
        m1Var.mo135968d();
        m1Var.f284819B.setImageResource(C0966R.raw.image_download_fail_icon);
        if (v102 == null || !C86013q1.m106450k(v102)) {
            m1Var.mo135968d();
            m1Var.f284818A.setText(C0966R.string.fqs);
        } else if (i2 == 6) {
            m1Var.mo135968d();
            m1Var.f284818A.setText(C0966R.string.fqq);
        } else if (f4Var.mo100972K3()) {
            m1Var.mo135968d();
            m1Var.f284818A.setText(C0966R.string.fqo);
        } else {
            m1Var.mo135968d();
            m1Var.f284818A.setText(C0966R.string.fqp);
        }
    }

    /* renamed from: m */
    public final boolean mo135993m(C97087m1 m1Var, C72963f4 f4Var, C92836k kVar, int i) {
        Log.m105924i("MicroMsg.ImageGalleryHolderImage", "edw dealSucc");
        String s = mo135997s(f4Var, kVar, false);
        m1Var.mo135972h(m1Var.f284858y, 8);
        String str = this.f284891n.get(f4Var);
        if (str == null) {
            str = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true);
            this.f284891n.put(f4Var, str);
        }
        boolean C = mo135990C(m1Var, str, s, f4Var);
        if (i == this.f284638d.f284714g.mo135768f8()) {
            C97056h hVar = this.f284638d;
            if (hVar.f284718n) {
                hVar.mo135927n(f4Var);
                this.f284638d.f284718n = false;
            }
        }
        return C;
    }

    /* renamed from: n */
    public void mo135994n(long j, MultiTouchImageView multiTouchImageView, String str, Bitmap bitmap) {
        C97056h hVar = this.f284638d;
        if (hVar != null && hVar.f284714g != null) {
            Log.m105925i("MicroMsg.ImageGalleryHolderImage", "fillBitmap image : %s bmp %s", Integer.valueOf(multiTouchImageView.hashCode()), Integer.valueOf(bitmap.hashCode()));
            ForceGpuUtil.decideLayerType((View) multiTouchImageView.getParent(), bitmap.getWidth(), bitmap.getHeight());
            multiTouchImageView.setEnableHorLongBmpMode(false);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
            multiTouchImageView.setImageBitmap((Bitmap) null);
            multiTouchImageView.setImageBitmap(bitmap);
            multiTouchImageView.invalidate();
            C97122r1 r1Var = this.f284886f;
            if (r1Var != null) {
                ((ImageGalleryUI$$d0) r1Var).mo135801a(j, multiTouchImageView, str, bitmap);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r7 = ((java.lang.Integer) r7).intValue();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo135995o(long r5, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.tencent.mm.ui.chatting.gallery.h r0 = r4.f284638d
            com.tencent.mm.storage.f4 r0 = r0.mo135937y(r7)
            if (r0 == 0) goto L_0x001b
            long r0 = r0.getMsgId()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x001b
            return r7
        L_0x001b:
            com.tencent.mm.ui.chatting.gallery.h r7 = r4.f284638d
            java.util.HashMap<java.lang.Object, java.lang.Integer> r7 = r7.f293275e
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x0027:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r7.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.tencent.mm.ui.chatting.gallery.h r1 = r4.f284638d
            com.tencent.mm.storage.f4 r1 = r1.mo135937y(r0)
            if (r1 == 0) goto L_0x0027
            long r1 = r1.getMsgId()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
            return r0
        L_0x0048:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97100o.mo135995o(long, java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00be  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.modelimage.C92836k mo135996q(com.tencent.p014mm.storage.C72963f4 r11, boolean r12) {
        /*
            r10 = this;
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            boolean r1 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124953H(r11)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.tencent.mm.ui.chatting.gallery.h r1 = r10.f284638d
            if (r1 == 0) goto L_0x00c8
            com.tencent.mm.ui.chatting.gallery.h$f r1 = r1.f284715h
            if (r1 != 0) goto L_0x0014
            goto L_0x00c8
        L_0x0014:
            r3 = 0
            r1 = 1
            if (r12 != 0) goto L_0x0053
            int r12 = r11.mo108769t2()
            if (r12 != r1) goto L_0x0034
            com.tencent.mm.ui.chatting.gallery.h r12 = r10.f284638d
            com.tencent.mm.ui.chatting.gallery.h$f r12 = r12.f284715h
            java.util.HashMap<java.lang.Long, com.tencent.mm.modelimage.k> r12 = r12.f284755n
            long r5 = r11.getMsgId()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r12 = r12.get(r2)
            r2 = r12
            com.tencent.mm.modelimage.k r2 = (com.tencent.p014mm.modelimage.C92836k) r2
        L_0x0034:
            if (r2 != 0) goto L_0x0053
            long r5 = r11.mo108774y2()
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x0053
            com.tencent.mm.ui.chatting.gallery.h r12 = r10.f284638d
            com.tencent.mm.ui.chatting.gallery.h$f r12 = r12.f284715h
            java.util.HashMap<java.lang.Long, com.tencent.mm.modelimage.k> r12 = r12.f284754m
            long r5 = r11.mo108774y2()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r12 = r12.get(r2)
            r2 = r12
            com.tencent.mm.modelimage.k r2 = (com.tencent.p014mm.modelimage.C92836k) r2
        L_0x0053:
            if (r2 != 0) goto L_0x00c7
            r12 = 0
            int r2 = r11.mo108769t2()
            if (r2 != r1) goto L_0x0095
            long r5 = r11.getMsgId()
            di3.d r2 = di3.C86312j.m106911c(r0)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r7 = r11.mo108768t()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127200vP(r7, r5)
            long r7 = r2.f267374a
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0093
            long r5 = r11.mo108774y2()
            di3.d r12 = di3.C86312j.m106911c(r0)
            gt.k r12 = (p158gt.C98201k) r12
            gt.m r12 = r12.mo137277xi()
            java.lang.String r11 = r11.mo108768t()
            com.tencent.mm.modelimage.m r12 = (com.tencent.p014mm.modelimage.C92839m) r12
            com.tencent.mm.modelimage.k r11 = r12.mo127168NQ(r11, r5)
            goto L_0x00ad
        L_0x0093:
            r1 = 0
            goto L_0x00ae
        L_0x0095:
            long r5 = r11.mo108774y2()
            di3.d r12 = di3.C86312j.m106911c(r0)
            gt.k r12 = (p158gt.C98201k) r12
            gt.m r12 = r12.mo137277xi()
            java.lang.String r11 = r11.mo108768t()
            com.tencent.mm.modelimage.m r12 = (com.tencent.p014mm.modelimage.C92839m) r12
            com.tencent.mm.modelimage.k r11 = r12.mo127168NQ(r11, r5)
        L_0x00ad:
            r2 = r11
        L_0x00ae:
            com.tencent.mm.ui.chatting.gallery.h r11 = r10.f284638d
            com.tencent.mm.ui.chatting.gallery.h$f r11 = r11.f284715h
            if (r1 == 0) goto L_0x00be
            java.util.HashMap<java.lang.Long, com.tencent.mm.modelimage.k> r11 = r11.f284754m
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r11.put(r12, r2)
            goto L_0x00c7
        L_0x00be:
            java.util.HashMap<java.lang.Long, com.tencent.mm.modelimage.k> r11 = r11.f284755n
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r11.put(r12, r2)
        L_0x00c7:
            return r2
        L_0x00c8:
            java.lang.String r11 = "MicroMsg.ImageGalleryHolderImage"
            java.lang.String r12 = "adapter is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97100o.mo135996q(com.tencent.mm.storage.f4, boolean):com.tencent.mm.modelimage.k");
    }

    /* renamed from: s */
    public String mo135997s(C72963f4 f4Var, C92836k kVar, boolean z) {
        String str = this.f284890j.get(f4Var);
        if (str == null) {
            str = m125012r(f4Var, kVar, z);
            if (str == null || str.length() == 0) {
                return null;
            }
            this.f284890j.put(f4Var, str);
        }
        return str;
    }

    /* renamed from: t */
    public String mo135998t(C72963f4 f4Var, C92836k kVar) {
        Class cls = C98201k.class;
        if (!(f4Var == null || kVar == null)) {
            if (f4Var.mo108769t2() == 1) {
                String str = kVar.f267380g;
                String str2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, "", "", true) + "hd";
                Log.m105919d("MicroMsg.ImageGalleryHolderImage", "alvinluo preview fileName: %s, fullPath: %s", str, str2);
                if (Util.isNullOrNil(str2) || !C86013q1.m106450k(str2)) {
                    String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, "", "", true);
                    Log.m105919d("MicroMsg.ImageGalleryHolderImage", "preview fileName: %s, fullPath:%s", str, TY);
                    if (Util.isNullOrNil(TY) || !C86013q1.m106450k(TY)) {
                        return null;
                    }
                    Log.m105918d("MicroMsg.ImageGalleryHolderImage", "preview image exist");
                    return TY;
                }
                Log.m105918d("MicroMsg.ImageGalleryHolderImage", "alvinluo preview image exist");
                return str2;
            } else if (!kVar.mo127146q()) {
                Log.m105924i("MicroMsg.ImageGalleryHolderImage", "alvinluo get previewPath img not completed");
                return null;
            } else {
                String str3 = kVar.f267380g;
                String str4 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str3, "", "", true) + "hd";
                Log.m105925i("MicroMsg.ImageGalleryHolderImage", "alvinluo preview fileName: %s, fullPath: %s", str3, str4);
                if (!Util.isNullOrNil(str4) && C86013q1.m106450k(str4)) {
                    Log.m105918d("MicroMsg.ImageGalleryHolderImage", "alvinluo preview image exist");
                    return str4;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bc  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135999u(boolean r23, com.tencent.p014mm.p136ui.base.MultiTouchImageView r24, java.lang.String r25, java.lang.String r26, boolean r27, int r28, com.tencent.p014mm.storage.C72963f4 r29, com.tencent.p014mm.p136ui.chatting.gallery.C97087m1 r30, com.tencent.p014mm.modelimage.C92836k r31, int r32, boolean r33) {
        /*
            r22 = this;
            r6 = r22
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            r11 = r29
            r12 = r30
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r24.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 0
            r0[r13] = r1
            r14 = 1
            r0[r14] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r2 = 2
            r0[r2] = r1
            java.lang.String r15 = "MicroMsg.ImageGalleryHolderImage"
            java.lang.String r1 = "initImageView image : %s bigImgPath %s position : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r0)
            r5 = 0
            if (r9 == 0) goto L_0x003d
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r26)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r9, r13)
            r16 = 1
            goto L_0x0040
        L_0x003d:
            r0 = r5
            r16 = 0
        L_0x0040:
            if (r0 != 0) goto L_0x0078
            if (r8 == 0) goto L_0x0078
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r25)
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r8, r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r3 = "hd"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x0078
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r13)
        L_0x0078:
            r4 = r0
            if (r4 != 0) goto L_0x0085
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r9
            java.lang.String r1 = "getSuitableBmp fail, file does not exist, filePath %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r1, r0)
            return r13
        L_0x0085:
            if (r12 != 0) goto L_0x008d
            java.lang.String r0 = "alvinluo initImageView holder is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            return r13
        L_0x008d:
            boolean r0 = r4.equals(r8)
            if (r0 != 0) goto L_0x00b6
            if (r33 != 0) goto L_0x00b6
            boolean r0 = f284883q
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "alvinluo checkUseBigImageOpt not enable BigImageOpt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x00ab
        L_0x009f:
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284638d
            com.tencent.mm.storage.f4 r0 = r0.mo135935w()
            boolean r0 = eb0.C75569c4.m90663I(r0)
            if (r0 == 0) goto L_0x00ad
        L_0x00ab:
            r0 = 0
            goto L_0x00b1
        L_0x00ad:
            boolean r0 = pr3.C89436a.m111810b(r4)
        L_0x00b1:
            if (r0 == 0) goto L_0x00b6
            r17 = 1
            goto L_0x00b8
        L_0x00b6:
            r17 = 0
        L_0x00b8:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            r0[r13] = r1
            r0[r14] = r4
            java.lang.String r1 = "alvinluo checkUseBigImageOpt result: %b, path: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r0)
            com.tencent.mm.ui.base.WxImageView r0 = r12.f284821D
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00d3
            r0 = 1
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            if (r17 == 0) goto L_0x00da
            if (r0 != 0) goto L_0x00da
            r3 = 1
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            r18 = 0
            if (r17 != 0) goto L_0x0120
            if (r27 != 0) goto L_0x0120
            com.tencent.mm.ui.chatting.gallery.p r0 = r6.f284888h
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r0.f284929q
            q90.d r0 = (q90.C101062d) r0
            boolean r0 = r0.check(r4)
            if (r0 == 0) goto L_0x0120
            com.tencent.mm.ui.chatting.gallery.p r0 = r6.f284888h
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r0.f284929q
            o90.b r0 = (o90.C100301b) r0
            java.lang.Object r0 = r0.mo139556b(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L_0x0120
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r13] = r4
            java.lang.String r2 = "use cache, fillBitmap path : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r1)
            if (r11 == 0) goto L_0x0110
            long r1 = r29.getMsgId()
            goto L_0x0112
        L_0x0110:
            r1 = r18
        L_0x0112:
            r25 = r22
            r26 = r1
            r28 = r24
            r29 = r4
            r30 = r0
            r25.mo135994n(r26, r28, r29, r30)
            return r14
        L_0x0120:
            if (r23 == 0) goto L_0x0125
            r7.setImageBitmap(r5)
        L_0x0125:
            if (r17 == 0) goto L_0x0154
            com.tencent.mm.ui.base.WxImageView r0 = r12.f284821D
            if (r0 != 0) goto L_0x012c
            return r13
        L_0x012c:
            if (r31 != 0) goto L_0x0135
            com.tencent.mm.modelimage.k r0 = r6.mo135996q(r11, r14)
            r20 = r0
            goto L_0x0137
        L_0x0135:
            r20 = r31
        L_0x0137:
            com.tencent.mm.ui.base.WxImageView r2 = r12.f284821D
            com.tencent.mm.ui.chatting.gallery.o$a r1 = new com.tencent.mm.ui.chatting.gallery.o$a
            r0 = r1
            r13 = r1
            r1 = r22
            r14 = r2
            r2 = r4
            r7 = r3
            r3 = r28
            r9 = r4
            r4 = r30
            r21 = r5
            r5 = r29
            r0.<init>(r2, r3, r4, r5)
            r14.setOnImageLoadEventListener(r13)
            r13 = r20
            goto L_0x015a
        L_0x0154:
            r7 = r3
            r9 = r4
            r21 = r5
            r13 = r31
        L_0x015a:
            com.tencent.mm.ui.chatting.gallery.h r0 = r6.f284638d
            boolean r0 = r0.f284726v
            if (r0 != 0) goto L_0x01bc
            if (r10 < 0) goto L_0x01b9
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "alvinluo loadThumb postion: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r2, r1)
            r6.mo135989B(r12, r3, r0)
            com.tencent.mm.ui.chatting.gallery.p r1 = r6.f284888h
            r1.getClass()
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            r2[r3] = r0
            java.lang.String r0 = "MicroMsg.ImageGalleryLazyLoader"
            java.lang.String r3 = "loadThumb position %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            sg.g<java.lang.String, android.graphics.Bitmap> r0 = r1.f284928p
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            o90.b r0 = (o90.C100301b) r0
            java.lang.Object r0 = r0.mo139556b(r2)
            r5 = r0
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L_0x01b9
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x01b9
            com.tencent.mm.ui.chatting.gallery.f r0 = r1.f284925j
            r1 = 0
            r4 = 0
            com.tencent.mm.ui.chatting.gallery.o r0 = (com.tencent.p014mm.p136ui.chatting.gallery.C97100o) r0
            r3 = r24
            r0.mo136002x(r1, r3, r4, r5)
        L_0x01b9:
            r1 = r9
            goto L_0x0230
        L_0x01bc:
            if (r17 == 0) goto L_0x01f7
            java.lang.String r0 = r6.mo135998t(r11, r13)
            r1 = 1
            r6.mo135989B(r12, r1, r7)
            com.tencent.mm.ui.base.WxImageView r2 = r12.f284821D
            if (r0 == 0) goto L_0x01cf
            com.davemorrissey.labs.subscaleview.view.ImageSource r5 = com.davemorrissey.labs.subscaleview.view.ImageSource.uri((java.lang.String) r0)
            goto L_0x01d1
        L_0x01cf:
            r5 = r21
        L_0x01d1:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inJustDecodeBounds = r1
            android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r9, r0)
            if (r1 == 0) goto L_0x01e1
            r1.recycle()
        L_0x01e1:
            int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r9)
            r2.setOrientation(r1)
            int r1 = r0.outWidth
            int r0 = r0.outHeight
            r2.f48889h = r1
            r2.f48890i = r0
            r2.mo26059d()
            r2.mo21400p(r9, r5)
            return r16
        L_0x01f7:
            android.graphics.Bitmap r0 = r6.mo136001w(r9)
            if (r0 != 0) goto L_0x0201
            android.graphics.Bitmap r0 = r6.mo136001w(r8)
        L_0x0201:
            r8 = r0
            if (r8 == 0) goto L_0x01b9
            r0 = 0
            r1 = 1
            r6.mo135989B(r12, r0, r1)
            if (r11 == 0) goto L_0x0211
            long r0 = r29.getMsgId()
            r1 = r0
            goto L_0x0213
        L_0x0211:
            r1 = r18
        L_0x0213:
            r0 = r22
            r3 = r24
            r4 = r9
            r5 = r8
            r0.mo136002x(r1, r3, r4, r5)
            r0 = r26
            r1 = r9
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x022f
            com.tencent.mm.ui.chatting.gallery.p r0 = r6.f284888h
            r0.mo136016g(r1, r8)
            com.tencent.mm.ui.chatting.gallery.p r0 = r6.f284888h
            r0.mo136012c(r10, r8)
        L_0x022f:
            return r16
        L_0x0230:
            if (r17 == 0) goto L_0x0288
            r0 = 1
            r6.mo135989B(r12, r0, r7)
            java.lang.String r0 = r6.mo135998t(r11, r13)
            com.tencent.mm.ui.chatting.gallery.p r2 = r6.f284888h
            com.tencent.mm.ui.base.WxImageView r3 = r12.f284821D
            if (r10 >= 0) goto L_0x0243
            int r4 = r12.f284836c
            goto L_0x0244
        L_0x0243:
            r4 = r10
        L_0x0244:
            java.util.LinkedList<java.lang.String> r5 = r2.f284932t
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L_0x024d
            goto L_0x0299
        L_0x024d:
            int r5 = r3.hashCode()
            r2.mo136014e(r5)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r2.f284921f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r7.put(r1, r8)
            android.util.SparseArray<java.lang.String> r7 = r2.f284922g
            r7.put(r5, r1)
            android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r7 = r2.f284920e
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r3)
            r7.put(r5, r8)
            android.util.SparseArray<java.lang.String> r3 = r2.f284924i
            r3.remove(r5)
            android.util.SparseArray<java.lang.String> r3 = r2.f284924i
            r3.put(r5, r0)
            java.util.LinkedList<java.lang.String> r0 = r2.f284932t
            r0.add(r1)
            java.util.LinkedList<java.lang.Integer> r0 = r2.f284933u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.add(r1)
            r2.mo136015f()
            goto L_0x0299
        L_0x0288:
            r0 = 0
            r2 = 1
            r6.mo135989B(r12, r0, r2)
            com.tencent.mm.ui.chatting.gallery.p r0 = r6.f284888h
            if (r10 >= 0) goto L_0x0294
            int r2 = r12.f284836c
            r10 = r2
        L_0x0294:
            r2 = r24
            r0.mo136011b(r2, r1, r10)
        L_0x0299:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97100o.mo135999u(boolean, com.tencent.mm.ui.base.MultiTouchImageView, java.lang.String, java.lang.String, boolean, int, com.tencent.mm.storage.f4, com.tencent.mm.ui.chatting.gallery.m1, com.tencent.mm.modelimage.k, int, boolean):boolean");
    }

    /* renamed from: v */
    public final boolean mo136000v(C97087m1 m1Var, C72963f4 f4Var, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        C97087m1 m1Var2 = m1Var;
        C72963f4 f4Var2 = f4Var;
        int i5 = i;
        int i6 = i2;
        C92836k q = mo135996q(f4Var2, false);
        if (q == null) {
            return false;
        }
        switch (i6) {
            case 0:
                Class cls = C98201k.class;
                Log.m105924i("MicroMsg.ImageGalleryHolderImage", "edw dealDownloadOrSucc");
                if (f4Var.getType() == 1124073521) {
                    mo136003y(f4Var2, 4);
                    break;
                } else {
                    Log.m105924i("MicroMsg.ImageGalleryHolderImage", "deal LoadFail");
                    if (f4Var.mo108769t2() == 1) {
                        z = f4Var.mo100972K3();
                    } else {
                        if (!f4Var.mo100972K3()) {
                            String s = mo135997s(f4Var2, q, false);
                            if ((!q.mo127146q() || (s != null && C86013q1.m106450k(s))) && !C73521l0.m86925b(f4Var2, s)) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        mo136003y(f4Var2, 5);
                        mo135992l(f4Var2, m1Var2, i5, 5);
                        break;
                    } else {
                        if (mo135993m(m1Var2, f4Var2, q, i5)) {
                            C92836k uP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127198uP(f4Var2);
                            Log.m105919d("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc temp, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d, totalLen:%s", Long.valueOf(uP.f267374a), Long.valueOf(uP.f267387n), Long.valueOf(uP.f267375b), Integer.valueOf(uP.f267390q), Integer.valueOf(uP.f267377d));
                            if (!Util.isEqual(uP.f267390q, 0)) {
                                C92836k TO = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127173TO(uP.f267390q);
                                Log.m105919d("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc hdTemp, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d, totalLen:%s", Long.valueOf(TO.f267374a), Long.valueOf(TO.f267387n), Long.valueOf(TO.f267375b), Integer.valueOf(TO.f267390q), Integer.valueOf(TO.f267377d));
                                i4 = TO.f267377d;
                            } else {
                                i4 = uP.f267377d;
                            }
                            int l = (int) C86013q1.m106451l(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(q.f267378e, "", "", true));
                            boolean z2 = f4Var.mo108769t2() == 1 && Util.isEqual(i4, l);
                            Log.m105925i("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc() sizeInDb:%s oriSize:%s noNeedDownLoad:%s", Integer.valueOf(i4), Integer.valueOf(l), Boolean.valueOf(z2));
                            if (z2 || q.mo127146q()) {
                                mo136003y(f4Var2, 4);
                                break;
                            } else {
                                mo136003y(f4Var2, 1);
                            }
                        } else {
                            Log.m105924i("MicroMsg.ImageGalleryHolderImage", "dealDownloadOrSucc dealSucc() == false");
                            mo136003y(f4Var2, 2);
                        }
                        ((C76247e) C86312j.m106911c(C76247e.class)).mo106501sh(f4Var.getMsgId());
                        ((C87121j) C86312j.m106911c(C87121j.class)).j90(f4Var2);
                        String str = "MicroMsg.ImageGalleryHolderImage";
                        C92836k kVar = q;
                        int b = ((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127100b(q.f267374a, f4Var.getMsgId(), 0, Integer.valueOf(i), C0966R.C0969drawable.by8, this, 0, true);
                        C97056h hVar = this.f284638d;
                        if (hVar != null) {
                            hVar.mo135919N(f4Var2, false);
                        }
                        String str2 = str;
                        Log.m105925i(str2, "put image download task downloadCode [%d].", Integer.valueOf(b));
                        if (b == -2) {
                            Log.m105928w(str2, "it is already download image finish, but imgInfo is old, search db and repair.");
                            C92836k q2 = mo135996q(f4Var2, true);
                            if (q2 == null) {
                                Log.m105928w(str2, "get imgInfo by db but it is null.");
                                return true;
                            }
                            if (!mo135993m(m1Var2, f4Var2, q2, i5)) {
                                i3 = 2;
                                mo136003y(f4Var2, 2);
                            } else if (f4Var.mo108769t2() == 1 || q2.mo127146q()) {
                                mo136003y(f4Var2, 4);
                                return true;
                            } else {
                                mo136003y(f4Var2, 1);
                                i3 = 2;
                            }
                            Object[] objArr = new Object[i3];
                            objArr[0] = Long.valueOf(q2.f267374a);
                            objArr[1] = Boolean.valueOf(q2.mo127146q());
                            Log.m105929w(str2, "it repair fail show thumb image.ImgInfo[%d, %b]", objArr);
                            mo135991k(m1Var, f4Var, q2, false, true, i);
                            return true;
                        }
                        mo135991k(m1Var, f4Var, kVar, false, true, i);
                        return true;
                    }
                }
                break;
            case 1:
            case 4:
                mo135993m(m1Var2, f4Var2, q, i5);
                break;
            case 2:
                mo135991k(m1Var, f4Var, q, false, true, i);
                break;
            case 3:
                mo135991k(m1Var, f4Var, q, true, true, i);
                break;
            case 5:
            case 6:
                mo135992l(f4Var2, m1Var2, i5, i6);
                m1Var2.f284834a.invalidate();
                break;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d A[Catch:{ OutOfMemoryError -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0154  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo136001w(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r20
            if (r1 != 0) goto L_0x0007
        L_0x0004:
            r2 = 0
            goto L_0x01cf
        L_0x0007:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r3 = 1
            r0.inJustDecodeBounds = r3
            android.graphics.Bitmap r4 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r1, r0)
            java.lang.String r5 = "MicroMsg.ImageGalleryHolderImage"
            r6 = 0
            if (r4 == 0) goto L_0x0029
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = r4.toString()
            r7[r6] = r8
            java.lang.String r8 = "recycle bitmap:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
            r4.recycle()
        L_0x0029:
            int r4 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r20)
            int r7 = r0.outWidth
            int r8 = r0.outHeight
            r9 = 3
            r10 = 4
            r14 = 2
            java.lang.Runtime r15 = java.lang.Runtime.getRuntime()     // Catch:{ OutOfMemoryError -> 0x00d9 }
            long r15 = r15.maxMemory()     // Catch:{ OutOfMemoryError -> 0x00d9 }
            java.lang.Runtime r17 = java.lang.Runtime.getRuntime()     // Catch:{ OutOfMemoryError -> 0x00d9 }
            long r17 = r17.totalMemory()     // Catch:{ OutOfMemoryError -> 0x00d9 }
            long r15 = r15 - r17
            long r17 = f284884r     // Catch:{ OutOfMemoryError -> 0x00d9 }
            long r12 = r15 - r17
            r2 = 0
            long r2 = java.lang.Math.max(r12, r2)     // Catch:{ OutOfMemoryError -> 0x00d9 }
            r12 = 99614720(0x5f00000, double:4.9216211E-316)
            long r2 = java.lang.Math.min(r2, r12)     // Catch:{ OutOfMemoryError -> 0x00d9 }
            int r12 = r0.outHeight     // Catch:{ OutOfMemoryError -> 0x00d9 }
            int r0 = r0.outWidth     // Catch:{ OutOfMemoryError -> 0x00d9 }
            int r12 = r12 * r0
            int r12 = r12 * 4
            long r12 = (long) r12     // Catch:{ OutOfMemoryError -> 0x00d9 }
            java.lang.String r0 = "hy: current free memory: %d, previewDecodedBmLength: %d"
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ OutOfMemoryError -> 0x00d9 }
            java.lang.Long r18 = java.lang.Long.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x00d9 }
            r15[r6] = r18     // Catch:{ OutOfMemoryError -> 0x00d9 }
            java.lang.Long r18 = java.lang.Long.valueOf(r12)     // Catch:{ OutOfMemoryError -> 0x00d9 }
            r16 = 1
            r15[r16] = r18     // Catch:{ OutOfMemoryError -> 0x00d9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r15)     // Catch:{ OutOfMemoryError -> 0x00d9 }
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a4
            double r10 = (double) r2     // Catch:{ OutOfMemoryError -> 0x00d9 }
            double r14 = (double) r12     // Catch:{ OutOfMemoryError -> 0x00d9 }
            double r10 = r10 / r14
            double r10 = java.lang.Math.sqrt(r10)     // Catch:{ OutOfMemoryError -> 0x00d9 }
            java.lang.String r0 = "hy: scale is %f, currentFreeMem is %d, previewDecodedBmLength is %d."
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ OutOfMemoryError -> 0x00d7 }
            java.lang.Double r15 = java.lang.Double.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            r14[r6] = r15     // Catch:{ OutOfMemoryError -> 0x00d7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            r3 = 1
            r14[r3] = r2     // Catch:{ OutOfMemoryError -> 0x00d7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            r3 = 2
            r14[r3] = r2     // Catch:{ OutOfMemoryError -> 0x00d7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r5, r0, r14)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            double r2 = (double) r7     // Catch:{ OutOfMemoryError -> 0x00d7 }
            double r2 = r2 * r10
            int r7 = (int) r2     // Catch:{ OutOfMemoryError -> 0x00d7 }
            double r2 = (double) r8     // Catch:{ OutOfMemoryError -> 0x00d7 }
            double r2 = r2 * r10
            int r8 = (int) r2     // Catch:{ OutOfMemoryError -> 0x00d7 }
            goto L_0x00a6
        L_0x00a4:
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00a6:
            android.graphics.Bitmap r0 = m125010D(r1, r8, r7)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            if (r0 != 0) goto L_0x00b1
            r2 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r1, (int) r7, (int) r8, (float) r2)     // Catch:{ OutOfMemoryError -> 0x00d7 }
        L_0x00b1:
            if (r0 != 0) goto L_0x013c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(r20)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            if (r2 == 0) goto L_0x013c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.isProgressive(r20)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            if (r2 == 0) goto L_0x013c
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(r20)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            java.lang.String r2 = "Progressive jpeg, result isNull:%b"
            r3 = 1
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x00d7 }
            if (r0 != 0) goto L_0x00cc
            r3 = 1
            goto L_0x00cd
        L_0x00cc:
            r3 = 0
        L_0x00cd:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            r12[r6] = r3     // Catch:{ OutOfMemoryError -> 0x00d7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r12)     // Catch:{ OutOfMemoryError -> 0x00d7 }
            goto L_0x013c
        L_0x00d7:
            r0 = move-exception
            goto L_0x00dc
        L_0x00d9:
            r0 = move-exception
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00dc:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = "hy: out of memory! try use fallback bitmap"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r0 != 0) goto L_0x00eb
            r0 = 0
            goto L_0x00f5
        L_0x00eb:
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
        L_0x00f5:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r2 != 0) goto L_0x00fd
            r2 = 0
            goto L_0x0107
        L_0x00fd:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
        L_0x0107:
            java.lang.String r3 = "hy: enter fallback bitmap logic"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
            int r3 = r7 * r8
            int r12 = r0 * r2
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r14[r6] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r15 = 1
            r14[r15] = r13
            java.lang.String r13 = "hy: oriImgPixelRate %d, displayPixelRate %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r14)
            if (r3 <= r12) goto L_0x012d
            r3 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r1, (int) r0, (int) r2, (float) r3)     // Catch:{ OutOfMemoryError -> 0x0133 }
            goto L_0x013c
        L_0x012d:
            java.lang.String r0 = "hy: the picture is even smaller the screen! display nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ OutOfMemoryError -> 0x0133 }
            goto L_0x013b
        L_0x0133:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = "hy: oom in fallback bitmap!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
        L_0x013b:
            r0 = 0
        L_0x013c:
            if (r0 != 0) goto L_0x0154
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getSuitableBmp fail, temBmp is null, filePath = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0004
        L_0x0154:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r1 = r1 * r2
            int r2 = r7 * r8
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x016a
            if (r1 <= r2) goto L_0x016a
            r3 = 1
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            r12 = 6
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Double r13 = java.lang.Double.valueOf(r10)
            r12[r6] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 1
            r12[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r2 = 2
            r12[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r12[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 4
            r12[r2] = r1
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r12[r1] = r2
            java.lang.String r1 = "extractBitmap scale : %s, oriImgPixelRate: %s, targetImgPixelRate: %s, needScaleBitmap: %s, width: %s, height: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r12)
            if (r3 == 0) goto L_0x01b2
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Double r1 = java.lang.Double.valueOf(r10)
            r2[r6] = r1
            java.lang.String r1 = "extractBitmap, scale: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r2)
            float r1 = (float) r4
            float r2 = (float) r10
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r0, r1, r2, r2)
            goto L_0x01b7
        L_0x01b2:
            float r1 = (float) r4
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r0, r1)
        L_0x01b7:
            if (r1 != r0) goto L_0x01ce
            int r0 = r4 % 360
            if (r0 == 0) goto L_0x01ce
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r6] = r1
            java.lang.String r1 = "rotate failed degree:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r0)
            goto L_0x0004
        L_0x01ce:
            r2 = r1
        L_0x01cf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97100o.mo136001w(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: x */
    public void mo136002x(long j, View view, String str, Bitmap bitmap) {
        if (bitmap != null && view != null) {
            int hashCode = view.hashCode();
            int hashCode2 = bitmap.hashCode();
            int indexOfValue = this.f284888h.f284931s.indexOfValue(hashCode);
            if (indexOfValue >= 0) {
                this.f284888h.f284931s.removeAt(indexOfValue);
            }
            this.f284888h.f284931s.put(hashCode2, hashCode);
            if (view instanceof MultiTouchImageView) {
                mo135994n(j, (MultiTouchImageView) view, str, bitmap);
            } else if (view instanceof ImageView) {
                ((ImageView) view).setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        if (!(obj instanceof Integer)) {
            Log.m105920e("MicroMsg.ImageGalleryHolderImage", "param data not integer instance");
            return;
        }
        int intValue = ((Integer) obj).intValue();
        Log.m105925i("MicroMsg.ImageGalleryHolderImage", "image task canceled at pos " + intValue, new Object[0]);
    }

    /* renamed from: y */
    public void mo136003y(C72963f4 f4Var, int i) {
        this.f284887g.put(Long.valueOf(f4Var.getMsgId()), Integer.valueOf(i));
    }

    /* renamed from: z */
    public int mo136004z(C72963f4 f4Var) {
        if (f4Var == null || !this.f284887g.containsKey(Long.valueOf(f4Var.getMsgId()))) {
            return 0;
        }
        return this.f284887g.get(Long.valueOf(f4Var.getMsgId())).intValue();
    }
}

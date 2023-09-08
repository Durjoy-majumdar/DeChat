package w72;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.C74821t4;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.album.AlbumContainer;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import hc0.C20937c;
import hd0.C98410o0;
import java.util.Set;
import kb0.C76529i;
import kg3.C76577a;
import lb0.C88394b;
import p008bq.C67305d1;
import p008bq.C67309t0;
import p158gt.C76053l;
import p158gt.C98201k;
import p196ln.C76705f;
import p262wm.C22923f;
import p625nu.C100196e;
import p682rz.C101488s;
import p763ym.C79140q;
import uf0.C102016c;

/* renamed from: w72.a */
public class C78521a {

    /* renamed from: a */
    public static final /* synthetic */ int f230007a = 0;

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 20);
        int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 20);
        bVar.f59354j = b;
        bVar.f59355k = b2;
        bVar.f59364t = true;
        bVar.f59346b = true;
        bVar.f59345a = true;
        bVar.mo32666a();
    }

    /* renamed from: a */
    public static boolean m94849a(Context context, AlbumContainer albumContainer, C72963f4 f4Var) {
        albumContainer.mo94178d(f4Var.getMsgId(), f4Var.mo108768t(), f4Var.getContent(), f4Var.mo108769t2() == 0, true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 != 88) goto L_0x00df;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m94850b(android.content.Context r4, android.widget.ImageView r5, com.tencent.p014mm.storage.C72963f4 r6, com.tencent.p014mm.message.C68070l.C68072b r7) {
        /*
            pl1.e0$a r4 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            r0 = 0
            if (r7 == 0) goto L_0x00df
            int r1 = r7.f195582i
            r2 = 50
            r3 = 1
            if (r1 == r2) goto L_0x00c0
            r2 = 51
            if (r1 == r2) goto L_0x008b
            r2 = 63
            if (r1 == r2) goto L_0x0068
            r2 = 65
            if (r1 == r2) goto L_0x0045
            r2 = 82
            if (r1 == r2) goto L_0x0024
            r2 = 88
            if (r1 == r2) goto L_0x0068
            goto L_0x00df
        L_0x0024:
            java.lang.Class<ht1.i> r1 = ht1.C60175i.class
            com.tencent.mm.message.g r7 = r7.mo93555w(r1)
            ht1.i r7 = (ht1.C60175i) r7
            if (r7 == 0) goto L_0x00df
            te3.ci1 r7 = r7.f171712b
            java.lang.String r7 = r7.f182503o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 != 0) goto L_0x00df
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            r6.yj0(r7, r5, r4)
            m94861m(r5)
            return r3
        L_0x0045:
            java.lang.Class<ht1.a> r1 = ht1.C60150a.class
            com.tencent.mm.message.g r7 = r7.mo93555w(r1)
            ht1.a r7 = (ht1.C60150a) r7
            if (r7 == 0) goto L_0x00df
            te3.p81 r7 = r7.f171697b
            if (r7 == 0) goto L_0x00df
            java.lang.String r7 = r7.f184783i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 != 0) goto L_0x00df
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            r6.mo76741Cm(r7, r5, r4)
            m94861m(r5)
            return r3
        L_0x0068:
            java.lang.Class<ht1.b> r1 = ht1.C60151b.class
            com.tencent.mm.message.g r7 = r7.mo93555w(r1)
            ht1.b r7 = (ht1.C60151b) r7
            if (r7 == 0) goto L_0x00df
            te3.p81 r7 = r7.f171698b
            if (r7 == 0) goto L_0x00df
            java.lang.String r7 = r7.f184783i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 != 0) goto L_0x00df
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            r6.mo76741Cm(r7, r5, r4)
            m94861m(r5)
            return r3
        L_0x008b:
            java.lang.Class<ht1.f> r1 = ht1.C60166f.class
            com.tencent.mm.message.g r7 = r7.mo93555w(r1)
            ht1.f r7 = (ht1.C60166f) r7
            if (r7 == 0) goto L_0x00df
            te3.rk1 r7 = r7.f171710b
            if (r7 == 0) goto L_0x00df
            java.util.LinkedList<te3.pk1> r7 = r7.f185190n
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x00df
            java.lang.Object r7 = r7.get(r0)
            te3.pk1 r7 = (te3.C64628pk1) r7
            java.lang.String r0 = r7.f184832j
            java.lang.String r7 = r7.f184828f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r0 = r7
        L_0x00b3:
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            r6.mo76741Cm(r0, r5, r4)
            m94861m(r5)
            return r3
        L_0x00c0:
            java.lang.Class<ht1.e> r1 = ht1.C60161e.class
            com.tencent.mm.message.g r7 = r7.mo93555w(r1)
            ht1.e r7 = (ht1.C60161e) r7
            if (r7 == 0) goto L_0x00df
            java.lang.String r7 = r7.f171703d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r1 != 0) goto L_0x00df
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.t1 r6 = (ht1.C60200t1) r6
            r6.mo76741Cm(r7, r5, r4)
            m94861m(r5)
            return r3
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w72.C78521a.m94850b(android.content.Context, android.widget.ImageView, com.tencent.mm.storage.f4, com.tencent.mm.message.l$b):boolean");
    }

    /* renamed from: c */
    public static boolean m94851c(Context context, ImageView imageView, C72963f4 f4Var) {
        Class cls = C98201k.class;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteImg() msg is null");
            return false;
        } else if (f4Var.f212669H1 == 1) {
            Bitmap hp02 = ((C79140q) C86312j.m106911c(C79140q.class)).hp0(f4Var.mo108774y2());
            if (hp02 == null) {
                Log.m105924i("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteImg REFER_FROM_SCENE_BIZ_HALF_SCREEN  set thumb fail");
                return false;
            }
            imageView.setImageBitmap(C74821t4.m89550a(m94859k(context, hp02, imageView, hp02.getWidth(), hp02.getHeight()), true, (float) C74942w4.m89784a(context, 3), false));
            m94861m(imageView);
            Log.m105924i("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteImg REFER_FROM_SCENE_BIZ_HALF_SCREEN  set thumb success");
            return true;
        } else {
            C92836k kVar = null;
            if (f4Var.getMsgId() > 0) {
                kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
            }
            if ((kVar == null || kVar.f267374a <= 0) && f4Var.mo108774y2() > 0) {
                kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            }
            if (kVar == null) {
                Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteImg() imgInfo is null");
                return false;
            }
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8(kVar), "", "", true);
            if (Util.isNullOrNil(TY)) {
                TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127161CZ(kVar.f267380g);
            }
            String s2 = f4Var.mo108765s2();
            Bitmap xx02 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).xx0(s2);
            if (xx02 != null) {
                try {
                    int orientationInDegree = Exif.fromFile(s2).getOrientationInDegree();
                    if (orientationInDegree < 0) {
                        orientationInDegree = 0;
                    }
                    xx02 = BitmapUtil.rotate(xx02, (float) orientationInDegree);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.msgquote.MsgQuoteHelp", th, "unexpected exception.", new Object[0]);
                }
            }
            if (xx02 == null && TY != null) {
                Bitmap bitmapNative = BitmapUtil.getBitmapNative(TY, 120, 120, C76577a.m92156g(MMApplicationContext.getContext()));
                int orientationInDegree2 = Exif.fromFile(TY).getOrientationInDegree();
                if (orientationInDegree2 < 0) {
                    orientationInDegree2 = 0;
                }
                xx02 = BitmapUtil.rotate(bitmapNative, (float) orientationInDegree2);
            }
            if (xx02 == null) {
                Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteImg() imgThumb is null");
                return false;
            }
            imageView.setImageBitmap(C74821t4.m89550a(m94859k(context, xx02, imageView, xx02.getWidth(), xx02.getHeight()), true, (float) C74942w4.m89784a(context, 3), false));
            m94861m(imageView);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m94852d(Context context, ImageView imageView, ImageView imageView2, C72963f4 f4Var) {
        Bitmap bitmap;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteVideo() msg is null");
            return false;
        }
        String s2 = f4Var.mo108765s2();
        String r = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(f4Var.mo108765s2());
        if (r == null) {
            Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "getVideoThumb() imgPath is null");
            bitmap = null;
        } else if (!C102016c.m134339a(r)) {
            Bitmap rk = ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(r);
            bitmap = (rk == null || rk.isRecycled()) ? BitmapUtil.getBitmapNative(r) : rk;
        } else {
            bitmap = BitmapUtil.getBitmapNative(r);
        }
        if (bitmap == null && s2 != null) {
            Bitmap bitmapNative = BitmapUtil.getBitmapNative(s2, 120, 120, C76577a.m92156g(MMApplicationContext.getContext()));
            int orientationInDegree = Exif.fromFile(s2).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = BitmapUtil.rotate(bitmapNative, (float) orientationInDegree);
        }
        if (bitmap == null) {
            Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteVideo() imgThumb is null");
            return false;
        }
        imageView.setImageBitmap(C74821t4.m89550a(m94859k(context, bitmap, imageView, bitmap.getWidth(), bitmap.getHeight()), true, (float) C74942w4.m89784a(context, 3), false));
        imageView2.setImageDrawable(C76577a.m92158i(context, C0966R.raw.shortvideo_play_btn));
        m94861m(imageView);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r4) == false) goto L_0x0037;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m94853e(com.tencent.p014mm.storage.C72963f4 r4) {
        /*
            java.lang.String r0 = ""
            if (r4 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = bp3.C67301m.m79637b(r4)
            java.lang.String r2 = r4.mo108768t()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r2 == 0) goto L_0x0036
            java.lang.Class<a11.c> r2 = a11.C39479c.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            a11.c r2 = (a11.C39479c) r2
            eb0.m2 r2 = r2.mo62084mr()
            java.lang.String r4 = r4.mo108768t()
            com.tencent.mm.storage.n1 r2 = (com.tencent.p014mm.storage.C44662n1) r2
            com.tencent.mm.storage.m1 r4 = r2.mo69799Lo(r4)
            if (r4 == 0) goto L_0x0036
            java.lang.String r4 = r4.mo69789q2(r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r4 = r0
        L_0x0037:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 == 0) goto L_0x0063
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r1)
            if (r2 == 0) goto L_0x0063
            java.lang.String r4 = r2.getNickname()
            if (r4 == 0) goto L_0x005f
            java.lang.String r3 = r4.trim()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0063
        L_0x005f:
            java.lang.String r4 = r2.mo62913l2()
        L_0x0063:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r1 = r4
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w72.C78521a.m94853e(com.tencent.mm.storage.f4):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m94854f(com.tencent.p014mm.message.C68070l.C68072b r16) {
        /*
            com.tencent.mm.autogen.events.RecordOperationEvent r0 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r1 = r0.f265027d
            r2 = 0
            r1.f265029a = r2
            r3 = r16
            java.lang.String r3 = r3.f195571f0
            r1.f265030b = r3
            r0.publish()
            com.tencent.mm.autogen.events.RecordOperationEvent$b r0 = r0.f265028e
            te3.dp3 r0 = r0.f265048a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            r3 = 0
            java.util.LinkedList<te3.rc0> r4 = r0.f227155f
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 0
        L_0x0025:
            boolean r7 = r4.hasNext()
            java.lang.String r8 = ">"
            java.lang.String r9 = "&gt;"
            java.lang.String r10 = "<"
            java.lang.String r11 = "&lt;"
            java.lang.String r12 = "\n"
            r13 = 2
            r14 = 1
            if (r7 == 0) goto L_0x0086
            java.lang.Object r7 = r4.next()
            te3.rc0 r7 = (te3.C101834rc0) r7
            boolean r15 = com.tencent.p014mm.plugin.fav.p047ui.C93594f1.m118177e(r7)
            if (r15 == 0) goto L_0x0056
            java.lang.String r15 = r7.f299308i1
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x0056
            java.lang.String r15 = r7.f299308i1
            java.lang.String r2 = "WeNoteHtmlFile"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0056
            goto L_0x0084
        L_0x0056:
            int r2 = r7.f299258I
            if (r2 == r14) goto L_0x0060
            if (r2 == r13) goto L_0x005d
            goto L_0x0084
        L_0x005d:
            int r6 = r6 + 1
            goto L_0x0084
        L_0x0060:
            if (r5 != 0) goto L_0x0084
            java.lang.String r2 = r7.f299301f
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r13 == 0) goto L_0x006b
            goto L_0x0084
        L_0x006b:
            java.lang.String r2 = r2.replaceAll(r12, r1)
            java.lang.String r2 = r2.trim()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0083
            java.lang.String r2 = r7.f299301f
            java.lang.String r2 = r2.replaceAll(r11, r10)
            java.lang.String r3 = r2.replaceAll(r9, r8)
        L_0x0083:
            r5 = 1
        L_0x0084:
            r2 = 0
            goto L_0x0025
        L_0x0086:
            if (r3 == 0) goto L_0x00cc
            java.lang.String[] r2 = r3.split(r12, r13)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            if (r4 <= 0) goto L_0x00a6
            int r4 = r2.length
            r5 = 0
        L_0x0096:
            if (r5 >= r4) goto L_0x00a6
            r7 = r2[r5]
            int r12 = r7.length()
            if (r12 <= 0) goto L_0x00a3
            r3.add(r7)
        L_0x00a3:
            int r5 = r5 + 1
            goto L_0x0096
        L_0x00a6:
            int r2 = r3.size()
            if (r2 != r14) goto L_0x00b5
            java.util.LinkedList<te3.rc0> r0 = r0.f227155f
            int r0 = r0.size()
            if (r0 != r13) goto L_0x00b5
            goto L_0x00c8
        L_0x00b5:
            if (r6 <= 0) goto L_0x00c0
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00c8
        L_0x00c0:
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x00c8:
            java.lang.String r1 = r1.trim()
        L_0x00cc:
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = r1.replaceAll(r11, r10)
            java.lang.String r1 = r0.replaceAll(r9, r8)
        L_0x00d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w72.C78521a.m94854f(com.tencent.mm.message.l$b):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e0, code lost:
        if (r2 != null) goto L_0x05bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05af A[FALL_THROUGH] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Boolean, java.lang.CharSequence> m94855g(android.content.Context r22, float r23, com.tencent.p014mm.storage.C72963f4 r24, com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem r25) {
        /*
            r1 = r22
            r0 = r23
            r2 = r25
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x0014
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r4)
            return r0
        L_0x0014:
            java.lang.Class<u72.c> r5 = u72.C78135c.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            u72.c r5 = (u72.C78135c) r5
            x72.a r5 = r5.vs0()
            long r6 = r2.f201544e
            x72.b r5 = r5.mo61670Lo(r6)
            r6 = 1
            if (r5 == 0) goto L_0x003c
            int r7 = r5.field_status
            if (r7 != r6) goto L_0x003c
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 2131833108(0x7f113114, float:1.9299289E38)
            java.lang.String r1 = r1.getString(r3)
            r0.<init>(r2, r1)
            return r0
        L_0x003c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            di3.d r8 = di3.C86312j.m106911c(r3)
            ny.h r8 = (p629ny.C76979h) r8
            java.lang.String r9 = r2.f201547h
            java.lang.String r10 = "null"
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r10)
            android.text.SpannableString r8 = r8.yp0(r1, r9, r0)
            r7.append(r8)
            java.lang.String r8 = "："
            r7.append(r8)
            com.tencent.mm.storage.f4 r8 = new com.tencent.mm.storage.f4
            r8.<init>()
            int r9 = r2.f201543d
            r8.setType(r9)
            java.lang.String r9 = r2.f201549j
            r8.mo108732L2(r9)
            long r9 = r24.getMsgId()
            r8.setMsgId(r9)
            java.lang.String r9 = r2.f201545f
            r8.mo108749c3(r9)
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            if (r1 != 0) goto L_0x0080
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            goto L_0x0081
        L_0x0080:
            r10 = r1
        L_0x0081:
            int r11 = r8.getType()
            r12 = 2131833101(0x7f11310d, float:1.9299275E38)
            r13 = 0
            r14 = 0
            switch(r11) {
                case 1: goto L_0x05b1;
                case 3: goto L_0x05af;
                case 11: goto L_0x05b1;
                case 13: goto L_0x05af;
                case 21: goto L_0x05b1;
                case 23: goto L_0x05af;
                case 31: goto L_0x05b1;
                case 33: goto L_0x05af;
                case 34: goto L_0x050a;
                case 36: goto L_0x05b1;
                case 39: goto L_0x05af;
                case 42: goto L_0x04e9;
                case 43: goto L_0x05af;
                case 44: goto L_0x05af;
                case 47: goto L_0x05af;
                case 48: goto L_0x048f;
                case 49: goto L_0x00f2;
                case 62: goto L_0x05af;
                case 66: goto L_0x00c1;
                case 1048625: goto L_0x00f2;
                case 268435505: goto L_0x05af;
                case 301989937: goto L_0x05b1;
                case 419430449: goto L_0x00f2;
                case 436207665: goto L_0x00f2;
                case 754974769: goto L_0x00f2;
                case 771751985: goto L_0x00f2;
                case 805306417: goto L_0x00f2;
                case 822083633: goto L_0x00f2;
                case 855638065: goto L_0x00f2;
                case 939524145: goto L_0x00f2;
                case 973078577: goto L_0x00f2;
                case 974127153: goto L_0x00f2;
                case 975175729: goto L_0x00f2;
                case 976224305: goto L_0x00f2;
                case 1040187441: goto L_0x0097;
                case 1090519089: goto L_0x00f2;
                case 1107296305: goto L_0x05b1;
                case 1124073521: goto L_0x05af;
                case 1140850737: goto L_0x00f2;
                default: goto L_0x008e;
            }
        L_0x008e:
            r2 = 2131833087(0x7f1130ff, float:1.9299246E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x0097:
            java.lang.String r2 = r8.getContent()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r13)
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x00b6
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x00b6
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r2 = r2.f195570f
            r11 = 0
            r9[r11] = r2
            java.lang.String r2 = r10.getString(r12, r9)
            goto L_0x05bb
        L_0x00b6:
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r11] = r4
            java.lang.String r2 = r10.getString(r12, r2)
            goto L_0x05bb
        L_0x00c1:
            boolean r2 = r8.mo100975N3()
            if (r2 == 0) goto L_0x00e4
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r9)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.String r9 = r8.getContent()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4$b r2 = r2.Rv0(r9)
            java.lang.String r2 = r2.f212676b
            if (r2 == 0) goto L_0x05af
            goto L_0x05bb
        L_0x00e4:
            r2 = 2131833086(0x7f1130fe, float:1.9299244E38)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r11 = 0
            r9[r11] = r4
            java.lang.String r2 = r10.getString(r2, r9)
            goto L_0x05bb
        L_0x00f2:
            java.lang.String r2 = r8.getContent()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r13)
            if (r2 != 0) goto L_0x0112
            java.lang.String r9 = r8.getContent()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r11 = "appmsg"
            java.lang.String r9 = com.tencent.p014mm.sdk.p134kt.CommonKt.extractSubXmlTag(r9, r11)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r11 = "msg"
            java.lang.String r9 = com.tencent.p014mm.sdk.p134kt.CommonKt.wrapWithXmlTag(r9, r11)     // Catch:{ Exception -> 0x0111 }
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r13)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0112
        L_0x0111:
        L_0x0112:
            if (r2 == 0) goto L_0x05af
            int r9 = r2.f195582i
            r11 = 3
            if (r9 == r11) goto L_0x0473
            r11 = 4
            if (r9 == r11) goto L_0x046a
            r11 = 5
            r13 = 2131833111(0x7f113117, float:1.9299295E38)
            if (r9 == r11) goto L_0x0451
            r11 = 6
            if (r9 == r11) goto L_0x0435
            r11 = 50
            if (r9 == r11) goto L_0x0411
            r11 = 51
            r12 = 2131833090(0x7f113102, float:1.9299252E38)
            if (r9 == r11) goto L_0x03b7
            r11 = 87
            if (r9 == r11) goto L_0x03ae
            r11 = 88
            if (r9 == r11) goto L_0x0328
            r11 = 2000(0x7d0, float:2.803E-42)
            if (r9 == r11) goto L_0x0311
            r11 = 2001(0x7d1, float:2.804E-42)
            if (r9 == r11) goto L_0x02e1
            switch(r9) {
                case 1: goto L_0x02d3;
                case 8: goto L_0x05af;
                case 19: goto L_0x02ac;
                case 24: goto L_0x02a6;
                case 33: goto L_0x028a;
                case 36: goto L_0x028a;
                case 44: goto L_0x028a;
                case 48: goto L_0x028a;
                case 53: goto L_0x02d3;
                case 57: goto L_0x02d3;
                case 60: goto L_0x0273;
                case 63: goto L_0x0328;
                case 65: goto L_0x01fa;
                case 69: goto L_0x01de;
                case 74: goto L_0x0435;
                case 76: goto L_0x0473;
                case 82: goto L_0x01b9;
                case 94: goto L_0x016e;
                case 98: goto L_0x05af;
                case 101: goto L_0x014c;
                case 2011: goto L_0x0311;
                default: goto L_0x0143;
            }
        L_0x0143:
            r2 = 2131833087(0x7f1130ff, float:1.9299246E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x014c:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x0163
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0163
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r2 = r2.f195570f
            r11 = 0
            r9[r11] = r2
            java.lang.String r2 = r10.getString(r13, r9)
            goto L_0x05bb
        L_0x0163:
            r11 = 0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r11] = r4
            java.lang.String r2 = r10.getString(r13, r2)
            goto L_0x05bb
        L_0x016e:
            java.lang.Class<ht1.j> r9 = ht1.C60176j.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r9)
            ht1.j r2 = (ht1.C60176j) r2
            if (r2 == 0) goto L_0x01ae
            te3.xk1 r9 = r2.f171713b
            java.lang.String r9 = r9.f186328f
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x01ae
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r11 = 2131821536(0x7f1103e0, float:1.9275818E38)
            java.lang.String r11 = r10.getString(r11)
            r9.append(r11)
            r11 = 2131821538(0x7f1103e2, float:1.9275822E38)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            te3.xk1 r2 = r2.f171713b
            java.lang.String r2 = r2.f186328f
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r14 = 0
            r12[r14] = r2
            java.lang.String r2 = r10.getString(r11, r12)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            goto L_0x05bb
        L_0x01ae:
            r14 = 0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r14] = r4
            java.lang.String r2 = r10.getString(r13, r2)
            goto L_0x05bb
        L_0x01b9:
            java.lang.Class<ht1.i> r9 = ht1.C60175i.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r9)
            ht1.i r2 = (ht1.C60175i) r2
            if (r2 == 0) goto L_0x01d3
            te3.ci1 r9 = r2.f171712b
            java.lang.String r9 = r9.f182504p
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x01d3
            te3.ci1 r2 = r2.f171712b
            java.lang.String r2 = r2.f182504p
            goto L_0x05bb
        L_0x01d3:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r9 = 0
            r2[r9] = r4
            java.lang.String r2 = r10.getString(r13, r2)
            goto L_0x05bb
        L_0x01de:
            java.lang.String r9 = r2.f195574g
            if (r9 == 0) goto L_0x01ec
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x01ec
            java.lang.String r2 = r2.f195574g
            goto L_0x05bb
        L_0x01ec:
            r2 = 2131833095(0x7f113107, float:1.9299262E38)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r11 = 0
            r9[r11] = r4
            java.lang.String r2 = r10.getString(r2, r9)
            goto L_0x05bb
        L_0x01fa:
            java.lang.Class<ht1.a> r9 = ht1.C60150a.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r9)
            ht1.a r2 = (ht1.C60150a) r2
            if (r2 == 0) goto L_0x026a
            te3.p81 r9 = r2.f171697b
            if (r9 == 0) goto L_0x026a
            java.lang.String r9 = r9.f184781g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x021a
            te3.p81 r9 = r2.f171697b
            java.lang.String r9 = r9.f184782h
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x026a
        L_0x021a:
            te3.p81 r9 = r2.f171697b
            java.lang.String r9 = r9.f184781g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0238
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            te3.p81 r10 = r2.f171697b
            java.lang.String r10 = r10.f184781g
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto L_0x0239
        L_0x0238:
            r9 = r4
        L_0x0239:
            te3.p81 r10 = r2.f171697b
            java.lang.String r10 = r10.f184782h
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x02d0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "·"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            te3.p81 r2 = r2.f171697b
            java.lang.String r2 = r2.f184782h
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            goto L_0x05bb
        L_0x026a:
            android.content.res.Resources r2 = r10.getResources()
            r2.getString(r12)
            goto L_0x05af
        L_0x0273:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x0281
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0281
            java.lang.String r2 = r2.f195570f
            goto L_0x05bb
        L_0x0281:
            r2 = 2131833100(0x7f11310c, float:1.9299273E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x028a:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x0298
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0298
            java.lang.String r2 = r2.f195570f
            goto L_0x05bb
        L_0x0298:
            r2 = 2131833085(0x7f1130fd, float:1.9299242E38)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r11 = 0
            r9[r11] = r4
            java.lang.String r2 = r10.getString(r2, r9)
            goto L_0x05bb
        L_0x02a6:
            java.lang.String r2 = m94854f(r2)
            goto L_0x05bb
        L_0x02ac:
            r9 = 2131833107(0x7f113113, float:1.9299287E38)
            java.lang.String r9 = r10.getString(r9)
            java.lang.String r10 = r2.f195570f
            if (r10 == 0) goto L_0x02d0
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x02d0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r2 = r2.f195570f
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            goto L_0x05bb
        L_0x02d0:
            r2 = r9
            goto L_0x05bb
        L_0x02d3:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x05af
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x05af
            java.lang.String r2 = r2.f195570f
            goto L_0x05bb
        L_0x02e1:
            int r9 = r8.mo108769t2()
            if (r9 != r6) goto L_0x02ea
            java.lang.String r9 = r2.f195584i1
            goto L_0x02ec
        L_0x02ea:
            java.lang.String r9 = r2.f195580h1
        L_0x02ec:
            if (r9 == 0) goto L_0x02f5
            int r11 = r9.length()
            if (r11 <= 0) goto L_0x02f5
            goto L_0x02d0
        L_0x02f5:
            java.lang.String r2 = r2.f195604n1
            java.lang.String r9 = "1001"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0308
            r2 = 2131833084(0x7f1130fc, float:1.929924E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x0308:
            r2 = 2131833098(0x7f11310a, float:1.9299268E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x0311:
            java.lang.String r9 = r2.f195532T1
            if (r9 == 0) goto L_0x031f
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x031f
            java.lang.String r2 = r2.f195532T1
            goto L_0x05bb
        L_0x031f:
            r2 = 2131833104(0x7f113110, float:1.929928E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x0328:
            java.lang.Class<ht1.b> r9 = ht1.C60151b.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r9)
            ht1.b r2 = (ht1.C60151b) r2
            if (r2 == 0) goto L_0x03a5
            te3.p81 r9 = r2.f171698b
            if (r9 == 0) goto L_0x03a5
            java.lang.String r9 = r9.f184781g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0348
            te3.p81 r9 = r2.f171698b
            java.lang.String r9 = r9.f184782h
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x03a5
        L_0x0348:
            te3.p81 r9 = r2.f171698b
            java.lang.String r9 = r9.f184781g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0366
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            te3.p81 r11 = r2.f171698b
            java.lang.String r11 = r11.f184781g
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            goto L_0x0367
        L_0x0366:
            r9 = r4
        L_0x0367:
            te3.p81 r11 = r2.f171698b
            java.lang.String r11 = r11.f184778d
            long r20 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r14)
            java.lang.Class<ir.n> r11 = p565ir.C60606n.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            r16 = r11
            ir.n r16 = (p565ir.C60606n) r16
            te3.p81 r2 = r2.f171698b
            java.lang.String r2 = r2.f184779e
            r18 = 0
            r19 = 0
            r17 = r2
            boolean r2 = r16.mo85079pT(r17, r18, r19, r20)
            if (r2 == 0) goto L_0x0397
            r2 = 2131833093(0x7f113105, float:1.9299258E38)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r12 = 0
            r11[r12] = r9
            java.lang.String r2 = r10.getString(r2, r11)
            goto L_0x05bb
        L_0x0397:
            r12 = 0
            r2 = 2131833092(0x7f113104, float:1.9299256E38)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r12] = r9
            java.lang.String r2 = r10.getString(r2, r11)
            goto L_0x05bb
        L_0x03a5:
            android.content.res.Resources r2 = r10.getResources()
            r2.getString(r12)
            goto L_0x05af
        L_0x03ae:
            r2 = 2131833080(0x7f1130f8, float:1.9299232E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x03b7:
            java.lang.Class<ht1.f> r9 = ht1.C60166f.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r9)
            ht1.f r2 = (ht1.C60166f) r2
            if (r2 == 0) goto L_0x0408
            te3.rk1 r9 = r2.f171710b
            if (r9 == 0) goto L_0x0408
            java.lang.String r9 = r2.mo85179g()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x03d9
            te3.rk1 r9 = r2.f171710b
            java.lang.String r9 = r9.f185187h
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0408
        L_0x03d9:
            java.lang.String r9 = r2.mo85179g()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x05af
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131833091(0x7f113103, float:1.9299254E38)
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r2 = r2.mo85179g()
            r13 = 0
            r12[r13] = r2
            java.lang.String r2 = r10.getString(r11, r12)
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            goto L_0x05bb
        L_0x0408:
            android.content.res.Resources r2 = r10.getResources()
            r2.getString(r12)
            goto L_0x05af
        L_0x0411:
            java.lang.Class<ht1.e> r9 = ht1.C60161e.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r9)
            ht1.e r2 = (ht1.C60161e) r2
            if (r2 == 0) goto L_0x0427
            java.lang.String r9 = r2.f171704e
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0427
            java.lang.String r2 = r2.f171704e
            goto L_0x05bb
        L_0x0427:
            r2 = 2131833094(0x7f113106, float:1.929926E38)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r11 = 0
            r9[r11] = r4
            java.lang.String r2 = r10.getString(r2, r9)
            goto L_0x05bb
        L_0x0435:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x0443
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0443
            java.lang.String r2 = r2.f195570f
            goto L_0x05bb
        L_0x0443:
            r2 = 2131833089(0x7f113101, float:1.929925E38)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r11 = 0
            r9[r11] = r4
            java.lang.String r2 = r10.getString(r2, r9)
            goto L_0x05bb
        L_0x0451:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x045f
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x045f
            java.lang.String r2 = r2.f195570f
            goto L_0x05bb
        L_0x045f:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r9 = 0
            r2[r9] = r4
            java.lang.String r2 = r10.getString(r13, r2)
            goto L_0x05bb
        L_0x046a:
            r2 = 2131833112(0x7f113118, float:1.9299297E38)
            java.lang.String r2 = r10.getString(r2)
            goto L_0x05bb
        L_0x0473:
            java.lang.String r9 = r2.f195570f
            if (r9 == 0) goto L_0x0481
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0481
            java.lang.String r2 = r2.f195570f
            goto L_0x05bb
        L_0x0481:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r9 = 0
            r2[r9] = r4
            r9 = 2131833101(0x7f11310d, float:1.9299275E38)
            java.lang.String r2 = r10.getString(r9, r2)
            goto L_0x05bb
        L_0x048f:
            java.lang.String r2 = "location"
            ke3.C88144b.m109788f(r2)
            com.tencent.mm.autogen.events.LocationServerEvent r2 = new com.tencent.mm.autogen.events.LocationServerEvent
            r2.<init>()
            com.tencent.mm.autogen.events.LocationServerEvent$a r9 = r2.f193728d
            r9.f193730a = r6
            r9.f193733d = r8
            r2.publish()
            com.tencent.mm.autogen.events.LocationServerEvent$b r9 = r2.f193729e
            java.lang.String r11 = r9.f193735b
            java.lang.String r9 = r9.f193734a
            boolean r10 = m94857i(r11, r10)
            if (r10 == 0) goto L_0x04bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            goto L_0x05bb
        L_0x04bf:
            com.tencent.mm.autogen.events.LocationServerEvent$b r2 = r2.f193729e
            java.lang.String r2 = r2.f193734a
            if (r2 == 0) goto L_0x04d5
            boolean r10 = r2.equals(r4)
            if (r10 != 0) goto L_0x04d5
            java.lang.String r10 = "err_not_started"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x04d5
            r15 = 1
            goto L_0x04d6
        L_0x04d5:
            r15 = 0
        L_0x04d6:
            if (r15 == 0) goto L_0x05af
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            goto L_0x05bb
        L_0x04e9:
            boolean r2 = r8.mo100975N3()
            if (r2 == 0) goto L_0x05af
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r9)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.String r9 = r8.getContent()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4$b r2 = r2.Rv0(r9)
            java.lang.String r2 = r2.f212676b
            goto L_0x05bb
        L_0x050a:
            java.lang.String r9 = r8.getContent()
            java.lang.String r11 = r8.getContent()
            java.lang.String r12 = ":"
            if (r11 == 0) goto L_0x0536
            java.lang.String r11 = r8.getContent()
            java.lang.String r13 = r2.f201546g
            boolean r11 = r11.contains(r13)
            if (r11 != 0) goto L_0x0536
            java.lang.String r2 = r2.f201546g
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
        L_0x0536:
            java.lang.String r2 = "\n"
            boolean r2 = r9.endsWith(r2)     // Catch:{ Exception -> 0x057b }
            if (r2 == 0) goto L_0x0548
            int r2 = r9.length()     // Catch:{ Exception -> 0x057b }
            int r2 = r2 - r6
            r11 = 0
            java.lang.String r9 = r9.substring(r11, r2)     // Catch:{ Exception -> 0x057b }
        L_0x0548:
            java.lang.String[] r2 = r9.split(r12)     // Catch:{ Exception -> 0x057b }
            int r9 = r2.length     // Catch:{ Exception -> 0x057b }
            r11 = 4
            if (r9 != r11) goto L_0x055b
            r9 = 0
            r11 = r2[r9]     // Catch:{ Exception -> 0x057b }
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85811N4(r11)     // Catch:{ Exception -> 0x057b }
            if (r9 == 0) goto L_0x055b
            r11 = 1
            goto L_0x055c
        L_0x055b:
            r11 = 0
        L_0x055c:
            int r9 = r2.length     // Catch:{ Exception -> 0x057b }
            if (r9 <= r11) goto L_0x0561
            r9 = r2[r11]     // Catch:{ Exception -> 0x057b }
        L_0x0561:
            int r9 = r2.length     // Catch:{ Exception -> 0x057b }
            int r12 = r11 + 1
            if (r9 <= r12) goto L_0x056d
            r9 = r2[r12]     // Catch:{ Exception -> 0x057b }
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r14)     // Catch:{ Exception -> 0x057b }
            goto L_0x056e
        L_0x056d:
            r12 = r14
        L_0x056e:
            int r9 = r2.length     // Catch:{ Exception -> 0x057b }
            int r11 = r11 + 2
            if (r9 <= r11) goto L_0x0583
            r2 = r2[r11]     // Catch:{ Exception -> 0x057b }
            java.lang.String r9 = "1"
            r2.equals(r9)     // Catch:{ Exception -> 0x057b }
            goto L_0x0583
        L_0x057b:
            java.lang.String r2 = "MicroMsg.VoiceContent"
            java.lang.String r9 = "VoiceContent parse failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r9)
            r12 = r14
        L_0x0583:
            java.lang.Class<dn.t> r2 = p492dn.C75415t.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dn.t r2 = (p492dn.C75415t) r2
            float r2 = r2.F30(r12)
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x05a9
            android.content.res.Resources r9 = r10.getResources()
            r10 = 2131833113(0x7f113119, float:1.9299299E38)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12 = 0
            r11[r12] = r2
            java.lang.String r2 = r9.getString(r10, r11)
            goto L_0x05bb
        L_0x05a9:
            r2 = 2131833114(0x7f11311a, float:1.92993E38)
            r10.getString(r2)
        L_0x05af:
            r2 = r4
            goto L_0x05bb
        L_0x05b1:
            java.lang.String r2 = r8.getContent()
            if (r2 == 0) goto L_0x05bb
            java.lang.String r2 = r2.trim()
        L_0x05bb:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r9 != 0) goto L_0x05c9
            r9 = 10
            r10 = 32
            java.lang.String r2 = r2.replace(r9, r10)
        L_0x05c9:
            if (r5 != 0) goto L_0x05e4
            java.lang.String r5 = "MicroMsg.msgquote.MsgQuoteHelp"
            java.lang.String r9 = "getShowSummary() msgQute is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            java.lang.String r5 = r7.toString()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x05e4
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r4)
            return r0
        L_0x05e4:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x0620
            android.graphics.drawable.Drawable r4 = m94856h(r1, r8)
            if (r4 == 0) goto L_0x0612
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            di3.d r5 = di3.C86312j.m106911c(r3)
            ny.h r5 = (p629ny.C76979h) r5
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.text.SpannableString r3 = r3.yp0(r1, r2, r0)
            r9 = 1
            r0 = r5
            r1 = r22
            r2 = r7
            r5 = r9
            android.text.SpannableStringBuilder r0 = r0.Ii0(r1, r2, r3, r4, r5)
            r6.<init>(r8, r0)
            return r6
        L_0x0612:
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.text.SpannableString r0 = r3.yp0(r1, r2, r0)
            r7.append(r0)
            goto L_0x0638
        L_0x0620:
            android.graphics.drawable.Drawable r0 = m94856h(r1, r8)
            if (r0 == 0) goto L_0x0638
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            java.lang.CharSequence r0 = r3.c80(r1, r7, r0, r6)
            r2.<init>(r4, r0)
            return r2
        L_0x0638:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.<init>(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w72.C78521a.m94855g(android.content.Context, float, com.tencent.mm.storage.f4, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem):android.util.Pair");
    }

    /* renamed from: h */
    public static Drawable m94856h(Context context, C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        switch (f4Var.getType()) {
            case 34:
                Drawable e = C74933u4.m89768e(context, C0966R.raw.icons_outlined_quote_voice, context.getResources().getColor(C0966R.color.BW_BG_5A));
                e.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                return e;
            case 42:
            case 66:
                Drawable e2 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_me, context.getResources().getColor(C0966R.color.BW_BG_5A));
                e2.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                return e2;
            case 48:
                Drawable e3 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_quote_location, context.getResources().getColor(C0966R.color.BW_BG_5A));
                e3.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                return e3;
            case 49:
            case 1048625:
            case 419430449:
            case 436207665:
            case 754974769:
            case 805306417:
            case 822083633:
            case 855638065:
            case 973078577:
            case 974127153:
            case 975175729:
            case 976224305:
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u == null) {
                    return null;
                }
                int i = u.f195582i;
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 50) {
                                if (i != 51) {
                                    if (i != 2000) {
                                        if (i != 2001) {
                                            switch (i) {
                                                case 24:
                                                    Drawable e4 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_quote_pencil, context.getResources().getColor(C0966R.color.BW_BG_5A));
                                                    e4.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                                                    return e4;
                                                case 33:
                                                case 36:
                                                case 44:
                                                case 48:
                                                    Drawable e5 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_quote_mini_program, context.getResources().getColor(C0966R.color.BW_BG_5A));
                                                    e5.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                                                    return e5;
                                                case 60:
                                                    Drawable e6 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_live, context.getResources().getColor(C0966R.color.BW_BG_5A));
                                                    e6.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                                                    return e6;
                                                case 63:
                                                case 65:
                                                case 88:
                                                    break;
                                                case 69:
                                                    break;
                                                case 76:
                                                    break;
                                                case 82:
                                                    break;
                                                case 2011:
                                                    break;
                                                default:
                                                    return null;
                                            }
                                        } else {
                                            Drawable e7 = "1001".equals(u.f195604n1) ? C74933u4.m89768e(context, C0966R.raw.icons_outlined_accounts, context.getResources().getColor(C0966R.color.BW_BG_5A)) : C74933u4.m89768e(context, C0966R.raw.icons_outlined_envelopes, context.getResources().getColor(C0966R.color.BW_BG_5A));
                                            e7.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                                            return e7;
                                        }
                                    }
                                    Drawable e8 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_accounts, context.getResources().getColor(C0966R.color.BW_BG_5A));
                                    e8.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                                    return e8;
                                }
                                Drawable e9 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_video, context.getResources().getColor(C0966R.color.BW_BG_5A));
                                e9.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                                return e9;
                            }
                            Drawable e15 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_me, context.getResources().getColor(C0966R.color.BW_BG_5A));
                            e15.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                            return e15;
                        }
                        Drawable e16 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_document, context.getResources().getColor(C0966R.color.BW_BG_5A));
                        e16.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                        return e16;
                    }
                    Drawable e17 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_quote_link, context.getResources().getColor(C0966R.color.BW_BG_5A));
                    e17.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                    return e17;
                }
                Drawable e18 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_quote_music, context.getResources().getColor(C0966R.color.BW_BG_5A));
                e18.setBounds(0, 0, C76577a.m92150a(context, 16.0f), C76577a.m92150a(context, 16.0f));
                return e18;
            default:
                return null;
        }
    }

    /* renamed from: i */
    public static boolean m94857i(String str, Context context) {
        return str != null && !str.equals("") && !str.equals(context.getResources().getString(C0966R.string.gwx));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        return 11;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m94858j(com.tencent.p014mm.storage.C72963f4 r8) {
        /*
            r0 = -1
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r8.getType()
            r2 = 11
            r3 = 3
            r4 = 2
            r5 = 4
            r6 = 6
            r7 = 1
            switch(r1) {
                case 3: goto L_0x004d;
                case 13: goto L_0x004d;
                case 23: goto L_0x004d;
                case 33: goto L_0x004d;
                case 39: goto L_0x004d;
                case 42: goto L_0x004c;
                case 43: goto L_0x004b;
                case 44: goto L_0x004b;
                case 47: goto L_0x004a;
                case 48: goto L_0x0049;
                case 49: goto L_0x0015;
                case 62: goto L_0x004b;
                case 66: goto L_0x004c;
                case 1048625: goto L_0x0015;
                case 268435505: goto L_0x004d;
                case 436207665: goto L_0x0015;
                case 754974769: goto L_0x0015;
                case 771751985: goto L_0x004c;
                case 805306417: goto L_0x0015;
                case 822083633: goto L_0x0015;
                case 939524145: goto L_0x004c;
                case 973078577: goto L_0x0015;
                case 974127153: goto L_0x0015;
                case 975175729: goto L_0x0015;
                case 1040187441: goto L_0x0014;
                case 1090519089: goto L_0x0015;
                case 1124073521: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x004e
        L_0x0013:
            return r2
        L_0x0014:
            return r6
        L_0x0015:
            java.lang.String r8 = r8.getContent()
            r1 = 0
            com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r1)
            if (r8 == 0) goto L_0x004e
            int r1 = r8.f195582i
            if (r1 == r3) goto L_0x0048
            if (r1 == r5) goto L_0x0047
            r3 = 5
            if (r1 == r3) goto L_0x0044
            if (r1 == r6) goto L_0x0042
            switch(r1) {
                case 8: goto L_0x0041;
                case 33: goto L_0x003e;
                case 36: goto L_0x003e;
                case 44: goto L_0x003e;
                case 48: goto L_0x003e;
                case 51: goto L_0x003b;
                case 63: goto L_0x003b;
                case 65: goto L_0x003b;
                case 74: goto L_0x0042;
                case 76: goto L_0x0048;
                case 82: goto L_0x003e;
                case 88: goto L_0x003b;
                case 98: goto L_0x003a;
                case 2001: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x004e
        L_0x002f:
            java.lang.String r8 = r8.f195604n1
            java.lang.String r0 = "1001"
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L_0x003a
            return r3
        L_0x003a:
            return r2
        L_0x003b:
            r8 = 8
            return r8
        L_0x003e:
            r8 = 10
            return r8
        L_0x0041:
            return r7
        L_0x0042:
            r8 = 7
            return r8
        L_0x0044:
            r8 = 9
            return r8
        L_0x0047:
            return r4
        L_0x0048:
            return r6
        L_0x0049:
            return r3
        L_0x004a:
            return r7
        L_0x004b:
            return r4
        L_0x004c:
            return r5
        L_0x004d:
            return r7
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w72.C78521a.m94858j(com.tencent.mm.storage.f4):int");
    }

    /* renamed from: k */
    public static Bitmap m94859k(Context context, Bitmap bitmap, ImageView imageView, int i, int i2) {
        float f = ((float) i2) / ((float) i);
        int c = C74942w4.m89786c(context, C0966R.dimen.f3749d0);
        int c2 = C74942w4.m89786c(context, C0966R.dimen.f3753d4);
        if (f > 0.0f && ((double) f) < 0.5d) {
            c2 = (int) (((float) c) / f);
        } else if (((double) f) < 0.5d || f >= 1.0f) {
            if (f >= 1.0f && f < 2.0f) {
                c = (int) (((float) c2) / f);
            } else if (f >= 2.0f) {
                c2 = (int) (((float) c) * f);
            } else {
                c2 = 0;
                c = 0;
            }
            int i3 = c;
            c = c2;
            c2 = i3;
        } else {
            c = (int) (((float) c2) * f);
        }
        if (c <= 0 || c2 <= 0 || bitmap == null) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmap, c2, c, true);
    }

    /* renamed from: l */
    public static boolean m94860l(Context context, ImageView imageView, ImageView imageView2, AlbumContainer albumContainer, C72963f4 f4Var, boolean z) {
        Bitmap bitmap;
        Context context2 = context;
        ImageView imageView3 = imageView;
        ImageView imageView4 = imageView2;
        AlbumContainer albumContainer2 = albumContainer;
        C72963f4 f4Var2 = f4Var;
        Class cls = C98201k.class;
        if (f4Var2 == null) {
            return false;
        }
        byte[] bArr = null;
        switch (f4Var.getType()) {
            case 3:
            case 13:
            case 23:
            case 33:
            case 39:
            case 268435505:
            case 1040187441:
                return m94851c(context2, imageView3, f4Var2);
            case 34:
            case 49:
            case 1048625:
            case 419430449:
            case 436207665:
            case 754974769:
            case 771751985:
            case 805306417:
            case 855638065:
            case 939524145:
            case 973078577:
            case 974127153:
            case 975175729:
            case 976224305:
            case 1090519089:
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                if (u != null) {
                    int i = u.f195582i;
                    if (i != 3) {
                        if (i == 4) {
                            return m94852d(context2, imageView3, imageView4, f4Var2);
                        }
                        if (i == 5) {
                            return m94851c(context2, imageView3, f4Var2);
                        }
                        if (i == 6) {
                            if (!Util.isImageExt(u.f195602n)) {
                                imageView3.setImageDrawable(C76577a.m92158i(context2, ((C22923f) C86312j.m106911c(C22923f.class)).mo35897CW(u.f195602n)));
                            } else if (C85875k4.m106211z()) {
                                imageView3.setImageDrawable(C76577a.m92158i(context2, C0966R.raw.app_attach_file_icon_photo_dark));
                            } else {
                                imageView3.setImageDrawable(C76577a.m92158i(context2, C0966R.raw.app_attach_file_icon_photo));
                            }
                            return true;
                        } else if (i == 50) {
                            return m94850b(context2, imageView3, f4Var2, u);
                        } else {
                            if (i != 51) {
                                switch (i) {
                                    case 8:
                                        return m94851c(context2, imageView3, f4Var2);
                                    case 33:
                                    case 36:
                                    case 44:
                                    case 48:
                                        if (i != 33 && i != 36 && i != 48) {
                                            return false;
                                        }
                                        String h302 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).h30(f4Var.mo108765s2());
                                        String str = C88394b.f255384g;
                                        C88394b.C88418q.f255427a.mo122787c(imageView, "file://" + h302, (Drawable) null, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(C76529i.class)).Ij0(240, 192));
                                        m94861m(imageView);
                                        return true;
                                    case 63:
                                    case 65:
                                    case 82:
                                    case 88:
                                        break;
                                    case 69:
                                        return m94851c(context2, imageView3, f4Var2);
                                    case 74:
                                        imageView3.setImageResource(C0966R.raw.app_attach_file_icon_hongbao);
                                        return true;
                                    case 76:
                                        break;
                                    case 98:
                                        m94849a(context2, albumContainer2, f4Var2);
                                        return true;
                                    case 2001:
                                        if (!"1001".equals(u.f195604n1)) {
                                            imageView3.setImageResource(C0966R.C0969drawable.c2c_hongbao_icon_cn);
                                        }
                                        return true;
                                }
                            }
                            return m94850b(context2, imageView3, f4Var2, u);
                        }
                    }
                    return m94851c(context2, imageView3, f4Var2);
                }
                break;
            case 42:
            case 66:
                Class cls2 = C76705f.class;
                C86709a0.m107528h();
                C72963f4.C72964b Rv0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Rv0(f4Var.getContent());
                int i2 = Rv0.f212691q;
                Set<String> set = C45628s0.f123410p;
                if (C72996z1.m85810M4(i2)) {
                    String str2 = Rv0.f212675a;
                    if (Util.isNullOrNil(str2)) {
                        imageView3.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.be5));
                    } else {
                        ((C76705f) C86312j.m106911c(cls2)).mo106822J5(imageView3, str2);
                    }
                } else {
                    imageView3.setImageDrawable(context.getResources().getDrawable(C0966R.C0969drawable.bfa));
                    String str3 = Rv0.f212675a;
                    if (Util.isNullOrNil(str3)) {
                        imageView3.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.bfa));
                    } else {
                        ((C76705f) C86312j.m106911c(cls2)).mo106849z(imageView3, str3);
                    }
                }
                return true;
            case 43:
            case 44:
            case 62:
                return m94852d(context2, imageView3, imageView4, f4Var2);
            case 47:
                String s2 = f4Var.mo108765s2();
                if (Util.isNullOrNil(s2)) {
                    Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteEmoji() msgPath is null");
                    return false;
                }
                IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91189Vs(s2);
                if (Vs == null) {
                    Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteEmoji() emoji is null");
                    return false;
                }
                int La = ((C67305d1) C86312j.m106911c(C67305d1.class)).mo91426La(Vs);
                if (La != 0) {
                    bitmap = BitmapUtil.transformDrawableToBitmap(context.getResources().getDrawable(La));
                } else if (C86013q1.m106450k(Vs.getCoverPath())) {
                    bArr = C86013q1.m106433O(Vs.getCoverPath(), 0, -1);
                    bitmap = null;
                } else {
                    bitmap = Vs.mo62698y(context2);
                }
                if (bArr != null && bArr.length > 0) {
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    Exif exif = new Exif();
                    exif.parseFrom(bArr);
                    int orientationInDegree = exif.getOrientationInDegree();
                    if (!(bitmap == null || orientationInDegree == 0)) {
                        bitmap = BitmapUtil.rotate(bitmap, (float) orientationInDegree);
                    }
                }
                if (bitmap == null) {
                    Log.m105920e("MicroMsg.msgquote.MsgQuoteHelp", "dealQuoteEmoji() thumbBmp is null");
                    return false;
                }
                imageView3.setImageBitmap(C74821t4.m89550a(m94859k(context2, bitmap, imageView3, bitmap.getWidth(), bitmap.getHeight()), true, (float) C74942w4.m89784a(context2, 3), false));
                return true;
            case 48:
                imageView3.setImageBitmap(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).P50(C0966R.C0969drawable.bha, C0966R.C0969drawable.c8i, C74942w4.m89786c(context2, C0966R.dimen.f3749d0), C74942w4.m89786c(context2, C0966R.dimen.f3749d0), z));
                m94861m(imageView);
                return true;
            case 1124073521:
                m94849a(context2, albumContainer2, f4Var2);
                return true;
        }
        return false;
    }

    /* renamed from: m */
    public static void m94861m(ImageView imageView) {
        imageView.setClipToOutline(true);
        imageView.setBackgroundResource(C0966R.C0969drawable.ahn);
    }
}

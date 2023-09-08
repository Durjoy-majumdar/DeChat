package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import o90.C100301b;
import p206nj.C76861g;
import p206nj.C88955f;
import p227rn.C63484s;
import p755xs.C102720b;
import p755xs.C102721c;
import p761yd.C38993b;
import p823sg.C101611g;
import pb1.C100734q;
import pb1.C100755z;
import q90.C101062d;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101850ud0;
import te3.C64682rk1;
import te3.C64719t23;
import te3.C90431pc0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer */
public class FavoriteImageServer {

    /* renamed from: e */
    public static Map<String, C76861g.C47263a> f269874e = new HashMap();

    /* renamed from: f */
    public static C101611g<String, Bitmap> f269875f;

    /* renamed from: g */
    public static C101611g<String, Bitmap> f269876g;

    /* renamed from: a */
    public Context f269877a;

    /* renamed from: b */
    public C102721c f269878b;

    /* renamed from: c */
    public HashMap<String, String[]> f269879c = new HashMap<>();

    /* renamed from: d */
    public HashMap<String, String[]> f269880d = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteImageServer$MMTrimMemoryEventListener */
    public static class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {

        /* renamed from: d */
        public final WeakReference<FavoriteImageServer> f81057d;

        public MMTrimMemoryEventListener(FavoriteImageServer favoriteImageServer) {
            super(C40008f.f107254d);
            this.f81057d = new WeakReference<>(favoriteImageServer);
            this.__eventId = 708811463;
        }

        public boolean callback(IEvent iEvent) {
            MMTrimMemoryEvent mMTrimMemoryEvent = (MMTrimMemoryEvent) iEvent;
            FavoriteImageServer favoriteImageServer = this.f81057d.get();
            if (favoriteImageServer == null) {
                Log.m105924i("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: FavoriteImageServer was gone");
                dead();
            } else if (C38993b.m41993c(C32735h.C32737c.clicfg_matrix_trim_memory_favoriteimageserver_v2, true)) {
                Log.m105920e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: FavoriteImageServer");
                HashMap<String, String[]> hashMap = favoriteImageServer.f269879c;
                if (hashMap != null) {
                    Log.m105921e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: clear [attachImgPathCache][%s]", Integer.valueOf(hashMap.size()));
                    favoriteImageServer.f269879c.clear();
                }
                HashMap<String, String[]> hashMap2 = favoriteImageServer.f269880d;
                if (hashMap2 != null) {
                    Log.m105921e("MicroMsg.FavoriteImageServer", "received MMTrimMemoryEvent: clear [attachThumbPathCache][%s]", Integer.valueOf(hashMap2.size()));
                    favoriteImageServer.f269880d.clear();
                }
            }
            return false;
        }
    }

    static {
        Class<FavoriteImageServer> cls = FavoriteImageServer.class;
        f269875f = new C100301b(10, cls);
        f269876g = new C100301b(20, cls);
    }

    public FavoriteImageServer(Context context, int i) {
        new MMTrimMemoryEventListener(this).alive();
        this.f269877a = context;
        this.f269878b = ((C102720b) C86312j.m106911c(C102720b.class)).mo142101Fa(i <= 0 ? 24 : i, new FavoriteImageServer$$i(this));
    }

    /* renamed from: d */
    public static void m118077d(ImageView imageView, int i, C101834rc0 rc02, C100755z zVar, boolean z, int i2, int i3) {
        ImageView imageView2 = imageView;
        C100755z zVar2 = zVar;
        int i4 = i2;
        int i5 = i3;
        if (rc02.f299280T == null) {
            imageView.setImageResource(i);
            Log.m105925i("MicroMsg.FavoriteImageServer", "dataId is null favId:%s localId:%s", Integer.valueOf(zVar2.field_id), Long.valueOf(zVar2.field_localId));
            return;
        }
        Bitmap bitmap = null;
        String w = C100734q.m131880w(rc02);
        if (C86013q1.m106450k(w)) {
            bitmap = m118081j(w, i2, i5, true);
        }
        String Q = C100734q.m131826Q(rc02);
        if ((bitmap == null || bitmap.isRecycled()) && C86013q1.m106450k(Q)) {
            bitmap = m118081j(Q, i2, i5, true);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            imageView.setImageResource(i);
            imageView.setTag(Q);
            ((C119157j) C119157j.f356862d).mo183876g(new FavoriteImageServer$$b(Q, i2, i3, z, zVar, rc02, imageView), "FavImageServer");
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    /* renamed from: g */
    public static Bitmap m118078g(C101834rc0 rc02, C100755z zVar, boolean z) {
        if (!C88955f.m111058b()) {
            Log.m105920e("MicroMsg.FavoriteImageServer", "[getBigImg] sdcardAvail = false, bigImg return nosdcard_chatting_bg");
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        } else if (rc02.f299280T == null) {
            return null;
        } else {
            Bitmap h = m118079h(rc02, false, false);
            if (h == null) {
                String w = C100734q.m131880w(rc02);
                ((C119157j) C119157j.f356862d).mo183876g(new FavoriteImageServer$$d(z, w, zVar, rc02), "FavImageServer");
            }
            return h;
        }
    }

    /* renamed from: h */
    public static Bitmap m118079h(C101834rc0 rc02, boolean z, boolean z2) {
        String Q = z ? C100734q.m131826Q(rc02) : C100734q.m131880w(rc02);
        if (C86013q1.m106450k(Q)) {
            return C93693r.m118402c(Q, 960, 960, z2);
        }
        Log.m105929w("MicroMsg.FavoriteImageServer", "getBitmap file not exist %s", Q);
        return null;
    }

    /* renamed from: i */
    public static Bitmap m118080i(C101834rc0 rc02, C100755z zVar) {
        if (!C88955f.m111058b()) {
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        }
        if (C100734q.m131825P(rc02.f299280T) == null) {
            return null;
        }
        Bitmap h = m118079h(rc02, true, false);
        if (h == null) {
            String Q = C100734q.m131826Q(rc02);
            ((C119157j) C119157j.f356862d).mo183876g(new FavoriteImageServer$$a(Q, zVar, rc02), "FavImageServer");
        }
        return h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[Catch:{ IOException -> 0x00fd }, LOOP:0: B:18:0x0059->B:22:0x0063, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[Catch:{ IOException -> 0x00fd }, EDGE_INSN: B:41:0x0068->B:23:0x0068 ?: BREAK  
    EDGE_INSN: B:42:0x0068->B:23:0x0068 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7 A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f7 A[Catch:{ IOException -> 0x00fd }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m118081j(java.lang.String r20, int r21, int r22, boolean r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r20)
            java.lang.String r4 = "MicroMsg.FavoriteImageServer"
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L_0x001b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r0
            java.lang.String r0 = "file not exist %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)
            r0 = 0
            return r0
        L_0x001b:
            sg.g<java.lang.String, android.graphics.Bitmap> r3 = f269876g
            o90.b r3 = (o90.C100301b) r3
            java.lang.Object r3 = r3.get(r0)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L_0x0034
            if (r23 == 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r0
            java.lang.String r0 = "return bm path %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r1)
            return r3
        L_0x0034:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00fd }
            r7.<init>()     // Catch:{ IOException -> 0x00fd }
            r7.inJustDecodeBounds = r5     // Catch:{ IOException -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r0, r7)     // Catch:{ IOException -> 0x00fd }
            int r8 = r7.outWidth     // Catch:{ IOException -> 0x00fd }
            int r9 = r7.outHeight     // Catch:{ IOException -> 0x00fd }
            int r10 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r20)     // Catch:{ IOException -> 0x00fd }
            r11 = 90
            if (r10 == r11) goto L_0x0051
            r11 = 270(0x10e, float:3.78E-43)
            if (r10 != r11) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r11 = 0
            goto L_0x0057
        L_0x0051:
            r11 = 1
            r19 = r9
            r9 = r8
            r8 = r19
        L_0x0057:
            r7.inSampleSize = r5     // Catch:{ IOException -> 0x00fd }
        L_0x0059:
            int r12 = r7.inSampleSize     // Catch:{ IOException -> 0x00fd }
            int r13 = r9 / r12
            if (r13 <= r2) goto L_0x0068
            int r13 = r8 / r12
            if (r13 <= r1) goto L_0x0068
            int r12 = r12 + 1
            r7.inSampleSize = r12     // Catch:{ IOException -> 0x00fd }
            goto L_0x0059
        L_0x0068:
            int r12 = r8 * r2
            int r12 = r12 / r1
            java.lang.String r13 = "decode top region width: %d, height: %d, scaleheight: %d, rotate: %b"
            r14 = 4
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00fd }
            r15[r6] = r16     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x00fd }
            r15[r5] = r16     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x00fd }
            r17 = 2
            r15[r17] = r16     // Catch:{ IOException -> 0x00fd }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r11)     // Catch:{ IOException -> 0x00fd }
            r18 = 3
            r15[r18] = r16     // Catch:{ IOException -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r15)     // Catch:{ IOException -> 0x00fd }
            if (r12 <= 0) goto L_0x00b6
            if (r9 <= r12) goto L_0x00b6
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ IOException -> 0x00fd }
            r9.<init>()     // Catch:{ IOException -> 0x00fd }
            r9.top = r6     // Catch:{ IOException -> 0x00fd }
            r9.left = r6     // Catch:{ IOException -> 0x00fd }
            if (r11 == 0) goto L_0x00a3
            r9.right = r12     // Catch:{ IOException -> 0x00fd }
            r9.bottom = r8     // Catch:{ IOException -> 0x00fd }
            goto L_0x00a7
        L_0x00a3:
            r9.right = r8     // Catch:{ IOException -> 0x00fd }
            r9.bottom = r12     // Catch:{ IOException -> 0x00fd }
        L_0x00a7:
            java.lang.String r0 = p823sg.C48380r.m53726a(r0, r6)     // Catch:{ IOException -> 0x00fd }
            android.graphics.BitmapRegionDecoder r8 = android.graphics.BitmapRegionDecoder.newInstance(r0, r5)     // Catch:{ IOException -> 0x00fd }
            r7.inJustDecodeBounds = r6     // Catch:{ IOException -> 0x00fd }
            android.graphics.Bitmap r3 = r8.decodeRegion(r9, r7)     // Catch:{ IOException -> 0x00fd }
            goto L_0x00bc
        L_0x00b6:
            r7.inJustDecodeBounds = r6     // Catch:{ IOException -> 0x00fd }
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r0, r7)     // Catch:{ IOException -> 0x00fd }
        L_0x00bc:
            if (r3 == 0) goto L_0x00c5
            if (r11 == 0) goto L_0x00c5
            float r7 = (float) r10     // Catch:{ IOException -> 0x00fd }
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r3, r7)     // Catch:{ IOException -> 0x00fd }
        L_0x00c5:
            if (r3 == 0) goto L_0x00f7
            java.lang.String r7 = "width %d, height %d, tw %d, th %d"
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x00fd }
            int r9 = r3.getWidth()     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x00fd }
            r8[r6] = r9     // Catch:{ IOException -> 0x00fd }
            int r6 = r3.getHeight()     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00fd }
            r8[r5] = r6     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ IOException -> 0x00fd }
            r8[r17] = r1     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)     // Catch:{ IOException -> 0x00fd }
            r8[r18] = r1     // Catch:{ IOException -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r8)     // Catch:{ IOException -> 0x00fd }
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = f269876g     // Catch:{ IOException -> 0x00fd }
            o90.b r1 = (o90.C100301b) r1     // Catch:{ IOException -> 0x00fd }
            r1.put(r0, r3)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0105
        L_0x00f7:
            java.lang.String r0 = "decode bm fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0105
        L_0x00fd:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0105:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer.m118081j(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    /* renamed from: k */
    public static boolean m118082k(String str) {
        if (new C86009m1(str).mo119967g()) {
            return false;
        }
        C76861g.C47263a aVar = (C76861g.C47263a) ((HashMap) f269874e).get(str);
        if (aVar == null) {
            ((HashMap) f269874e).put(str, new C76861g.C47263a());
            return true;
        } else if (aVar.mo72288a() <= 30000) {
            return false;
        } else {
            Log.m105926v("MicroMsg.FavoriteImageServer", "error diff time");
            aVar.mo72289b();
            return true;
        }
    }

    /* renamed from: a */
    public void mo128328a(ImageView imageView, C101834rc0 rc02, C100755z zVar, int i, int i2, int i3) {
        C101756ae0 ae02;
        C64682rk1 rk12;
        ImageView imageView2 = imageView;
        C101834rc0 rc03 = rc02;
        C100755z zVar2 = zVar;
        if (imageView2 != null) {
            if (!C88955f.m111058b()) {
                imageView2.setImageResource(C0966R.C0969drawable.bis);
            } else if (zVar2 == null || rc03 == null) {
                imageView2.setImageDrawable(C76577a.m92158i(this.f269877a, i));
            } else {
                int i4 = rc03.f299258I;
                if (i4 != 4) {
                    boolean z = false;
                    if (i4 != 5) {
                        if (i4 != 7) {
                            if (i4 == 19) {
                                C101841sc0 sc02 = rc03.f299296c1;
                                if (sc02 == null) {
                                    Log.m105929w("MicroMsg.FavoriteImageServer", "app brand: get data proto item null, dataid[%s], infoid[%d, %d]", rc03.f299280T, Long.valueOf(zVar2.field_localId), Integer.valueOf(zVar2.field_id));
                                    return;
                                }
                                C90431pc0 pc02 = sc02.f299420v;
                                if (pc02 != null) {
                                    ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, pc02.f259744g, i, i2, i3);
                                    return;
                                }
                                return;
                            } else if (i4 == 22) {
                                C101841sc0 sc03 = rc03.f299296c1;
                                if (sc03 == null || (rk12 = sc03.f299423y) == null || Util.isNullOrNil((List) rk12.f185190n) || Util.isNullOrNil(rc03.f299296c1.f299423y.f185190n.getFirst().f184828f)) {
                                    imageView2.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_finder_icon, imageView.getContext().getResources().getColor(C0966R.color.f2960ag)));
                                    return;
                                } else {
                                    ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, rc03.f299296c1.f299423y.f185190n.getFirst().f184828f, i, i2, i3);
                                    return;
                                }
                            } else if (i4 != 29) {
                                if (i4 == 10) {
                                    C101841sc0 sc04 = rc03.f299296c1;
                                    if (sc04 == null) {
                                        Log.m105929w("MicroMsg.FavoriteImageServer", "good: get data proto item null, dataid[%s], infoid[%d, %d]", rc03.f299280T, Long.valueOf(zVar2.field_localId), Integer.valueOf(zVar2.field_id));
                                        return;
                                    }
                                    C101793jd0 jd02 = sc04.f299408g;
                                    if (jd02 != null) {
                                        ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, jd02.f298515h, i, i2, i3);
                                        return;
                                    }
                                    return;
                                } else if (i4 == 11) {
                                    C101841sc0 sc05 = rc03.f299296c1;
                                    if (sc05 == null) {
                                        Log.m105929w("MicroMsg.FavoriteImageServer", "product: get data proto item null, dataid[%s], infoid[%d, %d]", rc03.f299280T, Long.valueOf(zVar2.field_localId), Integer.valueOf(zVar2.field_id));
                                        return;
                                    }
                                    C101793jd0 jd03 = sc05.f299408g;
                                    if (jd03 != null) {
                                        ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, jd03.f298515h, i, i2, i3);
                                        return;
                                    }
                                    return;
                                } else if (i4 == 14) {
                                    C101841sc0 sc06 = rc03.f299296c1;
                                    if (sc06 == null) {
                                        Log.m105929w("MicroMsg.FavoriteImageServer", "tv: get data proto item null, dataid[%s], infoid[%d, %d]", rc03.f299280T, Long.valueOf(zVar2.field_localId), Integer.valueOf(zVar2.field_id));
                                        return;
                                    }
                                    C101850ud0 ud02 = sc06.f299409h;
                                    if (ud02 != null) {
                                        ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, ud02.f299622h, i, i2, i3);
                                        return;
                                    }
                                    return;
                                } else if (i4 != 15) {
                                    Log.m105929w("MicroMsg.FavoriteImageServer", "attach thumb, pass type is %d", Integer.valueOf(zVar2.field_type));
                                    return;
                                }
                            }
                        }
                        mo128329b(imageView, rc02, zVar, rc03.f299254G, i, i2, i3);
                        return;
                    }
                    C101841sc0 sc07 = rc03.f299296c1;
                    String str = null;
                    if (sc07 != null) {
                        ae02 = sc07.f299407f;
                        C101755ad0 ad02 = sc07.f299421w;
                        if (ad02 != null && ad02.f297848d == 5) {
                            z = true;
                        }
                    } else {
                        Log.m105929w("MicroMsg.FavoriteImageServer", "webpage: get data proto item null, dataid[%s], infoid[%d, %d]", rc03.f299280T, Long.valueOf(zVar2.field_localId), Integer.valueOf(zVar2.field_id));
                        ae02 = null;
                    }
                    if (ae02 != null) {
                        str = ae02.f297869j;
                    }
                    if (Util.isNullOrNil(str)) {
                        str = rc03.f299254G;
                    }
                    mo128329b(imageView, rc02, zVar, z ? ((C63484s) C86312j.m106911c(C63484s.class)).mo60498zH(str, 4) : str, i, i2, i3);
                    return;
                }
                mo128329b(imageView, rc02, zVar, rc03.f299254G, i, i2, i3);
            }
        }
    }

    /* renamed from: b */
    public String mo128329b(ImageView imageView, C101834rc0 rc02, C100755z zVar, String str, int i, int i2, int i3) {
        String[] strArr;
        C101834rc0 rc03 = rc02;
        Log.m105925i("MicroMsg.FavoriteImageServer", "attachThumb hashCode:%s url:%s", Integer.valueOf(imageView.hashCode()), str);
        String P = C100734q.m131825P(rc03.f299280T);
        if (rc03.f299280T != null) {
            String[] strArr2 = this.f269880d.get(P);
            if (strArr2 == null) {
                strArr2 = new String[]{C100734q.m131826Q(rc02)};
                this.f269880d.put(P, strArr2);
            }
            strArr = strArr2;
        } else {
            strArr = null;
        }
        ((C96880s0) this.f269878b).mo135199a(imageView, strArr, str, i, i2, i3);
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new FavoriteImageServer$$g(strArr[0], zVar, rc02), "FavImageServer");
        return strArr[0];
    }

    /* renamed from: c */
    public void mo128330c(ImageView imageView, C101834rc0 rc02, C100755z zVar, int i, int i2, int i3) {
        C64719t23 t232;
        C101834rc0 rc03 = rc02;
        C100755z zVar2 = zVar;
        Class cls = C63484s.class;
        if (imageView != null) {
            if (!C88955f.m111058b()) {
                imageView.setImageResource(C0966R.C0969drawable.bis);
            } else if (zVar2 != null) {
                int i4 = zVar2.field_type;
                if (i4 != 4) {
                    if (i4 == 5) {
                        C101755ad0 ad02 = zVar2.field_favProto.f298612K;
                        boolean z = ad02 != null && ad02.f297848d == 5;
                        Log.m105927v("MicroMsg.FavoriteImageServer", "alvinluo attachThumb isBizNativeVideo: %b", Boolean.valueOf(z));
                        C101756ae0 ae02 = zVar2.field_favProto.f298622j;
                        if (rc03 != null) {
                            String str = ae02 == null ? null : ae02.f297869j;
                            if (Util.isNullOrNil(str)) {
                                str = rc03.f299254G;
                            }
                            mo128329b(imageView, rc02, zVar, z ? ((C63484s) C86312j.m106911c(cls)).mo60498zH(str, 4) : str, i, i2, i3);
                            return;
                        } else if (ae02 != null) {
                            ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, z ? ((C63484s) C86312j.m106911c(cls)).mo60498zH(ae02.f297869j, 4) : ae02.f297869j, i, i2, i3);
                            return;
                        } else {
                            return;
                        }
                    } else if (i4 == 7 || i4 == 21) {
                        if (rc03 != null) {
                            String b = mo128329b(imageView, rc02, zVar, rc03.f299254G, i, i2, i3);
                            C101841sc0 sc02 = rc03.f299296c1;
                            if (sc02 != null && (t232 = sc02.f299401C) != null) {
                                t232.f185472t = b;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i4 == 10 || i4 == 11) {
                        C101793jd0 jd02 = zVar2.field_favProto.f298634y;
                        if (jd02 != null) {
                            ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, jd02.f298515h, i, i2, i3);
                            return;
                        }
                        return;
                    } else if (i4 == 15) {
                        C101850ud0 ud02 = zVar2.field_favProto.f298604C;
                        if (ud02 != null) {
                            ((C96880s0) this.f269878b).mo135199a(imageView, (String[]) null, ud02.f299622h, i, i2, i3);
                            return;
                        }
                        return;
                    } else if (i4 != 16) {
                        Log.m105929w("MicroMsg.FavoriteImageServer", "attach thumb, pass type is %d", Integer.valueOf(i4));
                        return;
                    }
                }
                if (rc03 != null) {
                    mo128329b(imageView, rc02, zVar, rc03.f299254G, i, i2, i3);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo128331e(ImageView imageView, C101834rc0 rc02, C100755z zVar, int i, int i2, int i3) {
        String str;
        C101834rc0 rc03 = rc02;
        C100755z zVar2 = zVar;
        if (imageView != null) {
            if (!C88955f.m111058b()) {
                imageView.setImageResource(C0966R.C0969drawable.bis);
            } else if (rc03 != null && zVar2 != null && (str = rc03.f299280T) != null) {
                String[] strArr = null;
                if (str != null) {
                    HashMap<String, String[]> hashMap = this.f269879c;
                    if (hashMap != null && !hashMap.isEmpty()) {
                        strArr = this.f269879c.get(str);
                    }
                    if (strArr == null) {
                        strArr = new String[]{C100734q.m131880w(rc02), C100734q.m131826Q(rc02)};
                        HashMap<String, String[]> hashMap2 = this.f269879c;
                        if (hashMap2 != null) {
                            hashMap2.put(str, strArr);
                        }
                    }
                }
                String[] strArr2 = strArr;
                ((C96880s0) this.f269878b).mo135199a(imageView, strArr2, (String) null, i, i2, i3);
                if (strArr2 != null && strArr2.length > 0) {
                    String str2 = strArr2[0];
                    String str3 = strArr2[1];
                    ((C119157j) C119157j.f356862d).mo183876g(new FavoriteImageServer$$c(str2, zVar2, rc02, str3), "FavImageServer");
                }
            }
        }
    }

    /* renamed from: f */
    public void mo128332f() {
        C101611g<String, Bitmap> gVar;
        Log.m105924i("MicroMsg.FavoriteImageServer", "destory");
        C96880s0 s0Var = (C96880s0) this.f269878b;
        synchronized (s0Var.f283851b) {
            Log.m105918d("MicroMsg.ImageEngine", "do clear mark");
            s0Var.f283854e.clear();
            s0Var.f283855f.clear();
            s0Var.f283854e = new HashMap<>();
            s0Var.f283855f = new HashMap<>();
        }
        this.f269879c.clear();
        this.f269880d.clear();
        ((C96880s0) this.f269878b).mo135200b();
        this.f269877a = null;
        this.f269879c = null;
        this.f269880d = null;
        this.f269878b = null;
        if (C38993b.m41993c(C32735h.C32737c.clicfg_fav_destory_recycle_bitmap, BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) && (gVar = f269875f) != null) {
            ((C101062d) gVar).clear();
        }
    }
}

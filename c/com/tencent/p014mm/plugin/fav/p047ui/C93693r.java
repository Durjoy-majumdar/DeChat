package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import com.tencent.p014mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import eb0.C31478i2;
import hd0.C98408n0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import o90.C100301b;
import p206nj.C11171e;
import p682rz.C101491u;
import p823sg.C101611g;
import pb1.C100718j1;
import te3.C101801kd0;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.r */
public class C93693r {

    /* renamed from: a */
    public static C101611g<String, Bitmap> f270490a = new C100301b(20, C93693r.class);

    /* renamed from: b */
    public static Map<String, Integer> f270491b;

    /* renamed from: com.tencent.mm.plugin.fav.ui.r$a */
    public class C93694a implements C75018a.C75024d {
        /* renamed from: a */
        public void mo7429a() {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            favoriteOperationEvent.f264833d.f264835a = 35;
            favoriteOperationEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.r$b */
    public class C93695b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f270492d;

        public C93695b(DialogInterface.OnClickListener onClickListener) {
            this.f270492d = onClickListener;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DialogInterface.OnClickListener onClickListener = this.f270492d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, -1);
            }
        }
    }

    static {
        f270491b = new HashMap();
        HashMap hashMap = new HashMap();
        f270491b = hashMap;
        Integer valueOf = Integer.valueOf(C0966R.raw.app_attach_file_icon_video);
        hashMap.put("avi", valueOf);
        f270491b.put("m4v", valueOf);
        f270491b.put("vob", valueOf);
        f270491b.put("mpeg", valueOf);
        f270491b.put("mpe", valueOf);
        f270491b.put("asx", valueOf);
        f270491b.put("asf", valueOf);
        f270491b.put("f4v", valueOf);
        f270491b.put("flv", valueOf);
        f270491b.put("mkv", valueOf);
        f270491b.put("wmv", valueOf);
        f270491b.put("wm", valueOf);
        f270491b.put("3gp", valueOf);
        f270491b.put("mp4", valueOf);
        f270491b.put("rmvb", valueOf);
        f270491b.put("rm", valueOf);
        f270491b.put("ra", valueOf);
        f270491b.put("ram", valueOf);
        Map<String, Integer> map = f270491b;
        Integer valueOf2 = Integer.valueOf(C0966R.raw.app_attach_file_icon_music);
        map.put("mp3pro", valueOf2);
        f270491b.put("vqf", valueOf2);
        f270491b.put("cd", valueOf2);
        f270491b.put("md", valueOf2);
        f270491b.put("mod", valueOf2);
        f270491b.put("vorbis", valueOf2);
        f270491b.put("au", valueOf2);
        f270491b.put("amr", valueOf2);
        f270491b.put("silk", valueOf2);
        f270491b.put("wma", valueOf2);
        f270491b.put("mmf", valueOf2);
        f270491b.put("mid", valueOf2);
        f270491b.put("midi", valueOf2);
        f270491b.put(FileReaderHelper.MP3_EXT, valueOf2);
        f270491b.put(FileReaderHelper.AAC_EXT, valueOf2);
        f270491b.put("ape", valueOf2);
        f270491b.put("aiff", valueOf2);
        f270491b.put("aif", valueOf2);
        Map<String, Integer> map2 = f270491b;
        Integer valueOf3 = Integer.valueOf(C0966R.raw.app_attach_file_icon_pic);
        map2.put("jfif", valueOf3);
        f270491b.put("tiff", valueOf3);
        f270491b.put("tif", valueOf3);
        f270491b.put("jpe", valueOf3);
        f270491b.put("dib", valueOf3);
        f270491b.put("jpeg", valueOf3);
        f270491b.put("jpg", valueOf3);
        f270491b.put("png", valueOf3);
        f270491b.put("bmp", valueOf3);
        f270491b.put("gif", valueOf3);
        Map<String, Integer> map3 = f270491b;
        Integer valueOf4 = Integer.valueOf(C0966R.raw.app_attach_file_icon_rar);
        map3.put("rar", valueOf4);
        f270491b.put("zip", valueOf4);
        f270491b.put("7z", valueOf4);
        f270491b.put("iso", valueOf4);
        f270491b.put("cab", valueOf4);
        Map<String, Integer> map4 = f270491b;
        Integer valueOf5 = Integer.valueOf(C0966R.raw.app_attach_file_icon_word);
        map4.put(FileReaderHelper.DOC_EXT, valueOf5);
        f270491b.put(FileReaderHelper.DOCX_EXT, valueOf5);
        Map<String, Integer> map5 = f270491b;
        Integer valueOf6 = Integer.valueOf(C0966R.raw.app_attach_file_icon_ppt);
        map5.put(FileReaderHelper.PPT_EXT, valueOf6);
        f270491b.put(FileReaderHelper.PPTX_EXT, valueOf6);
        Map<String, Integer> map6 = f270491b;
        Integer valueOf7 = Integer.valueOf(C0966R.raw.app_attach_file_icon_excel);
        map6.put(FileReaderHelper.XLS_EXT, valueOf7);
        f270491b.put(FileReaderHelper.XLSX_EXT, valueOf7);
        Map<String, Integer> map7 = f270491b;
        Integer valueOf8 = Integer.valueOf(C0966R.raw.app_attach_file_icon_txt);
        map7.put(FileReaderHelper.TXT_EXT, valueOf8);
        f270491b.put("rtf", valueOf8);
        f270491b.put(FileReaderHelper.PDF_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_pdf));
        f270491b.put("ofd", Integer.valueOf(C0966R.raw.app_attach_file_icon_ofd));
        f270491b.put("unknown", Integer.valueOf(C0966R.raw.app_attach_file_icon_unknow));
    }

    /* renamed from: a */
    public static int m118400a(C72963f4 f4Var, DoFavoriteEvent doFavoriteEvent, boolean z) {
        int i;
        C101834rc0 rc02;
        String str;
        String str2;
        C98408n0 Zd;
        int i2;
        DoFavoriteEvent doFavoriteEvent2 = doFavoriteEvent;
        Log.m105925i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type is %d", Integer.valueOf(f4Var.getType()));
        if (z || doFavoriteEvent2.f264674d.f264687l <= 0) {
            DoFavoriteEvent.C92474a aVar = doFavoriteEvent2.f264674d;
            int i3 = aVar.f264678c;
            boolean z2 = (i3 == 4 || i3 == 8 || i3 == 16 || i3 == 2) ? false : true;
            if (i3 == 14 && aVar.f264676a.f298618f.size() > 0 && ((i2 = doFavoriteEvent2.f264674d.f264676a.f298618f.getLast().f299258I) == 4 || i2 == 8 || i2 == 15 || i2 == 2)) {
                z2 = false;
            }
            int i4 = doFavoriteEvent2.f264674d.f264678c;
            boolean z3 = (i4 == 14 || i4 == 18) ? false : true;
            Log.m105925i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type skipCheck %B", Boolean.valueOf(z2));
            if (z2 || f4Var.mo100983V3()) {
                m118407h(doFavoriteEvent2, 0);
                return 0;
            }
            C101801kd0 kd02 = doFavoriteEvent2.f264674d.f264676a;
            if (kd02 == null) {
                m118407h(doFavoriteEvent2, -1);
                return -1;
            } else if (kd02.f298618f == null) {
                m118407h(doFavoriteEvent2, -1);
                return -1;
            } else {
                C72963f4 f4Var2 = f4Var;
                long Kb = ((C31478i2) C86312j.m106911c(C31478i2.class)).mo58193Kb(f4Var);
                Log.m105925i("MicroMsg.FavExportLogic", "favMediOverTime =  %s", Long.valueOf(Kb));
                boolean z4 = System.currentTimeMillis() - f4Var.getCreateTime() > Kb;
                Log.m105925i("MicroMsg.FavExportLogic", "checkMsgLegalInfo isOverThreeDays %B", Boolean.valueOf(z4));
                String str3 = null;
                if (1 <= doFavoriteEvent2.f264674d.f264676a.f298618f.size()) {
                    C101834rc0 last = doFavoriteEvent2.f264674d.f264676a.f298618f.getLast();
                    str = last.f299284V;
                    i = last.f299258I;
                    rc02 = last;
                } else {
                    str = "";
                    rc02 = null;
                    i = 0;
                }
                if (rc02 == null) {
                    Log.m105928w("MicroMsg.FavExportLogic", "dataItem is null, size:" + doFavoriteEvent2.f264674d.f264676a.f298618f.size());
                }
                if (z4) {
                    if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
                        if ((f4Var.getType() == 43 || f4Var.getType() == 44 || f4Var.getType() == 62) && (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2())) != null && Zd.f288576w == -1) {
                            String f = Zd.mo137702f();
                            if (C86013q1.m106450k(f)) {
                                str3 = f;
                            }
                        }
                        if (Util.isNullOrNil(str3)) {
                            m118408i(doFavoriteEvent2, rc02, -4);
                            return -4;
                        }
                        doFavoriteEvent2.f264674d.f264676a.f298618f.getLast().f299284V = str3;
                        str2 = str3;
                    } else {
                        str2 = str;
                    }
                    if (m118405f(f4Var, doFavoriteEvent, str2, true, z3, i)) {
                        m118408i(doFavoriteEvent2, rc02, -5);
                        return -5;
                    }
                    Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  isOverThreeDays true not big not expired");
                } else if (m118405f(f4Var, doFavoriteEvent, str, false, z3, i)) {
                    m118408i(doFavoriteEvent2, rc02, -5);
                    return -5;
                }
                Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  fav data is normal");
                m118408i(doFavoriteEvent2, rc02, 0);
                return 0;
            }
        } else {
            Log.m105924i("MicroMsg.FavExportLogic", "(!result)&&(favoriteEvent.data.errorType > FavExportLogic.KEY_FAV_PARA_NO_ERROR)");
            int i5 = doFavoriteEvent2.f264674d.f264687l;
            m118407h(doFavoriteEvent2, i5);
            return i5;
        }
    }

    /* renamed from: b */
    public static Bitmap m118401b(String str) {
        if (C11171e.m11046c(8)) {
            return BitmapUtil.createVideoThumbnail(str, 1);
        }
        return null;
    }

    /* renamed from: c */
    public static Bitmap m118402c(String str, int i, int i2, boolean z) {
        Bitmap bitmap;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Bitmap bitmap2 = (Bitmap) ((C100301b) f270490a).get(str);
        boolean z2 = true;
        if (bitmap2 != null) {
            Log.m105919d("MicroMsg.FavExportLogic", "get bm from cache %s", str);
            return bitmap2;
        } else if (z || !C86013q1.m106450k(str)) {
            return null;
        } else {
            Log.m105918d("MicroMsg.FavExportLogic", "get from cache fail, try to decode from file");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap d = MMBitmapFactory.m98735d(str, options);
            if (d != null) {
                Log.m105925i("MicroMsg.FavExportLogic", "bitmap recycle %s", d);
                d.recycle();
            }
            boolean z3 = LongBitmapHandler.isLongHorizontal(options.outWidth, options.outHeight) && options.outWidth > 480;
            boolean z4 = LongBitmapHandler.isLongVertical(options.outWidth, options.outHeight) && options.outHeight > 480;
            if (z3 || z4) {
                int i3 = options.outHeight;
                int i4 = options.outWidth;
                while (i4 * i3 > 2764800) {
                    i4 >>= 1;
                    i3 >>= 1;
                }
                Log.m105929w("MicroMsg.FavExportLogic", "fit long picture, beg %d*%d, after %d*%d", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Integer.valueOf(Math.max(1, i4)), Integer.valueOf(Math.max(1, i3)));
            }
            int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
            if (exifOrientation != 90) {
            }
            if (!MMNativeJpeg.IsJpegFile(str) || !MMNativeJpeg.isProgressive(str)) {
                bitmap = BitmapUtil.decodeFileWithSample(str);
            } else {
                bitmap = MMNativeJpeg.decodeAsBitmap(str);
                Object[] objArr = new Object[1];
                if (bitmap != null) {
                    z2 = false;
                }
                objArr[0] = Boolean.valueOf(z2);
                Log.m105925i("MicroMsg.FavExportLogic", "Progressive jpeg, result isNull:%b", objArr);
            }
            if (bitmap == null) {
                Log.m105920e("MicroMsg.FavExportLogic", "getSuitableBmp fail, temBmp is null, filePath = " + str);
                return null;
            }
            Bitmap rotate = BitmapUtil.rotate(bitmap, (float) exifOrientation);
            if (rotate.getByteCount() > 20971520) {
                return rotate;
            }
            ((C100301b) f270490a).put(str, rotate);
            return rotate;
        }
    }

    /* renamed from: d */
    public static int m118403d(String str) {
        Integer num = (Integer) ((HashMap) f270491b).get(str);
        return num == null ? ((Integer) ((HashMap) f270491b).get("unknown")).intValue() : num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r0 != 16) goto L_0x01ad;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m118404e(int r25, int r26, int r27, android.app.Activity r28, androidx.fragment.app.Fragment r29, android.view.View r30, com.tencent.p014mm.p136ui.widget.snackbar.C75018a.C75025e r31, android.content.DialogInterface.OnClickListener r32, com.tencent.p014mm.p136ui.widget.snackbar.C75018a.C75024d r33, boolean r34) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = r29
            r5 = r31
            r6 = r32
            java.lang.Class<pb1.j1> r4 = pb1.C100718j1.class
            if (r2 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001c
            if (r30 != 0) goto L_0x001c
            java.lang.String r0 = "MicroMsg.FavExportLogic"
            java.lang.String r1 = "handleErrorType activity = null && fragment = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x001c:
            if (r33 != 0) goto L_0x0024
            com.tencent.mm.plugin.fav.ui.r$a r7 = new com.tencent.mm.plugin.fav.ui.r$a
            r7.<init>()
            goto L_0x0026
        L_0x0024:
            r7 = r33
        L_0x0026:
            r8 = 2131825710(0x7f11142e, float:1.9284284E38)
            r9 = 2131825616(0x7f1113d0, float:1.9284093E38)
            if (r1 != 0) goto L_0x0086
            if (r34 == 0) goto L_0x028a
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = kg3.C76577a.m92166q(r0, r8)
            if (r3 == 0) goto L_0x0062
            android.view.View r0 = r29.getView()
            boolean r1 = r3 instanceof com.tencent.p014mm.p136ui.MMFragment
            if (r1 == 0) goto L_0x0049
            r0 = r3
            com.tencent.mm.ui.MMFragment r0 = (com.tencent.p014mm.p136ui.MMFragment) r0
            android.view.View r0 = r0.getContentView()
        L_0x0049:
            android.content.Context r1 = r29.getContext()
            java.lang.String r2 = r3.getString(r9)
            r25 = r1
            r26 = r0
            r27 = r4
            r28 = r2
            r29 = r7
            r30 = r31
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89955e(r25, r26, r27, r28, r29, r30)
            goto L_0x028a
        L_0x0062:
            if (r30 == 0) goto L_0x007b
            if (r2 == 0) goto L_0x0068
            r0 = r2
            goto L_0x006c
        L_0x0068:
            android.content.Context r0 = r30.getContext()
        L_0x006c:
            java.lang.String r3 = r0.getString(r9)
            r1 = r30
            r2 = r4
            r4 = r7
            r5 = r31
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89955e(r0, r1, r2, r3, r4, r5)
            goto L_0x028a
        L_0x007b:
            if (r2 == 0) goto L_0x028a
            java.lang.String r0 = r2.getString(r9)
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89954d(r2, r4, r0, r7, r5)
            goto L_0x028a
        L_0x0086:
            if (r2 != 0) goto L_0x008c
            androidx.fragment.app.FragmentActivity r2 = r29.getActivity()
        L_0x008c:
            r10 = r2
            java.lang.String r2 = ""
            r11 = 16
            r12 = 2131824009(0x7f110d89, float:1.9280834E38)
            r13 = 2
            r14 = 4
            switch(r1) {
                case -10: goto L_0x0233;
                case -9: goto L_0x00f5;
                case -8: goto L_0x00f5;
                case -7: goto L_0x00f5;
                case -6: goto L_0x00f5;
                case -5: goto L_0x00f5;
                case -4: goto L_0x00f5;
                case -3: goto L_0x0099;
                case -2: goto L_0x00ba;
                default: goto L_0x0099;
            }
        L_0x0099:
            r3 = 2131825811(0x7f111493, float:1.9284489E38)
            if (r1 != r3) goto L_0x027b
            if (r0 != r13) goto L_0x0246
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r1 = r4.mo128201KU(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 0
            r0[r5] = r1
            java.lang.String r0 = r10.getString(r3, r0)
            goto L_0x0282
        L_0x00ba:
            r0 = 2131825659(0x7f1113fb, float:1.928418E38)
            java.lang.String r0 = r10.getString(r0)
            r1 = 2131825660(0x7f1113fc, float:1.9284182E38)
            java.lang.String r1 = r10.getString(r1)
            r2 = 2131825662(0x7f1113fe, float:1.9284186E38)
            java.lang.String r2 = r10.getString(r2)
            java.lang.String r3 = r10.getString(r12)
            com.tencent.mm.plugin.fav.ui.s r4 = new com.tencent.mm.plugin.fav.ui.s
            r4.<init>(r10, r6)
            com.tencent.mm.plugin.fav.ui.t r5 = new com.tencent.mm.plugin.fav.ui.t
            r5.<init>(r6)
            r6 = 2131101823(0x7f06087f, float:1.7816067E38)
            r25 = r10
            r26 = r0
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            nj3.C76879j.m92708B(r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x028a
        L_0x00f5:
            if (r3 != 0) goto L_0x00f9
            r12 = r10
            goto L_0x00ff
        L_0x00f9:
            androidx.fragment.app.FragmentActivity r16 = r29.getActivity()
            r12 = r16
        L_0x00ff:
            r8 = -4
            r15 = 2131825669(0x7f111405, float:1.92842E38)
            r9 = 14
            if (r1 != r8) goto L_0x0136
            if (r0 == r13) goto L_0x012d
            if (r0 == r14) goto L_0x0124
            r1 = 8
            if (r0 == r1) goto L_0x011b
            if (r0 == r9) goto L_0x0115
            if (r0 == r11) goto L_0x0124
            goto L_0x01ad
        L_0x0115:
            java.lang.String r2 = r12.getString(r15)
            goto L_0x01ad
        L_0x011b:
            r0 = 2131825653(0x7f1113f5, float:1.9284168E38)
            java.lang.String r2 = r12.getString(r0)
            goto L_0x01ad
        L_0x0124:
            r0 = 2131825655(0x7f1113f7, float:1.9284172E38)
            java.lang.String r2 = r12.getString(r0)
            goto L_0x01ad
        L_0x012d:
            r0 = 2131825654(0x7f1113f6, float:1.928417E38)
            java.lang.String r2 = r12.getString(r0)
            goto L_0x01ad
        L_0x0136:
            r2 = -5
            r8 = 2131825668(0x7f111404, float:1.9284199E38)
            if (r1 != r2) goto L_0x0193
            if (r0 == r9) goto L_0x018e
            r1 = 2131825617(0x7f1113d1, float:1.9284095E38)
            if (r0 != r13) goto L_0x015c
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r2 = r4.mo128201KU(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r0[r8] = r2
            java.lang.String r2 = r12.getString(r1, r0)
            goto L_0x01ad
        L_0x015c:
            r2 = 1
            r8 = 0
            if (r0 != r14) goto L_0x0177
            java.lang.Object[] r0 = new java.lang.Object[r2]
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r2 = r4.mo128205RR(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = r12.getString(r1, r0)
            goto L_0x01ad
        L_0x0177:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r2 = r4.mo128211cX(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = r12.getString(r1, r0)
            goto L_0x01ad
        L_0x018e:
            java.lang.String r2 = r12.getString(r8)
            goto L_0x01ad
        L_0x0193:
            r0 = -6
            if (r1 != r0) goto L_0x019b
            java.lang.String r2 = r12.getString(r15)
            goto L_0x01ad
        L_0x019b:
            r0 = -7
            if (r1 != r0) goto L_0x01a3
            java.lang.String r2 = r12.getString(r8)
            goto L_0x01ad
        L_0x01a3:
            r0 = -8
            if (r1 != r0) goto L_0x01b0
            r0 = 2131825670(0x7f111406, float:1.9284203E38)
            java.lang.String r2 = r12.getString(r0)
        L_0x01ad:
            r18 = r2
            goto L_0x0204
        L_0x01b0:
            r0 = -9
            if (r1 != r0) goto L_0x01fb
            if (r3 == 0) goto L_0x01e8
            android.view.View r0 = r29.getView()
            boolean r1 = r3 instanceof com.tencent.p014mm.p136ui.MMFragment
            if (r1 == 0) goto L_0x01c5
            r0 = r3
            com.tencent.mm.ui.MMFragment r0 = (com.tencent.p014mm.p136ui.MMFragment) r0
            android.view.View r0 = r0.getContentView()
        L_0x01c5:
            android.content.Context r1 = r29.getContext()
            r2 = 2131825710(0x7f11142e, float:1.9284284E38)
            java.lang.String r2 = r12.getString(r2)
            r3 = 2131825616(0x7f1113d0, float:1.9284093E38)
            java.lang.String r3 = r12.getString(r3)
            r25 = r1
            r26 = r0
            r27 = r2
            r28 = r3
            r29 = r7
            r30 = r31
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89955e(r25, r26, r27, r28, r29, r30)
            goto L_0x028a
        L_0x01e8:
            r2 = 2131825710(0x7f11142e, float:1.9284284E38)
            r3 = 2131825616(0x7f1113d0, float:1.9284093E38)
            java.lang.String r0 = r12.getString(r2)
            java.lang.String r1 = r12.getString(r3)
            com.tencent.p014mm.p136ui.widget.snackbar.C75026b.m89954d(r10, r0, r1, r7, r5)
            goto L_0x028a
        L_0x01fb:
            r0 = 2131825657(0x7f1113f9, float:1.9284176E38)
            java.lang.String r0 = r12.getString(r0)
            r18 = r0
        L_0x0204:
            r0 = 2131834033(0x7f1134b1, float:1.9301165E38)
            java.lang.String r20 = r12.getString(r0)
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            java.lang.String r21 = r12.getString(r0)
            com.tencent.mm.plugin.fav.ui.u r22 = new com.tencent.mm.plugin.fav.ui.u
            r0 = r22
            r1 = r32
            r2 = r29
            r3 = r7
            r4 = r31
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.fav.ui.v r0 = new com.tencent.mm.plugin.fav.ui.v
            r0.<init>(r6)
            r24 = 2131101823(0x7f06087f, float:1.7816067E38)
            java.lang.String r19 = ""
            r17 = r12
            r23 = r0
            nj3.C76879j.m92708B(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x028a
        L_0x0233:
            if (r3 != 0) goto L_0x0236
            goto L_0x023a
        L_0x0236:
            androidx.fragment.app.FragmentActivity r10 = r29.getActivity()
        L_0x023a:
            r0 = 2131825666(0x7f111402, float:1.9284195E38)
            r1 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r10, (int) r0, (int) r1)
            r0.show()
            goto L_0x028a
        L_0x0246:
            r1 = 1
            r5 = 0
            if (r0 == r14) goto L_0x0264
            if (r0 != r11) goto L_0x024d
            goto L_0x0264
        L_0x024d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r1 = r4.mo128211cX(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r5] = r1
            java.lang.String r0 = r10.getString(r3, r0)
            goto L_0x0282
        L_0x0264:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            di3.d r4 = di3.C86312j.m106911c(r4)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r1 = r4.mo128205RR(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r5] = r1
            java.lang.String r0 = r10.getString(r3, r0)
            goto L_0x0282
        L_0x027b:
            r0 = 2131825810(0x7f111492, float:1.9284487E38)
            java.lang.String r0 = r10.getString(r0)
        L_0x0282:
            com.tencent.mm.plugin.fav.ui.r$b r1 = new com.tencent.mm.plugin.fav.ui.r$b
            r1.<init>(r6)
            nj3.C76879j.m92749t(r10, r0, r2, r1)
        L_0x028a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118404e(int, int, int, android.app.Activity, androidx.fragment.app.Fragment, android.view.View, com.tencent.mm.ui.widget.snackbar.a$e, android.content.DialogInterface$OnClickListener, com.tencent.mm.ui.widget.snackbar.a$d, boolean):void");
    }

    /* renamed from: f */
    public static boolean m118405f(C72963f4 f4Var, DoFavoriteEvent doFavoriteEvent, String str, boolean z, boolean z2, int i) {
        Class cls = C100718j1.class;
        if (!Util.isNullOrNil(str)) {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g()) {
                if (m1Var.mo119980r() > ((C100718j1) C86312j.m106911c(cls)).mo128217zv(z2, i)) {
                    Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
                    return true;
                }
                Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file not big");
            } else if (!z) {
                Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish ！attachFile.exists()");
                doFavoriteEvent.f264674d.f264676a.f298618f.getLast().f299284V = null;
            }
        }
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null) {
            if (((long) u.f195594l) > ((C100718j1) C86312j.m106911c(cls)).mo128217zv(z2, i)) {
                Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
                return true;
            } else if (!Util.isNullOrNil(str) && C86013q1.m106450k(str) && !z) {
                if (((long) u.f195594l) > C86013q1.m106451l(str)) {
                    Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish content.attachlen > datasize");
                    doFavoriteEvent.f264674d.f264676a.f298618f.getLast().f299284V = null;
                }
            }
        }
        if (content != null && u != null) {
            return false;
        }
        Log.m105924i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  (xml == null ) ||(content == null)");
        return false;
    }

    /* renamed from: g */
    public static void m118406g(DoFavoriteEvent doFavoriteEvent, int i) {
        LinkedList<C101834rc0> linkedList = doFavoriteEvent.f264674d.f264676a.f298618f;
        if (linkedList == null || linkedList.size() == 0) {
            doFavoriteEvent.f264674d.f264687l = i;
            return;
        }
        int i2 = doFavoriteEvent.f264674d.f264687l;
        if (i2 != -9) {
            char c = (i > 0 || i2 > 0) ? (char) 1 : 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < doFavoriteEvent.f264674d.f264676a.f298618f.size(); i6++) {
                int i7 = doFavoriteEvent.f264674d.f264676a.f298618f.get(i6).f299322q1;
                if (i7 == 0) {
                    i4++;
                } else if (i7 == 1) {
                    i5++;
                } else if (i7 == 2) {
                    i3++;
                }
            }
            if (c > 0) {
                if (i3 > 0 || i5 > 0) {
                    doFavoriteEvent.f264674d.f264687l = -9;
                } else {
                    doFavoriteEvent.f264674d.f264687l = i;
                }
            } else if (i3 > 0) {
                if (i5 > 0) {
                    doFavoriteEvent.f264674d.f264687l = -8;
                } else if (i4 == 0) {
                    doFavoriteEvent.f264674d.f264687l = -5;
                } else if (i4 > 0) {
                    doFavoriteEvent.f264674d.f264687l = -7;
                }
            } else if (i5 <= 0) {
            } else {
                if (i4 == 0) {
                    doFavoriteEvent.f264674d.f264687l = -4;
                } else if (i4 > 0) {
                    doFavoriteEvent.f264674d.f264687l = -6;
                }
            }
        }
    }

    /* renamed from: h */
    public static int m118407h(DoFavoriteEvent doFavoriteEvent, int i) {
        LinkedList<C101834rc0> linkedList = doFavoriteEvent.f264674d.f264676a.f298618f;
        if (linkedList != null && linkedList.size() > 0) {
            C101834rc0 last = doFavoriteEvent.f264674d.f264676a.f298618f.getLast();
            if (i <= 0) {
                if (i == -5) {
                    last.mo141262r(2);
                    last.f299284V = null;
                } else if (i != -4) {
                    last.mo141262r(0);
                } else {
                    last.mo141262r(1);
                    last.f299284V = null;
                }
            }
        }
        m118406g(doFavoriteEvent, i);
        return i;
    }

    /* renamed from: i */
    public static int m118408i(DoFavoriteEvent doFavoriteEvent, C101834rc0 rc02, int i) {
        if (rc02 == null) {
            m118407h(doFavoriteEvent, i);
            return i;
        }
        if (i <= 0) {
            if (i == -5) {
                rc02.mo141262r(2);
                rc02.f299284V = null;
            } else if (i != -4) {
                rc02.mo141262r(0);
            } else {
                rc02.mo141262r(1);
                rc02.f299284V = null;
            }
        }
        m118406g(doFavoriteEvent, i);
        return i;
    }
}

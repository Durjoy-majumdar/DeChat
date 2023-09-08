package com.tencent.p014mm.plugin.record.p094ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.List;
import o90.C100301b;
import p206nj.C88955f;
import p248ug.C102027b;
import qg2.C101141g0;
import qg2.C101147j0;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101850ud0;
import te3.C64682rk1;
import te3.C64719t23;
import te3.C90431pc0;

/* renamed from: com.tencent.mm.plugin.record.ui.h */
public class C94355h extends C101141g0 implements C94356i.C94359c {
    /* renamed from: a */
    public Bitmap mo129735a(C94356i.C94359c.C94361b bVar) {
        Bitmap bitmap;
        C94356i.C94359c.C94361b bVar2 = bVar;
        C101834rc0 rc02 = bVar2.f272736a;
        long j = bVar2.f272737b;
        boolean z = bVar2.f272739d;
        int i = bVar2.f272738c;
        if (!C88955f.m111058b()) {
            bitmap = MMBitmapFactory.m98736e(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        } else {
            String q = C101147j0.m132636q(rc02, j, 1);
            if (Util.isNullOrNil(q) || !C86013q1.m106450k(q)) {
                Log.m105919d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", Boolean.FALSE, q);
            } else {
                Bitmap bitmap2 = (Bitmap) ((C100301b) this.f296045e).get(q);
                if (bitmap2 != null) {
                    Log.m105919d("MicroMsg.RecordMsgImgService", "get bm from cache %s", q);
                    bitmap = bitmap2;
                } else if (!z) {
                    Log.m105919d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", q);
                    MMBitmapFactory.Options options = new MMBitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Bitmap d = MMBitmapFactory.m98735d(q, options);
                    if (d != null) {
                        Log.m105925i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", d);
                        d.recycle();
                    }
                    int i2 = options.outHeight;
                    int i3 = options.outWidth;
                    Log.m105919d("MicroMsg.RecordMsgImgService", "width: %s, height: %s", Integer.valueOf(i3), Integer.valueOf(i2));
                    if (i3 > i) {
                        i2 = (options.outHeight * i) / options.outWidth;
                        i3 = i;
                    }
                    int max = Math.max(1, i3);
                    int max2 = Math.max(1, i2);
                    if (max > i) {
                        max2 = (options.outHeight * i) / options.outWidth;
                    } else {
                        i = max;
                    }
                    int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(q);
                    if (!(exifOrientation == 90 || exifOrientation == 270)) {
                        int i4 = max2;
                        max2 = i;
                        i = i4;
                    }
                    Bitmap extractThumbNail = BitmapUtil.extractThumbNail(q, i, max2, false);
                    if (extractThumbNail == null) {
                        Log.m105920e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + q);
                    } else {
                        bitmap = BitmapUtil.rotate(extractThumbNail, (float) exifOrientation);
                        ((C100301b) this.f296045e).put(q, bitmap);
                    }
                }
            }
            bitmap = null;
        }
        if (bitmap == null && !z) {
            boolean e = mo140589e(rc02.f299280T, j);
            Log.m105919d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", Boolean.valueOf(e));
            if (e) {
                C101147j0.m132618K(rc02, j, e);
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public Bitmap mo129736b(C94356i.C94359c.C94362c cVar) {
        return mo140592h(cVar.f272740a, cVar.f272741b);
    }

    /* renamed from: c */
    public void mo129737c(C94356i.C94359c.C94360a aVar) {
        C101756ae0 ae02;
        C64719t23 t232;
        C90431pc0 pc02;
        C64682rk1 rk12;
        ImageView imageView = aVar.f272730a;
        C101834rc0 rc02 = aVar.f272731b;
        long j = aVar.f272732c;
        int i = aVar.f272733d;
        int i2 = aVar.f272734e;
        int i3 = aVar.f272735f;
        if (imageView != null) {
            if (!C88955f.m111058b()) {
                imageView.setImageResource(C0966R.C0969drawable.bis);
            } else if (rc02 == null) {
                imageView.setImageResource(i);
            } else {
                int i4 = rc02.f299258I;
                if (i4 != 4) {
                    String str = null;
                    boolean z = false;
                    if (i4 != 5) {
                        if (i4 != 7) {
                            if (i4 == 19) {
                                C101841sc0 sc02 = rc02.f299296c1;
                                if (sc02 != null) {
                                    pc02 = sc02.f299420v;
                                } else {
                                    Log.m105929w("MicroMsg.RecordMsgImgService", "appbrand: get data proto item null, dataid[%s]", rc02.f299280T);
                                    pc02 = null;
                                }
                                if (pc02 != null) {
                                    str = pc02.f259744g;
                                }
                                if (Util.isNullOrNil(str)) {
                                    str = rc02.f299254G;
                                }
                                mo140593i(imageView, rc02, j, str, i, i2, i3);
                                return;
                            } else if (i4 == 22) {
                                C101841sc0 sc03 = rc02.f299296c1;
                                if (sc03 == null || (rk12 = sc03.f299423y) == null || Util.isNullOrNil((List) rk12.f185190n) || Util.isNullOrNil(rc02.f299296c1.f299423y.f185190n.getFirst().f184828f)) {
                                    imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_finder_icon, imageView.getContext().getResources().getColor(C0966R.color.f2960ag)));
                                    return;
                                } else {
                                    this.f296041a.mo135199a(imageView, (String[]) null, rc02.f299296c1.f299423y.f185190n.getFirst().f184828f, i, i2, i3);
                                    return;
                                }
                            } else if (i4 != 29) {
                                if (i4 == 10) {
                                    C101841sc0 sc04 = rc02.f299296c1;
                                    if (sc04 == null) {
                                        Log.m105929w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", rc02.f299280T);
                                        return;
                                    }
                                    C101793jd0 jd02 = sc04.f299408g;
                                    if (jd02 != null) {
                                        this.f296041a.mo135199a(imageView, (String[]) null, jd02.f298515h, i, i2, i3);
                                        return;
                                    }
                                    return;
                                } else if (i4 == 11) {
                                    C101841sc0 sc05 = rc02.f299296c1;
                                    if (sc05 == null) {
                                        Log.m105929w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", rc02.f299280T);
                                        return;
                                    }
                                    C101793jd0 jd03 = sc05.f299408g;
                                    if (jd03 != null) {
                                        this.f296041a.mo135199a(imageView, (String[]) null, jd03.f298515h, i, i2, i3);
                                        return;
                                    }
                                    return;
                                } else if (i4 == 14) {
                                    C101841sc0 sc06 = rc02.f299296c1;
                                    if (sc06 == null) {
                                        Log.m105929w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", rc02.f299280T);
                                        return;
                                    }
                                    C101850ud0 ud02 = sc06.f299409h;
                                    if (ud02 != null) {
                                        this.f296041a.mo135199a(imageView, (String[]) null, ud02.f299622h, i, i2, i3);
                                        return;
                                    }
                                    return;
                                } else if (i4 != 15) {
                                    Log.m105929w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", Integer.valueOf(i4));
                                    return;
                                }
                            }
                        }
                        String i5 = mo140593i(imageView, rc02, j, rc02.f299254G, i, i2, i3);
                        C101841sc0 sc07 = rc02.f299296c1;
                        if (sc07 != null && (t232 = sc07.f299401C) != null) {
                            t232.f185472t = i5;
                            return;
                        }
                        return;
                    }
                    C101841sc0 sc08 = rc02.f299296c1;
                    if (sc08 != null) {
                        ae02 = sc08.f299407f;
                        C101755ad0 ad02 = sc08.f299421w;
                        if (ad02 != null && ad02.f297848d == 5) {
                            z = true;
                        }
                    } else {
                        Log.m105929w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", rc02.f299280T);
                        ae02 = null;
                    }
                    if (ae02 != null) {
                        str = ae02.f297869j;
                    }
                    if (Util.isNullOrNil(str)) {
                        str = rc02.f299254G;
                    }
                    if (z) {
                        str = C102027b.m134386a(str, 4, true);
                    }
                    mo140593i(imageView, rc02, j, str, i, i2, i3);
                    return;
                }
                mo140593i(imageView, rc02, j, rc02.f299254G, i, i2, i3);
            }
        }
    }

    /* renamed from: d */
    public void mo129738d() {
        mo140590f();
    }
}

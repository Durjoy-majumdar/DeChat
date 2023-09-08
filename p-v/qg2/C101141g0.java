package qg2;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96880s0;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LongBitmapHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashMap;
import java.util.HashSet;
import o90.C100301b;
import p206nj.C76861g;
import p206nj.C88955f;
import p823sg.C101611g;
import sf0.C101592a0;
import te3.C101834rc0;

/* renamed from: qg2.g0 */
public class C101141g0 {

    /* renamed from: a */
    public C96880s0 f296041a = new C101142a(this, 24);

    /* renamed from: b */
    public HashMap<String, String[]> f296042b = new HashMap<>();

    /* renamed from: c */
    public HashSet<String> f296043c = new HashSet<>();

    /* renamed from: d */
    public HashMap<String, C76861g.C47263a> f296044d = new HashMap<>();

    /* renamed from: e */
    public C101611g<String, Bitmap> f296045e = new C100301b(10, getClass());

    /* renamed from: qg2.g0$a */
    public class C101142a extends C96880s0 {
        public C101142a(C101141g0 g0Var, int i) {
            super(i);
        }

        /* renamed from: d */
        public C101592a0 mo135201d(String str, String str2, int i, int i2) {
            return new C77333m0(str, str2, i, i2);
        }
    }

    /* renamed from: e */
    public final boolean mo140589e(String str, long j) {
        String v = C101147j0.m132641v(str, j, true);
        C76861g.C47263a aVar = this.f296044d.get(v);
        if (aVar == null) {
            this.f296044d.put(v, new C76861g.C47263a());
            return true;
        } else if (aVar.mo72288a() <= 30000) {
            return false;
        } else {
            aVar.mo72289b();
            return true;
        }
    }

    /* renamed from: f */
    public void mo140590f() {
        this.f296041a.mo135200b();
        this.f296042b.clear();
        this.f296043c.clear();
        this.f296041a = null;
        this.f296042b = null;
        this.f296043c = null;
    }

    /* renamed from: g */
    public final Bitmap mo140591g(C101834rc0 rc02, long j, boolean z, boolean z2) {
        int i;
        if (!C88955f.m111058b()) {
            return MMBitmapFactory.m98736e(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        }
        boolean z3 = true;
        String D = z ? C101147j0.m132611D(rc02, j, 1) : C101147j0.m132636q(rc02, j, 1);
        if (Util.isNullOrNil(D) || !C86013q1.m106450k(D)) {
            Log.m105919d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", Boolean.valueOf(z), D);
            return null;
        }
        Bitmap bitmap = (Bitmap) ((C100301b) this.f296045e).get(D);
        if (bitmap != null) {
            return bitmap;
        }
        if (z2) {
            return null;
        }
        Log.m105919d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", D);
        MMBitmapFactory.Options options = new MMBitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap d = MMBitmapFactory.m98735d(D, options);
        if (d != null) {
            Log.m105925i("MicroMsg.RecordMsgImgService", "bitmap recycled %s", d);
            d.recycle();
        }
        boolean z4 = LongBitmapHandler.isLongHorizontal(options.outWidth, options.outHeight) && options.outWidth > 480;
        if (!LongBitmapHandler.isLongVertical(options.outWidth, options.outHeight) || options.outHeight <= 480) {
            z3 = false;
        }
        int i2 = 960;
        if (z4 || z3) {
            int i3 = options.outHeight;
            i2 = options.outWidth;
            i = i3;
        } else {
            i = 960;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(D);
        if (!(exifOrientation == 90 || exifOrientation == 270)) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        Bitmap extractThumbNail = BitmapUtil.extractThumbNail(D, i2, i, false);
        if (extractThumbNail == null) {
            Log.m105920e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + D);
            return null;
        }
        Bitmap rotate = BitmapUtil.rotate(extractThumbNail, (float) exifOrientation);
        ((C100301b) this.f296045e).put(D, rotate);
        return rotate;
    }

    /* renamed from: h */
    public Bitmap mo140592h(C101834rc0 rc02, long j) {
        Bitmap g = mo140591g(rc02, j, true, false);
        if (g == null) {
            boolean e = mo140589e(C101147j0.m132610C(rc02.f299280T), j);
            Log.m105919d("MicroMsg.RecordMsgImgService", "get thumb fail, try download, can retry:%B", Boolean.valueOf(e));
            if (e) {
                C101147j0.m132619L(rc02, j, e);
            }
        }
        return g;
    }

    /* renamed from: i */
    public final String mo140593i(ImageView imageView, C101834rc0 rc02, long j, String str, int i, int i2, int i3) {
        C101834rc0 rc03 = rc02;
        long j2 = j;
        String str2 = C101147j0.m132610C(rc03.f299280T) + "@" + String.valueOf(j);
        if (rc03.f299280T == null) {
            return null;
        }
        String[] strArr = this.f296042b.get(str2);
        if (strArr == null || strArr.length <= 0) {
            String[] strArr2 = {C101147j0.m132611D(rc03, j2, 1)};
            this.f296042b.put(str2, strArr2);
            strArr = strArr2;
        }
        this.f296041a.mo135199a(imageView, strArr, str, i, i2, i3);
        if (this.f296043c.contains(str2)) {
            return strArr[0];
        }
        this.f296043c.add(str2);
        Uri n = C116299g2.m163858n(strArr[0]);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) && (!Util.isNullOrNil(rc03.f299305h) || !Util.isNullOrNil(rc03.f299334w1))) {
            C101147j0.m132619L(rc03, j2, mo140589e(rc03.f299280T, j2));
        }
        return strArr[0];
    }
}

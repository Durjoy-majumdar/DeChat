package w52;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92806b;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import f12.C7970a;
import p823sg.C90193h;
import zh3.C91753f;

/* renamed from: w52.e */
public class C78518e extends MStorage {

    /* renamed from: e */
    public static final String[] f229994e = {"CREATE TABLE IF NOT EXISTS massendinfo ( clientid text  PRIMARY KEY , status int  , createtime long  , lastmodifytime long  , filename text  , thumbfilename text  , tolist text  , tolistcount int  , msgtype int  , mediatime int  , datanetoffset int  , datalen int  , thumbnetoffset int  , thumbtotallen int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  massendinfostatus_index ON massendinfo ( status )"};

    /* renamed from: d */
    public C91753f f229995d;

    public C78518e(C91753f fVar) {
        this.f229995d = fVar;
    }

    /* renamed from: Lo */
    public C78517d mo108476Lo(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   where massendinfo.clientid = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        C78517d dVar = null;
        Cursor rawQuery = this.f229995d.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            dVar = new C78517d();
            dVar.mo108462a(rawQuery);
        }
        rawQuery.close();
        return dVar;
    }

    /* renamed from: jo */
    public C78517d mo108477jo(String str, String str2, int i, int i2) {
        String str3 = str;
        if (!C86013q1.m106450k(str)) {
            return null;
        }
        C97625j3.m125812b().getClass();
        String a = C7970a.m8127a();
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(str);
        String f = C90193h.m112878f((str3 + System.currentTimeMillis()).getBytes());
        Log.m105918d("MicroMsg.MasSendInfoStorage", "insert : original img path = " + str3);
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
        if (i2 != 0 || (C86013q1.m106451l(str) <= ((long) C92806b.m116988b()) && (imageOptions == null || (imageOptions.outHeight <= 960 && imageOptions.outWidth <= 960)))) {
            C86013q1.m106440a(a + f + ".jpg", C86013q1.m106433O(str3, 0, -1));
        } else {
            if (!BitmapUtil.createThumbNail(str, 960, 960, Bitmap.CompressFormat.JPEG, 70, a, f)) {
                return null;
            }
            C86013q1.m106435Q(a, f, f + ".jpg");
        }
        String str4 = f + ".jpg";
        Log.m105918d("MicroMsg.MasSendInfoStorage", "insert: compressed bigImgPath = " + str4);
        if (i2 == 0 && exifOrientation != 0) {
            if (!BitmapUtil.rotate(a + str4, exifOrientation, Bitmap.CompressFormat.JPEG, 90, a, f + ".jpg")) {
                return null;
            }
        }
        String f2 = C90193h.m112878f((str4 + System.currentTimeMillis()).getBytes());
        if (!BitmapUtil.createThumbNail(a + str4, 120, 120, Bitmap.CompressFormat.JPEG, 90, a, f2)) {
            return null;
        }
        Log.m105918d("MicroMsg.MasSendInfoStorage", "insert: thumbName = " + f2);
        C78517d dVar = new C78517d();
        dVar.f229983i = 3;
        dVar.f229981g = str2;
        dVar.f229982h = i;
        dVar.f229980f = f2;
        dVar.f229979e = str4;
        return dVar;
    }

    /* renamed from: qq */
    public String mo108478qq(C78517d dVar) {
        int i = dVar.f229983i;
        return i != 1 ? i != 3 ? i != 34 ? i != 43 ? MMApplicationContext.getContext().getResources().getString(C0966R.string.bnz) : MMApplicationContext.getContext().getResources().getString(C0966R.string.f360103a43) : MMApplicationContext.getContext().getResources().getString(C0966R.string.a47) : MMApplicationContext.getContext().getResources().getString(C0966R.string.a1p) : dVar.mo108464c();
    }
}

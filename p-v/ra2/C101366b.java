package ra2;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ma2.C61453s;
import ma2.C99812l0;
import o90.C100308d;
import org.json.JSONObject;
import p749xh.C102658n6;
import p823sg.C101611g;
import q90.C101062d;
import qc0.C101106m;
import za2.C102984b;
import za2.C102987e;

/* renamed from: ra2.b */
public class C101366b extends MAutoStorage<C101365a> {

    /* renamed from: d */
    public C101611g<String, C101365a> f296942d = new C100308d(20);

    /* renamed from: e */
    public ISQLiteDatabase f296943e;

    /* renamed from: f */
    public C101611g<String, C61453s> f296944f = new C100308d(10);

    public C101366b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C101365a.f296935H1, "Music", (String[]) null);
        this.f296943e = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final C61453s mo140851Lo(C102658n6 n6Var, boolean z, boolean z2) {
        C61453s f = C61453s.m72164f(n6Var.field_songLyric, MMApplicationContext.getContext().getString(C0966R.string.h3z), n6Var.field_songSnsShareUser, C99812l0.m130303h(n6Var), n6Var.field_songSinger, z, z2);
        ((C101062d) this.f296944f).put(n6Var.field_musicId, f);
        return f;
    }

    /* renamed from: Ow */
    public C101365a mo140852Ow(String str, int i, int i2) {
        Log.m105925i("MicroMsg.Music.MusicStorage", "updateMusicWithColor %s %d %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        C101365a jo = mo140855jo(str);
        if (jo == null) {
            Log.m105921e("MicroMsg.Music.MusicStorage", "updateMusicWithColor can not find music %s", str);
            return null;
        }
        jo.field_songBgColor = i;
        jo.field_songLyricColor = i2;
        update(jo, "songBgColor", "songLyricColor");
        ((C101062d) this.f296942d).put(str, jo);
        return jo;
    }

    /* renamed from: Yt */
    public C101365a mo140853Yt(C101106m mVar) {
        boolean z;
        String a = C102984b.m136164a(mVar);
        C101365a jo = mo140855jo(a);
        if (jo == null) {
            jo = new C101365a();
            z = false;
        } else {
            z = true;
        }
        jo.field_musicId = a;
        jo.field_originMusicId = mVar.f295960e;
        jo.field_musicType = mVar.f295959d;
        String str = mVar.f295972t;
        jo.field_appId = str;
        if (Util.isNullOrNil(str)) {
            jo.field_appId = C99812l0.m130299d(mVar);
        }
        jo.field_songAlbum = mVar.f295964i;
        jo.field_songAlbumType = mVar.f295973u;
        jo.field_songWifiUrl = mVar.f295966n;
        jo.field_songName = mVar.f295962g;
        jo.field_songSinger = mVar.f295963h;
        jo.field_songWapLinkUrl = mVar.f295967o;
        jo.field_songWebUrl = mVar.f295968p;
        jo.field_songAlbumLocalPath = mVar.f295970r;
        jo.field_songMediaId = mVar.f295975w;
        jo.field_songSnsAlbumUser = mVar.f295977y;
        jo.field_songAlbumUrl = mVar.f295965j;
        if (TextUtils.isEmpty(jo.field_songLyric) && !TextUtils.isEmpty(mVar.f295969q)) {
            jo.field_songLyric = mVar.f295969q;
        }
        jo.field_songSnsShareUser = mVar.f295978z;
        if (TextUtils.isEmpty(jo.field_songHAlbumUrl) && !Util.isNullOrNil(mVar.f295976x)) {
            jo.field_songHAlbumUrl = mVar.f295976x;
        }
        jo.field_updateTime = System.currentTimeMillis();
        if (jo.field_songId == 0) {
            String[] strArr = C102987e.f303915a;
            int e = C102987e.m136177e(mVar.f295966n);
            mVar.f295974v = e;
            if (e <= 0) {
                int e2 = C102987e.m136177e(mVar.f295968p);
                mVar.f295974v = e2;
                if (e2 <= 0) {
                    mVar.f295974v = C102987e.m136177e(mVar.f295967o);
                }
            }
            if (C102987e.m136175c(mVar) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                String c = C102987e.m136175c(mVar);
                if (c != null) {
                    Log.m105919d("MicroMsg.Music.MusicUrlUtil", "bcdUrl: %s", c);
                    String str2 = new String(C102987e.m136183k(c));
                    int indexOf = str2.indexOf("{");
                    if (indexOf != -1) {
                        str2 = str2.substring(indexOf);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        mVar.f295974v = jSONObject.optInt("song_ID");
                        if (Util.isNullOrNil(mVar.f295962g)) {
                            mVar.f295962g = jSONObject.optString("song_Name");
                        }
                        if (Util.isNullOrNil(mVar.f295967o)) {
                            mVar.f295967o = jSONObject.optString("song_WapLiveURL");
                        }
                        if (Util.isNullOrNil(mVar.f295966n)) {
                            mVar.f295966n = jSONObject.optString("song_WifiURL");
                        }
                        if (Util.isNullOrNil(mVar.f295964i)) {
                            mVar.f295964i = jSONObject.optString("song_Album");
                        }
                        if (Util.isNullOrNil(mVar.f295963h)) {
                            mVar.f295963h = jSONObject.optString("song_Singer");
                        }
                    } catch (Exception e3) {
                        Log.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", e3, "", new Object[0]);
                    }
                    if (mVar.f295974v == 0) {
                        mVar.f295974v = C102987e.m136177e(C102987e.f303916b);
                    }
                    Log.m105925i("MicroMsg.Music.MusicUrlUtil", "parseBCDForMusicWrapper %s: expend: %d %d", mVar.f295960e, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(mVar.f295974v));
                }
            }
            jo.field_songId = mVar.f295974v;
        }
        if (jo.field_songMId == null) {
            jo.field_songMId = C102987e.m136179g(C102987e.m136180h(mVar));
        }
        if ((Util.isNullOrNil(jo.field_songWapLinkUrl) || jo.field_songWapLinkUrl.equals(jo.field_songWebUrl)) && !Util.isNullOrNil(jo.field_songWifiUrl)) {
            jo.field_songWapLinkUrl = jo.field_songWifiUrl;
        }
        if (jo.field_songId == 0 && mVar.f295959d == 4) {
            try {
                jo.field_songId = Integer.valueOf(mVar.f295960e).intValue();
            } catch (Exception unused) {
            }
        }
        jo.field_hideBanner = mVar.f295941B;
        jo.field_jsWebUrlDomain = mVar.f295942C;
        jo.field_startTime = mVar.f295943D;
        jo.f296936B1 = mVar.f295944E;
        jo.field_protocol = mVar.f295945F;
        jo.field_barBackToWebView = mVar.f295946G;
        jo.field_musicbar_url = mVar.f295947H;
        jo.field_srcUsername = mVar.f295948I;
        jo.field_playbackRate = mVar.f295950K;
        jo.f296938D1 = mVar.f295956R;
        jo.f296939E1 = mVar.f295958T;
        jo.f296940F1 = mVar.f295952M;
        jo.f296941G1 = mVar.f295953N;
        jo.field_mid = mVar.f295954P;
        if (z) {
            Log.m105925i("MicroMsg.Music.MusicStorage", "update music %s", a);
            update(jo, new String[0]);
        } else {
            Log.m105925i("MicroMsg.Music.MusicStorage", "insert music %s", a);
            insert(jo);
        }
        ((C101062d) this.f296942d).put(a, jo);
        return jo;
    }

    /* renamed from: bD */
    public C101365a mo140854bD(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C101365a jo = mo140855jo(str);
        if (jo == null) {
            Log.m105921e("MicroMsg.Music.MusicStorage", "updateMusicWithLyricResponse can not find music %s", str);
            return null;
        }
        if (!Util.isNullOrNil(str2)) {
            jo.field_songAlbumUrl = str2;
        }
        jo.field_songHAlbumUrl = str3;
        if (!TextUtils.isEmpty(str4)) {
            jo.field_songLyric = str4;
        }
        update(jo, "songAlbumUrl", "songHAlbumUrl", "songLyric");
        ((C101062d) this.f296942d).put(str, jo);
        mo140851Lo(jo, z, z2);
        return jo;
    }

    /* renamed from: jo */
    public C101365a mo140855jo(String str) {
        if (((C101062d) this.f296942d).get(str) != null) {
            return (C101365a) ((C101062d) this.f296942d).get(str);
        }
        String format = String.format("Select * From Music Where musicId=?", new Object[0]);
        Cursor rawQuery = this.f296943e.rawQuery(format, new String[]{str}, 2);
        if (rawQuery != null && rawQuery.moveToFirst()) {
            C101365a aVar = new C101365a();
            aVar.convertFrom(rawQuery);
            rawQuery.close();
            ((C101062d) this.f296942d).put(str, aVar);
            return aVar;
        } else if (rawQuery == null) {
            return null;
        } else {
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: qq */
    public void mo140856qq(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("isBlock", Integer.valueOf(z ? 1 : 0));
        this.f296943e.update("Music", contentValues, "musicId=?", new String[]{str});
        C101365a aVar = (C101365a) ((C101062d) this.f296942d).get(str);
        if (aVar != null) {
            aVar.field_isBlock = z;
        }
    }
}

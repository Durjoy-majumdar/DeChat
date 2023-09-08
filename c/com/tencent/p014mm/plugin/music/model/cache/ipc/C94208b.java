package com.tencent.p014mm.plugin.music.model.cache.ipc;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import la2.C99364n;
import ma2.C99814o0;
import q90.C101062d;
import qc0.C101106m;
import qc0.C101108q;
import ra2.C36277c;
import ra2.C36278d;
import za2.C102984b;

/* renamed from: com.tencent.mm.plugin.music.model.cache.ipc.b */
public class C94208b {
    /* renamed from: a */
    public static String m119124a(String str) {
        C101106m E = C99364n.m129618m().mo138771E();
        if (E != null && str.equalsIgnoreCase(E.f295960e)) {
            return C102984b.m136164a(E);
        }
        return "0_" + MD5Util.getMD5String(str);
    }

    /* renamed from: b */
    public static void m119125b(String str) {
        C36278d xx02 = C99814o0.xx0();
        Log.m105925i("MicroMsg.Music.PieceMusicInfoStorage", "deletePieceMusicInfo raw=%d musicId=%s", Integer.valueOf(xx02.f96595e.delete("PieceMusicInfo", "musicId=?", new String[]{str})), str);
        ((C101062d) xx02.f96594d).remove(str);
    }

    /* renamed from: c */
    public static String m119126c(String str) {
        C36277c jo = C99814o0.xx0().mo60600jo(str);
        if (jo == null) {
            Log.m105920e("MicroMsg.Music.MusicDataSourceMainProcessImp", "getMusicMIMETypeByMusicId pMusic is null!'");
            return null;
        }
        Log.m105925i("MicroMsg.Music.MusicDataSourceMainProcessImp", "music field_pieceFileMIMEType:%s", jo.field_pieceFileMIMEType);
        if (!TextUtils.isEmpty(jo.field_pieceFileMIMEType)) {
            return jo.field_pieceFileMIMEType;
        }
        Log.m105920e("MicroMsg.Music.MusicDataSourceMainProcessImp", "field_pieceFileMIMEType is null!'");
        return null;
    }

    /* renamed from: d */
    public static C101108q m119127d(String str) {
        C36277c jo = C99814o0.xx0().mo60600jo(str);
        if (jo == null) {
            Log.m105920e("MicroMsg.Music.MusicDataSourceMainProcessImp", "initData pMusic is null!'");
            return null;
        }
        C101108q qVar = new C101108q();
        qVar.f295979a = jo.field_musicId;
        qVar.f295980b = jo.field_musicUrl;
        qVar.f295981c = jo.field_fileName;
        qVar.f295983e = jo.field_fileCacheComplete;
        qVar.f295984f = jo.field_pieceFileMIMEType;
        qVar.f295982d = jo.field_indexBitData;
        qVar.f295985g = jo.field_removeDirtyBit;
        return qVar;
    }

    /* renamed from: e */
    public static void m119128e(String str, String str2) {
        C36277c jo = C99814o0.xx0().mo60600jo(str);
        if (jo == null) {
            Log.m105920e("MicroMsg.Music.MusicDataSourceMainProcessImp", "setMusicMIMETypeByMusicId pMusic is null!'");
        } else if (TextUtils.isEmpty(jo.field_pieceFileMIMEType) || !jo.field_pieceFileMIMEType.equals(str2)) {
            Log.m105924i("MicroMsg.Music.MusicDataSourceMainProcessImp", "updatePieceFileMIMEType()");
            C36278d xx02 = C99814o0.xx0();
            xx02.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("pieceFileMIMEType", str2);
            Log.m105925i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceFileMIMEType raw=%d musicId=%s", Integer.valueOf(xx02.f96595e.update("PieceMusicInfo", contentValues, "musicId=?", new String[]{str})), str);
            C36277c cVar = (C36277c) ((C101062d) xx02.f96594d).get(str);
            if (cVar != null) {
                cVar.field_pieceFileMIMEType = str2;
            }
        } else {
            Log.m105920e("MicroMsg.Music.MusicDataSourceMainProcessImp", "don't need update the piece file mime type");
        }
    }

    /* renamed from: f */
    public static void m119129f(String str, int i) {
        C36278d xx02 = C99814o0.xx0();
        xx02.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fileCacheComplete", Integer.valueOf(i));
        if (i == 1) {
            contentValues.put("removeDirtyBit", 1);
        }
        Log.m105925i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileCacheComplete raw=%d musicId=%s fileCacheComplete=%d", Integer.valueOf(xx02.f96595e.update("PieceMusicInfo", contentValues, "musicId=?", new String[]{str})), str, Integer.valueOf(i));
        C36277c cVar = (C36277c) ((C101062d) xx02.f96594d).get(str);
        if (cVar != null) {
            cVar.field_fileCacheComplete = i;
            if (i == 1) {
                cVar.field_removeDirtyBit = 1;
            }
        }
    }

    /* renamed from: g */
    public static void m119130g(String str, byte[] bArr) {
        C36278d xx02 = C99814o0.xx0();
        xx02.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("indexBitData", bArr);
        int update = xx02.f96595e.update("PieceMusicInfo", contentValues, "musicId=?", new String[]{str});
        if (update <= 0) {
            Log.m105925i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileIndexBitCache raw=%d musicId=%s", Integer.valueOf(update), str);
        }
        C36277c cVar = (C36277c) ((C101062d) xx02.f96594d).get(str);
        if (cVar != null) {
            cVar.field_indexBitData = bArr;
        }
    }

    /* renamed from: h */
    public static String m119131h(String str) {
        C36277c cVar;
        boolean z;
        C36278d xx02 = C99814o0.xx0();
        xx02.getClass();
        if (TextUtils.isEmpty(str)) {
            Log.m105924i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl url is empty!");
            cVar = null;
        } else {
            String b = C102984b.m136165b(str);
            cVar = xx02.mo60600jo(b);
            if (cVar == null) {
                cVar = new C36277c();
                z = false;
            } else {
                z = true;
            }
            cVar.field_musicId = b;
            cVar.field_musicUrl = str;
            String e = C102984b.m136168e(str);
            cVar.field_fileName = e;
            Log.m105925i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl musicId:%s, field_fileName:%s", b, e);
            if (z) {
                Log.m105924i("MicroMsg.Music.PieceMusicInfoStorage", "update PieceMusicInfo");
                xx02.update(cVar, new String[0]);
            } else {
                Log.m105924i("MicroMsg.Music.PieceMusicInfoStorage", "insert PieceMusicInfo");
                xx02.insert(cVar);
            }
            ((C101062d) xx02.f96594d).put(b, cVar);
        }
        if (cVar != null) {
            return cVar.field_musicId;
        }
        return null;
    }
}

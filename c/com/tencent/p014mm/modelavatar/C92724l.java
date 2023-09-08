package com.tencent.p014mm.modelavatar;

import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import zh3.C91753f;

/* renamed from: com.tencent.mm.modelavatar.l */
public class C92724l extends MStorage {

    /* renamed from: e */
    public static final String[] f266855e = {"CREATE TABLE IF NOT EXISTS hdheadimginfo ( username text  PRIMARY KEY , imgwidth int  , imgheigth int  , imgformat text  , totallen int  , startpos int  , headimgtype int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) "};

    /* renamed from: d */
    public C91753f f266856d;

    public C92724l(C91753f fVar) {
        this.f266856d = fVar;
    }

    /* renamed from: jo */
    public C92723k mo126947jo(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select hdheadimginfo.username,hdheadimginfo.imgwidth,hdheadimginfo.imgheigth,hdheadimginfo.imgformat,hdheadimginfo.totallen,hdheadimginfo.startpos,hdheadimginfo.headimgtype,hdheadimginfo.reserved1,hdheadimginfo.reserved2,hdheadimginfo.reserved3,hdheadimginfo.reserved4 from hdheadimginfo   where hdheadimginfo.username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        C92723k kVar = null;
        Cursor rawQuery = this.f266856d.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            kVar = new C92723k();
            kVar.f266843a = rawQuery.getString(0);
            kVar.f266844b = rawQuery.getInt(1);
            kVar.f266845c = rawQuery.getInt(2);
            kVar.f266846d = rawQuery.getString(3);
            kVar.f266847e = rawQuery.getInt(4);
            kVar.f266848f = rawQuery.getInt(5);
            kVar.f266849g = rawQuery.getInt(6);
            kVar.f266850h = rawQuery.getString(7);
            kVar.f266851i = rawQuery.getString(8);
            kVar.f266852j = rawQuery.getInt(9);
            kVar.f266853k = rawQuery.getInt(10);
        }
        rawQuery.close();
        return kVar;
    }
}

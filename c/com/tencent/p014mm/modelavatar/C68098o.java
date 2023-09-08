package com.tencent.p014mm.modelavatar;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import java.util.List;
import junit.framework.Assert;
import o90.C100308d;
import p196ln.C10581n;
import p823sg.C101611g;
import q90.C101062d;
import zh3.C91753f;

/* renamed from: com.tencent.mm.modelavatar.o */
public class C68098o extends MStorage implements C10581n {

    /* renamed from: f */
    public static final String[] f195737f = {"CREATE TABLE IF NOT EXISTS img_flag ( username VARCHAR(40) PRIMARY KEY , imgflag int , lastupdatetime int , reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int ,updateflag int default 0)", "alter table img_flag add updateflag int default 0;", "CREATE INDEX IF NOT EXISTS img_flag_small_url_index ON img_flag ( reserved2 )"};

    /* renamed from: d */
    public C91753f f195738d;

    /* renamed from: e */
    public final C101611g<String, C68097n> f195739e = new C100308d(800);

    public C68098o(C91753f fVar) {
        this.f195738d = fVar;
    }

    /* renamed from: Lo */
    public C68097n mo93607Lo(String str) {
        C68097n nVar = (C68097n) ((C101062d) this.f195739e).mo139556b(str);
        if (nVar != null && nVar.mo93598g().equals(str)) {
            return nVar;
        }
        C68097n nVar2 = null;
        Cursor rawQuery = this.f195738d.rawQuery("select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4,img_flag.updateflag from img_flag where img_flag.username=\"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            nVar2 = new C68097n();
            nVar2.mo93592a(rawQuery);
        }
        rawQuery.close();
        ((C101062d) this.f195739e).mo139557c(str, nVar2);
        return nVar2;
    }

    /* renamed from: Yt */
    public boolean mo93608Yt(C68097n nVar) {
        boolean z = false;
        Log.m105925i("MicroMsg.ImgFlagStorage", "new smallImageUrl = %s, bigImageUrl = %s", nVar.mo93597f(), nVar.mo93594c());
        C68097n Lo = mo93607Lo(nVar.mo93598g());
        if (Lo == null) {
            ((C101062d) this.f195739e).mo139557c(nVar.mo93598g(), nVar);
            Assert.assertTrue(nVar.mo93598g() != null);
            nVar.mo93604m((int) (System.currentTimeMillis() / 1000));
            nVar.mo93603l();
            nVar.mo93600i(-1);
            if (((int) this.f195738d.insert("img_flag", "username", nVar.mo93593b())) > -1) {
                z = true;
            }
            if (z) {
                doNotify(nVar.mo93598g(), 2, nVar.mo93598g());
            }
            return z;
        }
        Log.m105925i("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s", Lo.mo93597f(), Lo.mo93594c());
        ((C101062d) this.f195739e).remove(nVar.mo93598g());
        Assert.assertTrue(nVar.mo93598g() != null);
        nVar.mo93604m((int) (System.currentTimeMillis() / 1000));
        nVar.mo93600i(nVar.mo93595d() | 4);
        ContentValues b = nVar.mo93593b();
        C91753f fVar = this.f195738d;
        if (fVar.update("img_flag", b, "username=?", new String[]{"" + nVar.mo93598g()}) > 0) {
            z = true;
        }
        if (z) {
            doNotify(nVar.mo93598g(), 3, nVar.mo93598g());
        }
        return z;
    }

    /* renamed from: jo */
    public boolean mo93609jo(List<C68097n> list) {
        boolean z = false;
        if (!(list == null || list.size() == 0)) {
            long beginTransaction = this.f195738d.beginTransaction(Thread.currentThread().getId());
            int i = 0;
            while (i < list.size()) {
                try {
                    mo93608Yt(list.get(i));
                    i++;
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.ImgFlagStorage", "" + e.getMessage());
                }
            }
            z = true;
            this.f195738d.endTransaction(beginTransaction);
        }
        return z;
    }

    /* renamed from: qq */
    public void mo93610qq(String str) {
        if (!Util.isNullOrNil(str)) {
            ((C101062d) this.f195739e).remove(str);
            C91753f fVar = this.f195738d;
            fVar.delete("img_flag", "username=?", new String[]{"" + str});
        }
    }
}

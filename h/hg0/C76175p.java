package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import junit.framework.Assert;
import zh3.C91753f;

/* renamed from: hg0.p */
public class C76175p extends MStorage {

    /* renamed from: e */
    public static final String[] f223187e = {"CREATE TABLE IF NOT EXISTS facebookfriend ( fbid long  PRIMARY KEY , fbname text  , fbimgkey int  , status int  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , sex int  , personalcard int  , province text  , city text  , signature text  , alias text  , type int  , email text  ) "};

    /* renamed from: d */
    public C91753f f223188d;

    public C76175p(C91753f fVar) {
        this.f223188d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo106430Lo(C76174o oVar) {
        Assert.assertTrue("Func Set always conv_flag == flag_all", oVar.mo106414c() == -1);
        long d = oVar.mo106415d();
        StringBuilder sb = new StringBuilder();
        sb.append("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.fbid = \"");
        sb.append(Util.escapeSqlValue("" + d));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f223188d.rawQuery(sb.toString(), (String[]) null, 2);
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        if (!moveToFirst) {
            oVar.f223186q = -1;
            return ((int) this.f223188d.mo125627q("facebookfriend", "fbid", oVar.mo106413b(), false)) != -1;
        }
        ContentValues b = oVar.mo106413b();
        C91753f fVar = this.f223188d;
        int update = fVar.update("facebookfriend", b, "fbid=?", new String[]{"" + oVar.mo106415d()});
        if (update > 0) {
            doNotify();
        }
        return update > 0;
    }

    /* renamed from: jo */
    public boolean mo106431jo() {
        return this.f223188d.execSQL("facebookfriend", "delete from facebookfriend");
    }
}

package uc0;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import junit.framework.Assert;
import p216op.C47392i;
import p749xh.C66261f3;
import r41.C47926a;
import zh3.C91753f;

/* renamed from: uc0.x */
public class C52524x extends MStorage implements C47392i {

    /* renamed from: e */
    public static final String[] f146708e = {"CREATE TABLE IF NOT EXISTS packageinfo ( id int  PRIMARY KEY, version int  , name text  , size int  , packname text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE TABLE IF NOT EXISTS packageinfo2 ( localId text  PRIMARY KEY , id int  , version int  , name text  , size int  , packname text  , status int  , type int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) "};

    /* renamed from: d */
    public C91753f f146709d;

    public C52524x(C91753f fVar) {
        this.f146709d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo73460Lo(int i) {
        C91753f fVar = this.f146709d;
        if (fVar.delete("packageinfo2", "type =?", new String[]{"" + i}) <= 0) {
            return false;
        }
        doNotify();
        return true;
    }

    /* renamed from: Ow */
    public C52523w mo73461Ow(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.id = \"");
        sb.append(Util.escapeSqlValue("" + i));
        sb.append("\" and ");
        sb.append("packageinfo2");
        sb.append(".");
        sb.append("type");
        sb.append(" = \"");
        sb.append(Util.escapeSqlValue("" + i2));
        sb.append(FastJsonResponse.QUOTE);
        String sb4 = sb.toString();
        C52523w wVar = null;
        Cursor rawQuery = this.f146709d.rawQuery(sb4, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            wVar = new C52523w();
            wVar.mo73456a(rawQuery);
        }
        rawQuery.close();
        return wVar;
    }

    /* renamed from: SE */
    public void mo73462SE(int i, int i2) {
        C86013q1.m106447h(C47926a.m53249a() + ic0(i, i2));
        C52523w Ow = mo73461Ow(i, i2);
        if (Ow != null) {
            Ow.f146701f = 5;
            C52517f0.xx0().mo73463TE(Ow);
        }
    }

    /* renamed from: TE */
    public boolean mo73463TE(C52523w wVar) {
        Assert.assertTrue(wVar != null);
        ContentValues b = wVar.mo73457b();
        if (b.size() > 0) {
            C91753f fVar = this.f146709d;
            if (fVar.update("packageinfo2", b, "id= ? and type =?", new String[]{wVar.mo73458c() + "", wVar.mo73459d() + ""}) > 0) {
                doNotify();
                return true;
            }
        }
        doNotify();
        return false;
    }

    /* renamed from: Yt */
    public String mo73464Yt(int i, int i2) {
        if (i2 == 1) {
            String str = C47926a.m53249a() + i + "_session_bg/";
            try {
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.PackageInfoStorage", "exception:%s", Util.stackTraceToString(e));
                Log.m105920e("MicroMsg.PackageInfoStorage", "can not create dir, dir = " + str);
            }
            return str;
        } else if (i2 != 18) {
            return "";
        } else {
            String ic02 = ic0(i, i2);
            return C47926a.m53249a() + ic02.replace(".zip", "");
        }
    }

    /* renamed from: bD */
    public C52523w[] mo73465bD(int i) {
        Cursor rawQuery = this.f146709d.rawQuery("select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=" + i, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C52523w wVar = new C52523w();
            wVar.mo73456a(rawQuery);
            arrayList.add(wVar);
        }
        rawQuery.close();
        return (C52523w[]) arrayList.toArray(new C52523w[arrayList.size()]);
    }

    public String ic0(int i, int i2) {
        if (i2 == 1) {
            return i + "_session_bg.zip";
        } else if (i2 == 2) {
            return i + "_emoji_art.temp";
        } else if (i2 == 5) {
            return "brand_i18n.apk";
        } else {
            if (i2 == 7) {
                return i + "_configlist.cfg";
            } else if (i2 == 9) {
                return "_speex_upload.cfg";
            } else {
                if (i2 == 12) {
                    return "_rcpt_addr";
                }
                if (i2 == 23) {
                    return "permissioncfg.cfg";
                }
                if (i2 == 26) {
                    return "ipcallCountryCodeConfig.cfg";
                }
                if (i2 != 36) {
                    switch (i2) {
                        case 18:
                            C52523w Ow = mo73461Ow(i, i2);
                            return Ow.f146697b + "_feature.zip";
                        case 19:
                            return "_report_reason.temp";
                        case 20:
                            return "_pluginDesc.cfg";
                        case 21:
                            return "_trace_config.cfg";
                        default:
                            return "";
                    }
                } else {
                    return i + "_sensewhere.xml";
                }
            }
        }
    }

    /* renamed from: jo */
    public boolean mo73467jo(int i) {
        boolean execSQL = this.f146709d.execSQL("packageinfo2", "update packageinfo2 set status = 2 where status = 1 and type = " + i + ";");
        doNotify();
        return execSQL;
    }

    /* renamed from: kD */
    public boolean mo73468kD(C52523w wVar) {
        if (wVar == null) {
            return false;
        }
        wVar.f146707l = -1;
        if (((int) this.f146709d.mo125627q("packageinfo2", C66261f3.COL_LOCALID, wVar.mo73457b(), false)) == -1) {
            return false;
        }
        doNotify();
        return true;
    }

    /* renamed from: qq */
    public String mo73469qq(String str, boolean z) {
        if (z) {
            return C47926a.m53249a() + str + "_chatting_bg_vertical.jpg";
        }
        return C47926a.m53249a() + str + "_chatting_bg_horizontal.jpg";
    }
}

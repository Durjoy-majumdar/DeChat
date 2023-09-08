package t30;

import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.platformtools.Log;
import d40.C31062a;
import h30.C87421c;
import java.util.Calendar;
import java.util.Date;
import p749xh.C78822p8;
import s30.C77615b;

/* renamed from: t30.p */
public class C77850p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f226837d;

    /* renamed from: e */
    public final /* synthetic */ int f226838e;

    /* renamed from: f */
    public final /* synthetic */ String f226839f;

    /* renamed from: g */
    public final /* synthetic */ C77851q f226840g;

    public C77850p(C77851q qVar, String str, int i, String str2) {
        this.f226840g = qVar;
        this.f226837d = str;
        this.f226838e = i;
        this.f226839f = str2;
    }

    public void run() {
        C78822p8 p8Var;
        String str = this.f226837d;
        if (this.f226840g.f226841a.f226844a.contains(Integer.valueOf(this.f226838e))) {
            C31062a.m39295b("MomentVideo", 501);
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(currentTimeMillis));
            int i = instance.get(11);
            int i2 = instance.get(7);
            C78822p8 p8Var2 = new C78822p8();
            p8Var2.field_snsid = str;
            p8Var2.field_type = this.f226838e;
            p8Var2.field_owner = this.f226839f;
            C77615b bVar = this.f226840g.f226841a.f226845b;
            bVar.getClass();
            Cursor rawQuery = bVar.f226279d.rawQuery("select * from SnsFeature where owner = '" + p8Var2.field_owner + "' and " + "snsid" + " = '" + p8Var2.field_snsid + "' and " + "type" + " = ?", new String[]{String.valueOf(p8Var2.field_type)});
            try {
                if (rawQuery.moveToFirst()) {
                    p8Var = new C78822p8();
                    p8Var.field_snsid = rawQuery.getString(rawQuery.getColumnIndex("snsid"));
                    p8Var.field_owner = rawQuery.getString(rawQuery.getColumnIndex("owner"));
                    p8Var.field_city = rawQuery.getString(rawQuery.getColumnIndex("city"));
                    p8Var.field_type = rawQuery.getInt(rawQuery.getColumnIndex("type"));
                    p8Var.field_weishang = rawQuery.getInt(rawQuery.getColumnIndex("weishang"));
                    p8Var.field_dayOfWeek = rawQuery.getInt(rawQuery.getColumnIndex("dayOfWeek"));
                    p8Var.field_hourOfDay = rawQuery.getInt(rawQuery.getColumnIndex("hourOfDay"));
                    p8Var.field_action = rawQuery.getInt(rawQuery.getColumnIndex("action"));
                    p8Var.field_timestamp = rawQuery.getLong(rawQuery.getColumnIndex(AppMeasurement.Param.TIMESTAMP));
                } else {
                    p8Var = null;
                }
                if (p8Var == null) {
                    Log.m105921e("MicroMsg.SnsScanner", "find failed! %s", str);
                    return;
                }
                p8Var.field_hourOfDay = i;
                p8Var.field_dayOfWeek = i2;
                p8Var.field_timestamp = currentTimeMillis;
                p8Var.field_action = 12;
                this.f226840g.f226841a.f226845b.mo107792Yt(p8Var);
                if (this.f226838e == 15) {
                    this.f226840g.f226841a.getClass();
                    C87421c cVar = new C87421c("MomentVideo", str);
                    cVar.f253322f = System.currentTimeMillis();
                    cVar.mo121839a();
                }
            } finally {
                rawQuery.close();
            }
        }
    }
}

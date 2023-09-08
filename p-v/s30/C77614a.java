package s30;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C78810h1;

/* renamed from: s30.a */
public class C77614a extends MAutoStorage<C78810h1> {

    /* renamed from: e */
    public static final String[] f226276e = {MAutoStorage.getCreateSQLs(C78810h1.f230675z, "ChattingEvent")};

    /* renamed from: d */
    public final ISQLiteDatabase f226277d;

    public C77614a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C78810h1.f230675z, "ChattingEvent", f226276e);
        this.f226277d = iSQLiteDatabase;
        if (MultiProcessMMKV.getDefault().getLong("ChattingEventStorage_create_time_v1", 0) == 0) {
            MultiProcessMMKV.getDefault().putLong("ChattingEventStorage_create_time_v1", System.currentTimeMillis()).commit();
        }
    }

    /* renamed from: Lo */
    public void mo107789Lo(C78810h1 h1Var) {
        if (h1Var.field_msgid != 0) {
            if (h1Var.field_isfrom == 0 && h1Var.field_action == 2) {
                h1Var.field_action = 1;
                if (!mo107790jo(h1Var)) {
                    this.f226277d.insert("ChattingEvent", (String) null, h1Var.convertTo());
                }
                h1Var.field_action = 2;
            }
            if (!mo107790jo(h1Var)) {
                this.f226277d.insert("ChattingEvent", (String) null, h1Var.convertTo());
            }
        }
    }

    /* renamed from: jo */
    public final boolean mo107790jo(C78810h1 h1Var) {
        boolean rawQuery = this.f226277d.rawQuery("select * from ChattingEvent where talker = '" + h1Var.field_talker + "' and " + "msgid" + " = ? and " + "type" + " = ? and " + "action" + " = ?", new String[]{String.valueOf(h1Var.field_msgid), String.valueOf(h1Var.field_type), String.valueOf(h1Var.field_action)});
        try {
            rawQuery = rawQuery.moveToFirst();
            if (rawQuery) {
                return true;
            }
            rawQuery.close();
            return false;
        } finally {
            if (rawQuery != null) {
                rawQuery.close();
            }
        }
    }
}

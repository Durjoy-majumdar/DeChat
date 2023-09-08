package lv1;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;

/* renamed from: lv1.a */
public class C34381a {

    /* renamed from: a */
    public static final SingleTable f92596a;

    /* renamed from: b */
    public static final Column f92597b;

    static {
        SingleTable singleTable = new SingleTable("FTS5MetaChatroomMember");
        f92596a = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("docid", "int", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("subtype", "int", singleTable.getName(), "");
        new Column("entity_id", "long", singleTable.getName(), "");
        f92597b = new Column("aux_index", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
    }
}

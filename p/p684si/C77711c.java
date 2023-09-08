package p684si;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p749xh.C78829w4;

/* renamed from: si.c */
public class C77711c extends C78829w4 {

    /* renamed from: T */
    public static IAutoDBItem.MAutoDBInfo f226491T = C78829w4.initAutoDBInfo(C77711c.class);

    /* renamed from: S */
    public List<Long> f226492S = new ArrayList();

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        ((ArrayList) this.f226492S).clear();
        if (!Util.isNullOrNil(this.field_related_msgids)) {
            for (String parseLong : this.field_related_msgids.split(",")) {
                ((ArrayList) this.f226492S).add(Long.valueOf(Long.parseLong(parseLong)));
            }
        }
    }

    public boolean equals(Object obj) {
        C77711c cVar = (C77711c) obj;
        return Util.isEqual(cVar.field_todoid, this.field_todoid) && Util.isEqual(cVar.field_roomname, this.field_roomname);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f226491T;
    }

    /* renamed from: l2 */
    public void mo107861l2(long j) {
        if (!((ArrayList) this.f226492S).contains(Long.valueOf(j))) {
            ((ArrayList) this.f226492S).add(Long.valueOf(j));
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayList) this.f226492S).iterator();
            while (it.hasNext()) {
                sb.append(((Long) it.next()).longValue());
                sb.append(",");
            }
            if (sb.length() - 1 >= 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            this.field_related_msgids = sb.toString();
        }
    }

    /* renamed from: m2 */
    public long mo107862m2() {
        if (((ArrayList) this.f226492S).size() > 0) {
            return ((Long) ((ArrayList) this.f226492S).get(0)).longValue();
        }
        return 0;
    }

    /* renamed from: n2 */
    public boolean mo107863n2() {
        return Util.isEqual("roomannouncement@app.origin", this.field_username);
    }
}

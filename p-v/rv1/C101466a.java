package rv1;

import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.tav.core.ExportErrorStatus;
import gy3.C87412m;
import java.util.Arrays;
import kv1.C99247a;

/* renamed from: rv1.a */
public final class C101466a extends C99247a {
    /* renamed from: d */
    public int mo138631d() {
        return 5;
    }

    public String getName() {
        return "FTS5ChatroomMemberStorage";
    }

    public int getType() {
        return 5;
    }

    /* renamed from: i */
    public String mo138608i() {
        String format = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", Arrays.copyOf(new Object[]{mo138611l()}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: k */
    public String mo138610k() {
        return "MicroMsg.FTS.FTS5ChatroomMemberStorage";
    }

    /* renamed from: m */
    public String mo138612m() {
        return "ChatroomMember";
    }

    /* renamed from: s */
    public boolean mo138618s() {
        return !mo138599b(ExportErrorStatus.APPEND_BUFFER, 3);
    }

    /* renamed from: u */
    public void mo138620u() {
        if (mo138618s()) {
            ((C93834f) this.f290993f).mo128800q(-110, 3);
        }
    }
}

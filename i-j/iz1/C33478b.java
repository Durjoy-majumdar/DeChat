package iz1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C38587j4;
import xy1.C53474j;
import yy1.C53641c;

/* renamed from: iz1.b */
public final class C33478b extends C38587j4 implements C53474j {

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f90664t = C38587j4.initAutoDBInfo(C33478b.class);

    /* renamed from: Z0 */
    public C53641c mo59155Z0() {
        return this.field_extInfo;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f90664t;
    }

    public String getSessionId() {
        String str = this.field_sessionId;
        C87412m.m108593f(str, "field_sessionId");
        return str;
    }

    /* renamed from: t */
    public String mo59157t() {
        String str = this.field_talker;
        C87412m.m108593f(str, "field_talker");
        return str;
    }

    /* renamed from: t1 */
    public String mo59158t1() {
        String str = this.field_selfUserName;
        C87412m.m108593f(str, "field_selfUserName");
        return str;
    }

    public String toString() {
        return "GameLifeSessionInfo(self:" + this.field_selfUserName + " talker:" + this.field_talker + " sessionId:" + this.field_sessionId + ')';
    }
}

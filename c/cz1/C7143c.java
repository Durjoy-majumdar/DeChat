package cz1;

import bz1.C0394d;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import p749xh.C53338i4;

/* renamed from: cz1.c */
public final class C7143c extends C53338i4 {

    /* renamed from: I */
    public static final IAutoDBItem.MAutoDBInfo f25114I = C53338i4.initAutoDBInfo(C7143c.class);

    /* renamed from: F */
    public C0394d f25115F;

    /* renamed from: G */
    public CharSequence f25116G;

    /* renamed from: H */
    public String f25117H;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C7143c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.conversation.GameLifeConversation");
        return C87412m.m108589b(this.field_sessionId, ((C7143c) obj).field_sessionId);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f25114I;
    }

    public int hashCode() {
        String str = this.field_sessionId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: l2 */
    public final long mo8333l2() {
        return mo8334m2() ? 103 : 101;
    }

    /* renamed from: m2 */
    public final boolean mo8334m2() {
        return C87412m.m108589b(this.field_sessionId, "@gamelifehistory");
    }

    public String toString() {
        return "GameLifeConversation(talker:" + this.field_talker + " sessionId:" + this.field_sessionId + " self:" + this.field_selfUserName + " nickname:" + this.f25117H + ')';
    }
}

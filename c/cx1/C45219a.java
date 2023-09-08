package cx1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import gy3.C8480h;
import gy3.C87412m;
import pe3.C47465a;

/* renamed from: cx1.a */
public final class C45219a {

    /* renamed from: a */
    public int f122538a;

    /* renamed from: b */
    public C47465a f122539b;

    /* renamed from: c */
    public boolean f122540c;

    /* renamed from: d */
    public String f122541d;

    /* renamed from: e */
    public JumpInfo f122542e;

    /* renamed from: f */
    public C45222d f122543f;

    public C45219a(int i, C47465a aVar) {
        this(i, aVar, false, (String) null, (JumpInfo) null, (C45222d) null, 60, (C8480h) null);
    }

    public C45219a(int i, C47465a aVar, boolean z, String str) {
        this(i, aVar, z, str, (JumpInfo) null, (C45222d) null, 48, (C8480h) null);
    }

    public C45219a(int i, C47465a aVar, boolean z, String str, JumpInfo jumpInfo, C45222d dVar) {
        this.f122538a = i;
        this.f122539b = aVar;
        this.f122540c = z;
        this.f122541d = str;
        this.f122542e = jumpInfo;
        this.f122543f = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45219a)) {
            return false;
        }
        C45219a aVar = (C45219a) obj;
        return this.f122538a == aVar.f122538a && C87412m.m108589b(this.f122539b, aVar.f122539b) && this.f122540c == aVar.f122540c && C87412m.m108589b(this.f122541d, aVar.f122541d) && C87412m.m108589b(this.f122542e, aVar.f122542e) && C87412m.m108589b(this.f122543f, aVar.f122543f);
    }

    public int hashCode() {
        int i = this.f122538a * 31;
        C47465a aVar = this.f122539b;
        int i2 = 0;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        boolean z = this.f122540c;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f122541d;
        int hashCode2 = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        JumpInfo jumpInfo = this.f122542e;
        int hashCode3 = (hashCode2 + (jumpInfo == null ? 0 : jumpInfo.hashCode())) * 31;
        C45222d dVar = this.f122543f;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "ChatRoomInfo(itemType=" + this.f122538a + ", data=" + this.f122539b + ", isMoreList=" + this.f122540c + ", roomGroupTitle=" + this.f122541d + ", createRoomJumpInfo=" + this.f122542e + ", footerDataWrapper=" + this.f122543f + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45219a(int i, C47465a aVar, boolean z, String str, JumpInfo jumpInfo, C45222d dVar, int i2, C8480h hVar) {
        this(i, aVar, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : jumpInfo, (i2 & 32) != 0 ? null : dVar);
    }
}

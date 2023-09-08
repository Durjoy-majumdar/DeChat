package ix1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ix1.f0 */
public final class C46319f0 {

    /* renamed from: a */
    public int f124795a;

    /* renamed from: b */
    public int f124796b;

    /* renamed from: c */
    public JumpInfo f124797c;

    /* renamed from: d */
    public String f124798d;

    /* renamed from: e */
    public boolean f124799e;

    public C46319f0() {
        this(0, 0, (JumpInfo) null, (String) null, false, 31, (C8480h) null);
    }

    public C46319f0(int i, int i2, JumpInfo jumpInfo, String str, boolean z, int i3, C8480h hVar) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        jumpInfo = (i3 & 4) != 0 ? null : jumpInfo;
        str = (i3 & 8) != 0 ? null : str;
        z = (i3 & 16) != 0 ? false : z;
        this.f124795a = i;
        this.f124796b = i2;
        this.f124797c = jumpInfo;
        this.f124798d = str;
        this.f124799e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46319f0)) {
            return false;
        }
        C46319f0 f0Var = (C46319f0) obj;
        return this.f124795a == f0Var.f124795a && this.f124796b == f0Var.f124796b && C87412m.m108589b(this.f124797c, f0Var.f124797c) && C87412m.m108589b(this.f124798d, f0Var.f124798d) && this.f124799e == f0Var.f124799e;
    }

    public int hashCode() {
        int i = ((this.f124795a * 31) + this.f124796b) * 31;
        JumpInfo jumpInfo = this.f124797c;
        int i2 = 0;
        int hashCode = (i + (jumpInfo == null ? 0 : jumpInfo.hashCode())) * 31;
        String str = this.f124798d;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f124799e;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        return "LinkBlock(start=" + this.f124795a + ", end=" + this.f124796b + ", jumpInfo=" + this.f124797c + ", userName=" + this.f124798d + ", canBeAt=" + this.f124799e + ')';
    }
}

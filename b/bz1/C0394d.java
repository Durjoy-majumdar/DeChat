package bz1;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import p629ny.C76979h;
import p749xh.C38573h4;
import xy1.C15912f;
import yy1.C53650l;

/* renamed from: bz1.d */
public final class C0394d extends C38573h4 implements C15912f {

    /* renamed from: C */
    public static final IAutoDBItem.MAutoDBInfo f998C = C38573h4.initAutoDBInfo(C0394d.class);

    /* renamed from: B */
    public boolean f999B = true;

    /* renamed from: D0 */
    public int mo422D0() {
        return this.field_accountType;
    }

    /* renamed from: V */
    public C72996z1 mo423V() {
        C72996z1 z1Var = new C72996z1();
        if (!this.f999B) {
            this.field_nickname = this.field_username;
        }
        z1Var.mo62878U2(this.field_nickname);
        z1Var.f214114V1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), this.field_nickname);
        z1Var.setUsername(this.field_username);
        z1Var.f108320R1 = z1Var.systemRowid;
        return z1Var;
    }

    /* renamed from: a */
    public String mo424a() {
        C53650l lVar = this.field_jumpInfo;
        if (lVar == null || lVar.f150704d != 1) {
            return "";
        }
        String str = lVar.f150705e;
        C87412m.m108593f(str, "jumpInfo.jump_url");
        return str;
    }

    public String getAvatarUrl() {
        return this.field_avatarURL;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f998C;
    }

    public String getNickname() {
        return this.field_nickname;
    }

    public String getTag() {
        return this.field_tag;
    }

    public String getUsername() {
        String str = this.field_username;
        C87412m.m108593f(str, "field_username");
        return str;
    }

    public boolean isValid() {
        return this.f999B;
    }

    /* renamed from: l2 */
    public final String mo431l2() {
        return "username: " + this.field_username;
    }

    public String toString() {
        return "username: " + this.field_username + " nickname: " + this.field_nickname;
    }
}

package ie0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import he0.C46020f;
import p749xh.C53354z6;

/* renamed from: ie0.j */
public final class C46220j extends C53354z6 implements C46020f {

    /* renamed from: p0 */
    public static final IAutoDBItem.MAutoDBInfo f124589p0 = C53354z6.initAutoDBInfo(C46220j.class);

    /* renamed from: Y */
    public boolean f124590Y;

    /* renamed from: Z */
    public long f124591Z = -1;

    /* renamed from: K */
    public String mo71440K() {
        return this.field_ticket;
    }

    /* renamed from: O1 */
    public String mo71441O1() {
        return "username:" + this.field_username + " nick:" + this.field_nickname;
    }

    /* renamed from: Q */
    public String mo71442Q() {
        return this.field_openImAppId;
    }

    /* renamed from: U */
    public String mo71443U() {
        String str = this.field_locationType;
        C87412m.m108593f(str, "this.field_locationType");
        return str;
    }

    /* renamed from: V */
    public final C72996z1 mo71631V() {
        C46225p pVar = C46225p.f124603a;
        C72996z1 z1Var = new C72996z1();
        z1Var.mo62878U2(this.field_nickname);
        z1Var.setUsername(this.field_username);
        z1Var.f108320R1 = this.f124591Z;
        z1Var.mo62880V2(this.field_openImAppId);
        z1Var.mo73960Q2(this.field_openImDescWordingId);
        z1Var.mo62912k4(this.field_source);
        z1Var.mo62863L3(this.field_checkTime);
        z1Var.f149532d1 = this.field_customInfoDetail;
        z1Var.f149530c1 = this.field_customInfoDetailVisible;
        z1Var.f149550u = true;
        z1Var.mo62890a3(this.field_ticket);
        z1Var.setType((int) this.field_type);
        return z1Var;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f124589p0;
    }

    public String getNickname() {
        return this.field_nickname;
    }

    public String getUsername() {
        return this.field_username;
    }

    public boolean isValid() {
        return this.f124590Y;
    }

    /* renamed from: l2 */
    public String mo71632l2() {
        return "OpenIMKefuContact username:" + this.field_username + " nick:" + this.field_nickname + " contactId: " + this.f124591Z + ", type: " + this.field_type + ", head:" + this.field_bigHeadImg + " smallHead: " + this.field_smallHeadImg + ", source: " + this.field_source + ", appId: " + this.field_openImAppId + ", wordingId: " + this.field_openImDescWordingId + ", customInfoDetail: " + this.field_customInfoDetailVisible + ", " + this.field_customInfoDetail + ", finderUsername: " + this.field_finderUsername + ", kfUrl: " + this.field_kfUrl;
    }

    /* renamed from: r1 */
    public Boolean mo71447r1() {
        return Boolean.valueOf(this.field_needReport);
    }

    /* renamed from: t0 */
    public String mo71448t0() {
        return this.field_openImDescWordingId;
    }
}

package lh0;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import sf0.C90189z;

/* renamed from: lh0.o */
public class C34275o extends C34256a<C34274n> {

    /* renamed from: e */
    public static final String[] f92388e = {MAutoStorage.getCreateSQLs(C34274n.f92387B, "WechatSessionHistory")};

    /* renamed from: f */
    public static final String[] f92389f = new String[0];

    public C34275o(C90189z.C90190a aVar) {
        super(aVar, C34274n.f92387B, "WechatSessionHistory", f92389f);
    }

    /* renamed from: Lo */
    public int mo59517Lo() {
        return 7;
    }

    /* renamed from: Yt */
    public boolean mo59536Yt(C34274n nVar) {
        return super.insertNotify(nVar, false);
    }

    /* renamed from: jo */
    public String mo59518jo() {
        return "ds";
    }

    /* renamed from: qq */
    public String mo59519qq() {
        return "WechatSessionHistory";
    }
}

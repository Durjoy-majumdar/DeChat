package wb0;

import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: wb0.c */
public final class C102383c extends BaseStateAction {

    /* renamed from: a */
    public final String f301542a;

    /* renamed from: b */
    public final String f301543b;

    /* renamed from: c */
    public final byte[] f301544c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C102383c(String str, String str2, byte[] bArr, int i, C8480h hVar) {
        this(str, str2, (i & 4) != 0 ? null : bArr);
    }

    public C102383c(String str, String str2, byte[] bArr) {
        C87412m.m108594g(str, "imageKey");
        C87412m.m108594g(str2, "tempCachePath");
        this.f301542a = str;
        this.f301543b = str2;
        this.f301544c = bArr;
    }
}

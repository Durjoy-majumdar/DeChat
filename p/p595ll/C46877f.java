package p595ll;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import p490dl.C45409e;
import rx3.C13598b0;
import te3.C101776f80;
import te3.C49978jd3;
import te3.C50892pz1;
import wh3.C38139n;

/* renamed from: ll.f */
public final class C46877f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f126069d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Integer, C13598b0> f126070e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46877f(String str, C32226l<? super Integer, C13598b0> lVar) {
        super(0);
        this.f126069d = str;
        this.f126070e = lVar;
    }

    public Object invoke() {
        C49978jd3 jd32;
        C38139n jo = C30790w2.m39221h().mo57719f().mo61538jo(this.f126069d);
        C50892pz1 pz12 = new C50892pz1();
        if ((jo != null ? jo.field_content : null) != null) {
            try {
                pz12.parseFrom(jo.field_content);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.EmojiPackSyncManager", e, "", new Object[0]);
            }
        }
        C101776f80 f802 = pz12.f140062d;
        if (f802 == null || (jd32 = f802.f298229E) == null) {
            Log.m105924i("MicroMsg.EmojiPackSyncManager", "checkPack: getEmojiDetail");
            new C45409e(this.f126069d).mo9225i().mo123420E(new C46876e(this.f126069d, this.f126070e));
        } else {
            this.f126070e.invoke(Integer.valueOf(jd32.f136019d));
        }
        return C13598b0.f38549a;
    }
}

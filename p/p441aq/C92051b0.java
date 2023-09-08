package p441aq;

import android.content.Context;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import o40.C61926c;
import p008bq.C92284l1;
import p008bq.C92285m0;
import p008bq.C92288n0;
import p008bq.C92292x0;
import p384tk.C101897a;
import p384tk.C101900d;
import p384tk.C22541f;
import rx3.C13598b0;
import sh3.C101624e;
import sh3.C101626g;

@C86522b(dependencies = {C92052d0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: aq.b0 */
public final class C92051b0 extends C86301e implements C92292x0 {
    /* renamed from: BY */
    public C101900d mo126020BY(byte[] bArr) {
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
        return new C22541f(bArr);
    }

    /* renamed from: Ii */
    public C92284l1 mo126021Ii() {
        if (C96945j0.f283998s == null) {
            synchronized (C96945j0.class) {
                if (C96945j0.f283998s == null) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    C96945j0.f283998s = new C96945j0(context, (C8480h) null);
                    if (MMApplicationContext.isMainProcess()) {
                        Log.m105924i("MicroMsg.QQSmileyManager", "checkNewEmoji");
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C96945j0 j0Var = C96945j0.f283998s;
        C87412m.m108591d(j0Var);
        return j0Var;
    }

    public C92285m0 Um0() {
        C101897a e = C101897a.m134075e();
        C87412m.m108593f(e, "getInstance()");
        return e;
    }

    public C101900d getDecoder(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        return MMGIFJNIFactory.Companion.getDecoder((EmojiInfo) iEmojiInfo);
    }

    /* renamed from: k0 */
    public C92288n0 mo126024k0() {
        C96931e a = C96931e.m124499a();
        C87412m.m108593f(a, "getInstance()");
        return a;
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        if (C80622u0.m98265a(context) != C80622u0.PUSH) {
            C96931e.m124499a();
        }
        if (C80622u0.m98265a(context) == C80622u0.MM) {
            C101624e eVar = C101624e.f297484a;
            C61926c.m72657B("StickerFileManager_cleanFile", true, C101626g.f297492d);
        }
    }
}

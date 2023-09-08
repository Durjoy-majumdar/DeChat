package p441aq;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import ei3.C86522b;
import p008bq.C67304c1;
import p911ml.C99928o;

@C86522b
/* renamed from: aq.r0 */
public final class C28080r0 extends C86301e implements C67304c1 {
    /* renamed from: KT */
    public void mo55780KT(long j) {
        C99928o oVar = C99928o.f292790a;
        Log.m105924i("MicroMsg.EmojiUploadManager", "addUploadTask: " + j);
        EmojiInfo bO = C30790w2.m39221h().mo57717d().mo142052bO(j);
        StringBuilder sb = new StringBuilder();
        sb.append("addUploadTask: ");
        sb.append(bO != null ? bO.getMd5() : null);
        Log.m105924i("MicroMsg.EmojiUploadManager", sb.toString());
        if (bO != null) {
            oVar.mo139268a(bO);
        }
    }
}

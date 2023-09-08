package ce0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.msgsubscription.voice.MsgSubscriptionVoicePlayHelperMM;
import com.tencent.p014mm.msgsubscription.voice.PlayVoiceData;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import nb0.C88913c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lce0/c;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/msgsubscription/voice/PlayVoiceData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: ce0.c */
public final class C80017c implements C80883e<PlayVoiceData, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        PlayVoiceData playVoiceData = (PlayVoiceData) obj;
        C87412m.m108594g(playVoiceData, "data");
        int i = playVoiceData.f157768f;
        if (i == 0) {
            MsgSubscriptionVoicePlayHelperMM msgSubscriptionVoicePlayHelperMM = MsgSubscriptionVoicePlayHelperMM.f238026a;
            String str = playVoiceData.f157767e;
            long j = playVoiceData.f157766d;
            C87412m.m108594g(str, "url");
            synchronized (MsgSubscriptionVoicePlayHelperMM.f238029d) {
                Log.m105924i("MicroMsg.MsgSubscriptionVoicePlayer", "[play] id[" + j + "]  url[" + str + ']');
                LinkedHashMap<Long, String> linkedHashMap = MsgSubscriptionVoicePlayHelperMM.f238027b;
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap.put(Long.valueOf(j), str);
                    msgSubscriptionVoicePlayHelperMM.mo112915a(str, j);
                } else {
                    linkedHashMap.put(Long.valueOf(j), str);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        } else {
            boolean z = true;
            if (i == 1) {
                MsgSubscriptionVoicePlayHelperMM msgSubscriptionVoicePlayHelperMM2 = MsgSubscriptionVoicePlayHelperMM.f238026a;
                long j2 = playVoiceData.f157766d;
                synchronized (MsgSubscriptionVoicePlayHelperMM.f238029d) {
                    MsgSubscriptionVoicePlayHelperMM.f238027b.remove(Long.valueOf(j2));
                    String str2 = null;
                    Iterator it = ((LinkedHashMap) MsgSubscriptionVoicePlayHelperMM.f238028c).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((Number) entry.getValue()).longValue() == j2) {
                            str2 = (String) entry.getKey();
                            break;
                        }
                    }
                    if (str2 != null) {
                        if (str2.length() != 0) {
                            z = false;
                        }
                    }
                    if (!z) {
                        C88913c.m111011i(str2);
                        C88913c.m111004b(str2);
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
        }
        if (gVar != null) {
            gVar.mo894a(new IPCVoid());
        }
    }
}

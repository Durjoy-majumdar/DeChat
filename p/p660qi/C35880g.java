package p660qi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C45612m0;
import f62.C27049a1;
import g62.C75875l;

/* renamed from: qi.g */
public class C35880g implements C27049a1 {
    /* renamed from: V4 */
    public void mo54537V4(C72963f4 f4Var, C75875l.C45886e eVar, boolean[] zArr) {
    }

    /* renamed from: a2 */
    public void mo54538a2(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
    }

    /* renamed from: k3 */
    public void mo54539k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        if (z) {
            Log.m105925i("ConversationUpdateCallback", "new conversation %s", h2Var.getUsername());
            C45612m0.m50686c(h2Var.getUsername());
        }
    }
}

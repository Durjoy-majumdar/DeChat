package ie0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C72996z1;
import zt3.C119157j;

/* renamed from: ie0.r */
public final class C33307r implements C30783v3.C30787d {
    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (i == 5 && (obj instanceof String) && C72996z1.m85845p5((String) obj)) {
            Log.m105925i("MicroMsg.OpenIMKefuConversationChangeListener", "alvinluo openImKfConversationChangedListener onNotifyChange delete %s", obj);
            ((C119157j) C119157j.f356862d).mo183871b(C46227v.f124611d, "kefu_conversation_logic_thread");
        }
    }
}

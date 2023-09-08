package ob0;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

public class b0$$c extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C89137b0 f256828a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0$$c(C89137b0 b0Var, Looper looper) {
        super(looper);
        this.f256828a = b0Var;
    }

    public void handleMessage(Message message) {
        this.f256828a.mo123460f((C117747y) message.obj);
    }
}

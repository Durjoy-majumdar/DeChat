package zw2;

import android.os.Message;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.AppProfileUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: zw2.e */
public class C53827e extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ AppProfileUI f151048a;

    public C53827e(AppProfileUI appProfileUI) {
        this.f151048a = appProfileUI;
    }

    public void handleMessage(Message message) {
        this.f151048a.finish();
    }
}

package k11;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

public class s$$e extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C99085s f29751a;

    public s$$e(C99085s sVar) {
        this.f29751a = sVar;
    }

    public void handleMessage(Message message) {
        C99085s sVar = this.f29751a;
        if (!sVar.f290461n) {
            sVar.notifyDataSetChanged();
        }
    }
}

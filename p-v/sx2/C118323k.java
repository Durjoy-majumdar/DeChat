package sx2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.talkroom.model.TalkRoomReceiver;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p970gg.C87186a;

/* renamed from: sx2.k */
public class C118323k implements MAlarmHandler.IBumper {
    public void cancel() {
        Context context = MMApplicationContext.getContext();
        int i = TalkRoomReceiver.f347406a;
        PendingIntent b = C87186a.m108239b(context, 107, new Intent(context, TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), 536870912, true);
        if (b != null) {
            C87186a.m108238a(context, 107, b);
            b.cancel();
        }
    }

    public void prepare() {
        TalkRoomReceiver.m162870a(MMApplicationContext.getContext());
    }
}

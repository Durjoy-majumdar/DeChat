package m01;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import p206nj.C11171e;
import p918s2.C90116e;

/* renamed from: m01.c */
public final class C61423c {
    /* renamed from: a */
    public static final Notification m72121a(Intent intent, String str, String str2, String str3) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "content");
        C87412m.m108594g(str3, "tickerContent");
        PendingIntent activity = PendingIntent.getActivity(MMApplicationContext.getContext(), 47, intent, 134217728);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o(str3);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(str);
        cVar.f258795g = activity;
        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
        cVar.mo124384i(2, true);
        if (C11171e.m11044a(16)) {
            Notification b = cVar.mo124378b();
            C87412m.m108593f(b, "builder.build()");
            return b;
        }
        Notification b2 = cVar.mo124378b();
        C87412m.m108593f(b2, "builder.build()");
        return b2;
    }
}

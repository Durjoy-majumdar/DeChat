package p201lz;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedList;
import n13.C88880b;
import n13.C88897h;
import p617mz.C88861c;
import p617mz.C88862d;
import p918s2.C90116e;
import te3.C90430p93;
import tw0.C90585h;
import x02.C91117e;

@C86522b
/* renamed from: lz.c */
public final class C88671c extends C86301e implements C88862d {
    /* renamed from: HK */
    public void mo123107HK(String str, String str2, PendingIntent pendingIntent) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, MimeTypes.BASE_TYPE_TEXT);
        C88880b bVar = C88880b.f256362a;
        Log.m105925i("MicroMsg.Updater.ManualUpdaterProcessor", "showNotification, title = %s, text = %s", str, str2);
        C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
        cVar.mo124390o((CharSequence) null);
        cVar.mo124384i(16, true);
        cVar.f258814z.when = System.currentTimeMillis();
        cVar.mo124383h(str);
        cVar.mo124382g(str2);
        cVar.f258795g = pendingIntent;
        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
        Notification b = cVar.mo124378b();
        C87412m.m108593f(b, "getNotificationBuilder(M…ficationIconRs()).build()");
        Object systemService = MMApplicationContext.getContext().getSystemService("notification");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(9342, b);
    }

    /* renamed from: XJ */
    public C90585h mo123108XJ(C90585h hVar, boolean z) {
        return C91117e.m114303h(hVar, z);
    }

    public C88861c o10(String str, String str2, LinkedList<C90430p93> linkedList, int i) {
        C87412m.m108594g(str, "baseId");
        C87412m.m108594g(str2, "patchId");
        C87412m.m108594g(linkedList, "targets");
        return new C88897h(str, str2, linkedList, i);
    }
}

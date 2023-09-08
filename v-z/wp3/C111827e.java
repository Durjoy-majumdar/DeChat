package wp3;

import android.os.SystemClock;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.player.OnCompositionUpdateListener;
import com.tencent.tav.player.Player;
import gy3.C87412m;
import yp3.C112478a;

/* renamed from: wp3.e */
public final class C111827e implements OnCompositionUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C111829g f334827a;

    /* renamed from: b */
    public final /* synthetic */ long f334828b;

    /* renamed from: c */
    public final /* synthetic */ CMTime f334829c;

    /* renamed from: d */
    public final /* synthetic */ long f334830d;

    /* renamed from: e */
    public final /* synthetic */ CMTime f334831e;

    /* renamed from: f */
    public final /* synthetic */ boolean f334832f;

    public C111827e(C111829g gVar, long j, CMTime cMTime, long j2, CMTime cMTime2, boolean z) {
        this.f334827a = gVar;
        this.f334828b = j;
        this.f334829c = cMTime;
        this.f334830d = j2;
        this.f334831e = cMTime2;
        this.f334832f = z;
    }

    public final void onUpdated(Player player, boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - this.f334828b;
        C111825c cVar = this.f334827a.f334844i;
        if (cVar != null) {
            cVar.mo138707a(currentTimeMillis);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("on composition update, success:");
        sb.append(z);
        sb.append(", position:");
        CMTime position = player.position();
        C87412m.m108590c(position, "player.position()");
        sb.append(position.getTimeUs() / ((long) 1000));
        sb.append(", originPosition:");
        sb.append(this.f334829c);
        sb.append(", isStarted:");
        sb.append(this.f334827a.f334842g);
        sb.append(", cost:");
        sb.append(SystemClock.elapsedRealtime() - this.f334830d);
        C112478a.m153625c("VideoCompositionPlayer", sb.toString(), new Object[0]);
        player.seekToTime(this.f334831e);
        if (this.f334832f || this.f334827a.f334842g) {
            player.play();
        }
        this.f334827a.f334843h = false;
    }
}

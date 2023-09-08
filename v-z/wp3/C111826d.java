package wp3;

import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.player.IPlayer;
import yp3.C112478a;

/* renamed from: wp3.d */
public final class C111826d implements IPlayer.PlayerListener {

    /* renamed from: a */
    public final /* synthetic */ C111829g f334826a;

    public C111826d(C111829g gVar) {
        this.f334826a = gVar;
    }

    public void onPositionChanged(CMTime cMTime) {
        C111823a aVar;
        C111823a aVar2 = this.f334826a.f334839d;
        if (aVar2 != null) {
            aVar2.mo79528b((cMTime != null ? cMTime.getTimeUs() : 0) / ((long) 1000));
        }
        if (cMTime != null && cMTime.getTimeUs() == this.f334826a.f334845j.mo162387j().getStartUs() && (aVar = this.f334826a.f334839d) != null) {
            aVar.mo79531o();
        }
    }

    public void onStatusChanged(IPlayer.PlayerStatus playerStatus) {
        C111823a aVar;
        C112478a.m153625c("VideoCompositionPlayer", "onStatusChanged:" + playerStatus, new Object[0]);
        if (playerStatus == IPlayer.PlayerStatus.PLAYING) {
            C111823a aVar2 = this.f334826a.f334839d;
            if (aVar2 != null) {
                aVar2.mo79531o();
            }
        } else if (playerStatus == IPlayer.PlayerStatus.STOPPED) {
            C111823a aVar3 = this.f334826a.f334839d;
            if (aVar3 != null) {
                aVar3.mo79533u();
            }
        } else if (playerStatus == IPlayer.PlayerStatus.FINISHED) {
            C111823a aVar4 = this.f334826a.f334839d;
            if (aVar4 != null) {
                aVar4.mo79530i();
            }
        } else if (playerStatus == IPlayer.PlayerStatus.ERROR && (aVar = this.f334826a.f334839d) != null) {
            aVar.mo79529h();
        }
    }
}

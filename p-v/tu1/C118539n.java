package tu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import tu1.C118520b;
import tu1.C118534l;

/* renamed from: tu1.n */
public class C118539n extends C118519a {

    /* renamed from: a */
    public final /* synthetic */ C118534l.C118536b f354751a;

    public C118539n(C118534l.C118536b bVar) {
        this.f354751a = bVar;
    }

    /* renamed from: a */
    public void mo183257a(boolean z, int i) {
        int i2;
        long j = 0;
        int i3 = 0;
        switch (i) {
            case 2:
                C118534l.C118536b bVar = this.f354751a;
                if (bVar.f354744e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "bufferingUpdate");
                    C118522d dVar = (C118522d) bVar.f354741b;
                    dVar.getClass();
                    C118520b.C118521a a = C118532k.f354730c.mo183248a().f354732a.mo183240a(dVar.f354715g);
                    Long valueOf = Long.valueOf(a.f354700a);
                    Long valueOf2 = Long.valueOf(a.f354702c);
                    C87412m.m108591d(valueOf);
                    if (valueOf.longValue() > 0) {
                        C87412m.m108591d(valueOf2);
                        if (valueOf2.longValue() > 0) {
                            i2 = (int) ((valueOf.longValue() * ((long) 100)) / valueOf2.longValue());
                            hashMap.put("values", Collections.singletonList(Arrays.asList(new Double[]{Double.valueOf(0.0d), Double.valueOf((double) i2)})));
                            bVar.f354744e.success(hashMap);
                            return;
                        }
                    }
                    i2 = 0;
                    hashMap.put("values", Collections.singletonList(Arrays.asList(new Double[]{Double.valueOf(0.0d), Double.valueOf((double) i2)})));
                    bVar.f354744e.success(hashMap);
                    return;
                }
                return;
            case 3:
                this.f354751a.f354748i.removeMessages(1001);
                C118534l.C118536b bVar2 = this.f354751a;
                if (!bVar2.f354746g) {
                    bVar2.f354746g = true;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("event", "initialized");
                    C118522d dVar2 = (C118522d) bVar2.f354741b;
                    String str = dVar2.f354709a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getDurationMs: ");
                    ITPPlayer iTPPlayer = dVar2.f354711c;
                    sb.append(iTPPlayer != null ? Long.valueOf(iTPPlayer.getDurationMs()) : null);
                    Log.m105918d(str, sb.toString());
                    ITPPlayer iTPPlayer2 = dVar2.f354711c;
                    if (iTPPlayer2 != null) {
                        j = iTPPlayer2.getDurationMs();
                    }
                    hashMap2.put("duration", Long.valueOf(j));
                    C118522d dVar3 = (C118522d) bVar2.f354741b;
                    String str2 = dVar3.f354709a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("getWidth ");
                    sb4.append(dVar3.f354711c);
                    sb4.append("  ");
                    ITPPlayer iTPPlayer3 = dVar3.f354711c;
                    sb4.append(iTPPlayer3 != null ? iTPPlayer3.getVideoWidth() : 0);
                    Log.m105918d(str2, sb4.toString());
                    ITPPlayer iTPPlayer4 = dVar3.f354711c;
                    hashMap2.put("width", Integer.valueOf(iTPPlayer4 != null ? iTPPlayer4.getVideoWidth() : 0));
                    ITPPlayer iTPPlayer5 = ((C118522d) bVar2.f354741b).f354711c;
                    if (iTPPlayer5 != null) {
                        i3 = iTPPlayer5.getVideoHeight();
                    }
                    hashMap2.put("height", Integer.valueOf(i3));
                    bVar2.f354744e.success(hashMap2);
                    if (z) {
                        ((C118522d) this.f354751a.f354741b).mo183245a();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C118534l.C118536b bVar3 = this.f354751a;
                if (bVar3.f354746g) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("event", "completed");
                    bVar3.f354744e.success(hashMap3);
                    return;
                }
                return;
            case 5:
                this.f354751a.f354748i.sendEmptyMessageDelayed(1001, 500);
                return;
            case 7:
                C118534l.C118536b bVar4 = this.f354751a;
                bVar4.getClass();
                Log.m105918d("MicroMsg.FlutterVideoPlayerPlugin", "FlutterThumb [buffering start]");
                if (bVar4.f354744e != null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "bufferingStart");
                    bVar4.f354744e.success(hashMap4);
                    return;
                }
                return;
            case 8:
                C118534l.C118536b bVar5 = this.f354751a;
                bVar5.getClass();
                Log.m105924i("FlutterThumb", "[buffering end]");
                if (bVar5.f354744e != null) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("event", "bufferingEnd");
                    bVar5.f354744e.success(hashMap5);
                    return;
                }
                return;
            case 9:
                C118534l.C118536b bVar6 = this.f354751a;
                bVar6.getClass();
                Log.m105924i("FlutterThumb", "[seek complete]");
                if (bVar6.f354744e != null) {
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("event", "onSeekComplete");
                    ITPPlayer iTPPlayer6 = ((C118522d) bVar6.f354741b).f354711c;
                    if (iTPPlayer6 != null) {
                        j = iTPPlayer6.getCurrentPositionMs();
                    }
                    hashMap6.put("position", Long.valueOf(j));
                    bVar6.f354744e.success(hashMap6);
                    return;
                }
                return;
            case 10:
                C118534l.C118536b bVar7 = this.f354751a;
                if (bVar7.f354746g) {
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put("event", "firstFrame");
                    bVar7.f354744e.success(hashMap7);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

package fs0;

import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;

/* renamed from: fs0.c */
public final class C97969c implements C96814a.C57541b {

    /* renamed from: d */
    public final /* synthetic */ CommonVideoView f287332d;

    public C97969c(CommonVideoView commonVideoView) {
        this.f287332d = commonVideoView;
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
    }

    /* renamed from: I3 */
    public /* bridge */ /* synthetic */ void mo22957I3(String str, String str2, Boolean bool) {
        bool.booleanValue();
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        this.f287332d.start();
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        this.f287332d.stop();
        Log.m105920e("MicroMsg.WAGameRecordShareUI", "playView error：" + str3 + ",what:" + i + ",extra:" + i2 + ", sessionId:" + str + ",mediaId:" + str2);
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        this.f287332d.start();
        Log.m105924i("MicroMsg.WAGameRecordShareUI", "video prepared, sessionId:" + str + ",mediaId:" + str2);
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }
}

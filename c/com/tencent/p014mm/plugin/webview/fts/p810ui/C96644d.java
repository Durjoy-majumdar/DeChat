package com.tencent.p014mm.plugin.webview.fts.p810ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import r83.C47954g;
import r83.C47955h;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.d */
public class C96644d implements C96814a.C57541b {

    /* renamed from: d */
    public final /* synthetic */ FtsWebVideoView f283013d;

    public C96644d(FtsWebVideoView ftsWebVideoView) {
        this.f283013d = ftsWebVideoView;
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        Log.m105924i("MicroMsg.FtsWebVideoView", "onVideoWaitingEnd");
        FtsWebVideoView ftsWebVideoView = this.f283013d;
        ftsWebVideoView.f282951M = false;
        ftsWebVideoView.f282962g.f273525i.setVisibility(0);
        this.f283013d.f282962g.mo134731z();
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        Log.m105924i("MicroMsg.FtsWebVideoView", "onVideoWaiting");
        this.f283013d.f282962g.f273525i.setVisibility(8);
        this.f283013d.f282951M = true;
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        Log.m105924i("MicroMsg.FtsWebVideoView", "onVideoEnded");
        C47955h hVar = this.f283013d.f282946H;
        if (hVar != null) {
            Log.m105919d("MicroMsg.JsApiVideoCallback", "onVideoEnded %s", hVar.toString());
            MTimerHandler mTimerHandler = hVar.f128645b;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            try {
                hVar.mo72728j(hVar.mo72725g(3, (JSONObject) null));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e, (String) null, new Object[0]);
            }
        }
        FtsWebVideoView ftsWebVideoView = this.f283013d;
        if (ftsWebVideoView.f282943E) {
            ftsWebVideoView.mo134755j(0, true);
            return;
        }
        ftsWebVideoView.mo134755j(0, false);
        this.f283013d.mo134754i();
        FtsWebVideoView ftsWebVideoView2 = this.f283013d;
        View view = ftsWebVideoView2.f282963h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = ftsWebVideoView2.f282964i;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = ftsWebVideoView2.f282971s;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showReplayCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ftsWebVideoView2.mo134757l();
        this.f283013d.f282970r.setImageResource(C0966R.C0969drawable.c3k);
        this.f283013d.f282962g.setVisibility(8);
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "onError errorMsg=%s what=%d extra=%d", str3, Integer.valueOf(i), Integer.valueOf(i2));
        C115669n nVar = C115669n.INSTANCE;
        FtsWebVideoView ftsWebVideoView = this.f283013d;
        nVar.mo160131h(14911, Integer.valueOf(i), Integer.valueOf(i2), ftsWebVideoView.f282953P, NetStatusUtil.getFormatedNetType(ftsWebVideoView.getContext()));
        C47955h hVar = this.f283013d.f282946H;
        if (hVar != null) {
            hVar.getClass();
            Log.m105921e("MicroMsg.JsApiVideoCallback", "onError what %d, extra %d", Integer.valueOf(i), Integer.valueOf(i2));
            hVar.mo72724f();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errCode", i);
                jSONObject.put("errMsg", i2 + "");
                hVar.mo72728j(hVar.mo72725g(7, jSONObject));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e, (String) null, new Object[0]);
            }
        }
        this.f283013d.mo134754i();
        FtsWebVideoView ftsWebVideoView2 = this.f283013d;
        Context context = ftsWebVideoView2.getContext();
        ftsWebVideoView2.mo134760o(context.getString(C0966R.string.ka7, new Object[]{i + XVFSFile.PATH_SEPARATOR + i2}), this.f283013d.getContext().getString(C0966R.string.kbc), (String) null);
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        Log.m105924i("MicroMsg.FtsWebVideoView", "onPrepared");
        FtsWebVideoView ftsWebVideoView = this.f283013d;
        C96638a aVar = ftsWebVideoView.f282940B;
        aVar.f283002i = -1;
        aVar.f283003j = 0;
        aVar.f283001h = 0.0f;
        ftsWebVideoView.f282962g.mo134723B(ftsWebVideoView.f282951M);
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        Log.m105924i("MicroMsg.FtsWebVideoView", "onVideoPause");
        C47955h hVar = this.f283013d.f282946H;
        if (hVar != null) {
            Log.m105919d("MicroMsg.JsApiVideoCallback", "onVideoPause %s", hVar.toString());
            MTimerHandler mTimerHandler = hVar.f128645b;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            try {
                hVar.mo72728j(hVar.mo72725g(2, (JSONObject) null));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e, (String) null, new Object[0]);
            }
        }
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "onGetVideoSize width=%d height=%d", Integer.valueOf(i), Integer.valueOf(i2));
        FtsWebVideoView ftsWebVideoView = this.f283013d;
        if (ftsWebVideoView.f282959d == FtsWebVideoView.C96636h.AUTO) {
            FtsWebVideoView.C96636h hVar = i < i2 ? FtsWebVideoView.C96636h.PORTRAIT : FtsWebVideoView.C96636h.LANDSCAPE;
            ftsWebVideoView.f282959d = hVar;
            Log.m105925i("MicroMsg.FtsWebVideoView", "onGetVideoSize adjust direction from AUTO to %s", hVar);
        }
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        FtsWebVideoView ftsWebVideoView = this.f283013d;
        int i = FtsWebVideoView.f282938V;
        Log.m105925i("MicroMsg.FtsWebVideoView", "onVideoPlay, isLive:%b", Boolean.valueOf(ftsWebVideoView.mo134743e()));
        C47955h hVar = this.f283013d.f282946H;
        if (hVar != null) {
            Log.m105919d("MicroMsg.JsApiVideoCallback", "onVideoPlay %s", hVar.toString());
            hVar.f128646c = 0;
            if (hVar.f128645b == null) {
                hVar.f128645b = new MTimerHandler(new C47954g(hVar), true);
            }
            hVar.f128645b.startTimer(250);
            try {
                hVar.mo72728j(hVar.mo72725g(1, (JSONObject) null));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiVideoCallback", e, (String) null, new Object[0]);
            }
        }
        long j = this.f283013d.f282954Q;
        if (j > 0 && j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
            long currentTimeMillis = System.currentTimeMillis() - this.f283013d.f282954Q;
            C115669n.INSTANCE.mo160131h(14909, Long.valueOf(currentTimeMillis), Long.valueOf(System.currentTimeMillis()), Long.valueOf(currentTimeMillis), NetStatusUtil.getFormatedNetType(this.f283013d.getContext()), this.f283013d.f282953P);
        }
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }
}

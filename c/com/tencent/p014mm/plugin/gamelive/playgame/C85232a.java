package com.tencent.p014mm.plugin.gamelive.playgame;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.gamelive.event.GameLiveAppbrandEventService;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import kz1.C88349l;
import org.json.JSONArray;
import org.json.JSONObject;
import qo3.C12925w;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.a */
public class C85232a implements GameLivePlayGameConditionChoosePage$$c {

    /* renamed from: a */
    public C12925w f248300a = null;

    /* renamed from: b */
    public final Context f248301b;

    /* renamed from: c */
    public JSONObject f248302c;

    /* renamed from: d */
    public boolean f248303d;

    /* renamed from: e */
    public String f248304e;

    /* renamed from: f */
    public String f248305f;

    /* renamed from: g */
    public String f248306g;

    /* renamed from: h */
    public TextView f248307h;

    /* renamed from: i */
    public TextView f248308i;

    /* renamed from: j */
    public TextView f248309j;

    /* renamed from: k */
    public JSONArray f248310k;

    /* renamed from: l */
    public GameLiveAppbrandEventService.LivePlayGamePayLoad f248311l;

    /* renamed from: m */
    public int f248312m;

    /* renamed from: n */
    public GameLivePlayGameConditionChoosePage f248313n;

    /* renamed from: o */
    public C88349l.C88350a f248314o;

    /* renamed from: p */
    public boolean f248315p;

    public C85232a(Context context, JSONObject jSONObject, String str, int i, C88349l.C88350a aVar) {
        new JSONObject();
        this.f248303d = false;
        this.f248304e = "";
        this.f248305f = "";
        this.f248306g = "";
        this.f248311l = new GameLiveAppbrandEventService.LivePlayGamePayLoad();
        this.f248312m = 6;
        this.f248313n = new GameLivePlayGameConditionChoosePage(this);
        this.f248315p = false;
        this.f248301b = context;
        this.f248302c = jSONObject;
        this.f248314o = aVar;
        mo118322a(str, i);
        mo118323b();
    }

    /* renamed from: a */
    public final void mo118322a(String str, int i) {
        if (this.f248302c.optBoolean("canJoin", false)) {
            this.f248303d = true;
            this.f248304e = this.f248302c.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            this.f248305f = this.f248302c.optString("subTitle", "");
            this.f248306g = this.f248302c.optString("statusWording", "");
            this.f248310k = this.f248302c.optJSONArray("condition");
            this.f248312m = this.f248302c.optInt("defaultConditionIndex");
            GameLiveAppbrandEventService.LivePlayGamePayLoad livePlayGamePayLoad = this.f248311l;
            livePlayGamePayLoad.f248288e = this.f248304e;
            livePlayGamePayLoad.f248289f = this.f248305f;
            livePlayGamePayLoad.f248290g = this.f248306g;
            livePlayGamePayLoad.f248291h = this.f248302c.optString("teamupExtraData", "");
            GameLiveAppbrandEventService.LivePlayGamePayLoad livePlayGamePayLoad2 = this.f248311l;
            livePlayGamePayLoad2.f248292i = str;
            livePlayGamePayLoad2.f248293j = i;
            livePlayGamePayLoad2.f248287d = this.f248312m;
            livePlayGamePayLoad2.f248294n = this.f248302c.optString("path", "");
            this.f248311l.f248295o = this.f248302c.optInt("sourceType");
            return;
        }
        this.f248303d = false;
    }

    /* renamed from: b */
    public void mo118323b() {
        if (!this.f248303d) {
            C12925w wVar = new C12925w(this.f248301b, 0, false, false);
            this.f248300a = wVar;
            wVar.f36937s = new a$$a(this);
            wVar.f36933o = true;
            wVar.mo12470j(C0966R.C0971layout.f6410e2);
            ((ViewGroup) this.f248300a.f36927f.findViewById(C0966R.C0970id.eol)).setOnClickListener(new a$$b(this));
            this.f248300a.mo5086o();
            return;
        }
        if (this.f248300a == null) {
            this.f248300a = new C12925w(this.f248301b, 0, true, false);
            C12925w wVar2 = new C12925w(this.f248301b, 0, false, false);
            this.f248300a = wVar2;
            wVar2.f36937s = new a$$c(this);
            wVar2.f36933o = true;
            wVar2.mo12470j(C0966R.C0971layout.f6414e6);
            View view = this.f248300a.f36927f;
            view.findViewById(C0966R.C0970id.eok).setOnClickListener(new a$$d(this));
            ((ViewGroup) view.findViewById(C0966R.C0970id.eol)).setOnClickListener(new a$$e(this));
            this.f248307h = (TextView) view.findViewById(C0966R.C0970id.eom);
            this.f248308i = (TextView) view.findViewById(C0966R.C0970id.eon);
            this.f248309j = (TextView) view.findViewById(C0966R.C0970id.eoo);
            ((ViewGroup) view.findViewById(C0966R.C0970id.eop)).setOnClickListener(new a$$f(this));
        }
        this.f248307h.setText(this.f248304e);
        this.f248308i.setText(this.f248305f);
        this.f248309j.setText(this.f248306g);
        TextView textView = (TextView) this.f248300a.f36927f.findViewById(C0966R.C0970id.hso);
        int i = 0;
        while (true) {
            if (i >= this.f248310k.length()) {
                break;
            }
            try {
                JSONObject jSONObject = this.f248310k.getJSONObject(i);
                if (jSONObject.optInt("conditionId") == this.f248312m) {
                    textView.setText(jSONObject.optString("wording"));
                    break;
                }
                if (i == this.f248310k.length() - 1) {
                    int optInt = jSONObject.optInt("conditionId");
                    this.f248312m = optInt;
                    this.f248311l.f248287d = optInt;
                    textView.setText(jSONObject.optString("wording"));
                }
                i++;
            } catch (Exception e) {
                Log.m105920e("GameLivePlayGameAnchorInviteWidget", Util.stackTraceToString(e));
            }
        }
        this.f248300a.mo5086o();
        GameLiveAppbrandEventService.LivePlayGamePayLoad livePlayGamePayLoad = this.f248311l;
        livePlayGamePayLoad.f248296p = 1;
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionPlayGamePanelShowReport, (String) null, 0, livePlayGamePayLoad), GameLiveCommonService.C80854b.class, (C1256g) null);
    }
}

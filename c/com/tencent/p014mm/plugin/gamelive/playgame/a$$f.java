package com.tencent.p014mm.plugin.gamelive.playgame;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.a$$f */
public final /* synthetic */ class a$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C85232a f19374d;

    public /* synthetic */ a$$f(C85232a aVar) {
        this.f19374d = aVar;
    }

    public final void onClick(View view) {
        C85232a aVar = this.f19374d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
        GameLivePlayGameConditionChoosePage gameLivePlayGameConditionChoosePage = aVar.f248313n;
        JSONArray jSONArray = aVar.f248310k;
        int i = aVar.f248312m;
        gameLivePlayGameConditionChoosePage.getClass();
        try {
            gameLivePlayGameConditionChoosePage.f19365d.clear();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                gameLivePlayGameConditionChoosePage.f19365d.add(new GameLivePlayGameConditionChoosePage$$d(gameLivePlayGameConditionChoosePage, jSONObject.optInt("conditionId"), jSONObject.optString("wording")));
            }
            Log.m105925i("GameLivePlayGameConditionChoosePage", "condition size:%d", Integer.valueOf(gameLivePlayGameConditionChoosePage.f19365d.size()));
        } catch (JSONException unused) {
        }
        gameLivePlayGameConditionChoosePage.f19366e = i;
        aVar.f248300a.mo12468h(aVar.f248313n);
        C117292a.m165361g(aVar, "com/tencent/mm/plugin/gamelive/playgame/GameLivePlayGameAnchorInviteWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

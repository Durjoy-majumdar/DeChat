package com.tencent.p014mm.plugin.gamelive.playgame;

import android.text.TextUtils;
import cm1.C0740i2;
import tf1.C13914m;

/* renamed from: com.tencent.mm.plugin.gamelive.playgame.GameLivePlayGameConditionChoosePage$$d */
public class GameLivePlayGameConditionChoosePage$$d implements C0740i2 {

    /* renamed from: d */
    public String f19369d;

    /* renamed from: e */
    public int f19370e;

    public GameLivePlayGameConditionChoosePage$$d(GameLivePlayGameConditionChoosePage gameLivePlayGameConditionChoosePage, int i, String str) {
        this.f19369d = str;
        this.f19370e = i;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        if (!(mVar instanceof GameLivePlayGameConditionChoosePage$$d)) {
            return 1;
        }
        GameLivePlayGameConditionChoosePage$$d gameLivePlayGameConditionChoosePage$$d = (GameLivePlayGameConditionChoosePage$$d) mVar;
        return (this.f19370e != gameLivePlayGameConditionChoosePage$$d.f19370e || !TextUtils.equals(this.f19369d, gameLivePlayGameConditionChoosePage$$d.f19369d)) ? 1 : 0;
    }

    public long getItemId() {
        return (long) this.f19370e;
    }
}

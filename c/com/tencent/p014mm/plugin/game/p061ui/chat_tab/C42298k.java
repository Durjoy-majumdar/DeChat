package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.game.C4443h;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.k */
public class C42298k {
    /* renamed from: a */
    public static GameTabWidget2 m45996a(Activity activity, View view) {
        if (activity == null || !(view instanceof FrameLayout)) {
            return null;
        }
        GameTabData2 gameTabData2 = (GameTabData2) activity.getIntent().getParcelableExtra("game_tab_data");
        String stringExtra = activity.getIntent().getStringExtra("game_tab_key");
        if (gameTabData2 == null || gameTabData2.f114262d.size() <= 1) {
            return null;
        }
        GameTabWidget2 gameTabWidget2 = new GameTabWidget2(activity);
        gameTabWidget2.mo66331b(gameTabData2, stringExtra);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ((FrameLayout) view).addView(gameTabWidget2, layoutParams);
        return gameTabWidget2;
    }

    /* renamed from: b */
    public static void m45997b(Context context) {
        context.sendBroadcast(new Intent("com.tencent.mm.game.ACTION_EXIT"), C4443h.f19181a);
    }
}

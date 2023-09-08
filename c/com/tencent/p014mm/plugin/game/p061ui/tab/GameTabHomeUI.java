package com.tencent.p014mm.plugin.game.p061ui.tab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.game.model.GameTabData;
import com.tencent.p014mm.plugin.game.p061ui.GameCenterUI5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import sy1.C48505a;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI */
public class GameTabHomeUI extends GameCenterUI5 {

    /* renamed from: D */
    public static final /* synthetic */ int f114673D = 0;

    /* renamed from: B */
    public String f114674B;

    /* renamed from: C */
    public BroadcastReceiver f114675C = new C42391b();

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI$a */
    public class C42390a implements MenuItem.OnMenuItemClickListener {
        public C42390a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameTabHomeUI gameTabHomeUI = GameTabHomeUI.this;
            int i = GameTabHomeUI.f114673D;
            gameTabHomeUI.mo66456O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI$b */
    public class C42391b extends BroadcastReceiver {
        public C42391b() {
        }

        public void onReceive(Context context, Intent intent) {
            GameTabHomeUI gameTabHomeUI;
            if (intent != null && "com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) && (gameTabHomeUI = GameTabHomeUI.this) != null && !gameTabHomeUI.isFinishing()) {
                Log.m105924i("MicroMsg.GameTabHomeUI", "GameTabHomeUI exit!");
                GameTabHomeUI.this.finish();
            }
        }
    }

    /* renamed from: O7 */
    public final void mo66456O7() {
        Log.m105924i("MicroMsg.GameTabHomeUI", "GameTabHomeUI goBack!");
        if (Util.nullAsNil(getIntent().getStringExtra("jump_find_more_friends")).equals("jump_find_more_friends")) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 2);
            C88144b.m109801s(this, ".ui.LauncherUI", intent, (Bundle) null);
            finish();
            overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
            Log.m105924i("MicroMsg.GameTabHomeUI", "back to FindMoreFriendsUI");
        }
        sendBroadcast(new Intent("com.tencent.mm.game.ACTION_EXIT"), C4443h.f19181a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.GameTabHomeUI", "%s create", getClass().getSimpleName());
        this.f114674B = getIntent().getStringExtra("tab_key");
        C48505a aVar = new C48505a(this);
        ((GameTabWidget) findViewById(C0966R.C0970id.kda)).setAdapter(aVar);
        String str = this.f114674B;
        aVar.f129728e = (GameTabData) getIntent().getParcelableExtra("tab_data");
        aVar.f129729f = str;
        aVar.notifyDataSetChanged();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        registerReceiver(this.f114675C, intentFilter, C4443h.f19181a, (Handler) null);
        setBackBtn(new C42390a());
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f114675C);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo66456O7();
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            String stringExtra = intent.getStringExtra("tab_key");
            if (!Util.nullAsNil(this.f114674B).equals(stringExtra)) {
                Log.m105925i("MicroMsg.GameTabHomeUI", "reload %s. current_key:%s, next_key:%s", getClass().getSimpleName(), this.f114674B, stringExtra);
                finish();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/tab/GameTabHomeUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/tab/GameTabHomeUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        }
    }

    public void onResume() {
        super.onResume();
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }
}

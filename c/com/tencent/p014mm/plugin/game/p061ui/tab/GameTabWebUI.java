package com.tencent.p014mm.plugin.game.p061ui.tab;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.game.model.GameTabData;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameWebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import sy1.C48505a;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWebUI */
public class GameTabWebUI extends GameWebViewUI {

    /* renamed from: b3 */
    public Activity f114678b3;

    /* renamed from: c3 */
    public String f114679c3;

    /* renamed from: d3 */
    public BroadcastReceiver f114680d3 = new C42393b();

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWebUI$a */
    public class C42392a implements MenuItem.OnMenuItemClickListener {
        public C42392a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameTabWebUI.this.mo66459s8();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWebUI$b */
    public class C42393b extends BroadcastReceiver {
        public C42393b() {
        }

        public void onReceive(Context context, Intent intent) {
            Activity activity;
            if (intent != null && "com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) && (activity = GameTabWebUI.this.f114678b3) != null && !activity.isFinishing()) {
                Log.m105925i("MicroMsg.GameTabWebUI", "%s exit!", GameTabWebUI.this.f114678b3.getClass().getSimpleName());
                GameTabWebUI.this.f114678b3.finish();
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo66459s8();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105925i("MicroMsg.GameTabWebUI", "%s create", getClass().getSimpleName());
        this.f114678b3 = this;
        this.f114679c3 = getIntent().getStringExtra("tab_key");
        GameTabWidget gameTabWidget = new GameTabWidget(this);
        C48505a aVar = new C48505a(this);
        gameTabWidget.setAdapter(aVar);
        String str = this.f114679c3;
        aVar.f129728e = (GameTabData) getIntent().getParcelableExtra("tab_data");
        aVar.f129729f = str;
        aVar.notifyDataSetChanged();
        ((LinearLayout) findViewById(C0966R.C0970id.lmr)).addView(gameTabWidget);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        registerReceiver(this.f114680d3, intentFilter, C4443h.f19181a, (Handler) null);
        setBackBtn(new C42392a());
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f114680d3);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            if (!Util.nullAsNil(this.f114679c3).equals(intent.getStringExtra("tab_key"))) {
                Log.m105925i("MicroMsg.GameTabWebUI", "reload %s", this.f114678b3.getClass().getSimpleName());
                finish();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/tab/GameTabWebUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/tab/GameTabWebUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        }
    }

    /* renamed from: s8 */
    public void mo66459s8() {
        Log.m105925i("MicroMsg.GameTabWebUI", "%s goBack!", this.f114678b3.getClass().getSimpleName());
        if (Util.nullAsNil(getIntent().getStringExtra("jump_find_more_friends")).equals("jump_find_more_friends")) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 2);
            C88144b.m109801s(this, ".ui.LauncherUI", intent, (Bundle) null);
            finish();
            overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
            Log.m105924i("MicroMsg.GameTabWebUI", "back to FindMoreFriendsUI.");
        }
        sendBroadcast(new Intent("com.tencent.mm.game.ACTION_EXIT"), C4443h.f19181a);
    }
}

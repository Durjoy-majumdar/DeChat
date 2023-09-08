package com.tencent.p014mm.plugin.game.p061ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceCategory;
import com.tencent.p014mm.plugin.game.commlib.C30075d;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedHashMap;
import java.util.Map;
import nj3.C76879j;
import pj3.C47511g;
import uy1.C52638a;

/* renamed from: com.tencent.mm.plugin.game.ui.GameRegionSelectUI */
public class GameRegionSelectUI extends MMPreference {

    /* renamed from: d */
    public C47511g f114147d;

    /* renamed from: e */
    public GameRegionPreference.C42228a f114148e;

    /* renamed from: f */
    public Map<String, GameRegionPreference.C42228a> f114149f;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameRegionSelectUI$a */
    public class C42229a implements MenuItem.OnMenuItemClickListener {
        public C42229a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameRegionSelectUI.this.setResult(0);
            GameRegionSelectUI.this.hideVKB();
            GameRegionSelectUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameRegionSelectUI$b */
    public class C42230b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.game.ui.GameRegionSelectUI$b$a */
        public class C42231a implements DialogInterface.OnClickListener {
            public C42231a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                GameRegionSelectUI.this.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
                GameRegionSelectUI.m45899H7(GameRegionSelectUI.this);
                Intent intent = new Intent();
                GameRegionPreference.C42228a g = C42046d.m45748g(GameRegionSelectUI.this);
                if (g != null) {
                    intent.putExtra("gameRegionName", C42046d.m45750i(g));
                    GameRegionSelectUI.this.setResult(-1, intent);
                } else {
                    GameRegionSelectUI.this.setResult(1);
                }
                GameRegionSelectUI.this.finish();
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.GameRegionSelectUI$b$b */
        public class C42232b implements DialogInterface.OnClickListener {
            public C42232b(C42230b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C42230b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            boolean z = false;
            if (GameRegionSelectUI.this.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) != 1) {
                z = true;
            }
            if (z) {
                GameRegionSelectUI gameRegionSelectUI = GameRegionSelectUI.this;
                C76879j.m92717K(gameRegionSelectUI, true, gameRegionSelectUI.getString(C0966R.string.fbk), "", GameRegionSelectUI.this.getString(C0966R.string.fbl), GameRegionSelectUI.this.getString(C0966R.string.fbj), new C42231a(), new C42232b(this));
            } else {
                GameRegionSelectUI.m45899H7(GameRegionSelectUI.this);
                Intent intent = new Intent();
                GameRegionPreference.C42228a g = C42046d.m45748g(GameRegionSelectUI.this);
                if (g != null) {
                    intent.putExtra("gameRegionName", C42046d.m45750i(g));
                    GameRegionSelectUI.this.setResult(-1, intent);
                } else {
                    GameRegionSelectUI.this.setResult(1);
                }
                GameRegionSelectUI.this.finish();
            }
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m45899H7(GameRegionSelectUI gameRegionSelectUI) {
        GameRegionPreference.C42228a aVar = gameRegionSelectUI.f114148e;
        if (aVar != null) {
            gameRegionSelectUI.getSharedPreferences("game_center_pref", 0).edit().putString("game_region_code", aVar.f114144d).commit();
            C52638a.C52640b.f146975a.f146972b = true;
            C30075d.m38954a().mo57102b(true, 7);
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.fbn);
        setBackBtn(new C42229a());
        addTextOptionMenu(0, getString(C0966R.string.fbm), new C42230b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        this.f114147d.removeAll();
        this.f114149f = C52638a.C52640b.f146975a.mo73589b();
        GameRegionPreference.C42228a g = C42046d.m45748g(this);
        if (g != null) {
            g.f114145e = true;
        }
        for (GameRegionPreference.C42228a aVar : ((LinkedHashMap) this.f114149f).values()) {
            if (aVar != null) {
                GameRegionPreference gameRegionPreference = new GameRegionPreference(this, (AttributeSet) null);
                if (Util.isNullOrNil(aVar.f114144d)) {
                    Log.m105920e("MicroMsg.GameRegionPreference", "setData region error");
                } else {
                    gameRegionPreference.f114140J = aVar;
                    gameRegionPreference.mo26273A(aVar.f114144d);
                }
                if (aVar.f114146f) {
                    this.f114147d.mo72524h(gameRegionPreference, 0);
                } else {
                    this.f114147d.mo72527k(gameRegionPreference);
                }
            }
        }
        this.f114147d.mo72527k(new PreferenceCategory(this, (AttributeSet) null));
        this.f114147d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f114147d = getPreferenceScreen();
        C41864d.m45384a(this);
        initView();
    }

    public void onDestroy() {
        C52638a aVar = C52638a.C52640b.f146975a;
        synchronized (aVar) {
            Map<String, GameRegionPreference.C42228a> map = aVar.f146971a;
            if (map != null) {
                for (GameRegionPreference.C42228a aVar2 : ((LinkedHashMap) map).values()) {
                    aVar2.f114145e = false;
                }
            }
        }
        C41864d.m45388e(this);
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        GameRegionPreference.C42228a aVar;
        if (!(preference instanceof GameRegionPreference) || (aVar = ((GameRegionPreference) preference).f114140J) == null) {
            return false;
        }
        this.f114148e = aVar;
        for (GameRegionPreference.C42228a aVar2 : ((LinkedHashMap) this.f114149f).values()) {
            aVar2.f114145e = false;
        }
        aVar.f114145e = true;
        gVar.notifyDataSetChanged();
        return true;
    }
}

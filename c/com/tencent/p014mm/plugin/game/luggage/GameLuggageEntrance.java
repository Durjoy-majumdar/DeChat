package com.tencent.p014mm.plugin.game.luggage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.luggage.GameLuggageEntrance */
public class GameLuggageEntrance extends MMActivity {

    /* renamed from: d */
    public static final String f19185d = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/centerbox/index_v6.html?wechat_pkgid=index_v6&abt=21");

    /* renamed from: com.tencent.mm.plugin.game.luggage.GameLuggageEntrance$a */
    public class C4444a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f19186d;

        public C4444a(EditText editText) {
            this.f19186d = editText;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = this.f19186d.getText().toString();
            if (!Util.isNullOrNil(obj)) {
                new Bundle().putString("rawUrl", obj);
                GameLuggageEntrance gameLuggageEntrance = GameLuggageEntrance.this;
                String str = GameLuggageEntrance.f19185d;
                gameLuggageEntrance.getClass();
                Intent intent = C44594n1.m49045a() ? new Intent(gameLuggageEntrance, MMLuggageGameWebViewUI.class) : new Intent(gameLuggageEntrance, LuggageGameWebViewUI.class);
                intent.putExtra("rawUrl", obj);
                GameLuggageEntrance gameLuggageEntrance2 = GameLuggageEntrance.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                GameLuggageEntrance gameLuggageEntrance3 = gameLuggageEntrance2;
                C117292a.m165358d(gameLuggageEntrance3, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                gameLuggageEntrance2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(gameLuggageEntrance3, "com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.GameLuggageEntrance$b */
    public class C4445b implements View.OnClickListener {
        public C4445b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            String str = GameLuggageEntrance.f19185d;
            bundle.putString("rawUrl", str);
            GameLuggageEntrance gameLuggageEntrance = GameLuggageEntrance.this;
            gameLuggageEntrance.getClass();
            Intent intent = C44594n1.m49045a() ? new Intent(gameLuggageEntrance, MMLuggageGameWebViewUI.class) : new Intent(gameLuggageEntrance, LuggageGameWebViewUI.class);
            intent.putExtra("rawUrl", str);
            GameLuggageEntrance gameLuggageEntrance2 = GameLuggageEntrance.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            GameLuggageEntrance gameLuggageEntrance3 = gameLuggageEntrance2;
            C117292a.m165358d(gameLuggageEntrance3, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            gameLuggageEntrance2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(gameLuggageEntrance3, "com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/luggage/GameLuggageEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.GameLuggageEntrance$c */
    public class C4446c implements MenuItem.OnMenuItemClickListener {
        public C4446c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameLuggageEntrance.this.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_k;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Button) findViewById(C0966R.C0970id.fem)).setOnClickListener(new C4444a((EditText) findViewById(C0966R.C0970id.cbg)));
        ((Button) findViewById(C0966R.C0970id.fex)).setOnClickListener(new C4445b());
        setBackBtn(new C4446c());
    }
}

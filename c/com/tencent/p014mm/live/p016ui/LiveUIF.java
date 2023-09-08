package com.tencent.p014mm.live.p016ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.view.LiveVisitorPluginLayout;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import pj3.C47511g;
import qo3.C77407n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/LiveUIF;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.live.ui.LiveUIF */
public final class LiveUIF extends MMPreference {

    /* renamed from: d */
    public static final /* synthetic */ int f157233d = 0;

    public int getResourceId() {
        return C0966R.xml.f8911b7;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str;
        Class<LiveUIA> cls = LiveUIA.class;
        String str2 = preference != null ? preference.f121285r : null;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -229370935:
                    if (str2.equals("source_camera")) {
                        Intent intent = new Intent(this, cls);
                        intent.putExtra("KEY_PARAMS_CONFIG", (LiveConfig) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG"));
                        intent.addFlags(268435456);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/live/ui/LiveUIF", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/live/ui/LiveUIF", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    }
                    break;
                case 230691088:
                    str = "source_screen";
                    break;
                case 965244314:
                    if (str2.equals("mlvb_live_room")) {
                        Log.m105924i("MicroMsg.LiveEntranceUI", "");
                        AppCompatActivity context = getContext();
                        LayoutInflater.from(context);
                        new C77407n((Context) context, 1, false);
                        new ArrayList();
                        new ArrayList();
                        return true;
                    }
                    break;
                case 1008515414:
                    str = "live_demo";
                    break;
                case 1009055256:
                    if (str2.equals("live_view")) {
                        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
                        bVar.f157091a = 1;
                        bVar.f157095e = "";
                        bVar.f157092b = "19709589717@chatroom";
                        bVar.f157093c = 0;
                        bVar.f157094d = "";
                        bVar.f157096f = "";
                        LiveConfig a = bVar.mo76374a();
                        a.f157067h.put(0, LiveVisitorPluginLayout.class.getName());
                        Intent intent2 = new Intent(this, cls);
                        intent2.putExtra("KEY_PARAMS_CONFIG", a);
                        intent2.addFlags(268435456);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/live/ui/LiveUIF", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/live/ui/LiveUIF", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return true;
                    }
                    break;
            }
            str2.equals(str);
        }
        return false;
    }
}

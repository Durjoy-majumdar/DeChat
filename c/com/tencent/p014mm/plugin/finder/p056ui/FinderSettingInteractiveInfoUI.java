package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavFeedUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLikeFeedGridUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8808v4;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import l60.C99344b;
import pj3.C47511g;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rs1.C13442s8;
import te3.C48996cf1;
import up1.C27696y;
import wp1.C15587j;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI */
public final class FinderSettingInteractiveInfoUI extends MMPreference {

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI$a */
    public static final class C3730a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingInteractiveInfoUI f17094d;

        public C3730a(FinderSettingInteractiveInfoUI finderSettingInteractiveInfoUI) {
            this.f17094d = finderSettingInteractiveInfoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17094d.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8901aw;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.dcx);
        setBackBtn(new C3730a(this));
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3743cv);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer c0 = C58784w3.m68436c0(w3Var, 1, false, 2, (Object) null);
        int intValue = c0 != null ? c0.intValue() : C0966R.raw.icons_filled_channels_like_thick;
        Preference a = getPreferenceScreen().mo72519a("settings_liked");
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String string = getContext().getString(C0966R.string.hep);
        C87412m.m108593f(string, "context.getString(\n     …der_my_inactive_feed_new)");
        a.mo69924H(w3Var.mo83957q1(context, string, '#', intValue, C0966R.color.a7f, dimension, dimension));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Preference preference2 = preference;
        Class cls = C58684b.class;
        String str = preference2 != null ? preference2.f121285r : null;
        Log.m105924i("FinderSettingInteractiveInfoUI", "click " + str);
        if (str == null) {
            return true;
        }
        switch (str.hashCode()) {
            case -1556120431:
                if (!str.equals("settings_liked")) {
                    return true;
                }
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this, getIntent(), 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                getIntent().setClass(this, FinderLikeFeedGridUI.class);
                getIntent().putExtra("finder_username", C66785b.f191882e.mo90662O5());
                Intent intent = getIntent();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleLikedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleLikedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case -1161289907:
                if (!str.equals("settings_follow")) {
                    return true;
                }
                Intent intent2 = new Intent();
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this, intent2, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                intent2.setClass(this, FinderFollowListUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleFollowClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleFollowClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            case -6902322:
                if (!str.equals("settings_mention")) {
                    return true;
                }
                ((C58684b) C86312j.m106911c(cls)).dy0(this, (Intent) null);
                return true;
            case 734000174:
                if (!str.equals("settings_privacy_msg")) {
                    return true;
                }
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                C58684b.cy0((C58684b) c, this, (Intent) null, 2, (Object) null);
                return true;
            case 1091629613:
                if (!str.equals("settings_collected")) {
                    return true;
                }
                Intent intent3 = new Intent();
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, this, intent3, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                intent3.setClass(this, FinderFavFeedUI.class);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent3);
                C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleCollectedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/finder/ui/FinderSettingInteractiveInfoUI", "handleCollectedClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            default:
                return true;
        }
    }

    public void onResume() {
        String str;
        super.onResume();
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            getPreferenceScreen().mo72529n("settings_privacy_msg", true);
        }
        C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffIcon");
        if (a == null || (str = a.f131694e) == null) {
            str = "";
        }
        Preference a2 = getPreferenceScreen().mo72519a("settings_collected");
        IconPreference iconPreference = a2 instanceof IconPreference ? (IconPreference) a2 : null;
        if (Util.isNullOrNil(str)) {
            int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3743cv);
            if (iconPreference != null) {
                C58784w3 w3Var = C58784w3.f168295a;
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                String string = getContext().getString(C0966R.string.fnn);
                C87412m.m108593f(string, "context.getString(com.te…ring.finder_fav_feed_new)");
                iconPreference.mo69924H(w3Var.mo83957q1(context, string, '#', C0966R.raw.icons_outlined_star_new, C0966R.color.a7f, dimension, dimension));
                return;
            }
            return;
        }
        C39818r rVar = C39818r.f106831a;
        C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
        C3869o3 o3Var = new C3869o3(this, iconPreference);
        b.getClass();
        b.f291320d = o3Var;
        b.mo85953c();
    }
}

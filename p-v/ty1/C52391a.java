package ty1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.luggage.page.C41948f;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.game.model.LocalJumpInfo;
import com.tencent.p014mm.plugin.game.model.LocalTabCornerSetting;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.ChatRoomTabUI;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2;
import com.tencent.p014mm.plugin.game.p061ui.web.GameWebSettingActionBar$initChatTab$2;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import k60.C99099a;
import k60.C99101e;
import n60.C100075f;
import p828wa.C53118n;
import p828wa.C53133t;

/* renamed from: ty1.a */
public final class C52391a extends C41948f {
    public C52391a(C53118n nVar, C53133t tVar, Bundle bundle, String str) {
        super(nVar, tVar, bundle);
        String str2;
        C43661n0 n0Var = this.f117951u;
        C87412m.m108592e(n0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar");
        C52393c cVar = (C52393c) n0Var;
        cVar.f146462Y0 = str;
        GameTabData2 gameTabData2 = (GameTabData2) cVar.f146464p0.getParcelable("game_tab_data");
        String str3 = cVar.f146462Y0;
        if (str3 == null || str3.length() == 0) {
            cVar.f146460W0 = true;
            str2 = cVar.f146464p0.getString("game_tab_key");
        } else {
            str2 = cVar.f146462Y0;
        }
        if (gameTabData2 != null) {
            if (!(str2 == null || str2.length() == 0)) {
                cVar.mo67957a(true);
                GameTabData2.TabItem tabItem = (GameTabData2.TabItem) gameTabData2.f114262d.get(str2);
                if (tabItem != null) {
                    List<LocalTabCornerSetting> list = tabItem.f114266A;
                    if (!(list == null || ((ArrayList) list).isEmpty())) {
                        List<LocalTabCornerSetting> list2 = tabItem.f114266A;
                        C87412m.m108593f(list2, "tabItem.topCornerSettings");
                        Iterator it = ((ArrayList) list2).iterator();
                        while (it.hasNext()) {
                            LocalTabCornerSetting localTabCornerSetting = (LocalTabCornerSetting) it.next();
                            View inflate = C85868k2.m106137b(cVar.getContext()).inflate(C0966R.C0971layout.cvz, cVar.f117999o, false);
                            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.n1l);
                            cVar.f146453Q0.add(imageView);
                            String str4 = "";
                            if (C87412m.m108589b(localTabCornerSetting.f113214d, "chat")) {
                                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str4), GameTabWidget2.C42269d.class, (C1256g) null);
                                cVar.f146465x0 = (ImageView) inflate.findViewById(C0966R.C0970id.n1_);
                                cVar.f146466y0 = (TextView) inflate.findViewById(C0966R.C0970id.ahv);
                                cVar.post(new C52395d(cVar));
                                Context context = cVar.f146459W.f148196d;
                                if (context instanceof FragmentActivity) {
                                    ((FragmentActivity) context).getLifecycle().addObserver(new GameWebSettingActionBar$initChatTab$2(cVar));
                                }
                                LocalJumpInfo localJumpInfo = localTabCornerSetting.f113217g;
                                if (localJumpInfo != null && localJumpInfo.f113210d == 4) {
                                    Uri parse = Uri.parse(localJumpInfo.f113211e);
                                    if (C87412m.m108589b(parse.getPath(), "chat")) {
                                        try {
                                            cVar.f146456T0 = Integer.parseInt(parse.getQueryParameter("sourceSence"));
                                        } catch (NumberFormatException unused) {
                                            Log.m105920e("GameWebSettingActionBar", "gamelog parse reportSourceScene error");
                                        }
                                    }
                                }
                                if (C85875k4.m106211z()) {
                                    String str5 = localTabCornerSetting.f113216f;
                                    if (str5 == null || str5.length() == 0) {
                                        C87412m.m108593f(imageView, "imageView");
                                        cVar.mo73392o(imageView, C0966R.raw.game_msg_top_tip);
                                    }
                                }
                                if (!C85875k4.m106211z()) {
                                    String str6 = localTabCornerSetting.f113215e;
                                    if (str6 == null || str6.length() == 0) {
                                        C87412m.m108593f(imageView, "imageView");
                                        cVar.mo73392o(imageView, C0966R.raw.game_msg_top_tip);
                                    }
                                }
                                C99099a aVar = C99101e.f290571b;
                                String str7 = localTabCornerSetting.f113215e;
                                str4 = str7 != null ? str7 : str4;
                                C87412m.m108593f(imageView, "imageView");
                                C100075f.C100076a aVar2 = new C100075f.C100076a();
                                aVar2.f293176b = true;
                                aVar2.f293175a = true;
                                aVar.mo138473h(str4, imageView, aVar2.mo139398a(), new C52396e(localTabCornerSetting, imageView, cVar));
                            } else {
                                C99099a aVar3 = C99101e.f290571b;
                                String str8 = localTabCornerSetting.f113215e;
                                str4 = str8 != null ? str8 : str4;
                                C87412m.m108593f(imageView, "imageView");
                                C100075f.C100076a aVar4 = new C100075f.C100076a();
                                aVar4.f293176b = true;
                                aVar4.f293175a = true;
                                aVar3.mo138473h(str4, imageView, aVar4.mo139398a(), new C52397f(localTabCornerSetting, imageView));
                            }
                            inflate.setOnClickListener(new C52398g(cVar, localTabCornerSetting));
                            cVar.f117999o.addView(inflate, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g0 */
    public void mo65823g0(String str) {
        if (!Util.isNullOrNil(str)) {
            super.mo65823g0(str);
            GameWebPage gameWebPage = (GameWebPage) ((ConcurrentHashMap) this.f112994F1).get(str);
            C43661n0 n0Var = gameWebPage != null ? gameWebPage.f117951u : null;
            if (n0Var != null && (n0Var instanceof C52393c)) {
                C52393c cVar = (C52393c) n0Var;
                if (C87412m.m108589b(str, cVar.f146462Y0)) {
                    cVar.f146460W0 = true;
                    if (!cVar.f146455S0 && cVar.f146461X0) {
                        cVar.f146455S0 = true;
                        cVar.mo73394q(false, str);
                    }
                }
            }
        }
    }

    /* renamed from: k0 */
    public void mo65827k0(String str, String str2, boolean z) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && !((ConcurrentHashMap) this.f112994F1).containsKey(str) && this.f112997I1 != null) {
            Log.m105925i("GameTabSettingWebPage", "insertTabHomeWeb, tabKey:%s, url:%s", str, str2);
            Bundle bundle = new Bundle();
            bundle.putAll(this.f148261n);
            bundle.putString("rawUrl", str2);
            C52391a aVar = new C52391a(this.f148198f, (C53133t) null, bundle, str);
            C43661n0 n0Var = aVar.f117951u;
            if (n0Var != null) {
                n0Var.mo67958b();
            }
            aVar.f112972r1 = this;
            aVar.f112973s1 = z;
            MMActivity mMActivity = this.f113002N1;
            if (mMActivity != null && mMActivity.isPaused() && z) {
                aVar.f112975u1 = true;
                Log.m105925i("GameTabSettingWebPage", "mockFetchFcp, url:%s", str2);
            }
            mo65829m0(aVar, str);
            this.f112997I1.addView(aVar.f148258h, 0, new FrameLayout.LayoutParams(-1, -1));
            aVar.mo65794c(str2, bundle);
            Map<String, GameWebPage> map = this.f112994F1;
            C87412m.m108593f(map, "mTabPageMap");
            ((ConcurrentHashMap) map).put(str, aVar);
        }
    }

    /* renamed from: l0 */
    public void mo65828l0() {
        Class<ChatRoomTabUI> cls = ChatRoomTabUI.class;
        Intent intent = new Intent(this.f148196d, cls);
        intent.putExtra("game_need_bottom_tab", false);
        Log.m105924i("GameTabSettingWebPage", "jumpToChat chatClassName = " + cls);
        Context context = this.f148196d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/web/GameTabSettingWebPage", "jumpToChat", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/web/GameTabSettingWebPage", "jumpToChat", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: n */
    public View mo65804n() {
        Bundle bundle = this.f148261n;
        C87412m.m108593f(bundle, "params");
        this.f117951u = new C52393c(this, bundle);
        Log.m105924i("GameTabSettingWebPage", "createActionBar GameWebSettingActionBar");
        C43661n0 n0Var = this.f117951u;
        C87412m.m108593f(n0Var, "mActionBar");
        return n0Var;
    }
}

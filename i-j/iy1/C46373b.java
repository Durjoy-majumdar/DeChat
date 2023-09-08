package iy1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.luggage.C41925k;
import com.tencent.p014mm.plugin.game.luggage.C41926l;
import com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI;
import com.tencent.p014mm.plugin.game.luggage.api.GameAtSomeoneConfig;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.AtSomeoneView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C8479f0;
import gy3.C87412m;
import iy1.C46370a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONObject;
import uw1.C52628f;
import yx1.C53631b;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: iy1.b */
public final class C46373b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuggageGameWebViewUI f124965d;

    /* renamed from: e */
    public final /* synthetic */ GameAtSomeoneConfig f124966e;

    /* renamed from: iy1.b$a */
    public static final class C46374a implements AtSomeoneView.C42002f {

        /* renamed from: a */
        public final /* synthetic */ GameAtSomeoneConfig f124967a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<AtSomeoneView> f124968b;

        public C46374a(GameAtSomeoneConfig gameAtSomeoneConfig, C8479f0<AtSomeoneView> f0Var) {
            this.f124967a = gameAtSomeoneConfig;
            this.f124968b = f0Var;
        }

        /* renamed from: a */
        public final void mo65902a(boolean z) {
            String str;
            if (z && (str = this.f124967a.f112889d) != null && !C87412m.m108589b(str, "")) {
                ((AtSomeoneView) this.f124968b.f27484d).mo65896D1(this.f124967a.f112889d);
            }
        }
    }

    /* renamed from: iy1.b$b */
    public static final class C46375b implements MRecyclerView.C40583d {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<AtSomeoneView> f124969a;

        /* renamed from: b */
        public final /* synthetic */ GameAtSomeoneConfig f124970b;

        public C46375b(C8479f0<AtSomeoneView> f0Var, GameAtSomeoneConfig gameAtSomeoneConfig) {
            this.f124969a = f0Var;
            this.f124970b = gameAtSomeoneConfig;
        }

        /* renamed from: a */
        public void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
            C52628f fVar;
            ImageView imageView = view != null ? (ImageView) view.findViewById(C0966R.C0970id.aa6) : null;
            if (imageView != null && (fVar = (C52628f) ((LinkedList) ((AtSomeoneView) this.f124969a.f27484d).getmAdapter().f113125e).get(i)) != null) {
                JSONObject jSONObject = new JSONObject();
                C104289g gVar = new C104289g();
                gVar.put("userName", fVar.f146943d);
                gVar.put("nickName", fVar.f146944e);
                jSONObject.put("gamecenterIdentifier", this.f124970b.f112894i);
                jSONObject.put("userData", gVar.toString());
                if (!((ArrayList) C46370a.f124961b).contains(fVar.f146943d)) {
                    List<String> list = C46370a.f124961b;
                    String str = fVar.f146943d;
                    C87412m.m108593f(str, "userData.username");
                    ((ArrayList) list).add(str);
                    imageView.setVisibility(0);
                    jSONObject.put("action", "add");
                } else {
                    ((ArrayList) C46370a.f124961b).remove(fVar.f146943d);
                    imageView.setVisibility(8);
                    jSONObject.put("action", "del");
                }
                if (C46370a.f124963d) {
                    String str2 = WeChatProcess.PROCESS_TOOLS;
                    Bundle bundle = new Bundle();
                    GameAtSomeoneConfig gameAtSomeoneConfig = C46370a.f124964e;
                    if (gameAtSomeoneConfig != null) {
                        bundle.putString("identifier", gameAtSomeoneConfig.f112894i);
                        bundle.putString("jsonData", jSONObject.toString());
                        C80907o.m98781d(str2, bundle, C46370a.C46372b.class, (C1256g) null);
                        return;
                    }
                    C87412m.m108603p("atSomeoneConfig");
                    throw null;
                }
                C53631b bVar = C53631b.C53634c.f150678a;
                GameAtSomeoneConfig gameAtSomeoneConfig2 = C46370a.f124964e;
                if (gameAtSomeoneConfig2 != null) {
                    C53631b.C53633b bVar2 = bVar.f150677a.get(gameAtSomeoneConfig2.f112894i);
                    if (bVar2 != null) {
                        bVar2.mo65759b(jSONObject);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("atSomeoneConfig");
                throw null;
            }
        }
    }

    public C46373b(LuggageGameWebViewUI luggageGameWebViewUI, GameAtSomeoneConfig gameAtSomeoneConfig) {
        this.f124965d = luggageGameWebViewUI;
        this.f124966e = gameAtSomeoneConfig;
    }

    public final void run() {
        LayoutInflater from = LayoutInflater.from(this.f124965d);
        FrameLayout frameLayout = this.f124965d.f112860d.f148203c;
        C87412m.m108592e(frameLayout, "null cannot be cast to non-null type android.widget.FrameLayout");
        View inflate = from.inflate(C0966R.C0971layout.d_1, frameLayout, false);
        C87412m.m108593f(inflate, "from(ctx).inflate(R.layo…ew as FrameLayout, false)");
        C8479f0 f0Var = new C8479f0();
        T findViewById = inflate.findViewById(C0966R.C0970id.aa9);
        C87412m.m108593f(findViewById, "atSomeoneUI.findViewById(R.id.at_someone_view)");
        f0Var.f27484d = findViewById;
        Bundle bundle = new Bundle();
        GameAtSomeoneConfig gameAtSomeoneConfig = this.f124966e;
        bundle.putString("contentId", gameAtSomeoneConfig.f112895j);
        String str = gameAtSomeoneConfig.f112896n;
        if (str != null) {
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            bundle.putByteArray("context", bytes);
        }
        bundle.putInt("limit", gameAtSomeoneConfig.f112897o);
        C26827e eVar = C46370a.f124960a;
        String str2 = this.f124966e.f112893h;
        if (str2 == null) {
            str2 = "";
        }
        C46370a.f124962c = str2;
        if (!(C46370a.f124962c.length() == 0)) {
            try {
                C46370a.f124962c = "{\"atList\":" + C46370a.f124962c + '}';
                C26827e j = new C104289g(C46370a.f124962c).mo110108i("atList");
                C87412m.m108593f(j, "jsonObject.getJSONArray(\"atList\")");
                C46370a.f124960a = j;
                int length = j.length();
                int i = 0;
                while (i < length) {
                    C26827e eVar2 = C46370a.f124960a;
                    if (eVar2 != null) {
                        String string = eVar2.getString(i);
                        List<String> list = C46370a.f124961b;
                        C87412m.m108593f(string, "atUserName");
                        ((ArrayList) list).add(string);
                        i++;
                    } else {
                        C87412m.m108603p("atList");
                        throw null;
                    }
                }
            } catch (Exception e) {
                Log.m105921e("AtSomeoneUI", "parse data error, exception : %s", e);
            }
        }
        LuggageGameWebViewUI luggageGameWebViewUI = this.f124965d;
        luggageGameWebViewUI.getClass();
        View view = !luggageGameWebViewUI.f112864h.containsKey("atSomeoneView") ? null : luggageGameWebViewUI.f112864h.get("atSomeoneView");
        if (view != null) {
            T t = (AtSomeoneView) view.findViewById(C0966R.C0970id.aa9);
            if (t != null) {
                f0Var.f27484d = t;
            }
            ((AtSomeoneView) f0Var.f27484d).setSelectedDatas(C46370a.f124961b);
            ((AtSomeoneView) f0Var.f27484d).mo65896D1(this.f124966e.f112889d);
            inflate = view;
        } else {
            ((AtSomeoneView) f0Var.f27484d).setSelectedDatas(C46370a.f124961b);
            AtSomeoneView atSomeoneView = (AtSomeoneView) f0Var.f27484d;
            C46374a aVar = new C46374a(this.f124966e, f0Var);
            atSomeoneView.f113114K1 = bundle;
            atSomeoneView.mo65895C1(aVar);
        }
        ((AtSomeoneView) f0Var.f27484d).setOnItemClickListener(new C46375b(f0Var, this.f124966e));
        GameAtSomeoneConfig gameAtSomeoneConfig2 = this.f124966e;
        if (!gameAtSomeoneConfig2.f112890e || !gameAtSomeoneConfig2.f112891f) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = inflate;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            JSONObject jSONObject = new JSONObject();
            GameAtSomeoneConfig gameAtSomeoneConfig3 = C46370a.f124964e;
            if (gameAtSomeoneConfig3 != null) {
                jSONObject.put("gamecenterIdentifier", gameAtSomeoneConfig3.f112894i);
                jSONObject.put("atUserNameList", new JSONArray(C46370a.f124961b));
                if (C46370a.f124963d) {
                    String str3 = WeChatProcess.PROCESS_TOOLS;
                    Bundle bundle2 = new Bundle();
                    GameAtSomeoneConfig gameAtSomeoneConfig4 = C46370a.f124964e;
                    if (gameAtSomeoneConfig4 != null) {
                        bundle2.putString("identifier", gameAtSomeoneConfig4.f112894i);
                        bundle2.putString("jsonData", jSONObject.toString());
                        C80907o.m98781d(str3, bundle2, C46370a.C46371a.class, (C1256g) null);
                    } else {
                        C87412m.m108603p("atSomeoneConfig");
                        throw null;
                    }
                } else {
                    C53631b bVar = C53631b.C53634c.f150678a;
                    GameAtSomeoneConfig gameAtSomeoneConfig5 = C46370a.f124964e;
                    if (gameAtSomeoneConfig5 != null) {
                        C53631b.C53633b bVar2 = bVar.f150677a.get(gameAtSomeoneConfig5.f112894i);
                        if (bVar2 != null) {
                            bVar2.mo65758a(jSONObject);
                        }
                    } else {
                        C87412m.m108603p("atSomeoneConfig");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("atSomeoneConfig");
                throw null;
            }
        } else {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = inflate;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = this.f124966e.f112898p;
        layoutParams.gravity = 80;
        inflate.setLayoutParams(layoutParams);
        if (this.f124966e.f112891f) {
            LuggageGameWebViewUI luggageGameWebViewUI2 = this.f124965d;
            luggageGameWebViewUI2.getClass();
            if (!luggageGameWebViewUI2.f112864h.containsKey("atSomeoneView")) {
                FrameLayout frameLayout2 = luggageGameWebViewUI2.f112860d.f148203c;
                if (frameLayout2 instanceof FrameLayout) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C41925k(luggageGameWebViewUI2, frameLayout2, inflate, "atSomeoneView"));
                    return;
                }
                return;
            }
            return;
        }
        LuggageGameWebViewUI luggageGameWebViewUI3 = this.f124965d;
        luggageGameWebViewUI3.getClass();
        if (luggageGameWebViewUI3.f112864h.containsKey("atSomeoneView")) {
            FrameLayout frameLayout3 = luggageGameWebViewUI3.f112860d.f148203c;
            if (frameLayout3 instanceof FrameLayout) {
                ((C119157j) C119157j.f356862d).mo183895z(new C41926l(luggageGameWebViewUI3, frameLayout3, "atSomeoneView"));
            }
        }
    }
}

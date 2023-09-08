package com.tencent.p014mm.plugin.game.luggage.p801ui.circle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import c30.C26827e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import lc3.C10485b;
import org.json.JSONException;
import org.json.JSONObject;
import p008bq.C92290u0;
import p171il.C60334f0;
import p171il.C60337u;
import p171il.C98745v;
import p490dl.C58320u;
import p813fl.C45802t0;
import p813fl.C97927q0;
import p813fl.C97939w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(B#\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020\t¢\u0006\u0004\b'\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\f\u001a\u00020\u0002R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/GameEmojiPickView;", "Landroid/widget/FrameLayout;", "", "emojiStr", "Lrx3/b0;", "setEmojiStr", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;", "listener", "setOnTextOperationListener", "", "visibility", "setVisibility", "getImeEmojiConfig", "", "o", "Z", "getCanShowEmoji", "()Z", "setCanShowEmoji", "(Z)V", "canShowEmoji", "p", "Ljava/lang/String;", "getPickEmojiStr", "()Ljava/lang/String;", "setPickEmojiStr", "(Ljava/lang/String;)V", "pickEmojiStr", "q", "I", "getMsourceScene", "()I", "setMsourceScene", "(I)V", "msourceScene", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView */
public final class GameEmojiPickView extends FrameLayout {

    /* renamed from: d */
    public ChatFooterPanel.C72719a f162830d;

    /* renamed from: e */
    public final C98745v f162831e;

    /* renamed from: f */
    public final C45802t0 f162832f;

    /* renamed from: g */
    public GameEmojiPanelRecyclerView f162833g;

    /* renamed from: h */
    public GameEmojiLayoutManager f162834h;

    /* renamed from: i */
    public C60337u f162835i;

    /* renamed from: j */
    public final LinkedList<C97927q0> f162836j = new LinkedList<>();

    /* renamed from: n */
    public String f162837n = "";

    /* renamed from: o */
    public boolean f162838o;

    /* renamed from: p */
    public String f162839p = "";

    /* renamed from: q */
    public int f162840q;

    /* renamed from: r */
    public C26827e f162841r;

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView$a */
    public static final class C56824a implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ GameEmojiPickView f162842a;

        public C56824a(GameEmojiPickView gameEmojiPickView) {
            this.f162842a = gameEmojiPickView;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            String str2;
            ChatFooterPanel.C72719a aVar = this.f162842a.f162830d;
            if (aVar != null) {
                aVar.mo64627b(str);
                GameEmojiPickView gameEmojiPickView = this.f162842a;
                if (gameEmojiPickView.getPickEmojiStr().length() > 0) {
                    str2 = this.f162842a.getPickEmojiStr() + ';' + str;
                } else {
                    str2 = String.valueOf(str);
                }
                gameEmojiPickView.setPickEmojiStr(str2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("emoticonID", str);
                } catch (JSONException unused) {
                }
                C40314g.m43484c(this.f162842a.getContext(), 90, 9001, 1, 2, this.f162842a.getMsourceScene(), jSONObject.toString());
                return;
            }
            C87412m.m108603p("textListener");
            throw null;
        }

        /* renamed from: c */
        public void mo64628c() {
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameEmojiPickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Class cls = C92290u0.class;
        C87412m.m108594g(context, "context");
        C98745v RS = ((C92290u0) C86312j.m106911c(cls)).mo126049RS();
        this.f162831e = RS;
        C60334f0 f0Var = new C60334f0();
        C45802t0 t0Var = new C45802t0();
        this.f162832f = t0Var;
        this.f162835i = ((C92290u0) C86312j.m106911c(cls)).mo126051le(0);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d4y, this, true);
        View findViewById = findViewById(C0966R.C0970id.m66);
        C87412m.m108593f(findViewById, "findViewById(R.id.recycler_emoji_group)");
        this.f162833g = (GameEmojiPanelRecyclerView) findViewById;
        this.f162834h = new GameEmojiLayoutManager(getContext(), f0Var.f171991c);
        this.f162833g.setHasFixedSize(true);
        GameEmojiPanelRecyclerView gameEmojiPanelRecyclerView = this.f162833g;
        C87412m.m108592e(RS, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
        gameEmojiPanelRecyclerView.setAdapter((RecyclerView.C16613e) RS);
        this.f162833g.setSizeResolver(f0Var);
        this.f162833g.setPanelLifeCycle(t0Var);
        this.f162833g.setLayoutManager(this.f162834h);
        this.f162833g.setFocusable(false);
        this.f162833g.setItemAnimator((RecyclerView.C16616j) null);
        RS.mo138124Z(this.f162835i);
        this.f162837n = getImeEmojiConfig();
        mo80238a();
    }

    /* renamed from: a */
    public final void mo80238a() {
        setVisibility(8);
        if (!(this.f162837n.length() == 0)) {
            try {
                C26827e j = new C104289g(this.f162837n).mo110108i("default");
                C87412m.m108593f(j, "jsonObject.getJSONArray(\"default\")");
                this.f162841r = j;
                int length = j.length();
                int i = 0;
                while (i < length) {
                    C26827e eVar = this.f162841r;
                    if (eVar != null) {
                        String string = eVar.getString(i);
                        i++;
                        this.f162836j.add(new C97939w0(new C58320u(string), false, i));
                    } else {
                        C87412m.m108603p("emojiList");
                        throw null;
                    }
                }
                if (!this.f162836j.isEmpty()) {
                    this.f162838o = true;
                }
            } catch (Exception e) {
                Log.m105921e("GameEmojiPickView", "parse data error, exception : %s", e);
            }
        }
    }

    public final boolean getCanShowEmoji() {
        return this.f162838o;
    }

    public final String getImeEmojiConfig() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("IMEmoji");
        return c == null ? "" : c;
    }

    public final int getMsourceScene() {
        return this.f162840q;
    }

    public final String getPickEmojiStr() {
        return this.f162839p;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f162832f.mo71266a();
    }

    public final void setCanShowEmoji(boolean z) {
        this.f162838o = z;
    }

    public final void setEmojiStr(String str) {
        C87412m.m108594g(str, "emojiStr");
        this.f162837n = "{\"default\":" + str + '}';
        this.f162836j.clear();
        mo80238a();
        this.f162831e.mo138125c(this.f162836j);
        this.f162831e.notifyDataSetChanged();
    }

    public final void setMsourceScene(int i) {
        this.f162840q = i;
    }

    public final void setOnTextOperationListener(ChatFooterPanel.C72719a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f162830d = aVar;
        this.f162835i.mo85308a(new C56824a(this));
    }

    public final void setPickEmojiStr(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f162839p = str;
    }

    public void setVisibility(int i) {
        if (i != 0 || !this.f162838o) {
            super.setVisibility(8);
            return;
        }
        super.setVisibility(i);
        C104289g gVar = new C104289g();
        try {
            C26827e eVar = this.f162841r;
            if (eVar != null) {
                gVar.put("emoticonIDArray", eVar.toString());
                C40314g.m43484c(getContext(), 90, 9001, 0, 1, this.f162840q, gVar.toString());
                return;
            }
            C87412m.m108603p("emojiList");
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameEmojiPickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Class cls = C92290u0.class;
        C87412m.m108594g(context, "context");
        C98745v RS = ((C92290u0) C86312j.m106911c(cls)).mo126049RS();
        this.f162831e = RS;
        C60334f0 f0Var = new C60334f0();
        C45802t0 t0Var = new C45802t0();
        this.f162832f = t0Var;
        this.f162835i = ((C92290u0) C86312j.m106911c(cls)).mo126051le(0);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d4y, this, true);
        View findViewById = findViewById(C0966R.C0970id.m66);
        C87412m.m108593f(findViewById, "findViewById(R.id.recycler_emoji_group)");
        this.f162833g = (GameEmojiPanelRecyclerView) findViewById;
        this.f162834h = new GameEmojiLayoutManager(getContext(), f0Var.f171991c);
        this.f162833g.setHasFixedSize(true);
        GameEmojiPanelRecyclerView gameEmojiPanelRecyclerView = this.f162833g;
        C87412m.m108592e(RS, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
        gameEmojiPanelRecyclerView.setAdapter((RecyclerView.C16613e) RS);
        this.f162833g.setSizeResolver(f0Var);
        this.f162833g.setPanelLifeCycle(t0Var);
        this.f162833g.setLayoutManager(this.f162834h);
        this.f162833g.setFocusable(false);
        this.f162833g.setItemAnimator((RecyclerView.C16616j) null);
        RS.mo138124Z(this.f162835i);
        this.f162837n = getImeEmojiConfig();
        mo80238a();
    }
}

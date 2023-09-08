package com.tencent.p014mm.plugin.finder.view.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import c30.C26827e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import lc3.C10485b;
import p008bq.C92290u0;
import p171il.C60334f0;
import p171il.C60337u;
import p171il.C98745v;
import p490dl.C58320u;
import p813fl.C45802t0;
import p813fl.C97927q0;
import p813fl.C97939w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiPickView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;", "listener", "Lrx3/b0;", "setOnTextOperationListener", "", "visibility", "setVisibility", "", "getImeEmojiConfig", "", "o", "Z", "getCanShowEmoji", "()Z", "setCanShowEmoji", "(Z)V", "canShowEmoji", "p", "Ljava/lang/String;", "getPickEmojiStr", "()Ljava/lang/String;", "setPickEmojiStr", "(Ljava/lang/String;)V", "pickEmojiStr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView */
public final class FinderEmojiPickView extends FrameLayout {

    /* renamed from: d */
    public ChatFooterPanel.C72719a f162280d;

    /* renamed from: e */
    public final C98745v f162281e;

    /* renamed from: f */
    public final C45802t0 f162282f;

    /* renamed from: g */
    public FinderEmojiPanelRecyclerView f162283g;

    /* renamed from: h */
    public FinderEmojiLayoutManager f162284h;

    /* renamed from: i */
    public C60337u f162285i;

    /* renamed from: j */
    public final LinkedList<C97927q0> f162286j = new LinkedList<>();

    /* renamed from: n */
    public String f162287n = "";

    /* renamed from: o */
    public boolean f162288o;

    /* renamed from: p */
    public String f162289p = "";

    /* renamed from: com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPickView$a */
    public static final class C56605a implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ FinderEmojiPickView f162290a;

        public C56605a(FinderEmojiPickView finderEmojiPickView) {
            this.f162290a = finderEmojiPickView;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            String str2;
            ChatFooterPanel.C72719a aVar = this.f162290a.f162280d;
            if (aVar != null) {
                aVar.mo64627b(str);
                FinderEmojiPickView finderEmojiPickView = this.f162290a;
                if (finderEmojiPickView.getPickEmojiStr().length() > 0) {
                    str2 = this.f162290a.getPickEmojiStr() + ';' + str;
                } else {
                    str2 = String.valueOf(str);
                }
                finderEmojiPickView.setPickEmojiStr(str2);
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
    public FinderEmojiPickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Class cls = C92290u0.class;
        C87412m.m108594g(context, "context");
        C98745v RS = ((C92290u0) C86312j.m106911c(cls)).mo126049RS();
        this.f162281e = RS;
        C60334f0 f0Var = new C60334f0();
        C45802t0 t0Var = new C45802t0();
        this.f162282f = t0Var;
        this.f162285i = ((C92290u0) C86312j.m106911c(cls)).mo126051le(0);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ckr, this, true);
        View findViewById = findViewById(C0966R.C0970id.m66);
        C87412m.m108593f(findViewById, "findViewById(R.id.recycler_emoji_group)");
        this.f162283g = (FinderEmojiPanelRecyclerView) findViewById;
        this.f162284h = new FinderEmojiLayoutManager(getContext(), f0Var.f171991c);
        this.f162283g.setHasFixedSize(true);
        FinderEmojiPanelRecyclerView finderEmojiPanelRecyclerView = this.f162283g;
        C87412m.m108592e(RS, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
        finderEmojiPanelRecyclerView.setAdapter((RecyclerView.C16613e) RS);
        this.f162283g.setSizeResolver(f0Var);
        this.f162283g.setPanelLifeCycle(t0Var);
        this.f162283g.setLayoutManager(this.f162284h);
        this.f162283g.setFocusable(false);
        this.f162283g.setItemAnimator((RecyclerView.C16616j) null);
        RS.mo138124Z(this.f162285i);
        this.f162287n = getImeEmojiConfig();
        mo79942a();
    }

    /* renamed from: a */
    public final void mo79942a() {
        setVisibility(8);
        if (!(this.f162287n.length() == 0)) {
            try {
                C26827e j = new C104289g(this.f162287n).mo110108i("default");
                int length = j.length();
                int i = 0;
                while (i < length) {
                    String string = j.getString(i);
                    i++;
                    this.f162286j.add(new C97939w0(new C58320u(string), false, i));
                }
                if (!this.f162286j.isEmpty()) {
                    this.f162288o = true;
                }
            } catch (Exception e) {
                Log.m105921e("FinderEmojiPickView", "parse data error, exception : %s", e);
            }
        }
    }

    public final boolean getCanShowEmoji() {
        return this.f162288o;
    }

    public final String getImeEmojiConfig() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("IMEmoji");
        return c == null ? "" : c;
    }

    public final String getPickEmojiStr() {
        return this.f162289p;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f162282f.mo71266a();
    }

    public final void setCanShowEmoji(boolean z) {
        this.f162288o = z;
    }

    public final void setOnTextOperationListener(ChatFooterPanel.C72719a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f162280d = aVar;
        this.f162285i.mo85308a(new C56605a(this));
    }

    public final void setPickEmojiStr(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f162289p = str;
    }

    public void setVisibility(int i) {
        if (i != 0 || !this.f162288o) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderEmojiPickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Class cls = C92290u0.class;
        C87412m.m108594g(context, "context");
        C98745v RS = ((C92290u0) C86312j.m106911c(cls)).mo126049RS();
        this.f162281e = RS;
        C60334f0 f0Var = new C60334f0();
        C45802t0 t0Var = new C45802t0();
        this.f162282f = t0Var;
        this.f162285i = ((C92290u0) C86312j.m106911c(cls)).mo126051le(0);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.ckr, this, true);
        View findViewById = findViewById(C0966R.C0970id.m66);
        C87412m.m108593f(findViewById, "findViewById(R.id.recycler_emoji_group)");
        this.f162283g = (FinderEmojiPanelRecyclerView) findViewById;
        this.f162284h = new FinderEmojiLayoutManager(getContext(), f0Var.f171991c);
        this.f162283g.setHasFixedSize(true);
        FinderEmojiPanelRecyclerView finderEmojiPanelRecyclerView = this.f162283g;
        C87412m.m108592e(RS, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
        finderEmojiPanelRecyclerView.setAdapter((RecyclerView.C16613e) RS);
        this.f162283g.setSizeResolver(f0Var);
        this.f162283g.setPanelLifeCycle(t0Var);
        this.f162283g.setLayoutManager(this.f162284h);
        this.f162283g.setFocusable(false);
        this.f162283g.setItemAnimator((RecyclerView.C16616j) null);
        RS.mo138124Z(this.f162285i);
        this.f162287n = getImeEmojiConfig();
        mo79942a();
    }
}

package j23;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout;
import e23.C97593c;
import gy3.C87412m;
import lh2.C99426e;
import p171il.C98744t;
import p813fl.C97927q0;
import qh2.C101198e;

/* renamed from: j23.d */
public final class C98897d implements C98744t {

    /* renamed from: a */
    public final /* synthetic */ MultiVideoFullScreenPluginLayout f289912a;

    public C98897d(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        this.f289912a = multiVideoFullScreenPluginLayout;
    }

    /* renamed from: b */
    public void mo127710b(View view, Context context, int i, C97927q0 q0Var) {
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
        C87412m.m108594g(context, "context");
        if ((q0Var instanceof C97593c ? (C97593c) q0Var : null) != null) {
            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f289912a;
            Bundle bundle = new Bundle();
            ((C97593c) q0Var).getClass();
            bundle.putString("EDIT_PAG_STICKER_PATH", (String) null);
            multiVideoFullScreenPluginLayout.mo14585p(C101198e.C101199b.EDIT_ADD_PAG_STICKER, bundle);
        }
        C99426e eVar = this.f289912a.f316594t;
        if (eVar != null) {
            eVar.mo138866y().mo136744b(false);
        } else {
            C87412m.m108603p("addEmojiPlugin");
            throw null;
        }
    }
}

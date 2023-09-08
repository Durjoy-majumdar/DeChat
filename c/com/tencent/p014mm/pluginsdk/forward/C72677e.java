package com.tencent.p014mm.pluginsdk.forward;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.p136ui.transmit.recent.C74927f;
import com.tencent.p014mm.p136ui.transmit.recent.ForwardConversationInfo;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.Iterator;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import p640ox.C77049b;
import qo3.C77407n;
import te3.C64291co3;
import uo3.C78253a;
import x20.C15618a;
import yh3.C66649b;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.forward.e */
public final class C72677e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C72671b f211451d;

    /* renamed from: e */
    public final /* synthetic */ C76875f0 f211452e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f211453f;

    /* renamed from: g */
    public final /* synthetic */ int f211454g;

    /* renamed from: h */
    public final /* synthetic */ View f211455h;

    public C72677e(C72671b bVar, C76875f0 f0Var, C77407n nVar, int i, View view) {
        this.f211451d = bVar;
        this.f211452e = f0Var;
        this.f211453f = nVar;
        this.f211454g = i;
        this.f211455h = view;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        C66649b P7;
        C72671b bVar = this.f211451d;
        C76875f0 f0Var = this.f211452e;
        Iterator<ForwardConversationInfo> it = bVar.f211434d.iterator();
        C87412m.m108593f(it, "conversationList.iterator()");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ForwardConversationInfo next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            if (C87412m.m108589b(next.f220300d, f0Var.f224730y)) {
                it.remove();
                break;
            }
        }
        C72671b bVar2 = this.f211451d;
        C76874e0 e0Var = bVar2.f211437g;
        boolean z = false;
        if (e0Var != null) {
            bVar2.wx0(e0Var, false);
        }
        this.f211453f.mo107564i();
        if (this.f211451d.f211434d.size() == 0) {
            int i2 = this.f211454g;
            if (i2 == 3) {
                TextView textView = this.f211453f.f225747U0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (i2 != 6) {
                LinearLayout linearLayout = this.f211453f.f225737P;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            } else {
                C74927f fVar = C74927f.f220307a;
                Context context = this.f211455h.getContext();
                C87412m.m108593f(context, "context");
                fVar.mo104182a(context, this.f211453f, this.f211454g);
            }
        }
        C72671b bVar3 = this.f211451d;
        String str2 = this.f211452e.f224730y;
        C87412m.m108593f(str2, "menuItem.webUrl");
        bVar3.getClass();
        if (MMApplicationContext.isMainProcess()) {
            PluginMessengerFoundation pluginMessengerFoundation = (PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class);
            if (!(pluginMessengerFoundation == null || (P7 = pluginMessengerFoundation.mo96076P7()) == null)) {
                P7.mo90698a(str2);
            }
        } else {
            C15618a.m14627c(new IPCString(str2), C6644c.f23939d, (C1256g) null, 4, (Object) null);
        }
        C78253a aVar = this.f211451d.f211436f;
        if (aVar != null) {
            aVar.mo108266a();
        }
        Context context2 = this.f211451d.f211438h;
        if (context2 != null) {
            C76875f0 f0Var2 = this.f211452e;
            C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context2, 14, C64291co3.class);
            if (co32 != null) {
                co32.f182540e++;
                String str3 = co32.f182541f;
                if (str3 == null || C112551y.m153811k(str3)) {
                    z = true;
                }
                if (z) {
                    str = f0Var2.f224730y;
                } else {
                    str = co32.f182541f + 65372 + f0Var2.f224730y;
                }
                co32.f182541f = str;
            }
        }
    }
}

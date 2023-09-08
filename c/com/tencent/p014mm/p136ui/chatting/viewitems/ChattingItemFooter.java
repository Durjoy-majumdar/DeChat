package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ke3.C88144b;
import rb0.C47988l0;
import rb0.C47996o;
import te3.C49618gw;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter */
public class ChattingItemFooter extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public Context f121705d;

    public ChattingItemFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121705d = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public final void mo70159a(C47996o oVar) {
        C97625j3.m125815e().mo123460f(new C47988l0((String) null, 1, oVar.mo72786b(), (LinkedList<C49618gw>) null, getContext() instanceof Activity ? ((Activity) getContext()).getIntent().getStringExtra("uinserve_search_click_id") : ""));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        if (!(tag instanceof C47996o)) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C47996o oVar = (C47996o) tag;
        int i = oVar.f128722b;
        if (i == 1) {
            Log.m105918d("ChattingItemFooter", "get latest message");
            oVar.f128728h = "menu_click";
            mo70159a(oVar);
        } else if (i == 2) {
            Log.m105918d("ChattingItemFooter", "start webview url");
            oVar.f128728h = "menu_click";
            mo70159a(oVar);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", oVar.f128725e);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", (String) null);
            intent.putExtra("key_enable_teen_mode_check", true);
            C88144b.m109791i(this.f121705d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.p014mm.plugin.masssend.p076ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.BasePanelKeybordLayout;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendLayout */
public class MassSendLayout extends BasePanelKeybordLayout {

    /* renamed from: n */
    public View f201426n;

    /* renamed from: o */
    public ChatFooter f201427o;

    /* renamed from: p */
    public final ChatFooter$$t1 f201428p = new C69807a();

    /* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendLayout$a */
    public class C69807a implements ChatFooter$$t1 {
        public C69807a() {
        }

        /* renamed from: r */
        public void mo96023r(int i) {
            MassSendLayout.this.f201427o.setTranslationY((float) (-i));
            Log.m105925i("MassSendLayout", "setKeyboardHeightChangeListener: height:%s", Integer.valueOf(i));
        }
    }

    public MassSendLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((Activity) context).getWindow().setSoftInputMode(32);
    }

    public List<View> getPanelView() {
        return new ArrayList();
    }

    public void setChatFooter(ChatFooter chatFooter) {
        this.f201427o = chatFooter;
        ChatFooter$$t1 chatFooter$$t1 = this.f201428p;
        if (chatFooter$$t1 == null) {
            chatFooter.getClass();
        } else if (!((LinkedList) chatFooter.f211916p0).contains(chatFooter$$t1)) {
            ((LinkedList) chatFooter.f211916p0).add(chatFooter$$t1);
        }
    }

    public void setPanel(View view) {
        this.f201426n = view;
    }

    public MassSendLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((Activity) context).getWindow().setSoftInputMode(32);
    }
}

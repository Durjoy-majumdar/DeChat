package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gamelife.p062ui.GameLifeConversationUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea */
public class ChatTabTopArea extends LinearLayout {

    /* renamed from: d */
    public GameHotMsgView f19314d;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea$a */
    public class C4568a implements View.OnClickListener {
        public C4568a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(ChatTabTopArea.this.getContext(), GameLifeConversationUI.class);
            Context context = ChatTabTopArea.this.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public ChatTabTopArea(Context context) {
        super(context);
        mo5425a();
    }

    /* renamed from: a */
    public final void mo5425a() {
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.avh, this);
        findViewById(C0966R.C0970id.h17).setOnClickListener(new C4568a());
        this.f19314d = (GameHotMsgView) findViewById(C0966R.C0970id.ekr);
    }

    public ChatTabTopArea(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5425a();
    }

    public ChatTabTopArea(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5425a();
    }
}

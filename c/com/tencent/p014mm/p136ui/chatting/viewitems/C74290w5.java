package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w5 */
public class C74290w5 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ View f218188d;

    /* renamed from: e */
    public final /* synthetic */ ChattingItemDyeingTemplate.C73910t f218189e;

    public C74290w5(ChattingItemDyeingTemplate.C73910t tVar, View view) {
        this.f218189e = tVar;
        this.f218188d = view;
    }

    public void onDismiss() {
        if (this.f218188d.findViewById(C0966R.C0970id.foj) != null) {
            this.f218188d.findViewById(C0966R.C0970id.foj).setBackgroundResource(C0966R.C0969drawable.f4773mj);
        } else if (this.f218188d.findViewById(C0966R.C0970id.c74) != null) {
            this.f218188d.findViewById(C0966R.C0970id.c74).setBackgroundResource(C0966R.C0969drawable.f4773mj);
        }
        this.f218189e.f216934d.mo91545F(true);
    }
}

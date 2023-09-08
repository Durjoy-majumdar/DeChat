package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.u0 */
public class C6800u0 {

    /* renamed from: a */
    public ChatFooterCustom f24350a;

    /* renamed from: b */
    public LinearLayout f24351b;

    /* renamed from: c */
    public FrameLayout f24352c;

    /* renamed from: d */
    public View.OnClickListener f24353d = new C6801a(this);

    /* renamed from: com.tencent.mm.ui.chatting.u0$a */
    public class C6801a implements View.OnClickListener {
        public C6801a(C6800u0 u0Var) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C45547h) C86312j.m106911c(C45547h.class)).p30(view.getContext(), (Intent) null, (C45544c) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C6800u0(ChatFooterCustom chatFooterCustom) {
        this.f24350a = chatFooterCustom;
    }

    /* renamed from: a */
    public void mo7788a() {
        Log.m105924i("MicroMsg.ChattingDownloaderFooterHandler", "initFooter");
        this.f24350a.setVisibility(8);
        View findViewById = this.f24350a.findViewById(C0966R.C0970id.b5b);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = this.f24350a.findViewById(C0966R.C0970id.b56);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LinearLayout linearLayout = (LinearLayout) this.f24350a.findViewById(C0966R.C0970id.b57);
        this.f24351b = linearLayout;
        linearLayout.setWeightSum(1.0f);
        FrameLayout frameLayout = (FrameLayout) this.f24351b.getChildAt(0);
        this.f24352c = frameLayout;
        frameLayout.setVisibility(0);
        this.f24352c.setOnClickListener(this.f24353d);
        ((TextView) this.f24352c.findViewById(C0966R.C0970id.b59)).setText(C0966R.string.c2_);
        View findViewById3 = this.f24352c.findViewById(C0966R.C0970id.b58);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById3, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        for (int i = 1; i < 6; i++) {
            View childAt = this.f24351b.getChildAt(i);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            C117292a.m165358d(childAt, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

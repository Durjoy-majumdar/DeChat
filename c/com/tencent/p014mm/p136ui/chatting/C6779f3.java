package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import tv2.C14096e;

/* renamed from: com.tencent.mm.ui.chatting.f3 */
public class C6779f3 {

    /* renamed from: a */
    public ChatFooterCustom f24322a;

    /* renamed from: b */
    public LinearLayout f24323b;

    /* renamed from: c */
    public FrameLayout f24324c;

    /* renamed from: d */
    public View.OnClickListener f24325d = new C6780a(this);

    /* renamed from: com.tencent.mm.ui.chatting.f3$a */
    public class C6780a implements View.OnClickListener {
        public C6780a(C6779f3 f3Var) {
        }

        public void onClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSportFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14096e.m13447a(1);
            Set<String> set = C45628s0.f123410p;
            Class cls = C75700k0.class;
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("gh_43f2581f6fd6");
            if (j == null) {
                j = new C72976h2();
                j.mo101162m3();
                j.setUsername("gh_43f2581f6fd6");
                z = true;
            } else {
                z = false;
            }
            j.mo108793N2(System.currentTimeMillis());
            if (z) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(j);
            } else {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "gh_43f2581f6fd6");
            }
            Intent intent = new Intent();
            intent.putExtra("key_is_latest", true);
            intent.putExtra("rank_id", "#");
            intent.putExtra("key_only_show_latest_rank", true);
            intent.putExtra("app_username", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName("gh_43f2581f6fd6"));
            intent.putExtra("device_type", 1);
            C88144b.m109791i(view.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C6779f3(ChatFooterCustom chatFooterCustom) {
        this.f24322a = chatFooterCustom;
    }

    /* renamed from: a */
    public void mo7774a() {
        Log.m105924i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
        View findViewById = this.f24322a.findViewById(C0966R.C0970id.b5b);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = this.f24322a.findViewById(C0966R.C0970id.b56);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LinearLayout linearLayout = (LinearLayout) this.f24322a.findViewById(C0966R.C0970id.b57);
        this.f24323b = linearLayout;
        linearLayout.setWeightSum(1.0f);
        FrameLayout frameLayout = (FrameLayout) this.f24323b.getChildAt(0);
        this.f24324c = frameLayout;
        frameLayout.setVisibility(0);
        this.f24324c.setOnClickListener(this.f24325d);
        ((TextView) this.f24324c.findViewById(C0966R.C0970id.b59)).setText(C0966R.string.cfw);
        View findViewById3 = this.f24324c.findViewById(C0966R.C0970id.b58);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById3, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        for (int i = 1; i < 6; i++) {
            View childAt = this.f24323b.getChildAt(i);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            C117292a.m165358d(childAt, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/ui/chatting/ChattingSportFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

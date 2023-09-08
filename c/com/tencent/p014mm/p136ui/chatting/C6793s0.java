package com.tencent.p014mm.p136ui.chatting;

import a11.C39479c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45612m0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.s0 */
public class C6793s0 {

    /* renamed from: a */
    public ChatFooterCustom f24341a;

    /* renamed from: b */
    public String f24342b;

    /* renamed from: c */
    public LinearLayout f24343c;

    /* renamed from: d */
    public FrameLayout f24344d;

    /* renamed from: com.tencent.mm.ui.chatting.s0$a */
    public class C6794a implements View.OnClickListener {
        public C6794a(C6793s0 s0Var) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C6793s0(ChatFooterCustom chatFooterCustom, String str) {
        this.f24341a = chatFooterCustom;
        this.f24342b = str;
    }

    /* renamed from: a */
    public void mo7781a() {
        Log.m105924i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
        View findViewById = this.f24341a.findViewById(C0966R.C0970id.b5b);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = this.f24341a.findViewById(C0966R.C0970id.b56);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LinearLayout linearLayout = (LinearLayout) this.f24341a.findViewById(C0966R.C0970id.b57);
        this.f24343c = linearLayout;
        linearLayout.setWeightSum(1.0f);
        FrameLayout frameLayout = (FrameLayout) this.f24343c.getChildAt(0);
        this.f24344d = frameLayout;
        frameLayout.setVisibility(0);
        this.f24344d.setOnClickListener(new C6794a(this));
        FrameLayout frameLayout2 = this.f24344d;
        frameLayout2.setBackgroundColor(frameLayout2.getContext().getResources().getColor(C0966R.color.BW_95));
        if (((C39479c) C86709a0.m107533q(C39479c.class)).mo62082Ct(this.f24342b)) {
            ((TextView) this.f24344d.findViewById(C0966R.C0970id.b59)).setText(C0966R.string.m6_);
        } else if (C45612m0.m50675B(this.f24342b)) {
            ((TextView) this.f24344d.findViewById(C0966R.C0970id.b59)).setText(C0966R.string.mto);
        } else {
            ((TextView) this.f24344d.findViewById(C0966R.C0970id.b59)).setText(C0966R.string.f360344c04);
        }
        ((TextView) this.f24344d.findViewById(C0966R.C0970id.b59)).setTextColor(this.f24344d.getContext().getResources().getColor(C0966R.color.FG_1));
        ((TextView) this.f24344d.findViewById(C0966R.C0970id.b59)).setTextSize(0, this.f24344d.getContext().getResources().getDimension(C0966R.dimen.f3957lf));
        Context context = this.f24344d.getContext();
        WeImageView weImageView = (WeImageView) this.f24344d.findViewById(C0966R.C0970id.b58);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_error, context.getResources().getColor(C0966R.color.FG_1)));
            weImageView.setIconColor(context.getResources().getColor(C0966R.color.FG_1));
            ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            layoutParams.height = (int) context.getResources().getDimension(C0966R.dimen.f3738cr);
            layoutParams.width = (int) context.getResources().getDimension(C0966R.dimen.f3738cr);
            weImageView.setLayoutParams(layoutParams);
        }
        for (int i = 1; i < 6; i++) {
            View childAt = this.f24343c.getChildAt(i);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(childAt, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

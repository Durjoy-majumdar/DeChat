package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.contact.t */
public class C6935t extends RelativeLayout {

    /* renamed from: d */
    public Context f24623d;

    /* renamed from: e */
    public View f24624e = null;

    /* renamed from: f */
    public View f24625f = null;

    /* renamed from: g */
    public TextView f24626g = null;

    /* renamed from: com.tencent.mm.ui.contact.t$a */
    public enum C6936a {
        Chatromm,
        ContactLabel,
        ContactIpCall,
        OnlyChat
    }

    public C6935t(Context context, C6936a aVar) {
        super(context);
        this.f24623d = context;
        View.inflate(getContext(), C0966R.C0971layout.f6364ct, this);
        View findViewById = findViewById(C0966R.C0970id.f357785br0);
        this.f24624e = findViewById;
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.f5638ki);
        this.f24625f = findViewById2;
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        layoutParams.height = (int) (((float) C76577a.m92155f(this.f24623d, C0966R.dimen.f3669az)) * C76577a.m92175z(this.f24623d));
        this.f24625f.setLayoutParams(layoutParams);
        this.f24626g = (TextView) this.f24625f.findViewById(C0966R.C0970id.f5640kk);
        this.f24624e.setOnClickListener(new C6932r(this, aVar));
        this.f24625f.setOnTouchListener(new C6933s(this));
        ImageView imageView = (ImageView) ((MaskLayout) this.f24625f.findViewById(C0966R.C0970id.f5639kj)).getContentView();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            this.f24626g.setText(C0966R.string.f7421ft);
            AvatarStorage.m80441c(getContext(), imageView, C0966R.raw.default_chatroom);
        } else if (ordinal == 1) {
            this.f24626g.setText(C0966R.string.f7429g1);
            AvatarStorage.m80441c(getContext(), imageView, C0966R.raw.default_contactlabel);
        } else if (ordinal == 2) {
            this.f24625f.setBackgroundResource(C0966R.C0969drawable.f4855pa);
            this.f24626g.setText(C0966R.string.f7428g0);
            AvatarStorage.m80441c(getContext(), imageView, C0966R.raw.default_ipcall);
        } else if (ordinal == 3) {
            this.f24626g.setText(C0966R.string.f7430g2);
            AvatarStorage.m80441c(getContext(), imageView, C0966R.C0969drawable.byn);
        }
    }

    public void setVisible(boolean z) {
        View view = this.f24624e;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

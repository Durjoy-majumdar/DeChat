package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n4 */
public class C6807n4 extends RelativeLayout {

    /* renamed from: d */
    public LayoutInflater f24363d;

    /* renamed from: e */
    public int f24364e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6807n4(LayoutInflater layoutInflater, int i) {
        super(layoutInflater.getContext());
        this.f24363d = layoutInflater;
        this.f24364e = i;
        setClipChildren(false);
        View inflate = this.f24363d.inflate(C0966R.C0971layout.f6981u0, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        inflate.setId(C0966R.C0970id.f357687b83);
        layoutParams.setMargins(0, getResources().getDimensionPixelSize(C0966R.dimen.f3926j6), 0, getResources().getDimensionPixelSize(C0966R.dimen.f3926j6));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(inflate, "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(inflate, layoutParams);
        View inflate2 = this.f24363d.inflate(C0966R.C0971layout.f6851q_, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        inflate2.setId(C0966R.C0970id.b5o);
        layoutParams2.setMargins(0, getResources().getDimensionPixelSize(C0966R.dimen.f3926j6), 0, getResources().getDimensionPixelSize(C0966R.dimen.f3926j6));
        layoutParams2.addRule(3, C0966R.C0970id.f357687b83);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(inflate2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(inflate2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(inflate2, layoutParams2);
        TextView textView = new TextView(getContext(), (AttributeSet) null, C0966R.style.f8403h_);
        textView.setId(C0966R.C0970id.b8z);
        int h = C76577a.m92157h(getContext(), C0966R.dimen.f3964lm);
        int h2 = C76577a.m92157h(getContext(), C0966R.dimen.f3964lm);
        if (h2 != h) {
            Log.m105921e("MicroMsg.ChattingItemContainer", "warn!!! cacheSize:%s sysSize:%s", Integer.valueOf(h2), Integer.valueOf(h));
        }
        textView.setTextSize(0, (float) h);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, C0966R.C0970id.b5o);
        layoutParams3.addRule(14);
        layoutParams3.setMargins(0, getResources().getDimensionPixelSize(C0966R.dimen.f3926j6), 0, getResources().getDimensionPixelSize(C0966R.dimen.f3926j6));
        addView(textView, layoutParams3);
        CheckBox checkBox = (CheckBox) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359879bc0, this, false);
        checkBox.setId(C0966R.C0970id.b46);
        int b = C76577a.m92151b(getContext(), 24);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(b, b);
        layoutParams4.setMargins(getResources().getDimensionPixelSize(C0966R.dimen.f3956le), getResources().getDimensionPixelSize(C0966R.dimen.f3633r), -getResources().getDimensionPixelSize(C0966R.dimen.f3703bv), 0);
        layoutParams4.addRule(3, C0966R.C0970id.b8z);
        layoutParams4.addRule(9);
        layoutParams4.width = b;
        layoutParams4.height = b;
        addView(checkBox, layoutParams4);
        View inflate3 = this.f24363d.inflate(this.f24364e, (ViewGroup) null);
        int id = inflate3.getId();
        if (-1 == id) {
            Log.m105926v("MicroMsg.ChattingItemContainer", "content view has no id, use defaul id");
            inflate3.setId(C0966R.C0970id.b4_);
            id = C0966R.C0970id.b4_;
        }
        if (-1 == getId()) {
            setId(C0966R.C0970id.f6197hp);
        }
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, C0966R.C0970id.b8z);
        layoutParams5.addRule(1, C0966R.C0970id.b46);
        addView(inflate3, layoutParams5);
        View view = new View(getContext());
        view.setId(C0966R.C0970id.b7h);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemContainer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams6.addRule(6, id);
        layoutParams6.addRule(8, id);
        addView(view, layoutParams6);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundColor(imageView.getResources().getColor(C0966R.color.FG_2));
        imageView.setId(C0966R.C0970id.b48);
        imageView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(6, id);
        layoutParams7.addRule(8, id);
        addView(imageView, layoutParams7);
    }
}

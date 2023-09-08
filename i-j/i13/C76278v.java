package i13;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import i13.C76259g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.v */
public final class C76278v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223466d;

    public C76278v(C76259g gVar) {
        this.f223466d = gVar;
    }

    public final void onClick(View view) {
        C76259g.C76260a aVar = C76259g.C76260a.INPUT_NONE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int ordinal = this.f223466d.f223397B.ordinal();
        if (ordinal == 0) {
            C76259g gVar = this.f223466d;
            gVar.f223397B = aVar;
            gVar.mo106510K(6);
        } else if (ordinal == 1) {
            C76259g gVar2 = this.f223466d;
            gVar2.f223397B = aVar;
            C76259g.m91670H(gVar2, false);
            C76259g.m91669G(this.f223466d, true);
            ChatFooterPanel chatFooterPanel = this.f223466d.f223433t;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(8);
            }
            MMEditText mMEditText = this.f223466d.f223426n;
            if (mMEditText != null) {
                mMEditText.setCursorVisible(false);
            }
            this.f223466d.mo106509J(false);
        } else if (ordinal == 2) {
            this.f223466d.mo106512M(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

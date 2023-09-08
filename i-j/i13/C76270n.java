package i13;

import android.support.design.widget.MMBottomSheetBehavior;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.transvoice.p324ui.TransVoicePanelLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import i13.C76259g;
import p206nj.C76865k;

/* renamed from: i13.n */
public final class C76270n implements TransVoicePanelLayout.C71569a {

    /* renamed from: a */
    public final /* synthetic */ C76259g f223457a;

    public C76270n(C76259g gVar) {
        this.f223457a = gVar;
    }

    /* renamed from: i0 */
    public final void mo98701i0(boolean z, int i) {
        C76259g.C76261b bVar = C76259g.C76261b.MODE_WITH_KEYBOARD;
        this.f223457a.f223441z = z;
        Log.m105919d("MicroMsg.TransVoiceDialog", "isKeyboardShow %s.", Boolean.valueOf(z));
        if (z) {
            C76259g gVar = this.f223457a;
            gVar.f223397B = C76259g.C76260a.INPUT_KEYBOARD;
            MMBottomSheetBehavior<View> mMBottomSheetBehavior = gVar.f223412R;
            if (mMBottomSheetBehavior != null && 3 == mMBottomSheetBehavior.f304908o) {
                gVar.f223413S = bVar;
            }
            MMEditText mMEditText = gVar.f223426n;
            if (mMEditText != null) {
                mMEditText.setCursorVisible(true);
            }
            C76259g.m91670H(this.f223457a, true);
            C76259g.m91669G(this.f223457a, false);
            C76259g.m91671I(this.f223457a, false);
            ImageView imageView = this.f223457a.f223431r;
            if (imageView != null) {
                imageView.setImageResource(C0966R.C0969drawable.f4802nb);
            }
            this.f223457a.mo106509J(true);
        } else {
            C76259g gVar2 = this.f223457a;
            MMBottomSheetBehavior<View> mMBottomSheetBehavior2 = gVar2.f223412R;
            if ((mMBottomSheetBehavior2 != null && 3 == mMBottomSheetBehavior2.f304908o) && C76259g.C76260a.INPUT_EMOJI != gVar2.f223397B) {
                gVar2.f223413S = C76259g.C76261b.MODE_ONLY_PANEL;
            }
            if (gVar2.f223397B.ordinal() == 2) {
                C76259g gVar3 = this.f223457a;
                gVar3.f223397B = C76259g.C76260a.INPUT_NONE;
                if (bVar != gVar3.f223413S) {
                    C76259g.m91670H(gVar3, false);
                    C76259g.m91669G(this.f223457a, true);
                    ChatFooterPanel chatFooterPanel = this.f223457a.f223433t;
                    if (chatFooterPanel != null) {
                        chatFooterPanel.setVisibility(8);
                    }
                    MMEditText mMEditText2 = this.f223457a.f223426n;
                    if (mMEditText2 != null) {
                        mMEditText2.setCursorVisible(false);
                    }
                    this.f223457a.mo106509J(false);
                }
            }
        }
        C76259g gVar4 = this.f223457a;
        if (gVar4.f223396A != i && i != 0) {
            gVar4.f223396A = i;
            C76865k.m92671b(gVar4.getContext(), i);
            C76259g gVar5 = this.f223457a;
            int validPanelHeight = KeyBoardUtil.getValidPanelHeight(gVar5.getContext());
            ChatFooterPanel chatFooterPanel2 = gVar5.f223433t;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setPortHeightPx(validPanelHeight);
            }
            ChatFooterPanel chatFooterPanel3 = gVar5.f223433t;
            if (chatFooterPanel3 != null) {
                chatFooterPanel3.mo100190c();
            }
            ChatFooterPanel chatFooterPanel4 = gVar5.f223433t;
            ViewGroup.LayoutParams layoutParams = chatFooterPanel4 != null ? chatFooterPanel4.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = validPanelHeight;
            }
        }
    }
}

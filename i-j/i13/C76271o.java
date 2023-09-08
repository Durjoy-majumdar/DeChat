package i13;

import android.support.design.widget.MMBottomSheetBehavior;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.transvoice.p324ui.TransVoicePanelLayout;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i13.C76259g;

/* renamed from: i13.o */
public final class C76271o extends MMBottomSheetBehavior.C0109c {

    /* renamed from: a */
    public final /* synthetic */ C76259g f223458a;

    /* renamed from: i13.o$a */
    public static final class C76272a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76259g f223459d;

        public C76272a(C76259g gVar) {
            this.f223459d = gVar;
        }

        public final void run() {
            TransVoicePanelLayout transVoicePanelLayout = this.f223459d.f223425j;
            if (transVoicePanelLayout != null) {
                transVoicePanelLayout.requestLayout();
            }
        }
    }

    public C76271o(C76259g gVar) {
        this.f223458a = gVar;
    }

    /* renamed from: a */
    public void mo87a(View view, float f) {
        C87412m.m108594g(view, "bottomSheet");
        Log.m105919d("MicroMsg.TransVoiceDialog", "slideOffset: %f, panelDragOpeMode: %s.", Float.valueOf(f), this.f223458a.f223413S);
        C76259g gVar = this.f223458a;
        MMBottomSheetBehavior<View> mMBottomSheetBehavior = gVar.f223412R;
        if (mMBottomSheetBehavior != null && mMBottomSheetBehavior.f304908o == 1) {
            if (C76259g.C76261b.MODE_ONLY_PANEL == gVar.f223413S) {
                gVar.f223414T = 0.7f >= f;
                Window window = gVar.getWindow();
                if (window != null) {
                    window.setDimAmount((float) (0.5d - (((double) (((float) 1) - f)) / 2.0d)));
                }
            }
            C76259g.C76261b bVar = C76259g.C76261b.MODE_WITH_KEYBOARD;
            C76259g gVar2 = this.f223458a;
            if (bVar == gVar2.f223413S) {
                gVar2.f223416V = 0.8f >= f;
                if (0.9f >= f) {
                    if (!gVar2.f223415U) {
                        gVar2.f223415U = true;
                        gVar2.mo106512M(false);
                        C76259g.m91670H(this.f223458a, false);
                        C76259g.m91669G(this.f223458a, false);
                        C76259g.m91671I(this.f223458a, false);
                        ImageView imageView = this.f223458a.f223431r;
                        if (imageView != null) {
                            imageView.setImageResource(C0966R.C0969drawable.f4802nb);
                        }
                    }
                } else if (gVar2.f223415U) {
                    gVar2.f223415U = false;
                    gVar2.mo106512M(true);
                    C76259g.m91670H(this.f223458a, true);
                    C76259g.m91669G(this.f223458a, false);
                    C76259g.m91671I(this.f223458a, false);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo88b(View view, int i) {
        C87412m.m108594g(view, "bottomSheet");
        C76259g gVar = this.f223458a;
        Log.m105919d("MicroMsg.TransVoiceDialog", "newState: %d, panelDragOpeMode: %s, canClosePanel: %s, canHideKeyboard: %s, canCloseKeyboard: %s.", Integer.valueOf(i), gVar.f223413S, Boolean.valueOf(gVar.f223414T), Boolean.valueOf(this.f223458a.f223415U), Boolean.valueOf(this.f223458a.f223416V));
        if (i == 1) {
            C76259g gVar2 = this.f223458a;
            gVar2.f223414T = false;
            gVar2.f223415U = false;
            gVar2.f223416V = false;
        } else if (i == 2) {
            C76259g.C76261b bVar = C76259g.C76261b.MODE_ONLY_PANEL;
            C76259g gVar3 = this.f223458a;
            if (bVar == gVar3.f223413S && gVar3.f223414T) {
                gVar3.mo106510K(6);
            }
            C76259g.C76261b bVar2 = C76259g.C76261b.MODE_WITH_KEYBOARD;
            C76259g gVar4 = this.f223458a;
            if (bVar2 == gVar4.f223413S && gVar4.f223415U) {
                if (gVar4.f223416V) {
                    gVar4.f223413S = bVar;
                    C76259g.m91669G(gVar4, true);
                    C76259g.m91670H(this.f223458a, false);
                    ChatFooterPanel chatFooterPanel = this.f223458a.f223433t;
                    if (chatFooterPanel != null) {
                        chatFooterPanel.setVisibility(8);
                    }
                    MMEditText mMEditText = this.f223458a.f223426n;
                    if (mMEditText != null) {
                        mMEditText.setCursorVisible(false);
                    }
                    this.f223458a.mo106509J(false);
                    C76259g gVar5 = this.f223458a;
                    TransVoicePanelLayout transVoicePanelLayout = gVar5.f223425j;
                    if (transVoicePanelLayout != null) {
                        transVoicePanelLayout.postDelayed(new C76272a(gVar5), 200);
                    }
                } else {
                    gVar4.mo106512M(true);
                    C76259g.m91670H(this.f223458a, true);
                    C76259g.m91669G(this.f223458a, false);
                    C76259g.m91671I(this.f223458a, false);
                }
            }
        }
        if (1 != i && 3 != i) {
            C76259g gVar6 = this.f223458a;
            if (!gVar6.f223414T) {
                Window window = gVar6.getWindow();
                if (window != null) {
                    window.setDimAmount(0.5f);
                }
                MMBottomSheetBehavior<View> mMBottomSheetBehavior = this.f223458a.f223412R;
                if (mMBottomSheetBehavior != null) {
                    mMBottomSheetBehavior.mo143309A(3);
                    return;
                }
                return;
            }
            gVar6.mo106510K(6);
        }
    }
}

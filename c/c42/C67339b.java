package c42;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import p248ug.C78158s0;
import p248ug.C78160t0;

/* renamed from: c42.b */
public class C67339b {

    /* renamed from: c42.b$a */
    public class C67340a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ChatFooterPanel f193186a;

        public C67340a(ChatFooterPanel chatFooterPanel) {
            this.f193186a = chatFooterPanel;
        }

        public void onAnimationEnd(Animation animation) {
            ChatFooterPanel chatFooterPanel = this.f193186a;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100196h();
                this.f193186a.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            ChatFooterPanel chatFooterPanel = this.f193186a;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public static boolean m79676a(Context context, ChatFooterPanel chatFooterPanel) {
        if (chatFooterPanel == null) {
            return false;
        }
        chatFooterPanel.mo100196h();
        if (chatFooterPanel.getVisibility() != 0) {
            return false;
        }
        chatFooterPanel.setVisibility(8);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2469dt);
        loadAnimation.setAnimationListener(new C67340a(chatFooterPanel));
        chatFooterPanel.startAnimation(loadAnimation);
        return true;
    }

    /* renamed from: b */
    public static void m79677b(ViewGroup viewGroup, ChatFooterPanel chatFooterPanel, int i, C78158s0.C78159a aVar) {
        chatFooterPanel.setEntranceScene(i);
        chatFooterPanel.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C78160t0.m94370a(viewGroup.getContext()));
        layoutParams.gravity = 80;
        viewGroup.removeAllViews();
        viewGroup.addView(chatFooterPanel, layoutParams);
        C78158s0 d = C78160t0.m94373d();
        d.f229009a = aVar;
        chatFooterPanel.setCallback(d);
    }
}

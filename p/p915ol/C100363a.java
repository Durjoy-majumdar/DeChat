package p915ol;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p248ug.C78160t0;

/* renamed from: ol.a */
public class C100363a {

    /* renamed from: a */
    public final Context f293960a;

    /* renamed from: b */
    public final FrameLayout f293961b;

    /* renamed from: c */
    public final SmileyPanel f293962c;

    /* renamed from: ol.a$a */
    public static final class C100364a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100363a f293963d;

        public C100364a(C100363a aVar) {
            this.f293963d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/view/EmojiPanelBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f293963d.mo136743a();
            C117292a.m165361g(this, "com/tencent/mm/emoji/view/EmojiPanelBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C100363a(Context context, ViewGroup viewGroup, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "parent");
        this.f293960a = context;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f293961b = frameLayout;
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new C100364a(this));
        SmileyPanel c = C78160t0.m94372c(context, z);
        C87412m.m108593f(c, "getSmileyPanel(context, darkMode)");
        this.f293962c = c;
        int i = ChatFooterPanel.f211589f;
        c.setEntranceScene(3);
        c.setShowSmiley(false);
        c.setShowClose(true);
        c.mo100197i();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C78160t0.m94370a(context));
        layoutParams.gravity = 80;
        frameLayout.addView(c, layoutParams);
        frameLayout.setVisibility(8);
        c.setVisibility(8);
        c.setTranslationY((float) layoutParams.height);
    }

    /* renamed from: a */
    public void mo136743a() {
        throw null;
    }
}

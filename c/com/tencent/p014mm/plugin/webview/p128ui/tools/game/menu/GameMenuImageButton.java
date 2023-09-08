package com.tencent.p014mm.plugin.webview.p128ui.tools.game.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton */
public class GameMenuImageButton extends LinearLayout {

    /* renamed from: d */
    public ImageView f119300d;

    /* renamed from: e */
    public boolean f119301e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton$a */
    public class C44032a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C44033b f119302d;

        public C44032a(GameMenuImageButton gameMenuImageButton, C44033b bVar) {
            this.f119302d = bVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuImageButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C44033b bVar = this.f119302d;
            if (bVar != null) {
                bVar.mo65815a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuImageButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton$b */
    public interface C44033b {
        /* renamed from: a */
        void mo65815a();
    }

    public GameMenuImageButton(Context context) {
        super(context);
        mo68644b(context);
    }

    /* renamed from: a */
    public void mo68643a(FrameLayout frameLayout, C44033b bVar) {
        if (getParent() == null && frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
            frameLayout.addView(this, layoutParams);
        }
        ImageView imageView = this.f119300d;
        if (imageView != null) {
            imageView.setOnClickListener(new C44032a(this, bVar));
        }
        this.f119301e = true;
    }

    /* renamed from: b */
    public final void mo68644b(Context context) {
        ImageView imageView = new ImageView(context);
        this.f119300d = imageView;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(C76577a.m92155f(context, C0966R.dimen.aaq), C76577a.m92155f(context, C0966R.dimen.aaq)));
        this.f119300d.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f119300d.setImageResource(C0966R.C0969drawable.c3m);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, C76577a.m92155f(context, C0966R.dimen.aap), C76577a.m92155f(context, C0966R.dimen.aap), 0);
        addView(this.f119300d, layoutParams);
    }

    public GameMenuImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo68644b(context);
    }

    public GameMenuImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo68644b(context);
    }
}

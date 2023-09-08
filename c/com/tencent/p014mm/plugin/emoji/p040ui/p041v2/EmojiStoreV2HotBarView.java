package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView */
public class EmojiStoreV2HotBarView extends LinearLayout {

    /* renamed from: d */
    public View f12259d;

    /* renamed from: e */
    public TextView f12260e;

    /* renamed from: f */
    public View f12261f;

    /* renamed from: g */
    public TextView f12262g;

    /* renamed from: h */
    public View f12263h;

    /* renamed from: i */
    public TextView f12264i;

    /* renamed from: j */
    public View.OnClickListener f12265j = new C2216a();

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView$a */
    public class C2216a implements View.OnClickListener {
        public C2216a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(EmojiStoreV2HotBarView.this.getContext(), EmojiStoreV2RankUI.class);
            Context context = EmojiStoreV2HotBarView.this.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView$b */
    public class C2217b implements View.OnClickListener {
        public C2217b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(EmojiStoreV2HotBarView.this.getContext(), EmojiStoreV2SingleProductUI.class);
            Context context = EmojiStoreV2HotBarView.this.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public EmojiStoreV2HotBarView(Context context) {
        super(context);
        mo2112a();
    }

    /* renamed from: a */
    public void mo2112a() {
        View findViewById = ((ViewGroup) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a2s, this)).findViewById(C0966R.C0970id.iwc);
        this.f12259d = findViewById;
        this.f12260e = (TextView) findViewById.findViewById(C0966R.C0970id.cfq);
        this.f12261f = this.f12259d.findViewById(C0966R.C0970id.cf9);
        TextView textView = (TextView) this.f12259d.findViewById(C0966R.C0970id.cga);
        this.f12262g = textView;
        textView.setText(getResources().getText(C0966R.string.c8y) + " ");
        View findViewById2 = this.f12259d.findViewById(C0966R.C0970id.c2z);
        this.f12263h = findViewById2;
        findViewById2.setOnClickListener(new C2217b());
        this.f12264i = (TextView) this.f12259d.findViewById(C0966R.C0970id.hdx);
        mo2113b();
        setMoreOnClickListener(this.f12265j);
        if (C41051m.m44498a().f110535c) {
            this.f12260e.setText(C0966R.string.c6f);
        } else {
            this.f12260e.setText(C0966R.string.c6e);
        }
    }

    /* renamed from: b */
    public void mo2113b() {
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_DESIGNER_EMOJI_BOOLEAN, Boolean.FALSE)).booleanValue();
        TextView textView = this.f12264i;
        if (textView != null) {
            textView.setVisibility(booleanValue ? 0 : 8);
        }
    }

    public View getRootView() {
        return this.f12259d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105918d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
    }

    public void setDesignerCatalogViewPadding(boolean z) {
        if (this.f12261f != null && !z) {
            int h = C76577a.m92157h(getContext(), C0966R.dimen.f3905if);
            int h2 = C76577a.m92157h(getContext(), C0966R.dimen.f3913iq);
            int h3 = C76577a.m92157h(getContext(), C0966R.dimen.f3926j6);
            this.f12261f.setPadding(h3, h, h3, h2);
        }
    }

    public void setDesignerEmojiViewVisibility(int i) {
        View view = this.f12263h;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setDesignerEmojiViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setDesignerEmojiViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setMoreOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f12262g;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setVisibility(int i) {
        View view = this.f12259d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2HotBarView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        super.setVisibility(i);
    }

    public EmojiStoreV2HotBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2112a();
    }

    public EmojiStoreV2HotBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2112a();
    }
}

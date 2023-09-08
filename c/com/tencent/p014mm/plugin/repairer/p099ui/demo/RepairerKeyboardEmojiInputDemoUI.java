package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerKeyboardEmojiInputDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI */
public final class RepairerKeyboardEmojiInputDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public EmojiPanelInputComponent f205455d;

    /* renamed from: e */
    public MMEditText f205456e;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI$a */
    public static final class C70989a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerKeyboardEmojiInputDemoUI f205457d;

        public C70989a(RepairerKeyboardEmojiInputDemoUI repairerKeyboardEmojiInputDemoUI) {
            this.f205457d = repairerKeyboardEmojiInputDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205457d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI$b */
    public static final class C70990b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerKeyboardEmojiInputDemoUI f205458d;

        public C70990b(RepairerKeyboardEmojiInputDemoUI repairerKeyboardEmojiInputDemoUI) {
            this.f205458d = repairerKeyboardEmojiInputDemoUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
            if ((r8.f195273g.getVisibility() == 0) == true) goto L_0x003c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/repairer/ui/demo/RepairerKeyboardEmojiInputDemoUI$onCreate$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI r8 = r7.f205458d
                com.tencent.mm.ui.widget.MMEditText r8 = r8.f205456e
                if (r8 == 0) goto L_0x0025
                r8.requestFocus()
            L_0x0025:
                com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI r8 = r7.f205458d
                com.tencent.mm.emoji.view.EmojiPanelInputComponent r8 = r8.f205455d
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L_0x003b
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel r8 = r8.f195273g
                int r8 = r8.getVisibility()
                if (r8 != 0) goto L_0x0037
                r8 = 1
                goto L_0x0038
            L_0x0037:
                r8 = 0
            L_0x0038:
                if (r8 != r0) goto L_0x003b
                goto L_0x003c
            L_0x003b:
                r0 = 0
            L_0x003c:
                if (r0 == 0) goto L_0x004c
                com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI r8 = r7.f205458d
                com.tencent.mm.emoji.view.EmojiPanelInputComponent r8 = r8.f205455d
                if (r8 == 0) goto L_0x004c
                r8.mo93491c()
                r0 = 8
                r8.setVisibility(r0)
            L_0x004c:
                com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI r8 = r7.f205458d
                boolean r8 = com.tencent.p014mm.sdk.platformtools.KeyBoardUtil.isPortOrientation(r8)
                if (r8 != 0) goto L_0x006c
                com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI r8 = r7.f205458d
                com.tencent.mm.emoji.view.EmojiPanelInputComponent r8 = r8.f205455d
                if (r8 == 0) goto L_0x006c
                r8.setVisibility(r1)
                android.widget.ImageButton r0 = r8.f195275i
                r1 = 2131231710(0x7f0803de, float:1.8079509E38)
                r0.setImageResource(r1)
                android.widget.ImageButton r8 = r8.f195275i
                java.lang.String r0 = "keyboard"
                r8.setTag(r0)
            L_0x006c:
                com.tencent.mm.plugin.repairer.ui.demo.RepairerKeyboardEmojiInputDemoUI r8 = r7.f205458d
                android.view.View r8 = r8.getContentView()
                r8.postInvalidate()
                java.lang.String r8 = "com/tencent/mm/plugin/repairer/ui/demo/RepairerKeyboardEmojiInputDemoUI$onCreate$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerKeyboardEmojiInputDemoUI.C70990b.onClick(android.view.View):void");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bs7;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("表情输入Demo");
        setBackBtn(new C70989a(this));
        this.f205456e = (MMEditText) findViewById(C0966R.C0970id.f7k);
        EmojiPanelInputComponent emojiPanelInputComponent = (EmojiPanelInputComponent) findViewById(C0966R.C0970id.j0v);
        this.f205455d = emojiPanelInputComponent;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.setMMEditText(this.f205456e);
        }
        EmojiPanelInputComponent emojiPanelInputComponent2 = this.f205455d;
        if (emojiPanelInputComponent2 != null) {
            emojiPanelInputComponent2.setVisibility(4);
        }
        MMEditText mMEditText = this.f205456e;
        if (mMEditText != null) {
            mMEditText.setOnClickListener(new C70990b(this));
        }
    }

    public void onDestroy() {
        EmojiPanelInputComponent emojiPanelInputComponent = this.f205455d;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.f195280q = null;
            ChatFooterPanel chatFooterPanel = emojiPanelInputComponent.f195273g;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100200l();
                emojiPanelInputComponent.f195273g.mo100189b();
            }
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        EmojiPanelInputComponent emojiPanelInputComponent = this.f205455d;
        boolean z = false;
        if (emojiPanelInputComponent != null && emojiPanelInputComponent.mo93492d()) {
            z = true;
        }
        if (z) {
            EmojiPanelInputComponent emojiPanelInputComponent2 = this.f205455d;
            if (emojiPanelInputComponent2 == null) {
                return true;
            }
            emojiPanelInputComponent2.mo93491c();
            emojiPanelInputComponent2.setVisibility(8);
            return true;
        }
        finish();
        return true;
    }
}

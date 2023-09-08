package yz2;

import android.view.View;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.s1 */
public final class C79269s1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditActivity f232715d;

    public C79269s1(TextStatusEditActivity textStatusEditActivity) {
        this.f232715d = textStatusEditActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusEditActivity textStatusEditActivity = this.f232715d;
        if (textStatusEditActivity.f206936m1 == TextStatusEditActivity.C30496d.BIG_EMOJI) {
            EmojiPanelInputComponent emojiPanelInputComponent = textStatusEditActivity.f206922e;
            if (emojiPanelInputComponent != null && emojiPanelInputComponent.getVisibility() == 0) {
                EmojiPanelInputComponent emojiPanelInputComponent2 = this.f232715d.f206922e;
                if (emojiPanelInputComponent2 != null) {
                    emojiPanelInputComponent2.setVisibility(4);
                }
                this.f232715d.mo1072i0(false, 0);
                this.f232715d.hideVKB();
            } else {
                this.f232715d.showVKB();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

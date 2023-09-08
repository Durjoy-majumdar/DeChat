package p915ol;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ol.c */
public class C77016c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPanelInputComponent f225002d;

    public C77016c(EmojiPanelInputComponent emojiPanelInputComponent) {
        this.f225002d = emojiPanelInputComponent;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/emoji/view/EmojiPanelInputComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EmojiPanelInputComponent emojiPanelInputComponent = this.f225002d;
        if ("keyboard".equals(emojiPanelInputComponent.f195275i.getTag())) {
            EmojiPanelInputComponent.C68041c cVar = emojiPanelInputComponent.f195280q;
            if (cVar != null) {
                cVar.hideVKB();
            }
            emojiPanelInputComponent.f195273g.mo100197i();
            emojiPanelInputComponent.setBottomPanelHeight(emojiPanelInputComponent.f195278o);
            if (KeyBoardUtil.isPortOrientation(emojiPanelInputComponent.getContext())) {
                int j = C85875k4.m106188j(emojiPanelInputComponent.getContext());
                boolean z = true;
                Log.m105925i("MicroMsg.EmojiPanelInputComponent", "is show key board %d, %d, %d", Integer.valueOf(emojiPanelInputComponent.f195277n), Integer.valueOf(emojiPanelInputComponent.f195276j), Integer.valueOf(j));
                int i = emojiPanelInputComponent.f195277n;
                if (i <= 0 || i >= emojiPanelInputComponent.f195276j - j) {
                    z = false;
                }
                if (z || emojiPanelInputComponent.f195279p) {
                    emojiPanelInputComponent.f195279p = false;
                    emojiPanelInputComponent.getInputPanelHelper().mo104362e(new C77018e(emojiPanelInputComponent));
                    emojiPanelInputComponent.f195274h.mo104256m();
                    emojiPanelInputComponent.f195275i.setImageResource(C0966R.C0969drawable.f4803nc);
                    emojiPanelInputComponent.f195275i.setTag("emoji");
                }
            }
            emojiPanelInputComponent.f195273g.setVisibility(0);
            emojiPanelInputComponent.f195274h.mo104256m();
            emojiPanelInputComponent.f195275i.setImageResource(C0966R.C0969drawable.f4803nc);
            emojiPanelInputComponent.f195275i.setTag("emoji");
        } else {
            emojiPanelInputComponent.f195274h.mo104256m();
            emojiPanelInputComponent.mo93491c();
            EmojiPanelInputComponent.C68041c cVar2 = emojiPanelInputComponent.f195280q;
            if (cVar2 != null) {
                cVar2.showVKB();
            }
            emojiPanelInputComponent.f195275i.setImageResource(C0966R.C0969drawable.f4802nb);
            emojiPanelInputComponent.f195275i.setTag("keyboard");
        }
        C117292a.m165361g(this, "com/tencent/mm/emoji/view/EmojiPanelInputComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

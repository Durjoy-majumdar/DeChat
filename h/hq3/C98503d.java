package hq3;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.popview.EmojiPopView;
import j20.C117292a;
import java.util.ArrayList;
import p585kl.C99148f;

/* renamed from: hq3.d */
public class C98503d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPopView f288898d;

    public C98503d(EmojiPopView emojiPopView) {
        this.f288898d = emojiPopView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/popview/EmojiPopView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C99148f.f290704a.mo138516a(3);
        EmojiPopView emojiPopView = this.f288898d;
        emojiPopView.f285769x = 1;
        emojiPopView.f285761p.setActivated(true);
        this.f288898d.f285761p.setVisibility(0);
        this.f288898d.f285761p.setText(C0966R.string.c78);
        C117292a.m165361g(this, "com/tencent/mm/view/popview/EmojiPopView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

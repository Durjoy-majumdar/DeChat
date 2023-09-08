package hq3;

import android.view.View;
import com.tencent.p014mm.view.popview.EmojiPopView;
import j20.C117292a;
import java.util.ArrayList;
import p585kl.C99148f;

/* renamed from: hq3.c */
public class C98502c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPopView f288897d;

    public C98502c(EmojiPopView emojiPopView) {
        this.f288897d = emojiPopView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/popview/EmojiPopView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C99148f.f290704a.mo138516a(2);
        EmojiPopView.m125296e(this.f288897d);
        C117292a.m165361g(this, "com/tencent/mm/view/popview/EmojiPopView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

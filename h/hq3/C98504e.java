package hq3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.view.popview.EmojiPopView;
import f40.C86709a0;
import j20.C117292a;
import j61.C60778e;
import java.util.ArrayList;
import java.util.Collections;
import ke3.C88144b;
import p585kl.C99148f;

/* renamed from: hq3.e */
public class C98504e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiPopView f288899d;

    public C98504e(EmojiPopView emojiPopView) {
        this.f288899d = emojiPopView;
    }

    public void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/popview/EmojiPopView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i2 = this.f288899d.f285769x;
        if (i2 == 1) {
            C99148f.f290704a.mo138516a(4);
            EmojiPopView emojiPopView = this.f288899d;
            Log.m105925i("MicroMsg.EmojiPopView", "delete: %s， %s, %s", emojiPopView.f285765t, Integer.valueOf(emojiPopView.f285764s), Boolean.valueOf(emojiPopView.f285770y));
            if (!emojiPopView.f285770y && ((i = emojiPopView.f285764s) == 0 || i == 1)) {
                Log.m105924i("MicroMsg.EmojiPopView", "showLoading");
                emojiPopView.f285770y = true;
                emojiPopView.postDelayed(emojiPopView.f285753A, 100);
                emojiPopView.f285768w = new C60778e(emojiPopView.f285764s, 2, Collections.singletonList(emojiPopView.f285765t));
                C86709a0.m107529k().f251779b.mo123460f(emojiPopView.f285768w);
            }
        } else if (i2 == 2) {
            C99148f.f290704a.mo138516a(2);
            EmojiPopView.m125296e(this.f288899d);
        } else {
            C99148f.f290704a.mo138516a(5);
            EmojiPopView emojiPopView2 = this.f288899d;
            EmojiInfo emojiInfo = emojiPopView2.f285766u;
            if (emojiInfo != null) {
                String str = emojiInfo.field_groupId;
                Intent intent = new Intent();
                intent.putExtra("preceding_scence", 3);
                intent.putExtra("download_entrance_scene", 16);
                intent.putExtra("from_popup", true);
                intent.putExtra("extra_id", str);
                C88144b.m109791i(emojiPopView2.getContext(), "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
            }
            emojiPopView2.mo104700a();
        }
        C117292a.m165361g(this, "com/tencent/mm/view/popview/EmojiPopView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

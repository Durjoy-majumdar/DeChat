package com.tencent.p014mm.plugin.game.p061ui.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.ui.message.s */
public class C42365s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f114592d;

    /* renamed from: e */
    public final /* synthetic */ C42119w f114593e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f114594f;

    /* renamed from: g */
    public final /* synthetic */ InteractiveMsgMRecycleView.C42327d f114595g;

    public C42365s(InteractiveMsgMRecycleView.C42327d dVar, TextView textView, C42119w wVar, ImageView imageView) {
        this.f114595g = dVar;
        this.f114592d = textView;
        this.f114593e = wVar;
        this.f114594f = imageView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f114592d.getText().equals(MMApplicationContext.getString(C0966R.string.n3u))) {
            this.f114593e.field_isGreet = true;
            this.f114592d.setText(MMApplicationContext.getString(C0966R.string.n3v));
            this.f114592d.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.f356935ao0));
            this.f114594f.setImageResource(C0966R.raw.game_comment_liked);
            InteractiveMsgMRecycleView.m46015D1(InteractiveMsgMRecycleView.this, this.f114593e.f113463X1.f113577u, 2, "", 1, 0);
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
            C42119w wVar = this.f114593e;
            InteractiveMsgMRecycleView.m46013B1(interactiveMsgMRecycleView, wVar.f113463X1.f113577u, true, wVar.field_relationType);
        } else {
            this.f114593e.field_isGreet = false;
            this.f114592d.setText(MMApplicationContext.getString(C0966R.string.n3u));
            this.f114592d.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.FG_0));
            if (C85875k4.m106211z()) {
                this.f114594f.setImageResource(C0966R.raw.game_comment_like_dark);
            } else {
                this.f114594f.setImageResource(C0966R.raw.game_comment_like);
            }
            InteractiveMsgMRecycleView.m46015D1(InteractiveMsgMRecycleView.this, this.f114593e.f113463X1.f113577u, 2, "", 2, 0);
            InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = InteractiveMsgMRecycleView.this;
            C42119w wVar2 = this.f114593e;
            InteractiveMsgMRecycleView.m46013B1(interactiveMsgMRecycleView2, wVar2.f113463X1.f113577u, false, wVar2.field_relationType);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

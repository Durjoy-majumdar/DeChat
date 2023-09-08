package com.tencent.p014mm.plugin.game.p061ui.message;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.game.ui.message.t */
public class C42366t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42119w f114596d;

    /* renamed from: e */
    public final /* synthetic */ C77426q f114597e;

    /* renamed from: f */
    public final /* synthetic */ InteractiveMsgMRecycleView.C42327d f114598f;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.t$a */
    public class C42367a implements C47883u {
        public C42367a() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C42366t.this.f114598f.f114511F.setBackgroundResource(C0966R.C0969drawable.cnj);
            C42366t tVar = C42366t.this;
            tVar.f114596d.field_relationType = 2;
            tVar.f114598f.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3s));
            C42366t.this.f114598f.f114511F.setBackgroundResource(C0966R.C0969drawable.cnk);
            InteractiveMsgMRecycleView.C42327d dVar = C42366t.this.f114598f;
            dVar.f114525U = (GradientDrawable) dVar.f114511F.getBackground();
            if (C85875k4.m106211z()) {
                InteractiveMsgMRecycleView.C42327d dVar2 = C42366t.this.f114598f;
                dVar2.f114525U.setColor(InteractiveMsgMRecycleView.this.getResources().getColor(C0966R.color.f356936ao2));
            }
            C42366t tVar2 = C42366t.this;
            InteractiveMsgMRecycleView.m46015D1(InteractiveMsgMRecycleView.this, tVar2.f114596d.f113463X1.f113577u, 3, "", 0, 2);
            C42366t tVar3 = C42366t.this;
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
            C42119w wVar = tVar3.f114596d;
            InteractiveMsgMRecycleView.m46013B1(interactiveMsgMRecycleView, wVar.f113463X1.f113577u, wVar.field_isGreet, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.message.t$b */
    public class C42368b implements C47883u {
        public C42368b() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            C42366t.this.f114598f.f114511F.setBackgroundResource(C0966R.C0969drawable.cnk);
            InteractiveMsgMRecycleView.C42327d dVar = C42366t.this.f114598f;
            dVar.f114525U = (GradientDrawable) dVar.f114511F.getBackground();
            if (C85875k4.m106211z()) {
                InteractiveMsgMRecycleView.C42327d dVar2 = C42366t.this.f114598f;
                dVar2.f114525U.setColor(InteractiveMsgMRecycleView.this.getResources().getColor(C0966R.color.f356936ao2));
            }
            C42366t tVar = C42366t.this;
            C42119w wVar = tVar.f114596d;
            wVar.field_relationType = 0;
            InteractiveMsgMRecycleView.m46015D1(InteractiveMsgMRecycleView.this, wVar.f113463X1.f113577u, 3, "", 0, 2);
            C42366t tVar2 = C42366t.this;
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
            C42119w wVar2 = tVar2.f114596d;
            InteractiveMsgMRecycleView.m46013B1(interactiveMsgMRecycleView, wVar2.f113463X1.f113577u, wVar2.field_isGreet, 0);
            C42366t.this.f114598f.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3r));
        }
    }

    public C42366t(InteractiveMsgMRecycleView.C42327d dVar, C42119w wVar, C77426q qVar) {
        this.f114598f = dVar;
        this.f114596d = wVar;
        this.f114597e = qVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ViewGroup.LayoutParams layoutParams = this.f114598f.f114511F.getLayoutParams();
        layoutParams.width = C76577a.m92151b(InteractiveMsgMRecycleView.this.f114489C1, 66);
        InteractiveMsgMRecycleView.C42327d dVar = this.f114598f;
        dVar.f114511F.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.BW_100));
        int i = this.f114596d.field_relationType;
        if (i == 0) {
            this.f114598f.f114511F.setBackgroundResource(C0966R.C0969drawable.cnj);
            this.f114598f.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3t));
            InteractiveMsgMRecycleView.C42327d dVar2 = this.f114598f;
            dVar2.f114511F.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
            C42119w wVar = this.f114596d;
            wVar.field_relationType = 1;
            InteractiveMsgMRecycleView.m46015D1(InteractiveMsgMRecycleView.this, wVar.f113463X1.f113577u, 3, "", 0, 1);
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = InteractiveMsgMRecycleView.this;
            C42119w wVar2 = this.f114596d;
            InteractiveMsgMRecycleView.m46013B1(interactiveMsgMRecycleView, wVar2.f113463X1.f113577u, wVar2.field_isGreet, 1);
        } else if (i == 2) {
            this.f114598f.f114511F.setBackgroundResource(C0966R.C0969drawable.cnj);
            this.f114598f.f114511F.setText(MMApplicationContext.getString(C0966R.string.n3n));
            InteractiveMsgMRecycleView.C42327d dVar3 = this.f114598f;
            dVar3.f114511F.setTextColor(InteractiveMsgMRecycleView.this.f114489C1.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
            layoutParams.width = C76577a.m92151b(InteractiveMsgMRecycleView.this.f114489C1, 80);
            C42119w wVar3 = this.f114596d;
            wVar3.field_relationType = 3;
            InteractiveMsgMRecycleView.m46015D1(InteractiveMsgMRecycleView.this, wVar3.f113463X1.f113577u, 3, "", 0, 1);
            InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = InteractiveMsgMRecycleView.this;
            C42119w wVar4 = this.f114596d;
            InteractiveMsgMRecycleView.m46013B1(interactiveMsgMRecycleView2, wVar4.f113463X1.f113577u, wVar4.field_isGreet, 3);
        } else if (i != 3) {
            this.f114597e.mo107603o();
            this.f114597e.mo107600l(new C42368b());
        } else {
            this.f114597e.mo107603o();
            this.f114597e.mo107600l(new C42367a());
        }
        this.f114598f.f114511F.setLayoutParams(layoutParams);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/message/InteractiveMsgMRecycleView$MsgBodyViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

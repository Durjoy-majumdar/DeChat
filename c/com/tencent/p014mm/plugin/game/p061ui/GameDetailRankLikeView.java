package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42066i0;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ob0.C47350c;
import ob0.C89144l0;
import py1.C47588g5;
import py1.C47595h5;
import ry1.C48157t;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailRankLikeView */
public class GameDetailRankLikeView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public C42066i0 f113732d;

    /* renamed from: e */
    public String f113733e;

    /* renamed from: f */
    public C42066i0.C42067a f113734f;

    /* renamed from: g */
    public Drawable f113735g;

    /* renamed from: h */
    public Drawable f113736h;

    /* renamed from: i */
    public Animation f113737i;

    /* renamed from: j */
    public ImageView f113738j;

    /* renamed from: n */
    public TextView f113739n;

    /* renamed from: o */
    public int f113740o;

    public GameDetailRankLikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setCount(int i) {
        if (i > 99) {
            this.f113739n.setText("99+");
        } else if (i == 0) {
            this.f113739n.setText("");
        } else {
            TextView textView = this.f113739n;
            textView.setText("" + i);
        }
    }

    /* renamed from: a */
    public final void mo66143a() {
        C42066i0.C42067a aVar = this.f113734f;
        if (aVar != null) {
            if (aVar.f113345i) {
                this.f113738j.setImageDrawable(this.f113735g);
            } else {
                this.f113738j.setImageDrawable(this.f113736h);
            }
            setCount(this.f113734f.f113344h);
            return;
        }
        setVisibility(8);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailRankLikeView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!C75592q0.m90789s().equals(this.f113734f.f113341e)) {
            C42066i0.C42067a aVar = this.f113734f;
            if (!aVar.f113345i) {
                aVar.f113345i = true;
                aVar.f113344h++;
                this.f113732d.mo66036a();
                String str = this.f113733e;
                String str2 = this.f113734f.f113341e;
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new C47588g5();
                bVar.f127067b = new C47595h5();
                bVar.f127068c = "/cgi-bin/mmgame-bin/upfriend";
                bVar.f127069d = 1330;
                C47350c a = bVar.mo72403a();
                C47588g5 g5Var = (C47588g5) a.f127055a.f127080a;
                g5Var.f127721d = str;
                g5Var.f127722e = str2;
                C89144l0.m111429e(a, new C48157t(this), false);
                C40314g.m43487f(getContext(), 12, TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED, 1, 2, this.f113733e, this.f113740o, (String) null);
                mo66143a();
                this.f113738j.startAnimation(this.f113737i);
            }
        } else if (this.f113734f.f113344h > 0) {
            Intent intent = new Intent(getContext(), GameDetailRankLikedUI.class);
            intent.putExtra("extra_appdi", this.f113733e);
            Context context = getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameDetailRankLikeView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/GameDetailRankLikeView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailRankLikeView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113735g = getContext().getResources().getDrawable(C0966R.C0969drawable.bgo);
        this.f113736h = getContext().getResources().getDrawable(C0966R.C0969drawable.bgn);
        this.f113737i = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2484e8);
        View.inflate(getContext(), C0966R.C0971layout.avq, this);
        setOnClickListener(this);
        this.f113738j = (ImageView) findViewById(C0966R.C0970id.fnl);
        this.f113739n = (TextView) findViewById(C0966R.C0970id.fno);
    }

    public void setSourceScene(int i) {
        this.f113740o = i;
    }
}

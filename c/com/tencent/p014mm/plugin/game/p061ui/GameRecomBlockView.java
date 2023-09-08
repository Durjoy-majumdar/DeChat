package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import qy1.C12934a;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameRecomBlockView */
public class GameRecomBlockView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public Context f114131d;

    /* renamed from: e */
    public LayoutInflater f114132e = ((LayoutInflater) getContext().getSystemService("layout_inflater"));

    /* renamed from: f */
    public int f114133f;

    /* renamed from: g */
    public ViewGroup f114134g = this;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameRecomBlockView$a */
    public static class C42227a {

        /* renamed from: a */
        public String f114135a;

        /* renamed from: b */
        public int f114136b;

        /* renamed from: c */
        public String f114137c;

        /* renamed from: d */
        public String f114138d;

        /* renamed from: e */
        public String f114139e;

        public C42227a(String str, int i, String str2, String str3, String str4) {
            this.f114135a = str;
            this.f114136b = i;
            this.f114137c = str2;
            this.f114138d = str3;
            this.f114139e = str4;
        }
    }

    public GameRecomBlockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f114131d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C42227a)) {
            Log.m105928w("MicroMsg.GameRecomBlockView", "getTag is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42227a aVar = (C42227a) view.getTag();
        if (Util.isNullOrNil(aVar.f114137c)) {
            Log.m105928w("MicroMsg.GameRecomBlockView", "jumpUrl is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C40314g.m43487f(this.f114131d, 10, 1021, aVar.f114136b, C52642c.m59002t(this.f114131d, aVar.f114137c, aVar.f114139e), aVar.f114135a, this.f114133f, C12934a.m12382d(aVar.f114138d));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameRecomBlockView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Log.m105924i("MicroMsg.GameRecomBlockView", "initView finished");
    }
}

package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import j20.C117292a;
import java.util.ArrayList;
import qy1.C12934a;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameNewClassifyView */
public class GameNewClassifyView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public int f114089d;

    /* renamed from: e */
    public LayoutInflater f114090e;

    /* renamed from: f */
    public LinearLayout f114091f;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameNewClassifyView$a */
    public static class C42222a {

        /* renamed from: a */
        public String f114092a;

        /* renamed from: b */
        public int f114093b;

        /* renamed from: c */
        public String f114094c;

        public C42222a(String str, int i, String str2) {
            this.f114092a = str;
            this.f114093b = i;
            this.f114094c = str2;
        }
    }

    public GameNewClassifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C42222a)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42222a aVar = (C42222a) view.getTag();
        if (!Util.isNullOrNil(aVar.f114092a)) {
            C52642c.m59001s(getContext(), aVar.f114092a);
            C40314g.m43487f(getContext(), 10, TXLiveConstants.PUSH_EVT_ROOM_OUT, aVar.f114093b, 7, (String) null, this.f114089d, C12934a.m12382d(aVar.f114094c));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameNewClassifyView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f114090e = (LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f114091f = (LinearLayout) findViewById(C0966R.C0970id.f358354em1);
    }
}

package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import kg3.C76577a;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView */
public class GameLibraryCategoriesView extends LinearLayout implements View.OnClickListener, C111847h {

    /* renamed from: d */
    public Context f114000d;

    /* renamed from: e */
    public LinearLayout f114001e;

    /* renamed from: f */
    public int f114002f;

    /* renamed from: g */
    public int f114003g;

    /* renamed from: h */
    public int f114004h;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView$a */
    public static class C42205a {

        /* renamed from: a */
        public int f114005a;

        /* renamed from: b */
        public String f114006b;

        /* renamed from: c */
        public String f114007c;

        /* renamed from: d */
        public String f114008d;

        /* renamed from: e */
        public int f114009e;
    }

    public GameLibraryCategoriesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114000d = context;
    }

    public void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof C42205a)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42205a aVar = (C42205a) view.getTag();
        if (!Util.isNullOrNil(aVar.f114008d)) {
            C52642c.m59001s(this.f114000d, aVar.f114008d);
            i = 7;
        } else {
            Intent intent = new Intent(this.f114000d, GameCategoryUI.class);
            intent.putExtra("extra_type", 1);
            intent.putExtra("extra_category_id", aVar.f114005a);
            intent.putExtra("extra_category_name", aVar.f114007c);
            intent.putExtra("game_report_from_scene", aVar.f114005a + 100);
            Context context = this.f114000d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i = 6;
        }
        C40314g.m43484c(this.f114000d, 11, aVar.f114005a + 100, aVar.f114009e, i, this.f114002f, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryCategoriesView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f114001e = (LinearLayout) findViewById(C0966R.C0970id.elt);
        int width = ((WindowManager) this.f114000d.getSystemService("window")).getDefaultDisplay().getWidth();
        int i = (width * 100) / 750;
        this.f114003g = i;
        int i2 = (width - (i * 6)) / 14;
        this.f114004h = i2;
        this.f114001e.setPadding(i2, C76577a.m92151b(this.f114000d, 12), this.f114004h, C76577a.m92151b(this.f114000d, 12));
    }

    public void setData(LinkedList<C42205a> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.GameLibraryCategoriesView", "No categories");
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f114001e.removeAllViews();
        Iterator<C42205a> it = linkedList.iterator();
        while (it.hasNext()) {
            C42205a next = it.next();
            LinearLayout linearLayout = new LinearLayout(this.f114000d);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this.f114000d);
            ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            C20828a b = C20828a.m22825b();
            String str = next.f114006b;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59347c = true;
            b.mo32519h(str, imageView, bVar.mo32666a());
            int i = this.f114003g;
            linearLayout.addView(imageView, i, i);
            TextView textView = new TextView(this.f114000d);
            textView.setText(next.f114007c);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(getResources().getColor(C0966R.color.f3563xt));
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setPadding(0, C76577a.m92151b(this.f114000d, 6), 0, 0);
            linearLayout.addView(textView);
            linearLayout.setTag(next);
            linearLayout.setOnClickListener(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i2 = this.f114004h;
            layoutParams.setMargins(i2, 0, i2, 0);
            this.f114001e.addView(linearLayout, layoutParams);
        }
    }

    public void setSourceScene(int i) {
        this.f114002f = i;
    }
}

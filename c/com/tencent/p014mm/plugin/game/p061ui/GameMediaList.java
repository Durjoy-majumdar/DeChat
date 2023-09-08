package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameMediaList */
public class GameMediaList extends LinearLayout implements View.OnClickListener {

    /* renamed from: d */
    public int f114051d;

    /* renamed from: e */
    public LinkedList<String> f114052e;

    /* renamed from: f */
    public String f114053f = "";

    /* renamed from: g */
    public int f114054g = -1;

    /* renamed from: h */
    public int f114055h = 0;

    /* renamed from: i */
    public Context f114056i;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameMediaList$a */
    public static class C42215a {

        /* renamed from: a */
        public int f114057a;

        /* renamed from: b */
        public String f114058b;

        /* renamed from: c */
        public String f114059c;
    }

    public GameMediaList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameMediaList", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C42215a)) {
            Log.m105924i("MicroMsg.GameMediaList", "Invalid tag");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMediaList", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42215a aVar = (C42215a) view.getTag();
        int i = aVar.f114057a;
        if (i == 0) {
            int indexOf = this.f114052e.indexOf(aVar.f114058b);
            if (indexOf < 0) {
                indexOf = 0;
            }
            Intent intent = new Intent(getContext(), GameGalleryUI.class);
            String[] strArr = new String[this.f114052e.size()];
            this.f114052e.toArray(strArr);
            intent.putExtra("URLS", strArr);
            intent.putExtra("CURRENT", indexOf);
            intent.putExtra("REPORT_APPID", this.f114053f);
            intent.putExtra("REPORT_SCENE", this.f114054g);
            intent.putExtra("SOURCE_SCENE", this.f114055h);
            Context context = getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMediaList", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/game/ui/GameMediaList", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i == 1) {
            C52642c.m59001s(getContext(), aVar.f114058b);
            C40314g.m43487f(this.f114056i, this.f114054g, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, 1, 13, this.f114053f, this.f114055h, (String) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameMediaList", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setItemLayout(int i) {
        this.f114051d = i;
    }

    public void setMediaList(LinkedList<C42215a> linkedList) {
        LinkedList<C42215a> linkedList2 = linkedList;
        if (linkedList2 == null || linkedList.size() == 0) {
            setVisibility(8);
            return;
        }
        this.f114052e = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            C42215a aVar = linkedList2.get(i);
            if (!Util.isNullOrNil(aVar.f114058b) && aVar.f114057a == 0) {
                this.f114052e.add(aVar.f114058b);
            }
        }
        removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        int i2 = 0;
        while (i2 < linkedList.size()) {
            C42215a aVar2 = linkedList2.get(i2);
            if (!Util.isNullOrNil(aVar2.f114059c)) {
                View inflate = layoutInflater.inflate(this.f114051d, this, false);
                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.gqq);
                C20828a b = C20828a.m22825b();
                String str = aVar2.f114059c;
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59347c = true;
                b.mo32519h(str, imageView, bVar.mo32666a());
                if (aVar2.f114057a == 1) {
                    View findViewById = inflate.findViewById(C0966R.C0970id.gqi);
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/game/ui/GameMediaList", "setMediaList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameMediaList", "setMediaList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                addView(inflate);
                imageView.setTag(aVar2);
                imageView.setOnClickListener(this);
            }
            i2++;
            linkedList2 = linkedList;
        }
        setVisibility(0);
    }
}

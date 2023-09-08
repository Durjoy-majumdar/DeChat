package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import te3.C51434tr1;
import uy1.C14391b;
import uy1.C52645f;

/* renamed from: com.tencent.mm.plugin.game.ui.f */
public class C42314f extends BaseAdapter {

    /* renamed from: d */
    public boolean f114415d = false;

    /* renamed from: e */
    public boolean f114416e = false;

    /* renamed from: f */
    public int f114417f = 0;

    /* renamed from: g */
    public int f114418g = 0;

    /* renamed from: h */
    public int f114419h = 0;

    /* renamed from: i */
    public int f114420i = 0;

    /* renamed from: j */
    public Context f114421j;

    /* renamed from: n */
    public ArrayList<C42316b> f114422n;

    /* renamed from: o */
    public int f114423o;

    /* renamed from: p */
    public int f114424p = 0;

    /* renamed from: q */
    public boolean f114425q = false;

    /* renamed from: r */
    public boolean f114426r = false;

    /* renamed from: s */
    public ArrayList<C42318d> f114427s;

    /* renamed from: com.tencent.mm.plugin.game.ui.f$a */
    public static class C42315a {

        /* renamed from: a */
        public View f114428a;

        /* renamed from: b */
        public ImageView f114429b;

        /* renamed from: c */
        public TextView f114430c;

        /* renamed from: d */
        public TextView f114431d;

        /* renamed from: e */
        public TextView f114432e;

        /* renamed from: f */
        public TextView f114433f;

        /* renamed from: g */
        public View f114434g;

        /* renamed from: h */
        public TextView f114435h;

        /* renamed from: i */
        public TextView f114436i;
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.f$b */
    public static class C42316b {

        /* renamed from: a */
        public String f114437a;

        /* renamed from: b */
        public String f114438b;

        /* renamed from: c */
        public String f114439c;

        /* renamed from: d */
        public String f114440d;

        /* renamed from: e */
        public String f114441e;

        /* renamed from: f */
        public String f114442f;

        /* renamed from: g */
        public long f114443g;

        /* renamed from: h */
        public LinkedList<String> f114444h;

        /* renamed from: i */
        public int f114445i;

        /* renamed from: j */
        public int f114446j;

        /* renamed from: k */
        public int f114447k;

        /* renamed from: l */
        public boolean f114448l = false;

        /* renamed from: m */
        public C42317c f114449m;

        /* renamed from: a */
        public static C42316b m46011a(C51434tr1 tr12) {
            C42316b bVar = new C42316b();
            bVar.f114447k = 2;
            bVar.f114438b = tr12.f142366d;
            bVar.f114439c = tr12.f142367e;
            bVar.f114440d = tr12.f142368f;
            String str = tr12.f142369g;
            bVar.f114445i = tr12.f142370h;
            bVar.f114446j = tr12.f142371i;
            bVar.f114437a = tr12.f142372j;
            bVar.f114442f = tr12.f142374o;
            bVar.f114443g = (long) tr12.f142373n;
            bVar.f114449m = new C42317c(2, 3, str);
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.f$d */
    public class C42318d {

        /* renamed from: a */
        public int f114458a = -1;

        /* renamed from: b */
        public int f114459b = -1;

        public C42318d(C42314f fVar, C42313e eVar) {
        }
    }

    public C42314f(Context context, ArrayList<C42316b> arrayList) {
        this.f114421j = context;
        this.f114422n = arrayList;
        this.f114423o = context.getResources().getColor(C0966R.color.f3532wo);
    }

    /* renamed from: a */
    public final void mo66384a(TextView textView, String str) {
        if (!Util.isNullOrNil(str)) {
            ArrayList<C42318d> arrayList = this.f114427s;
            if (arrayList == null) {
                this.f114427s = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            StringBuilder sb = new StringBuilder(str);
            C42318d dVar = new C42318d(this, (C42313e) null);
            for (int indexOf = sb.indexOf("<em>"); indexOf >= 0; indexOf = sb.indexOf("<em>")) {
                dVar.f114458a = indexOf;
                sb.delete(indexOf, indexOf + 4);
                int indexOf2 = sb.indexOf("</em>");
                if (indexOf2 < 0) {
                    break;
                }
                dVar.f114459b = indexOf2;
                sb.delete(indexOf2, indexOf2 + 5);
                this.f114427s.add(dVar);
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            Iterator<C42318d> it = this.f114427s.iterator();
            while (it.hasNext()) {
                C42318d next = it.next();
                if (next.f114458a < next.f114459b) {
                    spannableString.setSpan(new ForegroundColorSpan(this.f114423o), next.f114458a, next.f114459b, 33);
                }
            }
            textView.setText(spannableString);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public int getCount() {
        ArrayList<C42316b> arrayList = this.f114422n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public Object getItem(int i) {
        return this.f114422n.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return ((C42316b) getItem(i)).f114447k;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C42315a aVar;
        int i2;
        TextView textView;
        C42316b bVar = (C42316b) getItem(i);
        if (view == null) {
            aVar = new C42315a();
            Context context = this.f114421j;
            int i3 = bVar.f114447k;
            view2 = View.inflate(context, i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? 0 : C0966R.C0971layout.axr : C0966R.C0971layout.axq : C0966R.C0971layout.axt : C0966R.C0971layout.axv : C0966R.C0971layout.axo : C0966R.C0971layout.axu, (ViewGroup) null);
            aVar.f114428a = view2.findViewById(C0966R.C0970id.elg);
            aVar.f114429b = (ImageView) view2.findViewById(C0966R.C0970id.elj);
            aVar.f114430c = (TextView) view2.findViewById(C0966R.C0970id.ell);
            aVar.f114431d = (TextView) view2.findViewById(C0966R.C0970id.ele);
            aVar.f114432e = (TextView) view2.findViewById(C0966R.C0970id.elh);
            aVar.f114433f = (TextView) view2.findViewById(C0966R.C0970id.elm);
            aVar.f114434g = view2.findViewById(C0966R.C0970id.eli);
            aVar.f114435h = (TextView) view2.findViewById(C0966R.C0970id.jyq);
            aVar.f114436i = (TextView) view2.findViewById(C0966R.C0970id.bw9);
            view2.setTag(aVar);
            TextView textView2 = aVar.f114430c;
            if (!(textView2 == null || (textView = aVar.f114432e) == null)) {
                textView2.getViewTreeObserver().addOnGlobalLayoutListener(new C42313e(this, textView2, textView));
            }
        } else {
            aVar = (C42315a) view.getTag();
            view2 = view;
        }
        int i4 = bVar.f114447k;
        if (i4 == 0) {
            aVar.f114432e.setText(bVar.f114438b);
        } else if (i4 == 1) {
            if (!Util.isNullOrNil(bVar.f114440d)) {
                C52645f.C52650d.C52651a aVar2 = new C52645f.C52650d.C52651a();
                aVar2.f147020a = false;
                aVar2.f147021b = false;
                C52645f.m59023a().mo73595e(aVar.f114429b, bVar.f114440d, aVar2.mo73598a(), (C52645f.C52652e) null);
            }
            mo66384a(aVar.f114430c, bVar.f114438b);
            mo66384a(aVar.f114431d, bVar.f114441e);
            mo66384a(aVar.f114432e, bVar.f114439c);
        } else if (i4 == 2) {
            if (!Util.isNullOrNil(bVar.f114440d)) {
                C52645f.C52650d.C52651a aVar3 = new C52645f.C52650d.C52651a();
                aVar3.f147020a = false;
                aVar3.f147021b = false;
                aVar3.f147023d = true;
                C52645f.m59023a().mo73595e(aVar.f114429b, bVar.f114440d, aVar3.mo73598a(), (C52645f.C52652e) null);
                aVar.f114429b.setVisibility(0);
            } else {
                aVar.f114429b.setVisibility(8);
            }
            mo66384a(aVar.f114430c, bVar.f114438b);
            mo66384a(aVar.f114432e, bVar.f114439c);
            if (!Util.isNullOrNil(bVar.f114442f)) {
                aVar.f114435h.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f114421j, bVar.f114442f));
                aVar.f114435h.setVisibility(0);
            } else {
                aVar.f114435h.setVisibility(8);
            }
            long j = bVar.f114443g;
            if (j > 0) {
                aVar.f114436i.setText(C14391b.m13703a(this.f114421j, j * 1000));
                aVar.f114436i.setVisibility(0);
            } else {
                aVar.f114436i.setVisibility(8);
            }
        } else if (i4 == 3) {
            if (!Util.isNullOrNil(bVar.f114440d)) {
                C52645f.C52650d.C52651a aVar4 = new C52645f.C52650d.C52651a();
                aVar4.f147020a = false;
                aVar4.f147021b = false;
                C52645f.m59023a().mo73595e(aVar.f114429b, bVar.f114440d, aVar4.mo73598a(), (C52645f.C52652e) null);
            }
            mo66384a(aVar.f114430c, bVar.f114438b);
            mo66384a(aVar.f114431d, bVar.f114441e);
            mo66384a(aVar.f114432e, bVar.f114439c);
            TextView textView3 = aVar.f114433f;
            LinkedList<String> linkedList = bVar.f114444h;
            StringBuilder sb = new StringBuilder();
            if (!Util.isNullOrNil((List) linkedList)) {
                int size = linkedList.size();
                int i5 = 0;
                while (true) {
                    i2 = size - 1;
                    if (i5 >= i2) {
                        break;
                    }
                    sb.append(linkedList.get(i5) + "\n");
                    i5++;
                }
                sb.append(linkedList.get(i2));
                textView3.setVisibility(0);
                textView3.setText(sb.toString());
            } else {
                textView3.setVisibility(8);
            }
        } else if (i4 == 5) {
            aVar.f114429b.setImageResource(C0966R.raw.search_more_button_icon);
            aVar.f114430c.setText(bVar.f114438b);
        } else if (i4 == 6) {
            aVar.f114430c.setText(bVar.f114438b);
        }
        int i6 = bVar.f114447k;
        if (i6 != 0) {
            if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 5) {
                aVar.f114428a.setBackgroundResource(C0966R.C0969drawable.f4855pa);
                int dimensionPixelSize = this.f114421j.getResources().getDimensionPixelSize(C0966R.dimen.f3943l0);
                aVar.f114428a.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            }
        } else if (bVar.f114448l) {
            View view3 = aVar.f114434g;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view5 = aVar.f114434g;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar6.mo10233c(0);
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    public int getViewTypeCount() {
        return 7;
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.f$c */
    public static class C42317c {

        /* renamed from: a */
        public int f114450a;

        /* renamed from: b */
        public String f114451b;

        /* renamed from: c */
        public String f114452c;

        /* renamed from: d */
        public int f114453d;

        /* renamed from: e */
        public int f114454e;

        /* renamed from: f */
        public int f114455f;

        /* renamed from: g */
        public String f114456g;

        /* renamed from: h */
        public int f114457h;

        public C42317c() {
        }

        public C42317c(int i, String str) {
            this.f114450a = i;
            this.f114452c = str;
        }

        public C42317c(int i, int i2, String str) {
            this.f114450a = i;
            this.f114452c = str;
        }

        public C42317c(int i, int i2, String str, String str2) {
            this.f114450a = i;
            this.f114451b = str;
            if (i == 2) {
                this.f114452c = str2;
            }
        }
    }
}

package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.ArtistUI;
import com.tencent.p014mm.plugin.sns.p106ui.C95992k;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import p216op.C100370j;
import te3.C101804kv2;
import te3.C64545m7;

/* renamed from: com.tencent.mm.plugin.sns.ui.j */
public class C95960j extends BaseAdapter {

    /* renamed from: d */
    public final Activity f280198d;

    /* renamed from: e */
    public final List<C101804kv2> f280199e = new ArrayList();

    /* renamed from: f */
    public final Map<Integer, Integer> f280200f = new HashMap();

    /* renamed from: g */
    public final Map<Integer, Integer> f280201g = new HashMap();

    /* renamed from: h */
    public int f280202h = 0;

    /* renamed from: i */
    public int f280203i = 0;

    /* renamed from: j */
    public final C95963c f280204j;

    /* renamed from: n */
    public final C95992k f280205n;

    /* renamed from: o */
    public final C95962b f280206o;

    /* renamed from: p */
    public String f280207p;

    /* renamed from: q */
    public C64545m7 f280208q;

    /* renamed from: com.tencent.mm.plugin.sns.ui.j$a */
    public class C95961a implements C95992k.C95993a {
        public C95961a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.j$b */
    public interface C95962b {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.j$c */
    public static abstract class C95963c {

        /* renamed from: a */
        public View.OnClickListener f280210a = new C95964a();

        /* renamed from: b */
        public View.OnClickListener f280211b = new C95965b();

        /* renamed from: c */
        public View.OnClickListener f280212c = new C95966c();

        /* renamed from: d */
        public C95967d f280213d = new C95967d();

        /* renamed from: com.tencent.mm.plugin.sns.ui.j$c$a */
        public class C95964a implements View.OnClickListener {
            public C95964a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$1");
                C95963c.this.f280213d = (C95967d) view.getTag();
                C95963c cVar = C95963c.this;
                C95967d dVar = cVar.f280213d;
                cVar.mo132042a(dVar.f280218b, dVar.f280217a);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.j$c$b */
        public class C95965b implements View.OnClickListener {
            public C95965b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$2");
                C95963c.this.f280213d = (C95967d) view.getTag();
                C95963c cVar = C95963c.this;
                C95967d dVar = cVar.f280213d;
                cVar.mo132042a(dVar.f280218b, dVar.f280217a);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.j$c$c */
        public class C95966c implements View.OnClickListener {
            public C95966c() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$3");
                C95963c.this.f280213d = (C95967d) view.getTag();
                C95963c cVar = C95963c.this;
                C95967d dVar = cVar.f280213d;
                cVar.mo132042a(dVar.f280218b, dVar.f280217a);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$3");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.j$c$d */
        public static class C95967d {

            /* renamed from: a */
            public int f280217a;

            /* renamed from: b */
            public String f280218b;
        }

        /* renamed from: a */
        public abstract void mo132042a(String str, int i);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.j$d */
    public class C95968d {

        /* renamed from: a */
        public TextView f280219a;

        /* renamed from: b */
        public TextView f280220b;

        /* renamed from: c */
        public ImageView f280221c;

        /* renamed from: d */
        public ImageView f280222d;

        /* renamed from: e */
        public ImageView f280223e;

        /* renamed from: f */
        public View f280224f;

        public C95968d() {
        }
    }

    public C95960j(Activity activity, String str, C95963c cVar, C95962b bVar) {
        new MMHandler();
        this.f280198d = activity;
        this.f280207p = str;
        this.f280204j = cVar;
        this.f280206o = bVar;
        this.f280205n = new C95992k(new C95961a());
        mo133480a();
    }

    /* renamed from: a */
    public void mo133480a() {
        SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (this.f280205n != null) {
            String HT = ((C100370j) C86312j.m106911c(C100370j.class)).mo72329HT();
            Log.m105918d("MicroMsg.ArtistAdapter", "packgePath: " + HT);
            C95992k kVar = this.f280205n;
            String str = this.f280207p;
            kVar.getClass();
            SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            kVar.f280317i = str;
            kVar.f280318j = HT;
            kVar.mo133228a(true);
            SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        }
        SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
    }

    /* renamed from: b */
    public final void mo133481b(int i, ImageView imageView, C95968d dVar) {
        SnsMethodCalculate.markStartTimeMs("setImgInfo", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        imageView.setVisibility(0);
        C95963c.C95967d dVar2 = new C95963c.C95967d();
        dVar2.f280218b = "";
        dVar2.f280217a = i;
        imageView.setTag(dVar2);
        C94866e1.Fx0().mo131105Y((C101804kv2) getItem(i), imageView, this.f280198d.hashCode(), C96983o3.f284139k);
        SnsMethodCalculate.markEndTimeMs("setImgInfo", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        int i = this.f280202h;
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return i;
    }

    public Object getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        Object obj = ((ArrayList) this.f280199e).get(i);
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return obj;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C95968d dVar;
        View view2;
        String str;
        String str2;
        C95968d dVar2;
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (view == null) {
            C95968d dVar3 = new C95968d();
            View inflate = View.inflate(this.f280198d, C0966R.C0971layout.c29, (ViewGroup) null);
            dVar3.f280219a = (TextView) inflate.findViewById(C0966R.C0970id.jwq);
            dVar3.f280220b = (TextView) inflate.findViewById(C0966R.C0970id.jwr);
            dVar3.f280221c = (ImageView) inflate.findViewById(C0966R.C0970id.f5t);
            dVar3.f280222d = (ImageView) inflate.findViewById(C0966R.C0970id.f5u);
            dVar3.f280223e = (ImageView) inflate.findViewById(C0966R.C0970id.f5v);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.fpg);
            dVar3.f280224f = inflate.findViewById(C0966R.C0970id.fo9);
            dVar3.f280221c.setOnClickListener(this.f280204j.f280210a);
            dVar3.f280222d.setOnClickListener(this.f280204j.f280211b);
            dVar3.f280223e.setOnClickListener(this.f280204j.f280212c);
            inflate.setTag(dVar3);
            dVar = dVar3;
            view2 = inflate;
        } else {
            dVar = (C95968d) view.getTag();
            view2 = view;
        }
        int intValue = ((HashMap) this.f280200f).get(Integer.valueOf(i)) != null ? ((Integer) ((HashMap) this.f280200f).get(Integer.valueOf(i))).intValue() : -1;
        dVar.getClass();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistAdapter$ViewHolder");
        dVar.f280221c.setVisibility(8);
        dVar.f280222d.setVisibility(8);
        dVar.f280223e.setVisibility(8);
        View view3 = dVar.f280224f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter$ViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$ViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C95960j jVar = C95960j.this;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        String str3 = jVar.f280207p;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (str3.equals("en")) {
            dVar.f280219a.setVisibility(8);
            dVar.f280220b.setVisibility(4);
        } else {
            dVar.f280219a.setVisibility(4);
            dVar.f280220b.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistAdapter$ViewHolder");
        if (intValue >= this.f280203i || intValue == -1) {
            str = "getView";
            str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            view2.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view2;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("createView", str2);
        } else {
            int i2 = intValue - 1;
            String str4 = i2 >= 0 ? ((C101804kv2) getItem(i2)).f298691f : "";
            view2.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view2;
            str = "getView";
            String str5 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            String str6 = str4;
            String str7 = "createView";
            String str8 = "";
            C95968d dVar4 = dVar;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((HashMap) this.f280201g).get(Integer.valueOf(i)) != null ? ((Integer) ((HashMap) this.f280201g).get(Integer.valueOf(i))).intValue() : 1;
            C101804kv2 kv22 = (C101804kv2) getItem(intValue);
            if (!kv22.f298691f.equals(str8) && kv22.f298691f.equals(str6)) {
                dVar2 = dVar4;
            } else if (this.f280207p.equals("en")) {
                dVar2 = dVar4;
                dVar2.f280220b.setVisibility(0);
                dVar2.f280220b.setText(kv22.f298691f + str8);
                View view7 = dVar2.f280224f;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                dVar2 = dVar4;
                dVar2.f280219a.setVisibility(0);
                dVar2.f280219a.setText(kv22.f298691f + str8);
                View view9 = dVar2.f280224f;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (intValue2 >= 1) {
                mo133481b(intValue, dVar2.f280221c, dVar2);
            }
            if (intValue2 >= 2) {
                mo133481b(intValue + 1, dVar2.f280222d, dVar2);
            }
            if (intValue2 >= 3) {
                mo133481b(intValue + 2, dVar2.f280223e, dVar2);
            }
            C95962b bVar = this.f280206o;
            if (bVar != null) {
                C64545m7 m7Var = this.f280208q;
                ArtistUI.C95318e eVar = (ArtistUI.C95318e) bVar;
                SnsMethodCalculate.markStartTimeMs("onRefreshAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                if (ArtistUI.m121412I7(ArtistUI.this) != null) {
                    ArtistUI.m121412I7(ArtistUI.this).setVisibility(0);
                    ArtistUI.m121412I7(ArtistUI.this).setUserName(m7Var);
                }
                SnsMethodCalculate.markEndTimeMs("onRefreshAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
            }
            str2 = str5;
            SnsMethodCalculate.markEndTimeMs(str7, str2);
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
        return view2;
    }
}

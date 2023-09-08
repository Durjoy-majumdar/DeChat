package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c81.C39904a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.XWebFeature;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import m71.C46948b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import qo3.C89779i0;
import sx3.C48501y0;
import sx3.C64197v;
import sx3.C77813z;
import t71.C48544g;
import t71.C48546i;
import t71.C48550l;
import te3.C49683hb2;
import te3.C51723vp1;
import z04.C112550d0;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lob0/n;", "<init>", "()V", "a", "b", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI */
public final class ExdeviceFollowsUI extends MMSecDataActivity implements C11385n {

    /* renamed from: p */
    public static final /* synthetic */ int f111108p = 0;

    /* renamed from: d */
    public WxRecyclerView f111109d;

    /* renamed from: e */
    public C48546i f111110e;

    /* renamed from: f */
    public C48550l f111111f;

    /* renamed from: g */
    public C48544g f111112g;

    /* renamed from: h */
    public final ArrayList<C41259a> f111113h = new ArrayList<>();

    /* renamed from: i */
    public C89779i0 f111114i;

    /* renamed from: j */
    public final int f111115j = 4660;

    /* renamed from: n */
    public final int f111116n = 4661;

    /* renamed from: o */
    public final int f111117o = 10;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$a */
    public final class C41259a implements C9493c {

        /* renamed from: d */
        public long f111118d;

        /* renamed from: e */
        public C51723vp1 f111119e;

        public C41259a(ExdeviceFollowsUI exdeviceFollowsUI, long j, C51723vp1 vp12) {
            C87412m.m108594g(vp12, "follow");
            this.f111118d = j;
            this.f111119e = vp12;
        }

        /* renamed from: c */
        public int mo75c() {
            return 4;
        }

        public long getItemId() {
            return this.f111118d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$b */
    public final class C41260b extends C60896i<C41259a> {
        public C41260b() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.a4_;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C41259a aVar = (C41259a) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(aVar, "item");
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) oVar.mo85812D(C0966R.C0970id.cmo), aVar.f111119e.f143615e);
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.cmp);
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(ExdeviceFollowsUI.this, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(aVar.f111119e.f143615e), textView.getTextSize()));
            int i3 = aVar.f111119e.f143616f;
            ((TextView) oVar.mo85812D(C0966R.C0970id.clm)).setText(String.valueOf(i3));
            if (i3 >= 10000) {
                ((TextView) oVar.mo85812D(C0966R.C0970id.clm)).setTextColor(C76577a.m92153d(ExdeviceFollowsUI.this, C0966R.color.f3353p0));
            } else {
                ((TextView) oVar.mo85812D(C0966R.C0970id.clm)).setTextColor(C76577a.m92153d(ExdeviceFollowsUI.this, C0966R.color.f3352oz));
            }
            oVar.f44854d.setOnClickListener(new C41356o(ExdeviceFollowsUI.this, aVar));
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$c */
    public static final class C41261c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ExdeviceFollowsUI f111121d;

        public C41261c(ExdeviceFollowsUI exdeviceFollowsUI) {
            this.f111121d = exdeviceFollowsUI;
        }

        public final void run() {
            ExdeviceFollowsUI exdeviceFollowsUI = this.f111121d;
            int i = ExdeviceFollowsUI.f111108p;
            exdeviceFollowsUI.getClass();
            exdeviceFollowsUI.f111110e = new C48546i(exdeviceFollowsUI, C75592q0.m90789s(), "", (C46948b<C48546i>) null);
            C86709a0.m107524d().mo123460f(exdeviceFollowsUI.f111110e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$d */
    public static final class C41262d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ExdeviceFollowsUI f111122d;

        public C41262d(ExdeviceFollowsUI exdeviceFollowsUI) {
            this.f111122d = exdeviceFollowsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f111122d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$e */
    public static final class C41263e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ExdeviceFollowsUI f111123d;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$e$a */
        public static final class C41264a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ ExdeviceFollowsUI f111124d;

            public C41264a(ExdeviceFollowsUI exdeviceFollowsUI) {
                this.f111124d = exdeviceFollowsUI;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                C48546i iVar = this.f111124d.f111110e;
                if (iVar != null) {
                    C86709a0.m107524d().mo123458d(iVar);
                }
                dialogInterface.dismiss();
            }
        }

        public C41263e(ExdeviceFollowsUI exdeviceFollowsUI) {
            this.f111123d = exdeviceFollowsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceFollowsUI exdeviceFollowsUI = this.f111123d;
            exdeviceFollowsUI.f111114i = C76879j.m92724R(exdeviceFollowsUI, exdeviceFollowsUI.getString(C0966R.string.a3h), this.f111123d.getString(C0966R.string.gas), true, true, new C41264a(this.f111123d));
            this.f111123d.f111111f = new C48550l((C46948b<C48550l>) null);
            C86709a0.m107524d().mo123460f(this.f111123d.f111111f);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$f */
    public static final class C41265f<T> implements Comparator {

        /* renamed from: d */
        public static final C41265f<T> f111125d = new C41265f<>();

        public int compare(Object obj, Object obj2) {
            return ((C41259a) obj2).f111119e.f143616f - ((C41259a) obj).f111119e.f143616f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI$g */
    public static final class C41266g<T> implements Comparator {

        /* renamed from: d */
        public static final C41266g<T> f111126d = new C41266g<>();

        public int compare(Object obj, Object obj2) {
            return ((C41259a) obj2).f111119e.f143616f - ((C41259a) obj).f111119e.f143616f;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a4a;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return C48501y0.m53873h(importUIComponents, C39904a.class);
        }
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.f111115j) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("Select_Contact");
                C87412m.m108591d(stringExtra);
                Object[] array = C112550d0.m153785U(stringExtra, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                ArrayList<String> stringsToList = Util.stringsToList((String[]) array);
                if (stringsToList != null) {
                    C89779i0 i0Var = this.f111114i;
                    if (i0Var != null) {
                        i0Var.show();
                    }
                    this.f111112g = new C48544g(stringsToList, (C46948b<C48544g>) null);
                    C86709a0.m107529k().f251779b.mo123460f(this.f111112g);
                }
            }
        } else if (i == this.f111116n && i2 == -1 && intent != null && intent.getBooleanExtra("KeyNeedUpdateRank", false)) {
            C119179t tVar = C119157j.f356862d;
            C41261c cVar = new C41261c(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(cVar, 500, false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cfu);
        setBackBtn(new C41262d(this));
        addIconOptionMenu(0, C0966R.raw.icons_outlined_add, new C41263e(this));
        C86709a0.m107524d().mo123455a(XWebFeature.INTERFACE_CONFIGURE_V8_LITE, this);
        C86709a0.m107524d().mo123455a(1777, this);
        C86709a0.m107524d().mo123455a(1758, this);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.iiq);
        this.f111109d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        WxRecyclerView wxRecyclerView2 = this.f111109d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new WxRecyclerAdapter(new ExdeviceFollowsUI$buildItemConverts$1(this), this.f111113h, false));
        }
        this.f111110e = new C48546i(this, C75592q0.m90789s(), "", (C46948b<C48546i>) null);
        C86709a0.m107524d().mo123460f(this.f111110e);
    }

    public void onDestroy() {
        C48546i iVar = this.f111110e;
        if (iVar != null) {
            C86709a0.m107524d().mo123458d(iVar);
        }
        C48550l lVar = this.f111111f;
        if (lVar != null) {
            C86709a0.m107524d().mo123458d(lVar);
        }
        C48544g gVar = this.f111112g;
        if (gVar != null) {
            C86709a0.m107524d().mo123458d(gVar);
        }
        C86709a0.m107524d().mo123470p(XWebFeature.INTERFACE_CONFIGURE_V8_LITE, this);
        C86709a0.m107524d().mo123470p(1777, this);
        C86709a0.m107524d().mo123470p(1758, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        RecyclerView.C16613e adapter;
        ArrayList<C51723vp1> arrayList;
        RecyclerView.C16613e adapter2;
        LinkedList<C51723vp1> linkedList;
        C117747y yVar2 = yVar;
        int i3 = 0;
        if (C87412m.m108589b(yVar2, this.f111110e)) {
            if (i == 0 && i2 == 0) {
                this.f111113h.clear();
                C49683hb2 hb22 = ((C39904a) C39818r.f106831a.mo62444c(this).mo75002a(C39904a.class)).f106990f;
                if (!(hb22 == null || (linkedList = hb22.f134548q) == null)) {
                    int i4 = 0;
                    for (T next : linkedList) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            C51723vp1 vp12 = (C51723vp1) next;
                            ArrayList<C41259a> arrayList2 = this.f111113h;
                            C87412m.m108593f(vp12, "follow");
                            arrayList2.add(new C41259a(this, (long) i4, vp12));
                            i4 = i5;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                C77813z.m93909o(this.f111113h, C41265f.f111125d);
                WxRecyclerView wxRecyclerView = this.f111109d;
                if (!(wxRecyclerView == null || (adapter2 = wxRecyclerView.getAdapter()) == null)) {
                    adapter2.notifyDataSetChanged();
                }
                if (this.f111113h.size() == 0) {
                    View findViewById = findViewById(C0966R.C0970id.hgq);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View findViewById2 = findViewById(C0966R.C0970id.hgq);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                View findViewById3 = findViewById(C0966R.C0970id.hgq);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C89779i0 i0Var = this.f111114i;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            View findViewById4 = findViewById(C0966R.C0970id.f358619g33);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f111110e = null;
        } else if (C87412m.m108589b(yVar2, this.f111111f)) {
            if (i == 0 && i2 == 0) {
                C89779i0 i0Var2 = this.f111114i;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                C48550l lVar = this.f111111f;
                if (lVar != null) {
                    List<String> list = lVar.f129869h;
                    C87412m.m108593f(list, "it.recentLikeUser");
                    List<String> list2 = lVar.f129867f;
                    C87412m.m108593f(list2, "it.mWechatSportFollows");
                    List<String> list3 = lVar.f129868g;
                    C87412m.m108593f(list3, "it.mMyFollows");
                    Intent intent = new Intent();
                    String listToString = Util.listToString(list, ",");
                    intent.putExtra("wechat_sport_contact", Util.listToString(list2, ","));
                    intent.putExtra("wechat_sport_recent_like", listToString);
                    String listToString2 = Util.listToString(list3, ",");
                    intent.putExtra("titile", getString(C0966R.string.cbx));
                    intent.putExtra("list_type", 12);
                    intent.putExtra("max_limit_num", this.f111117o);
                    intent.putExtra("too_many_member_tip_string", getString(C0966R.string.f360383cc0, new Object[]{Integer.valueOf(this.f111117o)}));
                    intent.putExtra("list_attr", C74560s1.m89278g(2, 4, 1, 131072, 128, 64, 16384));
                    intent.putExtra("always_select_contact", listToString2);
                    C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, this.f111115j);
                }
            }
            this.f111111f = null;
        } else if (C87412m.m108589b(yVar2, this.f111112g)) {
            if (i == 0 && i2 == 0) {
                int size = this.f111113h.size();
                C48544g gVar = this.f111112g;
                if (!(gVar == null || (arrayList = gVar.f129827g) == null)) {
                    if (!(true ^ arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (T next2 : arrayList) {
                            int i6 = i3 + 1;
                            if (i3 >= 0) {
                                C51723vp1 vp13 = (C51723vp1) next2;
                                ArrayList<C41259a> arrayList3 = this.f111113h;
                                C87412m.m108593f(vp13, "follow");
                                arrayList3.add(new C41259a(this, ((long) size) + ((long) i3), vp13));
                                i3 = i6;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                }
                C77813z.m93909o(this.f111113h, C41266g.f111126d);
                WxRecyclerView wxRecyclerView2 = this.f111109d;
                if (!(wxRecyclerView2 == null || (adapter = wxRecyclerView2.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
            }
            C89779i0 i0Var3 = this.f111114i;
            if (i0Var3 != null) {
                i0Var3.dismiss();
            }
            this.f111112g = null;
        }
    }
}

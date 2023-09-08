package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import bg0.C54458c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import de3.C75355a0;
import eb0.C75592q0;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import op3.C117878c;
import p910lj.C76701a;
import te3.C64566n;
import yf0.C79090a;

/* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI */
public class AAQueryListUI extends BaseAAPresenterActivity {

    /* renamed from: g */
    public C54458c f195940g = ((C54458c) this.f196016e.mo136940b(this, C54458c.class));

    /* renamed from: h */
    public ListView f195941h;

    /* renamed from: i */
    public C55425h f195942i;

    /* renamed from: j */
    public Dialog f195943j;

    /* renamed from: n */
    public boolean f195944n = false;

    /* renamed from: o */
    public boolean f195945o = false;

    /* renamed from: p */
    public View f195946p;

    /* renamed from: q */
    public AAQueryListH5UrlFooterView f195947q;

    /* renamed from: r */
    public String f195948r;

    /* renamed from: s */
    public int f195949s = 1;

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI$c */
    public class C55423c implements AdapterView.OnItemClickListener {
        public C55423c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C55425h hVar = AAQueryListUI.this.f195942i;
            if (hVar != null) {
                if (i < 0 || i >= hVar.getCount()) {
                    Log.m105925i("MicroMsg.AAQueryListUI", "click out of bound! %s", Integer.valueOf(i));
                    C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                int top = view.getTop();
                C64566n nVar = (C64566n) AAQueryListUI.this.f195942i.getItem(i);
                if (nVar != null) {
                    if (!Util.isNullOrNil(nVar.f184415j)) {
                        C75228t.m90219L(AAQueryListUI.this.getContext(), nVar.f184415j, true);
                    } else if (!Util.isNullOrNil(nVar.f184409d)) {
                        String str = null;
                        if (nVar.f184414i == 2) {
                            str = C75592q0.m90789s();
                        }
                        Intent intent = new Intent(AAQueryListUI.this, PaylistAAUI.class);
                        intent.putExtra("bill_no", nVar.f184409d);
                        intent.putExtra("launcher_user_name", str);
                        intent.putExtra("enter_scene", 4);
                        intent.putExtra("chatroom", nVar.f184416n);
                        intent.putExtra("item_position", i);
                        intent.putExtra("item_offset", top);
                        AAQueryListUI.this.startActivityForResult(intent, 1);
                    }
                }
            }
            C115669n.INSTANCE.mo160131h(13721, 5, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI$a */
    public class C68170a implements MenuItem.OnMenuItemClickListener {
        public C68170a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AAQueryListUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI$b */
    public class C68171b implements AbsListView.OnScrollListener {
        public C68171b() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (AAQueryListUI.this.f195941h.getLastVisiblePosition() == AAQueryListUI.this.f195941h.getCount() - 1 && AAQueryListUI.this.f195941h.getCount() > 0) {
                AAQueryListUI aAQueryListUI = AAQueryListUI.this;
                if (!aAQueryListUI.f195945o && !aAQueryListUI.f195944n) {
                    aAQueryListUI.f195941h.addFooterView(aAQueryListUI.f195946p);
                    AAQueryListUI aAQueryListUI2 = AAQueryListUI.this;
                    aAQueryListUI2.mo93733I7(false, aAQueryListUI2.f195949s);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI$d */
    public class C68172d implements C88631d.C76721a {
        public C68172d() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.AAQueryListUI", "getNexPage failed: %s", obj);
            Dialog dialog = AAQueryListUI.this.f195943j;
            if (dialog != null) {
                dialog.dismiss();
                AAQueryListUI.this.f195943j = null;
            }
            AAQueryListUI aAQueryListUI = AAQueryListUI.this;
            aAQueryListUI.f195944n = false;
            if (aAQueryListUI.f195941h.getFooterViewsCount() > 0) {
                AAQueryListUI aAQueryListUI2 = AAQueryListUI.this;
                aAQueryListUI2.f195941h.removeFooterView(aAQueryListUI2.f195946p);
            }
            if (obj instanceof String) {
                C76701a.makeText((Context) AAQueryListUI.this, (CharSequence) obj.toString(), 1).show();
            } else {
                C76701a.makeText((Context) AAQueryListUI.this, (int) C0966R.string.fel, 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListUI$e */
    public class C68173e implements C87581a<Object, C117878c<List, String, Boolean>> {

        /* renamed from: a */
        public final /* synthetic */ boolean f195953a;

        public C68173e(boolean z) {
            this.f195953a = z;
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            List list = (List) cVar.mo182596a(0);
            Log.m105925i("MicroMsg.AAQueryListUI", "record list size: %s, h5Url: %s, lastFlag: %s", Integer.valueOf(list.size()), cVar.mo182596a(1), cVar.mo182596a(2));
            if (!Util.isNullOrNil((String) cVar.mo182596a(1))) {
                AAQueryListUI.this.f195948r = (String) cVar.mo182596a(1);
            }
            if (this.f195953a) {
                ((ArrayList) AAQueryListUI.this.f195942i.f157896d).clear();
            }
            C55425h hVar = AAQueryListUI.this.f195942i;
            hVar.getClass();
            Log.m105925i("MicroMsg.AAQueryListAdapter", "addNewRecord: %s", list);
            if (list.size() > 0) {
                Log.m105925i("MicroMsg.AAQueryListAdapter", "addNewRecord size: %s", Integer.valueOf(list.size()));
                ((ArrayList) hVar.f157896d).addAll(list);
                hVar.notifyDataSetChanged();
            }
            Dialog dialog = AAQueryListUI.this.f195943j;
            if (dialog != null) {
                dialog.dismiss();
                AAQueryListUI.this.f195943j = null;
            }
            if (AAQueryListUI.this.f195941h.getVisibility() != 0) {
                AAQueryListUI.this.f195941h.setVisibility(0);
            }
            AAQueryListUI.this.f195944n = false;
            if (!((Boolean) cVar.mo182596a(2)).booleanValue()) {
                AAQueryListUI.this.f195945o = true;
            }
            if (AAQueryListUI.this.f195941h.getFooterViewsCount() > 0) {
                AAQueryListUI aAQueryListUI = AAQueryListUI.this;
                aAQueryListUI.f195941h.removeFooterView(aAQueryListUI.f195946p);
            }
            AAQueryListUI aAQueryListUI2 = AAQueryListUI.this;
            if (aAQueryListUI2.f195945o) {
                if (Util.isNullOrNil(aAQueryListUI2.f195948r)) {
                    Log.m105924i("MicroMsg.AAQueryListUI", "empty h5 url!");
                    aAQueryListUI2.f195947q.setVisibility(8);
                } else {
                    TextView bottomLinkTv = aAQueryListUI2.f195947q.getBottomLinkTv();
                    bottomLinkTv.setClickable(true);
                    bottomLinkTv.setOnTouchListener(new C75355a0(aAQueryListUI2));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(aAQueryListUI2.getString(C0966R.string.f7288bo));
                    spannableStringBuilder.setSpan(new C68271a(new C68292j(aAQueryListUI2)), 0, spannableStringBuilder.length(), 18);
                    bottomLinkTv.setText(spannableStringBuilder);
                }
                if (AAQueryListUI.this.f195947q.getVisibility() == 0) {
                    AAQueryListUI aAQueryListUI3 = AAQueryListUI.this;
                    aAQueryListUI3.f195941h.addFooterView(aAQueryListUI3.f195947q, (Object) null, false);
                }
            }
            return null;
        }
    }

    /* renamed from: I7 */
    public final void mo93733I7(boolean z, int i) {
        if (this.f195944n) {
            Log.m105924i("MicroMsg.AAQueryListUI", "getNextPage, loading");
            return;
        }
        if (z) {
            this.f195945o = false;
            this.f195941h.removeFooterView(this.f195947q);
        }
        this.f195944n = true;
        C54458c.C54459a aVar = this.f195940g.f152726b;
        aVar.getClass();
        ((C88633e) C88643g.m110548f(Boolean.valueOf(z), Integer.valueOf(i))).mo123061d(aVar).mo123062e(new C68173e(z)).mo123065b(new C68172d());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6264a2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            boolean booleanExtra = intent.getBooleanExtra("close_aa", false);
            int intExtra = intent.getIntExtra("item_position", 0);
            int intExtra2 = intent.getIntExtra("item_offset", 0);
            if (booleanExtra) {
                this.f195941h.setSelectionFromTop(intExtra, intExtra2);
                mo93733I7(true, this.f195949s);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C68170a());
        setMMTitle((int) C0966R.string.f7309cb);
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C55427i(this));
        ListView listView = (ListView) findViewById(C0966R.C0970id.f5275an);
        this.f195941h = listView;
        listView.setOnScrollListener(new C68171b());
        this.f195941h.setOnItemClickListener(new C55423c());
        this.f195946p = new AAQueryListLoadingMoreView(this);
        this.f195947q = new AAQueryListH5UrlFooterView(this);
        this.f195943j = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
        C55425h hVar = new C55425h(this, this.f195949s);
        this.f195942i = hVar;
        this.f195941h.setAdapter(hVar);
        this.f195941h.setVisibility(4);
        mo93733I7(false, this.f195949s);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C79090a.class);
    }
}

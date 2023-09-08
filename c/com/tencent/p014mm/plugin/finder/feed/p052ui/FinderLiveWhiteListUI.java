package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import nj3.C88989a;
import ok1.C62042e;
import qk1.C12846x2;
import sx3.C36907w;
import te3.C51745vv0;
import vf1.C14842w3;
import vf1.C14847x3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI */
public final class FinderLiveWhiteListUI extends MMFinderUI implements View.OnClickListener {

    /* renamed from: w */
    public static final /* synthetic */ int f14607w = 0;

    /* renamed from: o */
    public View f14608o;

    /* renamed from: p */
    public TextView f14609p;

    /* renamed from: q */
    public TextView f14610q;

    /* renamed from: r */
    public RecyclerView f14611r;

    /* renamed from: s */
    public C12846x2 f14612s;

    /* renamed from: t */
    public LinkedList<C51745vv0> f14613t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<C51745vv0> f14614u = new LinkedList<>();

    /* renamed from: v */
    public LinkedList<C12846x2.C12848b> f14615v = new LinkedList<>();

    /* renamed from: J7 */
    public String mo2994J7() {
        return "Finder.FinderLiveWhiteListUI";
    }

    public int getLayoutId() {
        return C0966R.C0971layout.al8;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.e_1) {
            Intent intent = new Intent();
            LinkedList<C51745vv0> linkedList = this.f14614u;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C51745vv0 byteArray : linkedList) {
                arrayList2.add(byteArray.toByteArray());
            }
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList2);
            LinkedList<C51745vv0> linkedList2 = this.f14614u;
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (C51745vv0 byteArray2 : linkedList2) {
                arrayList3.add(byteArray2.toByteArray());
            }
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList3);
            setResult(-1, intent);
            finish();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.aq9) {
            setResult(0);
            finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        T t;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        getController().mo177049H0(C85875k4.m106211z());
        View findViewById = findViewById(C0966R.C0970id.kom);
        this.f14608o = findViewById;
        if (findViewById != null) {
            findViewById.post(new C14842w3(this));
        }
        this.f14609p = (TextView) findViewById(C0966R.C0970id.aq9);
        this.f14610q = (TextView) findViewById(C0966R.C0970id.e_1);
        this.f14611r = (RecyclerView) findViewById(C0966R.C0970id.lpr);
        TextView textView = this.f14610q;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f14609p;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        C12846x2 x2Var = new C12846x2();
        x2Var.f36760d = new C14847x3(this);
        this.f14612s = x2Var;
        RecyclerView recyclerView = this.f14611r;
        Integer num = null;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.f14612s);
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = C75044y4.m89991c(recyclerView.getContext());
            }
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("KEY_PARAMS_WHITE_LIST");
        List list = serializableExtra instanceof List ? (List) serializableExtra : null;
        if (list != null) {
            C62042e.f176370a.mo87126w1(list, this.f14613t);
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST");
        List list2 = serializableExtra2 instanceof List ? (List) serializableExtra2 : null;
        if (list2 != null) {
            C62042e.f176370a.mo87126w1(list2, this.f14614u);
        }
        this.f14615v.clear();
        for (C51745vv0 vv02 : this.f14613t) {
            Iterator<T> it = this.f14614u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C51745vv0) t).f143709d, vv02.f143709d)) {
                    break;
                }
            }
            this.f14615v.add(new C12846x2.C12848b(t != null, vv02, 0, 4, (C8480h) null));
        }
        C12846x2 x2Var2 = this.f14612s;
        if (x2Var2 != null) {
            LinkedList<C12846x2.C12848b> linkedList = this.f14615v;
            StringBuilder sb = new StringBuilder();
            sb.append("updateWhiteList,ori size:");
            sb.append(x2Var2.f36761e.size());
            sb.append(",new size:");
            if (linkedList != null) {
                num = Integer.valueOf(linkedList.size());
            }
            sb.append(num);
            Log.m105924i("FinderLiveWhiteListAdapter", sb.toString());
            if (linkedList != null) {
                x2Var2.f36761e.clear();
                x2Var2.f36761e.addAll(linkedList);
            }
        }
        C12846x2 x2Var3 = this.f14612s;
        if (x2Var3 != null) {
            x2Var3.notifyDataSetChanged();
        }
        Log.m105924i("Finder.FinderLiveWhiteListUI", "initLogic visitorWhiteList size:" + this.f14613t.size() + ",chooseWhiteList size:" + this.f14614u.size());
    }
}

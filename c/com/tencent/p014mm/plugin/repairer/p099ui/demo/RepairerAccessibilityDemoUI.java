package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj2.C54857a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ke3.C88144b;
import kotlin.Metadata;
import p239sv.C36839q;
import p910lj.C76701a;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "a", "b", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI */
public final class RepairerAccessibilityDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public int f163895d;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$e */
    public static final class C30355e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAccessibilityDemoUI f81918d;

        public C30355e(RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
            this.f81918d = repairerAccessibilityDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76701a.makeText((Context) this.f81918d, (CharSequence) "repairer_dischild_click_btn click!", 0).show();
            ((C36839q) C86312j.m106911c(C36839q.class)).v40(this.f81918d.getContext(), "25984993448421345@kefu.openim");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$a */
    public static final class C57187a extends RecyclerView.C16613e<C57188a> {

        /* renamed from: d */
        public final List<C57189b> f163896d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$a$a */
        public static final class C57188a extends RecyclerView.C16631z {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57188a(View view) {
                super(view);
                C87412m.m108594g(view, "view");
            }
        }

        public C57187a(List<C57189b> list) {
            C87412m.m108594g(list, "datas");
            this.f163896d = list;
        }

        public int getItemCount() {
            return this.f163896d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C57188a aVar = (C57188a) zVar;
            C87412m.m108594g(aVar, "holder");
            ((TextView) aVar.f44854d.findViewById(C0966R.C0970id.ioe)).setText(this.f163896d.get(i).f163897a);
            aVar.f44854d.setTag(C0966R.C0970id.f359346ke3, this.f163896d.get(i).f163897a);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.bs8, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(parent.conte…o_list_item,parent,false)");
            return new C57188a(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$b */
    public static final class C57189b {

        /* renamed from: a */
        public String f163897a;

        public C57189b(String str) {
            C87412m.m108594g(str, "name");
            this.f163897a = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$c */
    public static final class C57190c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAccessibilityDemoUI f163898d;

        public C57190c(RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
            this.f163898d = repairerAccessibilityDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C54857a) C39818r.f106831a.mo62444c(this.f163898d).mo75002a(C54857a.class)).setValue("number_key", ((EditText) this.f163898d.findViewById(C0966R.C0970id.ioa)).getText().toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$d */
    public static final class C57191d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAccessibilityDemoUI f163899d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$d$a */
        public static final class C57192a implements C88144b.C9614f {

            /* renamed from: a */
            public final /* synthetic */ String f163900a;

            public C57192a(String str) {
                this.f163900a = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
                r3 = (r3 = r3.getComponent()).getClassName();
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean mo1258a(android.content.Context r1, android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
                /*
                    r0 = this;
                    r1 = 1
                    r2 = 0
                    if (r3 == 0) goto L_0x0019
                    android.content.ComponentName r3 = r3.getComponent()
                    if (r3 == 0) goto L_0x0019
                    java.lang.String r3 = r3.getClassName()
                    if (r3 == 0) goto L_0x0019
                    java.lang.String r4 = r0.f163900a
                    boolean r3 = z04.C112550d0.m153801u(r3, r4, r2)
                    if (r3 != r1) goto L_0x0019
                    goto L_0x001a
                L_0x0019:
                    r1 = 0
                L_0x001a:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerAccessibilityDemoUI.C57191d.C57192a.mo1258a(android.content.Context, android.app.Activity, android.content.Intent, int, android.os.Bundle):boolean");
            }
        }

        public C57191d(RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
            this.f163899d = repairerAccessibilityDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerAccessibilityDemoUI repairerAccessibilityDemoUI = this.f163899d;
            repairerAccessibilityDemoUI.f163895d++;
            ((TextView) repairerAccessibilityDemoUI.findViewById(C0966R.C0970id.iom)).setText(String.valueOf(this.f163899d.f163895d));
            ((CopyOnWriteArrayList) C88144b.f254912b).add(new C57192a(((EditText) this.f163899d.findViewById(C0966R.C0970id.ioa)).getText().toString()));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$f */
    public static final class C57193f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAccessibilityDemoUI f163901d;

        public C57193f(RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
            this.f163901d = repairerAccessibilityDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f163901d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$g */
    public static final class C57194g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerAccessibilityDemoUI f163902d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerAccessibilityDemoUI$g$a */
        public static final class C57195a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextView f163903d;

            public C57195a(TextView textView) {
                this.f163903d = textView;
            }

            public final void run() {
                this.f163903d.setText("Warn Text");
            }
        }

        public C57194g(RepairerAccessibilityDemoUI repairerAccessibilityDemoUI) {
            this.f163902d = repairerAccessibilityDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextView textView = (TextView) this.f163902d.findViewById(C0966R.C0970id.iow);
            textView.setText("I am warning!");
            view.postDelayed(new C57195a(textView), 3000);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerAccessibilityDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359945bs1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Button) findViewById(C0966R.C0970id.io_)).setOnClickListener(new C57190c(this));
        ((Button) findViewById(C0966R.C0970id.io9)).setOnClickListener(new C57191d(this));
        ((Button) findViewById(C0966R.C0970id.ioh)).setOnClickListener(new C30355e(this));
        setBackBtn(new C57193f(this));
        ((Button) findViewById(C0966R.C0970id.iov)).setOnClickListener(new C57194g(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.iof);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new C57187a(C64197v.m75537f(new C57189b("小赵"), new C57189b("小钱"), new C57189b("小孙"), new C57189b("小李"), new C57189b("小周"), new C57189b("小吴"), new C57189b("小郑"), new C57189b("小王"), new C57189b("小a"), new C57189b("小b"), new C57189b("小c"), new C57189b("小d"), new C57189b("小e"), new C57189b("小f"), new C57189b("小g"), new C57189b("小h"))));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C54857a.class);
    }
}

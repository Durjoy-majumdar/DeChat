package com.tencent.p014mm.plugin.sns.p106ui.sheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import av2.C54345a0;
import av2.C54348d;
import av2.C54353m;
import av2.C54354n;
import av2.C54355o;
import av2.C54360w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kg3.C76577a;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.sns.ui.sheet.b */
public final class C57432b extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final /* synthetic */ SnsGroupDialog f164513d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.b$b */
    public static final class C43150b implements View.OnClickListener {

        /* renamed from: d */
        public static final C43150b f116731d = new C43150b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$1");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.b$a */
    public static final class C57433a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f164514d;

        /* renamed from: e */
        public final /* synthetic */ long f164515e;

        /* renamed from: f */
        public final /* synthetic */ SnsGroupDialog f164516f;

        /* renamed from: g */
        public final /* synthetic */ int f164517g;

        /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.b$a$a */
        public static final class C57434a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f164518d;

            public C57434a(View view) {
                this.f164518d = view;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1$1");
                this.f164518d.setClickable(true);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1$1");
            }
        }

        public C57433a(View view, long j, SnsGroupDialog snsGroupDialog, int i) {
            this.f164514d = view;
            this.f164515e = j;
            this.f164516f = snsGroupDialog;
            this.f164517g = i;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1");
            this.f164514d.setClickable(false);
            View view2 = this.f164514d;
            view2.postDelayed(new C57434a(view2), this.f164515e);
            SnsGroupDialog snsGroupDialog = this.f164516f;
            C54354n a = ((C54353m) SnsGroupDialog.m66161L(snsGroupDialog).get(this.f164517g)).mo75121a();
            if (a != null) {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                str = a.f152520b;
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            } else {
                str = null;
            }
            SnsMethodCalculate.markStartTimeMs("access$showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsMethodCalculate.markStartTimeMs("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            if (str == null) {
                SnsMethodCalculate.markEndTimeMs("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            } else {
                Log.m105924i("MicroMsg.SnsGroupDialog", "showLabelDetailDialog:" + str);
                Context context = snsGroupDialog.getContext();
                C87412m.m108593f(context, "context");
                new C54360w(context, str).show();
                SnsMethodCalculate.markEndTimeMs("showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            }
            SnsMethodCalculate.markEndTimeMs("access$showLabelDetailDialog", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.b$c */
    public static final class C57435c extends RecyclerView.C16631z {
        public C57435c(View view) {
            super(view);
        }
    }

    public C57432b(SnsGroupDialog snsGroupDialog) {
        this.f164513d = snsGroupDialog;
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        int size = SnsGroupDialog.m66161L(this.f164513d).size();
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return size;
    }

    public int getItemViewType(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        C54353m mVar = (C54353m) SnsGroupDialog.m66161L(this.f164513d).get(i);
        mVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        int i2 = mVar.f152515a;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return i2;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        int i2;
        RecyclerView.C16631z zVar2 = zVar;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        C87412m.m108594g(zVar2, "holder");
        zVar2.f44854d.setOnClickListener(C43150b.f116731d);
        if (zVar2 instanceof C54345a0) {
            C54345a0 a0Var = (C54345a0) zVar2;
            C54353m mVar = (C54353m) SnsGroupDialog.m66161L(this.f164513d).get(i3);
            mVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            String str2 = mVar.f152516b;
            SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            C87412m.m108591d(str2);
            SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.sheet.TitleHolder");
            a0Var.f44854d.setClickable(false);
            View view = a0Var.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(str2);
            SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ui.sheet.TitleHolder");
        } else if (zVar2 instanceof C54355o) {
            C54355o oVar = (C54355o) zVar2;
            C54354n a = ((C54353m) SnsGroupDialog.m66161L(this.f164513d).get(i3)).mo75121a();
            SnsMethodCalculate.markStartTimeMs("setLabelInfo", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            SnsMethodCalculate.markStartTimeMs("getNameText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            Object value = ((C36570n) oVar.f152523z).getValue();
            C87412m.m108593f(value, "<get-nameText>(...)");
            TextView textView = (TextView) value;
            SnsMethodCalculate.markEndTimeMs("getNameText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            C96963p0 wx02 = C96963p0.wx0();
            Context context = MMApplicationContext.getContext();
            if (a != null) {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                str = a.f152520b;
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            } else {
                str = null;
            }
            textView.setText(wx02.mo83004M(context, str));
            if (a != null) {
                SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
                i2 = a.f152521c;
                SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            } else {
                i2 = 0;
            }
            SnsMethodCalculate.markStartTimeMs("getNumText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            Object value2 = ((C36570n) oVar.f152522A).getValue();
            C87412m.m108593f(value2, "<get-numText>(...)");
            SnsMethodCalculate.markEndTimeMs("getNumText", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            String q = C76577a.m92166q(oVar.f44854d.getContext(), C0966R.string.myt);
            C87412m.m108593f(q, "getString(\n             …_label_info\n            )");
            String format = String.format(q, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            ((TextView) value2).setText(format);
            SnsMethodCalculate.markEndTimeMs("setLabelInfo", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            if (getItemViewType(i3) == 3) {
                SnsMethodCalculate.markStartTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
                oVar.f44854d.setBackgroundResource(C0966R.C0969drawable.cls);
                SnsMethodCalculate.markEndTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            } else if (getItemViewType(i3) == 2) {
                SnsMethodCalculate.markStartTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
                oVar.f44854d.setBackgroundResource(C0966R.C0969drawable.clt);
                SnsMethodCalculate.markEndTimeMs("setBackgroundResource", "com.tencent.mm.plugin.sns.ui.sheet.LabelItemHolder");
            }
            View view2 = zVar2.f44854d;
            C87412m.m108593f(view2, "holder.itemView");
            view2.setOnClickListener(new C57433a(view2, 1000, this.f164513d, i));
        } else if (zVar2 instanceof C54348d) {
            C54348d dVar = (C54348d) zVar2;
            C54353m mVar2 = (C54353m) SnsGroupDialog.m66161L(this.f164513d).get(i3);
            mVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            C72996z1 z1Var = mVar2.f152518d;
            SnsMethodCalculate.markEndTimeMs("getContact", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            dVar.mo75118z(z1Var);
            if (getItemViewType(i3) == 6) {
                SnsGroupDialog snsGroupDialog = this.f164513d;
                SnsMethodCalculate.markStartTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                boolean z = snsGroupDialog.f164490L;
                SnsMethodCalculate.markEndTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                if (z || i3 != 0) {
                    dVar.mo75117y(C0966R.C0969drawable.cls);
                } else {
                    dVar.mo75117y(C0966R.C0969drawable.clv);
                }
            } else if (getItemViewType(i3) == 5) {
                SnsGroupDialog snsGroupDialog2 = this.f164513d;
                SnsMethodCalculate.markStartTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                boolean z2 = snsGroupDialog2.f164490L;
                SnsMethodCalculate.markEndTimeMs("access$getMHaveLabelChosen$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                if (z2 || i3 != 0) {
                    dVar.mo75117y(C0966R.C0969drawable.clt);
                } else {
                    dVar.mo75117y(C0966R.C0969drawable.clu);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C16631z zVar;
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        C87412m.m108594g(viewGroup, "parent");
        switch (i) {
            case 1:
                View inflate = C85868k2.m106137b(this.f164513d.getContext()).inflate(C0966R.C0971layout.d2z, viewGroup, false);
                C87412m.m108593f(inflate, "getInflater(context)\n   …tem_title, parent, false)");
                zVar = new C54345a0(inflate);
                break;
            case 2:
            case 3:
                View inflate2 = C85868k2.m106137b(this.f164513d.getContext()).inflate(C0966R.C0971layout.f360006d30, viewGroup, false);
                C87412m.m108593f(inflate2, "getInflater(context)\n   …abel_item, parent, false)");
                zVar = new C54355o(inflate2);
                break;
            case 4:
                zVar = new C57435c(C85868k2.m106137b(this.f164513d.getContext()).inflate(C0966R.C0971layout.d2x, viewGroup, false));
                break;
            case 5:
            case 6:
                View inflate3 = C85868k2.m106137b(this.f164513d.getContext()).inflate(C0966R.C0971layout.d2y, viewGroup, false);
                C87412m.m108593f(inflate3, "getInflater(context)\n   …tact_item, parent, false)");
                SnsGroupDialog snsGroupDialog = this.f164513d;
                snsGroupDialog.getClass();
                SnsMethodCalculate.markStartTimeMs("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                Context context = snsGroupDialog.f164492s;
                SnsMethodCalculate.markEndTimeMs("getUiContext", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                zVar = new C54348d(inflate3, context);
                break;
            default:
                zVar = new C54355o(new TextView(this.f164513d.getContext()));
                break;
        }
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1");
        return zVar;
    }
}

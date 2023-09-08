package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import ac2.C54001g;
import ac2.C54003h;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import bj2.C0294m;
import bj2.C0295n;
import bj2.C54469k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.mvvmlist.MapItemConvertFactory;
import com.tencent.p014mm.plugin.mvvmlist.SingleItemConvertFactory;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p278yh.C16009p;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C90363p0;
import zb2.C103009m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI */
public final class RepairerMvvmListDemoUI extends BaseRepairerUI {

    /* renamed from: i */
    public static final /* synthetic */ int f20461i = 0;

    /* renamed from: d */
    public final C13601g f20462d = C36568h.m40985a(new C5107i(this));

    /* renamed from: e */
    public final C13601g f20463e = C36568h.m40985a(C5102d.f20470d);

    /* renamed from: f */
    public final C13601g f20464f = C36568h.m40985a(new C5099a(this));

    /* renamed from: g */
    public final C13601g f20465g = C36568h.m40985a(new C5100b(this));

    /* renamed from: h */
    public final C13601g f20466h = C36568h.m40985a(new C5101c(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$a */
    public static final class C5099a extends C87413o implements C32224a<C103009m<C0294m>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5099a(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            super(0);
            this.f20467d = repairerMvvmListDemoUI;
        }

        public Object invoke() {
            return new C103009m(new C54469k((List) ((C36570n) this.f20467d.f20463e).getValue()), this.f20467d, new SingleItemConvertFactory(C0295n.class), false, 8, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$b */
    public static final class C5100b extends C87413o implements C32224a<C103009m<C0294m>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5100b(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            super(0);
            this.f20468d = repairerMvvmListDemoUI;
        }

        public Object invoke() {
            Class<C0295n> cls = C0295n.class;
            return new C103009m(new C54003h(((List) ((C36570n) this.f20468d.f20463e).getValue()).size(), new C5137k(this.f20468d)), this.f20468d, new MapItemConvertFactory(C90363p0.m113143b(new C13604l(0, cls)), cls), false, 8, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$c */
    public static final class C5101c extends C87413o implements C32224a<C103009m<C0294m>> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5101c(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            super(0);
            this.f20469d = repairerMvvmListDemoUI;
        }

        public Object invoke() {
            List<Number> list = (List) ((C36570n) this.f20469d.f20463e).getValue();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (Number intValue : list) {
                int intValue2 = intValue.intValue();
                arrayList.add(new C0294m(intValue2, FFmpegMetadataRetriever.METADATA_KEY_TITLE + intValue2));
            }
            return new C103009m(new C54001g(arrayList), this.f20469d, new SingleItemConvertFactory(C0295n.class), false, 8, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$d */
    public static final class C5102d extends C87413o implements C32224a<List<Integer>> {

        /* renamed from: d */
        public static final C5102d f20470d = new C5102d();

        public C5102d() {
            super(0);
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 100; i++) {
                arrayList.add(Integer.valueOf(i));
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$e */
    public static final class C5103e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20471d;

        public C5103e(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            this.f20471d = repairerMvvmListDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20471d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$f */
    public static final class C5104f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20472d;

        public C5104f(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            this.f20472d = repairerMvvmListDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f20472d;
            int i = RepairerMvvmListDemoUI.f20461i;
            repairerMvvmListDemoUI.mo6069H7().mo14636a().setAdapter((C103009m) ((C36570n) this.f20472d.f20464f).getValue());
            this.f20472d.mo6069H7().mo14636a().setLayoutManager(new LinearLayoutManager(this.f20472d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$g */
    public static final class C5105g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20473d;

        public C5105g(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            this.f20473d = repairerMvvmListDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f20473d;
            int i = RepairerMvvmListDemoUI.f20461i;
            repairerMvvmListDemoUI.mo6069H7().mo14636a().setAdapter((C103009m) ((C36570n) this.f20473d.f20465g).getValue());
            this.f20473d.mo6069H7().mo14636a().setLayoutManager(new LinearLayoutManager(this.f20473d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$h */
    public static final class C5106h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20474d;

        public C5106h(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            this.f20474d = repairerMvvmListDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f20474d;
            int i = RepairerMvvmListDemoUI.f20461i;
            repairerMvvmListDemoUI.mo6069H7().mo14636a().setAdapter((C103009m) ((C36570n) this.f20474d.f20466h).getValue());
            this.f20474d.mo6069H7().mo14636a().setLayoutManager(new LinearLayoutManager(this.f20474d));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerMvvmListDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI$i */
    public static final class C5107i extends C87413o implements C32224a<C16009p> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMvvmListDemoUI f20475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5107i(RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
            super(0);
            this.f20475d = repairerMvvmListDemoUI;
        }

        public Object invoke() {
            RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f20475d;
            int i = RepairerMvvmListDemoUI.f20461i;
            return new C16009p(repairerMvvmListDemoUI.getContentView());
        }
    }

    /* renamed from: H7 */
    public final C16009p mo6069H7() {
        return (C16009p) ((C36570n) this.f20462d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ctv;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MvvmListDemo");
        setBackBtn(new C5103e(this));
        C16009p H7 = mo6069H7();
        if (H7.f43072d == null) {
            H7.f43072d = (Button) H7.f43069a.findViewById(C0966R.C0970id.mop);
        }
        H7.f43072d.setOnClickListener(new C5104f(this));
        C16009p H72 = mo6069H7();
        if (H72.f43070b == null) {
            H72.f43070b = (Button) H72.f43069a.findViewById(C0966R.C0970id.moq);
        }
        H72.f43070b.setOnClickListener(new C5105g(this));
        C16009p H73 = mo6069H7();
        if (H73.f43071c == null) {
            H73.f43071c = (Button) H73.f43069a.findViewById(C0966R.C0970id.mor);
        }
        H73.f43071c.setOnClickListener(new C5106h(this));
        mo6069H7().mo14636a().setAdapter((C103009m) ((C36570n) this.f20464f).getValue());
        mo6069H7().mo14636a().setLayoutManager(new LinearLayoutManager(this));
    }
}

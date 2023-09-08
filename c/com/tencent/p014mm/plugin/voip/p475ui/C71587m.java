package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import qo3.C77390c0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.voip.ui.m */
public final class C71587m extends C77390c0 {

    /* renamed from: d */
    public final C32226l<C30540n, C13598b0> f207477d;

    /* renamed from: e */
    public final C13601g f207478e = C36568h.m40985a(new C71595h(this));

    /* renamed from: f */
    public final C13601g f207479f = C36568h.m40985a(new C71589b(this));

    /* renamed from: g */
    public final C13601g f207480g = C36568h.m40985a(new C71591d(this));

    /* renamed from: h */
    public final C13601g f207481h = C36568h.m40985a(new C71590c(this));

    /* renamed from: i */
    public final C13601g f207482i = C36568h.m40985a(new C71592e(this));

    /* renamed from: j */
    public final C13601g f207483j = C36568h.m40985a(new C71594g(this));

    /* renamed from: n */
    public final C13601g f207484n = C36568h.m40985a(new C71588a(this));

    /* renamed from: o */
    public final C13601g f207485o = C36568h.m40985a(new C71593f(this));

    /* renamed from: p */
    public final C13601g f207486p = C36568h.m40985a(new C71598k(this));

    /* renamed from: q */
    public final List<Integer> f207487q = C64197v.m75537f(8, 4, 2, 16, 32);

    /* renamed from: r */
    public final List<Integer> f207488r = C64197v.m75537f(4, 6, 8, 10, 12);

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$a */
    public static final class C71588a extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207489d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71588a(C71587m mVar) {
            super(0);
            this.f207489d = mVar;
        }

        public Object invoke() {
            return (EditText) this.f207489d.findViewById(C0966R.C0970id.f357890mp3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$b */
    public static final class C71589b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71589b(C71587m mVar) {
            super(0);
            this.f207490d = mVar;
        }

        public Object invoke() {
            return this.f207490d.findViewById(C0966R.C0970id.ald);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$c */
    public static final class C71590c extends C87413o implements C32224a<Spinner> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71590c(C71587m mVar) {
            super(0);
            this.f207491d = mVar;
        }

        public Object invoke() {
            return (Spinner) this.f207491d.findViewById(C0966R.C0970id.mwc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$d */
    public static final class C71591d extends C87413o implements C32224a<Spinner> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71591d(C71587m mVar) {
            super(0);
            this.f207492d = mVar;
        }

        public Object invoke() {
            return (Spinner) this.f207492d.findViewById(C0966R.C0970id.mwb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$e */
    public static final class C71592e extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71592e(C71587m mVar) {
            super(0);
            this.f207493d = mVar;
        }

        public Object invoke() {
            return (EditText) this.f207493d.findViewById(C0966R.C0970id.mp4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$f */
    public static final class C71593f extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71593f(C71587m mVar) {
            super(0);
            this.f207494d = mVar;
        }

        public Object invoke() {
            return (EditText) this.f207494d.findViewById(C0966R.C0970id.mp5);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$g */
    public static final class C71594g extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71594g(C71587m mVar) {
            super(0);
            this.f207495d = mVar;
        }

        public Object invoke() {
            return (EditText) this.f207495d.findViewById(C0966R.C0970id.mp6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$h */
    public static final class C71595h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71595h(C71587m mVar) {
            super(0);
            this.f207496d = mVar;
        }

        public Object invoke() {
            return this.f207496d.findViewById(C0966R.C0970id.f357588am1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$i */
    public static final class C71596i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207497d;

        public C71596i(C71587m mVar) {
            this.f207497d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C71587m mVar = this.f207497d;
            C32226l<C30540n, C13598b0> lVar = mVar.f207477d;
            List<Integer> list = mVar.f207487q;
            Object value = ((C36570n) mVar.f207480g).getValue();
            C87412m.m108593f(value, "<get-codecSpinner>(...)");
            int intValue = list.get(((Spinner) value).getSelectedItemPosition()).intValue();
            List<Integer> list2 = mVar.f207488r;
            Object value2 = ((C36570n) mVar.f207481h).getValue();
            C87412m.m108593f(value2, "<get-codecSizeSpinner>(...)");
            int intValue2 = list2.get(((Spinner) value2).getSelectedItemPosition()).intValue();
            Object value3 = ((C36570n) mVar.f207482i).getValue();
            C87412m.m108593f(value3, "<get-fpsEditTv>(...)");
            int i = Util.getInt(((EditText) value3).getText().toString(), 15);
            Object value4 = ((C36570n) mVar.f207483j).getValue();
            C87412m.m108593f(value4, "<get-intervalEditTv>(...)");
            int i2 = Util.getInt(((EditText) value4).getText().toString(), 10);
            Object value5 = ((C36570n) mVar.f207485o).getValue();
            C87412m.m108593f(value5, "<get-iPeriodEditTv>(...)");
            int i3 = Util.getInt(((EditText) value5).getText().toString(), 15);
            Object value6 = ((C36570n) mVar.f207486p).getValue();
            C87412m.m108593f(value6, "<get-rsLevelSpinner>(...)");
            Object selectedItem = ((Spinner) value6).getSelectedItem();
            C87412m.m108592e(selectedItem, "null cannot be cast to non-null type kotlin.String");
            int i4 = Util.getInt((String) selectedItem, 2);
            Object value7 = ((C36570n) mVar.f207484n).getValue();
            C87412m.m108593f(value7, "<get-bitrateEditTv>(...)");
            lVar.invoke(new C30540n(intValue, intValue2, i, i3, i2, i4, Util.getInt(((EditText) value7).getText().toString(), 600)));
            this.f207497d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$j */
    public static final class C71597j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207498d;

        public C71597j(C71587m mVar) {
            this.f207498d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f207498d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/QosParamDialog$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.m$k */
    public static final class C71598k extends C87413o implements C32224a<Spinner> {

        /* renamed from: d */
        public final /* synthetic */ C71587m f207499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71598k(C71587m mVar) {
            super(0);
            this.f207499d = mVar;
        }

        public Object invoke() {
            return (Spinner) this.f207499d.findViewById(C0966R.C0970id.mwd);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71587m(Context context, C32226l<? super C30540n, C13598b0> lVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "onAddParam");
        this.f207477d = lVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.ctw);
        setCanceledOnTouchOutside(true);
        Object value = ((C36570n) this.f207480g).getValue();
        C87412m.m108593f(value, "<get-codecSpinner>(...)");
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(getContext(), C0966R.array.f2606b9, 17367048);
        createFromResource.setDropDownViewResource(17367049);
        ((Spinner) value).setAdapter(createFromResource);
        Object value2 = ((C36570n) this.f207481h).getValue();
        C87412m.m108593f(value2, "<get-codecSizeSpinner>(...)");
        ArrayAdapter<CharSequence> createFromResource2 = ArrayAdapter.createFromResource(getContext(), C0966R.array.f2607b_, 17367048);
        createFromResource2.setDropDownViewResource(17367049);
        ((Spinner) value2).setAdapter(createFromResource2);
        Object value3 = ((C36570n) this.f207486p).getValue();
        C87412m.m108593f(value3, "<get-rsLevelSpinner>(...)");
        ArrayAdapter<CharSequence> createFromResource3 = ArrayAdapter.createFromResource(getContext(), C0966R.array.f2608ba, 17367048);
        createFromResource3.setDropDownViewResource(17367049);
        ((Spinner) value3).setAdapter(createFromResource3);
        Object value4 = ((C36570n) this.f207486p).getValue();
        C87412m.m108593f(value4, "<get-rsLevelSpinner>(...)");
        ((Spinner) value4).setSelection(1);
        Object value5 = ((C36570n) this.f207478e).getValue();
        C87412m.m108593f(value5, "<get-okBtn>(...)");
        ((View) value5).setOnClickListener(new C71596i(this));
        Object value6 = ((C36570n) this.f207479f).getValue();
        C87412m.m108593f(value6, "<get-cancelBtn>(...)");
        ((View) value6).setOnClickListener(new C71597j(this));
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = C85875k4.m106196n(0.9f);
            window.setAttributes(attributes);
        }
    }
}

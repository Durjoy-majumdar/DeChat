package com.tencent.p014mm.p136ui.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.search.FTSSearchView */
public class FTSSearchView extends LinearLayout {

    /* renamed from: d */
    public TextView f24721d;

    /* renamed from: e */
    public View f24722e;

    /* renamed from: f */
    public LinearLayout f24723f;

    /* renamed from: g */
    public LinearLayout f24724g;

    /* renamed from: h */
    public FTSEditTextView f24725h;

    /* renamed from: i */
    public View f24726i;

    /* renamed from: j */
    public boolean f24727j;

    /* renamed from: n */
    public WeImageView f24728n;

    /* renamed from: o */
    public boolean f24729o;

    /* renamed from: p */
    public C6995e f24730p;

    /* renamed from: com.tencent.mm.ui.search.FTSSearchView$a */
    public class C6991a implements View.OnClickListener {
        public C6991a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C6995e eVar = FTSSearchView.this.f24730p;
            if (eVar != null) {
                eVar.onClickBackBtn(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSSearchView$b */
    public class C6992b implements View.OnClickListener {
        public C6992b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSSearchView.this.getClass();
            C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSSearchView$c */
    public class C6993c implements View.OnClickListener {
        public C6993c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSSearchView.this.f24725h.mo70355k();
            FTSSearchView.this.f24725h.mo70361q();
            C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSSearchView$d */
    public interface C6994d {
        /* renamed from: a */
        void mo8024a(View view);
    }

    /* renamed from: com.tencent.mm.ui.search.FTSSearchView$e */
    public interface C6995e {
        void onClickBackBtn(View view);
    }

    /* renamed from: com.tencent.mm.ui.search.FTSSearchView$f */
    public interface C6996f extends Comparable {
        /* renamed from: SE */
        String mo8025SE();
    }

    public FTSSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24729o = false;
        mo8014a();
    }

    /* renamed from: a */
    public final void mo8014a() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.f24729o ? C0966R.C0971layout.asn : C0966R.C0971layout.asm, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.j57);
        this.f24723f = linearLayout;
        if (this.f24729o) {
            linearLayout.setBackgroundColor(getResources().getColor(C0966R.color.f2947a4));
        }
        this.f24724g = (LinearLayout) findViewById(C0966R.C0970id.ex5);
        TextView textView = (TextView) findViewById(C0966R.C0970id.apy);
        this.f24721d = textView;
        textView.setOnClickListener(new C6991a());
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.j5t);
        this.f24728n = weImageView;
        weImageView.setVisibility(this.f24729o ? 8 : 0);
        this.f24725h = (FTSEditTextView) findViewById(C0966R.C0970id.eg6);
        if (this.f24727j) {
            View findViewById = findViewById(C0966R.C0970id.eg8);
            this.f24726i = findViewById;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/search/FTSSearchView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/search/FTSSearchView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f24726i.setOnClickListener(new C6992b());
        }
        this.f24728n.setOnClickListener(new C6993c());
    }

    public FTSEditTextView getFtsEditText() {
        return this.f24725h;
    }

    public LinearLayout getSearchContainer() {
        return this.f24723f;
    }

    public WeImageView getSearchIcon() {
        return this.f24728n;
    }

    public void setCancelBtnVisible(int i) {
        TextView textView = this.f24721d;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public void setImageSearchListener(C6994d dVar) {
    }

    public void setSearchViewListener(C6995e eVar) {
        this.f24730p = eVar;
    }

    public FTSSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24729o = false;
        mo8014a();
    }

    public FTSSearchView(Context context, boolean z) {
        super(context);
        this.f24729o = false;
        this.f24727j = z;
        mo8014a();
    }

    public FTSSearchView(Context context, boolean z, boolean z2) {
        super(context);
        this.f24727j = z;
        this.f24729o = z2;
        mo8014a();
    }
}

package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.AuthorizeItemListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import lb0.C88394b;
import lb0.C88430i;
import p1162x2.C112020b;
import p629ny.C76979h;
import p996kj.C88155a;
import qo3.C77390c0;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k1 */
public class C85590k1 {

    /* renamed from: a */
    public String f249499a;

    /* renamed from: b */
    public String f249500b = "";

    /* renamed from: c */
    public AuthorizeItemListView f249501c;

    /* renamed from: d */
    public LinearLayout f249502d;

    /* renamed from: e */
    public Context f249503e;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k1$a */
    public interface C85591a {
        /* renamed from: a */
        void mo67901a(int i, Bundle bundle);
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k1$b */
    public class C85592b extends BaseAdapter {

        /* renamed from: d */
        public LinkedList<C90437rw3> f249504d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k1$b$a */
        public class C85593a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C90437rw3 f249505d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f249506e;

            public C85593a(C85592b bVar, C90437rw3 rw32, ImageView imageView) {
                this.f249505d = rw32;
                this.f249506e = imageView;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i = this.f249505d.f259824f;
                if (i == 2) {
                    this.f249506e.setImageResource(C0966R.raw.login_auth_state_not_selected);
                    this.f249505d.f259824f = 1;
                } else if (i == 1) {
                    this.f249506e.setImageResource(C0966R.raw.login_auth_state_default_select);
                    this.f249505d.f259824f = 2;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.k1$b$b */
        public class C85594b {

            /* renamed from: a */
            public ImageView f249507a;

            /* renamed from: b */
            public TextView f249508b;

            public C85594b(C85592b bVar, C85586g1 g1Var) {
            }
        }

        public C85592b(C85590k1 k1Var, LinkedList<C90437rw3> linkedList) {
            this.f249504d = linkedList;
        }

        public int getCount() {
            LinkedList<C90437rw3> linkedList = this.f249504d;
            if (linkedList == null) {
                return 0;
            }
            return linkedList.size();
        }

        public Object getItem(int i) {
            return this.f249504d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C85594b bVar;
            LinkedList<C90437rw3> linkedList = this.f249504d;
            if (linkedList == null || linkedList.size() <= 0) {
                return null;
            }
            C90437rw3 rw32 = this.f249504d.get(i);
            if (view == null) {
                bVar = new C85594b(this, (C85586g1) null);
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f6526h_, (ViewGroup) null);
                bVar.f249507a = (ImageView) view2.findViewById(C0966R.C0970id.f5861qo);
                bVar.f249508b = (TextView) view2.findViewById(C0966R.C0970id.f5860qn);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C85594b) view.getTag();
            }
            int i2 = rw32.f259824f;
            if (i2 == 1) {
                bVar.f249507a.setImageResource(C0966R.raw.login_auth_state_not_selected);
            } else if (i2 == 3) {
                bVar.f249507a.setImageResource(C0966R.raw.login_auth_state_must_select);
            } else {
                bVar.f249507a.setImageResource(C0966R.raw.login_auth_state_default_select);
            }
            bVar.f249508b.setText(rw32.f259823e);
            ImageView imageView = bVar.f249507a;
            imageView.setOnClickListener(new C85593a(this, rw32, imageView));
            return view2;
        }
    }

    public C85590k1(Context context) {
        this.f249503e = context;
    }

    /* renamed from: a */
    public boolean mo119057a(LinkedList<C90437rw3> linkedList, String str, String str2, String str3, C85591a aVar) {
        Log.m105918d("MicroMsg.AppBrandAuthorizeDialog", "stev AppBrandAuthorizeDialog showAlert!");
        this.f249500b = str;
        this.f249499a = str2;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.AppBrandAuthorizeDialog", "scopeInfoList is empty or null");
        } else {
            C77390c0 c0Var = new C77390c0(this.f249503e, C0966R.style.a68);
            LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) this.f249503e.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6525h9, (ViewGroup) null);
            TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.lnn);
            if (!Util.isNullOrNil(str3)) {
                textView.setText(str3);
            }
            ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.f6038vk);
            C112020b bVar = new C112020b(MMApplicationContext.getResources(), C88155a.decodeResource(MMApplicationContext.getResources(), C0966R.raw.default_avatar, (BitmapFactory.Options) null));
            bVar.mo163679b(true);
            if (imageView != null) {
                String str4 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(imageView, this.f249499a, bVar, new C88430i());
            }
            TextView textView2 = (TextView) linearLayout.findViewById(C0966R.C0970id.f6057w4);
            if (this.f249500b == null) {
                this.f249500b = "";
            }
            Context context = this.f249503e;
            textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, context.getString(C0966R.string.gc5, new Object[]{this.f249500b})));
            this.f249501c = (AuthorizeItemListView) linearLayout.findViewById(C0966R.C0970id.a0b);
            this.f249501c.setAdapter(new C85592b(this, linkedList));
            if (linkedList.size() > 5) {
                this.f249501c.f214735d = linkedList.size();
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(C0966R.C0970id.a0n);
                this.f249502d = linearLayout2;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                layoutParams.height = this.f249503e.getResources().getDimensionPixelSize(C0966R.dimen.adl);
                this.f249502d.setLayoutParams(layoutParams);
            }
            ((Button) linearLayout.findViewById(C0966R.C0970id.g5f)).setOnClickListener(new C85586g1(this, linkedList, aVar, c0Var));
            ((Button) linearLayout.findViewById(C0966R.C0970id.g6d)).setOnClickListener(new C85587h1(this, linkedList, aVar, c0Var));
            c0Var.setCanceledOnTouchOutside(false);
            c0Var.setOnDismissListener(new C85588i1(this));
            c0Var.setOnCancelListener(new C85589j1(this, aVar));
            c0Var.setContentView(linearLayout);
            try {
                c0Var.show();
                return true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandAuthorizeDialog", "dialog show failed %s", e.getMessage());
            }
        }
        return false;
    }
}

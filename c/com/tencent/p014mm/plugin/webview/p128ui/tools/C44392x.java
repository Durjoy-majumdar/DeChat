package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import qo3.C101218e0;
import te3.C50407mi2;
import te3.so4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.x */
public class C44392x {

    /* renamed from: a */
    public C101218e0 f120324a;

    /* renamed from: b */
    public final Context f120325b;

    /* renamed from: c */
    public C44393a f120326c;

    /* renamed from: d */
    public RecyclerView f120327d;

    /* renamed from: e */
    public View f120328e;

    /* renamed from: f */
    public LinkedList<C50407mi2> f120329f;

    /* renamed from: g */
    public LinkedList<so4> f120330g;

    /* renamed from: h */
    public C54219z<Integer> f120331h = new C54219z<>();

    /* renamed from: i */
    public int f120332i = 0;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.x$a */
    public class C44393a extends RecyclerView.C16613e<C44394a> {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.x$a$a */
        public class C44394a extends RecyclerView.C16631z {

            /* renamed from: A */
            public TextView f120334A;

            /* renamed from: B */
            public View f120335B;

            /* renamed from: C */
            public ImageView f120336C;

            /* renamed from: z */
            public View f120337z;

            public C44394a(C44393a aVar, View view) {
                super(view);
                this.f120337z = view;
                this.f120334A = (TextView) view.findViewById(C0966R.C0970id.f6106xg);
                this.f120335B = view.findViewById(C0966R.C0970id.f6107xh);
                this.f120336C = (ImageView) view.findViewById(C0966R.C0970id.agz);
            }
        }

        public C44393a() {
        }

        public int getItemCount() {
            C44392x xVar = C44392x.this;
            return xVar.f120329f.get(xVar.f120332i).f138050h.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C44394a aVar = (C44394a) zVar;
            if (i2 == getItemCount() - 1) {
                aVar.f120336C.setVisibility(0);
            } else {
                aVar.f120336C.setVisibility(8);
            }
            TextView textView = aVar.f120334A;
            C44392x xVar = C44392x.this;
            textView.setText(xVar.f120329f.get(xVar.f120332i).f138050h.get(i2).f132367e);
            View view = aVar.f120335B;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C44392x xVar2 = C44392x.this;
            if (i2 == xVar2.f120330g.get(xVar2.f120332i).f141659e - 1) {
                View view3 = aVar.f120335B;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = aVar.f120335B;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            aVar.f120337z.setOnClickListener(new C44210w(this, i2));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C44394a(this, LayoutInflater.from(C44392x.this.f120325b).inflate(C0966R.C0971layout.buz, viewGroup, false));
        }
    }

    public C44392x(Context context, LinkedList<C50407mi2> linkedList, LinkedList<so4> linkedList2) {
        this.f120325b = context;
        this.f120324a = new C101218e0(context, 0, 3);
        this.f120329f = linkedList;
        this.f120330g = linkedList2;
        mo69168a(context);
    }

    /* renamed from: a */
    public final void mo69168a(Context context) {
        this.f120327d = new RecyclerView(this.f120325b, (AttributeSet) null);
        this.f120327d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f120327d.setLayoutManager(new LinearLayoutManager(this.f120325b));
        this.f120327d.setPadding(0, 0, 0, C76577a.m92151b(this.f120325b, 98));
        C44393a aVar = new C44393a();
        this.f120326c = aVar;
        this.f120327d.setAdapter(aVar);
        C101218e0 e0Var = this.f120324a;
        if (e0Var != null) {
            e0Var.mo140663j(this.f120327d);
        }
    }
}

package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import android.text.format.Time;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.plugin.scanner.model.C85412x;
import com.tencent.p014mm.plugin.scanner.model.OfflineScanContext;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.pluginsdk.platformtools.C72714e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ml2.C10931f;
import nj3.C76874e0;
import nj3.C76879j;
import p200lx.C88661f0;
import vl2.C102210d;
import vl2.C102212j;
import vl2.C90831e;
import vl2.C90832f;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z2 */
public class C85839z2 extends C74023i {

    /* renamed from: v */
    public View.OnClickListener f250035v = new C85840a();

    /* renamed from: w */
    public C67391b f250036w;

    /* renamed from: x */
    public C90832f f250037x;

    /* renamed from: y */
    public C90831e f250038y;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.z2$a */
    public class C85840a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.z2$a$a */
        public class C85841a implements DialogInterface.OnClickListener {
            public C85841a(C85840a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public C85840a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (t8Var == null) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo OfflineScan tag not valid");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C72963f4 f4Var = t8Var.f212238a;
            if (f4Var == null) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo OfflineScan msg not valid");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String content = f4Var.getContent();
            if (Util.isNullOrNil(content)) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo OfflineScan content not valid");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            OfflineScanContext a = OfflineScanContext.CREATOR.mo118756a(content);
            Log.m105925i("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo OfflineScan onClick codeType: %d, selectFromAlbum: %b", Integer.valueOf(a.f248917h), Boolean.valueOf(a.f248921o));
            C85412x.f248924a.mo118759a(a.f248915f, a.f248922p, a.f248921o ? 2 : 1, a.f248923q, 1);
            if (C86709a0.m107524d().mo123467m() == 0) {
                C76879j.m92754y(C85839z2.this.f250036w.mo91565f(), C85839z2.this.f250036w.mo91565f().getString(C0966R.string.hef), "", C85839z2.this.f250036w.mo91565f().getString(C0966R.string.f8029zr), new C85841a(this));
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!C5177x.m5206c(a.f248922p)) {
                String str = a.f248915f;
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo OfflineScan zBar result invalid");
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C85839z2 z2Var = C85839z2.this;
                ((C102210d) z2Var.f250038y).mo141737b(z2Var.f250036w.mo91565f(), (C10931f.C10933a) null, (C94528d) null, str, a.f248921o, a.f248918i, a.f248922p, a.f248919j, 3, true, a.f248923q, false, false, 0, (ArrayList<Integer>) null);
            } else if (Util.isNullOrNil(a.f248915f)) {
                Log.m105920e("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo OfflineScan qBar result invalid");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                C85839z2 z2Var2 = C85839z2.this;
                ((C102212j) z2Var2.f250037x).mo141743f(z2Var2.f250036w.mo91565f(), a.f248915f, a.f248916g, a.f248922p, a.f248917h, a.f248918i, (C10931f.C10933a) null, (C94528d) null, a.f248919j, 3, true, a.f248923q, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.z2$b */
    public final class C85842b extends C74023i.C74026c {

        /* renamed from: b */
        public TextView f250040b;

        /* renamed from: c */
        public RelativeLayout f250041c;

        public C85842b(C85839z2 z2Var) {
        }

        /* renamed from: a */
        public C85842b mo119764a(View view) {
            super.create(view);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.clickArea = view.findViewById(C0966R.C0970id.b47);
            this.f250040b = (TextView) view.findViewById(C0966R.C0970id.hld);
            this.f250041c = (RelativeLayout) view.findViewById(C0966R.C0970id.hlc);
            return this;
        }
    }

    public C85839z2() {
        Class cls = C88661f0.class;
        this.f250037x = ((C88661f0) C86312j.m106911c(cls)).mo122708AU();
        this.f250038y = ((C88661f0) C86312j.m106911c(cls)).mo122709EC();
    }

    /* renamed from: C */
    public boolean mo82212C() {
        return false;
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6925sd);
        C85842b bVar = new C85842b(this);
        bVar.mo119764a(n4Var);
        n4Var.setTag(bVar);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: S */
    public boolean mo82213S() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        if (t8Var == null) {
            return false;
        }
        e0Var.mo107136c(t8Var.mo103252b(), 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f250036w = bVar;
        C85842b bVar2 = (C85842b) cVar;
        String content = f4Var.getContent();
        if (!Util.isNullOrNil(content)) {
            OfflineScanContext a = OfflineScanContext.CREATOR.mo118756a(content);
            Log.m105919d("MicroMsg.ChattingItemAppMsgOfflineScan", "alvinluo filling OfflineScan context %s", a.toString());
            TextView textView = bVar2.f250040b;
            long j = a.f248920n;
            Time time = new Time();
            time.set(j);
            String charSequence = C72714e.m85106a("yyyy-MM-dd kk:mm", time).toString();
            textView.setText(String.format(MMApplicationContext.getContext().getString(C0966R.string.heh), new Object[]{charSequence}));
            C74243t8 t8Var = new C74243t8(f4Var, bVar.mo91583x(), bVar2, (String) null);
            bVar2.clickArea.setTag(t8Var);
            bVar2.clickArea.setOnLongClickListener(mo103098p(bVar));
            bVar2.clickArea.setOnClickListener(this.f250035v);
            bVar2.f250041c.setTag(t8Var);
            bVar2.f250041c.setOnClickListener(this.f250035v);
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 721420337;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}

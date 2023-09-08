package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.storage.C72963f4;
import de3.C107029o;
import de3.C75355a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76874e0;
import uj3.C78208e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d7 */
public class C73953d7 extends C74023i {

    /* renamed from: v */
    public C73980e7 f217051v = new C73980e7();

    /* renamed from: w */
    public C74305x6 f217052w = new C74305x6();

    /* renamed from: x */
    public C73987f7 f217053x = new C73987f7();

    /* renamed from: y */
    public C74101l8 f217054y = new C74101l8();

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.d7$a */
    public static abstract class C73954a {
        /* renamed from: a */
        public abstract void mo103021a(C74023i.C74026c cVar, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str);

        /* renamed from: b */
        public void mo103022b(C74023i.C74026c cVar, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str) {
            C73955b bVar2 = (C73955b) cVar;
            View view = bVar2.f217057d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys$ChattingItemSysInterface", "fillingExtraParts", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys$ChattingItemSysInterface", "fillingExtraParts", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ProgressBar progressBar = bVar2.uploadingPB;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.d7$b */
    public final class C73955b extends C74023i.C74026c {

        /* renamed from: b */
        public NeatTextView f217055b;

        /* renamed from: c */
        public View f217056c;

        /* renamed from: d */
        public View f217057d;

        /* renamed from: e */
        public TextView f217058e;

        public C73955b(C73953d7 d7Var) {
        }

        public View getMainContainerView() {
            return null;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f6929sh, (ViewGroup) null);
        C73955b bVar = new C73955b(this);
        bVar.f217056c = inflate;
        bVar.timeTV = (TextView) inflate.findViewById(C0966R.C0970id.b8z);
        bVar.noMoreMsgTip = inflate.findViewById(C0966R.C0970id.f357687b83);
        bVar.f217057d = inflate.findViewById(C0966R.C0970id.b8o);
        bVar.f217058e = (TextView) inflate.findViewById(C0966R.C0970id.b8n);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.b4b);
        bVar.f217055b = mMNeat7extView;
        mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(bVar.f217055b.getContext())));
        bVar.uploadingPB = (ProgressBar) inflate.findViewById(C0966R.C0970id.l0i);
        inflate.setTag(bVar);
        return inflate;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C73954a aVar = (f4Var.getType() == 10002 || f4Var.getType() == 268445458) ? this.f217052w : f4Var.getType() == 570425393 ? this.f217053x : f4Var.getType() == 603979825 ? this.f217054y : this.f217051v;
        C74023i.C74026c cVar2 = cVar;
        C74023i.C74026c cVar3 = cVar;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        String str2 = str;
        aVar.mo103021a(cVar2, cVar3, bVar2, f4Var2, str2);
        aVar.mo103022b(cVar2, cVar3, bVar2, f4Var2, str2);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 10000 || i == 10002 || i == 570425393 || i == 64 || i == 603979825 || i == 268445456 || i == 268445458;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}

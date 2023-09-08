package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76874e0;
import p196ln.C76705f;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c1 */
public class C73939c1 extends C74023i implements View.OnClickListener {
    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6884r6);
        C73932b1 b1Var = new C73932b1();
        b1Var.mo103013a(n4Var);
        n4Var.setTag(b1Var);
        return n4Var;
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
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null) {
            C73932b1 b1Var = (C73932b1) cVar;
            C73920a1 a1Var = (C73920a1) u.mo93555w(C73920a1.class);
            View view = b1Var.maskView;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            CheckBox checkBox = b1Var.checkBox;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            if (a1Var.f216975b == 1) {
                View view2 = b1Var.f217005c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = b1Var.f217009g;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b1Var.f217007e.setText(a1Var.f216977d);
                TextView textView = b1Var.f217008f;
                long j = (long) a1Var.f216978e;
                textView.setText(j >= 1073741824 ? String.format("%.1fGB", new Object[]{Float.valueOf(((((float) j) / 1024.0f) / 1024.0f) / 1024.0f)}) : j >= 1048576 ? String.format("%.1fMB", new Object[]{Float.valueOf((((float) j) / 1024.0f) / 1024.0f)}) : String.format("%.2fMB", new Object[]{Float.valueOf((((float) j) / 1024.0f) / 1024.0f)}));
                C20828a.m22825b().mo32518g(a1Var.f216979f, b1Var.f217006d);
                if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(bVar.mo91565f(), a1Var.f216976c)) {
                    b1Var.f217013k.setText(C0966R.string.c29);
                } else {
                    b1Var.f217013k.setText(C0966R.string.c27);
                }
            } else {
                View view5 = b1Var.f217005c;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view6 = b1Var.f217009g;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(0);
                View view7 = view6;
                C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b1Var.f217010h.setText(bVar.mo91576q());
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(b1Var.f217011i, bVar.mo91577r());
                b1Var.f217012j.setText(bVar.mo91565f().getResources().getString(C0966R.string.c2k, new Object[]{a1Var.f216977d}));
                b1Var.f217013k.setText(C0966R.string.c2b);
            }
            b1Var.f217004b.setTag(a1Var);
            b1Var.f217004b.setOnClickListener(this);
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 671088689;
    }

    public void onClick(View view) {
        Class cls = C45547h.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73920a1 a1Var = (C73920a1) view.getTag();
        if (a1Var == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (a1Var.f216975b != 1) {
            ((C45547h) C86312j.m106911c(cls)).p30(view.getContext(), (Intent) null, (C45544c) null);
        } else if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(view.getContext(), a1Var.f216976c)) {
            ((C45547h) C86312j.m106911c(cls)).mo70794fZ(view.getContext(), a1Var.f216976c);
        } else {
            ((C45547h) C86312j.m106911c(cls)).p30(view.getContext(), new Intent().putExtra("appId", a1Var.f216976c), (C45544c) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgDownloader$ChattingItemAppMsgDownloaderFrom", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

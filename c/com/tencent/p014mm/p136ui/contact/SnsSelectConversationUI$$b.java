package com.tencent.p014mm.p136ui.contact;

import android.util.SparseArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.MultiSelectContactView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationUI$$b */
public class SnsSelectConversationUI$$b implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public SparseArray f218876d = new SparseArray(0);

    /* renamed from: e */
    public int f218877e = 0;

    /* renamed from: f */
    public final /* synthetic */ SnsSelectConversationUI f218878f;

    /* renamed from: com.tencent.mm.ui.contact.SnsSelectConversationUI$$b$a */
    public class C74446a {

        /* renamed from: a */
        public int f218879a = 0;

        /* renamed from: b */
        public int f218880b = 0;

        public C74446a(SnsSelectConversationUI$$b snsSelectConversationUI$$b) {
        }
    }

    public SnsSelectConversationUI$$b(SnsSelectConversationUI snsSelectConversationUI) {
        this.f218878f = snsSelectConversationUI;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        SnsSelectConversationUI snsSelectConversationUI = this.f218878f;
        C74466b4 b4Var = snsSelectConversationUI.f218873K;
        if (b4Var != null) {
            int i5 = b4Var.f219023u;
            RelativeLayout relativeLayout = snsSelectConversationUI.f218865C;
            int i6 = 0;
            if (relativeLayout != null) {
                if (i > i5) {
                    relativeLayout.setVisibility(0);
                    SnsSelectConversationUI snsSelectConversationUI2 = this.f218878f;
                    if (snsSelectConversationUI2.f218873K.f219011G) {
                        snsSelectConversationUI2.f218866D.setBackground(snsSelectConversationUI2.getContext().getResources().getDrawable(C0966R.C0969drawable.f357218a91));
                        SnsSelectConversationUI snsSelectConversationUI3 = this.f218878f;
                        snsSelectConversationUI3.f218867E.setBackground(snsSelectConversationUI3.getContext().getResources().getDrawable(C0966R.C0969drawable.f357218a91));
                    }
                } else {
                    relativeLayout.setVisibility(8);
                }
            }
            this.f218877e = i;
            View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                C74446a aVar = (C74446a) this.f218876d.get(i);
                if (aVar == null) {
                    aVar = new C74446a(this);
                }
                aVar.f218879a = childAt.getHeight();
                aVar.f218880b = childAt.getTop();
                this.f218876d.append(i, aVar);
                int i7 = 0;
                while (true) {
                    i4 = this.f218877e;
                    if (i6 >= i4) {
                        break;
                    }
                    C74446a aVar2 = (C74446a) this.f218876d.get(i6);
                    if (aVar2 != null) {
                        i7 += aVar2.f218879a;
                    }
                    i6++;
                }
                C74446a aVar3 = (C74446a) this.f218876d.get(i4);
                if (aVar3 == null) {
                    aVar3 = new C74446a(this);
                }
                int i8 = i7 - aVar3.f218880b;
                View view = this.f218878f.f218611j;
                if (view != null) {
                    view.setY((float) (-i8));
                }
                MultiSelectContactView multiSelectContactView = this.f218878f.f218609h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.setY((float) (-i8));
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}

package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import vd3.C78399i;

/* renamed from: com.tencent.mm.ui.conversation.d2 */
public class C74685d2 {

    /* renamed from: a */
    public ListView f219569a;

    /* renamed from: b */
    public C74720p f219570b;

    /* renamed from: c */
    public FolderHelper f219571c;

    /* renamed from: d */
    public boolean f219572d = false;

    /* renamed from: e */
    public MMHandler f219573e;

    /* renamed from: f */
    public Runnable f219574f;

    /* renamed from: g */
    public int f219575g = -1;

    /* renamed from: h */
    public C78399i f219576h = new C78399i(new C74686a());

    /* renamed from: com.tencent.mm.ui.conversation.d2$a */
    public class C74686a implements AbsListView.OnScrollListener {
        public C74686a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ConversationListView conversationListView;
            C72976h2 h2Var;
            HashMap l;
            Collection values;
            Object obj;
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C74693i iVar = C74693i.f219589a;
            C74685d2 d2Var = C74685d2.this;
            iVar.mo103854a(d2Var.f219569a, d2Var.f219570b, true, true);
            FolderHelper folderHelper = C74685d2.this.f219571c;
            if (folderHelper != null && (conversationListView = folderHelper.f219407f) != null) {
                int childCount = conversationListView.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = conversationListView.getChildAt(i4);
                    View findViewById = childAt != null ? childAt.findViewById(C0966R.C0970id.bth) : null;
                    if (findViewById != null && (findViewById.getTag() instanceof C74720p.C74733m)) {
                        Object tag = findViewById.getTag();
                        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.ConversationWithCacheAdapter.ViewHolder");
                        C74720p.C74733m mVar = (C74720p.C74733m) tag;
                        if (C72996z1.m85828Z4(mVar.f219757l)) {
                            C74720p pVar = folderHelper.f219405d;
                            if (pVar == null || (l = pVar.mo104614l()) == null || (values = l.values()) == null) {
                                h2Var = null;
                            } else {
                                Iterator it = values.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (((C72976h2) obj).f212787o1 == 66) {
                                        z = true;
                                        continue;
                                    } else {
                                        z = false;
                                        continue;
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                                h2Var = (C72976h2) obj;
                            }
                            if (!(h2Var != null)) {
                                if (childAt.getBottom() <= folderHelper.f219417s) {
                                    FolderHelper.m89356g(folderHelper, 8, false, 2, (Object) null);
                                } else {
                                    folderHelper.mo103784f(0, false);
                                }
                            }
                        }
                        if (mVar.f219758m) {
                            if (mVar.f219766u != 0 && childAt.getBottom() >= folderHelper.f219417s) {
                                folderHelper.mo103784f(0, false);
                                break;
                            }
                            FolderHelper.m89356g(folderHelper, 8, false, 2, (Object) null);
                        } else if (childAt.getTop() <= folderHelper.f219417s) {
                            FolderHelper.m89356g(folderHelper, 8, false, 2, (Object) null);
                            break;
                        }
                    }
                    i4++;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0) {
                C74685d2 d2Var = C74685d2.this;
                if (d2Var.f219569a == null) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                    return;
                }
                C74685d2.m89430a(d2Var, -1);
            } else {
                C74685d2.this.mo103843b();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: a */
    public static void m89430a(C74685d2 d2Var, int i) {
        if (i < 0) {
            i = 300;
        }
        d2Var.mo103843b();
        if (d2Var.f219573e == null) {
            d2Var.f219573e = new MMHandler("pre load mainui avatar");
        }
        d2Var.f219572d = false;
        MMHandler mMHandler = d2Var.f219573e;
        C74689f2 f2Var = new C74689f2(d2Var);
        d2Var.f219574f = f2Var;
        mMHandler.postDelayed(f2Var, (long) i);
    }

    /* renamed from: b */
    public final void mo103843b() {
        Runnable runnable;
        if (!this.f219572d) {
            Log.m105918d("MicroMsg.PreLoadHelper", "Jacks cancel PreLoad.");
            this.f219572d = true;
        }
        MMHandler mMHandler = this.f219573e;
        if (!(mMHandler == null || (runnable = this.f219574f) == null)) {
            mMHandler.removeCallbacks(runnable);
        }
        MMHandler mMHandler2 = this.f219573e;
        if (mMHandler2 != null) {
            mMHandler2.quit();
            this.f219573e = null;
        }
    }
}

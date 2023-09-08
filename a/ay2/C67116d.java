package ay2;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.plugin.multitask.C56888q;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import m92.C61444a;
import n92.C117617a;
import nj3.C11184p0;
import nj3.C76912y0;
import vx2.C15029q;
import vx2.C65900i;

/* renamed from: ay2.d */
public final class C67116d implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67113b f192716d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView.C16631z f192717e;

    /* renamed from: ay2.d$a */
    public static final class C67117a implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C67113b f192718d;

        public C67117a(C67113b bVar) {
            this.f192718d = bVar;
        }

        public final void onDismiss() {
            ((TaskBarView) this.f192718d.getCallback()).f206493a2 = false;
        }
    }

    /* renamed from: ay2.d$b */
    public static final class C67118b implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f192719d;

        public C67118b(boolean z) {
            this.f192719d = z;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            if (this.f192719d && contextMenu != null) {
                contextMenu.add(0, 0, 0, C0966R.string.f7886v2);
            }
            if (contextMenu != null) {
                contextMenu.add(0, 1, 0, C0966R.string.f7894va);
            }
        }
    }

    /* renamed from: ay2.d$c */
    public static final class C67119c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f192720d;

        /* renamed from: e */
        public final /* synthetic */ C67113b f192721e;

        /* renamed from: f */
        public final /* synthetic */ int f192722f;

        public C67119c(boolean z, C67113b bVar, int i) {
            this.f192720d = z;
            this.f192721e = bVar;
            this.f192722f = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (!this.f192720d) {
                i = 1;
            }
            if (i == 0) {
                C65900i iVar = (C65900i) C86312j.m106911c(C65900i.class);
                String str = ((MultiTaskInfo) ((ArrayList) this.f192721e.getViewModel().f192729d).get(this.f192722f)).field_id;
                C87412m.m108593f(str, "viewModel.showDataList[pos].field_id");
                iVar.getClass();
                MultiTaskInfo wx02 = iVar.wx0(str);
                if (wx02 != null) {
                    C86013q1.m106442c(C15029q.f41166a + str, C56888q.f162957a.mo80311b(str));
                    C61444a vx02 = ((C105923s) C86312j.m106911c(C105923s.class)).vx0();
                    if (vx02 != null) {
                        if (vx02.mo86416c3(str) == null) {
                            MultiTaskInfo multiTaskInfo = wx02;
                            MvvmStorage.insert$default(vx02, multiTaskInfo, false, false, false, 14, (Object) null);
                            C117617a.f351848a.mo182342d(multiTaskInfo, 3, 2, "", "");
                        } else {
                            MultiTaskInfo multiTaskInfo2 = wx02;
                            MvvmStorage.update$default(vx02, multiTaskInfo2, false, false, 6, (Object) null);
                            C117617a.f351848a.mo182342d(multiTaskInfo2, 3, 1, "", "");
                        }
                    }
                }
                C76912y0.m92768g(this.f192721e.getContext(), C76577a.m92166q(this.f192721e.getContext(), C0966R.string.f7889v6));
            } else if (i == 1) {
                this.f192721e.removeItem(this.f192722f);
            }
        }
    }

    public C67116d(C67113b bVar, RecyclerView.C16631z zVar) {
        this.f192716d = bVar;
        this.f192717e = zVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$2"
            java.lang.String r1 = "android/view/View$OnLongClickListener"
            java.lang.String r2 = "onLongClick"
            java.lang.String r3 = "(Landroid/view/View;)Z"
            r4 = r8
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            ay2.b r0 = r8.f192716d
            android.content.Context r0 = r0.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x004a
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L_0x004a
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getGlobalVisibleRect(r1)
            int r0 = r1.left
            if (r0 <= 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x005b
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$2"
            java.lang.String r3 = "android/view/View$OnLongClickListener"
            java.lang.String r4 = "onLongClick"
            java.lang.String r5 = "(Landroid/view/View;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        L_0x005b:
            androidx.recyclerview.widget.RecyclerView$z r0 = r8.f192717e
            int r0 = r0.mo17363j()
            if (r0 < 0) goto L_0x00be
            ay2.b r1 = r8.f192716d
            ay2.f r1 = r1.getViewModel()
            java.util.List<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> r1 = r1.f192729d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            if (r0 < r1) goto L_0x0074
            goto L_0x00be
        L_0x0074:
            r1 = 2131300887(0x7f091217, float:1.8219816E38)
            java.lang.Object r1 = r9.getTag(r1)
            uo3.a r1 = (uo3.C78253a) r1
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106163T()
            if (r2 == 0) goto L_0x008c
            ay2.b r2 = r8.f192716d
            boolean r2 = r2.mo91214a(r0)
            if (r2 == 0) goto L_0x008c
            r7 = 1
        L_0x008c:
            ay2.d$b r2 = new ay2.d$b
            r2.<init>(r7)
            ay2.d$c r3 = new ay2.d$c
            ay2.b r4 = r8.f192716d
            r3.<init>(r7, r4, r0)
            if (r1 == 0) goto L_0x00b0
            ay2.d$a r0 = new ay2.d$a
            r0.<init>(r4)
            r1.f229227C = r0
            ay2.b$a r0 = r4.getCallback()
            com.tencent.mm.plugin.taskbar.ui.TaskBarView r0 = (com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView) r0
            r0.f206493a2 = r6
            r4 = 0
            r5 = 0
            r0 = r1
            r1 = r9
            r0.mo108273h(r1, r2, r3, r4, r5)
        L_0x00b0:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$2"
            java.lang.String r3 = "android/view/View$OnLongClickListener"
            java.lang.String r4 = "onLongClick"
            java.lang.String r5 = "(Landroid/view/View;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x00be:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$2"
            java.lang.String r3 = "android/view/View$OnLongClickListener"
            java.lang.String r4 = "onLongClick"
            java.lang.String r5 = "(Landroid/view/View;)Z"
            r1 = r8
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ay2.C67116d.onLongClick(android.view.View):boolean");
    }
}

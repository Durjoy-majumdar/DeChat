package ue1;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.TouchableLayout;
import di3.C86312j;
import dp1.C45431e2;
import dp1.C58363h;
import eb0.C75604z3;
import eb0.z3$$g;
import fy3.C32224a;
import gy3.C87412m;
import nj3.C11184p0;
import rx3.C13598b0;
import ue1.C52530g;
import uo3.C78253a;
import up1.C52599l0;

/* renamed from: ue1.l */
public final class C52543l implements C52530g.C52532b, View.OnCreateContextMenuListener, C11184p0, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public C32224a<C13598b0> f146753d;

    /* renamed from: e */
    public C52528f f146754e;

    /* renamed from: ue1.l$a */
    public static final class C52544a implements z3$$g {

        /* renamed from: d */
        public final /* synthetic */ boolean f146755d;

        /* renamed from: e */
        public final /* synthetic */ AdapterView.AdapterContextMenuInfo f146756e;

        public C52544a(boolean z, AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
            this.f146755d = z;
            this.f146756e = adapterContextMenuInfo;
        }

        /* renamed from: b */
        public boolean mo24603b() {
            return false;
        }

        /* renamed from: c */
        public void mo24604c() {
            Log.m105924i("Finder.ConversationOnLongClickListener", "longclick delete msg finish");
            Log.m105924i("Finder.ConversationOnLongClickListener", "[CONTEXT_MENU_LONG_CLICK_DELETE] ret" + this.f146755d + " position=" + this.f146756e.position);
            C58363h hVar = C58363h.f167137a;
            C45431e2 e2Var = C58363h.f167138b;
            e2Var.f122963g = e2Var.f122963g + 1;
        }
    }

    public C52543l(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callBack");
        this.f146753d = aVar;
    }

    /* renamed from: a */
    public void mo73482a(View view, int i, C52528f fVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(fVar, "conv");
        this.f146754e = fVar;
        C78253a aVar = new C78253a(view.getContext());
        aVar.f229227C = this;
        int i2 = TouchableLayout.f24959d;
        aVar.mo108272g(view, i, 0, this, this, TouchableLayout.f24959d, TouchableLayout.f24960e);
        aVar.mo70679m();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(contextMenuInfo, "menuInfo");
        C52528f fVar = this.f146754e;
        String str = null;
        if (!C87412m.m108589b(fVar != null ? fVar.field_sessionId : null, "findersayhisessionholder")) {
            C52528f fVar2 = this.f146754e;
            if (!C87412m.m108589b(fVar2 != null ? fVar2.field_sessionId : null, "finder_system_message")) {
                C52528f fVar3 = this.f146754e;
                if (!C87412m.m108589b(fVar3 != null ? fVar3.field_sessionId : null, "finderaliassessionholder")) {
                    contextMenu.add(0, 2, 0, C0966R.string.gm7);
                }
            }
        }
        C52528f fVar4 = this.f146754e;
        String str2 = fVar4 != null ? fVar4.field_senderUserName : null;
        if (str2 == null) {
            str2 = "";
        }
        if (!C72996z1.m85821V4(str2)) {
            C52528f fVar5 = this.f146754e;
            if (fVar5 != null) {
                str = fVar5.field_sessionId;
            }
            if (!C87412m.m108589b(str, "finderaliassessionholder")) {
                return;
            }
        }
        contextMenu.add(0, 4, 0, C0966R.string.bzr);
    }

    public void onDismiss() {
        this.f146754e = null;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(menuItem, "menuItem");
        C52528f fVar = this.f146754e;
        if (fVar != null) {
            int itemId = menuItem.getItemId();
            if (itemId == 2) {
                ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
                C87412m.m108592e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuInfo;
                boolean deleteNotify = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().deleteNotify(fVar.systemRowid, false);
                if (deleteNotify) {
                    C52599l0 Ox0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76736Au();
                    String str = fVar.field_sessionId;
                    C87412m.m108593f(str, "focused.field_sessionId");
                    Ox0.mo73559jo(str, false);
                    ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().doNotify(fVar.field_sessionId, 6, fVar);
                    C32224a<C13598b0> aVar = this.f146753d;
                    if (aVar != null) {
                        C13598b0 invoke = aVar.invoke();
                    }
                }
                C75604z3.m90836h(fVar.field_sessionId, new C52544a(deleteNotify, adapterContextMenuInfo));
            } else if (itemId == 4) {
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().deleteNotify(fVar.systemRowid, false);
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().doNotify(fVar.field_sessionId, 6, fVar);
            }
        }
    }
}

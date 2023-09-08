package jz1;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import bz1.C0394d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.TouchableLayout;
import cz1.C45230i;
import cz1.C7143c;
import di3.C86312j;
import eb0.C75604z3;
import fy3.C32224a;
import gy3.C87412m;
import hp3.C87581a;
import hz1.C46161a;
import jz1.C46595b;
import nj3.C11184p0;
import nr3.C89060f;
import rx3.C13598b0;
import sw1.C48478n;
import uo3.C78253a;
import wy1.C53224d;
import xy1.C15912f;
import xy1.C15913g;
import xy1.C53472h;

/* renamed from: jz1.i */
public final class C46605i implements C46595b.C46598c, View.OnCreateContextMenuListener, C11184p0, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public C32224a<C13598b0> f125517d;

    /* renamed from: e */
    public C7143c f125518e;

    /* renamed from: f */
    public int f125519f;

    /* renamed from: g */
    public int f125520g;

    /* renamed from: jz1.i$a */
    public static final class C46606a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C7143c f125521a;

        /* renamed from: b */
        public final /* synthetic */ boolean f125522b;

        /* renamed from: c */
        public final /* synthetic */ AdapterView.AdapterContextMenuInfo f125523c;

        public C46606a(C7143c cVar, boolean z, AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
            this.f125521a = cVar;
            this.f125522b = z;
            this.f125523c = adapterContextMenuInfo;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C75604z3.m90836h(this.f125521a.field_sessionId, new C46604h(this.f125522b, this.f125523c));
            return null;
        }
    }

    /* renamed from: jz1.i$b */
    public static final class C46607b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public static final C46607b<_Ret, _Var> f125524a = new C46607b<>();

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            ((C48478n) C86312j.m106911c(C48478n.class)).Jc0();
            return null;
        }
    }

    public C46605i(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callBack");
        this.f125517d = aVar;
    }

    /* renamed from: a */
    public void mo71888a(View view, int i, C7143c cVar, int i2) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(cVar, "conv");
        this.f125518e = cVar;
        this.f125519f = i;
        this.f125520g = i2;
        C78253a aVar = new C78253a(view.getContext());
        aVar.f229227C = this;
        int i3 = TouchableLayout.f24959d;
        aVar.mo108272g(view, i, 0, this, this, TouchableLayout.f24959d, TouchableLayout.f24960e);
        aVar.mo70679m();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(contextMenuInfo, "menuInfo");
        C7143c cVar = this.f125518e;
        if ((cVar != null ? Boolean.valueOf(cVar.mo8334m2()) : null) != null) {
            C7143c cVar2 = this.f125518e;
            if (cVar2 != null && cVar2.mo8334m2()) {
                contextMenu.add(0, 3, 0, C0966R.string.bvg);
                return;
            }
        }
        C7143c cVar3 = this.f125518e;
        if (!(cVar3 != null && cVar3.field_unReadCount == 0)) {
            contextMenu.add(0, 0, 0, C0966R.string.bvh);
        } else {
            contextMenu.add(0, 1, 0, C0966R.string.bvi);
        }
        contextMenu.add(0, 3, 0, C0966R.string.bvg);
    }

    public void onDismiss() {
        this.f125518e = null;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        boolean z;
        Class cls = C53224d.class;
        C87412m.m108594g(menuItem, "menuItem");
        Object[] objArr = new Object[2];
        boolean z2 = false;
        objArr[0] = Integer.valueOf(menuItem.getItemId());
        C7143c cVar = this.f125518e;
        objArr[1] = cVar != null ? cVar.field_sessionId : null;
        Log.m105925i("GameLife.ConversationOnLongClickListener", "menuItem.itemId:%d,sessionId:%s", objArr);
        C7143c cVar2 = this.f125518e;
        if (cVar2 != null) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                C45230i zx02 = ((C53224d) C86312j.m106911c(cls)).zx0();
                String str = cVar2.field_sessionId;
                C87412m.m108593f(str, "focused.field_sessionId");
                if (zx02.mo70733K(str)) {
                    C32224a<C13598b0> aVar = this.f125517d;
                    if (aVar != null) {
                        C13598b0 invoke = aVar.invoke();
                        return;
                    }
                    return;
                }
                Log.m105920e("GameLife.ConversationOnLongClickListener", "clearUnreadCount failed. sessionId=" + cVar2.field_sessionId);
            } else if (itemId == 1) {
                C45230i zx03 = ((C53224d) C86312j.m106911c(cls)).zx0();
                String str2 = cVar2.field_sessionId;
                C87412m.m108593f(str2, "focused.field_sessionId");
                if (C72996z1.m85832c5(str2)) {
                    z = true;
                } else {
                    Log.m105924i("GameLife.PluginGameLife", "check sessionId failed");
                    z = false;
                }
                if (z) {
                    C7143c jo = zx03.mo70735jo(str2);
                    jo.field_unReadCount = 1;
                    z2 = zx03.update(jo.systemRowid, jo, false);
                    zx03.doNotify(MStorageEventData.EventType.SINGLE, 5, jo);
                    Log.m105924i("GameLife.ConversationStorage", "[addUnreadCount] ret=" + z2 + " sessionId=" + str2);
                }
                if (z2) {
                    C32224a<C13598b0> aVar2 = this.f125517d;
                    if (aVar2 != null) {
                        C13598b0 invoke2 = aVar2.invoke();
                        return;
                    }
                    return;
                }
                Log.m105920e("GameLife.ConversationOnLongClickListener", "markUnread failed. sessionId=" + cVar2.field_sessionId);
            } else if (itemId == 3) {
                if (!cVar2.mo8334m2()) {
                    C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(cVar2.field_selfUserName);
                    if (X3 != null) {
                        C40306c.C40307a aVar3 = C40306c.f108374a;
                        int i2 = this.f125519f + 1;
                        int i3 = this.f125520g;
                        String str3 = cVar2.field_sessionId;
                        C87412m.m108593f(str3, "focused.field_sessionId");
                        long D0 = (long) X3.mo422D0();
                        String str4 = cVar2.field_selfUserName;
                        C87412m.m108593f(str4, "focused.field_selfUserName");
                        C0394d dVar = cVar2.f25115F;
                        C87412m.m108591d(dVar);
                        String str5 = cVar2.field_talker;
                        C87412m.m108593f(str5, "focused.field_talker");
                        C40306c.C40307a.m43452g(aVar3, i2, 92, i3, str3, D0, str4, (long) dVar.field_accountType, str5, cVar2.mo8333l2(), C46161a.f124440a, (String) null, 1024, (Object) null);
                    }
                } else {
                    C40306c.C40307a aVar4 = C40306c.f108374a;
                    int i4 = this.f125519f + 1;
                    int i5 = this.f125520g;
                    String str6 = cVar2.field_sessionId;
                    C87412m.m108593f(str6, "focused.field_sessionId");
                    C40306c.C40307a.m43452g(aVar4, i4, 1, i5, str6, 0, "", 0, "", cVar2.mo8333l2(), C46161a.f124440a, (String) null, 1024, (Object) null);
                }
                ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
                C87412m.m108592e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
                AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuInfo;
                boolean d502 = ((C53472h) C86312j.m106911c(C53472h.class)).d50(cVar2.field_sessionId);
                if (!d502) {
                    Log.m105920e("GameLife.ConversationOnLongClickListener", "longclick delete conversation fail");
                } else if (!cVar2.mo8334m2()) {
                    C89060f.m111322a().mo123060U(new C46606a(cVar2, d502, adapterContextMenuInfo)).mo123058O();
                } else {
                    C89060f.m111322a().mo123060U(C46607b.f125524a).mo123058O();
                }
            }
        }
    }
}

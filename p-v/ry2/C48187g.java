package ry2;

import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import az2.C39674e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.conversation.p805ui.TextStatusConversationFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.TouchableLayout;
import eb0.C75604z3;
import eb0.z3$$g;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import nj3.C11184p0;
import rx3.C13598b0;
import uo3.C78253a;
import uy2.C37612h;
import uy2.C52657a;
import uy2.C52665g;
import yy2.C39246d;
import yz2.C53700n2;

/* renamed from: ry2.g */
public final class C48187g implements C32228q<View, Integer, C52657a, C13598b0>, View.OnCreateContextMenuListener, C11184p0, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final TextStatusConversationFragment f129148d;

    /* renamed from: e */
    public C32224a<C13598b0> f129149e;

    /* renamed from: f */
    public C52657a f129150f;

    /* renamed from: ry2.g$a */
    public static final class C48188a implements z3$$g {

        /* renamed from: d */
        public final /* synthetic */ boolean f129151d;

        /* renamed from: e */
        public final /* synthetic */ AdapterView.AdapterContextMenuInfo f129152e;

        public C48188a(boolean z, AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
            this.f129151d = z;
            this.f129152e = adapterContextMenuInfo;
        }

        /* renamed from: b */
        public boolean mo24603b() {
            return false;
        }

        /* renamed from: c */
        public void mo24604c() {
            Log.m105924i("MicroMsg.TextStatus.TextStatusConversationLongClickListener", "longclick delete msg finish");
            Log.m105924i("MicroMsg.TextStatus.TextStatusConversationLongClickListener", "[CONTEXT_MENU_LONG_CLICK_DELETE] ret" + this.f129151d + " position=" + this.f129152e.position);
        }
    }

    public C48187g(TextStatusConversationFragment textStatusConversationFragment, C32224a<C13598b0> aVar, int i, C8480h hVar) {
        aVar = (i & 2) != 0 ? null : aVar;
        C87412m.m108594g(textStatusConversationFragment, "fragment");
        this.f129148d = textStatusConversationFragment;
        this.f129149e = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        C52657a aVar = (C52657a) obj3;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(aVar, "conv");
        this.f129150f = aVar;
        C78253a aVar2 = new C78253a(view.getContext());
        aVar2.f229227C = this;
        aVar2.mo108272g(view, intValue, 0, this, this, TouchableLayout.f24959d, TouchableLayout.f24960e);
        aVar2.mo70679m();
        C52665g.C52666a aVar3 = C52665g.f147055f;
        String str = aVar.field_sessionId;
        C87412m.m108593f(str, "conv.field_sessionId");
        aVar3.mo73606c(str, 54);
        return C13598b0.f38549a;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(contextMenuInfo, "menuInfo");
        C52657a aVar = this.f129150f;
        if (!C87412m.m108589b(aVar != null ? aVar.field_sessionId : null, "textstatussayhisessionholder")) {
            contextMenu.add(0, 2, 0, C0966R.string.gm7);
        }
    }

    public void onDismiss() {
        this.f129150f = null;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C87412m.m108594g(menuItem, "menuItem");
        C52657a aVar = this.f129150f;
        if (aVar != null && menuItem.getItemId() == 2) {
            ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
            C87412m.m108592e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuInfo;
            C39674e eVar = C39674e.f106452d;
            boolean deleteNotify = eVar.mo62238D().deleteNotify(aVar.systemRowid, false);
            if (deleteNotify) {
                C39246d j0 = eVar.mo62251j0();
                String str = aVar.field_sessionId;
                C87412m.m108593f(str, "focused.field_sessionId");
                j0.getClass();
                C37612h jo = j0.mo61999jo(str);
                j0.f105582f.remove(str);
                ConcurrentHashMap<String, C37612h> concurrentHashMap = j0.f105581e;
                concurrentHashMap.remove(jo.field_talker + '_' + jo.field_senderUserName);
                SystemClock.uptimeMillis();
                j0.delete(jo, false, "sessionId");
                eVar.mo62238D().doNotify(aVar.field_sessionId, 6, aVar);
                C32224a<C13598b0> aVar2 = this.f129149e;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                FragmentActivity activity = this.f129148d.getActivity();
                if (activity != null) {
                    eVar.mo62241N0();
                    ((C53700n2) C39818r.f106831a.mo62443b(activity).mo75002a(C53700n2.class)).mo74293i3(1);
                    C52665g.C52666a aVar3 = C52665g.f147055f;
                    String str2 = aVar.field_sessionId;
                    C87412m.m108593f(str2, "focused.field_sessionId");
                    aVar3.mo73606c(str2, 55);
                }
            }
            C75604z3.m90836h(aVar.field_sessionId, new C48188a(deleteNotify, adapterContextMenuInfo));
        }
    }
}

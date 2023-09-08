package kn3;

import a11.C39479c;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import ln3.C76711c;
import mn3.C76789c;
import nj3.C11184p0;
import vh0.C78415b;
import z04.C112550d0;

/* renamed from: kn3.c */
public final class C76604c extends C61118a<C76711c> {

    /* renamed from: e */
    public final C67391b f224208e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f224209f;

    /* renamed from: g */
    public final C76789c f224210g;

    /* renamed from: kn3.c$a */
    public static final class C76605a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f224211d;

        /* renamed from: e */
        public final /* synthetic */ boolean f224212e;

        /* renamed from: f */
        public final /* synthetic */ boolean f224213f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f224214g;

        /* renamed from: h */
        public final /* synthetic */ C76711c f224215h;

        public C76605a(String str, boolean z, boolean z2, C60905o oVar, C76711c cVar) {
            this.f224211d = str;
            this.f224212e = z;
            this.f224213f = z2;
            this.f224214g = oVar;
            this.f224215h = cVar;
        }

        public final void onClick(View view) {
            long j;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("RoomInfo_Id", this.f224211d);
            intent.putExtra("room_notice", C45612m0.m50687d(this.f224211d));
            intent.putExtra("room_notice_xml", C45612m0.m50690g(this.f224211d));
            intent.putExtra("room_notice_publish_time", C45612m0.m50689f(this.f224211d));
            intent.putExtra("room_notice_editor", C45612m0.m50688e(this.f224211d));
            int i = 2;
            intent.putExtra("from_scene", 2);
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f224211d);
            C87412m.m108593f(Lo, "service(IChatroomService…mMembersStg.get(roomName)");
            intent.putExtra("Is_RoomOwner", this.f224212e);
            intent.putExtra("Is_RoomManager", this.f224213f);
            intent.putExtra("room_member_count", Lo.field_memberCount);
            ((C78415b) C86312j.m106911c(C78415b.class)).mo94224yh(this.f224214g.f173499A, intent);
            ViewRoomDescTipsStruct viewRoomDescTipsStruct = new ViewRoomDescTipsStruct();
            viewRoomDescTipsStruct.mo93200s(this.f224211d);
            viewRoomDescTipsStruct.f194663f = (long) Lo.field_memberCount;
            if (this.f224212e) {
                j = 1;
            } else {
                if (!this.f224213f) {
                    i = 0;
                }
                j = (long) i;
            }
            viewRoomDescTipsStruct.f194662e = j;
            viewRoomDescTipsStruct.mo93201t("" + Lo.field_chatroomnoticePublishTime);
            viewRoomDescTipsStruct.f194664g = 23;
            viewRoomDescTipsStruct.mo86054n();
            this.f224215h.f224436e = 1;
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.c$b */
    public static final class C76606b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C76604c f224216d;

        public C76606b(C76604c cVar) {
            this.f224216d = cVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                C45612m0.m50676C(this.f224216d.f224208e.mo91577r());
            }
        }
    }

    public C76604c(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76789c cVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(cVar, "processor");
        this.f224208e = bVar;
        this.f224209f = dVar;
        this.f224210g = cVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cuk;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public void mo44e(C60905o oVar, C76711c cVar, int i, int i2, boolean z, List<Object> list) {
        long j;
        C60905o oVar2 = oVar;
        C76711c cVar2 = cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(cVar2, "item");
        super.mo86076k(oVar, cVar, i, i2, z, list);
        View D = oVar2.mo85812D(C0966R.C0970id.isy);
        C44661m1 m1Var = cVar2.f224439u;
        String str = m1Var.field_chatroomname;
        String str2 = m1Var.field_chatroomnotice;
        C87412m.m108593f(str2, "notice");
        String obj = C112550d0.m153799i0(str2).toString();
        Pattern compile = Pattern.compile("\n");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(obj, "input");
        String replaceAll = compile.matcher(obj).replaceAll("");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.f5588j6)).setText(replaceAll);
        int i3 = this.f224209f.mo104003a() ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = D;
        String str3 = "";
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomNotifyTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomNotifyTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean b = Util.isNullOrNil(m1Var.field_roomowner) ? false : C87412m.m108589b(m1Var.field_roomowner, C75592q0.m90789s());
        boolean u2 = m1Var.mo69793u2(C75592q0.m90789s());
        String str4 = str3;
        C44661m1 m1Var2 = m1Var;
        oVar2.f44854d.setOnClickListener(new C76605a(str, b, u2, oVar, cVar));
        ViewRoomDescTipsStruct viewRoomDescTipsStruct = new ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.mo93200s(str);
        viewRoomDescTipsStruct.f194663f = (long) m1Var2.field_memberCount;
        if (b) {
            j = 1;
        } else {
            j = (long) (u2 ? 2 : 0);
        }
        viewRoomDescTipsStruct.f194662e = j;
        viewRoomDescTipsStruct.mo93201t(str4 + m1Var2.field_chatroomnoticePublishTime);
        viewRoomDescTipsStruct.f194664g = 22;
        this.f224210g.f224606f = viewRoomDescTipsStruct;
        View view2 = oVar2.f44854d;
        C87412m.m108593f(view2, "holder.itemView");
        mo86075j(view2, i, this.f224209f, new C76606b(this));
        this.f224210g.f224608h = true;
    }
}

package kn3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.p136ui.base.TalkRoomPopupNav;
import com.tencent.p014mm.p136ui.base.TalkRoomPopupNavV2;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import ed0.C75610d;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import ke3.C88144b;
import l31.C61212e;
import ln3.C76715i;
import mn3.C76795i;
import nj3.C76879j;
import p182kk.C61104a;
import t22.C77833z;
import zj3.C79344c1;
import zj3.C79348e;
import zj3.C79357g;

/* renamed from: kn3.j */
public final class C76613j extends C61118a<C76715i> {

    /* renamed from: e */
    public final C67391b f224230e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f224231f;

    /* renamed from: g */
    public final C76795i f224232g;

    /* renamed from: h */
    public final TalkRoomPopupNav.C73220f f224233h = new C76614a(this);

    /* renamed from: kn3.j$a */
    public static final class C76614a implements TalkRoomPopupNav.C73220f {

        /* renamed from: a */
        public final /* synthetic */ C76613j f224234a;

        public C76614a(C76613j jVar) {
            this.f224234a = jVar;
        }

        /* renamed from: a */
        public void mo101905a(String str) {
            C87412m.m108594g(str, "fromWhere");
            ((C79344c1) this.f224234a.f224230e.f193278b.mo102812a(C79344c1.class)).mo102262I4(str);
            this.f224234a.f224232g.mo107033O0();
        }

        /* renamed from: b */
        public void mo101906b() {
            Class cls = C79348e.class;
            Class cls2 = C79357g.class;
            if (C61104a.m71669y(this.f224234a.f224230e.mo91565f()) || C61104a.m71665u(this.f224234a.f224230e.mo91565f()) || C61104a.m71649e(this.f224234a.f224230e.mo91565f())) {
                Log.m105918d("MicroMsg.ChattingUI.TrackRoomComponent", "voip is running");
                return;
            }
            LinkedList<String> c = ((C77833z) C75610d.m90859a()).mo107950c(this.f224234a.f224230e.mo91574o().getUsername());
            C87412m.m108593f(c, "getTraceRoomMgr()\n      …etTalker().getUsername())");
            boolean z = false;
            Log.m105925i("MicroMsg.ChattingUI.TrackRoomComponent", "Click banner : %d", Integer.valueOf(c.size()));
            if (((C77833z) C75610d.m90859a()).mo107954g(this.f224234a.f224230e.mo91574o().getUsername())) {
                C76613j jVar = this.f224234a;
                if (((C79357g) jVar.f224230e.f193278b.mo102812a(cls2)).mo102150S1() || ((C79348e) jVar.f224230e.f193278b.mo102812a(cls)).mo70079x5()) {
                    z = true;
                }
                if (!C72996z1.m85820U5(jVar.f224230e.mo91577r()) || z) {
                    TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
                    talkRoomServerEvent.f154883d.f154885a = true;
                    talkRoomServerEvent.publish();
                    if (Util.isNullOrNil(talkRoomServerEvent.f154884e.f154887a) || C87412m.m108589b(jVar.f224230e.mo91577r(), talkRoomServerEvent.f154884e.f154887a)) {
                        String r = jVar.f224230e.mo91577r();
                        C87412m.m108593f(r, "mChattingContext.getTalkerUserName()");
                        jVar.mo106860m(r);
                        return;
                    }
                    TalkRoomServerEvent talkRoomServerEvent2 = new TalkRoomServerEvent();
                    talkRoomServerEvent2.f154883d.f154886b = true;
                    talkRoomServerEvent2.publish();
                    String r2 = jVar.f224230e.mo91577r();
                    C87412m.m108593f(r2, "mChattingContext.getTalkerUserName()");
                    jVar.mo106860m(r2);
                    return;
                }
                C76879j.m92748s(jVar.f224230e.mo91565f(), jVar.f224230e.mo91572m().getString(C0966R.string.k5l), (String) null);
                return;
            }
            C76613j jVar2 = this.f224234a;
            if (((C79357g) jVar2.f224230e.f193278b.mo102812a(cls2)).mo102150S1() || ((C79348e) jVar2.f224230e.f193278b.mo102812a(cls)).mo70079x5()) {
                z = true;
            }
            if (!C72996z1.m85820U5(jVar2.f224230e.mo91577r()) || z) {
                TalkRoomServerEvent talkRoomServerEvent3 = new TalkRoomServerEvent();
                talkRoomServerEvent3.f154883d.f154885a = true;
                talkRoomServerEvent3.publish();
                if (Util.isNullOrNil(talkRoomServerEvent3.f154884e.f154887a) || C87412m.m108589b(jVar2.f224230e.mo91577r(), talkRoomServerEvent3.f154884e.f154887a)) {
                    String r3 = jVar2.f224230e.mo91577r();
                    C87412m.m108593f(r3, "mChattingContext.getTalkerUserName()");
                    jVar2.mo106859l(r3);
                    return;
                }
                TalkRoomPopupNav talkRoomPopupNav = jVar2.f224232g.f224614f;
                if (talkRoomPopupNav == null || talkRoomPopupNav.getVisibility() != 0) {
                    C76879j.m92750u(jVar2.f224230e.mo91565f(), jVar2.f224230e.mo91572m().getString(C0966R.string.jt5), (String) null, new C76612h(jVar2), C33947i.f91671d);
                    return;
                }
                return;
            }
            C76879j.m92748s(jVar2.f224230e.mo91565f(), jVar2.f224230e.mo91572m().getString(C0966R.string.jte), (String) null);
        }
    }

    public C76613j(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C76795i iVar) {
        C87412m.m108594g(bVar, "mChattingContext");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(iVar, "processor");
        this.f224230e = bVar;
        this.f224231f = dVar;
        this.f224232g = iVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cwj;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public final void mo106859l(String str) {
        Intent intent = new Intent();
        intent.putExtra("enter_room_username", str);
        intent.setFlags(268435456);
        C88144b.m109791i(this.f224230e.mo91565f(), "talkroom", ".ui.TalkRoomUI", intent, (Bundle) null);
    }

    /* renamed from: m */
    public final void mo106860m(String str) {
        if (C61104a.m71669y(this.f224230e.mo91565f()) || C61104a.m71665u(this.f224230e.mo91565f()) || C61104a.m71649e(this.f224230e.mo91565f())) {
            Log.m105918d("MicroMsg.ChattingUI.TrackRoomComponent", "voip is running");
            return;
        }
        if (C75610d.m90859a() != null) {
            if (((C77833z) C75610d.m90859a()).mo107954g(this.f224230e.mo91574o().getUsername())) {
                LinkedList<String> c = ((C77833z) C75610d.m90859a()).mo107950c(this.f224230e.mo91574o().getUsername());
                if (c == null || !c.contains(this.f224230e.mo91573n())) {
                    boolean z = false;
                    C115669n.INSTANCE.mo160131h(10997, 13, 0, 0, 0);
                    TalkRoomPopupNav talkRoomPopupNav = this.f224232g.f224614f;
                    if (talkRoomPopupNav == null) {
                        Log.m105924i("MicroMsg.ChattingUI.TrackRoomComponent", "talkRoomPopupNav = null.");
                        return;
                    }
                    talkRoomPopupNav.setDialogContent(this.f224230e.mo91572m().getString(C0966R.string.caq));
                    if (talkRoomPopupNav.f214986g.getVisibility() == 0) {
                        z = true;
                    }
                    if (z) {
                        talkRoomPopupNav.mo101891k(300);
                        return;
                    } else {
                        talkRoomPopupNav.mo101890j("fromBanner", c, 300);
                        return;
                    }
                } else {
                    mo106862o("fromBanner");
                    return;
                }
            }
        }
        mo106862o("fromBanner");
    }

    /* renamed from: n */
    public void mo44e(C60905o oVar, C76715i iVar, int i, int i2, boolean z, List<Object> list) {
        boolean z2;
        String str;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(iVar, "item");
        super.mo86076k(oVar, iVar, i, i2, z, list);
        TalkRoomPopupNavV2 talkRoomPopupNavV2 = (TalkRoomPopupNavV2) oVar.mo85812D(C0966R.C0970id.kf9);
        talkRoomPopupNavV2.setChattingContext(this.f224230e);
        talkRoomPopupNavV2.setOnClickListener(this.f224233h);
        List<String> list2 = iVar.f224443u;
        int i3 = 0;
        if (list2.contains(this.f224230e.mo91573n())) {
            str = this.f224230e.mo91572m().getString(C0966R.string.k5n);
            talkRoomPopupNavV2.setArrowRotation(0.0f);
            z2 = false;
        } else {
            talkRoomPopupNavV2.setArrowRotation(90.0f);
            talkRoomPopupNavV2.mo101880c(-1, 0);
            if (list2.size() == 1) {
                str = this.f224230e.mo91572m().getString(C0966R.string.k5m, new Object[]{((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(list2.get(0))});
            } else {
                str = this.f224230e.mo91572m().getString(C0966R.string.k5o, new Object[]{Integer.valueOf(list2.size())});
            }
            int color = this.f224230e.mo91572m().getColor(C0966R.color.f2939n);
            WeImageView weImageView = talkRoomPopupNavV2.f214992p;
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.icons_filled_location);
                talkRoomPopupNavV2.f214992p.setIconColor(color);
            }
            z2 = true;
        }
        LinearLayout linearLayout = talkRoomPopupNavV2.f214986g;
        if (linearLayout != null) {
            if (linearLayout.getVisibility() == 0 && talkRoomPopupNavV2.f214999w == null) {
                talkRoomPopupNavV2.mo101882e(true);
            } else {
                talkRoomPopupNavV2.mo101882e(false);
            }
        }
        talkRoomPopupNavV2.mo101881d(list2);
        talkRoomPopupNavV2.setVisibility(0);
        talkRoomPopupNavV2.setNavContent(str);
        if (this.f224231f.f219973a == ChatTipsBarGroup.C74824c.MODE_FOLD) {
            talkRoomPopupNavV2.mo101891k(0);
        } else if (z2) {
            talkRoomPopupNavV2.mo101890j("fromBanner", list2, 0);
        } else {
            talkRoomPopupNavV2.mo101891k(0);
        }
        WeImageView arrowImg = talkRoomPopupNavV2.getArrowImg();
        if (arrowImg != null) {
            if (this.f224231f.mo104003a()) {
                i3 = 8;
            }
            arrowImg.setVisibility(i3);
        }
        Button btnEnter = talkRoomPopupNavV2.getBtnEnter();
        if (btnEnter != null) {
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            eVar.o30(btnEnter, "group_msg_set_top_bar_join_btn");
            eVar.mo86175pO(btnEnter, 8, 26356);
        }
        this.f224232g.f224614f = talkRoomPopupNavV2;
    }

    /* renamed from: o */
    public final void mo106862o(String str) {
        this.f224232g.mo107033O0();
        ((C79344c1) this.f224230e.f193278b.mo102812a(C79344c1.class)).mo102261H0(str);
    }
}

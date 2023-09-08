package com.tencent.p014mm.p136ui.conversation;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.autogen.events.BizPlaceTopChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.BizMyBizListReportStruct;
import com.tencent.p014mm.modelsimple.C40366p;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C75045z;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45074p;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineNewMsgUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineSettingUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.C97625j3;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gw0.C76073b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jx0.C33702b;
import k20.C9556a;
import ke3.C88144b;
import kw0.C46746a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C47350c;
import ob0.C89144l0;
import p154fy.C87121j;
import p629ny.C76979h;
import qo3.C77407n;
import rb0.C36283t0;
import rb0.C48009v0;
import rx3.C36570n;
import s90.C77627f;
import tc0.C77885p;
import te3.C49004ci;
import te3.C49148di;
import te3.C50319lw2;
import te3.C50459mw2;
import te3.C50904q20;
import te3.C51146rr3;
import te3.C51163rv3;
import te3.qg4;
import u73.C101987v0;
import u73.C14135q;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI */
public class NewBizConversationUI extends MMActivity {

    /* renamed from: x */
    public static final /* synthetic */ int f121810x = 0;

    /* renamed from: d */
    public TextView f121811d;

    /* renamed from: e */
    public ListView f121812e;

    /* renamed from: f */
    public C44921i f121813f;

    /* renamed from: g */
    public C72976h2 f121814g;

    /* renamed from: h */
    public C78253a f121815h;

    /* renamed from: i */
    public String f121816i;

    /* renamed from: j */
    public String f121817j;

    /* renamed from: n */
    public int f121818n = 1;

    /* renamed from: o */
    public String f121819o = "";

    /* renamed from: p */
    public long f121820p = 0;

    /* renamed from: q */
    public int f121821q = 0;

    /* renamed from: r */
    public int f121822r = 0;

    /* renamed from: s */
    public long f121823s;

    /* renamed from: t */
    public final MultiProcessMMKV f121824t = MultiProcessMMKV.getSingleMMKV("brandService");

    /* renamed from: u */
    public boolean f121825u = false;

    /* renamed from: v */
    public C11184p0 f121826v = new C44914e();

    /* renamed from: w */
    public IListener f121827w = new IListener<AppActiveEvent>(C40008f.f107254d) {
        {
            this.__eventId = 2123042947;
        }

        public boolean callback(IEvent iEvent) {
            AppActiveEvent.C28702a aVar;
            AppActiveEvent appActiveEvent = (AppActiveEvent) iEvent;
            if (appActiveEvent == null || (aVar = appActiveEvent.f78710d) == null || aVar.f78711a) {
                return false;
            }
            NewBizConversationUI.this.f121820p = 0;
            return false;
        }
    };

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$a */
    public class C6948a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$a$a */
        public class C6949a implements Runnable {
            public C6949a() {
            }

            public void run() {
                Class cls = C0406o.class;
                Class cls2 = C0405n.class;
                Intent O20 = ((C0405n) C86312j.m106911c(cls2)).O20();
                O20.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, NewBizConversationUI.this.getString(C0966R.string.f3r));
                O20.putExtra("searchbar_tips", NewBizConversationUI.this.getString(C0966R.string.f3r));
                O20.putExtra("KRightBtn", true);
                O20.putExtra("ftsneedkeyboard", !((C0406o) C86312j.m106911c(cls)).yv0(11, 2));
                O20.putExtra("publishIdPrefix", "bs");
                O20.putExtra("ftsType", 2);
                O20.putExtra("ftsbizscene", 11);
                Map<String, String> hn = ((C0405n) C86312j.m106911c(cls2)).mo280hn(11, true, 2);
                String lh02 = ((C0405n) C86312j.m106911c(cls2)).lh0(Util.safeParseInt(hn.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
                hn.put("sessionId", lh02);
                O20.putExtra("key_preload_biz", 4);
                O20.putExtra("sessionId", lh02);
                O20.putExtra("rawUrl", C101987v0.m134270d(hn, 0));
                O20.putExtra("key_load_js_without_delay", true);
                O20.addFlags(67108864);
                Bundle bundle = null;
                if (!C85875k4.m106211z()) {
                    bundle = ActivityOptions.makeSceneTransitionAnimation(NewBizConversationUI.this, new Pair[0]).toBundle();
                }
                String Fb = ((C0406o) C86312j.m106911c(cls)).mo447Fb("bizAccountTopSearch");
                if (!TextUtils.isEmpty(Fb)) {
                    O20.putExtra("key_search_input_hint", Fb);
                }
                C88144b.m109806x(NewBizConversationUI.this, O20, bundle);
            }
        }

        public C6948a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (C43471q.m46984h(0)) {
                ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(MMApplicationContext.getContext(), new C6949a());
                return true;
            }
            Log.m105920e("MicroMsg.NewBizConversationUI", "fts h5 template not avail");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$b */
    public class C44911b implements AdapterView.OnItemClickListener {
        public C44911b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/NewBizConversationUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            NewBizConversationUI newBizConversationUI = NewBizConversationUI.this;
            newBizConversationUI.f121814g = (C72976h2) newBizConversationUI.f121813f.getItem(i2);
            NewBizConversationUI newBizConversationUI2 = NewBizConversationUI.this;
            newBizConversationUI2.f121819o = newBizConversationUI2.f121814g.getUsername();
            C72976h2 h2Var = NewBizConversationUI.this.f121814g;
            if (h2Var == null) {
                Log.m105921e("MicroMsg.NewBizConversationUI", "user should not be null. position:%d, size:%d", Integer.valueOf(i), Integer.valueOf(NewBizConversationUI.this.f121813f.getCount()));
                NewBizConversationUI.this.f121813f.notifyDataSetChanged();
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/NewBizConversationUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(NewBizConversationUI.this.f121819o);
            BizMyBizListReportStruct bizMyBizListReportStruct = new BizMyBizListReportStruct();
            long j2 = 1;
            bizMyBizListReportStruct.f107849d = 1;
            bizMyBizListReportStruct.f107850e = NewBizConversationUI.this.f121823s;
            bizMyBizListReportStruct.f107851f = bizMyBizListReportStruct.mo86045b("bizusername", h2Var.getUsername(), true);
            bizMyBizListReportStruct.f107852g = System.currentTimeMillis();
            if (!z1Var.mo62940x3()) {
                j2 = 0;
            }
            bizMyBizListReportStruct.f107853h = j2;
            bizMyBizListReportStruct.mo86054n();
            Intent intent = new Intent(NewBizConversationUI.this, ChattingUI.class);
            intent.putExtra("Chat_User", h2Var.getUsername());
            intent.putExtra("finish_direct", true);
            intent.putExtra("biz_click_item_unread_count", NewBizConversationUI.this.f121814g.mo108786G2());
            intent.putExtra("biz_click_item_position", i2 + 1);
            if (C33702b.f91166a.mo59262a()) {
                intent.putExtra("KOpenArticleSceneFromScene", 244);
            } else {
                intent.putExtra("KOpenArticleSceneFromScene", 92);
            }
            intent.putExtra("specific_chat_from_scene", 6);
            NewBizConversationUI newBizConversationUI3 = NewBizConversationUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            NewBizConversationUI newBizConversationUI4 = newBizConversationUI3;
            C117292a.m165358d(newBizConversationUI4, aVar.mo10232b(), "com/tencent/mm/ui/conversation/NewBizConversationUI$10", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            newBizConversationUI3.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(newBizConversationUI4, "com/tencent/mm/ui/conversation/NewBizConversationUI$10", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C44921i iVar = NewBizConversationUI.this.f121813f;
            iVar.getClass();
            iVar.mo70218x(h2Var, ((C44660i2) C97625j3.m125812b().mo105908w()).mo69754Z(h2Var), i2, true);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/NewBizConversationUI$10", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$c */
    public class C44912c implements View.OnTouchListener {
        public C44912c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/NewBizConversationUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                NewBizConversationUI.this.f121821q = (int) motionEvent.getRawX();
                NewBizConversationUI.this.f121822r = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/conversation/NewBizConversationUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$d */
    public class C44913d implements AdapterView.OnItemLongClickListener {
        public C44913d() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            NewBizConversationUI newBizConversationUI = NewBizConversationUI.this;
            newBizConversationUI.f121814g = (C72976h2) newBizConversationUI.f121813f.getItem(i);
            NewBizConversationUI newBizConversationUI2 = NewBizConversationUI.this;
            newBizConversationUI2.f121819o = newBizConversationUI2.f121814g.getUsername();
            NewBizConversationUI newBizConversationUI3 = NewBizConversationUI.this;
            newBizConversationUI3.f121815h.mo108272g(view, i, j, newBizConversationUI3, newBizConversationUI3.f121826v, newBizConversationUI3.f121821q, newBizConversationUI3.f121822r);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$e */
    public class C44914e implements C11184p0 {

        /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$e$a */
        public class C44915a implements Runnable {
            public C44915a() {
            }

            public void run() {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(NewBizConversationUI.this.f121819o);
            }
        }

        public C44914e() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(NewBizConversationUI.this.f121819o);
                if (z1Var == null) {
                    Log.m105920e("MicroMsg.NewBizConversationUI", "changed biz stick status failed, contact is null, talker = " + NewBizConversationUI.this.f121819o);
                    return;
                }
                if (z1Var.mo62940x3()) {
                    C115669n.INSTANCE.mo160131h(13307, z1Var.getUsername(), 1, 2, 2);
                    C45628s0.m50803u0(NewBizConversationUI.this.f121819o, true);
                } else {
                    C115669n.INSTANCE.mo160131h(13307, z1Var.getUsername(), 1, 1, 2);
                    C45628s0.m50787m0(NewBizConversationUI.this.f121819o, true, true);
                }
                BizPlaceTopChangeEvent bizPlaceTopChangeEvent = new BizPlaceTopChangeEvent();
                bizPlaceTopChangeEvent.f107373d.f107374a = z1Var.getUsername();
                bizPlaceTopChangeEvent.publish();
            } else if (itemId == 2) {
                C45074p.m49920b(C48009v0.Fx0().mo72757SE(NewBizConversationUI.this.f121819o), NewBizConversationUI.this, C97625j3.m125812b().mo105907v().get(NewBizConversationUI.this.f121819o), false, (Runnable) null, 2);
            } else if (itemId == 3) {
                NewBizConversationUI newBizConversationUI = NewBizConversationUI.this;
                String str = newBizConversationUI.f121819o;
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.NewBizConversationUI", "Delete Conversation and messages fail because username is null or nil.");
                    return;
                }
                C115669n.INSTANCE.mo160131h(13773, 0, Integer.valueOf(newBizConversationUI.f121814g.mo108786G2()), 0, newBizConversationUI.f121814g.getUsername());
                C72963f4 Rx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str);
                C50904q20 q202 = new C50904q20();
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = Util.nullAsNil(str);
                rv32.f141176e = true;
                q202.f140097d = rv32;
                q202.f140099f = Rx0.mo108774y2();
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(8, q202));
                newBizConversationUI.f121825u = false;
                C75604z3.m90836h(str, new C44986f1(newBizConversationUI, C76879j.m92723Q(newBizConversationUI, newBizConversationUI.getString(C0966R.string.a3h), newBizConversationUI.getString(C0966R.string.a4d), true, true, new C44984e1(newBizConversationUI))));
                ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str);
                C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str);
                C48009v0.Jx0().mo25795Yt(str);
                if (j == null) {
                    return;
                }
                if (j.mo108372k3(4194304) || (z1Var2 != null && z1Var2.mo62916m3() && !z1Var2.mo62927s3() && j.mo108821o2() < C48009v0.Nx0())) {
                    C97625j3.m125815e().mo123460f(new C40366p(str, (byte[]) null));
                }
            } else if (itemId == 4) {
                C75045z.m90001b(NewBizConversationUI.this, new C44915a());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$f */
    public class C44916f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f121834d;

        /* renamed from: e */
        public final /* synthetic */ int f121835e;

        /* renamed from: f */
        public final /* synthetic */ boolean f121836f;

        /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$f$a */
        public class C44917a implements C11182m0 {
            public C44917a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107125a(1, C0966R.string.apf);
                String decodeString = NewBizConversationUI.this.f121824t.decodeString("PaySubscribeEntryUrl", "");
                if (C44916f.this.f121835e == 1 && !Util.isNullOrNil(decodeString)) {
                    C44916f fVar = C44916f.this;
                    if (fVar.f121836f) {
                        e0Var.mo107163s(2, NewBizConversationUI.this.getString(C0966R.string.amt), NewBizConversationUI.this.f121824t.decodeBool("NeedShowPayRedDot", true), false);
                    }
                }
                C50459mw2 H7 = NewBizConversationUI.m49792H7(NewBizConversationUI.this);
                if (H7 != null && !Util.isNullOrNil((List) H7.f138248d)) {
                    for (int i = 0; i < H7.f138248d.size(); i++) {
                        C50319lw2 lw22 = H7.f138248d.get(i);
                        if (lw22 != null && lw22.f137682f == 3 && !Util.isNullOrNil(lw22.f137681e) && !Util.isNullOrNil(lw22.f137680d)) {
                            e0Var.mo107142f(i + 100, lw22.f137681e);
                        }
                    }
                }
                if (NewBizConversationUI.m49793I7(NewBizConversationUI.this)) {
                    e0Var.mo107163s(3, NewBizConversationUI.this.getString(C0966R.string.a2z), false, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$f$b */
        public class C44918b implements C11184p0 {
            public C44918b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                int i2 = 0;
                if (itemId == 1) {
                    Intent intent = new Intent(NewBizConversationUI.this.getContext(), BizTimeLineNewMsgUI.class);
                    intent.putExtra("biz_time_line_line_enter_scene", 2);
                    intent.putExtra("biz_time_line_line_session_id", NewBizConversationUI.this.f121823s);
                    NewBizConversationUI newBizConversationUI = NewBizConversationUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    NewBizConversationUI newBizConversationUI2 = newBizConversationUI;
                    C117292a.m165358d(newBizConversationUI2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/NewBizConversationUI$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    newBizConversationUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(newBizConversationUI2, "com/tencent/mm/ui/conversation/NewBizConversationUI$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (itemId == 2) {
                    NewBizConversationUI.this.f121824t.encode("NeedShowPayRedDot", false);
                    NewBizConversationUI.m49794J7(NewBizConversationUI.this, NewBizConversationUI.this.f121824t.decodeString("PaySubscribeEntryUrl", ""), true);
                } else if (itemId != 3) {
                    C50459mw2 H7 = NewBizConversationUI.m49792H7(NewBizConversationUI.this);
                    if (H7 != null && !Util.isNullOrNil((List) H7.f138248d)) {
                        while (true) {
                            if (i2 < H7.f138248d.size()) {
                                C50319lw2 lw22 = H7.f138248d.get(i2);
                                if (lw22 != null && lw22.f137682f == 3 && !Util.isNullOrNil(lw22.f137681e) && !Util.isNullOrNil(lw22.f137680d) && i2 + 100 == menuItem.getItemId()) {
                                    NewBizConversationUI.m49794J7(NewBizConversationUI.this, lw22.f137680d, lw22.f137683g);
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                    }
                    Log.m105928w("MicroMsg.NewBizConversationUI", "default onMMMenuItemSelected err");
                } else {
                    Intent intent2 = new Intent(NewBizConversationUI.this.getContext(), BizTimeLineSettingUI.class);
                    NewBizConversationUI newBizConversationUI3 = NewBizConversationUI.this;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    NewBizConversationUI newBizConversationUI4 = newBizConversationUI3;
                    C117292a.m165358d(newBizConversationUI4, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/NewBizConversationUI$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    newBizConversationUI3.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(newBizConversationUI4, "com/tencent/mm/ui/conversation/NewBizConversationUI$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }

        public C44916f(boolean z, int i, boolean z2) {
            this.f121834d = z;
            this.f121835e = i;
            this.f121836f = z2;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f121834d) {
                NewBizConversationUI.this.f121824t.encode("NeedShowPayActionBarRedDot", false);
                NewBizConversationUI.this.mo70208K7();
            }
            C77407n nVar = new C77407n((Context) NewBizConversationUI.this, 1, false);
            nVar.f225771i = new C44917a();
            nVar.f225782p = new C44918b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$g */
    public class C44919g implements Runnable {
        public C44919g() {
        }

        public void run() {
            int i;
            int i2;
            int i3;
            long j;
            int i4;
            NewBizConversationUI newBizConversationUI = NewBizConversationUI.this;
            int i5 = NewBizConversationUI.f121810x;
            newBizConversationUI.getClass();
            if (C97625j3.m125811a()) {
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("");
                Cursor I = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(1, (List<String>) null, newBizConversationUI.f121816i, -1);
                if (I != null) {
                    int columnIndex = I.getColumnIndex("unReadCount");
                    int columnIndex2 = I.getColumnIndex("conversationTime");
                    int columnIndex3 = I.getColumnIndex("flag");
                    i4 = I.getCount();
                    C72976h2 h2Var = new C72976h2();
                    j = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                    while (I.moveToNext()) {
                        h2Var.mo101161T2(I.getLong(columnIndex3));
                        int i6 = I.getInt(columnIndex);
                        if (i6 > 0) {
                            j = I.getLong(columnIndex2);
                            i2++;
                            i3 += i6;
                        } else {
                            i6 = 0;
                        }
                        sb.append(I.isFirst() ? "" : ".");
                        sb.append(i6);
                        if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69754Z(h2Var)) {
                            i++;
                        }
                    }
                    I.close();
                } else {
                    i4 = 0;
                    j = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                C115669n.INSTANCE.mo160131h(13771, Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j / 1000), Integer.valueOf(i), sb.toString());
                Log.m105927v("MicroMsg.NewBizConversationUI", "report use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            NewBizConversationUI newBizConversationUI2 = NewBizConversationUI.this;
            if (newBizConversationUI2.f121820p != 0) {
                C115669n.INSTANCE.mo160131h(13932, Integer.valueOf(((int) (System.currentTimeMillis() - newBizConversationUI2.f121820p)) / 1000), 2, Long.valueOf(newBizConversationUI2.f121823s), 0, Integer.valueOf(newBizConversationUI2.f121818n));
            }
            NewBizConversationUI newBizConversationUI3 = NewBizConversationUI.this;
            if (newBizConversationUI3.f121813f != null) {
                LinkedList linkedList = new LinkedList();
                for (Map.Entry next : newBizConversationUI3.f121813f.f121842H.entrySet()) {
                    C44922j jVar = (C44922j) next.getValue();
                    C51146rr3 rr32 = new C51146rr3();
                    rr32.f141101d = (String) next.getKey();
                    rr32.f141102e = jVar.f141102e;
                    rr32.f141103f = jVar.f141103f;
                    rr32.f141107j = jVar.f141107j;
                    rr32.f141105h = jVar.f121845p > 0;
                    rr32.f141108n = jVar.f141108n;
                    rr32.f141104g = jVar.f141104g;
                    rr32.f141106i = jVar.f141106i;
                    linkedList.add(rr32);
                }
                C86709a0.m107529k().f251779b.mo123460f(new C36283t0(linkedList));
                Log.m105919d("MicroMsg.NewBizConversationUI", "reportExpose size:%d", Integer.valueOf(linkedList.size()));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$h */
    public class C44920h implements C6975i1.C6977b {
        public C44920h() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            NewBizConversationUI newBizConversationUI = NewBizConversationUI.this;
            if (newBizConversationUI.f121813f.getCount() <= 0) {
                newBizConversationUI.f121811d.setVisibility(0);
                newBizConversationUI.f121812e.setVisibility(8);
                return;
            }
            newBizConversationUI.f121811d.setVisibility(8);
            newBizConversationUI.f121812e.setVisibility(0);
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$i */
    public static class C44921i extends C74697k {

        /* renamed from: H */
        public HashMap<String, C44922j> f121842H = new HashMap<>();

        /* renamed from: I */
        public String f121843I;

        public C44921i(Context context, String str, C6975i1.C6977b bVar) {
            super(context, bVar);
            this.f121843I = str;
        }

        /* renamed from: o */
        public void mo1333o() {
            mo7998r(((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(1, (List<String>) null, this.f121843I, -1));
            C6975i1.C6977b bVar = this.f24699h;
            if (bVar != null) {
                bVar.mo1327a((Object) null);
            }
            notifyDataSetChanged();
        }

        /* renamed from: x */
        public void mo70218x(C72976h2 h2Var, boolean z, int i, boolean z2) {
            C77627f JZ;
            if (h2Var != null) {
                C44922j jVar = this.f121842H.get(h2Var.getUsername());
                if (jVar == null) {
                    jVar = new C44922j();
                    this.f121842H.put(h2Var.getUsername(), jVar);
                }
                if (jVar.f121845p <= 0) {
                    jVar.f141104g = z;
                    jVar.f141108n = jVar.f141108n || h2Var.mo108786G2() > 0;
                    int i2 = i + 1;
                    jVar.f141107j = i2;
                    if (z2) {
                        jVar.f121845p = i2;
                    }
                    jVar.f141106i = (int) (System.currentTimeMillis() / 1000);
                    if (h2Var.mo108833z2() != jVar.f121844o) {
                        jVar.f121844o = h2Var.mo108833z2();
                        C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(h2Var.getUsername());
                        if (Ex0 != null && Ex0.mo100967F3() && (JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(Ex0.getMsgId(), Ex0.getContent())) != null && !Util.isNullOrNil((List) JZ.f226295i) && !Util.isNullOrNil(JZ.f226295i.get(0).f226326e)) {
                            try {
                                Uri parse = Uri.parse(JZ.f226295i.get(0).f226326e);
                                jVar.f141102e = Util.getLong(parse.getQueryParameter("mid"), 0);
                                jVar.f141103f = Util.getInt(parse.getQueryParameter("idx"), 0);
                            } catch (UnsupportedOperationException e) {
                                Log.m105929w("MicroMsg.ConversationAdapter", "exposeLog exp %s", e.getMessage());
                            } catch (Exception e2) {
                                Log.m105929w("MicroMsg.ConversationAdapter", "exposeLog exp %s", e2.getMessage());
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.NewBizConversationUI$j */
    public static class C44922j extends C51146rr3 {

        /* renamed from: o */
        public long f121844o;

        /* renamed from: p */
        public int f121845p = -1;
    }

    /* renamed from: H7 */
    public static C50459mw2 m49792H7(NewBizConversationUI newBizConversationUI) {
        byte[] decodeBytes = newBizConversationUI.f121824t.decodeBytes(newBizConversationUI.mo70210M7());
        if (decodeBytes != null) {
            try {
                C50459mw2 mw22 = new C50459mw2();
                mw22.parseFrom(decodeBytes);
                return mw22;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NewBizConversationUI", "getMenuEntryListInfo ex %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: I7 */
    public static boolean m49793I7(NewBizConversationUI newBizConversationUI) {
        newBizConversationUI.getClass();
        C44545a aVar = C44545a.f120794a;
        qg4 b = aVar.mo69324b();
        if (b == null) {
            Log.m105924i("MicroMsg.NewBizConversationUI", "isOpenTimeLineSetting settingInfo is null");
            return C43520v.f117665a.mo67810a();
        }
        Log.m105925i("MicroMsg.NewBizConversationUI", "isOpenTimeLineSetting timelineSettingControlBit=%d", Integer.valueOf(b.f140315d));
        if (C43520v.f117665a.mo67810a()) {
            return true;
        }
        return aVar.mo69326d(b.f140315d);
    }

    /* renamed from: J7 */
    public static void m49794J7(NewBizConversationUI newBizConversationUI, String str, boolean z) {
        newBizConversationUI.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.NewBizConversationUI", "gotoWebView url is null!");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("KRightBtn", z);
        C88144b.m109791i(newBizConversationUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: K7 */
    public final void mo70208K7() {
        removeAllOptionMenu();
        C46746a aVar = C46746a.f125826a;
        boolean booleanValue = ((Boolean) ((C36570n) C46746a.f125828c).getValue()).booleanValue();
        boolean e = ((C0405n) C86312j.m106911c(C0405n.class)).mo279e();
        Log.m105919d("MicroMsg.NewBizConversationUI", "open search entrance:%b, isBizTeenModeAllowAll: %b", Boolean.valueOf(booleanValue), Boolean.valueOf(e));
        if (booleanValue && !e) {
            addIconOptionMenu(1, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C6948a());
        }
        if (!C33702b.f91166a.mo59262a()) {
            boolean Cl0 = ((C45696d) C86709a0.m107533q(C45696d.class)).Cl0();
            int decodeInt = this.f121824t.decodeInt(mo70209L7(), 0);
            boolean z = decodeInt == 1 && Cl0 && this.f121824t.decodeBool("NeedShowPayActionBarRedDot", true);
            addIconOptionMenu(0, (int) C0966R.string.a0h, (int) C0966R.raw.actionbar_icon_dark_more, z, (MenuItem.OnMenuItemClickListener) new C44916f(z, decodeInt, Cl0));
        }
    }

    /* renamed from: L7 */
    public final String mo70209L7() {
        String i = C86709a0.m107522a() ? C86709a0.m107523b().mo121111i() : "";
        return i + ":PaySubscribeEntryOpen";
    }

    /* renamed from: M7 */
    public final String mo70210M7() {
        String i = C86709a0.m107522a() ? C86709a0.m107523b().mo121111i() : "";
        return i + ":MenuEntryListInfo";
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c_r;
    }

    public void initView() {
        setMMTitle(this.f121817j);
        setBackBtn(new C44989h1(this));
        setTitleBarDoubleClickListener(new C44991i1(this));
        this.f121812e = (ListView) findViewById(C0966R.C0970id.kpr);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
        this.f121811d = textView;
        textView.setText(C0966R.string.caf);
        this.f121813f = new C44921i(this, this.f121816i, new C44920h());
        this.f121813f.getClass();
        this.f121812e.setAdapter(this.f121813f);
        this.f121815h = new C78253a(this);
        this.f121812e.setOnItemClickListener(new C44911b());
        this.f121812e.setOnTouchListener(new C44912c());
        this.f121812e.setOnItemLongClickListener(new C44913d());
        this.f121813f.getClass();
        this.f121813f.getClass();
        this.f121813f.getClass();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = this.f121819o;
        if (str != null && !str.isEmpty()) {
            this.f121819o = "";
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C97625j3.m125811a()) {
            Log.m105920e("MicroMsg.NewBizConversationUI", "onCreate acc not ready!!!");
            finish();
            return;
        }
        this.f121823s = getIntent().getLongExtra("biz_time_line_line_session_id", 0);
        this.f121818n = getIntent().getIntExtra("biz_enter_source", 1);
        this.f121816i = "officialaccounts";
        C115669n.INSTANCE.mo160131h(11404, 0, 0, 0, 0, 0, Long.valueOf(this.f121823s), Integer.valueOf((int) (System.currentTimeMillis() / 1000)), Integer.valueOf(this.f121818n), "", 0, 0, 0);
        String stringExtra = getIntent().getStringExtra("enterprise_biz_display_name");
        this.f121817j = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f121817j = getString(C0966R.string.an6);
        }
        initView();
        mo70208K7();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49004ci();
        bVar.f127067b = new C49148di();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/timeline/bizstrategy";
        bVar.f127069d = 1806;
        C47350c a = bVar.mo72403a();
        ((C49004ci) a.f127055a.f127080a).f131731d = 321;
        C89144l0.m111429e(a, new C44988g1(this), false);
        C97625j3.m125812b().mo105908w().add(this.f121813f);
        this.f121820p = System.currentTimeMillis();
        this.f121827w.alive();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f121819o);
        if (z1Var == null) {
            Log.m105920e("MicroMsg.NewBizConversationUI", "onCreateContextMenu, contact is null, talker = " + this.f121819o);
            return;
        }
        String f = z1Var.mo62898f();
        if (f.toLowerCase().endsWith("@chatroom") && Util.isNullOrNil(z1Var.getNickname())) {
            f = getString(C0966R.string.bba);
        }
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, f));
        if (z1Var.mo62927s3()) {
            if (z1Var.mo62940x3()) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 0, C0966R.string.an4);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 1, 0, C0966R.string.f360181an3);
            }
            contextMenu.add(adapterContextMenuInfo.position, 2, 0, C0966R.string.glz);
        }
        contextMenu.add(adapterContextMenuInfo.position, 3, 0, C0966R.string.gm7);
    }

    public void onDestroy() {
        C86709a0.m107525e().postToWorker(new C44919g());
        this.f121827w.dead();
        if (C97625j3.m125811a()) {
            C97625j3.m125812b().mo105908w().remove(this.f121813f);
        }
        C44921i iVar = this.f121813f;
        if (iVar != null) {
            iVar.mo70227D();
        }
        super.onDestroy();
    }

    public void onPause() {
        Log.m105924i("MicroMsg.NewBizConversationUI", "on pause");
        C44921i iVar = this.f121813f;
        if (iVar != null) {
            iVar.mo103859E();
        }
        super.onPause();
    }

    public void onResume() {
        Log.m105926v("MicroMsg.NewBizConversationUI", "on resume");
        C44921i iVar = this.f121813f;
        if (iVar != null) {
            iVar.mo103860F();
        }
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.addAll(super.importUIComponents());
        hashSet.add(C6959d1.class);
    }
}

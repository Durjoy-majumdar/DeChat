package com.tencent.p014mm.p136ui.chatting.component;

import a11.C39479c;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C6779f3;
import com.tencent.p014mm.p136ui.chatting.C6793s0;
import com.tencent.p014mm.p136ui.chatting.C6800u0;
import com.tencent.p014mm.p136ui.chatting.C73681e3;
import com.tencent.p014mm.p136ui.chatting.C73832q0;
import com.tencent.p014mm.p136ui.chatting.C73843s2;
import com.tencent.p014mm.p136ui.chatting.C73852u1;
import com.tencent.p014mm.p136ui.chatting.ChatFooterCustom;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.component.biz.BizComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.websearch.C96603l;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.AppPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C44614y0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72825s0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72843y1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$k1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$n1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$o1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$p1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooterBottom;
import com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.MaxHeightScrollView;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C97625j3;
import ex0.C45700h;
import f40.C86709a0;
import f62.C75700k0;
import ge0.C32415b;
import h81.C32735h;
import ht1.C60165e4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C76901s0;
import ob0.C77002r;
import org.json.JSONArray;
import org.json.JSONObject;
import p248ug.C52558c;
import p270xi.C91212b;
import p629ny.C76979h;
import p823sg.C77710q;
import rb0.C47996o;
import zj3.C79337a0;
import zj3.C79338a1;
import zj3.C79344c1;
import zj3.C79348e;
import zj3.C79353f1;
import zj3.C79361h0;
import zj3.C79363i;
import zj3.C79369m;
import zj3.C79376p0;
import zj3.C79383u;
import zj3.C79384u0;
import zj3.C79385v;
import zj3.C79387w;
import zj3.C79388w0;

@C91212b(exportInterface = C79387w.class)
/* renamed from: com.tencent.mm.ui.chatting.component.FootComponent */
public class FootComponent extends C73412a implements C79387w, MStorageEx.IOnStorageChange, MStorage.IOnStorageChange {

    /* renamed from: y */
    public static ArrayList<C72791h.C44607a> f215508y;

    /* renamed from: z */
    public static long f215509z;

    /* renamed from: e */
    public ChatFooter f215510e;

    /* renamed from: f */
    public C73852u1 f215511f;

    /* renamed from: g */
    public ChatFooterCustom f215512g;

    /* renamed from: h */
    public int f215513h = 0;

    /* renamed from: i */
    public C73843s2 f215514i;

    /* renamed from: j */
    public AnimationSet f215515j;

    /* renamed from: n */
    public String f215516n = null;

    /* renamed from: o */
    public int f215517o;

    /* renamed from: p */
    public int f215518p;

    /* renamed from: q */
    public boolean f215519q = false;

    /* renamed from: r */
    public boolean f215520r = false;

    /* renamed from: s */
    public boolean f215521s = false;

    /* renamed from: t */
    public IListener f215522t;

    /* renamed from: u */
    public IListener f215523u;

    /* renamed from: v */
    public final ChatFooter$$n1 f215524v;

    /* renamed from: w */
    public boolean f215525w;

    /* renamed from: x */
    public long f215526x;

    public FootComponent() {
        C40008f fVar = C40008f.f107254d;
        this.f215522t = new IListener<RevokeNativeMsgEvent>(fVar) {
            {
                this.__eventId = 690552614;
            }

            public boolean callback(IEvent iEvent) {
                ChatFooter chatFooter;
                RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
                if (!(revokeNativeMsgEvent instanceof RevokeNativeMsgEvent) || (chatFooter = FootComponent.this.f215510e) == null) {
                    return false;
                }
                chatFooter.mo100348E0(true, revokeNativeMsgEvent.f78950d.f78951a);
                return false;
            }
        };
        this.f215523u = new IListener<RevokeMsgEvent>(fVar) {
            {
                this.__eventId = 675629679;
            }

            public boolean callback(IEvent iEvent) {
                ChatFooter chatFooter;
                RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
                if ((revokeMsgEvent instanceof RevokeMsgEvent) && (chatFooter = FootComponent.this.f215510e) != null) {
                    chatFooter.mo100348E0(false, revokeMsgEvent.f78943d.f78944a);
                }
                return false;
            }
        };
        this.f215524v = new FootComponent$$e(this);
        this.f215525w = false;
        this.f215526x = 0;
    }

    /* renamed from: a6 */
    public static void m86518a6() {
        Class cls = C32735h.class;
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config1, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config2, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config3, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config4, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config5, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config6, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config7, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config8, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config9, ""));
        m86519c6(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_app_panel_dynamic_config10, ""));
    }

    /* renamed from: c6 */
    public static void m86519c6(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("wxapp");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                    C72791h.C44607a aVar = new C72791h.C44607a();
                    aVar.f120961y1 = jSONObject.optString("enter_id");
                    aVar.f120962z1 = jSONObject.optInt("red_dot");
                    aVar.f120942A1 = jSONObject.optInt("jump_type");
                    aVar.f120943B1 = jSONObject.optString("wa_un");
                    aVar.f120945D1 = jSONObject.optInt("wa_ver");
                    aVar.f120946E1 = jSONObject.optString("wa_path");
                    aVar.f120947F1 = jSONObject.optString("wa_dgmode");
                    aVar.f120948G1 = jSONObject.optString("h5_url");
                    aVar.f120953L1 = jSONObject.optString("icon_url");
                    aVar.f120954M1 = jSONObject.optString("icon_url_dark");
                    if (Util.isNullOrNil(aVar.f120953L1)) {
                        Log.m105920e("MicroMsg.ChattingUI.FootComponent", "unCertainEnter.iconUrl is null");
                    } else {
                        aVar.f120957P1 = jSONObject.optLong("busi_type");
                        JSONObject optJSONObject = jSONObject.optJSONObject(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("desc");
                        if (optJSONObject == null) {
                            Log.m105920e("MicroMsg.ChattingUI.FootComponent", "titleJson is null");
                        } else {
                            aVar.f120949H1.f120963a = optJSONObject.optString("zh_cn");
                            if (Util.isNullOrNil(aVar.f120949H1.f120963a)) {
                                Log.m105920e("MicroMsg.ChattingUI.FootComponent", "unCertainEnter.simpleChWord.title is null");
                            } else {
                                aVar.f120951J1.f120963a = Util.isNullOrNil(optJSONObject.optString("zh_tw")) ? aVar.f120949H1.f120963a : optJSONObject.optString("zh_tw");
                                aVar.f120950I1.f120963a = Util.isNullOrNil(optJSONObject.optString("zh_hk")) ? aVar.f120949H1.f120963a : optJSONObject.optString("zh_hk");
                                aVar.f120952K1.f120963a = Util.isNullOrNil(optJSONObject.optString("en")) ? aVar.f120949H1.f120963a : optJSONObject.optString("en");
                                if (optJSONObject2 != null) {
                                    aVar.f120949H1.f120964b = optJSONObject2.optString("zh_cn");
                                    aVar.f120951J1.f120964b = Util.isNullOrNil(optJSONObject2.optString("zh_tw")) ? aVar.f120949H1.f120964b : optJSONObject2.optString("zh_tw");
                                    aVar.f120950I1.f120964b = Util.isNullOrNil(optJSONObject2.optString("zh_hk")) ? aVar.f120949H1.f120964b : optJSONObject2.optString("zh_hk");
                                    aVar.f120952K1.f120964b = Util.isNullOrNil(optJSONObject2.optString("en")) ? aVar.f120949H1.f120964b : optJSONObject2.optString("en");
                                }
                                f215508y.add(aVar);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ChattingUI.FootComponent", "handleAppPanelUnCertainEnterConfig() Exception:%s", e.getMessage());
            }
        }
    }

    /* renamed from: B2 */
    public boolean mo102177B2(C72996z1 z1Var) {
        List<C47996o> list;
        Class cls = C39479c.class;
        Class cls2 = C79384u0.class;
        Class cls3 = C79348e.class;
        Class cls4 = C45700h.class;
        boolean Y = ((C79384u0) this.f215752d.f193278b.mo102812a(cls2)).mo102509Y();
        boolean x2 = ((C79384u0) this.f215752d.f193278b.mo102812a(cls2)).mo102513x2();
        boolean p2 = ((C79369m) this.f215752d.f193278b.mo102812a(C79369m.class)).mo102685p2();
        boolean Z1 = ((C79383u) this.f215752d.f193278b.mo102812a(C79383u.class)).mo102647Z1();
        boolean q2 = ((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2();
        if (this.f215520r) {
            return true;
        }
        if (Y || x2 || p2 || Z1 || q2) {
            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "" + Y + ", " + x2 + ", " + p2 + ", " + Z1 + ", " + q2);
            mo102185Z5();
            return false;
        } else if (z1Var != null && C45628s0.m50741F(z1Var.getUsername())) {
            new C6800u0(this.f215512g).mo7788a();
            mo102192h6();
            return true;
        } else if (z1Var == null || !C72996z1.m85820U5(z1Var.getUsername()) || (!((C39479c) C86709a0.m107533q(cls)).mo62086r1(z1Var.getUsername()) && !((C39479c) C86709a0.m107533q(cls)).mo62082Ct(z1Var.getUsername()) && (!C45612m0.m50675B(z1Var.getUsername()) || this.f215521s))) {
            if (z1Var != null && z1Var.mo62916m3()) {
                C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(cls3);
                if (eVar.getBizInfo() != null) {
                    C52558c.C52560b r2 = eVar.getBizInfo().mo73500r2(false);
                    if (r2 != null) {
                        JSONObject jSONObject = r2.f146795a;
                        if (jSONObject != null) {
                            r2.f146796b = "1".equals(jSONObject.optString("IsHideInputToolbarInMsg"));
                        }
                        if (r2.f146796b) {
                            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "bizinfo name=" + z1Var.getUsername() + " is hide tool bar");
                            mo102185Z5();
                            return false;
                        }
                    }
                    if (!Util.isNullOrNil(z1Var.getUsername()) && r2 != null) {
                        int intExtra = this.f215752d.f193286j.getIntExtra("key_temp_session_show_type", 0);
                        JSONObject jSONObject2 = r2.f146795a;
                        if (jSONObject2 != null) {
                            r2.f146815u = jSONObject2.optInt("InteractiveMode");
                        }
                        if (r2.f146815u != 2) {
                            mo102181L2();
                            Object[] objArr = new Object[3];
                            objArr[0] = z1Var.getUsername();
                            objArr[1] = Boolean.TRUE;
                            JSONObject jSONObject3 = r2.f146795a;
                            if (jSONObject3 != null) {
                                r2.f146815u = jSONObject3.optInt("InteractiveMode");
                            }
                            objArr[2] = Integer.valueOf(r2.f146815u);
                            Log.m105921e("MicroMsg.ChattingUI.FootComponent", "bizinfo name=%s, %b, %d", objArr);
                        } else {
                            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "bizinfo name=" + z1Var.getUsername() + " is show custom menu");
                            if (this.f215512g == null) {
                                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.h_f);
                                ChatFooterCustom chatFooterCustom = (ChatFooterCustom) this.f215752d.mo91562c(C0966R.C0970id.h_h);
                                this.f215512g = chatFooterCustom;
                                if (chatFooterCustom != null) {
                                    chatFooterCustom.mo102051g((ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49));
                                }
                            }
                            C52558c.C52560b.C52563c c = r2.mo73510c();
                            try {
                                for (C47996o next : c.f146826b) {
                                    if (!Util.isNullOrNil(next.f128726f)) {
                                        ((C45700h) C86709a0.m107533q(cls4)).mo71036ed(next.f128726f, -1, "", Util.nullAs(next.f128723c, ""), "", "", 4);
                                    }
                                    if (!Util.isNullOrNil(next.f128725e)) {
                                        ((C45700h) C86709a0.m107533q(cls4)).mo71036ed(next.f128725e, -1, "", Util.nullAs(next.f128723c, ""), "", "", 4);
                                    }
                                    for (C47996o next2 : next.f128727g) {
                                        if (!Util.isNullOrNil(next2.f128726f)) {
                                            ((C45700h) C86709a0.m107533q(cls4)).mo71036ed(next2.f128726f, -1, "", Util.nullAs(next2.f128723c, ""), "", "", 4);
                                        }
                                        if (!Util.isNullOrNil(next2.f128725e)) {
                                            ((C45700h) C86709a0.m107533q(cls4)).mo71036ed(next2.f128725e, -1, "", Util.nullAs(next2.f128723c, ""), "", "", 4);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.ChattingUI.FootComponent", e, "preauth when chat foot", new Object[0]);
                            }
                            if (c == null || c.f146825a != 1) {
                                this.f215510e.setSwitchButtonMode(0);
                                try {
                                    if (C72996z1.m85795C5(z1Var.getUsername())) {
                                        new C6779f3(this.f215512g).mo7774a();
                                        mo102192h6();
                                    } else {
                                        ChatFooterCustom chatFooterCustom2 = this.f215512g;
                                        LinearLayout linearLayout = chatFooterCustom2.f215249g;
                                        if (!(linearLayout == null || chatFooterCustom2.f215248f == null)) {
                                            linearLayout.setVisibility(0);
                                            chatFooterCustom2.f215248f.setVisibility(0);
                                        }
                                        C73832q0 q0Var = chatFooterCustom2.f215250h;
                                        if (q0Var != null) {
                                            q0Var.mo102866a();
                                        }
                                        this.f215512g.setTalker(this.f215752d.mo91574o());
                                        this.f215512g.mo102057k(this.f215752d.f193286j, eVar.getBizInfo(), z1Var.getUsername());
                                        this.f215512g.setOnFooterSwitchListener(this.f215524v);
                                        this.f215512g.setOnProcessClickListener(((C79348e) this.f215752d.f193278b.mo102812a(cls3)).mo70051K4());
                                        this.f215510e.setOnFooterSwitchListener(this.f215524v);
                                        if (!((C79361h0) this.f215752d.f193278b.mo102812a(C79361h0.class)).mo102468o1() || intExtra != 1) {
                                            if (((C79363i) this.f215752d.f193278b.mo102812a(C79363i.class)).mo102362t0()) {
                                                mo102181L2();
                                            } else {
                                                mo102192h6();
                                            }
                                        } else {
                                            mo102181L2();
                                        }
                                    }
                                } catch (Exception e2) {
                                    if (c == null || (list = c.f146826b) == null || list.size() == 0) {
                                        mo102181L2();
                                    } else {
                                        ((FootComponent$$e) this.f215524v).mo70088a(true);
                                    }
                                    Log.printErrStackTrace("MicroMsg.ChattingUI.FootComponent", e2, "", new Object[0]);
                                }
                            } else {
                                this.f215510e.setSwitchButtonMode(1);
                                this.f215510e.setOnFooterSwitchListener(((C79348e) this.f215752d.f193278b.mo102812a(cls3)).mo70062c1());
                                mo102181L2();
                            }
                        }
                    }
                }
            }
            return true;
        } else {
            if (this.f215512g == null) {
                mo102185Z5();
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.h_f);
                ChatFooterCustom chatFooterCustom3 = (ChatFooterCustom) this.f215752d.mo91562c(C0966R.C0970id.h_h);
                this.f215512g = chatFooterCustom3;
                chatFooterCustom3.mo102051g((ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49));
            }
            new C6793s0(this.f215512g, z1Var.getUsername()).mo7781a();
            mo102192h6();
            return false;
        }
    }

    /* renamed from: C */
    public void mo102178C() {
        this.f215515j = new AnimationSet(false);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f215515j.setInterpolator(new DecelerateInterpolator(1.5f));
        this.f215515j.addAnimation(translateAnimation);
        this.f215515j.addAnimation(alphaAnimation);
        this.f215515j.setDuration(300);
        this.f215515j.setFillBefore(true);
        ChatFooter chatFooter = this.f215510e;
        if (chatFooter != null) {
            chatFooter.startAnimation(this.f215515j);
        }
    }

    /* renamed from: E1 */
    public ChatFooterCustom mo102179E1() {
        return this.f215512g;
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        ImageButton imageButton;
        C73843s2 s2Var;
        Class cls = C39479c.class;
        Class cls2 = C79384u0.class;
        this.f215516n = this.f215752d.f193286j.getStringExtra("smiley_product_id");
        if (this.f215510e.f211917p1) {
            ((C79388w0) this.f215752d.f193278b.mo102812a(C79388w0.class)).mo102671Q();
        }
        if (C72996z1.m85849t5(this.f215752d.mo91577r()) && (s2Var = this.f215514i) != null && s2Var.f216696k) {
            s2Var.mo102880b();
        }
        ChatFooter chatFooter = this.f215510e;
        BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
        chatFooter.f211816T1 = baseChattingUIFragment;
        chatFooter.mo100499v0(baseChattingUIFragment.getContext(), baseChattingUIFragment.thisActivity());
        C76901s0 s0Var = chatFooter.f211746C2;
        if (s0Var != null && s0Var.isShowing()) {
            chatFooter.f211746C2.dismiss();
        }
        chatFooter.f211888j.mo104239a(((C96603l) C86312j.m106911c(C96603l.class)).Kr0());
        int h = C76577a.m92157h(chatFooter.getContext(), C0966R.dimen.f3656af);
        int keyBordHeightPx = KeyBoardUtil.getKeyBordHeightPx(chatFooter.getContext());
        int measuredHeight = chatFooter.getChattingContext().mo100531a().mo91562c(C0966R.C0970id.b8f).getMeasuredHeight();
        int h2 = ((measuredHeight - keyBordHeightPx) / 2) - (C76577a.m92157h(chatFooter.getContext(), C0966R.dimen.f3766df) * 2);
        int i = (h2 <= h || h2 >= measuredHeight) ? h : h2;
        Log.m105925i("MicroMsg.ChatFooter", "updateEdtMaxHeight() called defaultMaxHeight:%s keyboardHeight:%s contentHeight:%s preferMaxHeight:%s finalMaxHeight:%s", Integer.valueOf(h), Integer.valueOf(keyBordHeightPx), Integer.valueOf(measuredHeight), Integer.valueOf(h2), Integer.valueOf(i));
        if (chatFooter.f211962y.getMaxHeight() != i) {
            chatFooter.f211962y.setMaxHeight(i);
            chatFooter.mo100397e1();
        }
        if (!Util.isNullOrNil(this.f215516n) && this.f215510e != null) {
            Log.m105919d("MicroMsg.ChattingUI.FootComponent", "deal use smiley panel in product: %s", this.f215516n);
            this.f215510e.setDefaultSmileyByDetail(this.f215516n);
            this.f215510e.mo100373R0();
        }
        this.f215752d.f193286j.getContext().getIntent().putExtra("smiley_product_id", "");
        this.f215510e.setUserName(this.f215752d.mo91577r());
        ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85154NZ(this.f215752d.mo91577r());
        this.f215510e.mo100360K0(this.f215752d.mo91573n(), this.f215752d.mo91577r());
        if (this.f215752d.f193286j.getBooleanExtra("key_show_bottom_app_panel", false).booleanValue() && (imageButton = this.f215510e.f211946v) != null) {
            imageButton.performClick();
            Log.m105918d("MicroMsg.ChatFooter", "perform click attach bt to show bottom panel");
        }
        if (mo102177B2(this.f215752d.mo91574o())) {
            ChatFooter chatFooter2 = this.f215510e;
            if (chatFooter2 != null) {
                boolean chatEnableEnterButtonSend = chatFooter2.getChatEnableEnterButtonSend();
                Log.m105919d("MicroMsg.ChattingUI.FootComponent", "jacks refresh Footer Plugin Setting , Enable Enter Button: %B", Boolean.valueOf(chatEnableEnterButtonSend));
                this.f215510e.mo100390a1();
                if (chatEnableEnterButtonSend) {
                    this.f215510e.mo100387Z();
                    this.f215510e.mo100389a0();
                }
                if (chatEnableEnterButtonSend) {
                    this.f215510e.mo100349F();
                }
                AppPanel appPanel = this.f215510e.f211878h;
                if (appPanel != null) {
                    appPanel.mo100333v();
                }
            }
            ((C79338a1) this.f215752d.f193278b.mo102812a(C79338a1.class)).mo102487N3();
            ChatFooter chatFooter3 = this.f215510e;
            if (chatFooter3 != null) {
                chatFooter3.f211878h.mo100321s();
                mo102184Y5();
                Log.m105924i("MicroMsg.ChattingUI.FootComponent", "addTextChangedListener by onResume");
            }
        }
        boolean Y = ((C79384u0) this.f215752d.f193278b.mo102812a(cls2)).mo102509Y();
        boolean x2 = ((C79384u0) this.f215752d.f193278b.mo102812a(cls2)).mo102513x2();
        boolean p2 = ((C79369m) this.f215752d.f193278b.mo102812a(C79369m.class)).mo102685p2();
        boolean G = C45628s0.m50742G(this.f215752d.mo91577r());
        boolean q2 = ((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2();
        if (((Y || x2 || p2) && !this.f215520r) || this.f215752d.mo91574o() == null || this.f215752d.mo91574o().mo62916m3() || C72996z1.m85855z5(this.f215752d.mo91577r()) || C75026b.f220750a || C45628s0.m50741F(this.f215752d.mo91577r()) || ((C72996z1.m85820U5(this.f215752d.mo91577r()) && (((C39479c) C86709a0.m107533q(cls)).mo62086r1(this.f215752d.mo91577r()) || ((C39479c) C86709a0.m107533q(cls)).mo62082Ct(this.f215752d.mo91577r()) || C45612m0.m50675B(this.f215752d.mo91577r()))) || G || q2)) {
            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "no call visibleFooter again.");
        } else {
            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "call visibleFooter again.");
            mo102181L2();
        }
        this.f215523u.alive();
        this.f215522t.alive();
    }

    /* renamed from: G3 */
    public void mo102180G3() {
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "triggerFooter, originChatFooterVisibility:%s", Integer.valueOf(this.f215517o));
        if (this.f215510e == null) {
            ChatFooter chatFooter = (ChatFooter) this.f215752d.mo91562c(C0966R.C0970id.h_g);
            this.f215510e = chatFooter;
            chatFooter.mo100495t(new FootComponent$$f(this));
            ((C79385v) this.f215752d.f193278b.mo102812a(C79385v.class)).mo102664g3(this.f215510e);
            mo102188e6();
            mo102189f6();
        }
        boolean p2 = ((C79369m) this.f215752d.f193278b.mo102812a(C79369m.class)).mo102685p2();
        boolean q2 = ((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2();
        if (p2 || q2 || C75026b.f220750a) {
            if (!this.f215519q) {
                this.f215517o = this.f215510e.getVisibility();
            }
            this.f215510e.mo100339A(0, true);
            ChatFooterCustom chatFooterCustom = this.f215512g;
            if (chatFooterCustom == null) {
                this.f215518p = -1;
            } else if (!this.f215519q) {
                this.f215518p = chatFooterCustom.getVisibility();
            }
            mo102185Z5();
            this.f215519q = true;
            return;
        }
        this.f215519q = false;
        int i = this.f215517o;
        if (i == 8 && this.f215518p == 8) {
            mo102185Z5();
        } else if (i == 0) {
            mo102181L2();
        } else {
            mo102192h6();
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        ChatFooter chatFooter = this.f215510e;
        if (chatFooter != null) {
            ChatFooter$$p1 chatFooter$$p1 = chatFooter.f211737A3;
            if (chatFooter$$p1 != null) {
                chatFooter.f211888j.removeTextChangedListener(chatFooter$$p1);
                chatFooter.f211737A3 = null;
            }
            Log.m105924i("MicroMsg.ChattingUI.FootComponent", "removeTextChangeListener");
            this.f215510e.mo100497u0();
            this.f215523u.dead();
            this.f215522t.dead();
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.ChattingUI.FootComponent", "account not ready");
                return;
            }
            C97625j3.m125812b().mo105906u().mo119676J(18, Integer.valueOf(this.f215510e.getMode()));
            Log.m105919d("MicroMsg.ChattingUI.FootComponent", "dkcm old:%d footer:%d ", Integer.valueOf(this.f215513h), Integer.valueOf(this.f215510e.getMode()));
            if (this.f215513h != this.f215510e.getMode()) {
                this.f215513h = this.f215510e.getMode();
                C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215752d.mo91577r());
                if (j != null && this.f215752d.mo91577r().equals(j.getUsername())) {
                    j.mo108791L2(this.f215513h);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(j, this.f215752d.mo91577r());
                }
            }
            this.f215510e.mo100344C0(ChatFooter$$o1.Pause);
            ChatFooterCustom chatFooterCustom = this.f215512g;
            if (chatFooterCustom != null) {
                chatFooterCustom.mo102060n();
            }
        }
    }

    /* renamed from: L2 */
    public void mo102181L2() {
        ChatFooter chatFooter = this.f215510e;
        if (chatFooter != null) {
            chatFooter.setVisibility(0);
            ChatFooterCustom chatFooterCustom = this.f215512g;
            if (chatFooterCustom != null) {
                chatFooterCustom.setVisibility(8);
            }
        }
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        ChatFooterCustom chatFooterCustom;
        if (1111 == i && -1 == i2) {
            this.f215510e.mo100373R0();
        }
        if (i2 == -1) {
            if (!(i == 217 || (chatFooterCustom = this.f215512g) == null)) {
                chatFooterCustom.mo102050f(i, intent);
            }
            if (i == 202) {
                if (intent == null) {
                    Log.m105920e("MicroMsg.ChattingUI.FootComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
                    return;
                }
                int intExtra = intent.getIntExtra("Chat_Mode", 1);
                ChatFooter chatFooter = this.f215510e;
                if (chatFooter != null) {
                    chatFooter.setMode(intExtra);
                }
            }
        } else if (i == 200 || i == 201 || i == 203) {
            this.f215510e.clearFocus();
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        View childAt;
        this.f215525w = false;
        this.f215526x = 0;
        C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215752d.mo91577r());
        if (j != null) {
            this.f215513h = j.mo108820n2();
        }
        Log.m105919d("MicroMsg.ChattingUI.FootComponent", "dkcm init old:%d   ", Integer.valueOf(this.f215513h));
        String r = this.f215752d.mo91577r();
        Class cls = C39479c.class;
        Class cls2 = C79384u0.class;
        if (this.f215510e == null) {
            ChatFooter chatFooter = (ChatFooter) this.f215752d.mo91562c(C0966R.C0970id.h_g);
            this.f215510e = chatFooter;
            chatFooter.mo100495t(new C73473f2(this));
            ((C79385v) this.f215752d.f193278b.mo102812a(C79385v.class)).mo102664g3(this.f215510e);
            mo102188e6();
            mo102189f6();
        }
        this.f215510e.setCattingRootLayoutId(C0966R.C0970id.f357668b43);
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "resetFooter customFooter is %s", this.f215512g);
        ChatFooterCustom chatFooterCustom = this.f215512g;
        if (chatFooterCustom != null) {
            chatFooterCustom.f215264y.clear();
            ChatFooterCustom.GetLocationListener getLocationListener = chatFooterCustom.f215260u;
            if (getLocationListener != null) {
                getLocationListener.dead();
            }
            ChatFooterCustom.GetScanCodeListener getScanCodeListener = chatFooterCustom.f215261v;
            if (getScanCodeListener != null) {
                getScanCodeListener.dead();
            }
            chatFooterCustom.mo102060n();
            ChatFooterCustom chatFooterCustom2 = this.f215512g;
            if (chatFooterCustom2.f215246d == null) {
                chatFooterCustom2.f215246d = (LinearLayout) chatFooterCustom2.findViewById(C0966R.C0970id.b57);
            }
            LinearLayout linearLayout = chatFooterCustom2.f215246d;
            if (!(linearLayout == null || linearLayout.getChildCount() <= 0 || (childAt = chatFooterCustom2.f215246d.getChildAt(0)) == null)) {
                childAt.setBackgroundDrawable(childAt.getContext().getResources().getDrawable(C0966R.C0969drawable.f4855pa));
                View findViewById = childAt.findViewById(C0966R.C0970id.b59);
                if (findViewById instanceof TextView) {
                    TextView textView = (TextView) findViewById;
                    textView.setTextColor(childAt.getContext().getResources().getColor(C0966R.color.FG_0));
                    textView.setTextSize(0, childAt.getContext().getResources().getDimension(C0966R.dimen.f3927j7));
                }
            }
            this.f215512g.setOnFooterSwitchListener((ChatFooter$$n1) null);
            this.f215512g.setOnProcessClickListener((BizComponent.C44804m) null);
            this.f215510e.setOnFooterSwitchListener((ChatFooter$$n1) null);
            C73832q0 q0Var = this.f215512g.f215250h;
            if (q0Var != null) {
                q0Var.mo102866a();
            }
        }
        mo102185Z5();
        WeImageButton weImageButton = this.f215510e.f211921q;
        if (weImageButton != null) {
            weImageButton.setVisibility(0);
        }
        boolean Y = ((C79384u0) this.f215752d.f193278b.mo102812a(cls2)).mo102509Y();
        boolean x2 = ((C79384u0) this.f215752d.f193278b.mo102812a(cls2)).mo102513x2();
        boolean q2 = ((C79376p0) this.f215752d.f193278b.mo102812a(C79376p0.class)).mo102698q2();
        if (!this.f215520r && (Y || x2 || q2)) {
            mo102185Z5();
        } else if (C72996z1.m85849t5(r)) {
            mo102185Z5();
            C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.h_f);
            boolean z = this.f215512g == null;
            ChatFooterCustom chatFooterCustom3 = (ChatFooterCustom) this.f215752d.mo91562c(C0966R.C0970id.h_h);
            this.f215512g = chatFooterCustom3;
            if (z) {
                chatFooterCustom3.mo102051g((ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49));
            }
            C73843s2 s2Var = new C73843s2(this.f215512g);
            this.f215514i = s2Var;
            Class cls3 = C10485b.class;
            boolean z2 = ChannelUtil.channelId == 1;
            View findViewById2 = s2Var.f216688c.findViewById(C0966R.C0970id.b5b);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            s2Var.f216689d = (LinearLayout) s2Var.f216688c.findViewById(C0966R.C0970id.b57);
            View findViewById3 = s2Var.f216688c.findViewById(C0966R.C0970id.b56);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById3;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            s2Var.f216689d.setWeightSum(z2 ? 1.0f : 2.0f);
            FrameLayout frameLayout = (FrameLayout) s2Var.f216689d.getChildAt(0);
            s2Var.f216690e = frameLayout;
            frameLayout.setVisibility(0);
            s2Var.f216690e.setOnClickListener(s2Var.f216703r);
            ((TextView) s2Var.f216690e.findViewById(C0966R.C0970id.b59)).setText(C0966R.string.b5b);
            View findViewById4 = s2Var.f216690e.findViewById(C0966R.C0970id.b58);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view3 = findViewById4;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z2) {
                for (int i = 1; i < 6; i++) {
                    View childAt2 = s2Var.f216689d.getChildAt(i);
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view4 = childAt2;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                FrameLayout frameLayout2 = (FrameLayout) s2Var.f216689d.getChildAt(1);
                s2Var.f216691f = frameLayout2;
                frameLayout2.setVisibility(0);
                s2Var.f216691f.setOnClickListener(s2Var.f216704s);
                s2Var.f216692g = (TextView) s2Var.f216691f.findViewById(C0966R.C0970id.b59);
                ImageView imageView = (ImageView) s2Var.f216691f.findViewById(C0966R.C0970id.b58);
                s2Var.f216693h = imageView;
                imageView.setVisibility(0);
                if (s2Var.f216694i == C73843s2.C73845d.INSTALLED) {
                    s2Var.f216693h.setImageResource(C0966R.raw.promo_icon_qqmail);
                } else {
                    s2Var.f216693h.setImageResource(C0966R.raw.promo_icon_qqmail_uninstall);
                }
                int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_QQMAIL_UNREAD_COUNT_INT, -1)).intValue();
                s2Var.f216695j = intValue;
                if (intValue >= 0) {
                    s2Var.mo102881c();
                } else {
                    s2Var.f216692g.setText(C0966R.string.b5q);
                }
                for (int i2 = 2; i2 < 6; i2++) {
                    View childAt3 = s2Var.f216689d.getChildAt(i2);
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(8);
                    View view5 = childAt3;
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/ChattingQQMailFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                String a = ((C10485b) C86709a0.m107533q(cls3)).g50().mo72508a(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
                s2Var.f216702q = a;
                if (Util.isNullOrNil(a)) {
                    s2Var.f216702q = "qqmail://folderlist?app=weixin&action=list&uin=$uin$";
                }
                s2Var.f216702q = s2Var.f216702q.replace("$uin$", new C77710q(Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(9, (Object) null))).toString());
                s2Var.f216697l = ((C10485b) C86709a0.m107533q(cls3)).g50().mo72508a(1, "MailApp", "MailAppRedirectUrAndroid");
                s2Var.f216696k = true;
            }
            mo102192h6();
        } else {
            this.f215514i = null;
            if (C72996z1.m85795C5(r)) {
                mo102185Z5();
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.h_f);
                boolean z3 = this.f215512g == null;
                ChatFooterCustom chatFooterCustom4 = (ChatFooterCustom) this.f215752d.mo91562c(C0966R.C0970id.h_h);
                this.f215512g = chatFooterCustom4;
                if (z3) {
                    chatFooterCustom4.mo102051g((ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49));
                }
                new C6779f3(this.f215512g).mo7774a();
                mo102192h6();
            } else if (C72996z1.m85820U5(r) && (((C39479c) C86709a0.m107533q(cls)).mo62086r1(r) || ((C39479c) C86709a0.m107533q(cls)).mo62082Ct(r) || (C45612m0.m50675B(r) && !this.f215521s))) {
                mo102185Z5();
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.h_f);
                boolean z4 = this.f215512g == null;
                ChatFooterCustom chatFooterCustom5 = (ChatFooterCustom) this.f215752d.mo91562c(C0966R.C0970id.h_h);
                this.f215512g = chatFooterCustom5;
                if (z4) {
                    chatFooterCustom5.mo102051g((ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49));
                }
                new C6793s0(this.f215512g, r).mo7781a();
                mo102192h6();
            } else if (C45628s0.m50741F(r)) {
                mo102185Z5();
                C73521l0.m86927d(this.f215752d.f193286j, C0966R.C0970id.h_f);
                boolean z5 = this.f215512g == null;
                ChatFooterCustom chatFooterCustom6 = (ChatFooterCustom) this.f215752d.mo91562c(C0966R.C0970id.h_h);
                this.f215512g = chatFooterCustom6;
                if (z5) {
                    chatFooterCustom6.mo102051g((ViewGroup) this.f215752d.mo91562c(C0966R.C0970id.b49));
                }
                new C6800u0(this.f215512g).mo7788a();
                mo102192h6();
            } else if (C72996z1.m85830a5(r) || C72996z1.m85795C5(r) || C72996z1.m85849t5(r) || C45628s0.m50741F(r) || C72996z1.m85840k5(r) || C45628s0.m50742G(r) || C72996z1.m85806K4(r) || (C72996z1.m85820U5(r) && ((C39479c) C86709a0.m107533q(cls)).mo62086r1(r))) {
                mo102185Z5();
            } else {
                mo102181L2();
                mo102177B2(this.f215752d.mo91574o());
                this.f215510e.setUserName(r);
                this.f215510e.mo100360K0(this.f215752d.mo91573n(), this.f215752d.mo91577r());
                mo102187d6(r);
                C79369m mVar = (C79369m) this.f215752d.f193278b.mo102812a(C79369m.class);
                C79384u0 u0Var = (C79384u0) this.f215752d.f193278b.mo102812a(cls2);
                if (mVar.mo102685p2()) {
                    if (u0Var.mo102511k0()) {
                        u0Var.mo102503H2();
                        mVar.mo102684o3();
                    } else {
                        mVar.mo102686y3();
                    }
                }
            }
        }
        mo102190g6();
        C67391b bVar = this.f215752d;
        C73852u1 u1Var = new C73852u1(bVar, this.f215510e, bVar.mo91577r());
        this.f215511f = u1Var;
        u1Var.f216740i = this.f215752d.f193286j.getBooleanExtra("key_need_send_video", true).booleanValue();
        this.f215510e.setFooterEventListener(this.f215511f);
        C67391b bVar2 = this.f215752d;
        C73681e3 e3Var = new C73681e3(bVar2, bVar2.mo91574o(), this.f215752d.mo91577r());
        this.f215510e.setSmileyPanelCallback(e3Var);
        this.f215510e.setSmileyPanelCallback2(e3Var);
        mo102197v4();
        this.f215510e.mo100389a0();
        int intExtra = this.f215752d.f193286j.getIntExtra("key_temp_session_show_type", 0);
        C79361h0 h0Var = (C79361h0) this.f215752d.f193278b.mo102812a(C79361h0.class);
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "isTempSession : %s, showType : %d.", Boolean.valueOf(h0Var.mo102468o1()), Integer.valueOf(intExtra));
        Log.m105919d("MicroMsg.ChattingUI.FootComponent", "is temp session : %s.", Boolean.valueOf(h0Var.mo102468o1()));
        if (h0Var.mo102468o1()) {
            if (intExtra == 1) {
                ((FootComponent$$e) this.f215524v).mo70088a(true);
            } else {
                ((FootComponent$$e) this.f215524v).mo70088a(false);
            }
        }
        mo102177B2(this.f215752d.mo91574o());
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().add(this);
    }

    /* renamed from: S4 */
    public boolean mo102182S4(C72963f4 f4Var) {
        ChatFooter chatFooter = this.f215510e;
        if (chatFooter == null) {
            return true;
        }
        chatFooter.mo100343C(f4Var);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r9 == false) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0139 A[RETURN] */
    /* renamed from: U5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo70055U5(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r1 = r10.getKeyCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r10.getAction()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.ChattingUI.FootComponent"
            java.lang.String r4 = "chatting onKeyDown, code:%d action:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            int r0 = r10.getKeyCode()
            java.lang.String r4 = "onKeyDown back key fragment not foreground"
            r5 = 4
            if (r0 != r5) goto L_0x0118
            ck3.b r0 = r8.f215752d
            boolean r5 = r0.f193283g
            if (r5 != 0) goto L_0x0034
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            goto L_0x0135
        L_0x0034:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            boolean r0 = r0.isSupportNavigationSwipeBack()
            if (r0 == 0) goto L_0x0052
            ck3.b r0 = r8.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
            com.tencent.mm.ui.widget.SwipeBackLayout r0 = r0.getSwipeBackLayout()
            r0.mo26379a()
            boolean r0 = r0.f56498v
            if (r0 == 0) goto L_0x0052
            java.lang.String r9 = "ashutest::onKeyDown back ScrollToFinishing"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r9)
            goto L_0x0116
        L_0x0052:
            int r0 = r10.getAction()
            if (r0 != 0) goto L_0x0060
            r8.f215525w = r3
            long r4 = java.lang.System.currentTimeMillis()
            r8.f215526x = r4
        L_0x0060:
            int r10 = r10.getAction()
            if (r10 != r3) goto L_0x0116
            java.lang.Object[] r9 = new java.lang.Object[r9]
            boolean r10 = r8.f215525w
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9[r2] = r10
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f215526x
            long r4 = r4 - r6
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r9[r3] = r10
            java.lang.String r10 = "hasBack %B, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r10, r9)
            boolean r9 = r8.f215525w
            if (r9 == 0) goto L_0x0116
            long r9 = java.lang.System.currentTimeMillis()
            long r4 = r8.f215526x
            long r9 = r9 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            goto L_0x0116
        L_0x0095:
            ck3.b r9 = r8.f215752d
            java.lang.Class<zj3.m> r10 = zj3.C79369m.class
            com.tencent.mm.ui.chatting.manager.a r9 = r9.f193278b
            xi.d r9 = r9.mo102812a(r10)
            zj3.m r9 = (zj3.C79369m) r9
            ck3.b r10 = r8.f215752d
            java.lang.Class<zj3.u0> r0 = zj3.C79384u0.class
            com.tencent.mm.ui.chatting.manager.a r10 = r10.f193278b
            xi.d r10 = r10.mo102812a(r0)
            zj3.u0 r10 = (zj3.C79384u0) r10
            boolean r0 = r9.mo102685p2()
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r10.mo102511k0()
            if (r0 == 0) goto L_0x00c0
            r10.mo102503H2()
            r9.mo102684o3()
            goto L_0x00c3
        L_0x00c0:
            r9.mo102686y3()
        L_0x00c3:
            r9 = 1
            goto L_0x00c6
        L_0x00c5:
            r9 = 0
        L_0x00c6:
            if (r9 == 0) goto L_0x00d1
            java.lang.String r9 = "addTextChangedListener by handleBack"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            r8.mo102184Y5()
            goto L_0x0116
        L_0x00d1:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r8.f215510e
            if (r9 == 0) goto L_0x0111
            int r10 = r9.f211884i1
            if (r10 != 0) goto L_0x0101
            boolean r10 = r9.f211864e1
            if (r10 == 0) goto L_0x00de
            goto L_0x0101
        L_0x00de:
            com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout r10 = r9.f211822U2
            if (r10 == 0) goto L_0x00ee
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L_0x00ee
            com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout r9 = r9.f211822U2
            r9.mo98692a()
            goto L_0x010d
        L_0x00ee:
            com.tencent.mm.pluginsdk.ui.chat.z0 r9 = r9.f211745C1
            boolean r10 = r9.mo100696i()
            if (r10 == 0) goto L_0x00fb
            r9.mo100688a()
            r9 = 1
            goto L_0x00fc
        L_0x00fb:
            r9 = 0
        L_0x00fc:
            if (r9 == 0) goto L_0x00ff
            goto L_0x010d
        L_0x00ff:
            r9 = 0
            goto L_0x010e
        L_0x0101:
            boolean r10 = r9.f211864e1
            if (r10 == 0) goto L_0x0109
            r9.mo100430i0()
            goto L_0x010d
        L_0x0109:
            r10 = -1
            r9.mo100341B(r2, r3, r10)
        L_0x010d:
            r9 = 1
        L_0x010e:
            if (r9 == 0) goto L_0x0111
            goto L_0x0116
        L_0x0111:
            ck3.b r9 = r8.f215752d
            r9.mo91563d()
        L_0x0116:
            r9 = 1
            goto L_0x0136
        L_0x0118:
            int r9 = r10.getKeyCode()
            r10 = 67
            if (r9 != r10) goto L_0x012a
            ck3.b r9 = r8.f215752d
            boolean r9 = r9.f193283g
            if (r9 != 0) goto L_0x012a
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            goto L_0x0135
        L_0x012a:
            ck3.b r9 = r8.f215752d
            boolean r9 = r9.f193283g
            if (r9 != 0) goto L_0x0135
            java.lang.String r9 = "onKeyDown fragment not foreground"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
        L_0x0135:
            r9 = 0
        L_0x0136:
            if (r9 != 0) goto L_0x0139
            return r2
        L_0x0139:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.FootComponent.mo70055U5(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: V5 */
    public void mo102183V5(int i, String[] strArr, int[] iArr) {
        int i2 = i;
        int[] iArr2 = iArr;
        int i3 = 0;
        if (iArr2 == null || iArr2.length < 1) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(iArr2 == null ? -1 : iArr2.length);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = strArr;
            objArr[3] = Util.getStack();
            Log.m105929w("MicroMsg.ChattingUI.FootComponent", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            return;
        }
        int i4 = C0966R.string.f361130hi2;
        if (i2 != 25) {
            if (i2 != 145) {
                int i5 = C0966R.string.mxj;
                switch (i2) {
                    case 18:
                        if (iArr2[0] == 0) {
                            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doFooterSightRequest,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                            C73852u1 u1Var = this.f215511f;
                            if (u1Var != null) {
                                if (!this.f215510e.f211878h.f211687A.f212175s.f212183a) {
                                    i3 = 2;
                                }
                                u1Var.mo102895l(i3);
                                return;
                            }
                            return;
                        }
                        if ("android.permission.CAMERA".equals(strArr[0])) {
                            i4 = C0966R.string.hhq;
                        }
                        if (iArr2[0] != 0) {
                            C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(i4), this.f215752d.mo91572m().getString(C0966R.string.hif), this.f215752d.mo91572m().getString(C0966R.string.fyd), this.f215752d.mo91572m().getString(C0966R.string.auj), false, new C30815a2(this), new C73432b2(this));
                            return;
                        }
                        return;
                    case 19:
                    case 21:
                    case 22:
                        if (iArr2[0] != 0) {
                            if ("android.permission.CAMERA".equals(strArr[0])) {
                                i4 = C0966R.string.hhq;
                            }
                            if ("android.permission.CAMERA".equals(strArr[0])) {
                                i5 = C0966R.string.muq;
                            }
                            C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(i4), this.f215752d.mo91572m().getString(i5), this.f215752d.mo91572m().getString(C0966R.string.mzi), this.f215752d.mo91572m().getString(C0966R.string.f8028zq), false, new FootComponent$$a(this), new FootComponent$$b());
                            return;
                        } else if (i2 == 19) {
                            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doVoipMenuVideoSelected,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                            C73852u1 u1Var2 = this.f215511f;
                            if (u1Var2 != null) {
                                u1Var2.mo102897n();
                                return;
                            }
                            return;
                        } else if (i2 == 21) {
                            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doOnVoipRequest,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                            C73852u1 u1Var3 = this.f215511f;
                            if (u1Var3 != null) {
                                u1Var3.mo102893j();
                                return;
                            }
                            return;
                        } else {
                            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doOnEnterMultiTalk,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                            C73852u1 u1Var4 = this.f215511f;
                            if (u1Var4 != null) {
                                u1Var4.mo102891h();
                                return;
                            }
                            return;
                        }
                    case 20:
                        if (iArr2[0] == 0) {
                            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doImageSelectTakePhotoRequest,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                            C73852u1 u1Var5 = this.f215511f;
                            if (u1Var5 != null) {
                                u1Var5.mo102890g();
                                return;
                            }
                            return;
                        }
                        C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.hhq), this.f215752d.mo91572m().getString(C0966R.string.hif), this.f215752d.mo91572m().getString(C0966R.string.fyd), this.f215752d.mo91572m().getString(C0966R.string.auj), false, new C30817c2(this), (DialogInterface.OnClickListener) null);
                        return;
                    default:
                        switch (i2) {
                            case 81:
                                if (iArr2[0] == 0) {
                                    Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doTalkRoomRequest,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                                    C73852u1 u1Var6 = this.f215511f;
                                    if (u1Var6 != null) {
                                        ((C79344c1) u1Var6.f216741j.f193278b.mo102812a(C79344c1.class)).mo102263K(false);
                                        u1Var6.f216732a.setBottomPanelVisibility(8);
                                        return;
                                    }
                                    return;
                                }
                                C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.f361129hi0), this.f215752d.mo91572m().getString(C0966R.string.hif), this.f215752d.mo91572m().getString(C0966R.string.fyd), this.f215752d.mo91572m().getString(C0966R.string.auj), false, new C30818d2(this), (DialogInterface.OnClickListener) null);
                                return;
                            case 82:
                            case 83:
                                if (iArr2[0] != 0) {
                                    C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.f361130hi2), this.f215752d.mo91572m().getString(C0966R.string.mxj), this.f215752d.mo91572m().getString(C0966R.string.mzi), this.f215752d.mo91572m().getString(C0966R.string.f8028zq), false, new FootComponent$$c(this), new FootComponent$$d());
                                    return;
                                } else if (i2 == 82) {
                                    Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doVoipMenuAudioSelected,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                                    C73852u1 u1Var7 = this.f215511f;
                                    if (u1Var7 != null) {
                                        u1Var7.mo102896m();
                                        return;
                                    }
                                    return;
                                } else {
                                    Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doOnVoipAudioRequest,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
                                    C73852u1 u1Var8 = this.f215511f;
                                    if (u1Var8 != null) {
                                        u1Var8.mo102892i();
                                        return;
                                    }
                                    return;
                                }
                            default:
                                return;
                        }
                }
            } else if (iArr2[0] == 0) {
                Log.m105925i("MicroMsg.ChattingUI.FootComponent", "doSendFileRequest, footerEventImpl[%s], stack[%s].", this.f215511f, Util.getStack());
                C73852u1 u1Var9 = this.f215511f;
                if (u1Var9 != null) {
                    u1Var9.mo102894k();
                }
            } else {
                C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.hi9), this.f215752d.mo91572m().getString(C0966R.string.hif), this.f215752d.mo91572m().getString(C0966R.string.fyd), this.f215752d.mo91572m().getString(C0966R.string.f360830f51), false, new C30819e2(this), (DialogInterface.OnClickListener) null);
            }
        } else if (iArr2[0] == 0) {
            Log.m105925i("MicroMsg.ChattingUI.FootComponent", "summerper doFooterLiveRequest,footerEventImpl[%s], stack[%s]", this.f215511f, Util.getStack());
            C73852u1 u1Var10 = this.f215511f;
            if (u1Var10 != null) {
                ((C73852u1.C73861i) u1Var10.f216752u).mo96053m(0, 0);
            }
        } else {
            if ("android.permission.CAMERA".equals(strArr[0])) {
                i4 = C0966R.string.hhq;
            }
            if (iArr2[0] != 0) {
                C76879j.m92709C(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(i4), this.f215752d.mo91572m().getString(C0966R.string.hif), this.f215752d.mo91572m().getString(C0966R.string.fyd), this.f215752d.mo91572m().getString(C0966R.string.auj), false, new C30836y1(this), new C73665z1(this));
            }
        }
    }

    /* renamed from: Y5 */
    public final void mo102184Y5() {
        ChatFooter chatFooter = this.f215510e;
        if (chatFooter != null) {
            if (!(chatFooter.f211737A3 != null)) {
                Log.m105924i("MicroMsg.ChattingUI.FootComponent", "addTextChangedListener");
                ChatFooter chatFooter2 = this.f215510e;
                FootComponent$$k footComponent$$k = new FootComponent$$k(this, (C308081) null);
                chatFooter2.getClass();
                ChatFooter$$p1 chatFooter$$p1 = new ChatFooter$$p1(chatFooter2, footComponent$$k);
                chatFooter2.f211737A3 = chatFooter$$p1;
                chatFooter2.f211888j.addTextChangedListener(chatFooter$$p1);
            }
        }
    }

    /* renamed from: Z5 */
    public void mo102185Z5() {
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "[goneFooter] %s", Util.getStack());
        ChatFooter chatFooter = this.f215510e;
        if (chatFooter != null) {
            chatFooter.mo100339A(0, false);
            this.f215510e.setVisibility(8);
        }
        ChatFooterCustom chatFooterCustom = this.f215512g;
        if (chatFooterCustom != null) {
            chatFooterCustom.setVisibility(8);
        }
        this.f215510e.mo100501w0(false);
        this.f215752d.mo91578s();
    }

    /* renamed from: b6 */
    public final void mo102186b6(String str, C72996z1 z1Var, ArrayList<C72791h.C44607a> arrayList) {
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Long.valueOf(z1Var == null ? 0 : z1Var.f149536f1);
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "ChatroomBusinessType user %s %s", objArr);
        if (!(!this.f215752d.mo91582w() || z1Var == null || z1Var.f149536f1 == 0)) {
            if (f215508y == null) {
                f215508y = new ArrayList<>();
                m86518a6();
                f215509z = C31543z5.m39451a();
            } else {
                long a = C31543z5.m39451a();
                if (a - f215509z > ((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_app_panel_dynamic_update_time, 1800))) {
                    f215509z = a;
                    f215508y.clear();
                    m86518a6();
                }
            }
            ArrayList<C72791h.C44607a> arrayList2 = f215508y;
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<C72791h.C44607a> it = arrayList2.iterator();
                while (it.hasNext()) {
                    C72791h.C44607a next = it.next();
                    if ((next.f120957P1 & z1Var.f149536f1) != 0) {
                        next.f120958Q1 = z1Var.getUsername();
                        arrayList.add(next);
                    }
                }
            }
        }
        this.f215510e.setAppPanelUnCertainEnterArrayList(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018d, code lost:
        if (r14 == 1) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a2, code lost:
        if (f40.C86709a0.m107535s().mo121142i().mo119689j(com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LIVE_ENTRANCE_INT_SYNC, 0) == r9) goto L_0x01a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0814  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x08a7  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x097d  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x099e  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x09be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:342:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0265  */
    /* renamed from: d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102187d6(java.lang.String r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.Class<zz.i> r2 = p287zz.C79445i.class
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            java.lang.Class<zj3.e> r5 = zj3.C79348e.class
            java.lang.Class<he0.j> r6 = he0.C76158j.class
            java.lang.Class<xy1.i> r7 = xy1.C79011i.class
            java.lang.Class<a11.c> r8 = a11.C39479c.class
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r1
            java.lang.String r12 = "MicroMsg.ChattingUI.FootComponent"
            java.lang.String r13 = "initFooterPanelMenu %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            com.tencent.mm.ui.widget.imageview.WeImageButton r10 = r10.f211921q
            if (r10 == 0) goto L_0x0028
            r10.setVisibility(r11)
        L_0x0028:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r10 = r10.f211878h
            if (r10 != 0) goto L_0x002f
            goto L_0x0032
        L_0x002f:
            r10.mo100334w()
        L_0x0032:
            java.lang.Class<zj3.u0> r10 = zj3.C79384u0.class
            ck3.b r13 = r0.f215752d
            java.lang.Class<zj3.m> r14 = zj3.C79369m.class
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r14)
            zj3.m r13 = (zj3.C79369m) r13
            boolean r13 = r13.mo102685p2()
            if (r13 == 0) goto L_0x004c
            java.lang.String r10 = "match shake, in show mode, do not open short video recode view"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r10)
            goto L_0x00a0
        L_0x004c:
            ck3.b r13 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r10)
            zj3.u0 r13 = (zj3.C79384u0) r13
            boolean r13 = r13.mo102509Y()
            ck3.b r14 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r14 = r14.f193278b
            xi.d r10 = r14.mo102812a(r10)
            zj3.u0 r10 = (zj3.C79384u0) r10
            boolean r10 = r10.mo102513x2()
            if (r13 != 0) goto L_0x009b
            if (r10 == 0) goto L_0x006d
            goto L_0x009b
        L_0x006d:
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85848s5(r10)
            if (r10 != 0) goto L_0x0095
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85811N4(r10)
            if (r10 == 0) goto L_0x0086
            goto L_0x0095
        L_0x0086:
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            boolean r10 = eb0.C45628s0.m50812z(r10)
            if (r10 == 0) goto L_0x0093
            goto L_0x00a0
        L_0x0093:
            r10 = 1
            goto L_0x00a1
        L_0x0095:
            java.lang.String r10 = "match shake, but is Qcontact or Bcontact"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r10)
            goto L_0x00a0
        L_0x009b:
            java.lang.String r10 = "match shake, in search mode, do not open short video recode view"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r10)
        L_0x00a0:
            r10 = 0
        L_0x00a1:
            if (r10 != 0) goto L_0x00a8
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100374S()
        L_0x00a8:
            ck3.b r10 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r10 = r10.f193278b
            xi.d r10 = r10.mo102812a(r5)
            zj3.e r10 = (zj3.C79348e) r10
            boolean r10 = r10.mo70071q1()
            if (r10 == 0) goto L_0x00f4
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            ug.c r10 = rb0.C47984k.m53328b(r10)
            if (r10 == 0) goto L_0x00e4
            java.lang.String r13 = r10.field_enterpriseFather
            if (r13 != 0) goto L_0x00c9
            goto L_0x00e4
        L_0x00c9:
            rb0.j r13 = rb0.C48009v0.Fx0()
            java.lang.String r10 = r10.field_enterpriseFather
            android.database.Cursor r10 = r13.mo72762bF(r10)
            if (r10 == 0) goto L_0x00dd
            int r13 = r10.getCount()
            if (r13 <= 0) goto L_0x00dd
            r13 = 1
            goto L_0x00de
        L_0x00dd:
            r13 = 0
        L_0x00de:
            if (r10 == 0) goto L_0x00e5
            r10.close()
            goto L_0x00e5
        L_0x00e4:
            r13 = 0
        L_0x00e5:
            if (r13 == 0) goto L_0x00f4
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r10 = r10.f211878h
            com.tencent.mm.pluginsdk.ui.chat.h r13 = r10.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r13 = r13.f212178v
            r13.f212183a = r9
            r10.mo100316o()
        L_0x00f4:
            ck3.b r10 = r0.f215752d
            boolean r10 = r10.mo91583x()
            if (r10 != 0) goto L_0x0101
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100347E()
        L_0x0101:
            di3.d r10 = di3.C86312j.m106911c(r3)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_chat_room_live_enable
            boolean r10 = r10.mo58784wf(r13, r9)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r13 = r0.f215510e
            r13.getClass()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r14 == 0) goto L_0x0118
            goto L_0x01a4
        L_0x0118:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            java.lang.String r15 = "ChatRoomEnableLive"
            r9 = 524288(0x80000, float:7.34684E-40)
            if (r14 != 0) goto L_0x015b
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r14 == 0) goto L_0x0125
            goto L_0x015b
        L_0x0125:
            java.lang.String r14 = r13.f211858d
            if (r14 == 0) goto L_0x01a6
            k40.a r14 = f40.C86709a0.m107533q(r4)
            lc3.b r14 = (lc3.C10485b) r14
            pj.f r14 = r14.vh0()
            java.lang.String r14 = r14.mo107405c(r15)
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r11)
            if (r14 != 0) goto L_0x0157
            k40.a r14 = f40.C86709a0.m107533q(r8)
            a11.c r14 = (a11.C39479c) r14
            eb0.m2 r14 = r14.mo62084mr()
            java.lang.String r13 = r13.f211858d
            com.tencent.mm.storage.n1 r14 = (com.tencent.p014mm.storage.C44662n1) r14
            com.tencent.mm.storage.m1 r13 = r14.mo69799Lo(r13)
            if (r13 == 0) goto L_0x01a6
            int r13 = r13.field_chatroomStatus
            r13 = r13 & r9
            if (r13 != r9) goto L_0x01a6
            goto L_0x01a4
        L_0x0157:
            r9 = 1
            if (r14 != r9) goto L_0x01a6
            goto L_0x01a4
        L_0x015b:
            k40.a r14 = f40.C86709a0.m107533q(r4)
            lc3.b r14 = (lc3.C10485b) r14
            pj.f r14 = r14.vh0()
            java.lang.String r14 = r14.mo107405c(r15)
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r11)
            if (r14 != 0) goto L_0x018c
            k40.a r14 = f40.C86709a0.m107533q(r8)
            a11.c r14 = (a11.C39479c) r14
            eb0.m2 r14 = r14.mo62084mr()
            java.lang.String r13 = r13.f211858d
            com.tencent.mm.storage.n1 r14 = (com.tencent.p014mm.storage.C44662n1) r14
            com.tencent.mm.storage.m1 r13 = r14.mo69799Lo(r13)
            if (r13 == 0) goto L_0x018a
            int r13 = r13.field_chatroomStatus
            r13 = r13 & r9
            if (r13 != r9) goto L_0x018a
            r9 = 1
            goto L_0x018f
        L_0x018a:
            r9 = 1
            goto L_0x0191
        L_0x018c:
            r9 = 1
            if (r14 != r9) goto L_0x0191
        L_0x018f:
            r13 = 1
            goto L_0x0192
        L_0x0191:
            r13 = 0
        L_0x0192:
            if (r13 != 0) goto L_0x01a7
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LIVE_ENTRANCE_INT_SYNC
            int r13 = r13.mo119689j(r14, r11)
            if (r13 != r9) goto L_0x01a6
        L_0x01a4:
            r13 = 1
            goto L_0x01a7
        L_0x01a6:
            r13 = 0
        L_0x01a7:
            r9 = 2
            java.lang.Object[] r14 = new java.lang.Object[r9]
            ck3.b r15 = r0.f215752d
            boolean r15 = r15.mo91583x()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r11] = r15
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)
            r16 = 1
            r14[r16] = r15
            java.lang.String r15 = "isGroupChat:%b enableLive:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r14)
            ck3.b r14 = r0.f215752d
            boolean r14 = r14.mo91583x()
            if (r14 == 0) goto L_0x01df
            if (r10 == 0) goto L_0x01df
            if (r13 != 0) goto L_0x01d0
            goto L_0x01df
        L_0x01d0:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r10 = r10.f211878h
            com.tencent.mm.pluginsdk.ui.chat.h r13 = r10.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r13 = r13.f212152A
            r14 = 1
            r13.f212183a = r14
            r10.mo100316o()
            goto L_0x01e4
        L_0x01df:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100361L()
        L_0x01e4:
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85807K5(r10)
            if (r10 != 0) goto L_0x01f5
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100361L()
        L_0x01f5:
            ck3.b r10 = r0.f215752d
            com.tencent.mm.storage.z1 r10 = r10.mo91574o()
            if (r10 == 0) goto L_0x021b
            ck3.b r10 = r0.f215752d
            com.tencent.mm.storage.z1 r10 = r10.mo91574o()
            boolean r10 = r10.mo62927s3()
            if (r10 != 0) goto L_0x021b
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            if (r10 != 0) goto L_0x021b
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r13 = 1
            r10.mo100370Q(r13)
        L_0x021b:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85811N4(r21)
            if (r10 == 0) goto L_0x025e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100378U()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r13 = 1
            r10.mo100376T(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100385Y(r13, r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100370Q(r9)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100372R(r9)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100361L()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100359K()
        L_0x025e:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85848s5(r21)
            r13 = 3
            if (r10 == 0) goto L_0x02a2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100378U()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r14 = 1
            r10.mo100376T(r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100385Y(r14, r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100370Q(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100372R(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100361L()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100359K()
        L_0x02a2:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85798E5(r21)
            r14 = 4
            if (r10 == 0) goto L_0x02eb
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100378U()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100381W()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r15 = 1
            r10.mo100376T(r15)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100385Y(r15, r15)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100370Q(r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100372R(r14)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100361L()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            r10.mo100359K()
        L_0x02eb:
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85799F5(r21)
            r15 = 8
            if (r10 == 0) goto L_0x0382
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r10 = r10.f211878h
            if (r10 != 0) goto L_0x02fa
            goto L_0x02fd
        L_0x02fa:
            r10.mo100334w()
        L_0x02fd:
            java.text.SimpleDateFormat r10 = qy2.C77448f0.f225876a
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_text_state_is_conv_use_smiley_panel_and
            bp3.f r13 = bp3.C104160f.RepairerConfig_TextStatus_ConvSmileyPanelSwitch_Int
            int r3 = r3.dl0(r10, r13, r11)
            r10 = 1
            if (r3 != r10) goto L_0x0312
            r3 = 1
            goto L_0x0313
        L_0x0312:
            r3 = 0
        L_0x0313:
            if (r3 != 0) goto L_0x0336
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            com.tencent.mm.ui.widget.imageview.WeImageButton r3 = r3.f211956x
            if (r3 == 0) goto L_0x0323
            r3.setVisibility(r15)
        L_0x0323:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100398f0()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100351G()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r3 = r3.getChatFooterPanel()
            r3.setShowSearch(r11)
        L_0x0336:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100381W()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100347E()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r10 = 1
            r3.mo100385Y(r10, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100357J(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100383X(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r13 = 5
            r3.mo100370Q(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100372R(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100376T(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r13 = r3.f211878h
            r13.f211696J = r10
            r3.mo100359K()
        L_0x0382:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85825X4(r21)
            if (r3 == 0) goto L_0x0401
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r3 = r3.f211878h
            if (r3 != 0) goto L_0x038f
            goto L_0x0392
        L_0x038f:
            r3.mo100334w()
        L_0x0392:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100381W()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100347E()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100374S()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            com.tencent.mm.ui.widget.imageview.WeImageButton r3 = r3.f211956x
            if (r3 == 0) goto L_0x03c3
            r3.setVisibility(r15)
        L_0x03c3:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100398f0()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100351G()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r10 = 1
            r3.mo100385Y(r10, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100357J(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100383X(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r13 = 6
            r3.mo100370Q(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100372R(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100376T(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100359K()
        L_0x0401:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85837h5(r21)
            if (r3 == 0) goto L_0x0440
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r10 = 1
            r3.mo100376T(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100385Y(r10, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r10 = 7
            r3.mo100370Q(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100372R(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100361L()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100359K()
        L_0x0440:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85793A5(r21)
            if (r3 == 0) goto L_0x0465
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r10 = 1
            r3.mo100385Y(r10, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100376T(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100361L()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100359K()
        L_0x0465:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85846q5(r21)
            if (r3 == 0) goto L_0x047a
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100398f0()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r0.f215510e
            r3.mo100351G()
        L_0x047a:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()
            com.tencent.mm.storage.z1 r3 = r3.get(r1)
            if (r3 == 0) goto L_0x0504
            boolean r10 = r3.mo62916m3()
            if (r10 == 0) goto L_0x0504
            ck3.b r10 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r10 = r10.f193278b
            xi.d r5 = r10.mo102812a(r5)
            zj3.e r5 = (zj3.C79348e) r5
            boolean r5 = r5.mo70071q1()
            if (r5 == 0) goto L_0x04ea
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r10 = 1
            r5.mo100376T(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100385Y(r10, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100370Q(r15)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100372R(r15)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100374S()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100351G()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            com.tencent.mm.ui.widget.imageview.WeImageButton r5 = r5.f211956x
            if (r5 == 0) goto L_0x04d5
            r5.setVisibility(r15)
        L_0x04d5:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100398f0()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100361L()
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r5 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent     // Catch:{ all -> 0x04e8 }
            r5.<init>()     // Catch:{ all -> 0x04e8 }
            r5.publish()     // Catch:{ all -> 0x04e8 }
            goto L_0x0504
        L_0x04e8:
            goto L_0x0504
        L_0x04ea:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r10 = 1
            r5.mo100385Y(r10, r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100378U()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100376T(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100361L()
        L_0x0504:
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r21)
            if (r5 != 0) goto L_0x0510
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85847r5(r21)
            if (r5 == 0) goto L_0x0515
        L_0x0510:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r5 = r0.f215510e
            r5.mo100359K()
        L_0x0515:
            ck3.b r5 = r0.f215752d
            boolean r5 = r5.mo91582w()
            if (r5 == 0) goto L_0x053a
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            java.lang.String r5 = "MultitalkBlockCaller"
            int r4 = r4.mo107404b(r5, r11)
            if (r4 != 0) goto L_0x0531
            r4 = 1
            goto L_0x0532
        L_0x0531:
            r4 = 0
        L_0x0532:
            if (r4 == 0) goto L_0x053a
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100357J(r11)
            goto L_0x0540
        L_0x053a:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r5 = 1
            r4.mo100357J(r5)
        L_0x0540:
            ck3.b r4 = r0.f215752d
            boolean r4 = r4.mo91583x()
            if (r4 != 0) goto L_0x0550
            ck3.b r4 = r0.f215752d
            boolean r4 = r4.mo91585z()
            if (r4 == 0) goto L_0x0556
        L_0x0550:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r5 = 1
            r4.mo100385Y(r5, r5)
        L_0x0556:
            ck3.b r4 = r0.f215752d
            java.lang.String r4 = r4.mo91577r()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85807K5(r4)
            ck3.b r5 = r0.f215752d
            boolean r5 = r5.mo91583x()
            r10 = 9
            if (r5 == 0) goto L_0x056c
            if (r4 == 0) goto L_0x0575
        L_0x056c:
            if (r4 == 0) goto L_0x057a
            boolean r4 = eb0.C75592q0.m90794x()
            if (r4 == 0) goto L_0x0575
            goto L_0x057a
        L_0x0575:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100372R(r10)
        L_0x057a:
            ck3.b r4 = r0.f215752d
            boolean r4 = r4.mo91585z()
            if (r4 == 0) goto L_0x0589
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r5 = 1
            r4.mo100376T(r5)
            goto L_0x058a
        L_0x0589:
            r5 = 1
        L_0x058a:
            ck3.b r4 = r0.f215752d
            java.lang.String r4 = r4.mo91577r()
            java.lang.String r13 = eb0.C75592q0.m90789s()
            boolean r4 = r4.equals(r13)
            r13 = 10
            if (r4 == 0) goto L_0x05b5
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100376T(r5)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100385Y(r5, r5)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100370Q(r10)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100372R(r13)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100361L()
        L_0x05b5:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r5 = 0
            r4.setAppPanelTip(r5)
            ck3.b r4 = r0.f215752d
            com.tencent.mm.storage.z1 r4 = r4.mo91574o()
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            r5 = 11
            if (r4 != 0) goto L_0x0633
            ck3.b r4 = r0.f215752d
            com.tencent.mm.storage.z1 r4 = r4.mo91574o()
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85847r5(r4)
            if (r4 != 0) goto L_0x0633
            ck3.b r4 = r0.f215752d
            com.tencent.mm.storage.z1 r4 = r4.mo91574o()
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85846q5(r4)
            if (r4 == 0) goto L_0x05ee
            goto L_0x0633
        L_0x05ee:
            ck3.b r2 = r0.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            java.lang.String r2 = r2.getUsername()
            boolean r2 = eb0.C45628s0.m50735A(r2)
            if (r2 == 0) goto L_0x07f4
            int r2 = eb0.C75592q0.m90774d()
            r4 = r2 & 1
            if (r4 != 0) goto L_0x060c
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r6 = 1
            r4.mo100357J(r6)
        L_0x060c:
            r4 = r2 & 2
            if (r4 != 0) goto L_0x0615
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.f215510e
            r4.mo100370Q(r5)
        L_0x0615:
            r2 = r2 & r14
            if (r2 != 0) goto L_0x061f
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            r4 = 1
            r2.f211696J = r4
        L_0x061f:
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.component.FootComponent$$g r5 = new com.tencent.mm.ui.chatting.component.FootComponent$$g
            r5.<init>(r0, r2)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183875f(r5)
            goto L_0x07f4
        L_0x0633:
            ck3.b r4 = r0.f215752d
            com.tencent.mm.storage.z1 r4 = r4.mo91574o()
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85846q5(r4)
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r18 = f62.C75700k0.class
            k40.a r18 = f40.C86709a0.m107533q(r18)
            f62.k0 r18 = (f62.C75700k0) r18
            com.tencent.mm.storage.u3 r10 = r18.mo96097Ni()
            ck3.b r15 = r0.f215752d
            com.tencent.mm.storage.z1 r15 = r15.mo91574o()
            java.lang.String r15 = r15.getUsername()
            com.tencent.mm.storage.z1 r10 = r10.get(r15)
            di3.d r15 = di3.C86312j.m106911c(r6)
            he0.j r15 = (he0.C76158j) r15
            java.lang.String r5 = r10.mo73980x2()
            java.lang.String r13 = r10.mo73976t2()
            r15.Mg0(r5, r13, r4)
            di3.d r5 = di3.C86312j.m106911c(r6)
            he0.j r5 = (he0.C76158j) r5
            java.lang.String r13 = r10.mo73980x2()
            int r5 = r5.b10(r13, r4)
            di3.d r6 = di3.C86312j.m106911c(r6)
            he0.j r6 = (he0.C76158j) r6
            ck3.b r13 = r0.f215752d
            com.tencent.mm.storage.z1 r13 = r13.mo91574o()
            java.lang.String r13 = r13.mo73980x2()
            he0.j$a r15 = he0.C76158j.C8510a.TYPE_WORDING
            java.lang.String r9 = "openim_function_tip"
            java.lang.String r4 = r6.S10(r13, r9, r15, r4)
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r6[r11] = r9
            ck3.b r9 = r0.f215752d
            com.tencent.mm.storage.z1 r9 = r9.mo91574o()
            java.lang.String r9 = r9.getUsername()
            r13 = 1
            r6[r13] = r9
            java.lang.String r9 = r10.mo73980x2()
            r10 = 2
            r6[r10] = r9
            r9 = 3
            r6[r9] = r4
            java.lang.String r9 = "openim showFlag:%d username: %s appid: %s tip %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r6)
            r6 = r5 & 1
            if (r6 != 0) goto L_0x06c2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100381W()
        L_0x06c2:
            r6 = r5 & 2
            if (r6 != 0) goto L_0x06cb
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100349F()
        L_0x06cb:
            r6 = r5 & 4
            if (r6 != 0) goto L_0x06dc
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r6 = r6.f211878h
            com.tencent.mm.pluginsdk.ui.chat.h r9 = r6.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r9 = r9.f212159c
            r9.f212183a = r11
            r6.mo100316o()
        L_0x06dc:
            r6 = r5 & 8
            if (r6 != 0) goto L_0x06e5
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100378U()
        L_0x06e5:
            r6 = r5 & 16
            if (r6 != 0) goto L_0x06ee
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100368P()
        L_0x06ee:
            r6 = r5 & 32
            if (r6 != 0) goto L_0x06f7
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100366O()
        L_0x06f7:
            r6 = r5 & 64
            if (r6 != 0) goto L_0x0700
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100355I()
        L_0x0700:
            r6 = r5 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x0709
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r0.f215510e
            r6.mo100353H()
        L_0x0709:
            r6 = r5 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0711
            r9 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r9 != 0) goto L_0x0722
        L_0x0711:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r0.f215510e
            if (r6 != 0) goto L_0x0717
            r10 = 1
            goto L_0x0718
        L_0x0717:
            r10 = 0
        L_0x0718:
            r13 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r13 != 0) goto L_0x071e
            r13 = 1
            goto L_0x071f
        L_0x071e:
            r13 = 0
        L_0x071f:
            r9.mo100385Y(r10, r13)
        L_0x0722:
            r9 = r5 & 512(0x200, float:7.175E-43)
            if (r9 != 0) goto L_0x0733
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r0.f215510e
            r10 = 10
            r9.mo100370Q(r10)
            java.lang.String r9 = "openIM disableServiceLuckyMoney"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            goto L_0x0738
        L_0x0733:
            java.lang.String r9 = "openIM enableServiceLuckyMoney"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
        L_0x0738:
            di3.d r9 = di3.C86312j.m106911c(r2)
            zz.i r9 = (p287zz.C79445i) r9
            int r9 = r9.mo109187WD()
            di3.d r2 = di3.C86312j.m106911c(r2)
            zz.i r2 = (p287zz.C79445i) r2
            ck3.b r10 = r0.f215752d
            java.lang.String r10 = r10.mo91577r()
            boolean r2 = r2.mo109185MR(r10)
            r10 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r10 <= 0) goto L_0x0758
            r10 = 1
            goto L_0x0759
        L_0x0758:
            r10 = 0
        L_0x0759:
            bp3.p r13 = bp3.C79758p.f233760a
            bp3.f r15 = bp3.C104160f.RepairerConfig_Pay_UnionTransfer_Int
            int r13 = r13.mo109882e(r15, r11)
            r15 = 1
            if (r13 != r15) goto L_0x0767
            r16 = 1
            goto L_0x0769
        L_0x0767:
            r16 = 0
        L_0x0769:
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r13[r11] = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r13[r15] = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            r19 = 2
            r13[r19] = r14
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r16)
            r17 = 3
            r13[r17] = r14
            java.lang.String r14 = "openIM GrayscaleStatus:%d showTransferEntry:%b showTransferFlag:%b forceByLocal:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r13)
            if (r16 != 0) goto L_0x07bf
            if (r9 != r15) goto L_0x079f
            if (r2 != 0) goto L_0x07bf
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r9 = 11
            r2.mo100372R(r9)
            java.lang.String r2 = "openIM disableServiceRemittance, grey but not show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x07bf
        L_0x079f:
            r13 = 2
            if (r9 != r13) goto L_0x07b3
            if (r2 != 0) goto L_0x07bf
            if (r10 != 0) goto L_0x07bf
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r9 = 12
            r2.mo100372R(r9)
            java.lang.String r2 = "openIM disableServiceRemittance, open but not show, and showFlag is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x07bf
        L_0x07b3:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r9 = 13
            r2.mo100372R(r9)
            java.lang.String r2 = "openIM disableServiceRemittance, close"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
        L_0x07bf:
            r2 = r5 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x07ca
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            r5 = 1
            r2.f211696J = r5
        L_0x07ca:
            ck3.b r2 = r0.f215752d
            com.tencent.mm.storage.z1 r2 = r2.mo91574o()
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85847r5(r2)
            if (r2 == 0) goto L_0x07e2
            if (r6 != 0) goto L_0x07e2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r5 = 1
            r2.mo100357J(r5)
        L_0x07e2:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85846q5(r21)
            if (r2 != 0) goto L_0x07ee
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.setAppPanelTip(r4)
            goto L_0x07f4
        L_0x07ee:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r4 = 0
            r2.setAppPanelTip(r4)
        L_0x07f4:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r2 = r2.f211868f
            if (r2 == 0) goto L_0x07fd
            r2.mo100193f(r11, r11)
        L_0x07fd:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            boolean r4 = nc0.C76850a.m92640l()
            r2.mo100383X(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r4 = 1
            r2.mo100376T(r4)
            ck3.b r2 = r0.f215752d
            boolean r2 = r2.mo91580u()
            if (r2 == 0) goto L_0x08a1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            if (r2 != 0) goto L_0x081b
            goto L_0x081e
        L_0x081b:
            r2.mo100334w()
        L_0x081e:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100381W()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100347E()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100361L()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100378U()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100374S()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.ui.widget.imageview.WeImageButton r2 = r2.f211956x
            if (r2 == 0) goto L_0x0860
            r4 = 8
            r2.setVisibility(r4)
        L_0x0860:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100398f0()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100351G()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r4 = 1
            r2.mo100385Y(r4, r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100357J(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100383X(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r5 = 12
            r2.mo100370Q(r5)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r5 = 16
            r2.mo100372R(r5)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100376T(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100359K()
        L_0x08a1:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85832c5(r21)
            if (r2 == 0) goto L_0x0971
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            if (r2 != 0) goto L_0x08ae
            goto L_0x08b1
        L_0x08ae:
            r2.mo100334w()
        L_0x08b1:
            di3.d r2 = di3.C86312j.m106911c(r7)
            xy1.i r2 = (xy1.C79011i) r2
            boolean r2 = r2.mo71419sa()
            if (r2 != 0) goto L_0x08cd
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r4 = 1
            r2.f211869f1 = r4
            android.widget.ImageButton r4 = r2.f211946v
            r5 = 8
            r4.setVisibility(r5)
            r2.mo100363M0(r11)
            goto L_0x08fc
        L_0x08cd:
            di3.d r2 = di3.C86312j.m106911c(r7)
            xy1.i r2 = (xy1.C79011i) r2
            boolean r2 = r2.Us0()
            if (r2 != 0) goto L_0x08e6
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            com.tencent.mm.pluginsdk.ui.chat.h r4 = r2.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r4.f212159c
            r4.f212183a = r11
            r2.mo100316o()
        L_0x08e6:
            di3.d r2 = di3.C86312j.m106911c(r7)
            xy1.i r2 = (xy1.C79011i) r2
            boolean r2 = r2.mo71416YE()
            if (r2 != 0) goto L_0x08fc
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100378U()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100374S()
        L_0x08fc:
            di3.d r2 = di3.C86312j.m106911c(r7)
            xy1.i r2 = (xy1.C79011i) r2
            boolean r2 = r2.Fr0()
            if (r2 != 0) goto L_0x0922
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100349F()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.ui.widget.imageview.WeImageButton r2 = r2.f211956x
            if (r2 == 0) goto L_0x0918
            r4 = 8
            r2.setVisibility(r4)
        L_0x0918:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100398f0()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100351G()
        L_0x0922:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100381W()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100364N()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100347E()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100353H()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r4 = 1
            r2.mo100385Y(r4, r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100357J(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100383X(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r5 = 13
            r2.mo100370Q(r5)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r5 = 17
            r2.mo100372R(r5)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100376T(r4)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100366O()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100368P()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            r2.mo100355I()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r5 = r2.f211878h
            r5.f211696J = r4
            r2.mo100359K()
        L_0x0971:
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85807K5(r2)
            if (r2 != 0) goto L_0x098a
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            com.tencent.mm.pluginsdk.ui.chat.h r4 = r2.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r4.f212181y
            r4.f212183a = r11
            r2.mo100316o()
        L_0x098a:
            java.lang.Class<f62.i0> r2 = f62.C75698i0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            f62.i0 r2 = (f62.C75698i0) r2
            ck3.b r4 = r0.f215752d
            java.lang.String r4 = r4.mo91577r()
            boolean r2 = r2.Mq0(r4)
            if (r2 != 0) goto L_0x09ab
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r0.f215510e
            com.tencent.mm.pluginsdk.ui.chat.AppPanel r2 = r2.f211878h
            com.tencent.mm.pluginsdk.ui.chat.h r4 = r2.f211687A
            com.tencent.mm.pluginsdk.ui.chat.h$c r4 = r4.f212182z
            r4.f212183a = r11
            r2.mo100316o()
        L_0x09ab:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mo102186b6(r1, r3, r2)
            com.tencent.mm.ui.chatting.component.FootComponent$$h r4 = new com.tencent.mm.ui.chatting.component.FootComponent$$h
            r4.<init>(r0, r1, r3)
            int r1 = r2.size()
            if (r1 != 0) goto L_0x0a99
            if (r3 == 0) goto L_0x0a99
            long r1 = r3.f149536f1
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0a99
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r1 == 0) goto L_0x0a31
            k40.a r1 = f40.C86709a0.m107533q(r8)
            a11.c r1 = (a11.C39479c) r1
            eb0.m2 r1 = r1.mo62084mr()
            ck3.b r7 = r0.f215752d
            java.lang.String r7 = r7.mo91577r()
            com.tencent.mm.storage.n1 r1 = (com.tencent.p014mm.storage.C44662n1) r1
            com.tencent.mm.storage.m1 r1 = r1.mo69799Lo(r7)
            if (r1 == 0) goto L_0x0a30
            int r7 = r1.field_chatroomStatus
            long r9 = (long) r7
            r12 = 32768(0x8000, double:1.61895E-319)
            long r9 = r9 & r12
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0a30
            long r9 = r1.field_chatroomfamilystatusmodifytime
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0a09
            long r5 = eb0.C31543z5.m39453c()
            long r9 = r9 - r5
            int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0a30
        L_0x0a09:
            long r2 = eb0.C31543z5.m39453c()
            r1.field_chatroomfamilystatusmodifytime = r2
            k40.a r2 = f40.C86709a0.m107533q(r8)
            a11.c r2 = (a11.C39479c) r2
            eb0.m2 r2 = r2.mo62084mr()
            java.lang.String[] r3 = new java.lang.String[r11]
            r2.update(r1, (java.lang.String[]) r3)
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.chatting.component.x1 r3 = new com.tencent.mm.ui.chatting.component.x1
            r3.<init>(r0, r1, r4)
            r2.postToWorker(r3)
        L_0x0a30:
            return
        L_0x0a31:
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85847r5(r1)
            if (r1 == 0) goto L_0x0a99
            k40.a r1 = f40.C86709a0.m107533q(r8)
            a11.c r1 = (a11.C39479c) r1
            eb0.m2 r1 = r1.mo62084mr()
            ck3.b r7 = r0.f215752d
            java.lang.String r7 = r7.mo91577r()
            com.tencent.mm.storage.n1 r1 = (com.tencent.p014mm.storage.C44662n1) r1
            com.tencent.mm.storage.m1 r1 = r1.mo69799Lo(r7)
            if (r1 == 0) goto L_0x0a99
            aj.a r7 = r1.mo69792t2()
            int r7 = r7.f106337f
            long r9 = (long) r7
            r12 = 4
            long r9 = r9 & r12
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0a99
            long r9 = r1.field_chatroomfamilystatusmodifytime
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0a72
            long r5 = eb0.C31543z5.m39453c()
            long r9 = r9 - r5
            int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0a99
        L_0x0a72:
            long r2 = eb0.C31543z5.m39453c()
            r1.field_chatroomfamilystatusmodifytime = r2
            k40.a r2 = f40.C86709a0.m107533q(r8)
            a11.c r2 = (a11.C39479c) r2
            eb0.m2 r2 = r2.mo62084mr()
            java.lang.String[] r3 = new java.lang.String[r11]
            r2.update(r1, (java.lang.String[]) r3)
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
            com.tencent.mm.ui.chatting.component.x1 r3 = new com.tencent.mm.ui.chatting.component.x1
            r3.<init>(r0, r1, r4)
            r2.postToWorker(r3)
        L_0x0a99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.FootComponent.mo102187d6(java.lang.String):void");
    }

    /* renamed from: e */
    public void mo70065e() {
        this.f215520r = this.f215752d.f193286j.getBooleanExtra("show_footer", false).booleanValue();
        this.f215521s = this.f215752d.f193286j.getBooleanExtra("enter_room_from_uri_jump", false).booleanValue();
    }

    /* renamed from: e6 */
    public final void mo102188e6() {
        if (this.f215510e == null) {
            Log.m105920e("MicroMsg.ChattingUI.FootComponent", "initTodoView footer == null");
            return;
        }
        Log.m105924i("MicroMsg.ChattingUI.FootComponent", "initTodoView()");
        ((C79337a0) this.f215752d.f193278b.mo102812a(C79337a0.class)).mo102212O2(this.f215510e.getIOnToDoBarCallback());
        this.f215510e.setIOnTodoViewCallback(new FootComponent$$i(this));
    }

    /* renamed from: f6 */
    public final void mo102189f6() {
        if (this.f215510e == null) {
            Log.m105920e("MicroMsg.ChattingUI.FootComponent", "initTranslateView footer == null");
            return;
        }
        Log.m105924i("MicroMsg.ChattingUI.FootComponent", "initTranslateView()");
        ((C79353f1) this.f215752d.f193278b.mo102812a(C79353f1.class)).mo102517L0(this.f215510e.getIOnTranslateResCallback());
        this.f215510e.setIOnTranslateViewController(new FootComponent$$j(this));
    }

    /* renamed from: g5 */
    public void mo70046g5() {
    }

    /* renamed from: g6 */
    public final void mo102190g6() {
        C67391b bVar = this.f215752d;
        if (!bVar.f193286j.isCurrentActivity) {
            ((ChattingUIFragment) bVar.f193288l).f215289B.setTopViewVisible(true);
            ChatFooter chatFooter = this.f215510e;
            if (chatFooter != null) {
                View findViewById = chatFooter.findViewById(C0966R.C0970id.b7m);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                chatFooter.setSwitchButtonMode(0);
                chatFooter.f211801Q1.removeMessages(1002);
                ImageButton imageButton = chatFooter.f211946v;
                if (imageButton != null) {
                    imageButton.setVisibility(8);
                }
                ImageView imageView = chatFooter.f211951w;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                WeImageButton weImageButton = chatFooter.f211956x;
                if (weImageButton != null) {
                    weImageButton.setVisibility(8);
                }
                LinearLayout linearLayout = chatFooter.f211739B;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                MaxHeightScrollView maxHeightScrollView = chatFooter.f211962y;
                if (maxHeightScrollView != null) {
                    maxHeightScrollView.setVisibility(8);
                }
                RelativeLayout relativeLayout = chatFooter.f211744C;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                chatFooter.f211905n.setVisibility(8);
                View view = chatFooter.f211800Q0;
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ViewGroup viewGroup = chatFooter.f211875g2;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                View view2 = chatFooter.f211815T0;
                if (view2 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view3 = chatFooter.f211825V0;
                if (view3 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                VoiceInputPanel voiceInputPanel = chatFooter.f211873g;
                if (voiceInputPanel != null) {
                    voiceInputPanel.setVisibility(8);
                    chatFooter.f211864e1 = false;
                    chatFooter.f211873g.mo25276f();
                }
                ViewGroup viewGroup2 = chatFooter.f211963y0;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                View view5 = chatFooter.f211820U0;
                if (view5 != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(8);
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C76901s0 s0Var = chatFooter.f211957x0;
                if (s0Var != null) {
                    s0Var.update();
                }
                TextView textView = chatFooter.f211910o;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ChatFooterBottom chatFooterBottom = chatFooter.f211936t;
                if (chatFooterBottom != null) {
                    chatFooterBottom.setVisibility(4);
                    ChatFooterPanel chatFooterPanel = chatFooter.f211868f;
                    if (chatFooterPanel != null) {
                        chatFooterPanel.setVisibility(4);
                    }
                }
                AppPanel appPanel = (AppPanel) chatFooter.findViewById(C0966R.C0970id.b1m);
                chatFooter.f211878h = appPanel;
                if (appPanel != null) {
                    appPanel.setChattingContext(chatFooter.f211826V1);
                    chatFooter.setAppPanelVisible(8);
                    AppPanel appPanel2 = chatFooter.f211878h;
                    MMFlipper mMFlipper = appPanel2.f211713p;
                    if (mMFlipper != null) {
                        mMFlipper.setToScreen(0);
                    }
                    appPanel2.f211722y = 0;
                }
                chatFooter.mo100344C0(ChatFooter$$o1.Reset);
                chatFooter.mo100341B(0, false, -1);
                chatFooter.f211809S = false;
                ChatFooter chatFooter2 = this.f215510e;
                if (!Util.isNullOrNil((CharSequence) chatFooter2.f211888j.getText())) {
                    chatFooter2.f211888j.setText("");
                    ChatFooterPanel chatFooterPanel2 = chatFooter2.f211868f;
                    if (chatFooterPanel2 != null) {
                        chatFooterPanel2.setToSendText("");
                    }
                }
                chatFooter2.mo100501w0(false);
                chatFooter2.mo100346D0();
                this.f215510e.mo100340A0();
                this.f215510e.f211795P.f212002a = null;
            }
        }
    }

    /* renamed from: h2 */
    public void mo102191h2(ChatFooter$$k1 chatFooter$$k1) {
        this.f215510e.setVoiceInputShowCallback(chatFooter$$k1);
    }

    /* renamed from: h6 */
    public void mo102192h6() {
        this.f215752d.mo91578s();
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "visibleCustomFooter customFooter is %s", this.f215512g);
        ChatFooterCustom chatFooterCustom = this.f215512g;
        if (chatFooterCustom != null) {
            chatFooterCustom.setVisibility(0);
            ChatFooter chatFooter = this.f215510e;
            if (chatFooter != null) {
                chatFooter.mo100339A(0, false);
                this.f215510e.setVisibility(8);
            }
        }
    }

    /* renamed from: k1 */
    public ChatFooter mo102193k1() {
        return this.f215510e;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        ChatFooter chatFooter;
        C72806l1 l1Var;
        C73832q0 q0Var;
        super.mo70047l2();
        ChatFooter chatFooter2 = this.f215510e;
        if (chatFooter2 != null) {
            chatFooter2.setFooterEventListener((C72825s0) null);
            C73852u1 u1Var = this.f215511f;
            u1Var.getClass();
            String h = AppForegroundDelegate.m161225h();
            Log.m105925i("MicroMsg.ChattingFooterEventImpl", "getCurrentActivity: %s", h);
            if (h == null || !h.contains("MMRecordUI")) {
                Log.m105924i("MicroMsg.ChattingFooterEventImpl", "clear video generate callback");
                CaptureDataManager.f272890c.f272891a = null;
            }
            C77002r rVar = u1Var.f216733b;
            if (rVar != null) {
                rVar.mo107325j((C77002r.C77004b) null);
                u1Var.f216733b.mo107317c((C77002r.C77003a) null);
            }
            this.f215511f = null;
            this.f215510e.setSmileyPanelCallback((C44614y0) null);
            this.f215510e.setSmileyPanelCallback2((C72837v1) null);
        }
        ChatFooterCustom chatFooterCustom = this.f215512g;
        if (chatFooterCustom != null) {
            chatFooterCustom.f215264y.clear();
            ChatFooterCustom.GetLocationListener getLocationListener = chatFooterCustom.f215260u;
            if (getLocationListener != null) {
                getLocationListener.dead();
            }
            ChatFooterCustom.GetScanCodeListener getScanCodeListener = chatFooterCustom.f215261v;
            if (getScanCodeListener != null) {
                getScanCodeListener.dead();
            }
            chatFooterCustom.mo102060n();
            this.f215512g = null;
        }
        mo102190g6();
        ChatFooterCustom chatFooterCustom2 = this.f215512g;
        if (!(chatFooterCustom2 == null || (q0Var = chatFooterCustom2.f215250h) == null)) {
            q0Var.mo102866a();
        }
        ((C76979h) C86312j.m106911c(C76979h.class)).clearCache();
        ChatFooter chatFooter3 = this.f215510e;
        if (!(chatFooter3 == null || (l1Var = chatFooter3.f211772J) == null)) {
            C72843y1 y1Var = (C72843y1) l1Var;
            y1Var.f212286j = false;
            y1Var.mo100683b();
        }
        if (this.f215752d.f193286j.isCurrentActivity && (chatFooter = this.f215510e) != null) {
            chatFooter.mo100345D();
        }
        C86709a0.m107528h();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        ((C32415b) C86312j.m106911c(C32415b.class)).Bx0().remove(this);
    }

    /* renamed from: n */
    public void mo102194n(Object obj) {
        this.f215511f.mo102899r(obj);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj != null) {
            obj.equals("");
        }
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "onNotifyChange obj %s talker %s", obj, this.f215752d.mo91577r());
        if (obj.equals(this.f215752d.mo91577r())) {
            mo102187d6(this.f215752d.mo91577r());
            mo102197v4();
        }
    }

    /* renamed from: q4 */
    public void mo102195q4() {
        try {
            if (this.f215510e.mo100437o0()) {
                this.f215510e.setBottomPanelVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: r5 */
    public String mo102196r5() {
        return this.f215516n;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        ChatFooterPanel chatFooterPanel = this.f215510e.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100199k();
        }
    }

    /* renamed from: v4 */
    public void mo102197v4() {
        int i;
        String r = this.f215752d.mo91577r();
        Class cls = C10485b.class;
        if (C72996z1.m85838i5(r) || C72996z1.m85798E5(r)) {
            i = 1;
        } else if (C72996z1.m85803I5(r)) {
            i = 2;
        } else {
            i = this.f215752d.f193286j.getIntExtra("Chat_Mode", 0);
            Log.m105919d("MicroMsg.ChattingUI.FootComponent", "dkcm getChatMode old:%d intent:%d ", Integer.valueOf(this.f215513h), Integer.valueOf(i));
            int i2 = this.f215513h;
            if (i2 != 0) {
                i = i2;
            }
            String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("DefaultMsgType");
            if (this.f215513h == 0 && c != null) {
                Log.m105919d("MicroMsg.ChattingUI.FootComponent", "config def chatmode is %s", c);
                i = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("DefaultMsgType"), 0);
            }
            if (i == 0 && this.f215752d.mo91574o().mo62927s3()) {
                i = ((Integer) C97625j3.m125812b().mo105906u().mo119684e(18, 0)).intValue();
            }
            if (i == 0) {
                i = 1;
            }
            Log.m105919d("MicroMsg.ChattingUI.FootComponent", "dkcm getChatMode old:%d intent:%d ", Integer.valueOf(this.f215513h), Integer.valueOf(i));
        }
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "updateChatMode:%d", Integer.valueOf(i));
        if (i == 2) {
            this.f215510e.mo100354H0(i, false);
        } else {
            this.f215510e.mo100354H0(i, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0139  */
    /* renamed from: w3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo102198w3(int r17, com.tencent.p014mm.storage.C72963f4 r18) {
        /*
            r16 = this;
            r0 = r16
            r4 = r17
            r7 = r18
            java.lang.Class<on3.o> r1 = on3.C77029o.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r2 = r1
            on3.o r2 = (on3.C77029o) r2
            ck3.b r1 = r0.f215752d
            android.app.Activity r8 = r1.mo91565f()
            ck3.b r9 = r0.f215752d
            r2.getClass()
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = r2.f225035d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "dealChatRoomTopMsg() called with: op = "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = ", msgInfo = "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r5 = ", topMsgInfoRecord = "
            r3.append(r5)
            r10 = 0
            r3.append(r10)
            java.lang.String r5 = " context = "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)
            r11 = 1
            r12 = 0
            if (r4 != r11) goto L_0x0056
            if (r7 != 0) goto L_0x0056
            goto L_0x016b
        L_0x0056:
            r1 = 2
            if (r4 != r1) goto L_0x005d
            if (r7 != 0) goto L_0x005d
            goto L_0x016b
        L_0x005d:
            if (r7 == 0) goto L_0x0064
            java.lang.String r1 = r18.mo108768t()
            goto L_0x0065
        L_0x0064:
            r1 = r10
        L_0x0065:
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = ""
        L_0x0069:
            if (r4 != r11) goto L_0x00cb
            boolean r3 = z04.C112551y.m153811k(r1)
            if (r3 != 0) goto L_0x00cb
            java.util.List r1 = r2.mo55362z0(r1)
            r3 = r1
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r5 = r3.size()
            if (r5 <= r11) goto L_0x0086
            on3.n r5 = new on3.n
            r5.<init>()
            sx3.C77813z.m93909o(r1, r5)
        L_0x0086:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00a6
            java.util.Iterator r3 = r1.iterator()
            r5 = 0
        L_0x0091:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r6 = r3.next()
            com.tencent.mm.storage.d5 r6 = (com.tencent.p014mm.storage.C72958d5) r6
            boolean r6 = r6.mo108715m2()
            if (r6 != 0) goto L_0x0091
            int r5 = r5 + 1
            goto L_0x0091
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            r3 = 5
            if (r5 < r3) goto L_0x00c3
            java.lang.Object r1 = sx3.C110818d0.m150914L(r1)
            com.tencent.mm.storage.d5 r1 = (com.tencent.p014mm.storage.C72958d5) r1
            te3.hh4 r1 = r1.mo108716n2()
            java.lang.String r1 = r1.f183490h
            r3 = 2131823583(0x7f110bdf, float:1.927997E38)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r5[r12] = r1
            java.lang.String r1 = r8.getString(r3, r5)
            r3 = 1
            goto L_0x00d3
        L_0x00c3:
            r1 = 2131823581(0x7f110bdd, float:1.9279966E38)
            java.lang.String r1 = r8.getString(r1)
            goto L_0x00d2
        L_0x00cb:
            r1 = 2131823582(0x7f110bde, float:1.9279968E38)
            java.lang.String r1 = r8.getString(r1)
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            java.lang.String r5 = "if(op == OP_SET && !talk…s_title_remove)\n        }"
            gy3.C87412m.m108593f(r1, r5)
            if (r4 != r11) goto L_0x00ec
            if (r3 == 0) goto L_0x00e4
            r5 = 2131823571(0x7f110bd3, float:1.9279945E38)
            java.lang.String r5 = r8.getString(r5)
            goto L_0x00f3
        L_0x00e4:
            r5 = 2131823569(0x7f110bd1, float:1.9279941E38)
            java.lang.String r5 = r8.getString(r5)
            goto L_0x00f3
        L_0x00ec:
            r5 = 2131838031(0x7f11444f, float:1.9309274E38)
            java.lang.String r5 = r8.getString(r5)
        L_0x00f3:
            java.lang.String r6 = "if(op == OP_SET){\n      …sg_cancel_real)\n        }"
            gy3.C87412m.m108593f(r5, r6)
            if (r4 != r11) goto L_0x0102
            if (r3 == 0) goto L_0x00ff
            java.lang.String r3 = "group_msg_set_top_action_replace"
            goto L_0x0104
        L_0x00ff:
            java.lang.String r3 = "group_msg_set_top_action_set"
            goto L_0x0104
        L_0x0102:
            java.lang.String r3 = "group_msg_set_top_action_remove"
        L_0x0104:
            r13 = r3
            qo3.a r14 = new qo3.a
            r14.<init>()
            r14.f225660q = r1
            r1 = 3
            r14.f225632O = r1
            r14.f225663t = r5
            on3.m r15 = new on3.m
            r5 = 0
            r1 = r15
            r3 = r8
            r4 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f225620C = r15
            r14.f225668y = r11
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r1 = r8.getString(r1)
            r14.f225664u = r1
            qo3.g r1 = new qo3.g
            r2 = 2131887328(0x7f1204e0, float:1.940926E38)
            r1.<init>(r8, r2)
            r1.mo107525e(r14)
            android.widget.Button r2 = r1.f225693g
            if (r9 == 0) goto L_0x0149
            java.lang.Class<ak3.f> r3 = ak3.C67067f.class
            com.tencent.mm.ui.chatting.manager.a r4 = r9.f193278b
            xi.d r3 = r4.mo102812a(r3)
            ak3.f r3 = (ak3.C67067f) r3
            if (r3 == 0) goto L_0x0149
            java.util.Map r10 = r3.mo91073v3(r7)
        L_0x0149:
            boolean r3 = z04.C112551y.m153811k(r13)
            if (r3 != 0) goto L_0x0168
            if (r10 == 0) goto L_0x0168
            if (r2 == 0) goto L_0x0168
            java.lang.Class<l31.e> r3 = l31.C61212e.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            l31.e r3 = (l31.C61212e) r3
            r3.o30(r2, r13)
            r4 = 40
            r5 = 26356(0x66f4, float:3.6933E-41)
            r3.mo86175pO(r2, r4, r5)
            r3.mo86149PM(r2, r10)
        L_0x0168:
            r1.show()
        L_0x016b:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r0.f215510e
            if (r1 == 0) goto L_0x0172
            r1.mo100339A(r12, r11)
        L_0x0172:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.FootComponent.mo102198w3(int, com.tencent.mm.storage.f4):boolean");
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (str != null) {
            str.equals("");
        }
        Log.m105925i("MicroMsg.ChattingUI.FootComponent", "onNotifyChange event %s talker %s", str, this.f215752d.mo91577r());
        if (C72996z1.m85847r5(this.f215752d.mo91577r()) || C72996z1.m85846q5(this.f215752d.mo91577r())) {
            mo102187d6(this.f215752d.mo91577r());
            mo102197v4();
        }
    }
}

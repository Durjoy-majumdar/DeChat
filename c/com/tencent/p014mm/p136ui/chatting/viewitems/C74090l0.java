package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi3.C54462d;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletQueryHbStatusEvent;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68063d;
import com.tencent.p014mm.message.C68067h;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.C73760n0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C45628s0;
import f32.C75672b;
import f32.C75676e;
import i21.C98591h;
import j20.C117292a;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76879j;
import p287zz.C79442f;
import p287zz.C79445i;
import te3.C77994sf2;
import te3.C77999tf2;
import zj3.C79358g0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l0 */
public class C74090l0 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.l0$d */
    public static class C57782d implements C72963f4.C72966d<C57782d> {

        /* renamed from: b */
        public WalletQueryHbStatusEvent f165362b;

        public C57782d(WalletQueryHbStatusEvent walletQueryHbStatusEvent) {
            this.f165362b = walletQueryHbStatusEvent;
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            return this.f165362b.compareContent(((C57782d) obj).f165362b);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.l0$a */
    public static class C74091a extends C74023i.C74026c {

        /* renamed from: A */
        public String f217433A;

        /* renamed from: B */
        public String f217434B;

        /* renamed from: C */
        public int f217435C;

        /* renamed from: D */
        public ListScrollPAGView.C17718h f217436D;

        /* renamed from: E */
        public boolean f217437E = true;

        /* renamed from: F */
        public boolean f217438F = true;

        /* renamed from: b */
        public ImageView f217439b;

        /* renamed from: c */
        public TextView f217440c;

        /* renamed from: d */
        public TextView f217441d;

        /* renamed from: e */
        public TextView f217442e;

        /* renamed from: f */
        public TextView f217443f;

        /* renamed from: g */
        public ImageView f217444g;

        /* renamed from: h */
        public TextView f217445h;

        /* renamed from: i */
        public ImageView f217446i;

        /* renamed from: j */
        public ImageView f217447j;

        /* renamed from: k */
        public ImageView f217448k;

        /* renamed from: l */
        public View f217449l;

        /* renamed from: m */
        public View f217450m;

        /* renamed from: n */
        public View f217451n;

        /* renamed from: o */
        public View f217452o;

        /* renamed from: p */
        public int f217453p = 0;

        /* renamed from: q */
        public int f217454q = 0;

        /* renamed from: r */
        public int f217455r = 0;

        /* renamed from: s */
        public int f217456s;

        /* renamed from: t */
        public long f217457t;

        /* renamed from: u */
        public boolean f217458u;

        /* renamed from: v */
        public int f217459v;

        /* renamed from: w */
        public int f217460w;

        /* renamed from: x */
        public ListScrollPAGView f217461x;

        /* renamed from: y */
        public View f217462y;

        /* renamed from: z */
        public ImageView f217463z;

        /* renamed from: a */
        public C74091a mo103159a(View view, boolean z) {
            super.create(view);
            this.f217449l = this.convertView.findViewById(C0966R.C0970id.b3v);
            this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
            this.checkBox = (CheckBox) this.convertView.findViewById(C0966R.C0970id.b46);
            this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
            this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
            this.f217450m = this.convertView.findViewById(C0966R.C0970id.ecx);
            this.f217451n = (ImageView) this.convertView.findViewById(C0966R.C0970id.c7p);
            this.f217439b = (ImageView) this.convertView.findViewById(C0966R.C0970id.f6119xu);
            this.f217440c = (TextView) this.convertView.findViewById(C0966R.C0970id.f6125y0);
            this.f217441d = (TextView) this.convertView.findViewById(C0966R.C0970id.f6117xs);
            this.f217442e = (TextView) this.convertView.findViewById(C0966R.C0970id.f6129y4);
            this.clickArea = this.convertView.findViewById(C0966R.C0970id.b47);
            this.f217452o = this.convertView.findViewById(C0966R.C0970id.b4_);
            this.f217444g = (ImageView) this.convertView.findViewById(C0966R.C0970id.b67);
            this.f217463z = (ImageView) this.convertView.findViewById(C0966R.C0970id.c3p);
            this.f217462y = this.convertView.findViewById(C0966R.C0970id.amt);
            this.f217461x = (ListScrollPAGView) this.convertView.findViewById(C0966R.C0970id.ams);
            this.f217445h = (TextView) this.convertView.findViewById(C0966R.C0970id.f6128y3);
            this.f217443f = (TextView) this.convertView.findViewById(C0966R.C0970id.f6126y1);
            this.f217446i = (ImageView) this.convertView.findViewById(C0966R.C0970id.b68);
            this.f217447j = (ImageView) this.convertView.findViewById(C0966R.C0970id.f6127y2);
            this.f217448k = (ImageView) this.convertView.findViewById(C0966R.C0970id.b_1);
            this.f217451n = this.convertView.findViewById(C0966R.C0970id.f6118xt);
            this.f217453p = C74023i.m87886m(MMApplicationContext.getContext());
            this.f217454q = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3651a_);
            this.f217455r = (int) (((float) C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3651a_)) * 1.45f);
            this.f217456s = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            return this;
        }

        public View getMainContainerView() {
            return this.f217452o;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.l0$b */
    public static class C74092b extends C74023i {

        /* renamed from: v */
        public C67391b f217464v;

        /* renamed from: o0 */
        public static boolean m88119o0(C67391b bVar, C72963f4 f4Var) {
            C72963f4 f4Var2 = f4Var;
            Class cls = C68062c.class;
            Class cls2 = C79445i.class;
            if (!WeChatBrands.Business.Entries.SessionLuckyMoney.checkAvailable(bVar.mo91565f())) {
                return true;
            }
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return true;
            }
            String str = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
            Log.m105925i("MicroMsg.ChattingItemAppMsgC2CFrom", "url==null: %s, billNo==null: %s", Boolean.valueOf(Util.isNullOrNil(str)), Boolean.valueOf(Util.isNullOrNil(u.f195640w1)));
            if (Util.isNullOrNil(f4Var2.f212667F1)) {
                f4Var2.f212667F1 = UUID.randomUUID().toString();
            }
            if (!Util.isNullOrNil(u.f195608o1)) {
                String str2 = ".ui.tools.WebViewUI";
                String str3 = "webview";
                if (u.f195608o1.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest")) {
                    Intent intent = new Intent();
                    intent.putExtra("key_way", 1);
                    intent.putExtra("key_native_url", u.f195608o1);
                    intent.putExtra("key_username", bVar.mo91577r());
                    intent.putExtra("key_from_username", C54462d.m61181b(f4Var));
                    intent.putExtra("key_static_from_scene", 100002);
                    intent.putExtra("key_msgid", f4Var.getMsgId());
                    C68062c cVar = (C68062c) u.mo93555w(cls);
                    intent.putExtra("key_exclusive_username", cVar.f195397n);
                    intent.putExtra("key_cropname", cVar.f195387d);
                    intent.putExtra("key_receive_envelope_url", cVar.f195392i);
                    intent.putExtra("key_receive_envelope_md5", cVar.f195393j);
                    intent.putExtra("key_receive_envelope_dynamic_url", cVar.f195409z);
                    intent.putExtra("key_receive_envelope_dynamic_md5", cVar.f195380A);
                    intent.putExtra("key_receive_envelope_dynamic_type", cVar.f195381B);
                    intent.putExtra("key_receive_envelope_widget_url", cVar.f195398o);
                    intent.putExtra("key_receive_envelope_widget_md5", cVar.f195399p);
                    intent.putExtra("key_detail_envelope_url", cVar.f195394k);
                    intent.putExtra("key_detail_envelope_md5", cVar.f195395l);
                    intent.putExtra("key_detail_envelope_dynamic_url", cVar.f195382C);
                    intent.putExtra("key_detail_envelope_dynamic_md5", cVar.f195383D);
                    C68067h hVar = (C68067h) u.mo93555w(C68067h.class);
                    intent.putExtra("key_packet_create_time", (int) f4Var.getCreateTime());
                    intent.putExtra("key_packet_source", hVar.f195446l);
                    intent.putExtra("key_about_url", hVar.f195444j);
                    intent.putExtra("key_packet_id", hVar.f195445k);
                    intent.putExtra("key_has_story", hVar.f195449o);
                    intent.putExtra("key_material_flag", hVar.f195450p);
                    intent.putExtra("key_receive_envelope_widget_status_flag", cVar.f195404u);
                    intent.putExtra("key_receive_envelope_fission_info", cVar.f195405v);
                    C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent, (Bundle) null);
                    C68067h hVar2 = cVar.f195384E;
                    if (hVar2 == null) {
                        return true;
                    }
                    int i = !Util.isNullOrNil(hVar2.f195447m) ? 2 : 1;
                    C79445i iVar = (C79445i) C86312j.m106911c(cls2);
                    String str4 = f4Var2.f212667F1;
                    String str5 = cVar.f195387d;
                    String r = bVar.mo91577r();
                    C68067h hVar3 = cVar.f195384E;
                    iVar.mo109184Ld(str4, str5, r, hVar3.f195445k, hVar3.f195449o ? 2 : 1, i);
                    ((C79445i) C86312j.m106911c(cls2)).Bg0(10, cVar.f195388e);
                    f4Var2.f212667F1 = UUID.randomUUID().toString();
                    return true;
                }
                String str6 = "rawUrl";
                if (u.f195608o1.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao")) {
                    Log.m105924i("MicroMsg.ChattingItemAppMsgC2CFrom", "onChattingItemClickedFrom：hongbao");
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_way", bVar.mo91583x() ^ true ? 1 : 0);
                    intent2.putExtra("key_native_url", u.f195608o1);
                    intent2.putExtra("key_username", bVar.mo91577r());
                    intent2.putExtra("key_from_username", C54462d.m61181b(f4Var));
                    intent2.putExtra("scene_id", Integer.parseInt(u.f195604n1));
                    intent2.putExtra("key_invalidtime", u.f195504K0);
                    C68062c cVar2 = (C68062c) u.mo93555w(cls);
                    C68067h hVar4 = (C68067h) u.mo93555w(C68067h.class);
                    intent2.putExtra("key_exclusive_username", cVar2.f195397n);
                    intent2.putExtra("key_cropname", cVar2.f195387d);
                    intent2.putExtra("key_receive_envelope_url", cVar2.f195392i);
                    intent2.putExtra("key_receive_envelope_md5", cVar2.f195393j);
                    intent2.putExtra("key_receive_envelope_dynamic_url", cVar2.f195409z);
                    intent2.putExtra("key_receive_envelope_dynamic_md5", cVar2.f195380A);
                    intent2.putExtra("key_receive_envelope_dynamic_type", cVar2.f195381B);
                    intent2.putExtra("key_receive_envelope_widget_url", cVar2.f195398o);
                    intent2.putExtra("key_receive_envelope_widget_md5", cVar2.f195399p);
                    intent2.putExtra("key_receive_envelope_widget_status_flag", cVar2.f195404u);
                    intent2.putExtra("key_receive_envelope_fission_info", cVar2.f195405v);
                    intent2.putExtra("key_packet_create_time", (int) f4Var.getCreateTime());
                    intent2.putExtra("key_packet_source", hVar4.f195446l);
                    intent2.putExtra("key_detail_envelope_url", cVar2.f195394k);
                    intent2.putExtra("key_detail_envelope_md5", cVar2.f195395l);
                    intent2.putExtra("key_detail_envelope_dynamic_url", cVar2.f195382C);
                    intent2.putExtra("key_detail_envelope_dynamic_md5", cVar2.f195383D);
                    intent2.putExtra("key_about_url", hVar4.f195444j);
                    intent2.putExtra("key_packet_id", hVar4.f195445k);
                    intent2.putExtra("key_has_story", hVar4.f195449o);
                    intent2.putExtra("key_material_flag", hVar4.f195450p);
                    intent2.putExtra("key_msgid", f4Var.getMsgId());
                    intent2.putExtra("key_emoji_md5", ((C68063d) u.mo93555w(C68063d.class)).f195410b.field_md5);
                    C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".ui.LuckyMoneyNotHookReceiveUI", intent2, (Bundle) null);
                    if (C45628s0.m50742G(bVar.mo91577r())) {
                        C75676e.m90932a(1);
                    }
                    C68067h hVar5 = cVar2.f195384E;
                    if (hVar5 == null) {
                        return true;
                    }
                    int i2 = !Util.isNullOrNil(hVar5.f195447m) ? 2 : 1;
                    C79445i iVar2 = (C79445i) C86312j.m106911c(cls2);
                    String str7 = f4Var2.f212667F1;
                    String str8 = cVar2.f195387d;
                    String r2 = bVar.mo91577r();
                    C68067h hVar6 = cVar2.f195384E;
                    iVar2.mo109184Ld(str7, str8, r2, hVar6.f195445k, hVar6.f195449o ? 2 : 1, i2);
                    ((C79445i) C86312j.m106911c(cls2)).Bg0(10, cVar2.f195388e);
                    f4Var2.f212667F1 = UUID.randomUUID().toString();
                    return true;
                } else if (u.f195608o1.startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("key_way", bVar.mo91583x() ^ true ? 1 : 0);
                    intent3.putExtra("key_native_url", u.f195608o1);
                    intent3.putExtra("key_hk_url", str);
                    intent3.putExtra("key_username", bVar.mo91577r());
                    intent3.putExtra("key_from_username", C54462d.m61181b(f4Var));
                    intent3.putExtra("key_msgid", f4Var.getMsgId());
                    intent3.putExtra("key_hk_scene", 1);
                    C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".hk.ui.LuckyMoneyHKReceiveUI", intent3, (Bundle) null);
                    return true;
                } else {
                    Log.m105924i("MicroMsg.ChattingItemAppMsgC2CFrom", "native url not match:" + u.f195608o1 + ", go webview:" + str);
                    if (Util.isNullOrNil(str)) {
                        return true;
                    }
                    Intent intent4 = new Intent();
                    intent4.putExtra(str6, str);
                    C88144b.m109791i(bVar.mo91565f(), str3, str2, intent4, (Bundle) null);
                    return true;
                }
            } else {
                String str9 = ".ui.tools.WebViewUI";
                String str10 = "webview";
                String str11 = "rawUrl";
                if (!Util.isNullOrNil(u.f195640w1)) {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgC2CFrom", "tofuliu billNo: %s, c2cNewAAType: %s, fromUser: %s", u.f195640w1, Integer.valueOf(u.f195644x1), u.f195488G);
                    int i3 = u.f195644x1;
                    if (i3 == 2 || i3 == 3 || i3 == 1 || i3 == 5) {
                        Intent intent5 = new Intent();
                        intent5.putExtra("bill_no", u.f195640w1);
                        intent5.putExtra("launcher_user_name", u.f195488G);
                        intent5.putExtra("enter_scene", 1);
                        intent5.putExtra("chatroom", bVar.mo91577r());
                        C88144b.m109791i(bVar.mo91565f(), "aa", ".ui.PaylistAAUI", intent5, (Bundle) null);
                    } else if (!Util.isNullOrNil(str)) {
                        Intent intent6 = new Intent();
                        intent6.putExtra(str11, str);
                        C88144b.m109791i(bVar.mo91565f(), str10, str9, intent6, (Bundle) null);
                    }
                    if (C73760n0.m87360f(u).f216518a == 2) {
                        int i4 = u.f195644x1;
                        if (i4 == 2) {
                            C115669n.INSTANCE.mo160131h(13721, 4, 2, 2);
                            return true;
                        } else if (i4 == 3) {
                            C115669n.INSTANCE.mo160131h(13721, 4, 2, 3);
                            return true;
                        } else if (i4 != 5) {
                            return true;
                        } else {
                            C115669n.INSTANCE.mo160131h(13721, 4, 2, 4);
                            return true;
                        }
                    } else {
                        int i5 = u.f195644x1;
                        if (i5 == 2) {
                            C115669n.INSTANCE.mo160131h(13721, 4, 3, 2);
                            return true;
                        } else if (i5 == 3) {
                            C115669n.INSTANCE.mo160131h(13721, 4, 3, 3);
                            return true;
                        } else if (i5 != 5) {
                            return true;
                        } else {
                            C115669n.INSTANCE.mo160131h(13721, 4, 3, 4);
                            return true;
                        }
                    }
                } else if (Util.isNullOrNil(str)) {
                    return true;
                } else {
                    Intent intent7 = new Intent();
                    intent7.putExtra(str11, str);
                    C88144b.m109791i(bVar.mo91565f(), str10, str9, intent7, (Bundle) null);
                    return true;
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6881r3);
            C74091a aVar = new C74091a();
            aVar.mo103159a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: S */
        public boolean mo82213S() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return menuItem.getItemId() == 100;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217464v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            m88119o0(bVar, f4Var);
            return true;
        }

        /* renamed from: b0 */
        public void mo103085b0(C74023i.C74026c cVar) {
            C74091a aVar = (C74091a) cVar;
            View view = aVar.f217462y;
            if (view != null && view.getVisibility() == 0) {
                aVar.f217461x.mo21226m();
            }
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            if (f4Var != null && Util.isNullOrNil(f4Var.f212667F1)) {
                f4Var.f212667F1 = UUID.randomUUID().toString();
            }
            return C74090l0.m88112a(f4Var);
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x03df  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0429  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0448  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x045f  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0461  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x034c  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x035d  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0389  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x039d  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x03af  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x03be  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r31, ck3.C67391b r32, com.tencent.p014mm.storage.C72963f4 r33, java.lang.String r34) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                r9 = r32
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                r0.f217464v = r9
                r3 = r1
                com.tencent.mm.ui.chatting.viewitems.l0$a r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74091a) r3
                long r4 = r3.f217457t
                long r6 = r33.getMsgId()
                r10 = 0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                r8 = 1
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0020
                r3.f217458u = r8
                goto L_0x0022
            L_0x0020:
                r3.f217458u = r10
            L_0x0022:
                long r4 = r33.getMsgId()
                r3.f217457t = r4
                java.lang.String r4 = r33.getContent()
                if (r4 == 0) goto L_0x0037
                java.lang.String r5 = r33.mo108775z2()
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r5)
                goto L_0x0038
            L_0x0037:
                r4 = 0
            L_0x0038:
                if (r4 == 0) goto L_0x0491
                java.lang.Class<com.tencent.mm.message.c> r5 = com.tencent.p014mm.message.C68062c.class
                com.tencent.mm.message.g r5 = r4.mo93555w(r5)
                com.tencent.mm.message.c r5 = (com.tencent.p014mm.message.C68062c) r5
                java.lang.String r6 = r4.f195604n1
                java.lang.String r15 = "1001"
                boolean r6 = r15.equals(r6)
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent r14 = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent
                r14.<init>()
                java.lang.String r13 = r4.f195608o1
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 != 0) goto L_0x0062
                if (r6 != 0) goto L_0x0062
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$a r13 = r14.f154903d
                java.lang.String r12 = r4.f195608o1
                r13.f154905a = r12
                r14.publish()
            L_0x0062:
                android.view.View r12 = r3.clickArea
                int r13 = r3.f217453p
                r3.resetChatBubbleWidth(r12, r13)
                java.lang.String r12 = r4.f195604n1
                boolean r12 = r15.equals(r12)
                r13 = 2131099940(0x7f060124, float:1.7812247E38)
                if (r12 == 0) goto L_0x019f
                android.view.View r12 = r3.clickArea
                int r7 = r33.mo108769t2()
                if (r7 != r8) goto L_0x007e
                r7 = 1
                goto L_0x007f
            L_0x007e:
                r7 = 0
            L_0x007f:
                int r7 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87358d(r4, r7)
                r12.setBackgroundResource(r7)
                android.widget.TextView r7 = r3.f217440c
                android.graphics.Typeface r12 = android.graphics.Typeface.defaultFromStyle(r8)
                r7.setTypeface(r12)
                android.view.View r7 = r3.f217451n
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
                r12.mo10233c(r11)
                java.lang.Object[] r22 = r12.mo10232b()
                java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r24 = "filling"
                java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r26 = "android/view/View_EXEC_"
                java.lang.String r27 = "setVisibility"
                java.lang.String r28 = "(I)V"
                r21 = r7
                j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
                java.lang.Object r12 = r12.mo10231a(r10)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r7.setVisibility(r12)
                java.lang.String r22 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r23 = "filling"
                java.lang.String r24 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r25 = "android/view/View_EXEC_"
                java.lang.String r26 = "setVisibility"
                java.lang.String r27 = "(I)V"
                j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
                boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r7 != 0) goto L_0x0120
                android.widget.TextView r7 = r3.f217440c
                android.app.Activity r12 = r32.mo91565f()
                android.content.res.Resources r12 = r12.getResources()
                int r12 = r12.getColor(r13)
                r7.setTextColor(r12)
                android.widget.TextView r7 = r3.f217440c
                r12 = 1065353216(0x3f800000, float:1.0)
                r7.setAlpha(r12)
                android.widget.TextView r7 = r3.f217441d
                android.app.Activity r16 = r32.mo91565f()
                android.content.res.Resources r10 = r16.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217441d
                r7.setAlpha(r12)
                android.widget.TextView r7 = r3.f217442e
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217442e
                r10 = 1061997773(0x3f4ccccd, float:0.8)
                r7.setAlpha(r10)
                android.widget.ImageView r7 = r3.f217439b
                r7.setAlpha(r12)
                goto L_0x0223
            L_0x0120:
                android.widget.TextView r7 = r3.f217440c
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217441d
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217442e
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217440c
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x015d
                r10 = 1
                goto L_0x015e
            L_0x015d:
                r10 = 0
            L_0x015e:
                r12 = 0
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r12)
                r7.setAlpha(r10)
                android.widget.TextView r7 = r3.f217441d
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x0170
                r10 = 1
                goto L_0x0171
            L_0x0170:
                r10 = 0
            L_0x0171:
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r12)
                r7.setAlpha(r10)
                android.widget.TextView r7 = r3.f217442e
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x0182
                r10 = 1
                goto L_0x0183
            L_0x0182:
                r10 = 0
            L_0x0183:
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r8)
                r7.setAlpha(r10)
                android.widget.ImageView r7 = r3.f217439b
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x0194
                r10 = 1
                goto L_0x0195
            L_0x0194:
                r10 = 0
            L_0x0195:
                r12 = 0
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r12)
                r7.setAlpha(r10)
                goto L_0x0223
            L_0x019f:
                android.view.View r7 = r3.clickArea
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r10 = r14.f154904e
                int r12 = r10.f154907b
                int r10 = r10.f154908c
                int r13 = r33.mo108769t2()
                if (r13 != r8) goto L_0x01af
                r13 = 1
                goto L_0x01b0
            L_0x01af:
                r13 = 0
            L_0x01b0:
                int r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87363i(r12, r10, r13)
                r7.setBackgroundResource(r10)
                android.widget.TextView r7 = r3.f217440c
                android.graphics.Typeface r10 = android.graphics.Typeface.defaultFromStyle(r8)
                r7.setTypeface(r10)
                int r7 = r3.f217454q
                int r10 = r3.f217455r
                if (r7 <= r10) goto L_0x01c7
                r7 = r10
            L_0x01c7:
                r3.f217454q = r7
                android.view.View r7 = r3.f217451n
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
                r10.mo10233c(r11)
                java.lang.Object[] r23 = r10.mo10232b()
                java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r25 = "filling"
                java.lang.String r26 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                r22 = r7
                j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
                r12 = 0
                java.lang.Object r10 = r10.mo10231a(r12)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                r7.setVisibility(r10)
                java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r24 = "filling"
                java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r26 = "android/view/View_EXEC_"
                java.lang.String r27 = "setVisibility"
                java.lang.String r28 = "(I)V"
                j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
                android.widget.TextView r7 = r3.f217442e
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                r12 = 2131099940(0x7f060124, float:1.7812247E38)
                int r10 = r10.getColor(r12)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217442e
                r10 = 1060320051(0x3f333333, float:0.7)
                r7.setAlpha(r10)
            L_0x0223:
                android.app.Activity r7 = r32.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r10 = 2131165644(0x7f0701cc, float:1.794551E38)
                r7.getDimensionPixelSize(r10)
                android.app.Activity r7 = r32.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r10 = 2131166110(0x7f07039e, float:1.7946456E38)
                r7.getDimensionPixelSize(r10)
                android.view.View r7 = r3.clickArea
                r10 = 0
                r7.setPadding(r10, r10, r10, r10)
                int r7 = r33.mo108769t2()
                if (r7 != r8) goto L_0x024e
                java.lang.String r7 = r4.f195584i1
                goto L_0x0250
            L_0x024e:
                java.lang.String r7 = r4.f195580h1
            L_0x0250:
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                r12 = 3
                if (r10 == 0) goto L_0x0265
                java.lang.String r7 = r4.f195574g
                android.widget.TextView r10 = r3.f217440c
                r13 = 0
                r10.setSingleLine(r13)
                android.widget.TextView r10 = r3.f217440c
                r10.setMaxLines(r12)
                goto L_0x026a
            L_0x0265:
                android.widget.TextView r10 = r3.f217440c
                r10.setSingleLine(r8)
            L_0x026a:
                android.widget.TextView r10 = r3.f217440c
                di3.d r13 = di3.C86312j.m106911c(r2)
                ny.h r13 = (p629ny.C76979h) r13
                android.app.Activity r12 = r32.mo91565f()
                int r8 = r3.f217454q
                android.text.SpannableString r7 = r13.op0(r12, r7, r8)
                r10.setText(r7)
                android.widget.TextView r7 = r3.f217440c
                int r8 = r3.f217454q
                float r8 = (float) r8
                r10 = 0
                r7.setTextSize(r10, r8)
                if (r6 == 0) goto L_0x02ba
                android.widget.TextView r6 = r3.f217441d
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.app.Activity r7 = r32.mo91565f()
                int r8 = r33.mo108769t2()
                r10 = 1
                if (r8 != r10) goto L_0x029f
                r8 = 1
                goto L_0x02a0
            L_0x029f:
                r8 = 0
            L_0x02a0:
                java.lang.String r8 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87362h(r4, r8)
                android.widget.TextView r10 = r3.f217441d
                float r10 = r10.getTextSize()
                android.text.SpannableString r2 = r2.yp0(r7, r8, r10)
                r6.setText(r2)
                android.widget.TextView r2 = r3.f217441d
                r6 = 0
                r2.setVisibility(r6)
                r10 = r14
                r7 = r15
                goto L_0x031e
            L_0x02ba:
                java.lang.String r6 = r4.f195608o1
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x0329
                android.widget.TextView r6 = r3.f217441d
                r7 = 1094713344(0x41400000, float:12.0)
                r8 = 1
                r6.setTextSize(r8, r7)
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r6 = r14.f154904e
                int r13 = r6.f154906a
                int r7 = r6.f154907b
                int r6 = r6.f154908c
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x02db
                r16 = 1
                goto L_0x02dd
            L_0x02db:
                r16 = 0
            L_0x02dd:
                boolean r17 = r32.mo91583x()
                java.lang.String r18 = r32.mo91577r()
                android.widget.TextView r8 = r3.f217441d
                r10 = r14
                r14 = r7
                r7 = r15
                r15 = r6
                r19 = r4
                r20 = r8
                java.lang.String r6 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87364j(r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r8 != 0) goto L_0x0321
                android.widget.TextView r8 = r3.f217441d
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.widget.TextView r12 = r3.f217441d
                android.content.Context r12 = r12.getContext()
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                android.widget.TextView r13 = r3.f217441d
                float r13 = r13.getTextSize()
                android.text.SpannableString r2 = r2.yp0(r12, r6, r13)
                r8.setText(r2)
                android.widget.TextView r2 = r3.f217441d
                r6 = 0
                r2.setVisibility(r6)
            L_0x031e:
                r8 = 8
                goto L_0x0344
            L_0x0321:
                android.widget.TextView r2 = r3.f217441d
                r8 = 8
                r2.setVisibility(r8)
                goto L_0x0344
            L_0x0329:
                r10 = r14
                r7 = r15
                r8 = 8
                android.widget.TextView r2 = r3.f217441d
                int r6 = r33.mo108769t2()
                r12 = 1
                if (r6 != r12) goto L_0x0339
                java.lang.String r6 = r4.f195588j1
                goto L_0x033b
            L_0x0339:
                java.lang.String r6 = r4.f195592k1
            L_0x033b:
                r2.setText(r6)
                android.widget.TextView r2 = r3.f217441d
                r6 = 0
                r2.setVisibility(r6)
            L_0x0344:
                java.lang.String r2 = r4.f195596l1
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r6 == 0) goto L_0x034e
                java.lang.String r2 = r4.f195570f
            L_0x034e:
                android.widget.TextView r6 = r3.f217442e
                r6.setText(r2)
                java.lang.String r2 = r5.f195385b
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                java.lang.String r6 = "drawable"
                if (r2 != 0) goto L_0x0389
                gc0.a r2 = gc0.C20828a.m22825b()
                android.widget.ImageView r12 = r3.f217439b
                java.lang.String r13 = ""
                r2.mo32518g(r13, r12)
                android.content.res.Resources r2 = r32.mo91572m()
                java.lang.String r12 = r5.f195385b
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                int r2 = r2.getIdentifier(r12, r6, r13)
                if (r2 > 0) goto L_0x038a
                android.content.res.Resources r2 = r32.mo91572m()
                java.lang.String r12 = r5.f195385b
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                java.lang.String r14 = "raw"
                int r2 = r2.getIdentifier(r12, r14, r13)
                goto L_0x038a
            L_0x0389:
                r2 = 0
            L_0x038a:
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                r14 = 0
                r13[r14] = r12
                java.lang.String r12 = "MicroMsg.ChattingItemAppMsgC2CFrom"
                java.lang.String r14 = "c2c loaclResId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r13)
                if (r2 <= 0) goto L_0x03a7
                java.lang.String r13 = "set c2cIcon from localRes"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
                android.widget.ImageView r13 = r3.f217439b
                r13.setImageResource(r2)
            L_0x03a7:
                java.lang.String r13 = r4.f195604n1
                boolean r7 = r7.equals(r13)
                if (r7 == 0) goto L_0x03be
                int r7 = r33.mo108769t2()
                r13 = 1
                if (r7 != r13) goto L_0x03b8
                r7 = 1
                goto L_0x03b9
            L_0x03b8:
                r7 = 0
            L_0x03b9:
                int r7 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87359e(r4, r7)
                goto L_0x03d2
            L_0x03be:
                r13 = 1
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r7 = r10.f154904e
                int r14 = r7.f154907b
                int r7 = r7.f154908c
                int r15 = r33.mo108769t2()
                if (r15 != r13) goto L_0x03cd
                r13 = 1
                goto L_0x03ce
            L_0x03cd:
                r13 = 0
            L_0x03ce:
                int r7 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87366l(r14, r7, r13)
            L_0x03d2:
                if (r7 <= 0) goto L_0x03df
                java.lang.String r2 = "set c2cIcon from iconRes"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                android.widget.ImageView r2 = r3.f217439b
                r2.setImageResource(r7)
                goto L_0x0420
            L_0x03df:
                if (r2 > 0) goto L_0x0420
                java.lang.String r2 = "set c2cIcon from c2cIconUrl"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                java.lang.String r2 = r4.f195576g1
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r7 == 0) goto L_0x03f0
                java.lang.String r2 = r4.f195646y
            L_0x03f0:
                android.widget.ImageView r4 = r3.f217439b
                r7 = 0
                r4.setImageBitmap(r7)
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r4 != 0) goto L_0x0420
                hc0.c$b r4 = new hc0.c$b
                r4.<init>()
                eb0.c r7 = eb0.C97625j3.m125812b()
                r7.getClass()
                java.lang.String r7 = f12.C7970a.m8128b()
                r4.f59351g = r7
                r7 = 1
                r4.f59346b = r7
                r4.f59363s = r7
                hc0.c r4 = r4.mo32666a()
                gc0.a r7 = gc0.C20828a.m22825b()
                android.widget.ImageView r13 = r3.f217439b
                r7.mo32519h(r2, r13, r4)
            L_0x0420:
                r2 = -1
                java.lang.String r4 = r5.f195386c
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x0437
                android.content.res.Resources r2 = r32.mo91572m()
                java.lang.String r4 = r5.f195386c
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                int r2 = r2.getIdentifier(r4, r6, r7)
            L_0x0437:
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r7 = 0
                r6[r7] = r4
                java.lang.String r4 = "backgroundResId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r6)
                if (r2 <= 0) goto L_0x0452
                android.view.View r4 = r3.clickArea
                r4.setBackgroundResource(r2)
                android.view.View r2 = r3.clickArea
                r2.setPadding(r7, r7, r7, r7)
            L_0x0452:
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r2 = r10.f154904e
                int r4 = r2.f154907b
                int r2 = r2.f154908c
                int r6 = r33.mo108769t2()
                r7 = 1
                if (r6 != r7) goto L_0x0461
                r6 = 1
                goto L_0x0462
            L_0x0461:
                r6 = 0
            L_0x0462:
                int r6 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87365k(r4, r2, r6)
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r2 = r10.f154904e
                int r4 = r2.f154907b
                int r2 = r2.f154908c
                r10 = 5
                if (r4 != r10) goto L_0x0471
            L_0x046f:
                r7 = 0
                goto L_0x047c
            L_0x0471:
                r10 = 4
                if (r4 != r10) goto L_0x0475
                goto L_0x046f
            L_0x0475:
                r10 = 3
                if (r4 != r10) goto L_0x047c
                r4 = 2
                if (r2 != r4) goto L_0x047c
                goto L_0x046f
            L_0x047c:
                r3.f217437E = r7
                r4 = 1
                java.lang.String r7 = r32.mo91577r()
                r2 = r3
                r3 = r5
                r5 = r6
                r6 = r7
                r10 = 8
                r7 = r33
                r8 = r32
                com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88113b(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x0493
            L_0x0491:
                r10 = 8
            L_0x0493:
                android.view.View r2 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$f r3 = r0.mo103099u(r9)
                r2.setOnClickListener(r3)
                java.lang.String r2 = r32.mo91577r()
                boolean r2 = eb0.C45628s0.m50742G(r2)
                if (r2 != 0) goto L_0x04af
                android.view.View r2 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r3 = r0.mo103098p(r9)
                r2.setOnLongClickListener(r3)
            L_0x04af:
                android.view.View r2 = r1.clickArea
                java.lang.Class<zj3.l> r3 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r4 = r9.f193278b
                xi.d r3 = r4.mo102812a(r3)
                zj3.l r3 = (zj3.C79368l) r3
                com.tencent.mm.ui.chatting.h2 r3 = r3.mo108189Z4()
                r2.setOnTouchListener(r3)
                com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
                ck3.b r3 = r0.f217464v
                boolean r3 = r3.mo91583x()
                r4 = r33
                r5 = 0
                r2.<init>(r4, r3, r1, r5)
                android.view.View r3 = r1.clickArea
                r3.setTag(r2)
                com.tencent.mm.ui.chatting.viewitems.l0$a r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74091a) r1
                android.view.View r2 = r1.f217450m
                if (r2 == 0) goto L_0x0575
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r2 == 0) goto L_0x0524
                android.view.View r2 = r1.f217450m
                r2.setBackground(r5)
                android.view.View r1 = r1.f217451n
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r2.mo10233c(r11)
                java.lang.Object[] r13 = r2.mo10232b()
                java.lang.String r14 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r15 = "filling"
                java.lang.String r16 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r12 = r1
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r14 = "filling"
                java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x0575
            L_0x0524:
                android.view.View r2 = r1.f217450m
                android.content.res.Resources r3 = r32.mo91572m()
                r4 = 2131231679(0x7f0803bf, float:1.8079446E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
                r2.setBackground(r3)
                android.view.View r1 = r1.f217451n
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                r2.mo10233c(r3)
                java.lang.Object[] r12 = r2.mo10232b()
                java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r14 = "filling"
                java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r11 = r1
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r12 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CFrom"
                java.lang.String r13 = "filling"
                java.lang.String r14 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            L_0x0575:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74092b.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 436207665;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.l0$c */
    public static class C74093c extends C74023i {

        /* renamed from: v */
        public C67391b f217465v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.l0$c$a */
        public class C74094a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f217466d;

            /* renamed from: e */
            public final /* synthetic */ String f217467e;

            /* renamed from: f */
            public final /* synthetic */ String f217468f;

            /* renamed from: g */
            public final /* synthetic */ String f217469g;

            /* renamed from: h */
            public final /* synthetic */ String f217470h;

            /* renamed from: i */
            public final /* synthetic */ String f217471i;

            /* renamed from: j */
            public final /* synthetic */ String f217472j;

            /* renamed from: n */
            public final /* synthetic */ String f217473n;

            /* renamed from: o */
            public final /* synthetic */ C67391b f217474o;

            public C74094a(C74093c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C67391b bVar) {
                this.f217466d = str;
                this.f217467e = str2;
                this.f217468f = str3;
                this.f217469g = str4;
                this.f217470h = str5;
                this.f217471i = str6;
                this.f217472j = str7;
                this.f217473n = str8;
                this.f217474o = bVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra("key_scene", 1);
                intent.putExtra("key_receiver", this.f217466d);
                intent.putExtra("key_receivertitle", this.f217467e);
                intent.putExtra("key_sendertitle", this.f217468f);
                intent.putExtra("key_sender_des", this.f217469g);
                intent.putExtra("key_receiver_des", this.f217470h);
                intent.putExtra("key_url", this.f217471i);
                intent.putExtra("key_templateid", this.f217472j);
                intent.putExtra("key_sceneid", this.f217473n);
                C88144b.m109791i(this.f217474o.mo91565f(), "wallet_index", ".ui.WalletSendC2CMsgUI", intent, (Bundle) null);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.l0$c$b */
        public class C74095b implements DialogInterface.OnClickListener {
            public C74095b(C74093c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: o0 */
        public static boolean m88130o0(C67391b bVar, C72963f4 f4Var) {
            C72963f4 f4Var2 = f4Var;
            Class cls = C68062c.class;
            Class cls2 = C79445i.class;
            if (!WeChatBrands.Business.Entries.SessionLuckyMoney.checkAvailable(bVar.mo91565f())) {
                return true;
            }
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return true;
            }
            String str = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
            Log.m105925i("MicroMsg.ChattingItemAppMsgC2CTo", "url==null: %s, billNo==null: %s", Boolean.valueOf(Util.isNullOrNil(str)), Boolean.valueOf(Util.isNullOrNil(u.f195640w1)));
            if (Util.isNullOrNil(f4Var2.f212667F1)) {
                f4Var2.f212667F1 = UUID.randomUUID().toString();
            }
            if (!Util.isNullOrNil(u.f195608o1)) {
                String str2 = ".ui.tools.WebViewUI";
                String str3 = "webview";
                String str4 = "rawUrl";
                if (u.f195608o1.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest")) {
                    Intent intent = new Intent();
                    intent.putExtra("key_way", 1);
                    intent.putExtra("key_native_url", u.f195608o1);
                    intent.putExtra("key_username", bVar.mo91577r());
                    intent.putExtra("key_from_username", C54462d.m61181b(f4Var));
                    intent.putExtra("key_static_from_scene", 100002);
                    intent.putExtra("key_msgid", f4Var.getMsgId());
                    C68062c cVar = (C68062c) u.mo93555w(cls);
                    intent.putExtra("key_exclusive_username", cVar.f195397n);
                    intent.putExtra("key_cropname", cVar.f195387d);
                    intent.putExtra("key_receive_envelope_url", cVar.f195392i);
                    intent.putExtra("key_receive_envelope_md5", cVar.f195393j);
                    intent.putExtra("key_receive_envelope_dynamic_url", cVar.f195409z);
                    intent.putExtra("key_receive_envelope_dynamic_md5", cVar.f195380A);
                    intent.putExtra("key_receive_envelope_dynamic_type", cVar.f195381B);
                    intent.putExtra("key_receive_envelope_widget_url", cVar.f195398o);
                    intent.putExtra("key_receive_envelope_widget_md5", cVar.f195399p);
                    intent.putExtra("key_detail_envelope_url", cVar.f195394k);
                    intent.putExtra("key_detail_envelope_md5", cVar.f195395l);
                    intent.putExtra("key_detail_envelope_dynamic_url", cVar.f195382C);
                    intent.putExtra("key_detail_envelope_dynamic_md5", cVar.f195383D);
                    C68067h hVar = (C68067h) u.mo93555w(C68067h.class);
                    intent.putExtra("key_packet_create_time", (int) f4Var.getCreateTime());
                    intent.putExtra("key_packet_source", hVar.f195446l);
                    intent.putExtra("key_about_url", hVar.f195444j);
                    intent.putExtra("key_packet_id", hVar.f195445k);
                    intent.putExtra("key_has_story", hVar.f195449o);
                    intent.putExtra("key_material_flag", hVar.f195450p);
                    intent.putExtra("key_receive_envelope_widget_status_flag", cVar.f195404u);
                    intent.putExtra("key_receive_envelope_fission_info", cVar.f195405v);
                    C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent, (Bundle) null);
                    C68067h hVar2 = cVar.f195384E;
                    if (hVar2 == null) {
                        return true;
                    }
                    int i = !Util.isNullOrNil(hVar2.f195447m) ? 2 : 1;
                    C79445i iVar = (C79445i) C86312j.m106911c(cls2);
                    String str5 = f4Var2.f212667F1;
                    String str6 = cVar.f195387d;
                    String r = bVar.mo91577r();
                    C68067h hVar3 = cVar.f195384E;
                    iVar.mo109184Ld(str5, str6, r, hVar3.f195445k, hVar3.f195449o ? 2 : 1, i);
                    ((C79445i) C86312j.m106911c(cls2)).Bg0(10, cVar.f195388e);
                    f4Var2.f212667F1 = UUID.randomUUID().toString();
                    return true;
                }
                String str7 = str;
                if (u.f195608o1.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao")) {
                    Log.m105924i("MicroMsg.ChattingItemAppMsgC2CTo", "onChattingItemClickedTo：hongbao");
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_way", bVar.mo91583x() ^ true ? 1 : 0);
                    intent2.putExtra("key_native_url", u.f195608o1);
                    intent2.putExtra("key_username", bVar.mo91577r());
                    intent2.putExtra("key_from_username", C54462d.m61181b(f4Var));
                    intent2.putExtra("scene_id", Integer.parseInt(u.f195604n1));
                    intent2.putExtra("key_invalidtime", u.f195504K0);
                    C68062c cVar2 = (C68062c) u.mo93555w(cls);
                    C68067h hVar4 = (C68067h) u.mo93555w(C68067h.class);
                    intent2.putExtra("key_exclusive_username", cVar2.f195397n);
                    intent2.putExtra("key_cropname", cVar2.f195387d);
                    intent2.putExtra("key_receive_envelope_url", cVar2.f195392i);
                    intent2.putExtra("key_receive_envelope_md5", cVar2.f195393j);
                    intent2.putExtra("key_receive_envelope_dynamic_url", cVar2.f195409z);
                    intent2.putExtra("key_receive_envelope_dynamic_md5", cVar2.f195380A);
                    intent2.putExtra("key_receive_envelope_dynamic_type", cVar2.f195381B);
                    intent2.putExtra("key_receive_envelope_widget_url", cVar2.f195398o);
                    intent2.putExtra("key_receive_envelope_widget_md5", cVar2.f195399p);
                    intent2.putExtra("key_receive_envelope_widget_status_flag", cVar2.f195404u);
                    intent2.putExtra("key_receive_envelope_fission_info", cVar2.f195405v);
                    intent2.putExtra("key_packet_create_time", (int) f4Var.getCreateTime());
                    intent2.putExtra("key_packet_source", hVar4.f195446l);
                    intent2.putExtra("key_detail_envelope_url", cVar2.f195394k);
                    intent2.putExtra("key_detail_envelope_md5", cVar2.f195395l);
                    intent2.putExtra("key_detail_envelope_dynamic_url", cVar2.f195382C);
                    intent2.putExtra("key_detail_envelope_dynamic_md5", cVar2.f195383D);
                    intent2.putExtra("key_about_url", hVar4.f195444j);
                    intent2.putExtra("key_packet_id", hVar4.f195445k);
                    intent2.putExtra("key_has_story", hVar4.f195449o);
                    intent2.putExtra("key_material_flag", hVar4.f195450p);
                    intent2.putExtra("key_msgid", f4Var.getMsgId());
                    C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".ui.LuckyMoneyNotHookReceiveUI", intent2, (Bundle) null);
                    C68067h hVar5 = cVar2.f195384E;
                    if (hVar5 == null) {
                        return true;
                    }
                    int i2 = !Util.isNullOrNil(hVar5.f195447m) ? 2 : 1;
                    C79445i iVar2 = (C79445i) C86312j.m106911c(cls2);
                    String str8 = f4Var2.f212667F1;
                    String str9 = cVar2.f195387d;
                    String r2 = bVar.mo91577r();
                    C68067h hVar6 = cVar2.f195384E;
                    iVar2.mo109184Ld(str8, str9, r2, hVar6.f195445k, hVar6.f195449o ? 2 : 1, i2);
                    ((C79445i) C86312j.m106911c(cls2)).Bg0(10, cVar2.f195388e);
                    f4Var2.f212667F1 = UUID.randomUUID().toString();
                    return true;
                } else if (u.f195608o1.startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("key_way", bVar.mo91583x() ^ true ? 1 : 0);
                    intent3.putExtra("key_native_url", u.f195608o1);
                    intent3.putExtra("key_hk_url", str7);
                    intent3.putExtra("key_username", bVar.mo91577r());
                    intent3.putExtra("key_from_username", C54462d.m61181b(f4Var));
                    intent3.putExtra("key_msgid", f4Var.getMsgId());
                    intent3.putExtra("key_hk_scene", 1);
                    C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".hk.ui.LuckyMoneyHKReceiveUI", intent3, (Bundle) null);
                    return true;
                } else {
                    String str10 = str7;
                    Log.m105924i("MicroMsg.ChattingItemAppMsgC2CTo", "native url not match:" + u.f195608o1 + ", go webview:" + str10);
                    if (Util.isNullOrNil(str10)) {
                        return true;
                    }
                    Intent intent4 = new Intent();
                    intent4.putExtra(str4, str10);
                    C88144b.m109791i(bVar.mo91565f(), str3, str2, intent4, (Bundle) null);
                    return true;
                }
            } else {
                String str11 = ".ui.tools.WebViewUI";
                String str12 = "webview";
                String str13 = "rawUrl";
                if (!Util.isNullOrNil(u.f195640w1)) {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgC2CTo", "tofuliu billNo: %s, c2cNewAAType: %s, fromUser: %s", u.f195640w1, Integer.valueOf(u.f195644x1), u.f195488G);
                    int i3 = u.f195644x1;
                    if (i3 == 2 || i3 == 3 || i3 == 1 || i3 == 5) {
                        Intent intent5 = new Intent();
                        intent5.putExtra("bill_no", u.f195640w1);
                        intent5.putExtra("launcher_user_name", u.f195488G);
                        intent5.putExtra("enter_scene", 1);
                        intent5.putExtra("chatroom", bVar.mo91577r());
                        C88144b.m109791i(bVar.mo91565f(), "aa", ".ui.PaylistAAUI", intent5, (Bundle) null);
                        int i4 = u.f195644x1;
                        if (i4 == 2) {
                            C115669n.INSTANCE.mo160131h(13721, 4, 1, 2);
                            return true;
                        } else if (i4 == 3) {
                            C115669n.INSTANCE.mo160131h(13721, 4, 1, 3);
                            return true;
                        } else if (i4 != 5) {
                            return true;
                        } else {
                            C115669n.INSTANCE.mo160131h(13721, 4, 1, 4);
                            return true;
                        }
                    } else if (Util.isNullOrNil(str)) {
                        return true;
                    } else {
                        Intent intent6 = new Intent();
                        intent6.putExtra(str13, str);
                        C88144b.m109791i(bVar.mo91565f(), str12, str11, intent6, (Bundle) null);
                        return true;
                    }
                } else if (Util.isNullOrNil(str) || Util.isNullOrNil(str)) {
                    return true;
                } else {
                    Intent intent7 = new Intent();
                    intent7.putExtra(str13, str);
                    C88144b.m109791i(bVar.mo91565f(), str12, str11, intent7, (Bundle) null);
                    return true;
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6932sk);
            C74091a aVar = new C74091a();
            aVar.mo103159a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: P */
        public boolean mo103082P() {
            return true;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: S */
        public boolean mo82213S() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 103) {
                return false;
            }
            String content = f4Var.getContent();
            C68070l.C68072b bVar2 = null;
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            }
            if (bVar2 != null) {
                String t = f4Var.mo108768t();
                String str = bVar2.f195580h1;
                String str2 = bVar2.f195584i1;
                String str3 = bVar2.f195588j1;
                String str4 = bVar2.f195592k1;
                String str5 = bVar2.f195572f1;
                String str6 = bVar2.f195600m1;
                String str7 = bVar2.f195604n1;
                C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(C0966R.string.f360268bb1), bVar.mo91572m().getString(C0966R.string.a2d), bVar.mo91572m().getString(C0966R.string.f360269bb2), bVar.mo91572m().getString(C0966R.string.f7926wf), new C74094a(this, t, str, str2, str3, str4, str5, str6, str7, bVar), new C74095b(this));
                return true;
            }
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217465v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            m88130o0(bVar, f4Var);
            return true;
        }

        /* renamed from: b0 */
        public void mo103085b0(C74023i.C74026c cVar) {
            C74091a aVar = (C74091a) cVar;
            View view = aVar.f217462y;
            if (view != null && view.getVisibility() == 0) {
                C74090l0.m88116e(aVar);
            }
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            if (f4Var != null && Util.isNullOrNil(f4Var.f212667F1)) {
                f4Var.f212667F1 = UUID.randomUUID().toString();
            }
            return C74090l0.m88112a(f4Var);
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x03cf  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x03da  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0424  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0443  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x045a  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x045c  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0347  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0358  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0384  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0398  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x03aa  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x03b9  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r31, ck3.C67391b r32, com.tencent.p014mm.storage.C72963f4 r33, java.lang.String r34) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                r9 = r32
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                r0.f217465v = r9
                r3 = r1
                com.tencent.mm.ui.chatting.viewitems.l0$a r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74091a) r3
                long r4 = r3.f217457t
                long r6 = r33.getMsgId()
                r10 = 0
                java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                r8 = 1
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0020
                r3.f217458u = r8
                goto L_0x0022
            L_0x0020:
                r3.f217458u = r10
            L_0x0022:
                long r4 = r33.getMsgId()
                r3.f217457t = r4
                java.lang.String r4 = r33.getContent()
                if (r4 == 0) goto L_0x0037
                java.lang.String r5 = r33.mo108775z2()
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r5)
                goto L_0x0038
            L_0x0037:
                r4 = 0
            L_0x0038:
                if (r4 == 0) goto L_0x048c
                java.lang.Class<com.tencent.mm.message.c> r5 = com.tencent.p014mm.message.C68062c.class
                com.tencent.mm.message.g r5 = r4.mo93555w(r5)
                com.tencent.mm.message.c r5 = (com.tencent.p014mm.message.C68062c) r5
                java.lang.String r6 = r4.f195604n1
                java.lang.String r15 = "1001"
                boolean r6 = r15.equals(r6)
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent r14 = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent
                r14.<init>()
                java.lang.String r13 = r4.f195608o1
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 != 0) goto L_0x0062
                if (r6 != 0) goto L_0x0062
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$a r13 = r14.f154903d
                java.lang.String r12 = r4.f195608o1
                r13.f154905a = r12
                r14.publish()
            L_0x0062:
                android.view.View r12 = r3.clickArea
                int r13 = r3.f217453p
                r3.resetChatBubbleWidth(r12, r13)
                java.lang.String r12 = r4.f195604n1
                boolean r12 = r15.equals(r12)
                r13 = 2131099940(0x7f060124, float:1.7812247E38)
                if (r12 == 0) goto L_0x019f
                android.view.View r12 = r3.clickArea
                int r7 = r33.mo108769t2()
                if (r7 != r8) goto L_0x007e
                r7 = 1
                goto L_0x007f
            L_0x007e:
                r7 = 0
            L_0x007f:
                int r7 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87358d(r4, r7)
                r12.setBackgroundResource(r7)
                android.widget.TextView r7 = r3.f217440c
                android.graphics.Typeface r12 = android.graphics.Typeface.defaultFromStyle(r8)
                r7.setTypeface(r12)
                android.view.View r7 = r3.f217451n
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
                r12.mo10233c(r11)
                java.lang.Object[] r22 = r12.mo10232b()
                java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r24 = "filling"
                java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r26 = "android/view/View_EXEC_"
                java.lang.String r27 = "setVisibility"
                java.lang.String r28 = "(I)V"
                r21 = r7
                j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
                java.lang.Object r12 = r12.mo10231a(r10)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r7.setVisibility(r12)
                java.lang.String r22 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r23 = "filling"
                java.lang.String r24 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r25 = "android/view/View_EXEC_"
                java.lang.String r26 = "setVisibility"
                java.lang.String r27 = "(I)V"
                j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
                boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r7 != 0) goto L_0x0120
                android.widget.TextView r7 = r3.f217440c
                android.app.Activity r12 = r32.mo91565f()
                android.content.res.Resources r12 = r12.getResources()
                int r12 = r12.getColor(r13)
                r7.setTextColor(r12)
                android.widget.TextView r7 = r3.f217440c
                r12 = 1065353216(0x3f800000, float:1.0)
                r7.setAlpha(r12)
                android.widget.TextView r7 = r3.f217441d
                android.app.Activity r16 = r32.mo91565f()
                android.content.res.Resources r10 = r16.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217441d
                r7.setAlpha(r12)
                android.widget.TextView r7 = r3.f217442e
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217442e
                r10 = 1061997773(0x3f4ccccd, float:0.8)
                r7.setAlpha(r10)
                android.widget.ImageView r7 = r3.f217439b
                r7.setAlpha(r12)
                goto L_0x0223
            L_0x0120:
                android.widget.TextView r7 = r3.f217440c
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217441d
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217442e
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r13)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217440c
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x015d
                r10 = 1
                goto L_0x015e
            L_0x015d:
                r10 = 0
            L_0x015e:
                r12 = 0
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r12)
                r7.setAlpha(r10)
                android.widget.TextView r7 = r3.f217441d
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x0170
                r10 = 1
                goto L_0x0171
            L_0x0170:
                r10 = 0
            L_0x0171:
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r12)
                r7.setAlpha(r10)
                android.widget.TextView r7 = r3.f217442e
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x0182
                r10 = 1
                goto L_0x0183
            L_0x0182:
                r10 = 0
            L_0x0183:
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r8)
                r7.setAlpha(r10)
                android.widget.ImageView r7 = r3.f217439b
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x0194
                r10 = 1
                goto L_0x0195
            L_0x0194:
                r10 = 0
            L_0x0195:
                r12 = 0
                float r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87357c(r4, r10, r12)
                r7.setAlpha(r10)
                goto L_0x0223
            L_0x019f:
                android.view.View r7 = r3.clickArea
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r10 = r14.f154904e
                int r12 = r10.f154907b
                int r10 = r10.f154908c
                int r13 = r33.mo108769t2()
                if (r13 != r8) goto L_0x01af
                r13 = 1
                goto L_0x01b0
            L_0x01af:
                r13 = 0
            L_0x01b0:
                int r10 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87363i(r12, r10, r13)
                r7.setBackgroundResource(r10)
                android.widget.TextView r7 = r3.f217440c
                android.graphics.Typeface r10 = android.graphics.Typeface.defaultFromStyle(r8)
                r7.setTypeface(r10)
                int r7 = r3.f217454q
                int r10 = r3.f217455r
                if (r7 <= r10) goto L_0x01c7
                r7 = r10
            L_0x01c7:
                r3.f217454q = r7
                android.view.View r7 = r3.f217451n
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
                r10.mo10233c(r11)
                java.lang.Object[] r23 = r10.mo10232b()
                java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r25 = "filling"
                java.lang.String r26 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                r22 = r7
                j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
                r12 = 0
                java.lang.Object r10 = r10.mo10231a(r12)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                r7.setVisibility(r10)
                java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r24 = "filling"
                java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r26 = "android/view/View_EXEC_"
                java.lang.String r27 = "setVisibility"
                java.lang.String r28 = "(I)V"
                j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
                android.widget.TextView r7 = r3.f217442e
                android.app.Activity r10 = r32.mo91565f()
                android.content.res.Resources r10 = r10.getResources()
                r12 = 2131099940(0x7f060124, float:1.7812247E38)
                int r10 = r10.getColor(r12)
                r7.setTextColor(r10)
                android.widget.TextView r7 = r3.f217442e
                r10 = 1060320051(0x3f333333, float:0.7)
                r7.setAlpha(r10)
            L_0x0223:
                android.app.Activity r7 = r32.mo91565f()
                r10 = 13
                kg3.C76577a.m92151b(r7, r10)
                android.app.Activity r7 = r32.mo91565f()
                android.content.res.Resources r7 = r7.getResources()
                r10 = 2131165574(0x7f070186, float:1.7945369E38)
                r7.getDimensionPixelSize(r10)
                android.view.View r7 = r3.clickArea
                r10 = 0
                r7.setPadding(r10, r10, r10, r10)
                int r7 = r33.mo108769t2()
                if (r7 != r8) goto L_0x0249
                java.lang.String r7 = r4.f195584i1
                goto L_0x024b
            L_0x0249:
                java.lang.String r7 = r4.f195580h1
            L_0x024b:
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                r12 = 3
                if (r10 == 0) goto L_0x0260
                java.lang.String r7 = r4.f195574g
                android.widget.TextView r10 = r3.f217440c
                r13 = 0
                r10.setSingleLine(r13)
                android.widget.TextView r10 = r3.f217440c
                r10.setMaxLines(r12)
                goto L_0x0265
            L_0x0260:
                android.widget.TextView r10 = r3.f217440c
                r10.setSingleLine(r8)
            L_0x0265:
                android.widget.TextView r10 = r3.f217440c
                di3.d r13 = di3.C86312j.m106911c(r2)
                ny.h r13 = (p629ny.C76979h) r13
                android.app.Activity r12 = r32.mo91565f()
                int r8 = r3.f217454q
                android.text.SpannableString r7 = r13.op0(r12, r7, r8)
                r10.setText(r7)
                android.widget.TextView r7 = r3.f217440c
                int r8 = r3.f217454q
                float r8 = (float) r8
                r10 = 0
                r7.setTextSize(r10, r8)
                if (r6 == 0) goto L_0x02b5
                android.widget.TextView r6 = r3.f217441d
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.app.Activity r7 = r32.mo91565f()
                int r8 = r33.mo108769t2()
                r10 = 1
                if (r8 != r10) goto L_0x029a
                r8 = 1
                goto L_0x029b
            L_0x029a:
                r8 = 0
            L_0x029b:
                java.lang.String r8 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87362h(r4, r8)
                android.widget.TextView r10 = r3.f217441d
                float r10 = r10.getTextSize()
                android.text.SpannableString r2 = r2.yp0(r7, r8, r10)
                r6.setText(r2)
                android.widget.TextView r2 = r3.f217441d
                r6 = 0
                r2.setVisibility(r6)
                r10 = r14
                r7 = r15
                goto L_0x0319
            L_0x02b5:
                java.lang.String r6 = r4.f195608o1
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x0324
                android.widget.TextView r6 = r3.f217441d
                r7 = 1094713344(0x41400000, float:12.0)
                r8 = 1
                r6.setTextSize(r8, r7)
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r6 = r14.f154904e
                int r13 = r6.f154906a
                int r7 = r6.f154907b
                int r6 = r6.f154908c
                int r10 = r33.mo108769t2()
                if (r10 != r8) goto L_0x02d6
                r16 = 1
                goto L_0x02d8
            L_0x02d6:
                r16 = 0
            L_0x02d8:
                boolean r17 = r32.mo91583x()
                java.lang.String r18 = r32.mo91577r()
                android.widget.TextView r8 = r3.f217441d
                r10 = r14
                r14 = r7
                r7 = r15
                r15 = r6
                r19 = r4
                r20 = r8
                java.lang.String r6 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87364j(r13, r14, r15, r16, r17, r18, r19, r20)
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r8 != 0) goto L_0x031c
                android.widget.TextView r8 = r3.f217441d
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.widget.TextView r12 = r3.f217441d
                android.content.Context r12 = r12.getContext()
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                android.widget.TextView r13 = r3.f217441d
                float r13 = r13.getTextSize()
                android.text.SpannableString r2 = r2.yp0(r12, r6, r13)
                r8.setText(r2)
                android.widget.TextView r2 = r3.f217441d
                r6 = 0
                r2.setVisibility(r6)
            L_0x0319:
                r8 = 8
                goto L_0x033f
            L_0x031c:
                android.widget.TextView r2 = r3.f217441d
                r8 = 8
                r2.setVisibility(r8)
                goto L_0x033f
            L_0x0324:
                r10 = r14
                r7 = r15
                r8 = 8
                android.widget.TextView r2 = r3.f217441d
                int r6 = r33.mo108769t2()
                r12 = 1
                if (r6 != r12) goto L_0x0334
                java.lang.String r6 = r4.f195588j1
                goto L_0x0336
            L_0x0334:
                java.lang.String r6 = r4.f195592k1
            L_0x0336:
                r2.setText(r6)
                android.widget.TextView r2 = r3.f217441d
                r6 = 0
                r2.setVisibility(r6)
            L_0x033f:
                java.lang.String r2 = r4.f195596l1
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r6 == 0) goto L_0x0349
                java.lang.String r2 = r4.f195570f
            L_0x0349:
                android.widget.TextView r6 = r3.f217442e
                r6.setText(r2)
                java.lang.String r2 = r5.f195385b
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                java.lang.String r6 = "drawable"
                if (r2 != 0) goto L_0x0384
                gc0.a r2 = gc0.C20828a.m22825b()
                android.widget.ImageView r12 = r3.f217439b
                java.lang.String r13 = ""
                r2.mo32518g(r13, r12)
                android.content.res.Resources r2 = r32.mo91572m()
                java.lang.String r12 = r5.f195385b
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                int r2 = r2.getIdentifier(r12, r6, r13)
                if (r2 > 0) goto L_0x0385
                android.content.res.Resources r2 = r32.mo91572m()
                java.lang.String r12 = r5.f195385b
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                java.lang.String r14 = "raw"
                int r2 = r2.getIdentifier(r12, r14, r13)
                goto L_0x0385
            L_0x0384:
                r2 = 0
            L_0x0385:
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                r14 = 0
                r13[r14] = r12
                java.lang.String r12 = "MicroMsg.ChattingItemAppMsgC2CTo"
                java.lang.String r14 = "c2c localResId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r14, r13)
                if (r2 <= 0) goto L_0x03a2
                java.lang.String r13 = "set c2cIcon from localRes"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r13)
                android.widget.ImageView r13 = r3.f217439b
                r13.setImageResource(r2)
            L_0x03a2:
                java.lang.String r13 = r4.f195604n1
                boolean r7 = r7.equals(r13)
                if (r7 == 0) goto L_0x03b9
                int r7 = r33.mo108769t2()
                r13 = 1
                if (r7 != r13) goto L_0x03b3
                r7 = 1
                goto L_0x03b4
            L_0x03b3:
                r7 = 0
            L_0x03b4:
                int r7 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87359e(r4, r7)
                goto L_0x03cd
            L_0x03b9:
                r13 = 1
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r7 = r10.f154904e
                int r14 = r7.f154907b
                int r7 = r7.f154908c
                int r15 = r33.mo108769t2()
                if (r15 != r13) goto L_0x03c8
                r13 = 1
                goto L_0x03c9
            L_0x03c8:
                r13 = 0
            L_0x03c9:
                int r7 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87366l(r14, r7, r13)
            L_0x03cd:
                if (r7 <= 0) goto L_0x03da
                java.lang.String r2 = "set c2cIcon from iconRes"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                android.widget.ImageView r2 = r3.f217439b
                r2.setImageResource(r7)
                goto L_0x041b
            L_0x03da:
                if (r2 > 0) goto L_0x041b
                java.lang.String r2 = "set c2cIcon from iconUrl"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                java.lang.String r2 = r4.f195576g1
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r7 == 0) goto L_0x03eb
                java.lang.String r2 = r4.f195646y
            L_0x03eb:
                android.widget.ImageView r4 = r3.f217439b
                r7 = 0
                r4.setImageBitmap(r7)
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r4 != 0) goto L_0x041b
                hc0.c$b r4 = new hc0.c$b
                r4.<init>()
                eb0.c r7 = eb0.C97625j3.m125812b()
                r7.getClass()
                java.lang.String r7 = f12.C7970a.m8128b()
                r4.f59351g = r7
                r7 = 1
                r4.f59346b = r7
                r4.f59363s = r7
                hc0.c r4 = r4.mo32666a()
                gc0.a r7 = gc0.C20828a.m22825b()
                android.widget.ImageView r13 = r3.f217439b
                r7.mo32519h(r2, r13, r4)
            L_0x041b:
                r2 = -1
                java.lang.String r4 = r5.f195386c
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x0432
                android.content.res.Resources r2 = r32.mo91572m()
                java.lang.String r4 = r5.f195386c
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
                int r2 = r2.getIdentifier(r4, r6, r7)
            L_0x0432:
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r7 = 0
                r6[r7] = r4
                java.lang.String r4 = "backgroundResId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r6)
                if (r2 <= 0) goto L_0x044d
                android.view.View r4 = r3.clickArea
                r4.setBackgroundResource(r2)
                android.view.View r2 = r3.clickArea
                r2.setPadding(r7, r7, r7, r7)
            L_0x044d:
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r2 = r10.f154904e
                int r4 = r2.f154907b
                int r2 = r2.f154908c
                int r6 = r33.mo108769t2()
                r7 = 1
                if (r6 != r7) goto L_0x045c
                r6 = 1
                goto L_0x045d
            L_0x045c:
                r6 = 0
            L_0x045d:
                int r6 = com.tencent.p014mm.p136ui.chatting.C73760n0.m87365k(r4, r2, r6)
                com.tencent.mm.autogen.events.WalletQueryHbStatusEvent$b r2 = r10.f154904e
                int r4 = r2.f154907b
                int r2 = r2.f154908c
                r10 = 5
                if (r4 != r10) goto L_0x046c
            L_0x046a:
                r7 = 0
                goto L_0x0477
            L_0x046c:
                r10 = 4
                if (r4 != r10) goto L_0x0470
                goto L_0x046a
            L_0x0470:
                r10 = 3
                if (r4 != r10) goto L_0x0477
                r4 = 2
                if (r2 != r4) goto L_0x0477
                goto L_0x046a
            L_0x0477:
                r3.f217437E = r7
                r4 = 0
                java.lang.String r7 = r32.mo91577r()
                r2 = r3
                r3 = r5
                r5 = r6
                r6 = r7
                r10 = 8
                r7 = r33
                r8 = r32
                com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.m88113b(r2, r3, r4, r5, r6, r7, r8)
                goto L_0x048e
            L_0x048c:
                r10 = 8
            L_0x048e:
                android.view.View r2 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$f r3 = r0.mo103099u(r9)
                r2.setOnClickListener(r3)
                java.lang.String r2 = r32.mo91577r()
                boolean r2 = eb0.C45628s0.m50742G(r2)
                if (r2 != 0) goto L_0x04aa
                android.view.View r2 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r3 = r0.mo103098p(r9)
                r2.setOnLongClickListener(r3)
            L_0x04aa:
                android.view.View r2 = r1.clickArea
                java.lang.Class<zj3.l> r3 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r4 = r9.f193278b
                xi.d r3 = r4.mo102812a(r3)
                zj3.l r3 = (zj3.C79368l) r3
                com.tencent.mm.ui.chatting.h2 r3 = r3.mo108189Z4()
                r2.setOnTouchListener(r3)
                com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
                ck3.b r3 = r0.f217465v
                boolean r3 = r3.mo91583x()
                r4 = r33
                r5 = 0
                r2.<init>(r4, r3, r1, r5)
                android.view.View r3 = r1.clickArea
                r3.setTag(r2)
                com.tencent.mm.ui.chatting.viewitems.l0$a r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74091a) r1
                android.view.View r2 = r1.f217450m
                if (r2 == 0) goto L_0x0570
                boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r2 == 0) goto L_0x051f
                android.view.View r2 = r1.f217450m
                r2.setBackground(r5)
                android.view.View r1 = r1.f217451n
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r2.mo10233c(r11)
                java.lang.Object[] r13 = r2.mo10232b()
                java.lang.String r14 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r15 = "filling"
                java.lang.String r16 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                r12 = r1
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r14 = "filling"
                java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x0570
            L_0x051f:
                android.view.View r2 = r1.f217450m
                android.content.res.Resources r3 = r32.mo91572m()
                r4 = 2131231679(0x7f0803bf, float:1.8079446E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
                r2.setBackground(r3)
                android.view.View r1 = r1.f217451n
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                r2.mo10233c(r3)
                java.lang.Object[] r12 = r2.mo10232b()
                java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r14 = "filling"
                java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r11 = r1
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r12 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$ChattingItemAppMsgC2CTo"
                java.lang.String r13 = "filling"
                java.lang.String r14 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            L_0x0570:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74093c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 436207665;
        }
    }

    /* renamed from: a */
    public static C72963f4.C72966d m88112a(C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u == null) {
            return null;
        }
        boolean equals = "1001".equals(u.f195604n1);
        WalletQueryHbStatusEvent walletQueryHbStatusEvent = new WalletQueryHbStatusEvent();
        if (Util.isNullOrNil(u.f195608o1) || equals) {
            return null;
        }
        walletQueryHbStatusEvent.f154903d.f154905a = u.f195608o1;
        walletQueryHbStatusEvent.publish();
        return new C57782d(walletQueryHbStatusEvent);
    }

    /* renamed from: b */
    public static void m88113b(C74091a aVar, C68062c cVar, boolean z, int i, String str, C72963f4 f4Var, C67391b bVar) {
        int i2;
        int i3;
        String sb02;
        C74091a aVar2 = aVar;
        C68062c cVar2 = cVar;
        boolean z2 = z;
        int i4 = i;
        C72963f4 f4Var2 = f4Var;
        C67391b bVar2 = bVar;
        Class cls = C79358g0.class;
        String str2 = z2 ? cVar2.f195390g : cVar2.f195388e;
        if (z2) {
            String str3 = cVar2.f195391h;
        } else {
            String str4 = cVar2.f195389f;
        }
        String str5 = z2 ? cVar2.f195402s : cVar2.f195400q;
        String str6 = z2 ? cVar2.f195403t : cVar2.f195401r;
        if (C45628s0.m50742G(str) && (sb02 = ((C79442f) C86312j.m106911c(C79442f.class)).sb0(Long.valueOf(aVar2.f217457t))) != null) {
            C75676e.f222286c = sb02;
        }
        if (Util.isNullOrNil(f4Var2.f212667F1)) {
            f4Var2.f212667F1 = UUID.randomUUID().toString();
        }
        String str7 = "";
        if (!aVar2.f217458u) {
            aVar2.f217447j.setImageBitmap((Bitmap) null);
            C68067h hVar = cVar2.f195384E;
            if (hVar == null || Util.isNullOrNil(hVar.f195447m)) {
                if (!Util.isNullOrNil(cVar2.f195387d)) {
                    aVar2.f217445h.setText(cVar2.f195387d);
                    aVar2.f217447j.setVisibility(8);
                    aVar2.f217445h.setVisibility(0);
                } else {
                    aVar2.f217445h.setText(str7);
                    aVar2.f217447j.setVisibility(8);
                    aVar2.f217445h.setVisibility(8);
                }
                i3 = 1;
            } else {
                ImageView imageView = aVar2.f217447j;
                C68067h hVar2 = cVar2.f195384E;
                String str8 = hVar2.f195447m;
                String str9 = hVar2.f195448n;
                String str10 = hVar2.f195445k;
                int i5 = aVar2.f217456s;
                ((C75672b) C86312j.m106911c(C75672b.class)).mo95322b6(imageView, str8, str9, str10, i5, i5);
                aVar2.f217447j.setVisibility(0);
                aVar2.f217445h.setVisibility(8);
                i3 = 2;
            }
            C68067h hVar3 = cVar2.f195384E;
            if (hVar3 == null || hVar3.f195450p != 2) {
                aVar2.f217443f.setVisibility(8);
            } else {
                aVar2.f217443f.setVisibility(0);
            }
            i2 = i3;
        } else {
            i2 = 1;
        }
        if (!Util.isNullOrNil(str2)) {
            if (i4 > 0) {
                aVar2.f217446i.setImageResource(i4);
                aVar2.f217446i.setVisibility(0);
                aVar2.f217444g.setVisibility(0);
                if (!Util.isNullOrNil(str5) && !Util.isNullOrNil(str6)) {
                    aVar2.f217448k.setVisibility(0);
                }
            }
            if (!aVar2.f217458u) {
                aVar2.f217444g.setImageBitmap((Bitmap) null);
                aVar2.f217448k.setImageBitmap((Bitmap) null);
                m88115d(aVar, cVar);
                aVar2.clickArea.post(new C74000h0(aVar2, cVar2, z2, bVar2));
                C115669n.INSTANCE.mo175911u(991, 12);
                Log.m105924i("MicroMsg.ChattingItemAppMsgC2C", "loadEnvelopeRes：reportData");
                C79445i iVar = (C79445i) C86312j.m106911c(C79445i.class);
                String str11 = f4Var2.f212667F1;
                String str12 = cVar2.f195387d;
                C68067h hVar4 = cVar2.f195384E;
                if (hVar4 != null) {
                    str7 = hVar4.f195445k;
                }
                iVar.mo109186Tp(str11, str12, str, str7, (hVar4 == null || !hVar4.f195449o) ? 1 : 2, i2, 1, cVar2.f195388e);
                return;
            }
            if (Util.isNullOrNil(cVar2.f195406w) || !aVar2.f217438F) {
                m88116e(aVar);
            } else if (Util.isNullOrNil(cVar2.f195407x) || (aVar2.f217437E && !((C79358g0) bVar2.f193278b.mo102812a(cls)).mo102456S0(aVar2.f217457t))) {
                aVar2.f217463z.setVisibility(8);
                C77994sf2 sf22 = new C77994sf2();
                sf22.f228201e = cVar2.f195396m;
                C77999tf2 tf22 = new C77999tf2();
                sf22.f228203g = tf22;
                tf22.f228259w = cVar2.f195406w;
                tf22.f228239A = cVar2.f195408y;
                ((C79358g0) bVar2.f193278b.mo102812a(cls)).mo102457Y0(sf22, aVar2, 2);
            } else {
                aVar2.f217463z.setVisibility(0);
                aVar2.f217461x.mo21226m();
                View view = aVar2.f217462y;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "loadEnvelopeRes", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;ZILjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "loadEnvelopeRes", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;ZILjava/lang/String;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (Util.isNullOrNil(str5) || Util.isNullOrNil(str6) || aVar2.f217448k.getVisibility() != 0) {
                aVar2.f217448k.setVisibility(8);
                aVar2.f217448k.setImageBitmap((Bitmap) null);
                return;
            }
            MMHandlerThread.postToMainThread(new C74037i0(aVar2, z2));
            return;
        }
        aVar2.f217446i.setVisibility(8);
        aVar2.f217444g.setVisibility(8);
        aVar2.f217444g.setImageBitmap((Bitmap) null);
        aVar2.f217448k.setVisibility(8);
        aVar2.f217448k.setImageBitmap((Bitmap) null);
        m88117f(aVar2, 0, z2);
        m88115d(aVar, cVar);
    }

    /* renamed from: c */
    public static boolean m88114c() {
        float p = C76577a.m92165p(MMApplicationContext.getContext());
        return C85875k4.m106153J(p, C76577a.m92169t(MMApplicationContext.getContext())) || C85875k4.m106153J(p, C76577a.m92170u(MMApplicationContext.getContext()));
    }

    /* renamed from: d */
    public static void m88115d(C74091a aVar, C68062c cVar) {
        aVar.f217461x.mo21226m();
        aVar.f217461x.mo21222i(aVar.f217436D);
        aVar.f217436D = null;
        View view = aVar.f217462y;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagAll", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagAll", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        aVar.f217463z.setImageBitmap((Bitmap) null);
        aVar.f217463z.setVisibility(8);
        aVar.f217438F = true;
        aVar.f217435C = cVar.f195396m;
        aVar.f217433A = cVar.f195406w;
        aVar.f217434B = cVar.f195408y;
    }

    /* renamed from: e */
    public static void m88116e(C74091a aVar) {
        aVar.f217461x.mo21226m();
        View view = aVar.f217462y;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        aVar.f217463z.setVisibility(8);
    }

    /* renamed from: f */
    public static void m88117f(C74091a aVar, int i, boolean z) {
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.f217449l.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aVar.clickArea.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) aVar.f217448k.getLayoutParams();
            layoutParams3.topMargin = 0;
            TextView textView = aVar.userTV;
            if (textView == null || textView.getVisibility() != 0 || Util.isNullOrNil(aVar.userTV.getText().toString())) {
                layoutParams.topMargin = i;
                layoutParams2.removeRule(3);
                layoutParams2.topMargin = i;
            } else {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) aVar.userTV.getLayoutParams();
                layoutParams2.addRule(3, C0966R.C0970id.b9_);
                layoutParams2.topMargin = 0;
                if (i != 0) {
                    int height = (i - aVar.userTV.getHeight()) - layoutParams4.bottomMargin;
                    if (!(height == 0 || height == -1 || height == 1)) {
                        if (height > 0) {
                            layoutParams.topMargin = height;
                            layoutParams4.topMargin = height;
                            layoutParams2.topMargin = 0;
                        } else {
                            layoutParams.topMargin = 0;
                            layoutParams4.topMargin = 0;
                            layoutParams2.topMargin = 0;
                            float f = 1.0f;
                            if (m88114c()) {
                                float p = C76577a.m92165p(MMApplicationContext.getContext());
                                if (C85875k4.m106153J(p, C76577a.m92169t(MMApplicationContext.getContext()))) {
                                    f = C76577a.m92169t(MMApplicationContext.getContext());
                                } else if (C85875k4.m106153J(p, C76577a.m92170u(MMApplicationContext.getContext()))) {
                                    f = C76577a.m92170u(MMApplicationContext.getContext());
                                }
                            }
                            layoutParams3.topMargin = Math.abs((int) (((float) height) / f));
                        }
                    }
                } else {
                    layoutParams.topMargin = 0;
                    layoutParams4.topMargin = 0;
                    layoutParams2.topMargin = 0;
                }
                aVar.userTV.setLayoutParams(layoutParams4);
                int i2 = aVar.f217460w;
                TextView textView2 = aVar.userTV;
                if (textView2 != null && textView2.getVisibility() == 0 && !Util.isNullOrNil(aVar.userTV.getText().toString())) {
                    int b = C76577a.m92151b(MMApplicationContext.getContext(), 7);
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) aVar.userTV.getLayoutParams();
                    layoutParams5.bottomMargin = C76577a.m92151b(MMApplicationContext.getContext(), 3) / 2;
                    if (m88114c()) {
                        aVar.userTV.setIncludeFontPadding(false);
                    } else {
                        aVar.userTV.setIncludeFontPadding(true);
                    }
                    ImageView imageView = aVar.f217448k;
                    if (imageView == null || imageView.getVisibility() != 0) {
                        layoutParams5.width = -2;
                        aVar.userTV.setLayoutParams(layoutParams5);
                        aVar.userTV.setPadding(b, 0, b, 0);
                    } else {
                        if (i2 != 0) {
                            layoutParams5.width = i2;
                        }
                        aVar.userTV.setLayoutParams(layoutParams5);
                        aVar.userTV.setEllipsize(TextUtils.TruncateAt.END);
                        aVar.userTV.setPadding(b, 0, 0, 0);
                    }
                }
            }
            aVar.f217449l.setLayoutParams(layoutParams);
            aVar.clickArea.setLayoutParams(layoutParams2);
            aVar.f217448k.setLayoutParams(layoutParams3);
            return;
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) aVar.f217449l.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) aVar.clickArea.getLayoutParams();
        if (i != 0) {
            layoutParams6.topMargin = i - C76577a.m92151b(MMApplicationContext.getContext(), 6);
            layoutParams7.topMargin = i;
            View view = aVar.f217452o;
            if (view != null) {
                RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams8.topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 6);
                layoutParams8.bottomMargin = C76577a.m92151b(MMApplicationContext.getContext(), 6);
                aVar.f217452o.setLayoutParams(layoutParams8);
            }
        } else {
            layoutParams6.topMargin = i;
            layoutParams7.topMargin = C76577a.m92151b(MMApplicationContext.getContext(), 6);
            View view2 = aVar.f217452o;
            if (view2 != null) {
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                layoutParams9.topMargin = 0;
                layoutParams9.bottomMargin = 0;
                aVar.f217452o.setLayoutParams(layoutParams9);
            }
        }
        aVar.f217449l.setLayoutParams(layoutParams6);
        aVar.clickArea.setLayoutParams(layoutParams7);
    }
}

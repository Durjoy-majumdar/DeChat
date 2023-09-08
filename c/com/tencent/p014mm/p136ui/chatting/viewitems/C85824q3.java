package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.GiftCardEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WxaUpdatableMsgReportStruct;
import com.tencent.p014mm.message.C68068i;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.component.C19729d;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C86493v0;
import gc0.C20828a;
import hc0.C20937c;
import i21.C98591h;
import java.lang.ref.WeakReference;
import java.util.Locale;
import js0.C9515s;
import kb0.C33865k;
import kb0.C76529i;
import kb0.C88132b;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76629w0;
import lb0.C88394b;
import nj3.C76874e0;
import org.json.JSONException;
import org.json.JSONObject;
import p158gt.C98201k;
import p270xi.C66282i;
import p270xi.C78839k;
import p763ym.C79138l;
import te3.el4;
import v90.C37702d;
import wd3.C53155r0;
import zj3.C79368l;
import zj3.C79371n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q3 */
public final class C85824q3 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$a */
    public static class C85825a extends C74023i {

        /* renamed from: v */
        public C67391b f249956v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$a$a */
        public class C85826a implements C88394b.C88411m {

            /* renamed from: d */
            public final /* synthetic */ C85833e f249957d;

            public C85826a(C85825a aVar, C85833e eVar) {
                this.f249957d = eVar;
            }

            /* renamed from: b */
            public void mo1907b() {
            }

            /* renamed from: d */
            public void mo1908d() {
            }

            public String key() {
                return String.format(Locale.ENGLISH, "CHATTING_ITEM_APPMSG_APPBRAND_COVER[%d %d]", new Object[]{240, 192});
            }

            public void onBitmapLoaded(Bitmap bitmap) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f249957d.f249981q.setVisibility(4);
                    this.f249957d.f249982r.setVisibility(0);
                    return;
                }
                this.f249957d.f249981q.setImageBitmap(bitmap);
                this.f249957d.f249981q.setVisibility(0);
                this.f249957d.f249982r.setVisibility(4);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$a$b */
        public class C85827b implements C33865k.C33866a {

            /* renamed from: a */
            public final /* synthetic */ C85833e f249958a;

            /* renamed from: b */
            public final /* synthetic */ C80995a f249959b;

            public C85827b(C85825a aVar, C85833e eVar, C80995a aVar2) {
                this.f249958a = eVar;
                this.f249959b = aVar2;
            }

            /* renamed from: a */
            public void mo59343a(String str, el4 el4) {
                C37702d Ag;
                Log.m105919d("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "ShareKey:%s UpdatableMsgInfo:%s", str, el4.f133000f);
                TextView textView = this.f249958a.f249976l;
                if (textView == null) {
                    Log.m105928w("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "viewHolder.appbrandUpdateTv is null, return");
                    return;
                }
                String str2 = (String) textView.getTag();
                if (Util.isNullOrNil(str2)) {
                    Log.m105928w("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "oriShareKey is null, return");
                } else if (str2.equals(str)) {
                    this.f249958a.f249976l.setVisibility(0);
                    this.f249958a.f249976l.setText(el4.f133000f);
                    TextView textView2 = this.f249958a.f249976l;
                    textView2.setTextColor(Util.convertStringToRGB(el4.f133001g, textView2.getCurrentTextColor()));
                    if (el4.f133003i != 1 || (Ag = ((C33865k) C86312j.m106911c(C33865k.class)).mo59335Ag(str)) == null || Ag.field_btnState != 1) {
                        return;
                    }
                    if (Util.isNullOrNil(this.f249959b.f237902k)) {
                        this.f249958a.f249984t.setVisibility(8);
                        return;
                    }
                    this.f249958a.f249984t.setVisibility(0);
                    this.f249958a.f249984t.setText(this.f249959b.f237902k);
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6904rs);
            C85833e eVar = new C85833e();
            eVar.mo119748a(n4Var, true);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C74244u.C74247d.m88515e(bVar, f4Var, mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            Class cls = C79138l.class;
            int b = ((C74243t8) view.getTag()).mo103252b();
            C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f249956v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
            if (((C79138l) C86312j.m106911c(cls)).E10(((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false)) && !C74343y0.m88768l(f4Var)) {
                if (u.f195582i == 6) {
                    C72683d g = C72695v.m85065g(u.f195606o);
                    if ((g == null || !C73521l0.m86925b(f4Var, g.field_fileFullPath)) && !f4Var.mo100972K3()) {
                        e0Var.mo107136c(b, 111, 0, this.f249956v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                    }
                } else {
                    e0Var.mo107136c(b, 111, 0, this.f249956v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
            }
            if (this.f249956v.mo91584y()) {
                return true;
            }
            e0Var.mo107136c(b, 100, 0, this.f249956v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            C68144a.m80547c(f4Var, C68144a.C68145a.Click);
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            boolean z = false;
            if (f4Var.getContent() == null || (u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null)) == null) {
                return false;
            }
            C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(u.f195562d, false);
            if (GW != null) {
                mo103094j(bVar, u, mo103097o(bVar, f4Var), GW, f4Var.mo108774y2(), bVar.mo91577r());
            }
            Log.m105925i("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "username: %s , path: %s ,appid %s ,url : %s, pkgType : %s, md5 : %s", u.f195573f2, u.f195569e2, u.f195577g2, u.f195586j, Integer.valueOf(u.f195653z2), u.f195585i2);
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9533h = u.f195577g2;
            aVar.f9526a = u.f195573f2;
            aVar.f9527b = u.f195569e2;
            int i = u.f195653z2;
            aVar.f9528c = i;
            aVar.f9537l = u.f195585i2;
            aVar.f9534i = u.f195467A2;
            if (i != 0) {
                z = true;
            }
            aVar.f9538m = z;
            aVar.f9540o.f237918d = bVar.mo91577r();
            startAppBrandUIFromOuterEvent.f9522d.f9540o.f237919e = u.f195593k2;
            String str = u.f195589j2;
            if (bVar.mo91583x()) {
                startAppBrandUIFromOuterEvent.f9522d.f9529d = 1008;
                startAppBrandUIFromOuterEvent.f9522d.f9530e = bVar.mo91577r() + XVFSFile.PATH_SEPARATOR + mo103068y(bVar, f4Var) + XVFSFile.PATH_SEPARATOR + str;
            } else {
                startAppBrandUIFromOuterEvent.f9522d.f9529d = 1007;
                startAppBrandUIFromOuterEvent.f9522d.f9530e = mo103068y(bVar, f4Var) + XVFSFile.PATH_SEPARATOR + str;
            }
            C85824q3.m106047c(startAppBrandUIFromOuterEvent, u);
            startAppBrandUIFromOuterEvent.publish();
            C85824q3.m106048d(bVar, u);
            C19729d.m21410g6(bVar, view, f4Var);
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return new C85832d();
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C68070l.C68072b bVar2;
            int i;
            C74023i.C74026c cVar2 = cVar;
            C67391b bVar3 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C33865k.class;
            Class cls2 = C79138l.class;
            this.f249956v = bVar3;
            C85833e eVar = (C85833e) cVar2;
            C79371n nVar = (C79371n) bVar3.f193278b.mo102812a(C79371n.class);
            nVar.mo102405C3(f4Var2);
            nVar.mo102409q3(f4Var2);
            nVar.mo102406W4(f4Var2);
            C19729d.m21411h6(bVar3, cVar2.convertView, f4Var2);
            String content = f4Var.getContent();
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            } else {
                Log.m105921e("MicroMsg.ChattingItemAppMsgWxaDynamicFrom", "amessage, msgid:%s, user:%s", Long.valueOf(f4Var.getMsgId()), str);
                bVar2 = null;
            }
            C74243t8 t8Var = new C74243t8(f4Var2, bVar.mo91583x(), cVar2, (String) null);
            if (bVar2 != null) {
                eVar.f249968d.setVisibility(8);
                eVar.f249967c.setVisibility(8);
                eVar.f249980p.setVisibility(8);
                C68068i iVar = (C68068i) bVar2.mo93555w(C68068i.class);
                eVar.clickArea.setBackgroundResource(C0966R.C0969drawable.f4813nm);
                C44561j UV = ((C79138l) C86312j.m106911c(cls2)).mo74003UV(bVar2.f195562d, bVar2.f195480E);
                if (UV != null) {
                    mo103095k(bVar3, bVar2, f4Var2);
                }
                String str2 = bVar2.f195642x;
                if (str2 == null || str2.length() == 0) {
                    eVar.f249969e.setVisibility(8);
                } else {
                    eVar.f249969e.setVisibility(0);
                    mo103073G(bVar3, eVar.f249969e, C74243t8.m88488a(bVar2.f195642x));
                }
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar2.f195573f2);
                eVar.f249971g.setVisibility(0);
                eVar.f249966b.setVisibility(8);
                eVar.f249973i.setVisibility(0);
                eVar.f249972h.setVisibility(8);
                eVar.f249978n.setText(N2 != null ? N2.field_nickname : bVar2.f195638w);
                String str3 = N2 != null ? N2.field_smallHeadURL : bVar2.f195471B2;
                C20828a.m22825b().mo32519h(str3, eVar.f249977m, C85833e.f249965u);
                eVar.f249980p.setVisibility(0);
                eVar.f249975k.setVisibility(8);
                eVar.f249975k.setText(bVar2.f195574g);
                eVar.f249983s.setText(bVar2.f195570f);
                int i2 = bVar2.f195653z2;
                if (i2 == 1) {
                    eVar.f249979o.setText(C0966R.string.f7869ui);
                } else if (i2 != 2) {
                    eVar.f249979o.setText(C0966R.string.f7674nk);
                } else {
                    eVar.f249979o.setText(C0966R.string.f7868uh);
                }
                C20828a.m22825b().mo32519h(str3, eVar.f249977m, C85833e.f249965u);
                if (bVar.mo91583x()) {
                    eVar.f249970f.setVisibility(8);
                } else if (((C79138l) C86312j.m106911c(cls2)).mo73991JL(UV)) {
                    eVar.f249970f.setVisibility(0);
                    ImageView imageView = eVar.f249970f;
                    C74243t8 t8Var2 = new C74243t8();
                    t8Var2.f217989w = bVar2;
                    t8Var2.f212238a = f4Var2;
                    mo103072F(bVar3, imageView, t8Var2);
                } else {
                    eVar.f249970f.setVisibility(8);
                }
                String h302 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2());
                eVar.f249981q.setImageBitmap((Bitmap) null);
                eVar.f249981q.setVisibility(4);
                eVar.f249982r.setVisibility(0);
                String str4 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122797p(new C85826a(this, eVar), "file://" + h302, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(C76529i.class)).Ij0(240, 192));
                eVar.f249976l.setVisibility(8);
                eVar.f249976l.setTag(Util.nullAs(bVar2.f195593k2, ""));
                eVar.f249984t.setVisibility(8);
                C80995a aVar = (C80995a) bVar2.mo93555w(C80995a.class);
                if (aVar != null && aVar.f237896e) {
                    String str5 = bVar2.f195593k2;
                    C37702d Ag = ((C33865k) C86312j.m106911c(cls)).mo59335Ag(str5);
                    C85824q3.m106045a(bVar3, eVar, aVar, Ag);
                    C85824q3.m106046b(bVar3, eVar, aVar, bVar2, Ag);
                    int i3 = (Ag == null || (i = Ag.field_updatePeroid) == 0) ? aVar.f237903l : i;
                    if (i3 > 0) {
                        ((C33865k) C86312j.m106911c(cls)).c60(C85834f.m106081a(bVar), bVar2.f195577g2, str5, i3, new C85827b(this, eVar, aVar));
                    }
                }
                C88132b.m109732c(bVar2.f195573f2, N2, bVar2);
            }
            eVar.clickArea.setTag(t8Var);
            eVar.clickArea.setOnClickListener(mo103099u(bVar3));
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C85834f.m106081a(bVar), true);
            C85831c cVar3 = (C85831c) c.mo120956c(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null);
            if (cVar3 == null) {
                cVar3 = new C85831c();
                c.mo120962i(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, cVar3);
            }
            cVar3.f249964d = new WeakReference<>(bVar3);
            ((C66282i) bVar3.f193278b.mo102812a(C66282i.class)).mo90405j4(cVar3);
            if (this.f217197d) {
                eVar.clickArea.setOnLongClickListener(mo103098p(bVar3));
                eVar.clickArea.setOnTouchListener(((C79368l) bVar3.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 587202609;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$b */
    public static class C85828b extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f249960v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$b$a */
        public class C85829a implements C88394b.C88411m {

            /* renamed from: d */
            public final /* synthetic */ C85833e f249961d;

            public C85829a(C85828b bVar, C85833e eVar) {
                this.f249961d = eVar;
            }

            /* renamed from: b */
            public void mo1907b() {
            }

            /* renamed from: d */
            public void mo1908d() {
            }

            public String key() {
                return String.format(Locale.ENGLISH, "CHATTING_ITEM_APPMSG_APPBRAND_COVER[%d %d]", new Object[]{240, 192});
            }

            public void onBitmapLoaded(Bitmap bitmap) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f249961d.f249981q.setVisibility(4);
                    this.f249961d.f249982r.setVisibility(0);
                    return;
                }
                this.f249961d.f249981q.setImageBitmap(bitmap);
                this.f249961d.f249981q.setVisibility(0);
                this.f249961d.f249982r.setVisibility(4);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$b$b */
        public class C85830b implements C33865k.C33866a {

            /* renamed from: a */
            public final /* synthetic */ C85833e f249962a;

            /* renamed from: b */
            public final /* synthetic */ C80995a f249963b;

            public C85830b(C85828b bVar, C85833e eVar, C80995a aVar) {
                this.f249962a = eVar;
                this.f249963b = aVar;
            }

            /* renamed from: a */
            public void mo59343a(String str, el4 el4) {
                C37702d Ag;
                Log.m105919d("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "ShareKey:%s UpdatableMsgInfo:%s", str, el4.f133000f);
                TextView textView = this.f249962a.f249976l;
                if (textView == null) {
                    Log.m105928w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "viewHolder.appbrandUpdateTv is null, return");
                    return;
                }
                String str2 = (String) textView.getTag();
                if (Util.isNullOrNil(str2)) {
                    Log.m105928w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "oriShareKey is null, return");
                } else if (str2.equals(str)) {
                    this.f249962a.f249976l.setVisibility(0);
                    this.f249962a.f249976l.setText(el4.f133000f);
                    TextView textView2 = this.f249962a.f249976l;
                    textView2.setTextColor(Util.convertStringToRGB(el4.f133001g, textView2.getCurrentTextColor()));
                    if (el4.f133003i != 1 || (Ag = ((C33865k) C86312j.m106911c(C33865k.class)).mo59335Ag(str)) == null || Ag.field_btnState != 1) {
                        return;
                    }
                    if (Util.isNullOrNil(this.f249963b.f237902k)) {
                        this.f249962a.f249984t.setVisibility(8);
                        return;
                    }
                    this.f249962a.f249984t.setVisibility(0);
                    this.f249962a.f249984t.setText(this.f249963b.f237902k);
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6954t9);
            C85833e eVar = new C85833e();
            eVar.mo119748a(n4Var, false);
            n4Var.setTag(eVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            int itemId = menuItem.getItemId();
            if (itemId == 103) {
                String content = f4Var.getContent();
                if (!(content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null || u.f195582i != 16)) {
                    GiftCardEvent giftCardEvent = new GiftCardEvent();
                    GiftCardEvent.C67716a aVar = giftCardEvent.f193670d;
                    aVar.f193671a = u.f195522Q0;
                    aVar.f193672b = f4Var.getMsgId();
                    giftCardEvent.f193670d.f193673c = f4Var.mo108768t();
                    giftCardEvent.publish();
                }
                return false;
            } else if (itemId != 111) {
                return false;
            } else {
                C74244u.C74247d.m88515e(bVar, f4Var, mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C68070l.C68072b u;
            Class cls = C79138l.class;
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var.getContent() == null || (u = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f249960v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null)) == null) {
                return true;
            }
            if (((C79138l) C86312j.m106911c(cls)).E10(((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false)) && !C74343y0.m88768l(f4Var)) {
                e0Var.mo107136c(b, 111, 0, this.f249960v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f249960v) && mo103081O(f4Var.mo108768t())) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
            }
            if (!this.f249960v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, this.f249960v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            if (f4Var.mo101020w3()) {
                C72695v.m85081w(f4Var);
                C75604z3.m90834f(f4Var.getMsgId());
                bVar.mo91541B(true);
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            C74243t8 t8Var = (C74243t8) view.getTag();
            String content = f4Var.getContent();
            boolean z = false;
            if (content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null) {
                return false;
            }
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(u.f195562d);
            if (appInfo != null && !Util.isNullOrNil(appInfo.field_appId)) {
                mo103094j(bVar, u, C75592q0.m90789s(), appInfo, f4Var.mo108774y2(), bVar.mo91577r());
            }
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9533h = u.f195577g2;
            aVar.f9526a = u.f195573f2;
            aVar.f9527b = u.f195569e2;
            int i = u.f195653z2;
            aVar.f9528c = i;
            aVar.f9537l = u.f195585i2;
            aVar.f9534i = u.f195467A2;
            if (i != 0) {
                z = true;
            }
            aVar.f9538m = z;
            String str = u.f195589j2;
            if (bVar.mo91583x()) {
                startAppBrandUIFromOuterEvent.f9522d.f9529d = 1008;
                startAppBrandUIFromOuterEvent.f9522d.f9530e = bVar.mo91577r() + XVFSFile.PATH_SEPARATOR + mo103068y(bVar, f4Var) + XVFSFile.PATH_SEPARATOR + str;
            } else {
                startAppBrandUIFromOuterEvent.f9522d.f9529d = 1007;
                startAppBrandUIFromOuterEvent.f9522d.f9530e = mo103068y(bVar, f4Var) + XVFSFile.PATH_SEPARATOR + str;
            }
            startAppBrandUIFromOuterEvent.f9522d.f9540o.f237918d = bVar.mo91577r();
            startAppBrandUIFromOuterEvent.f9522d.f9540o.f237919e = u.f195593k2;
            C85824q3.m106047c(startAppBrandUIFromOuterEvent, u);
            startAppBrandUIFromOuterEvent.publish();
            C85824q3.m106048d(bVar, u);
            C19729d.m21410g6(bVar, view, f4Var);
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return new C85832d();
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            int i;
            C74023i.C74026c cVar2 = cVar;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C33865k.class;
            Class cls2 = C79368l.class;
            C85833e eVar = (C85833e) cVar2;
            this.f249960v = bVar2;
            C79371n nVar = (C79371n) bVar2.f193278b.mo102812a(C79371n.class);
            nVar.mo102406W4(f4Var2);
            C19729d.m21411h6(bVar2, cVar2.convertView, f4Var2);
            String content = f4Var.getContent();
            nVar.mo102405C3(f4Var2);
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            C74243t8 t8Var = new C74243t8(f4Var2, bVar.mo91583x(), cVar2, (String) null);
            if (u != null) {
                eVar.f249968d.setVisibility(8);
                eVar.f249967c.setVisibility(8);
                eVar.f249966b.setVisibility(8);
                eVar.f249980p.setVisibility(8);
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(u.f195573f2);
                String str2 = N2 != null ? N2.field_nickname : u.f195638w;
                String str3 = N2 != null ? N2.field_smallHeadURL : u.f195471B2;
                eVar.f249980p.setVisibility(0);
                eVar.f249975k.setVisibility(8);
                eVar.f249983s.setText(u.f195570f);
                eVar.f249975k.setText(u.f195574g);
                eVar.f249978n.setText(str2);
                int i2 = u.f195653z2;
                if (i2 == 1) {
                    eVar.f249979o.setText(C0966R.string.f7869ui);
                } else if (i2 != 2) {
                    eVar.f249979o.setText(C0966R.string.f7674nk);
                } else {
                    eVar.f249979o.setText(C0966R.string.f7868uh);
                }
                C20828a.m22825b().mo32519h(str3, eVar.f249977m, C85833e.f249965u);
                if (C74023i.m87878T()) {
                    C79368l lVar = (C79368l) bVar2.f193278b.mo102812a(cls2);
                    if (f4Var.getStatus() != 2 || !mo103080N(lVar, f4Var.getMsgId())) {
                        ImageView imageView = eVar.f249974j;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                    } else {
                        ImageView imageView2 = eVar.f249974j;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                        }
                    }
                    mo103093i0(cVar2, false, true);
                } else {
                    mo103093i0(cVar2, f4Var.getStatus() < 2, true);
                }
                String h302 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2());
                eVar.f249981q.setImageBitmap((Bitmap) null);
                eVar.f249981q.setVisibility(4);
                eVar.f249982r.setVisibility(0);
                String str4 = C88394b.f255384g;
                C88394b bVar3 = C88394b.C88418q.f255427a;
                C85829a aVar = new C85829a(this, eVar);
                bVar3.mo122797p(aVar, "file://" + h302, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(C76529i.class)).Ij0(240, 192));
                eVar.f249976l.setVisibility(8);
                eVar.f249976l.setTag(Util.nullAs(u.f195593k2, ""));
                eVar.f249984t.setVisibility(8);
                C80995a aVar2 = (C80995a) u.mo93555w(C80995a.class);
                if (aVar2 != null && aVar2.f237896e) {
                    String str5 = u.f195593k2;
                    C37702d Ag = ((C33865k) C86312j.m106911c(cls)).mo59335Ag(str5);
                    C85824q3.m106045a(bVar2, eVar, aVar2, Ag);
                    C85824q3.m106046b(bVar2, eVar, aVar2, u, Ag);
                    int i3 = (Ag == null || (i = Ag.field_updatePeroid) == 0) ? aVar2.f237903l : i;
                    if (i3 > 0) {
                        ((C33865k) C86312j.m106911c(cls)).c60(C85834f.m106081a(bVar), u.f195577g2, str5, i3, new C85830b(this, eVar, aVar2));
                    }
                }
                C88132b.m109732c(u.f195573f2, N2, u);
            }
            eVar.clickArea.setTag(t8Var);
            eVar.clickArea.setOnClickListener(mo103099u(bVar2));
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C85834f.m106081a(bVar), true);
            C85831c cVar3 = (C85831c) c.mo120956c(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, null);
            if (cVar3 == null) {
                cVar3 = new C85831c();
                c.mo120962i(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, cVar3);
            }
            cVar3.f249964d = new WeakReference<>(bVar2);
            ((C66282i) bVar2.f193278b.mo102812a(C66282i.class)).mo90405j4(cVar3);
            if (this.f217197d) {
                eVar.clickArea.setOnLongClickListener(mo103098p(bVar2));
                eVar.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(cls2)).mo108189Z4());
            }
            mo103087e0(eVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 587202609;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$c */
    public static class C85831c implements C78839k {

        /* renamed from: d */
        public WeakReference<C67391b> f249964d;

        /* renamed from: F4 */
        public void mo26186F4() {
            ((C33865k) C86312j.m106911c(C33865k.class)).Du0();
        }

        /* renamed from: G4 */
        public void mo26160G4() {
            ((C33865k) C86312j.m106911c(C33865k.class)).mo59338KN();
        }

        /* renamed from: O4 */
        public void mo26162O4() {
        }

        /* renamed from: e */
        public void mo70065e() {
        }

        /* renamed from: g5 */
        public void mo70046g5() {
        }

        /* renamed from: n2 */
        public void mo26199n2() {
        }

        /* renamed from: u5 */
        public void mo26170u5() {
            C67391b bVar;
            Log.m105924i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimStart, then detach DynamicPageView.");
            WeakReference<C67391b> weakReference = this.f249964d;
            if (weakReference != null && (bVar = weakReference.get()) != null) {
                C86493v0.m107224d().mo120948e(C85834f.m106081a(bVar));
                ((C66282i) bVar.f193278b.mo102812a(C66282i.class)).mo90406z0(this);
                ((C33865k) C86312j.m106911c(C33865k.class)).mo59337HJ(C85834f.m106081a(bVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$d */
    public static class C85832d implements C72963f4.C72966d<C85832d> {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo82132a(Object obj) {
            C85832d dVar = (C85832d) obj;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$e */
    public static class C85833e extends C74023i.C74026c {

        /* renamed from: u */
        public static C20937c f249965u;

        /* renamed from: b */
        public ImageView f249966b;

        /* renamed from: c */
        public ImageView f249967c;

        /* renamed from: d */
        public ImageView f249968d;

        /* renamed from: e */
        public TextView f249969e;

        /* renamed from: f */
        public ImageView f249970f;

        /* renamed from: g */
        public LinearLayout f249971g;

        /* renamed from: h */
        public ViewGroup f249972h;

        /* renamed from: i */
        public LinearLayout f249973i;

        /* renamed from: j */
        public ImageView f249974j;

        /* renamed from: k */
        public TextView f249975k;

        /* renamed from: l */
        public TextView f249976l;

        /* renamed from: m */
        public ImageView f249977m;

        /* renamed from: n */
        public TextView f249978n;

        /* renamed from: o */
        public TextView f249979o;

        /* renamed from: p */
        public LinearLayout f249980p;

        /* renamed from: q */
        public ImageView f249981q;

        /* renamed from: r */
        public ImageView f249982r;

        /* renamed from: s */
        public TextView f249983s;

        /* renamed from: t */
        public TextView f249984t;

        static {
            C76577a.m92151b(MMApplicationContext.getContext(), 240);
            C76577a.m92151b(MMApplicationContext.getContext(), 192);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.raw.app_brand_app_default_icon_for_tail;
            int b = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 20);
            bVar.f59354j = b;
            bVar.f59355k = b2;
            bVar.f59345a = true;
            f249965u = bVar.mo32666a();
        }

        /* renamed from: a */
        public C85833e mo119748a(View view, boolean z) {
            super.create(view);
            this.f249966b = (ImageView) view.findViewById(C0966R.C0970id.b3h);
            this.f249967c = (ImageView) this.convertView.findViewById(C0966R.C0970id.b4g);
            this.f249968d = (ImageView) this.convertView.findViewById(C0966R.C0970id.b8y);
            this.f249969e = (TextView) view.findViewById(C0966R.C0970id.b2v);
            this.f249970f = (ImageView) view.findViewById(C0966R.C0970id.b3b);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            ChattingItemFooter chattingItemFooter = (ChattingItemFooter) view.findViewById(C0966R.C0970id.ecx);
            this.f249971g = (LinearLayout) view.findViewById(C0966R.C0970id.f6053w0);
            this.f249972h = (ViewGroup) view.findViewById(C0966R.C0970id.g4s);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.g4p);
            this.f249973i = (LinearLayout) view.findViewById(C0966R.C0970id.b3p);
            this.clickArea = view.findViewById(C0966R.C0970id.b47);
            if (!z) {
                this.f249974j = (ImageView) this.convertView.findViewById(C0966R.C0970id.b8x);
                this.uploadingPB = (ProgressBar) this.convertView.findViewById(C0966R.C0970id.f359466l14);
            }
            this.f249980p = (LinearLayout) view.findViewById(C0966R.C0970id.b2d);
            this.f249981q = (ImageView) view.findViewById(C0966R.C0970id.b2e);
            this.f249982r = (ImageView) view.findViewById(C0966R.C0970id.cku);
            this.f249983s = (TextView) view.findViewById(C0966R.C0970id.b2o);
            this.f249975k = (TextView) view.findViewById(C0966R.C0970id.b2f);
            this.f249976l = (TextView) view.findViewById(C0966R.C0970id.b2u);
            this.f249977m = (ImageView) view.findViewById(C0966R.C0970id.b2q);
            this.f249978n = (TextView) view.findViewById(C0966R.C0970id.b2s);
            this.f249979o = (TextView) view.findViewById(C0966R.C0970id.b2r);
            this.f249984t = (TextView) view.findViewById(C0966R.C0970id.b2t);
            return this;
        }

        public View getMainContainerView() {
            return this.f249973i;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.q3$f */
    public static class C85834f {
        /* renamed from: a */
        public static String m106081a(Object obj) {
            return "WxaUpdatableMsg#" + C9515s.m9209a(obj);
        }
    }

    /* renamed from: a */
    public static void m106045a(C67391b bVar, C85833e eVar, C80995a aVar, C37702d dVar) {
        if (dVar != null && !Util.isNullOrNil(dVar.field_content)) {
            eVar.f249976l.setVisibility(0);
            eVar.f249976l.setText(dVar.field_content);
            eVar.f249976l.setTextColor(Util.convertStringToRGB(dVar.field_contentColor, bVar.mo91565f().getResources().getColor(C0966R.color.a7f)));
        } else if (!Util.isNullOrNil(aVar.f237897f)) {
            eVar.f249976l.setVisibility(0);
            eVar.f249976l.setText(aVar.f237897f);
            eVar.f249976l.setTextColor(Util.convertStringToRGB(aVar.f237898g, bVar.mo91565f().getResources().getColor(C0966R.color.a7f)));
        } else {
            eVar.f249976l.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static void m106046b(C67391b bVar, C85833e eVar, C80995a aVar, C68070l.C68072b bVar2, C37702d dVar) {
        if (dVar != null) {
            int i = dVar.field_btnState;
            if (i == 0) {
                eVar.f249984t.setVisibility(8);
            } else if (i == 1) {
                if (dVar.field_msgState != 1) {
                    eVar.f249984t.setVisibility(0);
                    String replace = aVar.f237899h.replace("$button$", aVar.f237900i);
                    SpannableString spannableString = new SpannableString(replace);
                    spannableString.setSpan(new C85823p3(1, (C53155r0) null, bVar2, eVar, aVar.f237901j, bVar, aVar), replace.indexOf(aVar.f237900i), replace.indexOf(aVar.f237900i) + aVar.f237900i.length(), 17);
                    eVar.f249984t.setMovementMethod(LinkMovementMethod.getInstance());
                    eVar.f249984t.setText(spannableString);
                } else if (Util.isNullOrNil(aVar.f237902k)) {
                    eVar.f249984t.setVisibility(8);
                } else {
                    eVar.f249984t.setVisibility(0);
                    eVar.f249984t.setText(aVar.f237902k);
                }
            } else if (i == 2) {
                eVar.f249984t.setVisibility(0);
                eVar.f249984t.setText(aVar.f237901j);
            }
        } else {
            eVar.f249984t.setVisibility(8);
        }
    }

    /* renamed from: c */
    public static void m106047c(StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent, C68070l.C68072b bVar) {
        C80995a aVar;
        String str;
        if (startAppBrandUIFromOuterEvent != null && bVar != null && (aVar = (C80995a) bVar.mo93555w(C80995a.class)) != null) {
            boolean z = aVar.f237912u;
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            try {
                new JSONObject();
                str = new JSONObject().put("isPrivateMessage", z).toString();
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.WeAppPrivateMessageNativeExtraData", e, "", new Object[0]);
                str = "{}";
            }
            aVar2.f9524A = str;
        }
    }

    /* renamed from: d */
    public static void m106048d(C67391b bVar, C68070l.C68072b bVar2) {
        C37702d Ag = ((C33865k) C86312j.m106911c(C33865k.class)).mo59335Ag(bVar2.f195593k2);
        WxaUpdatableMsgReportStruct.C80798d dVar = WxaUpdatableMsgReportStruct.C80798d.DEFAULT;
        WxaUpdatableMsgReportStruct.C80799e eVar = WxaUpdatableMsgReportStruct.C80799e.DEFAULT;
        if (Ag != null) {
            int i = Ag.field_msgState;
            if (i == 1) {
                dVar = WxaUpdatableMsgReportStruct.C80798d.DONE;
            } else if (i == 0) {
                dVar = WxaUpdatableMsgReportStruct.C80798d.DOING;
            }
            int i2 = Ag.field_btnState;
            if (i2 == 2) {
                eVar = WxaUpdatableMsgReportStruct.C80799e.SUBSCRIBE;
            } else if (i2 == 0 || i2 == 1) {
                eVar = WxaUpdatableMsgReportStruct.C80799e.NOTSUBSCRIBE;
            }
        }
        C80995a aVar = (C80995a) bVar2.mo93555w(C80995a.class);
        int i3 = aVar != null ? aVar.f237895d : 0;
        WxaUpdatableMsgReportStruct wxaUpdatableMsgReportStruct = new WxaUpdatableMsgReportStruct();
        wxaUpdatableMsgReportStruct.f237460d = wxaUpdatableMsgReportStruct.mo86045b("AppId", bVar2.f195577g2, true);
        wxaUpdatableMsgReportStruct.f237461e = wxaUpdatableMsgReportStruct.mo86045b("PageId", bVar2.f195569e2, true);
        wxaUpdatableMsgReportStruct.f237463g = wxaUpdatableMsgReportStruct.mo86045b("ShareTicket", bVar2.f195593k2, true);
        wxaUpdatableMsgReportStruct.f237464h = wxaUpdatableMsgReportStruct.mo86045b("ChattingId", bVar.mo91577r(), true);
        wxaUpdatableMsgReportStruct.f237465i = bVar.mo91583x() ? WxaUpdatableMsgReportStruct.C80797c.YES : WxaUpdatableMsgReportStruct.C80797c.NO;
        wxaUpdatableMsgReportStruct.f237466j = WxaUpdatableMsgReportStruct.C80796b.CLICKAPPMSG;
        wxaUpdatableMsgReportStruct.f237467k = 0;
        wxaUpdatableMsgReportStruct.f237468l = wxaUpdatableMsgReportStruct.mo86045b("SceneNote", "", true);
        wxaUpdatableMsgReportStruct.f237471o = WxaUpdatableMsgReportStruct.C80795a.m98639a(i3 + 1000);
        long nowMilliSecond = Util.nowMilliSecond();
        wxaUpdatableMsgReportStruct.f237462f = nowMilliSecond;
        wxaUpdatableMsgReportStruct.mo86048e("ActionTimeStampMs", nowMilliSecond);
        wxaUpdatableMsgReportStruct.f237469m = dVar;
        wxaUpdatableMsgReportStruct.f237470n = eVar;
        wxaUpdatableMsgReportStruct.mo86054n();
    }
}

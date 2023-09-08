package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1743m1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di0.C86299o;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import kj3.C76581c;
import kr0.C76626j0;
import kr0.C76629w0;
import kr0.C76630x0;
import nj3.C76874e0;
import p629ny.C76979h;
import qo3.C89779i0;
import uj3.C78208e;
import v90.C78373a;
import zj3.C79357g;
import zj3.C79360h;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m */
public final class C74103m extends C74023i {

    /* renamed from: G */
    public static final String f217496G = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/wacomplain?action=show&appid=%s&msgid=%s&from=%d#wechat_redirect");

    /* renamed from: A */
    public View.OnTouchListener f217497A;

    /* renamed from: B */
    public C20937c f217498B;

    /* renamed from: C */
    public C76626j0 f217499C;

    /* renamed from: D */
    public boolean f217500D;

    /* renamed from: E */
    public int[] f217501E = new int[2];

    /* renamed from: F */
    public C89779i0 f217502F;

    /* renamed from: v */
    public int f217503v;

    /* renamed from: w */
    public C67391b f217504w;

    /* renamed from: x */
    public C89779i0 f217505x;

    /* renamed from: y */
    public View.OnClickListener f217506y;

    /* renamed from: z */
    public View.OnClickListener f217507z;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m$a */
    public class C74104a implements View.OnClickListener {
        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C78373a aVar = (C78373a) view.getTag();
            Log.m105925i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) name click", aVar.f229654d);
            String str = aVar.f229654d;
            String str2 = aVar.f229655e;
            String str3 = C74103m.f217496G;
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m$b */
    public class C74105b implements View.OnClickListener {
        public C74105b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = null;
            C76626j0 j0Var = C74103m.this.f217499C;
            if (j0Var != null) {
                str = j0Var.hk0();
            }
            int o0 = C74103m.m88158o0(C74103m.this, ((C78208e) view.getTag(C0966R.C0970id.nsi)).getAdapterPosition());
            C78373a a = C78373a.m94636a(((C74243t8) view.getTag()).f212238a.getContent());
            String nullAsNil = Util.nullAsNil(a.f229655e);
            String nullAsNil2 = Util.nullAsNil(a.f229653c);
            String nullAsNil3 = Util.nullAsNil(a.f229659i);
            String nullAsNil4 = Util.nullAsNil(a.f229654d);
            int i = a.f229657g;
            int i2 = a.f229656f;
            String b = C78373a.m94637b(a.f229651a);
            Log.m105925i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) container click", nullAsNil4);
            C86299o oVar = new C86299o();
            oVar.f250929a = nullAsNil4;
            oVar.f250931c = i2;
            oVar.f250932d = i;
            oVar.f250934f = nullAsNil3;
            oVar.f250940l = "1162:" + nullAsNil2 + XVFSFile.PATH_SEPARATOR + b;
            oVar.f250939k = C1743m1.CTRL_INDEX;
            AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer = new AppBrandLaunchFromNotifyReferrer();
            appBrandLaunchFromNotifyReferrer.f197021d = Util.nullAsNil(nullAsNil);
            appBrandLaunchFromNotifyReferrer.f197022e = C74103m.this.f217503v;
            appBrandLaunchFromNotifyReferrer.f197023f = 2;
            appBrandLaunchFromNotifyReferrer.f197024g = Util.nullAsNil(nullAsNil2);
            appBrandLaunchFromNotifyReferrer.f197025h = b;
            appBrandLaunchFromNotifyReferrer.f197026i = o0;
            appBrandLaunchFromNotifyReferrer.f197027j = str;
            oVar.f250950v = appBrandLaunchFromNotifyReferrer;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(C74103m.this.f217504w.mo91565f(), oVar);
            ((C79360h) C74103m.this.f217504w.f193278b.mo102812a(C79360h.class)).mo102173k5(o0);
            C74103m.this.mo103172p0(4, nullAsNil, nullAsNil2, nullAsNil3, (String) null, o0);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m$c */
    public class C74106c implements View.OnTouchListener {
        public C74106c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if ((motionEvent.getAction() & 255) == 0) {
                C74103m.this.f217501E[0] = (int) motionEvent.getRawX();
                C74103m.this.f217501E[1] = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m$d */
    public final class C74107d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.m$d$a */
        public class C74108a implements C76581c.C76585d {

            /* renamed from: a */
            public final /* synthetic */ C76581c f217511a;

            /* renamed from: b */
            public final /* synthetic */ String f217512b;

            /* renamed from: c */
            public final /* synthetic */ String f217513c;

            /* renamed from: d */
            public final /* synthetic */ String f217514d;

            /* renamed from: e */
            public final /* synthetic */ String f217515e;

            /* renamed from: f */
            public final /* synthetic */ int f217516f;

            /* renamed from: g */
            public final /* synthetic */ View f217517g;

            /* renamed from: h */
            public final /* synthetic */ C72963f4 f217518h;

            public C74108a(C76581c cVar, String str, String str2, String str3, String str4, int i, View view, C72963f4 f4Var) {
                this.f217511a = cVar;
                this.f217512b = str;
                this.f217513c = str2;
                this.f217514d = str3;
                this.f217515e = str4;
                this.f217516f = i;
                this.f217517g = view;
                this.f217518h = f4Var;
            }
        }

        public C74107d(C74104a aVar) {
        }

        public void onClick(View view) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C72963f4 f4Var = (C72963f4) view.getTag();
            int adapterPosition = ((C78208e) view2.getTag(C0966R.C0970id.nsi)).getAdapterPosition();
            Log.m105924i("MicroMsg.ChattingItemAppBrandNotifyMsg", "AppBrandNotityMsgMoreViewClickListener onclick");
            if (f4Var == null) {
                Log.m105928w("MicroMsg.ChattingItemAppBrandNotifyMsg", "AppBrandNotityMsgMoreViewClickListener, on more view click, but msg is null.");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C78373a a = C78373a.m94636a(f4Var.getContent());
            String nullAsNil = Util.nullAsNil(a.f229655e);
            String nullAsNil2 = Util.nullAsNil(a.f229659i);
            String nullAsNil3 = Util.nullAsNil(a.f229652b);
            String nullAsNil4 = Util.nullAsNil(a.f229653c);
            Context context = view.getContext();
            boolean z = C74103m.this.f217500D;
            C76581c cVar = new C76581c(context, z ? 1 : 0, a.f229654d);
            C74108a aVar = r0;
            C76581c cVar2 = cVar;
            C74108a aVar2 = new C74108a(cVar, nullAsNil3, nullAsNil, nullAsNil4, nullAsNil2, adapterPosition, view, f4Var);
            cVar2.f224158u = aVar;
            cVar2.mo106809d(view2);
            C74103m.this.mo103172p0(7, nullAsNil, nullAsNil4, nullAsNil2, (String) null, C74103m.m88158o0(C74103m.this, adapterPosition));
            String str = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener";
            C117292a.m165361g(this, str, "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C74103m() {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59364t = true;
        bVar.f59359o = C0966R.C0969drawable.be5;
        this.f217498B = bVar.mo32666a();
        this.f217503v = C86709a0.m107523b().mo121110g();
        this.f217499C = (C76626j0) C86312j.m106911c(C76626j0.class);
        this.f217506y = new C74107d((C74104a) null);
        this.f217507z = new C74105b();
        this.f217497A = new C74106c();
    }

    /* renamed from: o0 */
    public static int m88158o0(C74103m mVar, int i) {
        return Math.max(0, ((C79368l) mVar.f217504w.f193278b.mo102812a(C79368l.class)).getCount() - i);
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f6852qa, (ViewGroup) null);
        C74323y8 y8Var = new C74323y8();
        y8Var.mo103296a(inflate);
        inflate.setTag(y8Var);
        return inflate;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (menuItem.getItemId() != 100) {
            return false;
        }
        C78373a a = C78373a.m94636a(f4Var.getContent());
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101125kD(f4Var.getMsgId());
        mo103172p0(9, Util.nullAsNil(a.f229655e), Util.nullAsNil(a.f229653c), Util.nullAsNil(a.f229659i), (String) null, 0);
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        if (t8Var == null) {
            return false;
        }
        e0Var.mo107136c(t8Var.mo103252b(), 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        String str2;
        String str3;
        C72963f4 f4Var2 = f4Var;
        this.f217504w = bVar;
        C74323y8 y8Var = (C74323y8) cVar;
        C78373a a = C78373a.m94636a(f4Var.getContent());
        if (f4Var.mo108769t2() == 2) {
            y8Var.f218321b.setVisibility(0);
            y8Var.timeTV.setVisibility(8);
        } else {
            y8Var.f218321b.setVisibility(8);
        }
        Class cls = C79368l.class;
        C72963f4 item = ((C79368l) this.f217504w.f193278b.mo102812a(cls)).getItem(0);
        if (item != null && item.mo108769t2() == 2) {
            ((C79368l) this.f217504w.f193278b.mo102812a(cls)).mo108201i0(1);
        }
        if (f4Var.mo108769t2() == 2) {
            y8Var.f218322c.setVisibility(8);
        } else {
            y8Var.f218322c.setVisibility(0);
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(a.f229654d);
            if (N2 == null || Util.isNullOrNil(N2.field_brandIconURL) || Util.isNullOrNil(N2.field_nickname)) {
                str2 = Util.nullAsNil(a.f229658h);
                str3 = Util.nullAsNil(a.f229652b);
            } else {
                str2 = N2.field_brandIconURL;
                str3 = N2.field_nickname;
            }
            String nullAsNil = Util.nullAsNil(a.f229654d);
            y8Var.f218323d.setTag((Object) null);
            y8Var.f218324e.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f217504w.mo91565f(), str3, y8Var.f218324e.getTextSize()));
            y8Var.f218324e.setTag(a);
            C20828a.m22825b().mo32519h(str2, y8Var.f218323d, this.f217498B);
            y8Var.f218323d.setTag(new C74243t8(f4Var2, (String) null));
            y8Var.f218323d.setTag(C0966R.C0970id.nsi, y8Var);
            y8Var.f218323d.setOnClickListener(this.f217507z);
            y8Var.f218323d.setOnLongClickListener((View.OnLongClickListener) null);
            ImageView imageView = y8Var.f218323d;
            imageView.setContentDescription(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(nullAsNil) + this.f217504w.mo91565f().getString(C0966R.string.a_r));
            if (!Boolean.valueOf(((C76626j0) C86312j.m106911c(C76626j0.class)).mo56475CJ(a.f229655e + "#NotifyMessageStatus", "true")).booleanValue()) {
                y8Var.f218325f.setVisibility(0);
                this.f217500D = true;
            } else {
                y8Var.f218325f.setVisibility(8);
                this.f217500D = false;
            }
            y8Var.f218326g.setTag(f4Var2);
            y8Var.f218326g.setTag(C0966R.C0970id.nsi, y8Var);
            y8Var.f218326g.setOnClickListener(this.f217506y);
        }
        if (f4Var.mo108769t2() != 2) {
            y8Var.f218327h.setText(Util.nullAsNil(a.f229651a));
            y8Var.f218322c.setOnClickListener(this.f217507z);
            y8Var.f218322c.setTag(new C74243t8(f4Var2, (String) null));
            y8Var.f218322c.setLongClickable(true);
            y8Var.f218322c.setTag(C0966R.C0970id.f359414kt0, this.f217501E);
            y8Var.f218322c.setTag(C0966R.C0970id.nsi, y8Var);
            y8Var.f218322c.setOnLongClickListener(mo103098p(this.f217504w));
            y8Var.f218322c.setOnTouchListener(this.f217497A);
        }
    }

    /* renamed from: h */
    public void mo102973h(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        if (str != null && cVar.userTV != null) {
            mo103090g0(cVar, ((C76979h) C86312j.m106911c(C76979h.class)).yp0(bVar.mo91565f(), ((C79357g) bVar.f193278b.mo102812a(C79357g.class)).getDisplayName(str), cVar.userTV.getTextSize()));
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 872415281;
    }

    /* renamed from: p0 */
    public final void mo103172p0(int i, String str, String str2, String str3, String str4, int i2) {
        C76626j0 j0Var = this.f217499C;
        String hk02 = j0Var != null ? j0Var.hk0() : null;
        Log.m105919d("MicroMsg.ChattingItemAppBrandNotifyMsg", "appbrand notify report(%d), eventId : %d, appId %s, msgId %s, pagePath %s, label %s", 19724, Integer.valueOf(i), str, str2, str3, str4);
        C115669n.INSTANCE.mo160131h(19724, 1, Integer.valueOf(i), 0, Integer.valueOf(i2), 0, null, 0, 0, 0, str, str3, str4, str2, 0, null, null, 0, null, null, hk02);
    }
}

package xv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gw0.C76073b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76629w0;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99681n;
import p196ln.C76705f;
import p629ny.C76979h;
import pv1.C22019b;
import v90.C78374b;

/* renamed from: xv1.p */
public class C78994p extends C22019b {

    /* renamed from: p */
    public C99681n f231956p;

    /* renamed from: q */
    public long f231957q;

    /* renamed from: r */
    public String f231958r;

    /* renamed from: s */
    public CharSequence f231959s;

    /* renamed from: t */
    public CharSequence f231960t;

    /* renamed from: u */
    public CharSequence f231961u;

    /* renamed from: v */
    public List<C78374b.C78375a> f231962v;

    /* renamed from: w */
    public C78995a f231963w = new C78995a(this.f62330h);

    /* renamed from: x */
    public C78996b f231964x = new C78996b(this);

    /* renamed from: xv1.p$a */
    public class C78995a extends C22019b.C22021b {

        /* renamed from: b */
        public int f231965b;

        public C78995a(int i) {
            super();
            this.f231965b = i;
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            View view;
            int i;
            C78994p pVar = (C78994p) bVar;
            C78996b bVar2 = (C78996b) aVar;
            if (this.f231965b == 3) {
                bVar2.f231967a.setVisibility(8);
                View view2 = bVar2.f231971e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                bVar2.f231973g.setVisibility(0);
                C93938f0.m118693a(pVar.f231961u, bVar2.f231973g);
            } else {
                bVar2.f231967a.setVisibility(0);
                View view4 = bVar2.f231971e;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                bVar2.f231973g.setVisibility(8);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(bVar2.f231968b, pVar.f231958r);
                C93938f0.m118693a(pVar.f231959s, bVar2.f231969c);
                C93938f0.m118693a(pVar.f231961u, bVar2.f231970d);
            }
            TextView textView = bVar2.f231972f;
            C99667f b = C99667f.m130089b(pVar.f231960t, C78994p.this.f62327e);
            b.f292095h = textView.getPaint();
            C93938f0.m118693a(C99254i.m129308e(b).f292107a, bVar2.f231972f);
            String k = pVar.mo35139k();
            List<C78374b.C78375a> list = pVar.f231962v;
            if (list == null || ((ArrayList) list).isEmpty() || Util.isNullOrNil(k)) {
                bVar2.f231974h.removeAllViews();
                bVar2.f231974h.setVisibility(8);
                return;
            }
            Iterator it = ((ArrayList) pVar.f231962v).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str = ((C78374b.C78375a) it.next()).f229669a;
                if (Util.isNullOrNil(str)) {
                    i = 0;
                } else {
                    int i3 = 0;
                    i = 0;
                    while (i3 < str.length()) {
                        int i4 = i3 + 1;
                        i = str.substring(i3, i4).matches("[Α-￥]") ? i + 2 : i + 1;
                        i3 = i4;
                    }
                }
                i2 = Math.max((i + 1) / 2, i2);
            }
            int min = Math.min(i2, 8);
            Iterator it4 = ((ArrayList) pVar.f231962v).iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                C78374b.C78375a aVar4 = (C78374b.C78375a) it4.next();
                if (Util.nullAsNil(aVar4.f229670b).toLowerCase().contains(Util.nullAsNil(k).toLowerCase())) {
                    if (i5 < bVar2.f231974h.getChildCount()) {
                        view = bVar2.f231974h.getChildAt(i5);
                    } else {
                        view = LayoutInflater.from(context).inflate(C0966R.C0971layout.atp, (ViewGroup) null);
                        bVar2.f231974h.addView(view);
                    }
                    TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.fob);
                    TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.fok);
                    textView2.setText(aVar4.f229669a);
                    textView2.setEms(min);
                    C99667f b2 = C99667f.m130089b(aVar4.f229670b, C78994p.this.f62327e);
                    b2.f292095h = textView3.getPaint();
                    textView3.setText(C99254i.m129308e(b2).f292107a);
                    i5++;
                }
            }
            if (i5 < bVar2.f231974h.getChildCount()) {
                LinearLayout linearLayout = bVar2.f231974h;
                linearLayout.removeViews(i5, linearLayout.getChildCount() - i5);
            }
            bVar2.f231974h.setVisibility(0);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ato, viewGroup, false);
            C78996b bVar = C78994p.this.f231964x;
            bVar.f231967a = (ViewGroup) inflate.findViewById(C0966R.C0970id.fai);
            bVar.f231968b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            bVar.f231969c = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            bVar.f231970d = (TextView) inflate.findViewById(C0966R.C0970id.eu8);
            bVar.f231971e = inflate.findViewById(C0966R.C0970id.fah);
            bVar.f231972f = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            bVar.f231973g = (TextView) inflate.findViewById(C0966R.C0970id.f358475fc3);
            bVar.f231974h = (LinearLayout) inflate.findViewById(C0966R.C0970id.foe);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            C78994p pVar = (C78994p) bVar;
            Intent intent = new Intent();
            intent.putExtra("Chat_User", Util.nullAsNil("notifymessage"));
            intent.putExtra("finish_direct", true);
            intent.putExtra("from_service_notify_content_search", true);
            intent.putExtra("need_hight_item", true);
            intent.putExtra("chat_from_scene", 6);
            intent.putExtra("msg_local_id", pVar.f231957q);
            if (this.f231965b == 3) {
                intent.putExtra("key_notify_message_real_username", pVar.f231958r);
            }
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            return true;
        }
    }

    /* renamed from: xv1.p$b */
    public class C78996b extends C22019b.C22020a {

        /* renamed from: a */
        public ViewGroup f231967a;

        /* renamed from: b */
        public ImageView f231968b;

        /* renamed from: c */
        public TextView f231969c;

        /* renamed from: d */
        public TextView f231970d;

        /* renamed from: e */
        public View f231971e;

        /* renamed from: f */
        public TextView f231972f;

        /* renamed from: g */
        public TextView f231973g;

        /* renamed from: h */
        public LinearLayout f231974h;

        public C78996b(C78994p pVar) {
            super(pVar);
        }
    }

    public C78994p(int i) {
        super(16, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        String str;
        Class cls = C75700k0.class;
        C78996b bVar = (C78996b) aVar;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f231956p.f292150d);
        C78374b a = C78374b.m94638a(b002.getContent());
        this.f231957q = b002.getMsgId();
        this.f231958r = a.f229661b;
        if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(this.f231958r)) {
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.f231958r);
            str = N2 == null ? this.f231958r : N2.field_nickname;
        } else {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f231958r);
            str = z1Var == null ? this.f231958r : z1Var.mo62898f();
        }
        this.f231959s = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, str, bVar.f231969c.getTextSize());
        this.f231960t = a.f229662c;
        this.f231961u = C72715f.m85112e(context, this.f231956p.f292152f, true);
        this.f231962v = a.f229668i;
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f231956p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f231963w;
    }
}

package xv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import ie3.C98668e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99672i;
import lv1.C99681n;
import pv1.C22019b;

/* renamed from: xv1.w */
public class C102772w extends C22019b {

    /* renamed from: p */
    public C99681n f303464p;

    /* renamed from: q */
    public long f303465q;

    /* renamed from: r */
    public CharSequence f303466r;

    /* renamed from: s */
    public C98668e f303467s = null;

    /* renamed from: t */
    public C102773a f303468t = new C102773a(this.f62330h);

    /* renamed from: u */
    public C102774b f303469u = new C102774b(this);

    /* renamed from: xv1.w$a */
    public class C102773a extends C22019b.C22021b {
        public C102773a(int i) {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            View view;
            int i;
            C102772w wVar = (C102772w) bVar;
            C102774b bVar2 = (C102774b) aVar;
            C98668e eVar = C102772w.this.f303467s;
            if (eVar == null) {
                Log.m105920e("MicroMsg.FTSWXPayNotifyMsgContentDataItem", "template is not init");
            } else {
                if (!Util.isNullOrNil(eVar.f289289d)) {
                    bVar2.f303471a.setVisibility(0);
                    bVar2.f303472b.setUrl(C102772w.this.f303467s.f289293h);
                    TextView textView = bVar2.f303473c;
                    C102772w wVar2 = C102772w.this;
                    C93938f0.m118693a(mo142532e(textView, wVar2.f303467s.f289289d, wVar2.f62327e), bVar2.f303473c);
                    C93938f0.m118693a(wVar.f303466r, bVar2.f303474d);
                } else {
                    bVar2.f303471a.setVisibility(8);
                }
                C98668e eVar2 = C102772w.this.f303467s;
                if (eVar2.f289292g || Util.isNullOrNil(eVar2.f289290e)) {
                    bVar2.f303476f.setVisibility(8);
                } else {
                    bVar2.f303476f.setVisibility(0);
                    TextView textView2 = bVar2.f303477g;
                    C102772w wVar3 = C102772w.this;
                    C93938f0.m118693a(mo142532e(textView2, wVar3.f303467s.f289290e, wVar3.f62327e), bVar2.f303477g);
                    if (Util.isNullOrNil(C102772w.this.f303467s.f289289d)) {
                        bVar2.f303478h.setVisibility(0);
                        C93938f0.m118693a(wVar.f303466r, bVar2.f303478h);
                    } else {
                        bVar2.f303478h.setVisibility(8);
                    }
                    boolean contains = Util.nullAsNil(C102772w.this.f303467s.f289291f).toLowerCase().contains(Util.nullAsNil(wVar.mo35139k()).toLowerCase());
                    if (Util.isNullOrNil(C102772w.this.f303467s.f289291f) || !contains) {
                        bVar2.f303479i.setVisibility(8);
                    } else {
                        bVar2.f303479i.setVisibility(0);
                        TextView textView3 = bVar2.f303479i;
                        C102772w wVar4 = C102772w.this;
                        C93938f0.m118693a(mo142532e(textView3, wVar4.f303467s.f289291f, wVar4.f62327e), bVar2.f303479i);
                    }
                }
            }
            String k = wVar.mo35139k();
            List<C98668e.C98669a> list = C102772w.this.f303467s.f289297l;
            if (list == null || ((ArrayList) list).isEmpty() || Util.isNullOrNil(k)) {
                bVar2.f303480j.removeAllViews();
                bVar2.f303480j.setVisibility(8);
                return;
            }
            Iterator it = ((ArrayList) C102772w.this.f303467s.f289297l).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str = ((C98668e.C98669a) it.next()).f289298a;
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
            Iterator it4 = ((ArrayList) C102772w.this.f303467s.f289297l).iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                C98668e.C98669a aVar2 = (C98668e.C98669a) it4.next();
                boolean z = aVar2.f289300c;
                boolean contains2 = Util.nullAsNil(aVar2.f289299b).toLowerCase().contains(Util.nullAsNil(k).toLowerCase());
                if (z || contains2) {
                    if (i5 < bVar2.f303480j.getChildCount()) {
                        view = bVar2.f303480j.getChildAt(i5);
                    } else {
                        view = LayoutInflater.from(context).inflate(C0966R.C0971layout.atp, (ViewGroup) null);
                        bVar2.f303480j.addView(view);
                    }
                    TextView textView4 = (TextView) view.findViewById(C0966R.C0970id.fob);
                    TextView textView5 = (TextView) view.findViewById(C0966R.C0970id.fok);
                    textView4.setText(aVar2.f289298a);
                    textView4.setEms(min);
                    textView5.setText(mo142532e(textView5, aVar2.f289299b, C102772w.this.f62327e));
                    i5++;
                }
            }
            if (i5 < bVar2.f303480j.getChildCount()) {
                LinearLayout linearLayout = bVar2.f303480j;
                linearLayout.removeViews(i5, linearLayout.getChildCount() - i5);
            }
            bVar2.f303480j.setVisibility(0);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ato, viewGroup, false);
            C102774b bVar = C102772w.this.f303469u;
            bVar.f303471a = (ViewGroup) inflate.findViewById(C0966R.C0970id.fai);
            bVar.f303472b = (CdnImageView) inflate.findViewById(C0966R.C0970id.a27);
            bVar.f303473c = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            bVar.f303474d = (TextView) inflate.findViewById(C0966R.C0970id.eu8);
            bVar.f303475e = inflate.findViewById(C0966R.C0970id.fah);
            bVar.f303476f = (ViewGroup) inflate.findViewById(C0966R.C0970id.nnq);
            bVar.f303477g = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            bVar.f303478h = (TextView) inflate.findViewById(C0966R.C0970id.f358475fc3);
            bVar.f303479i = (TextView) inflate.findViewById(C0966R.C0970id.nqe);
            bVar.f303480j = (LinearLayout) inflate.findViewById(C0966R.C0970id.foe);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            C102772w wVar = (C102772w) bVar;
            Intent intent = new Intent();
            intent.putExtra("Chat_User", Util.nullAsNil("gh_3dfda90e39d6"));
            intent.putExtra("finish_direct", true);
            intent.putExtra("from_service_notify_content_search", true);
            intent.putExtra("need_hight_item", true);
            intent.putExtra("chat_from_scene", 8);
            intent.putExtra("msg_local_id", wVar.f303465q);
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(27229, 1, 7, C102772w.this.mo35139k(), 0, 0, Long.valueOf(wVar.f303464p.f292152f / 1000));
            return true;
        }

        /* renamed from: e */
        public final CharSequence mo142532e(TextView textView, CharSequence charSequence, C99672i iVar) {
            C99667f b = C99667f.m130089b(charSequence, iVar);
            b.f292095h = textView.getPaint();
            return C99254i.m129308e(b).f292107a;
        }
    }

    /* renamed from: xv1.w$b */
    public class C102774b extends C22019b.C22020a {

        /* renamed from: a */
        public ViewGroup f303471a;

        /* renamed from: b */
        public CdnImageView f303472b;

        /* renamed from: c */
        public TextView f303473c;

        /* renamed from: d */
        public TextView f303474d;

        /* renamed from: e */
        public View f303475e;

        /* renamed from: f */
        public ViewGroup f303476f;

        /* renamed from: g */
        public TextView f303477g;

        /* renamed from: h */
        public TextView f303478h;

        /* renamed from: i */
        public TextView f303479i;

        /* renamed from: j */
        public LinearLayout f303480j;

        public C102774b(C102772w wVar) {
            super(wVar);
        }
    }

    public C102772w(int i) {
        super(16, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        C102774b bVar = (C102774b) aVar;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f303464p.f292150d);
        C98668e a = C98668e.m128295a(b002.getContent());
        this.f303467s = a;
        if (a.f289287b == 0) {
            C98668e.C98669a aVar2 = new C98668e.C98669a();
            aVar2.f289298a = "";
            aVar2.f289299b = a.f289288c;
            ((ArrayList) a.f289297l).add(aVar2);
        }
        if (!Util.isNullOrNil(a.f289295j)) {
            C98668e.C98669a aVar3 = new C98668e.C98669a();
            aVar3.f289298a = context.getString(C0966R.string.mya);
            aVar3.f289299b = a.f289295j;
            if (((ArrayList) a.f289297l).size() <= 0 || !((C98668e.C98669a) ((ArrayList) a.f289297l).get(0)).f289300c) {
                ((ArrayList) a.f289297l).add(0, aVar3);
            } else {
                ((ArrayList) a.f289297l).add(1, aVar3);
            }
        }
        if (!Util.isNullOrNil(a.f289296k)) {
            C98668e.C98669a aVar4 = new C98668e.C98669a();
            aVar4.f289298a = context.getString(C0966R.string.my8);
            aVar4.f289299b = a.f289296k;
            if (((ArrayList) a.f289297l).size() <= 0 || !((C98668e.C98669a) ((ArrayList) a.f289297l).get(0)).f289300c) {
                ((ArrayList) a.f289297l).add(0, aVar4);
            } else {
                ((ArrayList) a.f289297l).add(1, aVar4);
            }
        }
        if (!Util.isNullOrNil(a.f289294i)) {
            C98668e.C98669a aVar5 = new C98668e.C98669a();
            aVar5.f289298a = context.getString(C0966R.string.my_);
            aVar5.f289299b = a.f289294i;
            if (((ArrayList) a.f289297l).size() <= 0 || !((C98668e.C98669a) ((ArrayList) a.f289297l).get(0)).f289300c) {
                ((ArrayList) a.f289297l).add(0, aVar5);
            } else {
                ((ArrayList) a.f289297l).add(1, aVar5);
            }
        }
        this.f303465q = b002.getMsgId();
        this.f303466r = C72715f.m85112e(context, this.f303464p.f292152f, true);
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f303464p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303468t;
    }
}

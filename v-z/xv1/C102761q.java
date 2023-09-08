package xv1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99681n;
import p196ln.C76705f;
import p629ny.C76979h;
import pv1.C22019b;

/* renamed from: xv1.q */
public class C102761q extends C22019b {

    /* renamed from: p */
    public C99681n f303440p;

    /* renamed from: q */
    public String f303441q;

    /* renamed from: r */
    public CharSequence f303442r;

    /* renamed from: s */
    public int f303443s;

    /* renamed from: t */
    public C102763b f303444t = new C102763b();

    /* renamed from: u */
    public C102762a f303445u = new C102762a(this);

    /* renamed from: xv1.q$a */
    public class C102762a extends C22019b.C22020a {

        /* renamed from: a */
        public ImageView f303446a;

        /* renamed from: b */
        public TextView f303447b;

        /* renamed from: c */
        public TextView f303448c;

        /* renamed from: d */
        public View f303449d;

        public C102762a(C102761q qVar) {
            super(qVar);
        }
    }

    /* renamed from: xv1.q$b */
    public class C102763b extends C22019b.C22021b {
        public C102763b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C102761q qVar = (C102761q) bVar;
            C102762a aVar2 = (C102762a) aVar;
            C93938f0.m118699g(aVar2.f303449d, C102761q.this.f62326d);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(aVar2.f303446a, qVar.f303441q);
            TextView textView = aVar2.f303447b;
            C99667f b = C99667f.m130089b(qVar.f303442r, C102761q.this.f62327e);
            b.f292095h = textView.getPaint();
            C93938f0.m118693a(C99254i.m129308e(b).f292107a, aVar2.f303447b);
            C93938f0.m118694b(context.getString(C0966R.string.ihx, new Object[]{Integer.valueOf(qVar.f303443s)}), aVar2.f303448c);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.atr, viewGroup, false);
            C102762a aVar = C102761q.this.f303445u;
            aVar.f303446a = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f303447b = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            aVar.f303448c = (TextView) inflate.findViewById(C0966R.C0970id.h1f);
            aVar.f303449d = inflate.findViewById(C0966R.C0970id.h1h);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", Util.nullAsNil("notifymessage"));
            intent.putExtra("key_notify_message_real_username", ((C102761q) bVar).f303441q);
            intent.putExtra("finish_direct", true);
            intent.putExtra("chat_from_scene", 6);
            C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            return true;
        }
    }

    public C102761q(int i) {
        super(15, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        this.f303441q = this.f303440p.f292151e;
        this.f303442r = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, this.f303440p.f292154h, ((C102762a) aVar).f303447b.getTextSize());
        Object obj = this.f303440p.f292161o;
        if (obj instanceof Integer) {
            this.f303443s = ((Integer) obj).intValue();
        }
    }

    /* renamed from: g */
    public int mo35135g() {
        return this.f303440p.f292164r;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303444t;
    }
}

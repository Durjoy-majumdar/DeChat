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
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kv1.C99251g;
import p196ln.C76705f;
import p629ny.C76979h;
import pv1.C22019b;

/* renamed from: xv1.e */
public class C102746e extends C23128k {

    /* renamed from: u */
    public String f303382u;

    /* renamed from: v */
    public CharSequence f303383v;

    /* renamed from: w */
    public int f303384w;

    /* renamed from: x */
    public C102747a f303385x = new C102747a();

    /* renamed from: y */
    public C102749b f303386y = new C102749b(this);

    /* renamed from: xv1.e$a */
    public class C102747a extends C22019b.C22021b {

        /* renamed from: xv1.e$a$a */
        public class C102748a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Context f303388d;

            public C102748a(Context context) {
                this.f303388d = context;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/fts/ui/item/FTSConvMessageHeaderDataItem$FTSSTalkerMessageHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (C72996z1.m85808L4(C102746e.this.f303382u)) {
                    Intent intent = new Intent();
                    intent.putExtra("Contact_User", C102746e.this.f303382u);
                    intent.putExtra("app_brand_conversation_from_scene", 1);
                    intent.addFlags(67108864);
                    C88144b.m109801s(this.f303388d, ".ui.conversation.AppBrandServiceConversationUI", intent, (Bundle) null);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Chat_User", C102746e.this.f303382u);
                    intent2.putExtra("finish_direct", true);
                    C88144b.m109801s(this.f303388d, ".ui.chatting.ChattingUI", intent2, (Bundle) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/item/FTSConvMessageHeaderDataItem$FTSSTalkerMessageHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C102747a() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C102749b bVar2 = (C102749b) aVar;
            C93938f0.m118694b(C102746e.this.f66433p, bVar2.f303391b);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar2.f303392c, C102746e.this.f303382u);
            C93938f0.m118693a(C102746e.this.f303383v, bVar2.f303394e);
            bVar2.f303390a.setBackgroundResource(C0966R.C0969drawable.f4855pa);
            bVar2.f303390a.setOnClickListener(new C102748a(context));
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.asv, viewGroup, false);
            C102749b bVar = C102746e.this.f303386y;
            bVar.f303390a = inflate.findViewById(C0966R.C0970id.evi);
            bVar.f303391b = (TextView) inflate.findViewById(C0966R.C0970id.evf);
            bVar.f303393d = inflate.findViewById(C0966R.C0970id.hqn);
            bVar.f303392c = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            bVar.f303394e = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    /* renamed from: xv1.e$b */
    public class C102749b extends C22019b.C22020a {

        /* renamed from: a */
        public View f303390a;

        /* renamed from: b */
        public TextView f303391b;

        /* renamed from: c */
        public ImageView f303392c;

        /* renamed from: d */
        public View f303393d;

        /* renamed from: e */
        public TextView f303394e;

        public C102749b(C102746e eVar) {
            super(eVar);
        }
    }

    public C102746e(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        this.f66433p = context.getString(C0966R.string.ihm, new Object[]{Integer.valueOf(this.f303384w)});
        this.f303383v = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context, C99251g.m129283d(this.f303382u), ((C102749b) aVar).f303394e.getTextSize());
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303385x;
    }

    /* renamed from: l */
    public C22019b.C22020a mo36518l() {
        return this.f303386y;
    }
}

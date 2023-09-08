package ix1;

import android.view.View;
import android.view.ViewGroup;
import ax1.C39639c;
import ax1.C39641d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ix1.o */
public class C46339o implements C39639c.C39640a {

    /* renamed from: a */
    public final /* synthetic */ C46337n f124898a;

    /* renamed from: ix1.o$a */
    public class C46340a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f124899d;

        /* renamed from: ix1.o$a$a */
        public class C46341a implements View.OnClickListener {
            public C46341a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C46339o.this.f124898a.mo71707K(view);
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C46340a(Map map) {
            this.f124899d = map;
        }

        public void run() {
            Map map = this.f124899d;
            if (map != null && map.containsKey(C46339o.this.f124898a.f124841G.from_username)) {
                C46339o.this.f124898a.f124859U0 = (C39641d) this.f124899d.get(C46339o.this.f124898a.f124841G.from_username);
            }
            C46337n nVar = C46339o.this.f124898a;
            View F = nVar.mo71706F(nVar.f124842H);
            ViewGroup viewGroup = C46339o.this.f124898a.f124842H;
            if (viewGroup != null && F != null) {
                viewGroup.removeAllViews();
                C46339o.this.f124898a.f124842H.addView(F);
                C46337n nVar2 = C46339o.this.f124898a;
                nVar2.mo71705B(nVar2.f124841G);
                F.setOnClickListener(new C46341a());
                C46339o.this.f124898a.mo71737O(F);
            }
        }
    }

    public C46339o(C46337n nVar) {
        this.f124898a = nVar;
    }

    /* renamed from: a */
    public void mo62195a(Map<String, C39641d> map) {
        this.f124898a.f124842H.post(new C46340a(map));
    }
}

package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.text.Spannable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import c30.C104289g;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import de3.C75359b0;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kg3.C76577a;
import nj2.C109750j;
import nj2.C61759g;
import nj3.C76874e0;
import sx3.C110823p;
import uj3.C78208e;
import xj2.C66286a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g3 */
public final class C73992g3 extends C74023i {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.g3$a */
    public static final class C73993a extends C74023i.C74026c {

        /* renamed from: b */
        public MMNeat7extView f217117b;

        /* renamed from: c */
        public MMNeat7extView f217118c;

        /* renamed from: a */
        public final C73993a mo103050a(View view) {
            C87412m.m108594g(view, "convertView");
            super.create(view);
            this.f217118c = (MMNeat7extView) view.findViewById(C0966R.C0970id.iut);
            this.f217117b = (MMNeat7extView) view.findViewById(C0966R.C0970id.ius);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.g3$b */
    public static final class C73994b extends C75359b0 {

        /* renamed from: d */
        public final /* synthetic */ String f217119d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f217120e;

        /* renamed from: f */
        public final /* synthetic */ C67391b f217121f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73994b(int i, int i2, String str, C72963f4 f4Var, C67391b bVar) {
            super(i, i2);
            this.f217119d = str;
            this.f217120e = f4Var;
            this.f217121f = bVar;
        }

        public void onClick(View view) {
            String a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgRingtone$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "v");
            Log.m105924i("MicroMsg.ChattingItemAppMsgRingtone", "[onClick] app msg enter to ringtone setting ui");
            String str = this.f217119d;
            int i = 1;
            int i2 = 0;
            boolean z = this.f217120e.getType() == 85;
            C109750j jVar = C109750j.f328484a;
            C87412m.m108594g(str, "username");
            if (!z) {
                str = C75592q0.m90789s();
            }
            C109750j jVar2 = C109750j.f328484a;
            C87412m.m108593f(str, "name");
            Set<String> b = C109750j.m149064b(jVar2, str, z, (Set) null, 4, (Object) null);
            if (!(b == null || (a = jVar2.mo160989a(b)) == null)) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str2 : b) {
                    if (!C87412m.m108589b(a, str2)) {
                        linkedHashSet.add(str2);
                    }
                }
                C109750j jVar3 = C109750j.f328484a;
                C109750j.C109751a f = jVar3.mo160993f(a);
                f.f328493c = true;
                C104289g gVar = new C104289g();
                gVar.put("ringtoneId", f.f328491a);
                gVar.mo145954o("tick", f.f328492b);
                gVar.mo145966q("linkToSetting", f.f328493c);
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "JSONObject().apply {\n   …\n            }.toString()");
                linkedHashSet.add(gVar2);
                jVar3.mo160994g(str, z, linkedHashSet);
            }
            int type = this.f217120e.getType();
            if (type == 85) {
                i2 = 2;
            } else if (type == 86) {
                i2 = 3;
                i = 2;
            }
            C61759g.C61760a aVar = C61759g.f175551f;
            String content = this.f217120e.getContent();
            C87412m.m108593f(content, "msg.content");
            C66286a.m78219f(i, 2, content, "", "");
            Activity f2 = this.f217121f.mo91565f();
            C87412m.m108593f(f2, "ui.context");
            aVar.mo86679c(f2, i2);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgRingtone$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6856qe);
        C73993a aVar = new C73993a();
        aVar.mo103050a(n4Var);
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
        C87412m.m108594g(menuItem, "item");
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var, "msg");
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(contextMenuInfo, "menuInfo");
        C87412m.m108594g(f4Var, "msg");
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var, "msg");
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        MMNeat7extView mMNeat7extView;
        C74023i.C74026c cVar2 = cVar;
        C72963f4 f4Var2 = f4Var;
        C87412m.m108594g(cVar2, "holder");
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var2, "msg");
        C87412m.m108594g(str, "userName");
        try {
            Log.m105925i("MicroMsg.ChattingItemAppMsgRingtone", "fill item %d, msgId %d", Integer.valueOf(cVar.getAdapterPosition()), Long.valueOf(f4Var.getMsgId()));
            C73993a aVar = (C73993a) cVar2;
            Activity f = bVar.mo91565f();
            MMNeat7extView mMNeat7extView2 = ((C73993a) cVar2).f217118c;
            if (mMNeat7extView2 != null && (mMNeat7extView = ((C73993a) cVar2).f217117b) != null) {
                mMNeat7extView2.mo154994l(0, ((float) f.getResources().getDimensionPixelSize(C0966R.dimen.f3881hq)) * C76577a.m92165p(f));
                mMNeat7extView2.setPadding(f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig), f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig), f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig), f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig));
                mMNeat7extView2.setTextGravity(1);
                mMNeat7extView2.setClickable(true);
                mMNeat7extView.mo154994l(0, ((float) f.getResources().getDimensionPixelSize(C0966R.dimen.f3881hq)) * C76577a.m92165p(f));
                mMNeat7extView.setPadding(f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig), f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig), f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig), f.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig));
                mMNeat7extView.setTextGravity(1);
                mMNeat7extView.setClickable(true);
                int color = bVar.mo91565f().getResources().getColor(C0966R.color.a1d);
                int color2 = bVar.mo91565f().getResources().getColor(C0966R.color.a1f);
                int type = f4Var.getType();
                String[] c = type != 85 ? type != 86 ? null : C109750j.f328484a.mo160990c() : C109750j.f328484a.mo160991d();
                if (c != null) {
                    String str2 = (String) C110823p.m150976B(c);
                    String str3 = (String) C110823p.m150989O(c);
                    Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str3);
                    C87412m.m108593f(newSpannable, "getInstance().newSpannable(linkText)");
                    C73994b bVar2 = r0;
                    C73994b bVar3 = new C73994b(color, color2, str, f4Var, bVar);
                    newSpannable.setSpan(bVar2, 0, str3.length(), 18);
                    mMNeat7extView.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.FG_2));
                    mMNeat7extView.mo104280c(newSpannable, TextView.BufferType.SPANNABLE, (Boolean) null);
                    f4Var2.mo108732L2(str2 + str3);
                    int i = C78208e.f229158a;
                    C78208e eVar = C78208e.C78209a.f229159a;
                    mMNeat7extView.setTag(new C74243t8(f4Var, false, eVar, "", false));
                    mMNeat7extView.setBackground(bVar.mo91565f().getResources().getDrawable(C0966R.C0969drawable.f4794n4));
                    mMNeat7extView2.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.FG_2));
                    mMNeat7extView2.mo104279b(str2);
                    mMNeat7extView2.setTag(new C74243t8(f4Var, false, eVar, "", false));
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.ChattingItemAppMsgRingtone", "error happened parse msg info");
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 85 || i == 86;
    }
}

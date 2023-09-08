package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import de3.C75359b0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj2.C109750j;
import nj2.C61759g;
import nj3.C76874e0;
import rj3.C77533b;
import vj2.C65759a;
import wj2.C66132f;
import xj2.C66286a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w0 */
public final class C74285w0 extends C74023i {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.w0$b */
    public static final class C57799b extends C75359b0 {

        /* renamed from: d */
        public final /* synthetic */ Activity f165389d;

        /* renamed from: e */
        public final /* synthetic */ String f165390e;

        /* renamed from: f */
        public final /* synthetic */ C66132f f165391f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57799b(int i, int i2, Activity activity, String str, C66132f fVar) {
            super(i, i2);
            this.f165389d = activity;
            this.f165390e = str;
            this.f165391f = fVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCalleeRingtoneHint$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "v");
            Log.m105924i("MicroMsg.ChattingItemAppMsgRingtone", "[onClick] app msg enter to finder feed");
            C61759g.C61760a aVar = C61759g.f175551f;
            Activity activity = this.f165389d;
            C87412m.m108593f(activity, "context");
            C61759g.C61760a.m72462b(aVar, activity, 1, this.f165390e, 6, false, this.f165391f, 16, (Object) null);
            String str = this.f165390e;
            String unsignedLongString = Util.getUnsignedLongString(this.f165391f.f190092o);
            C87412m.m108593f(unsignedLongString, "getUnsignedLongString(ringtoneInfo.finderObjectId)");
            C66286a.m78219f(3, 2, "", str, unsignedLongString);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCalleeRingtoneHint$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.w0$a */
    public static final class C74286a extends C74023i.C74026c {

        /* renamed from: b */
        public TextView f218182b;

        /* renamed from: a */
        public final C74286a mo103280a(View view) {
            C87412m.m108594g(view, "convertView");
            super.create(view);
            this.f218182b = (TextView) view.findViewById(C0966R.C0970id.mh7);
            return this;
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f359634co3);
        C74286a aVar = new C74286a();
        aVar.mo103280a(n4Var);
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
        C68070l.C68072b u;
        C65759a aVar;
        ForegroundColorSpan foregroundColorSpan;
        Object obj;
        C74023i.C74026c cVar2 = cVar;
        C72963f4 f4Var2 = f4Var;
        String str2 = str;
        C87412m.m108594g(cVar2, "holder");
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var2, "msg");
        C87412m.m108594g(str2, "userName");
        try {
            Log.m105925i("MicroMsg.ChattingItemAppMsgRingtone", "fill item %d, msgId %d", Integer.valueOf(cVar.getAdapterPosition()), Long.valueOf(f4Var.getMsgId()));
            C74286a aVar2 = (C74286a) cVar2;
            String content = f4Var.getContent();
            if (content != null && (u = C68070l.C68072b.m80422u(content, (String) null)) != null && (aVar = (C65759a) u.mo93555w(C65759a.class)) != null) {
                C66132f fVar = aVar.f189163b;
                Activity f = bVar.mo91565f();
                String str3 = fVar.f190085h;
                String string = f.getString(C0966R.string.m6g);
                C87412m.m108593f(string, "context.getString(com.te…one_quick_tip_check_hint)");
                String str4 = string + ' ' + str3;
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str4);
                C87412m.m108593f(newSpannable, "getInstance().newSpannable(msgContent)");
                int length = string.length();
                if ((f4Var2.f230723F & 16384) != 0) {
                    obj = new StyleSpan(0);
                    foregroundColorSpan = new ForegroundColorSpan(C76577a.m92153d(f, C0966R.color.FG_1));
                } else {
                    obj = new C77533b();
                    foregroundColorSpan = new ForegroundColorSpan(C76577a.m92153d(f, C0966R.color.FG_1));
                }
                newSpannable.setSpan(foregroundColorSpan, 0, length, 17);
                newSpannable.setSpan(obj, 0, str4.length(), 17);
                newSpannable.setSpan(new C57799b(bVar.mo91565f().getResources().getColor(C0966R.color.a1d), bVar.mo91565f().getResources().getColor(C0966R.color.a1f), f, str, fVar), string.length() + 1, str4.length(), 18);
                TextView textView = ((C74286a) cVar2).f218182b;
                if (textView != null) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                TextView textView2 = ((C74286a) cVar2).f218182b;
                if (textView2 != null) {
                    textView2.setClickable(true);
                }
                TextView textView3 = ((C74286a) cVar2).f218182b;
                if (textView3 != null) {
                    textView3.setText(newSpannable, TextView.BufferType.SPANNABLE);
                }
                C109750j jVar = C109750j.f328484a;
                String unsignedLongString = Util.getUnsignedLongString(fVar.f190092o);
                C87412m.m108593f(unsignedLongString, "getUnsignedLongString(ringtoneInfo.finderObjectId)");
                jVar.mo160992e(f4Var2, str2, unsignedLongString);
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.ChattingItemAppMsgRingtone", "error happened parse msg info");
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 1077936177;
    }
}

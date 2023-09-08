package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import de3.C107029o;
import de3.C45335p;
import de3.C75355a0;
import de3.C75362d0;
import de3.C75370s;
import di3.C86312j;
import ht1.C60179k4;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import nj3.C76874e0;
import o40.C61926c;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g6 */
public class C73995g6 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.g6$a */
    public static class C73996a extends C74023i {
        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.a0o);
            C74059i7.C74068g gVar = new C74059i7.C74068g();
            gVar.mo103138a(n4Var, false);
            n4Var.setTag(gVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            ((ChattingItemTranslate.C73916c) view.getTag()).mo103252b();
            e0Var.clear();
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74059i7.C74068g gVar = (C74059i7.C74068g) cVar;
            gVar.f217322b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            gVar.f217322b.setTag(C0966R.C0970id.f357681b72, Boolean.TRUE);
            gVar.f217322b.setMaxLines(Integer.MAX_VALUE);
            gVar.f217322b.setTag(new ChattingItemTranslate.C73916c(f4Var, bVar.mo91583x(), gVar, (String) null));
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
            Objects.requireNonNull(u);
            Map<String, String> map = u.f195491G2;
            boolean z = false;
            if (C74023i.m87878T()) {
                mo103093i0(gVar, false, true);
                if (f4Var.getStatus() == 1 || f4Var.getStatus() == 5) {
                    ImageView imageView = gVar.f217324d;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.f4812nl);
                    f4Var.f212665D1 = true;
                } else if (gVar.f217324d != null) {
                    if (mo103080N((C79368l) bVar.f193278b.mo102812a(C79368l.class), f4Var.getMsgId())) {
                        if (f4Var.f212665D1) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                            alphaAnimation.setDuration(300);
                            gVar.f217322b.startAnimation(alphaAnimation);
                            f4Var.f212665D1 = false;
                        }
                        gVar.f217324d.setVisibility(0);
                    } else {
                        gVar.f217324d.setVisibility(8);
                    }
                }
            } else {
                if (f4Var.getStatus() < 2) {
                    z = true;
                }
                mo103093i0(gVar, z, true);
            }
            C73995g6.m87807a(bVar, gVar, map, f4Var);
            mo102973h(gVar, bVar, f4Var, str);
            mo103089g(gVar, bVar, str, f4Var);
            gVar.f217322b.setOnLongClickListener(mo103098p(bVar));
            MMNeat7extView mMNeat7extView = gVar.f217322b;
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(gVar.f217322b.getContext())));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1080033329;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.g6$b */
    public static class C73997b extends C74023i {
        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.a0p);
            C74059i7.C74068g gVar = new C74059i7.C74068g();
            gVar.mo103138a(n4Var, false);
            n4Var.setTag(gVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            ((ChattingItemTranslate.C73916c) view.getTag()).mo103252b();
            e0Var.clear();
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74059i7.C74068g gVar = (C74059i7.C74068g) cVar;
            gVar.f217322b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            gVar.f217322b.setTag(C0966R.C0970id.f357681b72, Boolean.TRUE);
            gVar.f217322b.setMaxLines(Integer.MAX_VALUE);
            gVar.f217322b.setTag(new ChattingItemTranslate.C73916c(f4Var, bVar.mo91583x(), gVar, str));
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
            Objects.requireNonNull(u);
            Map<String, String> map = u.f195491G2;
            boolean z = false;
            if (C74023i.m87878T()) {
                mo103093i0(gVar, false, true);
                if (f4Var.getStatus() == 1 || f4Var.getStatus() == 5) {
                    ImageView imageView = gVar.f217324d;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    gVar.f217322b.setBackgroundResource(C0966R.C0969drawable.f4812nl);
                    f4Var.f212665D1 = true;
                } else if (gVar.f217324d != null) {
                    if (mo103080N((C79368l) bVar.f193278b.mo102812a(C79368l.class), f4Var.getMsgId())) {
                        if (f4Var.f212665D1) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                            alphaAnimation.setDuration(300);
                            gVar.f217322b.startAnimation(alphaAnimation);
                            f4Var.f212665D1 = false;
                        }
                        gVar.f217324d.setVisibility(0);
                    } else {
                        gVar.f217324d.setVisibility(8);
                    }
                }
            } else {
                if (f4Var.getStatus() < 2) {
                    z = true;
                }
                mo103093i0(gVar, z, true);
            }
            C73995g6.m87807a(bVar, gVar, map, f4Var);
            gVar.f217322b.setOnLongClickListener(mo103098p(bVar));
            MMNeat7extView mMNeat7extView = gVar.f217322b;
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(gVar.f217322b.getContext())));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 1080033329;
        }
    }

    /* renamed from: a */
    public static void m87807a(C67391b bVar, C74059i7.C74068g gVar, Map map, C72963f4 f4Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("msgId", f4Var.getMsgId());
        Context context = MMApplicationContext.getContext();
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = true;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221554h = C75370s.f221607b;
        d0Var.f221564r = true;
        d0Var.f221568v = 4;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.f221543A = 7;
        d0Var.f221546D = bundle;
        d0Var.f221567u = true;
        SpannableString d = d0Var.mo105696d((String) map.get(".msg.appmsg.content"), (int) gVar.f217322b.getTextSize(), false);
        gVar.f217332l.setText((String) map.get(".msg.appmsg.tip"));
        gVar.f217322b.mo104280c(d, TextView.BufferType.SPANNABLE, (Boolean) null);
        C115669n.INSTANCE.mo160131h(20849, 7, 1, C61926c.m72691p(f4Var.getMsgId()), ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(f4Var.mo101010p2()));
    }
}

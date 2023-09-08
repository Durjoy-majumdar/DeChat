package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import c30.C104289g;
import ck3.C67391b;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import de3.C107029o;
import de3.C75355a0;
import di3.C86312j;
import java.util.Map;
import nj3.C76874e0;
import p629ny.C76979h;
import te3.C78001u03;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f6 */
public class C73984f6 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f6$a */
    public static class C73985a extends C74023i implements NeatTextView.C75245c, C73774p2 {
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

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: b */
        public boolean mo103047b(View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74059i7.C74068g gVar = (C74059i7.C74068g) cVar;
            gVar.f217322b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            gVar.f217322b.setTag(C0966R.C0970id.f357681b72, Boolean.TRUE);
            gVar.f217322b.setMaxLines(Integer.MAX_VALUE);
            gVar.f217322b.setTag(new ChattingItemTranslate.C73916c(f4Var, bVar.mo91583x(), gVar, (String) null));
            Map<String, String> map = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2()).f195491G2;
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
            C73984f6.m87767a(bVar, gVar, map);
            mo102973h(gVar, bVar, f4Var, str);
            mo103089g(gVar, bVar, str, f4Var);
            gVar.f217322b.setOnLongClickListener(mo103098p(bVar));
            MMNeat7extView mMNeat7extView = gVar.f217322b;
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(gVar.f217322b.getContext())));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1078984753;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f6$b */
    public static class C73986b extends C74023i implements NeatTextView.C75245c, C73774p2 {
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

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: b */
        public boolean mo103047b(View view, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74059i7.C74068g gVar = (C74059i7.C74068g) cVar;
            gVar.f217322b.setTag(C0966R.C0970id.f357682b73, Long.valueOf(f4Var.getMsgId()));
            gVar.f217322b.setTag(C0966R.C0970id.f357681b72, Boolean.TRUE);
            gVar.f217322b.setMaxLines(Integer.MAX_VALUE);
            gVar.f217322b.setTag(new ChattingItemTranslate.C73916c(f4Var, bVar.mo91583x(), gVar, (String) null));
            Map<String, String> map = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2()).f195491G2;
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
            C73984f6.m87767a(bVar, gVar, map);
            gVar.f217322b.setOnLongClickListener(mo103098p(bVar));
            MMNeat7extView mMNeat7extView = gVar.f217322b;
            mMNeat7extView.setOnTouchListener(new C107029o(mMNeat7extView, new C75355a0(gVar.f217322b.getContext())));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 1078984753;
        }
    }

    /* renamed from: a */
    public static void m87767a(C67391b bVar, C74059i7.C74068g gVar, Map map) {
        boolean z;
        String str = (String) map.get(".msg.appmsg.lotteryinfo.attrcontent");
        String str2 = (String) map.get(".msg.appmsg.lotteryinfo.tip");
        String str3 = (String) map.get(".msg.appmsg.lotteryinfo.lottery_id");
        String str4 = (String) map.get(".msg.appmsg.lotteryinfo.object_id");
        String str5 = (String) map.get(".msg.appmsg.lotteryinfo.live_id");
        try {
            z = Boolean.parseBoolean((String) map.get(".msg.appmsg.lotteryinfo.is_audience"));
        } catch (Throwable th) {
            Log.m105920e("ChattingItemFinderLiveLottery", "safeGetBoolean error:" + th);
            z = false;
        }
        C78001u03 u032 = new C78001u03();
        u032.f228275d = str3;
        u032.f228276e = str4;
        u032.f228277f = str5;
        u032.f228278g = z;
        u032.f228279h = bVar.mo91576q();
        Bundle bundle = new Bundle();
        try {
            bundle.putByteArray("KEY_FINDER_LIVE_JUMP_DATA", u032.toByteArray());
        } catch (Throwable th4) {
            Log.m105920e("ChattingItemFinderLiveLottery", "putByteArray error:" + th4);
        }
        gVar.f217332l.setText(str2);
        int i = z ? 2 : 1;
        try {
            C115669n nVar = C115669n.INSTANCE;
            C104289g gVar2 = new C104289g();
            gVar2.mo145953n("user_type", i);
            nVar.mo160131h(20849, 6, 1, str3, "", gVar2.toString().replace(",", ";"));
        } catch (Exception e) {
            Log.m105924i("ChattingItemFinderLiveLottery", "[setContent] e.msg:" + e.getMessage());
        }
        gVar.f217322b.mo104280c(((C76979h) C86312j.m106911c(C76979h.class)).hv0(MMApplicationContext.getContext(), str, (int) gVar.f217322b.getTextSize(), 4, bundle, true), TextView.BufferType.SPANNABLE, (Boolean) null);
    }
}

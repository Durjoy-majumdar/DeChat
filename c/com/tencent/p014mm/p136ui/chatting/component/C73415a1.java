package com.tencent.p014mm.p136ui.chatting.component;

import android.graphics.Rect;
import android.os.Vibrator;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.viewitems.C73921a3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p270xi.C91212b;
import p645pj.C77095h;
import te3.C64418hb3;
import ud2.C78150h;
import vd2.C78384d;
import zt3.C119157j;

@C91212b(exportInterface = C73657y2.class)
/* renamed from: com.tencent.mm.ui.chatting.component.a1 */
public class C73415a1 extends C73412a implements C73657y2 {

    /* renamed from: e */
    public Set<Long> f215766e = new HashSet();

    /* renamed from: f */
    public Map<Long, C64418hb3> f215767f = new HashMap();

    /* renamed from: g */
    public Animation f215768g = AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2338a3);

    /* renamed from: h */
    public Vibrator f215769h = ((Vibrator) MMApplicationContext.getContext().getSystemService("vibrator"));

    /* renamed from: com.tencent.mm.ui.chatting.component.a1$a */
    public class C73416a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f215770d;

        public C73416a(Map map) {
            this.f215770d = map;
        }

        public void run() {
            Class cls = C78384d.class;
            Class cls2 = C75700k0.class;
            for (Long longValue : this.f215770d.keySet()) {
                long longValue2 = longValue.longValue();
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(longValue2);
                if (b002.getMsgId() == longValue2) {
                    C64418hb3 Y5 = C73415a1.this.mo102366Y5((C64418hb3) this.f215770d.get(Long.valueOf(longValue2)), ((C78384d) C86312j.m106911c(cls)).mo108125bB(b002.getContent()));
                    try {
                        if (Y5.f183464e.size() > 0) {
                            Y5.f183464e.getLast().f227614n = 1;
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ChattingPatMsgUpdateComponent", e, "", new Object[0]);
                    }
                    b002.mo108732L2(((C78384d) C86312j.m106911c(cls)).H10(Y5));
                    b002.setType(922746929);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(longValue2, b002);
                }
            }
            this.f215770d.clear();
        }
    }

    /* renamed from: Q1 */
    public void mo102364Q1(long j) {
        ((HashSet) this.f215766e).add(Long.valueOf(j));
    }

    /* renamed from: T5 */
    public void mo102365T5() {
        Log.m105924i("MicroMsg.ChattingPatMsgUpdateComponent", "onFinish");
        ((HashSet) this.f215766e).clear();
        ((C78150h) C86312j.m106911c(C78150h.class)).wx0();
        if (!((HashMap) this.f215767f).isEmpty()) {
            Log.m105925i("MicroMsg.ChattingPatMsgUpdateComponent", "updatedPatMsg id: %s", ((HashMap) this.f215767f).keySet());
            HashMap hashMap = new HashMap(this.f215767f);
            ((HashMap) this.f215767f).clear();
            ((C119157j) C119157j.f356862d).mo183876g(new C73416a(hashMap), "updatePatMsgWhenExitChatting");
        }
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        int i4;
        long j;
        Class cls;
        HashMap hashMap;
        HashSet hashSet;
        HashSet hashSet2;
        HashMap hashMap2;
        Pair pair;
        HashMap hashMap3;
        int i5 = i2;
        Class cls2 = C75700k0.class;
        Class cls3 = C78384d.class;
        Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "onScroll, headerCount:%d, firstVisible:%d, lastVisible:%d", Integer.valueOf(this.f215752d.mo91568i()), Integer.valueOf(i), Integer.valueOf((i + i5) - 1));
        long currentTicks = Util.currentTicks();
        try {
            HashMap hashMap4 = new HashMap();
            HashSet hashSet3 = new HashSet();
            String s = C75592q0.m90789s();
            C72963f4 f4Var = null;
            int i6 = 0;
            while (i6 < i5) {
                View childAt = ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().getChildAt(i6);
                if (childAt == null || childAt.getTag() == null) {
                    cls = cls2;
                    j = currentTicks;
                    hashSet = hashSet3;
                    i4 = i6;
                    hashMap = hashMap4;
                } else {
                    if (childAt.getTag() instanceof C73921a3.C73924c) {
                        if (f4Var == null) {
                            f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).Ex0(this.f215752d.mo91577r());
                        }
                        long currentTicks2 = Util.currentTicks();
                        C73921a3.C73924c cVar = (C73921a3.C73924c) childAt.getTag();
                        j = currentTicks;
                        long longValue = ((Long) cVar.f216987c.getTag()).longValue();
                        LinearLayout linearLayout = cVar.f216986b;
                        int i7 = Integer.MAX_VALUE;
                        int i8 = Integer.MIN_VALUE;
                        int i9 = 0;
                        while (i9 < linearLayout.getChildCount()) {
                            View childAt2 = linearLayout.getChildAt(i9);
                            LinearLayout linearLayout2 = linearLayout;
                            Rect rect = new Rect();
                            childAt2.getLocalVisibleRect(rect);
                            if (rect.height() > 0) {
                                if (i9 < i7) {
                                    i7 = i9;
                                }
                                if (i9 > i8) {
                                    i8 = i9;
                                }
                            }
                            i9++;
                            linearLayout = linearLayout2;
                        }
                        Pair create = Pair.create(Integer.valueOf(i7), Integer.valueOf(i8));
                        Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "msg %d, line %d-%d", Long.valueOf(longValue), create.first, create.second);
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(longValue);
                        Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "msg %d handle scroll cost item1 %d ms", Long.valueOf(longValue), Long.valueOf(Util.ticksToNow(currentTicks2)));
                        long currentTicks3 = Util.currentTicks();
                        cls = cls2;
                        C64418hb3 hb32 = (C64418hb3) ((HashMap) this.f215767f).get(Long.valueOf(longValue));
                        if (hb32 == null) {
                            hb32 = ((C78384d) C86312j.m106911c(cls3)).mo108125bB(b002.getContent());
                        }
                        if (longValue == f4Var.getMsgId()) {
                            hashSet2 = hashSet3;
                            hashMap2 = hashMap4;
                            i4 = i6;
                            Log.m105925i("MicroMsg.ChattingPatMsgUpdateComponent", "merge last pat msg %d", Long.valueOf(longValue));
                            hb32 = mo102366Y5(hb32, ((C78384d) C86312j.m106911c(cls3)).mo108125bB(f4Var.getContent()));
                        } else {
                            hashMap2 = hashMap4;
                            hashSet2 = hashSet3;
                            i4 = i6;
                            if (((C78384d) C86312j.m106911c(cls3)).Xo0(longValue)) {
                                Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "msg %d handle scroll cost item2 %d ms", Long.valueOf(longValue), Long.valueOf(Util.ticksToNow(currentTicks3)));
                                hashMap = hashMap2;
                            }
                        }
                        Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "msg %d handle scroll cost item2 %d ms", Long.valueOf(longValue), Long.valueOf(Util.ticksToNow(currentTicks3)));
                        long currentTicks4 = Util.currentTicks();
                        if (((Integer) create.first).intValue() <= ((Integer) create.second).intValue()) {
                            int intValue = ((Integer) create.first).intValue();
                            while (intValue <= ((Integer) create.second).intValue()) {
                                Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "msg %d mark record %d read", Long.valueOf(b002.getMsgId()), Integer.valueOf(intValue));
                                if (intValue < 0 || intValue >= hb32.f183464e.size()) {
                                    hashMap3 = hashMap2;
                                    pair = create;
                                } else {
                                    if (s.equals(hb32.f183464e.get(intValue).f227607d) || !s.equals(hb32.f183464e.get(intValue).f227608e) || hb32.f183464e.get(intValue).f227611h != 0) {
                                        hashMap3 = hashMap2;
                                    } else {
                                        hashMap3 = hashMap2;
                                        if (!hashMap3.containsKey(Integer.valueOf(i4))) {
                                            pair = create;
                                            hashMap3.put(Integer.valueOf(i4), -1);
                                            hb32.f183464e.get(intValue).f227611h = 1;
                                            hb32.f183464e.get(intValue).f227614n = 1;
                                        }
                                    }
                                    pair = create;
                                    hb32.f183464e.get(intValue).f227611h = 1;
                                    hb32.f183464e.get(intValue).f227614n = 1;
                                }
                                intValue++;
                                create = pair;
                                hashMap2 = hashMap3;
                            }
                        }
                        hashMap = hashMap2;
                        Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "msg %d handle scroll cost item3 %d ms", Long.valueOf(longValue), Long.valueOf(Util.ticksToNow(currentTicks4)));
                        ((HashMap) this.f215767f).put(Long.valueOf(b002.getMsgId()), hb32);
                    } else {
                        cls = cls2;
                        j = currentTicks;
                        hashSet2 = hashSet3;
                        i4 = i6;
                        hashMap = hashMap4;
                        if ((childAt.getTag() instanceof C74023i.C74026c) && ((C74023i.C74026c) childAt.getTag()).chattingItem.mo26232R()) {
                            hashSet = hashSet2;
                            hashSet.add(Integer.valueOf(i4));
                        }
                    }
                    hashSet = hashSet2;
                }
                i6 = i4 + 1;
                i5 = i2;
                hashMap4 = hashMap;
                currentTicks = j;
                hashSet3 = hashSet;
                cls2 = cls;
            }
            HashSet hashSet4 = hashSet3;
            HashMap hashMap5 = hashMap4;
            Log.m105919d("MicroMsg.ChattingPatMsgUpdateComponent", "handle scroll cost %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
            Iterator it = hashSet4.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                for (Integer intValue3 : hashMap5.keySet()) {
                    int intValue4 = intValue3.intValue();
                    int intValue5 = ((Integer) hashMap5.get(Integer.valueOf(intValue4))).intValue();
                    if (intValue5 == -1) {
                        hashMap5.put(Integer.valueOf(intValue4), Integer.valueOf(intValue2));
                    } else if (Math.abs(intValue4 - intValue2) < Math.abs(intValue4 - intValue5)) {
                        hashMap5.put(Integer.valueOf(intValue4), Integer.valueOf(intValue2));
                    }
                }
            }
            HashSet hashSet5 = new HashSet(hashMap5.values());
            Log.m105925i("MicroMsg.ChattingPatMsgUpdateComponent", "%s are going to shake", hashSet5);
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                int intValue6 = ((Integer) it4.next()).intValue();
                if (intValue6 >= 0) {
                    C74023i.C74026c cVar2 = (C74023i.C74026c) ((BaseChattingUIFragment) this.f215752d.f193287k).mo102031Z().getChildAt(intValue6).getTag();
                    if (cVar2.avatarIV.getAnimation() == null || cVar2.avatarIV.getAnimation().hasEnded()) {
                        cVar2.avatarIV.startAnimation(this.f215768g);
                        if (!C77095h.m93061d(this.f215752d.mo91577r())) {
                            this.f215769h.vibrate(10);
                        }
                    }
                }
            }
            hashMap5.clear();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingPatMsgUpdateComponent", e, "", new Object[0]);
        }
    }

    /* renamed from: Y5 */
    public final C64418hb3 mo102366Y5(C64418hb3 hb32, C64418hb3 hb33) {
        C64418hb3 hb34 = new C64418hb3();
        int min = Math.min(hb33.f183464e.size(), hb32.f183464e.size());
        hb34.f183463d = hb32.f183463d;
        for (int i = 0; i < min; i++) {
            hb34.f183464e.add(hb33.f183464e.get(i));
            hb34.f183464e.get(i).f227611h = hb32.f183464e.get(i).f227611h;
        }
        if (hb33.f183464e.size() >= hb32.f183464e.size()) {
            while (min < hb33.f183464e.size()) {
                hb34.f183464e.add(hb33.f183464e.get(min));
                min++;
            }
        } else {
            Log.m105929w("MicroMsg.ChattingPatMsgUpdateComponent", "db record list %d, updated record list %d", Integer.valueOf(hb33.f183464e.size()), Integer.valueOf(hb32.f183464e.size()));
        }
        return hb34;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
    }

    /* renamed from: l3 */
    public boolean mo102367l3(long j) {
        return ((HashSet) this.f215766e).contains(Long.valueOf(j));
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
    }
}

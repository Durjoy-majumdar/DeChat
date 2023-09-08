package ew2;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import cw2.C97387k;
import cw2.C97393p;
import di3.C86312j;
import dw2.C45456e;
import dw2.C45465h;
import dw2.C58447b;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import kw2.C99263b;
import kw2.C99268i;
import l20.C21388a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p327ct.C30914c;
import p823sg.C90193h;
import pe3.C47465a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.hc4;
import te3.lc4;
import te3.mc4;
import te3.nb4;
import te3.ob4;
import te3.pb4;
import te3.rb4;
import xv2.C102775d;
import xv2.C102779g;
import z04.C119027c;
import zv2.C103109c;

/* renamed from: ew2.b */
public final class C97758b implements C11385n {

    /* renamed from: d */
    public static final C97758b f286820d = new C97758b();

    /* renamed from: e */
    public static final String f286821e = (C86709a0.m107535s().f251806d + "story/commentCache.proto");

    /* renamed from: f */
    public static final String f286822f = (((C102775d) C86312j.m106911c(C102775d.class)).mo134174rA() + "commentCache.proto");

    /* renamed from: g */
    public static final int f286823g = Integer.MAX_VALUE;

    /* renamed from: h */
    public static final String f286824h = "MicroMsg.StoryCommentLogic";

    /* renamed from: i */
    public static final nb4 f286825i = new nb4();

    /* renamed from: j */
    public static pb4 f286826j;

    /* renamed from: n */
    public static C97757a f286827n;

    /* renamed from: o */
    public static int f286828o = -1;

    /* renamed from: p */
    public static final ArrayList<C32229r<Long, Boolean, String, String, C13598b0>> f286829p = new ArrayList<>();

    /* renamed from: q */
    public static final LinkedList<C102779g> f286830q = new LinkedList<>();

    /* renamed from: r */
    public static final LinkedList<C32227p<Boolean, Long, C13598b0>> f286831r = new LinkedList<>();

    /* renamed from: ew2.b$a */
    public static final class C97759a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C99263b> f286832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97759a(C8479f0<C99263b> f0Var) {
            super(0);
            this.f286832d = f0Var;
        }

        public Object invoke() {
            ArrayList<C32229r<Long, Boolean, String, String, C13598b0>> arrayList = C97758b.f286829p;
            C8479f0<C99263b> f0Var = this.f286832d;
            Iterator<C32229r<Long, Boolean, String, String, C13598b0>> it = arrayList.iterator();
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((C99263b) f0Var.f27484d).field_storyId);
                Boolean bool = Boolean.TRUE;
                C99263b bVar = (C99263b) f0Var.f27484d;
                it.next().mo162I(valueOf, bool, bVar.f291056x, bVar.f291057y);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ew2.b$b */
    public static final class C97760b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C99263b> f286833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97760b(C8479f0<C99263b> f0Var) {
            super(0);
            this.f286833d = f0Var;
        }

        public Object invoke() {
            ArrayList<C32229r<Long, Boolean, String, String, C13598b0>> arrayList = C97758b.f286829p;
            C8479f0<C99263b> f0Var = this.f286833d;
            Iterator<C32229r<Long, Boolean, String, String, C13598b0>> it = arrayList.iterator();
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((C99263b) f0Var.f27484d).field_storyId);
                Boolean bool = Boolean.TRUE;
                C99263b bVar = (C99263b) f0Var.f27484d;
                it.next().mo162I(valueOf, bool, bVar.f291056x, bVar.f291057y);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ew2.b$c */
    public static final class C97761c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f286834d;

        /* renamed from: e */
        public final /* synthetic */ int f286835e;

        /* renamed from: f */
        public final /* synthetic */ String f286836f;

        public C97761c(long j, int i, String str) {
            this.f286834d = j;
            this.f286835e = i;
            this.f286836f = str;
        }

        public final void run() {
            C97758b.f286820d.mo137092f(this.f286834d, this.f286835e, this.f286836f);
        }
    }

    /* renamed from: ew2.b$d */
    public static final class C97762d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ rb4 f286837d;

        public C97762d(rb4 rb4) {
            this.f286837d = rb4;
        }

        public final void run() {
            C97758b.f286820d.mo137100o(this.f286837d.f140809d);
        }
    }

    /* renamed from: ew2.b$e */
    public static final class C97763e implements Runnable {

        /* renamed from: d */
        public static final C97763e f286838d = new C97763e();

        public final void run() {
            C97758b.f286820d.mo137098m();
        }
    }

    /* renamed from: ew2.b$f */
    public static final class C97764f implements Runnable {

        /* renamed from: d */
        public static final C97764f f286839d = new C97764f();

        public final void run() {
            C97758b.f286820d.mo137098m();
        }
    }

    /* renamed from: ew2.b$g */
    public static final class C97765g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C99263b> f286840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97765g(C8479f0<C99263b> f0Var) {
            super(0);
            this.f286840d = f0Var;
        }

        public Object invoke() {
            ArrayList<C32229r<Long, Boolean, String, String, C13598b0>> arrayList = C97758b.f286829p;
            C8479f0<C99263b> f0Var = this.f286840d;
            Iterator<C32229r<Long, Boolean, String, String, C13598b0>> it = arrayList.iterator();
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((C99263b) f0Var.f27484d).field_storyId);
                Boolean bool = Boolean.FALSE;
                C99263b bVar = (C99263b) f0Var.f27484d;
                it.next().mo162I(valueOf, bool, bVar.f291056x, bVar.f291057y);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ew2.b$h */
    public static final class C97766h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f286841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97766h(boolean z) {
            super(0);
            this.f286841d = z;
        }

        public Object invoke() {
            LinkedList<C102779g> linkedList = C97758b.f286830q;
            boolean z = this.f286841d;
            for (C102779g a : linkedList) {
                a.mo142534a(z);
            }
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33509r(352279, this.f286841d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i */
    public static C97757a m126114i(C97758b bVar, long j, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, int i3, Object obj) {
        int i4 = i3;
        boolean z3 = false;
        int i5 = (i4 & 128) != 0 ? 0 : i;
        int i6 = (i4 & 256) != 0 ? 0 : i2;
        bVar.getClass();
        StringBuilder sb = new StringBuilder();
        StoryCore.C96337h hVar = StoryCore.f281736t;
        sb.append(hVar.mo134187e());
        String str5 = "";
        sb.append(str5);
        sb.append(Util.currentTicks());
        byte[] bytes = sb.toString().getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        pb4 pb4 = new pb4();
        pb4.f299123j = f;
        pb4.f299117d = j;
        pb4.f299121h = str2;
        pb4.f299119f = hVar.mo134187e();
        pb4.f299120g = str;
        pb4.f299118e = C31543z5.m39455e();
        pb4.f299122i = 1;
        pb4.f299125o = z ? 1 : 0;
        pb4.f299127q = z2 ? 1 : 0;
        pb4.f299128r = str3;
        pb4.f299129s = str4;
        pb4.f299130t = i5;
        pb4.f299131u = i6;
        f286825i.f138527d.add(pb4);
        C97757a aVar = new C97757a();
        aVar.f286811d = pb4.f299117d;
        String str6 = pb4.f299119f;
        if (str6 == null) {
            str6 = str5;
        }
        aVar.f286808a = str6;
        String str7 = pb4.f299121h;
        aVar.f286809b = str7 == null ? str5 : str7;
        aVar.f286810c = pb4.f299118e;
        if (str7 == null || str7.length() == 0) {
            z3 = true;
        }
        aVar.f286814g = z3;
        String str8 = pb4.f299120g;
        if (str8 == null) {
            str8 = str5;
        }
        aVar.f286817j = str8;
        String str9 = pb4.f299129s;
        if (str9 != null) {
            str5 = str9;
        }
        aVar.f286818k = str5;
        aVar.f286819l = pb4.f299130t;
        f286827n = aVar;
        bVar.mo137098m();
        hVar.mo134194l().post(new C97767c(pb4));
        C97757a aVar2 = f286827n;
        C87412m.m108591d(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo137087a(C32229r<? super Long, ? super Boolean, ? super String, ? super String, C13598b0> rVar) {
        C87412m.m108594g(rVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C32229r<Long, Boolean, String, String, C13598b0>> arrayList = f286829p;
        if (!arrayList.contains(rVar)) {
            arrayList.add(rVar);
        }
    }

    /* renamed from: b */
    public final void mo137088b(lc4 lc4) {
        C87412m.m108594g(lc4, "syncMsg");
        String str = f286824h;
        Log.m105924i(str, "addSyncComment " + lc4.f184072d + ' ' + lc4.f184074f.f298807o + ' ' + lc4.f184074f.f298806n);
        C8479f0 f0Var = new C8479f0();
        StoryCore.C96337h hVar = StoryCore.f281736t;
        T Lo = hVar.mo134188f().mo138634Lo(lc4.f184074f.f298799d);
        f0Var.f27484d = Lo;
        if (Lo == null) {
            T bVar = new C99263b();
            f0Var.f27484d = bVar;
            bVar.field_storyId = lc4.f184072d;
        }
        mo137096k(lc4);
        T t = f0Var.f27484d;
        if (((C99263b) t).field_readCommentTime == 0) {
            ((C99263b) t).field_readCommentTime = 1;
        }
        C99263b bVar2 = (C99263b) t;
        String str2 = lc4.f184074f.f298800e;
        C87412m.m108593f(str2, "syncMsg.SyncMsgDetail.FromUserName");
        bVar2.getClass();
        bVar2.f291056x = str2;
        C99263b bVar3 = (C99263b) f0Var.f27484d;
        String str3 = lc4.f184074f.f298811s.f298335e;
        C87412m.m108593f(str3, "syncMsg.SyncMsgDetail.StoryObject.UserName");
        bVar3.getClass();
        bVar3.f291057y = str3;
        T t2 = f0Var.f27484d;
        mc4 mc4 = lc4.f184074f;
        ((C99263b) t2).field_syncCommentId = mc4.f298807o;
        ((C99263b) t2).field_syncCommentTime = mc4.f298806n;
        hVar.mo134188f().replace((IAutoDBItem) f0Var.f27484d);
        C61926c.m72668M(new C97759a(f0Var));
    }

    /* renamed from: c */
    public final void mo137089c(lc4 lc4) {
        C87412m.m108594g(lc4, "syncMsg");
        boolean a = C103109c.f304232b.mo108963a();
        String str = f286824h;
        Log.m105924i(str, "addSyncVisit " + lc4.f184072d + ' ' + lc4.f184074f.f298807o + ' ' + lc4.f184074f.f298806n + " enableVisit:" + a);
        mo137096k(lc4);
        C8479f0 f0Var = new C8479f0();
        StoryCore.C96337h hVar = StoryCore.f281736t;
        T Lo = hVar.mo134188f().mo138634Lo(lc4.f184074f.f298799d);
        f0Var.f27484d = Lo;
        if (Lo == null) {
            T bVar = new C99263b();
            f0Var.f27484d = bVar;
            bVar.field_storyId = lc4.f184072d;
        }
        if (((C99263b) f0Var.f27484d).field_readCommentTime == 0) {
            Integer num = null;
            if (Util.isNullOrNil(lc4.f184074f.f298804i)) {
                LinkedList<ob4> linkedList = lc4.f184074f.f298811s.f298343p;
                C87412m.m108593f(linkedList, "bubbleList");
                ob4 ob4 = (ob4) C110818d0.m150917O(linkedList, linkedList.size() - 2);
                if (ob4 != null) {
                    num = Integer.valueOf(ob4.f299019i);
                }
            } else {
                LinkedList<ob4> linkedList2 = lc4.f184074f.f298811s.f298341n;
                C87412m.m108593f(linkedList2, "commentList");
                ob4 ob42 = (ob4) C110818d0.m150917O(linkedList2, linkedList2.size() - 2);
                if (ob42 != null) {
                    num = Integer.valueOf(ob42.f299019i);
                }
            }
            ((C99263b) f0Var.f27484d).field_readCommentTime = num != null ? num.intValue() : 1;
        }
        C99263b bVar2 = (C99263b) f0Var.f27484d;
        String str2 = lc4.f184074f.f298800e;
        C87412m.m108593f(str2, "syncMsg.SyncMsgDetail.FromUserName");
        bVar2.getClass();
        bVar2.f291056x = str2;
        C99263b bVar3 = (C99263b) f0Var.f27484d;
        String str3 = lc4.f184074f.f298811s.f298335e;
        C87412m.m108593f(str3, "syncMsg.SyncMsgDetail.StoryObject.UserName");
        bVar3.getClass();
        bVar3.f291057y = str3;
        T t = f0Var.f27484d;
        mc4 mc4 = lc4.f184074f;
        ((C99263b) t).field_syncCommentId = mc4.f298807o;
        ((C99263b) t).field_syncCommentTime = mc4.f298806n;
        hVar.mo134188f().replace((IAutoDBItem) f0Var.f27484d);
        C61926c.m72668M(new C97760b(f0Var));
    }

    /* renamed from: d */
    public final void mo137090d(lc4 lc4) {
        String str;
        T t;
        ob4 ob4;
        boolean z;
        ob4 ob42;
        boolean z2;
        ob4 ob43;
        boolean z3;
        boolean z4;
        C87412m.m108594g(lc4, "syncMsg");
        String str2 = f286824h;
        Log.m105924i(str2, "delSyncComment " + lc4.f184072d + ' ' + lc4.f184074f.f298807o);
        mc4 mc4 = lc4.f184074f;
        mo137092f(mc4.f298799d, mc4.f298807o, mc4.f298804i);
        long j = lc4.f184074f.f298799d;
        StoryCore.C96337h hVar = StoryCore.f281736t;
        C99268i Ow = hVar.mo134191i().mo138664Ow(j);
        C8479f0 f0Var = new C8479f0();
        T Lo = hVar.mo134188f().mo138634Lo(j);
        if (Lo != null) {
            f0Var.f27484d = Lo;
            String str3 = "";
            if (Ow == null) {
                Log.m105924i(str2, "updateLastCommentSync will reset to 0 0");
                C99263b bVar = (C99263b) f0Var.f27484d;
                bVar.field_readCommentTime = 0;
                bVar.field_readCommentId = 0;
                bVar.field_syncCommentTime = 0;
                bVar.field_syncCommentId = 0;
                bVar.getClass();
                bVar.f291056x = str3;
            } else {
                hc4 hc4 = new hc4();
                try {
                    hc4.parseFrom(Ow.field_attrBuf);
                } catch (Exception unused) {
                }
                LinkedList<ob4> linkedList = hc4.f298341n;
                C87412m.m108593f(linkedList, "storyObj.CommentList");
                ListIterator<ob4> listIterator = linkedList.listIterator(linkedList.size());
                while (true) {
                    t = null;
                    if (!listIterator.hasPrevious()) {
                        ob4 = null;
                        break;
                    }
                    ob4 = listIterator.previous();
                    ob4 ob44 = ob4;
                    if (ob44.f299024q == 0 || ob44.f299019i > ((C99263b) f0Var.f27484d).field_readCommentTime) {
                        z4 = false;
                        continue;
                    } else {
                        z4 = true;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
                ob4 ob45 = ob4;
                if (ob45 == null) {
                    if (C103109c.f304232b.mo108963a()) {
                        LinkedList<ob4> linkedList2 = hc4.f298353z;
                        C87412m.m108593f(linkedList2, "storyObj.VisitorList");
                        ListIterator<ob4> listIterator2 = linkedList2.listIterator(linkedList2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                ob43 = null;
                                break;
                            }
                            ob43 = listIterator2.previous();
                            ob4 ob46 = ob43;
                            if (ob46.f299024q == 0 || ob46.f299019i > ((C99263b) f0Var.f27484d).field_readCommentTime) {
                                z3 = false;
                                continue;
                            } else {
                                z3 = true;
                                continue;
                            }
                            if (z3) {
                                break;
                            }
                        }
                        ob45 = ob43;
                    } else {
                        LinkedList<ob4> linkedList3 = hc4.f298343p;
                        C87412m.m108593f(linkedList3, "storyObj.BubbleList");
                        ListIterator<ob4> listIterator3 = linkedList3.listIterator(linkedList3.size());
                        while (true) {
                            if (!listIterator3.hasPrevious()) {
                                ob42 = null;
                                break;
                            }
                            ob42 = listIterator3.previous();
                            ob4 ob47 = ob42;
                            if (ob47.f299024q == 0 || ob47.f299019i > ((C99263b) f0Var.f27484d).field_readCommentTime) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                        ob45 = ob42;
                    }
                }
                String str4 = f286824h;
                StringBuilder sb = new StringBuilder();
                sb.append("updateLastCommentSync will reset to ");
                sb.append(ob45 != null ? Integer.valueOf(ob45.f299019i) : null);
                sb.append(' ');
                sb.append(ob45 != null ? Integer.valueOf(ob45.f299024q) : null);
                Log.m105924i(str4, sb.toString());
                C99263b bVar2 = (C99263b) f0Var.f27484d;
                bVar2.field_readCommentTime = ob45 != null ? ob45.f299019i : 0;
                bVar2.field_readCommentId = ob45 != null ? ob45.f299024q : 0;
                bVar2.field_syncCommentTime = ob45 != null ? ob45.f299019i : 0;
                bVar2.field_syncCommentId = ob45 != null ? ob45.f299024q : 0;
                String str5 = ob45 != null ? ob45.f299015e : null;
                if (str5 == null) {
                    str5 = str3;
                }
                bVar2.getClass();
                bVar2.f291056x = str5;
                LinkedList<ob4> linkedList4 = hc4.f298341n;
                C87412m.m108593f(linkedList4, "storyObj.CommentList");
                Iterator<T> it = linkedList4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    ob4 ob48 = (ob4) next;
                    if (ob48.f299024q == 0 || ob48.f299019i <= ((C99263b) f0Var.f27484d).field_readCommentTime) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t = next;
                        break;
                    }
                }
                if (((ob4) t) == null) {
                    Ow.mo138661t2(false);
                    C97393p.f285894a.mo136665i(Ow.field_storyID, Ow.field_localFlag);
                }
            }
            C99263b bVar3 = (C99263b) f0Var.f27484d;
            if (!(Ow == null || (str = Ow.field_userName) == null)) {
                str3 = str;
            }
            bVar3.getClass();
            bVar3.f291057y = str3;
            StoryCore.f281736t.mo134188f().replace((IAutoDBItem) f0Var.f27484d);
            C61926c.m72668M(new C97768d(f0Var));
        }
    }

    /* renamed from: e */
    public final void mo137091e(long j, int i, String str, String str2) {
        C87412m.m108594g(str2, "content");
        String str3 = f286824h;
        Log.m105924i(str3, "deleteComment storyId:" + j + " commentId:" + i + " sessionId:" + str + " content:" + str2);
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            StoryCore.C96337h hVar = StoryCore.f281736t;
            sb.append(hVar.mo134187e());
            sb.append("");
            sb.append(Util.currentTicks());
            byte[] bytes = sb.toString().getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            String f = C90193h.m112878f(bytes);
            pb4 pb4 = new pb4();
            pb4.f299117d = j;
            pb4.f299123j = f;
            pb4.f299124n = i;
            pb4.f299118e = C31543z5.m39455e();
            pb4.f299122i = 3;
            pb4.f299128r = str;
            pb4.f299119f = hVar.mo134187e();
            pb4.f299120g = "";
            f286825i.f138527d.add(pb4);
            mo137098m();
        }
        StoryCore.f281736t.mo134194l().post(new C97761c(j, i, str2));
    }

    /* renamed from: f */
    public final void mo137092f(long j, int i, String str) {
        int i2;
        C99268i Ow = StoryCore.f281736t.mo134191i().mo138664Ow(j);
        if (Ow != null) {
            hc4 hc4 = new hc4();
            try {
                hc4.parseFrom(Ow.field_attrBuf);
            } catch (Exception unused) {
            }
            int i3 = 0;
            if (i == 0) {
                LinkedList<ob4> linkedList = hc4.f298341n;
                C87412m.m108593f(linkedList, "storyObj.CommentList");
                Iterator<ob4> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (Util.isEqual(it.next().f299020j, str)) {
                        i2 = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            } else {
                LinkedList<ob4> linkedList2 = hc4.f298341n;
                C87412m.m108593f(linkedList2, "storyObj.CommentList");
                Iterator<ob4> it4 = linkedList2.iterator();
                i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (it4.next().f299024q == i) {
                        break;
                    }
                    i2++;
                }
            }
            i2 = -1;
            if (i2 != -1) {
                hc4.f298341n.remove(i2);
                hc4.f298340j = hc4.f298341n.size();
                try {
                    Ow.field_attrBuf = hc4.toByteArray();
                } catch (Exception unused2) {
                }
                StoryCore.f281736t.mo134191i().update(j, Ow);
            }
        }
    }

    /* renamed from: g */
    public final ob4 mo137093g(pb4 pb4) {
        ob4 ob4 = new ob4();
        ob4.f299014d = pb4.f299117d;
        ob4.f299024q = pb4.f299124n;
        ob4.f299015e = pb4.f299119f;
        ob4.f299016f = pb4.f299120g;
        ob4.f299020j = pb4.f299121h;
        ob4.f299019i = pb4.f299118e;
        ob4.f299027t = pb4.f299125o;
        ob4.f299028u = pb4.f299127q;
        ob4.f299023p = pb4.f299130t;
        ob4.f299022o = pb4.f299131u;
        return ob4;
    }

    /* renamed from: h */
    public final C97757a mo137094h(long j, String str, String str2, String str3, String str4, int i) {
        String str5 = str;
        String str6 = str2;
        C87412m.m108594g(str5, "content");
        C87412m.m108594g(str6, "toUsername");
        String str7 = str4;
        C87412m.m108594g(str7, "storyOwner");
        String str8 = f286824h;
        StringBuilder sb = new StringBuilder();
        sb.append("postComment: ");
        long j2 = j;
        sb.append(j);
        sb.append(' ');
        sb.append(str5);
        sb.append(' ');
        sb.append(str6);
        Log.m105924i(str8, sb.toString());
        return m126114i(this, j, str6, str5, false, false, str3, str7, i, 0, 256, (Object) null);
    }

    /* renamed from: j */
    public final void mo137095j(C32229r<? super Long, ? super Boolean, ? super String, ? super String, C13598b0> rVar) {
        C87412m.m108594g(rVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        f286829p.remove(rVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0138 A[EDGE_INSN: B:91:0x0138->B:67:0x0138 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137096k(te3.lc4 r14) {
        /*
            r13 = this;
            te3.ob4 r0 = new te3.ob4
            r0.<init>()
            long r1 = r14.f184072d
            r0.f299014d = r1
            te3.mc4 r3 = r14.f184074f
            int r4 = r3.f298807o
            r0.f299024q = r4
            java.lang.String r4 = r3.f298800e
            r0.f299015e = r4
            java.lang.String r4 = r3.f298801f
            r0.f299016f = r4
            java.lang.String r4 = r3.f298804i
            r0.f299020j = r4
            int r4 = r3.f298806n
            r0.f299019i = r4
            int r4 = r3.f298812t
            r0.f299027t = r4
            int r4 = r3.f298808p
            r0.f299023p = r4
            int r3 = r3.f298805j
            r4 = 7
            r5 = 4
            if (r3 != r4) goto L_0x002f
            r0.f299022o = r5
        L_0x002f:
            com.tencent.mm.plugin.story.model.StoryCore$h r3 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            kw2.j r3 = r3.mo134191i()
            kw2.i r3 = r3.mo138664Ow(r1)
            if (r3 != 0) goto L_0x0044
            te3.mc4 r14 = r14.f184074f
            te3.hc4 r14 = r14.f298811s
            r13.mo137100o(r14)
            goto L_0x0179
        L_0x0044:
            te3.hc4 r14 = new te3.hc4
            r14.<init>()
            byte[] r4 = r3.field_attrBuf     // Catch:{ Exception -> 0x004f }
            r14.parseFrom(r4)     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            java.lang.String r4 = r0.f299020j
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r6 = "storyObj.VisitorList"
            r7 = 0
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L_0x009b
            int r4 = r0.f299022o
            if (r4 != r5) goto L_0x009b
            java.util.LinkedList<te3.ob4> r4 = r14.f298353z
            gy3.C87412m.m108593f(r4, r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x006b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r4.next()
            r10 = r5
            te3.ob4 r10 = (te3.ob4) r10
            int r11 = r10.f299024q
            int r12 = r0.f299024q
            if (r11 == r12) goto L_0x008b
            java.lang.String r10 = r10.f299015e
            java.lang.String r11 = r0.f299015e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r11)
            if (r10 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r10 = 0
            goto L_0x008c
        L_0x008b:
            r10 = 1
        L_0x008c:
            if (r10 == 0) goto L_0x006b
            goto L_0x0090
        L_0x008f:
            r5 = r7
        L_0x0090:
            te3.ob4 r5 = (te3.ob4) r5
            if (r5 != 0) goto L_0x0117
            java.util.LinkedList<te3.ob4> r4 = r14.f298353z
            r4.add(r0)
            goto L_0x0116
        L_0x009b:
            java.lang.String r4 = r0.f299020j
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00dd
            int r4 = r0.f299024q
            if (r4 == 0) goto L_0x00d7
            java.util.LinkedList<te3.ob4> r4 = r14.f298343p
            java.lang.String r5 = "storyObj.BubbleList"
            gy3.C87412m.m108593f(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00b3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00cc
            java.lang.Object r5 = r4.next()
            r10 = r5
            te3.ob4 r10 = (te3.ob4) r10
            int r10 = r10.f299024q
            int r11 = r0.f299024q
            if (r10 != r11) goto L_0x00c8
            r10 = 1
            goto L_0x00c9
        L_0x00c8:
            r10 = 0
        L_0x00c9:
            if (r10 == 0) goto L_0x00b3
            goto L_0x00cd
        L_0x00cc:
            r5 = r7
        L_0x00cd:
            te3.ob4 r5 = (te3.ob4) r5
            if (r5 != 0) goto L_0x0117
            java.util.LinkedList<te3.ob4> r4 = r14.f298343p
            r4.add(r0)
            goto L_0x0116
        L_0x00d7:
            java.util.LinkedList<te3.ob4> r4 = r14.f298343p
            r4.add(r0)
            goto L_0x0116
        L_0x00dd:
            int r4 = r0.f299024q
            if (r4 == 0) goto L_0x0111
            java.util.LinkedList<te3.ob4> r4 = r14.f298341n
            java.lang.String r5 = "storyObj.CommentList"
            gy3.C87412m.m108593f(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00ed:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0106
            java.lang.Object r5 = r4.next()
            r10 = r5
            te3.ob4 r10 = (te3.ob4) r10
            int r10 = r10.f299024q
            int r11 = r0.f299024q
            if (r10 != r11) goto L_0x0102
            r10 = 1
            goto L_0x0103
        L_0x0102:
            r10 = 0
        L_0x0103:
            if (r10 == 0) goto L_0x00ed
            goto L_0x0107
        L_0x0106:
            r5 = r7
        L_0x0107:
            te3.ob4 r5 = (te3.ob4) r5
            if (r5 != 0) goto L_0x0117
            java.util.LinkedList<te3.ob4> r4 = r14.f298341n
            r4.add(r0)
            goto L_0x0116
        L_0x0111:
            java.util.LinkedList<te3.ob4> r4 = r14.f298341n
            r4.add(r0)
        L_0x0116:
            r8 = 1
        L_0x0117:
            java.util.LinkedList<te3.ob4> r4 = r14.f298353z
            gy3.C87412m.m108593f(r4, r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0120:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0138
            java.lang.Object r5 = r4.next()
            r6 = r5
            te3.ob4 r6 = (te3.ob4) r6
            java.lang.String r6 = r6.f299015e
            java.lang.String r10 = r0.f299015e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r10)
            if (r6 == 0) goto L_0x0120
            r7 = r5
        L_0x0138:
            te3.ob4 r7 = (te3.ob4) r7
            if (r7 != 0) goto L_0x0141
            java.util.LinkedList<te3.ob4> r4 = r14.f298353z
            r4.add(r0)
        L_0x0141:
            if (r8 == 0) goto L_0x0179
            java.util.LinkedList<te3.ob4> r0 = r14.f298341n
            int r0 = r0.size()
            r14.f298340j = r0
            java.util.LinkedList<te3.ob4> r0 = r14.f298343p
            int r0 = r0.size()
            r14.f298342o = r0
            java.util.LinkedList<te3.ob4> r0 = r14.f298353z
            int r0 = r0.size()
            r14.f298352y = r0
            byte[] r14 = r14.toByteArray()     // Catch:{ Exception -> 0x0161 }
            r3.field_attrBuf = r14     // Catch:{ Exception -> 0x0161 }
        L_0x0161:
            com.tencent.mm.plugin.story.model.StoryCore$h r14 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r0 = r14.mo134187e()
            java.lang.String r4 = r3.field_userName
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r4)
            if (r0 == 0) goto L_0x0172
            r3.mo138661t2(r9)
        L_0x0172:
            kw2.j r14 = r14.mo134191i()
            r14.update(r1, r3)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ew2.C97758b.mo137096k(te3.lc4):void");
    }

    /* renamed from: l */
    public final boolean mo137097l(long j, C97757a aVar) {
        int i;
        C87412m.m108594g(aVar, "commentDetail");
        C8479f0 f0Var = new C8479f0();
        StoryCore.C96337h hVar = StoryCore.f281736t;
        T Lo = hVar.mo134188f().mo138634Lo(j);
        f0Var.f27484d = Lo;
        if (Lo == null) {
            T bVar = new C99263b();
            f0Var.f27484d = bVar;
            bVar.field_storyId = j;
        }
        C99263b bVar2 = (C99263b) f0Var.f27484d;
        int i2 = bVar2.field_readCommentId;
        int i3 = aVar.f286812e;
        if (i2 == i3 || bVar2.field_readCommentTime >= (i = aVar.f286810c)) {
            return false;
        }
        bVar2.field_readCommentId = i3;
        bVar2.field_readCommentTime = i;
        String str = aVar.f286808a;
        bVar2.getClass();
        C87412m.m108594g(str, "<set-?>");
        bVar2.f291056x = str;
        C99263b bVar3 = (C99263b) f0Var.f27484d;
        String str2 = aVar.f286818k;
        bVar3.getClass();
        C87412m.m108594g(str2, "<set-?>");
        bVar3.f291057y = str2;
        hVar.mo134188f().update((IAutoDBItem) f0Var.f27484d, new String[0]);
        C61926c.m72668M(new C97765g(f0Var));
        return true;
    }

    /* renamed from: m */
    public final void mo137098m() {
        ArrayList arrayList = new ArrayList();
        int size = f286825i.f138527d.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            pb4 pb4 = f286825i.f138527d.get(i);
            int i2 = pb4.f299122i;
            if (i2 == 1 || i2 == 3) {
                int i3 = pb4.f299118e;
                int e = C31543z5.m39455e();
                C97387k.f285887a.mo136646a();
                if (i3 > e - 86400) {
                    arrayList.add(pb4);
                }
            }
        }
        nb4 nb4 = f286825i;
        nb4.f138527d.clear();
        nb4.f138527d.addAll(arrayList);
        f286828o++;
        if (arrayList.size() == 0) {
            f286828o = -1;
            return;
        }
        f286828o %= arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        for (Object next : arrayList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                if (i4 >= f286828o && ((pb4) next).f299126p < f286823g) {
                    arrayList2.add(next);
                }
                i4 = i5;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        pb4 pb42 = (pb4) C110818d0.m150916N(arrayList2);
        if (pb42 == null || pb42.f299122i != 1) {
            if (pb42 != null && pb42.f299122i == 3) {
                Log.m105924i(f286824h, "deleteCommentToRemote " + pb42.f299120g + ' ' + pb42.f299117d + ' ' + pb42.f299124n + ' ' + pb42.f299118e);
                f286826j = pb42;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new C45465h(pb42.f299117d, 2, pb42.f299124n));
                C86709a0.m107529k().f251779b.mo123460f(new C45456e(arrayList3, new ArrayList()));
                return;
            }
            return;
        }
        Log.m105924i(f286824h, "postCommentToRemote " + pb42.f299120g + ' ' + pb42.f299117d + ' ' + pb42.f299125o + ' ' + pb42.f299118e);
        f286826j = pb42;
        ob4 g = mo137093g(pb42);
        String str = g.f299020j;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            C115669n.INSTANCE.mo175913w(994, 2, 1);
        } else {
            C115669n.INSTANCE.mo175913w(994, 1, 1);
        }
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        String str2 = pb42.f299123j;
        C87412m.m108593f(str2, "commentOp.clientId");
        b0Var.mo123460f(new C58447b(str2, g, pb42.f299128r, f286827n));
    }

    /* renamed from: n */
    public final void mo137099n(boolean z, boolean z2) {
        boolean e = ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33497e(352279, 266241);
        String str = f286824h;
        Log.m105924i(str, "updateCommentRead: " + e + ", " + z);
        if (e != z || z2) {
            C61926c.m72668M(new C97766h(z));
        }
    }

    /* renamed from: o */
    public final void mo137100o(hc4 hc4) {
        if (hc4 != null) {
            StoryCore.C96337h hVar = StoryCore.f281736t;
            C99268i Ow = hVar.mo134191i().mo138664Ow(hc4.f298334d);
            if (Ow == null) {
                Ow = new C99268i();
            }
            if (Util.isEqual(hVar.mo134187e(), Ow.field_userName)) {
                Ow.mo138661t2(true);
            }
            C97393p.f285894a.mo136660d(Ow, hc4, Util.isEqual(hVar.mo134187e(), hc4.f298335e) ? 4 : 8);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int type = yVar.getType();
        String str2 = f286824h;
        Log.m105924i(str2, "onSceneEnd " + i + ", " + i2 + ", " + str + ", " + type);
        long j = 100;
        int i3 = 0;
        if (type == 354) {
            C58447b bVar = (C58447b) yVar;
            C47465a aVar = bVar.f167431f.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentResponse");
            rb4 rb4 = (rb4) aVar;
            C97757a aVar2 = bVar.f167430e;
            if (i == 0 && i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("post comment success ");
                pb4 pb4 = f286826j;
                sb.append(pb4 != null ? pb4.f299121h : null);
                sb.append(' ');
                sb.append(rb4.f140810e);
                Log.m105924i(str2, sb.toString());
                StoryCore.f281736t.mo134194l().post(new C97762d(rb4));
                if (aVar2 != null) {
                    aVar2.f286812e = rb4.f140810e;
                }
                for (C32227p invoke : f286831r) {
                    invoke.invoke(Boolean.TRUE, Long.valueOf(aVar2 != null ? aVar2.f286811d : 0));
                }
                pb4 pb42 = f286826j;
                if (pb42 != null) {
                    pb42.f299124n = rb4.f140810e;
                }
                if (pb42 != null) {
                    pb42.f299122i = 2;
                }
                f286826j = null;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("post comment fail ");
                pb4 pb43 = f286826j;
                sb4.append(pb43 != null ? pb43.f299121h : null);
                Log.m105924i(str2, sb4.toString());
                pb4 pb44 = f286826j;
                if (pb44 != null) {
                    i3 = pb44.f299126p;
                }
                if (i == 4) {
                    if (pb44 != null) {
                        pb44.f299126p = f286823g;
                    }
                } else if (pb44 != null) {
                    pb44.f299126p = i3 + 1;
                }
                f286826j = null;
                for (C32227p invoke2 : f286831r) {
                    invoke2.invoke(Boolean.FALSE, Long.valueOf(aVar2 != null ? aVar2.f286811d : 0));
                }
                j = 300000;
            }
            StoryCore.f281736t.mo134194l().postDelayed(C97763e.f286838d, j);
        } else if (type == 764 && (((C45456e) yVar).mo70944j1() instanceof C45465h)) {
            if (i == 0 && i2 == 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("delete comment success ");
                pb4 pb45 = f286826j;
                sb5.append(pb45 != null ? pb45.f299121h : null);
                Log.m105924i(str2, sb5.toString());
                pb4 pb46 = f286826j;
                if (pb46 != null) {
                    pb46.f299122i = 4;
                }
                f286826j = null;
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("delete comment fail ");
                pb4 pb47 = f286826j;
                sb6.append(pb47 != null ? pb47.f299121h : null);
                Log.m105924i(str2, sb6.toString());
                pb4 pb48 = f286826j;
                if (pb48 != null) {
                    i3 = pb48.f299126p;
                }
                if (i == 4) {
                    if (pb48 != null) {
                        pb48.f299126p = f286823g;
                    }
                } else if (pb48 != null) {
                    pb48.f299126p = i3 + 1;
                }
                f286826j = null;
                j = 60000;
            }
            StoryCore.f281736t.mo134194l().postDelayed(C97764f.f286839d, j);
        }
    }
}

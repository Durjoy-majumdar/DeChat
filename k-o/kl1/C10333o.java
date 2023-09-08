package kl1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cj1.C0556j5;
import cj1.C0564k3;
import cj1.C0581o5;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import pe3.C89349b;
import qj1.C12322e5;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48770aw0;
import te3.C49752hu0;
import te3.C49765hx0;
import te3.C49787i21;
import te3.C51420tn2;
import te3.C51857wn2;
import te3.C52013xs0;
import te3.C64674r41;

/* renamed from: kl1.o */
public final class C10333o {

    /* renamed from: a */
    public final ViewGroup f31484a;

    /* renamed from: b */
    public final C12322e5 f31485b;

    /* renamed from: c */
    public final int f31486c = C32444a.f86119Z0.mo60266n().intValue();

    /* renamed from: d */
    public final C13601g f31487d;

    /* renamed from: e */
    public final FlashFlightConstraintLayout f31488e;

    /* renamed from: f */
    public final C13601g f31489f;

    /* renamed from: g */
    public final C13601g f31490g;

    /* renamed from: h */
    public final C13601g f31491h;

    /* renamed from: i */
    public final C13601g f31492i;

    /* renamed from: j */
    public final C13601g f31493j;

    /* renamed from: k */
    public boolean f31494k;

    /* renamed from: l */
    public ArrayList<C0581o5> f31495l;

    /* renamed from: kl1.o$a */
    public static final class C10334a extends C87413o implements C32224a<C10305d> {

        /* renamed from: d */
        public final /* synthetic */ C10333o f31496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10334a(C10333o oVar) {
            super(0);
            this.f31496d = oVar;
        }

        public Object invoke() {
            C10333o oVar = this.f31496d;
            return new C10305d(oVar, new C10332n(oVar));
        }
    }

    /* renamed from: kl1.o$b */
    public static final class C10335b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C10333o f31497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10335b(C10333o oVar) {
            super(0);
            this.f31497d = oVar;
        }

        public Object invoke() {
            return this.f31497d.f31488e.findViewById(C0966R.C0970id.nk7);
        }
    }

    /* renamed from: kl1.o$c */
    public static final class C10336c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C10333o f31498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10336c(C10333o oVar) {
            super(0);
            this.f31498d = oVar;
        }

        public Object invoke() {
            return (TextView) this.f31498d.f31488e.findViewById(C0966R.C0970id.amo);
        }
    }

    /* renamed from: kl1.o$d */
    public static final class C10337d extends C87413o implements C32224a<PAGView> {

        /* renamed from: d */
        public final /* synthetic */ C10333o f31499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10337d(C10333o oVar) {
            super(0);
            this.f31499d = oVar;
        }

        public Object invoke() {
            PAGView pAGView = (PAGView) this.f31499d.f31484a.findViewById(C0966R.C0970id.nsa);
            pAGView.setComposition(PAGFile.Load(MMApplicationContext.getContext().getResources().getAssets(), "finder_live_comment_bullet_float_cover.pag"));
            Log.m105924i("Finder.LiveCommentPlugin_BulletNew", "floatCover composition origin size:" + pAGView.getComposition().width() + '-' + pAGView.getComposition().height() + ",cover size:" + pAGView.getWidth() + '-' + pAGView.getHeight());
            return pAGView;
        }
    }

    /* renamed from: kl1.o$e */
    public static final class C10338e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C10338e f31500d = new C10338e();

        public C10338e() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb());
        }
    }

    /* renamed from: kl1.o$f */
    public static final class C10339f extends C87413o implements C32224a<C10327l> {

        /* renamed from: d */
        public final /* synthetic */ C10333o f31501d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10339f(C10333o oVar) {
            super(0);
            this.f31501d = oVar;
        }

        public Object invoke() {
            return new C10327l(this.f31501d);
        }
    }

    public C10333o(ViewGroup viewGroup, C12322e5 e5Var) {
        C87412m.m108594g(viewGroup, "bullet");
        C87412m.m108594g(e5Var, "plugin");
        this.f31484a = viewGroup;
        this.f31485b = e5Var;
        C13601g a = C36568h.m40985a(C10338e.f31500d);
        this.f31487d = a;
        this.f31488e = (FlashFlightConstraintLayout) viewGroup.findViewById(C0966R.C0970id.f358114dh3);
        this.f31489f = C36568h.m40985a(new C10336c(this));
        this.f31490g = C36568h.m40985a(new C10335b(this));
        this.f31491h = C36568h.m40985a(new C10337d(this));
        this.f31492i = C36568h.m40985a(new C10339f(this));
        this.f31493j = C36568h.m40985a(new C10334a(this));
        ArrayList<C0581o5> arrayList = new ArrayList<>();
        if (C58739j4.f168176a.mo83692U() && ((Boolean) C32444a.f86188q2.mo60266n()).booleanValue()) {
            C10300b bVar = C10300b.f31392a;
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 10005;
            C49765hx0 hx02 = new C49765hx0();
            LinkedList<C48770aw0> linkedList = new LinkedList<>();
            C48770aw0 aw02 = new C48770aw0();
            aw02.f130789d = 2;
            aw02.f130793h = "45级来了";
            aw02.f130791f = 45;
            C13598b0 b0Var = C13598b0.f38549a;
            linkedList.add(aw02);
            hx02.f134930r = linkedList;
            r412.f185132o = hx02;
            arrayList.add(new C0556j5(r412));
            C52013xs0 xs02 = new C52013xs0();
            xs02.f144903e = 20078;
            C49765hx0 hx03 = new C49765hx0();
            FinderContact finderContact = new FinderContact();
            finderContact.nickname = "测试关注用户1";
            hx03.f134919d = finderContact;
            xs02.f144914s = hx03;
            arrayList.add(new C0564k3(xs02));
            C52013xs0 xs03 = new C52013xs0();
            xs03.f144903e = 20076;
            C49752hu0 hu02 = new C49752hu0();
            C51420tn2 tn22 = new C51420tn2();
            tn22.f142298d = -1;
            tn22.f142300f = 1;
            LinkedList<C51857wn2> linkedList2 = new LinkedList<>();
            C51857wn2 wn22 = new C51857wn2();
            C87412m.m108589b(wn22.f144157d, "测试");
            wn22.f144158e = "";
            wn22.f144159f = 1;
            linkedList2.add(wn22);
            tn22.f142299e = linkedList2;
            hu02.f134884d = tn22;
            xs03.f144906h = new C89349b(hu02.toByteArray());
            arrayList.add(new C0564k3(xs03));
            C64674r41 r413 = new C64674r41();
            r413.f185127g = 10005;
            C49765hx0 hx04 = new C49765hx0();
            LinkedList<C48770aw0> linkedList3 = new LinkedList<>();
            C48770aw0 aw03 = new C48770aw0();
            aw03.f130789d = 4;
            aw03.f130793h = "粉丝团12级来了";
            aw03.f130791f = 12;
            linkedList3.add(aw03);
            hx04.f134930r = linkedList3;
            r413.f185132o = hx04;
            arrayList.add(new C0556j5(r413));
            C64674r41 r414 = new C64674r41();
            r414.f185127g = 10005;
            C49765hx0 hx05 = new C49765hx0();
            LinkedList<C48770aw0> linkedList4 = new LinkedList<>();
            C48770aw0 aw04 = new C48770aw0();
            aw04.f130789d = 2;
            aw04.f130793h = "2级来了";
            aw04.f130791f = 2;
            linkedList4.add(aw04);
            hx05.f134930r = linkedList4;
            r414.f185132o = hx05;
            arrayList.add(new C0556j5(r414));
            C64674r41 r415 = new C64674r41();
            r415.f185127g = 10005;
            C49765hx0 hx06 = new C49765hx0();
            LinkedList<C48770aw0> linkedList5 = new LinkedList<>();
            C48770aw0 aw05 = new C48770aw0();
            aw05.f130789d = 2;
            aw05.f130793h = "55级来了";
            aw05.f130791f = 55;
            linkedList5.add(aw05);
            hx06.f134930r = linkedList5;
            r415.f185132o = hx06;
            arrayList.add(new C0556j5(r415));
            C64674r41 r416 = new C64674r41();
            r416.f185127g = 10005;
            C49765hx0 hx07 = new C49765hx0();
            LinkedList<C48770aw0> linkedList6 = new LinkedList<>();
            C48770aw0 aw06 = new C48770aw0();
            aw06.f130789d = 2;
            aw06.f130793h = "65级来了";
            aw06.f130791f = 65;
            linkedList6.add(aw06);
            hx07.f134930r = linkedList6;
            FinderContact finderContact2 = new FinderContact();
            finderContact2.nickname = "I am 65";
            hx07.f134919d = finderContact2;
            r416.f185132o = hx07;
            arrayList.add(new C0556j5(r416));
            C64674r41 r417 = new C64674r41();
            r417.f185127g = 10012;
            C49765hx0 hx08 = new C49765hx0();
            FinderContact finderContact3 = new FinderContact();
            finderContact3.nickname = "购物用户A ";
            hx08.f134919d = finderContact3;
            r417.f185132o = hx08;
            arrayList.add(new C0556j5(r417));
            C64674r41 r418 = new C64674r41();
            r418.f185127g = 10005;
            C49765hx0 hx09 = new C49765hx0();
            FinderContact finderContact4 = new FinderContact();
            finderContact4.nickname = "付费用户A ";
            hx09.f134919d = finderContact4;
            r418.f185132o = hx09;
            C49787i21 i212 = new C49787i21();
            i212.f135034d = 2;
            r418.f185134q = new C89349b(i212.toByteArray());
            arrayList.add(new C0556j5(r418));
            C64674r41 r419 = new C64674r41();
            r419.f185127g = 10005;
            C49765hx0 hx010 = new C49765hx0();
            LinkedList<C48770aw0> linkedList7 = new LinkedList<>();
            C48770aw0 aw07 = new C48770aw0();
            aw07.f130789d = 8;
            aw07.f130793h = "隐身53级来了";
            linkedList7.add(aw07);
            C48770aw0 aw08 = new C48770aw0();
            aw08.f130789d = 2;
            aw08.f130793h = "隐身53级来了";
            aw08.f130791f = 53;
            linkedList7.add(aw08);
            hx010.f134930r = linkedList7;
            r419.f185132o = hx010;
            arrayList.add(new C0556j5(r419));
            C64674r41 r4110 = new C64674r41();
            r4110.f185127g = 10005;
            C49765hx0 hx011 = new C49765hx0();
            LinkedList<C48770aw0> linkedList8 = new LinkedList<>();
            C48770aw0 aw09 = new C48770aw0();
            aw09.f130789d = 2;
            aw09.f130793h = "测试数据最后一个end级来了";
            aw09.f130791f = 100;
            linkedList8.add(aw09);
            hx011.f134930r = linkedList8;
            FinderContact finderContact5 = new FinderContact();
            finderContact5.nickname = "100级大佬";
            hx011.f134919d = finderContact5;
            r4110.f185132o = hx011;
            arrayList.add(new C0556j5(r4110));
        }
        this.f31495l = arrayList;
        Log.m105924i("Finder.LiveCommentPlugin_BulletNew", "init " + hashCode() + ",liveId:" + ((C55001u) e5Var.mo87696x0(C55001u.class)).f154420q.f182392d + " bullet:" + viewGroup.hashCode() + " isPagEnable:" + ((Boolean) ((C36570n) a).getValue()).booleanValue() + '!');
    }

    /* renamed from: a */
    public static final int m10268a(C10333o oVar, C0581o5 o5Var) {
        boolean z;
        oVar.getClass();
        int type = o5Var.getType();
        if (type == 10005) {
            int i = 6;
            T t = null;
            if (o5Var instanceof C0556j5) {
                C0556j5 j5Var = (C0556j5) o5Var;
                if (j5Var.f1344a.f185134q != null) {
                    C49787i21 i212 = new C49787i21();
                    C89349b bVar = j5Var.f1344a.f185134q;
                    i212.parseFrom(bVar != null ? bVar.mo123703f() : null);
                    if (i212.f135034d == 2) {
                        i = 4;
                    }
                }
            }
            Iterator<T> it = C10300b.f31392a.mo10607a(o5Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C48770aw0) next).f130789d == 4) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            if (((C48770aw0) t) != null) {
                i = 3;
            }
            int b0 = C62042e.f176370a.mo87066b0(C10300b.f31392a.mo10607a(o5Var));
            if (b0 >= 60) {
                return 0;
            }
            if (b0 >= 50) {
                return 1;
            }
            if (b0 >= 40) {
                return 2;
            }
            return i;
        } else if (type == 10012) {
            return 5;
        } else {
            if (type == 20047) {
                return 7;
            }
            if (type != 20076) {
                return type != 20078 ? 10 : 8;
            }
            return 9;
        }
    }

    /* renamed from: b */
    public final C10305d mo10630b() {
        return (C10305d) ((C36570n) this.f31493j).getValue();
    }

    /* renamed from: c */
    public final View mo10631c() {
        Object value = ((C36570n) this.f31490g).getValue();
        C87412m.m108593f(value, "<get-bulletAvatarLayout>(...)");
        return (View) value;
    }

    /* renamed from: d */
    public final TextView mo10632d() {
        Object value = ((C36570n) this.f31489f).getValue();
        C87412m.m108593f(value, "<get-bulletContentTv>(...)");
        return (TextView) value;
    }

    /* renamed from: e */
    public final PAGView mo10633e() {
        return (PAGView) ((C36570n) this.f31491h).getValue();
    }

    /* renamed from: f */
    public final void mo10634f(int i) {
        Log.m105924i("Finder.LiveCommentPlugin_BulletNew", "hideBulletComment source:" + i + ",liveId:" + ((C55001u) this.f31485b.mo87696x0(C55001u.class)).f154420q.f182392d + ", container:" + hashCode() + " bullet:" + this.f31484a.hashCode() + '!');
        mo10636h(false);
        this.f31484a.setVisibility(4);
        this.f31488e.setVisibility(4);
        mo10630b().mo10613i(i);
    }

    /* renamed from: g */
    public final void mo10635g(String str, List<? extends C0581o5> list) {
        if (C58739j4.f168176a.mo83692U() && !list.isEmpty()) {
            int size = list.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                C0581o5 o5Var = (C0581o5) list.get(i);
                sb.append("content:" + o5Var.getContent() + ",seq:" + o5Var.getSeq() + ",id:" + o5Var.mo572f() + ",{msgHashCode:" + o5Var.hashCode() + ", msgType:" + o5Var.getType() + "} | ");
            }
            Log.m105924i("Finder.LiveCommentPlugin_BulletNew", str + ' ' + sb);
        }
    }

    /* renamed from: h */
    public final void mo10636h(boolean z) {
        Log.m105924i("Finder.LiveCommentPlugin_BulletNew", hashCode() + " running:" + z);
        this.f31494k = z;
    }
}

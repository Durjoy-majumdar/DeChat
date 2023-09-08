package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C0654b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C7878t0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C51376tc1;
import te3.C64284cg;
import tf0.C64916p1;
import up1.C27696y;

/* renamed from: qj1.n6 */
public final class C12543n6 extends C62660c {

    /* renamed from: p */
    public final C58124b f36032p;

    /* renamed from: q */
    public C8794p5<C51376tc1> f36033q;

    /* renamed from: qj1.n6$b */
    public static final class C12544b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f36034d;

        public C12544b(C32224a<C13598b0> aVar) {
            this.f36034d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36034d.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.n6$c */
    public static final class C12545c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f36035d;

        public C12545c(C32224a<C13598b0> aVar) {
            this.f36035d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36035d.invoke();
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.FOLLOW_GUIDE_LEAVE_ICON, (Map) null, (String) null, 6, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.n6$d */
    public static final class C12546d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f36036d;

        public C12546d(View view) {
            this.f36036d = view;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f36036d.getHitRect(rect);
            rect.inset(-rect.width(), -rect.width());
            ViewParent parent = this.f36036d.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.setTouchDelegate(new TouchDelegate(rect, this.f36036d));
            }
        }
    }

    /* renamed from: qj1.n6$e */
    public static final class C12547e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12543n6 f36037d;

        public C12547e(C12543n6 n6Var) {
            this.f36037d = n6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36037d.mo10792g(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.n6$f */
    public static final class C12548f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12543n6 f36038d;

        public C12548f(C12543n6 n6Var) {
            this.f36038d = n6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36038d.mo10792g(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin$showGuide$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.n6$g */
    public static final class C12549g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12543n6 f36039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12549g(C12543n6 n6Var) {
            super(0);
            this.f36039d = n6Var;
        }

        public Object invoke() {
            this.f36039d.mo10792g(8);
            this.f36039d.f36032p.statusChange(C58124b.C58125b.FINDER_LIVE_CLOSE_LIVE_FROM_FOLLOW_GUIDE, (Bundle) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.n6$a */
    public /* synthetic */ class C12550a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36040a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[188] = 1;
            f36040a = iArr;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12543n6(android.view.ViewGroup r1, d60.C58124b r2, te3.C49712hj1 r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            java.lang.String r4 = "root"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.f36032p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12543n6.<init>(android.view.ViewGroup, d60.b, te3.hj1, int, gy3.h):void");
    }

    /* renamed from: Z0 */
    public final void mo12163Z0(String str, String str2, FinderAuthInfo finderAuthInfo, int i, C32224a<C13598b0> aVar) {
        int i2;
        String str3 = str;
        FinderAuthInfo finderAuthInfo2 = finderAuthInfo;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C54108o.class;
        C12549g gVar = new C12549g(this);
        if (mo82893g0()) {
            this.f166287d.findViewById(C0966R.C0970id.fpt).getLayoutParams().width = this.f166287d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4309kg);
        }
        ((ImageView) this.f166287d.findViewById(C0966R.C0970id.fpr)).setImageDrawable(this.f166287d.getContext().getResources().getDrawable(C0966R.C0969drawable.bfd));
        int i3 = 8;
        if (str3 == null || str.length() == 0) {
            View findViewById = this.f166287d.findViewById(C0966R.C0970id.fpr);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin", "showGuide", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ILkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveFollowGuidePlugin", "showGuide", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ILkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            C60979d<C100810g0> i25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(str3, (C27696y) null, 2, (C8480h) null);
            View findViewById2 = this.f166287d.findViewById(C0966R.C0970id.fpr);
            C87412m.m108593f(findViewById2, "root.findViewById(R.id.liveFollowGuideAvatarIv)");
            i25.mo85957c(fVar, (ImageView) findViewById2, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
        ((TextView) this.f166287d.findViewById(C0966R.C0970id.fpv)).setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f166287d.getContext(), str2, ((TextView) this.f166287d.findViewById(C0966R.C0970id.fpv)).getTextSize()));
        ImageView imageView = (ImageView) this.f166287d.findViewById(C0966R.C0970id.fpx);
        if (finderAuthInfo2 != null) {
            i2 = Integer.valueOf(finderAuthInfo2.authIconType > 0 ? 0 : 8).intValue();
        } else {
            Integer num = 8;
            i2 = num.intValue();
        }
        imageView.setVisibility(i2);
        if (imageView.getVisibility() == 0) {
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1.C64917a.m76444k((C64916p1) c, imageView, finderAuthInfo, 0, (C64284cg) null, 8, (Object) null);
        }
        TextView textView = (TextView) this.f166287d.findViewById(C0966R.C0970id.fps);
        textView.setText(this.f166287d.getContext().getResources().getString(C0966R.string.da4, new Object[]{C7878t0.m8039h(i)}));
        if (i > 0) {
            i3 = 0;
        }
        textView.setVisibility(i3);
        ((TextView) this.f166287d.findViewById(C0966R.C0970id.fpu)).setOnClickListener(new C12544b(aVar));
        this.f166287d.findViewById(C0966R.C0970id.fpw).setOnClickListener(new C12545c(gVar));
        View findViewById3 = this.f166287d.findViewById(C0966R.C0970id.bec);
        findViewById3.post(new C12546d(findViewById3));
        findViewById3.setOnClickListener(new C12547e(this));
        this.f166287d.setOnClickListener(new C12548f(this));
        mo10792g(0);
        C7335d c2 = C86312j.m106911c(cls3);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8608i((C8777j5) c2, C54067f0.C0066n.FOLLOW_GUIDE_PAGE, (Map) null, 2, (Object) null);
        C7335d c3 = C86312j.m106911c(cls3);
        C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8608i((C8777j5) c3, C54067f0.C0066n.FOLLOW_GUIDE_LEAVE_ICON, (Map) null, 2, (Object) null);
        C7335d c4 = C86312j.m106911c(cls3);
        C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8608i((C8777j5) c4, C54067f0.C0066n.FOLLOW_GUIDE_LEAVE_FOLLOW, (Map) null, 2, (Object) null);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C0654b.class;
        C87412m.m108594g(bVar, "status");
        if (C12550a.f36040a[bVar.ordinal()] != 1) {
            return;
        }
        if (((C0654b) mo87684A0().mo71262a(cls)).f1544f) {
            String string = this.f166287d.getContext().getResources().getString(C0966R.string.dmx, new Object[]{((C0654b) mo87684A0().mo71262a(cls)).f1546h});
            C87412m.m108593f(string, "root.context.resources.g…:class.java).bizNickname)");
            mo12163Z0((String) null, string, (FinderAuthInfo) null, ((C0654b) mo87684A0().mo71262a(cls)).f1547i, new C12610q6(this));
            return;
        }
        C58969q b = C58961d.f168673a.mo84155b(mo87686C0().f151977d.f157069j);
        FinderAuthInfo finderAuthInfo = null;
        String avatarUrl = b != null ? b.getAvatarUrl() : null;
        String nickname = b != null ? b.getNickname() : "";
        if (b != null) {
            finderAuthInfo = b.field_authInfo;
        }
        mo12163Z0(avatarUrl, nickname, finderAuthInfo, ((C54991o) mo87684A0().mo71262a(C54991o.class)).f154247R0, new C12641r6(b, this));
    }
}

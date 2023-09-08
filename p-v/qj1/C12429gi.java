package qj1;

import ak1.C54067f0;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.FocusMeteringAction;
import cl1.C0691u1;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import nh1.C11166u;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51428tp2;

/* renamed from: qj1.gi */
public final class C12429gi extends C62660c {

    /* renamed from: p */
    public final C58124b f35794p;

    /* renamed from: q */
    public final C11166u f35795q;

    /* renamed from: r */
    public volatile int f35796r;

    /* renamed from: s */
    public String f35797s;

    /* renamed from: t */
    public boolean f35798t;

    /* renamed from: u */
    public boolean f35799u = true;

    /* renamed from: v */
    public final LinkedList<C51428tp2> f35800v = new LinkedList<>();

    /* renamed from: w */
    public final MMHandler f35801w = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C12431c(this));

    /* renamed from: qj1.gi$a */
    public static final class C12430a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12429gi f35802d;

        public C12430a(C12429gi giVar) {
            this.f35802d = giVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWishBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.WISH_LIST_BANNER, C12429gi.m12005Z0(this.f35802d), (String) null, 4, (Object) null);
            ((C0691u1) this.f35802d.mo87696x0(C0691u1.class)).mo658c3().postValue(Boolean.TRUE);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWishBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.gi$c */
    public static final class C12431c implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C12429gi f35803d;

        public C12431c(C12429gi giVar) {
            this.f35803d = giVar;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what == 1) {
                this.f35803d.f35796r = message.arg1;
                C12429gi giVar = this.f35803d;
                synchronized (giVar.f35800v) {
                    if (giVar.f35796r < giVar.f35800v.size()) {
                        C51428tp2 tp22 = giVar.f35800v.get(giVar.f35796r);
                        C87412m.m108593f(tp22, "currentList[currentPosition]");
                        giVar.mo12115b1(tp22, false);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C12429gi.m12006a1(this.f35803d);
            }
            return true;
        }
    }

    /* renamed from: qj1.gi$b */
    public /* synthetic */ class C12432b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35804a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f35804a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12429gi(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35794p = bVar;
        this.f35795q = C11166u.m11043a(viewGroup);
        mo10792g(8);
        viewGroup.setOnClickListener(new C12430a(this));
    }

    /* renamed from: Z0 */
    public static final HashMap m12005Z0(C12429gi giVar) {
        giVar.getClass();
        HashMap hashMap = new HashMap();
        String str = "1";
        hashMap.put("user_type", C62042e.f176370a.mo87027N0() ? str : "2");
        String str2 = giVar.f35797s;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("wish_list_id", str2);
        if (giVar.mo82893g0()) {
            str = "2";
        }
        hashMap.put("screen_type", str);
        return hashMap;
    }

    /* renamed from: a1 */
    public static final void m12006a1(C12429gi giVar) {
        giVar.getClass();
        Log.m105924i("FinderLiveWishBannerPlugin", "startLoop: " + giVar.f35796r);
        int i = giVar.f35796r + 1;
        if (i >= giVar.f35800v.size()) {
            i = 0;
        }
        giVar.f35801w.sendMessageDelayed(giVar.f35801w.obtainMessage(1, i, 0), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r3 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3 == null) goto L_0x0031;
     */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12115b1(te3.C51428tp2 r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            nh1.u r2 = r8.f35795q
            te3.p11 r3 = r9.f142318d
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.String r6 = r3.f139509f
            if (r6 == 0) goto L_0x0019
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r6 = 0
            goto L_0x001a
        L_0x0019:
            r6 = 1
        L_0x001a:
            if (r6 == 0) goto L_0x002d
            cj1.y1 r6 = cj1.C0639y1.f1510a
            java.lang.String r3 = r3.f139507d
            ig1.d r3 = r6.mo612d(r3)
            if (r3 == 0) goto L_0x0029
            java.lang.String r3 = r3.field_thumbnailFileUrl
            goto L_0x002a
        L_0x0029:
            r3 = r4
        L_0x002a:
            if (r3 != 0) goto L_0x0033
            goto L_0x0031
        L_0x002d:
            java.lang.String r3 = r3.f139509f
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            java.lang.String r3 = ""
        L_0x0033:
            pl1.e0$a r6 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r7 = r7.mo62446e(r1)
            bl3.c r7 = r7.mo62447c(r0)
            pl1.s0 r7 = (pl1.C11990s0) r7
            n60.f r6 = r7.mo11867O2(r6)
            r7 = 2131233673(0x7f080b89, float:1.808349E38)
            r6.f293170h = r7
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r1 = r7.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            k60.d r0 = r0.mo11871f2()
            pl1.n0 r1 = new pl1.n0
            up1.y r7 = up1.C27696y.THUMB_IMAGE
            r1.<init>(r3, r7)
            l60.b r0 = r0.mo85956b(r1, r6)
            android.widget.ImageView r1 = r2.f32958b
            java.lang.String r3 = "wishIcon"
            gy3.C87412m.m108593f(r1, r3)
            l60.a r0 = (l60.C99342a) r0
            r0.mo85954d(r1)
            boolean r0 = r8.f35798t
            r1 = 8
            if (r0 == 0) goto L_0x009f
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32960d
            r9.setVisibility(r1)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32961e
            r9.setVisibility(r1)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32959c
            r9.setVisibility(r5)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32959c
            android.widget.RelativeLayout r10 = r2.f32957a
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131829075(0x7f112153, float:1.9291109E38)
            java.lang.String r10 = r10.getString(r0)
            r9.setText(r10)
            goto L_0x011e
        L_0x009f:
            if (r10 == 0) goto L_0x00ec
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32960d
            r9.setVisibility(r1)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32961e
            r9.setVisibility(r1)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32959c
            r9.setVisibility(r5)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r9 = r2.f32959c
            android.widget.RelativeLayout r10 = r2.f32957a
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131829082(0x7f11215a, float:1.9291123E38)
            java.lang.String r10 = r10.getString(r0)
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87027N0()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d4
            r4 = r10
        L_0x00d4:
            if (r4 == 0) goto L_0x00d7
            goto L_0x00e8
        L_0x00d7:
            android.widget.RelativeLayout r10 = r2.f32957a
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2131829076(0x7f112154, float:1.929111E38)
            java.lang.String r4 = r10.getString(r0)
        L_0x00e8:
            r9.setText(r4)
            goto L_0x011e
        L_0x00ec:
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r10 = r2.f32960d
            r10.setVisibility(r5)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r10 = r2.f32961e
            r10.setVisibility(r5)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r10 = r2.f32959c
            r10.setVisibility(r1)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r10 = r2.f32960d
            long r0 = r9.f142320f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.setText(r0)
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r10 = r2.f32961e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 47
            r0.append(r1)
            long r1 = r9.f142319e
            r0.append(r1)
            java.lang.String r9 = r0.toString()
            r10.setText(r9)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12429gi.mo12115b1(te3.tp2, boolean):void");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C12432b.f35804a[bVar.ordinal()] == 1) {
            ((C0691u1) mo87696x0(C0691u1.class)).f1637f.observe(this, new C12444hi(this));
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f35796r = 0;
        this.f35800v.clear();
        this.f35801w.removeMessages(1);
        mo10792g(8);
        this.f35799u = true;
    }
}

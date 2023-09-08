package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import b03.C39696f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import f40.C86709a0;
import fy3.C32224a;
import go3.C59600d;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import java.util.ArrayList;
import java.util.Iterator;
import jz2.C76486l;
import kotlin.Metadata;
import lz2.C46919a;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p823sg.C90193h;
import qo3.C77407n;
import qo3.C89779i0;
import rr3.C110622b;
import rx3.C13598b0;
import rz2.C48201c;
import uz2.C52678e0;
import vo3.C90852c;
import yz2.C53699n0;
import yz2.C53713o0;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "Landroid/view/View;", "f", "Landroid/view/View;", "getIvMask", "()Landroid/view/View;", "setIvMask", "(Landroid/view/View;)V", "ivMask", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity */
public final class TextStatusDetailActivity extends MMActivity implements C11385n {

    /* renamed from: q */
    public static final /* synthetic */ int f206752q = 0;

    /* renamed from: d */
    public C48201c f206753d;

    /* renamed from: e */
    public C76486l f206754e;

    /* renamed from: f */
    public View f206755f;

    /* renamed from: g */
    public FrameLayout f206756g;

    /* renamed from: h */
    public MMTPEffectVideoLayout f206757h;

    /* renamed from: i */
    public FrameLayout f206758i;

    /* renamed from: j */
    public FrameLayout f206759j;

    /* renamed from: n */
    public C52678e0 f206760n;

    /* renamed from: o */
    public C59600d f206761o;

    /* renamed from: p */
    public C89779i0 f206762p;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$a */
    public static final class C43206a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDetailActivity f116921d;

        public C43206a(TextStatusDetailActivity textStatusDetailActivity) {
            this.f116921d = textStatusDetailActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f116921d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$b */
    public static final class C43207b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C43207b f116922d = new C43207b();

        public C43207b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$c */
    public static final class C43208c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusDetailActivity f116923d;

        public C43208c(TextStatusDetailActivity textStatusDetailActivity) {
            this.f116923d = textStatusDetailActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            TextStatusDetailActivity textStatusDetailActivity = this.f116923d;
            AppCompatActivity context = textStatusDetailActivity.getContext();
            LayoutInflater.from(context);
            C77407n nVar = new C77407n((Context) context, 1, false);
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            C53699n0 n0Var = new C53699n0(textStatusDetailActivity);
            C53713o0 o0Var = new C53713o0(textStatusDetailActivity, textStatusDetailActivity.mo98409I7().field_StatusID);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList.clear();
            C76874e0 e0Var = new C76874e0(context);
            n0Var.onCreateMMMenu(e0Var);
            if (e0Var.mo107176v()) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = n0Var;
                nVar.f225782p = o0Var;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo98408H7() {
        C60695a player;
        C60695a player2;
        FrameLayout frameLayout = this.f206756g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.f206756g;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f206757h;
        if (!(mMTPEffectVideoLayout == null || (player2 = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player2.stopAsync();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.f206757h;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.f206757h;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.mo81101g();
        }
    }

    /* renamed from: I7 */
    public final C48201c mo98409I7() {
        C48201c cVar = this.f206753d;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("info");
        throw null;
    }

    /* renamed from: J7 */
    public final C76486l mo98410J7() {
        C76486l lVar = this.f206754e;
        if (lVar != null) {
            return lVar;
        }
        C87412m.m108603p("loadLogic");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if ((r3 != null && yz2.C79224c.m95929a(r3, r9)) == false) goto L_0x0033;
     */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98411K7(rz2.C48201c r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r9 == 0) goto L_0x000a
            uz2.e0 r9 = p773yy.C66710j.C53637a.m60171a(r9, r2, r0, r1)
            goto L_0x000b
        L_0x000a:
            r9 = r1
        L_0x000b:
            if (r9 == 0) goto L_0x009e
            java.lang.String r3 = hz2.C60235a.m70504d(r9)
            if (r3 == 0) goto L_0x001c
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = 1
        L_0x001d:
            if (r3 != 0) goto L_0x009e
            go3.d r3 = r8.f206761o
            if (r3 != 0) goto L_0x0024
            goto L_0x0033
        L_0x0024:
            uz2.e0 r3 = r8.f206760n
            if (r3 == 0) goto L_0x0030
            boolean r3 = yz2.C79224c.m95929a(r3, r9)
            if (r3 != r0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x0095
            go3.d r0 = r8.f206761o
            if (r0 == 0) goto L_0x003d
            r0.mo79963g()
        L_0x003d:
            go3.d r0 = r8.f206761o
            if (r0 == 0) goto L_0x0044
            r0.mo79961e()
        L_0x0044:
            go3.d r0 = r8.f206761o
            if (r0 == 0) goto L_0x004b
            r0.onDestroy()
        L_0x004b:
            r8.f206761o = r1
            r8.f206760n = r1
            android.widget.FrameLayout r0 = r8.f206759j
            if (r0 == 0) goto L_0x0056
            r0.removeAllViews()
        L_0x0056:
            java.lang.String r0 = hz2.C60235a.m70504d(r9)
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = ""
        L_0x005e:
            java.util.LinkedList<uz2.a0> r3 = r9.f147090g
            uz2.m r4 = new uz2.m
            r4.<init>()
            r4.f188445d = r2
            r5 = 3
            r4.f188446e = r5
            rz2.c r5 = r8.mo98409I7()
            int r5 = r5.field_CreateTime
            r4.f188448g = r5
            android.widget.FrameLayout r5 = r8.f206759j     // Catch:{ all -> 0x0091 }
            if (r5 != 0) goto L_0x0077
            goto L_0x0091
        L_0x0077:
            if (r3 == 0) goto L_0x007e
            uz2.a0 r3 = xz2.C79020s.m95585a(r3)     // Catch:{ all -> 0x0091 }
            goto L_0x007f
        L_0x007e:
            r3 = r1
        L_0x007f:
            xz2.r r6 = xz2.C79019r.f232026a     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0086
            java.lang.String r7 = r3.f188439d     // Catch:{ all -> 0x0091 }
            goto L_0x0087
        L_0x0086:
            r7 = r1
        L_0x0087:
            qy2.r r6 = r6.mo108986a(r7)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0091
            go3.d r1 = r6.mo84138IT(r0, r5, r3, r4)     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r8.f206761o = r1
            r8.f206760n = r9
        L_0x0095:
            android.widget.FrameLayout r9 = r8.f206759j
            if (r9 != 0) goto L_0x009a
            goto L_0x00c8
        L_0x009a:
            r9.setVisibility(r2)
            goto L_0x00c8
        L_0x009e:
            go3.d r9 = r8.f206761o
            if (r9 == 0) goto L_0x00a5
            r9.mo79963g()
        L_0x00a5:
            go3.d r9 = r8.f206761o
            if (r9 == 0) goto L_0x00ac
            r9.mo79961e()
        L_0x00ac:
            go3.d r9 = r8.f206761o
            if (r9 == 0) goto L_0x00b3
            r9.onDestroy()
        L_0x00b3:
            r8.f206761o = r1
            r8.f206760n = r1
            android.widget.FrameLayout r9 = r8.f206759j
            if (r9 == 0) goto L_0x00be
            r9.removeAllViews()
        L_0x00be:
            android.widget.FrameLayout r9 = r8.f206759j
            if (r9 != 0) goto L_0x00c3
            goto L_0x00c8
        L_0x00c3:
            r0 = 8
            r9.setVisibility(r0)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDetailActivity.mo98411K7(rz2.c):void");
    }

    /* renamed from: L7 */
    public final void mo98412L7() {
        String str;
        String str2 = mo98409I7().field_UserName;
        C48201c I7 = mo98409I7();
        if (I7.field_MediaType == 2) {
            FrameLayout frameLayout = this.f206756g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            MMTPEffectVideoLayout mMTPEffectVideoLayout = new MMTPEffectVideoLayout(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            FrameLayout frameLayout2 = this.f206756g;
            if (frameLayout2 != null) {
                frameLayout2.addView(mMTPEffectVideoLayout, layoutParams);
            }
            FrameLayout frameLayout3 = this.f206756g;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            String str3 = I7.field_MediaUrl;
            String str4 = null;
            if (str3 != null) {
                byte[] bytes = str3.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                str = C90193h.m112878f(bytes);
            } else {
                str = null;
            }
            String str5 = str == null ? "" : str;
            String str6 = I7.field_MediaUrl;
            if (str6 != null) {
                str4 = str6;
            }
            String str7 = str4 == null ? "" : str4;
            C39696f fVar = C39696f.f106501a;
            C87412m.m108593f(str6, "info.field_MediaUrl");
            C87412m.m108593f(str2, "username");
            String b = fVar.mo62319b(str6, str2);
            int i = I7.field_mediaWidth;
            int i2 = I7.field_mediaHeight;
            if (i <= 0 || i2 <= 0) {
                i = C74783i3.m89537a(this).f24704a;
                i2 = C74783i3.m89537a(this).f24705b;
            }
            C58010a aVar = new C58010a(str5, b, str7, i, i2);
            aVar.f165933e = false;
            mMTPEffectVideoLayout.setMediaInfo(aVar);
            C60695a player = mMTPEffectVideoLayout.getPlayer();
            if (player != null) {
                player.mo85614i(true);
            }
            C60695a player2 = mMTPEffectVideoLayout.getPlayer();
            if (player2 != null) {
                player2.setLoop(true);
            }
            mMTPEffectVideoLayout.getEffectManager().mo154924d();
            if (I7.mo72933B0()) {
                C110622b b2 = mMTPEffectVideoLayout.getEffectManager().mo154922b();
                b2.mo162186d(5.0f);
                b2.mo162187e(1.0f);
            }
            this.f206757h = mMTPEffectVideoLayout;
            C60695a player3 = mMTPEffectVideoLayout.getPlayer();
            if (player3 != null) {
                player3.mo85619m();
                return;
            }
            return;
        }
        mo98408H7();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360033c92;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x021c, code lost:
        if (r3.mo84150q(r0.f206758i) == true) goto L_0x0220;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 109(0x6d, float:1.53E-43)
            r0.supportRequestWindowFeature(r1)
            super.onCreate(r22)
            r1 = 0
            r0.setActionbarColor(r1)
            android.view.Window r2 = r21.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 1792(0x700, float:2.511E-42)
            r2.setSystemUiVisibility(r3)
            android.view.Window r2 = r21.getWindow()
            in3.C87773e.m109211d(r2)
            android.content.res.Resources r2 = r21.getResources()
            r3 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r2 = r2.getColor(r3)
            r0.setNavigationbarColor(r2)
            r2 = 14
            int r2 = kg3.C76577a.m92151b(r0, r2)
            float r2 = (float) r2
            r0.setMMTitleSize(r2)
            r21.hideActionbarLine()
            com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$a r2 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$a
            r2.<init>(r0)
            r0.setBackBtn(r2)
            android.content.Intent r2 = r21.getIntent()
            java.lang.String r3 = "username"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r21.getIntent()
            java.lang.String r4 = "history_item"
            byte[] r3 = r3.getByteArrayExtra(r4)
            uz2.j0 r4 = new uz2.j0
            r4.<init>()
            r5 = 1
            if (r2 == 0) goto L_0x006b
            boolean r6 = z04.C112551y.m153811k(r2)
            if (r6 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r6 = 0
            goto L_0x006c
        L_0x006b:
            r6 = 1
        L_0x006c:
            if (r6 != 0) goto L_0x0075
            az2.e r3 = az2.C39674e.f106452d
            rz2.c r2 = r3.mo62253n0(r2)
            goto L_0x008c
        L_0x0075:
            if (r3 == 0) goto L_0x008b
            uz2.c1 r2 = new uz2.c1
            r2.<init>()
            r2.parseFrom(r3)
            int r3 = r2.f147070g
            int r6 = r2.f147072i
            int r3 = r3 + r6
            r4.f147145d = r3
            rz2.c r2 = mz2.C47149b.m52432a(r2)
            goto L_0x008c
        L_0x008b:
            r2 = 0
        L_0x008c:
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusDetailActivity"
            if (r2 != 0) goto L_0x0099
            r21.finish()
            java.lang.String r1 = "err info == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            return
        L_0x0099:
            r0.f206753d = r2
            qy2.a0 r6 = new qy2.a0
            r6.<init>()
            r6.mo72637c(r5)
            r6.f128517e = r5
            r6.mo72639d(r5)
            jz2.a r7 = new jz2.a
            r7.<init>(r6)
            r0.f206754e = r7
            jz2.l r6 = r21.mo98410J7()
            android.view.View r7 = r21.getContentView()
            java.lang.String r8 = "contentView"
            gy3.C87412m.m108593f(r7, r8)
            r6.mo106674h(r7)
            jz2.l r6 = r21.mo98410J7()
            com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$b r7 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDetailActivity.C43207b.f116922d
            r6.mo106712k(r7)
            jz2.l r6 = r21.mo98410J7()
            java.lang.String r7 = r2.field_UserName
            java.lang.String r8 = "info.field_UserName"
            gy3.C87412m.m108593f(r7, r8)
            boolean r4 = r6.mo106661a(r7, r2, r4)
            if (r4 != 0) goto L_0x00e2
            r21.finish()
            java.lang.String r1 = "logic init fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            return
        L_0x00e2:
            r3 = 2131306763(0x7f09290b, float:1.8231734E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f206755f = r3
            r3 = 2131307185(0x7f092ab1, float:1.823259E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.f206756g = r3
            r3 = 2131307168(0x7f092aa0, float:1.8232556E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.f206758i = r3
            r3 = 2131307167(0x7f092a9f, float:1.8232554E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.f206759j = r3
            android.text.format.Time r3 = new android.text.format.Time
            r3.<init>()
            int r4 = r2.field_CreateTime
            long r6 = (long) r4
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r3.set(r6)
            androidx.appcompat.app.AppCompatActivity r4 = r21.getContext()
            r6 = 2131830333(0x7f11263d, float:1.929366E38)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            androidx.appcompat.app.AppCompatActivity r8 = r21.getContext()
            int r9 = r3.hour
            long r9 = (long) r9
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r9 * r11
            java.lang.CharSequence r8 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85110c(r8, r9)
            r7[r1] = r8
            java.lang.String r4 = r4.getString(r6, r7)
            java.lang.CharSequence r3 = com.tencent.p014mm.pluginsdk.platformtools.C72714e.m85106a(r4, r3)
            r0.setMMTitle((java.lang.CharSequence) r3)
            r0.showOptionMenu(r5)
            r3 = 2131756370(0x7f100552, float:1.9143646E38)
            com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$c r4 = new com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity$c
            r4.<init>(r0)
            r0.addIconOptionMenu(r1, r3, r4)
            rz2.c r3 = r21.mo98409I7()
            java.lang.String r3 = r3.field_MediaThumbUrl
            if (r3 == 0) goto L_0x0160
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r3 = 0
            goto L_0x0161
        L_0x0160:
            r3 = 1
        L_0x0161:
            r4 = 8
            if (r3 != 0) goto L_0x01bd
            rz2.c r3 = r21.mo98409I7()
            boolean r3 = r3.mo72933B0()
            if (r3 != r5) goto L_0x0171
            r3 = 1
            goto L_0x0172
        L_0x0171:
            r3 = 0
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            goto L_0x01bd
        L_0x0175:
            android.view.View r3 = r0.f206755f
            if (r3 != 0) goto L_0x017b
            goto L_0x0202
        L_0x017b:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r14.mo10233c(r6)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity"
            java.lang.String r9 = "updateMask"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r3
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity"
            java.lang.String r8 = "updateMask"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r3
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0202
        L_0x01bd:
            android.view.View r3 = r0.f206755f
            if (r3 != 0) goto L_0x01c2
            goto L_0x0202
        L_0x01c2:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r7)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity"
            java.lang.String r16 = "updateMask"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r6 = r6.mo10231a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r14 = "com/tencent/mm/plugin/textstatus/ui/TextStatusDetailActivity"
            java.lang.String r15 = "updateMask"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0202:
            r21.mo98412L7()     // Catch:{ all -> 0x0205 }
        L_0x0205:
            jz2.l r3 = r21.mo98410J7()
            qy2.o r3 = r3.mo106711c()
            android.widget.FrameLayout r6 = r0.f206758i
            if (r6 == 0) goto L_0x021f
            r6.removeAllViews()
            if (r3 == 0) goto L_0x021f
            android.widget.FrameLayout r6 = r0.f206758i
            boolean r3 = r3.mo84150q(r6)
            if (r3 != r5) goto L_0x021f
            goto L_0x0220
        L_0x021f:
            r5 = 0
        L_0x0220:
            if (r5 == 0) goto L_0x022b
            android.widget.FrameLayout r3 = r0.f206758i
            if (r3 != 0) goto L_0x0227
            goto L_0x0233
        L_0x0227:
            r3.setVisibility(r1)
            goto L_0x0233
        L_0x022b:
            android.widget.FrameLayout r1 = r0.f206758i
            if (r1 != 0) goto L_0x0230
            goto L_0x0233
        L_0x0230:
            r1.setVisibility(r4)
        L_0x0233:
            r0.mo98411K7(r2)     // Catch:{ all -> 0x0236 }
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDetailActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        mo98408H7();
        mo98410J7().mo106713m();
        mo98410J7().mo106714t();
        C59600d dVar = this.f206761o;
        if (dVar != null) {
            dVar.mo79963g();
        }
        C59600d dVar2 = this.f206761o;
        if (dVar2 != null) {
            dVar2.mo79961e();
        }
        C59600d dVar3 = this.f206761o;
        if (dVar3 != null) {
            dVar3.onDestroy();
        }
        this.f206761o = null;
        this.f206760n = null;
        C86709a0.m107524d().mo123470p(5967, this);
    }

    public void onPause() {
        C60695a player;
        super.onPause();
        C59600d dVar = this.f206761o;
        if (dVar != null) {
            dVar.mo79963g();
        }
        C59600d dVar2 = this.f206761o;
        if (dVar2 != null) {
            dVar2.mo79961e();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f206757h;
        if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
    }

    public void onResume() {
        C60695a player;
        super.onResume();
        C59600d dVar = this.f206761o;
        if (dVar != null) {
            dVar.mo79964h();
        }
        C59600d dVar2 = this.f206761o;
        if (dVar2 != null) {
            dVar2.mo79962f();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f206757h;
        if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
            player.mo85619m();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C46919a) {
            C89137b0 d = C86709a0.m107524d();
            ((C46919a) yVar).getClass();
            d.mo123470p(5967, this);
            boolean z = false;
            if (i == 0 && i2 == 0) {
                z = true;
            } else {
                AppCompatActivity context = getContext();
                if (context != null) {
                    C76879j.m92748s(context, context.getString(C0966R.string.jzj), "");
                }
            }
            if (z) {
                finish();
            }
        }
        C89779i0 i0Var = this.f206762p;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    public final void setIvMask(View view) {
        this.f206755f = view;
    }
}

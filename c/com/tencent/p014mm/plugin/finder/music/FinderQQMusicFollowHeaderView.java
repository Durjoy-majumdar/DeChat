package com.tencent.p014mm.plugin.finder.music;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import dm1.C7370n;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import mo1.C11057v;
import nj3.C11184p0;
import o40.C61926c;
import rx3.C13598b0;
import te3.C64719t23;
import te3.C64726td1;
import up1.C65417k0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView;", "Landroid/widget/FrameLayout;", "Ldm1/n;", "topicFollowHelper", "Lrx3/b0;", "setTopicFollowHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView */
public final class FinderQQMusicFollowHeaderView extends FrameLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f15499n = 0;

    /* renamed from: d */
    public ImageView f15500d;

    /* renamed from: e */
    public WeImageView f15501e;

    /* renamed from: f */
    public String f15502f = "";

    /* renamed from: g */
    public View f15503g;

    /* renamed from: h */
    public FinderObject f15504h;

    /* renamed from: i */
    public C7370n f15505i;

    /* renamed from: j */
    public final FinderQQMusicFollowHeaderView$musicPlayEventListener$1 f15506j = new FinderQQMusicFollowHeaderView$musicPlayEventListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$a */
    public static final class C3267a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderQQMusicFollowHeaderView f15507d;

        public C3267a(FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView) {
            this.f15507d = finderQQMusicFollowHeaderView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f15507d.mo3535b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$b */
    public static final class C3268b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderQQMusicFollowHeaderView f15508d;

        public C3268b(FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView) {
            this.f15508d = finderQQMusicFollowHeaderView;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Intent intent = new Intent();
            int itemId = menuItem.getItemId();
            if (itemId == 1001) {
                intent.putExtra("key_finder_post_router", 2);
            } else if (itemId == 1002) {
                intent.putExtra("key_finder_post_router", 3);
            }
            FinderObject finderObject = this.f15508d.f15504h;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$c */
    public static final class C3269c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderQQMusicFollowHeaderView f15509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3269c(FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView) {
            super(0);
            this.f15509d = finderQQMusicFollowHeaderView;
        }

        public Object invoke() {
            this.f15509d.mo3535b();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderQQMusicFollowHeaderView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo3534a(context);
    }

    /* renamed from: a */
    public final void mo3534a(Context context) {
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.aoi, this, true);
        this.f15500d = (ImageView) findViewById(C0966R.C0970id.d_4);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ecj);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C3267a(this));
        } else {
            linearLayout = null;
        }
        this.f15503g = linearLayout;
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.eck)).getPaint(), 0.8f);
        this.f15505i = new C7370n(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        if (r3 == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        if (ot1.C11767a.f34453a.mo11659a("post") == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        r0 = r0.f25503d;
        ((er1.C58684b) di3.C86312j.m106911c(er1.C58684b.class)).getClass();
        gy3.C87412m.m108594g(r0, "context");
        dp1.C58408t0.f167336a.mo83266l(6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a3, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a5, code lost:
        r0 = r8.f15505i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (r0 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a9, code lost:
        r0 = ao1.C0143d.f574a.mo134a(r0.f25503d);
        r1 = f40.C86709a0.m107523b().mo121111i() + '_' + com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond();
        gy3.C87412m.m108594g(r1, "postId");
        r2 = dp1.C58408t0.f167337b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d8, code lost:
        if (r2 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00da, code lost:
        r2.postId = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dc, code lost:
        r0.f225771i = dm1.C7367k.f25499d;
        r0.f225782p = new com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView.C3268b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e8, code lost:
        gy3.C87412m.m108603p("topicFollowHelper");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00eb, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0079, code lost:
        r3 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3535b() {
        /*
            r8 = this;
            dm1.n r0 = r8.f15505i
            r1 = 0
            java.lang.String r2 = "topicFollowHelper"
            if (r0 == 0) goto L_0x00ed
            com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$c r3 = new com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$c
            r3.<init>(r8)
            er1.w3 r3 = er1.C58784w3.f168295a
            r4 = 1
            int r3 = er1.C58784w3.m68441q(r3, r1, r4, r1)
            r5 = 0
            switch(r3) {
                case 1: goto L_0x006d;
                case 2: goto L_0x003a;
                case 3: goto L_0x007b;
                case 4: goto L_0x002d;
                case 5: goto L_0x0020;
                case 6: goto L_0x007b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r3 = "Finder.TopicFollowHelper"
            java.lang.String r6 = "not one of six state"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r6)
            goto L_0x007b
        L_0x0020:
            android.content.Context r3 = r0.f25503d
            r6 = 2131829826(0x7f112442, float:1.9292632E38)
            android.widget.Toast r3 = nj3.C76912y0.makeText((android.content.Context) r3, (int) r6, (int) r5)
            r3.show()
            goto L_0x0079
        L_0x002d:
            android.content.Context r3 = r0.f25503d
            r6 = 2131826025(0x7f111569, float:1.9284923E38)
            android.widget.Toast r3 = nj3.C76912y0.makeText((android.content.Context) r3, (int) r6, (int) r5)
            r3.show()
            goto L_0x0079
        L_0x003a:
            com.tencent.mm.plugin.finder.view.v0 r3 = new com.tencent.mm.plugin.finder.view.v0
            android.content.Context r6 = r0.f25503d
            r3.<init>(r6)
            r6 = 2131494655(0x7f0c06ff, float:1.8612825E38)
            r3.mo5070e(r6)
            android.view.View r6 = r3.f18463f
            r7 = 2131298612(0x7f090934, float:1.8215202E38)
            android.view.View r6 = r6.findViewById(r7)
            dm1.l r7 = new dm1.l
            r7.<init>(r3)
            r6.setOnClickListener(r7)
            android.view.View r6 = r3.f18463f
            r7 = 2131300560(0x7f0910d0, float:1.8219153E38)
            android.view.View r6 = r6.findViewById(r7)
            dm1.m r7 = new dm1.m
            r7.<init>(r0, r3)
            r6.setOnClickListener(r7)
            r3.mo5073h()
            goto L_0x0079
        L_0x006d:
            android.content.Context r3 = r0.f25503d
            r6 = 2131829311(0x7f11223f, float:1.9291588E38)
            android.widget.Toast r3 = nj3.C76912y0.makeText((android.content.Context) r3, (int) r6, (int) r5)
            r3.show()
        L_0x0079:
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x007f
            goto L_0x0089
        L_0x007f:
            ot1.a r3 = ot1.C11767a.f34453a
            java.lang.String r6 = "post"
            boolean r3 = r3.mo11659a(r6)
            if (r3 == 0) goto L_0x008b
        L_0x0089:
            r4 = 0
            goto L_0x00a3
        L_0x008b:
            java.lang.Class<er1.b> r3 = er1.C58684b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            er1.b r3 = (er1.C58684b) r3
            android.content.Context r0 = r0.f25503d
            r3.getClass()
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r0, r3)
            dp1.t0 r0 = dp1.C58408t0.f167336a
            r3 = 6
            r0.mo83266l(r3, r5)
        L_0x00a3:
            if (r4 == 0) goto L_0x00ec
            dm1.n r0 = r8.f15505i
            if (r0 == 0) goto L_0x00e8
            ao1.d r1 = ao1.C0143d.f574a
            android.content.Context r0 = r0.f25503d
            qo3.n r0 = r1.mo134a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.e r2 = f40.C86709a0.m107523b()
            java.lang.String r2 = r2.mo121111i()
            r1.append(r2)
            r2 = 95
            r1.append(r2)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "postId"
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
            if (r2 == 0) goto L_0x00dc
            r2.postId = r1
        L_0x00dc:
            dm1.k r1 = dm1.C7367k.f25499d
            r0.f225771i = r1
            com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$b r1 = new com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$b
            r1.<init>(r8)
            r0.f225782p = r1
            goto L_0x00ec
        L_0x00e8:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x00ec:
            return
        L_0x00ed:
            gy3.C87412m.m108603p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView.mo3535b():void");
    }

    /* renamed from: c */
    public final void mo3536c(FinderObject finderObject, C64726td1 td12) {
        String str;
        String str2;
        if (finderObject != null) {
            str = C61926c.m72691p(finderObject.f164794id);
            this.f15502f = str;
        } else {
            str = C61926c.m72691p(C31543z5.m39453c());
            this.f15502f = str;
        }
        C64719t23 t232 = new C64719t23();
        t232.f185459d = C61926c.m72691p(finderObject != null ? finderObject.f164794id : 0);
        if (finderObject == null || (str2 = finderObject.objectNonceId) == null) {
            str2 = "";
        }
        t232.f185460e = str2;
        String str3 = td12.f185535e;
        t232.f185461f = str3;
        t232.f185462g = "";
        t232.f185463h = "";
        t232.f185464i = td12.f185538h;
        t232.f185469q = td12.f185543p;
        t232.f185473u = td12.f185536f;
        t232.f185475w = str3;
        t232.f185472t = str3;
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        ((C11057v) rVar.mo62443b(context).mo75002a(C11057v.class)).mo11197c3();
        C65417k0.f188264a.mo89512c(td12, str, 0, t232);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15506j.alive();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15506j.dead();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void setTopicFollowHelper(C7370n nVar) {
        C87412m.m108594g(nVar, "topicFollowHelper");
        this.f15505i = nVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderQQMusicFollowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo3534a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderQQMusicFollowHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo3534a(context);
    }
}

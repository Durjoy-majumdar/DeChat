package rs1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7842n2;
import fy3.C32226l;
import gr1.C59667n2;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8787n2;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C50232l93;
import zp3.C23555k;

@C113200q(initialMode = 2)
/* renamed from: rs1.u2 */
public final class C13470u2 extends C13117b implements C8787n2 {

    /* renamed from: n */
    public C50232l93 f38176n;

    /* renamed from: rs1.u2$a */
    public static final class C13471a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C13470u2 f38177d;

        /* renamed from: e */
        public final /* synthetic */ TextView f38178e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f38179f;

        /* renamed from: g */
        public final /* synthetic */ String f38180g;

        public C13471a(C13470u2 u2Var, TextView textView, C8479f0<String> f0Var, String str) {
            this.f38177d = u2Var;
            this.f38178e = textView;
            this.f38179f = f0Var;
            this.f38180g = str;
        }

        public void onChanged(Object obj) {
            C13598b0 b0Var;
            T t;
            C50232l93 l932 = (C50232l93) obj;
            if (l932 != null) {
                C13470u2 u2Var = this.f38177d;
                C8479f0<String> f0Var = this.f38179f;
                T t2 = this.f38180g;
                u2Var.f38176n = l932;
                if (!TextUtils.isEmpty(l932.f137266d)) {
                    C50232l93 l933 = u2Var.f38176n;
                    if (l933 == null || (t = l933.f137266d) == null) {
                        t = "";
                    }
                    t2 = t;
                } else if (!TextUtils.isEmpty(l932.f137267e) && !TextUtils.isEmpty(l932.f137268f)) {
                    t2 = l932.f137267e + " - " + l932.f137268f;
                    C87412m.m108593f(t2, "{\n                    St…tring()\n                }");
                }
                f0Var.f27484d = t2;
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f38179f.f27484d = this.f38180g;
            }
            this.f38178e.setTextSize(0, this.f38177d.getContext().getResources().getDimension(C0966R.dimen.f3879hn));
            this.f38178e.setText((CharSequence) this.f38179f.f27484d);
            this.f38178e.requestLayout();
        }
    }

    /* renamed from: rs1.u2$b */
    public static final class C13472b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13470u2 f38181d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f38182e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f38183f;

        /* renamed from: g */
        public final /* synthetic */ View f38184g;

        /* renamed from: h */
        public final /* synthetic */ TextView f38185h;

        /* renamed from: rs1.u2$b$a */
        public static final class C13473a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ View f38186d;

            /* renamed from: e */
            public final /* synthetic */ C13470u2 f38187e;

            /* renamed from: f */
            public final /* synthetic */ TextView f38188f;

            /* renamed from: g */
            public final /* synthetic */ FinderFullSeekBarLayout f38189g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13473a(View view, C13470u2 u2Var, TextView textView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
                super(1);
                this.f38186d = view;
                this.f38187e = u2Var;
                this.f38188f = textView;
                this.f38189g = finderFullSeekBarLayout;
            }

            public Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    this.f38186d.setBackgroundColor(this.f38187e.getContext().getResources().getColor(C0966R.color.ahf));
                    this.f38188f.setText(this.f38187e.getContext().getResources().getString(C0966R.string.lui));
                    this.f38188f.setTextColor(this.f38187e.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                }
                this.f38189g.mo4259i("");
                return C13598b0.f38549a;
            }
        }

        public C13472b(C13470u2 u2Var, BaseFinderFeed baseFinderFeed, C60905o oVar, View view, TextView textView) {
            this.f38181d = u2Var;
            this.f38182e = baseFinderFeed;
            this.f38183f = oVar;
            this.f38184g = view;
            this.f38185h = textView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC$bindRingtoneData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13470u2 u2Var = this.f38181d;
            BaseFinderFeed baseFinderFeed = this.f38182e;
            C50232l93 l932 = u2Var.f38176n;
            String str = null;
            u2Var.mo12617F3(baseFinderFeed, l932 != null ? l932.f137270h : null);
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) this.f38183f.mo85812D(C0966R.C0970id.eh4);
            C87412m.m108593f(finderFullSeekBarLayout, "fullVideoSeekBar");
            C59667n2.C8415a.m8377a(finderFullSeekBarLayout, (String) null, false, 3, (Object) null);
            C60905o oVar = this.f38183f;
            Context context = oVar.f173499A;
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                BaseFinderFeed baseFinderFeed2 = this.f38182e;
                C13470u2 u2Var2 = this.f38181d;
                View view2 = this.f38184g;
                TextView textView = this.f38185h;
                C7842n2 n2Var = C7842n2.f26407a;
                C50232l93 l933 = u2Var2.f38176n;
                if (l933 != null) {
                    str = l933.f137270h;
                }
                C7842n2.m7986b(n2Var, mMActivity, baseFinderFeed2, 4, false, str, (String) null, 0, oVar, new C13473a(view2, u2Var2, textView, finderFullSeekBarLayout), 96, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC$bindRingtoneData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.u2$c */
    public static final class C13474c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C13470u2 f38190a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f38191b;

        public C13474c(C13470u2 u2Var, BaseFinderFeed baseFinderFeed) {
            this.f38190a = u2Var;
            this.f38191b = baseFinderFeed;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C13470u2 u2Var = this.f38190a;
                BaseFinderFeed baseFinderFeed = this.f38191b;
                C50232l93 l932 = u2Var.f38176n;
                u2Var.mo12618G3(baseFinderFeed, l932 != null ? l932.f137270h : null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13470u2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public View mo12677c3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.m1e);
        if (D != null) {
            return D;
        }
        ViewStub viewStub = (ViewStub) oVar.mo85812D(C0966R.C0970id.m1f);
        View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(inflate, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12622j3(jq3.C60905o r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r13 = "holder"
            gy3.C87412m.m108594g(r12, r13)
            android.view.View r13 = r11.mo12677c3(r12)
            if (r13 != 0) goto L_0x000c
            return
        L_0x000c:
            android.content.Context r0 = r12.f173499A
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            r2 = 0
            if (r1 == 0) goto L_0x0016
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.Object r1 = r12.f173503E
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L_0x0023
            r2 = r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r1 = 2131310663(0x7f093847, float:1.8239644E38)
            android.view.View r1 = r12.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = "originalSoundTv"
            gy3.C87412m.m108593f(r1, r3)
            er1.C7919x.m8091a(r1)
            android.content.Context r3 = r12.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131829773(0x7f11240d, float:1.9292525E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "holder.context.resources…_ringtone_original_sound)"
            gy3.C87412m.m108593f(r3, r4)
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            java.lang.String r5 = ""
            r4.f27484d = r5
            rx3.g r5 = r11.f37346i
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            pf1.n r5 = (pf1.C62273n) r5
            long r6 = r2.getItemId()
            androidx.lifecycle.z r5 = r5.mo87342i3(r6)
            rs1.u2$a r6 = new rs1.u2$a
            r6.<init>(r11, r1, r4, r3)
            o40.C61926c.m72695t(r5, r0, r6)
            r0 = 2131313244(0x7f09425c, float:1.824488E38)
            android.view.View r0 = r12.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "setRingtoneTv"
            gy3.C87412m.m108593f(r0, r1)
            er1.C7919x.m8091a(r0)
            r1 = 2131313243(0x7f09425b, float:1.8244877E38)
            android.view.View r1 = r12.mo85812D(r1)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165261(0x7f07004d, float:1.7944734E38)
            float r3 = r3.getDimension(r4)
            r9 = 0
            r0.setTextSize(r9, r3)
            rs1.u2$b r10 = new rs1.u2$b
            r3 = r10
            r4 = r11
            r5 = r2
            r6 = r12
            r7 = r1
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setOnClickListener(r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r3.objectDesc
            if (r4 != 0) goto L_0x00b4
            r3 = 0
            goto L_0x00d9
        L_0x00b4:
            java.lang.Class<dx.z> r5 = p145dx.C7527z.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dx.z r5 = (p145dx.C7527z) r5
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r4 = r4.media
            java.lang.Object r4 = r4.getFirst()
            java.lang.String r6 = "media.media.first"
            gy3.C87412m.m108593f(r4, r6)
            com.tencent.mm.protocal.protobuf.FinderMedia r4 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r4
            wj2.f r3 = r5.sm0(r3, r4)
            java.lang.Class<dx.q> r4 = p145dx.C7524q.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            dx.q r4 = (p145dx.C7524q) r4
            boolean r3 = r4.fo0(r3)
        L_0x00d9:
            if (r3 == 0) goto L_0x0112
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r3 = r3.getColor(r4)
            r1.setBackgroundColor(r3)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131829774(0x7f11240e, float:1.9292527E38)
            java.lang.String r3 = r3.getString(r4)
            r0.setText(r3)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099697(0x7f060031, float:1.7811755E38)
            int r3 = r3.getColor(r4)
            r0.setTextColor(r3)
            goto L_0x0148
        L_0x0112:
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099704(0x7f060038, float:1.7811769E38)
            int r3 = r3.getColor(r4)
            r1.setBackgroundColor(r3)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131829889(0x7f112481, float:1.929276E38)
            java.lang.String r3 = r3.getString(r4)
            r0.setText(r3)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099927(0x7f060117, float:1.7812221E38)
            int r3 = r3.getColor(r4)
            r0.setTextColor(r3)
        L_0x0148:
            r0 = 2131312554(0x7f093faa, float:1.824348E38)
            android.view.View r12 = r12.mo85812D(r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.field_finderObject
            int r0 = r0.ringtone_count
            java.lang.String r0 = er1.C7878t0.m8039h(r0)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165444(0x7f070104, float:1.7945105E38)
            float r3 = r3.getDimension(r4)
            r12.setTextSize(r9, r3)
            android.app.Activity r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131829772(0x7f11240c, float:1.9292523E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r9] = r0
            java.lang.String r0 = r3.getString(r4, r5)
            r12.setText(r0)
            android.app.Activity r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r0 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r12 = r12.getDimension(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout"
            gy3.C87412m.m108592e(r1, r0)
            r0 = r1
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r0
            r0.mo153905b(r12, r12, r12, r12)
            r1.invalidate()
            rs1.u2$c r12 = new rs1.u2$c
            r12.<init>(r11, r2)
            zp3.C23564m.m28138h(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13470u2.mo12622j3(jq3.o, java.lang.String):void");
    }
}

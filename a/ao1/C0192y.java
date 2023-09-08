package ao1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.view.FinderEmojiChooseView;
import com.tencent.p014mm.plugin.finder.view.FinderExtendReadingView;
import com.tencent.p014mm.plugin.finder.view.FinderTencentVideoChooseView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dr1.C7471a0;
import dr1.C7478d0;
import dr1.C7483i;
import dr1.C7489l;
import dr1.C7493o;
import fy3.C32224a;
import gy3.C24564k0;
import gy3.C87412m;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76879j;
import rx3.C13598b0;
import te3.C52110yf3;
import uq1.C65449m;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: ao1.y */
public final class C0192y extends UIComponent {

    /* renamed from: d */
    public View f659d;

    /* renamed from: e */
    public C7489l f660e;

    /* renamed from: f */
    public C7471a0 f661f;

    /* renamed from: g */
    public C7493o f662g;

    /* renamed from: h */
    public C32224a<C13598b0> f663h;

    /* renamed from: i */
    public C32224a<C13598b0> f664i;

    /* renamed from: j */
    public C32224a<C13598b0> f665j;

    /* renamed from: n */
    public C32224a<C13598b0> f666n;

    /* renamed from: o */
    public C32224a<C13598b0> f667o;

    /* renamed from: ao1.y$a */
    public static final class C0193a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C0192y f668d;

        public C0193a(C0192y yVar) {
            this.f668d = yVar;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkGoodsVisible$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            C0192y.m136g3(this.f668d, true, false, 2, (Object) null);
            C66785b bVar = C66785b.f191882e;
            C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
            int i = a != null ? a.field_extFlag : 0;
            boolean z2 = (4194304 & i) != 0;
            Log.m105924i("Finder.FinderPostUtil", "checkWindowProductSpam extFlag:" + i + ", ret " + z2);
            if (z2) {
                C0192y yVar = this.f668d;
                yVar.getClass();
                C52110yf3 yf32 = bVar.mo90673n0().mo62398d().f141691w;
                if (yf32 == null || (str = yf32.f145260d) == null) {
                    str = "";
                }
                C76879j.m92711E(yVar.getActivity(), str, "", yVar.getActivity().getString(C0966R.string.f8028zq), true, (DialogInterface.OnClickListener) null);
            } else {
                C0192y yVar2 = this.f668d;
                C7478d0 d0Var = yVar2.mo174f3().f592f;
                if (d0Var != null && (d0Var instanceof C7483i)) {
                    if (!C65449m.f188332a.mo89564c()) {
                        C39622i0 a2 = C39818r.f106831a.mo62444c(yVar2.getActivity()).mo75002a(PostMainUIC.class);
                        C87412m.m108593f(a2, "UICProvider.of(activity)…(PostMainUIC::class.java)");
                        if (!((PostMainUIC) a2).mo78410F3().mo75460h()) {
                            z = false;
                        }
                    }
                    if (z) {
                        ((C7483i) d0Var).mo8622e();
                    }
                }
                C32224a<C13598b0> aVar = this.f668d.f666n;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkGoodsVisible$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0192y(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static void m136g3(C0192y yVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        yVar.getClass();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String stringExtra = yVar.getActivity().getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        C115669n.INSTANCE.mo160131h(21875, Wb, stringExtra, 74, Integer.valueOf(z ? 1 : 0), String.valueOf(System.currentTimeMillis()), "post_good_icon", z2 ? "{\"if_have_good\":1}" : "{\"if_have_good\":2}");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo171c3() {
        /*
            r12 = this;
            ao1.g0 r0 = r12.mo174f3()
            dr1.d0 r0 = r0.f592f
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0 instanceof dr1.C7483i
            if (r0 == 0) goto L_0x009c
            uq1.m r0 = uq1.C65449m.f188332a
            boolean r0 = r0.mo89564c()
            r1 = 0
            if (r0 != 0) goto L_0x0039
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r12.getActivity()
            bl3.r$a r0 = r0.mo62444c(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.post.PostMainUIC> r2 = com.tencent.p014mm.plugin.finder.post.PostMainUIC.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(activity)…(PostMainUIC::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = (com.tencent.p014mm.plugin.finder.post.PostMainUIC) r0
            bt1.e r0 = r0.mo78410F3()
            boolean r0 = r0.mo75460h()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r0 == 0) goto L_0x009c
            android.view.View r0 = r12.f659d
            r2 = 0
            if (r0 == 0) goto L_0x0049
            r3 = 2131312593(0x7f093fd1, float:1.8243559E38)
            android.view.View r0 = r0.findViewById(r3)
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            if (r0 != 0) goto L_0x004d
            goto L_0x008e
        L_0x004d:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC"
            java.lang.String r6 = "checkGoodsVisible"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r11.mo10231a(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC"
            java.lang.String r5 = "checkGoodsVisible"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x008e:
            r3 = 2
            m136g3(r12, r1, r1, r3, r2)
            if (r0 == 0) goto L_0x009c
            ao1.y$a r1 = new ao1.y$a
            r1.<init>(r12)
            r0.setOnClickListener(r1)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao1.C0192y.mo171c3():void");
    }

    /* renamed from: d3 */
    public final void mo172d3() {
        C7493o oVar = this.f662g;
        FinderExtendReadingView finderExtendReadingView = oVar != null ? oVar.f25730b : null;
        if (finderExtendReadingView != null) {
            finderExtendReadingView.setVisibility(8);
        }
    }

    /* renamed from: e3 */
    public final void mo173e3() {
        FinderExtendReadingView finderExtendReadingView;
        C7493o oVar = this.f662g;
        if (!(oVar == null || (finderExtendReadingView = oVar.f25730b) == null)) {
            finderExtendReadingView.mo4490a();
        }
        C7493o oVar2 = this.f662g;
        if (oVar2 != null) {
            oVar2.mo8631i("", true);
        }
        C7493o oVar3 = this.f662g;
        if (oVar3 != null) {
            C7493o.m7633j(oVar3, "", "", 2, false, 8, (Object) null);
        }
        C7493o oVar4 = this.f662g;
        FinderExtendReadingView finderExtendReadingView2 = oVar4 != null ? oVar4.f25730b : null;
        if (finderExtendReadingView2 != null) {
            finderExtendReadingView2.setVisibility(0);
        }
    }

    /* renamed from: f3 */
    public final C0152g0 mo174f3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0152g0.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…tJumpInfoUIC::class.java)");
        return (C0152g0) a;
    }

    /* renamed from: i3 */
    public final void mo175i3() {
        mo173e3();
        C7493o oVar = this.f662g;
        if (oVar != null) {
            Bundle bundle = oVar.f25734f;
            if (bundle != null) {
                bundle.remove("post_extend_reading");
            }
            Intent intent = oVar.f25735g;
            if (intent != null) {
                intent.removeExtra("saveExtendReadingLink");
            }
            Intent intent2 = oVar.f25735g;
            if (intent2 != null) {
                intent2.removeExtra("post_extend_reading");
            }
            Intent intent3 = oVar.f25735g;
            if (intent3 != null) {
                intent3.removeExtra("post_extend_reading");
            }
        }
        C7493o oVar2 = this.f662g;
        FinderExtendReadingView finderExtendReadingView = oVar2 != null ? oVar2.f25730b : null;
        if (finderExtendReadingView != null) {
            finderExtendReadingView.setVisibility(8);
        }
        C7489l lVar = this.f660e;
        FinderEmojiChooseView finderEmojiChooseView = lVar != null ? lVar.f25721b : null;
        if (finderEmojiChooseView != null) {
            finderEmojiChooseView.setVisibility(8);
        }
        C7489l lVar2 = this.f660e;
        if (lVar2 != null) {
            List<? extends FinderJumpInfo> list = lVar2.f25724e;
            if (!C24564k0.m30743g(list)) {
                list = null;
            }
            if (list != null) {
                list.clear();
            }
            lVar2.f25724e = null;
        }
        C7471a0 a0Var = this.f661f;
        FinderTencentVideoChooseView finderTencentVideoChooseView = a0Var != null ? a0Var.f25686b : null;
        if (finderTencentVideoChooseView != null) {
            finderTencentVideoChooseView.setVisibility(8);
        }
        C7471a0 a0Var2 = this.f661f;
        if (a0Var2 != null) {
            List<? extends FinderJumpInfo> list2 = a0Var2.f25689e;
            if (!C24564k0.m30743g(list2)) {
                list2 = null;
            }
            if (list2 != null) {
                list2.clear();
            }
            a0Var2.f25689e = null;
        }
    }
}

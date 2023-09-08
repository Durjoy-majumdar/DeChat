package xk1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rj1.C63441b;
import rp1.C63486a;
import rx3.C36570n;
import te3.C51059r51;
import te3.C64699s51;
import uj1.C65374a;

/* renamed from: xk1.q0 */
public final class C66342q0 extends UIComponent implements C63486a {

    /* renamed from: d */
    public final C63441b f190973d;

    /* renamed from: e */
    public C65374a f190974e;

    /* renamed from: f */
    public View f190975f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66342q0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C63441b bVar = new C63441b(appCompatActivity);
        bVar.f179943e = this;
        this.f190973d = bVar;
    }

    /* renamed from: S2 */
    public C45795b mo87856S2() {
        return ((C66331m) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C66331m.class)).f190942e;
    }

    /* renamed from: U */
    public void mo87857U(Context context, C51059r51 r512) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(r512, "item");
        this.f190973d.mo88311c(context, r512);
    }

    /* renamed from: c3 */
    public final void mo90448c3(Intent intent) {
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 5) {
            mo90449d3((Bundle) null);
            Intent intent2 = getContext().getIntent();
            if (intent2 != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b7 A[EDGE_INSN: B:60:0x00b7->B:51:0x00b7 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90449d3(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0014
            java.lang.String r1 = "KEY_FINDER_NOTICE_ITEM"
            byte[] r1 = r11.getByteArray(r1)
            if (r1 == 0) goto L_0x0014
            te3.s51 r2 = new te3.s51
            r2.<init>()
            r2.parseFrom(r1)
            goto L_0x0015
        L_0x0014:
            r2 = r0
        L_0x0015:
            if (r11 == 0) goto L_0x001e
            java.lang.String r1 = "KEY_FINDER_NOTICE_DELED_ID"
            java.lang.String r11 = r11.getString(r1)
            goto L_0x001f
        L_0x001e:
            r11 = r0
        L_0x001f:
            if (r2 == 0) goto L_0x0040
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.mo87860k1(r2, r1)
            rj1.b r1 = r10.f190973d
            r1.getClass()
            fj1.b r3 = r10.mo87856S2()
            if (r3 == 0) goto L_0x0040
            dh1.b r2 = dh1.C7329b.f25441a
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            dh1.C7329b.m7473b(r2, r3, r4, r5, r6, r7, r8, r9)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            r2 = 0
            if (r1 != 0) goto L_0x00cf
            if (r11 == 0) goto L_0x00c8
            int r1 = r11.length()
            r3 = 1
            if (r1 <= 0) goto L_0x004f
            r1 = 1
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r11 = r0
        L_0x0054:
            if (r11 == 0) goto L_0x00c8
            uj1.a r1 = r10.f190974e
            if (r1 == 0) goto L_0x00c1
            com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView r4 = r1.mo89473c()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x006b
            com.tencent.mm.plugin.finder.live.view.FinderLiveMultiNoticeView r1 = r1.mo89473c()
            r1.mo3332d(r11)
        L_0x006b:
            rj1.b r1 = r10.f190973d
            java.util.LinkedList<te3.r51> r1 = r1.f179942d
            if (r1 == 0) goto L_0x00c8
            java.util.Iterator r1 = r1.iterator()
        L_0x0075:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r1.next()
            r5 = r4
            te3.r51 r5 = (te3.C51059r51) r5
            int r6 = r5.f140706e
            if (r6 != r3) goto L_0x00b2
            te3.d51 r6 = new te3.d51
            r6.<init>()
            pe3.b r5 = r5.f140707f
            if (r5 == 0) goto L_0x0094
            byte[] r5 = r5.mo123703f()
            goto L_0x0095
        L_0x0094:
            r5 = r0
        L_0x0095:
            if (r5 != 0) goto L_0x0098
            goto L_0x00a8
        L_0x0098:
            r6.parseFrom(r5)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a8
        L_0x009c:
            r5 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r5
            java.lang.String r5 = "safeParser"
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r8, r7)
        L_0x00a8:
            java.lang.String r5 = r6.f132122h
            boolean r5 = gy3.C87412m.m108589b(r5, r11)
            if (r5 == 0) goto L_0x00b2
            r5 = 1
            goto L_0x00b3
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            if (r5 == 0) goto L_0x0075
            goto L_0x00b7
        L_0x00b6:
            r4 = r0
        L_0x00b7:
            te3.r51 r4 = (te3.C51059r51) r4
            if (r4 == 0) goto L_0x00c8
            r10.mo87861t2(r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x00c8
        L_0x00c1:
            java.lang.String r11 = "view"
            gy3.C87412m.m108603p(r11)
            throw r0
        L_0x00c8:
            if (r0 != 0) goto L_0x00cf
            rj1.b r11 = r10.f190973d
            r11.mo88312d()
        L_0x00cf:
            r10.mo10792g(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66342q0.mo90449d3(android.os.Bundle):void");
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (i == 0) {
            View view = this.f190975f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C65374a aVar2 = this.f190974e;
                if (aVar2 != null) {
                    ((LiveBottomSheetPanel) ((C36570n) aVar2.f188165g).getValue()).mo78804d();
                } else {
                    C87412m.m108603p("view");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewRoot");
                throw null;
            }
        } else {
            C65374a aVar3 = this.f190974e;
            if (aVar3 != null) {
                aVar3.mo89474d();
                View view3 = this.f190975f;
                if (view3 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("viewRoot");
                throw null;
            }
            C87412m.m108603p("view");
            throw null;
        }
    }

    /* renamed from: k1 */
    public void mo87860k1(C64699s51 s512, Boolean bool) {
        C87412m.m108594g(s512, "info");
        this.f190973d.mo88309a(s512, bool);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            super.onActivityResult(r3, r4, r5)
            r0 = 1012(0x3f4, float:1.418E-42)
            r1 = 0
            if (r3 == r0) goto L_0x0027
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r3 == r0) goto L_0x000d
            goto L_0x0056
        L_0x000d:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r4 != r3) goto L_0x0056
            if (r5 == 0) goto L_0x0019
            java.lang.String r3 = "ACTIVITY_RESULT_REMOVE_NOTICE_KEY"
            java.lang.String r1 = r5.getStringExtra(r3)
        L_0x0019:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "KEY_FINDER_NOTICE_DELED_ID"
            r3.putString(r4, r1)
            r2.mo90449d3(r3)
            goto L_0x0056
        L_0x0027:
            r3 = -1
            if (r4 != r3) goto L_0x0056
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            if (r5 == 0) goto L_0x0037
            java.lang.String r4 = "KEY_FINDER_LIVE_NOTICE_INFO"
            byte[] r1 = r5.getByteArrayExtra(r4)
        L_0x0037:
            te3.s51 r4 = new te3.s51
            r4.<init>()
            r5 = 1
            r4.f185341d = r5
            r4.f185342e = r5
            pe3.b r5 = new pe3.b
            r5.<init>(r1)
            r4.f185343f = r5
            rx3.b0 r5 = rx3.C13598b0.f38549a
            byte[] r4 = r4.toByteArray()
            java.lang.String r5 = "KEY_FINDER_NOTICE_ITEM"
            r3.putByteArray(r5, r4)
            r2.mo90449d3(r3)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66342q0.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onBackPressed() {
        C65374a aVar = this.f190974e;
        if (aVar == null) {
            C87412m.m108603p("view");
            throw null;
        } else if (aVar.mo89473c().getVisibility() != 0) {
            return false;
        } else {
            aVar.mo89473c().mo3333e();
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = getActivity().findViewById(C0966R.C0970id.dd8);
        C87412m.m108593f(findViewById, "activity.findViewById(R.…anchor_promotion_ui_root)");
        this.f190975f = findViewById;
        C65374a aVar = new C65374a(findViewById);
        aVar.mo89475e(this, this.f190973d.f179941c);
        this.f190974e = aVar;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo90448c3(intent);
    }

    public void onResume() {
        super.onResume();
        mo90448c3(getContext().getIntent());
    }

    /* renamed from: t2 */
    public void mo87861t2(C51059r51 r512) {
        C87412m.m108594g(r512, "info");
        this.f190973d.mo88310b(r512);
    }
}

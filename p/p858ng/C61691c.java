package p858ng;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.modelcdntran.C55377a0;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mh0.C99864d;
import p1083jg.C98939a;
import p1086ro.C101415b;
import p434ig.C98672d;
import p606mm.C99933h;
import p855lg.C61278a;
import ph0.C100792a;
import qh0.C62619a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import th0.C101888l;
import th0.C64932j;

/* renamed from: ng.c */
public final class C61691c extends UIComponent {

    /* renamed from: d */
    public final C13601g f175388d;

    /* renamed from: ng.c$a */
    public /* synthetic */ class C61692a extends C24565l implements C32226l<C61710l, C13598b0> {
        public C61692a(Object obj) {
            super(1, obj, C61691c.class, "processState", "processState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C61710l lVar = (C61710l) obj;
            C87412m.m108594g(lVar, "p0");
            ((C61691c) this.receiver).getClass();
            IStateAction action = lVar.getAction();
            if (action != null && (action instanceof C61696d)) {
                ((ArrayList) lVar.f175411e).addAll(((C61696d) action).f175391a);
            }
            IStateAction action2 = lVar.getAction();
            if (action2 != null && (action2 instanceof C61728w)) {
                C61728w wVar = (C61728w) action2;
                lVar.f175412f = wVar.f175438a;
                lVar.f175413g = wVar.f175439b;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ng.c$b */
    public /* synthetic */ class C61693b extends C24565l implements C32226l<C61710l, C13598b0> {
        public C61693b(Object obj) {
            super(1, obj, C61691c.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C61710l lVar = (C61710l) obj;
            C87412m.m108594g(lVar, "p0");
            C61691c cVar = (C61691c) this.receiver;
            cVar.getClass();
            IStateAction action = lVar.getAction();
            if (action != null && (action instanceof C61727v)) {
                C61727v vVar = (C61727v) action;
                C101888l lVar2 = C101888l.f300029a;
                AppCompatActivity activity = cVar.getActivity();
                C61278a aVar = vVar.f175436a;
                C98672d dVar = aVar.f174389h;
                C72963f4 f4Var = aVar.f174390i;
                WeakReference weakReference = new WeakReference(new C61690b(cVar, vVar));
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C87412m.m108594g(dVar, "albumDataItem");
                if (f4Var != null) {
                    C100792a aVar2 = C100792a.f295260a;
                    String t = f4Var.mo108768t();
                    if (t == null) {
                        t = "";
                    }
                    String e = aVar2.mo140234e(dVar, t, f4Var.getMsgId());
                    C98597b.C60245a aVar3 = C98597b.f289091e;
                    C7335d c = C86312j.m106911c(C99864d.class);
                    C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                    ((C101415b) aVar3.mo85231a((C98598e) c, C101415b.class)).mo140924g3(f4Var, dVar, new C64932j(dVar, e, weakReference, activity), new WeakReference((C55377a0) weakReference.get()));
                }
                C61278a aVar4 = vVar.f175436a;
                C72963f4 f4Var2 = aVar4.f174390i;
                int size = lVar2.mo141354c(aVar4.f174388g).size();
                int size2 = lVar2.mo141355d(vVar.f175436a.f174388g).size();
                long j = vVar.f175437b;
                C61278a aVar5 = vVar.f175436a;
                int i = aVar5.f174386e;
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, "album_enter_from_scene", C62619a.class, new C98939a(j, f4Var2, size, size2, aVar5.f174389h, i));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ng.c$c */
    public static final class C61694c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C61691c f175389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61694c(C61691c cVar) {
            super(0);
            this.f175389d = cVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f175389d.getIntent().getIntExtra("album_enter_from_scene", 1));
        }
    }

    /* renamed from: ng.c$d */
    public static final class C61695d extends C87413o implements C32224a<UIStateCenter<C61710l>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f175390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61695d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f175390d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C61710l(), this.f175390d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61691c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C36568h.m40985a(new C61694c(this));
        this.f175388d = C36568h.m40985a(new C61695d(appCompatActivity));
    }

    /* renamed from: c3 */
    public final UIStateCenter<C61710l> mo86622c3() {
        return (UIStateCenter) ((C36570n) this.f175388d).getValue();
    }

    public void onCreate(Bundle bundle) {
        mo86622c3().process((C0125s) getActivity(), new C61692a(this));
        mo86622c3().observe((C0125s) getActivity(), new C61693b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if ((r2.length() > 0) == true) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0110, code lost:
        if ((r2.length() > 0) == true) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r21) {
        /*
            r20 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            androidx.appcompat.app.AppCompatActivity r1 = r20.getActivity()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "img_gallery_talker"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = "img_gallery_chatroom_name"
            java.lang.String r3 = r1.getStringExtra(r3)
            java.lang.String r4 = "img_gallery_msg_id"
            r5 = 0
            long r7 = r1.getLongExtra(r4, r5)
            java.lang.String r4 = "img_gallery_msg_svr_id"
            long r9 = r1.getLongExtra(r4, r5)
            r4 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0034
            int r12 = r3.length()
            if (r12 <= 0) goto L_0x0030
            r12 = 1
            goto L_0x0031
        L_0x0030:
            r12 = 0
        L_0x0031:
            if (r12 == 0) goto L_0x0034
            r2 = r3
        L_0x0034:
            java.lang.String r3 = "album_enter_info_data"
            java.lang.String r1 = r1.getStringExtra(r3)
            r3 = 10
            r12 = 0
            if (r1 == 0) goto L_0x00c9
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r13 != 0) goto L_0x00c9
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x006b
            if (r2 == 0) goto L_0x0057
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r5 != r4) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 == 0) goto L_0x006b
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.h30(r2, r9)
            goto L_0x006c
        L_0x006b:
            r0 = r12
        L_0x006c:
            if (r0 != 0) goto L_0x0079
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            r0.setMsgId(r7)
            r0.mo108749c3(r2)
        L_0x0079:
            ig.g r2 = new ig.g
            r2.<init>()
            r2.mo141099d(r1)
            com.tencent.mm.sdk.statecenter.UIStateCenter r1 = r20.mo86622c3()
            java.util.List<ig.d> r4 = r2.f289364h
            java.util.ArrayList r5 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r4, r3)
            r5.<init>(r3)
            java.util.Iterator r3 = r4.iterator()
            r15 = 0
        L_0x0095:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c0
            java.lang.Object r4 = r3.next()
            int r11 = r15 + 1
            if (r15 < 0) goto L_0x00bc
            r18 = r4
            ig.d r18 = (p434ig.C98672d) r18
            lg.a r4 = new lg.a
            java.lang.String r14 = r18.mo55264K()
            r16 = 0
            r13 = r4
            r17 = r2
            r19 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r5.add(r4)
            r15 = r11
            goto L_0x0095
        L_0x00bc:
            sx3.C64197v.m75542k()
            throw r12
        L_0x00c0:
            ng.d r2 = new ng.d
            r2.<init>(r0, r5)
            r1.dispatch(r2)
            return
        L_0x00c9:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0103
            int r13 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x0103
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " initView, msgId is invalid, msgId = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", msgSvrId = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", stack = "
            r0.append(r1)
            com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AlbumGalleryDataUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r20.getActivity()
            r0.finish()
            return
        L_0x0103:
            if (r1 > 0) goto L_0x012a
            if (r2 == 0) goto L_0x0113
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x010f
            r1 = 1
            goto L_0x0110
        L_0x010f:
            r1 = 0
        L_0x0110:
            if (r1 != r4) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r4 = 0
        L_0x0114:
            if (r4 == 0) goto L_0x012a
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.h30(r2, r9)
            long r7 = r1.getMsgId()
        L_0x012a:
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r7)
            ig.a r1 = new ig.a
            r1.<init>()
            java.lang.String r2 = r0.getContent()
            java.lang.String r4 = "currentMsg.content"
            gy3.C87412m.m108593f(r2, r4)
            r1.mo141099d(r2)
            ig.g r2 = new ig.g
            r2.<init>()
            java.lang.String r1 = r1.f289309p
            r2.mo141099d(r1)
            i40.b$a r1 = i40.C98597b.f289091e
            java.lang.Class<mh0.d> r4 = mh0.C99864d.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r5 = "getService(AlbumFeatureService::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            i40.e r4 = (i40.C98598e) r4
            java.lang.Class<mh0.e0> r5 = mh0.C99865e0.class
            i40.b r1 = r1.mo85231a(r4, r5)
            mh0.e0 r1 = (mh0.C99865e0) r1
            mh0.a r1 = r1.mo139217g3(r7)
            com.tencent.mm.sdk.statecenter.UIStateCenter r4 = r20.mo86622c3()
            java.util.List<ig.d> r5 = r2.f289364h
            java.util.ArrayList r6 = new java.util.ArrayList
            int r3 = sx3.C36907w.m41090l(r5, r3)
            r6.<init>(r3)
            java.util.Iterator r3 = r5.iterator()
            r15 = 0
        L_0x0184:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01af
            java.lang.Object r5 = r3.next()
            int r11 = r15 + 1
            if (r15 < 0) goto L_0x01ab
            r18 = r5
            ig.d r18 = (p434ig.C98672d) r18
            lg.a r5 = new lg.a
            java.lang.String r14 = r18.mo55264K()
            r13 = r5
            r16 = r1
            r17 = r2
            r19 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r6.add(r5)
            r15 = r11
            goto L_0x0184
        L_0x01ab:
            sx3.C64197v.m75542k()
            throw r12
        L_0x01af:
            ng.d r1 = new ng.d
            r1.<init>(r0, r6)
            r4.dispatch(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p858ng.C61691c.onCreateAfter(android.os.Bundle):void");
    }
}

package mo1;

import a14.C0000n0;
import android.util.ArrayMap;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import cm1.C0714b2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p749xh.C102666r2;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mo1.k1 */
public final class C11013k1 extends UIComponent {

    /* renamed from: d */
    public final ArrayMap<String, C102666r2> f32733d = new ArrayMap<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.profile.uic.FinderProfileQQMusicFavUIC$setFavItemInfo$1", mo125469f = "FinderProfileQQMusicFavUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: mo1.k1$a */
    public static final class C11014a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0714b2 f32734d;

        /* renamed from: e */
        public final /* synthetic */ C11013k1 f32735e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C0714b2, C13598b0> f32736f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11014a(C0714b2 b2Var, C11013k1 k1Var, C32226l<? super C0714b2, C13598b0> lVar, C15601d<? super C11014a> dVar) {
            super(2, dVar);
            this.f32734d = b2Var;
            this.f32735e = k1Var;
            this.f32736f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11014a(this.f32734d, this.f32735e, this.f32736f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11014a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
            r1 = r1.musicInfo;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                kotlin.ResultKt.throwOnFailure(r3)
                cm1.b2 r3 = r2.f32734d
                mo1.k1 r0 = r2.f32735e
                android.util.ArrayMap<java.lang.String, xh.r2> r0 = r0.f32733d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.f1711d
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x001a
                te3.td1 r1 = r1.musicInfo
                if (r1 == 0) goto L_0x001a
                java.lang.String r1 = r1.f185534d
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r1 != 0) goto L_0x001f
                java.lang.String r1 = ""
            L_0x001f:
                java.lang.Object r0 = r0.get(r1)
                xh.r2 r0 = (p749xh.C102666r2) r0
                r3.f1716i = r0
                if (r0 == 0) goto L_0x002b
                r0 = 1
                goto L_0x002c
            L_0x002b:
                r0 = 0
            L_0x002c:
                r3.f1715h = r0
                fy3.l<cm1.b2, rx3.b0> r3 = r2.f32736f
                if (r3 == 0) goto L_0x0037
                cm1.b2 r0 = r2.f32734d
                r3.invoke(r0)
            L_0x0037:
                rx3.b0 r3 = rx3.C13598b0.f38549a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: mo1.C11013k1.C11014a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11013k1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = r1.musicInfo;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11172c3(cm1.C0714b2 r10, fy3.C32226l<? super cm1.C0714b2, rx3.C13598b0> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r10, r0)
            android.util.ArrayMap<java.lang.String, xh.r2> r0 = r9.f32733d
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.f1711d
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            r2 = 0
            if (r1 == 0) goto L_0x0019
            te3.td1 r1 = r1.musicInfo
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r1.f185534d
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = ""
        L_0x001e:
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0036
            a14.n0 r3 = r9.getMainScope()
            r4 = 0
            r5 = 0
            mo1.k1$a r6 = new mo1.k1$a
            r6.<init>(r10, r9, r11, r2)
            r7 = 3
            r8 = 0
            a14.C53895h.m60466d(r3, r4, r5, r6, r7, r8)
            r10 = 1
            return r10
        L_0x0036:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mo1.C11013k1.mo11172c3(cm1.b2, fy3.l):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11013k1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}

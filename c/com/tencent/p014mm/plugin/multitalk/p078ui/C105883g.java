package com.tencent.p014mm.plugin.multitalk.p078ui;

import a14.C0000n0;
import a14.C53973z1;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import as3.C103900s0;
import bl3.C54495t;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.g */
public final class C105883g extends C54495t {

    /* renamed from: d */
    public C54219z<Boolean> f314934d;

    /* renamed from: e */
    public final LiveData<Boolean> f314935e;

    /* renamed from: f */
    public C54219z<Boolean> f314936f;

    /* renamed from: g */
    public final LiveData<Boolean> f314937g;

    /* renamed from: h */
    public C54219z<Boolean> f314938h;

    /* renamed from: i */
    public final LiveData<Boolean> f314939i;

    /* renamed from: j */
    public final C54219z<List<C105882d>> f314940j;

    /* renamed from: n */
    public final LiveData<List<C105882d>> f314941n;

    /* renamed from: o */
    public final C54219z<String> f314942o;

    /* renamed from: p */
    public final LiveData<String> f314943p;

    /* renamed from: q */
    public boolean f314944q;

    /* renamed from: r */
    public boolean f314945r;

    /* renamed from: s */
    public final C54219z<Boolean> f314946s;

    /* renamed from: t */
    public final LiveData<Boolean> f314947t;

    /* renamed from: u */
    public final C54219z<Boolean> f314948u;

    /* renamed from: v */
    public final LiveData<Boolean> f314949v;

    /* renamed from: w */
    public final C54219z<Boolean> f314950w;

    /* renamed from: x */
    public final LiveData<Boolean> f314951x;

    /* renamed from: y */
    public C53973z1 f314952y;

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.ui.MultiTalkUIViewModel$onSpeakerClick$1", mo125469f = "MultiTalkUIViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.multitalk.ui.g$a */
    public static final class C105884a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ boolean f314953d;

        /* renamed from: e */
        public final /* synthetic */ C105883g f314954e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105884a(boolean z, C105883g gVar, C15601d<? super C105884a> dVar) {
            super(2, dVar);
            this.f314953d = z;
            this.f314954e = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105884a(this.f314953d, this.f314954e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105884a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C105851w0.zx0().mo150642S(!this.f314953d);
            this.f314954e.f314936f.postValue(Boolean.valueOf(!this.f314953d));
            C105853x.f314825c++;
            if (!this.f314953d) {
                C105853x.m142230a(3);
                C105851w0.xx0().mo150827g(true);
            } else {
                C105853x.m142230a(4);
                C105851w0.xx0().mo150827g(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C105883g() {
        /*
            r4 = this;
            r4.<init>()
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r1 = r1.f314493e
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            r4.f314934d = r0
            r4.f314935e = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r1 = r1.f314494f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            r4.f314936f = r0
            r4.f314937g = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            com.tencent.mm.plugin.multitalk.model.p r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            boolean r1 = r1.mo150809d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            r4.f314938h = r0
            r4.f314939i = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            sx3.f0 r1 = sx3.C64186f0.f181907d
            r0.<init>(r1)
            r4.f314940j = r0
            r4.f314941n = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            java.lang.String r1 = ""
            r0.<init>(r1)
            r4.f314942o = r0
            r4.f314943p = r0
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f314482U
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "front_cam_vb"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0077
            boolean r3 = r0 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x006f
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0070
        L_0x006f:
            r0 = r1
        L_0x0070:
            if (r0 == 0) goto L_0x0077
            boolean r0 = r0.booleanValue()
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            r4.f314944q = r0
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f314482U
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r3 = "back_cam_vb"
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0098
            boolean r3 = r0 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0091
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0091:
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.booleanValue()
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            r4.f314945r = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            com.tencent.mm.plugin.multitalk.model.p r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            boolean r1 = r1.mo150810e()
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r4.f314944q
            goto L_0x00ac
        L_0x00aa:
            boolean r1 = r4.f314945r
        L_0x00ac:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            r4.f314946s = r0
            r4.f314947t = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            c82.b r1 = r1.f314469K
            if (r1 == 0) goto L_0x00c5
            boolean r2 = r1.mo146014f0()
        L_0x00c5:
            r1 = r2 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            r4.f314948u = r0
            r4.f314949v = r0
            androidx.lifecycle.z r0 = new androidx.lifecycle.z
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r1 = r1.mo150684z()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            r4.f314950w = r0
            r4.f314951x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.C105883g.<init>():void");
    }

    /* renamed from: c3 */
    public static final int m142290c3(C105883g gVar, MultiTalkGroupMember multiTalkGroupMember, List list, String str) {
        Object obj;
        int i;
        int i2;
        gVar.getClass();
        if (C87412m.m108589b(multiTalkGroupMember.f320048d, str)) {
            return 1000;
        }
        boolean z = true;
        boolean z2 = multiTalkGroupMember.f320050f == 10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C87412m.m108589b(((C103900s0) obj).f307156c, multiTalkGroupMember.f320048d)) {
                break;
            }
        }
        C103900s0 s0Var = (C103900s0) obj;
        if (s0Var == null || !((i = s0Var.f307158e) == 3 || i == 2 || (i2 = s0Var.f307159f) == 101 || i2 == 102)) {
            z = false;
        }
        if (z2) {
            return z ? 0 : 10;
        }
        return 100;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo150904d3(java.lang.Boolean r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCameraClick, cur state: "
            r0.append(r1)
            androidx.lifecycle.LiveData<java.lang.Boolean> r1 = r6.f314939i
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", new state: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MT.MultiTalkUIViewModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0030
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x0030:
            androidx.lifecycle.LiveData<java.lang.Boolean> r7 = r6.f314939i
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x003f
            boolean r7 = r7.booleanValue()
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            com.tencent.mm.plugin.multitalk.model.p r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            boolean r3 = r3.mo150809d()
            r3 = r3 ^ r0
            if (r7 != r3) goto L_0x006d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "current camera state is "
            r7.append(r0)
            com.tencent.mm.plugin.multitalk.model.p r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            boolean r0 = r0.mo150809d()
            r7.append(r0)
            java.lang.String r0 = ", return"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            return
        L_0x006d:
            java.lang.String r1 = "getCameraManager()"
            if (r7 == 0) goto L_0x009a
            w33.c0 r2 = w33.C111720c0.f334432a
            r3 = 4
            com.tencent.mm.plugin.multitalk.model.p r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            boolean r4 = r4.mo150810e()
            r2.mo163400b(r3, r4)
            com.tencent.mm.plugin.multitalk.model.p r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            gy3.C87412m.m108593f(r2, r1)
            r2.mo150813i(r0)
            r1 = 6
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142230a(r1)
            com.tencent.mm.plugin.multitalk.ilinkservice.z r1 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            r1.mo150612v()
            v82.d1 r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Cx0()
            r1.getClass()
            goto L_0x00f5
        L_0x009a:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            boolean r3 = r3.f314497i
            if (r3 == 0) goto L_0x00a5
            boolean r3 = r6.f314944q
            goto L_0x00a7
        L_0x00a5:
            boolean r3 = r6.f314945r
        L_0x00a7:
            androidx.lifecycle.z<java.lang.Boolean> r4 = r6.f314946s
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r4.postValue(r5)
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r4 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.b0 r4 = r4.mo150671n()
            if (r4 == 0) goto L_0x00bd
            r4.mo150727i(r3)
        L_0x00bd:
            com.tencent.mm.plugin.multitalk.model.p r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            gy3.C87412m.m108593f(r3, r1)
            r1 = 0
            com.tencent.p014mm.plugin.multitalk.model.C105825p.m142196h(r3, r2, r0, r1)
            r1 = 5
            com.tencent.p014mm.plugin.multitalk.model.C105853x.m142230a(r1)
            w33.c0 r1 = w33.C111720c0.f334432a
            r2 = 3
            com.tencent.mm.plugin.multitalk.model.p r3 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.vx0()
            boolean r3 = r3.mo150810e()
            r1.mo163400b(r2, r3)
            com.tencent.mm.plugin.multitalk.ilinkservice.z r1 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z.INSTANCE
            r1.getClass()
            java.lang.String r2 = "MicroMsg.Multitalk.ILinkService"
            java.lang.String r3 = "hy: onCameraStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.multitalk.ilinkservice.b2 r2 = new com.tencent.mm.plugin.multitalk.ilinkservice.b2
            r2.<init>(r1)
            r1.mo150614x(r2)
            v82.d1 r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Cx0()
            r1.getClass()
        L_0x00f5:
            androidx.lifecycle.z<java.lang.Boolean> r1 = r6.f314938h
            r7 = r7 ^ r0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1.setValue(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.C105883g.mo150904d3(java.lang.Boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r9.booleanValue() == false) goto L_0x0054;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo150905e3(java.lang.Boolean r9) {
        /*
            r8 = this;
            a14.z1 r0 = r8.f314952y
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo74466a()
            if (r0 != r1) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.lang.String r3 = "MicroMsg.MT.MultiTalkUIViewModel"
            if (r0 == 0) goto L_0x0019
            java.lang.String r9 = "onSpeakerClick: now switching, skip click"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r9)
            return
        L_0x0019:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "onSpeakerClick, cur state: "
            r0.append(r4)
            androidx.lifecycle.LiveData<java.lang.Boolean> r4 = r8.f314937g
            java.lang.Object r4 = r4.getValue()
            r0.append(r4)
            java.lang.String r4 = ", new state: "
            r0.append(r4)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            if (r9 == 0) goto L_0x0044
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0044:
            androidx.lifecycle.LiveData<java.lang.Boolean> r9 = r8.f314937g
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x0053
            boolean r1 = r9.booleanValue()
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r3 = 0
            r4 = 0
            com.tencent.mm.plugin.multitalk.ui.g$a r5 = new com.tencent.mm.plugin.multitalk.ui.g$a
            r9 = 0
            r5.<init>(r1, r8, r9)
            r6 = 3
            r7 = 0
            r2 = r8
            a14.z1 r9 = bl3.C0317e.launch$default(r2, r3, r4, r5, r6, r7)
            r8.f314952y = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.p078ui.C105883g.mo150905e3(java.lang.Boolean):void");
    }
}
